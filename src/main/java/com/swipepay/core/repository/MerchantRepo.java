package com.swipepay.core.repository;

import com.swipepay.core.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MerchantRepo extends JpaRepository<Merchant, Integer> {
    @Query(value = "SELECT a.name merchaneName, a.sales_id, b.name category, c.mid, d.tid TID, " +
            "(select tab.db_timestamp from fp_mpos_midware.credit_debit_trx_report tab where c.mid = tab.mid order by tab.db_timestamp limit 1) TRX_PERTAMA, " +
            "d.TRANS_AMT, d.EARN, e.description " +
            "FROM merchant a " +
            "INNER JOIN merchant_category b on b.id = a.category_id " +
            "LEFT JOIN merchant_mid c on a.id = c.merchant_id " +
            "LEFT JOIN (SELECT x.mid, x.tid, sum(y.base_amount) TRANS_AMT, " +
            "round(sum(y.base_amount * (y.merchant_mdr_value - y.bank_mdr_value) / 100)) EARN " +
            "from credit_debit_settlement x inner join credit_debit_trx_report y on x.mid = y.mid AND x.tid = y.tid AND x.batch_group = y.batch_group AND x.batch_num = y.batch_num " +
            "where y.trx_type = 'SALE' group by x.mid, x.tid) d on d.mid = c.mid " +
            "LEFT JOIN device e ON e.merchant_id = a.id " +
            "where a.id not in (1,2) " +
            "group by a.id, c.mid " +
            "order by d.TRANS_AMT desc, a.name", nativeQuery = true)
    public List<Object[]> getMerchantReport();

    @Query("select a.name, b.name from Merchant a, MerchantCategory b where a.categoryId = b.id")
    public List<Object[]> getMerchantDetail();
}
