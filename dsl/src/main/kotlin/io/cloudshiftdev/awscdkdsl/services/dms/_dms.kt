@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.dms

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnCertificate
import software.amazon.awscdk.services.dms.CfnCertificateProps
import software.amazon.awscdk.services.dms.CfnEndpoint
import software.amazon.awscdk.services.dms.CfnEndpointProps
import software.amazon.awscdk.services.dms.CfnEventSubscription
import software.amazon.awscdk.services.dms.CfnEventSubscriptionProps
import software.amazon.awscdk.services.dms.CfnReplicationConfig
import software.amazon.awscdk.services.dms.CfnReplicationConfigProps
import software.amazon.awscdk.services.dms.CfnReplicationInstance
import software.amazon.awscdk.services.dms.CfnReplicationInstanceProps
import software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup
import software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps
import software.amazon.awscdk.services.dms.CfnReplicationTask
import software.amazon.awscdk.services.dms.CfnReplicationTaskProps
import software.constructs.Construct

public object dms {
    /**
     * The `AWS::DMS::Certificate` resource creates an Secure Sockets Layer (SSL) certificate that
     * encrypts connections between AWS DMS endpoints and the replication instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * CfnCertificate cfnCertificate = CfnCertificate.Builder.create(this, "MyCfnCertificate")
     * .certificateIdentifier("certificateIdentifier")
     * .certificatePem("certificatePem")
     * .certificateWallet("certificateWallet")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html)
     */
    public inline fun cfnCertificate(
        scope: Construct,
        id: String,
        block: CfnCertificateDsl.() -> Unit = {},
    ): CfnCertificate {
        val builder = CfnCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCertificate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * CfnCertificateProps cfnCertificateProps = CfnCertificateProps.builder()
     * .certificateIdentifier("certificateIdentifier")
     * .certificatePem("certificatePem")
     * .certificateWallet("certificateWallet")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html)
     */
    public inline fun cfnCertificateProps(
        block: CfnCertificatePropsDsl.() -> Unit = {}
    ): CfnCertificateProps {
        val builder = CfnCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DMS::Endpoint` resource specifies an AWS DMS endpoint.
     *
     * Currently, AWS CloudFormation supports all AWS DMS endpoint types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * CfnEndpoint cfnEndpoint = CfnEndpoint.Builder.create(this, "MyCfnEndpoint")
     * .endpointType("endpointType")
     * .engineName("engineName")
     * // the properties below are optional
     * .certificateArn("certificateArn")
     * .databaseName("databaseName")
     * .docDbSettings(DocDbSettingsProperty.builder()
     * .docsToInvestigate(123)
     * .extractDocId(false)
     * .nestingLevel("nestingLevel")
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .build())
     * .dynamoDbSettings(DynamoDbSettingsProperty.builder()
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .build())
     * .elasticsearchSettings(ElasticsearchSettingsProperty.builder()
     * .endpointUri("endpointUri")
     * .errorRetryDuration(123)
     * .fullLoadErrorPercentage(123)
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .build())
     * .endpointIdentifier("endpointIdentifier")
     * .extraConnectionAttributes("extraConnectionAttributes")
     * .gcpMySqlSettings(GcpMySQLSettingsProperty.builder()
     * .afterConnectScript("afterConnectScript")
     * .cleanSourceMetadataOnMismatch(false)
     * .databaseName("databaseName")
     * .eventsPollInterval(123)
     * .maxFileSize(123)
     * .parallelLoadThreads(123)
     * .password("password")
     * .port(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .serverName("serverName")
     * .serverTimezone("serverTimezone")
     * .username("username")
     * .build())
     * .ibmDb2Settings(IbmDb2SettingsProperty.builder()
     * .currentLsn("currentLsn")
     * .maxKBytesPerRead(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .setDataCaptureChanges(false)
     * .build())
     * .kafkaSettings(KafkaSettingsProperty.builder()
     * .broker("broker")
     * .includeControlDetails(false)
     * .includeNullAndEmpty(false)
     * .includePartitionValue(false)
     * .includeTableAlterOperations(false)
     * .includeTransactionDetails(false)
     * .messageFormat("messageFormat")
     * .messageMaxBytes(123)
     * .noHexPrefix(false)
     * .partitionIncludeSchemaTable(false)
     * .saslPassword("saslPassword")
     * .saslUserName("saslUserName")
     * .securityProtocol("securityProtocol")
     * .sslCaCertificateArn("sslCaCertificateArn")
     * .sslClientCertificateArn("sslClientCertificateArn")
     * .sslClientKeyArn("sslClientKeyArn")
     * .sslClientKeyPassword("sslClientKeyPassword")
     * .topic("topic")
     * .build())
     * .kinesisSettings(KinesisSettingsProperty.builder()
     * .includeControlDetails(false)
     * .includeNullAndEmpty(false)
     * .includePartitionValue(false)
     * .includeTableAlterOperations(false)
     * .includeTransactionDetails(false)
     * .messageFormat("messageFormat")
     * .noHexPrefix(false)
     * .partitionIncludeSchemaTable(false)
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .streamArn("streamArn")
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .microsoftSqlServerSettings(MicrosoftSqlServerSettingsProperty.builder()
     * .bcpPacketSize(123)
     * .controlTablesFileGroup("controlTablesFileGroup")
     * .querySingleAlwaysOnNode(false)
     * .readBackupOnly(false)
     * .safeguardPolicy("safeguardPolicy")
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .useBcpFullLoad(false)
     * .useThirdPartyBackupDevice(false)
     * .build())
     * .mongoDbSettings(MongoDbSettingsProperty.builder()
     * .authMechanism("authMechanism")
     * .authSource("authSource")
     * .authType("authType")
     * .databaseName("databaseName")
     * .docsToInvestigate("docsToInvestigate")
     * .extractDocId("extractDocId")
     * .nestingLevel("nestingLevel")
     * .password("password")
     * .port(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .serverName("serverName")
     * .username("username")
     * .build())
     * .mySqlSettings(MySqlSettingsProperty.builder()
     * .afterConnectScript("afterConnectScript")
     * .cleanSourceMetadataOnMismatch(false)
     * .eventsPollInterval(123)
     * .maxFileSize(123)
     * .parallelLoadThreads(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .serverTimezone("serverTimezone")
     * .targetDbType("targetDbType")
     * .build())
     * .neptuneSettings(NeptuneSettingsProperty.builder()
     * .errorRetryDuration(123)
     * .iamAuthEnabled(false)
     * .maxFileSize(123)
     * .maxRetryCount(123)
     * .s3BucketFolder("s3BucketFolder")
     * .s3BucketName("s3BucketName")
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .build())
     * .oracleSettings(OracleSettingsProperty.builder()
     * .accessAlternateDirectly(false)
     * .additionalArchivedLogDestId(123)
     * .addSupplementalLogging(false)
     * .allowSelectNestedTables(false)
     * .archivedLogDestId(123)
     * .archivedLogsOnly(false)
     * .asmPassword("asmPassword")
     * .asmServer("asmServer")
     * .asmUser("asmUser")
     * .charLengthSemantics("charLengthSemantics")
     * .directPathNoLog(false)
     * .directPathParallelLoad(false)
     * .enableHomogenousTablespace(false)
     * .extraArchivedLogDestIds(List.of(123))
     * .failTasksOnLobTruncation(false)
     * .numberDatatypeScale(123)
     * .oraclePathPrefix("oraclePathPrefix")
     * .parallelAsmReadThreads(123)
     * .readAheadBlocks(123)
     * .readTableSpaceName(false)
     * .replacePathPrefix(false)
     * .retryInterval(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerOracleAsmAccessRoleArn("secretsManagerOracleAsmAccessRoleArn")
     * .secretsManagerOracleAsmSecretId("secretsManagerOracleAsmSecretId")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .securityDbEncryption("securityDbEncryption")
     * .securityDbEncryptionName("securityDbEncryptionName")
     * .spatialDataOptionToGeoJsonFunctionName("spatialDataOptionToGeoJsonFunctionName")
     * .standbyDelayTime(123)
     * .useAlternateFolderForOnline(false)
     * .useBFile(false)
     * .useDirectPathFullLoad(false)
     * .useLogminerReader(false)
     * .usePathPrefix("usePathPrefix")
     * .build())
     * .password("password")
     * .port(123)
     * .postgreSqlSettings(PostgreSqlSettingsProperty.builder()
     * .afterConnectScript("afterConnectScript")
     * .captureDdls(false)
     * .ddlArtifactsSchema("ddlArtifactsSchema")
     * .executeTimeout(123)
     * .failTasksOnLobTruncation(false)
     * .heartbeatEnable(false)
     * .heartbeatFrequency(123)
     * .heartbeatSchema("heartbeatSchema")
     * .mapBooleanAsBoolean(false)
     * .maxFileSize(123)
     * .pluginName("pluginName")
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .slotName("slotName")
     * .build())
     * .redisSettings(RedisSettingsProperty.builder()
     * .authPassword("authPassword")
     * .authType("authType")
     * .authUserName("authUserName")
     * .port(123)
     * .serverName("serverName")
     * .sslCaCertificateArn("sslCaCertificateArn")
     * .sslSecurityProtocol("sslSecurityProtocol")
     * .build())
     * .redshiftSettings(RedshiftSettingsProperty.builder()
     * .acceptAnyDate(false)
     * .afterConnectScript("afterConnectScript")
     * .bucketFolder("bucketFolder")
     * .bucketName("bucketName")
     * .caseSensitiveNames(false)
     * .compUpdate(false)
     * .connectionTimeout(123)
     * .dateFormat("dateFormat")
     * .emptyAsNull(false)
     * .encryptionMode("encryptionMode")
     * .explicitIds(false)
     * .fileTransferUploadStreams(123)
     * .loadTimeout(123)
     * .mapBooleanAsBoolean(false)
     * .maxFileSize(123)
     * .removeQuotes(false)
     * .replaceChars("replaceChars")
     * .replaceInvalidChars("replaceInvalidChars")
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .serverSideEncryptionKmsKeyId("serverSideEncryptionKmsKeyId")
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .timeFormat("timeFormat")
     * .trimBlanks(false)
     * .truncateColumns(false)
     * .writeBufferSize(123)
     * .build())
     * .resourceIdentifier("resourceIdentifier")
     * .s3Settings(S3SettingsProperty.builder()
     * .addColumnName(false)
     * .bucketFolder("bucketFolder")
     * .bucketName("bucketName")
     * .cannedAclForObjects("cannedAclForObjects")
     * .cdcInsertsAndUpdates(false)
     * .cdcInsertsOnly(false)
     * .cdcMaxBatchInterval(123)
     * .cdcMinFileSize(123)
     * .cdcPath("cdcPath")
     * .compressionType("compressionType")
     * .csvDelimiter("csvDelimiter")
     * .csvNoSupValue("csvNoSupValue")
     * .csvNullValue("csvNullValue")
     * .csvRowDelimiter("csvRowDelimiter")
     * .dataFormat("dataFormat")
     * .dataPageSize(123)
     * .datePartitionDelimiter("datePartitionDelimiter")
     * .datePartitionEnabled(false)
     * .datePartitionSequence("datePartitionSequence")
     * .datePartitionTimezone("datePartitionTimezone")
     * .dictPageSizeLimit(123)
     * .enableStatistics(false)
     * .encodingType("encodingType")
     * .encryptionMode("encryptionMode")
     * .externalTableDefinition("externalTableDefinition")
     * .ignoreHeaderRows(123)
     * .includeOpForFullLoad(false)
     * .maxFileSize(123)
     * .parquetTimestampInMillisecond(false)
     * .parquetVersion("parquetVersion")
     * .preserveTransactions(false)
     * .rfc4180(false)
     * .rowGroupLength(123)
     * .serverSideEncryptionKmsKeyId("serverSideEncryptionKmsKeyId")
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .timestampColumnName("timestampColumnName")
     * .useCsvNoSupValue(false)
     * .useTaskStartTimeForFullLoadTimestamp(false)
     * .build())
     * .serverName("serverName")
     * .sslMode("sslMode")
     * .sybaseSettings(SybaseSettingsProperty.builder()
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html)
     */
    public inline fun cfnEndpoint(
        scope: Construct,
        id: String,
        block: CfnEndpointDsl.() -> Unit = {},
    ): CfnEndpoint {
        val builder = CfnEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines a DocumentDB endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For more information about other available
     * settings, see
     * [Using extra connections attributes with Amazon DocumentDB as a source](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DocumentDB.html#CHAP_Source.DocumentDB.ECAs)
     * and
     * [Using Amazon DocumentDB as a target for AWS Database Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DocumentDB.html)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * DocDbSettingsProperty docDbSettingsProperty = DocDbSettingsProperty.builder()
     * .docsToInvestigate(123)
     * .extractDocId(false)
     * .nestingLevel("nestingLevel")
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-docdbsettings.html)
     */
    public inline fun cfnEndpointDocDbSettingsProperty(
        block: CfnEndpointDocDbSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.DocDbSettingsProperty {
        val builder = CfnEndpointDocDbSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information, including the Amazon Resource Name (ARN) of the IAM role used to define
     * an Amazon DynamoDB target endpoint.
     *
     * This information also includes the output format of records applied to the endpoint and
     * details of transaction and control table data information. For information about other
     * available settings, see
     * [Using object mapping to migrate data to DynamoDB](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html#CHAP_Target.DynamoDB.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * DynamoDbSettingsProperty dynamoDbSettingsProperty = DynamoDbSettingsProperty.builder()
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html)
     */
    public inline fun cfnEndpointDynamoDbSettingsProperty(
        block: CfnEndpointDynamoDbSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.DynamoDbSettingsProperty {
        val builder = CfnEndpointDynamoDbSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines an OpenSearch endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For more information about the available
     * settings, see
     * [Extra connection attributes when using OpenSearch as a target for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * ElasticsearchSettingsProperty elasticsearchSettingsProperty =
     * ElasticsearchSettingsProperty.builder()
     * .endpointUri("endpointUri")
     * .errorRetryDuration(123)
     * .fullLoadErrorPercentage(123)
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html)
     */
    public inline fun cfnEndpointElasticsearchSettingsProperty(
        block: CfnEndpointElasticsearchSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.ElasticsearchSettingsProperty {
        val builder = CfnEndpointElasticsearchSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines a GCP MySQL endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. These settings are much the same as the
     * settings for any MySQL-compatible endpoint. For more information, see
     * [Extra connection attributes when using MySQL as a source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * GcpMySQLSettingsProperty gcpMySQLSettingsProperty = GcpMySQLSettingsProperty.builder()
     * .afterConnectScript("afterConnectScript")
     * .cleanSourceMetadataOnMismatch(false)
     * .databaseName("databaseName")
     * .eventsPollInterval(123)
     * .maxFileSize(123)
     * .parallelLoadThreads(123)
     * .password("password")
     * .port(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .serverName("serverName")
     * .serverTimezone("serverTimezone")
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html)
     */
    public inline fun cfnEndpointGcpMySQLSettingsProperty(
        block: CfnEndpointGcpMySQLSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.GcpMySQLSettingsProperty {
        val builder = CfnEndpointGcpMySQLSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines an IBMDB2 endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For more information about other available
     * settings, see
     * [Extra connection attributes when using Db2 LUW as a source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * IbmDb2SettingsProperty ibmDb2SettingsProperty = IbmDb2SettingsProperty.builder()
     * .currentLsn("currentLsn")
     * .maxKBytesPerRead(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .setDataCaptureChanges(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html)
     */
    public inline fun cfnEndpointIbmDb2SettingsProperty(
        block: CfnEndpointIbmDb2SettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.IbmDb2SettingsProperty {
        val builder = CfnEndpointIbmDb2SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that describes an Apache Kafka endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For more information about other available
     * settings, see
     * [Using object mapping to migrate data to a Kafka topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * KafkaSettingsProperty kafkaSettingsProperty = KafkaSettingsProperty.builder()
     * .broker("broker")
     * .includeControlDetails(false)
     * .includeNullAndEmpty(false)
     * .includePartitionValue(false)
     * .includeTableAlterOperations(false)
     * .includeTransactionDetails(false)
     * .messageFormat("messageFormat")
     * .messageMaxBytes(123)
     * .noHexPrefix(false)
     * .partitionIncludeSchemaTable(false)
     * .saslPassword("saslPassword")
     * .saslUserName("saslUserName")
     * .securityProtocol("securityProtocol")
     * .sslCaCertificateArn("sslCaCertificateArn")
     * .sslClientCertificateArn("sslClientCertificateArn")
     * .sslClientKeyArn("sslClientKeyArn")
     * .sslClientKeyPassword("sslClientKeyPassword")
     * .topic("topic")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html)
     */
    public inline fun cfnEndpointKafkaSettingsProperty(
        block: CfnEndpointKafkaSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.KafkaSettingsProperty {
        val builder = CfnEndpointKafkaSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that describes an Amazon Kinesis Data Stream endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For more information about other available
     * settings, see
     * [Using object mapping to migrate data to a Kinesis data stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * KinesisSettingsProperty kinesisSettingsProperty = KinesisSettingsProperty.builder()
     * .includeControlDetails(false)
     * .includeNullAndEmpty(false)
     * .includePartitionValue(false)
     * .includeTableAlterOperations(false)
     * .includeTransactionDetails(false)
     * .messageFormat("messageFormat")
     * .noHexPrefix(false)
     * .partitionIncludeSchemaTable(false)
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .streamArn("streamArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html)
     */
    public inline fun cfnEndpointKinesisSettingsProperty(
        block: CfnEndpointKinesisSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.KinesisSettingsProperty {
        val builder = CfnEndpointKinesisSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines a Microsoft SQL Server endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For information about other available
     * settings, see
     * [Extra connection attributes when using SQL Server as a source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SQLServer.html#CHAP_Source.SQLServer.ConnectionAttrib)
     * and
     * [Extra connection attributes when using SQL Server as a target for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SQLServer.html#CHAP_Target.SQLServer.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * MicrosoftSqlServerSettingsProperty microsoftSqlServerSettingsProperty =
     * MicrosoftSqlServerSettingsProperty.builder()
     * .bcpPacketSize(123)
     * .controlTablesFileGroup("controlTablesFileGroup")
     * .querySingleAlwaysOnNode(false)
     * .readBackupOnly(false)
     * .safeguardPolicy("safeguardPolicy")
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .useBcpFullLoad(false)
     * .useThirdPartyBackupDevice(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html)
     */
    public inline fun cfnEndpointMicrosoftSqlServerSettingsProperty(
        block: CfnEndpointMicrosoftSqlServerSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.MicrosoftSqlServerSettingsProperty {
        val builder = CfnEndpointMicrosoftSqlServerSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines a MongoDB endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For more information about other available
     * settings, see
     * [Endpoint configuration settings when using MongoDB as a source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html#CHAP_Source.MongoDB.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * MongoDbSettingsProperty mongoDbSettingsProperty = MongoDbSettingsProperty.builder()
     * .authMechanism("authMechanism")
     * .authSource("authSource")
     * .authType("authType")
     * .databaseName("databaseName")
     * .docsToInvestigate("docsToInvestigate")
     * .extractDocId("extractDocId")
     * .nestingLevel("nestingLevel")
     * .password("password")
     * .port(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .serverName("serverName")
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html)
     */
    public inline fun cfnEndpointMongoDbSettingsProperty(
        block: CfnEndpointMongoDbSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.MongoDbSettingsProperty {
        val builder = CfnEndpointMongoDbSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines a MySQL endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For information about other available
     * settings, see
     * [Extra connection attributes when using MySQL as a source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * and
     * [Extra connection attributes when using a MySQL-compatible database as a target for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.MySQL.html#CHAP_Target.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * MySqlSettingsProperty mySqlSettingsProperty = MySqlSettingsProperty.builder()
     * .afterConnectScript("afterConnectScript")
     * .cleanSourceMetadataOnMismatch(false)
     * .eventsPollInterval(123)
     * .maxFileSize(123)
     * .parallelLoadThreads(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .serverTimezone("serverTimezone")
     * .targetDbType("targetDbType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html)
     */
    public inline fun cfnEndpointMySqlSettingsProperty(
        block: CfnEndpointMySqlSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.MySqlSettingsProperty {
        val builder = CfnEndpointMySqlSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines an Amazon Neptune endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For more information about the available
     * settings, see
     * [Specifying endpoint settings for Amazon Neptune as a target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * NeptuneSettingsProperty neptuneSettingsProperty = NeptuneSettingsProperty.builder()
     * .errorRetryDuration(123)
     * .iamAuthEnabled(false)
     * .maxFileSize(123)
     * .maxRetryCount(123)
     * .s3BucketFolder("s3BucketFolder")
     * .s3BucketName("s3BucketName")
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html)
     */
    public inline fun cfnEndpointNeptuneSettingsProperty(
        block: CfnEndpointNeptuneSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.NeptuneSettingsProperty {
        val builder = CfnEndpointNeptuneSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines an Oracle endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For information about other available
     * settings, see
     * [Extra connection attributes when using Oracle as a source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.ConnectionAttrib)
     * and
     * [Extra connection attributes when using Oracle as a target for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Oracle.html#CHAP_Target.Oracle.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * OracleSettingsProperty oracleSettingsProperty = OracleSettingsProperty.builder()
     * .accessAlternateDirectly(false)
     * .additionalArchivedLogDestId(123)
     * .addSupplementalLogging(false)
     * .allowSelectNestedTables(false)
     * .archivedLogDestId(123)
     * .archivedLogsOnly(false)
     * .asmPassword("asmPassword")
     * .asmServer("asmServer")
     * .asmUser("asmUser")
     * .charLengthSemantics("charLengthSemantics")
     * .directPathNoLog(false)
     * .directPathParallelLoad(false)
     * .enableHomogenousTablespace(false)
     * .extraArchivedLogDestIds(List.of(123))
     * .failTasksOnLobTruncation(false)
     * .numberDatatypeScale(123)
     * .oraclePathPrefix("oraclePathPrefix")
     * .parallelAsmReadThreads(123)
     * .readAheadBlocks(123)
     * .readTableSpaceName(false)
     * .replacePathPrefix(false)
     * .retryInterval(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerOracleAsmAccessRoleArn("secretsManagerOracleAsmAccessRoleArn")
     * .secretsManagerOracleAsmSecretId("secretsManagerOracleAsmSecretId")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .securityDbEncryption("securityDbEncryption")
     * .securityDbEncryptionName("securityDbEncryptionName")
     * .spatialDataOptionToGeoJsonFunctionName("spatialDataOptionToGeoJsonFunctionName")
     * .standbyDelayTime(123)
     * .useAlternateFolderForOnline(false)
     * .useBFile(false)
     * .useDirectPathFullLoad(false)
     * .useLogminerReader(false)
     * .usePathPrefix("usePathPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html)
     */
    public inline fun cfnEndpointOracleSettingsProperty(
        block: CfnEndpointOracleSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.OracleSettingsProperty {
        val builder = CfnEndpointOracleSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines a PostgreSQL endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For information about other available
     * settings, see
     * [Extra connection attributes when using PostgreSQL as a source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
     * and
     * [Extra connection attributes when using PostgreSQL as a target for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.PostgreSQL.html#CHAP_Target.PostgreSQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * PostgreSqlSettingsProperty postgreSqlSettingsProperty = PostgreSqlSettingsProperty.builder()
     * .afterConnectScript("afterConnectScript")
     * .captureDdls(false)
     * .ddlArtifactsSchema("ddlArtifactsSchema")
     * .executeTimeout(123)
     * .failTasksOnLobTruncation(false)
     * .heartbeatEnable(false)
     * .heartbeatFrequency(123)
     * .heartbeatSchema("heartbeatSchema")
     * .mapBooleanAsBoolean(false)
     * .maxFileSize(123)
     * .pluginName("pluginName")
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .slotName("slotName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html)
     */
    public inline fun cfnEndpointPostgreSqlSettingsProperty(
        block: CfnEndpointPostgreSqlSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.PostgreSqlSettingsProperty {
        val builder = CfnEndpointPostgreSqlSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEndpoint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * CfnEndpointProps cfnEndpointProps = CfnEndpointProps.builder()
     * .endpointType("endpointType")
     * .engineName("engineName")
     * // the properties below are optional
     * .certificateArn("certificateArn")
     * .databaseName("databaseName")
     * .docDbSettings(DocDbSettingsProperty.builder()
     * .docsToInvestigate(123)
     * .extractDocId(false)
     * .nestingLevel("nestingLevel")
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .build())
     * .dynamoDbSettings(DynamoDbSettingsProperty.builder()
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .build())
     * .elasticsearchSettings(ElasticsearchSettingsProperty.builder()
     * .endpointUri("endpointUri")
     * .errorRetryDuration(123)
     * .fullLoadErrorPercentage(123)
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .build())
     * .endpointIdentifier("endpointIdentifier")
     * .extraConnectionAttributes("extraConnectionAttributes")
     * .gcpMySqlSettings(GcpMySQLSettingsProperty.builder()
     * .afterConnectScript("afterConnectScript")
     * .cleanSourceMetadataOnMismatch(false)
     * .databaseName("databaseName")
     * .eventsPollInterval(123)
     * .maxFileSize(123)
     * .parallelLoadThreads(123)
     * .password("password")
     * .port(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .serverName("serverName")
     * .serverTimezone("serverTimezone")
     * .username("username")
     * .build())
     * .ibmDb2Settings(IbmDb2SettingsProperty.builder()
     * .currentLsn("currentLsn")
     * .maxKBytesPerRead(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .setDataCaptureChanges(false)
     * .build())
     * .kafkaSettings(KafkaSettingsProperty.builder()
     * .broker("broker")
     * .includeControlDetails(false)
     * .includeNullAndEmpty(false)
     * .includePartitionValue(false)
     * .includeTableAlterOperations(false)
     * .includeTransactionDetails(false)
     * .messageFormat("messageFormat")
     * .messageMaxBytes(123)
     * .noHexPrefix(false)
     * .partitionIncludeSchemaTable(false)
     * .saslPassword("saslPassword")
     * .saslUserName("saslUserName")
     * .securityProtocol("securityProtocol")
     * .sslCaCertificateArn("sslCaCertificateArn")
     * .sslClientCertificateArn("sslClientCertificateArn")
     * .sslClientKeyArn("sslClientKeyArn")
     * .sslClientKeyPassword("sslClientKeyPassword")
     * .topic("topic")
     * .build())
     * .kinesisSettings(KinesisSettingsProperty.builder()
     * .includeControlDetails(false)
     * .includeNullAndEmpty(false)
     * .includePartitionValue(false)
     * .includeTableAlterOperations(false)
     * .includeTransactionDetails(false)
     * .messageFormat("messageFormat")
     * .noHexPrefix(false)
     * .partitionIncludeSchemaTable(false)
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .streamArn("streamArn")
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .microsoftSqlServerSettings(MicrosoftSqlServerSettingsProperty.builder()
     * .bcpPacketSize(123)
     * .controlTablesFileGroup("controlTablesFileGroup")
     * .querySingleAlwaysOnNode(false)
     * .readBackupOnly(false)
     * .safeguardPolicy("safeguardPolicy")
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .useBcpFullLoad(false)
     * .useThirdPartyBackupDevice(false)
     * .build())
     * .mongoDbSettings(MongoDbSettingsProperty.builder()
     * .authMechanism("authMechanism")
     * .authSource("authSource")
     * .authType("authType")
     * .databaseName("databaseName")
     * .docsToInvestigate("docsToInvestigate")
     * .extractDocId("extractDocId")
     * .nestingLevel("nestingLevel")
     * .password("password")
     * .port(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .serverName("serverName")
     * .username("username")
     * .build())
     * .mySqlSettings(MySqlSettingsProperty.builder()
     * .afterConnectScript("afterConnectScript")
     * .cleanSourceMetadataOnMismatch(false)
     * .eventsPollInterval(123)
     * .maxFileSize(123)
     * .parallelLoadThreads(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .serverTimezone("serverTimezone")
     * .targetDbType("targetDbType")
     * .build())
     * .neptuneSettings(NeptuneSettingsProperty.builder()
     * .errorRetryDuration(123)
     * .iamAuthEnabled(false)
     * .maxFileSize(123)
     * .maxRetryCount(123)
     * .s3BucketFolder("s3BucketFolder")
     * .s3BucketName("s3BucketName")
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .build())
     * .oracleSettings(OracleSettingsProperty.builder()
     * .accessAlternateDirectly(false)
     * .additionalArchivedLogDestId(123)
     * .addSupplementalLogging(false)
     * .allowSelectNestedTables(false)
     * .archivedLogDestId(123)
     * .archivedLogsOnly(false)
     * .asmPassword("asmPassword")
     * .asmServer("asmServer")
     * .asmUser("asmUser")
     * .charLengthSemantics("charLengthSemantics")
     * .directPathNoLog(false)
     * .directPathParallelLoad(false)
     * .enableHomogenousTablespace(false)
     * .extraArchivedLogDestIds(List.of(123))
     * .failTasksOnLobTruncation(false)
     * .numberDatatypeScale(123)
     * .oraclePathPrefix("oraclePathPrefix")
     * .parallelAsmReadThreads(123)
     * .readAheadBlocks(123)
     * .readTableSpaceName(false)
     * .replacePathPrefix(false)
     * .retryInterval(123)
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerOracleAsmAccessRoleArn("secretsManagerOracleAsmAccessRoleArn")
     * .secretsManagerOracleAsmSecretId("secretsManagerOracleAsmSecretId")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .securityDbEncryption("securityDbEncryption")
     * .securityDbEncryptionName("securityDbEncryptionName")
     * .spatialDataOptionToGeoJsonFunctionName("spatialDataOptionToGeoJsonFunctionName")
     * .standbyDelayTime(123)
     * .useAlternateFolderForOnline(false)
     * .useBFile(false)
     * .useDirectPathFullLoad(false)
     * .useLogminerReader(false)
     * .usePathPrefix("usePathPrefix")
     * .build())
     * .password("password")
     * .port(123)
     * .postgreSqlSettings(PostgreSqlSettingsProperty.builder()
     * .afterConnectScript("afterConnectScript")
     * .captureDdls(false)
     * .ddlArtifactsSchema("ddlArtifactsSchema")
     * .executeTimeout(123)
     * .failTasksOnLobTruncation(false)
     * .heartbeatEnable(false)
     * .heartbeatFrequency(123)
     * .heartbeatSchema("heartbeatSchema")
     * .mapBooleanAsBoolean(false)
     * .maxFileSize(123)
     * .pluginName("pluginName")
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .slotName("slotName")
     * .build())
     * .redisSettings(RedisSettingsProperty.builder()
     * .authPassword("authPassword")
     * .authType("authType")
     * .authUserName("authUserName")
     * .port(123)
     * .serverName("serverName")
     * .sslCaCertificateArn("sslCaCertificateArn")
     * .sslSecurityProtocol("sslSecurityProtocol")
     * .build())
     * .redshiftSettings(RedshiftSettingsProperty.builder()
     * .acceptAnyDate(false)
     * .afterConnectScript("afterConnectScript")
     * .bucketFolder("bucketFolder")
     * .bucketName("bucketName")
     * .caseSensitiveNames(false)
     * .compUpdate(false)
     * .connectionTimeout(123)
     * .dateFormat("dateFormat")
     * .emptyAsNull(false)
     * .encryptionMode("encryptionMode")
     * .explicitIds(false)
     * .fileTransferUploadStreams(123)
     * .loadTimeout(123)
     * .mapBooleanAsBoolean(false)
     * .maxFileSize(123)
     * .removeQuotes(false)
     * .replaceChars("replaceChars")
     * .replaceInvalidChars("replaceInvalidChars")
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .serverSideEncryptionKmsKeyId("serverSideEncryptionKmsKeyId")
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .timeFormat("timeFormat")
     * .trimBlanks(false)
     * .truncateColumns(false)
     * .writeBufferSize(123)
     * .build())
     * .resourceIdentifier("resourceIdentifier")
     * .s3Settings(S3SettingsProperty.builder()
     * .addColumnName(false)
     * .bucketFolder("bucketFolder")
     * .bucketName("bucketName")
     * .cannedAclForObjects("cannedAclForObjects")
     * .cdcInsertsAndUpdates(false)
     * .cdcInsertsOnly(false)
     * .cdcMaxBatchInterval(123)
     * .cdcMinFileSize(123)
     * .cdcPath("cdcPath")
     * .compressionType("compressionType")
     * .csvDelimiter("csvDelimiter")
     * .csvNoSupValue("csvNoSupValue")
     * .csvNullValue("csvNullValue")
     * .csvRowDelimiter("csvRowDelimiter")
     * .dataFormat("dataFormat")
     * .dataPageSize(123)
     * .datePartitionDelimiter("datePartitionDelimiter")
     * .datePartitionEnabled(false)
     * .datePartitionSequence("datePartitionSequence")
     * .datePartitionTimezone("datePartitionTimezone")
     * .dictPageSizeLimit(123)
     * .enableStatistics(false)
     * .encodingType("encodingType")
     * .encryptionMode("encryptionMode")
     * .externalTableDefinition("externalTableDefinition")
     * .ignoreHeaderRows(123)
     * .includeOpForFullLoad(false)
     * .maxFileSize(123)
     * .parquetTimestampInMillisecond(false)
     * .parquetVersion("parquetVersion")
     * .preserveTransactions(false)
     * .rfc4180(false)
     * .rowGroupLength(123)
     * .serverSideEncryptionKmsKeyId("serverSideEncryptionKmsKeyId")
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .timestampColumnName("timestampColumnName")
     * .useCsvNoSupValue(false)
     * .useTaskStartTimeForFullLoadTimestamp(false)
     * .build())
     * .serverName("serverName")
     * .sslMode("sslMode")
     * .sybaseSettings(SybaseSettingsProperty.builder()
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html)
     */
    public inline fun cfnEndpointProps(
        block: CfnEndpointPropsDsl.() -> Unit = {}
    ): CfnEndpointProps {
        val builder = CfnEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines a Redis target endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For information about other available
     * settings, see
     * [Specifying endpoint settings for Redis as a target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * RedisSettingsProperty redisSettingsProperty = RedisSettingsProperty.builder()
     * .authPassword("authPassword")
     * .authType("authType")
     * .authUserName("authUserName")
     * .port(123)
     * .serverName("serverName")
     * .sslCaCertificateArn("sslCaCertificateArn")
     * .sslSecurityProtocol("sslSecurityProtocol")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html)
     */
    public inline fun cfnEndpointRedisSettingsProperty(
        block: CfnEndpointRedisSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.RedisSettingsProperty {
        val builder = CfnEndpointRedisSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines an Amazon Redshift endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For more information about other available
     * settings, see
     * [Extra connection attributes when using Amazon Redshift as a target for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redshift.html#CHAP_Target.Redshift.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * RedshiftSettingsProperty redshiftSettingsProperty = RedshiftSettingsProperty.builder()
     * .acceptAnyDate(false)
     * .afterConnectScript("afterConnectScript")
     * .bucketFolder("bucketFolder")
     * .bucketName("bucketName")
     * .caseSensitiveNames(false)
     * .compUpdate(false)
     * .connectionTimeout(123)
     * .dateFormat("dateFormat")
     * .emptyAsNull(false)
     * .encryptionMode("encryptionMode")
     * .explicitIds(false)
     * .fileTransferUploadStreams(123)
     * .loadTimeout(123)
     * .mapBooleanAsBoolean(false)
     * .maxFileSize(123)
     * .removeQuotes(false)
     * .replaceChars("replaceChars")
     * .replaceInvalidChars("replaceInvalidChars")
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .serverSideEncryptionKmsKeyId("serverSideEncryptionKmsKeyId")
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .timeFormat("timeFormat")
     * .trimBlanks(false)
     * .truncateColumns(false)
     * .writeBufferSize(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html)
     */
    public inline fun cfnEndpointRedshiftSettingsProperty(
        block: CfnEndpointRedshiftSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.RedshiftSettingsProperty {
        val builder = CfnEndpointRedshiftSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines an Amazon S3 endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For more information about the available
     * settings, see
     * [Extra connection attributes when using Amazon S3 as a source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.S3.html#CHAP_Source.S3.Configuring)
     * and
     * [Extra connection attributes when using Amazon S3 as a target for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * S3SettingsProperty s3SettingsProperty = S3SettingsProperty.builder()
     * .addColumnName(false)
     * .bucketFolder("bucketFolder")
     * .bucketName("bucketName")
     * .cannedAclForObjects("cannedAclForObjects")
     * .cdcInsertsAndUpdates(false)
     * .cdcInsertsOnly(false)
     * .cdcMaxBatchInterval(123)
     * .cdcMinFileSize(123)
     * .cdcPath("cdcPath")
     * .compressionType("compressionType")
     * .csvDelimiter("csvDelimiter")
     * .csvNoSupValue("csvNoSupValue")
     * .csvNullValue("csvNullValue")
     * .csvRowDelimiter("csvRowDelimiter")
     * .dataFormat("dataFormat")
     * .dataPageSize(123)
     * .datePartitionDelimiter("datePartitionDelimiter")
     * .datePartitionEnabled(false)
     * .datePartitionSequence("datePartitionSequence")
     * .datePartitionTimezone("datePartitionTimezone")
     * .dictPageSizeLimit(123)
     * .enableStatistics(false)
     * .encodingType("encodingType")
     * .encryptionMode("encryptionMode")
     * .externalTableDefinition("externalTableDefinition")
     * .ignoreHeaderRows(123)
     * .includeOpForFullLoad(false)
     * .maxFileSize(123)
     * .parquetTimestampInMillisecond(false)
     * .parquetVersion("parquetVersion")
     * .preserveTransactions(false)
     * .rfc4180(false)
     * .rowGroupLength(123)
     * .serverSideEncryptionKmsKeyId("serverSideEncryptionKmsKeyId")
     * .serviceAccessRoleArn("serviceAccessRoleArn")
     * .timestampColumnName("timestampColumnName")
     * .useCsvNoSupValue(false)
     * .useTaskStartTimeForFullLoadTimestamp(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html)
     */
    public inline fun cfnEndpointS3SettingsProperty(
        block: CfnEndpointS3SettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.S3SettingsProperty {
        val builder = CfnEndpointS3SettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that defines a SAP ASE endpoint.
     *
     * This information includes the output format of records applied to the endpoint and details of
     * transaction and control table data information. For information about other available
     * settings, see
     * [Extra connection attributes when using SAP ASE as a source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SAP.html#CHAP_Source.SAP.ConnectionAttrib)
     * and
     * [Extra connection attributes when using SAP ASE as a target for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SAP.html#CHAP_Target.SAP.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * SybaseSettingsProperty sybaseSettingsProperty = SybaseSettingsProperty.builder()
     * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
     * .secretsManagerSecretId("secretsManagerSecretId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-sybasesettings.html)
     */
    public inline fun cfnEndpointSybaseSettingsProperty(
        block: CfnEndpointSybaseSettingsPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.SybaseSettingsProperty {
        val builder = CfnEndpointSybaseSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::DMS::EventSubscription` resource to get notifications for AWS Database
     * Migration Service events through the Amazon Simple Notification Service .
     *
     * For more information, see
     * [Working with events and notifications in AWS Database Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * CfnEventSubscription cfnEventSubscription = CfnEventSubscription.Builder.create(this,
     * "MyCfnEventSubscription")
     * .snsTopicArn("snsTopicArn")
     * // the properties below are optional
     * .enabled(false)
     * .eventCategories(List.of("eventCategories"))
     * .sourceIds(List.of("sourceIds"))
     * .sourceType("sourceType")
     * .subscriptionName("subscriptionName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html)
     */
    public inline fun cfnEventSubscription(
        scope: Construct,
        id: String,
        block: CfnEventSubscriptionDsl.() -> Unit = {},
    ): CfnEventSubscription {
        val builder = CfnEventSubscriptionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEventSubscription`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * CfnEventSubscriptionProps cfnEventSubscriptionProps = CfnEventSubscriptionProps.builder()
     * .snsTopicArn("snsTopicArn")
     * // the properties below are optional
     * .enabled(false)
     * .eventCategories(List.of("eventCategories"))
     * .sourceIds(List.of("sourceIds"))
     * .sourceType("sourceType")
     * .subscriptionName("subscriptionName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html)
     */
    public inline fun cfnEventSubscriptionProps(
        block: CfnEventSubscriptionPropsDsl.() -> Unit = {}
    ): CfnEventSubscriptionProps {
        val builder = CfnEventSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A replication configuration that you later provide to configure and start a AWS DMS
     * Serverless replication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * Object replicationSettings;
     * Object supplementalSettings;
     * Object tableMappings;
     * CfnReplicationConfig cfnReplicationConfig = CfnReplicationConfig.Builder.create(this,
     * "MyCfnReplicationConfig")
     * .computeConfig(ComputeConfigProperty.builder()
     * .maxCapacityUnits(123)
     * // the properties below are optional
     * .availabilityZone("availabilityZone")
     * .dnsNameServers("dnsNameServers")
     * .kmsKeyId("kmsKeyId")
     * .minCapacityUnits(123)
     * .multiAz(false)
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .replicationSubnetGroupId("replicationSubnetGroupId")
     * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
     * .build())
     * .replicationConfigArn("replicationConfigArn")
     * .replicationConfigIdentifier("replicationConfigIdentifier")
     * .replicationSettings(replicationSettings)
     * .replicationType("replicationType")
     * .resourceIdentifier("resourceIdentifier")
     * .sourceEndpointArn("sourceEndpointArn")
     * .supplementalSettings(supplementalSettings)
     * .tableMappings(tableMappings)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targetEndpointArn("targetEndpointArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html)
     */
    public inline fun cfnReplicationConfig(
        scope: Construct,
        id: String,
        block: CfnReplicationConfigDsl.() -> Unit = {},
    ): CfnReplicationConfig {
        val builder = CfnReplicationConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration parameters for provisioning an AWS DMS Serverless replication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * ComputeConfigProperty computeConfigProperty = ComputeConfigProperty.builder()
     * .maxCapacityUnits(123)
     * // the properties below are optional
     * .availabilityZone("availabilityZone")
     * .dnsNameServers("dnsNameServers")
     * .kmsKeyId("kmsKeyId")
     * .minCapacityUnits(123)
     * .multiAz(false)
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .replicationSubnetGroupId("replicationSubnetGroupId")
     * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html)
     */
    public inline fun cfnReplicationConfigComputeConfigProperty(
        block: CfnReplicationConfigComputeConfigPropertyDsl.() -> Unit = {}
    ): CfnReplicationConfig.ComputeConfigProperty {
        val builder = CfnReplicationConfigComputeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReplicationConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * Object replicationSettings;
     * Object supplementalSettings;
     * Object tableMappings;
     * CfnReplicationConfigProps cfnReplicationConfigProps = CfnReplicationConfigProps.builder()
     * .computeConfig(ComputeConfigProperty.builder()
     * .maxCapacityUnits(123)
     * // the properties below are optional
     * .availabilityZone("availabilityZone")
     * .dnsNameServers("dnsNameServers")
     * .kmsKeyId("kmsKeyId")
     * .minCapacityUnits(123)
     * .multiAz(false)
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .replicationSubnetGroupId("replicationSubnetGroupId")
     * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
     * .build())
     * .replicationConfigArn("replicationConfigArn")
     * .replicationConfigIdentifier("replicationConfigIdentifier")
     * .replicationSettings(replicationSettings)
     * .replicationType("replicationType")
     * .resourceIdentifier("resourceIdentifier")
     * .sourceEndpointArn("sourceEndpointArn")
     * .supplementalSettings(supplementalSettings)
     * .tableMappings(tableMappings)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targetEndpointArn("targetEndpointArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html)
     */
    public inline fun cfnReplicationConfigProps(
        block: CfnReplicationConfigPropsDsl.() -> Unit = {}
    ): CfnReplicationConfigProps {
        val builder = CfnReplicationConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DMS::ReplicationInstance` resource creates an AWS DMS replication instance.
     *
     * To create a ReplicationInstance, you need permissions to create instances. You'll need
     * similar permissions to terminate instances when you delete stacks with instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * CfnReplicationInstance cfnReplicationInstance = CfnReplicationInstance.Builder.create(this,
     * "MyCfnReplicationInstance")
     * .replicationInstanceClass("replicationInstanceClass")
     * // the properties below are optional
     * .allocatedStorage(123)
     * .allowMajorVersionUpgrade(false)
     * .autoMinorVersionUpgrade(false)
     * .availabilityZone("availabilityZone")
     * .engineVersion("engineVersion")
     * .kmsKeyId("kmsKeyId")
     * .multiAz(false)
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .publiclyAccessible(false)
     * .replicationInstanceIdentifier("replicationInstanceIdentifier")
     * .replicationSubnetGroupIdentifier("replicationSubnetGroupIdentifier")
     * .resourceIdentifier("resourceIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html)
     */
    public inline fun cfnReplicationInstance(
        scope: Construct,
        id: String,
        block: CfnReplicationInstanceDsl.() -> Unit = {},
    ): CfnReplicationInstance {
        val builder = CfnReplicationInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReplicationInstance`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * CfnReplicationInstanceProps cfnReplicationInstanceProps = CfnReplicationInstanceProps.builder()
     * .replicationInstanceClass("replicationInstanceClass")
     * // the properties below are optional
     * .allocatedStorage(123)
     * .allowMajorVersionUpgrade(false)
     * .autoMinorVersionUpgrade(false)
     * .availabilityZone("availabilityZone")
     * .engineVersion("engineVersion")
     * .kmsKeyId("kmsKeyId")
     * .multiAz(false)
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .publiclyAccessible(false)
     * .replicationInstanceIdentifier("replicationInstanceIdentifier")
     * .replicationSubnetGroupIdentifier("replicationSubnetGroupIdentifier")
     * .resourceIdentifier("resourceIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html)
     */
    public inline fun cfnReplicationInstanceProps(
        block: CfnReplicationInstancePropsDsl.() -> Unit = {}
    ): CfnReplicationInstanceProps {
        val builder = CfnReplicationInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DMS::ReplicationSubnetGroup` resource creates an AWS DMS replication subnet group.
     *
     * Subnet groups must contain at least two subnets in two different Availability Zones in the
     * same AWS Region .
     *
     * Resource creation fails if the `dms-vpc-role` AWS Identity and Access Management ( IAM ) role
     * doesn't already exist. For more information, see
     * [Creating the IAM Roles to Use With the AWS CLI and AWS DMS API](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.APIRole.html)
     * in the *AWS Database Migration Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * CfnReplicationSubnetGroup cfnReplicationSubnetGroup =
     * CfnReplicationSubnetGroup.Builder.create(this, "MyCfnReplicationSubnetGroup")
     * .replicationSubnetGroupDescription("replicationSubnetGroupDescription")
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .replicationSubnetGroupIdentifier("replicationSubnetGroupIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html)
     */
    public inline fun cfnReplicationSubnetGroup(
        scope: Construct,
        id: String,
        block: CfnReplicationSubnetGroupDsl.() -> Unit = {},
    ): CfnReplicationSubnetGroup {
        val builder = CfnReplicationSubnetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReplicationSubnetGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * CfnReplicationSubnetGroupProps cfnReplicationSubnetGroupProps =
     * CfnReplicationSubnetGroupProps.builder()
     * .replicationSubnetGroupDescription("replicationSubnetGroupDescription")
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .replicationSubnetGroupIdentifier("replicationSubnetGroupIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html)
     */
    public inline fun cfnReplicationSubnetGroupProps(
        block: CfnReplicationSubnetGroupPropsDsl.() -> Unit = {}
    ): CfnReplicationSubnetGroupProps {
        val builder = CfnReplicationSubnetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DMS::ReplicationTask` resource creates an AWS DMS replication task.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * CfnReplicationTask cfnReplicationTask = CfnReplicationTask.Builder.create(this,
     * "MyCfnReplicationTask")
     * .migrationType("migrationType")
     * .replicationInstanceArn("replicationInstanceArn")
     * .sourceEndpointArn("sourceEndpointArn")
     * .tableMappings("tableMappings")
     * .targetEndpointArn("targetEndpointArn")
     * // the properties below are optional
     * .cdcStartPosition("cdcStartPosition")
     * .cdcStartTime(123)
     * .cdcStopPosition("cdcStopPosition")
     * .replicationTaskIdentifier("replicationTaskIdentifier")
     * .replicationTaskSettings("replicationTaskSettings")
     * .resourceIdentifier("resourceIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskData("taskData")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html)
     */
    public inline fun cfnReplicationTask(
        scope: Construct,
        id: String,
        block: CfnReplicationTaskDsl.() -> Unit = {},
    ): CfnReplicationTask {
        val builder = CfnReplicationTaskDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReplicationTask`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dms.*;
     * CfnReplicationTaskProps cfnReplicationTaskProps = CfnReplicationTaskProps.builder()
     * .migrationType("migrationType")
     * .replicationInstanceArn("replicationInstanceArn")
     * .sourceEndpointArn("sourceEndpointArn")
     * .tableMappings("tableMappings")
     * .targetEndpointArn("targetEndpointArn")
     * // the properties below are optional
     * .cdcStartPosition("cdcStartPosition")
     * .cdcStartTime(123)
     * .cdcStopPosition("cdcStopPosition")
     * .replicationTaskIdentifier("replicationTaskIdentifier")
     * .replicationTaskSettings("replicationTaskSettings")
     * .resourceIdentifier("resourceIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskData("taskData")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html)
     */
    public inline fun cfnReplicationTaskProps(
        block: CfnReplicationTaskPropsDsl.() -> Unit = {}
    ): CfnReplicationTaskProps {
        val builder = CfnReplicationTaskPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
