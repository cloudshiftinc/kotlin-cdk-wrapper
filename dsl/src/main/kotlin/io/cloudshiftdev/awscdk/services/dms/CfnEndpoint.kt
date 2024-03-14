package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEndpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A value that can be used for cross-account validation.
   */
  public open fun attrExternalId(): String = unwrap(this).getAttrExternalId()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Amazon Resource Name (ARN) for the certificate.
   */
  public open fun certificateArn(): String? = unwrap(this).getCertificateArn()

  /**
   * The Amazon Resource Name (ARN) for the certificate.
   */
  public open fun certificateArn(`value`: String) {
    unwrap(this).setCertificateArn(`value`)
  }

  /**
   * The name of the endpoint database.
   */
  public open fun databaseName(): String? = unwrap(this).getDatabaseName()

  /**
   * The name of the endpoint database.
   */
  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
  }

  /**
   * Settings in JSON format for the source and target DocumentDB endpoint.
   */
  public open fun docDbSettings(): Any? = unwrap(this).getDocDbSettings()

  /**
   * Settings in JSON format for the source and target DocumentDB endpoint.
   */
  public open fun docDbSettings(`value`: IResolvable) {
    unwrap(this).setDocDbSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the source and target DocumentDB endpoint.
   */
  public open fun docDbSettings(`value`: DocDbSettingsProperty) {
    unwrap(this).setDocDbSettings(`value`.let(DocDbSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the source and target DocumentDB endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("660ba513563c9edded3380814d8115763f2f757fc8bc221c80cdf26e57d134b7")
  public open fun docDbSettings(`value`: DocDbSettingsProperty.Builder.() -> Unit): Unit =
      docDbSettings(DocDbSettingsProperty(`value`))

  /**
   * Settings in JSON format for the target Amazon DynamoDB endpoint.
   */
  public open fun dynamoDbSettings(): Any? = unwrap(this).getDynamoDbSettings()

  /**
   * Settings in JSON format for the target Amazon DynamoDB endpoint.
   */
  public open fun dynamoDbSettings(`value`: IResolvable) {
    unwrap(this).setDynamoDbSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the target Amazon DynamoDB endpoint.
   */
  public open fun dynamoDbSettings(`value`: DynamoDbSettingsProperty) {
    unwrap(this).setDynamoDbSettings(`value`.let(DynamoDbSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the target Amazon DynamoDB endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9034c069568c7280b68dae081dc161b9b874a088d54389d3def425d0340cfff2")
  public open fun dynamoDbSettings(`value`: DynamoDbSettingsProperty.Builder.() -> Unit): Unit =
      dynamoDbSettings(DynamoDbSettingsProperty(`value`))

  /**
   * Settings in JSON format for the target OpenSearch endpoint.
   */
  public open fun elasticsearchSettings(): Any? = unwrap(this).getElasticsearchSettings()

  /**
   * Settings in JSON format for the target OpenSearch endpoint.
   */
  public open fun elasticsearchSettings(`value`: IResolvable) {
    unwrap(this).setElasticsearchSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the target OpenSearch endpoint.
   */
  public open fun elasticsearchSettings(`value`: ElasticsearchSettingsProperty) {
    unwrap(this).setElasticsearchSettings(`value`.let(ElasticsearchSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the target OpenSearch endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbd60f0b576d3f6d500883a8a6994975dbaeb2781da55c1573451a49e8bf9889")
  public open fun elasticsearchSettings(`value`: ElasticsearchSettingsProperty.Builder.() -> Unit):
      Unit = elasticsearchSettings(ElasticsearchSettingsProperty(`value`))

  /**
   * The database endpoint identifier.
   */
  public open fun endpointIdentifier(): String? = unwrap(this).getEndpointIdentifier()

  /**
   * The database endpoint identifier.
   */
  public open fun endpointIdentifier(`value`: String) {
    unwrap(this).setEndpointIdentifier(`value`)
  }

  /**
   * The type of endpoint.
   */
  public open fun endpointType(): String = unwrap(this).getEndpointType()

  /**
   * The type of endpoint.
   */
  public open fun endpointType(`value`: String) {
    unwrap(this).setEndpointType(`value`)
  }

  /**
   * The type of engine for the endpoint, depending on the `EndpointType` value.
   */
  public open fun engineName(): String = unwrap(this).getEngineName()

  /**
   * The type of engine for the endpoint, depending on the `EndpointType` value.
   */
  public open fun engineName(`value`: String) {
    unwrap(this).setEngineName(`value`)
  }

  /**
   * Additional attributes associated with the connection.
   */
  public open fun extraConnectionAttributes(): String? = unwrap(this).getExtraConnectionAttributes()

  /**
   * Additional attributes associated with the connection.
   */
  public open fun extraConnectionAttributes(`value`: String) {
    unwrap(this).setExtraConnectionAttributes(`value`)
  }

  /**
   * Settings in JSON format for the source GCP MySQL endpoint.
   */
  public open fun gcpMySqlSettings(): Any? = unwrap(this).getGcpMySqlSettings()

  /**
   * Settings in JSON format for the source GCP MySQL endpoint.
   */
  public open fun gcpMySqlSettings(`value`: IResolvable) {
    unwrap(this).setGcpMySqlSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the source GCP MySQL endpoint.
   */
  public open fun gcpMySqlSettings(`value`: GcpMySQLSettingsProperty) {
    unwrap(this).setGcpMySqlSettings(`value`.let(GcpMySQLSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the source GCP MySQL endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("121aff10b9337b19bbd6b4d002139fb4831daa0298eecc5331820193639dd337")
  public open fun gcpMySqlSettings(`value`: GcpMySQLSettingsProperty.Builder.() -> Unit): Unit =
      gcpMySqlSettings(GcpMySQLSettingsProperty(`value`))

  /**
   * Settings in JSON format for the source IBM Db2 LUW endpoint.
   */
  public open fun ibmDb2Settings(): Any? = unwrap(this).getIbmDb2Settings()

  /**
   * Settings in JSON format for the source IBM Db2 LUW endpoint.
   */
  public open fun ibmDb2Settings(`value`: IResolvable) {
    unwrap(this).setIbmDb2Settings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the source IBM Db2 LUW endpoint.
   */
  public open fun ibmDb2Settings(`value`: IbmDb2SettingsProperty) {
    unwrap(this).setIbmDb2Settings(`value`.let(IbmDb2SettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the source IBM Db2 LUW endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("548fa99f201edce990ad559532e35f0df925e0171fa4115387e3e98ba4a96f95")
  public open fun ibmDb2Settings(`value`: IbmDb2SettingsProperty.Builder.() -> Unit): Unit =
      ibmDb2Settings(IbmDb2SettingsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Settings in JSON format for the target Apache Kafka endpoint.
   */
  public open fun kafkaSettings(): Any? = unwrap(this).getKafkaSettings()

  /**
   * Settings in JSON format for the target Apache Kafka endpoint.
   */
  public open fun kafkaSettings(`value`: IResolvable) {
    unwrap(this).setKafkaSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the target Apache Kafka endpoint.
   */
  public open fun kafkaSettings(`value`: KafkaSettingsProperty) {
    unwrap(this).setKafkaSettings(`value`.let(KafkaSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the target Apache Kafka endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("95e6f4e24d21f907df9dab7e1c5898f4b65798f8443ff8cda12973f31be4dc39")
  public open fun kafkaSettings(`value`: KafkaSettingsProperty.Builder.() -> Unit): Unit =
      kafkaSettings(KafkaSettingsProperty(`value`))

  /**
   * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
   */
  public open fun kinesisSettings(): Any? = unwrap(this).getKinesisSettings()

  /**
   * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
   */
  public open fun kinesisSettings(`value`: IResolvable) {
    unwrap(this).setKinesisSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
   */
  public open fun kinesisSettings(`value`: KinesisSettingsProperty) {
    unwrap(this).setKinesisSettings(`value`.let(KinesisSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3d4ef5b51a75a54cb2ef86fdcf95a3e5e3808c6768d6bb1be49010a7881b5461")
  public open fun kinesisSettings(`value`: KinesisSettingsProperty.Builder.() -> Unit): Unit =
      kinesisSettings(KinesisSettingsProperty(`value`))

  /**
   * An AWS KMS key identifier that is used to encrypt the connection parameters for the endpoint.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * An AWS KMS key identifier that is used to encrypt the connection parameters for the endpoint.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * Settings in JSON format for the source and target Microsoft SQL Server endpoint.
   */
  public open fun microsoftSqlServerSettings(): Any? = unwrap(this).getMicrosoftSqlServerSettings()

  /**
   * Settings in JSON format for the source and target Microsoft SQL Server endpoint.
   */
  public open fun microsoftSqlServerSettings(`value`: IResolvable) {
    unwrap(this).setMicrosoftSqlServerSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the source and target Microsoft SQL Server endpoint.
   */
  public open fun microsoftSqlServerSettings(`value`: MicrosoftSqlServerSettingsProperty) {
    unwrap(this).setMicrosoftSqlServerSettings(`value`.let(MicrosoftSqlServerSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the source and target Microsoft SQL Server endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("01437218f3a5caa6cc9cbe0ab603838b7bf74521b6a8609feb8df795add9ad25")
  public open
      fun microsoftSqlServerSettings(`value`: MicrosoftSqlServerSettingsProperty.Builder.() -> Unit):
      Unit = microsoftSqlServerSettings(MicrosoftSqlServerSettingsProperty(`value`))

  /**
   * Settings in JSON format for the source MongoDB endpoint.
   */
  public open fun mongoDbSettings(): Any? = unwrap(this).getMongoDbSettings()

  /**
   * Settings in JSON format for the source MongoDB endpoint.
   */
  public open fun mongoDbSettings(`value`: IResolvable) {
    unwrap(this).setMongoDbSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the source MongoDB endpoint.
   */
  public open fun mongoDbSettings(`value`: MongoDbSettingsProperty) {
    unwrap(this).setMongoDbSettings(`value`.let(MongoDbSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the source MongoDB endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("900afd38e57020dca861afd93fbf75cf09b253c3c76df71b35de01c1dbef243e")
  public open fun mongoDbSettings(`value`: MongoDbSettingsProperty.Builder.() -> Unit): Unit =
      mongoDbSettings(MongoDbSettingsProperty(`value`))

  /**
   * Settings in JSON format for the source and target MySQL endpoint.
   */
  public open fun mySqlSettings(): Any? = unwrap(this).getMySqlSettings()

  /**
   * Settings in JSON format for the source and target MySQL endpoint.
   */
  public open fun mySqlSettings(`value`: IResolvable) {
    unwrap(this).setMySqlSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the source and target MySQL endpoint.
   */
  public open fun mySqlSettings(`value`: MySqlSettingsProperty) {
    unwrap(this).setMySqlSettings(`value`.let(MySqlSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the source and target MySQL endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b2842f57e5fd2da1e7c083d37c4640f5f0ce04f90af7fe403829040cf6b83259")
  public open fun mySqlSettings(`value`: MySqlSettingsProperty.Builder.() -> Unit): Unit =
      mySqlSettings(MySqlSettingsProperty(`value`))

  /**
   * Settings in JSON format for the target Amazon Neptune endpoint.
   */
  public open fun neptuneSettings(): Any? = unwrap(this).getNeptuneSettings()

  /**
   * Settings in JSON format for the target Amazon Neptune endpoint.
   */
  public open fun neptuneSettings(`value`: IResolvable) {
    unwrap(this).setNeptuneSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the target Amazon Neptune endpoint.
   */
  public open fun neptuneSettings(`value`: NeptuneSettingsProperty) {
    unwrap(this).setNeptuneSettings(`value`.let(NeptuneSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the target Amazon Neptune endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c5cdb046e330a82d2dd332354a509039f53e5c137dbcfbc720d79c1424c373d")
  public open fun neptuneSettings(`value`: NeptuneSettingsProperty.Builder.() -> Unit): Unit =
      neptuneSettings(NeptuneSettingsProperty(`value`))

  /**
   * Settings in JSON format for the source and target Oracle endpoint.
   */
  public open fun oracleSettings(): Any? = unwrap(this).getOracleSettings()

  /**
   * Settings in JSON format for the source and target Oracle endpoint.
   */
  public open fun oracleSettings(`value`: IResolvable) {
    unwrap(this).setOracleSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the source and target Oracle endpoint.
   */
  public open fun oracleSettings(`value`: OracleSettingsProperty) {
    unwrap(this).setOracleSettings(`value`.let(OracleSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the source and target Oracle endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5b1993a4b442a16d979b1a29c61d6d55c69ae05d0aaec755b0c2798da12c9942")
  public open fun oracleSettings(`value`: OracleSettingsProperty.Builder.() -> Unit): Unit =
      oracleSettings(OracleSettingsProperty(`value`))

  /**
   * The password to be used to log in to the endpoint database.
   */
  public open fun password(): String? = unwrap(this).getPassword()

  /**
   * The password to be used to log in to the endpoint database.
   */
  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

  /**
   * The port used by the endpoint database.
   */
  public open fun port(): Number? = unwrap(this).getPort()

  /**
   * The port used by the endpoint database.
   */
  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  /**
   * Settings in JSON format for the source and target PostgreSQL endpoint.
   */
  public open fun postgreSqlSettings(): Any? = unwrap(this).getPostgreSqlSettings()

  /**
   * Settings in JSON format for the source and target PostgreSQL endpoint.
   */
  public open fun postgreSqlSettings(`value`: IResolvable) {
    unwrap(this).setPostgreSqlSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the source and target PostgreSQL endpoint.
   */
  public open fun postgreSqlSettings(`value`: PostgreSqlSettingsProperty) {
    unwrap(this).setPostgreSqlSettings(`value`.let(PostgreSqlSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the source and target PostgreSQL endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dbf585dfd45f1f7348cad73b39ebec3b12ed32319d8323cd25b2cfc80b2cb198")
  public open fun postgreSqlSettings(`value`: PostgreSqlSettingsProperty.Builder.() -> Unit): Unit =
      postgreSqlSettings(PostgreSqlSettingsProperty(`value`))

  /**
   * Settings in JSON format for the target Redis endpoint.
   */
  public open fun redisSettings(): Any? = unwrap(this).getRedisSettings()

  /**
   * Settings in JSON format for the target Redis endpoint.
   */
  public open fun redisSettings(`value`: IResolvable) {
    unwrap(this).setRedisSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the target Redis endpoint.
   */
  public open fun redisSettings(`value`: RedisSettingsProperty) {
    unwrap(this).setRedisSettings(`value`.let(RedisSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the target Redis endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b19598a5a78fa2526e5549744f83473195dafb9c5aa1c59f6d006f7f6dff6267")
  public open fun redisSettings(`value`: RedisSettingsProperty.Builder.() -> Unit): Unit =
      redisSettings(RedisSettingsProperty(`value`))

  /**
   * Settings in JSON format for the Amazon Redshift endpoint.
   */
  public open fun redshiftSettings(): Any? = unwrap(this).getRedshiftSettings()

  /**
   * Settings in JSON format for the Amazon Redshift endpoint.
   */
  public open fun redshiftSettings(`value`: IResolvable) {
    unwrap(this).setRedshiftSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the Amazon Redshift endpoint.
   */
  public open fun redshiftSettings(`value`: RedshiftSettingsProperty) {
    unwrap(this).setRedshiftSettings(`value`.let(RedshiftSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the Amazon Redshift endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38edadac4542346809cbed29359c4f8e4eddcc3e44939f4b3c520241c070ca1e")
  public open fun redshiftSettings(`value`: RedshiftSettingsProperty.Builder.() -> Unit): Unit =
      redshiftSettings(RedshiftSettingsProperty(`value`))

  /**
   * A display name for the resource identifier at the end of the `EndpointArn` response parameter
   * that is returned in the created `Endpoint` object.
   */
  public open fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  /**
   * A display name for the resource identifier at the end of the `EndpointArn` response parameter
   * that is returned in the created `Endpoint` object.
   */
  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  /**
   * Settings in JSON format for the source and target Amazon S3 endpoint.
   */
  public open fun s3Settings(): Any? = unwrap(this).getS3Settings()

  /**
   * Settings in JSON format for the source and target Amazon S3 endpoint.
   */
  public open fun s3Settings(`value`: IResolvable) {
    unwrap(this).setS3Settings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the source and target Amazon S3 endpoint.
   */
  public open fun s3Settings(`value`: S3SettingsProperty) {
    unwrap(this).setS3Settings(`value`.let(S3SettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the source and target Amazon S3 endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("21c1f4a4c8d859a05f5b1573a62aa9c1b814692320bc4cf77cf2b34cc2a6c2cf")
  public open fun s3Settings(`value`: S3SettingsProperty.Builder.() -> Unit): Unit =
      s3Settings(S3SettingsProperty(`value`))

  /**
   * The name of the server where the endpoint database resides.
   */
  public open fun serverName(): String? = unwrap(this).getServerName()

  /**
   * The name of the server where the endpoint database resides.
   */
  public open fun serverName(`value`: String) {
    unwrap(this).setServerName(`value`)
  }

  /**
   * The Secure Sockets Layer (SSL) mode to use for the SSL connection.
   *
   * The default is `none` .
   */
  public open fun sslMode(): String? = unwrap(this).getSslMode()

  /**
   * The Secure Sockets Layer (SSL) mode to use for the SSL connection.
   *
   * The default is `none` .
   */
  public open fun sslMode(`value`: String) {
    unwrap(this).setSslMode(`value`)
  }

  /**
   * Settings in JSON format for the source and target SAP ASE endpoint.
   */
  public open fun sybaseSettings(): Any? = unwrap(this).getSybaseSettings()

  /**
   * Settings in JSON format for the source and target SAP ASE endpoint.
   */
  public open fun sybaseSettings(`value`: IResolvable) {
    unwrap(this).setSybaseSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings in JSON format for the source and target SAP ASE endpoint.
   */
  public open fun sybaseSettings(`value`: SybaseSettingsProperty) {
    unwrap(this).setSybaseSettings(`value`.let(SybaseSettingsProperty::unwrap))
  }

  /**
   * Settings in JSON format for the source and target SAP ASE endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f0d2fc4245ed559777df72eff656ba7d3742cf4c102193bbcb4ba41f9ff7d3cc")
  public open fun sybaseSettings(`value`: SybaseSettingsProperty.Builder.() -> Unit): Unit =
      sybaseSettings(SybaseSettingsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * One or more tags to be assigned to the endpoint.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * One or more tags to be assigned to the endpoint.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * One or more tags to be assigned to the endpoint.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The user name to be used to log in to the endpoint database.
   */
  public open fun username(): String? = unwrap(this).getUsername()

  /**
   * The user name to be used to log in to the endpoint database.
   */
  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dms.CfnEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-certificatearn)
     * @param certificateArn The Amazon Resource Name (ARN) for the certificate. 
     */
    public fun certificateArn(certificateArn: String)

    /**
     * The name of the endpoint database.
     *
     * For a MySQL source or target endpoint, don't specify `DatabaseName` . To migrate to a
     * specific database, use this setting and `targetDbType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-databasename)
     * @param databaseName The name of the endpoint database. 
     */
    public fun databaseName(databaseName: String)

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
     * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint. 
     */
    public fun docDbSettings(docDbSettings: IResolvable)

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
     * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint. 
     */
    public fun docDbSettings(docDbSettings: DocDbSettingsProperty)

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
     * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fbde66ac654b5397d727e318fc72d4c5e0ed2add843d1a60ae50a069d8cf78d")
    public fun docDbSettings(docDbSettings: DocDbSettingsProperty.Builder.() -> Unit)

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
    public fun dynamoDbSettings(dynamoDbSettings: IResolvable)

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
    public fun dynamoDbSettings(dynamoDbSettings: DynamoDbSettingsProperty)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5cdc3c3c4090352539fd080a3d02f6645a0a6109d09f40cc53594a993068d096")
    public fun dynamoDbSettings(dynamoDbSettings: DynamoDbSettingsProperty.Builder.() -> Unit)

    /**
     * Settings in JSON format for the target OpenSearch endpoint.
     *
     * For more information about the available settings, see [Extra connection attributes when
     * using OpenSearch as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-elasticsearchsettings)
     * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint. 
     */
    public fun elasticsearchSettings(elasticsearchSettings: IResolvable)

    /**
     * Settings in JSON format for the target OpenSearch endpoint.
     *
     * For more information about the available settings, see [Extra connection attributes when
     * using OpenSearch as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-elasticsearchsettings)
     * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint. 
     */
    public fun elasticsearchSettings(elasticsearchSettings: ElasticsearchSettingsProperty)

    /**
     * Settings in JSON format for the target OpenSearch endpoint.
     *
     * For more information about the available settings, see [Extra connection attributes when
     * using OpenSearch as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-elasticsearchsettings)
     * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("889d325b4eeeb0880dc74130a7f1cc5cebd2323685790c333d6149a4f2bfcb8f")
    public
        fun elasticsearchSettings(elasticsearchSettings: ElasticsearchSettingsProperty.Builder.() -> Unit)

    /**
     * The database endpoint identifier.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointidentifier)
     * @param endpointIdentifier The database endpoint identifier. 
     */
    public fun endpointIdentifier(endpointIdentifier: String)

    /**
     * The type of endpoint.
     *
     * Valid values are `source` and `target` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointtype)
     * @param endpointType The type of endpoint. 
     */
    public fun endpointType(endpointType: String)

    /**
     * The type of engine for the endpoint, depending on the `EndpointType` value.
     *
     * *Valid values* : `mysql` | `oracle` | `postgres` | `mariadb` | `aurora` | `aurora-postgresql`
     * | `opensearch` | `redshift` | `redshift-serverless` | `s3` | `db2` | `azuredb` | `sybase` |
     * `dynamodb` | `mongodb` | `kinesis` | `kafka` | `elasticsearch` | `docdb` | `sqlserver` |
     * `neptune`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-enginename)
     * @param engineName The type of engine for the endpoint, depending on the `EndpointType` value.
     * 
     */
    public fun engineName(engineName: String)

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
     * @param extraConnectionAttributes Additional attributes associated with the connection. 
     */
    public fun extraConnectionAttributes(extraConnectionAttributes: String)

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
    public fun gcpMySqlSettings(gcpMySqlSettings: IResolvable)

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
    public fun gcpMySqlSettings(gcpMySqlSettings: GcpMySQLSettingsProperty)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("925d4ba9af14d43c38e62d809c4a9bfbfc5cb3d9712b4896f8527703dd9b701e")
    public fun gcpMySqlSettings(gcpMySqlSettings: GcpMySQLSettingsProperty.Builder.() -> Unit)

    /**
     * Settings in JSON format for the source IBM Db2 LUW endpoint.
     *
     * For information about other available settings, see [Extra connection attributes when using
     * Db2 LUW as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-ibmdb2settings)
     * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint. 
     */
    public fun ibmDb2Settings(ibmDb2Settings: IResolvable)

    /**
     * Settings in JSON format for the source IBM Db2 LUW endpoint.
     *
     * For information about other available settings, see [Extra connection attributes when using
     * Db2 LUW as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-ibmdb2settings)
     * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint. 
     */
    public fun ibmDb2Settings(ibmDb2Settings: IbmDb2SettingsProperty)

    /**
     * Settings in JSON format for the source IBM Db2 LUW endpoint.
     *
     * For information about other available settings, see [Extra connection attributes when using
     * Db2 LUW as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-ibmdb2settings)
     * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a55b78aff146203eb19a530ed10a3898c4b42f0d0fc717956cb7c7f6b0c6fac8")
    public fun ibmDb2Settings(ibmDb2Settings: IbmDb2SettingsProperty.Builder.() -> Unit)

    /**
     * Settings in JSON format for the target Apache Kafka endpoint.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kafka
     * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kafkasettings)
     * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint. 
     */
    public fun kafkaSettings(kafkaSettings: IResolvable)

    /**
     * Settings in JSON format for the target Apache Kafka endpoint.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kafka
     * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kafkasettings)
     * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint. 
     */
    public fun kafkaSettings(kafkaSettings: KafkaSettingsProperty)

    /**
     * Settings in JSON format for the target Apache Kafka endpoint.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kafka
     * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kafkasettings)
     * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9ed867348022b36c7694b652e12b1cacfa29155ed279f155e9b6a8ede7b2075")
    public fun kafkaSettings(kafkaSettings: KafkaSettingsProperty.Builder.() -> Unit)

    /**
     * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kinesis data
     * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kinesissettings)
     * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis
     * Data Streams. 
     */
    public fun kinesisSettings(kinesisSettings: IResolvable)

    /**
     * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kinesis data
     * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kinesissettings)
     * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis
     * Data Streams. 
     */
    public fun kinesisSettings(kinesisSettings: KinesisSettingsProperty)

    /**
     * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kinesis data
     * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kinesissettings)
     * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis
     * Data Streams. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96defed71e91fdb933b12d6dd79a8a2249d0156ed38c4ecfcd729da4e63e7bd2")
    public fun kinesisSettings(kinesisSettings: KinesisSettingsProperty.Builder.() -> Unit)

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
     * @param kmsKeyId An AWS KMS key identifier that is used to encrypt the connection parameters
     * for the endpoint. 
     */
    public fun kmsKeyId(kmsKeyId: String)

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
     * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
     * SQL Server endpoint. 
     */
    public fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable)

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
     * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
     * SQL Server endpoint. 
     */
    public
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty)

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
     * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
     * SQL Server endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adbf309f1b82d81fad56f56705008f24acb04801869f82f113e9ca86220eba07")
    public
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty.Builder.() -> Unit)

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
    public fun mongoDbSettings(mongoDbSettings: IResolvable)

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
    public fun mongoDbSettings(mongoDbSettings: MongoDbSettingsProperty)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("050ff78e40a1395c73c5b4f2c039e024a8067554393984a41d14a33f0eac6cf4")
    public fun mongoDbSettings(mongoDbSettings: MongoDbSettingsProperty.Builder.() -> Unit)

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
    public fun mySqlSettings(mySqlSettings: IResolvable)

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
    public fun mySqlSettings(mySqlSettings: MySqlSettingsProperty)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c1ef3d7d8d9c26762a1b5268ba864ccfdce78bc3570d3083b6493d47e37b54")
    public fun mySqlSettings(mySqlSettings: MySqlSettingsProperty.Builder.() -> Unit)

    /**
     * Settings in JSON format for the target Amazon Neptune endpoint.
     *
     * For more information about the available settings, see [Specifying endpoint settings for
     * Amazon Neptune as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-neptunesettings)
     * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint. 
     */
    public fun neptuneSettings(neptuneSettings: IResolvable)

    /**
     * Settings in JSON format for the target Amazon Neptune endpoint.
     *
     * For more information about the available settings, see [Specifying endpoint settings for
     * Amazon Neptune as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-neptunesettings)
     * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint. 
     */
    public fun neptuneSettings(neptuneSettings: NeptuneSettingsProperty)

    /**
     * Settings in JSON format for the target Amazon Neptune endpoint.
     *
     * For more information about the available settings, see [Specifying endpoint settings for
     * Amazon Neptune as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-neptunesettings)
     * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f44b6d9df7919882c0942ce2d41354a6064d5c40384ff1834ce0fa81ae5d2bb7")
    public fun neptuneSettings(neptuneSettings: NeptuneSettingsProperty.Builder.() -> Unit)

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
    public fun oracleSettings(oracleSettings: IResolvable)

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
    public fun oracleSettings(oracleSettings: OracleSettingsProperty)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf0444a7326a153335d36ebdb3dd8d1f3540e068cbdbf7f679c3a4032dccea88")
    public fun oracleSettings(oracleSettings: OracleSettingsProperty.Builder.() -> Unit)

    /**
     * The password to be used to log in to the endpoint database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-password)
     * @param password The password to be used to log in to the endpoint database. 
     */
    public fun password(password: String)

    /**
     * The port used by the endpoint database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-port)
     * @param port The port used by the endpoint database. 
     */
    public fun port(port: Number)

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
    public fun postgreSqlSettings(postgreSqlSettings: IResolvable)

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
    public fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90679fdd6b6c393ffe4be191fbab0408dfed36b58b34c62d52ff4d5baccc34ce")
    public fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty.Builder.() -> Unit)

    /**
     * Settings in JSON format for the target Redis endpoint.
     *
     * For information about other available settings, see [Specifying endpoint settings for Redis
     * as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redissettings)
     * @param redisSettings Settings in JSON format for the target Redis endpoint. 
     */
    public fun redisSettings(redisSettings: IResolvable)

    /**
     * Settings in JSON format for the target Redis endpoint.
     *
     * For information about other available settings, see [Specifying endpoint settings for Redis
     * as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redissettings)
     * @param redisSettings Settings in JSON format for the target Redis endpoint. 
     */
    public fun redisSettings(redisSettings: RedisSettingsProperty)

    /**
     * Settings in JSON format for the target Redis endpoint.
     *
     * For information about other available settings, see [Specifying endpoint settings for Redis
     * as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redissettings)
     * @param redisSettings Settings in JSON format for the target Redis endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57864a08b297d92b7b750737cdfc05fd8a6e6de6d220bb98b268830aefc86d30")
    public fun redisSettings(redisSettings: RedisSettingsProperty.Builder.() -> Unit)

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
    public fun redshiftSettings(redshiftSettings: IResolvable)

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
    public fun redshiftSettings(redshiftSettings: RedshiftSettingsProperty)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11b670292b1e44ce7dda450ac19ef54cc289ada19014482359d029ad114fcb7e")
    public fun redshiftSettings(redshiftSettings: RedshiftSettingsProperty.Builder.() -> Unit)

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
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     * `EndpointArn` response parameter that is returned in the created `Endpoint` object. 
     */
    public fun resourceIdentifier(resourceIdentifier: String)

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
    public fun s3Settings(s3Settings: IResolvable)

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
    public fun s3Settings(s3Settings: S3SettingsProperty)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f3e786c777d40066e00740f0ac855a1f9f1dbcb38b044b134764b13af1cbcce")
    public fun s3Settings(s3Settings: S3SettingsProperty.Builder.() -> Unit)

    /**
     * The name of the server where the endpoint database resides.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-servername)
     * @param serverName The name of the server where the endpoint database resides. 
     */
    public fun serverName(serverName: String)

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
    public fun sslMode(sslMode: String)

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
     * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint. 
     */
    public fun sybaseSettings(sybaseSettings: IResolvable)

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
     * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint. 
     */
    public fun sybaseSettings(sybaseSettings: SybaseSettingsProperty)

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
     * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40dcc88d57b0b2dd6f75aa352d9dae019e3e8de6e8a1892482e39a7ef92fe742")
    public fun sybaseSettings(sybaseSettings: SybaseSettingsProperty.Builder.() -> Unit)

    /**
     * One or more tags to be assigned to the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags)
     * @param tags One or more tags to be assigned to the endpoint. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * One or more tags to be assigned to the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags)
     * @param tags One or more tags to be assigned to the endpoint. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The user name to be used to log in to the endpoint database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-username)
     * @param username The user name to be used to log in to the endpoint database. 
     */
    public fun username(username: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnEndpoint.Builder =
        software.amazon.awscdk.services.dms.CfnEndpoint.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-certificatearn)
     * @param certificateArn The Amazon Resource Name (ARN) for the certificate. 
     */
    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * The name of the endpoint database.
     *
     * For a MySQL source or target endpoint, don't specify `DatabaseName` . To migrate to a
     * specific database, use this setting and `targetDbType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-databasename)
     * @param databaseName The name of the endpoint database. 
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

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
     * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint. 
     */
    override fun docDbSettings(docDbSettings: IResolvable) {
      cdkBuilder.docDbSettings(docDbSettings.let(IResolvable::unwrap))
    }

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
     * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint. 
     */
    override fun docDbSettings(docDbSettings: DocDbSettingsProperty) {
      cdkBuilder.docDbSettings(docDbSettings.let(DocDbSettingsProperty::unwrap))
    }

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
     * @param docDbSettings Settings in JSON format for the source and target DocumentDB endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fbde66ac654b5397d727e318fc72d4c5e0ed2add843d1a60ae50a069d8cf78d")
    override fun docDbSettings(docDbSettings: DocDbSettingsProperty.Builder.() -> Unit): Unit =
        docDbSettings(DocDbSettingsProperty(docDbSettings))

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
    override fun dynamoDbSettings(dynamoDbSettings: IResolvable) {
      cdkBuilder.dynamoDbSettings(dynamoDbSettings.let(IResolvable::unwrap))
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
    override fun dynamoDbSettings(dynamoDbSettings: DynamoDbSettingsProperty) {
      cdkBuilder.dynamoDbSettings(dynamoDbSettings.let(DynamoDbSettingsProperty::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5cdc3c3c4090352539fd080a3d02f6645a0a6109d09f40cc53594a993068d096")
    override fun dynamoDbSettings(dynamoDbSettings: DynamoDbSettingsProperty.Builder.() -> Unit):
        Unit = dynamoDbSettings(DynamoDbSettingsProperty(dynamoDbSettings))

    /**
     * Settings in JSON format for the target OpenSearch endpoint.
     *
     * For more information about the available settings, see [Extra connection attributes when
     * using OpenSearch as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-elasticsearchsettings)
     * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint. 
     */
    override fun elasticsearchSettings(elasticsearchSettings: IResolvable) {
      cdkBuilder.elasticsearchSettings(elasticsearchSettings.let(IResolvable::unwrap))
    }

    /**
     * Settings in JSON format for the target OpenSearch endpoint.
     *
     * For more information about the available settings, see [Extra connection attributes when
     * using OpenSearch as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-elasticsearchsettings)
     * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint. 
     */
    override fun elasticsearchSettings(elasticsearchSettings: ElasticsearchSettingsProperty) {
      cdkBuilder.elasticsearchSettings(elasticsearchSettings.let(ElasticsearchSettingsProperty::unwrap))
    }

    /**
     * Settings in JSON format for the target OpenSearch endpoint.
     *
     * For more information about the available settings, see [Extra connection attributes when
     * using OpenSearch as a target for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-elasticsearchsettings)
     * @param elasticsearchSettings Settings in JSON format for the target OpenSearch endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("889d325b4eeeb0880dc74130a7f1cc5cebd2323685790c333d6149a4f2bfcb8f")
    override
        fun elasticsearchSettings(elasticsearchSettings: ElasticsearchSettingsProperty.Builder.() -> Unit):
        Unit = elasticsearchSettings(ElasticsearchSettingsProperty(elasticsearchSettings))

    /**
     * The database endpoint identifier.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointidentifier)
     * @param endpointIdentifier The database endpoint identifier. 
     */
    override fun endpointIdentifier(endpointIdentifier: String) {
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
    override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    /**
     * The type of engine for the endpoint, depending on the `EndpointType` value.
     *
     * *Valid values* : `mysql` | `oracle` | `postgres` | `mariadb` | `aurora` | `aurora-postgresql`
     * | `opensearch` | `redshift` | `redshift-serverless` | `s3` | `db2` | `azuredb` | `sybase` |
     * `dynamodb` | `mongodb` | `kinesis` | `kafka` | `elasticsearch` | `docdb` | `sqlserver` |
     * `neptune`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-enginename)
     * @param engineName The type of engine for the endpoint, depending on the `EndpointType` value.
     * 
     */
    override fun engineName(engineName: String) {
      cdkBuilder.engineName(engineName)
    }

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
     * @param extraConnectionAttributes Additional attributes associated with the connection. 
     */
    override fun extraConnectionAttributes(extraConnectionAttributes: String) {
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
    override fun gcpMySqlSettings(gcpMySqlSettings: IResolvable) {
      cdkBuilder.gcpMySqlSettings(gcpMySqlSettings.let(IResolvable::unwrap))
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
    override fun gcpMySqlSettings(gcpMySqlSettings: GcpMySQLSettingsProperty) {
      cdkBuilder.gcpMySqlSettings(gcpMySqlSettings.let(GcpMySQLSettingsProperty::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("925d4ba9af14d43c38e62d809c4a9bfbfc5cb3d9712b4896f8527703dd9b701e")
    override fun gcpMySqlSettings(gcpMySqlSettings: GcpMySQLSettingsProperty.Builder.() -> Unit):
        Unit = gcpMySqlSettings(GcpMySQLSettingsProperty(gcpMySqlSettings))

    /**
     * Settings in JSON format for the source IBM Db2 LUW endpoint.
     *
     * For information about other available settings, see [Extra connection attributes when using
     * Db2 LUW as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-ibmdb2settings)
     * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint. 
     */
    override fun ibmDb2Settings(ibmDb2Settings: IResolvable) {
      cdkBuilder.ibmDb2Settings(ibmDb2Settings.let(IResolvable::unwrap))
    }

    /**
     * Settings in JSON format for the source IBM Db2 LUW endpoint.
     *
     * For information about other available settings, see [Extra connection attributes when using
     * Db2 LUW as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-ibmdb2settings)
     * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint. 
     */
    override fun ibmDb2Settings(ibmDb2Settings: IbmDb2SettingsProperty) {
      cdkBuilder.ibmDb2Settings(ibmDb2Settings.let(IbmDb2SettingsProperty::unwrap))
    }

    /**
     * Settings in JSON format for the source IBM Db2 LUW endpoint.
     *
     * For information about other available settings, see [Extra connection attributes when using
     * Db2 LUW as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DB2.html#CHAP_Source.DB2.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-ibmdb2settings)
     * @param ibmDb2Settings Settings in JSON format for the source IBM Db2 LUW endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a55b78aff146203eb19a530ed10a3898c4b42f0d0fc717956cb7c7f6b0c6fac8")
    override fun ibmDb2Settings(ibmDb2Settings: IbmDb2SettingsProperty.Builder.() -> Unit): Unit =
        ibmDb2Settings(IbmDb2SettingsProperty(ibmDb2Settings))

    /**
     * Settings in JSON format for the target Apache Kafka endpoint.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kafka
     * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kafkasettings)
     * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint. 
     */
    override fun kafkaSettings(kafkaSettings: IResolvable) {
      cdkBuilder.kafkaSettings(kafkaSettings.let(IResolvable::unwrap))
    }

    /**
     * Settings in JSON format for the target Apache Kafka endpoint.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kafka
     * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kafkasettings)
     * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint. 
     */
    override fun kafkaSettings(kafkaSettings: KafkaSettingsProperty) {
      cdkBuilder.kafkaSettings(kafkaSettings.let(KafkaSettingsProperty::unwrap))
    }

    /**
     * Settings in JSON format for the target Apache Kafka endpoint.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kafka
     * topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kafkasettings)
     * @param kafkaSettings Settings in JSON format for the target Apache Kafka endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9ed867348022b36c7694b652e12b1cacfa29155ed279f155e9b6a8ede7b2075")
    override fun kafkaSettings(kafkaSettings: KafkaSettingsProperty.Builder.() -> Unit): Unit =
        kafkaSettings(KafkaSettingsProperty(kafkaSettings))

    /**
     * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kinesis data
     * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kinesissettings)
     * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis
     * Data Streams. 
     */
    override fun kinesisSettings(kinesisSettings: IResolvable) {
      cdkBuilder.kinesisSettings(kinesisSettings.let(IResolvable::unwrap))
    }

    /**
     * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kinesis data
     * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kinesissettings)
     * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis
     * Data Streams. 
     */
    override fun kinesisSettings(kinesisSettings: KinesisSettingsProperty) {
      cdkBuilder.kinesisSettings(kinesisSettings.let(KinesisSettingsProperty::unwrap))
    }

    /**
     * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams.
     *
     * For more information about other available settings, see [Using object mapping to migrate
     * data to a Kinesis data
     * stream](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kinesis.html#CHAP_Target.Kinesis.ObjectMapping)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kinesissettings)
     * @param kinesisSettings Settings in JSON format for the target endpoint for Amazon Kinesis
     * Data Streams. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96defed71e91fdb933b12d6dd79a8a2249d0156ed38c4ecfcd729da4e63e7bd2")
    override fun kinesisSettings(kinesisSettings: KinesisSettingsProperty.Builder.() -> Unit): Unit
        = kinesisSettings(KinesisSettingsProperty(kinesisSettings))

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
     * @param kmsKeyId An AWS KMS key identifier that is used to encrypt the connection parameters
     * for the endpoint. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

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
     * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
     * SQL Server endpoint. 
     */
    override fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable) {
      cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings.let(IResolvable::unwrap))
    }

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
     * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
     * SQL Server endpoint. 
     */
    override
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty) {
      cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings.let(MicrosoftSqlServerSettingsProperty::unwrap))
    }

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
     * @param microsoftSqlServerSettings Settings in JSON format for the source and target Microsoft
     * SQL Server endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adbf309f1b82d81fad56f56705008f24acb04801869f82f113e9ca86220eba07")
    override
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty.Builder.() -> Unit):
        Unit =
        microsoftSqlServerSettings(MicrosoftSqlServerSettingsProperty(microsoftSqlServerSettings))

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
    override fun mongoDbSettings(mongoDbSettings: IResolvable) {
      cdkBuilder.mongoDbSettings(mongoDbSettings.let(IResolvable::unwrap))
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
    override fun mongoDbSettings(mongoDbSettings: MongoDbSettingsProperty) {
      cdkBuilder.mongoDbSettings(mongoDbSettings.let(MongoDbSettingsProperty::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("050ff78e40a1395c73c5b4f2c039e024a8067554393984a41d14a33f0eac6cf4")
    override fun mongoDbSettings(mongoDbSettings: MongoDbSettingsProperty.Builder.() -> Unit): Unit
        = mongoDbSettings(MongoDbSettingsProperty(mongoDbSettings))

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
    override fun mySqlSettings(mySqlSettings: IResolvable) {
      cdkBuilder.mySqlSettings(mySqlSettings.let(IResolvable::unwrap))
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
    override fun mySqlSettings(mySqlSettings: MySqlSettingsProperty) {
      cdkBuilder.mySqlSettings(mySqlSettings.let(MySqlSettingsProperty::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c1ef3d7d8d9c26762a1b5268ba864ccfdce78bc3570d3083b6493d47e37b54")
    override fun mySqlSettings(mySqlSettings: MySqlSettingsProperty.Builder.() -> Unit): Unit =
        mySqlSettings(MySqlSettingsProperty(mySqlSettings))

    /**
     * Settings in JSON format for the target Amazon Neptune endpoint.
     *
     * For more information about the available settings, see [Specifying endpoint settings for
     * Amazon Neptune as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-neptunesettings)
     * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint. 
     */
    override fun neptuneSettings(neptuneSettings: IResolvable) {
      cdkBuilder.neptuneSettings(neptuneSettings.let(IResolvable::unwrap))
    }

    /**
     * Settings in JSON format for the target Amazon Neptune endpoint.
     *
     * For more information about the available settings, see [Specifying endpoint settings for
     * Amazon Neptune as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-neptunesettings)
     * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint. 
     */
    override fun neptuneSettings(neptuneSettings: NeptuneSettingsProperty) {
      cdkBuilder.neptuneSettings(neptuneSettings.let(NeptuneSettingsProperty::unwrap))
    }

    /**
     * Settings in JSON format for the target Amazon Neptune endpoint.
     *
     * For more information about the available settings, see [Specifying endpoint settings for
     * Amazon Neptune as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-neptunesettings)
     * @param neptuneSettings Settings in JSON format for the target Amazon Neptune endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f44b6d9df7919882c0942ce2d41354a6064d5c40384ff1834ce0fa81ae5d2bb7")
    override fun neptuneSettings(neptuneSettings: NeptuneSettingsProperty.Builder.() -> Unit): Unit
        = neptuneSettings(NeptuneSettingsProperty(neptuneSettings))

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
    override fun oracleSettings(oracleSettings: IResolvable) {
      cdkBuilder.oracleSettings(oracleSettings.let(IResolvable::unwrap))
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
    override fun oracleSettings(oracleSettings: OracleSettingsProperty) {
      cdkBuilder.oracleSettings(oracleSettings.let(OracleSettingsProperty::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf0444a7326a153335d36ebdb3dd8d1f3540e068cbdbf7f679c3a4032dccea88")
    override fun oracleSettings(oracleSettings: OracleSettingsProperty.Builder.() -> Unit): Unit =
        oracleSettings(OracleSettingsProperty(oracleSettings))

    /**
     * The password to be used to log in to the endpoint database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-password)
     * @param password The password to be used to log in to the endpoint database. 
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * The port used by the endpoint database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-port)
     * @param port The port used by the endpoint database. 
     */
    override fun port(port: Number) {
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
    override fun postgreSqlSettings(postgreSqlSettings: IResolvable) {
      cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(IResolvable::unwrap))
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
    override fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty) {
      cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(PostgreSqlSettingsProperty::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90679fdd6b6c393ffe4be191fbab0408dfed36b58b34c62d52ff4d5baccc34ce")
    override
        fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty.Builder.() -> Unit):
        Unit = postgreSqlSettings(PostgreSqlSettingsProperty(postgreSqlSettings))

    /**
     * Settings in JSON format for the target Redis endpoint.
     *
     * For information about other available settings, see [Specifying endpoint settings for Redis
     * as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redissettings)
     * @param redisSettings Settings in JSON format for the target Redis endpoint. 
     */
    override fun redisSettings(redisSettings: IResolvable) {
      cdkBuilder.redisSettings(redisSettings.let(IResolvable::unwrap))
    }

    /**
     * Settings in JSON format for the target Redis endpoint.
     *
     * For information about other available settings, see [Specifying endpoint settings for Redis
     * as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redissettings)
     * @param redisSettings Settings in JSON format for the target Redis endpoint. 
     */
    override fun redisSettings(redisSettings: RedisSettingsProperty) {
      cdkBuilder.redisSettings(redisSettings.let(RedisSettingsProperty::unwrap))
    }

    /**
     * Settings in JSON format for the target Redis endpoint.
     *
     * For information about other available settings, see [Specifying endpoint settings for Redis
     * as a
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-redissettings)
     * @param redisSettings Settings in JSON format for the target Redis endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57864a08b297d92b7b750737cdfc05fd8a6e6de6d220bb98b268830aefc86d30")
    override fun redisSettings(redisSettings: RedisSettingsProperty.Builder.() -> Unit): Unit =
        redisSettings(RedisSettingsProperty(redisSettings))

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
    override fun redshiftSettings(redshiftSettings: IResolvable) {
      cdkBuilder.redshiftSettings(redshiftSettings.let(IResolvable::unwrap))
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
    override fun redshiftSettings(redshiftSettings: RedshiftSettingsProperty) {
      cdkBuilder.redshiftSettings(redshiftSettings.let(RedshiftSettingsProperty::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11b670292b1e44ce7dda450ac19ef54cc289ada19014482359d029ad114fcb7e")
    override fun redshiftSettings(redshiftSettings: RedshiftSettingsProperty.Builder.() -> Unit):
        Unit = redshiftSettings(RedshiftSettingsProperty(redshiftSettings))

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
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     * `EndpointArn` response parameter that is returned in the created `Endpoint` object. 
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
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
    override fun s3Settings(s3Settings: IResolvable) {
      cdkBuilder.s3Settings(s3Settings.let(IResolvable::unwrap))
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
    override fun s3Settings(s3Settings: S3SettingsProperty) {
      cdkBuilder.s3Settings(s3Settings.let(S3SettingsProperty::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f3e786c777d40066e00740f0ac855a1f9f1dbcb38b044b134764b13af1cbcce")
    override fun s3Settings(s3Settings: S3SettingsProperty.Builder.() -> Unit): Unit =
        s3Settings(S3SettingsProperty(s3Settings))

    /**
     * The name of the server where the endpoint database resides.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-servername)
     * @param serverName The name of the server where the endpoint database resides. 
     */
    override fun serverName(serverName: String) {
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
    override fun sslMode(sslMode: String) {
      cdkBuilder.sslMode(sslMode)
    }

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
     * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint. 
     */
    override fun sybaseSettings(sybaseSettings: IResolvable) {
      cdkBuilder.sybaseSettings(sybaseSettings.let(IResolvable::unwrap))
    }

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
     * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint. 
     */
    override fun sybaseSettings(sybaseSettings: SybaseSettingsProperty) {
      cdkBuilder.sybaseSettings(sybaseSettings.let(SybaseSettingsProperty::unwrap))
    }

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
     * @param sybaseSettings Settings in JSON format for the source and target SAP ASE endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40dcc88d57b0b2dd6f75aa352d9dae019e3e8de6e8a1892482e39a7ef92fe742")
    override fun sybaseSettings(sybaseSettings: SybaseSettingsProperty.Builder.() -> Unit): Unit =
        sybaseSettings(SybaseSettingsProperty(sybaseSettings))

    /**
     * One or more tags to be assigned to the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags)
     * @param tags One or more tags to be assigned to the endpoint. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * One or more tags to be assigned to the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags)
     * @param tags One or more tags to be assigned to the endpoint. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The user name to be used to log in to the endpoint database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-username)
     * @param username The user name to be used to log in to the endpoint database. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dms.CfnEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint): CfnEndpoint =
        CfnEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnEndpoint): software.amazon.awscdk.services.dms.CfnEndpoint =
        wrapped.cdkObject
  }

  public interface MySqlSettingsProperty {
    /**
     * Specifies a script to run immediately after AWS DMS connects to the endpoint.
     *
     * The migration task continues running regardless if the SQL statement succeeds or fails.
     *
     * For this parameter, provide the code of the script itself, not the name of a file containing
     * the script.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-afterconnectscript)
     */
    public fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

    /**
     * Cleans and recreates table metadata information on the replication instance when a mismatch
     * occurs.
     *
     * For example, in a situation where running an alter DDL on the table could result in different
     * information about the table cached in the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-cleansourcemetadataonmismatch)
     */
    public fun cleanSourceMetadataOnMismatch(): Any? =
        unwrap(this).getCleanSourceMetadataOnMismatch()

    /**
     * Specifies how often to check the binary log for new changes/events when the database is idle.
     *
     * The default is five seconds.
     *
     * Example: `eventsPollInterval=5;`
     *
     * In the example, AWS DMS checks for changes in the binary logs every five seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-eventspollinterval)
     */
    public fun eventsPollInterval(): Number? = unwrap(this).getEventsPollInterval()

    /**
     * Specifies the maximum size (in KB) of any .csv file used to transfer data to a
     * MySQL-compatible database.
     *
     * Example: `maxFileSize=512`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-maxfilesize)
     */
    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    /**
     * Improves performance when loading data into the MySQL-compatible target database.
     *
     * Specifies how many threads to use to load the data into the MySQL-compatible target database.
     * Setting a large number of threads can have an adverse effect on database performance, because a
     * separate connection is required for each thread. The default is one.
     *
     * Example: `parallelLoadThreads=1`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-parallelloadthreads)
     */
    public fun parallelLoadThreads(): Number? = unwrap(this).getParallelLoadThreads()

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
     * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
     *
     * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
     * AWS Secrets Manager secret that allows access to the MySQL endpoint.
     *
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
     * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
     *
     * For more information on creating this `SecretsManagerSecret` , the corresponding
     * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access it,
     * see [Using secrets to access AWS Database Migration Service
     * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-secretsmanageraccessrolearn)
     */
    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    /**
     * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
     * MySQL endpoint connection details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-secretsmanagersecretid)
     */
    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    /**
     * Specifies the time zone for the source MySQL database.
     *
     * Example: `serverTimezone=US/Pacific;`
     *
     * Note: Do not enclose time zones in single quotes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-servertimezone)
     */
    public fun serverTimezone(): String? = unwrap(this).getServerTimezone()

    /**
     * Specifies where to migrate source tables on the target, either to a single database or
     * multiple databases.
     *
     * If you specify `SPECIFIC_DATABASE` , specify the database name using the `DatabaseName`
     * parameter of the `Endpoint` object.
     *
     * Example: `targetDbType=MULTIPLE_DATABASES`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-targetdbtype)
     */
    public fun targetDbType(): String? = unwrap(this).getTargetDbType()

    /**
     * A builder for [MySqlSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param afterConnectScript Specifies a script to run immediately after AWS DMS connects to
       * the endpoint.
       * The migration task continues running regardless if the SQL statement succeeds or fails.
       *
       * For this parameter, provide the code of the script itself, not the name of a file
       * containing the script.
       */
      public fun afterConnectScript(afterConnectScript: String)

      /**
       * @param cleanSourceMetadataOnMismatch Cleans and recreates table metadata information on the
       * replication instance when a mismatch occurs.
       * For example, in a situation where running an alter DDL on the table could result in
       * different information about the table cached in the replication instance.
       */
      public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean)

      /**
       * @param cleanSourceMetadataOnMismatch Cleans and recreates table metadata information on the
       * replication instance when a mismatch occurs.
       * For example, in a situation where running an alter DDL on the table could result in
       * different information about the table cached in the replication instance.
       */
      public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable)

      /**
       * @param eventsPollInterval Specifies how often to check the binary log for new
       * changes/events when the database is idle.
       * The default is five seconds.
       *
       * Example: `eventsPollInterval=5;`
       *
       * In the example, AWS DMS checks for changes in the binary logs every five seconds.
       */
      public fun eventsPollInterval(eventsPollInterval: Number)

      /**
       * @param maxFileSize Specifies the maximum size (in KB) of any .csv file used to transfer
       * data to a MySQL-compatible database.
       * Example: `maxFileSize=512`
       */
      public fun maxFileSize(maxFileSize: Number)

      /**
       * @param parallelLoadThreads Improves performance when loading data into the MySQL-compatible
       * target database.
       * Specifies how many threads to use to load the data into the MySQL-compatible target
       * database. Setting a large number of threads can have an adverse effect on database
       * performance, because a separate connection is required for each thread. The default is one.
       *
       * Example: `parallelLoadThreads=1`
       */
      public fun parallelLoadThreads(parallelLoadThreads: Number)

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the MySQL endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the MySQL endpoint connection details.
       */
      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      /**
       * @param serverTimezone Specifies the time zone for the source MySQL database.
       * Example: `serverTimezone=US/Pacific;`
       *
       * Note: Do not enclose time zones in single quotes.
       */
      public fun serverTimezone(serverTimezone: String)

      /**
       * @param targetDbType Specifies where to migrate source tables on the target, either to a
       * single database or multiple databases.
       * If you specify `SPECIFIC_DATABASE` , specify the database name using the `DatabaseName`
       * parameter of the `Endpoint` object.
       *
       * Example: `targetDbType=MULTIPLE_DATABASES`
       */
      public fun targetDbType(targetDbType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty.builder()

      /**
       * @param afterConnectScript Specifies a script to run immediately after AWS DMS connects to
       * the endpoint.
       * The migration task continues running regardless if the SQL statement succeeds or fails.
       *
       * For this parameter, provide the code of the script itself, not the name of a file
       * containing the script.
       */
      override fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
      }

      /**
       * @param cleanSourceMetadataOnMismatch Cleans and recreates table metadata information on the
       * replication instance when a mismatch occurs.
       * For example, in a situation where running an alter DDL on the table could result in
       * different information about the table cached in the replication instance.
       */
      override fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch)
      }

      /**
       * @param cleanSourceMetadataOnMismatch Cleans and recreates table metadata information on the
       * replication instance when a mismatch occurs.
       * For example, in a situation where running an alter DDL on the table could result in
       * different information about the table cached in the replication instance.
       */
      override fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch.let(IResolvable::unwrap))
      }

      /**
       * @param eventsPollInterval Specifies how often to check the binary log for new
       * changes/events when the database is idle.
       * The default is five seconds.
       *
       * Example: `eventsPollInterval=5;`
       *
       * In the example, AWS DMS checks for changes in the binary logs every five seconds.
       */
      override fun eventsPollInterval(eventsPollInterval: Number) {
        cdkBuilder.eventsPollInterval(eventsPollInterval)
      }

      /**
       * @param maxFileSize Specifies the maximum size (in KB) of any .csv file used to transfer
       * data to a MySQL-compatible database.
       * Example: `maxFileSize=512`
       */
      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      /**
       * @param parallelLoadThreads Improves performance when loading data into the MySQL-compatible
       * target database.
       * Specifies how many threads to use to load the data into the MySQL-compatible target
       * database. Setting a large number of threads can have an adverse effect on database
       * performance, because a separate connection is required for each thread. The default is one.
       *
       * Example: `parallelLoadThreads=1`
       */
      override fun parallelLoadThreads(parallelLoadThreads: Number) {
        cdkBuilder.parallelLoadThreads(parallelLoadThreads)
      }

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the MySQL endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the MySQL endpoint connection details.
       */
      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      /**
       * @param serverTimezone Specifies the time zone for the source MySQL database.
       * Example: `serverTimezone=US/Pacific;`
       *
       * Note: Do not enclose time zones in single quotes.
       */
      override fun serverTimezone(serverTimezone: String) {
        cdkBuilder.serverTimezone(serverTimezone)
      }

      /**
       * @param targetDbType Specifies where to migrate source tables on the target, either to a
       * single database or multiple databases.
       * If you specify `SPECIFIC_DATABASE` , specify the database name using the `DatabaseName`
       * parameter of the `Endpoint` object.
       *
       * Example: `targetDbType=MULTIPLE_DATABASES`
       */
      override fun targetDbType(targetDbType: String) {
        cdkBuilder.targetDbType(targetDbType)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty,
    ) : CdkObject(cdkObject), MySqlSettingsProperty {
      /**
       * Specifies a script to run immediately after AWS DMS connects to the endpoint.
       *
       * The migration task continues running regardless if the SQL statement succeeds or fails.
       *
       * For this parameter, provide the code of the script itself, not the name of a file
       * containing the script.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-afterconnectscript)
       */
      override fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

      /**
       * Cleans and recreates table metadata information on the replication instance when a mismatch
       * occurs.
       *
       * For example, in a situation where running an alter DDL on the table could result in
       * different information about the table cached in the replication instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-cleansourcemetadataonmismatch)
       */
      override fun cleanSourceMetadataOnMismatch(): Any? =
          unwrap(this).getCleanSourceMetadataOnMismatch()

      /**
       * Specifies how often to check the binary log for new changes/events when the database is
       * idle.
       *
       * The default is five seconds.
       *
       * Example: `eventsPollInterval=5;`
       *
       * In the example, AWS DMS checks for changes in the binary logs every five seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-eventspollinterval)
       */
      override fun eventsPollInterval(): Number? = unwrap(this).getEventsPollInterval()

      /**
       * Specifies the maximum size (in KB) of any .csv file used to transfer data to a
       * MySQL-compatible database.
       *
       * Example: `maxFileSize=512`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-maxfilesize)
       */
      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      /**
       * Improves performance when loading data into the MySQL-compatible target database.
       *
       * Specifies how many threads to use to load the data into the MySQL-compatible target
       * database. Setting a large number of threads can have an adverse effect on database
       * performance, because a separate connection is required for each thread. The default is one.
       *
       * Example: `parallelLoadThreads=1`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-parallelloadthreads)
       */
      override fun parallelLoadThreads(): Number? = unwrap(this).getParallelLoadThreads()

      /**
       * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
       * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
       *
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the MySQL endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-secretsmanageraccessrolearn)
       */
      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      /**
       * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
       * MySQL endpoint connection details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-secretsmanagersecretid)
       */
      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      /**
       * Specifies the time zone for the source MySQL database.
       *
       * Example: `serverTimezone=US/Pacific;`
       *
       * Note: Do not enclose time zones in single quotes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-servertimezone)
       */
      override fun serverTimezone(): String? = unwrap(this).getServerTimezone()

      /**
       * Specifies where to migrate source tables on the target, either to a single database or
       * multiple databases.
       *
       * If you specify `SPECIFIC_DATABASE` , specify the database name using the `DatabaseName`
       * parameter of the `Endpoint` object.
       *
       * Example: `targetDbType=MULTIPLE_DATABASES`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html#cfn-dms-endpoint-mysqlsettings-targetdbtype)
       */
      override fun targetDbType(): String? = unwrap(this).getTargetDbType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MySqlSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty):
          MySqlSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MySqlSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty
    }
  }

  public interface DynamoDbSettingsProperty {
    /**
     * The Amazon Resource Name (ARN) used by the service to access the IAM role.
     *
     * The role must allow the `iam:PassRole` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html#cfn-dms-endpoint-dynamodbsettings-serviceaccessrolearn)
     */
    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    /**
     * A builder for [DynamoDbSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serviceAccessRoleArn The Amazon Resource Name (ARN) used by the service to access
       * the IAM role.
       * The role must allow the `iam:PassRole` action.
       */
      public fun serviceAccessRoleArn(serviceAccessRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty.builder()

      /**
       * @param serviceAccessRoleArn The Amazon Resource Name (ARN) used by the service to access
       * the IAM role.
       * The role must allow the `iam:PassRole` action.
       */
      override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty,
    ) : CdkObject(cdkObject), DynamoDbSettingsProperty {
      /**
       * The Amazon Resource Name (ARN) used by the service to access the IAM role.
       *
       * The role must allow the `iam:PassRole` action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html#cfn-dms-endpoint-dynamodbsettings-serviceaccessrolearn)
       */
      override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDbSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty):
          DynamoDbSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDbSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty
    }
  }

  public interface KafkaSettingsProperty {
    /**
     * A comma-separated list of one or more broker locations in your Kafka cluster that host your
     * Kafka instance.
     *
     * Specify each broker location in the form `*broker-hostname-or-ip* : *port*` . For example,
     * `"ec2-12-345-678-901.compute-1.amazonaws.com:2345"` . For more information and examples of
     * specifying a list of broker locations, see [Using Apache Kafka as a target for AWS Database
     * Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html) in
     * the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-broker)
     */
    public fun broker(): String? = unwrap(this).getBroker()

    /**
     * Shows detailed control information for table definition, column definition, and table and
     * column changes in the Kafka message output.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-includecontroldetails)
     */
    public fun includeControlDetails(): Any? = unwrap(this).getIncludeControlDetails()

    /**
     * Include NULL and empty columns for records migrated to the endpoint.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-includenullandempty)
     */
    public fun includeNullAndEmpty(): Any? = unwrap(this).getIncludeNullAndEmpty()

    /**
     * Shows the partition value within the Kafka message output unless the partition type is
     * `schema-table-type` .
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-includepartitionvalue)
     */
    public fun includePartitionValue(): Any? = unwrap(this).getIncludePartitionValue()

    /**
     * Includes any data definition language (DDL) operations that change the table in the control
     * data, such as `rename-table` , `drop-table` , `add-column` , `drop-column` , and `rename-column`
     * .
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-includetablealteroperations)
     */
    public fun includeTableAlterOperations(): Any? = unwrap(this).getIncludeTableAlterOperations()

    /**
     * Provides detailed transaction information from the source database.
     *
     * This information includes a commit timestamp, a log position, and values for `transaction_id`
     * , previous `transaction_id` , and `transaction_record_id` (the record offset within a
     * transaction). The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-includetransactiondetails)
     */
    public fun includeTransactionDetails(): Any? = unwrap(this).getIncludeTransactionDetails()

    /**
     * The output format for the records created on the endpoint.
     *
     * The message format is `JSON` (default) or `JSON_UNFORMATTED` (a single line with no tab).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-messageformat)
     */
    public fun messageFormat(): String? = unwrap(this).getMessageFormat()

    /**
     * The maximum size in bytes for records created on the endpoint The default is 1,000,000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-messagemaxbytes)
     */
    public fun messageMaxBytes(): Number? = unwrap(this).getMessageMaxBytes()

    /**
     * Set this optional parameter to `true` to avoid adding a '0x' prefix to raw data in
     * hexadecimal format.
     *
     * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
     * format moving from an Oracle source to a Kafka target. Use the `NoHexPrefix` endpoint setting to
     * enable migration of RAW data type columns without adding the '0x' prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-nohexprefix)
     */
    public fun noHexPrefix(): Any? = unwrap(this).getNoHexPrefix()

    /**
     * Prefixes schema and table names to partition values, when the partition type is
     * `primary-key-type` .
     *
     * Doing this increases data distribution among Kafka partitions. For example, suppose that a
     * SysBench schema has thousands of tables and each table has only limited range for a primary key.
     * In this case, the same primary key is sent from thousands of tables to the same partition, which
     * causes throttling. The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-partitionincludeschematable)
     */
    public fun partitionIncludeSchemaTable(): Any? = unwrap(this).getPartitionIncludeSchemaTable()

    /**
     * The secure password that you created when you first set up your Amazon MSK cluster to
     * validate a client identity and make an encrypted connection between server and client using
     * SASL-SSL authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-saslpassword)
     */
    public fun saslPassword(): String? = unwrap(this).getSaslPassword()

    /**
     * The secure user name you created when you first set up your Amazon MSK cluster to validate a
     * client identity and make an encrypted connection between server and client using SASL-SSL
     * authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-saslusername)
     */
    public fun saslUserName(): String? = unwrap(this).getSaslUserName()

    /**
     * Set secure connection to a Kafka target endpoint using Transport Layer Security (TLS).
     *
     * Options include `ssl-encryption` , `ssl-authentication` , and `sasl-ssl` . `sasl-ssl`
     * requires `SaslUsername` and `SaslPassword` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-securityprotocol)
     */
    public fun securityProtocol(): String? = unwrap(this).getSecurityProtocol()

    /**
     * The Amazon Resource Name (ARN) for the private certificate authority (CA) cert that AWS DMS
     * uses to securely connect to your Kafka target endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-sslcacertificatearn)
     */
    public fun sslCaCertificateArn(): String? = unwrap(this).getSslCaCertificateArn()

    /**
     * The Amazon Resource Name (ARN) of the client certificate used to securely connect to a Kafka
     * target endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-sslclientcertificatearn)
     */
    public fun sslClientCertificateArn(): String? = unwrap(this).getSslClientCertificateArn()

    /**
     * The Amazon Resource Name (ARN) for the client private key used to securely connect to a Kafka
     * target endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-sslclientkeyarn)
     */
    public fun sslClientKeyArn(): String? = unwrap(this).getSslClientKeyArn()

    /**
     * The password for the client private key used to securely connect to a Kafka target endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-sslclientkeypassword)
     */
    public fun sslClientKeyPassword(): String? = unwrap(this).getSslClientKeyPassword()

    /**
     * The topic to which you migrate the data.
     *
     * If you don't specify a topic, AWS DMS specifies `"kafka-default-topic"` as the migration
     * topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-topic)
     */
    public fun topic(): String? = unwrap(this).getTopic()

    /**
     * A builder for [KafkaSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param broker A comma-separated list of one or more broker locations in your Kafka cluster
       * that host your Kafka instance.
       * Specify each broker location in the form `*broker-hostname-or-ip* : *port*` . For example,
       * `"ec2-12-345-678-901.compute-1.amazonaws.com:2345"` . For more information and examples of
       * specifying a list of broker locations, see [Using Apache Kafka as a target for AWS Database
       * Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html) in
       * the *AWS Database Migration Service User Guide* .
       */
      public fun broker(broker: String)

      /**
       * @param includeControlDetails Shows detailed control information for table definition,
       * column definition, and table and column changes in the Kafka message output.
       * The default is `false` .
       */
      public fun includeControlDetails(includeControlDetails: Boolean)

      /**
       * @param includeControlDetails Shows detailed control information for table definition,
       * column definition, and table and column changes in the Kafka message output.
       * The default is `false` .
       */
      public fun includeControlDetails(includeControlDetails: IResolvable)

      /**
       * @param includeNullAndEmpty Include NULL and empty columns for records migrated to the
       * endpoint.
       * The default is `false` .
       */
      public fun includeNullAndEmpty(includeNullAndEmpty: Boolean)

      /**
       * @param includeNullAndEmpty Include NULL and empty columns for records migrated to the
       * endpoint.
       * The default is `false` .
       */
      public fun includeNullAndEmpty(includeNullAndEmpty: IResolvable)

      /**
       * @param includePartitionValue Shows the partition value within the Kafka message output
       * unless the partition type is `schema-table-type` .
       * The default is `false` .
       */
      public fun includePartitionValue(includePartitionValue: Boolean)

      /**
       * @param includePartitionValue Shows the partition value within the Kafka message output
       * unless the partition type is `schema-table-type` .
       * The default is `false` .
       */
      public fun includePartitionValue(includePartitionValue: IResolvable)

      /**
       * @param includeTableAlterOperations Includes any data definition language (DDL) operations
       * that change the table in the control data, such as `rename-table` , `drop-table` ,
       * `add-column` , `drop-column` , and `rename-column` .
       * The default is `false` .
       */
      public fun includeTableAlterOperations(includeTableAlterOperations: Boolean)

      /**
       * @param includeTableAlterOperations Includes any data definition language (DDL) operations
       * that change the table in the control data, such as `rename-table` , `drop-table` ,
       * `add-column` , `drop-column` , and `rename-column` .
       * The default is `false` .
       */
      public fun includeTableAlterOperations(includeTableAlterOperations: IResolvable)

      /**
       * @param includeTransactionDetails Provides detailed transaction information from the source
       * database.
       * This information includes a commit timestamp, a log position, and values for
       * `transaction_id` , previous `transaction_id` , and `transaction_record_id` (the record offset
       * within a transaction). The default is `false` .
       */
      public fun includeTransactionDetails(includeTransactionDetails: Boolean)

      /**
       * @param includeTransactionDetails Provides detailed transaction information from the source
       * database.
       * This information includes a commit timestamp, a log position, and values for
       * `transaction_id` , previous `transaction_id` , and `transaction_record_id` (the record offset
       * within a transaction). The default is `false` .
       */
      public fun includeTransactionDetails(includeTransactionDetails: IResolvable)

      /**
       * @param messageFormat The output format for the records created on the endpoint.
       * The message format is `JSON` (default) or `JSON_UNFORMATTED` (a single line with no tab).
       */
      public fun messageFormat(messageFormat: String)

      /**
       * @param messageMaxBytes The maximum size in bytes for records created on the endpoint The
       * default is 1,000,000.
       */
      public fun messageMaxBytes(messageMaxBytes: Number)

      /**
       * @param noHexPrefix Set this optional parameter to `true` to avoid adding a '0x' prefix to
       * raw data in hexadecimal format.
       * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
       * format moving from an Oracle source to a Kafka target. Use the `NoHexPrefix` endpoint setting
       * to enable migration of RAW data type columns without adding the '0x' prefix.
       */
      public fun noHexPrefix(noHexPrefix: Boolean)

      /**
       * @param noHexPrefix Set this optional parameter to `true` to avoid adding a '0x' prefix to
       * raw data in hexadecimal format.
       * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
       * format moving from an Oracle source to a Kafka target. Use the `NoHexPrefix` endpoint setting
       * to enable migration of RAW data type columns without adding the '0x' prefix.
       */
      public fun noHexPrefix(noHexPrefix: IResolvable)

      /**
       * @param partitionIncludeSchemaTable Prefixes schema and table names to partition values,
       * when the partition type is `primary-key-type` .
       * Doing this increases data distribution among Kafka partitions. For example, suppose that a
       * SysBench schema has thousands of tables and each table has only limited range for a primary
       * key. In this case, the same primary key is sent from thousands of tables to the same
       * partition, which causes throttling. The default is `false` .
       */
      public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean)

      /**
       * @param partitionIncludeSchemaTable Prefixes schema and table names to partition values,
       * when the partition type is `primary-key-type` .
       * Doing this increases data distribution among Kafka partitions. For example, suppose that a
       * SysBench schema has thousands of tables and each table has only limited range for a primary
       * key. In this case, the same primary key is sent from thousands of tables to the same
       * partition, which causes throttling. The default is `false` .
       */
      public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable)

      /**
       * @param saslPassword The secure password that you created when you first set up your Amazon
       * MSK cluster to validate a client identity and make an encrypted connection between server and
       * client using SASL-SSL authentication.
       */
      public fun saslPassword(saslPassword: String)

      /**
       * @param saslUserName The secure user name you created when you first set up your Amazon MSK
       * cluster to validate a client identity and make an encrypted connection between server and
       * client using SASL-SSL authentication.
       */
      public fun saslUserName(saslUserName: String)

      /**
       * @param securityProtocol Set secure connection to a Kafka target endpoint using Transport
       * Layer Security (TLS).
       * Options include `ssl-encryption` , `ssl-authentication` , and `sasl-ssl` . `sasl-ssl`
       * requires `SaslUsername` and `SaslPassword` .
       */
      public fun securityProtocol(securityProtocol: String)

      /**
       * @param sslCaCertificateArn The Amazon Resource Name (ARN) for the private certificate
       * authority (CA) cert that AWS DMS uses to securely connect to your Kafka target endpoint.
       */
      public fun sslCaCertificateArn(sslCaCertificateArn: String)

      /**
       * @param sslClientCertificateArn The Amazon Resource Name (ARN) of the client certificate
       * used to securely connect to a Kafka target endpoint.
       */
      public fun sslClientCertificateArn(sslClientCertificateArn: String)

      /**
       * @param sslClientKeyArn The Amazon Resource Name (ARN) for the client private key used to
       * securely connect to a Kafka target endpoint.
       */
      public fun sslClientKeyArn(sslClientKeyArn: String)

      /**
       * @param sslClientKeyPassword The password for the client private key used to securely
       * connect to a Kafka target endpoint.
       */
      public fun sslClientKeyPassword(sslClientKeyPassword: String)

      /**
       * @param topic The topic to which you migrate the data.
       * If you don't specify a topic, AWS DMS specifies `"kafka-default-topic"` as the migration
       * topic.
       */
      public fun topic(topic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty.builder()

      /**
       * @param broker A comma-separated list of one or more broker locations in your Kafka cluster
       * that host your Kafka instance.
       * Specify each broker location in the form `*broker-hostname-or-ip* : *port*` . For example,
       * `"ec2-12-345-678-901.compute-1.amazonaws.com:2345"` . For more information and examples of
       * specifying a list of broker locations, see [Using Apache Kafka as a target for AWS Database
       * Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html) in
       * the *AWS Database Migration Service User Guide* .
       */
      override fun broker(broker: String) {
        cdkBuilder.broker(broker)
      }

      /**
       * @param includeControlDetails Shows detailed control information for table definition,
       * column definition, and table and column changes in the Kafka message output.
       * The default is `false` .
       */
      override fun includeControlDetails(includeControlDetails: Boolean) {
        cdkBuilder.includeControlDetails(includeControlDetails)
      }

      /**
       * @param includeControlDetails Shows detailed control information for table definition,
       * column definition, and table and column changes in the Kafka message output.
       * The default is `false` .
       */
      override fun includeControlDetails(includeControlDetails: IResolvable) {
        cdkBuilder.includeControlDetails(includeControlDetails.let(IResolvable::unwrap))
      }

      /**
       * @param includeNullAndEmpty Include NULL and empty columns for records migrated to the
       * endpoint.
       * The default is `false` .
       */
      override fun includeNullAndEmpty(includeNullAndEmpty: Boolean) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty)
      }

      /**
       * @param includeNullAndEmpty Include NULL and empty columns for records migrated to the
       * endpoint.
       * The default is `false` .
       */
      override fun includeNullAndEmpty(includeNullAndEmpty: IResolvable) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty.let(IResolvable::unwrap))
      }

      /**
       * @param includePartitionValue Shows the partition value within the Kafka message output
       * unless the partition type is `schema-table-type` .
       * The default is `false` .
       */
      override fun includePartitionValue(includePartitionValue: Boolean) {
        cdkBuilder.includePartitionValue(includePartitionValue)
      }

      /**
       * @param includePartitionValue Shows the partition value within the Kafka message output
       * unless the partition type is `schema-table-type` .
       * The default is `false` .
       */
      override fun includePartitionValue(includePartitionValue: IResolvable) {
        cdkBuilder.includePartitionValue(includePartitionValue.let(IResolvable::unwrap))
      }

      /**
       * @param includeTableAlterOperations Includes any data definition language (DDL) operations
       * that change the table in the control data, such as `rename-table` , `drop-table` ,
       * `add-column` , `drop-column` , and `rename-column` .
       * The default is `false` .
       */
      override fun includeTableAlterOperations(includeTableAlterOperations: Boolean) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations)
      }

      /**
       * @param includeTableAlterOperations Includes any data definition language (DDL) operations
       * that change the table in the control data, such as `rename-table` , `drop-table` ,
       * `add-column` , `drop-column` , and `rename-column` .
       * The default is `false` .
       */
      override fun includeTableAlterOperations(includeTableAlterOperations: IResolvable) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations.let(IResolvable::unwrap))
      }

      /**
       * @param includeTransactionDetails Provides detailed transaction information from the source
       * database.
       * This information includes a commit timestamp, a log position, and values for
       * `transaction_id` , previous `transaction_id` , and `transaction_record_id` (the record offset
       * within a transaction). The default is `false` .
       */
      override fun includeTransactionDetails(includeTransactionDetails: Boolean) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails)
      }

      /**
       * @param includeTransactionDetails Provides detailed transaction information from the source
       * database.
       * This information includes a commit timestamp, a log position, and values for
       * `transaction_id` , previous `transaction_id` , and `transaction_record_id` (the record offset
       * within a transaction). The default is `false` .
       */
      override fun includeTransactionDetails(includeTransactionDetails: IResolvable) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails.let(IResolvable::unwrap))
      }

      /**
       * @param messageFormat The output format for the records created on the endpoint.
       * The message format is `JSON` (default) or `JSON_UNFORMATTED` (a single line with no tab).
       */
      override fun messageFormat(messageFormat: String) {
        cdkBuilder.messageFormat(messageFormat)
      }

      /**
       * @param messageMaxBytes The maximum size in bytes for records created on the endpoint The
       * default is 1,000,000.
       */
      override fun messageMaxBytes(messageMaxBytes: Number) {
        cdkBuilder.messageMaxBytes(messageMaxBytes)
      }

      /**
       * @param noHexPrefix Set this optional parameter to `true` to avoid adding a '0x' prefix to
       * raw data in hexadecimal format.
       * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
       * format moving from an Oracle source to a Kafka target. Use the `NoHexPrefix` endpoint setting
       * to enable migration of RAW data type columns without adding the '0x' prefix.
       */
      override fun noHexPrefix(noHexPrefix: Boolean) {
        cdkBuilder.noHexPrefix(noHexPrefix)
      }

      /**
       * @param noHexPrefix Set this optional parameter to `true` to avoid adding a '0x' prefix to
       * raw data in hexadecimal format.
       * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
       * format moving from an Oracle source to a Kafka target. Use the `NoHexPrefix` endpoint setting
       * to enable migration of RAW data type columns without adding the '0x' prefix.
       */
      override fun noHexPrefix(noHexPrefix: IResolvable) {
        cdkBuilder.noHexPrefix(noHexPrefix.let(IResolvable::unwrap))
      }

      /**
       * @param partitionIncludeSchemaTable Prefixes schema and table names to partition values,
       * when the partition type is `primary-key-type` .
       * Doing this increases data distribution among Kafka partitions. For example, suppose that a
       * SysBench schema has thousands of tables and each table has only limited range for a primary
       * key. In this case, the same primary key is sent from thousands of tables to the same
       * partition, which causes throttling. The default is `false` .
       */
      override fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable)
      }

      /**
       * @param partitionIncludeSchemaTable Prefixes schema and table names to partition values,
       * when the partition type is `primary-key-type` .
       * Doing this increases data distribution among Kafka partitions. For example, suppose that a
       * SysBench schema has thousands of tables and each table has only limited range for a primary
       * key. In this case, the same primary key is sent from thousands of tables to the same
       * partition, which causes throttling. The default is `false` .
       */
      override fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable.let(IResolvable::unwrap))
      }

      /**
       * @param saslPassword The secure password that you created when you first set up your Amazon
       * MSK cluster to validate a client identity and make an encrypted connection between server and
       * client using SASL-SSL authentication.
       */
      override fun saslPassword(saslPassword: String) {
        cdkBuilder.saslPassword(saslPassword)
      }

      /**
       * @param saslUserName The secure user name you created when you first set up your Amazon MSK
       * cluster to validate a client identity and make an encrypted connection between server and
       * client using SASL-SSL authentication.
       */
      override fun saslUserName(saslUserName: String) {
        cdkBuilder.saslUserName(saslUserName)
      }

      /**
       * @param securityProtocol Set secure connection to a Kafka target endpoint using Transport
       * Layer Security (TLS).
       * Options include `ssl-encryption` , `ssl-authentication` , and `sasl-ssl` . `sasl-ssl`
       * requires `SaslUsername` and `SaslPassword` .
       */
      override fun securityProtocol(securityProtocol: String) {
        cdkBuilder.securityProtocol(securityProtocol)
      }

      /**
       * @param sslCaCertificateArn The Amazon Resource Name (ARN) for the private certificate
       * authority (CA) cert that AWS DMS uses to securely connect to your Kafka target endpoint.
       */
      override fun sslCaCertificateArn(sslCaCertificateArn: String) {
        cdkBuilder.sslCaCertificateArn(sslCaCertificateArn)
      }

      /**
       * @param sslClientCertificateArn The Amazon Resource Name (ARN) of the client certificate
       * used to securely connect to a Kafka target endpoint.
       */
      override fun sslClientCertificateArn(sslClientCertificateArn: String) {
        cdkBuilder.sslClientCertificateArn(sslClientCertificateArn)
      }

      /**
       * @param sslClientKeyArn The Amazon Resource Name (ARN) for the client private key used to
       * securely connect to a Kafka target endpoint.
       */
      override fun sslClientKeyArn(sslClientKeyArn: String) {
        cdkBuilder.sslClientKeyArn(sslClientKeyArn)
      }

      /**
       * @param sslClientKeyPassword The password for the client private key used to securely
       * connect to a Kafka target endpoint.
       */
      override fun sslClientKeyPassword(sslClientKeyPassword: String) {
        cdkBuilder.sslClientKeyPassword(sslClientKeyPassword)
      }

      /**
       * @param topic The topic to which you migrate the data.
       * If you don't specify a topic, AWS DMS specifies `"kafka-default-topic"` as the migration
       * topic.
       */
      override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty,
    ) : CdkObject(cdkObject), KafkaSettingsProperty {
      /**
       * A comma-separated list of one or more broker locations in your Kafka cluster that host your
       * Kafka instance.
       *
       * Specify each broker location in the form `*broker-hostname-or-ip* : *port*` . For example,
       * `"ec2-12-345-678-901.compute-1.amazonaws.com:2345"` . For more information and examples of
       * specifying a list of broker locations, see [Using Apache Kafka as a target for AWS Database
       * Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html) in
       * the *AWS Database Migration Service User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-broker)
       */
      override fun broker(): String? = unwrap(this).getBroker()

      /**
       * Shows detailed control information for table definition, column definition, and table and
       * column changes in the Kafka message output.
       *
       * The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-includecontroldetails)
       */
      override fun includeControlDetails(): Any? = unwrap(this).getIncludeControlDetails()

      /**
       * Include NULL and empty columns for records migrated to the endpoint.
       *
       * The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-includenullandempty)
       */
      override fun includeNullAndEmpty(): Any? = unwrap(this).getIncludeNullAndEmpty()

      /**
       * Shows the partition value within the Kafka message output unless the partition type is
       * `schema-table-type` .
       *
       * The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-includepartitionvalue)
       */
      override fun includePartitionValue(): Any? = unwrap(this).getIncludePartitionValue()

      /**
       * Includes any data definition language (DDL) operations that change the table in the control
       * data, such as `rename-table` , `drop-table` , `add-column` , `drop-column` , and
       * `rename-column` .
       *
       * The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-includetablealteroperations)
       */
      override fun includeTableAlterOperations(): Any? =
          unwrap(this).getIncludeTableAlterOperations()

      /**
       * Provides detailed transaction information from the source database.
       *
       * This information includes a commit timestamp, a log position, and values for
       * `transaction_id` , previous `transaction_id` , and `transaction_record_id` (the record offset
       * within a transaction). The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-includetransactiondetails)
       */
      override fun includeTransactionDetails(): Any? = unwrap(this).getIncludeTransactionDetails()

      /**
       * The output format for the records created on the endpoint.
       *
       * The message format is `JSON` (default) or `JSON_UNFORMATTED` (a single line with no tab).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-messageformat)
       */
      override fun messageFormat(): String? = unwrap(this).getMessageFormat()

      /**
       * The maximum size in bytes for records created on the endpoint The default is 1,000,000.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-messagemaxbytes)
       */
      override fun messageMaxBytes(): Number? = unwrap(this).getMessageMaxBytes()

      /**
       * Set this optional parameter to `true` to avoid adding a '0x' prefix to raw data in
       * hexadecimal format.
       *
       * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
       * format moving from an Oracle source to a Kafka target. Use the `NoHexPrefix` endpoint setting
       * to enable migration of RAW data type columns without adding the '0x' prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-nohexprefix)
       */
      override fun noHexPrefix(): Any? = unwrap(this).getNoHexPrefix()

      /**
       * Prefixes schema and table names to partition values, when the partition type is
       * `primary-key-type` .
       *
       * Doing this increases data distribution among Kafka partitions. For example, suppose that a
       * SysBench schema has thousands of tables and each table has only limited range for a primary
       * key. In this case, the same primary key is sent from thousands of tables to the same
       * partition, which causes throttling. The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-partitionincludeschematable)
       */
      override fun partitionIncludeSchemaTable(): Any? =
          unwrap(this).getPartitionIncludeSchemaTable()

      /**
       * The secure password that you created when you first set up your Amazon MSK cluster to
       * validate a client identity and make an encrypted connection between server and client using
       * SASL-SSL authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-saslpassword)
       */
      override fun saslPassword(): String? = unwrap(this).getSaslPassword()

      /**
       * The secure user name you created when you first set up your Amazon MSK cluster to validate
       * a client identity and make an encrypted connection between server and client using SASL-SSL
       * authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-saslusername)
       */
      override fun saslUserName(): String? = unwrap(this).getSaslUserName()

      /**
       * Set secure connection to a Kafka target endpoint using Transport Layer Security (TLS).
       *
       * Options include `ssl-encryption` , `ssl-authentication` , and `sasl-ssl` . `sasl-ssl`
       * requires `SaslUsername` and `SaslPassword` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-securityprotocol)
       */
      override fun securityProtocol(): String? = unwrap(this).getSecurityProtocol()

      /**
       * The Amazon Resource Name (ARN) for the private certificate authority (CA) cert that AWS DMS
       * uses to securely connect to your Kafka target endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-sslcacertificatearn)
       */
      override fun sslCaCertificateArn(): String? = unwrap(this).getSslCaCertificateArn()

      /**
       * The Amazon Resource Name (ARN) of the client certificate used to securely connect to a
       * Kafka target endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-sslclientcertificatearn)
       */
      override fun sslClientCertificateArn(): String? = unwrap(this).getSslClientCertificateArn()

      /**
       * The Amazon Resource Name (ARN) for the client private key used to securely connect to a
       * Kafka target endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-sslclientkeyarn)
       */
      override fun sslClientKeyArn(): String? = unwrap(this).getSslClientKeyArn()

      /**
       * The password for the client private key used to securely connect to a Kafka target
       * endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-sslclientkeypassword)
       */
      override fun sslClientKeyPassword(): String? = unwrap(this).getSslClientKeyPassword()

      /**
       * The topic to which you migrate the data.
       *
       * If you don't specify a topic, AWS DMS specifies `"kafka-default-topic"` as the migration
       * topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-topic)
       */
      override fun topic(): String? = unwrap(this).getTopic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KafkaSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty):
          KafkaSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty
    }
  }

  public interface OracleSettingsProperty {
    /**
     * Set this attribute to `false` in order to use the Binary Reader to capture change data for an
     * Amazon RDS for Oracle as the source.
     *
     * This tells the DMS instance to not access redo logs through any specified path prefix
     * replacement using direct file access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-accessalternatedirectly)
     */
    public fun accessAlternateDirectly(): Any? = unwrap(this).getAccessAlternateDirectly()

    /**
     * Set this attribute to set up table-level supplemental logging for the Oracle database.
     *
     * This attribute enables PRIMARY KEY supplemental logging on all tables selected for a
     * migration task.
     *
     * If you use this option, you still need to enable database-level supplemental logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-addsupplementallogging)
     */
    public fun addSupplementalLogging(): Any? = unwrap(this).getAddSupplementalLogging()

    /**
     * Set this attribute with `ArchivedLogDestId` in a primary/ standby setup.
     *
     * This attribute is useful in the case of a switchover. In this case, AWS DMS needs to know
     * which destination to get archive redo logs from to read changes. This need arises because the
     * previous primary instance is now a standby instance after switchover.
     *
     * Although AWS DMS supports the use of the Oracle `RESETLOGS` option to open the database,
     * never use `RESETLOGS` unless necessary. For additional information about `RESETLOGS` , see [RMAN
     * Data Repair
     * Concepts](https://docs.aws.amazon.com/https://docs.oracle.com/en/database/oracle/oracle-database/19/bradv/rman-data-repair-concepts.html#GUID-1805CCF7-4AF2-482D-B65A-998192F89C2B)
     * in the *Oracle Database Backup and Recovery User's Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-additionalarchivedlogdestid)
     */
    public fun additionalArchivedLogDestId(): Number? =
        unwrap(this).getAdditionalArchivedLogDestId()

    /**
     * Set this attribute to `true` to enable replication of Oracle tables containing columns that
     * are nested tables or defined types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-allowselectnestedtables)
     */
    public fun allowSelectNestedTables(): Any? = unwrap(this).getAllowSelectNestedTables()

    /**
     * Specifies the ID of the destination for the archived redo logs.
     *
     * This value should be the same as a number in the dest_id column of the v$archived_log view.
     * If you work with an additional redo log destination, use the `AdditionalArchivedLogDestId`
     * option to specify the additional destination ID. Doing this improves performance by ensuring
     * that the correct logs are accessed from the outset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-archivedlogdestid)
     */
    public fun archivedLogDestId(): Number? = unwrap(this).getArchivedLogDestId()

    /**
     * When this field is set to `Y` , AWS DMS only accesses the archived redo logs.
     *
     * If the archived redo logs are stored on Automatic Storage Management (ASM) only, the AWS DMS
     * user account needs to be granted ASM privileges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-archivedlogsonly)
     */
    public fun archivedLogsOnly(): Any? = unwrap(this).getArchivedLogsOnly()

    /**
     * For an Oracle source endpoint, your Oracle Automatic Storage Management (ASM) password.
     *
     * You can set this value from the `*asm_user_password*` value. You set this value as part of
     * the comma-separated value that you set to the `Password` request parameter when you create the
     * endpoint to access transaction logs using Binary Reader. For more information, see
     * [Configuration for change data capture (CDC) on an Oracle source
     * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-asmpassword)
     */
    public fun asmPassword(): String? = unwrap(this).getAsmPassword()

    /**
     * For an Oracle source endpoint, your ASM server address.
     *
     * You can set this value from the `asm_server` value. You set `asm_server` as part of the extra
     * connection attribute string to access an Oracle server with Binary Reader that uses ASM. For
     * more information, see [Configuration for change data capture (CDC) on an Oracle source
     * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-asmserver)
     */
    public fun asmServer(): String? = unwrap(this).getAsmServer()

    /**
     * For an Oracle source endpoint, your ASM user name.
     *
     * You can set this value from the `asm_user` value. You set `asm_user` as part of the extra
     * connection attribute string to access an Oracle server with Binary Reader that uses ASM. For
     * more information, see [Configuration for change data capture (CDC) on an Oracle source
     * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-asmuser)
     */
    public fun asmUser(): String? = unwrap(this).getAsmUser()

    /**
     * Specifies whether the length of a character column is in bytes or in characters.
     *
     * To indicate that the character column length is in characters, set this attribute to `CHAR` .
     * Otherwise, the character column length is in bytes.
     *
     * Example: `charLengthSemantics=CHAR;`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-charlengthsemantics)
     */
    public fun charLengthSemantics(): String? = unwrap(this).getCharLengthSemantics()

    /**
     * When set to `true` , this attribute helps to increase the commit rate on the Oracle target
     * database by writing directly to tables and not writing a trail to database logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-directpathnolog)
     */
    public fun directPathNoLog(): Any? = unwrap(this).getDirectPathNoLog()

    /**
     * When set to `true` , this attribute specifies a parallel load when `useDirectPathFullLoad` is
     * set to `Y` .
     *
     * This attribute also only applies when you use the AWS DMS parallel load feature. Note that
     * the target table cannot have any constraints or indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-directpathparallelload)
     */
    public fun directPathParallelLoad(): Any? = unwrap(this).getDirectPathParallelLoad()

    /**
     * Set this attribute to enable homogenous tablespace replication and create existing tables or
     * indexes under the same tablespace on the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-enablehomogenoustablespace)
     */
    public fun enableHomogenousTablespace(): Any? = unwrap(this).getEnableHomogenousTablespace()

    /**
     * Specifies the IDs of one more destinations for one or more archived redo logs.
     *
     * These IDs are the values of the `dest_id` column in the `v$archived_log` view. Use this
     * setting with the `archivedLogDestId` extra connection attribute in a primary-to-single setup or
     * a primary-to-multiple-standby setup.
     *
     * This setting is useful in a switchover when you use an Oracle Data Guard database as a
     * source. In this case, AWS DMS needs information about what destination to get archive redo logs
     * from to read changes. AWS DMS needs this because after the switchover the previous primary is a
     * standby instance. For example, in a primary-to-single standby setup you might apply the
     * following settings.
     *
     * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2]`
     *
     * In a primary-to-multiple-standby setup, you might apply the following settings.
     *
     * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2,3,4]`
     *
     * Although AWS DMS supports the use of the Oracle `RESETLOGS` option to open the database,
     * never use `RESETLOGS` unless it's necessary. For more information about `RESETLOGS` , see [RMAN
     * Data Repair
     * Concepts](https://docs.aws.amazon.com/https://docs.oracle.com/en/database/oracle/oracle-database/19/bradv/rman-data-repair-concepts.html#GUID-1805CCF7-4AF2-482D-B65A-998192F89C2B)
     * in the *Oracle Database Backup and Recovery User's Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-extraarchivedlogdestids)
     */
    public fun extraArchivedLogDestIds(): Any? = unwrap(this).getExtraArchivedLogDestIds()

    /**
     * When set to `true` , this attribute causes a task to fail if the actual size of an LOB column
     * is greater than the specified `LobMaxSize` .
     *
     * If a task is set to limited LOB mode and this option is set to `true` , the task fails
     * instead of truncating the LOB data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-failtasksonlobtruncation)
     */
    public fun failTasksOnLobTruncation(): Any? = unwrap(this).getFailTasksOnLobTruncation()

    /**
     * Specifies the number scale.
     *
     * You can select a scale up to 38, or you can select FLOAT. By default, the NUMBER data type is
     * converted to precision 38, scale 10.
     *
     * Example: `numberDataTypeScale=12`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-numberdatatypescale)
     */
    public fun numberDatatypeScale(): Number? = unwrap(this).getNumberDatatypeScale()

    /**
     * Set this string attribute to the required value in order to use the Binary Reader to capture
     * change data for an Amazon RDS for Oracle as the source.
     *
     * This value specifies the default Oracle root used to access the redo logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-oraclepathprefix)
     */
    public fun oraclePathPrefix(): String? = unwrap(this).getOraclePathPrefix()

    /**
     * Set this attribute to change the number of threads that DMS configures to perform a change
     * data capture (CDC) load using Oracle Automatic Storage Management (ASM).
     *
     * You can specify an integer value between 2 (the default) and 8 (the maximum). Use this
     * attribute together with the `readAheadBlocks` attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-parallelasmreadthreads)
     */
    public fun parallelAsmReadThreads(): Number? = unwrap(this).getParallelAsmReadThreads()

    /**
     * Set this attribute to change the number of read-ahead blocks that DMS configures to perform a
     * change data capture (CDC) load using Oracle Automatic Storage Management (ASM).
     *
     * You can specify an integer value between 1000 (the default) and 200,000 (the maximum).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-readaheadblocks)
     */
    public fun readAheadBlocks(): Number? = unwrap(this).getReadAheadBlocks()

    /**
     * When set to `true` , this attribute supports tablespace replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-readtablespacename)
     */
    public fun readTableSpaceName(): Any? = unwrap(this).getReadTableSpaceName()

    /**
     * Set this attribute to true in order to use the Binary Reader to capture change data for an
     * Amazon RDS for Oracle as the source.
     *
     * This setting tells DMS instance to replace the default Oracle root with the specified
     * `usePathPrefix` setting to access the redo logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-replacepathprefix)
     */
    public fun replacePathPrefix(): Any? = unwrap(this).getReplacePathPrefix()

    /**
     * Specifies the number of seconds that the system waits before resending a query.
     *
     * Example: `retryInterval=6;`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-retryinterval)
     */
    public fun retryInterval(): Number? = unwrap(this).getRetryInterval()

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
     * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
     *
     * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
     * AWS Secrets Manager secret that allows access to the Oracle endpoint.
     *
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
     * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
     *
     * For more information on creating this `SecretsManagerSecret` , the corresponding
     * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access it,
     * see [Using secrets to access AWS Database Migration Service
     * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-secretsmanageraccessrolearn)
     */
    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    /**
     * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM).
     *
     * The full ARN of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the `SecretsManagerOracleAsmSecret` . This
     * `SecretsManagerOracleAsmSecret` has the secret value that allows access to the Oracle ASM of the
     * endpoint.
     *
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerOracleAsmSecretId` . Or you can specify clear-text values
     * for `AsmUser` , `AsmPassword` , and `AsmServerName` . You can't specify both.
     *
     * For more information on creating this `SecretsManagerOracleAsmSecret` , the corresponding
     * `SecretsManagerOracleAsmAccessRoleArn` , and the `SecretsManagerOracleAsmSecretId` that is
     * required to access it, see [Using secrets to access AWS Database Migration Service
     * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-secretsmanageroracleasmaccessrolearn)
     */
    public fun secretsManagerOracleAsmAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerOracleAsmAccessRoleArn()

    /**
     * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM).
     *
     * The full ARN, partial ARN, or display name of the `SecretsManagerOracleAsmSecret` that
     * contains the Oracle ASM connection details for the Oracle endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-secretsmanageroracleasmsecretid)
     */
    public fun secretsManagerOracleAsmSecretId(): String? =
        unwrap(this).getSecretsManagerOracleAsmSecretId()

    /**
     * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
     * Oracle endpoint connection details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-secretsmanagersecretid)
     */
    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    /**
     * For an Oracle source endpoint, the transparent data encryption (TDE) password required by AWM
     * DMS to access Oracle redo logs encrypted by TDE using Binary Reader.
     *
     * It is also the `*TDE_Password*` part of the comma-separated value you set to the `Password`
     * request parameter when you create the endpoint. The `SecurityDbEncryptian` setting is related to
     * this `SecurityDbEncryptionName` setting. For more information, see [Supported encryption methods
     * for using Oracle as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-securitydbencryption)
     */
    public fun securityDbEncryption(): String? = unwrap(this).getSecurityDbEncryption()

    /**
     * For an Oracle source endpoint, the name of a key used for the transparent data encryption
     * (TDE) of the columns and tablespaces in an Oracle source database that is encrypted using TDE.
     *
     * The key value is the value of the `SecurityDbEncryption` setting. For more information on
     * setting the key name value of `SecurityDbEncryptionName` , see the information and example for
     * setting the `securityDbEncryptionName` extra connection attribute in [Supported encryption
     * methods for using Oracle as a source for AWS
     * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-securitydbencryptionname)
     */
    public fun securityDbEncryptionName(): String? = unwrap(this).getSecurityDbEncryptionName()

    /**
     * Use this attribute to convert `SDO_GEOMETRY` to `GEOJSON` format.
     *
     * By default, DMS calls the `SDO2GEOJSON` custom function if present and accessible. Or you can
     * create your own custom function that mimics the operation of `SDOGEOJSON` and set
     * `SpatialDataOptionToGeoJsonFunctionName` to call it instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-spatialdataoptiontogeojsonfunctionname)
     */
    public fun spatialDataOptionToGeoJsonFunctionName(): String? =
        unwrap(this).getSpatialDataOptionToGeoJsonFunctionName()

    /**
     * Use this attribute to specify a time in minutes for the delay in standby sync.
     *
     * If the source is an Oracle Active Data Guard standby database, use this attribute to specify
     * the time lag between primary and standby databases.
     *
     * In AWS DMS , you can create an Oracle CDC task that uses an Active Data Guard standby
     * instance as a source for replicating ongoing changes. Doing this eliminates the need to connect
     * to an active database that might be in production.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-standbydelaytime)
     */
    public fun standbyDelayTime(): Number? = unwrap(this).getStandbyDelayTime()

    /**
     * Set this attribute to `true` in order to use the Binary Reader to capture change data for an
     * Amazon RDS for Oracle as the source.
     *
     * This tells the DMS instance to use any specified prefix replacement to access all online redo
     * logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-usealternatefolderforonline)
     */
    public fun useAlternateFolderForOnline(): Any? = unwrap(this).getUseAlternateFolderForOnline()

    /**
     * Set this attribute to Y to capture change data using the Binary Reader utility.
     *
     * Set `UseLogminerReader` to N to set this attribute to Y. To use Binary Reader with Amazon RDS
     * for Oracle as the source, you set additional attributes. For more information about using this
     * setting with Oracle Automatic Storage Management (ASM), see [Using Oracle LogMiner or AWS DMS
     * Binary Reader for
     * CDC](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-usebfile)
     */
    public fun useBFile(): Any? = unwrap(this).getUseBFile()

    /**
     * Set this attribute to Y to have AWS DMS use a direct path full load.
     *
     * Specify this value to use the direct path protocol in the Oracle Call Interface (OCI). By
     * using this OCI protocol, you can bulk-load Oracle target tables during a full load.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-usedirectpathfullload)
     */
    public fun useDirectPathFullLoad(): Any? = unwrap(this).getUseDirectPathFullLoad()

    /**
     * Set this attribute to Y to capture change data using the Oracle LogMiner utility (the
     * default).
     *
     * Set this attribute to N if you want to access the redo logs as a binary file. When you set
     * `UseLogminerReader` to N, also set `UseBfile` to Y. For more information on this setting and
     * using Oracle ASM, see [Using Oracle LogMiner or AWS DMS Binary Reader for
     * CDC](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC)
     * in the *AWS DMS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-uselogminerreader)
     */
    public fun useLogminerReader(): Any? = unwrap(this).getUseLogminerReader()

    /**
     * Set this string attribute to the required value in order to use the Binary Reader to capture
     * change data for an Amazon RDS for Oracle as the source.
     *
     * This value specifies the path prefix used to replace the default Oracle root to access the
     * redo logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-usepathprefix)
     */
    public fun usePathPrefix(): String? = unwrap(this).getUsePathPrefix()

    /**
     * A builder for [OracleSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessAlternateDirectly Set this attribute to `false` in order to use the Binary
       * Reader to capture change data for an Amazon RDS for Oracle as the source.
       * This tells the DMS instance to not access redo logs through any specified path prefix
       * replacement using direct file access.
       */
      public fun accessAlternateDirectly(accessAlternateDirectly: Boolean)

      /**
       * @param accessAlternateDirectly Set this attribute to `false` in order to use the Binary
       * Reader to capture change data for an Amazon RDS for Oracle as the source.
       * This tells the DMS instance to not access redo logs through any specified path prefix
       * replacement using direct file access.
       */
      public fun accessAlternateDirectly(accessAlternateDirectly: IResolvable)

      /**
       * @param addSupplementalLogging Set this attribute to set up table-level supplemental logging
       * for the Oracle database.
       * This attribute enables PRIMARY KEY supplemental logging on all tables selected for a
       * migration task.
       *
       * If you use this option, you still need to enable database-level supplemental logging.
       */
      public fun addSupplementalLogging(addSupplementalLogging: Boolean)

      /**
       * @param addSupplementalLogging Set this attribute to set up table-level supplemental logging
       * for the Oracle database.
       * This attribute enables PRIMARY KEY supplemental logging on all tables selected for a
       * migration task.
       *
       * If you use this option, you still need to enable database-level supplemental logging.
       */
      public fun addSupplementalLogging(addSupplementalLogging: IResolvable)

      /**
       * @param additionalArchivedLogDestId Set this attribute with `ArchivedLogDestId` in a
       * primary/ standby setup.
       * This attribute is useful in the case of a switchover. In this case, AWS DMS needs to know
       * which destination to get archive redo logs from to read changes. This need arises because the
       * previous primary instance is now a standby instance after switchover.
       *
       * Although AWS DMS supports the use of the Oracle `RESETLOGS` option to open the database,
       * never use `RESETLOGS` unless necessary. For additional information about `RESETLOGS` , see
       * [RMAN Data Repair
       * Concepts](https://docs.aws.amazon.com/https://docs.oracle.com/en/database/oracle/oracle-database/19/bradv/rman-data-repair-concepts.html#GUID-1805CCF7-4AF2-482D-B65A-998192F89C2B)
       * in the *Oracle Database Backup and Recovery User's Guide* .
       */
      public fun additionalArchivedLogDestId(additionalArchivedLogDestId: Number)

      /**
       * @param allowSelectNestedTables Set this attribute to `true` to enable replication of Oracle
       * tables containing columns that are nested tables or defined types.
       */
      public fun allowSelectNestedTables(allowSelectNestedTables: Boolean)

      /**
       * @param allowSelectNestedTables Set this attribute to `true` to enable replication of Oracle
       * tables containing columns that are nested tables or defined types.
       */
      public fun allowSelectNestedTables(allowSelectNestedTables: IResolvable)

      /**
       * @param archivedLogDestId Specifies the ID of the destination for the archived redo logs.
       * This value should be the same as a number in the dest_id column of the v$archived_log view.
       * If you work with an additional redo log destination, use the `AdditionalArchivedLogDestId`
       * option to specify the additional destination ID. Doing this improves performance by ensuring
       * that the correct logs are accessed from the outset.
       */
      public fun archivedLogDestId(archivedLogDestId: Number)

      /**
       * @param archivedLogsOnly When this field is set to `Y` , AWS DMS only accesses the archived
       * redo logs.
       * If the archived redo logs are stored on Automatic Storage Management (ASM) only, the AWS
       * DMS user account needs to be granted ASM privileges.
       */
      public fun archivedLogsOnly(archivedLogsOnly: Boolean)

      /**
       * @param archivedLogsOnly When this field is set to `Y` , AWS DMS only accesses the archived
       * redo logs.
       * If the archived redo logs are stored on Automatic Storage Management (ASM) only, the AWS
       * DMS user account needs to be granted ASM privileges.
       */
      public fun archivedLogsOnly(archivedLogsOnly: IResolvable)

      /**
       * @param asmPassword For an Oracle source endpoint, your Oracle Automatic Storage Management
       * (ASM) password.
       * You can set this value from the `*asm_user_password*` value. You set this value as part of
       * the comma-separated value that you set to the `Password` request parameter when you create the
       * endpoint to access transaction logs using Binary Reader. For more information, see
       * [Configuration for change data capture (CDC) on an Oracle source
       * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
       * .
       */
      public fun asmPassword(asmPassword: String)

      /**
       * @param asmServer For an Oracle source endpoint, your ASM server address.
       * You can set this value from the `asm_server` value. You set `asm_server` as part of the
       * extra connection attribute string to access an Oracle server with Binary Reader that uses ASM.
       * For more information, see [Configuration for change data capture (CDC) on an Oracle source
       * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
       * .
       */
      public fun asmServer(asmServer: String)

      /**
       * @param asmUser For an Oracle source endpoint, your ASM user name.
       * You can set this value from the `asm_user` value. You set `asm_user` as part of the extra
       * connection attribute string to access an Oracle server with Binary Reader that uses ASM. For
       * more information, see [Configuration for change data capture (CDC) on an Oracle source
       * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
       * .
       */
      public fun asmUser(asmUser: String)

      /**
       * @param charLengthSemantics Specifies whether the length of a character column is in bytes
       * or in characters.
       * To indicate that the character column length is in characters, set this attribute to `CHAR`
       * . Otherwise, the character column length is in bytes.
       *
       * Example: `charLengthSemantics=CHAR;`
       */
      public fun charLengthSemantics(charLengthSemantics: String)

      /**
       * @param directPathNoLog When set to `true` , this attribute helps to increase the commit
       * rate on the Oracle target database by writing directly to tables and not writing a trail to
       * database logs.
       */
      public fun directPathNoLog(directPathNoLog: Boolean)

      /**
       * @param directPathNoLog When set to `true` , this attribute helps to increase the commit
       * rate on the Oracle target database by writing directly to tables and not writing a trail to
       * database logs.
       */
      public fun directPathNoLog(directPathNoLog: IResolvable)

      /**
       * @param directPathParallelLoad When set to `true` , this attribute specifies a parallel load
       * when `useDirectPathFullLoad` is set to `Y` .
       * This attribute also only applies when you use the AWS DMS parallel load feature. Note that
       * the target table cannot have any constraints or indexes.
       */
      public fun directPathParallelLoad(directPathParallelLoad: Boolean)

      /**
       * @param directPathParallelLoad When set to `true` , this attribute specifies a parallel load
       * when `useDirectPathFullLoad` is set to `Y` .
       * This attribute also only applies when you use the AWS DMS parallel load feature. Note that
       * the target table cannot have any constraints or indexes.
       */
      public fun directPathParallelLoad(directPathParallelLoad: IResolvable)

      /**
       * @param enableHomogenousTablespace Set this attribute to enable homogenous tablespace
       * replication and create existing tables or indexes under the same tablespace on the target.
       */
      public fun enableHomogenousTablespace(enableHomogenousTablespace: Boolean)

      /**
       * @param enableHomogenousTablespace Set this attribute to enable homogenous tablespace
       * replication and create existing tables or indexes under the same tablespace on the target.
       */
      public fun enableHomogenousTablespace(enableHomogenousTablespace: IResolvable)

      /**
       * @param extraArchivedLogDestIds Specifies the IDs of one more destinations for one or more
       * archived redo logs.
       * These IDs are the values of the `dest_id` column in the `v$archived_log` view. Use this
       * setting with the `archivedLogDestId` extra connection attribute in a primary-to-single setup
       * or a primary-to-multiple-standby setup.
       *
       * This setting is useful in a switchover when you use an Oracle Data Guard database as a
       * source. In this case, AWS DMS needs information about what destination to get archive redo
       * logs from to read changes. AWS DMS needs this because after the switchover the previous
       * primary is a standby instance. For example, in a primary-to-single standby setup you might
       * apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2]`
       *
       * In a primary-to-multiple-standby setup, you might apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2,3,4]`
       *
       * Although AWS DMS supports the use of the Oracle `RESETLOGS` option to open the database,
       * never use `RESETLOGS` unless it's necessary. For more information about `RESETLOGS` , see
       * [RMAN Data Repair
       * Concepts](https://docs.aws.amazon.com/https://docs.oracle.com/en/database/oracle/oracle-database/19/bradv/rman-data-repair-concepts.html#GUID-1805CCF7-4AF2-482D-B65A-998192F89C2B)
       * in the *Oracle Database Backup and Recovery User's Guide* .
       */
      public fun extraArchivedLogDestIds(extraArchivedLogDestIds: IResolvable)

      /**
       * @param extraArchivedLogDestIds Specifies the IDs of one more destinations for one or more
       * archived redo logs.
       * These IDs are the values of the `dest_id` column in the `v$archived_log` view. Use this
       * setting with the `archivedLogDestId` extra connection attribute in a primary-to-single setup
       * or a primary-to-multiple-standby setup.
       *
       * This setting is useful in a switchover when you use an Oracle Data Guard database as a
       * source. In this case, AWS DMS needs information about what destination to get archive redo
       * logs from to read changes. AWS DMS needs this because after the switchover the previous
       * primary is a standby instance. For example, in a primary-to-single standby setup you might
       * apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2]`
       *
       * In a primary-to-multiple-standby setup, you might apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2,3,4]`
       *
       * Although AWS DMS supports the use of the Oracle `RESETLOGS` option to open the database,
       * never use `RESETLOGS` unless it's necessary. For more information about `RESETLOGS` , see
       * [RMAN Data Repair
       * Concepts](https://docs.aws.amazon.com/https://docs.oracle.com/en/database/oracle/oracle-database/19/bradv/rman-data-repair-concepts.html#GUID-1805CCF7-4AF2-482D-B65A-998192F89C2B)
       * in the *Oracle Database Backup and Recovery User's Guide* .
       */
      public fun extraArchivedLogDestIds(extraArchivedLogDestIds: List<Number>)

      /**
       * @param extraArchivedLogDestIds Specifies the IDs of one more destinations for one or more
       * archived redo logs.
       * These IDs are the values of the `dest_id` column in the `v$archived_log` view. Use this
       * setting with the `archivedLogDestId` extra connection attribute in a primary-to-single setup
       * or a primary-to-multiple-standby setup.
       *
       * This setting is useful in a switchover when you use an Oracle Data Guard database as a
       * source. In this case, AWS DMS needs information about what destination to get archive redo
       * logs from to read changes. AWS DMS needs this because after the switchover the previous
       * primary is a standby instance. For example, in a primary-to-single standby setup you might
       * apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2]`
       *
       * In a primary-to-multiple-standby setup, you might apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2,3,4]`
       *
       * Although AWS DMS supports the use of the Oracle `RESETLOGS` option to open the database,
       * never use `RESETLOGS` unless it's necessary. For more information about `RESETLOGS` , see
       * [RMAN Data Repair
       * Concepts](https://docs.aws.amazon.com/https://docs.oracle.com/en/database/oracle/oracle-database/19/bradv/rman-data-repair-concepts.html#GUID-1805CCF7-4AF2-482D-B65A-998192F89C2B)
       * in the *Oracle Database Backup and Recovery User's Guide* .
       */
      public fun extraArchivedLogDestIds(vararg extraArchivedLogDestIds: Number)

      /**
       * @param failTasksOnLobTruncation When set to `true` , this attribute causes a task to fail
       * if the actual size of an LOB column is greater than the specified `LobMaxSize` .
       * If a task is set to limited LOB mode and this option is set to `true` , the task fails
       * instead of truncating the LOB data.
       */
      public fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean)

      /**
       * @param failTasksOnLobTruncation When set to `true` , this attribute causes a task to fail
       * if the actual size of an LOB column is greater than the specified `LobMaxSize` .
       * If a task is set to limited LOB mode and this option is set to `true` , the task fails
       * instead of truncating the LOB data.
       */
      public fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable)

      /**
       * @param numberDatatypeScale Specifies the number scale.
       * You can select a scale up to 38, or you can select FLOAT. By default, the NUMBER data type
       * is converted to precision 38, scale 10.
       *
       * Example: `numberDataTypeScale=12`
       */
      public fun numberDatatypeScale(numberDatatypeScale: Number)

      /**
       * @param oraclePathPrefix Set this string attribute to the required value in order to use the
       * Binary Reader to capture change data for an Amazon RDS for Oracle as the source.
       * This value specifies the default Oracle root used to access the redo logs.
       */
      public fun oraclePathPrefix(oraclePathPrefix: String)

      /**
       * @param parallelAsmReadThreads Set this attribute to change the number of threads that DMS
       * configures to perform a change data capture (CDC) load using Oracle Automatic Storage
       * Management (ASM).
       * You can specify an integer value between 2 (the default) and 8 (the maximum). Use this
       * attribute together with the `readAheadBlocks` attribute.
       */
      public fun parallelAsmReadThreads(parallelAsmReadThreads: Number)

      /**
       * @param readAheadBlocks Set this attribute to change the number of read-ahead blocks that
       * DMS configures to perform a change data capture (CDC) load using Oracle Automatic Storage
       * Management (ASM).
       * You can specify an integer value between 1000 (the default) and 200,000 (the maximum).
       */
      public fun readAheadBlocks(readAheadBlocks: Number)

      /**
       * @param readTableSpaceName When set to `true` , this attribute supports tablespace
       * replication.
       */
      public fun readTableSpaceName(readTableSpaceName: Boolean)

      /**
       * @param readTableSpaceName When set to `true` , this attribute supports tablespace
       * replication.
       */
      public fun readTableSpaceName(readTableSpaceName: IResolvable)

      /**
       * @param replacePathPrefix Set this attribute to true in order to use the Binary Reader to
       * capture change data for an Amazon RDS for Oracle as the source.
       * This setting tells DMS instance to replace the default Oracle root with the specified
       * `usePathPrefix` setting to access the redo logs.
       */
      public fun replacePathPrefix(replacePathPrefix: Boolean)

      /**
       * @param replacePathPrefix Set this attribute to true in order to use the Binary Reader to
       * capture change data for an Amazon RDS for Oracle as the source.
       * This setting tells DMS instance to replace the default Oracle root with the specified
       * `usePathPrefix` setting to access the redo logs.
       */
      public fun replacePathPrefix(replacePathPrefix: IResolvable)

      /**
       * @param retryInterval Specifies the number of seconds that the system waits before resending
       * a query.
       * Example: `retryInterval=6;`
       */
      public fun retryInterval(retryInterval: Number)

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the Oracle endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      /**
       * @param secretsManagerOracleAsmAccessRoleArn Required only if your Oracle endpoint uses
       * Advanced Storage Manager (ASM).
       * The full ARN of the IAM role that specifies AWS DMS as the trusted entity and grants the
       * required permissions to access the `SecretsManagerOracleAsmSecret` . This
       * `SecretsManagerOracleAsmSecret` has the secret value that allows access to the Oracle ASM of
       * the endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerOracleAsmSecretId` . Or you can specify clear-text values
       * for `AsmUser` , `AsmPassword` , and `AsmServerName` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerOracleAsmSecret` , the corresponding
       * `SecretsManagerOracleAsmAccessRoleArn` , and the `SecretsManagerOracleAsmSecretId` that is
       * required to access it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn: String)

      /**
       * @param secretsManagerOracleAsmSecretId Required only if your Oracle endpoint uses Advanced
       * Storage Manager (ASM).
       * The full ARN, partial ARN, or display name of the `SecretsManagerOracleAsmSecret` that
       * contains the Oracle ASM connection details for the Oracle endpoint.
       */
      public fun secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId: String)

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the Oracle endpoint connection details.
       */
      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      /**
       * @param securityDbEncryption For an Oracle source endpoint, the transparent data encryption
       * (TDE) password required by AWM DMS to access Oracle redo logs encrypted by TDE using Binary
       * Reader.
       * It is also the `*TDE_Password*` part of the comma-separated value you set to the `Password`
       * request parameter when you create the endpoint. The `SecurityDbEncryptian` setting is related
       * to this `SecurityDbEncryptionName` setting. For more information, see [Supported encryption
       * methods for using Oracle as a source for AWS
       * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun securityDbEncryption(securityDbEncryption: String)

      /**
       * @param securityDbEncryptionName For an Oracle source endpoint, the name of a key used for
       * the transparent data encryption (TDE) of the columns and tablespaces in an Oracle source
       * database that is encrypted using TDE.
       * The key value is the value of the `SecurityDbEncryption` setting. For more information on
       * setting the key name value of `SecurityDbEncryptionName` , see the information and example for
       * setting the `securityDbEncryptionName` extra connection attribute in [Supported encryption
       * methods for using Oracle as a source for AWS
       * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun securityDbEncryptionName(securityDbEncryptionName: String)

      /**
       * @param spatialDataOptionToGeoJsonFunctionName Use this attribute to convert `SDO_GEOMETRY`
       * to `GEOJSON` format.
       * By default, DMS calls the `SDO2GEOJSON` custom function if present and accessible. Or you
       * can create your own custom function that mimics the operation of `SDOGEOJSON` and set
       * `SpatialDataOptionToGeoJsonFunctionName` to call it instead.
       */
      public
          fun spatialDataOptionToGeoJsonFunctionName(spatialDataOptionToGeoJsonFunctionName: String)

      /**
       * @param standbyDelayTime Use this attribute to specify a time in minutes for the delay in
       * standby sync.
       * If the source is an Oracle Active Data Guard standby database, use this attribute to
       * specify the time lag between primary and standby databases.
       *
       * In AWS DMS , you can create an Oracle CDC task that uses an Active Data Guard standby
       * instance as a source for replicating ongoing changes. Doing this eliminates the need to
       * connect to an active database that might be in production.
       */
      public fun standbyDelayTime(standbyDelayTime: Number)

      /**
       * @param useAlternateFolderForOnline Set this attribute to `true` in order to use the Binary
       * Reader to capture change data for an Amazon RDS for Oracle as the source.
       * This tells the DMS instance to use any specified prefix replacement to access all online
       * redo logs.
       */
      public fun useAlternateFolderForOnline(useAlternateFolderForOnline: Boolean)

      /**
       * @param useAlternateFolderForOnline Set this attribute to `true` in order to use the Binary
       * Reader to capture change data for an Amazon RDS for Oracle as the source.
       * This tells the DMS instance to use any specified prefix replacement to access all online
       * redo logs.
       */
      public fun useAlternateFolderForOnline(useAlternateFolderForOnline: IResolvable)

      /**
       * @param useBFile Set this attribute to Y to capture change data using the Binary Reader
       * utility.
       * Set `UseLogminerReader` to N to set this attribute to Y. To use Binary Reader with Amazon
       * RDS for Oracle as the source, you set additional attributes. For more information about using
       * this setting with Oracle Automatic Storage Management (ASM), see [Using Oracle LogMiner or AWS
       * DMS Binary Reader for
       * CDC](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC)
       * .
       */
      public fun useBFile(useBFile: Boolean)

      /**
       * @param useBFile Set this attribute to Y to capture change data using the Binary Reader
       * utility.
       * Set `UseLogminerReader` to N to set this attribute to Y. To use Binary Reader with Amazon
       * RDS for Oracle as the source, you set additional attributes. For more information about using
       * this setting with Oracle Automatic Storage Management (ASM), see [Using Oracle LogMiner or AWS
       * DMS Binary Reader for
       * CDC](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC)
       * .
       */
      public fun useBFile(useBFile: IResolvable)

      /**
       * @param useDirectPathFullLoad Set this attribute to Y to have AWS DMS use a direct path full
       * load.
       * Specify this value to use the direct path protocol in the Oracle Call Interface (OCI). By
       * using this OCI protocol, you can bulk-load Oracle target tables during a full load.
       */
      public fun useDirectPathFullLoad(useDirectPathFullLoad: Boolean)

      /**
       * @param useDirectPathFullLoad Set this attribute to Y to have AWS DMS use a direct path full
       * load.
       * Specify this value to use the direct path protocol in the Oracle Call Interface (OCI). By
       * using this OCI protocol, you can bulk-load Oracle target tables during a full load.
       */
      public fun useDirectPathFullLoad(useDirectPathFullLoad: IResolvable)

      /**
       * @param useLogminerReader Set this attribute to Y to capture change data using the Oracle
       * LogMiner utility (the default).
       * Set this attribute to N if you want to access the redo logs as a binary file. When you set
       * `UseLogminerReader` to N, also set `UseBfile` to Y. For more information on this setting and
       * using Oracle ASM, see [Using Oracle LogMiner or AWS DMS Binary Reader for
       * CDC](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC)
       * in the *AWS DMS User Guide* .
       */
      public fun useLogminerReader(useLogminerReader: Boolean)

      /**
       * @param useLogminerReader Set this attribute to Y to capture change data using the Oracle
       * LogMiner utility (the default).
       * Set this attribute to N if you want to access the redo logs as a binary file. When you set
       * `UseLogminerReader` to N, also set `UseBfile` to Y. For more information on this setting and
       * using Oracle ASM, see [Using Oracle LogMiner or AWS DMS Binary Reader for
       * CDC](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC)
       * in the *AWS DMS User Guide* .
       */
      public fun useLogminerReader(useLogminerReader: IResolvable)

      /**
       * @param usePathPrefix Set this string attribute to the required value in order to use the
       * Binary Reader to capture change data for an Amazon RDS for Oracle as the source.
       * This value specifies the path prefix used to replace the default Oracle root to access the
       * redo logs.
       */
      public fun usePathPrefix(usePathPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty.builder()

      /**
       * @param accessAlternateDirectly Set this attribute to `false` in order to use the Binary
       * Reader to capture change data for an Amazon RDS for Oracle as the source.
       * This tells the DMS instance to not access redo logs through any specified path prefix
       * replacement using direct file access.
       */
      override fun accessAlternateDirectly(accessAlternateDirectly: Boolean) {
        cdkBuilder.accessAlternateDirectly(accessAlternateDirectly)
      }

      /**
       * @param accessAlternateDirectly Set this attribute to `false` in order to use the Binary
       * Reader to capture change data for an Amazon RDS for Oracle as the source.
       * This tells the DMS instance to not access redo logs through any specified path prefix
       * replacement using direct file access.
       */
      override fun accessAlternateDirectly(accessAlternateDirectly: IResolvable) {
        cdkBuilder.accessAlternateDirectly(accessAlternateDirectly.let(IResolvable::unwrap))
      }

      /**
       * @param addSupplementalLogging Set this attribute to set up table-level supplemental logging
       * for the Oracle database.
       * This attribute enables PRIMARY KEY supplemental logging on all tables selected for a
       * migration task.
       *
       * If you use this option, you still need to enable database-level supplemental logging.
       */
      override fun addSupplementalLogging(addSupplementalLogging: Boolean) {
        cdkBuilder.addSupplementalLogging(addSupplementalLogging)
      }

      /**
       * @param addSupplementalLogging Set this attribute to set up table-level supplemental logging
       * for the Oracle database.
       * This attribute enables PRIMARY KEY supplemental logging on all tables selected for a
       * migration task.
       *
       * If you use this option, you still need to enable database-level supplemental logging.
       */
      override fun addSupplementalLogging(addSupplementalLogging: IResolvable) {
        cdkBuilder.addSupplementalLogging(addSupplementalLogging.let(IResolvable::unwrap))
      }

      /**
       * @param additionalArchivedLogDestId Set this attribute with `ArchivedLogDestId` in a
       * primary/ standby setup.
       * This attribute is useful in the case of a switchover. In this case, AWS DMS needs to know
       * which destination to get archive redo logs from to read changes. This need arises because the
       * previous primary instance is now a standby instance after switchover.
       *
       * Although AWS DMS supports the use of the Oracle `RESETLOGS` option to open the database,
       * never use `RESETLOGS` unless necessary. For additional information about `RESETLOGS` , see
       * [RMAN Data Repair
       * Concepts](https://docs.aws.amazon.com/https://docs.oracle.com/en/database/oracle/oracle-database/19/bradv/rman-data-repair-concepts.html#GUID-1805CCF7-4AF2-482D-B65A-998192F89C2B)
       * in the *Oracle Database Backup and Recovery User's Guide* .
       */
      override fun additionalArchivedLogDestId(additionalArchivedLogDestId: Number) {
        cdkBuilder.additionalArchivedLogDestId(additionalArchivedLogDestId)
      }

      /**
       * @param allowSelectNestedTables Set this attribute to `true` to enable replication of Oracle
       * tables containing columns that are nested tables or defined types.
       */
      override fun allowSelectNestedTables(allowSelectNestedTables: Boolean) {
        cdkBuilder.allowSelectNestedTables(allowSelectNestedTables)
      }

      /**
       * @param allowSelectNestedTables Set this attribute to `true` to enable replication of Oracle
       * tables containing columns that are nested tables or defined types.
       */
      override fun allowSelectNestedTables(allowSelectNestedTables: IResolvable) {
        cdkBuilder.allowSelectNestedTables(allowSelectNestedTables.let(IResolvable::unwrap))
      }

      /**
       * @param archivedLogDestId Specifies the ID of the destination for the archived redo logs.
       * This value should be the same as a number in the dest_id column of the v$archived_log view.
       * If you work with an additional redo log destination, use the `AdditionalArchivedLogDestId`
       * option to specify the additional destination ID. Doing this improves performance by ensuring
       * that the correct logs are accessed from the outset.
       */
      override fun archivedLogDestId(archivedLogDestId: Number) {
        cdkBuilder.archivedLogDestId(archivedLogDestId)
      }

      /**
       * @param archivedLogsOnly When this field is set to `Y` , AWS DMS only accesses the archived
       * redo logs.
       * If the archived redo logs are stored on Automatic Storage Management (ASM) only, the AWS
       * DMS user account needs to be granted ASM privileges.
       */
      override fun archivedLogsOnly(archivedLogsOnly: Boolean) {
        cdkBuilder.archivedLogsOnly(archivedLogsOnly)
      }

      /**
       * @param archivedLogsOnly When this field is set to `Y` , AWS DMS only accesses the archived
       * redo logs.
       * If the archived redo logs are stored on Automatic Storage Management (ASM) only, the AWS
       * DMS user account needs to be granted ASM privileges.
       */
      override fun archivedLogsOnly(archivedLogsOnly: IResolvable) {
        cdkBuilder.archivedLogsOnly(archivedLogsOnly.let(IResolvable::unwrap))
      }

      /**
       * @param asmPassword For an Oracle source endpoint, your Oracle Automatic Storage Management
       * (ASM) password.
       * You can set this value from the `*asm_user_password*` value. You set this value as part of
       * the comma-separated value that you set to the `Password` request parameter when you create the
       * endpoint to access transaction logs using Binary Reader. For more information, see
       * [Configuration for change data capture (CDC) on an Oracle source
       * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
       * .
       */
      override fun asmPassword(asmPassword: String) {
        cdkBuilder.asmPassword(asmPassword)
      }

      /**
       * @param asmServer For an Oracle source endpoint, your ASM server address.
       * You can set this value from the `asm_server` value. You set `asm_server` as part of the
       * extra connection attribute string to access an Oracle server with Binary Reader that uses ASM.
       * For more information, see [Configuration for change data capture (CDC) on an Oracle source
       * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
       * .
       */
      override fun asmServer(asmServer: String) {
        cdkBuilder.asmServer(asmServer)
      }

      /**
       * @param asmUser For an Oracle source endpoint, your ASM user name.
       * You can set this value from the `asm_user` value. You set `asm_user` as part of the extra
       * connection attribute string to access an Oracle server with Binary Reader that uses ASM. For
       * more information, see [Configuration for change data capture (CDC) on an Oracle source
       * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
       * .
       */
      override fun asmUser(asmUser: String) {
        cdkBuilder.asmUser(asmUser)
      }

      /**
       * @param charLengthSemantics Specifies whether the length of a character column is in bytes
       * or in characters.
       * To indicate that the character column length is in characters, set this attribute to `CHAR`
       * . Otherwise, the character column length is in bytes.
       *
       * Example: `charLengthSemantics=CHAR;`
       */
      override fun charLengthSemantics(charLengthSemantics: String) {
        cdkBuilder.charLengthSemantics(charLengthSemantics)
      }

      /**
       * @param directPathNoLog When set to `true` , this attribute helps to increase the commit
       * rate on the Oracle target database by writing directly to tables and not writing a trail to
       * database logs.
       */
      override fun directPathNoLog(directPathNoLog: Boolean) {
        cdkBuilder.directPathNoLog(directPathNoLog)
      }

      /**
       * @param directPathNoLog When set to `true` , this attribute helps to increase the commit
       * rate on the Oracle target database by writing directly to tables and not writing a trail to
       * database logs.
       */
      override fun directPathNoLog(directPathNoLog: IResolvable) {
        cdkBuilder.directPathNoLog(directPathNoLog.let(IResolvable::unwrap))
      }

      /**
       * @param directPathParallelLoad When set to `true` , this attribute specifies a parallel load
       * when `useDirectPathFullLoad` is set to `Y` .
       * This attribute also only applies when you use the AWS DMS parallel load feature. Note that
       * the target table cannot have any constraints or indexes.
       */
      override fun directPathParallelLoad(directPathParallelLoad: Boolean) {
        cdkBuilder.directPathParallelLoad(directPathParallelLoad)
      }

      /**
       * @param directPathParallelLoad When set to `true` , this attribute specifies a parallel load
       * when `useDirectPathFullLoad` is set to `Y` .
       * This attribute also only applies when you use the AWS DMS parallel load feature. Note that
       * the target table cannot have any constraints or indexes.
       */
      override fun directPathParallelLoad(directPathParallelLoad: IResolvable) {
        cdkBuilder.directPathParallelLoad(directPathParallelLoad.let(IResolvable::unwrap))
      }

      /**
       * @param enableHomogenousTablespace Set this attribute to enable homogenous tablespace
       * replication and create existing tables or indexes under the same tablespace on the target.
       */
      override fun enableHomogenousTablespace(enableHomogenousTablespace: Boolean) {
        cdkBuilder.enableHomogenousTablespace(enableHomogenousTablespace)
      }

      /**
       * @param enableHomogenousTablespace Set this attribute to enable homogenous tablespace
       * replication and create existing tables or indexes under the same tablespace on the target.
       */
      override fun enableHomogenousTablespace(enableHomogenousTablespace: IResolvable) {
        cdkBuilder.enableHomogenousTablespace(enableHomogenousTablespace.let(IResolvable::unwrap))
      }

      /**
       * @param extraArchivedLogDestIds Specifies the IDs of one more destinations for one or more
       * archived redo logs.
       * These IDs are the values of the `dest_id` column in the `v$archived_log` view. Use this
       * setting with the `archivedLogDestId` extra connection attribute in a primary-to-single setup
       * or a primary-to-multiple-standby setup.
       *
       * This setting is useful in a switchover when you use an Oracle Data Guard database as a
       * source. In this case, AWS DMS needs information about what destination to get archive redo
       * logs from to read changes. AWS DMS needs this because after the switchover the previous
       * primary is a standby instance. For example, in a primary-to-single standby setup you might
       * apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2]`
       *
       * In a primary-to-multiple-standby setup, you might apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2,3,4]`
       *
       * Although AWS DMS supports the use of the Oracle `RESETLOGS` option to open the database,
       * never use `RESETLOGS` unless it's necessary. For more information about `RESETLOGS` , see
       * [RMAN Data Repair
       * Concepts](https://docs.aws.amazon.com/https://docs.oracle.com/en/database/oracle/oracle-database/19/bradv/rman-data-repair-concepts.html#GUID-1805CCF7-4AF2-482D-B65A-998192F89C2B)
       * in the *Oracle Database Backup and Recovery User's Guide* .
       */
      override fun extraArchivedLogDestIds(extraArchivedLogDestIds: IResolvable) {
        cdkBuilder.extraArchivedLogDestIds(extraArchivedLogDestIds.let(IResolvable::unwrap))
      }

      /**
       * @param extraArchivedLogDestIds Specifies the IDs of one more destinations for one or more
       * archived redo logs.
       * These IDs are the values of the `dest_id` column in the `v$archived_log` view. Use this
       * setting with the `archivedLogDestId` extra connection attribute in a primary-to-single setup
       * or a primary-to-multiple-standby setup.
       *
       * This setting is useful in a switchover when you use an Oracle Data Guard database as a
       * source. In this case, AWS DMS needs information about what destination to get archive redo
       * logs from to read changes. AWS DMS needs this because after the switchover the previous
       * primary is a standby instance. For example, in a primary-to-single standby setup you might
       * apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2]`
       *
       * In a primary-to-multiple-standby setup, you might apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2,3,4]`
       *
       * Although AWS DMS supports the use of the Oracle `RESETLOGS` option to open the database,
       * never use `RESETLOGS` unless it's necessary. For more information about `RESETLOGS` , see
       * [RMAN Data Repair
       * Concepts](https://docs.aws.amazon.com/https://docs.oracle.com/en/database/oracle/oracle-database/19/bradv/rman-data-repair-concepts.html#GUID-1805CCF7-4AF2-482D-B65A-998192F89C2B)
       * in the *Oracle Database Backup and Recovery User's Guide* .
       */
      override fun extraArchivedLogDestIds(extraArchivedLogDestIds: List<Number>) {
        cdkBuilder.extraArchivedLogDestIds(extraArchivedLogDestIds)
      }

      /**
       * @param extraArchivedLogDestIds Specifies the IDs of one more destinations for one or more
       * archived redo logs.
       * These IDs are the values of the `dest_id` column in the `v$archived_log` view. Use this
       * setting with the `archivedLogDestId` extra connection attribute in a primary-to-single setup
       * or a primary-to-multiple-standby setup.
       *
       * This setting is useful in a switchover when you use an Oracle Data Guard database as a
       * source. In this case, AWS DMS needs information about what destination to get archive redo
       * logs from to read changes. AWS DMS needs this because after the switchover the previous
       * primary is a standby instance. For example, in a primary-to-single standby setup you might
       * apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2]`
       *
       * In a primary-to-multiple-standby setup, you might apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2,3,4]`
       *
       * Although AWS DMS supports the use of the Oracle `RESETLOGS` option to open the database,
       * never use `RESETLOGS` unless it's necessary. For more information about `RESETLOGS` , see
       * [RMAN Data Repair
       * Concepts](https://docs.aws.amazon.com/https://docs.oracle.com/en/database/oracle/oracle-database/19/bradv/rman-data-repair-concepts.html#GUID-1805CCF7-4AF2-482D-B65A-998192F89C2B)
       * in the *Oracle Database Backup and Recovery User's Guide* .
       */
      override fun extraArchivedLogDestIds(vararg extraArchivedLogDestIds: Number): Unit =
          extraArchivedLogDestIds(extraArchivedLogDestIds.toList())

      /**
       * @param failTasksOnLobTruncation When set to `true` , this attribute causes a task to fail
       * if the actual size of an LOB column is greater than the specified `LobMaxSize` .
       * If a task is set to limited LOB mode and this option is set to `true` , the task fails
       * instead of truncating the LOB data.
       */
      override fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation)
      }

      /**
       * @param failTasksOnLobTruncation When set to `true` , this attribute causes a task to fail
       * if the actual size of an LOB column is greater than the specified `LobMaxSize` .
       * If a task is set to limited LOB mode and this option is set to `true` , the task fails
       * instead of truncating the LOB data.
       */
      override fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation.let(IResolvable::unwrap))
      }

      /**
       * @param numberDatatypeScale Specifies the number scale.
       * You can select a scale up to 38, or you can select FLOAT. By default, the NUMBER data type
       * is converted to precision 38, scale 10.
       *
       * Example: `numberDataTypeScale=12`
       */
      override fun numberDatatypeScale(numberDatatypeScale: Number) {
        cdkBuilder.numberDatatypeScale(numberDatatypeScale)
      }

      /**
       * @param oraclePathPrefix Set this string attribute to the required value in order to use the
       * Binary Reader to capture change data for an Amazon RDS for Oracle as the source.
       * This value specifies the default Oracle root used to access the redo logs.
       */
      override fun oraclePathPrefix(oraclePathPrefix: String) {
        cdkBuilder.oraclePathPrefix(oraclePathPrefix)
      }

      /**
       * @param parallelAsmReadThreads Set this attribute to change the number of threads that DMS
       * configures to perform a change data capture (CDC) load using Oracle Automatic Storage
       * Management (ASM).
       * You can specify an integer value between 2 (the default) and 8 (the maximum). Use this
       * attribute together with the `readAheadBlocks` attribute.
       */
      override fun parallelAsmReadThreads(parallelAsmReadThreads: Number) {
        cdkBuilder.parallelAsmReadThreads(parallelAsmReadThreads)
      }

      /**
       * @param readAheadBlocks Set this attribute to change the number of read-ahead blocks that
       * DMS configures to perform a change data capture (CDC) load using Oracle Automatic Storage
       * Management (ASM).
       * You can specify an integer value between 1000 (the default) and 200,000 (the maximum).
       */
      override fun readAheadBlocks(readAheadBlocks: Number) {
        cdkBuilder.readAheadBlocks(readAheadBlocks)
      }

      /**
       * @param readTableSpaceName When set to `true` , this attribute supports tablespace
       * replication.
       */
      override fun readTableSpaceName(readTableSpaceName: Boolean) {
        cdkBuilder.readTableSpaceName(readTableSpaceName)
      }

      /**
       * @param readTableSpaceName When set to `true` , this attribute supports tablespace
       * replication.
       */
      override fun readTableSpaceName(readTableSpaceName: IResolvable) {
        cdkBuilder.readTableSpaceName(readTableSpaceName.let(IResolvable::unwrap))
      }

      /**
       * @param replacePathPrefix Set this attribute to true in order to use the Binary Reader to
       * capture change data for an Amazon RDS for Oracle as the source.
       * This setting tells DMS instance to replace the default Oracle root with the specified
       * `usePathPrefix` setting to access the redo logs.
       */
      override fun replacePathPrefix(replacePathPrefix: Boolean) {
        cdkBuilder.replacePathPrefix(replacePathPrefix)
      }

      /**
       * @param replacePathPrefix Set this attribute to true in order to use the Binary Reader to
       * capture change data for an Amazon RDS for Oracle as the source.
       * This setting tells DMS instance to replace the default Oracle root with the specified
       * `usePathPrefix` setting to access the redo logs.
       */
      override fun replacePathPrefix(replacePathPrefix: IResolvable) {
        cdkBuilder.replacePathPrefix(replacePathPrefix.let(IResolvable::unwrap))
      }

      /**
       * @param retryInterval Specifies the number of seconds that the system waits before resending
       * a query.
       * Example: `retryInterval=6;`
       */
      override fun retryInterval(retryInterval: Number) {
        cdkBuilder.retryInterval(retryInterval)
      }

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the Oracle endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      /**
       * @param secretsManagerOracleAsmAccessRoleArn Required only if your Oracle endpoint uses
       * Advanced Storage Manager (ASM).
       * The full ARN of the IAM role that specifies AWS DMS as the trusted entity and grants the
       * required permissions to access the `SecretsManagerOracleAsmSecret` . This
       * `SecretsManagerOracleAsmSecret` has the secret value that allows access to the Oracle ASM of
       * the endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerOracleAsmSecretId` . Or you can specify clear-text values
       * for `AsmUser` , `AsmPassword` , and `AsmServerName` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerOracleAsmSecret` , the corresponding
       * `SecretsManagerOracleAsmAccessRoleArn` , and the `SecretsManagerOracleAsmSecretId` that is
       * required to access it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      override
          fun secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn: String) {
        cdkBuilder.secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn)
      }

      /**
       * @param secretsManagerOracleAsmSecretId Required only if your Oracle endpoint uses Advanced
       * Storage Manager (ASM).
       * The full ARN, partial ARN, or display name of the `SecretsManagerOracleAsmSecret` that
       * contains the Oracle ASM connection details for the Oracle endpoint.
       */
      override fun secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId: String) {
        cdkBuilder.secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId)
      }

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the Oracle endpoint connection details.
       */
      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      /**
       * @param securityDbEncryption For an Oracle source endpoint, the transparent data encryption
       * (TDE) password required by AWM DMS to access Oracle redo logs encrypted by TDE using Binary
       * Reader.
       * It is also the `*TDE_Password*` part of the comma-separated value you set to the `Password`
       * request parameter when you create the endpoint. The `SecurityDbEncryptian` setting is related
       * to this `SecurityDbEncryptionName` setting. For more information, see [Supported encryption
       * methods for using Oracle as a source for AWS
       * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun securityDbEncryption(securityDbEncryption: String) {
        cdkBuilder.securityDbEncryption(securityDbEncryption)
      }

      /**
       * @param securityDbEncryptionName For an Oracle source endpoint, the name of a key used for
       * the transparent data encryption (TDE) of the columns and tablespaces in an Oracle source
       * database that is encrypted using TDE.
       * The key value is the value of the `SecurityDbEncryption` setting. For more information on
       * setting the key name value of `SecurityDbEncryptionName` , see the information and example for
       * setting the `securityDbEncryptionName` extra connection attribute in [Supported encryption
       * methods for using Oracle as a source for AWS
       * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun securityDbEncryptionName(securityDbEncryptionName: String) {
        cdkBuilder.securityDbEncryptionName(securityDbEncryptionName)
      }

      /**
       * @param spatialDataOptionToGeoJsonFunctionName Use this attribute to convert `SDO_GEOMETRY`
       * to `GEOJSON` format.
       * By default, DMS calls the `SDO2GEOJSON` custom function if present and accessible. Or you
       * can create your own custom function that mimics the operation of `SDOGEOJSON` and set
       * `SpatialDataOptionToGeoJsonFunctionName` to call it instead.
       */
      override
          fun spatialDataOptionToGeoJsonFunctionName(spatialDataOptionToGeoJsonFunctionName: String) {
        cdkBuilder.spatialDataOptionToGeoJsonFunctionName(spatialDataOptionToGeoJsonFunctionName)
      }

      /**
       * @param standbyDelayTime Use this attribute to specify a time in minutes for the delay in
       * standby sync.
       * If the source is an Oracle Active Data Guard standby database, use this attribute to
       * specify the time lag between primary and standby databases.
       *
       * In AWS DMS , you can create an Oracle CDC task that uses an Active Data Guard standby
       * instance as a source for replicating ongoing changes. Doing this eliminates the need to
       * connect to an active database that might be in production.
       */
      override fun standbyDelayTime(standbyDelayTime: Number) {
        cdkBuilder.standbyDelayTime(standbyDelayTime)
      }

      /**
       * @param useAlternateFolderForOnline Set this attribute to `true` in order to use the Binary
       * Reader to capture change data for an Amazon RDS for Oracle as the source.
       * This tells the DMS instance to use any specified prefix replacement to access all online
       * redo logs.
       */
      override fun useAlternateFolderForOnline(useAlternateFolderForOnline: Boolean) {
        cdkBuilder.useAlternateFolderForOnline(useAlternateFolderForOnline)
      }

      /**
       * @param useAlternateFolderForOnline Set this attribute to `true` in order to use the Binary
       * Reader to capture change data for an Amazon RDS for Oracle as the source.
       * This tells the DMS instance to use any specified prefix replacement to access all online
       * redo logs.
       */
      override fun useAlternateFolderForOnline(useAlternateFolderForOnline: IResolvable) {
        cdkBuilder.useAlternateFolderForOnline(useAlternateFolderForOnline.let(IResolvable::unwrap))
      }

      /**
       * @param useBFile Set this attribute to Y to capture change data using the Binary Reader
       * utility.
       * Set `UseLogminerReader` to N to set this attribute to Y. To use Binary Reader with Amazon
       * RDS for Oracle as the source, you set additional attributes. For more information about using
       * this setting with Oracle Automatic Storage Management (ASM), see [Using Oracle LogMiner or AWS
       * DMS Binary Reader for
       * CDC](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC)
       * .
       */
      override fun useBFile(useBFile: Boolean) {
        cdkBuilder.useBFile(useBFile)
      }

      /**
       * @param useBFile Set this attribute to Y to capture change data using the Binary Reader
       * utility.
       * Set `UseLogminerReader` to N to set this attribute to Y. To use Binary Reader with Amazon
       * RDS for Oracle as the source, you set additional attributes. For more information about using
       * this setting with Oracle Automatic Storage Management (ASM), see [Using Oracle LogMiner or AWS
       * DMS Binary Reader for
       * CDC](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC)
       * .
       */
      override fun useBFile(useBFile: IResolvable) {
        cdkBuilder.useBFile(useBFile.let(IResolvable::unwrap))
      }

      /**
       * @param useDirectPathFullLoad Set this attribute to Y to have AWS DMS use a direct path full
       * load.
       * Specify this value to use the direct path protocol in the Oracle Call Interface (OCI). By
       * using this OCI protocol, you can bulk-load Oracle target tables during a full load.
       */
      override fun useDirectPathFullLoad(useDirectPathFullLoad: Boolean) {
        cdkBuilder.useDirectPathFullLoad(useDirectPathFullLoad)
      }

      /**
       * @param useDirectPathFullLoad Set this attribute to Y to have AWS DMS use a direct path full
       * load.
       * Specify this value to use the direct path protocol in the Oracle Call Interface (OCI). By
       * using this OCI protocol, you can bulk-load Oracle target tables during a full load.
       */
      override fun useDirectPathFullLoad(useDirectPathFullLoad: IResolvable) {
        cdkBuilder.useDirectPathFullLoad(useDirectPathFullLoad.let(IResolvable::unwrap))
      }

      /**
       * @param useLogminerReader Set this attribute to Y to capture change data using the Oracle
       * LogMiner utility (the default).
       * Set this attribute to N if you want to access the redo logs as a binary file. When you set
       * `UseLogminerReader` to N, also set `UseBfile` to Y. For more information on this setting and
       * using Oracle ASM, see [Using Oracle LogMiner or AWS DMS Binary Reader for
       * CDC](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC)
       * in the *AWS DMS User Guide* .
       */
      override fun useLogminerReader(useLogminerReader: Boolean) {
        cdkBuilder.useLogminerReader(useLogminerReader)
      }

      /**
       * @param useLogminerReader Set this attribute to Y to capture change data using the Oracle
       * LogMiner utility (the default).
       * Set this attribute to N if you want to access the redo logs as a binary file. When you set
       * `UseLogminerReader` to N, also set `UseBfile` to Y. For more information on this setting and
       * using Oracle ASM, see [Using Oracle LogMiner or AWS DMS Binary Reader for
       * CDC](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC)
       * in the *AWS DMS User Guide* .
       */
      override fun useLogminerReader(useLogminerReader: IResolvable) {
        cdkBuilder.useLogminerReader(useLogminerReader.let(IResolvable::unwrap))
      }

      /**
       * @param usePathPrefix Set this string attribute to the required value in order to use the
       * Binary Reader to capture change data for an Amazon RDS for Oracle as the source.
       * This value specifies the path prefix used to replace the default Oracle root to access the
       * redo logs.
       */
      override fun usePathPrefix(usePathPrefix: String) {
        cdkBuilder.usePathPrefix(usePathPrefix)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty,
    ) : CdkObject(cdkObject), OracleSettingsProperty {
      /**
       * Set this attribute to `false` in order to use the Binary Reader to capture change data for
       * an Amazon RDS for Oracle as the source.
       *
       * This tells the DMS instance to not access redo logs through any specified path prefix
       * replacement using direct file access.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-accessalternatedirectly)
       */
      override fun accessAlternateDirectly(): Any? = unwrap(this).getAccessAlternateDirectly()

      /**
       * Set this attribute to set up table-level supplemental logging for the Oracle database.
       *
       * This attribute enables PRIMARY KEY supplemental logging on all tables selected for a
       * migration task.
       *
       * If you use this option, you still need to enable database-level supplemental logging.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-addsupplementallogging)
       */
      override fun addSupplementalLogging(): Any? = unwrap(this).getAddSupplementalLogging()

      /**
       * Set this attribute with `ArchivedLogDestId` in a primary/ standby setup.
       *
       * This attribute is useful in the case of a switchover. In this case, AWS DMS needs to know
       * which destination to get archive redo logs from to read changes. This need arises because the
       * previous primary instance is now a standby instance after switchover.
       *
       * Although AWS DMS supports the use of the Oracle `RESETLOGS` option to open the database,
       * never use `RESETLOGS` unless necessary. For additional information about `RESETLOGS` , see
       * [RMAN Data Repair
       * Concepts](https://docs.aws.amazon.com/https://docs.oracle.com/en/database/oracle/oracle-database/19/bradv/rman-data-repair-concepts.html#GUID-1805CCF7-4AF2-482D-B65A-998192F89C2B)
       * in the *Oracle Database Backup and Recovery User's Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-additionalarchivedlogdestid)
       */
      override fun additionalArchivedLogDestId(): Number? =
          unwrap(this).getAdditionalArchivedLogDestId()

      /**
       * Set this attribute to `true` to enable replication of Oracle tables containing columns that
       * are nested tables or defined types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-allowselectnestedtables)
       */
      override fun allowSelectNestedTables(): Any? = unwrap(this).getAllowSelectNestedTables()

      /**
       * Specifies the ID of the destination for the archived redo logs.
       *
       * This value should be the same as a number in the dest_id column of the v$archived_log view.
       * If you work with an additional redo log destination, use the `AdditionalArchivedLogDestId`
       * option to specify the additional destination ID. Doing this improves performance by ensuring
       * that the correct logs are accessed from the outset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-archivedlogdestid)
       */
      override fun archivedLogDestId(): Number? = unwrap(this).getArchivedLogDestId()

      /**
       * When this field is set to `Y` , AWS DMS only accesses the archived redo logs.
       *
       * If the archived redo logs are stored on Automatic Storage Management (ASM) only, the AWS
       * DMS user account needs to be granted ASM privileges.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-archivedlogsonly)
       */
      override fun archivedLogsOnly(): Any? = unwrap(this).getArchivedLogsOnly()

      /**
       * For an Oracle source endpoint, your Oracle Automatic Storage Management (ASM) password.
       *
       * You can set this value from the `*asm_user_password*` value. You set this value as part of
       * the comma-separated value that you set to the `Password` request parameter when you create the
       * endpoint to access transaction logs using Binary Reader. For more information, see
       * [Configuration for change data capture (CDC) on an Oracle source
       * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-asmpassword)
       */
      override fun asmPassword(): String? = unwrap(this).getAsmPassword()

      /**
       * For an Oracle source endpoint, your ASM server address.
       *
       * You can set this value from the `asm_server` value. You set `asm_server` as part of the
       * extra connection attribute string to access an Oracle server with Binary Reader that uses ASM.
       * For more information, see [Configuration for change data capture (CDC) on an Oracle source
       * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-asmserver)
       */
      override fun asmServer(): String? = unwrap(this).getAsmServer()

      /**
       * For an Oracle source endpoint, your ASM user name.
       *
       * You can set this value from the `asm_user` value. You set `asm_user` as part of the extra
       * connection attribute string to access an Oracle server with Binary Reader that uses ASM. For
       * more information, see [Configuration for change data capture (CDC) on an Oracle source
       * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-asmuser)
       */
      override fun asmUser(): String? = unwrap(this).getAsmUser()

      /**
       * Specifies whether the length of a character column is in bytes or in characters.
       *
       * To indicate that the character column length is in characters, set this attribute to `CHAR`
       * . Otherwise, the character column length is in bytes.
       *
       * Example: `charLengthSemantics=CHAR;`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-charlengthsemantics)
       */
      override fun charLengthSemantics(): String? = unwrap(this).getCharLengthSemantics()

      /**
       * When set to `true` , this attribute helps to increase the commit rate on the Oracle target
       * database by writing directly to tables and not writing a trail to database logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-directpathnolog)
       */
      override fun directPathNoLog(): Any? = unwrap(this).getDirectPathNoLog()

      /**
       * When set to `true` , this attribute specifies a parallel load when `useDirectPathFullLoad`
       * is set to `Y` .
       *
       * This attribute also only applies when you use the AWS DMS parallel load feature. Note that
       * the target table cannot have any constraints or indexes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-directpathparallelload)
       */
      override fun directPathParallelLoad(): Any? = unwrap(this).getDirectPathParallelLoad()

      /**
       * Set this attribute to enable homogenous tablespace replication and create existing tables
       * or indexes under the same tablespace on the target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-enablehomogenoustablespace)
       */
      override fun enableHomogenousTablespace(): Any? = unwrap(this).getEnableHomogenousTablespace()

      /**
       * Specifies the IDs of one more destinations for one or more archived redo logs.
       *
       * These IDs are the values of the `dest_id` column in the `v$archived_log` view. Use this
       * setting with the `archivedLogDestId` extra connection attribute in a primary-to-single setup
       * or a primary-to-multiple-standby setup.
       *
       * This setting is useful in a switchover when you use an Oracle Data Guard database as a
       * source. In this case, AWS DMS needs information about what destination to get archive redo
       * logs from to read changes. AWS DMS needs this because after the switchover the previous
       * primary is a standby instance. For example, in a primary-to-single standby setup you might
       * apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2]`
       *
       * In a primary-to-multiple-standby setup, you might apply the following settings.
       *
       * `archivedLogDestId=1; ExtraArchivedLogDestIds=[2,3,4]`
       *
       * Although AWS DMS supports the use of the Oracle `RESETLOGS` option to open the database,
       * never use `RESETLOGS` unless it's necessary. For more information about `RESETLOGS` , see
       * [RMAN Data Repair
       * Concepts](https://docs.aws.amazon.com/https://docs.oracle.com/en/database/oracle/oracle-database/19/bradv/rman-data-repair-concepts.html#GUID-1805CCF7-4AF2-482D-B65A-998192F89C2B)
       * in the *Oracle Database Backup and Recovery User's Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-extraarchivedlogdestids)
       */
      override fun extraArchivedLogDestIds(): Any? = unwrap(this).getExtraArchivedLogDestIds()

      /**
       * When set to `true` , this attribute causes a task to fail if the actual size of an LOB
       * column is greater than the specified `LobMaxSize` .
       *
       * If a task is set to limited LOB mode and this option is set to `true` , the task fails
       * instead of truncating the LOB data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-failtasksonlobtruncation)
       */
      override fun failTasksOnLobTruncation(): Any? = unwrap(this).getFailTasksOnLobTruncation()

      /**
       * Specifies the number scale.
       *
       * You can select a scale up to 38, or you can select FLOAT. By default, the NUMBER data type
       * is converted to precision 38, scale 10.
       *
       * Example: `numberDataTypeScale=12`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-numberdatatypescale)
       */
      override fun numberDatatypeScale(): Number? = unwrap(this).getNumberDatatypeScale()

      /**
       * Set this string attribute to the required value in order to use the Binary Reader to
       * capture change data for an Amazon RDS for Oracle as the source.
       *
       * This value specifies the default Oracle root used to access the redo logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-oraclepathprefix)
       */
      override fun oraclePathPrefix(): String? = unwrap(this).getOraclePathPrefix()

      /**
       * Set this attribute to change the number of threads that DMS configures to perform a change
       * data capture (CDC) load using Oracle Automatic Storage Management (ASM).
       *
       * You can specify an integer value between 2 (the default) and 8 (the maximum). Use this
       * attribute together with the `readAheadBlocks` attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-parallelasmreadthreads)
       */
      override fun parallelAsmReadThreads(): Number? = unwrap(this).getParallelAsmReadThreads()

      /**
       * Set this attribute to change the number of read-ahead blocks that DMS configures to perform
       * a change data capture (CDC) load using Oracle Automatic Storage Management (ASM).
       *
       * You can specify an integer value between 1000 (the default) and 200,000 (the maximum).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-readaheadblocks)
       */
      override fun readAheadBlocks(): Number? = unwrap(this).getReadAheadBlocks()

      /**
       * When set to `true` , this attribute supports tablespace replication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-readtablespacename)
       */
      override fun readTableSpaceName(): Any? = unwrap(this).getReadTableSpaceName()

      /**
       * Set this attribute to true in order to use the Binary Reader to capture change data for an
       * Amazon RDS for Oracle as the source.
       *
       * This setting tells DMS instance to replace the default Oracle root with the specified
       * `usePathPrefix` setting to access the redo logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-replacepathprefix)
       */
      override fun replacePathPrefix(): Any? = unwrap(this).getReplacePathPrefix()

      /**
       * Specifies the number of seconds that the system waits before resending a query.
       *
       * Example: `retryInterval=6;`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-retryinterval)
       */
      override fun retryInterval(): Number? = unwrap(this).getRetryInterval()

      /**
       * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
       * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
       *
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the Oracle endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-secretsmanageraccessrolearn)
       */
      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      /**
       * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM).
       *
       * The full ARN of the IAM role that specifies AWS DMS as the trusted entity and grants the
       * required permissions to access the `SecretsManagerOracleAsmSecret` . This
       * `SecretsManagerOracleAsmSecret` has the secret value that allows access to the Oracle ASM of
       * the endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerOracleAsmSecretId` . Or you can specify clear-text values
       * for `AsmUser` , `AsmPassword` , and `AsmServerName` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerOracleAsmSecret` , the corresponding
       * `SecretsManagerOracleAsmAccessRoleArn` , and the `SecretsManagerOracleAsmSecretId` that is
       * required to access it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-secretsmanageroracleasmaccessrolearn)
       */
      override fun secretsManagerOracleAsmAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerOracleAsmAccessRoleArn()

      /**
       * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM).
       *
       * The full ARN, partial ARN, or display name of the `SecretsManagerOracleAsmSecret` that
       * contains the Oracle ASM connection details for the Oracle endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-secretsmanageroracleasmsecretid)
       */
      override fun secretsManagerOracleAsmSecretId(): String? =
          unwrap(this).getSecretsManagerOracleAsmSecretId()

      /**
       * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
       * Oracle endpoint connection details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-secretsmanagersecretid)
       */
      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      /**
       * For an Oracle source endpoint, the transparent data encryption (TDE) password required by
       * AWM DMS to access Oracle redo logs encrypted by TDE using Binary Reader.
       *
       * It is also the `*TDE_Password*` part of the comma-separated value you set to the `Password`
       * request parameter when you create the endpoint. The `SecurityDbEncryptian` setting is related
       * to this `SecurityDbEncryptionName` setting. For more information, see [Supported encryption
       * methods for using Oracle as a source for AWS
       * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption)
       * in the *AWS Database Migration Service User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-securitydbencryption)
       */
      override fun securityDbEncryption(): String? = unwrap(this).getSecurityDbEncryption()

      /**
       * For an Oracle source endpoint, the name of a key used for the transparent data encryption
       * (TDE) of the columns and tablespaces in an Oracle source database that is encrypted using TDE.
       *
       * The key value is the value of the `SecurityDbEncryption` setting. For more information on
       * setting the key name value of `SecurityDbEncryptionName` , see the information and example for
       * setting the `securityDbEncryptionName` extra connection attribute in [Supported encryption
       * methods for using Oracle as a source for AWS
       * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption)
       * in the *AWS Database Migration Service User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-securitydbencryptionname)
       */
      override fun securityDbEncryptionName(): String? = unwrap(this).getSecurityDbEncryptionName()

      /**
       * Use this attribute to convert `SDO_GEOMETRY` to `GEOJSON` format.
       *
       * By default, DMS calls the `SDO2GEOJSON` custom function if present and accessible. Or you
       * can create your own custom function that mimics the operation of `SDOGEOJSON` and set
       * `SpatialDataOptionToGeoJsonFunctionName` to call it instead.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-spatialdataoptiontogeojsonfunctionname)
       */
      override fun spatialDataOptionToGeoJsonFunctionName(): String? =
          unwrap(this).getSpatialDataOptionToGeoJsonFunctionName()

      /**
       * Use this attribute to specify a time in minutes for the delay in standby sync.
       *
       * If the source is an Oracle Active Data Guard standby database, use this attribute to
       * specify the time lag between primary and standby databases.
       *
       * In AWS DMS , you can create an Oracle CDC task that uses an Active Data Guard standby
       * instance as a source for replicating ongoing changes. Doing this eliminates the need to
       * connect to an active database that might be in production.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-standbydelaytime)
       */
      override fun standbyDelayTime(): Number? = unwrap(this).getStandbyDelayTime()

      /**
       * Set this attribute to `true` in order to use the Binary Reader to capture change data for
       * an Amazon RDS for Oracle as the source.
       *
       * This tells the DMS instance to use any specified prefix replacement to access all online
       * redo logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-usealternatefolderforonline)
       */
      override fun useAlternateFolderForOnline(): Any? =
          unwrap(this).getUseAlternateFolderForOnline()

      /**
       * Set this attribute to Y to capture change data using the Binary Reader utility.
       *
       * Set `UseLogminerReader` to N to set this attribute to Y. To use Binary Reader with Amazon
       * RDS for Oracle as the source, you set additional attributes. For more information about using
       * this setting with Oracle Automatic Storage Management (ASM), see [Using Oracle LogMiner or AWS
       * DMS Binary Reader for
       * CDC](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-usebfile)
       */
      override fun useBFile(): Any? = unwrap(this).getUseBFile()

      /**
       * Set this attribute to Y to have AWS DMS use a direct path full load.
       *
       * Specify this value to use the direct path protocol in the Oracle Call Interface (OCI). By
       * using this OCI protocol, you can bulk-load Oracle target tables during a full load.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-usedirectpathfullload)
       */
      override fun useDirectPathFullLoad(): Any? = unwrap(this).getUseDirectPathFullLoad()

      /**
       * Set this attribute to Y to capture change data using the Oracle LogMiner utility (the
       * default).
       *
       * Set this attribute to N if you want to access the redo logs as a binary file. When you set
       * `UseLogminerReader` to N, also set `UseBfile` to Y. For more information on this setting and
       * using Oracle ASM, see [Using Oracle LogMiner or AWS DMS Binary Reader for
       * CDC](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC)
       * in the *AWS DMS User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-uselogminerreader)
       */
      override fun useLogminerReader(): Any? = unwrap(this).getUseLogminerReader()

      /**
       * Set this string attribute to the required value in order to use the Binary Reader to
       * capture change data for an Amazon RDS for Oracle as the source.
       *
       * This value specifies the path prefix used to replace the default Oracle root to access the
       * redo logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-oraclesettings.html#cfn-dms-endpoint-oraclesettings-usepathprefix)
       */
      override fun usePathPrefix(): String? = unwrap(this).getUsePathPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OracleSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty):
          OracleSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OracleSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty
    }
  }

  public interface S3SettingsProperty {
    /**
     * An optional parameter that, when set to `true` or `y` , you can use to add column name
     * information to the .csv output file.
     *
     * The default value is `false` . Valid values are `true` , `false` , `y` , and `n` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-addcolumnname)
     */
    public fun addColumnName(): Any? = unwrap(this).getAddColumnName()

    /**
     * Use the S3 target endpoint setting `AddTrailingPaddingCharacter` to add padding on string
     * data.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-addtrailingpaddingcharacter)
     */
    public fun addTrailingPaddingCharacter(): Any? = unwrap(this).getAddTrailingPaddingCharacter()

    /**
     * An optional parameter to set a folder name in the S3 bucket.
     *
     * If provided, tables are created in the path `*bucketFolder* / *schema_name* / *table_name* /`
     * . If this parameter isn't specified, the path used is `*schema_name* / *table_name* /` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder)
     */
    public fun bucketFolder(): String? = unwrap(this).getBucketFolder()

    /**
     * The name of the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname)
     */
    public fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * A value that enables AWS DMS to specify a predefined (canned) access control list (ACL) for
     * objects created in an Amazon S3 bucket as .csv or .parquet files. For more information about
     * Amazon S3 canned ACLs, see [Canned
     * ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) in the
     * *Amazon S3 Developer Guide* .
     *
     * The default value is NONE. Valid values include NONE, PRIVATE, PUBLIC_READ,
     * PUBLIC_READ_WRITE, AUTHENTICATED_READ, AWS_EXEC_READ, BUCKET_OWNER_READ, and
     * BUCKET_OWNER_FULL_CONTROL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-cannedaclforobjects)
     */
    public fun cannedAclForObjects(): String? = unwrap(this).getCannedAclForObjects()

    /**
     * A value that enables a change data capture (CDC) load to write INSERT and UPDATE operations
     * to .csv or .parquet (columnar storage) output files. The default setting is `false` , but when
     * `CdcInsertsAndUpdates` is set to `true` or `y` , only INSERTs and UPDATEs from the source
     * database are migrated to the .csv or .parquet file.
     *
     * For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value of
     * the `IncludeOpForFullLoad` parameter. If `IncludeOpForFullLoad` is set to `true` , the first
     * field of every CDC record is set to either `I` or `U` to indicate INSERT and UPDATE operations
     * at the source. But if `IncludeOpForFullLoad` is set to `false` , CDC records are written without
     * an indication of INSERT or UPDATE operations at the source. For more information about how these
     * settings work together, see [Indicating Source DB Operations in Migrated S3
     * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * AWS DMS supports the use of the `CdcInsertsAndUpdates` parameter in versions 3.3.1 and later.
     *
     * `CdcInsertsOnly` and `CdcInsertsAndUpdates` can't both be set to `true` for the same
     * endpoint. Set either `CdcInsertsOnly` or `CdcInsertsAndUpdates` to `true` for the same endpoint,
     * but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-cdcinsertsandupdates)
     */
    public fun cdcInsertsAndUpdates(): Any? = unwrap(this).getCdcInsertsAndUpdates()

    /**
     * A value that enables a change data capture (CDC) load to write only INSERT operations to .csv
     * or columnar storage (.parquet) output files. By default (the `false` setting), the first field
     * in a .csv or .parquet record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These
     * values indicate whether the row was inserted, updated, or deleted at the source database for a
     * CDC load to the target.
     *
     * If `CdcInsertsOnly` is set to `true` or `y` , only INSERTs from the source database are
     * migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded
     * depends on the value of `IncludeOpForFullLoad` . If `IncludeOpForFullLoad` is set to `true` ,
     * the first field of every CDC record is set to I to indicate the INSERT operation at the source.
     * If `IncludeOpForFullLoad` is set to `false` , every CDC record is written without a first field
     * to indicate the INSERT operation at the source. For more information about how these settings
     * work together, see [Indicating Source DB Operations in Migrated S3
     * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * AWS DMS supports the interaction described preceding between the `CdcInsertsOnly` and
     * `IncludeOpForFullLoad` parameters in versions 3.1.4 and later.
     *
     * `CdcInsertsOnly` and `CdcInsertsAndUpdates` can't both be set to `true` for the same
     * endpoint. Set either `CdcInsertsOnly` or `CdcInsertsAndUpdates` to `true` for the same endpoint,
     * but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-cdcinsertsonly)
     */
    public fun cdcInsertsOnly(): Any? = unwrap(this).getCdcInsertsOnly()

    /**
     * Maximum length of the interval, defined in seconds, after which to output a file to Amazon
     * S3.
     *
     * When `CdcMaxBatchInterval` and `CdcMinFileSize` are both specified, the file write is
     * triggered by whichever parameter condition is met first within an AWS DMS CloudFormation
     * template.
     *
     * The default value is 60 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-cdcmaxbatchinterval)
     */
    public fun cdcMaxBatchInterval(): Number? = unwrap(this).getCdcMaxBatchInterval()

    /**
     * Minimum file size, defined in kilobytes, to reach for a file output to Amazon S3.
     *
     * When `CdcMinFileSize` and `CdcMaxBatchInterval` are both specified, the file write is
     * triggered by whichever parameter condition is met first within an AWS DMS CloudFormation
     * template.
     *
     * The default value is 32 MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-cdcminfilesize)
     */
    public fun cdcMinFileSize(): Number? = unwrap(this).getCdcMinFileSize()

    /**
     * Specifies the folder path of CDC files.
     *
     * For an S3 source, this setting is required if a task captures change data; otherwise, it's
     * optional. If `CdcPath` is set, AWS DMS reads CDC files from this path and replicates the data
     * changes to the target endpoint. For an S3 target if you set
     * [`PreserveTransactions`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-PreserveTransactions)
     * to `true` , AWS DMS verifies that you have set this parameter to a folder path on your S3 target
     * where AWS DMS can save the transaction order for the CDC load. AWS DMS creates this CDC folder
     * path in either your S3 target working directory or the S3 target location specified by
     * [`BucketFolder`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketFolder)
     * and
     * [`BucketName`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketName)
     * .
     *
     * For example, if you specify `CdcPath` as `MyChangedData` , and you specify `BucketName` as
     * `MyTargetBucket` but do not specify `BucketFolder` , AWS DMS creates the CDC folder path
     * following: `MyTargetBucket/MyChangedData` .
     *
     * If you specify the same `CdcPath` , and you specify `BucketName` as `MyTargetBucket` and
     * `BucketFolder` as `MyTargetData` , AWS DMS creates the CDC folder path following:
     * `MyTargetBucket/MyTargetData/MyChangedData` .
     *
     * For more information on CDC including transaction order on an S3 target, see [Capturing data
     * changes (CDC) including transaction order on the S3
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath)
     * .
     *
     *
     * This setting is supported in AWS DMS versions 3.4.2 and later.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-cdcpath)
     */
    public fun cdcPath(): String? = unwrap(this).getCdcPath()

    /**
     * An optional parameter.
     *
     * When set to GZIP it enables the service to compress the target files. To allow the service to
     * write the target files uncompressed, either set this parameter to NONE (the default) or don't
     * specify the parameter at all. This parameter applies to both .csv and .parquet file formats.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype)
     */
    public fun compressionType(): String? = unwrap(this).getCompressionType()

    /**
     * The delimiter used to separate columns in the .csv file for both source and target. The
     * default is a comma.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter)
     */
    public fun csvDelimiter(): String? = unwrap(this).getCsvDelimiter()

    /**
     * This setting only applies if your Amazon S3 output files during a change data capture (CDC)
     * load are written in .csv format. If
     * [`UseCsvNoSupValue`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-UseCsvNoSupValue)
     * is set to true, specify a string value that you want AWS DMS to use for all columns not included
     * in the supplemental log. If you do not specify a string value, AWS DMS uses the null value for
     * these columns regardless of the `UseCsvNoSupValue` setting.
     *
     *
     * This setting is supported in AWS DMS versions 3.4.1 and later.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvnosupvalue)
     */
    public fun csvNoSupValue(): String? = unwrap(this).getCsvNoSupValue()

    /**
     * An optional parameter that specifies how AWS DMS treats null values.
     *
     * While handling the null value, you can use this parameter to pass a user-defined string as
     * null when writing to the target. For example, when target columns are not nullable, you can use
     * this option to differentiate between the empty string value and the null value. So, if you set
     * this parameter value to the empty string ("" or ''), AWS DMS treats the empty string as the null
     * value instead of `NULL` .
     *
     * The default value is `NULL` . Valid values include any valid string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvnullvalue)
     */
    public fun csvNullValue(): String? = unwrap(this).getCsvNullValue()

    /**
     * The delimiter used to separate rows in the .csv file for both source and target.
     *
     * The default is a carriage return ( `\n` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter)
     */
    public fun csvRowDelimiter(): String? = unwrap(this).getCsvRowDelimiter()

    /**
     * The format of the data that you want to use for output. You can choose one of the following:.
     *
     * * `csv` : This is a row-based file format with comma-separated values (.csv).
     * * `parquet` : Apache Parquet (.parquet) is a columnar storage file format that features
     * efficient compression and provides faster query response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-dataformat)
     */
    public fun dataFormat(): String? = unwrap(this).getDataFormat()

    /**
     * The size of one data page in bytes.
     *
     * This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is used for .parquet file
     * format only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-datapagesize)
     */
    public fun dataPageSize(): Number? = unwrap(this).getDataPageSize()

    /**
     * Specifies a date separating delimiter to use during folder partitioning.
     *
     * The default value is `SLASH` . Use this parameter when `DatePartitionedEnabled` is set to
     * `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-datepartitiondelimiter)
     */
    public fun datePartitionDelimiter(): String? = unwrap(this).getDatePartitionDelimiter()

    /**
     * When set to `true` , this parameter partitions S3 bucket folders based on transaction commit
     * dates.
     *
     * The default value is `false` . For more information about date-based folder partitioning, see
     * [Using date-based folder
     * partitioning](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-datepartitionenabled)
     */
    public fun datePartitionEnabled(): Any? = unwrap(this).getDatePartitionEnabled()

    /**
     * Identifies the sequence of the date format to use during folder partitioning.
     *
     * The default value is `YYYYMMDD` . Use this parameter when `DatePartitionedEnabled` is set to
     * `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-datepartitionsequence)
     */
    public fun datePartitionSequence(): String? = unwrap(this).getDatePartitionSequence()

    /**
     * When creating an S3 target endpoint, set `DatePartitionTimezone` to convert the current UTC
     * time into a specified time zone.
     *
     * The conversion occurs when a date partition folder is created and a change data capture (CDC)
     * file name is generated. The time zone format is Area/Location. Use this parameter when
     * `DatePartitionedEnabled` is set to `true` , as shown in the following example.
     *
     * `s3-settings='{"DatePartitionEnabled": true, "DatePartitionSequence": "YYYYMMDDHH",
     * "DatePartitionDelimiter": "SLASH", "DatePartitionTimezone":" *Asia/Seoul* ", "BucketName":
     * "dms-nattarat-test"}'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-datepartitiontimezone)
     */
    public fun datePartitionTimezone(): String? = unwrap(this).getDatePartitionTimezone()

    /**
     * The maximum size of an encoded dictionary page of a column.
     *
     * If the dictionary page exceeds this, this column is stored using an encoding type of `PLAIN`
     * . This parameter defaults to 1024 * 1024 bytes (1 MiB), the maximum size of a dictionary page
     * before it reverts to `PLAIN` encoding. This size is used for .parquet file format only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-dictpagesizelimit)
     */
    public fun dictPageSizeLimit(): Number? = unwrap(this).getDictPageSizeLimit()

    /**
     * A value that enables statistics for Parquet pages and row groups.
     *
     * Choose `true` to enable statistics, `false` to disable. Statistics include `NULL` ,
     * `DISTINCT` , `MAX` , and `MIN` values. This parameter defaults to `true` . This value is used
     * for .parquet file format only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-enablestatistics)
     */
    public fun enableStatistics(): Any? = unwrap(this).getEnableStatistics()

    /**
     * The type of encoding that you're using:.
     *
     * * `RLE_DICTIONARY` uses a combination of bit-packing and run-length encoding to store
     * repeated values more efficiently. This is the default.
     * * `PLAIN` doesn't use encoding at all. Values are stored as they are.
     * * `PLAIN_DICTIONARY` builds a dictionary of the values encountered in a given column. The
     * dictionary is stored in a dictionary page for each column chunk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-encodingtype)
     */
    public fun encodingType(): String? = unwrap(this).getEncodingType()

    /**
     * The type of server-side encryption that you want to use for your data.
     *
     * This encryption type is part of the endpoint settings or the extra connections attributes for
     * Amazon S3. You can choose either `SSE_S3` (the default) or `SSE_KMS` .
     *
     *
     * For the `ModifyEndpoint` operation, you can change the existing value of the `EncryptionMode`
     * parameter from `SSE_KMS` to `SSE_S3` . But you can’t change the existing value from `SSE_S3` to
     * `SSE_KMS` .
     *
     *
     * To use `SSE_S3` , you need an IAM role with permission to allow `"arn:aws:s3:::dms-*"` to use
     * the following actions:
     *
     * * `s3:CreateBucket`
     * * `s3:ListBucket`
     * * `s3:DeleteBucket`
     * * `s3:GetBucketLocation`
     * * `s3:GetObject`
     * * `s3:PutObject`
     * * `s3:DeleteObject`
     * * `s3:GetObjectVersion`
     * * `s3:GetBucketPolicy`
     * * `s3:PutBucketPolicy`
     * * `s3:DeleteBucketPolicy`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-encryptionmode)
     */
    public fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

    /**
     * To specify a bucket owner and prevent sniping, you can use the `ExpectedBucketOwner` endpoint
     * setting.
     *
     * Example: `--s3-settings='{"ExpectedBucketOwner": " *AWS_Account_ID* "}'`
     *
     * When you make a request to test a connection or perform a migration, S3 checks the account ID
     * of the bucket owner against the specified parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-expectedbucketowner)
     */
    public fun expectedBucketOwner(): String? = unwrap(this).getExpectedBucketOwner()

    /**
     * The external table definition.
     *
     * Conditional: If `S3` is used as a source then `ExternalTableDefinition` is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition)
     */
    public fun externalTableDefinition(): String? = unwrap(this).getExternalTableDefinition()

    /**
     * When true, allows AWS Glue to catalog your S3 bucket.
     *
     * Creating an AWS Glue catalog lets you use Athena to query your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-gluecataloggeneration)
     */
    public fun glueCatalogGeneration(): Any? = unwrap(this).getGlueCatalogGeneration()

    /**
     * When this value is set to 1, AWS DMS ignores the first row header in a .csv file. A value of
     * 1 turns on the feature; a value of 0 turns off the feature.
     *
     * The default is 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-ignoreheaderrows)
     */
    public fun ignoreHeaderRows(): Number? = unwrap(this).getIgnoreHeaderRows()

    /**
     * A value that enables a full load to write INSERT operations to the comma-separated value
     * (.csv) output files only to indicate how the rows were added to the source database.
     *
     *
     * AWS DMS supports the `IncludeOpForFullLoad` parameter in versions 3.1.4 and later.
     *
     *
     * For full load, records can only be inserted. By default (the `false` setting), no information
     * is recorded in these output files for a full load to indicate that the rows were inserted at the
     * source database. If `IncludeOpForFullLoad` is set to `true` or `y` , the INSERT is recorded as
     * an I annotation in the first field of the .csv file. This allows the format of your target
     * records from a full load to be consistent with the target records from a CDC load.
     *
     *
     * This setting works together with the `CdcInsertsOnly` and the `CdcInsertsAndUpdates`
     * parameters for output to .csv files only. For more information about how these settings work
     * together, see [Indicating Source DB Operations in Migrated S3
     * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-includeopforfullload)
     */
    public fun includeOpForFullLoad(): Any? = unwrap(this).getIncludeOpForFullLoad()

    /**
     * A value that specifies the maximum size (in KB) of any .csv file to be created while
     * migrating to an S3 target during full load.
     *
     * The default value is 1,048,576 KB (1 GB). Valid values include 1 to 1,048,576.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-maxfilesize)
     */
    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    /**
     * A value that specifies the precision of any `TIMESTAMP` column values that are written to an
     * Amazon S3 object file in .parquet format.
     *
     *
     * AWS DMS supports the `ParquetTimestampInMillisecond` parameter in versions 3.1.4 and later.
     *
     *
     * When `ParquetTimestampInMillisecond` is set to `true` or `y` , AWS DMS writes all `TIMESTAMP`
     * columns in a .parquet formatted file with millisecond precision. Otherwise, DMS writes them with
     * microsecond precision.
     *
     * Currently, Amazon Athena and AWS Glue can handle only millisecond precision for `TIMESTAMP`
     * values. Set this parameter to `true` for S3 endpoint object files that are .parquet formatted
     * only if you plan to query or process the data with Athena or AWS Glue .
     *
     *
     * AWS DMS writes any `TIMESTAMP` column values written to an S3 file in .csv format with
     * microsecond precision.
     *
     * Setting `ParquetTimestampInMillisecond` has no effect on the string format of the timestamp
     * column value that is inserted by setting the `TimestampColumnName` parameter.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-parquettimestampinmillisecond)
     */
    public fun parquetTimestampInMillisecond(): Any? =
        unwrap(this).getParquetTimestampInMillisecond()

    /**
     * The version of the Apache Parquet format that you want to use: `parquet_1_0` (the default) or
     * `parquet_2_0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-parquetversion)
     */
    public fun parquetVersion(): String? = unwrap(this).getParquetVersion()

    /**
     * If this setting is set to `true` , AWS DMS saves the transaction order for a change data
     * capture (CDC) load on the Amazon S3 target specified by
     * [`CdcPath`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath)
     * . For more information, see [Capturing data changes (CDC) including transaction order on the S3
     * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath)
     * .
     *
     *
     * This setting is supported in AWS DMS versions 3.4.2 and later.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-preservetransactions)
     */
    public fun preserveTransactions(): Any? = unwrap(this).getPreserveTransactions()

    /**
     * For an S3 source, when this value is set to `true` or `y` , each leading double quotation
     * mark has to be followed by an ending double quotation mark.
     *
     * This formatting complies with RFC 4180. When this value is set to `false` or `n` , string
     * literals are copied to the target as is. In this case, a delimiter (row or column) signals the
     * end of the field. Thus, you can't use a delimiter as part of the string, because it signals the
     * end of the value.
     *
     * For an S3 target, an optional parameter used to set behavior to comply with RFC 4180 for data
     * migrated to Amazon S3 using .csv file format only. When this value is set to `true` or `y` using
     * Amazon S3 as a target, if the data has quotation marks or newline characters in it, AWS DMS
     * encloses the entire column with an additional pair of double quotation marks ("). Every
     * quotation mark within the data is repeated twice.
     *
     * The default value is `true` . Valid values include `true` , `false` , `y` , and `n` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-rfc4180)
     */
    public fun rfc4180(): Any? = unwrap(this).getRfc4180()

    /**
     * The number of rows in a row group.
     *
     * A smaller row group size provides faster reads. But as the number of row groups grows, the
     * slower writes become. This parameter defaults to 10,000 rows. This number is used for .parquet
     * file format only.
     *
     * If you choose a value larger than the maximum, `RowGroupLength` is set to the max row group
     * length in bytes (64 * 1024 * 1024).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-rowgrouplength)
     */
    public fun rowGroupLength(): Number? = unwrap(this).getRowGroupLength()

    /**
     * If you are using `SSE_KMS` for the `EncryptionMode` , provide the AWS KMS key ID.
     *
     * The key that you use needs an attached policy that enables IAM user permissions and allows
     * use of the key.
     *
     * Here is a CLI example: `aws dms create-endpoint --endpoint-identifier *value* --endpoint-type
     * target --engine-name s3 --s3-settings ServiceAccessRoleArn= *value* ,BucketFolder= *value*
     * ,BucketName= *value* ,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId= *value*`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serversideencryptionkmskeyid)
     */
    public fun serverSideEncryptionKmsKeyId(): String? =
        unwrap(this).getServerSideEncryptionKmsKeyId()

    /**
     * A required parameter that specifies the Amazon Resource Name (ARN) used by the service to
     * access the IAM role.
     *
     * The role must allow the `iam:PassRole` action. It enables AWS DMS to read and write objects
     * from an S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn)
     */
    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    /**
     * A value that when nonblank causes AWS DMS to add a column with timestamp information to the
     * endpoint data for an Amazon S3 target.
     *
     *
     * AWS DMS supports the `TimestampColumnName` parameter in versions 3.1.4 and later.
     *
     *
     * AWS DMS includes an additional `STRING` column in the .csv or .parquet object files of your
     * migrated data when you set `TimestampColumnName` to a nonblank value.
     *
     * For a full load, each row of this timestamp column contains a timestamp for when the data was
     * transferred from the source to the target by DMS.
     *
     * For a change data capture (CDC) load, each row of the timestamp column contains the timestamp
     * for the commit of that row in the source database.
     *
     * The string format for this timestamp column value is `yyyy-MM-dd HH:mm:ss.SSSSSS` . By
     * default, the precision of this value is in microseconds. For a CDC load, the rounding of the
     * precision depends on the commit timestamp supported by DMS for the source database.
     *
     * When the `AddColumnName` parameter is set to `true` , DMS also includes a name for the
     * timestamp column that you set with `TimestampColumnName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-timestampcolumnname)
     */
    public fun timestampColumnName(): String? = unwrap(this).getTimestampColumnName()

    /**
     * This setting applies if the S3 output files during a change data capture (CDC) load are
     * written in .csv format. If this setting is set to `true` for columns not included in the
     * supplemental log, AWS DMS uses the value specified by
     * [`CsvNoSupValue`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue)
     * . If this setting isn't set or is set to `false` , AWS DMS uses the null value for these
     * columns.
     *
     *
     * This setting is supported in AWS DMS versions 3.4.1 and later.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-usecsvnosupvalue)
     */
    public fun useCsvNoSupValue(): Any? = unwrap(this).getUseCsvNoSupValue()

    /**
     * When set to true, this parameter uses the task start time as the timestamp column value
     * instead of the time data is written to target.
     *
     * For full load, when `useTaskStartTimeForFullLoadTimestamp` is set to `true` , each row of the
     * timestamp column contains the task start time. For CDC loads, each row of the timestamp column
     * contains the transaction commit time.
     *
     * When `useTaskStartTimeForFullLoadTimestamp` is set to `false` , the full load timestamp in
     * the timestamp column increments with the time data arrives at the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-usetaskstarttimeforfullloadtimestamp)
     */
    public fun useTaskStartTimeForFullLoadTimestamp(): Any? =
        unwrap(this).getUseTaskStartTimeForFullLoadTimestamp()

    /**
     * A builder for [S3SettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addColumnName An optional parameter that, when set to `true` or `y` , you can use to
       * add column name information to the .csv output file.
       * The default value is `false` . Valid values are `true` , `false` , `y` , and `n` .
       */
      public fun addColumnName(addColumnName: Boolean)

      /**
       * @param addColumnName An optional parameter that, when set to `true` or `y` , you can use to
       * add column name information to the .csv output file.
       * The default value is `false` . Valid values are `true` , `false` , `y` , and `n` .
       */
      public fun addColumnName(addColumnName: IResolvable)

      /**
       * @param addTrailingPaddingCharacter Use the S3 target endpoint setting
       * `AddTrailingPaddingCharacter` to add padding on string data.
       * The default value is `false` .
       */
      public fun addTrailingPaddingCharacter(addTrailingPaddingCharacter: Boolean)

      /**
       * @param addTrailingPaddingCharacter Use the S3 target endpoint setting
       * `AddTrailingPaddingCharacter` to add padding on string data.
       * The default value is `false` .
       */
      public fun addTrailingPaddingCharacter(addTrailingPaddingCharacter: IResolvable)

      /**
       * @param bucketFolder An optional parameter to set a folder name in the S3 bucket.
       * If provided, tables are created in the path `*bucketFolder* / *schema_name* / *table_name*
       * /` . If this parameter isn't specified, the path used is `*schema_name* / *table_name* /` .
       */
      public fun bucketFolder(bucketFolder: String)

      /**
       * @param bucketName The name of the S3 bucket.
       */
      public fun bucketName(bucketName: String)

      /**
       * @param cannedAclForObjects A value that enables AWS DMS to specify a predefined (canned)
       * access control list (ACL) for objects created in an Amazon S3 bucket as .csv or .parquet
       * files. For more information about Amazon S3 canned ACLs, see [Canned
       * ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) in the
       * *Amazon S3 Developer Guide* .
       * The default value is NONE. Valid values include NONE, PRIVATE, PUBLIC_READ,
       * PUBLIC_READ_WRITE, AUTHENTICATED_READ, AWS_EXEC_READ, BUCKET_OWNER_READ, and
       * BUCKET_OWNER_FULL_CONTROL.
       */
      public fun cannedAclForObjects(cannedAclForObjects: String)

      /**
       * @param cdcInsertsAndUpdates A value that enables a change data capture (CDC) load to write
       * INSERT and UPDATE operations to .csv or .parquet (columnar storage) output files. The default
       * setting is `false` , but when `CdcInsertsAndUpdates` is set to `true` or `y` , only INSERTs
       * and UPDATEs from the source database are migrated to the .csv or .parquet file.
       * For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value
       * of the `IncludeOpForFullLoad` parameter. If `IncludeOpForFullLoad` is set to `true` , the
       * first field of every CDC record is set to either `I` or `U` to indicate INSERT and UPDATE
       * operations at the source. But if `IncludeOpForFullLoad` is set to `false` , CDC records are
       * written without an indication of INSERT or UPDATE operations at the source. For more
       * information about how these settings work together, see [Indicating Source DB Operations in
       * Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * AWS DMS supports the use of the `CdcInsertsAndUpdates` parameter in versions 3.3.1 and
       * later.
       *
       * `CdcInsertsOnly` and `CdcInsertsAndUpdates` can't both be set to `true` for the same
       * endpoint. Set either `CdcInsertsOnly` or `CdcInsertsAndUpdates` to `true` for the same
       * endpoint, but not both.
       */
      public fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: Boolean)

      /**
       * @param cdcInsertsAndUpdates A value that enables a change data capture (CDC) load to write
       * INSERT and UPDATE operations to .csv or .parquet (columnar storage) output files. The default
       * setting is `false` , but when `CdcInsertsAndUpdates` is set to `true` or `y` , only INSERTs
       * and UPDATEs from the source database are migrated to the .csv or .parquet file.
       * For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value
       * of the `IncludeOpForFullLoad` parameter. If `IncludeOpForFullLoad` is set to `true` , the
       * first field of every CDC record is set to either `I` or `U` to indicate INSERT and UPDATE
       * operations at the source. But if `IncludeOpForFullLoad` is set to `false` , CDC records are
       * written without an indication of INSERT or UPDATE operations at the source. For more
       * information about how these settings work together, see [Indicating Source DB Operations in
       * Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * AWS DMS supports the use of the `CdcInsertsAndUpdates` parameter in versions 3.3.1 and
       * later.
       *
       * `CdcInsertsOnly` and `CdcInsertsAndUpdates` can't both be set to `true` for the same
       * endpoint. Set either `CdcInsertsOnly` or `CdcInsertsAndUpdates` to `true` for the same
       * endpoint, but not both.
       */
      public fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: IResolvable)

      /**
       * @param cdcInsertsOnly A value that enables a change data capture (CDC) load to write only
       * INSERT operations to .csv or columnar storage (.parquet) output files. By default (the `false`
       * setting), the first field in a .csv or .parquet record contains the letter I (INSERT), U
       * (UPDATE), or D (DELETE). These values indicate whether the row was inserted, updated, or
       * deleted at the source database for a CDC load to the target.
       * If `CdcInsertsOnly` is set to `true` or `y` , only INSERTs from the source database are
       * migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded
       * depends on the value of `IncludeOpForFullLoad` . If `IncludeOpForFullLoad` is set to `true` ,
       * the first field of every CDC record is set to I to indicate the INSERT operation at the
       * source. If `IncludeOpForFullLoad` is set to `false` , every CDC record is written without a
       * first field to indicate the INSERT operation at the source. For more information about how
       * these settings work together, see [Indicating Source DB Operations in Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * AWS DMS supports the interaction described preceding between the `CdcInsertsOnly` and
       * `IncludeOpForFullLoad` parameters in versions 3.1.4 and later.
       *
       * `CdcInsertsOnly` and `CdcInsertsAndUpdates` can't both be set to `true` for the same
       * endpoint. Set either `CdcInsertsOnly` or `CdcInsertsAndUpdates` to `true` for the same
       * endpoint, but not both.
       */
      public fun cdcInsertsOnly(cdcInsertsOnly: Boolean)

      /**
       * @param cdcInsertsOnly A value that enables a change data capture (CDC) load to write only
       * INSERT operations to .csv or columnar storage (.parquet) output files. By default (the `false`
       * setting), the first field in a .csv or .parquet record contains the letter I (INSERT), U
       * (UPDATE), or D (DELETE). These values indicate whether the row was inserted, updated, or
       * deleted at the source database for a CDC load to the target.
       * If `CdcInsertsOnly` is set to `true` or `y` , only INSERTs from the source database are
       * migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded
       * depends on the value of `IncludeOpForFullLoad` . If `IncludeOpForFullLoad` is set to `true` ,
       * the first field of every CDC record is set to I to indicate the INSERT operation at the
       * source. If `IncludeOpForFullLoad` is set to `false` , every CDC record is written without a
       * first field to indicate the INSERT operation at the source. For more information about how
       * these settings work together, see [Indicating Source DB Operations in Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * AWS DMS supports the interaction described preceding between the `CdcInsertsOnly` and
       * `IncludeOpForFullLoad` parameters in versions 3.1.4 and later.
       *
       * `CdcInsertsOnly` and `CdcInsertsAndUpdates` can't both be set to `true` for the same
       * endpoint. Set either `CdcInsertsOnly` or `CdcInsertsAndUpdates` to `true` for the same
       * endpoint, but not both.
       */
      public fun cdcInsertsOnly(cdcInsertsOnly: IResolvable)

      /**
       * @param cdcMaxBatchInterval Maximum length of the interval, defined in seconds, after which
       * to output a file to Amazon S3.
       * When `CdcMaxBatchInterval` and `CdcMinFileSize` are both specified, the file write is
       * triggered by whichever parameter condition is met first within an AWS DMS CloudFormation
       * template.
       *
       * The default value is 60 seconds.
       */
      public fun cdcMaxBatchInterval(cdcMaxBatchInterval: Number)

      /**
       * @param cdcMinFileSize Minimum file size, defined in kilobytes, to reach for a file output
       * to Amazon S3.
       * When `CdcMinFileSize` and `CdcMaxBatchInterval` are both specified, the file write is
       * triggered by whichever parameter condition is met first within an AWS DMS CloudFormation
       * template.
       *
       * The default value is 32 MB.
       */
      public fun cdcMinFileSize(cdcMinFileSize: Number)

      /**
       * @param cdcPath Specifies the folder path of CDC files.
       * For an S3 source, this setting is required if a task captures change data; otherwise, it's
       * optional. If `CdcPath` is set, AWS DMS reads CDC files from this path and replicates the data
       * changes to the target endpoint. For an S3 target if you set
       * [`PreserveTransactions`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-PreserveTransactions)
       * to `true` , AWS DMS verifies that you have set this parameter to a folder path on your S3
       * target where AWS DMS can save the transaction order for the CDC load. AWS DMS creates this CDC
       * folder path in either your S3 target working directory or the S3 target location specified by
       * [`BucketFolder`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketFolder)
       * and
       * [`BucketName`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketName)
       * .
       *
       * For example, if you specify `CdcPath` as `MyChangedData` , and you specify `BucketName` as
       * `MyTargetBucket` but do not specify `BucketFolder` , AWS DMS creates the CDC folder path
       * following: `MyTargetBucket/MyChangedData` .
       *
       * If you specify the same `CdcPath` , and you specify `BucketName` as `MyTargetBucket` and
       * `BucketFolder` as `MyTargetData` , AWS DMS creates the CDC folder path following:
       * `MyTargetBucket/MyTargetData/MyChangedData` .
       *
       * For more information on CDC including transaction order on an S3 target, see [Capturing
       * data changes (CDC) including transaction order on the S3
       * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath)
       * .
       *
       *
       * This setting is supported in AWS DMS versions 3.4.2 and later.
       */
      public fun cdcPath(cdcPath: String)

      /**
       * @param compressionType An optional parameter.
       * When set to GZIP it enables the service to compress the target files. To allow the service
       * to write the target files uncompressed, either set this parameter to NONE (the default) or
       * don't specify the parameter at all. This parameter applies to both .csv and .parquet file
       * formats.
       */
      public fun compressionType(compressionType: String)

      /**
       * @param csvDelimiter The delimiter used to separate columns in the .csv file for both source
       * and target. The default is a comma.
       */
      public fun csvDelimiter(csvDelimiter: String)

      /**
       * @param csvNoSupValue This setting only applies if your Amazon S3 output files during a
       * change data capture (CDC) load are written in .csv format. If
       * [`UseCsvNoSupValue`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-UseCsvNoSupValue)
       * is set to true, specify a string value that you want AWS DMS to use for all columns not
       * included in the supplemental log. If you do not specify a string value, AWS DMS uses the null
       * value for these columns regardless of the `UseCsvNoSupValue` setting.
       *
       * This setting is supported in AWS DMS versions 3.4.1 and later.
       */
      public fun csvNoSupValue(csvNoSupValue: String)

      /**
       * @param csvNullValue An optional parameter that specifies how AWS DMS treats null values.
       * While handling the null value, you can use this parameter to pass a user-defined string as
       * null when writing to the target. For example, when target columns are not nullable, you can
       * use this option to differentiate between the empty string value and the null value. So, if you
       * set this parameter value to the empty string ("" or ''), AWS DMS treats the empty string as
       * the null value instead of `NULL` .
       *
       * The default value is `NULL` . Valid values include any valid string.
       */
      public fun csvNullValue(csvNullValue: String)

      /**
       * @param csvRowDelimiter The delimiter used to separate rows in the .csv file for both source
       * and target.
       * The default is a carriage return ( `\n` ).
       */
      public fun csvRowDelimiter(csvRowDelimiter: String)

      /**
       * @param dataFormat The format of the data that you want to use for output. You can choose
       * one of the following:.
       * * `csv` : This is a row-based file format with comma-separated values (.csv).
       * * `parquet` : Apache Parquet (.parquet) is a columnar storage file format that features
       * efficient compression and provides faster query response.
       */
      public fun dataFormat(dataFormat: String)

      /**
       * @param dataPageSize The size of one data page in bytes.
       * This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is used for .parquet file
       * format only.
       */
      public fun dataPageSize(dataPageSize: Number)

      /**
       * @param datePartitionDelimiter Specifies a date separating delimiter to use during folder
       * partitioning.
       * The default value is `SLASH` . Use this parameter when `DatePartitionedEnabled` is set to
       * `true` .
       */
      public fun datePartitionDelimiter(datePartitionDelimiter: String)

      /**
       * @param datePartitionEnabled When set to `true` , this parameter partitions S3 bucket
       * folders based on transaction commit dates.
       * The default value is `false` . For more information about date-based folder partitioning,
       * see [Using date-based folder
       * partitioning](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning)
       * .
       */
      public fun datePartitionEnabled(datePartitionEnabled: Boolean)

      /**
       * @param datePartitionEnabled When set to `true` , this parameter partitions S3 bucket
       * folders based on transaction commit dates.
       * The default value is `false` . For more information about date-based folder partitioning,
       * see [Using date-based folder
       * partitioning](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning)
       * .
       */
      public fun datePartitionEnabled(datePartitionEnabled: IResolvable)

      /**
       * @param datePartitionSequence Identifies the sequence of the date format to use during
       * folder partitioning.
       * The default value is `YYYYMMDD` . Use this parameter when `DatePartitionedEnabled` is set
       * to `true` .
       */
      public fun datePartitionSequence(datePartitionSequence: String)

      /**
       * @param datePartitionTimezone When creating an S3 target endpoint, set
       * `DatePartitionTimezone` to convert the current UTC time into a specified time zone.
       * The conversion occurs when a date partition folder is created and a change data capture
       * (CDC) file name is generated. The time zone format is Area/Location. Use this parameter when
       * `DatePartitionedEnabled` is set to `true` , as shown in the following example.
       *
       * `s3-settings='{"DatePartitionEnabled": true, "DatePartitionSequence": "YYYYMMDDHH",
       * "DatePartitionDelimiter": "SLASH", "DatePartitionTimezone":" *Asia/Seoul* ", "BucketName":
       * "dms-nattarat-test"}'`
       */
      public fun datePartitionTimezone(datePartitionTimezone: String)

      /**
       * @param dictPageSizeLimit The maximum size of an encoded dictionary page of a column.
       * If the dictionary page exceeds this, this column is stored using an encoding type of
       * `PLAIN` . This parameter defaults to 1024 * 1024 bytes (1 MiB), the maximum size of a
       * dictionary page before it reverts to `PLAIN` encoding. This size is used for .parquet file
       * format only.
       */
      public fun dictPageSizeLimit(dictPageSizeLimit: Number)

      /**
       * @param enableStatistics A value that enables statistics for Parquet pages and row groups.
       * Choose `true` to enable statistics, `false` to disable. Statistics include `NULL` ,
       * `DISTINCT` , `MAX` , and `MIN` values. This parameter defaults to `true` . This value is used
       * for .parquet file format only.
       */
      public fun enableStatistics(enableStatistics: Boolean)

      /**
       * @param enableStatistics A value that enables statistics for Parquet pages and row groups.
       * Choose `true` to enable statistics, `false` to disable. Statistics include `NULL` ,
       * `DISTINCT` , `MAX` , and `MIN` values. This parameter defaults to `true` . This value is used
       * for .parquet file format only.
       */
      public fun enableStatistics(enableStatistics: IResolvable)

      /**
       * @param encodingType The type of encoding that you're using:.
       * * `RLE_DICTIONARY` uses a combination of bit-packing and run-length encoding to store
       * repeated values more efficiently. This is the default.
       * * `PLAIN` doesn't use encoding at all. Values are stored as they are.
       * * `PLAIN_DICTIONARY` builds a dictionary of the values encountered in a given column. The
       * dictionary is stored in a dictionary page for each column chunk.
       */
      public fun encodingType(encodingType: String)

      /**
       * @param encryptionMode The type of server-side encryption that you want to use for your
       * data.
       * This encryption type is part of the endpoint settings or the extra connections attributes
       * for Amazon S3. You can choose either `SSE_S3` (the default) or `SSE_KMS` .
       *
       *
       * For the `ModifyEndpoint` operation, you can change the existing value of the
       * `EncryptionMode` parameter from `SSE_KMS` to `SSE_S3` . But you can’t change the existing
       * value from `SSE_S3` to `SSE_KMS` .
       *
       *
       * To use `SSE_S3` , you need an IAM role with permission to allow `"arn:aws:s3:::dms-*"` to
       * use the following actions:
       *
       * * `s3:CreateBucket`
       * * `s3:ListBucket`
       * * `s3:DeleteBucket`
       * * `s3:GetBucketLocation`
       * * `s3:GetObject`
       * * `s3:PutObject`
       * * `s3:DeleteObject`
       * * `s3:GetObjectVersion`
       * * `s3:GetBucketPolicy`
       * * `s3:PutBucketPolicy`
       * * `s3:DeleteBucketPolicy`
       */
      public fun encryptionMode(encryptionMode: String)

      /**
       * @param expectedBucketOwner To specify a bucket owner and prevent sniping, you can use the
       * `ExpectedBucketOwner` endpoint setting.
       * Example: `--s3-settings='{"ExpectedBucketOwner": " *AWS_Account_ID* "}'`
       *
       * When you make a request to test a connection or perform a migration, S3 checks the account
       * ID of the bucket owner against the specified parameter.
       */
      public fun expectedBucketOwner(expectedBucketOwner: String)

      /**
       * @param externalTableDefinition The external table definition.
       * Conditional: If `S3` is used as a source then `ExternalTableDefinition` is required.
       */
      public fun externalTableDefinition(externalTableDefinition: String)

      /**
       * @param glueCatalogGeneration When true, allows AWS Glue to catalog your S3 bucket.
       * Creating an AWS Glue catalog lets you use Athena to query your data.
       */
      public fun glueCatalogGeneration(glueCatalogGeneration: Boolean)

      /**
       * @param glueCatalogGeneration When true, allows AWS Glue to catalog your S3 bucket.
       * Creating an AWS Glue catalog lets you use Athena to query your data.
       */
      public fun glueCatalogGeneration(glueCatalogGeneration: IResolvable)

      /**
       * @param ignoreHeaderRows When this value is set to 1, AWS DMS ignores the first row header
       * in a .csv file. A value of 1 turns on the feature; a value of 0 turns off the feature.
       * The default is 0.
       */
      public fun ignoreHeaderRows(ignoreHeaderRows: Number)

      /**
       * @param includeOpForFullLoad A value that enables a full load to write INSERT operations to
       * the comma-separated value (.csv) output files only to indicate how the rows were added to the
       * source database.
       *
       * AWS DMS supports the `IncludeOpForFullLoad` parameter in versions 3.1.4 and later.
       *
       *
       * For full load, records can only be inserted. By default (the `false` setting), no
       * information is recorded in these output files for a full load to indicate that the rows were
       * inserted at the source database. If `IncludeOpForFullLoad` is set to `true` or `y` , the
       * INSERT is recorded as an I annotation in the first field of the .csv file. This allows the
       * format of your target records from a full load to be consistent with the target records from a
       * CDC load.
       *
       *
       * This setting works together with the `CdcInsertsOnly` and the `CdcInsertsAndUpdates`
       * parameters for output to .csv files only. For more information about how these settings work
       * together, see [Indicating Source DB Operations in Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun includeOpForFullLoad(includeOpForFullLoad: Boolean)

      /**
       * @param includeOpForFullLoad A value that enables a full load to write INSERT operations to
       * the comma-separated value (.csv) output files only to indicate how the rows were added to the
       * source database.
       *
       * AWS DMS supports the `IncludeOpForFullLoad` parameter in versions 3.1.4 and later.
       *
       *
       * For full load, records can only be inserted. By default (the `false` setting), no
       * information is recorded in these output files for a full load to indicate that the rows were
       * inserted at the source database. If `IncludeOpForFullLoad` is set to `true` or `y` , the
       * INSERT is recorded as an I annotation in the first field of the .csv file. This allows the
       * format of your target records from a full load to be consistent with the target records from a
       * CDC load.
       *
       *
       * This setting works together with the `CdcInsertsOnly` and the `CdcInsertsAndUpdates`
       * parameters for output to .csv files only. For more information about how these settings work
       * together, see [Indicating Source DB Operations in Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun includeOpForFullLoad(includeOpForFullLoad: IResolvable)

      /**
       * @param maxFileSize A value that specifies the maximum size (in KB) of any .csv file to be
       * created while migrating to an S3 target during full load.
       * The default value is 1,048,576 KB (1 GB). Valid values include 1 to 1,048,576.
       */
      public fun maxFileSize(maxFileSize: Number)

      /**
       * @param parquetTimestampInMillisecond A value that specifies the precision of any
       * `TIMESTAMP` column values that are written to an Amazon S3 object file in .parquet format.
       *
       * AWS DMS supports the `ParquetTimestampInMillisecond` parameter in versions 3.1.4 and later.
       *
       *
       * When `ParquetTimestampInMillisecond` is set to `true` or `y` , AWS DMS writes all
       * `TIMESTAMP` columns in a .parquet formatted file with millisecond precision. Otherwise, DMS
       * writes them with microsecond precision.
       *
       * Currently, Amazon Athena and AWS Glue can handle only millisecond precision for `TIMESTAMP`
       * values. Set this parameter to `true` for S3 endpoint object files that are .parquet formatted
       * only if you plan to query or process the data with Athena or AWS Glue .
       *
       *
       * AWS DMS writes any `TIMESTAMP` column values written to an S3 file in .csv format with
       * microsecond precision.
       *
       * Setting `ParquetTimestampInMillisecond` has no effect on the string format of the timestamp
       * column value that is inserted by setting the `TimestampColumnName` parameter.
       */
      public fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: Boolean)

      /**
       * @param parquetTimestampInMillisecond A value that specifies the precision of any
       * `TIMESTAMP` column values that are written to an Amazon S3 object file in .parquet format.
       *
       * AWS DMS supports the `ParquetTimestampInMillisecond` parameter in versions 3.1.4 and later.
       *
       *
       * When `ParquetTimestampInMillisecond` is set to `true` or `y` , AWS DMS writes all
       * `TIMESTAMP` columns in a .parquet formatted file with millisecond precision. Otherwise, DMS
       * writes them with microsecond precision.
       *
       * Currently, Amazon Athena and AWS Glue can handle only millisecond precision for `TIMESTAMP`
       * values. Set this parameter to `true` for S3 endpoint object files that are .parquet formatted
       * only if you plan to query or process the data with Athena or AWS Glue .
       *
       *
       * AWS DMS writes any `TIMESTAMP` column values written to an S3 file in .csv format with
       * microsecond precision.
       *
       * Setting `ParquetTimestampInMillisecond` has no effect on the string format of the timestamp
       * column value that is inserted by setting the `TimestampColumnName` parameter.
       */
      public fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: IResolvable)

      /**
       * @param parquetVersion The version of the Apache Parquet format that you want to use:
       * `parquet_1_0` (the default) or `parquet_2_0` .
       */
      public fun parquetVersion(parquetVersion: String)

      /**
       * @param preserveTransactions If this setting is set to `true` , AWS DMS saves the
       * transaction order for a change data capture (CDC) load on the Amazon S3 target specified by
       * [`CdcPath`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath)
       * . For more information, see [Capturing data changes (CDC) including transaction order on the
       * S3
       * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath)
       * .
       *
       * This setting is supported in AWS DMS versions 3.4.2 and later.
       */
      public fun preserveTransactions(preserveTransactions: Boolean)

      /**
       * @param preserveTransactions If this setting is set to `true` , AWS DMS saves the
       * transaction order for a change data capture (CDC) load on the Amazon S3 target specified by
       * [`CdcPath`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath)
       * . For more information, see [Capturing data changes (CDC) including transaction order on the
       * S3
       * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath)
       * .
       *
       * This setting is supported in AWS DMS versions 3.4.2 and later.
       */
      public fun preserveTransactions(preserveTransactions: IResolvable)

      /**
       * @param rfc4180 For an S3 source, when this value is set to `true` or `y` , each leading
       * double quotation mark has to be followed by an ending double quotation mark.
       * This formatting complies with RFC 4180. When this value is set to `false` or `n` , string
       * literals are copied to the target as is. In this case, a delimiter (row or column) signals the
       * end of the field. Thus, you can't use a delimiter as part of the string, because it signals
       * the end of the value.
       *
       * For an S3 target, an optional parameter used to set behavior to comply with RFC 4180 for
       * data migrated to Amazon S3 using .csv file format only. When this value is set to `true` or
       * `y` using Amazon S3 as a target, if the data has quotation marks or newline characters in it,
       * AWS DMS encloses the entire column with an additional pair of double quotation marks (").
       * Every quotation mark within the data is repeated twice.
       *
       * The default value is `true` . Valid values include `true` , `false` , `y` , and `n` .
       */
      public fun rfc4180(rfc4180: Boolean)

      /**
       * @param rfc4180 For an S3 source, when this value is set to `true` or `y` , each leading
       * double quotation mark has to be followed by an ending double quotation mark.
       * This formatting complies with RFC 4180. When this value is set to `false` or `n` , string
       * literals are copied to the target as is. In this case, a delimiter (row or column) signals the
       * end of the field. Thus, you can't use a delimiter as part of the string, because it signals
       * the end of the value.
       *
       * For an S3 target, an optional parameter used to set behavior to comply with RFC 4180 for
       * data migrated to Amazon S3 using .csv file format only. When this value is set to `true` or
       * `y` using Amazon S3 as a target, if the data has quotation marks or newline characters in it,
       * AWS DMS encloses the entire column with an additional pair of double quotation marks (").
       * Every quotation mark within the data is repeated twice.
       *
       * The default value is `true` . Valid values include `true` , `false` , `y` , and `n` .
       */
      public fun rfc4180(rfc4180: IResolvable)

      /**
       * @param rowGroupLength The number of rows in a row group.
       * A smaller row group size provides faster reads. But as the number of row groups grows, the
       * slower writes become. This parameter defaults to 10,000 rows. This number is used for .parquet
       * file format only.
       *
       * If you choose a value larger than the maximum, `RowGroupLength` is set to the max row group
       * length in bytes (64 * 1024 * 1024).
       */
      public fun rowGroupLength(rowGroupLength: Number)

      /**
       * @param serverSideEncryptionKmsKeyId If you are using `SSE_KMS` for the `EncryptionMode` ,
       * provide the AWS KMS key ID.
       * The key that you use needs an attached policy that enables IAM user permissions and allows
       * use of the key.
       *
       * Here is a CLI example: `aws dms create-endpoint --endpoint-identifier
       * *value* --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn= *value*
       * ,BucketFolder= *value* ,BucketName= *value*
       * ,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId= *value*`
       */
      public fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String)

      /**
       * @param serviceAccessRoleArn A required parameter that specifies the Amazon Resource Name
       * (ARN) used by the service to access the IAM role.
       * The role must allow the `iam:PassRole` action. It enables AWS DMS to read and write objects
       * from an S3 bucket.
       */
      public fun serviceAccessRoleArn(serviceAccessRoleArn: String)

      /**
       * @param timestampColumnName A value that when nonblank causes AWS DMS to add a column with
       * timestamp information to the endpoint data for an Amazon S3 target.
       *
       * AWS DMS supports the `TimestampColumnName` parameter in versions 3.1.4 and later.
       *
       *
       * AWS DMS includes an additional `STRING` column in the .csv or .parquet object files of your
       * migrated data when you set `TimestampColumnName` to a nonblank value.
       *
       * For a full load, each row of this timestamp column contains a timestamp for when the data
       * was transferred from the source to the target by DMS.
       *
       * For a change data capture (CDC) load, each row of the timestamp column contains the
       * timestamp for the commit of that row in the source database.
       *
       * The string format for this timestamp column value is `yyyy-MM-dd HH:mm:ss.SSSSSS` . By
       * default, the precision of this value is in microseconds. For a CDC load, the rounding of the
       * precision depends on the commit timestamp supported by DMS for the source database.
       *
       * When the `AddColumnName` parameter is set to `true` , DMS also includes a name for the
       * timestamp column that you set with `TimestampColumnName` .
       */
      public fun timestampColumnName(timestampColumnName: String)

      /**
       * @param useCsvNoSupValue This setting applies if the S3 output files during a change data
       * capture (CDC) load are written in .csv format. If this setting is set to `true` for columns
       * not included in the supplemental log, AWS DMS uses the value specified by
       * [`CsvNoSupValue`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue)
       * . If this setting isn't set or is set to `false` , AWS DMS uses the null value for these
       * columns.
       *
       * This setting is supported in AWS DMS versions 3.4.1 and later.
       */
      public fun useCsvNoSupValue(useCsvNoSupValue: Boolean)

      /**
       * @param useCsvNoSupValue This setting applies if the S3 output files during a change data
       * capture (CDC) load are written in .csv format. If this setting is set to `true` for columns
       * not included in the supplemental log, AWS DMS uses the value specified by
       * [`CsvNoSupValue`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue)
       * . If this setting isn't set or is set to `false` , AWS DMS uses the null value for these
       * columns.
       *
       * This setting is supported in AWS DMS versions 3.4.1 and later.
       */
      public fun useCsvNoSupValue(useCsvNoSupValue: IResolvable)

      /**
       * @param useTaskStartTimeForFullLoadTimestamp When set to true, this parameter uses the task
       * start time as the timestamp column value instead of the time data is written to target.
       * For full load, when `useTaskStartTimeForFullLoadTimestamp` is set to `true` , each row of
       * the timestamp column contains the task start time. For CDC loads, each row of the timestamp
       * column contains the transaction commit time.
       *
       * When `useTaskStartTimeForFullLoadTimestamp` is set to `false` , the full load timestamp in
       * the timestamp column increments with the time data arrives at the target.
       */
      public fun useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp: Boolean)

      /**
       * @param useTaskStartTimeForFullLoadTimestamp When set to true, this parameter uses the task
       * start time as the timestamp column value instead of the time data is written to target.
       * For full load, when `useTaskStartTimeForFullLoadTimestamp` is set to `true` , each row of
       * the timestamp column contains the task start time. For CDC loads, each row of the timestamp
       * column contains the transaction commit time.
       *
       * When `useTaskStartTimeForFullLoadTimestamp` is set to `false` , the full load timestamp in
       * the timestamp column increments with the time data arrives at the target.
       */
      public
          fun useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.builder()

      /**
       * @param addColumnName An optional parameter that, when set to `true` or `y` , you can use to
       * add column name information to the .csv output file.
       * The default value is `false` . Valid values are `true` , `false` , `y` , and `n` .
       */
      override fun addColumnName(addColumnName: Boolean) {
        cdkBuilder.addColumnName(addColumnName)
      }

      /**
       * @param addColumnName An optional parameter that, when set to `true` or `y` , you can use to
       * add column name information to the .csv output file.
       * The default value is `false` . Valid values are `true` , `false` , `y` , and `n` .
       */
      override fun addColumnName(addColumnName: IResolvable) {
        cdkBuilder.addColumnName(addColumnName.let(IResolvable::unwrap))
      }

      /**
       * @param addTrailingPaddingCharacter Use the S3 target endpoint setting
       * `AddTrailingPaddingCharacter` to add padding on string data.
       * The default value is `false` .
       */
      override fun addTrailingPaddingCharacter(addTrailingPaddingCharacter: Boolean) {
        cdkBuilder.addTrailingPaddingCharacter(addTrailingPaddingCharacter)
      }

      /**
       * @param addTrailingPaddingCharacter Use the S3 target endpoint setting
       * `AddTrailingPaddingCharacter` to add padding on string data.
       * The default value is `false` .
       */
      override fun addTrailingPaddingCharacter(addTrailingPaddingCharacter: IResolvable) {
        cdkBuilder.addTrailingPaddingCharacter(addTrailingPaddingCharacter.let(IResolvable::unwrap))
      }

      /**
       * @param bucketFolder An optional parameter to set a folder name in the S3 bucket.
       * If provided, tables are created in the path `*bucketFolder* / *schema_name* / *table_name*
       * /` . If this parameter isn't specified, the path used is `*schema_name* / *table_name* /` .
       */
      override fun bucketFolder(bucketFolder: String) {
        cdkBuilder.bucketFolder(bucketFolder)
      }

      /**
       * @param bucketName The name of the S3 bucket.
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param cannedAclForObjects A value that enables AWS DMS to specify a predefined (canned)
       * access control list (ACL) for objects created in an Amazon S3 bucket as .csv or .parquet
       * files. For more information about Amazon S3 canned ACLs, see [Canned
       * ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) in the
       * *Amazon S3 Developer Guide* .
       * The default value is NONE. Valid values include NONE, PRIVATE, PUBLIC_READ,
       * PUBLIC_READ_WRITE, AUTHENTICATED_READ, AWS_EXEC_READ, BUCKET_OWNER_READ, and
       * BUCKET_OWNER_FULL_CONTROL.
       */
      override fun cannedAclForObjects(cannedAclForObjects: String) {
        cdkBuilder.cannedAclForObjects(cannedAclForObjects)
      }

      /**
       * @param cdcInsertsAndUpdates A value that enables a change data capture (CDC) load to write
       * INSERT and UPDATE operations to .csv or .parquet (columnar storage) output files. The default
       * setting is `false` , but when `CdcInsertsAndUpdates` is set to `true` or `y` , only INSERTs
       * and UPDATEs from the source database are migrated to the .csv or .parquet file.
       * For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value
       * of the `IncludeOpForFullLoad` parameter. If `IncludeOpForFullLoad` is set to `true` , the
       * first field of every CDC record is set to either `I` or `U` to indicate INSERT and UPDATE
       * operations at the source. But if `IncludeOpForFullLoad` is set to `false` , CDC records are
       * written without an indication of INSERT or UPDATE operations at the source. For more
       * information about how these settings work together, see [Indicating Source DB Operations in
       * Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * AWS DMS supports the use of the `CdcInsertsAndUpdates` parameter in versions 3.3.1 and
       * later.
       *
       * `CdcInsertsOnly` and `CdcInsertsAndUpdates` can't both be set to `true` for the same
       * endpoint. Set either `CdcInsertsOnly` or `CdcInsertsAndUpdates` to `true` for the same
       * endpoint, but not both.
       */
      override fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: Boolean) {
        cdkBuilder.cdcInsertsAndUpdates(cdcInsertsAndUpdates)
      }

      /**
       * @param cdcInsertsAndUpdates A value that enables a change data capture (CDC) load to write
       * INSERT and UPDATE operations to .csv or .parquet (columnar storage) output files. The default
       * setting is `false` , but when `CdcInsertsAndUpdates` is set to `true` or `y` , only INSERTs
       * and UPDATEs from the source database are migrated to the .csv or .parquet file.
       * For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value
       * of the `IncludeOpForFullLoad` parameter. If `IncludeOpForFullLoad` is set to `true` , the
       * first field of every CDC record is set to either `I` or `U` to indicate INSERT and UPDATE
       * operations at the source. But if `IncludeOpForFullLoad` is set to `false` , CDC records are
       * written without an indication of INSERT or UPDATE operations at the source. For more
       * information about how these settings work together, see [Indicating Source DB Operations in
       * Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * AWS DMS supports the use of the `CdcInsertsAndUpdates` parameter in versions 3.3.1 and
       * later.
       *
       * `CdcInsertsOnly` and `CdcInsertsAndUpdates` can't both be set to `true` for the same
       * endpoint. Set either `CdcInsertsOnly` or `CdcInsertsAndUpdates` to `true` for the same
       * endpoint, but not both.
       */
      override fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: IResolvable) {
        cdkBuilder.cdcInsertsAndUpdates(cdcInsertsAndUpdates.let(IResolvable::unwrap))
      }

      /**
       * @param cdcInsertsOnly A value that enables a change data capture (CDC) load to write only
       * INSERT operations to .csv or columnar storage (.parquet) output files. By default (the `false`
       * setting), the first field in a .csv or .parquet record contains the letter I (INSERT), U
       * (UPDATE), or D (DELETE). These values indicate whether the row was inserted, updated, or
       * deleted at the source database for a CDC load to the target.
       * If `CdcInsertsOnly` is set to `true` or `y` , only INSERTs from the source database are
       * migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded
       * depends on the value of `IncludeOpForFullLoad` . If `IncludeOpForFullLoad` is set to `true` ,
       * the first field of every CDC record is set to I to indicate the INSERT operation at the
       * source. If `IncludeOpForFullLoad` is set to `false` , every CDC record is written without a
       * first field to indicate the INSERT operation at the source. For more information about how
       * these settings work together, see [Indicating Source DB Operations in Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * AWS DMS supports the interaction described preceding between the `CdcInsertsOnly` and
       * `IncludeOpForFullLoad` parameters in versions 3.1.4 and later.
       *
       * `CdcInsertsOnly` and `CdcInsertsAndUpdates` can't both be set to `true` for the same
       * endpoint. Set either `CdcInsertsOnly` or `CdcInsertsAndUpdates` to `true` for the same
       * endpoint, but not both.
       */
      override fun cdcInsertsOnly(cdcInsertsOnly: Boolean) {
        cdkBuilder.cdcInsertsOnly(cdcInsertsOnly)
      }

      /**
       * @param cdcInsertsOnly A value that enables a change data capture (CDC) load to write only
       * INSERT operations to .csv or columnar storage (.parquet) output files. By default (the `false`
       * setting), the first field in a .csv or .parquet record contains the letter I (INSERT), U
       * (UPDATE), or D (DELETE). These values indicate whether the row was inserted, updated, or
       * deleted at the source database for a CDC load to the target.
       * If `CdcInsertsOnly` is set to `true` or `y` , only INSERTs from the source database are
       * migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded
       * depends on the value of `IncludeOpForFullLoad` . If `IncludeOpForFullLoad` is set to `true` ,
       * the first field of every CDC record is set to I to indicate the INSERT operation at the
       * source. If `IncludeOpForFullLoad` is set to `false` , every CDC record is written without a
       * first field to indicate the INSERT operation at the source. For more information about how
       * these settings work together, see [Indicating Source DB Operations in Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * AWS DMS supports the interaction described preceding between the `CdcInsertsOnly` and
       * `IncludeOpForFullLoad` parameters in versions 3.1.4 and later.
       *
       * `CdcInsertsOnly` and `CdcInsertsAndUpdates` can't both be set to `true` for the same
       * endpoint. Set either `CdcInsertsOnly` or `CdcInsertsAndUpdates` to `true` for the same
       * endpoint, but not both.
       */
      override fun cdcInsertsOnly(cdcInsertsOnly: IResolvable) {
        cdkBuilder.cdcInsertsOnly(cdcInsertsOnly.let(IResolvable::unwrap))
      }

      /**
       * @param cdcMaxBatchInterval Maximum length of the interval, defined in seconds, after which
       * to output a file to Amazon S3.
       * When `CdcMaxBatchInterval` and `CdcMinFileSize` are both specified, the file write is
       * triggered by whichever parameter condition is met first within an AWS DMS CloudFormation
       * template.
       *
       * The default value is 60 seconds.
       */
      override fun cdcMaxBatchInterval(cdcMaxBatchInterval: Number) {
        cdkBuilder.cdcMaxBatchInterval(cdcMaxBatchInterval)
      }

      /**
       * @param cdcMinFileSize Minimum file size, defined in kilobytes, to reach for a file output
       * to Amazon S3.
       * When `CdcMinFileSize` and `CdcMaxBatchInterval` are both specified, the file write is
       * triggered by whichever parameter condition is met first within an AWS DMS CloudFormation
       * template.
       *
       * The default value is 32 MB.
       */
      override fun cdcMinFileSize(cdcMinFileSize: Number) {
        cdkBuilder.cdcMinFileSize(cdcMinFileSize)
      }

      /**
       * @param cdcPath Specifies the folder path of CDC files.
       * For an S3 source, this setting is required if a task captures change data; otherwise, it's
       * optional. If `CdcPath` is set, AWS DMS reads CDC files from this path and replicates the data
       * changes to the target endpoint. For an S3 target if you set
       * [`PreserveTransactions`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-PreserveTransactions)
       * to `true` , AWS DMS verifies that you have set this parameter to a folder path on your S3
       * target where AWS DMS can save the transaction order for the CDC load. AWS DMS creates this CDC
       * folder path in either your S3 target working directory or the S3 target location specified by
       * [`BucketFolder`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketFolder)
       * and
       * [`BucketName`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketName)
       * .
       *
       * For example, if you specify `CdcPath` as `MyChangedData` , and you specify `BucketName` as
       * `MyTargetBucket` but do not specify `BucketFolder` , AWS DMS creates the CDC folder path
       * following: `MyTargetBucket/MyChangedData` .
       *
       * If you specify the same `CdcPath` , and you specify `BucketName` as `MyTargetBucket` and
       * `BucketFolder` as `MyTargetData` , AWS DMS creates the CDC folder path following:
       * `MyTargetBucket/MyTargetData/MyChangedData` .
       *
       * For more information on CDC including transaction order on an S3 target, see [Capturing
       * data changes (CDC) including transaction order on the S3
       * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath)
       * .
       *
       *
       * This setting is supported in AWS DMS versions 3.4.2 and later.
       */
      override fun cdcPath(cdcPath: String) {
        cdkBuilder.cdcPath(cdcPath)
      }

      /**
       * @param compressionType An optional parameter.
       * When set to GZIP it enables the service to compress the target files. To allow the service
       * to write the target files uncompressed, either set this parameter to NONE (the default) or
       * don't specify the parameter at all. This parameter applies to both .csv and .parquet file
       * formats.
       */
      override fun compressionType(compressionType: String) {
        cdkBuilder.compressionType(compressionType)
      }

      /**
       * @param csvDelimiter The delimiter used to separate columns in the .csv file for both source
       * and target. The default is a comma.
       */
      override fun csvDelimiter(csvDelimiter: String) {
        cdkBuilder.csvDelimiter(csvDelimiter)
      }

      /**
       * @param csvNoSupValue This setting only applies if your Amazon S3 output files during a
       * change data capture (CDC) load are written in .csv format. If
       * [`UseCsvNoSupValue`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-UseCsvNoSupValue)
       * is set to true, specify a string value that you want AWS DMS to use for all columns not
       * included in the supplemental log. If you do not specify a string value, AWS DMS uses the null
       * value for these columns regardless of the `UseCsvNoSupValue` setting.
       *
       * This setting is supported in AWS DMS versions 3.4.1 and later.
       */
      override fun csvNoSupValue(csvNoSupValue: String) {
        cdkBuilder.csvNoSupValue(csvNoSupValue)
      }

      /**
       * @param csvNullValue An optional parameter that specifies how AWS DMS treats null values.
       * While handling the null value, you can use this parameter to pass a user-defined string as
       * null when writing to the target. For example, when target columns are not nullable, you can
       * use this option to differentiate between the empty string value and the null value. So, if you
       * set this parameter value to the empty string ("" or ''), AWS DMS treats the empty string as
       * the null value instead of `NULL` .
       *
       * The default value is `NULL` . Valid values include any valid string.
       */
      override fun csvNullValue(csvNullValue: String) {
        cdkBuilder.csvNullValue(csvNullValue)
      }

      /**
       * @param csvRowDelimiter The delimiter used to separate rows in the .csv file for both source
       * and target.
       * The default is a carriage return ( `\n` ).
       */
      override fun csvRowDelimiter(csvRowDelimiter: String) {
        cdkBuilder.csvRowDelimiter(csvRowDelimiter)
      }

      /**
       * @param dataFormat The format of the data that you want to use for output. You can choose
       * one of the following:.
       * * `csv` : This is a row-based file format with comma-separated values (.csv).
       * * `parquet` : Apache Parquet (.parquet) is a columnar storage file format that features
       * efficient compression and provides faster query response.
       */
      override fun dataFormat(dataFormat: String) {
        cdkBuilder.dataFormat(dataFormat)
      }

      /**
       * @param dataPageSize The size of one data page in bytes.
       * This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is used for .parquet file
       * format only.
       */
      override fun dataPageSize(dataPageSize: Number) {
        cdkBuilder.dataPageSize(dataPageSize)
      }

      /**
       * @param datePartitionDelimiter Specifies a date separating delimiter to use during folder
       * partitioning.
       * The default value is `SLASH` . Use this parameter when `DatePartitionedEnabled` is set to
       * `true` .
       */
      override fun datePartitionDelimiter(datePartitionDelimiter: String) {
        cdkBuilder.datePartitionDelimiter(datePartitionDelimiter)
      }

      /**
       * @param datePartitionEnabled When set to `true` , this parameter partitions S3 bucket
       * folders based on transaction commit dates.
       * The default value is `false` . For more information about date-based folder partitioning,
       * see [Using date-based folder
       * partitioning](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning)
       * .
       */
      override fun datePartitionEnabled(datePartitionEnabled: Boolean) {
        cdkBuilder.datePartitionEnabled(datePartitionEnabled)
      }

      /**
       * @param datePartitionEnabled When set to `true` , this parameter partitions S3 bucket
       * folders based on transaction commit dates.
       * The default value is `false` . For more information about date-based folder partitioning,
       * see [Using date-based folder
       * partitioning](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning)
       * .
       */
      override fun datePartitionEnabled(datePartitionEnabled: IResolvable) {
        cdkBuilder.datePartitionEnabled(datePartitionEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param datePartitionSequence Identifies the sequence of the date format to use during
       * folder partitioning.
       * The default value is `YYYYMMDD` . Use this parameter when `DatePartitionedEnabled` is set
       * to `true` .
       */
      override fun datePartitionSequence(datePartitionSequence: String) {
        cdkBuilder.datePartitionSequence(datePartitionSequence)
      }

      /**
       * @param datePartitionTimezone When creating an S3 target endpoint, set
       * `DatePartitionTimezone` to convert the current UTC time into a specified time zone.
       * The conversion occurs when a date partition folder is created and a change data capture
       * (CDC) file name is generated. The time zone format is Area/Location. Use this parameter when
       * `DatePartitionedEnabled` is set to `true` , as shown in the following example.
       *
       * `s3-settings='{"DatePartitionEnabled": true, "DatePartitionSequence": "YYYYMMDDHH",
       * "DatePartitionDelimiter": "SLASH", "DatePartitionTimezone":" *Asia/Seoul* ", "BucketName":
       * "dms-nattarat-test"}'`
       */
      override fun datePartitionTimezone(datePartitionTimezone: String) {
        cdkBuilder.datePartitionTimezone(datePartitionTimezone)
      }

      /**
       * @param dictPageSizeLimit The maximum size of an encoded dictionary page of a column.
       * If the dictionary page exceeds this, this column is stored using an encoding type of
       * `PLAIN` . This parameter defaults to 1024 * 1024 bytes (1 MiB), the maximum size of a
       * dictionary page before it reverts to `PLAIN` encoding. This size is used for .parquet file
       * format only.
       */
      override fun dictPageSizeLimit(dictPageSizeLimit: Number) {
        cdkBuilder.dictPageSizeLimit(dictPageSizeLimit)
      }

      /**
       * @param enableStatistics A value that enables statistics for Parquet pages and row groups.
       * Choose `true` to enable statistics, `false` to disable. Statistics include `NULL` ,
       * `DISTINCT` , `MAX` , and `MIN` values. This parameter defaults to `true` . This value is used
       * for .parquet file format only.
       */
      override fun enableStatistics(enableStatistics: Boolean) {
        cdkBuilder.enableStatistics(enableStatistics)
      }

      /**
       * @param enableStatistics A value that enables statistics for Parquet pages and row groups.
       * Choose `true` to enable statistics, `false` to disable. Statistics include `NULL` ,
       * `DISTINCT` , `MAX` , and `MIN` values. This parameter defaults to `true` . This value is used
       * for .parquet file format only.
       */
      override fun enableStatistics(enableStatistics: IResolvable) {
        cdkBuilder.enableStatistics(enableStatistics.let(IResolvable::unwrap))
      }

      /**
       * @param encodingType The type of encoding that you're using:.
       * * `RLE_DICTIONARY` uses a combination of bit-packing and run-length encoding to store
       * repeated values more efficiently. This is the default.
       * * `PLAIN` doesn't use encoding at all. Values are stored as they are.
       * * `PLAIN_DICTIONARY` builds a dictionary of the values encountered in a given column. The
       * dictionary is stored in a dictionary page for each column chunk.
       */
      override fun encodingType(encodingType: String) {
        cdkBuilder.encodingType(encodingType)
      }

      /**
       * @param encryptionMode The type of server-side encryption that you want to use for your
       * data.
       * This encryption type is part of the endpoint settings or the extra connections attributes
       * for Amazon S3. You can choose either `SSE_S3` (the default) or `SSE_KMS` .
       *
       *
       * For the `ModifyEndpoint` operation, you can change the existing value of the
       * `EncryptionMode` parameter from `SSE_KMS` to `SSE_S3` . But you can’t change the existing
       * value from `SSE_S3` to `SSE_KMS` .
       *
       *
       * To use `SSE_S3` , you need an IAM role with permission to allow `"arn:aws:s3:::dms-*"` to
       * use the following actions:
       *
       * * `s3:CreateBucket`
       * * `s3:ListBucket`
       * * `s3:DeleteBucket`
       * * `s3:GetBucketLocation`
       * * `s3:GetObject`
       * * `s3:PutObject`
       * * `s3:DeleteObject`
       * * `s3:GetObjectVersion`
       * * `s3:GetBucketPolicy`
       * * `s3:PutBucketPolicy`
       * * `s3:DeleteBucketPolicy`
       */
      override fun encryptionMode(encryptionMode: String) {
        cdkBuilder.encryptionMode(encryptionMode)
      }

      /**
       * @param expectedBucketOwner To specify a bucket owner and prevent sniping, you can use the
       * `ExpectedBucketOwner` endpoint setting.
       * Example: `--s3-settings='{"ExpectedBucketOwner": " *AWS_Account_ID* "}'`
       *
       * When you make a request to test a connection or perform a migration, S3 checks the account
       * ID of the bucket owner against the specified parameter.
       */
      override fun expectedBucketOwner(expectedBucketOwner: String) {
        cdkBuilder.expectedBucketOwner(expectedBucketOwner)
      }

      /**
       * @param externalTableDefinition The external table definition.
       * Conditional: If `S3` is used as a source then `ExternalTableDefinition` is required.
       */
      override fun externalTableDefinition(externalTableDefinition: String) {
        cdkBuilder.externalTableDefinition(externalTableDefinition)
      }

      /**
       * @param glueCatalogGeneration When true, allows AWS Glue to catalog your S3 bucket.
       * Creating an AWS Glue catalog lets you use Athena to query your data.
       */
      override fun glueCatalogGeneration(glueCatalogGeneration: Boolean) {
        cdkBuilder.glueCatalogGeneration(glueCatalogGeneration)
      }

      /**
       * @param glueCatalogGeneration When true, allows AWS Glue to catalog your S3 bucket.
       * Creating an AWS Glue catalog lets you use Athena to query your data.
       */
      override fun glueCatalogGeneration(glueCatalogGeneration: IResolvable) {
        cdkBuilder.glueCatalogGeneration(glueCatalogGeneration.let(IResolvable::unwrap))
      }

      /**
       * @param ignoreHeaderRows When this value is set to 1, AWS DMS ignores the first row header
       * in a .csv file. A value of 1 turns on the feature; a value of 0 turns off the feature.
       * The default is 0.
       */
      override fun ignoreHeaderRows(ignoreHeaderRows: Number) {
        cdkBuilder.ignoreHeaderRows(ignoreHeaderRows)
      }

      /**
       * @param includeOpForFullLoad A value that enables a full load to write INSERT operations to
       * the comma-separated value (.csv) output files only to indicate how the rows were added to the
       * source database.
       *
       * AWS DMS supports the `IncludeOpForFullLoad` parameter in versions 3.1.4 and later.
       *
       *
       * For full load, records can only be inserted. By default (the `false` setting), no
       * information is recorded in these output files for a full load to indicate that the rows were
       * inserted at the source database. If `IncludeOpForFullLoad` is set to `true` or `y` , the
       * INSERT is recorded as an I annotation in the first field of the .csv file. This allows the
       * format of your target records from a full load to be consistent with the target records from a
       * CDC load.
       *
       *
       * This setting works together with the `CdcInsertsOnly` and the `CdcInsertsAndUpdates`
       * parameters for output to .csv files only. For more information about how these settings work
       * together, see [Indicating Source DB Operations in Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun includeOpForFullLoad(includeOpForFullLoad: Boolean) {
        cdkBuilder.includeOpForFullLoad(includeOpForFullLoad)
      }

      /**
       * @param includeOpForFullLoad A value that enables a full load to write INSERT operations to
       * the comma-separated value (.csv) output files only to indicate how the rows were added to the
       * source database.
       *
       * AWS DMS supports the `IncludeOpForFullLoad` parameter in versions 3.1.4 and later.
       *
       *
       * For full load, records can only be inserted. By default (the `false` setting), no
       * information is recorded in these output files for a full load to indicate that the rows were
       * inserted at the source database. If `IncludeOpForFullLoad` is set to `true` or `y` , the
       * INSERT is recorded as an I annotation in the first field of the .csv file. This allows the
       * format of your target records from a full load to be consistent with the target records from a
       * CDC load.
       *
       *
       * This setting works together with the `CdcInsertsOnly` and the `CdcInsertsAndUpdates`
       * parameters for output to .csv files only. For more information about how these settings work
       * together, see [Indicating Source DB Operations in Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun includeOpForFullLoad(includeOpForFullLoad: IResolvable) {
        cdkBuilder.includeOpForFullLoad(includeOpForFullLoad.let(IResolvable::unwrap))
      }

      /**
       * @param maxFileSize A value that specifies the maximum size (in KB) of any .csv file to be
       * created while migrating to an S3 target during full load.
       * The default value is 1,048,576 KB (1 GB). Valid values include 1 to 1,048,576.
       */
      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      /**
       * @param parquetTimestampInMillisecond A value that specifies the precision of any
       * `TIMESTAMP` column values that are written to an Amazon S3 object file in .parquet format.
       *
       * AWS DMS supports the `ParquetTimestampInMillisecond` parameter in versions 3.1.4 and later.
       *
       *
       * When `ParquetTimestampInMillisecond` is set to `true` or `y` , AWS DMS writes all
       * `TIMESTAMP` columns in a .parquet formatted file with millisecond precision. Otherwise, DMS
       * writes them with microsecond precision.
       *
       * Currently, Amazon Athena and AWS Glue can handle only millisecond precision for `TIMESTAMP`
       * values. Set this parameter to `true` for S3 endpoint object files that are .parquet formatted
       * only if you plan to query or process the data with Athena or AWS Glue .
       *
       *
       * AWS DMS writes any `TIMESTAMP` column values written to an S3 file in .csv format with
       * microsecond precision.
       *
       * Setting `ParquetTimestampInMillisecond` has no effect on the string format of the timestamp
       * column value that is inserted by setting the `TimestampColumnName` parameter.
       */
      override fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: Boolean) {
        cdkBuilder.parquetTimestampInMillisecond(parquetTimestampInMillisecond)
      }

      /**
       * @param parquetTimestampInMillisecond A value that specifies the precision of any
       * `TIMESTAMP` column values that are written to an Amazon S3 object file in .parquet format.
       *
       * AWS DMS supports the `ParquetTimestampInMillisecond` parameter in versions 3.1.4 and later.
       *
       *
       * When `ParquetTimestampInMillisecond` is set to `true` or `y` , AWS DMS writes all
       * `TIMESTAMP` columns in a .parquet formatted file with millisecond precision. Otherwise, DMS
       * writes them with microsecond precision.
       *
       * Currently, Amazon Athena and AWS Glue can handle only millisecond precision for `TIMESTAMP`
       * values. Set this parameter to `true` for S3 endpoint object files that are .parquet formatted
       * only if you plan to query or process the data with Athena or AWS Glue .
       *
       *
       * AWS DMS writes any `TIMESTAMP` column values written to an S3 file in .csv format with
       * microsecond precision.
       *
       * Setting `ParquetTimestampInMillisecond` has no effect on the string format of the timestamp
       * column value that is inserted by setting the `TimestampColumnName` parameter.
       */
      override fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: IResolvable) {
        cdkBuilder.parquetTimestampInMillisecond(parquetTimestampInMillisecond.let(IResolvable::unwrap))
      }

      /**
       * @param parquetVersion The version of the Apache Parquet format that you want to use:
       * `parquet_1_0` (the default) or `parquet_2_0` .
       */
      override fun parquetVersion(parquetVersion: String) {
        cdkBuilder.parquetVersion(parquetVersion)
      }

      /**
       * @param preserveTransactions If this setting is set to `true` , AWS DMS saves the
       * transaction order for a change data capture (CDC) load on the Amazon S3 target specified by
       * [`CdcPath`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath)
       * . For more information, see [Capturing data changes (CDC) including transaction order on the
       * S3
       * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath)
       * .
       *
       * This setting is supported in AWS DMS versions 3.4.2 and later.
       */
      override fun preserveTransactions(preserveTransactions: Boolean) {
        cdkBuilder.preserveTransactions(preserveTransactions)
      }

      /**
       * @param preserveTransactions If this setting is set to `true` , AWS DMS saves the
       * transaction order for a change data capture (CDC) load on the Amazon S3 target specified by
       * [`CdcPath`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath)
       * . For more information, see [Capturing data changes (CDC) including transaction order on the
       * S3
       * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath)
       * .
       *
       * This setting is supported in AWS DMS versions 3.4.2 and later.
       */
      override fun preserveTransactions(preserveTransactions: IResolvable) {
        cdkBuilder.preserveTransactions(preserveTransactions.let(IResolvable::unwrap))
      }

      /**
       * @param rfc4180 For an S3 source, when this value is set to `true` or `y` , each leading
       * double quotation mark has to be followed by an ending double quotation mark.
       * This formatting complies with RFC 4180. When this value is set to `false` or `n` , string
       * literals are copied to the target as is. In this case, a delimiter (row or column) signals the
       * end of the field. Thus, you can't use a delimiter as part of the string, because it signals
       * the end of the value.
       *
       * For an S3 target, an optional parameter used to set behavior to comply with RFC 4180 for
       * data migrated to Amazon S3 using .csv file format only. When this value is set to `true` or
       * `y` using Amazon S3 as a target, if the data has quotation marks or newline characters in it,
       * AWS DMS encloses the entire column with an additional pair of double quotation marks (").
       * Every quotation mark within the data is repeated twice.
       *
       * The default value is `true` . Valid values include `true` , `false` , `y` , and `n` .
       */
      override fun rfc4180(rfc4180: Boolean) {
        cdkBuilder.rfc4180(rfc4180)
      }

      /**
       * @param rfc4180 For an S3 source, when this value is set to `true` or `y` , each leading
       * double quotation mark has to be followed by an ending double quotation mark.
       * This formatting complies with RFC 4180. When this value is set to `false` or `n` , string
       * literals are copied to the target as is. In this case, a delimiter (row or column) signals the
       * end of the field. Thus, you can't use a delimiter as part of the string, because it signals
       * the end of the value.
       *
       * For an S3 target, an optional parameter used to set behavior to comply with RFC 4180 for
       * data migrated to Amazon S3 using .csv file format only. When this value is set to `true` or
       * `y` using Amazon S3 as a target, if the data has quotation marks or newline characters in it,
       * AWS DMS encloses the entire column with an additional pair of double quotation marks (").
       * Every quotation mark within the data is repeated twice.
       *
       * The default value is `true` . Valid values include `true` , `false` , `y` , and `n` .
       */
      override fun rfc4180(rfc4180: IResolvable) {
        cdkBuilder.rfc4180(rfc4180.let(IResolvable::unwrap))
      }

      /**
       * @param rowGroupLength The number of rows in a row group.
       * A smaller row group size provides faster reads. But as the number of row groups grows, the
       * slower writes become. This parameter defaults to 10,000 rows. This number is used for .parquet
       * file format only.
       *
       * If you choose a value larger than the maximum, `RowGroupLength` is set to the max row group
       * length in bytes (64 * 1024 * 1024).
       */
      override fun rowGroupLength(rowGroupLength: Number) {
        cdkBuilder.rowGroupLength(rowGroupLength)
      }

      /**
       * @param serverSideEncryptionKmsKeyId If you are using `SSE_KMS` for the `EncryptionMode` ,
       * provide the AWS KMS key ID.
       * The key that you use needs an attached policy that enables IAM user permissions and allows
       * use of the key.
       *
       * Here is a CLI example: `aws dms create-endpoint --endpoint-identifier
       * *value* --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn= *value*
       * ,BucketFolder= *value* ,BucketName= *value*
       * ,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId= *value*`
       */
      override fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String) {
        cdkBuilder.serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId)
      }

      /**
       * @param serviceAccessRoleArn A required parameter that specifies the Amazon Resource Name
       * (ARN) used by the service to access the IAM role.
       * The role must allow the `iam:PassRole` action. It enables AWS DMS to read and write objects
       * from an S3 bucket.
       */
      override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      /**
       * @param timestampColumnName A value that when nonblank causes AWS DMS to add a column with
       * timestamp information to the endpoint data for an Amazon S3 target.
       *
       * AWS DMS supports the `TimestampColumnName` parameter in versions 3.1.4 and later.
       *
       *
       * AWS DMS includes an additional `STRING` column in the .csv or .parquet object files of your
       * migrated data when you set `TimestampColumnName` to a nonblank value.
       *
       * For a full load, each row of this timestamp column contains a timestamp for when the data
       * was transferred from the source to the target by DMS.
       *
       * For a change data capture (CDC) load, each row of the timestamp column contains the
       * timestamp for the commit of that row in the source database.
       *
       * The string format for this timestamp column value is `yyyy-MM-dd HH:mm:ss.SSSSSS` . By
       * default, the precision of this value is in microseconds. For a CDC load, the rounding of the
       * precision depends on the commit timestamp supported by DMS for the source database.
       *
       * When the `AddColumnName` parameter is set to `true` , DMS also includes a name for the
       * timestamp column that you set with `TimestampColumnName` .
       */
      override fun timestampColumnName(timestampColumnName: String) {
        cdkBuilder.timestampColumnName(timestampColumnName)
      }

      /**
       * @param useCsvNoSupValue This setting applies if the S3 output files during a change data
       * capture (CDC) load are written in .csv format. If this setting is set to `true` for columns
       * not included in the supplemental log, AWS DMS uses the value specified by
       * [`CsvNoSupValue`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue)
       * . If this setting isn't set or is set to `false` , AWS DMS uses the null value for these
       * columns.
       *
       * This setting is supported in AWS DMS versions 3.4.1 and later.
       */
      override fun useCsvNoSupValue(useCsvNoSupValue: Boolean) {
        cdkBuilder.useCsvNoSupValue(useCsvNoSupValue)
      }

      /**
       * @param useCsvNoSupValue This setting applies if the S3 output files during a change data
       * capture (CDC) load are written in .csv format. If this setting is set to `true` for columns
       * not included in the supplemental log, AWS DMS uses the value specified by
       * [`CsvNoSupValue`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue)
       * . If this setting isn't set or is set to `false` , AWS DMS uses the null value for these
       * columns.
       *
       * This setting is supported in AWS DMS versions 3.4.1 and later.
       */
      override fun useCsvNoSupValue(useCsvNoSupValue: IResolvable) {
        cdkBuilder.useCsvNoSupValue(useCsvNoSupValue.let(IResolvable::unwrap))
      }

      /**
       * @param useTaskStartTimeForFullLoadTimestamp When set to true, this parameter uses the task
       * start time as the timestamp column value instead of the time data is written to target.
       * For full load, when `useTaskStartTimeForFullLoadTimestamp` is set to `true` , each row of
       * the timestamp column contains the task start time. For CDC loads, each row of the timestamp
       * column contains the transaction commit time.
       *
       * When `useTaskStartTimeForFullLoadTimestamp` is set to `false` , the full load timestamp in
       * the timestamp column increments with the time data arrives at the target.
       */
      override
          fun useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp: Boolean) {
        cdkBuilder.useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp)
      }

      /**
       * @param useTaskStartTimeForFullLoadTimestamp When set to true, this parameter uses the task
       * start time as the timestamp column value instead of the time data is written to target.
       * For full load, when `useTaskStartTimeForFullLoadTimestamp` is set to `true` , each row of
       * the timestamp column contains the task start time. For CDC loads, each row of the timestamp
       * column contains the transaction commit time.
       *
       * When `useTaskStartTimeForFullLoadTimestamp` is set to `false` , the full load timestamp in
       * the timestamp column increments with the time data arrives at the target.
       */
      override
          fun useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp: IResolvable) {
        cdkBuilder.useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty,
    ) : CdkObject(cdkObject), S3SettingsProperty {
      /**
       * An optional parameter that, when set to `true` or `y` , you can use to add column name
       * information to the .csv output file.
       *
       * The default value is `false` . Valid values are `true` , `false` , `y` , and `n` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-addcolumnname)
       */
      override fun addColumnName(): Any? = unwrap(this).getAddColumnName()

      /**
       * Use the S3 target endpoint setting `AddTrailingPaddingCharacter` to add padding on string
       * data.
       *
       * The default value is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-addtrailingpaddingcharacter)
       */
      override fun addTrailingPaddingCharacter(): Any? =
          unwrap(this).getAddTrailingPaddingCharacter()

      /**
       * An optional parameter to set a folder name in the S3 bucket.
       *
       * If provided, tables are created in the path `*bucketFolder* / *schema_name* / *table_name*
       * /` . If this parameter isn't specified, the path used is `*schema_name* / *table_name* /` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder)
       */
      override fun bucketFolder(): String? = unwrap(this).getBucketFolder()

      /**
       * The name of the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname)
       */
      override fun bucketName(): String? = unwrap(this).getBucketName()

      /**
       * A value that enables AWS DMS to specify a predefined (canned) access control list (ACL) for
       * objects created in an Amazon S3 bucket as .csv or .parquet files. For more information about
       * Amazon S3 canned ACLs, see [Canned
       * ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) in the
       * *Amazon S3 Developer Guide* .
       *
       * The default value is NONE. Valid values include NONE, PRIVATE, PUBLIC_READ,
       * PUBLIC_READ_WRITE, AUTHENTICATED_READ, AWS_EXEC_READ, BUCKET_OWNER_READ, and
       * BUCKET_OWNER_FULL_CONTROL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-cannedaclforobjects)
       */
      override fun cannedAclForObjects(): String? = unwrap(this).getCannedAclForObjects()

      /**
       * A value that enables a change data capture (CDC) load to write INSERT and UPDATE operations
       * to .csv or .parquet (columnar storage) output files. The default setting is `false` , but when
       * `CdcInsertsAndUpdates` is set to `true` or `y` , only INSERTs and UPDATEs from the source
       * database are migrated to the .csv or .parquet file.
       *
       * For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value
       * of the `IncludeOpForFullLoad` parameter. If `IncludeOpForFullLoad` is set to `true` , the
       * first field of every CDC record is set to either `I` or `U` to indicate INSERT and UPDATE
       * operations at the source. But if `IncludeOpForFullLoad` is set to `false` , CDC records are
       * written without an indication of INSERT or UPDATE operations at the source. For more
       * information about how these settings work together, see [Indicating Source DB Operations in
       * Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * AWS DMS supports the use of the `CdcInsertsAndUpdates` parameter in versions 3.3.1 and
       * later.
       *
       * `CdcInsertsOnly` and `CdcInsertsAndUpdates` can't both be set to `true` for the same
       * endpoint. Set either `CdcInsertsOnly` or `CdcInsertsAndUpdates` to `true` for the same
       * endpoint, but not both.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-cdcinsertsandupdates)
       */
      override fun cdcInsertsAndUpdates(): Any? = unwrap(this).getCdcInsertsAndUpdates()

      /**
       * A value that enables a change data capture (CDC) load to write only INSERT operations to
       * .csv or columnar storage (.parquet) output files. By default (the `false` setting), the first
       * field in a .csv or .parquet record contains the letter I (INSERT), U (UPDATE), or D (DELETE).
       * These values indicate whether the row was inserted, updated, or deleted at the source database
       * for a CDC load to the target.
       *
       * If `CdcInsertsOnly` is set to `true` or `y` , only INSERTs from the source database are
       * migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded
       * depends on the value of `IncludeOpForFullLoad` . If `IncludeOpForFullLoad` is set to `true` ,
       * the first field of every CDC record is set to I to indicate the INSERT operation at the
       * source. If `IncludeOpForFullLoad` is set to `false` , every CDC record is written without a
       * first field to indicate the INSERT operation at the source. For more information about how
       * these settings work together, see [Indicating Source DB Operations in Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * AWS DMS supports the interaction described preceding between the `CdcInsertsOnly` and
       * `IncludeOpForFullLoad` parameters in versions 3.1.4 and later.
       *
       * `CdcInsertsOnly` and `CdcInsertsAndUpdates` can't both be set to `true` for the same
       * endpoint. Set either `CdcInsertsOnly` or `CdcInsertsAndUpdates` to `true` for the same
       * endpoint, but not both.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-cdcinsertsonly)
       */
      override fun cdcInsertsOnly(): Any? = unwrap(this).getCdcInsertsOnly()

      /**
       * Maximum length of the interval, defined in seconds, after which to output a file to Amazon
       * S3.
       *
       * When `CdcMaxBatchInterval` and `CdcMinFileSize` are both specified, the file write is
       * triggered by whichever parameter condition is met first within an AWS DMS CloudFormation
       * template.
       *
       * The default value is 60 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-cdcmaxbatchinterval)
       */
      override fun cdcMaxBatchInterval(): Number? = unwrap(this).getCdcMaxBatchInterval()

      /**
       * Minimum file size, defined in kilobytes, to reach for a file output to Amazon S3.
       *
       * When `CdcMinFileSize` and `CdcMaxBatchInterval` are both specified, the file write is
       * triggered by whichever parameter condition is met first within an AWS DMS CloudFormation
       * template.
       *
       * The default value is 32 MB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-cdcminfilesize)
       */
      override fun cdcMinFileSize(): Number? = unwrap(this).getCdcMinFileSize()

      /**
       * Specifies the folder path of CDC files.
       *
       * For an S3 source, this setting is required if a task captures change data; otherwise, it's
       * optional. If `CdcPath` is set, AWS DMS reads CDC files from this path and replicates the data
       * changes to the target endpoint. For an S3 target if you set
       * [`PreserveTransactions`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-PreserveTransactions)
       * to `true` , AWS DMS verifies that you have set this parameter to a folder path on your S3
       * target where AWS DMS can save the transaction order for the CDC load. AWS DMS creates this CDC
       * folder path in either your S3 target working directory or the S3 target location specified by
       * [`BucketFolder`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketFolder)
       * and
       * [`BucketName`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketName)
       * .
       *
       * For example, if you specify `CdcPath` as `MyChangedData` , and you specify `BucketName` as
       * `MyTargetBucket` but do not specify `BucketFolder` , AWS DMS creates the CDC folder path
       * following: `MyTargetBucket/MyChangedData` .
       *
       * If you specify the same `CdcPath` , and you specify `BucketName` as `MyTargetBucket` and
       * `BucketFolder` as `MyTargetData` , AWS DMS creates the CDC folder path following:
       * `MyTargetBucket/MyTargetData/MyChangedData` .
       *
       * For more information on CDC including transaction order on an S3 target, see [Capturing
       * data changes (CDC) including transaction order on the S3
       * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath)
       * .
       *
       *
       * This setting is supported in AWS DMS versions 3.4.2 and later.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-cdcpath)
       */
      override fun cdcPath(): String? = unwrap(this).getCdcPath()

      /**
       * An optional parameter.
       *
       * When set to GZIP it enables the service to compress the target files. To allow the service
       * to write the target files uncompressed, either set this parameter to NONE (the default) or
       * don't specify the parameter at all. This parameter applies to both .csv and .parquet file
       * formats.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype)
       */
      override fun compressionType(): String? = unwrap(this).getCompressionType()

      /**
       * The delimiter used to separate columns in the .csv file for both source and target. The
       * default is a comma.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter)
       */
      override fun csvDelimiter(): String? = unwrap(this).getCsvDelimiter()

      /**
       * This setting only applies if your Amazon S3 output files during a change data capture (CDC)
       * load are written in .csv format. If
       * [`UseCsvNoSupValue`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-UseCsvNoSupValue)
       * is set to true, specify a string value that you want AWS DMS to use for all columns not
       * included in the supplemental log. If you do not specify a string value, AWS DMS uses the null
       * value for these columns regardless of the `UseCsvNoSupValue` setting.
       *
       *
       * This setting is supported in AWS DMS versions 3.4.1 and later.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvnosupvalue)
       */
      override fun csvNoSupValue(): String? = unwrap(this).getCsvNoSupValue()

      /**
       * An optional parameter that specifies how AWS DMS treats null values.
       *
       * While handling the null value, you can use this parameter to pass a user-defined string as
       * null when writing to the target. For example, when target columns are not nullable, you can
       * use this option to differentiate between the empty string value and the null value. So, if you
       * set this parameter value to the empty string ("" or ''), AWS DMS treats the empty string as
       * the null value instead of `NULL` .
       *
       * The default value is `NULL` . Valid values include any valid string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvnullvalue)
       */
      override fun csvNullValue(): String? = unwrap(this).getCsvNullValue()

      /**
       * The delimiter used to separate rows in the .csv file for both source and target.
       *
       * The default is a carriage return ( `\n` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter)
       */
      override fun csvRowDelimiter(): String? = unwrap(this).getCsvRowDelimiter()

      /**
       * The format of the data that you want to use for output. You can choose one of the
       * following:.
       *
       * * `csv` : This is a row-based file format with comma-separated values (.csv).
       * * `parquet` : Apache Parquet (.parquet) is a columnar storage file format that features
       * efficient compression and provides faster query response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-dataformat)
       */
      override fun dataFormat(): String? = unwrap(this).getDataFormat()

      /**
       * The size of one data page in bytes.
       *
       * This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is used for .parquet file
       * format only.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-datapagesize)
       */
      override fun dataPageSize(): Number? = unwrap(this).getDataPageSize()

      /**
       * Specifies a date separating delimiter to use during folder partitioning.
       *
       * The default value is `SLASH` . Use this parameter when `DatePartitionedEnabled` is set to
       * `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-datepartitiondelimiter)
       */
      override fun datePartitionDelimiter(): String? = unwrap(this).getDatePartitionDelimiter()

      /**
       * When set to `true` , this parameter partitions S3 bucket folders based on transaction
       * commit dates.
       *
       * The default value is `false` . For more information about date-based folder partitioning,
       * see [Using date-based folder
       * partitioning](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-datepartitionenabled)
       */
      override fun datePartitionEnabled(): Any? = unwrap(this).getDatePartitionEnabled()

      /**
       * Identifies the sequence of the date format to use during folder partitioning.
       *
       * The default value is `YYYYMMDD` . Use this parameter when `DatePartitionedEnabled` is set
       * to `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-datepartitionsequence)
       */
      override fun datePartitionSequence(): String? = unwrap(this).getDatePartitionSequence()

      /**
       * When creating an S3 target endpoint, set `DatePartitionTimezone` to convert the current UTC
       * time into a specified time zone.
       *
       * The conversion occurs when a date partition folder is created and a change data capture
       * (CDC) file name is generated. The time zone format is Area/Location. Use this parameter when
       * `DatePartitionedEnabled` is set to `true` , as shown in the following example.
       *
       * `s3-settings='{"DatePartitionEnabled": true, "DatePartitionSequence": "YYYYMMDDHH",
       * "DatePartitionDelimiter": "SLASH", "DatePartitionTimezone":" *Asia/Seoul* ", "BucketName":
       * "dms-nattarat-test"}'`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-datepartitiontimezone)
       */
      override fun datePartitionTimezone(): String? = unwrap(this).getDatePartitionTimezone()

      /**
       * The maximum size of an encoded dictionary page of a column.
       *
       * If the dictionary page exceeds this, this column is stored using an encoding type of
       * `PLAIN` . This parameter defaults to 1024 * 1024 bytes (1 MiB), the maximum size of a
       * dictionary page before it reverts to `PLAIN` encoding. This size is used for .parquet file
       * format only.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-dictpagesizelimit)
       */
      override fun dictPageSizeLimit(): Number? = unwrap(this).getDictPageSizeLimit()

      /**
       * A value that enables statistics for Parquet pages and row groups.
       *
       * Choose `true` to enable statistics, `false` to disable. Statistics include `NULL` ,
       * `DISTINCT` , `MAX` , and `MIN` values. This parameter defaults to `true` . This value is used
       * for .parquet file format only.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-enablestatistics)
       */
      override fun enableStatistics(): Any? = unwrap(this).getEnableStatistics()

      /**
       * The type of encoding that you're using:.
       *
       * * `RLE_DICTIONARY` uses a combination of bit-packing and run-length encoding to store
       * repeated values more efficiently. This is the default.
       * * `PLAIN` doesn't use encoding at all. Values are stored as they are.
       * * `PLAIN_DICTIONARY` builds a dictionary of the values encountered in a given column. The
       * dictionary is stored in a dictionary page for each column chunk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-encodingtype)
       */
      override fun encodingType(): String? = unwrap(this).getEncodingType()

      /**
       * The type of server-side encryption that you want to use for your data.
       *
       * This encryption type is part of the endpoint settings or the extra connections attributes
       * for Amazon S3. You can choose either `SSE_S3` (the default) or `SSE_KMS` .
       *
       *
       * For the `ModifyEndpoint` operation, you can change the existing value of the
       * `EncryptionMode` parameter from `SSE_KMS` to `SSE_S3` . But you can’t change the existing
       * value from `SSE_S3` to `SSE_KMS` .
       *
       *
       * To use `SSE_S3` , you need an IAM role with permission to allow `"arn:aws:s3:::dms-*"` to
       * use the following actions:
       *
       * * `s3:CreateBucket`
       * * `s3:ListBucket`
       * * `s3:DeleteBucket`
       * * `s3:GetBucketLocation`
       * * `s3:GetObject`
       * * `s3:PutObject`
       * * `s3:DeleteObject`
       * * `s3:GetObjectVersion`
       * * `s3:GetBucketPolicy`
       * * `s3:PutBucketPolicy`
       * * `s3:DeleteBucketPolicy`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-encryptionmode)
       */
      override fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

      /**
       * To specify a bucket owner and prevent sniping, you can use the `ExpectedBucketOwner`
       * endpoint setting.
       *
       * Example: `--s3-settings='{"ExpectedBucketOwner": " *AWS_Account_ID* "}'`
       *
       * When you make a request to test a connection or perform a migration, S3 checks the account
       * ID of the bucket owner against the specified parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-expectedbucketowner)
       */
      override fun expectedBucketOwner(): String? = unwrap(this).getExpectedBucketOwner()

      /**
       * The external table definition.
       *
       * Conditional: If `S3` is used as a source then `ExternalTableDefinition` is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition)
       */
      override fun externalTableDefinition(): String? = unwrap(this).getExternalTableDefinition()

      /**
       * When true, allows AWS Glue to catalog your S3 bucket.
       *
       * Creating an AWS Glue catalog lets you use Athena to query your data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-gluecataloggeneration)
       */
      override fun glueCatalogGeneration(): Any? = unwrap(this).getGlueCatalogGeneration()

      /**
       * When this value is set to 1, AWS DMS ignores the first row header in a .csv file. A value
       * of 1 turns on the feature; a value of 0 turns off the feature.
       *
       * The default is 0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-ignoreheaderrows)
       */
      override fun ignoreHeaderRows(): Number? = unwrap(this).getIgnoreHeaderRows()

      /**
       * A value that enables a full load to write INSERT operations to the comma-separated value
       * (.csv) output files only to indicate how the rows were added to the source database.
       *
       *
       * AWS DMS supports the `IncludeOpForFullLoad` parameter in versions 3.1.4 and later.
       *
       *
       * For full load, records can only be inserted. By default (the `false` setting), no
       * information is recorded in these output files for a full load to indicate that the rows were
       * inserted at the source database. If `IncludeOpForFullLoad` is set to `true` or `y` , the
       * INSERT is recorded as an I annotation in the first field of the .csv file. This allows the
       * format of your target records from a full load to be consistent with the target records from a
       * CDC load.
       *
       *
       * This setting works together with the `CdcInsertsOnly` and the `CdcInsertsAndUpdates`
       * parameters for output to .csv files only. For more information about how these settings work
       * together, see [Indicating Source DB Operations in Migrated S3
       * Data](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-includeopforfullload)
       */
      override fun includeOpForFullLoad(): Any? = unwrap(this).getIncludeOpForFullLoad()

      /**
       * A value that specifies the maximum size (in KB) of any .csv file to be created while
       * migrating to an S3 target during full load.
       *
       * The default value is 1,048,576 KB (1 GB). Valid values include 1 to 1,048,576.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-maxfilesize)
       */
      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      /**
       * A value that specifies the precision of any `TIMESTAMP` column values that are written to
       * an Amazon S3 object file in .parquet format.
       *
       *
       * AWS DMS supports the `ParquetTimestampInMillisecond` parameter in versions 3.1.4 and later.
       *
       *
       * When `ParquetTimestampInMillisecond` is set to `true` or `y` , AWS DMS writes all
       * `TIMESTAMP` columns in a .parquet formatted file with millisecond precision. Otherwise, DMS
       * writes them with microsecond precision.
       *
       * Currently, Amazon Athena and AWS Glue can handle only millisecond precision for `TIMESTAMP`
       * values. Set this parameter to `true` for S3 endpoint object files that are .parquet formatted
       * only if you plan to query or process the data with Athena or AWS Glue .
       *
       *
       * AWS DMS writes any `TIMESTAMP` column values written to an S3 file in .csv format with
       * microsecond precision.
       *
       * Setting `ParquetTimestampInMillisecond` has no effect on the string format of the timestamp
       * column value that is inserted by setting the `TimestampColumnName` parameter.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-parquettimestampinmillisecond)
       */
      override fun parquetTimestampInMillisecond(): Any? =
          unwrap(this).getParquetTimestampInMillisecond()

      /**
       * The version of the Apache Parquet format that you want to use: `parquet_1_0` (the default)
       * or `parquet_2_0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-parquetversion)
       */
      override fun parquetVersion(): String? = unwrap(this).getParquetVersion()

      /**
       * If this setting is set to `true` , AWS DMS saves the transaction order for a change data
       * capture (CDC) load on the Amazon S3 target specified by
       * [`CdcPath`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath)
       * . For more information, see [Capturing data changes (CDC) including transaction order on the
       * S3
       * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath)
       * .
       *
       *
       * This setting is supported in AWS DMS versions 3.4.2 and later.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-preservetransactions)
       */
      override fun preserveTransactions(): Any? = unwrap(this).getPreserveTransactions()

      /**
       * For an S3 source, when this value is set to `true` or `y` , each leading double quotation
       * mark has to be followed by an ending double quotation mark.
       *
       * This formatting complies with RFC 4180. When this value is set to `false` or `n` , string
       * literals are copied to the target as is. In this case, a delimiter (row or column) signals the
       * end of the field. Thus, you can't use a delimiter as part of the string, because it signals
       * the end of the value.
       *
       * For an S3 target, an optional parameter used to set behavior to comply with RFC 4180 for
       * data migrated to Amazon S3 using .csv file format only. When this value is set to `true` or
       * `y` using Amazon S3 as a target, if the data has quotation marks or newline characters in it,
       * AWS DMS encloses the entire column with an additional pair of double quotation marks (").
       * Every quotation mark within the data is repeated twice.
       *
       * The default value is `true` . Valid values include `true` , `false` , `y` , and `n` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-rfc4180)
       */
      override fun rfc4180(): Any? = unwrap(this).getRfc4180()

      /**
       * The number of rows in a row group.
       *
       * A smaller row group size provides faster reads. But as the number of row groups grows, the
       * slower writes become. This parameter defaults to 10,000 rows. This number is used for .parquet
       * file format only.
       *
       * If you choose a value larger than the maximum, `RowGroupLength` is set to the max row group
       * length in bytes (64 * 1024 * 1024).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-rowgrouplength)
       */
      override fun rowGroupLength(): Number? = unwrap(this).getRowGroupLength()

      /**
       * If you are using `SSE_KMS` for the `EncryptionMode` , provide the AWS KMS key ID.
       *
       * The key that you use needs an attached policy that enables IAM user permissions and allows
       * use of the key.
       *
       * Here is a CLI example: `aws dms create-endpoint --endpoint-identifier
       * *value* --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn= *value*
       * ,BucketFolder= *value* ,BucketName= *value*
       * ,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId= *value*`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serversideencryptionkmskeyid)
       */
      override fun serverSideEncryptionKmsKeyId(): String? =
          unwrap(this).getServerSideEncryptionKmsKeyId()

      /**
       * A required parameter that specifies the Amazon Resource Name (ARN) used by the service to
       * access the IAM role.
       *
       * The role must allow the `iam:PassRole` action. It enables AWS DMS to read and write objects
       * from an S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn)
       */
      override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

      /**
       * A value that when nonblank causes AWS DMS to add a column with timestamp information to the
       * endpoint data for an Amazon S3 target.
       *
       *
       * AWS DMS supports the `TimestampColumnName` parameter in versions 3.1.4 and later.
       *
       *
       * AWS DMS includes an additional `STRING` column in the .csv or .parquet object files of your
       * migrated data when you set `TimestampColumnName` to a nonblank value.
       *
       * For a full load, each row of this timestamp column contains a timestamp for when the data
       * was transferred from the source to the target by DMS.
       *
       * For a change data capture (CDC) load, each row of the timestamp column contains the
       * timestamp for the commit of that row in the source database.
       *
       * The string format for this timestamp column value is `yyyy-MM-dd HH:mm:ss.SSSSSS` . By
       * default, the precision of this value is in microseconds. For a CDC load, the rounding of the
       * precision depends on the commit timestamp supported by DMS for the source database.
       *
       * When the `AddColumnName` parameter is set to `true` , DMS also includes a name for the
       * timestamp column that you set with `TimestampColumnName` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-timestampcolumnname)
       */
      override fun timestampColumnName(): String? = unwrap(this).getTimestampColumnName()

      /**
       * This setting applies if the S3 output files during a change data capture (CDC) load are
       * written in .csv format. If this setting is set to `true` for columns not included in the
       * supplemental log, AWS DMS uses the value specified by
       * [`CsvNoSupValue`](https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue)
       * . If this setting isn't set or is set to `false` , AWS DMS uses the null value for these
       * columns.
       *
       *
       * This setting is supported in AWS DMS versions 3.4.1 and later.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-usecsvnosupvalue)
       */
      override fun useCsvNoSupValue(): Any? = unwrap(this).getUseCsvNoSupValue()

      /**
       * When set to true, this parameter uses the task start time as the timestamp column value
       * instead of the time data is written to target.
       *
       * For full load, when `useTaskStartTimeForFullLoadTimestamp` is set to `true` , each row of
       * the timestamp column contains the task start time. For CDC loads, each row of the timestamp
       * column contains the transaction commit time.
       *
       * When `useTaskStartTimeForFullLoadTimestamp` is set to `false` , the full load timestamp in
       * the timestamp column increments with the time data arrives at the target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-usetaskstarttimeforfullloadtimestamp)
       */
      override fun useTaskStartTimeForFullLoadTimestamp(): Any? =
          unwrap(this).getUseTaskStartTimeForFullLoadTimestamp()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty):
          S3SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3SettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty
    }
  }

  public interface SybaseSettingsProperty {
    /**
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
     * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
     *
     * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
     * AWS Secrets Manager secret that allows access to the SAP ASE endpoint.
     *
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
     * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
     *
     * For more information on creating this `SecretsManagerSecret` , the corresponding
     * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access it,
     * see [Using secrets to access AWS Database Migration Service
     * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-sybasesettings.html#cfn-dms-endpoint-sybasesettings-secretsmanageraccessrolearn)
     */
    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    /**
     * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
     * SAP SAE endpoint connection details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-sybasesettings.html#cfn-dms-endpoint-sybasesettings-secretsmanagersecretid)
     */
    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    /**
     * A builder for [SybaseSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the SAP ASE endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the SAP SAE endpoint connection details.
       */
      public fun secretsManagerSecretId(secretsManagerSecretId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty.builder()

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the SAP ASE endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the SAP SAE endpoint connection details.
       */
      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty,
    ) : CdkObject(cdkObject), SybaseSettingsProperty {
      /**
       * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
       * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
       *
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the SAP ASE endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-sybasesettings.html#cfn-dms-endpoint-sybasesettings-secretsmanageraccessrolearn)
       */
      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      /**
       * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
       * SAP SAE endpoint connection details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-sybasesettings.html#cfn-dms-endpoint-sybasesettings-secretsmanagersecretid)
       */
      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SybaseSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty):
          SybaseSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SybaseSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty
    }
  }

  public interface MicrosoftSqlServerSettingsProperty {
    /**
     * The maximum size of the packets (in bytes) used to transfer data using BCP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-bcppacketsize)
     */
    public fun bcpPacketSize(): Number? = unwrap(this).getBcpPacketSize()

    /**
     * Specifies a file group for the AWS DMS internal tables.
     *
     * When the replication task starts, all the internal AWS DMS control tables (awsdms_
     * apply_exception, awsdms_apply, awsdms_changes) are created for the specified file group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-controltablesfilegroup)
     */
    public fun controlTablesFileGroup(): String? = unwrap(this).getControlTablesFileGroup()

    /**
     * Database name for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * Forces LOB lookup on inline LOB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-forceloblookup)
     */
    public fun forceLobLookup(): Any? = unwrap(this).getForceLobLookup()

    /**
     * Endpoint connection password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-password)
     */
    public fun password(): String? = unwrap(this).getPassword()

    /**
     * Endpoint TCP port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * Cleans and recreates table metadata information on the replication instance when a mismatch
     * occurs.
     *
     * An example is a situation where running an alter DDL statement on a table might result in
     * different information about the table cached in the replication instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-querysinglealwaysonnode)
     */
    public fun querySingleAlwaysOnNode(): Any? = unwrap(this).getQuerySingleAlwaysOnNode()

    /**
     * When this attribute is set to `Y` , AWS DMS only reads changes from transaction log backups
     * and doesn't read from the active transaction log file during ongoing replication.
     *
     * Setting this parameter to `Y` enables you to control active transaction log file growth
     * during full load and ongoing replication tasks. However, it can add some source latency to
     * ongoing replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-readbackuponly)
     */
    public fun readBackupOnly(): Any? = unwrap(this).getReadBackupOnly()

    /**
     * Use this attribute to minimize the need to access the backup log and enable AWS DMS to
     * prevent truncation using one of the following two methods.
     *
     * *Start transactions in the database:* This is the default method. When this method is used,
     * AWS DMS prevents TLOG truncation by mimicking a transaction in the database. As long as such a
     * transaction is open, changes that appear after the transaction started aren't truncated. If you
     * need Microsoft Replication to be enabled in your database, then you must choose this method.
     *
     * *Exclusively use sp_repldone within a single task* : When this method is used, AWS DMS reads
     * the changes and then uses sp_repldone to mark the TLOG transactions as ready for truncation.
     * Although this method doesn't involve any transactional activities, it can only be used when
     * Microsoft Replication isn't running. Also, when using this method, only one AWS DMS task can
     * access the database at any given time. Therefore, if you need to run parallel AWS DMS tasks
     * against the same database, use the default method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-safeguardpolicy)
     */
    public fun safeguardPolicy(): String? = unwrap(this).getSafeguardPolicy()

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
     * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
     *
     * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
     * AWS Secrets Manager secret that allows access to the SQL Server endpoint.
     *
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
     * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
     *
     * For more information on creating this `SecretsManagerSecret` , the corresponding
     * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access it,
     * see [Using secrets to access AWS Database Migration Service
     * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-secretsmanageraccessrolearn)
     */
    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    /**
     * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
     * MicrosoftSQLServer endpoint connection details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-secretsmanagersecretid)
     */
    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    /**
     * Fully qualified domain name of the endpoint.
     *
     * For an Amazon RDS SQL Server instance, this is the output of
     * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
     * , in the
     * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
     * .Address` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-servername)
     */
    public fun serverName(): String? = unwrap(this).getServerName()

    /**
     * Indicates the mode used to fetch CDC data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-tlogaccessmode)
     */
    public fun tlogAccessMode(): String? = unwrap(this).getTlogAccessMode()

    /**
     * Use the `TrimSpaceInChar` source endpoint setting to right-trim data on CHAR and NCHAR data
     * types during migration.
     *
     * Setting `TrimSpaceInChar` does not left-trim data. The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-trimspaceinchar)
     */
    public fun trimSpaceInChar(): Any? = unwrap(this).getTrimSpaceInChar()

    /**
     * Use this to attribute to transfer data for full-load operations using BCP.
     *
     * When the target table contains an identity column that does not exist in the source table,
     * you must disable the use BCP for loading table option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-usebcpfullload)
     */
    public fun useBcpFullLoad(): Any? = unwrap(this).getUseBcpFullLoad()

    /**
     * When this attribute is set to `Y` , DMS processes third-party transaction log backups if they
     * are created in native format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-usethirdpartybackupdevice)
     */
    public fun useThirdPartyBackupDevice(): Any? = unwrap(this).getUseThirdPartyBackupDevice()

    /**
     * Endpoint connection user name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-username)
     */
    public fun username(): String? = unwrap(this).getUsername()

    /**
     * A builder for [MicrosoftSqlServerSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bcpPacketSize The maximum size of the packets (in bytes) used to transfer data using
       * BCP.
       */
      public fun bcpPacketSize(bcpPacketSize: Number)

      /**
       * @param controlTablesFileGroup Specifies a file group for the AWS DMS internal tables.
       * When the replication task starts, all the internal AWS DMS control tables (awsdms_
       * apply_exception, awsdms_apply, awsdms_changes) are created for the specified file group.
       */
      public fun controlTablesFileGroup(controlTablesFileGroup: String)

      /**
       * @param databaseName Database name for the endpoint.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param forceLobLookup Forces LOB lookup on inline LOB.
       */
      public fun forceLobLookup(forceLobLookup: Boolean)

      /**
       * @param forceLobLookup Forces LOB lookup on inline LOB.
       */
      public fun forceLobLookup(forceLobLookup: IResolvable)

      /**
       * @param password Endpoint connection password.
       */
      public fun password(password: String)

      /**
       * @param port Endpoint TCP port.
       */
      public fun port(port: Number)

      /**
       * @param querySingleAlwaysOnNode Cleans and recreates table metadata information on the
       * replication instance when a mismatch occurs.
       * An example is a situation where running an alter DDL statement on a table might result in
       * different information about the table cached in the replication instance.
       */
      public fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: Boolean)

      /**
       * @param querySingleAlwaysOnNode Cleans and recreates table metadata information on the
       * replication instance when a mismatch occurs.
       * An example is a situation where running an alter DDL statement on a table might result in
       * different information about the table cached in the replication instance.
       */
      public fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: IResolvable)

      /**
       * @param readBackupOnly When this attribute is set to `Y` , AWS DMS only reads changes from
       * transaction log backups and doesn't read from the active transaction log file during ongoing
       * replication.
       * Setting this parameter to `Y` enables you to control active transaction log file growth
       * during full load and ongoing replication tasks. However, it can add some source latency to
       * ongoing replication.
       */
      public fun readBackupOnly(readBackupOnly: Boolean)

      /**
       * @param readBackupOnly When this attribute is set to `Y` , AWS DMS only reads changes from
       * transaction log backups and doesn't read from the active transaction log file during ongoing
       * replication.
       * Setting this parameter to `Y` enables you to control active transaction log file growth
       * during full load and ongoing replication tasks. However, it can add some source latency to
       * ongoing replication.
       */
      public fun readBackupOnly(readBackupOnly: IResolvable)

      /**
       * @param safeguardPolicy Use this attribute to minimize the need to access the backup log and
       * enable AWS DMS to prevent truncation using one of the following two methods.
       * *Start transactions in the database:* This is the default method. When this method is used,
       * AWS DMS prevents TLOG truncation by mimicking a transaction in the database. As long as such a
       * transaction is open, changes that appear after the transaction started aren't truncated. If
       * you need Microsoft Replication to be enabled in your database, then you must choose this
       * method.
       *
       * *Exclusively use sp_repldone within a single task* : When this method is used, AWS DMS
       * reads the changes and then uses sp_repldone to mark the TLOG transactions as ready for
       * truncation. Although this method doesn't involve any transactional activities, it can only be
       * used when Microsoft Replication isn't running. Also, when using this method, only one AWS DMS
       * task can access the database at any given time. Therefore, if you need to run parallel AWS DMS
       * tasks against the same database, use the default method.
       */
      public fun safeguardPolicy(safeguardPolicy: String)

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the SQL Server endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the MicrosoftSQLServer endpoint connection details.
       */
      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      /**
       * @param serverName Fully qualified domain name of the endpoint.
       * For an Amazon RDS SQL Server instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
       */
      public fun serverName(serverName: String)

      /**
       * @param tlogAccessMode Indicates the mode used to fetch CDC data.
       */
      public fun tlogAccessMode(tlogAccessMode: String)

      /**
       * @param trimSpaceInChar Use the `TrimSpaceInChar` source endpoint setting to right-trim data
       * on CHAR and NCHAR data types during migration.
       * Setting `TrimSpaceInChar` does not left-trim data. The default value is `true` .
       */
      public fun trimSpaceInChar(trimSpaceInChar: Boolean)

      /**
       * @param trimSpaceInChar Use the `TrimSpaceInChar` source endpoint setting to right-trim data
       * on CHAR and NCHAR data types during migration.
       * Setting `TrimSpaceInChar` does not left-trim data. The default value is `true` .
       */
      public fun trimSpaceInChar(trimSpaceInChar: IResolvable)

      /**
       * @param useBcpFullLoad Use this to attribute to transfer data for full-load operations using
       * BCP.
       * When the target table contains an identity column that does not exist in the source table,
       * you must disable the use BCP for loading table option.
       */
      public fun useBcpFullLoad(useBcpFullLoad: Boolean)

      /**
       * @param useBcpFullLoad Use this to attribute to transfer data for full-load operations using
       * BCP.
       * When the target table contains an identity column that does not exist in the source table,
       * you must disable the use BCP for loading table option.
       */
      public fun useBcpFullLoad(useBcpFullLoad: IResolvable)

      /**
       * @param useThirdPartyBackupDevice When this attribute is set to `Y` , DMS processes
       * third-party transaction log backups if they are created in native format.
       */
      public fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: Boolean)

      /**
       * @param useThirdPartyBackupDevice When this attribute is set to `Y` , DMS processes
       * third-party transaction log backups if they are created in native format.
       */
      public fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: IResolvable)

      /**
       * @param username Endpoint connection user name.
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty.Builder
          =
          software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty.builder()

      /**
       * @param bcpPacketSize The maximum size of the packets (in bytes) used to transfer data using
       * BCP.
       */
      override fun bcpPacketSize(bcpPacketSize: Number) {
        cdkBuilder.bcpPacketSize(bcpPacketSize)
      }

      /**
       * @param controlTablesFileGroup Specifies a file group for the AWS DMS internal tables.
       * When the replication task starts, all the internal AWS DMS control tables (awsdms_
       * apply_exception, awsdms_apply, awsdms_changes) are created for the specified file group.
       */
      override fun controlTablesFileGroup(controlTablesFileGroup: String) {
        cdkBuilder.controlTablesFileGroup(controlTablesFileGroup)
      }

      /**
       * @param databaseName Database name for the endpoint.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param forceLobLookup Forces LOB lookup on inline LOB.
       */
      override fun forceLobLookup(forceLobLookup: Boolean) {
        cdkBuilder.forceLobLookup(forceLobLookup)
      }

      /**
       * @param forceLobLookup Forces LOB lookup on inline LOB.
       */
      override fun forceLobLookup(forceLobLookup: IResolvable) {
        cdkBuilder.forceLobLookup(forceLobLookup.let(IResolvable::unwrap))
      }

      /**
       * @param password Endpoint connection password.
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param port Endpoint TCP port.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param querySingleAlwaysOnNode Cleans and recreates table metadata information on the
       * replication instance when a mismatch occurs.
       * An example is a situation where running an alter DDL statement on a table might result in
       * different information about the table cached in the replication instance.
       */
      override fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: Boolean) {
        cdkBuilder.querySingleAlwaysOnNode(querySingleAlwaysOnNode)
      }

      /**
       * @param querySingleAlwaysOnNode Cleans and recreates table metadata information on the
       * replication instance when a mismatch occurs.
       * An example is a situation where running an alter DDL statement on a table might result in
       * different information about the table cached in the replication instance.
       */
      override fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: IResolvable) {
        cdkBuilder.querySingleAlwaysOnNode(querySingleAlwaysOnNode.let(IResolvable::unwrap))
      }

      /**
       * @param readBackupOnly When this attribute is set to `Y` , AWS DMS only reads changes from
       * transaction log backups and doesn't read from the active transaction log file during ongoing
       * replication.
       * Setting this parameter to `Y` enables you to control active transaction log file growth
       * during full load and ongoing replication tasks. However, it can add some source latency to
       * ongoing replication.
       */
      override fun readBackupOnly(readBackupOnly: Boolean) {
        cdkBuilder.readBackupOnly(readBackupOnly)
      }

      /**
       * @param readBackupOnly When this attribute is set to `Y` , AWS DMS only reads changes from
       * transaction log backups and doesn't read from the active transaction log file during ongoing
       * replication.
       * Setting this parameter to `Y` enables you to control active transaction log file growth
       * during full load and ongoing replication tasks. However, it can add some source latency to
       * ongoing replication.
       */
      override fun readBackupOnly(readBackupOnly: IResolvable) {
        cdkBuilder.readBackupOnly(readBackupOnly.let(IResolvable::unwrap))
      }

      /**
       * @param safeguardPolicy Use this attribute to minimize the need to access the backup log and
       * enable AWS DMS to prevent truncation using one of the following two methods.
       * *Start transactions in the database:* This is the default method. When this method is used,
       * AWS DMS prevents TLOG truncation by mimicking a transaction in the database. As long as such a
       * transaction is open, changes that appear after the transaction started aren't truncated. If
       * you need Microsoft Replication to be enabled in your database, then you must choose this
       * method.
       *
       * *Exclusively use sp_repldone within a single task* : When this method is used, AWS DMS
       * reads the changes and then uses sp_repldone to mark the TLOG transactions as ready for
       * truncation. Although this method doesn't involve any transactional activities, it can only be
       * used when Microsoft Replication isn't running. Also, when using this method, only one AWS DMS
       * task can access the database at any given time. Therefore, if you need to run parallel AWS DMS
       * tasks against the same database, use the default method.
       */
      override fun safeguardPolicy(safeguardPolicy: String) {
        cdkBuilder.safeguardPolicy(safeguardPolicy)
      }

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the SQL Server endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the MicrosoftSQLServer endpoint connection details.
       */
      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      /**
       * @param serverName Fully qualified domain name of the endpoint.
       * For an Amazon RDS SQL Server instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
       */
      override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

      /**
       * @param tlogAccessMode Indicates the mode used to fetch CDC data.
       */
      override fun tlogAccessMode(tlogAccessMode: String) {
        cdkBuilder.tlogAccessMode(tlogAccessMode)
      }

      /**
       * @param trimSpaceInChar Use the `TrimSpaceInChar` source endpoint setting to right-trim data
       * on CHAR and NCHAR data types during migration.
       * Setting `TrimSpaceInChar` does not left-trim data. The default value is `true` .
       */
      override fun trimSpaceInChar(trimSpaceInChar: Boolean) {
        cdkBuilder.trimSpaceInChar(trimSpaceInChar)
      }

      /**
       * @param trimSpaceInChar Use the `TrimSpaceInChar` source endpoint setting to right-trim data
       * on CHAR and NCHAR data types during migration.
       * Setting `TrimSpaceInChar` does not left-trim data. The default value is `true` .
       */
      override fun trimSpaceInChar(trimSpaceInChar: IResolvable) {
        cdkBuilder.trimSpaceInChar(trimSpaceInChar.let(IResolvable::unwrap))
      }

      /**
       * @param useBcpFullLoad Use this to attribute to transfer data for full-load operations using
       * BCP.
       * When the target table contains an identity column that does not exist in the source table,
       * you must disable the use BCP for loading table option.
       */
      override fun useBcpFullLoad(useBcpFullLoad: Boolean) {
        cdkBuilder.useBcpFullLoad(useBcpFullLoad)
      }

      /**
       * @param useBcpFullLoad Use this to attribute to transfer data for full-load operations using
       * BCP.
       * When the target table contains an identity column that does not exist in the source table,
       * you must disable the use BCP for loading table option.
       */
      override fun useBcpFullLoad(useBcpFullLoad: IResolvable) {
        cdkBuilder.useBcpFullLoad(useBcpFullLoad.let(IResolvable::unwrap))
      }

      /**
       * @param useThirdPartyBackupDevice When this attribute is set to `Y` , DMS processes
       * third-party transaction log backups if they are created in native format.
       */
      override fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: Boolean) {
        cdkBuilder.useThirdPartyBackupDevice(useThirdPartyBackupDevice)
      }

      /**
       * @param useThirdPartyBackupDevice When this attribute is set to `Y` , DMS processes
       * third-party transaction log backups if they are created in native format.
       */
      override fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: IResolvable) {
        cdkBuilder.useThirdPartyBackupDevice(useThirdPartyBackupDevice.let(IResolvable::unwrap))
      }

      /**
       * @param username Endpoint connection user name.
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty,
    ) : CdkObject(cdkObject), MicrosoftSqlServerSettingsProperty {
      /**
       * The maximum size of the packets (in bytes) used to transfer data using BCP.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-bcppacketsize)
       */
      override fun bcpPacketSize(): Number? = unwrap(this).getBcpPacketSize()

      /**
       * Specifies a file group for the AWS DMS internal tables.
       *
       * When the replication task starts, all the internal AWS DMS control tables (awsdms_
       * apply_exception, awsdms_apply, awsdms_changes) are created for the specified file group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-controltablesfilegroup)
       */
      override fun controlTablesFileGroup(): String? = unwrap(this).getControlTablesFileGroup()

      /**
       * Database name for the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * Forces LOB lookup on inline LOB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-forceloblookup)
       */
      override fun forceLobLookup(): Any? = unwrap(this).getForceLobLookup()

      /**
       * Endpoint connection password.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-password)
       */
      override fun password(): String? = unwrap(this).getPassword()

      /**
       * Endpoint TCP port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * Cleans and recreates table metadata information on the replication instance when a mismatch
       * occurs.
       *
       * An example is a situation where running an alter DDL statement on a table might result in
       * different information about the table cached in the replication instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-querysinglealwaysonnode)
       */
      override fun querySingleAlwaysOnNode(): Any? = unwrap(this).getQuerySingleAlwaysOnNode()

      /**
       * When this attribute is set to `Y` , AWS DMS only reads changes from transaction log backups
       * and doesn't read from the active transaction log file during ongoing replication.
       *
       * Setting this parameter to `Y` enables you to control active transaction log file growth
       * during full load and ongoing replication tasks. However, it can add some source latency to
       * ongoing replication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-readbackuponly)
       */
      override fun readBackupOnly(): Any? = unwrap(this).getReadBackupOnly()

      /**
       * Use this attribute to minimize the need to access the backup log and enable AWS DMS to
       * prevent truncation using one of the following two methods.
       *
       * *Start transactions in the database:* This is the default method. When this method is used,
       * AWS DMS prevents TLOG truncation by mimicking a transaction in the database. As long as such a
       * transaction is open, changes that appear after the transaction started aren't truncated. If
       * you need Microsoft Replication to be enabled in your database, then you must choose this
       * method.
       *
       * *Exclusively use sp_repldone within a single task* : When this method is used, AWS DMS
       * reads the changes and then uses sp_repldone to mark the TLOG transactions as ready for
       * truncation. Although this method doesn't involve any transactional activities, it can only be
       * used when Microsoft Replication isn't running. Also, when using this method, only one AWS DMS
       * task can access the database at any given time. Therefore, if you need to run parallel AWS DMS
       * tasks against the same database, use the default method.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-safeguardpolicy)
       */
      override fun safeguardPolicy(): String? = unwrap(this).getSafeguardPolicy()

      /**
       * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
       * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
       *
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the SQL Server endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-secretsmanageraccessrolearn)
       */
      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      /**
       * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
       * MicrosoftSQLServer endpoint connection details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-secretsmanagersecretid)
       */
      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      /**
       * Fully qualified domain name of the endpoint.
       *
       * For an Amazon RDS SQL Server instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-servername)
       */
      override fun serverName(): String? = unwrap(this).getServerName()

      /**
       * Indicates the mode used to fetch CDC data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-tlogaccessmode)
       */
      override fun tlogAccessMode(): String? = unwrap(this).getTlogAccessMode()

      /**
       * Use the `TrimSpaceInChar` source endpoint setting to right-trim data on CHAR and NCHAR data
       * types during migration.
       *
       * Setting `TrimSpaceInChar` does not left-trim data. The default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-trimspaceinchar)
       */
      override fun trimSpaceInChar(): Any? = unwrap(this).getTrimSpaceInChar()

      /**
       * Use this to attribute to transfer data for full-load operations using BCP.
       *
       * When the target table contains an identity column that does not exist in the source table,
       * you must disable the use BCP for loading table option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-usebcpfullload)
       */
      override fun useBcpFullLoad(): Any? = unwrap(this).getUseBcpFullLoad()

      /**
       * When this attribute is set to `Y` , DMS processes third-party transaction log backups if
       * they are created in native format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-usethirdpartybackupdevice)
       */
      override fun useThirdPartyBackupDevice(): Any? = unwrap(this).getUseThirdPartyBackupDevice()

      /**
       * Endpoint connection user name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-microsoftsqlserversettings.html#cfn-dms-endpoint-microsoftsqlserversettings-username)
       */
      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MicrosoftSqlServerSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty):
          MicrosoftSqlServerSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MicrosoftSqlServerSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty
    }
  }

  public interface IbmDb2SettingsProperty {
    /**
     * For ongoing replication (CDC), use CurrentLSN to specify a log sequence number (LSN) where
     * you want the replication to start.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-currentlsn)
     */
    public fun currentLsn(): String? = unwrap(this).getCurrentLsn()

    /**
     * If true, AWS DMS saves any .csv files to the Db2 LUW target that were used to replicate data.
     * DMS uses these files for analysis and troubleshooting.
     *
     * The default value is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-keepcsvfiles)
     */
    public fun keepCsvFiles(): Any? = unwrap(this).getKeepCsvFiles()

    /**
     * The amount of time (in milliseconds) before AWS DMS times out operations performed by DMS on
     * the Db2 target.
     *
     * The default value is 1200 (20 minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-loadtimeout)
     */
    public fun loadTimeout(): Number? = unwrap(this).getLoadTimeout()

    /**
     * Specifies the maximum size (in KB) of .csv files used to transfer data to Db2 LUW.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-maxfilesize)
     */
    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    /**
     * Maximum number of bytes per read, as a NUMBER value.
     *
     * The default is 64 KB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-maxkbytesperread)
     */
    public fun maxKBytesPerRead(): Number? = unwrap(this).getMaxKBytesPerRead()

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
     * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
     *
     * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value ofthe AWS
     * Secrets Manager secret that allows access to the Db2 LUW endpoint.
     *
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
     * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
     *
     * For more information on creating this `SecretsManagerSecret` , the corresponding
     * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access it,
     * see [Using secrets to access AWS Database Migration Service
     * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-secretsmanageraccessrolearn)
     */
    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    /**
     * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
     * IBMDB2 endpoint connection details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-secretsmanagersecretid)
     */
    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    /**
     * Enables ongoing replication (CDC) as a BOOLEAN value.
     *
     * The default is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-setdatacapturechanges)
     */
    public fun setDataCaptureChanges(): Any? = unwrap(this).getSetDataCaptureChanges()

    /**
     * The size (in KB) of the in-memory file write buffer used when generating .csv files on the
     * local disk on the DMS replication instance. The default value is 1024 (1 MB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-writebuffersize)
     */
    public fun writeBufferSize(): Number? = unwrap(this).getWriteBufferSize()

    /**
     * A builder for [IbmDb2SettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param currentLsn For ongoing replication (CDC), use CurrentLSN to specify a log sequence
       * number (LSN) where you want the replication to start.
       */
      public fun currentLsn(currentLsn: String)

      /**
       * @param setDataCaptureChanges Enables ongoing replication (CDC) as a BOOLEAN value.
       * The default is true.
       */
      public fun dataCaptureChanges(setDataCaptureChanges: Boolean)

      /**
       * @param setDataCaptureChanges Enables ongoing replication (CDC) as a BOOLEAN value.
       * The default is true.
       */
      public fun dataCaptureChanges(setDataCaptureChanges: IResolvable)

      /**
       * @param keepCsvFiles If true, AWS DMS saves any .csv files to the Db2 LUW target that were
       * used to replicate data. DMS uses these files for analysis and troubleshooting.
       * The default value is false.
       */
      public fun keepCsvFiles(keepCsvFiles: Boolean)

      /**
       * @param keepCsvFiles If true, AWS DMS saves any .csv files to the Db2 LUW target that were
       * used to replicate data. DMS uses these files for analysis and troubleshooting.
       * The default value is false.
       */
      public fun keepCsvFiles(keepCsvFiles: IResolvable)

      /**
       * @param loadTimeout The amount of time (in milliseconds) before AWS DMS times out operations
       * performed by DMS on the Db2 target.
       * The default value is 1200 (20 minutes).
       */
      public fun loadTimeout(loadTimeout: Number)

      /**
       * @param maxFileSize Specifies the maximum size (in KB) of .csv files used to transfer data
       * to Db2 LUW.
       */
      public fun maxFileSize(maxFileSize: Number)

      /**
       * @param maxKBytesPerRead Maximum number of bytes per read, as a NUMBER value.
       * The default is 64 KB.
       */
      public fun maxKBytesPerRead(maxKBytesPerRead: Number)

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value ofthe
       * AWS Secrets Manager secret that allows access to the Db2 LUW endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the IBMDB2 endpoint connection details.
       */
      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      /**
       * @param writeBufferSize The size (in KB) of the in-memory file write buffer used when
       * generating .csv files on the local disk on the DMS replication instance. The default value is
       * 1024 (1 MB).
       */
      public fun writeBufferSize(writeBufferSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty.builder()

      /**
       * @param currentLsn For ongoing replication (CDC), use CurrentLSN to specify a log sequence
       * number (LSN) where you want the replication to start.
       */
      override fun currentLsn(currentLsn: String) {
        cdkBuilder.currentLsn(currentLsn)
      }

      /**
       * @param setDataCaptureChanges Enables ongoing replication (CDC) as a BOOLEAN value.
       * The default is true.
       */
      override fun dataCaptureChanges(setDataCaptureChanges: Boolean) {
        cdkBuilder.setDataCaptureChanges(setDataCaptureChanges)
      }

      /**
       * @param setDataCaptureChanges Enables ongoing replication (CDC) as a BOOLEAN value.
       * The default is true.
       */
      override fun dataCaptureChanges(setDataCaptureChanges: IResolvable) {
        cdkBuilder.setDataCaptureChanges(setDataCaptureChanges.let(IResolvable::unwrap))
      }

      /**
       * @param keepCsvFiles If true, AWS DMS saves any .csv files to the Db2 LUW target that were
       * used to replicate data. DMS uses these files for analysis and troubleshooting.
       * The default value is false.
       */
      override fun keepCsvFiles(keepCsvFiles: Boolean) {
        cdkBuilder.keepCsvFiles(keepCsvFiles)
      }

      /**
       * @param keepCsvFiles If true, AWS DMS saves any .csv files to the Db2 LUW target that were
       * used to replicate data. DMS uses these files for analysis and troubleshooting.
       * The default value is false.
       */
      override fun keepCsvFiles(keepCsvFiles: IResolvable) {
        cdkBuilder.keepCsvFiles(keepCsvFiles.let(IResolvable::unwrap))
      }

      /**
       * @param loadTimeout The amount of time (in milliseconds) before AWS DMS times out operations
       * performed by DMS on the Db2 target.
       * The default value is 1200 (20 minutes).
       */
      override fun loadTimeout(loadTimeout: Number) {
        cdkBuilder.loadTimeout(loadTimeout)
      }

      /**
       * @param maxFileSize Specifies the maximum size (in KB) of .csv files used to transfer data
       * to Db2 LUW.
       */
      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      /**
       * @param maxKBytesPerRead Maximum number of bytes per read, as a NUMBER value.
       * The default is 64 KB.
       */
      override fun maxKBytesPerRead(maxKBytesPerRead: Number) {
        cdkBuilder.maxKBytesPerRead(maxKBytesPerRead)
      }

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value ofthe
       * AWS Secrets Manager secret that allows access to the Db2 LUW endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the IBMDB2 endpoint connection details.
       */
      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      /**
       * @param writeBufferSize The size (in KB) of the in-memory file write buffer used when
       * generating .csv files on the local disk on the DMS replication instance. The default value is
       * 1024 (1 MB).
       */
      override fun writeBufferSize(writeBufferSize: Number) {
        cdkBuilder.writeBufferSize(writeBufferSize)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty,
    ) : CdkObject(cdkObject), IbmDb2SettingsProperty {
      /**
       * For ongoing replication (CDC), use CurrentLSN to specify a log sequence number (LSN) where
       * you want the replication to start.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-currentlsn)
       */
      override fun currentLsn(): String? = unwrap(this).getCurrentLsn()

      /**
       * If true, AWS DMS saves any .csv files to the Db2 LUW target that were used to replicate
       * data. DMS uses these files for analysis and troubleshooting.
       *
       * The default value is false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-keepcsvfiles)
       */
      override fun keepCsvFiles(): Any? = unwrap(this).getKeepCsvFiles()

      /**
       * The amount of time (in milliseconds) before AWS DMS times out operations performed by DMS
       * on the Db2 target.
       *
       * The default value is 1200 (20 minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-loadtimeout)
       */
      override fun loadTimeout(): Number? = unwrap(this).getLoadTimeout()

      /**
       * Specifies the maximum size (in KB) of .csv files used to transfer data to Db2 LUW.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-maxfilesize)
       */
      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      /**
       * Maximum number of bytes per read, as a NUMBER value.
       *
       * The default is 64 KB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-maxkbytesperread)
       */
      override fun maxKBytesPerRead(): Number? = unwrap(this).getMaxKBytesPerRead()

      /**
       * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
       * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
       *
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value ofthe
       * AWS Secrets Manager secret that allows access to the Db2 LUW endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-secretsmanageraccessrolearn)
       */
      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      /**
       * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
       * IBMDB2 endpoint connection details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-secretsmanagersecretid)
       */
      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      /**
       * Enables ongoing replication (CDC) as a BOOLEAN value.
       *
       * The default is true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-setdatacapturechanges)
       */
      override fun setDataCaptureChanges(): Any? = unwrap(this).getSetDataCaptureChanges()

      /**
       * The size (in KB) of the in-memory file write buffer used when generating .csv files on the
       * local disk on the DMS replication instance. The default value is 1024 (1 MB).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-ibmdb2settings.html#cfn-dms-endpoint-ibmdb2settings-writebuffersize)
       */
      override fun writeBufferSize(): Number? = unwrap(this).getWriteBufferSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IbmDb2SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty):
          IbmDb2SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IbmDb2SettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty
    }
  }

  public interface DocDbSettingsProperty {
    /**
     * Indicates the number of documents to preview to determine the document organization.
     *
     * Use this setting when `NestingLevel` is set to `"one"` .
     *
     * Must be a positive value greater than `0` . Default value is `1000` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-docdbsettings.html#cfn-dms-endpoint-docdbsettings-docstoinvestigate)
     */
    public fun docsToInvestigate(): Number? = unwrap(this).getDocsToInvestigate()

    /**
     * Specifies the document ID. Use this setting when `NestingLevel` is set to `"none"` .
     *
     * Default value is `"false"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-docdbsettings.html#cfn-dms-endpoint-docdbsettings-extractdocid)
     */
    public fun extractDocId(): Any? = unwrap(this).getExtractDocId()

    /**
     * Specifies either document or table mode.
     *
     * Default value is `"none"` . Specify `"none"` to use document mode. Specify `"one"` to use
     * table mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-docdbsettings.html#cfn-dms-endpoint-docdbsettings-nestinglevel)
     */
    public fun nestingLevel(): String? = unwrap(this).getNestingLevel()

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
     * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
     *
     * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
     * AWS Secrets Manager secret that allows access to the DocumentDB endpoint.
     *
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
     * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
     *
     * For more information on creating this `SecretsManagerSecret` , the corresponding
     * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access it,
     * see [Using secrets to access AWS Database Migration Service
     * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-docdbsettings.html#cfn-dms-endpoint-docdbsettings-secretsmanageraccessrolearn)
     */
    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    /**
     * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
     * DocumentDB endpoint connection details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-docdbsettings.html#cfn-dms-endpoint-docdbsettings-secretsmanagersecretid)
     */
    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    /**
     * A builder for [DocDbSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param docsToInvestigate Indicates the number of documents to preview to determine the
       * document organization.
       * Use this setting when `NestingLevel` is set to `"one"` .
       *
       * Must be a positive value greater than `0` . Default value is `1000` .
       */
      public fun docsToInvestigate(docsToInvestigate: Number)

      /**
       * @param extractDocId Specifies the document ID. Use this setting when `NestingLevel` is set
       * to `"none"` .
       * Default value is `"false"` .
       */
      public fun extractDocId(extractDocId: Boolean)

      /**
       * @param extractDocId Specifies the document ID. Use this setting when `NestingLevel` is set
       * to `"none"` .
       * Default value is `"false"` .
       */
      public fun extractDocId(extractDocId: IResolvable)

      /**
       * @param nestingLevel Specifies either document or table mode.
       * Default value is `"none"` . Specify `"none"` to use document mode. Specify `"one"` to use
       * table mode.
       */
      public fun nestingLevel(nestingLevel: String)

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the DocumentDB endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the DocumentDB endpoint connection details.
       */
      public fun secretsManagerSecretId(secretsManagerSecretId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty.builder()

      /**
       * @param docsToInvestigate Indicates the number of documents to preview to determine the
       * document organization.
       * Use this setting when `NestingLevel` is set to `"one"` .
       *
       * Must be a positive value greater than `0` . Default value is `1000` .
       */
      override fun docsToInvestigate(docsToInvestigate: Number) {
        cdkBuilder.docsToInvestigate(docsToInvestigate)
      }

      /**
       * @param extractDocId Specifies the document ID. Use this setting when `NestingLevel` is set
       * to `"none"` .
       * Default value is `"false"` .
       */
      override fun extractDocId(extractDocId: Boolean) {
        cdkBuilder.extractDocId(extractDocId)
      }

      /**
       * @param extractDocId Specifies the document ID. Use this setting when `NestingLevel` is set
       * to `"none"` .
       * Default value is `"false"` .
       */
      override fun extractDocId(extractDocId: IResolvable) {
        cdkBuilder.extractDocId(extractDocId.let(IResolvable::unwrap))
      }

      /**
       * @param nestingLevel Specifies either document or table mode.
       * Default value is `"none"` . Specify `"none"` to use document mode. Specify `"one"` to use
       * table mode.
       */
      override fun nestingLevel(nestingLevel: String) {
        cdkBuilder.nestingLevel(nestingLevel)
      }

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the DocumentDB endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the DocumentDB endpoint connection details.
       */
      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty,
    ) : CdkObject(cdkObject), DocDbSettingsProperty {
      /**
       * Indicates the number of documents to preview to determine the document organization.
       *
       * Use this setting when `NestingLevel` is set to `"one"` .
       *
       * Must be a positive value greater than `0` . Default value is `1000` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-docdbsettings.html#cfn-dms-endpoint-docdbsettings-docstoinvestigate)
       */
      override fun docsToInvestigate(): Number? = unwrap(this).getDocsToInvestigate()

      /**
       * Specifies the document ID. Use this setting when `NestingLevel` is set to `"none"` .
       *
       * Default value is `"false"` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-docdbsettings.html#cfn-dms-endpoint-docdbsettings-extractdocid)
       */
      override fun extractDocId(): Any? = unwrap(this).getExtractDocId()

      /**
       * Specifies either document or table mode.
       *
       * Default value is `"none"` . Specify `"none"` to use document mode. Specify `"one"` to use
       * table mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-docdbsettings.html#cfn-dms-endpoint-docdbsettings-nestinglevel)
       */
      override fun nestingLevel(): String? = unwrap(this).getNestingLevel()

      /**
       * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
       * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
       *
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the DocumentDB endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-docdbsettings.html#cfn-dms-endpoint-docdbsettings-secretsmanageraccessrolearn)
       */
      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      /**
       * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
       * DocumentDB endpoint connection details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-docdbsettings.html#cfn-dms-endpoint-docdbsettings-secretsmanagersecretid)
       */
      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DocDbSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty):
          DocDbSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocDbSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty
    }
  }

  public interface RedshiftSettingsProperty {
    /**
     * A value that indicates to allow any date format, including invalid formats such as 00/00/00
     * 00:00:00, to be loaded without generating an error.
     *
     * You can choose `true` or `false` (the default).
     *
     * This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the
     * DATEFORMAT parameter. If the date format for the data doesn't match the DATEFORMAT
     * specification, Amazon Redshift inserts a NULL value into that field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-acceptanydate)
     */
    public fun acceptAnyDate(): Any? = unwrap(this).getAcceptAnyDate()

    /**
     * Code to run after connecting.
     *
     * This parameter should contain the code itself, not the name of a file containing the code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-afterconnectscript)
     */
    public fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

    /**
     * An S3 folder where the comma-separated-value (.csv) files are stored before being uploaded to
     * the target Redshift cluster.
     *
     * For full load mode, AWS DMS converts source records into .csv files and loads them to the
     * *BucketFolder/TableID* path. AWS DMS uses the Redshift `COPY` command to upload the .csv files
     * to the target table. The files are deleted once the `COPY` operation has finished. For more
     * information, see [COPY](https://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html) in the
     * *Amazon Redshift Database Developer Guide* .
     *
     * For change-data-capture (CDC) mode, AWS DMS creates a *NetChanges* table, and loads the .csv
     * files to this *BucketFolder/NetChangesTableID* path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-bucketfolder)
     */
    public fun bucketFolder(): String? = unwrap(this).getBucketFolder()

    /**
     * The name of the intermediate S3 bucket used to store .csv files before uploading data to
     * Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-bucketname)
     */
    public fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * If Amazon Redshift is configured to support case sensitive schema names, set
     * `CaseSensitiveNames` to `true` .
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-casesensitivenames)
     */
    public fun caseSensitiveNames(): Any? = unwrap(this).getCaseSensitiveNames()

    /**
     * If you set `CompUpdate` to `true` Amazon Redshift applies automatic compression if the table
     * is empty.
     *
     * This applies even if the table columns already have encodings other than `RAW` . If you set
     * `CompUpdate` to `false` , automatic compression is disabled and existing column encodings aren't
     * changed. The default is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-compupdate)
     */
    public fun compUpdate(): Any? = unwrap(this).getCompUpdate()

    /**
     * A value that sets the amount of time to wait (in milliseconds) before timing out, beginning
     * from when you initially establish a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-connectiontimeout)
     */
    public fun connectionTimeout(): Number? = unwrap(this).getConnectionTimeout()

    /**
     * The date format that you are using.
     *
     * Valid values are `auto` (case-sensitive), your date format string enclosed in quotes, or
     * NULL. If this parameter is left unset (NULL), it defaults to a format of 'YYYY-MM-DD'. Using
     * `auto` recognizes most strings, even some that aren't supported when you use a date format
     * string.
     *
     * If your date and time values use formats different from each other, set this to `auto` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-dateformat)
     */
    public fun dateFormat(): String? = unwrap(this).getDateFormat()

    /**
     * A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as NULL.
     *
     * A value of `true` sets empty CHAR and VARCHAR fields to null. The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-emptyasnull)
     */
    public fun emptyAsNull(): Any? = unwrap(this).getEmptyAsNull()

    /**
     * The type of server-side encryption that you want to use for your data.
     *
     * This encryption type is part of the endpoint settings or the extra connections attributes for
     * Amazon S3. You can choose either `SSE_S3` (the default) or `SSE_KMS` .
     *
     *
     * For the `ModifyEndpoint` operation, you can change the existing value of the `EncryptionMode`
     * parameter from `SSE_KMS` to `SSE_S3` . But you can’t change the existing value from `SSE_S3` to
     * `SSE_KMS` .
     *
     *
     * To use `SSE_S3` , create an AWS Identity and Access Management (IAM) role with a policy that
     * allows `"arn:aws:s3:::*"` to use the following actions: `"s3:PutObject", "s3:ListBucket"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-encryptionmode)
     */
    public fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

    /**
     * This setting is only valid for a full-load migration task.
     *
     * Set `ExplicitIds` to `true` to have tables with `IDENTITY` columns override their
     * auto-generated values with explicit values loaded from the source data files used to populate
     * the tables. The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-explicitids)
     */
    public fun explicitIds(): Any? = unwrap(this).getExplicitIds()

    /**
     * The number of threads used to upload a single file.
     *
     * This parameter accepts a value from 1 through 64. It defaults to 10.
     *
     * The number of parallel streams used to upload a single .csv file to an S3 bucket using S3
     * Multipart Upload. For more information, see [Multipart upload
     * overview](https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html) .
     *
     * `FileTransferUploadStreams` accepts a value from 1 through 64. It defaults to 10.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-filetransferuploadstreams)
     */
    public fun fileTransferUploadStreams(): Number? = unwrap(this).getFileTransferUploadStreams()

    /**
     * The amount of time to wait (in milliseconds) before timing out of operations performed by AWS
     * DMS on a Redshift cluster, such as Redshift COPY, INSERT, DELETE, and UPDATE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-loadtimeout)
     */
    public fun loadTimeout(): Number? = unwrap(this).getLoadTimeout()

    /**
     * When true, lets Redshift migrate the boolean type as boolean.
     *
     * By default, Redshift migrates booleans as `varchar(1)` . You must set this setting on both
     * the source and target endpoints for it to take effect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-mapbooleanasboolean)
     */
    public fun mapBooleanAsBoolean(): Any? = unwrap(this).getMapBooleanAsBoolean()

    /**
     * The maximum size (in KB) of any .csv file used to load data on an S3 bucket and transfer data
     * to Amazon Redshift. It defaults to 1048576KB (1 GB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-maxfilesize)
     */
    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    /**
     * A value that specifies to remove surrounding quotation marks from strings in the incoming
     * data.
     *
     * All characters within the quotation marks, including delimiters, are retained. Choose `true`
     * to remove quotation marks. The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-removequotes)
     */
    public fun removeQuotes(): Any? = unwrap(this).getRemoveQuotes()

    /**
     * A value that specifies to replaces the invalid characters specified in `ReplaceInvalidChars`
     * , substituting the specified characters instead.
     *
     * The default is `"?"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-replacechars)
     */
    public fun replaceChars(): String? = unwrap(this).getReplaceChars()

    /**
     * A list of characters that you want to replace.
     *
     * Use with `ReplaceChars` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-replaceinvalidchars)
     */
    public fun replaceInvalidChars(): String? = unwrap(this).getReplaceInvalidChars()

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
     * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
     *
     * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
     * AWS Secrets Manager secret that allows access to the Amazon Redshift endpoint.
     *
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
     * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
     *
     * For more information on creating this `SecretsManagerSecret` , the corresponding
     * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access it,
     * see [Using secrets to access AWS Database Migration Service
     * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-secretsmanageraccessrolearn)
     */
    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    /**
     * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
     * Amazon Redshift endpoint connection details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-secretsmanagersecretid)
     */
    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    /**
     * The AWS KMS key ID.
     *
     * If you are using `SSE_KMS` for the `EncryptionMode` , provide this key ID. The key that you
     * use needs an attached policy that enables IAM user permissions and allows use of the key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-serversideencryptionkmskeyid)
     */
    public fun serverSideEncryptionKmsKeyId(): String? =
        unwrap(this).getServerSideEncryptionKmsKeyId()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that has access to the Amazon Redshift
     * service.
     *
     * The role must allow the `iam:PassRole` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-serviceaccessrolearn)
     */
    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    /**
     * The time format that you want to use.
     *
     * Valid values are `auto` (case-sensitive), `'timeformat_string'` , `'epochsecs'` , or
     * `'epochmillisecs'` . It defaults to 10. Using `auto` recognizes most strings, even some that
     * aren't supported when you use a time format string.
     *
     * If your date and time values use formats different from each other, set this parameter to
     * `auto` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-timeformat)
     */
    public fun timeFormat(): String? = unwrap(this).getTimeFormat()

    /**
     * A value that specifies to remove the trailing white space characters from a VARCHAR string.
     *
     * This parameter applies only to columns with a VARCHAR data type. Choose `true` to remove
     * unneeded white space. The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-trimblanks)
     */
    public fun trimBlanks(): Any? = unwrap(this).getTrimBlanks()

    /**
     * A value that specifies to truncate data in columns to the appropriate number of characters,
     * so that the data fits in the column.
     *
     * This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a size
     * of 4 MB or less. Choose `true` to truncate data. The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-truncatecolumns)
     */
    public fun truncateColumns(): Any? = unwrap(this).getTruncateColumns()

    /**
     * The size (in KB) of the in-memory file write buffer used when generating .csv files on the
     * local disk at the DMS replication instance. The default value is 1000 (buffer size is 1000KB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-writebuffersize)
     */
    public fun writeBufferSize(): Number? = unwrap(this).getWriteBufferSize()

    /**
     * A builder for [RedshiftSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acceptAnyDate A value that indicates to allow any date format, including invalid
       * formats such as 00/00/00 00:00:00, to be loaded without generating an error.
       * You can choose `true` or `false` (the default).
       *
       * This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with
       * the DATEFORMAT parameter. If the date format for the data doesn't match the DATEFORMAT
       * specification, Amazon Redshift inserts a NULL value into that field.
       */
      public fun acceptAnyDate(acceptAnyDate: Boolean)

      /**
       * @param acceptAnyDate A value that indicates to allow any date format, including invalid
       * formats such as 00/00/00 00:00:00, to be loaded without generating an error.
       * You can choose `true` or `false` (the default).
       *
       * This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with
       * the DATEFORMAT parameter. If the date format for the data doesn't match the DATEFORMAT
       * specification, Amazon Redshift inserts a NULL value into that field.
       */
      public fun acceptAnyDate(acceptAnyDate: IResolvable)

      /**
       * @param afterConnectScript Code to run after connecting.
       * This parameter should contain the code itself, not the name of a file containing the code.
       */
      public fun afterConnectScript(afterConnectScript: String)

      /**
       * @param bucketFolder An S3 folder where the comma-separated-value (.csv) files are stored
       * before being uploaded to the target Redshift cluster.
       * For full load mode, AWS DMS converts source records into .csv files and loads them to the
       * *BucketFolder/TableID* path. AWS DMS uses the Redshift `COPY` command to upload the .csv files
       * to the target table. The files are deleted once the `COPY` operation has finished. For more
       * information, see [COPY](https://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html) in the
       * *Amazon Redshift Database Developer Guide* .
       *
       * For change-data-capture (CDC) mode, AWS DMS creates a *NetChanges* table, and loads the
       * .csv files to this *BucketFolder/NetChangesTableID* path.
       */
      public fun bucketFolder(bucketFolder: String)

      /**
       * @param bucketName The name of the intermediate S3 bucket used to store .csv files before
       * uploading data to Redshift.
       */
      public fun bucketName(bucketName: String)

      /**
       * @param caseSensitiveNames If Amazon Redshift is configured to support case sensitive schema
       * names, set `CaseSensitiveNames` to `true` .
       * The default is `false` .
       */
      public fun caseSensitiveNames(caseSensitiveNames: Boolean)

      /**
       * @param caseSensitiveNames If Amazon Redshift is configured to support case sensitive schema
       * names, set `CaseSensitiveNames` to `true` .
       * The default is `false` .
       */
      public fun caseSensitiveNames(caseSensitiveNames: IResolvable)

      /**
       * @param compUpdate If you set `CompUpdate` to `true` Amazon Redshift applies automatic
       * compression if the table is empty.
       * This applies even if the table columns already have encodings other than `RAW` . If you set
       * `CompUpdate` to `false` , automatic compression is disabled and existing column encodings
       * aren't changed. The default is `true` .
       */
      public fun compUpdate(compUpdate: Boolean)

      /**
       * @param compUpdate If you set `CompUpdate` to `true` Amazon Redshift applies automatic
       * compression if the table is empty.
       * This applies even if the table columns already have encodings other than `RAW` . If you set
       * `CompUpdate` to `false` , automatic compression is disabled and existing column encodings
       * aren't changed. The default is `true` .
       */
      public fun compUpdate(compUpdate: IResolvable)

      /**
       * @param connectionTimeout A value that sets the amount of time to wait (in milliseconds)
       * before timing out, beginning from when you initially establish a connection.
       */
      public fun connectionTimeout(connectionTimeout: Number)

      /**
       * @param dateFormat The date format that you are using.
       * Valid values are `auto` (case-sensitive), your date format string enclosed in quotes, or
       * NULL. If this parameter is left unset (NULL), it defaults to a format of 'YYYY-MM-DD'. Using
       * `auto` recognizes most strings, even some that aren't supported when you use a date format
       * string.
       *
       * If your date and time values use formats different from each other, set this to `auto` .
       */
      public fun dateFormat(dateFormat: String)

      /**
       * @param emptyAsNull A value that specifies whether AWS DMS should migrate empty CHAR and
       * VARCHAR fields as NULL.
       * A value of `true` sets empty CHAR and VARCHAR fields to null. The default is `false` .
       */
      public fun emptyAsNull(emptyAsNull: Boolean)

      /**
       * @param emptyAsNull A value that specifies whether AWS DMS should migrate empty CHAR and
       * VARCHAR fields as NULL.
       * A value of `true` sets empty CHAR and VARCHAR fields to null. The default is `false` .
       */
      public fun emptyAsNull(emptyAsNull: IResolvable)

      /**
       * @param encryptionMode The type of server-side encryption that you want to use for your
       * data.
       * This encryption type is part of the endpoint settings or the extra connections attributes
       * for Amazon S3. You can choose either `SSE_S3` (the default) or `SSE_KMS` .
       *
       *
       * For the `ModifyEndpoint` operation, you can change the existing value of the
       * `EncryptionMode` parameter from `SSE_KMS` to `SSE_S3` . But you can’t change the existing
       * value from `SSE_S3` to `SSE_KMS` .
       *
       *
       * To use `SSE_S3` , create an AWS Identity and Access Management (IAM) role with a policy
       * that allows `"arn:aws:s3:::*"` to use the following actions: `"s3:PutObject", "s3:ListBucket"`
       */
      public fun encryptionMode(encryptionMode: String)

      /**
       * @param explicitIds This setting is only valid for a full-load migration task.
       * Set `ExplicitIds` to `true` to have tables with `IDENTITY` columns override their
       * auto-generated values with explicit values loaded from the source data files used to populate
       * the tables. The default is `false` .
       */
      public fun explicitIds(explicitIds: Boolean)

      /**
       * @param explicitIds This setting is only valid for a full-load migration task.
       * Set `ExplicitIds` to `true` to have tables with `IDENTITY` columns override their
       * auto-generated values with explicit values loaded from the source data files used to populate
       * the tables. The default is `false` .
       */
      public fun explicitIds(explicitIds: IResolvable)

      /**
       * @param fileTransferUploadStreams The number of threads used to upload a single file.
       * This parameter accepts a value from 1 through 64. It defaults to 10.
       *
       * The number of parallel streams used to upload a single .csv file to an S3 bucket using S3
       * Multipart Upload. For more information, see [Multipart upload
       * overview](https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html) .
       *
       * `FileTransferUploadStreams` accepts a value from 1 through 64. It defaults to 10.
       */
      public fun fileTransferUploadStreams(fileTransferUploadStreams: Number)

      /**
       * @param loadTimeout The amount of time to wait (in milliseconds) before timing out of
       * operations performed by AWS DMS on a Redshift cluster, such as Redshift COPY, INSERT, DELETE,
       * and UPDATE.
       */
      public fun loadTimeout(loadTimeout: Number)

      /**
       * @param mapBooleanAsBoolean When true, lets Redshift migrate the boolean type as boolean.
       * By default, Redshift migrates booleans as `varchar(1)` . You must set this setting on both
       * the source and target endpoints for it to take effect.
       */
      public fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean)

      /**
       * @param mapBooleanAsBoolean When true, lets Redshift migrate the boolean type as boolean.
       * By default, Redshift migrates booleans as `varchar(1)` . You must set this setting on both
       * the source and target endpoints for it to take effect.
       */
      public fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable)

      /**
       * @param maxFileSize The maximum size (in KB) of any .csv file used to load data on an S3
       * bucket and transfer data to Amazon Redshift. It defaults to 1048576KB (1 GB).
       */
      public fun maxFileSize(maxFileSize: Number)

      /**
       * @param removeQuotes A value that specifies to remove surrounding quotation marks from
       * strings in the incoming data.
       * All characters within the quotation marks, including delimiters, are retained. Choose
       * `true` to remove quotation marks. The default is `false` .
       */
      public fun removeQuotes(removeQuotes: Boolean)

      /**
       * @param removeQuotes A value that specifies to remove surrounding quotation marks from
       * strings in the incoming data.
       * All characters within the quotation marks, including delimiters, are retained. Choose
       * `true` to remove quotation marks. The default is `false` .
       */
      public fun removeQuotes(removeQuotes: IResolvable)

      /**
       * @param replaceChars A value that specifies to replaces the invalid characters specified in
       * `ReplaceInvalidChars` , substituting the specified characters instead.
       * The default is `"?"` .
       */
      public fun replaceChars(replaceChars: String)

      /**
       * @param replaceInvalidChars A list of characters that you want to replace.
       * Use with `ReplaceChars` .
       */
      public fun replaceInvalidChars(replaceInvalidChars: String)

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the Amazon Redshift endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the Amazon Redshift endpoint connection details.
       */
      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      /**
       * @param serverSideEncryptionKmsKeyId The AWS KMS key ID.
       * If you are using `SSE_KMS` for the `EncryptionMode` , provide this key ID. The key that you
       * use needs an attached policy that enables IAM user permissions and allows use of the key.
       */
      public fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String)

      /**
       * @param serviceAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that has access
       * to the Amazon Redshift service.
       * The role must allow the `iam:PassRole` action.
       */
      public fun serviceAccessRoleArn(serviceAccessRoleArn: String)

      /**
       * @param timeFormat The time format that you want to use.
       * Valid values are `auto` (case-sensitive), `'timeformat_string'` , `'epochsecs'` , or
       * `'epochmillisecs'` . It defaults to 10. Using `auto` recognizes most strings, even some that
       * aren't supported when you use a time format string.
       *
       * If your date and time values use formats different from each other, set this parameter to
       * `auto` .
       */
      public fun timeFormat(timeFormat: String)

      /**
       * @param trimBlanks A value that specifies to remove the trailing white space characters from
       * a VARCHAR string.
       * This parameter applies only to columns with a VARCHAR data type. Choose `true` to remove
       * unneeded white space. The default is `false` .
       */
      public fun trimBlanks(trimBlanks: Boolean)

      /**
       * @param trimBlanks A value that specifies to remove the trailing white space characters from
       * a VARCHAR string.
       * This parameter applies only to columns with a VARCHAR data type. Choose `true` to remove
       * unneeded white space. The default is `false` .
       */
      public fun trimBlanks(trimBlanks: IResolvable)

      /**
       * @param truncateColumns A value that specifies to truncate data in columns to the
       * appropriate number of characters, so that the data fits in the column.
       * This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a
       * size of 4 MB or less. Choose `true` to truncate data. The default is `false` .
       */
      public fun truncateColumns(truncateColumns: Boolean)

      /**
       * @param truncateColumns A value that specifies to truncate data in columns to the
       * appropriate number of characters, so that the data fits in the column.
       * This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a
       * size of 4 MB or less. Choose `true` to truncate data. The default is `false` .
       */
      public fun truncateColumns(truncateColumns: IResolvable)

      /**
       * @param writeBufferSize The size (in KB) of the in-memory file write buffer used when
       * generating .csv files on the local disk at the DMS replication instance. The default value is
       * 1000 (buffer size is 1000KB).
       */
      public fun writeBufferSize(writeBufferSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty.builder()

      /**
       * @param acceptAnyDate A value that indicates to allow any date format, including invalid
       * formats such as 00/00/00 00:00:00, to be loaded without generating an error.
       * You can choose `true` or `false` (the default).
       *
       * This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with
       * the DATEFORMAT parameter. If the date format for the data doesn't match the DATEFORMAT
       * specification, Amazon Redshift inserts a NULL value into that field.
       */
      override fun acceptAnyDate(acceptAnyDate: Boolean) {
        cdkBuilder.acceptAnyDate(acceptAnyDate)
      }

      /**
       * @param acceptAnyDate A value that indicates to allow any date format, including invalid
       * formats such as 00/00/00 00:00:00, to be loaded without generating an error.
       * You can choose `true` or `false` (the default).
       *
       * This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with
       * the DATEFORMAT parameter. If the date format for the data doesn't match the DATEFORMAT
       * specification, Amazon Redshift inserts a NULL value into that field.
       */
      override fun acceptAnyDate(acceptAnyDate: IResolvable) {
        cdkBuilder.acceptAnyDate(acceptAnyDate.let(IResolvable::unwrap))
      }

      /**
       * @param afterConnectScript Code to run after connecting.
       * This parameter should contain the code itself, not the name of a file containing the code.
       */
      override fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
      }

      /**
       * @param bucketFolder An S3 folder where the comma-separated-value (.csv) files are stored
       * before being uploaded to the target Redshift cluster.
       * For full load mode, AWS DMS converts source records into .csv files and loads them to the
       * *BucketFolder/TableID* path. AWS DMS uses the Redshift `COPY` command to upload the .csv files
       * to the target table. The files are deleted once the `COPY` operation has finished. For more
       * information, see [COPY](https://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html) in the
       * *Amazon Redshift Database Developer Guide* .
       *
       * For change-data-capture (CDC) mode, AWS DMS creates a *NetChanges* table, and loads the
       * .csv files to this *BucketFolder/NetChangesTableID* path.
       */
      override fun bucketFolder(bucketFolder: String) {
        cdkBuilder.bucketFolder(bucketFolder)
      }

      /**
       * @param bucketName The name of the intermediate S3 bucket used to store .csv files before
       * uploading data to Redshift.
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param caseSensitiveNames If Amazon Redshift is configured to support case sensitive schema
       * names, set `CaseSensitiveNames` to `true` .
       * The default is `false` .
       */
      override fun caseSensitiveNames(caseSensitiveNames: Boolean) {
        cdkBuilder.caseSensitiveNames(caseSensitiveNames)
      }

      /**
       * @param caseSensitiveNames If Amazon Redshift is configured to support case sensitive schema
       * names, set `CaseSensitiveNames` to `true` .
       * The default is `false` .
       */
      override fun caseSensitiveNames(caseSensitiveNames: IResolvable) {
        cdkBuilder.caseSensitiveNames(caseSensitiveNames.let(IResolvable::unwrap))
      }

      /**
       * @param compUpdate If you set `CompUpdate` to `true` Amazon Redshift applies automatic
       * compression if the table is empty.
       * This applies even if the table columns already have encodings other than `RAW` . If you set
       * `CompUpdate` to `false` , automatic compression is disabled and existing column encodings
       * aren't changed. The default is `true` .
       */
      override fun compUpdate(compUpdate: Boolean) {
        cdkBuilder.compUpdate(compUpdate)
      }

      /**
       * @param compUpdate If you set `CompUpdate` to `true` Amazon Redshift applies automatic
       * compression if the table is empty.
       * This applies even if the table columns already have encodings other than `RAW` . If you set
       * `CompUpdate` to `false` , automatic compression is disabled and existing column encodings
       * aren't changed. The default is `true` .
       */
      override fun compUpdate(compUpdate: IResolvable) {
        cdkBuilder.compUpdate(compUpdate.let(IResolvable::unwrap))
      }

      /**
       * @param connectionTimeout A value that sets the amount of time to wait (in milliseconds)
       * before timing out, beginning from when you initially establish a connection.
       */
      override fun connectionTimeout(connectionTimeout: Number) {
        cdkBuilder.connectionTimeout(connectionTimeout)
      }

      /**
       * @param dateFormat The date format that you are using.
       * Valid values are `auto` (case-sensitive), your date format string enclosed in quotes, or
       * NULL. If this parameter is left unset (NULL), it defaults to a format of 'YYYY-MM-DD'. Using
       * `auto` recognizes most strings, even some that aren't supported when you use a date format
       * string.
       *
       * If your date and time values use formats different from each other, set this to `auto` .
       */
      override fun dateFormat(dateFormat: String) {
        cdkBuilder.dateFormat(dateFormat)
      }

      /**
       * @param emptyAsNull A value that specifies whether AWS DMS should migrate empty CHAR and
       * VARCHAR fields as NULL.
       * A value of `true` sets empty CHAR and VARCHAR fields to null. The default is `false` .
       */
      override fun emptyAsNull(emptyAsNull: Boolean) {
        cdkBuilder.emptyAsNull(emptyAsNull)
      }

      /**
       * @param emptyAsNull A value that specifies whether AWS DMS should migrate empty CHAR and
       * VARCHAR fields as NULL.
       * A value of `true` sets empty CHAR and VARCHAR fields to null. The default is `false` .
       */
      override fun emptyAsNull(emptyAsNull: IResolvable) {
        cdkBuilder.emptyAsNull(emptyAsNull.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionMode The type of server-side encryption that you want to use for your
       * data.
       * This encryption type is part of the endpoint settings or the extra connections attributes
       * for Amazon S3. You can choose either `SSE_S3` (the default) or `SSE_KMS` .
       *
       *
       * For the `ModifyEndpoint` operation, you can change the existing value of the
       * `EncryptionMode` parameter from `SSE_KMS` to `SSE_S3` . But you can’t change the existing
       * value from `SSE_S3` to `SSE_KMS` .
       *
       *
       * To use `SSE_S3` , create an AWS Identity and Access Management (IAM) role with a policy
       * that allows `"arn:aws:s3:::*"` to use the following actions: `"s3:PutObject", "s3:ListBucket"`
       */
      override fun encryptionMode(encryptionMode: String) {
        cdkBuilder.encryptionMode(encryptionMode)
      }

      /**
       * @param explicitIds This setting is only valid for a full-load migration task.
       * Set `ExplicitIds` to `true` to have tables with `IDENTITY` columns override their
       * auto-generated values with explicit values loaded from the source data files used to populate
       * the tables. The default is `false` .
       */
      override fun explicitIds(explicitIds: Boolean) {
        cdkBuilder.explicitIds(explicitIds)
      }

      /**
       * @param explicitIds This setting is only valid for a full-load migration task.
       * Set `ExplicitIds` to `true` to have tables with `IDENTITY` columns override their
       * auto-generated values with explicit values loaded from the source data files used to populate
       * the tables. The default is `false` .
       */
      override fun explicitIds(explicitIds: IResolvable) {
        cdkBuilder.explicitIds(explicitIds.let(IResolvable::unwrap))
      }

      /**
       * @param fileTransferUploadStreams The number of threads used to upload a single file.
       * This parameter accepts a value from 1 through 64. It defaults to 10.
       *
       * The number of parallel streams used to upload a single .csv file to an S3 bucket using S3
       * Multipart Upload. For more information, see [Multipart upload
       * overview](https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html) .
       *
       * `FileTransferUploadStreams` accepts a value from 1 through 64. It defaults to 10.
       */
      override fun fileTransferUploadStreams(fileTransferUploadStreams: Number) {
        cdkBuilder.fileTransferUploadStreams(fileTransferUploadStreams)
      }

      /**
       * @param loadTimeout The amount of time to wait (in milliseconds) before timing out of
       * operations performed by AWS DMS on a Redshift cluster, such as Redshift COPY, INSERT, DELETE,
       * and UPDATE.
       */
      override fun loadTimeout(loadTimeout: Number) {
        cdkBuilder.loadTimeout(loadTimeout)
      }

      /**
       * @param mapBooleanAsBoolean When true, lets Redshift migrate the boolean type as boolean.
       * By default, Redshift migrates booleans as `varchar(1)` . You must set this setting on both
       * the source and target endpoints for it to take effect.
       */
      override fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
      }

      /**
       * @param mapBooleanAsBoolean When true, lets Redshift migrate the boolean type as boolean.
       * By default, Redshift migrates booleans as `varchar(1)` . You must set this setting on both
       * the source and target endpoints for it to take effect.
       */
      override fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean.let(IResolvable::unwrap))
      }

      /**
       * @param maxFileSize The maximum size (in KB) of any .csv file used to load data on an S3
       * bucket and transfer data to Amazon Redshift. It defaults to 1048576KB (1 GB).
       */
      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      /**
       * @param removeQuotes A value that specifies to remove surrounding quotation marks from
       * strings in the incoming data.
       * All characters within the quotation marks, including delimiters, are retained. Choose
       * `true` to remove quotation marks. The default is `false` .
       */
      override fun removeQuotes(removeQuotes: Boolean) {
        cdkBuilder.removeQuotes(removeQuotes)
      }

      /**
       * @param removeQuotes A value that specifies to remove surrounding quotation marks from
       * strings in the incoming data.
       * All characters within the quotation marks, including delimiters, are retained. Choose
       * `true` to remove quotation marks. The default is `false` .
       */
      override fun removeQuotes(removeQuotes: IResolvable) {
        cdkBuilder.removeQuotes(removeQuotes.let(IResolvable::unwrap))
      }

      /**
       * @param replaceChars A value that specifies to replaces the invalid characters specified in
       * `ReplaceInvalidChars` , substituting the specified characters instead.
       * The default is `"?"` .
       */
      override fun replaceChars(replaceChars: String) {
        cdkBuilder.replaceChars(replaceChars)
      }

      /**
       * @param replaceInvalidChars A list of characters that you want to replace.
       * Use with `ReplaceChars` .
       */
      override fun replaceInvalidChars(replaceInvalidChars: String) {
        cdkBuilder.replaceInvalidChars(replaceInvalidChars)
      }

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the Amazon Redshift endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the Amazon Redshift endpoint connection details.
       */
      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      /**
       * @param serverSideEncryptionKmsKeyId The AWS KMS key ID.
       * If you are using `SSE_KMS` for the `EncryptionMode` , provide this key ID. The key that you
       * use needs an attached policy that enables IAM user permissions and allows use of the key.
       */
      override fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String) {
        cdkBuilder.serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId)
      }

      /**
       * @param serviceAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that has access
       * to the Amazon Redshift service.
       * The role must allow the `iam:PassRole` action.
       */
      override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      /**
       * @param timeFormat The time format that you want to use.
       * Valid values are `auto` (case-sensitive), `'timeformat_string'` , `'epochsecs'` , or
       * `'epochmillisecs'` . It defaults to 10. Using `auto` recognizes most strings, even some that
       * aren't supported when you use a time format string.
       *
       * If your date and time values use formats different from each other, set this parameter to
       * `auto` .
       */
      override fun timeFormat(timeFormat: String) {
        cdkBuilder.timeFormat(timeFormat)
      }

      /**
       * @param trimBlanks A value that specifies to remove the trailing white space characters from
       * a VARCHAR string.
       * This parameter applies only to columns with a VARCHAR data type. Choose `true` to remove
       * unneeded white space. The default is `false` .
       */
      override fun trimBlanks(trimBlanks: Boolean) {
        cdkBuilder.trimBlanks(trimBlanks)
      }

      /**
       * @param trimBlanks A value that specifies to remove the trailing white space characters from
       * a VARCHAR string.
       * This parameter applies only to columns with a VARCHAR data type. Choose `true` to remove
       * unneeded white space. The default is `false` .
       */
      override fun trimBlanks(trimBlanks: IResolvable) {
        cdkBuilder.trimBlanks(trimBlanks.let(IResolvable::unwrap))
      }

      /**
       * @param truncateColumns A value that specifies to truncate data in columns to the
       * appropriate number of characters, so that the data fits in the column.
       * This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a
       * size of 4 MB or less. Choose `true` to truncate data. The default is `false` .
       */
      override fun truncateColumns(truncateColumns: Boolean) {
        cdkBuilder.truncateColumns(truncateColumns)
      }

      /**
       * @param truncateColumns A value that specifies to truncate data in columns to the
       * appropriate number of characters, so that the data fits in the column.
       * This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a
       * size of 4 MB or less. Choose `true` to truncate data. The default is `false` .
       */
      override fun truncateColumns(truncateColumns: IResolvable) {
        cdkBuilder.truncateColumns(truncateColumns.let(IResolvable::unwrap))
      }

      /**
       * @param writeBufferSize The size (in KB) of the in-memory file write buffer used when
       * generating .csv files on the local disk at the DMS replication instance. The default value is
       * 1000 (buffer size is 1000KB).
       */
      override fun writeBufferSize(writeBufferSize: Number) {
        cdkBuilder.writeBufferSize(writeBufferSize)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty,
    ) : CdkObject(cdkObject), RedshiftSettingsProperty {
      /**
       * A value that indicates to allow any date format, including invalid formats such as 00/00/00
       * 00:00:00, to be loaded without generating an error.
       *
       * You can choose `true` or `false` (the default).
       *
       * This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with
       * the DATEFORMAT parameter. If the date format for the data doesn't match the DATEFORMAT
       * specification, Amazon Redshift inserts a NULL value into that field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-acceptanydate)
       */
      override fun acceptAnyDate(): Any? = unwrap(this).getAcceptAnyDate()

      /**
       * Code to run after connecting.
       *
       * This parameter should contain the code itself, not the name of a file containing the code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-afterconnectscript)
       */
      override fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

      /**
       * An S3 folder where the comma-separated-value (.csv) files are stored before being uploaded
       * to the target Redshift cluster.
       *
       * For full load mode, AWS DMS converts source records into .csv files and loads them to the
       * *BucketFolder/TableID* path. AWS DMS uses the Redshift `COPY` command to upload the .csv files
       * to the target table. The files are deleted once the `COPY` operation has finished. For more
       * information, see [COPY](https://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html) in the
       * *Amazon Redshift Database Developer Guide* .
       *
       * For change-data-capture (CDC) mode, AWS DMS creates a *NetChanges* table, and loads the
       * .csv files to this *BucketFolder/NetChangesTableID* path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-bucketfolder)
       */
      override fun bucketFolder(): String? = unwrap(this).getBucketFolder()

      /**
       * The name of the intermediate S3 bucket used to store .csv files before uploading data to
       * Redshift.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-bucketname)
       */
      override fun bucketName(): String? = unwrap(this).getBucketName()

      /**
       * If Amazon Redshift is configured to support case sensitive schema names, set
       * `CaseSensitiveNames` to `true` .
       *
       * The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-casesensitivenames)
       */
      override fun caseSensitiveNames(): Any? = unwrap(this).getCaseSensitiveNames()

      /**
       * If you set `CompUpdate` to `true` Amazon Redshift applies automatic compression if the
       * table is empty.
       *
       * This applies even if the table columns already have encodings other than `RAW` . If you set
       * `CompUpdate` to `false` , automatic compression is disabled and existing column encodings
       * aren't changed. The default is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-compupdate)
       */
      override fun compUpdate(): Any? = unwrap(this).getCompUpdate()

      /**
       * A value that sets the amount of time to wait (in milliseconds) before timing out, beginning
       * from when you initially establish a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-connectiontimeout)
       */
      override fun connectionTimeout(): Number? = unwrap(this).getConnectionTimeout()

      /**
       * The date format that you are using.
       *
       * Valid values are `auto` (case-sensitive), your date format string enclosed in quotes, or
       * NULL. If this parameter is left unset (NULL), it defaults to a format of 'YYYY-MM-DD'. Using
       * `auto` recognizes most strings, even some that aren't supported when you use a date format
       * string.
       *
       * If your date and time values use formats different from each other, set this to `auto` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-dateformat)
       */
      override fun dateFormat(): String? = unwrap(this).getDateFormat()

      /**
       * A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as
       * NULL.
       *
       * A value of `true` sets empty CHAR and VARCHAR fields to null. The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-emptyasnull)
       */
      override fun emptyAsNull(): Any? = unwrap(this).getEmptyAsNull()

      /**
       * The type of server-side encryption that you want to use for your data.
       *
       * This encryption type is part of the endpoint settings or the extra connections attributes
       * for Amazon S3. You can choose either `SSE_S3` (the default) or `SSE_KMS` .
       *
       *
       * For the `ModifyEndpoint` operation, you can change the existing value of the
       * `EncryptionMode` parameter from `SSE_KMS` to `SSE_S3` . But you can’t change the existing
       * value from `SSE_S3` to `SSE_KMS` .
       *
       *
       * To use `SSE_S3` , create an AWS Identity and Access Management (IAM) role with a policy
       * that allows `"arn:aws:s3:::*"` to use the following actions: `"s3:PutObject", "s3:ListBucket"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-encryptionmode)
       */
      override fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

      /**
       * This setting is only valid for a full-load migration task.
       *
       * Set `ExplicitIds` to `true` to have tables with `IDENTITY` columns override their
       * auto-generated values with explicit values loaded from the source data files used to populate
       * the tables. The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-explicitids)
       */
      override fun explicitIds(): Any? = unwrap(this).getExplicitIds()

      /**
       * The number of threads used to upload a single file.
       *
       * This parameter accepts a value from 1 through 64. It defaults to 10.
       *
       * The number of parallel streams used to upload a single .csv file to an S3 bucket using S3
       * Multipart Upload. For more information, see [Multipart upload
       * overview](https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html) .
       *
       * `FileTransferUploadStreams` accepts a value from 1 through 64. It defaults to 10.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-filetransferuploadstreams)
       */
      override fun fileTransferUploadStreams(): Number? =
          unwrap(this).getFileTransferUploadStreams()

      /**
       * The amount of time to wait (in milliseconds) before timing out of operations performed by
       * AWS DMS on a Redshift cluster, such as Redshift COPY, INSERT, DELETE, and UPDATE.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-loadtimeout)
       */
      override fun loadTimeout(): Number? = unwrap(this).getLoadTimeout()

      /**
       * When true, lets Redshift migrate the boolean type as boolean.
       *
       * By default, Redshift migrates booleans as `varchar(1)` . You must set this setting on both
       * the source and target endpoints for it to take effect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-mapbooleanasboolean)
       */
      override fun mapBooleanAsBoolean(): Any? = unwrap(this).getMapBooleanAsBoolean()

      /**
       * The maximum size (in KB) of any .csv file used to load data on an S3 bucket and transfer
       * data to Amazon Redshift. It defaults to 1048576KB (1 GB).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-maxfilesize)
       */
      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      /**
       * A value that specifies to remove surrounding quotation marks from strings in the incoming
       * data.
       *
       * All characters within the quotation marks, including delimiters, are retained. Choose
       * `true` to remove quotation marks. The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-removequotes)
       */
      override fun removeQuotes(): Any? = unwrap(this).getRemoveQuotes()

      /**
       * A value that specifies to replaces the invalid characters specified in
       * `ReplaceInvalidChars` , substituting the specified characters instead.
       *
       * The default is `"?"` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-replacechars)
       */
      override fun replaceChars(): String? = unwrap(this).getReplaceChars()

      /**
       * A list of characters that you want to replace.
       *
       * Use with `ReplaceChars` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-replaceinvalidchars)
       */
      override fun replaceInvalidChars(): String? = unwrap(this).getReplaceInvalidChars()

      /**
       * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
       * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
       *
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the Amazon Redshift endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-secretsmanageraccessrolearn)
       */
      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      /**
       * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
       * Amazon Redshift endpoint connection details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-secretsmanagersecretid)
       */
      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      /**
       * The AWS KMS key ID.
       *
       * If you are using `SSE_KMS` for the `EncryptionMode` , provide this key ID. The key that you
       * use needs an attached policy that enables IAM user permissions and allows use of the key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-serversideencryptionkmskeyid)
       */
      override fun serverSideEncryptionKmsKeyId(): String? =
          unwrap(this).getServerSideEncryptionKmsKeyId()

      /**
       * The Amazon Resource Name (ARN) of the IAM role that has access to the Amazon Redshift
       * service.
       *
       * The role must allow the `iam:PassRole` action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-serviceaccessrolearn)
       */
      override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

      /**
       * The time format that you want to use.
       *
       * Valid values are `auto` (case-sensitive), `'timeformat_string'` , `'epochsecs'` , or
       * `'epochmillisecs'` . It defaults to 10. Using `auto` recognizes most strings, even some that
       * aren't supported when you use a time format string.
       *
       * If your date and time values use formats different from each other, set this parameter to
       * `auto` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-timeformat)
       */
      override fun timeFormat(): String? = unwrap(this).getTimeFormat()

      /**
       * A value that specifies to remove the trailing white space characters from a VARCHAR string.
       *
       * This parameter applies only to columns with a VARCHAR data type. Choose `true` to remove
       * unneeded white space. The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-trimblanks)
       */
      override fun trimBlanks(): Any? = unwrap(this).getTrimBlanks()

      /**
       * A value that specifies to truncate data in columns to the appropriate number of characters,
       * so that the data fits in the column.
       *
       * This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a
       * size of 4 MB or less. Choose `true` to truncate data. The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-truncatecolumns)
       */
      override fun truncateColumns(): Any? = unwrap(this).getTruncateColumns()

      /**
       * The size (in KB) of the in-memory file write buffer used when generating .csv files on the
       * local disk at the DMS replication instance. The default value is 1000 (buffer size is 1000KB).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redshiftsettings.html#cfn-dms-endpoint-redshiftsettings-writebuffersize)
       */
      override fun writeBufferSize(): Number? = unwrap(this).getWriteBufferSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty):
          RedshiftSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty
    }
  }

  public interface MongoDbSettingsProperty {
    /**
     * The authentication mechanism you use to access the MongoDB source endpoint.
     *
     * For the default value, in MongoDB version 2.x, `"default"` is `"mongodb_cr"` . For MongoDB
     * version 3.x or later, `"default"` is `"scram_sha_1"` . This setting isn't used when `AuthType`
     * is set to `"no"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism)
     */
    public fun authMechanism(): String? = unwrap(this).getAuthMechanism()

    /**
     * The MongoDB database name. This setting isn't used when `AuthType` is set to `"no"` .
     *
     * The default is `"admin"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authsource)
     */
    public fun authSource(): String? = unwrap(this).getAuthSource()

    /**
     * The authentication type you use to access the MongoDB source endpoint.
     *
     * When set to `"no"` , user name and password parameters are not used and can be empty.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype)
     */
    public fun authType(): String? = unwrap(this).getAuthType()

    /**
     * The database name on the MongoDB source endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * Indicates the number of documents to preview to determine the document organization.
     *
     * Use this setting when `NestingLevel` is set to `"one"` .
     *
     * Must be a positive value greater than `0` . Default value is `1000` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate)
     */
    public fun docsToInvestigate(): String? = unwrap(this).getDocsToInvestigate()

    /**
     * Specifies the document ID. Use this setting when `NestingLevel` is set to `"none"` .
     *
     * Default value is `"false"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-extractdocid)
     */
    public fun extractDocId(): String? = unwrap(this).getExtractDocId()

    /**
     * Specifies either document or table mode.
     *
     * Default value is `"none"` . Specify `"none"` to use document mode. Specify `"one"` to use
     * table mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel)
     */
    public fun nestingLevel(): String? = unwrap(this).getNestingLevel()

    /**
     * The password for the user account you use to access the MongoDB source endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password)
     */
    public fun password(): String? = unwrap(this).getPassword()

    /**
     * The port value for the MongoDB source endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
     * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
     *
     * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
     * AWS Secrets Manager secret that allows access to the MongoDB endpoint.
     *
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
     * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
     *
     * For more information on creating this `SecretsManagerSecret` , the corresponding
     * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access it,
     * see [Using secrets to access AWS Database Migration Service
     * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-secretsmanageraccessrolearn)
     */
    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    /**
     * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
     * MongoDB endpoint connection details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-secretsmanagersecretid)
     */
    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    /**
     * The name of the server on the MongoDB source endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername)
     */
    public fun serverName(): String? = unwrap(this).getServerName()

    /**
     * The user name you use to access the MongoDB source endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username)
     */
    public fun username(): String? = unwrap(this).getUsername()

    /**
     * A builder for [MongoDbSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authMechanism The authentication mechanism you use to access the MongoDB source
       * endpoint.
       * For the default value, in MongoDB version 2.x, `"default"` is `"mongodb_cr"` . For MongoDB
       * version 3.x or later, `"default"` is `"scram_sha_1"` . This setting isn't used when `AuthType`
       * is set to `"no"` .
       */
      public fun authMechanism(authMechanism: String)

      /**
       * @param authSource The MongoDB database name. This setting isn't used when `AuthType` is set
       * to `"no"` .
       * The default is `"admin"` .
       */
      public fun authSource(authSource: String)

      /**
       * @param authType The authentication type you use to access the MongoDB source endpoint.
       * When set to `"no"` , user name and password parameters are not used and can be empty.
       */
      public fun authType(authType: String)

      /**
       * @param databaseName The database name on the MongoDB source endpoint.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param docsToInvestigate Indicates the number of documents to preview to determine the
       * document organization.
       * Use this setting when `NestingLevel` is set to `"one"` .
       *
       * Must be a positive value greater than `0` . Default value is `1000` .
       */
      public fun docsToInvestigate(docsToInvestigate: String)

      /**
       * @param extractDocId Specifies the document ID. Use this setting when `NestingLevel` is set
       * to `"none"` .
       * Default value is `"false"` .
       */
      public fun extractDocId(extractDocId: String)

      /**
       * @param nestingLevel Specifies either document or table mode.
       * Default value is `"none"` . Specify `"none"` to use document mode. Specify `"one"` to use
       * table mode.
       */
      public fun nestingLevel(nestingLevel: String)

      /**
       * @param password The password for the user account you use to access the MongoDB source
       * endpoint.
       */
      public fun password(password: String)

      /**
       * @param port The port value for the MongoDB source endpoint.
       */
      public fun port(port: Number)

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the MongoDB endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the MongoDB endpoint connection details.
       */
      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      /**
       * @param serverName The name of the server on the MongoDB source endpoint.
       */
      public fun serverName(serverName: String)

      /**
       * @param username The user name you use to access the MongoDB source endpoint.
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.builder()

      /**
       * @param authMechanism The authentication mechanism you use to access the MongoDB source
       * endpoint.
       * For the default value, in MongoDB version 2.x, `"default"` is `"mongodb_cr"` . For MongoDB
       * version 3.x or later, `"default"` is `"scram_sha_1"` . This setting isn't used when `AuthType`
       * is set to `"no"` .
       */
      override fun authMechanism(authMechanism: String) {
        cdkBuilder.authMechanism(authMechanism)
      }

      /**
       * @param authSource The MongoDB database name. This setting isn't used when `AuthType` is set
       * to `"no"` .
       * The default is `"admin"` .
       */
      override fun authSource(authSource: String) {
        cdkBuilder.authSource(authSource)
      }

      /**
       * @param authType The authentication type you use to access the MongoDB source endpoint.
       * When set to `"no"` , user name and password parameters are not used and can be empty.
       */
      override fun authType(authType: String) {
        cdkBuilder.authType(authType)
      }

      /**
       * @param databaseName The database name on the MongoDB source endpoint.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param docsToInvestigate Indicates the number of documents to preview to determine the
       * document organization.
       * Use this setting when `NestingLevel` is set to `"one"` .
       *
       * Must be a positive value greater than `0` . Default value is `1000` .
       */
      override fun docsToInvestigate(docsToInvestigate: String) {
        cdkBuilder.docsToInvestigate(docsToInvestigate)
      }

      /**
       * @param extractDocId Specifies the document ID. Use this setting when `NestingLevel` is set
       * to `"none"` .
       * Default value is `"false"` .
       */
      override fun extractDocId(extractDocId: String) {
        cdkBuilder.extractDocId(extractDocId)
      }

      /**
       * @param nestingLevel Specifies either document or table mode.
       * Default value is `"none"` . Specify `"none"` to use document mode. Specify `"one"` to use
       * table mode.
       */
      override fun nestingLevel(nestingLevel: String) {
        cdkBuilder.nestingLevel(nestingLevel)
      }

      /**
       * @param password The password for the user account you use to access the MongoDB source
       * endpoint.
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param port The port value for the MongoDB source endpoint.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the MongoDB endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the MongoDB endpoint connection details.
       */
      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      /**
       * @param serverName The name of the server on the MongoDB source endpoint.
       */
      override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

      /**
       * @param username The user name you use to access the MongoDB source endpoint.
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty,
    ) : CdkObject(cdkObject), MongoDbSettingsProperty {
      /**
       * The authentication mechanism you use to access the MongoDB source endpoint.
       *
       * For the default value, in MongoDB version 2.x, `"default"` is `"mongodb_cr"` . For MongoDB
       * version 3.x or later, `"default"` is `"scram_sha_1"` . This setting isn't used when `AuthType`
       * is set to `"no"` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism)
       */
      override fun authMechanism(): String? = unwrap(this).getAuthMechanism()

      /**
       * The MongoDB database name. This setting isn't used when `AuthType` is set to `"no"` .
       *
       * The default is `"admin"` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authsource)
       */
      override fun authSource(): String? = unwrap(this).getAuthSource()

      /**
       * The authentication type you use to access the MongoDB source endpoint.
       *
       * When set to `"no"` , user name and password parameters are not used and can be empty.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype)
       */
      override fun authType(): String? = unwrap(this).getAuthType()

      /**
       * The database name on the MongoDB source endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * Indicates the number of documents to preview to determine the document organization.
       *
       * Use this setting when `NestingLevel` is set to `"one"` .
       *
       * Must be a positive value greater than `0` . Default value is `1000` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate)
       */
      override fun docsToInvestigate(): String? = unwrap(this).getDocsToInvestigate()

      /**
       * Specifies the document ID. Use this setting when `NestingLevel` is set to `"none"` .
       *
       * Default value is `"false"` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-extractdocid)
       */
      override fun extractDocId(): String? = unwrap(this).getExtractDocId()

      /**
       * Specifies either document or table mode.
       *
       * Default value is `"none"` . Specify `"none"` to use document mode. Specify `"one"` to use
       * table mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel)
       */
      override fun nestingLevel(): String? = unwrap(this).getNestingLevel()

      /**
       * The password for the user account you use to access the MongoDB source endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password)
       */
      override fun password(): String? = unwrap(this).getPassword()

      /**
       * The port value for the MongoDB source endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
       * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
       *
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the MongoDB endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-secretsmanageraccessrolearn)
       */
      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      /**
       * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
       * MongoDB endpoint connection details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-secretsmanagersecretid)
       */
      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      /**
       * The name of the server on the MongoDB source endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername)
       */
      override fun serverName(): String? = unwrap(this).getServerName()

      /**
       * The user name you use to access the MongoDB source endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username)
       */
      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MongoDbSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty):
          MongoDbSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MongoDbSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty
    }
  }

  public interface PostgreSqlSettingsProperty {
    /**
     * For use with change data capture (CDC) only, this attribute has AWS DMS bypass foreign keys
     * and user triggers to reduce the time it takes to bulk load data.
     *
     * Example: `afterConnectScript=SET session_replication_role='replica'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-afterconnectscript)
     */
    public fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

    /**
     * The Babelfish for Aurora PostgreSQL database name for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-babelfishdatabasename)
     */
    public fun babelfishDatabaseName(): String? = unwrap(this).getBabelfishDatabaseName()

    /**
     * To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL database when the
     * task starts.
     *
     * You can later remove these artifacts.
     *
     * If this value is set to `N` , you don't have to create tables or triggers on the source
     * database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-captureddls)
     */
    public fun captureDdls(): Any? = unwrap(this).getCaptureDdls()

    /**
     * Specifies the default behavior of the replication's handling of PostgreSQL- compatible
     * endpoints that require some additional configuration, such as Babelfish endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-databasemode)
     */
    public fun databaseMode(): String? = unwrap(this).getDatabaseMode()

    /**
     * The schema in which the operational DDL database artifacts are created.
     *
     * Example: `ddlArtifactsSchema=xyzddlschema;`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-ddlartifactsschema)
     */
    public fun ddlArtifactsSchema(): String? = unwrap(this).getDdlArtifactsSchema()

    /**
     * Sets the client statement timeout for the PostgreSQL instance, in seconds. The default value
     * is 60 seconds.
     *
     * Example: `executeTimeout=100;`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-executetimeout)
     */
    public fun executeTimeout(): Number? = unwrap(this).getExecuteTimeout()

    /**
     * When set to `true` , this value causes a task to fail if the actual size of a LOB column is
     * greater than the specified `LobMaxSize` .
     *
     * If task is set to Limited LOB mode and this option is set to true, the task fails instead of
     * truncating the LOB data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-failtasksonlobtruncation)
     */
    public fun failTasksOnLobTruncation(): Any? = unwrap(this).getFailTasksOnLobTruncation()

    /**
     * The write-ahead log (WAL) heartbeat feature mimics a dummy transaction.
     *
     * By doing this, it prevents idle logical replication slots from holding onto old WAL logs,
     * which can result in storage full situations on the source. This heartbeat keeps `restart_lsn`
     * moving and prevents storage full scenarios.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-heartbeatenable)
     */
    public fun heartbeatEnable(): Any? = unwrap(this).getHeartbeatEnable()

    /**
     * Sets the WAL heartbeat frequency (in minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-heartbeatfrequency)
     */
    public fun heartbeatFrequency(): Number? = unwrap(this).getHeartbeatFrequency()

    /**
     * Sets the schema in which the heartbeat artifacts are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-heartbeatschema)
     */
    public fun heartbeatSchema(): String? = unwrap(this).getHeartbeatSchema()

    /**
     * When true, lets PostgreSQL migrate the boolean type as boolean.
     *
     * By default, PostgreSQL migrates booleans as `varchar(5)` . You must set this setting on both
     * the source and target endpoints for it to take effect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-mapbooleanasboolean)
     */
    public fun mapBooleanAsBoolean(): Any? = unwrap(this).getMapBooleanAsBoolean()

    /**
     * Specifies the maximum size (in KB) of any .csv file used to transfer data to PostgreSQL.
     *
     * Example: `maxFileSize=512`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-maxfilesize)
     */
    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    /**
     * Specifies the plugin to use to create a replication slot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-pluginname)
     */
    public fun pluginName(): String? = unwrap(this).getPluginName()

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
     * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
     *
     * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
     * AWS Secrets Manager secret that allows access to the PostgreSQL endpoint.
     *
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
     * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
     *
     * For more information on creating this `SecretsManagerSecret` , the corresponding
     * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access it,
     * see [Using secrets to access AWS Database Migration Service
     * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-secretsmanageraccessrolearn)
     */
    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    /**
     * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
     * PostgreSQL endpoint connection details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-secretsmanagersecretid)
     */
    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    /**
     * Sets the name of a previously created logical replication slot for a change data capture
     * (CDC) load of the PostgreSQL source instance.
     *
     * When used with the `CdcStartPosition` request parameter for the AWS DMS API , this attribute
     * also makes it possible to use native CDC start points. DMS verifies that the specified logical
     * replication slot exists before starting the CDC load task. It also verifies that the task was
     * created with a valid setting of `CdcStartPosition` . If the specified slot doesn't exist or the
     * task doesn't have a valid `CdcStartPosition` setting, DMS raises an error.
     *
     * For more information about setting the `CdcStartPosition` request parameter, see [Determining
     * a CDC native start
     * point](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Task.CDC.html#CHAP_Task.CDC.StartPoint.Native)
     * in the *AWS Database Migration Service User Guide* . For more information about using
     * `CdcStartPosition` , see
     * [CreateReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateReplicationTask.html)
     * ,
     * [StartReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html)
     * , and
     * [ModifyReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_ModifyReplicationTask.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-slotname)
     */
    public fun slotName(): String? = unwrap(this).getSlotName()

    /**
     * A builder for [PostgreSqlSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param afterConnectScript For use with change data capture (CDC) only, this attribute has
       * AWS DMS bypass foreign keys and user triggers to reduce the time it takes to bulk load data.
       * Example: `afterConnectScript=SET session_replication_role='replica'`
       */
      public fun afterConnectScript(afterConnectScript: String)

      /**
       * @param babelfishDatabaseName The Babelfish for Aurora PostgreSQL database name for the
       * endpoint.
       */
      public fun babelfishDatabaseName(babelfishDatabaseName: String)

      /**
       * @param captureDdls To capture DDL events, AWS DMS creates various artifacts in the
       * PostgreSQL database when the task starts.
       * You can later remove these artifacts.
       *
       * If this value is set to `N` , you don't have to create tables or triggers on the source
       * database.
       */
      public fun captureDdls(captureDdls: Boolean)

      /**
       * @param captureDdls To capture DDL events, AWS DMS creates various artifacts in the
       * PostgreSQL database when the task starts.
       * You can later remove these artifacts.
       *
       * If this value is set to `N` , you don't have to create tables or triggers on the source
       * database.
       */
      public fun captureDdls(captureDdls: IResolvable)

      /**
       * @param databaseMode Specifies the default behavior of the replication's handling of
       * PostgreSQL- compatible endpoints that require some additional configuration, such as Babelfish
       * endpoints.
       */
      public fun databaseMode(databaseMode: String)

      /**
       * @param ddlArtifactsSchema The schema in which the operational DDL database artifacts are
       * created.
       * Example: `ddlArtifactsSchema=xyzddlschema;`
       */
      public fun ddlArtifactsSchema(ddlArtifactsSchema: String)

      /**
       * @param executeTimeout Sets the client statement timeout for the PostgreSQL instance, in
       * seconds. The default value is 60 seconds.
       * Example: `executeTimeout=100;`
       */
      public fun executeTimeout(executeTimeout: Number)

      /**
       * @param failTasksOnLobTruncation When set to `true` , this value causes a task to fail if
       * the actual size of a LOB column is greater than the specified `LobMaxSize` .
       * If task is set to Limited LOB mode and this option is set to true, the task fails instead
       * of truncating the LOB data.
       */
      public fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean)

      /**
       * @param failTasksOnLobTruncation When set to `true` , this value causes a task to fail if
       * the actual size of a LOB column is greater than the specified `LobMaxSize` .
       * If task is set to Limited LOB mode and this option is set to true, the task fails instead
       * of truncating the LOB data.
       */
      public fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable)

      /**
       * @param heartbeatEnable The write-ahead log (WAL) heartbeat feature mimics a dummy
       * transaction.
       * By doing this, it prevents idle logical replication slots from holding onto old WAL logs,
       * which can result in storage full situations on the source. This heartbeat keeps `restart_lsn`
       * moving and prevents storage full scenarios.
       */
      public fun heartbeatEnable(heartbeatEnable: Boolean)

      /**
       * @param heartbeatEnable The write-ahead log (WAL) heartbeat feature mimics a dummy
       * transaction.
       * By doing this, it prevents idle logical replication slots from holding onto old WAL logs,
       * which can result in storage full situations on the source. This heartbeat keeps `restart_lsn`
       * moving and prevents storage full scenarios.
       */
      public fun heartbeatEnable(heartbeatEnable: IResolvable)

      /**
       * @param heartbeatFrequency Sets the WAL heartbeat frequency (in minutes).
       */
      public fun heartbeatFrequency(heartbeatFrequency: Number)

      /**
       * @param heartbeatSchema Sets the schema in which the heartbeat artifacts are created.
       */
      public fun heartbeatSchema(heartbeatSchema: String)

      /**
       * @param mapBooleanAsBoolean When true, lets PostgreSQL migrate the boolean type as boolean.
       * By default, PostgreSQL migrates booleans as `varchar(5)` . You must set this setting on
       * both the source and target endpoints for it to take effect.
       */
      public fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean)

      /**
       * @param mapBooleanAsBoolean When true, lets PostgreSQL migrate the boolean type as boolean.
       * By default, PostgreSQL migrates booleans as `varchar(5)` . You must set this setting on
       * both the source and target endpoints for it to take effect.
       */
      public fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable)

      /**
       * @param maxFileSize Specifies the maximum size (in KB) of any .csv file used to transfer
       * data to PostgreSQL.
       * Example: `maxFileSize=512`
       */
      public fun maxFileSize(maxFileSize: Number)

      /**
       * @param pluginName Specifies the plugin to use to create a replication slot.
       */
      public fun pluginName(pluginName: String)

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the PostgreSQL endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the PostgreSQL endpoint connection details.
       */
      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      /**
       * @param slotName Sets the name of a previously created logical replication slot for a change
       * data capture (CDC) load of the PostgreSQL source instance.
       * When used with the `CdcStartPosition` request parameter for the AWS DMS API , this
       * attribute also makes it possible to use native CDC start points. DMS verifies that the
       * specified logical replication slot exists before starting the CDC load task. It also verifies
       * that the task was created with a valid setting of `CdcStartPosition` . If the specified slot
       * doesn't exist or the task doesn't have a valid `CdcStartPosition` setting, DMS raises an
       * error.
       *
       * For more information about setting the `CdcStartPosition` request parameter, see
       * [Determining a CDC native start
       * point](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Task.CDC.html#CHAP_Task.CDC.StartPoint.Native)
       * in the *AWS Database Migration Service User Guide* . For more information about using
       * `CdcStartPosition` , see
       * [CreateReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateReplicationTask.html)
       * ,
       * [StartReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html)
       * , and
       * [ModifyReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_ModifyReplicationTask.html)
       * .
       */
      public fun slotName(slotName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty.builder()

      /**
       * @param afterConnectScript For use with change data capture (CDC) only, this attribute has
       * AWS DMS bypass foreign keys and user triggers to reduce the time it takes to bulk load data.
       * Example: `afterConnectScript=SET session_replication_role='replica'`
       */
      override fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
      }

      /**
       * @param babelfishDatabaseName The Babelfish for Aurora PostgreSQL database name for the
       * endpoint.
       */
      override fun babelfishDatabaseName(babelfishDatabaseName: String) {
        cdkBuilder.babelfishDatabaseName(babelfishDatabaseName)
      }

      /**
       * @param captureDdls To capture DDL events, AWS DMS creates various artifacts in the
       * PostgreSQL database when the task starts.
       * You can later remove these artifacts.
       *
       * If this value is set to `N` , you don't have to create tables or triggers on the source
       * database.
       */
      override fun captureDdls(captureDdls: Boolean) {
        cdkBuilder.captureDdls(captureDdls)
      }

      /**
       * @param captureDdls To capture DDL events, AWS DMS creates various artifacts in the
       * PostgreSQL database when the task starts.
       * You can later remove these artifacts.
       *
       * If this value is set to `N` , you don't have to create tables or triggers on the source
       * database.
       */
      override fun captureDdls(captureDdls: IResolvable) {
        cdkBuilder.captureDdls(captureDdls.let(IResolvable::unwrap))
      }

      /**
       * @param databaseMode Specifies the default behavior of the replication's handling of
       * PostgreSQL- compatible endpoints that require some additional configuration, such as Babelfish
       * endpoints.
       */
      override fun databaseMode(databaseMode: String) {
        cdkBuilder.databaseMode(databaseMode)
      }

      /**
       * @param ddlArtifactsSchema The schema in which the operational DDL database artifacts are
       * created.
       * Example: `ddlArtifactsSchema=xyzddlschema;`
       */
      override fun ddlArtifactsSchema(ddlArtifactsSchema: String) {
        cdkBuilder.ddlArtifactsSchema(ddlArtifactsSchema)
      }

      /**
       * @param executeTimeout Sets the client statement timeout for the PostgreSQL instance, in
       * seconds. The default value is 60 seconds.
       * Example: `executeTimeout=100;`
       */
      override fun executeTimeout(executeTimeout: Number) {
        cdkBuilder.executeTimeout(executeTimeout)
      }

      /**
       * @param failTasksOnLobTruncation When set to `true` , this value causes a task to fail if
       * the actual size of a LOB column is greater than the specified `LobMaxSize` .
       * If task is set to Limited LOB mode and this option is set to true, the task fails instead
       * of truncating the LOB data.
       */
      override fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation)
      }

      /**
       * @param failTasksOnLobTruncation When set to `true` , this value causes a task to fail if
       * the actual size of a LOB column is greater than the specified `LobMaxSize` .
       * If task is set to Limited LOB mode and this option is set to true, the task fails instead
       * of truncating the LOB data.
       */
      override fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation.let(IResolvable::unwrap))
      }

      /**
       * @param heartbeatEnable The write-ahead log (WAL) heartbeat feature mimics a dummy
       * transaction.
       * By doing this, it prevents idle logical replication slots from holding onto old WAL logs,
       * which can result in storage full situations on the source. This heartbeat keeps `restart_lsn`
       * moving and prevents storage full scenarios.
       */
      override fun heartbeatEnable(heartbeatEnable: Boolean) {
        cdkBuilder.heartbeatEnable(heartbeatEnable)
      }

      /**
       * @param heartbeatEnable The write-ahead log (WAL) heartbeat feature mimics a dummy
       * transaction.
       * By doing this, it prevents idle logical replication slots from holding onto old WAL logs,
       * which can result in storage full situations on the source. This heartbeat keeps `restart_lsn`
       * moving and prevents storage full scenarios.
       */
      override fun heartbeatEnable(heartbeatEnable: IResolvable) {
        cdkBuilder.heartbeatEnable(heartbeatEnable.let(IResolvable::unwrap))
      }

      /**
       * @param heartbeatFrequency Sets the WAL heartbeat frequency (in minutes).
       */
      override fun heartbeatFrequency(heartbeatFrequency: Number) {
        cdkBuilder.heartbeatFrequency(heartbeatFrequency)
      }

      /**
       * @param heartbeatSchema Sets the schema in which the heartbeat artifacts are created.
       */
      override fun heartbeatSchema(heartbeatSchema: String) {
        cdkBuilder.heartbeatSchema(heartbeatSchema)
      }

      /**
       * @param mapBooleanAsBoolean When true, lets PostgreSQL migrate the boolean type as boolean.
       * By default, PostgreSQL migrates booleans as `varchar(5)` . You must set this setting on
       * both the source and target endpoints for it to take effect.
       */
      override fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
      }

      /**
       * @param mapBooleanAsBoolean When true, lets PostgreSQL migrate the boolean type as boolean.
       * By default, PostgreSQL migrates booleans as `varchar(5)` . You must set this setting on
       * both the source and target endpoints for it to take effect.
       */
      override fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean.let(IResolvable::unwrap))
      }

      /**
       * @param maxFileSize Specifies the maximum size (in KB) of any .csv file used to transfer
       * data to PostgreSQL.
       * Example: `maxFileSize=512`
       */
      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      /**
       * @param pluginName Specifies the plugin to use to create a replication slot.
       */
      override fun pluginName(pluginName: String) {
        cdkBuilder.pluginName(pluginName)
      }

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret` .
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the PostgreSQL endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the PostgreSQL endpoint connection details.
       */
      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      /**
       * @param slotName Sets the name of a previously created logical replication slot for a change
       * data capture (CDC) load of the PostgreSQL source instance.
       * When used with the `CdcStartPosition` request parameter for the AWS DMS API , this
       * attribute also makes it possible to use native CDC start points. DMS verifies that the
       * specified logical replication slot exists before starting the CDC load task. It also verifies
       * that the task was created with a valid setting of `CdcStartPosition` . If the specified slot
       * doesn't exist or the task doesn't have a valid `CdcStartPosition` setting, DMS raises an
       * error.
       *
       * For more information about setting the `CdcStartPosition` request parameter, see
       * [Determining a CDC native start
       * point](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Task.CDC.html#CHAP_Task.CDC.StartPoint.Native)
       * in the *AWS Database Migration Service User Guide* . For more information about using
       * `CdcStartPosition` , see
       * [CreateReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateReplicationTask.html)
       * ,
       * [StartReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html)
       * , and
       * [ModifyReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_ModifyReplicationTask.html)
       * .
       */
      override fun slotName(slotName: String) {
        cdkBuilder.slotName(slotName)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty,
    ) : CdkObject(cdkObject), PostgreSqlSettingsProperty {
      /**
       * For use with change data capture (CDC) only, this attribute has AWS DMS bypass foreign keys
       * and user triggers to reduce the time it takes to bulk load data.
       *
       * Example: `afterConnectScript=SET session_replication_role='replica'`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-afterconnectscript)
       */
      override fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

      /**
       * The Babelfish for Aurora PostgreSQL database name for the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-babelfishdatabasename)
       */
      override fun babelfishDatabaseName(): String? = unwrap(this).getBabelfishDatabaseName()

      /**
       * To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL database when
       * the task starts.
       *
       * You can later remove these artifacts.
       *
       * If this value is set to `N` , you don't have to create tables or triggers on the source
       * database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-captureddls)
       */
      override fun captureDdls(): Any? = unwrap(this).getCaptureDdls()

      /**
       * Specifies the default behavior of the replication's handling of PostgreSQL- compatible
       * endpoints that require some additional configuration, such as Babelfish endpoints.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-databasemode)
       */
      override fun databaseMode(): String? = unwrap(this).getDatabaseMode()

      /**
       * The schema in which the operational DDL database artifacts are created.
       *
       * Example: `ddlArtifactsSchema=xyzddlschema;`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-ddlartifactsschema)
       */
      override fun ddlArtifactsSchema(): String? = unwrap(this).getDdlArtifactsSchema()

      /**
       * Sets the client statement timeout for the PostgreSQL instance, in seconds. The default
       * value is 60 seconds.
       *
       * Example: `executeTimeout=100;`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-executetimeout)
       */
      override fun executeTimeout(): Number? = unwrap(this).getExecuteTimeout()

      /**
       * When set to `true` , this value causes a task to fail if the actual size of a LOB column is
       * greater than the specified `LobMaxSize` .
       *
       * If task is set to Limited LOB mode and this option is set to true, the task fails instead
       * of truncating the LOB data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-failtasksonlobtruncation)
       */
      override fun failTasksOnLobTruncation(): Any? = unwrap(this).getFailTasksOnLobTruncation()

      /**
       * The write-ahead log (WAL) heartbeat feature mimics a dummy transaction.
       *
       * By doing this, it prevents idle logical replication slots from holding onto old WAL logs,
       * which can result in storage full situations on the source. This heartbeat keeps `restart_lsn`
       * moving and prevents storage full scenarios.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-heartbeatenable)
       */
      override fun heartbeatEnable(): Any? = unwrap(this).getHeartbeatEnable()

      /**
       * Sets the WAL heartbeat frequency (in minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-heartbeatfrequency)
       */
      override fun heartbeatFrequency(): Number? = unwrap(this).getHeartbeatFrequency()

      /**
       * Sets the schema in which the heartbeat artifacts are created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-heartbeatschema)
       */
      override fun heartbeatSchema(): String? = unwrap(this).getHeartbeatSchema()

      /**
       * When true, lets PostgreSQL migrate the boolean type as boolean.
       *
       * By default, PostgreSQL migrates booleans as `varchar(5)` . You must set this setting on
       * both the source and target endpoints for it to take effect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-mapbooleanasboolean)
       */
      override fun mapBooleanAsBoolean(): Any? = unwrap(this).getMapBooleanAsBoolean()

      /**
       * Specifies the maximum size (in KB) of any .csv file used to transfer data to PostgreSQL.
       *
       * Example: `maxFileSize=512`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-maxfilesize)
       */
      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      /**
       * Specifies the plugin to use to create a replication slot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-pluginname)
       */
      override fun pluginName(): String? = unwrap(this).getPluginName()

      /**
       * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
       * entity and grants the required permissions to access the value in `SecretsManagerSecret` .
       *
       * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the
       * AWS Secrets Manager secret that allows access to the PostgreSQL endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
       * it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-secretsmanageraccessrolearn)
       */
      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      /**
       * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
       * PostgreSQL endpoint connection details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-secretsmanagersecretid)
       */
      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      /**
       * Sets the name of a previously created logical replication slot for a change data capture
       * (CDC) load of the PostgreSQL source instance.
       *
       * When used with the `CdcStartPosition` request parameter for the AWS DMS API , this
       * attribute also makes it possible to use native CDC start points. DMS verifies that the
       * specified logical replication slot exists before starting the CDC load task. It also verifies
       * that the task was created with a valid setting of `CdcStartPosition` . If the specified slot
       * doesn't exist or the task doesn't have a valid `CdcStartPosition` setting, DMS raises an
       * error.
       *
       * For more information about setting the `CdcStartPosition` request parameter, see
       * [Determining a CDC native start
       * point](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Task.CDC.html#CHAP_Task.CDC.StartPoint.Native)
       * in the *AWS Database Migration Service User Guide* . For more information about using
       * `CdcStartPosition` , see
       * [CreateReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateReplicationTask.html)
       * ,
       * [StartReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html)
       * , and
       * [ModifyReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_ModifyReplicationTask.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html#cfn-dms-endpoint-postgresqlsettings-slotname)
       */
      override fun slotName(): String? = unwrap(this).getSlotName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PostgreSqlSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty):
          PostgreSqlSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PostgreSqlSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty
    }
  }

  public interface NeptuneSettingsProperty {
    /**
     * The number of milliseconds for AWS DMS to wait to retry a bulk-load of migrated graph data to
     * the Neptune target database before raising an error.
     *
     * The default is 250.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-errorretryduration)
     */
    public fun errorRetryDuration(): Number? = unwrap(this).getErrorRetryDuration()

    /**
     * If you want IAM authorization enabled for this endpoint, set this parameter to `true` .
     *
     * Then attach the appropriate IAM policy document to your service role specified by
     * `ServiceAccessRoleArn` . The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-iamauthenabled)
     */
    public fun iamAuthEnabled(): Any? = unwrap(this).getIamAuthEnabled()

    /**
     * The maximum size in kilobytes of migrated graph data stored in a .csv file before AWS DMS
     * bulk-loads the data to the Neptune target database. The default is 1,048,576 KB. If the bulk
     * load is successful, AWS DMS clears the bucket, ready to store the next batch of migrated graph
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-maxfilesize)
     */
    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    /**
     * The number of times for AWS DMS to retry a bulk load of migrated graph data to the Neptune
     * target database before raising an error.
     *
     * The default is 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-maxretrycount)
     */
    public fun maxRetryCount(): Number? = unwrap(this).getMaxRetryCount()

    /**
     * A folder path where you want AWS DMS to store migrated graph data in the S3 bucket specified
     * by `S3BucketName`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-s3bucketfolder)
     */
    public fun s3BucketFolder(): String? = unwrap(this).getS3BucketFolder()

    /**
     * The name of the Amazon S3 bucket where AWS DMS can temporarily store migrated graph data in
     * .csv files before bulk-loading it to the Neptune target database. AWS DMS maps the SQL source
     * data to graph data before storing it in these .csv files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-s3bucketname)
     */
    public fun s3BucketName(): String? = unwrap(this).getS3BucketName()

    /**
     * The Amazon Resource Name (ARN) of the service role that you created for the Neptune target
     * endpoint.
     *
     * The role must allow the `iam:PassRole` action.
     *
     * For more information, see [Creating an IAM Service Role for Accessing Amazon Neptune as a
     * Target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole)
     * in the *AWS Database Migration Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-serviceaccessrolearn)
     */
    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    /**
     * A builder for [NeptuneSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param errorRetryDuration The number of milliseconds for AWS DMS to wait to retry a
       * bulk-load of migrated graph data to the Neptune target database before raising an error.
       * The default is 250.
       */
      public fun errorRetryDuration(errorRetryDuration: Number)

      /**
       * @param iamAuthEnabled If you want IAM authorization enabled for this endpoint, set this
       * parameter to `true` .
       * Then attach the appropriate IAM policy document to your service role specified by
       * `ServiceAccessRoleArn` . The default is `false` .
       */
      public fun iamAuthEnabled(iamAuthEnabled: Boolean)

      /**
       * @param iamAuthEnabled If you want IAM authorization enabled for this endpoint, set this
       * parameter to `true` .
       * Then attach the appropriate IAM policy document to your service role specified by
       * `ServiceAccessRoleArn` . The default is `false` .
       */
      public fun iamAuthEnabled(iamAuthEnabled: IResolvable)

      /**
       * @param maxFileSize The maximum size in kilobytes of migrated graph data stored in a .csv
       * file before AWS DMS bulk-loads the data to the Neptune target database. The default is
       * 1,048,576 KB. If the bulk load is successful, AWS DMS clears the bucket, ready to store the
       * next batch of migrated graph data.
       */
      public fun maxFileSize(maxFileSize: Number)

      /**
       * @param maxRetryCount The number of times for AWS DMS to retry a bulk load of migrated graph
       * data to the Neptune target database before raising an error.
       * The default is 5.
       */
      public fun maxRetryCount(maxRetryCount: Number)

      /**
       * @param s3BucketFolder A folder path where you want AWS DMS to store migrated graph data in
       * the S3 bucket specified by `S3BucketName`.
       */
      public fun s3BucketFolder(s3BucketFolder: String)

      /**
       * @param s3BucketName The name of the Amazon S3 bucket where AWS DMS can temporarily store
       * migrated graph data in .csv files before bulk-loading it to the Neptune target database. AWS
       * DMS maps the SQL source data to graph data before storing it in these .csv files.
       */
      public fun s3BucketName(s3BucketName: String)

      /**
       * @param serviceAccessRoleArn The Amazon Resource Name (ARN) of the service role that you
       * created for the Neptune target endpoint.
       * The role must allow the `iam:PassRole` action.
       *
       * For more information, see [Creating an IAM Service Role for Accessing Amazon Neptune as a
       * Target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun serviceAccessRoleArn(serviceAccessRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty.builder()

      /**
       * @param errorRetryDuration The number of milliseconds for AWS DMS to wait to retry a
       * bulk-load of migrated graph data to the Neptune target database before raising an error.
       * The default is 250.
       */
      override fun errorRetryDuration(errorRetryDuration: Number) {
        cdkBuilder.errorRetryDuration(errorRetryDuration)
      }

      /**
       * @param iamAuthEnabled If you want IAM authorization enabled for this endpoint, set this
       * parameter to `true` .
       * Then attach the appropriate IAM policy document to your service role specified by
       * `ServiceAccessRoleArn` . The default is `false` .
       */
      override fun iamAuthEnabled(iamAuthEnabled: Boolean) {
        cdkBuilder.iamAuthEnabled(iamAuthEnabled)
      }

      /**
       * @param iamAuthEnabled If you want IAM authorization enabled for this endpoint, set this
       * parameter to `true` .
       * Then attach the appropriate IAM policy document to your service role specified by
       * `ServiceAccessRoleArn` . The default is `false` .
       */
      override fun iamAuthEnabled(iamAuthEnabled: IResolvable) {
        cdkBuilder.iamAuthEnabled(iamAuthEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param maxFileSize The maximum size in kilobytes of migrated graph data stored in a .csv
       * file before AWS DMS bulk-loads the data to the Neptune target database. The default is
       * 1,048,576 KB. If the bulk load is successful, AWS DMS clears the bucket, ready to store the
       * next batch of migrated graph data.
       */
      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      /**
       * @param maxRetryCount The number of times for AWS DMS to retry a bulk load of migrated graph
       * data to the Neptune target database before raising an error.
       * The default is 5.
       */
      override fun maxRetryCount(maxRetryCount: Number) {
        cdkBuilder.maxRetryCount(maxRetryCount)
      }

      /**
       * @param s3BucketFolder A folder path where you want AWS DMS to store migrated graph data in
       * the S3 bucket specified by `S3BucketName`.
       */
      override fun s3BucketFolder(s3BucketFolder: String) {
        cdkBuilder.s3BucketFolder(s3BucketFolder)
      }

      /**
       * @param s3BucketName The name of the Amazon S3 bucket where AWS DMS can temporarily store
       * migrated graph data in .csv files before bulk-loading it to the Neptune target database. AWS
       * DMS maps the SQL source data to graph data before storing it in these .csv files.
       */
      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      /**
       * @param serviceAccessRoleArn The Amazon Resource Name (ARN) of the service role that you
       * created for the Neptune target endpoint.
       * The role must allow the `iam:PassRole` action.
       *
       * For more information, see [Creating an IAM Service Role for Accessing Amazon Neptune as a
       * Target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty,
    ) : CdkObject(cdkObject), NeptuneSettingsProperty {
      /**
       * The number of milliseconds for AWS DMS to wait to retry a bulk-load of migrated graph data
       * to the Neptune target database before raising an error.
       *
       * The default is 250.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-errorretryduration)
       */
      override fun errorRetryDuration(): Number? = unwrap(this).getErrorRetryDuration()

      /**
       * If you want IAM authorization enabled for this endpoint, set this parameter to `true` .
       *
       * Then attach the appropriate IAM policy document to your service role specified by
       * `ServiceAccessRoleArn` . The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-iamauthenabled)
       */
      override fun iamAuthEnabled(): Any? = unwrap(this).getIamAuthEnabled()

      /**
       * The maximum size in kilobytes of migrated graph data stored in a .csv file before AWS DMS
       * bulk-loads the data to the Neptune target database. The default is 1,048,576 KB. If the bulk
       * load is successful, AWS DMS clears the bucket, ready to store the next batch of migrated graph
       * data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-maxfilesize)
       */
      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      /**
       * The number of times for AWS DMS to retry a bulk load of migrated graph data to the Neptune
       * target database before raising an error.
       *
       * The default is 5.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-maxretrycount)
       */
      override fun maxRetryCount(): Number? = unwrap(this).getMaxRetryCount()

      /**
       * A folder path where you want AWS DMS to store migrated graph data in the S3 bucket
       * specified by `S3BucketName`.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-s3bucketfolder)
       */
      override fun s3BucketFolder(): String? = unwrap(this).getS3BucketFolder()

      /**
       * The name of the Amazon S3 bucket where AWS DMS can temporarily store migrated graph data in
       * .csv files before bulk-loading it to the Neptune target database. AWS DMS maps the SQL source
       * data to graph data before storing it in these .csv files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-s3bucketname)
       */
      override fun s3BucketName(): String? = unwrap(this).getS3BucketName()

      /**
       * The Amazon Resource Name (ARN) of the service role that you created for the Neptune target
       * endpoint.
       *
       * The role must allow the `iam:PassRole` action.
       *
       * For more information, see [Creating an IAM Service Role for Accessing Amazon Neptune as a
       * Target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole)
       * in the *AWS Database Migration Service User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-serviceaccessrolearn)
       */
      override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NeptuneSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty):
          NeptuneSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NeptuneSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty
    }
  }

  public interface KinesisSettingsProperty {
    /**
     * Shows detailed control information for table definition, column definition, and table and
     * column changes in the Kinesis message output.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-includecontroldetails)
     */
    public fun includeControlDetails(): Any? = unwrap(this).getIncludeControlDetails()

    /**
     * Include NULL and empty columns for records migrated to the endpoint.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-includenullandempty)
     */
    public fun includeNullAndEmpty(): Any? = unwrap(this).getIncludeNullAndEmpty()

    /**
     * Shows the partition value within the Kinesis message output, unless the partition type is
     * `schema-table-type` .
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-includepartitionvalue)
     */
    public fun includePartitionValue(): Any? = unwrap(this).getIncludePartitionValue()

    /**
     * Includes any data definition language (DDL) operations that change the table in the control
     * data, such as `rename-table` , `drop-table` , `add-column` , `drop-column` , and `rename-column`
     * .
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-includetablealteroperations)
     */
    public fun includeTableAlterOperations(): Any? = unwrap(this).getIncludeTableAlterOperations()

    /**
     * Provides detailed transaction information from the source database.
     *
     * This information includes a commit timestamp, a log position, and values for `transaction_id`
     * , previous `transaction_id` , and `transaction_record_id` (the record offset within a
     * transaction). The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-includetransactiondetails)
     */
    public fun includeTransactionDetails(): Any? = unwrap(this).getIncludeTransactionDetails()

    /**
     * The output format for the records created on the endpoint.
     *
     * The message format is `JSON` (default) or `JSON_UNFORMATTED` (a single line with no tab).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-messageformat)
     */
    public fun messageFormat(): String? = unwrap(this).getMessageFormat()

    /**
     * Set this optional parameter to `true` to avoid adding a '0x' prefix to raw data in
     * hexadecimal format.
     *
     * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
     * format moving from an Oracle source to an Amazon Kinesis target. Use the `NoHexPrefix` endpoint
     * setting to enable migration of RAW data type columns without adding the '0x' prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-nohexprefix)
     */
    public fun noHexPrefix(): Any? = unwrap(this).getNoHexPrefix()

    /**
     * Prefixes schema and table names to partition values, when the partition type is
     * `primary-key-type` .
     *
     * Doing this increases data distribution among Kinesis shards. For example, suppose that a
     * SysBench schema has thousands of tables and each table has only limited range for a primary key.
     * In this case, the same primary key is sent from thousands of tables to the same shard, which
     * causes throttling. The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-partitionincludeschematable)
     */
    public fun partitionIncludeSchemaTable(): Any? = unwrap(this).getPartitionIncludeSchemaTable()

    /**
     * The Amazon Resource Name (ARN) for the IAM role that AWS DMS uses to write to the Kinesis
     * data stream.
     *
     * The role must allow the `iam:PassRole` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-serviceaccessrolearn)
     */
    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    /**
     * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-streamarn)
     */
    public fun streamArn(): String? = unwrap(this).getStreamArn()

    /**
     * A builder for [KinesisSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param includeControlDetails Shows detailed control information for table definition,
       * column definition, and table and column changes in the Kinesis message output.
       * The default is `false` .
       */
      public fun includeControlDetails(includeControlDetails: Boolean)

      /**
       * @param includeControlDetails Shows detailed control information for table definition,
       * column definition, and table and column changes in the Kinesis message output.
       * The default is `false` .
       */
      public fun includeControlDetails(includeControlDetails: IResolvable)

      /**
       * @param includeNullAndEmpty Include NULL and empty columns for records migrated to the
       * endpoint.
       * The default is `false` .
       */
      public fun includeNullAndEmpty(includeNullAndEmpty: Boolean)

      /**
       * @param includeNullAndEmpty Include NULL and empty columns for records migrated to the
       * endpoint.
       * The default is `false` .
       */
      public fun includeNullAndEmpty(includeNullAndEmpty: IResolvable)

      /**
       * @param includePartitionValue Shows the partition value within the Kinesis message output,
       * unless the partition type is `schema-table-type` .
       * The default is `false` .
       */
      public fun includePartitionValue(includePartitionValue: Boolean)

      /**
       * @param includePartitionValue Shows the partition value within the Kinesis message output,
       * unless the partition type is `schema-table-type` .
       * The default is `false` .
       */
      public fun includePartitionValue(includePartitionValue: IResolvable)

      /**
       * @param includeTableAlterOperations Includes any data definition language (DDL) operations
       * that change the table in the control data, such as `rename-table` , `drop-table` ,
       * `add-column` , `drop-column` , and `rename-column` .
       * The default is `false` .
       */
      public fun includeTableAlterOperations(includeTableAlterOperations: Boolean)

      /**
       * @param includeTableAlterOperations Includes any data definition language (DDL) operations
       * that change the table in the control data, such as `rename-table` , `drop-table` ,
       * `add-column` , `drop-column` , and `rename-column` .
       * The default is `false` .
       */
      public fun includeTableAlterOperations(includeTableAlterOperations: IResolvable)

      /**
       * @param includeTransactionDetails Provides detailed transaction information from the source
       * database.
       * This information includes a commit timestamp, a log position, and values for
       * `transaction_id` , previous `transaction_id` , and `transaction_record_id` (the record offset
       * within a transaction). The default is `false` .
       */
      public fun includeTransactionDetails(includeTransactionDetails: Boolean)

      /**
       * @param includeTransactionDetails Provides detailed transaction information from the source
       * database.
       * This information includes a commit timestamp, a log position, and values for
       * `transaction_id` , previous `transaction_id` , and `transaction_record_id` (the record offset
       * within a transaction). The default is `false` .
       */
      public fun includeTransactionDetails(includeTransactionDetails: IResolvable)

      /**
       * @param messageFormat The output format for the records created on the endpoint.
       * The message format is `JSON` (default) or `JSON_UNFORMATTED` (a single line with no tab).
       */
      public fun messageFormat(messageFormat: String)

      /**
       * @param noHexPrefix Set this optional parameter to `true` to avoid adding a '0x' prefix to
       * raw data in hexadecimal format.
       * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
       * format moving from an Oracle source to an Amazon Kinesis target. Use the `NoHexPrefix`
       * endpoint setting to enable migration of RAW data type columns without adding the '0x' prefix.
       */
      public fun noHexPrefix(noHexPrefix: Boolean)

      /**
       * @param noHexPrefix Set this optional parameter to `true` to avoid adding a '0x' prefix to
       * raw data in hexadecimal format.
       * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
       * format moving from an Oracle source to an Amazon Kinesis target. Use the `NoHexPrefix`
       * endpoint setting to enable migration of RAW data type columns without adding the '0x' prefix.
       */
      public fun noHexPrefix(noHexPrefix: IResolvable)

      /**
       * @param partitionIncludeSchemaTable Prefixes schema and table names to partition values,
       * when the partition type is `primary-key-type` .
       * Doing this increases data distribution among Kinesis shards. For example, suppose that a
       * SysBench schema has thousands of tables and each table has only limited range for a primary
       * key. In this case, the same primary key is sent from thousands of tables to the same shard,
       * which causes throttling. The default is `false` .
       */
      public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean)

      /**
       * @param partitionIncludeSchemaTable Prefixes schema and table names to partition values,
       * when the partition type is `primary-key-type` .
       * Doing this increases data distribution among Kinesis shards. For example, suppose that a
       * SysBench schema has thousands of tables and each table has only limited range for a primary
       * key. In this case, the same primary key is sent from thousands of tables to the same shard,
       * which causes throttling. The default is `false` .
       */
      public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable)

      /**
       * @param serviceAccessRoleArn The Amazon Resource Name (ARN) for the IAM role that AWS DMS
       * uses to write to the Kinesis data stream.
       * The role must allow the `iam:PassRole` action.
       */
      public fun serviceAccessRoleArn(serviceAccessRoleArn: String)

      /**
       * @param streamArn The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams
       * endpoint.
       */
      public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.builder()

      /**
       * @param includeControlDetails Shows detailed control information for table definition,
       * column definition, and table and column changes in the Kinesis message output.
       * The default is `false` .
       */
      override fun includeControlDetails(includeControlDetails: Boolean) {
        cdkBuilder.includeControlDetails(includeControlDetails)
      }

      /**
       * @param includeControlDetails Shows detailed control information for table definition,
       * column definition, and table and column changes in the Kinesis message output.
       * The default is `false` .
       */
      override fun includeControlDetails(includeControlDetails: IResolvable) {
        cdkBuilder.includeControlDetails(includeControlDetails.let(IResolvable::unwrap))
      }

      /**
       * @param includeNullAndEmpty Include NULL and empty columns for records migrated to the
       * endpoint.
       * The default is `false` .
       */
      override fun includeNullAndEmpty(includeNullAndEmpty: Boolean) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty)
      }

      /**
       * @param includeNullAndEmpty Include NULL and empty columns for records migrated to the
       * endpoint.
       * The default is `false` .
       */
      override fun includeNullAndEmpty(includeNullAndEmpty: IResolvable) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty.let(IResolvable::unwrap))
      }

      /**
       * @param includePartitionValue Shows the partition value within the Kinesis message output,
       * unless the partition type is `schema-table-type` .
       * The default is `false` .
       */
      override fun includePartitionValue(includePartitionValue: Boolean) {
        cdkBuilder.includePartitionValue(includePartitionValue)
      }

      /**
       * @param includePartitionValue Shows the partition value within the Kinesis message output,
       * unless the partition type is `schema-table-type` .
       * The default is `false` .
       */
      override fun includePartitionValue(includePartitionValue: IResolvable) {
        cdkBuilder.includePartitionValue(includePartitionValue.let(IResolvable::unwrap))
      }

      /**
       * @param includeTableAlterOperations Includes any data definition language (DDL) operations
       * that change the table in the control data, such as `rename-table` , `drop-table` ,
       * `add-column` , `drop-column` , and `rename-column` .
       * The default is `false` .
       */
      override fun includeTableAlterOperations(includeTableAlterOperations: Boolean) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations)
      }

      /**
       * @param includeTableAlterOperations Includes any data definition language (DDL) operations
       * that change the table in the control data, such as `rename-table` , `drop-table` ,
       * `add-column` , `drop-column` , and `rename-column` .
       * The default is `false` .
       */
      override fun includeTableAlterOperations(includeTableAlterOperations: IResolvable) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations.let(IResolvable::unwrap))
      }

      /**
       * @param includeTransactionDetails Provides detailed transaction information from the source
       * database.
       * This information includes a commit timestamp, a log position, and values for
       * `transaction_id` , previous `transaction_id` , and `transaction_record_id` (the record offset
       * within a transaction). The default is `false` .
       */
      override fun includeTransactionDetails(includeTransactionDetails: Boolean) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails)
      }

      /**
       * @param includeTransactionDetails Provides detailed transaction information from the source
       * database.
       * This information includes a commit timestamp, a log position, and values for
       * `transaction_id` , previous `transaction_id` , and `transaction_record_id` (the record offset
       * within a transaction). The default is `false` .
       */
      override fun includeTransactionDetails(includeTransactionDetails: IResolvable) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails.let(IResolvable::unwrap))
      }

      /**
       * @param messageFormat The output format for the records created on the endpoint.
       * The message format is `JSON` (default) or `JSON_UNFORMATTED` (a single line with no tab).
       */
      override fun messageFormat(messageFormat: String) {
        cdkBuilder.messageFormat(messageFormat)
      }

      /**
       * @param noHexPrefix Set this optional parameter to `true` to avoid adding a '0x' prefix to
       * raw data in hexadecimal format.
       * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
       * format moving from an Oracle source to an Amazon Kinesis target. Use the `NoHexPrefix`
       * endpoint setting to enable migration of RAW data type columns without adding the '0x' prefix.
       */
      override fun noHexPrefix(noHexPrefix: Boolean) {
        cdkBuilder.noHexPrefix(noHexPrefix)
      }

      /**
       * @param noHexPrefix Set this optional parameter to `true` to avoid adding a '0x' prefix to
       * raw data in hexadecimal format.
       * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
       * format moving from an Oracle source to an Amazon Kinesis target. Use the `NoHexPrefix`
       * endpoint setting to enable migration of RAW data type columns without adding the '0x' prefix.
       */
      override fun noHexPrefix(noHexPrefix: IResolvable) {
        cdkBuilder.noHexPrefix(noHexPrefix.let(IResolvable::unwrap))
      }

      /**
       * @param partitionIncludeSchemaTable Prefixes schema and table names to partition values,
       * when the partition type is `primary-key-type` .
       * Doing this increases data distribution among Kinesis shards. For example, suppose that a
       * SysBench schema has thousands of tables and each table has only limited range for a primary
       * key. In this case, the same primary key is sent from thousands of tables to the same shard,
       * which causes throttling. The default is `false` .
       */
      override fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable)
      }

      /**
       * @param partitionIncludeSchemaTable Prefixes schema and table names to partition values,
       * when the partition type is `primary-key-type` .
       * Doing this increases data distribution among Kinesis shards. For example, suppose that a
       * SysBench schema has thousands of tables and each table has only limited range for a primary
       * key. In this case, the same primary key is sent from thousands of tables to the same shard,
       * which causes throttling. The default is `false` .
       */
      override fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable.let(IResolvable::unwrap))
      }

      /**
       * @param serviceAccessRoleArn The Amazon Resource Name (ARN) for the IAM role that AWS DMS
       * uses to write to the Kinesis data stream.
       * The role must allow the `iam:PassRole` action.
       */
      override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      /**
       * @param streamArn The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams
       * endpoint.
       */
      override fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty,
    ) : CdkObject(cdkObject), KinesisSettingsProperty {
      /**
       * Shows detailed control information for table definition, column definition, and table and
       * column changes in the Kinesis message output.
       *
       * The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-includecontroldetails)
       */
      override fun includeControlDetails(): Any? = unwrap(this).getIncludeControlDetails()

      /**
       * Include NULL and empty columns for records migrated to the endpoint.
       *
       * The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-includenullandempty)
       */
      override fun includeNullAndEmpty(): Any? = unwrap(this).getIncludeNullAndEmpty()

      /**
       * Shows the partition value within the Kinesis message output, unless the partition type is
       * `schema-table-type` .
       *
       * The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-includepartitionvalue)
       */
      override fun includePartitionValue(): Any? = unwrap(this).getIncludePartitionValue()

      /**
       * Includes any data definition language (DDL) operations that change the table in the control
       * data, such as `rename-table` , `drop-table` , `add-column` , `drop-column` , and
       * `rename-column` .
       *
       * The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-includetablealteroperations)
       */
      override fun includeTableAlterOperations(): Any? =
          unwrap(this).getIncludeTableAlterOperations()

      /**
       * Provides detailed transaction information from the source database.
       *
       * This information includes a commit timestamp, a log position, and values for
       * `transaction_id` , previous `transaction_id` , and `transaction_record_id` (the record offset
       * within a transaction). The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-includetransactiondetails)
       */
      override fun includeTransactionDetails(): Any? = unwrap(this).getIncludeTransactionDetails()

      /**
       * The output format for the records created on the endpoint.
       *
       * The message format is `JSON` (default) or `JSON_UNFORMATTED` (a single line with no tab).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-messageformat)
       */
      override fun messageFormat(): String? = unwrap(this).getMessageFormat()

      /**
       * Set this optional parameter to `true` to avoid adding a '0x' prefix to raw data in
       * hexadecimal format.
       *
       * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
       * format moving from an Oracle source to an Amazon Kinesis target. Use the `NoHexPrefix`
       * endpoint setting to enable migration of RAW data type columns without adding the '0x' prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-nohexprefix)
       */
      override fun noHexPrefix(): Any? = unwrap(this).getNoHexPrefix()

      /**
       * Prefixes schema and table names to partition values, when the partition type is
       * `primary-key-type` .
       *
       * Doing this increases data distribution among Kinesis shards. For example, suppose that a
       * SysBench schema has thousands of tables and each table has only limited range for a primary
       * key. In this case, the same primary key is sent from thousands of tables to the same shard,
       * which causes throttling. The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-partitionincludeschematable)
       */
      override fun partitionIncludeSchemaTable(): Any? =
          unwrap(this).getPartitionIncludeSchemaTable()

      /**
       * The Amazon Resource Name (ARN) for the IAM role that AWS DMS uses to write to the Kinesis
       * data stream.
       *
       * The role must allow the `iam:PassRole` action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-serviceaccessrolearn)
       */
      override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

      /**
       * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kinesissettings.html#cfn-dms-endpoint-kinesissettings-streamarn)
       */
      override fun streamArn(): String? = unwrap(this).getStreamArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty):
          KinesisSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty
    }
  }

  public interface ElasticsearchSettingsProperty {
    /**
     * The endpoint for the OpenSearch cluster.
     *
     * AWS DMS uses HTTPS if a transport protocol (either HTTP or HTTPS) isn't specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-endpointuri)
     */
    public fun endpointUri(): String? = unwrap(this).getEndpointUri()

    /**
     * The maximum number of seconds for which DMS retries failed API requests to the OpenSearch
     * cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-errorretryduration)
     */
    public fun errorRetryDuration(): Number? = unwrap(this).getErrorRetryDuration()

    /**
     * The maximum percentage of records that can fail to be written before a full load operation
     * stops.
     *
     * To avoid early failure, this counter is only effective after 1,000 records are transferred.
     * OpenSearch also has the concept of error monitoring during the last 10 minutes of an Observation
     * Window. If transfer of all records fail in the last 10 minutes, the full load operation stops.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-fullloaderrorpercentage)
     */
    public fun fullLoadErrorPercentage(): Number? = unwrap(this).getFullLoadErrorPercentage()

    /**
     * The Amazon Resource Name (ARN) used by the service to access the IAM role.
     *
     * The role must allow the `iam:PassRole` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-serviceaccessrolearn)
     */
    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    /**
     * A builder for [ElasticsearchSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpointUri The endpoint for the OpenSearch cluster.
       * AWS DMS uses HTTPS if a transport protocol (either HTTP or HTTPS) isn't specified.
       */
      public fun endpointUri(endpointUri: String)

      /**
       * @param errorRetryDuration The maximum number of seconds for which DMS retries failed API
       * requests to the OpenSearch cluster.
       */
      public fun errorRetryDuration(errorRetryDuration: Number)

      /**
       * @param fullLoadErrorPercentage The maximum percentage of records that can fail to be
       * written before a full load operation stops.
       * To avoid early failure, this counter is only effective after 1,000 records are transferred.
       * OpenSearch also has the concept of error monitoring during the last 10 minutes of an
       * Observation Window. If transfer of all records fail in the last 10 minutes, the full load
       * operation stops.
       */
      public fun fullLoadErrorPercentage(fullLoadErrorPercentage: Number)

      /**
       * @param serviceAccessRoleArn The Amazon Resource Name (ARN) used by the service to access
       * the IAM role.
       * The role must allow the `iam:PassRole` action.
       */
      public fun serviceAccessRoleArn(serviceAccessRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.builder()

      /**
       * @param endpointUri The endpoint for the OpenSearch cluster.
       * AWS DMS uses HTTPS if a transport protocol (either HTTP or HTTPS) isn't specified.
       */
      override fun endpointUri(endpointUri: String) {
        cdkBuilder.endpointUri(endpointUri)
      }

      /**
       * @param errorRetryDuration The maximum number of seconds for which DMS retries failed API
       * requests to the OpenSearch cluster.
       */
      override fun errorRetryDuration(errorRetryDuration: Number) {
        cdkBuilder.errorRetryDuration(errorRetryDuration)
      }

      /**
       * @param fullLoadErrorPercentage The maximum percentage of records that can fail to be
       * written before a full load operation stops.
       * To avoid early failure, this counter is only effective after 1,000 records are transferred.
       * OpenSearch also has the concept of error monitoring during the last 10 minutes of an
       * Observation Window. If transfer of all records fail in the last 10 minutes, the full load
       * operation stops.
       */
      override fun fullLoadErrorPercentage(fullLoadErrorPercentage: Number) {
        cdkBuilder.fullLoadErrorPercentage(fullLoadErrorPercentage)
      }

      /**
       * @param serviceAccessRoleArn The Amazon Resource Name (ARN) used by the service to access
       * the IAM role.
       * The role must allow the `iam:PassRole` action.
       */
      override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty,
    ) : CdkObject(cdkObject), ElasticsearchSettingsProperty {
      /**
       * The endpoint for the OpenSearch cluster.
       *
       * AWS DMS uses HTTPS if a transport protocol (either HTTP or HTTPS) isn't specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-endpointuri)
       */
      override fun endpointUri(): String? = unwrap(this).getEndpointUri()

      /**
       * The maximum number of seconds for which DMS retries failed API requests to the OpenSearch
       * cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-errorretryduration)
       */
      override fun errorRetryDuration(): Number? = unwrap(this).getErrorRetryDuration()

      /**
       * The maximum percentage of records that can fail to be written before a full load operation
       * stops.
       *
       * To avoid early failure, this counter is only effective after 1,000 records are transferred.
       * OpenSearch also has the concept of error monitoring during the last 10 minutes of an
       * Observation Window. If transfer of all records fail in the last 10 minutes, the full load
       * operation stops.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-fullloaderrorpercentage)
       */
      override fun fullLoadErrorPercentage(): Number? = unwrap(this).getFullLoadErrorPercentage()

      /**
       * The Amazon Resource Name (ARN) used by the service to access the IAM role.
       *
       * The role must allow the `iam:PassRole` action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html#cfn-dms-endpoint-elasticsearchsettings-serviceaccessrolearn)
       */
      override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticsearchSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty):
          ElasticsearchSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty
    }
  }

  public interface RedisSettingsProperty {
    /**
     * The password provided with the `auth-role` and `auth-token` options of the `AuthType` setting
     * for a Redis target endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-authpassword)
     */
    public fun authPassword(): String? = unwrap(this).getAuthPassword()

    /**
     * The type of authentication to perform when connecting to a Redis target.
     *
     * Options include `none` , `auth-token` , and `auth-role` . The `auth-token` option requires an
     * `AuthPassword` value to be provided. The `auth-role` option requires `AuthUserName` and
     * `AuthPassword` values to be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-authtype)
     */
    public fun authType(): String? = unwrap(this).getAuthType()

    /**
     * The user name provided with the `auth-role` option of the `AuthType` setting for a Redis
     * target endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-authusername)
     */
    public fun authUserName(): String? = unwrap(this).getAuthUserName()

    /**
     * Transmission Control Protocol (TCP) port for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * Fully qualified domain name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-servername)
     */
    public fun serverName(): String? = unwrap(this).getServerName()

    /**
     * The Amazon Resource Name (ARN) for the certificate authority (CA) that DMS uses to connect to
     * your Redis target endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-sslcacertificatearn)
     */
    public fun sslCaCertificateArn(): String? = unwrap(this).getSslCaCertificateArn()

    /**
     * The connection to a Redis target endpoint using Transport Layer Security (TLS).
     *
     * Valid values include `plaintext` and `ssl-encryption` . The default is `ssl-encryption` . The
     * `ssl-encryption` option makes an encrypted connection. Optionally, you can identify an Amazon
     * Resource Name (ARN) for an SSL certificate authority (CA) using the `SslCaCertificateArn`
     * setting. If an ARN isn't given for a CA, DMS uses the Amazon root CA.
     *
     * The `plaintext` option doesn't provide Transport Layer Security (TLS) encryption for traffic
     * between endpoint and database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-sslsecurityprotocol)
     */
    public fun sslSecurityProtocol(): String? = unwrap(this).getSslSecurityProtocol()

    /**
     * A builder for [RedisSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authPassword The password provided with the `auth-role` and `auth-token` options of
       * the `AuthType` setting for a Redis target endpoint.
       */
      public fun authPassword(authPassword: String)

      /**
       * @param authType The type of authentication to perform when connecting to a Redis target.
       * Options include `none` , `auth-token` , and `auth-role` . The `auth-token` option requires
       * an `AuthPassword` value to be provided. The `auth-role` option requires `AuthUserName` and
       * `AuthPassword` values to be provided.
       */
      public fun authType(authType: String)

      /**
       * @param authUserName The user name provided with the `auth-role` option of the `AuthType`
       * setting for a Redis target endpoint.
       */
      public fun authUserName(authUserName: String)

      /**
       * @param port Transmission Control Protocol (TCP) port for the endpoint.
       */
      public fun port(port: Number)

      /**
       * @param serverName Fully qualified domain name of the endpoint.
       */
      public fun serverName(serverName: String)

      /**
       * @param sslCaCertificateArn The Amazon Resource Name (ARN) for the certificate authority
       * (CA) that DMS uses to connect to your Redis target endpoint.
       */
      public fun sslCaCertificateArn(sslCaCertificateArn: String)

      /**
       * @param sslSecurityProtocol The connection to a Redis target endpoint using Transport Layer
       * Security (TLS).
       * Valid values include `plaintext` and `ssl-encryption` . The default is `ssl-encryption` .
       * The `ssl-encryption` option makes an encrypted connection. Optionally, you can identify an
       * Amazon Resource Name (ARN) for an SSL certificate authority (CA) using the
       * `SslCaCertificateArn` setting. If an ARN isn't given for a CA, DMS uses the Amazon root CA.
       *
       * The `plaintext` option doesn't provide Transport Layer Security (TLS) encryption for
       * traffic between endpoint and database.
       */
      public fun sslSecurityProtocol(sslSecurityProtocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty.builder()

      /**
       * @param authPassword The password provided with the `auth-role` and `auth-token` options of
       * the `AuthType` setting for a Redis target endpoint.
       */
      override fun authPassword(authPassword: String) {
        cdkBuilder.authPassword(authPassword)
      }

      /**
       * @param authType The type of authentication to perform when connecting to a Redis target.
       * Options include `none` , `auth-token` , and `auth-role` . The `auth-token` option requires
       * an `AuthPassword` value to be provided. The `auth-role` option requires `AuthUserName` and
       * `AuthPassword` values to be provided.
       */
      override fun authType(authType: String) {
        cdkBuilder.authType(authType)
      }

      /**
       * @param authUserName The user name provided with the `auth-role` option of the `AuthType`
       * setting for a Redis target endpoint.
       */
      override fun authUserName(authUserName: String) {
        cdkBuilder.authUserName(authUserName)
      }

      /**
       * @param port Transmission Control Protocol (TCP) port for the endpoint.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param serverName Fully qualified domain name of the endpoint.
       */
      override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

      /**
       * @param sslCaCertificateArn The Amazon Resource Name (ARN) for the certificate authority
       * (CA) that DMS uses to connect to your Redis target endpoint.
       */
      override fun sslCaCertificateArn(sslCaCertificateArn: String) {
        cdkBuilder.sslCaCertificateArn(sslCaCertificateArn)
      }

      /**
       * @param sslSecurityProtocol The connection to a Redis target endpoint using Transport Layer
       * Security (TLS).
       * Valid values include `plaintext` and `ssl-encryption` . The default is `ssl-encryption` .
       * The `ssl-encryption` option makes an encrypted connection. Optionally, you can identify an
       * Amazon Resource Name (ARN) for an SSL certificate authority (CA) using the
       * `SslCaCertificateArn` setting. If an ARN isn't given for a CA, DMS uses the Amazon root CA.
       *
       * The `plaintext` option doesn't provide Transport Layer Security (TLS) encryption for
       * traffic between endpoint and database.
       */
      override fun sslSecurityProtocol(sslSecurityProtocol: String) {
        cdkBuilder.sslSecurityProtocol(sslSecurityProtocol)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty,
    ) : CdkObject(cdkObject), RedisSettingsProperty {
      /**
       * The password provided with the `auth-role` and `auth-token` options of the `AuthType`
       * setting for a Redis target endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-authpassword)
       */
      override fun authPassword(): String? = unwrap(this).getAuthPassword()

      /**
       * The type of authentication to perform when connecting to a Redis target.
       *
       * Options include `none` , `auth-token` , and `auth-role` . The `auth-token` option requires
       * an `AuthPassword` value to be provided. The `auth-role` option requires `AuthUserName` and
       * `AuthPassword` values to be provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-authtype)
       */
      override fun authType(): String? = unwrap(this).getAuthType()

      /**
       * The user name provided with the `auth-role` option of the `AuthType` setting for a Redis
       * target endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-authusername)
       */
      override fun authUserName(): String? = unwrap(this).getAuthUserName()

      /**
       * Transmission Control Protocol (TCP) port for the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * Fully qualified domain name of the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-servername)
       */
      override fun serverName(): String? = unwrap(this).getServerName()

      /**
       * The Amazon Resource Name (ARN) for the certificate authority (CA) that DMS uses to connect
       * to your Redis target endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-sslcacertificatearn)
       */
      override fun sslCaCertificateArn(): String? = unwrap(this).getSslCaCertificateArn()

      /**
       * The connection to a Redis target endpoint using Transport Layer Security (TLS).
       *
       * Valid values include `plaintext` and `ssl-encryption` . The default is `ssl-encryption` .
       * The `ssl-encryption` option makes an encrypted connection. Optionally, you can identify an
       * Amazon Resource Name (ARN) for an SSL certificate authority (CA) using the
       * `SslCaCertificateArn` setting. If an ARN isn't given for a CA, DMS uses the Amazon root CA.
       *
       * The `plaintext` option doesn't provide Transport Layer Security (TLS) encryption for
       * traffic between endpoint and database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html#cfn-dms-endpoint-redissettings-sslsecurityprotocol)
       */
      override fun sslSecurityProtocol(): String? = unwrap(this).getSslSecurityProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedisSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty):
          RedisSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedisSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty
    }
  }

  public interface GcpMySQLSettingsProperty {
    /**
     * Specifies a script to run immediately after AWS DMS connects to the endpoint.
     *
     * The migration task continues running regardless if the SQL statement succeeds or fails.
     *
     * For this parameter, provide the code of the script itself, not the name of a file containing
     * the script.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-afterconnectscript)
     */
    public fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

    /**
     * Adjusts the behavior of AWS DMS when migrating from an SQL Server source database that is
     * hosted as part of an Always On availability group cluster.
     *
     * If you need AWS DMS to poll all the nodes in the Always On cluster for transaction backups,
     * set this attribute to `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-cleansourcemetadataonmismatch)
     */
    public fun cleanSourceMetadataOnMismatch(): Any? =
        unwrap(this).getCleanSourceMetadataOnMismatch()

    /**
     * Database name for the endpoint.
     *
     * For a MySQL source or target endpoint, don't explicitly specify the database using the
     * `DatabaseName` request parameter on either the `CreateEndpoint` or `ModifyEndpoint` API call.
     * Specifying `DatabaseName` when you create or modify a MySQL endpoint replicates all the task
     * tables to this single database. For MySQL endpoints, you specify the database only when you
     * specify the schema in the table-mapping rules of the AWS DMS task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * Specifies how often to check the binary log for new changes/events when the database is idle.
     *
     * The default is five seconds.
     *
     * Example: `eventsPollInterval=5;`
     *
     * In the example, AWS DMS checks for changes in the binary logs every five seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-eventspollinterval)
     */
    public fun eventsPollInterval(): Number? = unwrap(this).getEventsPollInterval()

    /**
     * Specifies the maximum size (in KB) of any .csv file used to transfer data to a
     * MySQL-compatible database.
     *
     * Example: `maxFileSize=512`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-maxfilesize)
     */
    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    /**
     * Improves performance when loading data into the MySQL-compatible target database.
     *
     * Specifies how many threads to use to load the data into the MySQL-compatible target database.
     * Setting a large number of threads can have an adverse effect on database performance, because a
     * separate connection is required for each thread. The default is one.
     *
     * Example: `parallelLoadThreads=1`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-parallelloadthreads)
     */
    public fun parallelLoadThreads(): Number? = unwrap(this).getParallelLoadThreads()

    /**
     * Endpoint connection password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-password)
     */
    public fun password(): String? = unwrap(this).getPassword()

    /**
     * The port used by the endpoint database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
     * entity and grants the required permissions to access the value in `SecretsManagerSecret.` The
     * role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the AWS
     * Secrets Manager secret that allows access to the MySQL endpoint.
     *
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
     * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
     *
     * For more information on creating this `SecretsManagerSecret` , the corresponding
     * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` required to access it, see
     * [Using secrets to access AWS Database Migration Service
     * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-secretsmanageraccessrolearn)
     */
    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    /**
     * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
     * MySQL endpoint connection details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-secretsmanagersecretid)
     */
    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    /**
     * The MySQL host name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-servername)
     */
    public fun serverName(): String? = unwrap(this).getServerName()

    /**
     * Specifies the time zone for the source MySQL database. Don't enclose time zones in single
     * quotation marks.
     *
     * Example: `serverTimezone=US/Pacific;`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-servertimezone)
     */
    public fun serverTimezone(): String? = unwrap(this).getServerTimezone()

    /**
     * Endpoint connection user name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-username)
     */
    public fun username(): String? = unwrap(this).getUsername()

    /**
     * A builder for [GcpMySQLSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param afterConnectScript Specifies a script to run immediately after AWS DMS connects to
       * the endpoint.
       * The migration task continues running regardless if the SQL statement succeeds or fails.
       *
       * For this parameter, provide the code of the script itself, not the name of a file
       * containing the script.
       */
      public fun afterConnectScript(afterConnectScript: String)

      /**
       * @param cleanSourceMetadataOnMismatch Adjusts the behavior of AWS DMS when migrating from an
       * SQL Server source database that is hosted as part of an Always On availability group cluster.
       * If you need AWS DMS to poll all the nodes in the Always On cluster for transaction backups,
       * set this attribute to `false` .
       */
      public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean)

      /**
       * @param cleanSourceMetadataOnMismatch Adjusts the behavior of AWS DMS when migrating from an
       * SQL Server source database that is hosted as part of an Always On availability group cluster.
       * If you need AWS DMS to poll all the nodes in the Always On cluster for transaction backups,
       * set this attribute to `false` .
       */
      public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable)

      /**
       * @param databaseName Database name for the endpoint.
       * For a MySQL source or target endpoint, don't explicitly specify the database using the
       * `DatabaseName` request parameter on either the `CreateEndpoint` or `ModifyEndpoint` API call.
       * Specifying `DatabaseName` when you create or modify a MySQL endpoint replicates all the task
       * tables to this single database. For MySQL endpoints, you specify the database only when you
       * specify the schema in the table-mapping rules of the AWS DMS task.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param eventsPollInterval Specifies how often to check the binary log for new
       * changes/events when the database is idle.
       * The default is five seconds.
       *
       * Example: `eventsPollInterval=5;`
       *
       * In the example, AWS DMS checks for changes in the binary logs every five seconds.
       */
      public fun eventsPollInterval(eventsPollInterval: Number)

      /**
       * @param maxFileSize Specifies the maximum size (in KB) of any .csv file used to transfer
       * data to a MySQL-compatible database.
       * Example: `maxFileSize=512`
       */
      public fun maxFileSize(maxFileSize: Number)

      /**
       * @param parallelLoadThreads Improves performance when loading data into the MySQL-compatible
       * target database.
       * Specifies how many threads to use to load the data into the MySQL-compatible target
       * database. Setting a large number of threads can have an adverse effect on database
       * performance, because a separate connection is required for each thread. The default is one.
       *
       * Example: `parallelLoadThreads=1`
       */
      public fun parallelLoadThreads(parallelLoadThreads: Number)

      /**
       * @param password Endpoint connection password.
       */
      public fun password(password: String)

      /**
       * @param port The port used by the endpoint database.
       */
      public fun port(port: Number)

      /**
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret.` The role must allow the `iam:PassRole` action.
       * `SecretsManagerSecret` has the value of the AWS Secrets Manager secret that allows access to
       * the MySQL endpoint.
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` required to access it, see
       * [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the MySQL endpoint connection details.
       */
      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      /**
       * @param serverName The MySQL host name.
       */
      public fun serverName(serverName: String)

      /**
       * @param serverTimezone Specifies the time zone for the source MySQL database. Don't enclose
       * time zones in single quotation marks.
       * Example: `serverTimezone=US/Pacific;`
       */
      public fun serverTimezone(serverTimezone: String)

      /**
       * @param username Endpoint connection user name.
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty.builder()

      /**
       * @param afterConnectScript Specifies a script to run immediately after AWS DMS connects to
       * the endpoint.
       * The migration task continues running regardless if the SQL statement succeeds or fails.
       *
       * For this parameter, provide the code of the script itself, not the name of a file
       * containing the script.
       */
      override fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
      }

      /**
       * @param cleanSourceMetadataOnMismatch Adjusts the behavior of AWS DMS when migrating from an
       * SQL Server source database that is hosted as part of an Always On availability group cluster.
       * If you need AWS DMS to poll all the nodes in the Always On cluster for transaction backups,
       * set this attribute to `false` .
       */
      override fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch)
      }

      /**
       * @param cleanSourceMetadataOnMismatch Adjusts the behavior of AWS DMS when migrating from an
       * SQL Server source database that is hosted as part of an Always On availability group cluster.
       * If you need AWS DMS to poll all the nodes in the Always On cluster for transaction backups,
       * set this attribute to `false` .
       */
      override fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch.let(IResolvable::unwrap))
      }

      /**
       * @param databaseName Database name for the endpoint.
       * For a MySQL source or target endpoint, don't explicitly specify the database using the
       * `DatabaseName` request parameter on either the `CreateEndpoint` or `ModifyEndpoint` API call.
       * Specifying `DatabaseName` when you create or modify a MySQL endpoint replicates all the task
       * tables to this single database. For MySQL endpoints, you specify the database only when you
       * specify the schema in the table-mapping rules of the AWS DMS task.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param eventsPollInterval Specifies how often to check the binary log for new
       * changes/events when the database is idle.
       * The default is five seconds.
       *
       * Example: `eventsPollInterval=5;`
       *
       * In the example, AWS DMS checks for changes in the binary logs every five seconds.
       */
      override fun eventsPollInterval(eventsPollInterval: Number) {
        cdkBuilder.eventsPollInterval(eventsPollInterval)
      }

      /**
       * @param maxFileSize Specifies the maximum size (in KB) of any .csv file used to transfer
       * data to a MySQL-compatible database.
       * Example: `maxFileSize=512`
       */
      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      /**
       * @param parallelLoadThreads Improves performance when loading data into the MySQL-compatible
       * target database.
       * Specifies how many threads to use to load the data into the MySQL-compatible target
       * database. Setting a large number of threads can have an adverse effect on database
       * performance, because a separate connection is required for each thread. The default is one.
       *
       * Example: `parallelLoadThreads=1`
       */
      override fun parallelLoadThreads(parallelLoadThreads: Number) {
        cdkBuilder.parallelLoadThreads(parallelLoadThreads)
      }

      /**
       * @param password Endpoint connection password.
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
       * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
       * specifies AWS DMS as the trusted entity and grants the required permissions to access the
       * value in `SecretsManagerSecret.` The role must allow the `iam:PassRole` action.
       * `SecretsManagerSecret` has the value of the AWS Secrets Manager secret that allows access to
       * the MySQL endpoint.
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` required to access it, see
       * [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      /**
       * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
       * `SecretsManagerSecret` that contains the MySQL endpoint connection details.
       */
      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      /**
       * @param serverName The MySQL host name.
       */
      override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

      /**
       * @param serverTimezone Specifies the time zone for the source MySQL database. Don't enclose
       * time zones in single quotation marks.
       * Example: `serverTimezone=US/Pacific;`
       */
      override fun serverTimezone(serverTimezone: String) {
        cdkBuilder.serverTimezone(serverTimezone)
      }

      /**
       * @param username Endpoint connection user name.
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty,
    ) : CdkObject(cdkObject), GcpMySQLSettingsProperty {
      /**
       * Specifies a script to run immediately after AWS DMS connects to the endpoint.
       *
       * The migration task continues running regardless if the SQL statement succeeds or fails.
       *
       * For this parameter, provide the code of the script itself, not the name of a file
       * containing the script.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-afterconnectscript)
       */
      override fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

      /**
       * Adjusts the behavior of AWS DMS when migrating from an SQL Server source database that is
       * hosted as part of an Always On availability group cluster.
       *
       * If you need AWS DMS to poll all the nodes in the Always On cluster for transaction backups,
       * set this attribute to `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-cleansourcemetadataonmismatch)
       */
      override fun cleanSourceMetadataOnMismatch(): Any? =
          unwrap(this).getCleanSourceMetadataOnMismatch()

      /**
       * Database name for the endpoint.
       *
       * For a MySQL source or target endpoint, don't explicitly specify the database using the
       * `DatabaseName` request parameter on either the `CreateEndpoint` or `ModifyEndpoint` API call.
       * Specifying `DatabaseName` when you create or modify a MySQL endpoint replicates all the task
       * tables to this single database. For MySQL endpoints, you specify the database only when you
       * specify the schema in the table-mapping rules of the AWS DMS task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * Specifies how often to check the binary log for new changes/events when the database is
       * idle.
       *
       * The default is five seconds.
       *
       * Example: `eventsPollInterval=5;`
       *
       * In the example, AWS DMS checks for changes in the binary logs every five seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-eventspollinterval)
       */
      override fun eventsPollInterval(): Number? = unwrap(this).getEventsPollInterval()

      /**
       * Specifies the maximum size (in KB) of any .csv file used to transfer data to a
       * MySQL-compatible database.
       *
       * Example: `maxFileSize=512`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-maxfilesize)
       */
      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      /**
       * Improves performance when loading data into the MySQL-compatible target database.
       *
       * Specifies how many threads to use to load the data into the MySQL-compatible target
       * database. Setting a large number of threads can have an adverse effect on database
       * performance, because a separate connection is required for each thread. The default is one.
       *
       * Example: `parallelLoadThreads=1`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-parallelloadthreads)
       */
      override fun parallelLoadThreads(): Number? = unwrap(this).getParallelLoadThreads()

      /**
       * Endpoint connection password.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-password)
       */
      override fun password(): String? = unwrap(this).getPassword()

      /**
       * The port used by the endpoint database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted
       * entity and grants the required permissions to access the value in `SecretsManagerSecret.` The
       * role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the AWS
       * Secrets Manager secret that allows access to the MySQL endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
       * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
       *
       * For more information on creating this `SecretsManagerSecret` , the corresponding
       * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` required to access it, see
       * [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-secretsmanageraccessrolearn)
       */
      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      /**
       * The full ARN, partial ARN, or display name of the `SecretsManagerSecret` that contains the
       * MySQL endpoint connection details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-secretsmanagersecretid)
       */
      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      /**
       * The MySQL host name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-servername)
       */
      override fun serverName(): String? = unwrap(this).getServerName()

      /**
       * Specifies the time zone for the source MySQL database. Don't enclose time zones in single
       * quotation marks.
       *
       * Example: `serverTimezone=US/Pacific;`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-servertimezone)
       */
      override fun serverTimezone(): String? = unwrap(this).getServerTimezone()

      /**
       * Endpoint connection user name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html#cfn-dms-endpoint-gcpmysqlsettings-username)
       */
      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GcpMySQLSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty):
          GcpMySQLSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GcpMySQLSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty
    }
  }
}
