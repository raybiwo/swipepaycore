package com.swipepay.core.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "MERCHANT")
@EntityListeners(AuditingEntityListener.class)
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "CATEGORY_ID")
    private int categoryId;

    @Column(name = "CLASSIFICATION_ID")
    private int classificationId;

    @Column(name = "STATE_ID")
    private int stateId;

    @Column(name = "CITY_ID")
    private int cityId;

    @Column(name = "APPROVAL_STATUS_ID")
    private int approvalStatusId;

    @Column(name = "CREATED_BY")
    private int createdBy;

    @Column(name = "APPROVED_BY")
    private String approvedBy;

    @Column(name = "OUTLET_STATE_ID")
    private int outletStateId;

    @Column(name = "OUTLET_CITY_ID")
    private int outletCityId;

    @Column(name = "COUNTRY_ID")
    private String countryId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS1")
    private String address1;

    @Column(name = "ADDRESS2")
    private String address2;

    @Column(name = "SALES_COPORATE_NAME")
    private String salesCoporateName;

    @Column(name = "SALES_NAME")
    private String salesName;

    @Column(name = "SALES_ID")
    private String salesId;

    @Column(name = "SALES_PHONE")
    private String salesPhone;

    @Column(name = "IS_BUSINESS_ENTITY")
    private int isBusinessEntity;

    @Column(name = "IS_BUSINESS_ENTITY_HAS_ID")
    private int isBusinessEntityHasId;

    @Column(name = "IS_BUSINESS_ENTITY_HAS_TAX_REGISTRATION")
    private int isBusinessEntityHasTaxRegistration;

    @Column(name = "IS_BUSINESS_ENTITY_HAS_TRADE_BUSINESS_LICENSE")
    private int isBusinessEntityHasTradeBusinessLicense;

    @Column(name = "IS_BUSINESS_ENTITY_HAS_COMPANY_REGISTRATION_CERTIFICATE")
    private int isBusinessEntityHasCompanyRegistrationCertificate;

    @Column(name = "IS_BUSINESS_ENTITY_HAS_CERTIFICATE_OF_BUSINESS_DOMICILE")
    private int isBusinessEntityHasCertificateOfBusinessDomicile;

    @Column(name = "IS_BUSINESS_ENTITY_HAS_DEED_OF_ESTABLISHMENT")
    private int isBusinessEntityHasDeedOfEstablishment;

    @Column(name = "IS_BUSINESS_ENTITY_HAS_PHOTO_OF_PLACE_OF_BUSINESS")
    private int isBusinessEntityHasPhotoOfPlaceOfBusiness;

    @Column(name = "IS_INDIVIDUAL")
    private int isIndividual;

    @Column(name = "IS_INDIVIDUAL_HAS_ID")
    private int isIndividualHasId;

    @Column(name = "IS_INDIVIDUAL_HAS_TAX_REGISTRATION")
    private int isIndividualHasTaxRegistration;

    @Column(name = "IS_INDIVIDUAL_HAS_CERTIFICATE_OF_BUSINESS_DOMICILE")
    private int isIndividualHasCertificateOfBusinessDomicile;

    @Column(name = "IS_INDIVIDUAL_HAS_PHOTO_OF_PLACE_OF_BUSINESS")
    private int isIndividualHasPhotoOfPlaceOfBusiness;

    @Column(name = "HAS_LETTER_OF_ATTORNEY")
    private int hasLetterOfAttorney;

    @Column(name = "LEGAL_NAME")
    private String legalName;

    @Column(name = "BUSINESS_TYPE")
    private String businessType;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "PHONE_OFFICE")
    private String phoneOffice;

    @Column(name = "BUSINESS_DURATION")
    private String businessDuration;

    @Column(name = "PIC_NAME")
    private String picName;

    @Column(name = "PIC_POSITION")
    private String picPosition;

    @Column(name = "PIC_OFFICE_PHONE")
    private String picOfficePhone;

    @Column(name = "PIC_MOBILE_PHONE")
    private String picMobilePhone;

    @Column(name = "PIC_EMAIL")
    private String picEmail;

    @Column(name = "OUTLET_NAME")
    private String outletName;

    @Column(name = "OUTLET_CASHIERS")
    private String outletCashiers;

    @Column(name = "OUTLET_ADDRESS")
    private String outletAddress;

    @Column(name = "OUTLET_PHONE")
    private String outletPhone;

    @Column(name = "OUTLET_MANAGER_NAME")
    private String outletManagerName;

    @Column(name = "OUTLET_MANAGER_MOBILE_PHONE")
    private String outletManagerMobilePhone;

    @Column(name = "OUTLET_MANAGER_EMAIL")
    private String outletManagerEmail;

    @Column(name = "OUTLET_OPERATIONAL_HOUR_START")
    private Time outletOperationalHourStart;

    @Column(name = "OUTLET_OPERATIONAL_HOUR_END")
    private Time outletOperationalHourEnd;

    @Column(name = "TRANSACTION_BANK")
    private int transactionBank;

    @Column(name = "TRANSACTION_BANK_BRANCH")
    private String transactionBankBranch;

    @Column(name = "TRANSACTION_BANK_CLEARING_CODE")
    private String transactionBankClearingCode;

    @Column(name = "TRANSACTION_BANK_ACCOUNT_NUMBER")
    private String transactionBankAccountNumber;

    @Column(name = "TRANSACTION_ON_BEHALF")
    private String transactionOnBehalf;

    @Column(name = "TRANSACTION_CURRENCY")
    private String transactionCurrency;

    @Column(name = "MAX_AMOUNT")
    private Long maxAmount;

    @Column(name = "MIN_AMOUNT")
    private Long minAmount;

    @Column(name = "IS_DEMO")
    private int isDemo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(int classificationId) {
        this.classificationId = classificationId;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getApprovalStatusId() {
        return approvalStatusId;
    }

    public void setApprovalStatusId(int approvalStatusId) {
        this.approvalStatusId = approvalStatusId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public int getOutletStateId() {
        return outletStateId;
    }

    public void setOutletStateId(int outletStateId) {
        this.outletStateId = outletStateId;
    }

    public int getOutletCityId() {
        return outletCityId;
    }

    public void setOutletCityId(int outletCityId) {
        this.outletCityId = outletCityId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getSalesCoporateName() {
        return salesCoporateName;
    }

    public void setSalesCoporateName(String salesCoporateName) {
        this.salesCoporateName = salesCoporateName;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public String getSalesPhone() {
        return salesPhone;
    }

    public void setSalesPhone(String salesPhone) {
        this.salesPhone = salesPhone;
    }

    public int getIsBusinessEntity() {
        return isBusinessEntity;
    }

    public void setIsBusinessEntity(int isBusinessEntity) {
        this.isBusinessEntity = isBusinessEntity;
    }

    public int getIsBusinessEntityHasId() {
        return isBusinessEntityHasId;
    }

    public void setIsBusinessEntityHasId(int isBusinessEntityHasId) {
        this.isBusinessEntityHasId = isBusinessEntityHasId;
    }

    public int getIsBusinessEntityHasTaxRegistration() {
        return isBusinessEntityHasTaxRegistration;
    }

    public void setIsBusinessEntityHasTaxRegistration(int isBusinessEntityHasTaxRegistration) {
        this.isBusinessEntityHasTaxRegistration = isBusinessEntityHasTaxRegistration;
    }

    public int getIsBusinessEntityHasTradeBusinessLicense() {
        return isBusinessEntityHasTradeBusinessLicense;
    }

    public void setIsBusinessEntityHasTradeBusinessLicense(int isBusinessEntityHasTradeBusinessLicense) {
        this.isBusinessEntityHasTradeBusinessLicense = isBusinessEntityHasTradeBusinessLicense;
    }

    public int getIsBusinessEntityHasCompanyRegistrationCertificate() {
        return isBusinessEntityHasCompanyRegistrationCertificate;
    }

    public void setIsBusinessEntityHasCompanyRegistrationCertificate(int isBusinessEntityHasCompanyRegistrationCertificate) {
        this.isBusinessEntityHasCompanyRegistrationCertificate = isBusinessEntityHasCompanyRegistrationCertificate;
    }

    public int getIsBusinessEntityHasCertificateOfBusinessDomicile() {
        return isBusinessEntityHasCertificateOfBusinessDomicile;
    }

    public void setIsBusinessEntityHasCertificateOfBusinessDomicile(int isBusinessEntityHasCertificateOfBusinessDomicile) {
        this.isBusinessEntityHasCertificateOfBusinessDomicile = isBusinessEntityHasCertificateOfBusinessDomicile;
    }

    public int getIsBusinessEntityHasDeedOfEstablishment() {
        return isBusinessEntityHasDeedOfEstablishment;
    }

    public void setIsBusinessEntityHasDeedOfEstablishment(int isBusinessEntityHasDeedOfEstablishment) {
        this.isBusinessEntityHasDeedOfEstablishment = isBusinessEntityHasDeedOfEstablishment;
    }

    public int getIsBusinessEntityHasPhotoOfPlaceOfBusiness() {
        return isBusinessEntityHasPhotoOfPlaceOfBusiness;
    }

    public void setIsBusinessEntityHasPhotoOfPlaceOfBusiness(int isBusinessEntityHasPhotoOfPlaceOfBusiness) {
        this.isBusinessEntityHasPhotoOfPlaceOfBusiness = isBusinessEntityHasPhotoOfPlaceOfBusiness;
    }

    public int getIsIndividual() {
        return isIndividual;
    }

    public void setIsIndividual(int isIndividual) {
        this.isIndividual = isIndividual;
    }

    public int getIsIndividualHasId() {
        return isIndividualHasId;
    }

    public void setIsIndividualHasId(int isIndividualHasId) {
        this.isIndividualHasId = isIndividualHasId;
    }

    public int getIsIndividualHasTaxRegistration() {
        return isIndividualHasTaxRegistration;
    }

    public void setIsIndividualHasTaxRegistration(int isIndividualHasTaxRegistration) {
        this.isIndividualHasTaxRegistration = isIndividualHasTaxRegistration;
    }

    public int getIsIndividualHasCertificateOfBusinessDomicile() {
        return isIndividualHasCertificateOfBusinessDomicile;
    }

    public void setIsIndividualHasCertificateOfBusinessDomicile(int isIndividualHasCertificateOfBusinessDomicile) {
        this.isIndividualHasCertificateOfBusinessDomicile = isIndividualHasCertificateOfBusinessDomicile;
    }

    public int getIsIndividualHasPhotoOfPlaceOfBusiness() {
        return isIndividualHasPhotoOfPlaceOfBusiness;
    }

    public void setIsIndividualHasPhotoOfPlaceOfBusiness(int isIndividualHasPhotoOfPlaceOfBusiness) {
        this.isIndividualHasPhotoOfPlaceOfBusiness = isIndividualHasPhotoOfPlaceOfBusiness;
    }

    public int getHasLetterOfAttorney() {
        return hasLetterOfAttorney;
    }

    public void setHasLetterOfAttorney(int hasLetterOfAttorney) {
        this.hasLetterOfAttorney = hasLetterOfAttorney;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneOffice() {
        return phoneOffice;
    }

    public void setPhoneOffice(String phoneOffice) {
        this.phoneOffice = phoneOffice;
    }

    public String getBusinessDuration() {
        return businessDuration;
    }

    public void setBusinessDuration(String businessDuration) {
        this.businessDuration = businessDuration;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getPicPosition() {
        return picPosition;
    }

    public void setPicPosition(String picPosition) {
        this.picPosition = picPosition;
    }

    public String getPicOfficePhone() {
        return picOfficePhone;
    }

    public void setPicOfficePhone(String picOfficePhone) {
        this.picOfficePhone = picOfficePhone;
    }

    public String getPicMobilePhone() {
        return picMobilePhone;
    }

    public void setPicMobilePhone(String picMobilePhone) {
        this.picMobilePhone = picMobilePhone;
    }

    public String getPicEmail() {
        return picEmail;
    }

    public void setPicEmail(String picEmail) {
        this.picEmail = picEmail;
    }

    public String getOutletName() {
        return outletName;
    }

    public void setOutletName(String outletName) {
        this.outletName = outletName;
    }

    public String getOutletCashiers() {
        return outletCashiers;
    }

    public void setOutletCashiers(String outletCashiers) {
        this.outletCashiers = outletCashiers;
    }

    public String getOutletAddress() {
        return outletAddress;
    }

    public void setOutletAddress(String outletAddress) {
        this.outletAddress = outletAddress;
    }

    public String getOutletPhone() {
        return outletPhone;
    }

    public void setOutletPhone(String outletPhone) {
        this.outletPhone = outletPhone;
    }

    public String getOutletManagerName() {
        return outletManagerName;
    }

    public void setOutletManagerName(String outletManagerName) {
        this.outletManagerName = outletManagerName;
    }

    public String getOutletManagerMobilePhone() {
        return outletManagerMobilePhone;
    }

    public void setOutletManagerMobilePhone(String outletManagerMobilePhone) {
        this.outletManagerMobilePhone = outletManagerMobilePhone;
    }

    public String getOutletManagerEmail() {
        return outletManagerEmail;
    }

    public void setOutletManagerEmail(String outletManagerEmail) {
        this.outletManagerEmail = outletManagerEmail;
    }

    public Time getOutletOperationalHourStart() {
        return outletOperationalHourStart;
    }

    public void setOutletOperationalHourStart(Time outletOperationalHourStart) {
        this.outletOperationalHourStart = outletOperationalHourStart;
    }

    public Time getOutletOperationalHourEnd() {
        return outletOperationalHourEnd;
    }

    public void setOutletOperationalHourEnd(Time outletOperationalHourEnd) {
        this.outletOperationalHourEnd = outletOperationalHourEnd;
    }

    public int getTransactionBank() {
        return transactionBank;
    }

    public void setTransactionBank(int transactionBank) {
        this.transactionBank = transactionBank;
    }

    public String getTransactionBankBranch() {
        return transactionBankBranch;
    }

    public void setTransactionBankBranch(String transactionBankBranch) {
        this.transactionBankBranch = transactionBankBranch;
    }

    public String getTransactionBankClearingCode() {
        return transactionBankClearingCode;
    }

    public void setTransactionBankClearingCode(String transactionBankClearingCode) {
        this.transactionBankClearingCode = transactionBankClearingCode;
    }

    public String getTransactionBankAccountNumber() {
        return transactionBankAccountNumber;
    }

    public void setTransactionBankAccountNumber(String transactionBankAccountNumber) {
        this.transactionBankAccountNumber = transactionBankAccountNumber;
    }

    public String getTransactionOnBehalf() {
        return transactionOnBehalf;
    }

    public void setTransactionOnBehalf(String transactionOnBehalf) {
        this.transactionOnBehalf = transactionOnBehalf;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public Long getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Long maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Long getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(Long minAmount) {
        this.minAmount = minAmount;
    }

    public int getIsDemo() {
        return isDemo;
    }

    public void setIsDemo(int isDemo) {
        this.isDemo = isDemo;
    }
}
