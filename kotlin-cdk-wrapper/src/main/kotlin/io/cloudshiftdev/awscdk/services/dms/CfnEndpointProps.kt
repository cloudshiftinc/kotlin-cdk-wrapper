@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
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
 * .keepCsvFiles(false)
 * .loadTimeout(123)
 * .maxFileSize(123)
 * .maxKBytesPerRead(123)
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .setDataCaptureChanges(false)
 * .writeBufferSize(123)
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
 * .databaseName("databaseName")
 * .forceLobLookup(false)
 * .password("password")
 * .port(123)
 * .querySingleAlwaysOnNode(false)
 * .readBackupOnly(false)
 * .safeguardPolicy("safeguardPolicy")
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .serverName("serverName")
 * .tlogAccessMode("tlogAccessMode")
 * .trimSpaceInChar(false)
 * .useBcpFullLoad(false)
 * .username("username")
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
 * .babelfishDatabaseName("babelfishDatabaseName")
 * .captureDdls(false)
 * .databaseMode("databaseMode")
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
 * .addTrailingPaddingCharacter(false)
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
 * .expectedBucketOwner("expectedBucketOwner")
 * .externalTableDefinition("externalTableDefinition")
 * .glueCatalogGeneration(false)
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
public interface CfnEndpointProps {
  /**
   * The Amazon Resource Name (ARN) for the certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-certificatearn)
   */
  public fun certificateArn(): String? = unwrap(this).getCertificateArn()

  /**
   * The name of the endpoint database.
   *
   * For a MySQL source or target endpoint, don't specify `DatabaseName` . To migrate to a specific
   * database, use this setting and `targetDbType` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-databasename)
   */
  public fun databaseName(): String? = unwrap(this).getDatabaseName()

  /**
   * Settings in JSON format for the source and target DocumentDB endpoint.
   *
   * For more information about other available settings, see [Using extra connections attributes
   * with Amazon DocumentDB as a
   * source](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DocumentDB.html#CHAP_Source.DocumentDB.ECAs)
   * and [Using Amazon DocumentDB as a target for AWS Database Migration
   * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DocumentDB.html) in the *AWS
   * Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-docdbsettings)
   */
  public fun docDbSettings(): Any? = unwrap(this).getDocDbSettings()

  /**
   * Settings in JSON format for the target Amazon DynamoDB endpoint.
   *
   * For information about other available settings, see [Using object mapping to migrate data to
   * DynamoDB](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html#CHAP_Target.DynamoDB.ObjectMapping)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-dynamodbsettings)
   */
  public fun dynamoDbSettings(): Any? = unwrap(this).getDynamoDbSettings()

  /**
   * Settings in JSON format for the target OpenSearch endpoint.
   *
   * For more information about the available settings, see [Extra connection attributes when using
   * OpenSearch as a target for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-elasticsearchsettings)
   */
  public fun elasticsearchSettings(): Any? = unwrap(this).getElasticsearchSettings()

  /**
   * The database endpoint identifier.
   *
   * Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens.
   * They can't end with a hyphen, or contain two consecutive hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointidentifier)
   */
  public fun endpointIdentifier(): String? = unwrap(this).getEndpointIdentifier()

  /**
   * The type of endpoint.
   *
   * Valid values are `source` and `target` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointtype)
   */
  public fun endpointType(): String

  /**
   * The type of engine for the endpoint, depending on the `EndpointType` value.
   *
   * *Valid values* : `mysql` | `oracle` | `postgres` | `mariadb` | `aurora` | `aurora-postgresql` |
   * `opensearch` | `redshift` | `redshift-serverless` | `s3` | `db2` | `azuredb` | `sybase` |
   * `dynamodb` | `mongodb` | `kinesis` | `kafka` | `elasticsearch` | `docdb` | `sqlserver` | `neptune`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-enginename)
   */
  public fun engineName(): String

  /**
   * Additional attributes associated with the connection.
   *
   * Each attribute is specified as a name-value pair associated by an equal sign (=). Multiple
   * attributes are separated by a semicolon (;) with no additional white space. For information on the
   * attributes available for connecting your source or target endpoint, see [Working with AWS DMS
   * Endpoints](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Endpoints.html) in the *AWS
   * Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-extraconnectionattributes)
   */
  public fun extraConnectionAttributes(): String? = unwrap(this).getExtraConnectionAttributes()

  /**
   * Settings in JSON format for the source GCP MySQL endpoint.
   *
   * These settings are much the same as the settings for any MySQL-compatible endpoint. For more
   * information, see [Extra connection attributes when using MySQL as a source for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-gcpmysqlsettings)
   */
  public fun gcpMySqlSettings(): Any? = unwrap(this).getGcpMySqlSettings()

  /**
   * Settings in JSON format for the source IBM Db2 LUW endpoint.
   *
   * For information about other available settings, see [Extra connection attributes when using Db2
   * LUW as a source for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-ibmdb2settings)
   */
  public fun ibmDb2Settings(): Any? = unwrap(this).getIbmDb2Settings()

  /**
   * Settings in JSON format for the target Apache Kafka endpoint.
   *
   * For more information about other available settings, see [Using object mapping to migrate data
   * to a Kafka
   * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kafkasettings)
   */
  public fun kafkaSettings(): Any? = unwrap(this).getKafkaSettings()

  /**
   * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
   *
   * For more information about other available settings, see [Using object mapping to migrate data
   * to a Kinesis data
   * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kinesissettings)
   */
  public fun kinesisSettings(): Any? = unwrap(this).getKinesisSettings()

  /**
   * An AWS KMS key identifier that is used to encrypt the connection parameters for the endpoint.
   *
   * If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your default encryption
   * key.
   *
   * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
   * different default encryption key for each AWS Region .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Settings in JSON format for the source and target Microsoft SQL Server endpoint.
   *
   * For information about other available settings, see [Extra connection attributes when using SQL
   * Server as a source for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SQLServer.html#CHAP_Source.SQLServer.ConnectionAttrib)
   * and [Extra connection attributes when using SQL Server as a target for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SQLServer.html#CHAP_Target.SQLServer.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-microsoftsqlserversettings)
   */
  public fun microsoftSqlServerSettings(): Any? = unwrap(this).getMicrosoftSqlServerSettings()

  /**
   * Settings in JSON format for the source MongoDB endpoint.
   *
   * For more information about the available settings, see [Using MongoDB as a target for AWS
   * Database Migration
   * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html#CHAP_Source.MongoDB.Configuration)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-mongodbsettings)
   */
  public fun mongoDbSettings(): Any? = unwrap(this).getMongoDbSettings()

  /**
   * Settings in JSON format for the source and target MySQL endpoint.
   *
   * For information about other available settings, see [Extra connection attributes when using
   * MySQL as a source for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
   * and [Extra connection attributes when using a MySQL-compatible database as a target for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.MySQL.html#CHAP_Target.MySQL.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-mysqlsettings)
   */
  public fun mySqlSettings(): Any? = unwrap(this).getMySqlSettings()

  /**
   * Settings in JSON format for the target Amazon Neptune endpoint.
   *
   * For more information about the available settings, see [Specifying endpoint settings for Amazon
   * Neptune as a
   * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-neptunesettings)
   */
  public fun neptuneSettings(): Any? = unwrap(this).getNeptuneSettings()

  /**
   * Settings in JSON format for the source and target Oracle endpoint.
   *
   * For information about other available settings, see [Extra connection attributes when using
   * Oracle as a source for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.ConnectionAttrib)
   * and [Extra connection attributes when using Oracle as a target for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Oracle.html#CHAP_Target.Oracle.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-oraclesettings)
   */
  public fun oracleSettings(): Any? = unwrap(this).getOracleSettings()

  /**
   * The password to be used to log in to the endpoint database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-password)
   */
  public fun password(): String? = unwrap(this).getPassword()

  /**
   * The port used by the endpoint database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-port)
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * Settings in JSON format for the source and target PostgreSQL endpoint.
   *
   * For information about other available settings, see [Extra connection attributes when using
   * PostgreSQL as a source for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
   * and [Extra connection attributes when using PostgreSQL as a target for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.PostgreSQL.html#CHAP_Target.PostgreSQL.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-postgresqlsettings)
   */
  public fun postgreSqlSettings(): Any? = unwrap(this).getPostgreSqlSettings()

  /**
   * Settings in JSON format for the target Redis endpoint.
   *
   * For information about other available settings, see [Specifying endpoint settings for Redis as
   * a
   * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redissettings)
   */
  public fun redisSettings(): Any? = unwrap(this).getRedisSettings()

  /**
   * Settings in JSON format for the Amazon Redshift endpoint.
   *
   * For more information about other available settings, see [Extra connection attributes when
   * using Amazon Redshift as a target for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redshift.html#CHAP_Target.Redshift.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redshiftsettings)
   */
  public fun redshiftSettings(): Any? = unwrap(this).getRedshiftSettings()

  /**
   * A display name for the resource identifier at the end of the `EndpointArn` response parameter
   * that is returned in the created `Endpoint` object.
   *
   * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
   * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens, and
   * can only begin with a letter, such as `Example-App-ARN1` .
   *
   * For example, this value might result in the `EndpointArn` value
   * `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If you don't specify a
   * `ResourceIdentifier` value, AWS DMS generates a default identifier value for the end of
   * `EndpointArn` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-resourceidentifier)
   */
  public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  /**
   * Settings in JSON format for the source and target Amazon S3 endpoint.
   *
   * For more information about other available settings, see [Extra connection attributes when
   * using Amazon S3 as a source for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.S3.html#CHAP_Source.S3.Configuring)
   * and [Extra connection attributes when using Amazon S3 as a target for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-s3settings)
   */
  public fun s3Settings(): Any? = unwrap(this).getS3Settings()

  /**
   * The name of the server where the endpoint database resides.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-servername)
   */
  public fun serverName(): String? = unwrap(this).getServerName()

  /**
   * The Secure Sockets Layer (SSL) mode to use for the SSL connection. The default is `none` .
   *
   *
   * When `engine_name` is set to S3, the only allowed value is `none` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-sslmode)
   */
  public fun sslMode(): String? = unwrap(this).getSslMode()

  /**
   * Settings in JSON format for the source and target SAP ASE endpoint.
   *
   * For information about other available settings, see [Extra connection attributes when using SAP
   * ASE as a source for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SAP.html#CHAP_Source.SAP.ConnectionAttrib)
   * and [Extra connection attributes when using SAP ASE as a target for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SAP.html#CHAP_Target.SAP.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-sybasesettings)
   */
  public fun sybaseSettings(): Any? = unwrap(this).getSybaseSettings()

  /**
   * One or more tags to be assigned to the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The user name to be used to log in to the endpoint database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-username)
   */
  public fun username(): String? = unwrap(this).getUsername()

  /**
   * A builder for [CfnEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateArn The Amazon Resource Name (ARN) for the certificate.
     */
    public fun certificateArn(certificateArn: String)

    /**
     * @param databaseName The name of the endpoint database.
     * For a MySQL source or target endpoint, don't specify `DatabaseName` . To migrate to a
     * specific database, use this setting and `targetDbType` .
     */
    public fun databaseName(databaseName: String)

    /**
     * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint.
     * For more information about other available settings, see [Using extra connections attributes
     * with Amazon DocumentDB as a
     * source](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DocumentDB.html#CHAP_Source.DocumentDB.ECAs)
     * and [Using Amazon DocumentDB as a target for AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DocumentDB.html) in the
     * *AWS Database Migration Service User Guide* .
     */
    public fun docDbSettings(docDbSettings: IResolvable)

    /**
     * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint.
     * For more information about other available settings, see [Using extra connections attributes
     * with Amazon DocumentDB as a
     * source](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DocumentDB.html#CHAP_Source.DocumentDB.ECAs)
     * and [Using Amazon DocumentDB as a target for AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DocumentDB.html) in the
     * *AWS Database Migration Service User Guide* .
     */
    public fun docDbSettings(docDbSettings: CfnEndpoint.DocDbSettingsProperty)

    /**
     * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint.
     * For more information about other available settings, see [Using extra connections attributes
     * with Amazon DocumentDB as a
     * source](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DocumentDB.html#CHAP_Source.DocumentDB.ECAs)
     * and [Using Amazon DocumentDB as a target for AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DocumentDB.html) in the
     * *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e77dacf15846105a73a00a59a19dff9bcd68da1cfe8b460dd2022428600b8212")
    public fun docDbSettings(docDbSettings: CfnEndpoint.DocDbSettingsProperty.Builder.() -> Unit)

    /**
     * @param dynamoDbSettings Settings in JSON format for the target Amazon DynamoDB endpoint.
     * For information about other available settings, see [Using object mapping to migrate data to
     * DynamoDB](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html#CHAP_Target.DynamoDB.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun dynamoDbSettings(dynamoDbSettings: IResolvable)

    /**
     * @param dynamoDbSettings Settings in JSON format for the target Amazon DynamoDB endpoint.
     * For information about other available settings, see [Using object mapping to migrate data to
     * DynamoDB](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html#CHAP_Target.DynamoDB.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun dynamoDbSettings(dynamoDbSettings: CfnEndpoint.DynamoDbSettingsProperty)

    /**
     * @param dynamoDbSettings Settings in JSON format for the target Amazon DynamoDB endpoint.
     * For information about other available settings, see [Using object mapping to migrate data to
     * DynamoDB](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html#CHAP_Target.DynamoDB.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0822ed908d3ab7bf45e9e99cf0606803f960d62cdba5c87bafdfb44f62076cb5")
    public
        fun dynamoDbSettings(dynamoDbSettings: CfnEndpoint.DynamoDbSettingsProperty.Builder.() -> Unit)

    /**
     * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint.
     * For more information about the available settings, see [Extra connection attributes when
     * using OpenSearch as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun elasticsearchSettings(elasticsearchSettings: IResolvable)

    /**
     * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint.
     * For more information about the available settings, see [Extra connection attributes when
     * using OpenSearch as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     */
    public
        fun elasticsearchSettings(elasticsearchSettings: CfnEndpoint.ElasticsearchSettingsProperty)

    /**
     * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint.
     * For more information about the available settings, see [Extra connection attributes when
     * using OpenSearch as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c4fc6dc7ca128b49197485a4fb1b96d66305964a873ea584c354f58e4eb0fd8")
    public
        fun elasticsearchSettings(elasticsearchSettings: CfnEndpoint.ElasticsearchSettingsProperty.Builder.() -> Unit)

    /**
     * @param endpointIdentifier The database endpoint identifier.
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */
    public fun endpointIdentifier(endpointIdentifier: String)

    /**
     * @param endpointType The type of endpoint. 
     * Valid values are `source` and `target` .
     */
    public fun endpointType(endpointType: String)

    /**
     * @param engineName The type of engine for the endpoint, depending on the `EndpointType` value.
     * 
     * *Valid values* : `mysql` | `oracle` | `postgres` | `mariadb` | `aurora` | `aurora-postgresql`
     * | `opensearch` | `redshift` | `redshift-serverless` | `s3` | `db2` | `azuredb` | `sybase` |
     * `dynamodb` | `mongodb` | `kinesis` | `kafka` | `elasticsearch` | `docdb` | `sqlserver` |
     * `neptune`
     */
    public fun engineName(engineName: String)

    /**
     * @param extraConnectionAttributes Additional attributes associated with the connection.
     * Each attribute is specified as a name-value pair associated by an equal sign (=). Multiple
     * attributes are separated by a semicolon (;) with no additional white space. For information on
     * the attributes available for connecting your source or target endpoint, see [Working with AWS
     * DMS Endpoints](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Endpoints.html) in the *AWS
     * Database Migration Service User Guide* .
     */
    public fun extraConnectionAttributes(extraConnectionAttributes: String)

    /**
     * @param gcpMySqlSettings Settings in JSON format for the source GCP MySQL endpoint.
     * These settings are much the same as the settings for any MySQL-compatible endpoint. For more
     * information, see [Extra connection attributes when using MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun gcpMySqlSettings(gcpMySqlSettings: IResolvable)

    /**
     * @param gcpMySqlSettings Settings in JSON format for the source GCP MySQL endpoint.
     * These settings are much the same as the settings for any MySQL-compatible endpoint. For more
     * information, see [Extra connection attributes when using MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun gcpMySqlSettings(gcpMySqlSettings: CfnEndpoint.GcpMySQLSettingsProperty)

    /**
     * @param gcpMySqlSettings Settings in JSON format for the source GCP MySQL endpoint.
     * These settings are much the same as the settings for any MySQL-compatible endpoint. For more
     * information, see [Extra connection attributes when using MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bdce1934e8428a7a416d977b65840565c78679136be2bf258bfb775a324b360")
    public
        fun gcpMySqlSettings(gcpMySqlSettings: CfnEndpoint.GcpMySQLSettingsProperty.Builder.() -> Unit)

    /**
     * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * Db2 LUW as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun ibmDb2Settings(ibmDb2Settings: IResolvable)

    /**
     * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * Db2 LUW as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun ibmDb2Settings(ibmDb2Settings: CfnEndpoint.IbmDb2SettingsProperty)

    /**
     * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * Db2 LUW as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3c2afd6f6a01d1e518a78f26262d64d2fff5e8132780de68029053549591e3f")
    public fun ibmDb2Settings(ibmDb2Settings: CfnEndpoint.IbmDb2SettingsProperty.Builder.() -> Unit)

    /**
     * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint.
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kafka
     * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun kafkaSettings(kafkaSettings: IResolvable)

    /**
     * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint.
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kafka
     * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun kafkaSettings(kafkaSettings: CfnEndpoint.KafkaSettingsProperty)

    /**
     * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint.
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kafka
     * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19de14fdc024801dae81ce79b34e110500659ebcdea259d5f561d17b98749489")
    public fun kafkaSettings(kafkaSettings: CfnEndpoint.KafkaSettingsProperty.Builder.() -> Unit)

    /**
     * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis
     * Data Streams.
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kinesis data
     * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun kinesisSettings(kinesisSettings: IResolvable)

    /**
     * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis
     * Data Streams.
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kinesis data
     * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun kinesisSettings(kinesisSettings: CfnEndpoint.KinesisSettingsProperty)

    /**
     * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis
     * Data Streams.
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kinesis data
     * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab15ec5613d2ed0ebd05453553f36dbf72f5cb328170d11cc63b31678b3677ce")
    public
        fun kinesisSettings(kinesisSettings: CfnEndpoint.KinesisSettingsProperty.Builder.() -> Unit)

    /**
     * @param kmsKeyId An AWS KMS key identifier that is used to encrypt the connection parameters
     * for the endpoint.
     * If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Region .
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
     * SQL Server endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * SQL Server as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SQLServer.html#CHAP_Source.SQLServer.ConnectionAttrib)
     * and [Extra connection attributes when using SQL Server as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SQLServer.html#CHAP_Target.SQLServer.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable)

    /**
     * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
     * SQL Server endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * SQL Server as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SQLServer.html#CHAP_Source.SQLServer.ConnectionAttrib)
     * and [Extra connection attributes when using SQL Server as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SQLServer.html#CHAP_Target.SQLServer.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: CfnEndpoint.MicrosoftSqlServerSettingsProperty)

    /**
     * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
     * SQL Server endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * SQL Server as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SQLServer.html#CHAP_Source.SQLServer.ConnectionAttrib)
     * and [Extra connection attributes when using SQL Server as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SQLServer.html#CHAP_Target.SQLServer.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e37f966ee74a291324c8893a322c0eb3ab8b5ef008d9ab14abc8731e7aab6eb4")
    public
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: CfnEndpoint.MicrosoftSqlServerSettingsProperty.Builder.() -> Unit)

    /**
     * @param mongoDbSettings Settings in JSON format for the source MongoDB endpoint.
     * For more information about the available settings, see [Using MongoDB as a target for AWS
     * Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html#CHAP_Source.MongoDB.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun mongoDbSettings(mongoDbSettings: IResolvable)

    /**
     * @param mongoDbSettings Settings in JSON format for the source MongoDB endpoint.
     * For more information about the available settings, see [Using MongoDB as a target for AWS
     * Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html#CHAP_Source.MongoDB.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun mongoDbSettings(mongoDbSettings: CfnEndpoint.MongoDbSettingsProperty)

    /**
     * @param mongoDbSettings Settings in JSON format for the source MongoDB endpoint.
     * For more information about the available settings, see [Using MongoDB as a target for AWS
     * Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html#CHAP_Source.MongoDB.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2720bff32948d06229f1bfba05e2c47f01d242d26a8048be87e8124a9f1002d")
    public
        fun mongoDbSettings(mongoDbSettings: CfnEndpoint.MongoDbSettingsProperty.Builder.() -> Unit)

    /**
     * @param mySqlSettings Settings in JSON format for the source and target MySQL endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * and [Extra connection attributes when using a MySQL-compatible database as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.MySQL.html#CHAP_Target.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun mySqlSettings(mySqlSettings: IResolvable)

    /**
     * @param mySqlSettings Settings in JSON format for the source and target MySQL endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * and [Extra connection attributes when using a MySQL-compatible database as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.MySQL.html#CHAP_Target.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun mySqlSettings(mySqlSettings: CfnEndpoint.MySqlSettingsProperty)

    /**
     * @param mySqlSettings Settings in JSON format for the source and target MySQL endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * and [Extra connection attributes when using a MySQL-compatible database as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.MySQL.html#CHAP_Target.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd3bee80a35b6f535001f0cf8b63fe9d9d8b631515fc9fc94327b837ad8e80da")
    public fun mySqlSettings(mySqlSettings: CfnEndpoint.MySqlSettingsProperty.Builder.() -> Unit)

    /**
     * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint.
     * For more information about the available settings, see [Specifying endpoint settings for
     * Amazon Neptune as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun neptuneSettings(neptuneSettings: IResolvable)

    /**
     * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint.
     * For more information about the available settings, see [Specifying endpoint settings for
     * Amazon Neptune as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun neptuneSettings(neptuneSettings: CfnEndpoint.NeptuneSettingsProperty)

    /**
     * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint.
     * For more information about the available settings, see [Specifying endpoint settings for
     * Amazon Neptune as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f36067e5ce85daa03ca61ac3778c7d894227b2e57d39fb9b4257656bcea43b0")
    public
        fun neptuneSettings(neptuneSettings: CfnEndpoint.NeptuneSettingsProperty.Builder.() -> Unit)

    /**
     * @param oracleSettings Settings in JSON format for the source and target Oracle endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * Oracle as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.ConnectionAttrib)
     * and [Extra connection attributes when using Oracle as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Oracle.html#CHAP_Target.Oracle.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun oracleSettings(oracleSettings: IResolvable)

    /**
     * @param oracleSettings Settings in JSON format for the source and target Oracle endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * Oracle as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.ConnectionAttrib)
     * and [Extra connection attributes when using Oracle as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Oracle.html#CHAP_Target.Oracle.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun oracleSettings(oracleSettings: CfnEndpoint.OracleSettingsProperty)

    /**
     * @param oracleSettings Settings in JSON format for the source and target Oracle endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * Oracle as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.ConnectionAttrib)
     * and [Extra connection attributes when using Oracle as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Oracle.html#CHAP_Target.Oracle.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("897a722a39657b5927f4be49354008a87a0b669feacf20ac1de53f733aaf61d9")
    public fun oracleSettings(oracleSettings: CfnEndpoint.OracleSettingsProperty.Builder.() -> Unit)

    /**
     * @param password The password to be used to log in to the endpoint database.
     */
    public fun password(password: String)

    /**
     * @param port The port used by the endpoint database.
     */
    public fun port(port: Number)

    /**
     * @param postgreSqlSettings Settings in JSON format for the source and target PostgreSQL
     * endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * PostgreSQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
     * and [Extra connection attributes when using PostgreSQL as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.PostgreSQL.html#CHAP_Target.PostgreSQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun postgreSqlSettings(postgreSqlSettings: IResolvable)

    /**
     * @param postgreSqlSettings Settings in JSON format for the source and target PostgreSQL
     * endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * PostgreSQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
     * and [Extra connection attributes when using PostgreSQL as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.PostgreSQL.html#CHAP_Target.PostgreSQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun postgreSqlSettings(postgreSqlSettings: CfnEndpoint.PostgreSqlSettingsProperty)

    /**
     * @param postgreSqlSettings Settings in JSON format for the source and target PostgreSQL
     * endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * PostgreSQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
     * and [Extra connection attributes when using PostgreSQL as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.PostgreSQL.html#CHAP_Target.PostgreSQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5700759c8208ccfb744002c2be9d6e2b3a5dae8cebb3f59a3be1ad3b02f4e438")
    public
        fun postgreSqlSettings(postgreSqlSettings: CfnEndpoint.PostgreSqlSettingsProperty.Builder.() -> Unit)

    /**
     * @param redisSettings Settings in JSON format for the target Redis endpoint.
     * For information about other available settings, see [Specifying endpoint settings for Redis
     * as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun redisSettings(redisSettings: IResolvable)

    /**
     * @param redisSettings Settings in JSON format for the target Redis endpoint.
     * For information about other available settings, see [Specifying endpoint settings for Redis
     * as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun redisSettings(redisSettings: CfnEndpoint.RedisSettingsProperty)

    /**
     * @param redisSettings Settings in JSON format for the target Redis endpoint.
     * For information about other available settings, see [Specifying endpoint settings for Redis
     * as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b357f517af628a373dacc821735c5ad45c2985aae7edb325d7f6a88625d12a64")
    public fun redisSettings(redisSettings: CfnEndpoint.RedisSettingsProperty.Builder.() -> Unit)

    /**
     * @param redshiftSettings Settings in JSON format for the Amazon Redshift endpoint.
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon Redshift as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redshift.html#CHAP_Target.Redshift.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun redshiftSettings(redshiftSettings: IResolvable)

    /**
     * @param redshiftSettings Settings in JSON format for the Amazon Redshift endpoint.
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon Redshift as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redshift.html#CHAP_Target.Redshift.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun redshiftSettings(redshiftSettings: CfnEndpoint.RedshiftSettingsProperty)

    /**
     * @param redshiftSettings Settings in JSON format for the Amazon Redshift endpoint.
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon Redshift as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redshift.html#CHAP_Target.Redshift.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bbb876b980065b8decc8028cc4cfc3dddc084c1d570bd68ce14f00a2688ac5d")
    public
        fun redshiftSettings(redshiftSettings: CfnEndpoint.RedshiftSettingsProperty.Builder.() -> Unit)

    /**
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     * `EndpointArn` response parameter that is returned in the created `Endpoint` object.
     * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
     * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter, such as `Example-App-ARN1` .
     *
     * For example, this value might result in the `EndpointArn` value
     * `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If you don't specify a
     * `ResourceIdentifier` value, AWS DMS generates a default identifier value for the end of
     * `EndpointArn` .
     */
    public fun resourceIdentifier(resourceIdentifier: String)

    /**
     * @param s3Settings Settings in JSON format for the source and target Amazon S3 endpoint.
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon S3 as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.S3.html#CHAP_Source.S3.Configuring)
     * and [Extra connection attributes when using Amazon S3 as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun s3Settings(s3Settings: IResolvable)

    /**
     * @param s3Settings Settings in JSON format for the source and target Amazon S3 endpoint.
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon S3 as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.S3.html#CHAP_Source.S3.Configuring)
     * and [Extra connection attributes when using Amazon S3 as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun s3Settings(s3Settings: CfnEndpoint.S3SettingsProperty)

    /**
     * @param s3Settings Settings in JSON format for the source and target Amazon S3 endpoint.
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon S3 as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.S3.html#CHAP_Source.S3.Configuring)
     * and [Extra connection attributes when using Amazon S3 as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2d4e683353cefc8a680a2b529c1ca634f1d3805ad2057229979a7aa25b8d5e6")
    public fun s3Settings(s3Settings: CfnEndpoint.S3SettingsProperty.Builder.() -> Unit)

    /**
     * @param serverName The name of the server where the endpoint database resides.
     */
    public fun serverName(serverName: String)

    /**
     * @param sslMode The Secure Sockets Layer (SSL) mode to use for the SSL connection. The default
     * is `none` .
     *
     * When `engine_name` is set to S3, the only allowed value is `none` .
     */
    public fun sslMode(sslMode: String)

    /**
     * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * SAP ASE as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SAP.html#CHAP_Source.SAP.ConnectionAttrib)
     * and [Extra connection attributes when using SAP ASE as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SAP.html#CHAP_Target.SAP.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun sybaseSettings(sybaseSettings: IResolvable)

    /**
     * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * SAP ASE as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SAP.html#CHAP_Source.SAP.ConnectionAttrib)
     * and [Extra connection attributes when using SAP ASE as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SAP.html#CHAP_Target.SAP.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun sybaseSettings(sybaseSettings: CfnEndpoint.SybaseSettingsProperty)

    /**
     * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * SAP ASE as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SAP.html#CHAP_Source.SAP.ConnectionAttrib)
     * and [Extra connection attributes when using SAP ASE as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SAP.html#CHAP_Target.SAP.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bbce14b71fda4deb60dfac3d4695c0afaa6433dcff931c653e22605de1ed014")
    public fun sybaseSettings(sybaseSettings: CfnEndpoint.SybaseSettingsProperty.Builder.() -> Unit)

    /**
     * @param tags One or more tags to be assigned to the endpoint.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags One or more tags to be assigned to the endpoint.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param username The user name to be used to log in to the endpoint database.
     */
    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnEndpointProps.Builder =
        software.amazon.awscdk.services.dms.CfnEndpointProps.builder()

    /**
     * @param certificateArn The Amazon Resource Name (ARN) for the certificate.
     */
    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * @param databaseName The name of the endpoint database.
     * For a MySQL source or target endpoint, don't specify `DatabaseName` . To migrate to a
     * specific database, use this setting and `targetDbType` .
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint.
     * For more information about other available settings, see [Using extra connections attributes
     * with Amazon DocumentDB as a
     * source](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DocumentDB.html#CHAP_Source.DocumentDB.ECAs)
     * and [Using Amazon DocumentDB as a target for AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DocumentDB.html) in the
     * *AWS Database Migration Service User Guide* .
     */
    override fun docDbSettings(docDbSettings: IResolvable) {
      cdkBuilder.docDbSettings(docDbSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint.
     * For more information about other available settings, see [Using extra connections attributes
     * with Amazon DocumentDB as a
     * source](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DocumentDB.html#CHAP_Source.DocumentDB.ECAs)
     * and [Using Amazon DocumentDB as a target for AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DocumentDB.html) in the
     * *AWS Database Migration Service User Guide* .
     */
    override fun docDbSettings(docDbSettings: CfnEndpoint.DocDbSettingsProperty) {
      cdkBuilder.docDbSettings(docDbSettings.let(CfnEndpoint.DocDbSettingsProperty.Companion::unwrap))
    }

    /**
     * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint.
     * For more information about other available settings, see [Using extra connections attributes
     * with Amazon DocumentDB as a
     * source](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DocumentDB.html#CHAP_Source.DocumentDB.ECAs)
     * and [Using Amazon DocumentDB as a target for AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DocumentDB.html) in the
     * *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e77dacf15846105a73a00a59a19dff9bcd68da1cfe8b460dd2022428600b8212")
    override fun docDbSettings(docDbSettings: CfnEndpoint.DocDbSettingsProperty.Builder.() -> Unit):
        Unit = docDbSettings(CfnEndpoint.DocDbSettingsProperty(docDbSettings))

    /**
     * @param dynamoDbSettings Settings in JSON format for the target Amazon DynamoDB endpoint.
     * For information about other available settings, see [Using object mapping to migrate data to
     * DynamoDB](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html#CHAP_Target.DynamoDB.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun dynamoDbSettings(dynamoDbSettings: IResolvable) {
      cdkBuilder.dynamoDbSettings(dynamoDbSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dynamoDbSettings Settings in JSON format for the target Amazon DynamoDB endpoint.
     * For information about other available settings, see [Using object mapping to migrate data to
     * DynamoDB](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html#CHAP_Target.DynamoDB.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun dynamoDbSettings(dynamoDbSettings: CfnEndpoint.DynamoDbSettingsProperty) {
      cdkBuilder.dynamoDbSettings(dynamoDbSettings.let(CfnEndpoint.DynamoDbSettingsProperty.Companion::unwrap))
    }

    /**
     * @param dynamoDbSettings Settings in JSON format for the target Amazon DynamoDB endpoint.
     * For information about other available settings, see [Using object mapping to migrate data to
     * DynamoDB](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html#CHAP_Target.DynamoDB.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0822ed908d3ab7bf45e9e99cf0606803f960d62cdba5c87bafdfb44f62076cb5")
    override
        fun dynamoDbSettings(dynamoDbSettings: CfnEndpoint.DynamoDbSettingsProperty.Builder.() -> Unit):
        Unit = dynamoDbSettings(CfnEndpoint.DynamoDbSettingsProperty(dynamoDbSettings))

    /**
     * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint.
     * For more information about the available settings, see [Extra connection attributes when
     * using OpenSearch as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun elasticsearchSettings(elasticsearchSettings: IResolvable) {
      cdkBuilder.elasticsearchSettings(elasticsearchSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint.
     * For more information about the available settings, see [Extra connection attributes when
     * using OpenSearch as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     */
    override
        fun elasticsearchSettings(elasticsearchSettings: CfnEndpoint.ElasticsearchSettingsProperty) {
      cdkBuilder.elasticsearchSettings(elasticsearchSettings.let(CfnEndpoint.ElasticsearchSettingsProperty.Companion::unwrap))
    }

    /**
     * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint.
     * For more information about the available settings, see [Extra connection attributes when
     * using OpenSearch as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c4fc6dc7ca128b49197485a4fb1b96d66305964a873ea584c354f58e4eb0fd8")
    override
        fun elasticsearchSettings(elasticsearchSettings: CfnEndpoint.ElasticsearchSettingsProperty.Builder.() -> Unit):
        Unit =
        elasticsearchSettings(CfnEndpoint.ElasticsearchSettingsProperty(elasticsearchSettings))

    /**
     * @param endpointIdentifier The database endpoint identifier.
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */
    override fun endpointIdentifier(endpointIdentifier: String) {
      cdkBuilder.endpointIdentifier(endpointIdentifier)
    }

    /**
     * @param endpointType The type of endpoint. 
     * Valid values are `source` and `target` .
     */
    override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    /**
     * @param engineName The type of engine for the endpoint, depending on the `EndpointType` value.
     * 
     * *Valid values* : `mysql` | `oracle` | `postgres` | `mariadb` | `aurora` | `aurora-postgresql`
     * | `opensearch` | `redshift` | `redshift-serverless` | `s3` | `db2` | `azuredb` | `sybase` |
     * `dynamodb` | `mongodb` | `kinesis` | `kafka` | `elasticsearch` | `docdb` | `sqlserver` |
     * `neptune`
     */
    override fun engineName(engineName: String) {
      cdkBuilder.engineName(engineName)
    }

    /**
     * @param extraConnectionAttributes Additional attributes associated with the connection.
     * Each attribute is specified as a name-value pair associated by an equal sign (=). Multiple
     * attributes are separated by a semicolon (;) with no additional white space. For information on
     * the attributes available for connecting your source or target endpoint, see [Working with AWS
     * DMS Endpoints](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Endpoints.html) in the *AWS
     * Database Migration Service User Guide* .
     */
    override fun extraConnectionAttributes(extraConnectionAttributes: String) {
      cdkBuilder.extraConnectionAttributes(extraConnectionAttributes)
    }

    /**
     * @param gcpMySqlSettings Settings in JSON format for the source GCP MySQL endpoint.
     * These settings are much the same as the settings for any MySQL-compatible endpoint. For more
     * information, see [Extra connection attributes when using MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun gcpMySqlSettings(gcpMySqlSettings: IResolvable) {
      cdkBuilder.gcpMySqlSettings(gcpMySqlSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param gcpMySqlSettings Settings in JSON format for the source GCP MySQL endpoint.
     * These settings are much the same as the settings for any MySQL-compatible endpoint. For more
     * information, see [Extra connection attributes when using MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun gcpMySqlSettings(gcpMySqlSettings: CfnEndpoint.GcpMySQLSettingsProperty) {
      cdkBuilder.gcpMySqlSettings(gcpMySqlSettings.let(CfnEndpoint.GcpMySQLSettingsProperty.Companion::unwrap))
    }

    /**
     * @param gcpMySqlSettings Settings in JSON format for the source GCP MySQL endpoint.
     * These settings are much the same as the settings for any MySQL-compatible endpoint. For more
     * information, see [Extra connection attributes when using MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bdce1934e8428a7a416d977b65840565c78679136be2bf258bfb775a324b360")
    override
        fun gcpMySqlSettings(gcpMySqlSettings: CfnEndpoint.GcpMySQLSettingsProperty.Builder.() -> Unit):
        Unit = gcpMySqlSettings(CfnEndpoint.GcpMySQLSettingsProperty(gcpMySqlSettings))

    /**
     * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * Db2 LUW as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun ibmDb2Settings(ibmDb2Settings: IResolvable) {
      cdkBuilder.ibmDb2Settings(ibmDb2Settings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * Db2 LUW as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun ibmDb2Settings(ibmDb2Settings: CfnEndpoint.IbmDb2SettingsProperty) {
      cdkBuilder.ibmDb2Settings(ibmDb2Settings.let(CfnEndpoint.IbmDb2SettingsProperty.Companion::unwrap))
    }

    /**
     * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * Db2 LUW as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3c2afd6f6a01d1e518a78f26262d64d2fff5e8132780de68029053549591e3f")
    override
        fun ibmDb2Settings(ibmDb2Settings: CfnEndpoint.IbmDb2SettingsProperty.Builder.() -> Unit):
        Unit = ibmDb2Settings(CfnEndpoint.IbmDb2SettingsProperty(ibmDb2Settings))

    /**
     * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint.
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kafka
     * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun kafkaSettings(kafkaSettings: IResolvable) {
      cdkBuilder.kafkaSettings(kafkaSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint.
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kafka
     * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun kafkaSettings(kafkaSettings: CfnEndpoint.KafkaSettingsProperty) {
      cdkBuilder.kafkaSettings(kafkaSettings.let(CfnEndpoint.KafkaSettingsProperty.Companion::unwrap))
    }

    /**
     * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint.
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kafka
     * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19de14fdc024801dae81ce79b34e110500659ebcdea259d5f561d17b98749489")
    override fun kafkaSettings(kafkaSettings: CfnEndpoint.KafkaSettingsProperty.Builder.() -> Unit):
        Unit = kafkaSettings(CfnEndpoint.KafkaSettingsProperty(kafkaSettings))

    /**
     * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis
     * Data Streams.
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kinesis data
     * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun kinesisSettings(kinesisSettings: IResolvable) {
      cdkBuilder.kinesisSettings(kinesisSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis
     * Data Streams.
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kinesis data
     * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun kinesisSettings(kinesisSettings: CfnEndpoint.KinesisSettingsProperty) {
      cdkBuilder.kinesisSettings(kinesisSettings.let(CfnEndpoint.KinesisSettingsProperty.Companion::unwrap))
    }

    /**
     * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis
     * Data Streams.
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kinesis data
     * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab15ec5613d2ed0ebd05453553f36dbf72f5cb328170d11cc63b31678b3677ce")
    override
        fun kinesisSettings(kinesisSettings: CfnEndpoint.KinesisSettingsProperty.Builder.() -> Unit):
        Unit = kinesisSettings(CfnEndpoint.KinesisSettingsProperty(kinesisSettings))

    /**
     * @param kmsKeyId An AWS KMS key identifier that is used to encrypt the connection parameters
     * for the endpoint.
     * If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Region .
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
     * SQL Server endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * SQL Server as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SQLServer.html#CHAP_Source.SQLServer.ConnectionAttrib)
     * and [Extra connection attributes when using SQL Server as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SQLServer.html#CHAP_Target.SQLServer.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable) {
      cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
     * SQL Server endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * SQL Server as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SQLServer.html#CHAP_Source.SQLServer.ConnectionAttrib)
     * and [Extra connection attributes when using SQL Server as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SQLServer.html#CHAP_Target.SQLServer.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: CfnEndpoint.MicrosoftSqlServerSettingsProperty) {
      cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings.let(CfnEndpoint.MicrosoftSqlServerSettingsProperty.Companion::unwrap))
    }

    /**
     * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
     * SQL Server endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * SQL Server as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SQLServer.html#CHAP_Source.SQLServer.ConnectionAttrib)
     * and [Extra connection attributes when using SQL Server as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SQLServer.html#CHAP_Target.SQLServer.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e37f966ee74a291324c8893a322c0eb3ab8b5ef008d9ab14abc8731e7aab6eb4")
    override
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: CfnEndpoint.MicrosoftSqlServerSettingsProperty.Builder.() -> Unit):
        Unit =
        microsoftSqlServerSettings(CfnEndpoint.MicrosoftSqlServerSettingsProperty(microsoftSqlServerSettings))

    /**
     * @param mongoDbSettings Settings in JSON format for the source MongoDB endpoint.
     * For more information about the available settings, see [Using MongoDB as a target for AWS
     * Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html#CHAP_Source.MongoDB.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun mongoDbSettings(mongoDbSettings: IResolvable) {
      cdkBuilder.mongoDbSettings(mongoDbSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mongoDbSettings Settings in JSON format for the source MongoDB endpoint.
     * For more information about the available settings, see [Using MongoDB as a target for AWS
     * Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html#CHAP_Source.MongoDB.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun mongoDbSettings(mongoDbSettings: CfnEndpoint.MongoDbSettingsProperty) {
      cdkBuilder.mongoDbSettings(mongoDbSettings.let(CfnEndpoint.MongoDbSettingsProperty.Companion::unwrap))
    }

    /**
     * @param mongoDbSettings Settings in JSON format for the source MongoDB endpoint.
     * For more information about the available settings, see [Using MongoDB as a target for AWS
     * Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html#CHAP_Source.MongoDB.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2720bff32948d06229f1bfba05e2c47f01d242d26a8048be87e8124a9f1002d")
    override
        fun mongoDbSettings(mongoDbSettings: CfnEndpoint.MongoDbSettingsProperty.Builder.() -> Unit):
        Unit = mongoDbSettings(CfnEndpoint.MongoDbSettingsProperty(mongoDbSettings))

    /**
     * @param mySqlSettings Settings in JSON format for the source and target MySQL endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * and [Extra connection attributes when using a MySQL-compatible database as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.MySQL.html#CHAP_Target.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun mySqlSettings(mySqlSettings: IResolvable) {
      cdkBuilder.mySqlSettings(mySqlSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mySqlSettings Settings in JSON format for the source and target MySQL endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * and [Extra connection attributes when using a MySQL-compatible database as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.MySQL.html#CHAP_Target.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun mySqlSettings(mySqlSettings: CfnEndpoint.MySqlSettingsProperty) {
      cdkBuilder.mySqlSettings(mySqlSettings.let(CfnEndpoint.MySqlSettingsProperty.Companion::unwrap))
    }

    /**
     * @param mySqlSettings Settings in JSON format for the source and target MySQL endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * and [Extra connection attributes when using a MySQL-compatible database as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.MySQL.html#CHAP_Target.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd3bee80a35b6f535001f0cf8b63fe9d9d8b631515fc9fc94327b837ad8e80da")
    override fun mySqlSettings(mySqlSettings: CfnEndpoint.MySqlSettingsProperty.Builder.() -> Unit):
        Unit = mySqlSettings(CfnEndpoint.MySqlSettingsProperty(mySqlSettings))

    /**
     * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint.
     * For more information about the available settings, see [Specifying endpoint settings for
     * Amazon Neptune as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun neptuneSettings(neptuneSettings: IResolvable) {
      cdkBuilder.neptuneSettings(neptuneSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint.
     * For more information about the available settings, see [Specifying endpoint settings for
     * Amazon Neptune as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun neptuneSettings(neptuneSettings: CfnEndpoint.NeptuneSettingsProperty) {
      cdkBuilder.neptuneSettings(neptuneSettings.let(CfnEndpoint.NeptuneSettingsProperty.Companion::unwrap))
    }

    /**
     * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint.
     * For more information about the available settings, see [Specifying endpoint settings for
     * Amazon Neptune as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f36067e5ce85daa03ca61ac3778c7d894227b2e57d39fb9b4257656bcea43b0")
    override
        fun neptuneSettings(neptuneSettings: CfnEndpoint.NeptuneSettingsProperty.Builder.() -> Unit):
        Unit = neptuneSettings(CfnEndpoint.NeptuneSettingsProperty(neptuneSettings))

    /**
     * @param oracleSettings Settings in JSON format for the source and target Oracle endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * Oracle as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.ConnectionAttrib)
     * and [Extra connection attributes when using Oracle as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Oracle.html#CHAP_Target.Oracle.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun oracleSettings(oracleSettings: IResolvable) {
      cdkBuilder.oracleSettings(oracleSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param oracleSettings Settings in JSON format for the source and target Oracle endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * Oracle as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.ConnectionAttrib)
     * and [Extra connection attributes when using Oracle as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Oracle.html#CHAP_Target.Oracle.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun oracleSettings(oracleSettings: CfnEndpoint.OracleSettingsProperty) {
      cdkBuilder.oracleSettings(oracleSettings.let(CfnEndpoint.OracleSettingsProperty.Companion::unwrap))
    }

    /**
     * @param oracleSettings Settings in JSON format for the source and target Oracle endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * Oracle as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.ConnectionAttrib)
     * and [Extra connection attributes when using Oracle as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Oracle.html#CHAP_Target.Oracle.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("897a722a39657b5927f4be49354008a87a0b669feacf20ac1de53f733aaf61d9")
    override
        fun oracleSettings(oracleSettings: CfnEndpoint.OracleSettingsProperty.Builder.() -> Unit):
        Unit = oracleSettings(CfnEndpoint.OracleSettingsProperty(oracleSettings))

    /**
     * @param password The password to be used to log in to the endpoint database.
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * @param port The port used by the endpoint database.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param postgreSqlSettings Settings in JSON format for the source and target PostgreSQL
     * endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * PostgreSQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
     * and [Extra connection attributes when using PostgreSQL as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.PostgreSQL.html#CHAP_Target.PostgreSQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun postgreSqlSettings(postgreSqlSettings: IResolvable) {
      cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param postgreSqlSettings Settings in JSON format for the source and target PostgreSQL
     * endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * PostgreSQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
     * and [Extra connection attributes when using PostgreSQL as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.PostgreSQL.html#CHAP_Target.PostgreSQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun postgreSqlSettings(postgreSqlSettings: CfnEndpoint.PostgreSqlSettingsProperty) {
      cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(CfnEndpoint.PostgreSqlSettingsProperty.Companion::unwrap))
    }

    /**
     * @param postgreSqlSettings Settings in JSON format for the source and target PostgreSQL
     * endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * PostgreSQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
     * and [Extra connection attributes when using PostgreSQL as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.PostgreSQL.html#CHAP_Target.PostgreSQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5700759c8208ccfb744002c2be9d6e2b3a5dae8cebb3f59a3be1ad3b02f4e438")
    override
        fun postgreSqlSettings(postgreSqlSettings: CfnEndpoint.PostgreSqlSettingsProperty.Builder.() -> Unit):
        Unit = postgreSqlSettings(CfnEndpoint.PostgreSqlSettingsProperty(postgreSqlSettings))

    /**
     * @param redisSettings Settings in JSON format for the target Redis endpoint.
     * For information about other available settings, see [Specifying endpoint settings for Redis
     * as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun redisSettings(redisSettings: IResolvable) {
      cdkBuilder.redisSettings(redisSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param redisSettings Settings in JSON format for the target Redis endpoint.
     * For information about other available settings, see [Specifying endpoint settings for Redis
     * as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun redisSettings(redisSettings: CfnEndpoint.RedisSettingsProperty) {
      cdkBuilder.redisSettings(redisSettings.let(CfnEndpoint.RedisSettingsProperty.Companion::unwrap))
    }

    /**
     * @param redisSettings Settings in JSON format for the target Redis endpoint.
     * For information about other available settings, see [Specifying endpoint settings for Redis
     * as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b357f517af628a373dacc821735c5ad45c2985aae7edb325d7f6a88625d12a64")
    override fun redisSettings(redisSettings: CfnEndpoint.RedisSettingsProperty.Builder.() -> Unit):
        Unit = redisSettings(CfnEndpoint.RedisSettingsProperty(redisSettings))

    /**
     * @param redshiftSettings Settings in JSON format for the Amazon Redshift endpoint.
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon Redshift as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redshift.html#CHAP_Target.Redshift.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun redshiftSettings(redshiftSettings: IResolvable) {
      cdkBuilder.redshiftSettings(redshiftSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param redshiftSettings Settings in JSON format for the Amazon Redshift endpoint.
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon Redshift as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redshift.html#CHAP_Target.Redshift.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun redshiftSettings(redshiftSettings: CfnEndpoint.RedshiftSettingsProperty) {
      cdkBuilder.redshiftSettings(redshiftSettings.let(CfnEndpoint.RedshiftSettingsProperty.Companion::unwrap))
    }

    /**
     * @param redshiftSettings Settings in JSON format for the Amazon Redshift endpoint.
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon Redshift as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redshift.html#CHAP_Target.Redshift.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bbb876b980065b8decc8028cc4cfc3dddc084c1d570bd68ce14f00a2688ac5d")
    override
        fun redshiftSettings(redshiftSettings: CfnEndpoint.RedshiftSettingsProperty.Builder.() -> Unit):
        Unit = redshiftSettings(CfnEndpoint.RedshiftSettingsProperty(redshiftSettings))

    /**
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     * `EndpointArn` response parameter that is returned in the created `Endpoint` object.
     * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
     * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter, such as `Example-App-ARN1` .
     *
     * For example, this value might result in the `EndpointArn` value
     * `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If you don't specify a
     * `ResourceIdentifier` value, AWS DMS generates a default identifier value for the end of
     * `EndpointArn` .
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * @param s3Settings Settings in JSON format for the source and target Amazon S3 endpoint.
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon S3 as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.S3.html#CHAP_Source.S3.Configuring)
     * and [Extra connection attributes when using Amazon S3 as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun s3Settings(s3Settings: IResolvable) {
      cdkBuilder.s3Settings(s3Settings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param s3Settings Settings in JSON format for the source and target Amazon S3 endpoint.
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon S3 as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.S3.html#CHAP_Source.S3.Configuring)
     * and [Extra connection attributes when using Amazon S3 as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun s3Settings(s3Settings: CfnEndpoint.S3SettingsProperty) {
      cdkBuilder.s3Settings(s3Settings.let(CfnEndpoint.S3SettingsProperty.Companion::unwrap))
    }

    /**
     * @param s3Settings Settings in JSON format for the source and target Amazon S3 endpoint.
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon S3 as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.S3.html#CHAP_Source.S3.Configuring)
     * and [Extra connection attributes when using Amazon S3 as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2d4e683353cefc8a680a2b529c1ca634f1d3805ad2057229979a7aa25b8d5e6")
    override fun s3Settings(s3Settings: CfnEndpoint.S3SettingsProperty.Builder.() -> Unit): Unit =
        s3Settings(CfnEndpoint.S3SettingsProperty(s3Settings))

    /**
     * @param serverName The name of the server where the endpoint database resides.
     */
    override fun serverName(serverName: String) {
      cdkBuilder.serverName(serverName)
    }

    /**
     * @param sslMode The Secure Sockets Layer (SSL) mode to use for the SSL connection. The default
     * is `none` .
     *
     * When `engine_name` is set to S3, the only allowed value is `none` .
     */
    override fun sslMode(sslMode: String) {
      cdkBuilder.sslMode(sslMode)
    }

    /**
     * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * SAP ASE as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SAP.html#CHAP_Source.SAP.ConnectionAttrib)
     * and [Extra connection attributes when using SAP ASE as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SAP.html#CHAP_Target.SAP.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun sybaseSettings(sybaseSettings: IResolvable) {
      cdkBuilder.sybaseSettings(sybaseSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * SAP ASE as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SAP.html#CHAP_Source.SAP.ConnectionAttrib)
     * and [Extra connection attributes when using SAP ASE as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SAP.html#CHAP_Target.SAP.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    override fun sybaseSettings(sybaseSettings: CfnEndpoint.SybaseSettingsProperty) {
      cdkBuilder.sybaseSettings(sybaseSettings.let(CfnEndpoint.SybaseSettingsProperty.Companion::unwrap))
    }

    /**
     * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint.
     * For information about other available settings, see [Extra connection attributes when using
     * SAP ASE as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SAP.html#CHAP_Source.SAP.ConnectionAttrib)
     * and [Extra connection attributes when using SAP ASE as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SAP.html#CHAP_Target.SAP.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bbce14b71fda4deb60dfac3d4695c0afaa6433dcff931c653e22605de1ed014")
    override
        fun sybaseSettings(sybaseSettings: CfnEndpoint.SybaseSettingsProperty.Builder.() -> Unit):
        Unit = sybaseSettings(CfnEndpoint.SybaseSettingsProperty(sybaseSettings))

    /**
     * @param tags One or more tags to be assigned to the endpoint.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags One or more tags to be assigned to the endpoint.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param username The user name to be used to log in to the endpoint database.
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnEndpointProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dms.CfnEndpointProps,
  ) : CdkObject(cdkObject), CfnEndpointProps {
    /**
     * The Amazon Resource Name (ARN) for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-certificatearn)
     */
    override fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * The name of the endpoint database.
     *
     * For a MySQL source or target endpoint, don't specify `DatabaseName` . To migrate to a
     * specific database, use this setting and `targetDbType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-databasename)
     */
    override fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * Settings in JSON format for the source and target DocumentDB endpoint.
     *
     * For more information about other available settings, see [Using extra connections attributes
     * with Amazon DocumentDB as a
     * source](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DocumentDB.html#CHAP_Source.DocumentDB.ECAs)
     * and [Using Amazon DocumentDB as a target for AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DocumentDB.html) in the
     * *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-docdbsettings)
     */
    override fun docDbSettings(): Any? = unwrap(this).getDocDbSettings()

    /**
     * Settings in JSON format for the target Amazon DynamoDB endpoint.
     *
     * For information about other available settings, see [Using object mapping to migrate data to
     * DynamoDB](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html#CHAP_Target.DynamoDB.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-dynamodbsettings)
     */
    override fun dynamoDbSettings(): Any? = unwrap(this).getDynamoDbSettings()

    /**
     * Settings in JSON format for the target OpenSearch endpoint.
     *
     * For more information about the available settings, see [Extra connection attributes when
     * using OpenSearch as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-elasticsearchsettings)
     */
    override fun elasticsearchSettings(): Any? = unwrap(this).getElasticsearchSettings()

    /**
     * The database endpoint identifier.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointidentifier)
     */
    override fun endpointIdentifier(): String? = unwrap(this).getEndpointIdentifier()

    /**
     * The type of endpoint.
     *
     * Valid values are `source` and `target` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointtype)
     */
    override fun endpointType(): String = unwrap(this).getEndpointType()

    /**
     * The type of engine for the endpoint, depending on the `EndpointType` value.
     *
     * *Valid values* : `mysql` | `oracle` | `postgres` | `mariadb` | `aurora` | `aurora-postgresql`
     * | `opensearch` | `redshift` | `redshift-serverless` | `s3` | `db2` | `azuredb` | `sybase` |
     * `dynamodb` | `mongodb` | `kinesis` | `kafka` | `elasticsearch` | `docdb` | `sqlserver` |
     * `neptune`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-enginename)
     */
    override fun engineName(): String = unwrap(this).getEngineName()

    /**
     * Additional attributes associated with the connection.
     *
     * Each attribute is specified as a name-value pair associated by an equal sign (=). Multiple
     * attributes are separated by a semicolon (;) with no additional white space. For information on
     * the attributes available for connecting your source or target endpoint, see [Working with AWS
     * DMS Endpoints](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Endpoints.html) in the *AWS
     * Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-extraconnectionattributes)
     */
    override fun extraConnectionAttributes(): String? = unwrap(this).getExtraConnectionAttributes()

    /**
     * Settings in JSON format for the source GCP MySQL endpoint.
     *
     * These settings are much the same as the settings for any MySQL-compatible endpoint. For more
     * information, see [Extra connection attributes when using MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-gcpmysqlsettings)
     */
    override fun gcpMySqlSettings(): Any? = unwrap(this).getGcpMySqlSettings()

    /**
     * Settings in JSON format for the source IBM Db2 LUW endpoint.
     *
     * For information about other available settings, see [Extra connection attributes when using
     * Db2 LUW as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-ibmdb2settings)
     */
    override fun ibmDb2Settings(): Any? = unwrap(this).getIbmDb2Settings()

    /**
     * Settings in JSON format for the target Apache Kafka endpoint.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kafka
     * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kafkasettings)
     */
    override fun kafkaSettings(): Any? = unwrap(this).getKafkaSettings()

    /**
     * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kinesis data
     * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kinesissettings)
     */
    override fun kinesisSettings(): Any? = unwrap(this).getKinesisSettings()

    /**
     * An AWS KMS key identifier that is used to encrypt the connection parameters for the endpoint.
     *
     * If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Settings in JSON format for the source and target Microsoft SQL Server endpoint.
     *
     * For information about other available settings, see [Extra connection attributes when using
     * SQL Server as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SQLServer.html#CHAP_Source.SQLServer.ConnectionAttrib)
     * and [Extra connection attributes when using SQL Server as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SQLServer.html#CHAP_Target.SQLServer.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-microsoftsqlserversettings)
     */
    override fun microsoftSqlServerSettings(): Any? = unwrap(this).getMicrosoftSqlServerSettings()

    /**
     * Settings in JSON format for the source MongoDB endpoint.
     *
     * For more information about the available settings, see [Using MongoDB as a target for AWS
     * Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html#CHAP_Source.MongoDB.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-mongodbsettings)
     */
    override fun mongoDbSettings(): Any? = unwrap(this).getMongoDbSettings()

    /**
     * Settings in JSON format for the source and target MySQL endpoint.
     *
     * For information about other available settings, see [Extra connection attributes when using
     * MySQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
     * and [Extra connection attributes when using a MySQL-compatible database as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.MySQL.html#CHAP_Target.MySQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-mysqlsettings)
     */
    override fun mySqlSettings(): Any? = unwrap(this).getMySqlSettings()

    /**
     * Settings in JSON format for the target Amazon Neptune endpoint.
     *
     * For more information about the available settings, see [Specifying endpoint settings for
     * Amazon Neptune as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-neptunesettings)
     */
    override fun neptuneSettings(): Any? = unwrap(this).getNeptuneSettings()

    /**
     * Settings in JSON format for the source and target Oracle endpoint.
     *
     * For information about other available settings, see [Extra connection attributes when using
     * Oracle as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.ConnectionAttrib)
     * and [Extra connection attributes when using Oracle as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Oracle.html#CHAP_Target.Oracle.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-oraclesettings)
     */
    override fun oracleSettings(): Any? = unwrap(this).getOracleSettings()

    /**
     * The password to be used to log in to the endpoint database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-password)
     */
    override fun password(): String? = unwrap(this).getPassword()

    /**
     * The port used by the endpoint database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-port)
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * Settings in JSON format for the source and target PostgreSQL endpoint.
     *
     * For information about other available settings, see [Extra connection attributes when using
     * PostgreSQL as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
     * and [Extra connection attributes when using PostgreSQL as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.PostgreSQL.html#CHAP_Target.PostgreSQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-postgresqlsettings)
     */
    override fun postgreSqlSettings(): Any? = unwrap(this).getPostgreSqlSettings()

    /**
     * Settings in JSON format for the target Redis endpoint.
     *
     * For information about other available settings, see [Specifying endpoint settings for Redis
     * as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redissettings)
     */
    override fun redisSettings(): Any? = unwrap(this).getRedisSettings()

    /**
     * Settings in JSON format for the Amazon Redshift endpoint.
     *
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon Redshift as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redshift.html#CHAP_Target.Redshift.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redshiftsettings)
     */
    override fun redshiftSettings(): Any? = unwrap(this).getRedshiftSettings()

    /**
     * A display name for the resource identifier at the end of the `EndpointArn` response parameter
     * that is returned in the created `Endpoint` object.
     *
     * The value for this parameter can have up to 31 characters. It can contain only ASCII letters,
     * digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter, such as `Example-App-ARN1` .
     *
     * For example, this value might result in the `EndpointArn` value
     * `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If you don't specify a
     * `ResourceIdentifier` value, AWS DMS generates a default identifier value for the end of
     * `EndpointArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-resourceidentifier)
     */
    override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    /**
     * Settings in JSON format for the source and target Amazon S3 endpoint.
     *
     * For more information about other available settings, see [Extra connection attributes when
     * using Amazon S3 as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.S3.html#CHAP_Source.S3.Configuring)
     * and [Extra connection attributes when using Amazon S3 as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-s3settings)
     */
    override fun s3Settings(): Any? = unwrap(this).getS3Settings()

    /**
     * The name of the server where the endpoint database resides.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-servername)
     */
    override fun serverName(): String? = unwrap(this).getServerName()

    /**
     * The Secure Sockets Layer (SSL) mode to use for the SSL connection. The default is `none` .
     *
     *
     * When `engine_name` is set to S3, the only allowed value is `none` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-sslmode)
     */
    override fun sslMode(): String? = unwrap(this).getSslMode()

    /**
     * Settings in JSON format for the source and target SAP ASE endpoint.
     *
     * For information about other available settings, see [Extra connection attributes when using
     * SAP ASE as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SAP.html#CHAP_Source.SAP.ConnectionAttrib)
     * and [Extra connection attributes when using SAP ASE as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SAP.html#CHAP_Target.SAP.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-sybasesettings)
     */
    override fun sybaseSettings(): Any? = unwrap(this).getSybaseSettings()

    /**
     * One or more tags to be assigned to the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The user name to be used to log in to the endpoint database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-username)
     */
    override fun username(): String? = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpointProps):
        CfnEndpointProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEndpointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointProps):
        software.amazon.awscdk.services.dms.CfnEndpointProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.dms.CfnEndpointProps
  }
}
