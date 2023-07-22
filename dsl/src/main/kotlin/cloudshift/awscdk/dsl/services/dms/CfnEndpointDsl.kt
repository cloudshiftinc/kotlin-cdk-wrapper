@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint
import software.constructs.Construct

/**
 * The `AWS::DMS::Endpoint` resource specifies an AWS DMS endpoint.
 *
 * Currently, AWS CloudFormation supports all AWS DMS endpoint types.
 *
 * Example:
 *
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
@CdkDslMarker
public class CfnEndpointDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEndpoint.Builder = CfnEndpoint.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Amazon Resource Name (ARN) for the certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-certificatearn)
   * @param certificateArn The Amazon Resource Name (ARN) for the certificate. 
   */
  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  /**
   * The name of the endpoint database.
   *
   * For a MySQL source or target endpoint, don't specify `DatabaseName` . To migrate to a specific
   * database, use this setting and `targetDbType` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-databasename)
   * @param databaseName The name of the endpoint database. 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

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
   * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint. 
   */
  public fun docDbSettings(docDbSettings: IResolvable) {
    cdkBuilder.docDbSettings(docDbSettings)
  }

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
   * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint. 
   */
  public fun docDbSettings(docDbSettings: CfnEndpoint.DocDbSettingsProperty) {
    cdkBuilder.docDbSettings(docDbSettings)
  }

  /**
   * Settings in JSON format for the target Amazon DynamoDB endpoint.
   *
   * For information about other available settings, see [Using object mapping to migrate data to
   * DynamoDB](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html#CHAP_Target.DynamoDB.ObjectMapping)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-dynamodbsettings)
   * @param dynamoDbSettings Settings in JSON format for the target Amazon DynamoDB endpoint. 
   */
  public fun dynamoDbSettings(dynamoDbSettings: IResolvable) {
    cdkBuilder.dynamoDbSettings(dynamoDbSettings)
  }

  /**
   * Settings in JSON format for the target Amazon DynamoDB endpoint.
   *
   * For information about other available settings, see [Using object mapping to migrate data to
   * DynamoDB](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html#CHAP_Target.DynamoDB.ObjectMapping)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-dynamodbsettings)
   * @param dynamoDbSettings Settings in JSON format for the target Amazon DynamoDB endpoint. 
   */
  public fun dynamoDbSettings(dynamoDbSettings: CfnEndpoint.DynamoDbSettingsProperty) {
    cdkBuilder.dynamoDbSettings(dynamoDbSettings)
  }

  /**
   * Settings in JSON format for the target OpenSearch endpoint.
   *
   * For more information about the available settings, see [Extra connection attributes when using
   * OpenSearch as a target for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-elasticsearchsettings)
   * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint. 
   */
  public fun elasticsearchSettings(elasticsearchSettings: IResolvable) {
    cdkBuilder.elasticsearchSettings(elasticsearchSettings)
  }

  /**
   * Settings in JSON format for the target OpenSearch endpoint.
   *
   * For more information about the available settings, see [Extra connection attributes when using
   * OpenSearch as a target for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-elasticsearchsettings)
   * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint. 
   */
  public
      fun elasticsearchSettings(elasticsearchSettings: CfnEndpoint.ElasticsearchSettingsProperty) {
    cdkBuilder.elasticsearchSettings(elasticsearchSettings)
  }

  /**
   * The database endpoint identifier.
   *
   * Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens.
   * They can't end with a hyphen, or contain two consecutive hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointidentifier)
   * @param endpointIdentifier The database endpoint identifier. 
   */
  public fun endpointIdentifier(endpointIdentifier: String) {
    cdkBuilder.endpointIdentifier(endpointIdentifier)
  }

  /**
   * The type of endpoint.
   *
   * Valid values are `source` and `target` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointtype)
   * @param endpointType The type of endpoint. 
   */
  public fun endpointType(endpointType: String) {
    cdkBuilder.endpointType(endpointType)
  }

  /**
   * The type of engine for the endpoint, depending on the `EndpointType` value.
   *
   * *Valid values* : `mysql` | `oracle` | `postgres` | `mariadb` | `aurora` | `aurora-postgresql` |
   * `opensearch` | `redshift` | `s3` | `db2` | `azuredb` | `sybase` | `dynamodb` | `mongodb` |
   * `kinesis` | `kafka` | `elasticsearch` | `docdb` | `sqlserver` | `neptune`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-enginename)
   * @param engineName The type of engine for the endpoint, depending on the `EndpointType` value. 
   */
  public fun engineName(engineName: String) {
    cdkBuilder.engineName(engineName)
  }

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
   * @param extraConnectionAttributes Additional attributes associated with the connection. 
   */
  public fun extraConnectionAttributes(extraConnectionAttributes: String) {
    cdkBuilder.extraConnectionAttributes(extraConnectionAttributes)
  }

  /**
   * Settings in JSON format for the source GCP MySQL endpoint.
   *
   * These settings are much the same as the settings for any MySQL-compatible endpoint. For more
   * information, see [Extra connection attributes when using MySQL as a source for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-gcpmysqlsettings)
   * @param gcpMySqlSettings Settings in JSON format for the source GCP MySQL endpoint. 
   */
  public fun gcpMySqlSettings(gcpMySqlSettings: IResolvable) {
    cdkBuilder.gcpMySqlSettings(gcpMySqlSettings)
  }

  /**
   * Settings in JSON format for the source GCP MySQL endpoint.
   *
   * These settings are much the same as the settings for any MySQL-compatible endpoint. For more
   * information, see [Extra connection attributes when using MySQL as a source for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-gcpmysqlsettings)
   * @param gcpMySqlSettings Settings in JSON format for the source GCP MySQL endpoint. 
   */
  public fun gcpMySqlSettings(gcpMySqlSettings: CfnEndpoint.GcpMySQLSettingsProperty) {
    cdkBuilder.gcpMySqlSettings(gcpMySqlSettings)
  }

  /**
   * Settings in JSON format for the source IBM Db2 LUW endpoint.
   *
   * For information about other available settings, see [Extra connection attributes when using Db2
   * LUW as a source for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-ibmdb2settings)
   * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint. 
   */
  public fun ibmDb2Settings(ibmDb2Settings: IResolvable) {
    cdkBuilder.ibmDb2Settings(ibmDb2Settings)
  }

  /**
   * Settings in JSON format for the source IBM Db2 LUW endpoint.
   *
   * For information about other available settings, see [Extra connection attributes when using Db2
   * LUW as a source for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-ibmdb2settings)
   * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint. 
   */
  public fun ibmDb2Settings(ibmDb2Settings: CfnEndpoint.IbmDb2SettingsProperty) {
    cdkBuilder.ibmDb2Settings(ibmDb2Settings)
  }

  /**
   * Settings in JSON format for the target Apache Kafka endpoint.
   *
   * For more information about other available settings, see [Using object mapping to migrate data
   * to a Kafka
   * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kafkasettings)
   * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint. 
   */
  public fun kafkaSettings(kafkaSettings: IResolvable) {
    cdkBuilder.kafkaSettings(kafkaSettings)
  }

  /**
   * Settings in JSON format for the target Apache Kafka endpoint.
   *
   * For more information about other available settings, see [Using object mapping to migrate data
   * to a Kafka
   * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kafkasettings)
   * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint. 
   */
  public fun kafkaSettings(kafkaSettings: CfnEndpoint.KafkaSettingsProperty) {
    cdkBuilder.kafkaSettings(kafkaSettings)
  }

  /**
   * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
   *
   * For more information about other available settings, see [Using object mapping to migrate data
   * to a Kinesis data
   * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kinesissettings)
   * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis Data
   * Streams. 
   */
  public fun kinesisSettings(kinesisSettings: IResolvable) {
    cdkBuilder.kinesisSettings(kinesisSettings)
  }

  /**
   * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
   *
   * For more information about other available settings, see [Using object mapping to migrate data
   * to a Kinesis data
   * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kinesissettings)
   * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis Data
   * Streams. 
   */
  public fun kinesisSettings(kinesisSettings: CfnEndpoint.KinesisSettingsProperty) {
    cdkBuilder.kinesisSettings(kinesisSettings)
  }

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
   * @param kmsKeyId An AWS KMS key identifier that is used to encrypt the connection parameters for
   * the endpoint. 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

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
   * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
   * SQL Server endpoint. 
   */
  public fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable) {
    cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings)
  }

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
   * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
   * SQL Server endpoint. 
   */
  public
      fun microsoftSqlServerSettings(microsoftSqlServerSettings: CfnEndpoint.MicrosoftSqlServerSettingsProperty) {
    cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings)
  }

  /**
   * Settings in JSON format for the source MongoDB endpoint.
   *
   * For more information about the available settings, see [Using MongoDB as a target for AWS
   * Database Migration
   * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html#CHAP_Source.MongoDB.Configuration)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-mongodbsettings)
   * @param mongoDbSettings Settings in JSON format for the source MongoDB endpoint. 
   */
  public fun mongoDbSettings(mongoDbSettings: IResolvable) {
    cdkBuilder.mongoDbSettings(mongoDbSettings)
  }

  /**
   * Settings in JSON format for the source MongoDB endpoint.
   *
   * For more information about the available settings, see [Using MongoDB as a target for AWS
   * Database Migration
   * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html#CHAP_Source.MongoDB.Configuration)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-mongodbsettings)
   * @param mongoDbSettings Settings in JSON format for the source MongoDB endpoint. 
   */
  public fun mongoDbSettings(mongoDbSettings: CfnEndpoint.MongoDbSettingsProperty) {
    cdkBuilder.mongoDbSettings(mongoDbSettings)
  }

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
   * @param mySqlSettings Settings in JSON format for the source and target MySQL endpoint. 
   */
  public fun mySqlSettings(mySqlSettings: IResolvable) {
    cdkBuilder.mySqlSettings(mySqlSettings)
  }

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
   * @param mySqlSettings Settings in JSON format for the source and target MySQL endpoint. 
   */
  public fun mySqlSettings(mySqlSettings: CfnEndpoint.MySqlSettingsProperty) {
    cdkBuilder.mySqlSettings(mySqlSettings)
  }

  /**
   * Settings in JSON format for the target Amazon Neptune endpoint.
   *
   * For more information about the available settings, see [Specifying endpoint settings for Amazon
   * Neptune as a
   * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-neptunesettings)
   * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint. 
   */
  public fun neptuneSettings(neptuneSettings: IResolvable) {
    cdkBuilder.neptuneSettings(neptuneSettings)
  }

  /**
   * Settings in JSON format for the target Amazon Neptune endpoint.
   *
   * For more information about the available settings, see [Specifying endpoint settings for Amazon
   * Neptune as a
   * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-neptunesettings)
   * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint. 
   */
  public fun neptuneSettings(neptuneSettings: CfnEndpoint.NeptuneSettingsProperty) {
    cdkBuilder.neptuneSettings(neptuneSettings)
  }

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
   * @param oracleSettings Settings in JSON format for the source and target Oracle endpoint. 
   */
  public fun oracleSettings(oracleSettings: IResolvable) {
    cdkBuilder.oracleSettings(oracleSettings)
  }

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
   * @param oracleSettings Settings in JSON format for the source and target Oracle endpoint. 
   */
  public fun oracleSettings(oracleSettings: CfnEndpoint.OracleSettingsProperty) {
    cdkBuilder.oracleSettings(oracleSettings)
  }

  /**
   * The password to be used to log in to the endpoint database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-password)
   * @param password The password to be used to log in to the endpoint database. 
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * The port used by the endpoint database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-port)
   * @param port The port used by the endpoint database. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

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
   * @param postgreSqlSettings Settings in JSON format for the source and target PostgreSQL
   * endpoint. 
   */
  public fun postgreSqlSettings(postgreSqlSettings: IResolvable) {
    cdkBuilder.postgreSqlSettings(postgreSqlSettings)
  }

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
   * @param postgreSqlSettings Settings in JSON format for the source and target PostgreSQL
   * endpoint. 
   */
  public fun postgreSqlSettings(postgreSqlSettings: CfnEndpoint.PostgreSqlSettingsProperty) {
    cdkBuilder.postgreSqlSettings(postgreSqlSettings)
  }

  /**
   * Settings in JSON format for the target Redis endpoint.
   *
   * For information about other available settings, see [Specifying endpoint settings for Redis as
   * a
   * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redissettings)
   * @param redisSettings Settings in JSON format for the target Redis endpoint. 
   */
  public fun redisSettings(redisSettings: IResolvable) {
    cdkBuilder.redisSettings(redisSettings)
  }

  /**
   * Settings in JSON format for the target Redis endpoint.
   *
   * For information about other available settings, see [Specifying endpoint settings for Redis as
   * a
   * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redissettings)
   * @param redisSettings Settings in JSON format for the target Redis endpoint. 
   */
  public fun redisSettings(redisSettings: CfnEndpoint.RedisSettingsProperty) {
    cdkBuilder.redisSettings(redisSettings)
  }

  /**
   * Settings in JSON format for the Amazon Redshift endpoint.
   *
   * For more information about other available settings, see [Extra connection attributes when
   * using Amazon Redshift as a target for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redshift.html#CHAP_Target.Redshift.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redshiftsettings)
   * @param redshiftSettings Settings in JSON format for the Amazon Redshift endpoint. 
   */
  public fun redshiftSettings(redshiftSettings: IResolvable) {
    cdkBuilder.redshiftSettings(redshiftSettings)
  }

  /**
   * Settings in JSON format for the Amazon Redshift endpoint.
   *
   * For more information about other available settings, see [Extra connection attributes when
   * using Amazon Redshift as a target for AWS
   * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redshift.html#CHAP_Target.Redshift.ConnectionAttrib)
   * in the *AWS Database Migration Service User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redshiftsettings)
   * @param redshiftSettings Settings in JSON format for the Amazon Redshift endpoint. 
   */
  public fun redshiftSettings(redshiftSettings: CfnEndpoint.RedshiftSettingsProperty) {
    cdkBuilder.redshiftSettings(redshiftSettings)
  }

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
   * @param resourceIdentifier A display name for the resource identifier at the end of the
   * `EndpointArn` response parameter that is returned in the created `Endpoint` object. 
   */
  public fun resourceIdentifier(resourceIdentifier: String) {
    cdkBuilder.resourceIdentifier(resourceIdentifier)
  }

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
   * @param s3Settings Settings in JSON format for the source and target Amazon S3 endpoint. 
   */
  public fun s3Settings(s3Settings: IResolvable) {
    cdkBuilder.s3Settings(s3Settings)
  }

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
   * @param s3Settings Settings in JSON format for the source and target Amazon S3 endpoint. 
   */
  public fun s3Settings(s3Settings: CfnEndpoint.S3SettingsProperty) {
    cdkBuilder.s3Settings(s3Settings)
  }

  /**
   * The name of the server where the endpoint database resides.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-servername)
   * @param serverName The name of the server where the endpoint database resides. 
   */
  public fun serverName(serverName: String) {
    cdkBuilder.serverName(serverName)
  }

  /**
   * The Secure Sockets Layer (SSL) mode to use for the SSL connection. The default is `none` .
   *
   *
   * When `engine_name` is set to S3, the only allowed value is `none` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-sslmode)
   * @param sslMode The Secure Sockets Layer (SSL) mode to use for the SSL connection. The default
   * is `none` . 
   */
  public fun sslMode(sslMode: String) {
    cdkBuilder.sslMode(sslMode)
  }

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
   * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint. 
   */
  public fun sybaseSettings(sybaseSettings: IResolvable) {
    cdkBuilder.sybaseSettings(sybaseSettings)
  }

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
   * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint. 
   */
  public fun sybaseSettings(sybaseSettings: CfnEndpoint.SybaseSettingsProperty) {
    cdkBuilder.sybaseSettings(sybaseSettings)
  }

  /**
   * One or more tags to be assigned to the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags)
   * @param tags One or more tags to be assigned to the endpoint. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * One or more tags to be assigned to the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags)
   * @param tags One or more tags to be assigned to the endpoint. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The user name to be used to log in to the endpoint database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-username)
   * @param username The user name to be used to log in to the endpoint database. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnEndpoint {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
