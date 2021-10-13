package com.alodiga.wallet.common.utils;

public class QueryConstants {

    public static final String ORDER_DESC = "DESC";
    public static final String ORDER_ASC = "ASC";
    public static final String EQUAL = " = ";
    public static final String NOT_EQUAL = " <> ";
    public static final String GREATER_THAN = " > ";
    public static final String GREATER_THAN_OR_EQUAL = " >= ";
    public static final String LESS_THAN = " < ";
    public static final String LESS_THAN_OR_EQUAL = " <= ";
    public static final String NOT = " NOT ";
    public static final String IN = " IN ";
    public static final String NOT_IN = " NOT_IN ";
    public static final String IS_NOT = " IS NOT ";
    public static final String IS_NULL = " IS NULL ";
    public static final String IS_NOT_NULL = " IS NOT NULL ";
    public static final String LIKE = " LIKE ";
    public static final String NOT_LIKE = " NOT LIKE ";
    public static final String IS = " IS ";
    public static final String COUNTIES_BY_STATE = "countiesByState";
    public static final String STATES_BY_COUNTRY = "statesByCountry";
    public static final String CITIES_BY_STATE = "citiesByState";
    public static final String CITIES_BY_COUNTY = "citiesByCounty";
    public static final String VALIDATE_DISTRIBUTOR = "validateDistributor";
    public static final String VALIDATE_ACCOUNT = "validateAccount";
    public static final String VALIDATE_USER = "validateUser";
    public static final String VALIDATE_CUSTOMER = "validateCustomer";
    public static final String TICKETS_BY_USER = "ticketsByUser";
    public static final String TICKETS_BY_DISTRIBUTOR = "ticketsByDistributor";
    public static final String TICKETS_BY_USER_RESPONDER = "ticketsByUserResponder";
    public static final String SOLICITUDES_BY_USER = "solicitudesByUser";
    public static final String SOLICITUDES_BY_DISTRIBUTOR = "solicitudesByDistributor";
    public static final String SOLICITUDES_BY_USER_RESPONDER = "solicitudesByUserResponder";
    public static final String SOLICITUDES_BY_DISTRIBUTOR_RESPONDER = "solicitudesByDistributorResponder";
    public static final String COMMISSION_BY_PRODUCT = "commissionByProduct";
    public static final String COMMISSION_BY_TRANSACTIONTYPE_AND_PRODUCT ="comissionByTransactionTypeAndProduct";
    public static final String EXCHANGE_RATE_BY_PRODUCT = "exchangeRateByProduct";
    public static final String BANK_BY_PRODUCT = "bankByProduct";
    public static final String TRANSACTION_BY_DISTRIBUTOR = "transactionByDistributor";
    public static final String TRANSACTION_BY_CUSTOMER = "transactionByCostumer";
    public static final String REPORT_BY_PROFILE = "reportByProfile";
    public static final String BUSINESS_SUB_CATEGORY_BY_CATEGORY = "businessSubCategoryByCategory";
    public static final String BUSINESS_TYPE_BY_ID = "businessTypeById";
    public static final String BUSINESS_SERVICE_TYPE_BY_BUSINESS_TYPE = "businessServiceTypeByBusinessType";
    public static final String TRANSACTION_APPROVE_REQUEST_BY_STATUS = "transactionApproveRequestByStatus";
    public static final String AFFILIATION_REQUEST_BY_REQUEST_TYPE_ID = "affiliationRequestByRequestTypeId";
    public static final String VALIDATE_ACCOUNT_BANK_EXISTS_BD = "validateAccountBankExistsBD";
    public static final String AFFILIATION_REQUEST_BY_LEGAL_PERSON = "affiliationRequestByLegalPerson";
    public static final String AFFILIATION_REQUEST_BY_PERSON = "affiliationRequestByPerson";
    public static final String CODE_BY_STATUS = "codeByStatus";
    public static final String PERSON_CLASSIFICATION_BY_CODE = "personClassificationByCode";
    public static final String STATUS_ACCOUNT_BANK_BY_CODE = "statusAcountBankByCode";
    public static final String STATUS_TRANSACTION_APPROVE_REQUEST_BY_CODE = "statusTransactionApproveRequestByCode";
    public static final String DELETE_PERMISSION_HAS_PROFILE = "deletePermissionHasProfile";
    public static final String LOAD_USER_BY_LOGIN = "loadUserByLogin";
    public static final String LOAD_USER_BY_EMAIL = "loadUserByEmail";
    public static final String LOAD_ACCOUNT_BY_EMAIL = "loadAccountByEmail";
    public static final String LOAD_LAST_AUDITS = "loadLastFiftyAudit";
    public static final String DELETE_REPORT_PARAMETER = "deleteReportParameter";
    public static final String DELETE_REPORT_PROFILE = "deleteReportProfile";
    public static final String PREFERENCE_VALUE_BY_PREFERENCE_FIELD = "preferenceValueByPreferenceField";
    public static final String PREFERENCE_BY_ENTERPRISE = "preferenceByEnterprise";
    public static final String PRODUCTS_BY_ENTERPRISE = "productByEnterprise";
    public static final String PROFILES_BY_TYPE = "profilesByType";
    public static final String NOTIFICATIONS_BY_USER = "notificationsByUser";
    public static final String NOTIFICATIONS_BY_TYPE = "notificationsByType";
    public static final String DELETE_NOTIFICATION_HAS_PROFILE = "deleteNotificationHasProfile";
    public static final String PARAM_LOGIN = "login";
    public static final String PARAM_PASSWORD = "password";
    public static final String PARAM_EMAIL = "email";
    public static final String PARAM_REMOTE_IP = "remoteIp";
    public static final String PARAM_TABLE_NAME = "tableName";
    public static final String PARAM_RESPONSIBLE_ID = "responsibleId";
    public static final String PARAM_RESPONSIBLE_TYPE = "responsibleType";
    public static final String PARAM_EVENT_ID = "eventTypeId";
    public static final String PARAM_BEGINNING_DATE = "beginningDate";
    public static final String PARAM_ENDING_DATE = "endingDate";
    public static final String PARAM_BEGINNING_DATE_EXIT = "beginningDateExit";
    public static final String PARAM_ENDING_DATE_EXIT = "endingDateExit";
    public static final String PARAM_NOW_DATE = "nowDate";
    public static final String PARAM_USER_RESPONDER_ID = "userResponderId";
    public static final String PARAM_COUNTRY_ID = "countryId";
    public static final String PARAM_COUNTRY_NAME = "countryName";
    public static final String PARAM_STATE_ID = "stateId";
    public static final String PARAM_COUNTY_ID = "countyId";
    public static final String PARAM_ENTERPRISE_ID = "enterpriseId";
    public static final String PARAM_IS_ADMIN = "isAdmin";
    public static final String PARAM_PROFILE_ID = "profileId";
    public static final String PARAM_DISTRIBUTOR_ID = "distributorId";
    public static final String PARAM_PARENT_ID = "parentId";
    public static final String PARAM_ASSIGMENT_TYPE = "assignmentType";
    public static final String PARAM_ASSIGMENT_STATUS = "assignmentStatus";
    public static final String PARAM_DISTRIBUTOR_CLOSURE_PROCESS_STATUS = "closureProcessStatus";
    public static final String PARAM_CLOSURE_PROCESS_STATUS = "closureProcessStatus";
    public static final String PARAM_TICKET_TYPE_ID = "ticketTypeId";
    public static final String PARAM_TITLE = "title";
    public static final String PARAM_TICKET_ID = "ticketId";
    public static final String PARAM_STATUS = "status";
    public static final String PARAM_STATUS_SOURCE_ID = "transactionSourceId";
    public static final String PARAM_DISTRIBUTOR_LOGIN = "distributorLogin";
    public static final String PARAM_USER_LOGIN = "userLogin";
    public static final String PARAM_USER_RESPONDER_LOGIN = "userResponderLogin";
    public static final String PARAM_CUSTOMER_ID = "customerId";
    public static final String PARAM_CUSTOMER_LOGIN = "customerLogin";
    public static final String PARAM_TRANSACTION_SOURCE_ID = "transactionSourceId";
    public static final String PARAM_ORIGIN_DISTRIBUTOR_LOGIN = "origenDistributorLogin";
    public static final String PARAM_DESTINY_DISTRIBUTOR_LOGIN = "destinyDistributorLogin";
    public static final String PARAM_BALANCE_TRANSFERENCE_TYPE = "balanceTransferenceType";
    public static final String PARAM_AMOUNT = "amount";
    public static final String PARAM_TAX_AMOUNT = "totalTax";
    public static final String PARAM_CREATION_DATE = "creationDate";
    public static final String PARAM_USER_ID = "userId";
    public static final String PARAM_NOTIFICATION_TYPE_ID = "notificationTypeId";
    public static final String PARAM_BANNERS_BY_POSITION = "positionRoute";
    public static final String PARAM_SOLICITUDE_STATUS = "status";
    public static final String PARAM_SOLICITUDE_TYPE_ID = "soliciteTypeId";
    public static final String PARAM_SOLICITUDE_ID = "solicitudeId";
    public static final String PARAM_PREFERENCE_FIELD_ID = "preferenceFieldId";
    public static final String PARAM_PREFERENCE_ID = "preferenceId";
    public static final String PARAM_FIRST_NAME = "firstName";
    public static final String PARAM_LAST_NAME = "lastName";
    public static final String PARAM_PHONE_NUMBER = "phoneNumber";
    public static final String PARAM_ENABLED = "enabled";
    public static final String PARAM_OBJMAIL = "objMail";
    public static final String PARAM_PRODUCT_ID = "productId";
    public static final String PARAM_PROVIDER_ID = "providerID";
    public static final String PARAM_ENDED = "ended";
    public static final String PARAM_TRANSACTION = "transaction";
    public static final String PARAM_CUSTOMER = "customer";
    public static final String PARAM_ORDER_ID = "orderId";
    public static final String PARAM_TRANSACTION_TYPE_ID = "transactionTypeId";
    public static final String PARAM_TRANSACTION_ITEM_ID = "transactionItemId";
    public static final String PARAM_TRANSACTION_STATUS = "transactionStatus";
    public static final String PARAM_CATEGORY_ID = "categoryId";
    public static final String PARAM_CONDITION_ID = "conditionId";
    public static final String PARAM_DISTRIBUTOR = "distributor";
    public static final String PARAM_BALANCES_TRANSFERENCES = "balanceTransferences";
    public static final String PARAM_DELETED = "deleted";
    public static final String PARAM_OBJECT = "object";
    public static final String PARAM_SQL = "sql";
    public static final String PARAM_SUCCESS = "success";
    public static final String PARAM_PURCHASEBALANCEACOUNT = "purchaseBalanceDistributor";
    public static final String PARAM_MONTH = "month";
    public static final String PARAM_YEAR = "year";
    public static final String PARAM_BANNER_TYPE_ID = "bannerTypeId";
    public static final String PARAM_SERIAL = "serial";
    public static final String PARAM_PIN_FREE = "pinFree";
    public static final String PARAM_PROMOTION_TYPE = "promotionType";
    public static final String PARAM_LANGUAGE_ID = "languageId";
    public static final String PARAM_BONUS_TYPE = "bonusType";
    public static final String SOLICITUDES_BY_ACCOUNT_RESPONDER = "solicitudesByAccountResponder";
    public static final String SOLICITUDES_BY_ACCOUNT = "solicitudesByAccount";
    public static final String STATUS_ACCOUNT_ALL = "ALL";
    public static final String STATUS_ACCOUNT_ENABLED = "1";
    public static final String ACCOUNT_HAS_PRODUCT = "accountHasProduct";
    public static final String PARAM_WORK_ORDER = "workOrder";
    public static final String MODEL_BY_BRAUND = "modelByBraund";
    public static final String PARAM_BRAUND_ID = "braundId";
    public static final String PARAM_MODEL_ID = "modelId";
    public static final String PARAM_ENTER_CALIBRATION_ID = "enterCalibrationId";
    public static final String PARAM_CONTROL_TYPE_ID = "controlTypeId";
    public static final String PARAM_FILTER = "filter";
    public static final String PARAM_FILTER_TEXT = "_filterText";
    public static final String PARAM_DESIGNATION = "designation";
    public static final String PARAM_INSTRUMENT = "instrument";
    public static final String PARAM_PART_NUMBER = "partNumber";
    public static final String LOAD_PRODUCT_BY_PART_NUMBER = "loadProductByPartNumber";
    public static final String LIST_PRODUCT = "listProduct";
    public static final String LOAD_CONTROL_BY_INSTRUMENT = "loadControlByInstrument";
    public static final String PARAM_CONTROL = "metrologicalControlId";
    public static final String PARAM_BANK_OPERATION_TYPE_ID = "bankOperationTypeId";
    public static final String PARAM_BANK_OPERATION_MODE_ID = "bankOperationModeId";
    public static final String PARAM_BANK_ID = "bankId";
    public static final String PARAM_BUSSINESS_ID = "bussinessId";
    public static final String PERSON_TYPE_BY_COUNTRY = "personTypeByCountry";
    public static final String PERSON_TYPE_ID = "personTypeId";
    public static final String COLLECTION_TYPE_BY_COUNTRY = "CollectionTypeByCountry";
    public static final String COLLECTION_TYPE_BY_COUNTRY_BY_PERSON_TYPE = "CollectionTypeByCountryByPersonType";
    public static final String REVIEW_OFAC_BY_REQUEST = "reviewOfacByRequest";
    public static final String PARAM_REQUEST_NUMBER = "requestNumber";
    public static final String PARAM_NUMBER_REQUEST = "numberRequest";
    public static final String PARAM_TRANSACTION_APPROVE_REQUEST = "transactionApproveRequest";
    public static final String PARAM_CODE = "code";
    public static final String PARAM_STATUS_TRANSACTION_APPROVE_REQUEST_ID = "statusTransactionApproveRequestId";
    public static final String SEQUENCES_BY_DOCUMENT_TYPE = "Sequences.findByDocumentType";
    public static final String PARAM_ORIGIN_APPLICATION_ID = "originApplicationId";
    public static final String PHONES_BY_PERSON = "phonesByPerson";
    public static final String PERSON_HAS_ADDRESS_BY_PERSON = "personHasAddressByPerson";
    public static final String REQUEST_HAS_COLLECTION_REQUEST_BY_REQUEST_BY_COLLECTION_REQUEST = "RequestHasCollectionsRequestByRequestsByCollectionRequest";
    public static final String REQUEST_HAS_COLLECTION_REQUEST_BY_AFFILIATON_REQUEST = "requestHasCollectionsRequestByBusinessAffiliationRequest";
    public static final String LEGAL_PERSON_BY_LEGAL_REPRESENTATIVE = "legalPersonByLegalRepresentative";
    public static final String PARAM_IND_NATURAL_PERSON = "indNaturalPerson";
    public static final String PERSON_TYPE_BY_COUNTRY_BY_IND_NATURAL_PERSON = "personTypeByCountryByIndNaturalPerson";
    public static final String PERSON_TYPE_BY_COUNTRY_BY_ORIGIN_APPLICATION = "personTypeByCountryByOriginApplication";
    public static final String PERSON_TYPE_BY_COUNTRY_BY_ORIGIN_APPLICATION_PORTAL = "personTypeByCountryByOriginApplicationPortal";
    public static final String PARAM_BUSINESS_TYPE_ID = "businessTypeId";
    public static final String REVIEW_REQUEST_BY_REQUEST = "reviewRequestByRequest";
    public static final String PARAM_AFFILIATION_REQUEST_ID = "affiliationRequestId";
    public static final String PARAM_REVIEW_TYPE_ID = "reviewTypeId";
    public static final String PARAM_PERSON_ID = "personId";
    public static final String PARAM_LEGAL_PERSON_ID = "legalPersonId";
    public static final String PARAM_NATURAL_PERSON_ID = "naturalPersonId";
    public static final String PARAM_LEGAL_REPRESENTATIVE_ID = "legalRepresentativeId";
    public static final String REQUEST_HAS_COLLECTION_REQUEST_BY_AFFILIATON_REQUEST_COMPLET = "RequestHasCollectionsRequestByBusinessAffiliationRequestComplet";
    public static final String REQUEST_HAS_COLLECTION_REQUEST_BY_AFFILIATON_REQUEST_INCOMPLET = "RequestHasCollectionsRequestByBusinessAffiliationRequestInComplet";
    public static final String STATUS_BUSINESS_AFFILIATON_REQUEST_BY_CODE = "StatusBusinessAffiliationRequestByCode";
    public static final String CARDSTATUS_BY_ID = "cardStatusById";
    public static final String COLLECTIONS_BY_PERSON_TYPE = "collectionsByPersonType";
    public static final String DOCUMENTS_BY_COUNTRY = "documentsByCountry";
    public static final String PHONES_BY_MAIN = "phonesByMain";
    public static final String LOGIN_EXIST_IN_BD = "loginExistInBD";
    public static final String EMPLOYEE_EXIST_IN_BD = "EmployeeExistInBD";
    public static final String VALIDATE_PASSWORD = "validatePassword";
    public static final String CLASSIFICATION_ID = "classificationId";
    public static final String CODE_EXIST_IN_BD_COUNTRY = "codeExistInBdCountry";
    public static final String NAME_EXIST_IN_BD_COUNTRY = "nameExistInBdCountry";
    public static final String CODEMCC_EXIST_IN_BD_BUSINESS_CATEGORY="codeMCCExistInBdBusinessCategory";
    public static final String CODEMCC_EXIST_IN_BD_BUSINESS_SUB_CATEGORY="codeMCCExistInBdBusinessSubCategory";
    public static final String CODE_EXIST_IN_BD_BUSINESS_SERVICE_TYPE="codeExistInBdBusinessServiceType";
    public static final String CODE_EXIST_IN_BD_PREFERENCE_FIELD = "codeExistInBdPreferenceField";
    public static final String CODE_EXIST_IN_BD_TRANSACTION_TYPE = "codeExistInBdTransactionType";
    public static final String HOLI_DAY_EXIST_IN_BD_CALENDAR_DAYS = "holiDayExistInBdCalendarDays";
    public static final String PARAM_PERMISSION_ID = "permissionId";
    public static final String PREFERENCE_FIELD_DATA_BY_PREFERENCE = "preferenceFieldDataByPreference";
    public static final String PREFERENCE_TYPE_BY_TYPE ="preferenceTypeByType";
    public static final String PARAM_REQUEST_TYPE ="requestTypeId";
    public static final String PERSON_CLASSIFICATION_BY_ID = "personClassificationById";
    public static final String NATURAL_PERSON_BY_PERSON = "naturalPersonByPerson";
    public static final String PARAM_PERSON_CLASSIFICATION_ID = "personClassificationId";
    public static final String PARAM_NAME = "name";
    public static final String PARAM_STATUS_APPLICANT_ID = "statusApplicantId";
    public static final String LEGAL_PERSON_BY_PERSON = "legalPersonByPerson";
    public static final String PARAM_USER_REGISTER_ID = "userRegisterUnifiedId";
    public static final String PARAM_BUSINESS_PERSON_ID = "businessPersonId";
    public static final String PARAM_VALUE = "value";
}