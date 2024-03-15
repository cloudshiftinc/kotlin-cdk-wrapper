@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEndpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrExternalId(): String = unwrap(this).getAttrExternalId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun certificateArn(): String? = unwrap(this).getCertificateArn()

  public open fun certificateArn(`value`: String) {
    unwrap(this).setCertificateArn(`value`)
  }

  public open fun databaseName(): String? = unwrap(this).getDatabaseName()

  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
  }

  public open fun docDbSettings(): Any? = unwrap(this).getDocDbSettings()

  public open fun docDbSettings(`value`: IResolvable) {
    unwrap(this).setDocDbSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun docDbSettings(`value`: DocDbSettingsProperty) {
    unwrap(this).setDocDbSettings(`value`.let(DocDbSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("660ba513563c9edded3380814d8115763f2f757fc8bc221c80cdf26e57d134b7")
  public open fun docDbSettings(`value`: DocDbSettingsProperty.Builder.() -> Unit): Unit =
      docDbSettings(DocDbSettingsProperty(`value`))

  public open fun dynamoDbSettings(): Any? = unwrap(this).getDynamoDbSettings()

  public open fun dynamoDbSettings(`value`: IResolvable) {
    unwrap(this).setDynamoDbSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun dynamoDbSettings(`value`: DynamoDbSettingsProperty) {
    unwrap(this).setDynamoDbSettings(`value`.let(DynamoDbSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9034c069568c7280b68dae081dc161b9b874a088d54389d3def425d0340cfff2")
  public open fun dynamoDbSettings(`value`: DynamoDbSettingsProperty.Builder.() -> Unit): Unit =
      dynamoDbSettings(DynamoDbSettingsProperty(`value`))

  public open fun elasticsearchSettings(): Any? = unwrap(this).getElasticsearchSettings()

  public open fun elasticsearchSettings(`value`: IResolvable) {
    unwrap(this).setElasticsearchSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun elasticsearchSettings(`value`: ElasticsearchSettingsProperty) {
    unwrap(this).setElasticsearchSettings(`value`.let(ElasticsearchSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbd60f0b576d3f6d500883a8a6994975dbaeb2781da55c1573451a49e8bf9889")
  public open fun elasticsearchSettings(`value`: ElasticsearchSettingsProperty.Builder.() -> Unit):
      Unit = elasticsearchSettings(ElasticsearchSettingsProperty(`value`))

  public open fun endpointIdentifier(): String? = unwrap(this).getEndpointIdentifier()

  public open fun endpointIdentifier(`value`: String) {
    unwrap(this).setEndpointIdentifier(`value`)
  }

  public open fun endpointType(): String = unwrap(this).getEndpointType()

  public open fun endpointType(`value`: String) {
    unwrap(this).setEndpointType(`value`)
  }

  public open fun engineName(): String = unwrap(this).getEngineName()

  public open fun engineName(`value`: String) {
    unwrap(this).setEngineName(`value`)
  }

  public open fun extraConnectionAttributes(): String? = unwrap(this).getExtraConnectionAttributes()

  public open fun extraConnectionAttributes(`value`: String) {
    unwrap(this).setExtraConnectionAttributes(`value`)
  }

  public open fun gcpMySqlSettings(): Any? = unwrap(this).getGcpMySqlSettings()

  public open fun gcpMySqlSettings(`value`: IResolvable) {
    unwrap(this).setGcpMySqlSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun gcpMySqlSettings(`value`: GcpMySQLSettingsProperty) {
    unwrap(this).setGcpMySqlSettings(`value`.let(GcpMySQLSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("121aff10b9337b19bbd6b4d002139fb4831daa0298eecc5331820193639dd337")
  public open fun gcpMySqlSettings(`value`: GcpMySQLSettingsProperty.Builder.() -> Unit): Unit =
      gcpMySqlSettings(GcpMySQLSettingsProperty(`value`))

  public open fun ibmDb2Settings(): Any? = unwrap(this).getIbmDb2Settings()

  public open fun ibmDb2Settings(`value`: IResolvable) {
    unwrap(this).setIbmDb2Settings(`value`.let(IResolvable::unwrap))
  }

  public open fun ibmDb2Settings(`value`: IbmDb2SettingsProperty) {
    unwrap(this).setIbmDb2Settings(`value`.let(IbmDb2SettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("548fa99f201edce990ad559532e35f0df925e0171fa4115387e3e98ba4a96f95")
  public open fun ibmDb2Settings(`value`: IbmDb2SettingsProperty.Builder.() -> Unit): Unit =
      ibmDb2Settings(IbmDb2SettingsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kafkaSettings(): Any? = unwrap(this).getKafkaSettings()

  public open fun kafkaSettings(`value`: IResolvable) {
    unwrap(this).setKafkaSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun kafkaSettings(`value`: KafkaSettingsProperty) {
    unwrap(this).setKafkaSettings(`value`.let(KafkaSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("95e6f4e24d21f907df9dab7e1c5898f4b65798f8443ff8cda12973f31be4dc39")
  public open fun kafkaSettings(`value`: KafkaSettingsProperty.Builder.() -> Unit): Unit =
      kafkaSettings(KafkaSettingsProperty(`value`))

  public open fun kinesisSettings(): Any? = unwrap(this).getKinesisSettings()

  public open fun kinesisSettings(`value`: IResolvable) {
    unwrap(this).setKinesisSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun kinesisSettings(`value`: KinesisSettingsProperty) {
    unwrap(this).setKinesisSettings(`value`.let(KinesisSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3d4ef5b51a75a54cb2ef86fdcf95a3e5e3808c6768d6bb1be49010a7881b5461")
  public open fun kinesisSettings(`value`: KinesisSettingsProperty.Builder.() -> Unit): Unit =
      kinesisSettings(KinesisSettingsProperty(`value`))

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun microsoftSqlServerSettings(): Any? = unwrap(this).getMicrosoftSqlServerSettings()

  public open fun microsoftSqlServerSettings(`value`: IResolvable) {
    unwrap(this).setMicrosoftSqlServerSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun microsoftSqlServerSettings(`value`: MicrosoftSqlServerSettingsProperty) {
    unwrap(this).setMicrosoftSqlServerSettings(`value`.let(MicrosoftSqlServerSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("01437218f3a5caa6cc9cbe0ab603838b7bf74521b6a8609feb8df795add9ad25")
  public open
      fun microsoftSqlServerSettings(`value`: MicrosoftSqlServerSettingsProperty.Builder.() -> Unit):
      Unit = microsoftSqlServerSettings(MicrosoftSqlServerSettingsProperty(`value`))

  public open fun mongoDbSettings(): Any? = unwrap(this).getMongoDbSettings()

  public open fun mongoDbSettings(`value`: IResolvable) {
    unwrap(this).setMongoDbSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun mongoDbSettings(`value`: MongoDbSettingsProperty) {
    unwrap(this).setMongoDbSettings(`value`.let(MongoDbSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("900afd38e57020dca861afd93fbf75cf09b253c3c76df71b35de01c1dbef243e")
  public open fun mongoDbSettings(`value`: MongoDbSettingsProperty.Builder.() -> Unit): Unit =
      mongoDbSettings(MongoDbSettingsProperty(`value`))

  public open fun mySqlSettings(): Any? = unwrap(this).getMySqlSettings()

  public open fun mySqlSettings(`value`: IResolvable) {
    unwrap(this).setMySqlSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun mySqlSettings(`value`: MySqlSettingsProperty) {
    unwrap(this).setMySqlSettings(`value`.let(MySqlSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b2842f57e5fd2da1e7c083d37c4640f5f0ce04f90af7fe403829040cf6b83259")
  public open fun mySqlSettings(`value`: MySqlSettingsProperty.Builder.() -> Unit): Unit =
      mySqlSettings(MySqlSettingsProperty(`value`))

  public open fun neptuneSettings(): Any? = unwrap(this).getNeptuneSettings()

  public open fun neptuneSettings(`value`: IResolvable) {
    unwrap(this).setNeptuneSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun neptuneSettings(`value`: NeptuneSettingsProperty) {
    unwrap(this).setNeptuneSettings(`value`.let(NeptuneSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c5cdb046e330a82d2dd332354a509039f53e5c137dbcfbc720d79c1424c373d")
  public open fun neptuneSettings(`value`: NeptuneSettingsProperty.Builder.() -> Unit): Unit =
      neptuneSettings(NeptuneSettingsProperty(`value`))

  public open fun oracleSettings(): Any? = unwrap(this).getOracleSettings()

  public open fun oracleSettings(`value`: IResolvable) {
    unwrap(this).setOracleSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun oracleSettings(`value`: OracleSettingsProperty) {
    unwrap(this).setOracleSettings(`value`.let(OracleSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5b1993a4b442a16d979b1a29c61d6d55c69ae05d0aaec755b0c2798da12c9942")
  public open fun oracleSettings(`value`: OracleSettingsProperty.Builder.() -> Unit): Unit =
      oracleSettings(OracleSettingsProperty(`value`))

  public open fun password(): String? = unwrap(this).getPassword()

  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

  public open fun port(): Number? = unwrap(this).getPort()

  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  public open fun postgreSqlSettings(): Any? = unwrap(this).getPostgreSqlSettings()

  public open fun postgreSqlSettings(`value`: IResolvable) {
    unwrap(this).setPostgreSqlSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun postgreSqlSettings(`value`: PostgreSqlSettingsProperty) {
    unwrap(this).setPostgreSqlSettings(`value`.let(PostgreSqlSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dbf585dfd45f1f7348cad73b39ebec3b12ed32319d8323cd25b2cfc80b2cb198")
  public open fun postgreSqlSettings(`value`: PostgreSqlSettingsProperty.Builder.() -> Unit): Unit =
      postgreSqlSettings(PostgreSqlSettingsProperty(`value`))

  public open fun redisSettings(): Any? = unwrap(this).getRedisSettings()

  public open fun redisSettings(`value`: IResolvable) {
    unwrap(this).setRedisSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun redisSettings(`value`: RedisSettingsProperty) {
    unwrap(this).setRedisSettings(`value`.let(RedisSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b19598a5a78fa2526e5549744f83473195dafb9c5aa1c59f6d006f7f6dff6267")
  public open fun redisSettings(`value`: RedisSettingsProperty.Builder.() -> Unit): Unit =
      redisSettings(RedisSettingsProperty(`value`))

  public open fun redshiftSettings(): Any? = unwrap(this).getRedshiftSettings()

  public open fun redshiftSettings(`value`: IResolvable) {
    unwrap(this).setRedshiftSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun redshiftSettings(`value`: RedshiftSettingsProperty) {
    unwrap(this).setRedshiftSettings(`value`.let(RedshiftSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38edadac4542346809cbed29359c4f8e4eddcc3e44939f4b3c520241c070ca1e")
  public open fun redshiftSettings(`value`: RedshiftSettingsProperty.Builder.() -> Unit): Unit =
      redshiftSettings(RedshiftSettingsProperty(`value`))

  public open fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  public open fun s3Settings(): Any? = unwrap(this).getS3Settings()

  public open fun s3Settings(`value`: IResolvable) {
    unwrap(this).setS3Settings(`value`.let(IResolvable::unwrap))
  }

  public open fun s3Settings(`value`: S3SettingsProperty) {
    unwrap(this).setS3Settings(`value`.let(S3SettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("21c1f4a4c8d859a05f5b1573a62aa9c1b814692320bc4cf77cf2b34cc2a6c2cf")
  public open fun s3Settings(`value`: S3SettingsProperty.Builder.() -> Unit): Unit =
      s3Settings(S3SettingsProperty(`value`))

  public open fun serverName(): String? = unwrap(this).getServerName()

  public open fun serverName(`value`: String) {
    unwrap(this).setServerName(`value`)
  }

  public open fun sslMode(): String? = unwrap(this).getSslMode()

  public open fun sslMode(`value`: String) {
    unwrap(this).setSslMode(`value`)
  }

  public open fun sybaseSettings(): Any? = unwrap(this).getSybaseSettings()

  public open fun sybaseSettings(`value`: IResolvable) {
    unwrap(this).setSybaseSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun sybaseSettings(`value`: SybaseSettingsProperty) {
    unwrap(this).setSybaseSettings(`value`.let(SybaseSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f0d2fc4245ed559777df72eff656ba7d3742cf4c102193bbcb4ba41f9ff7d3cc")
  public open fun sybaseSettings(`value`: SybaseSettingsProperty.Builder.() -> Unit): Unit =
      sybaseSettings(SybaseSettingsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun username(): String? = unwrap(this).getUsername()

  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun certificateArn(certificateArn: String)

    public fun databaseName(databaseName: String)

    public fun docDbSettings(docDbSettings: IResolvable)

    public fun docDbSettings(docDbSettings: DocDbSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fbde66ac654b5397d727e318fc72d4c5e0ed2add843d1a60ae50a069d8cf78d")
    public fun docDbSettings(docDbSettings: DocDbSettingsProperty.Builder.() -> Unit)

    public fun dynamoDbSettings(dynamoDbSettings: IResolvable)

    public fun dynamoDbSettings(dynamoDbSettings: DynamoDbSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5cdc3c3c4090352539fd080a3d02f6645a0a6109d09f40cc53594a993068d096")
    public fun dynamoDbSettings(dynamoDbSettings: DynamoDbSettingsProperty.Builder.() -> Unit)

    public fun elasticsearchSettings(elasticsearchSettings: IResolvable)

    public fun elasticsearchSettings(elasticsearchSettings: ElasticsearchSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("889d325b4eeeb0880dc74130a7f1cc5cebd2323685790c333d6149a4f2bfcb8f")
    public
        fun elasticsearchSettings(elasticsearchSettings: ElasticsearchSettingsProperty.Builder.() -> Unit)

    public fun endpointIdentifier(endpointIdentifier: String)

    public fun endpointType(endpointType: String)

    public fun engineName(engineName: String)

    public fun extraConnectionAttributes(extraConnectionAttributes: String)

    public fun gcpMySqlSettings(gcpMySqlSettings: IResolvable)

    public fun gcpMySqlSettings(gcpMySqlSettings: GcpMySQLSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("925d4ba9af14d43c38e62d809c4a9bfbfc5cb3d9712b4896f8527703dd9b701e")
    public fun gcpMySqlSettings(gcpMySqlSettings: GcpMySQLSettingsProperty.Builder.() -> Unit)

    public fun ibmDb2Settings(ibmDb2Settings: IResolvable)

    public fun ibmDb2Settings(ibmDb2Settings: IbmDb2SettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a55b78aff146203eb19a530ed10a3898c4b42f0d0fc717956cb7c7f6b0c6fac8")
    public fun ibmDb2Settings(ibmDb2Settings: IbmDb2SettingsProperty.Builder.() -> Unit)

    public fun kafkaSettings(kafkaSettings: IResolvable)

    public fun kafkaSettings(kafkaSettings: KafkaSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9ed867348022b36c7694b652e12b1cacfa29155ed279f155e9b6a8ede7b2075")
    public fun kafkaSettings(kafkaSettings: KafkaSettingsProperty.Builder.() -> Unit)

    public fun kinesisSettings(kinesisSettings: IResolvable)

    public fun kinesisSettings(kinesisSettings: KinesisSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96defed71e91fdb933b12d6dd79a8a2249d0156ed38c4ecfcd729da4e63e7bd2")
    public fun kinesisSettings(kinesisSettings: KinesisSettingsProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable)

    public
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adbf309f1b82d81fad56f56705008f24acb04801869f82f113e9ca86220eba07")
    public
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty.Builder.() -> Unit)

    public fun mongoDbSettings(mongoDbSettings: IResolvable)

    public fun mongoDbSettings(mongoDbSettings: MongoDbSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("050ff78e40a1395c73c5b4f2c039e024a8067554393984a41d14a33f0eac6cf4")
    public fun mongoDbSettings(mongoDbSettings: MongoDbSettingsProperty.Builder.() -> Unit)

    public fun mySqlSettings(mySqlSettings: IResolvable)

    public fun mySqlSettings(mySqlSettings: MySqlSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c1ef3d7d8d9c26762a1b5268ba864ccfdce78bc3570d3083b6493d47e37b54")
    public fun mySqlSettings(mySqlSettings: MySqlSettingsProperty.Builder.() -> Unit)

    public fun neptuneSettings(neptuneSettings: IResolvable)

    public fun neptuneSettings(neptuneSettings: NeptuneSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f44b6d9df7919882c0942ce2d41354a6064d5c40384ff1834ce0fa81ae5d2bb7")
    public fun neptuneSettings(neptuneSettings: NeptuneSettingsProperty.Builder.() -> Unit)

    public fun oracleSettings(oracleSettings: IResolvable)

    public fun oracleSettings(oracleSettings: OracleSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf0444a7326a153335d36ebdb3dd8d1f3540e068cbdbf7f679c3a4032dccea88")
    public fun oracleSettings(oracleSettings: OracleSettingsProperty.Builder.() -> Unit)

    public fun password(password: String)

    public fun port(port: Number)

    public fun postgreSqlSettings(postgreSqlSettings: IResolvable)

    public fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90679fdd6b6c393ffe4be191fbab0408dfed36b58b34c62d52ff4d5baccc34ce")
    public fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty.Builder.() -> Unit)

    public fun redisSettings(redisSettings: IResolvable)

    public fun redisSettings(redisSettings: RedisSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57864a08b297d92b7b750737cdfc05fd8a6e6de6d220bb98b268830aefc86d30")
    public fun redisSettings(redisSettings: RedisSettingsProperty.Builder.() -> Unit)

    public fun redshiftSettings(redshiftSettings: IResolvable)

    public fun redshiftSettings(redshiftSettings: RedshiftSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11b670292b1e44ce7dda450ac19ef54cc289ada19014482359d029ad114fcb7e")
    public fun redshiftSettings(redshiftSettings: RedshiftSettingsProperty.Builder.() -> Unit)

    public fun resourceIdentifier(resourceIdentifier: String)

    public fun s3Settings(s3Settings: IResolvable)

    public fun s3Settings(s3Settings: S3SettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f3e786c777d40066e00740f0ac855a1f9f1dbcb38b044b134764b13af1cbcce")
    public fun s3Settings(s3Settings: S3SettingsProperty.Builder.() -> Unit)

    public fun serverName(serverName: String)

    public fun sslMode(sslMode: String)

    public fun sybaseSettings(sybaseSettings: IResolvable)

    public fun sybaseSettings(sybaseSettings: SybaseSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40dcc88d57b0b2dd6f75aa352d9dae019e3e8de6e8a1892482e39a7ef92fe742")
    public fun sybaseSettings(sybaseSettings: SybaseSettingsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun username(username: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnEndpoint.Builder =
        software.amazon.awscdk.services.dms.CfnEndpoint.Builder.create(scope, id)

    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    override fun docDbSettings(docDbSettings: IResolvable) {
      cdkBuilder.docDbSettings(docDbSettings.let(IResolvable::unwrap))
    }

    override fun docDbSettings(docDbSettings: DocDbSettingsProperty) {
      cdkBuilder.docDbSettings(docDbSettings.let(DocDbSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fbde66ac654b5397d727e318fc72d4c5e0ed2add843d1a60ae50a069d8cf78d")
    override fun docDbSettings(docDbSettings: DocDbSettingsProperty.Builder.() -> Unit): Unit =
        docDbSettings(DocDbSettingsProperty(docDbSettings))

    override fun dynamoDbSettings(dynamoDbSettings: IResolvable) {
      cdkBuilder.dynamoDbSettings(dynamoDbSettings.let(IResolvable::unwrap))
    }

    override fun dynamoDbSettings(dynamoDbSettings: DynamoDbSettingsProperty) {
      cdkBuilder.dynamoDbSettings(dynamoDbSettings.let(DynamoDbSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5cdc3c3c4090352539fd080a3d02f6645a0a6109d09f40cc53594a993068d096")
    override fun dynamoDbSettings(dynamoDbSettings: DynamoDbSettingsProperty.Builder.() -> Unit):
        Unit = dynamoDbSettings(DynamoDbSettingsProperty(dynamoDbSettings))

    override fun elasticsearchSettings(elasticsearchSettings: IResolvable) {
      cdkBuilder.elasticsearchSettings(elasticsearchSettings.let(IResolvable::unwrap))
    }

    override fun elasticsearchSettings(elasticsearchSettings: ElasticsearchSettingsProperty) {
      cdkBuilder.elasticsearchSettings(elasticsearchSettings.let(ElasticsearchSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("889d325b4eeeb0880dc74130a7f1cc5cebd2323685790c333d6149a4f2bfcb8f")
    override
        fun elasticsearchSettings(elasticsearchSettings: ElasticsearchSettingsProperty.Builder.() -> Unit):
        Unit = elasticsearchSettings(ElasticsearchSettingsProperty(elasticsearchSettings))

    override fun endpointIdentifier(endpointIdentifier: String) {
      cdkBuilder.endpointIdentifier(endpointIdentifier)
    }

    override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    override fun engineName(engineName: String) {
      cdkBuilder.engineName(engineName)
    }

    override fun extraConnectionAttributes(extraConnectionAttributes: String) {
      cdkBuilder.extraConnectionAttributes(extraConnectionAttributes)
    }

    override fun gcpMySqlSettings(gcpMySqlSettings: IResolvable) {
      cdkBuilder.gcpMySqlSettings(gcpMySqlSettings.let(IResolvable::unwrap))
    }

    override fun gcpMySqlSettings(gcpMySqlSettings: GcpMySQLSettingsProperty) {
      cdkBuilder.gcpMySqlSettings(gcpMySqlSettings.let(GcpMySQLSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("925d4ba9af14d43c38e62d809c4a9bfbfc5cb3d9712b4896f8527703dd9b701e")
    override fun gcpMySqlSettings(gcpMySqlSettings: GcpMySQLSettingsProperty.Builder.() -> Unit):
        Unit = gcpMySqlSettings(GcpMySQLSettingsProperty(gcpMySqlSettings))

    override fun ibmDb2Settings(ibmDb2Settings: IResolvable) {
      cdkBuilder.ibmDb2Settings(ibmDb2Settings.let(IResolvable::unwrap))
    }

    override fun ibmDb2Settings(ibmDb2Settings: IbmDb2SettingsProperty) {
      cdkBuilder.ibmDb2Settings(ibmDb2Settings.let(IbmDb2SettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a55b78aff146203eb19a530ed10a3898c4b42f0d0fc717956cb7c7f6b0c6fac8")
    override fun ibmDb2Settings(ibmDb2Settings: IbmDb2SettingsProperty.Builder.() -> Unit): Unit =
        ibmDb2Settings(IbmDb2SettingsProperty(ibmDb2Settings))

    override fun kafkaSettings(kafkaSettings: IResolvable) {
      cdkBuilder.kafkaSettings(kafkaSettings.let(IResolvable::unwrap))
    }

    override fun kafkaSettings(kafkaSettings: KafkaSettingsProperty) {
      cdkBuilder.kafkaSettings(kafkaSettings.let(KafkaSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9ed867348022b36c7694b652e12b1cacfa29155ed279f155e9b6a8ede7b2075")
    override fun kafkaSettings(kafkaSettings: KafkaSettingsProperty.Builder.() -> Unit): Unit =
        kafkaSettings(KafkaSettingsProperty(kafkaSettings))

    override fun kinesisSettings(kinesisSettings: IResolvable) {
      cdkBuilder.kinesisSettings(kinesisSettings.let(IResolvable::unwrap))
    }

    override fun kinesisSettings(kinesisSettings: KinesisSettingsProperty) {
      cdkBuilder.kinesisSettings(kinesisSettings.let(KinesisSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96defed71e91fdb933b12d6dd79a8a2249d0156ed38c4ecfcd729da4e63e7bd2")
    override fun kinesisSettings(kinesisSettings: KinesisSettingsProperty.Builder.() -> Unit): Unit
        = kinesisSettings(KinesisSettingsProperty(kinesisSettings))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable) {
      cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings.let(IResolvable::unwrap))
    }

    override
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty) {
      cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings.let(MicrosoftSqlServerSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adbf309f1b82d81fad56f56705008f24acb04801869f82f113e9ca86220eba07")
    override
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty.Builder.() -> Unit):
        Unit =
        microsoftSqlServerSettings(MicrosoftSqlServerSettingsProperty(microsoftSqlServerSettings))

    override fun mongoDbSettings(mongoDbSettings: IResolvable) {
      cdkBuilder.mongoDbSettings(mongoDbSettings.let(IResolvable::unwrap))
    }

    override fun mongoDbSettings(mongoDbSettings: MongoDbSettingsProperty) {
      cdkBuilder.mongoDbSettings(mongoDbSettings.let(MongoDbSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("050ff78e40a1395c73c5b4f2c039e024a8067554393984a41d14a33f0eac6cf4")
    override fun mongoDbSettings(mongoDbSettings: MongoDbSettingsProperty.Builder.() -> Unit): Unit
        = mongoDbSettings(MongoDbSettingsProperty(mongoDbSettings))

    override fun mySqlSettings(mySqlSettings: IResolvable) {
      cdkBuilder.mySqlSettings(mySqlSettings.let(IResolvable::unwrap))
    }

    override fun mySqlSettings(mySqlSettings: MySqlSettingsProperty) {
      cdkBuilder.mySqlSettings(mySqlSettings.let(MySqlSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c1ef3d7d8d9c26762a1b5268ba864ccfdce78bc3570d3083b6493d47e37b54")
    override fun mySqlSettings(mySqlSettings: MySqlSettingsProperty.Builder.() -> Unit): Unit =
        mySqlSettings(MySqlSettingsProperty(mySqlSettings))

    override fun neptuneSettings(neptuneSettings: IResolvable) {
      cdkBuilder.neptuneSettings(neptuneSettings.let(IResolvable::unwrap))
    }

    override fun neptuneSettings(neptuneSettings: NeptuneSettingsProperty) {
      cdkBuilder.neptuneSettings(neptuneSettings.let(NeptuneSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f44b6d9df7919882c0942ce2d41354a6064d5c40384ff1834ce0fa81ae5d2bb7")
    override fun neptuneSettings(neptuneSettings: NeptuneSettingsProperty.Builder.() -> Unit): Unit
        = neptuneSettings(NeptuneSettingsProperty(neptuneSettings))

    override fun oracleSettings(oracleSettings: IResolvable) {
      cdkBuilder.oracleSettings(oracleSettings.let(IResolvable::unwrap))
    }

    override fun oracleSettings(oracleSettings: OracleSettingsProperty) {
      cdkBuilder.oracleSettings(oracleSettings.let(OracleSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf0444a7326a153335d36ebdb3dd8d1f3540e068cbdbf7f679c3a4032dccea88")
    override fun oracleSettings(oracleSettings: OracleSettingsProperty.Builder.() -> Unit): Unit =
        oracleSettings(OracleSettingsProperty(oracleSettings))

    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun postgreSqlSettings(postgreSqlSettings: IResolvable) {
      cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(IResolvable::unwrap))
    }

    override fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty) {
      cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(PostgreSqlSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90679fdd6b6c393ffe4be191fbab0408dfed36b58b34c62d52ff4d5baccc34ce")
    override
        fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty.Builder.() -> Unit):
        Unit = postgreSqlSettings(PostgreSqlSettingsProperty(postgreSqlSettings))

    override fun redisSettings(redisSettings: IResolvable) {
      cdkBuilder.redisSettings(redisSettings.let(IResolvable::unwrap))
    }

    override fun redisSettings(redisSettings: RedisSettingsProperty) {
      cdkBuilder.redisSettings(redisSettings.let(RedisSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57864a08b297d92b7b750737cdfc05fd8a6e6de6d220bb98b268830aefc86d30")
    override fun redisSettings(redisSettings: RedisSettingsProperty.Builder.() -> Unit): Unit =
        redisSettings(RedisSettingsProperty(redisSettings))

    override fun redshiftSettings(redshiftSettings: IResolvable) {
      cdkBuilder.redshiftSettings(redshiftSettings.let(IResolvable::unwrap))
    }

    override fun redshiftSettings(redshiftSettings: RedshiftSettingsProperty) {
      cdkBuilder.redshiftSettings(redshiftSettings.let(RedshiftSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11b670292b1e44ce7dda450ac19ef54cc289ada19014482359d029ad114fcb7e")
    override fun redshiftSettings(redshiftSettings: RedshiftSettingsProperty.Builder.() -> Unit):
        Unit = redshiftSettings(RedshiftSettingsProperty(redshiftSettings))

    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    override fun s3Settings(s3Settings: IResolvable) {
      cdkBuilder.s3Settings(s3Settings.let(IResolvable::unwrap))
    }

    override fun s3Settings(s3Settings: S3SettingsProperty) {
      cdkBuilder.s3Settings(s3Settings.let(S3SettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f3e786c777d40066e00740f0ac855a1f9f1dbcb38b044b134764b13af1cbcce")
    override fun s3Settings(s3Settings: S3SettingsProperty.Builder.() -> Unit): Unit =
        s3Settings(S3SettingsProperty(s3Settings))

    override fun serverName(serverName: String) {
      cdkBuilder.serverName(serverName)
    }

    override fun sslMode(sslMode: String) {
      cdkBuilder.sslMode(sslMode)
    }

    override fun sybaseSettings(sybaseSettings: IResolvable) {
      cdkBuilder.sybaseSettings(sybaseSettings.let(IResolvable::unwrap))
    }

    override fun sybaseSettings(sybaseSettings: SybaseSettingsProperty) {
      cdkBuilder.sybaseSettings(sybaseSettings.let(SybaseSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40dcc88d57b0b2dd6f75aa352d9dae019e3e8de6e8a1892482e39a7ef92fe742")
    override fun sybaseSettings(sybaseSettings: SybaseSettingsProperty.Builder.() -> Unit): Unit =
        sybaseSettings(SybaseSettingsProperty(sybaseSettings))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
    public fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

    public fun cleanSourceMetadataOnMismatch(): Any? =
        unwrap(this).getCleanSourceMetadataOnMismatch()

    public fun eventsPollInterval(): Number? = unwrap(this).getEventsPollInterval()

    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    public fun parallelLoadThreads(): Number? = unwrap(this).getParallelLoadThreads()

    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    public fun serverTimezone(): String? = unwrap(this).getServerTimezone()

    public fun targetDbType(): String? = unwrap(this).getTargetDbType()

    @CdkDslMarker
    public interface Builder {
      public fun afterConnectScript(afterConnectScript: String)

      public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean)

      public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable)

      public fun eventsPollInterval(eventsPollInterval: Number)

      public fun maxFileSize(maxFileSize: Number)

      public fun parallelLoadThreads(parallelLoadThreads: Number)

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      public fun serverTimezone(serverTimezone: String)

      public fun targetDbType(targetDbType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty.builder()

      override fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
      }

      override fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch)
      }

      override fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch.let(IResolvable::unwrap))
      }

      override fun eventsPollInterval(eventsPollInterval: Number) {
        cdkBuilder.eventsPollInterval(eventsPollInterval)
      }

      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      override fun parallelLoadThreads(parallelLoadThreads: Number) {
        cdkBuilder.parallelLoadThreads(parallelLoadThreads)
      }

      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      override fun serverTimezone(serverTimezone: String) {
        cdkBuilder.serverTimezone(serverTimezone)
      }

      override fun targetDbType(targetDbType: String) {
        cdkBuilder.targetDbType(targetDbType)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty,
    ) : CdkObject(cdkObject), MySqlSettingsProperty {
      override fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

      override fun cleanSourceMetadataOnMismatch(): Any? =
          unwrap(this).getCleanSourceMetadataOnMismatch()

      override fun eventsPollInterval(): Number? = unwrap(this).getEventsPollInterval()

      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      override fun parallelLoadThreads(): Number? = unwrap(this).getParallelLoadThreads()

      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      override fun serverTimezone(): String? = unwrap(this).getServerTimezone()

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
    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    @CdkDslMarker
    public interface Builder {
      public fun serviceAccessRoleArn(serviceAccessRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty.builder()

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
    public fun broker(): String? = unwrap(this).getBroker()

    public fun includeControlDetails(): Any? = unwrap(this).getIncludeControlDetails()

    public fun includeNullAndEmpty(): Any? = unwrap(this).getIncludeNullAndEmpty()

    public fun includePartitionValue(): Any? = unwrap(this).getIncludePartitionValue()

    public fun includeTableAlterOperations(): Any? = unwrap(this).getIncludeTableAlterOperations()

    public fun includeTransactionDetails(): Any? = unwrap(this).getIncludeTransactionDetails()

    public fun messageFormat(): String? = unwrap(this).getMessageFormat()

    public fun messageMaxBytes(): Number? = unwrap(this).getMessageMaxBytes()

    public fun noHexPrefix(): Any? = unwrap(this).getNoHexPrefix()

    public fun partitionIncludeSchemaTable(): Any? = unwrap(this).getPartitionIncludeSchemaTable()

    public fun saslPassword(): String? = unwrap(this).getSaslPassword()

    public fun saslUserName(): String? = unwrap(this).getSaslUserName()

    public fun securityProtocol(): String? = unwrap(this).getSecurityProtocol()

    public fun sslCaCertificateArn(): String? = unwrap(this).getSslCaCertificateArn()

    public fun sslClientCertificateArn(): String? = unwrap(this).getSslClientCertificateArn()

    public fun sslClientKeyArn(): String? = unwrap(this).getSslClientKeyArn()

    public fun sslClientKeyPassword(): String? = unwrap(this).getSslClientKeyPassword()

    public fun topic(): String? = unwrap(this).getTopic()

    @CdkDslMarker
    public interface Builder {
      public fun broker(broker: String)

      public fun includeControlDetails(includeControlDetails: Boolean)

      public fun includeControlDetails(includeControlDetails: IResolvable)

      public fun includeNullAndEmpty(includeNullAndEmpty: Boolean)

      public fun includeNullAndEmpty(includeNullAndEmpty: IResolvable)

      public fun includePartitionValue(includePartitionValue: Boolean)

      public fun includePartitionValue(includePartitionValue: IResolvable)

      public fun includeTableAlterOperations(includeTableAlterOperations: Boolean)

      public fun includeTableAlterOperations(includeTableAlterOperations: IResolvable)

      public fun includeTransactionDetails(includeTransactionDetails: Boolean)

      public fun includeTransactionDetails(includeTransactionDetails: IResolvable)

      public fun messageFormat(messageFormat: String)

      public fun messageMaxBytes(messageMaxBytes: Number)

      public fun noHexPrefix(noHexPrefix: Boolean)

      public fun noHexPrefix(noHexPrefix: IResolvable)

      public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean)

      public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable)

      public fun saslPassword(saslPassword: String)

      public fun saslUserName(saslUserName: String)

      public fun securityProtocol(securityProtocol: String)

      public fun sslCaCertificateArn(sslCaCertificateArn: String)

      public fun sslClientCertificateArn(sslClientCertificateArn: String)

      public fun sslClientKeyArn(sslClientKeyArn: String)

      public fun sslClientKeyPassword(sslClientKeyPassword: String)

      public fun topic(topic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty.builder()

      override fun broker(broker: String) {
        cdkBuilder.broker(broker)
      }

      override fun includeControlDetails(includeControlDetails: Boolean) {
        cdkBuilder.includeControlDetails(includeControlDetails)
      }

      override fun includeControlDetails(includeControlDetails: IResolvable) {
        cdkBuilder.includeControlDetails(includeControlDetails.let(IResolvable::unwrap))
      }

      override fun includeNullAndEmpty(includeNullAndEmpty: Boolean) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty)
      }

      override fun includeNullAndEmpty(includeNullAndEmpty: IResolvable) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty.let(IResolvable::unwrap))
      }

      override fun includePartitionValue(includePartitionValue: Boolean) {
        cdkBuilder.includePartitionValue(includePartitionValue)
      }

      override fun includePartitionValue(includePartitionValue: IResolvable) {
        cdkBuilder.includePartitionValue(includePartitionValue.let(IResolvable::unwrap))
      }

      override fun includeTableAlterOperations(includeTableAlterOperations: Boolean) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations)
      }

      override fun includeTableAlterOperations(includeTableAlterOperations: IResolvable) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations.let(IResolvable::unwrap))
      }

      override fun includeTransactionDetails(includeTransactionDetails: Boolean) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails)
      }

      override fun includeTransactionDetails(includeTransactionDetails: IResolvable) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails.let(IResolvable::unwrap))
      }

      override fun messageFormat(messageFormat: String) {
        cdkBuilder.messageFormat(messageFormat)
      }

      override fun messageMaxBytes(messageMaxBytes: Number) {
        cdkBuilder.messageMaxBytes(messageMaxBytes)
      }

      override fun noHexPrefix(noHexPrefix: Boolean) {
        cdkBuilder.noHexPrefix(noHexPrefix)
      }

      override fun noHexPrefix(noHexPrefix: IResolvable) {
        cdkBuilder.noHexPrefix(noHexPrefix.let(IResolvable::unwrap))
      }

      override fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable)
      }

      override fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable.let(IResolvable::unwrap))
      }

      override fun saslPassword(saslPassword: String) {
        cdkBuilder.saslPassword(saslPassword)
      }

      override fun saslUserName(saslUserName: String) {
        cdkBuilder.saslUserName(saslUserName)
      }

      override fun securityProtocol(securityProtocol: String) {
        cdkBuilder.securityProtocol(securityProtocol)
      }

      override fun sslCaCertificateArn(sslCaCertificateArn: String) {
        cdkBuilder.sslCaCertificateArn(sslCaCertificateArn)
      }

      override fun sslClientCertificateArn(sslClientCertificateArn: String) {
        cdkBuilder.sslClientCertificateArn(sslClientCertificateArn)
      }

      override fun sslClientKeyArn(sslClientKeyArn: String) {
        cdkBuilder.sslClientKeyArn(sslClientKeyArn)
      }

      override fun sslClientKeyPassword(sslClientKeyPassword: String) {
        cdkBuilder.sslClientKeyPassword(sslClientKeyPassword)
      }

      override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty,
    ) : CdkObject(cdkObject), KafkaSettingsProperty {
      override fun broker(): String? = unwrap(this).getBroker()

      override fun includeControlDetails(): Any? = unwrap(this).getIncludeControlDetails()

      override fun includeNullAndEmpty(): Any? = unwrap(this).getIncludeNullAndEmpty()

      override fun includePartitionValue(): Any? = unwrap(this).getIncludePartitionValue()

      override fun includeTableAlterOperations(): Any? =
          unwrap(this).getIncludeTableAlterOperations()

      override fun includeTransactionDetails(): Any? = unwrap(this).getIncludeTransactionDetails()

      override fun messageFormat(): String? = unwrap(this).getMessageFormat()

      override fun messageMaxBytes(): Number? = unwrap(this).getMessageMaxBytes()

      override fun noHexPrefix(): Any? = unwrap(this).getNoHexPrefix()

      override fun partitionIncludeSchemaTable(): Any? =
          unwrap(this).getPartitionIncludeSchemaTable()

      override fun saslPassword(): String? = unwrap(this).getSaslPassword()

      override fun saslUserName(): String? = unwrap(this).getSaslUserName()

      override fun securityProtocol(): String? = unwrap(this).getSecurityProtocol()

      override fun sslCaCertificateArn(): String? = unwrap(this).getSslCaCertificateArn()

      override fun sslClientCertificateArn(): String? = unwrap(this).getSslClientCertificateArn()

      override fun sslClientKeyArn(): String? = unwrap(this).getSslClientKeyArn()

      override fun sslClientKeyPassword(): String? = unwrap(this).getSslClientKeyPassword()

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
    public fun accessAlternateDirectly(): Any? = unwrap(this).getAccessAlternateDirectly()

    public fun addSupplementalLogging(): Any? = unwrap(this).getAddSupplementalLogging()

    public fun additionalArchivedLogDestId(): Number? =
        unwrap(this).getAdditionalArchivedLogDestId()

    public fun allowSelectNestedTables(): Any? = unwrap(this).getAllowSelectNestedTables()

    public fun archivedLogDestId(): Number? = unwrap(this).getArchivedLogDestId()

    public fun archivedLogsOnly(): Any? = unwrap(this).getArchivedLogsOnly()

    public fun asmPassword(): String? = unwrap(this).getAsmPassword()

    public fun asmServer(): String? = unwrap(this).getAsmServer()

    public fun asmUser(): String? = unwrap(this).getAsmUser()

    public fun charLengthSemantics(): String? = unwrap(this).getCharLengthSemantics()

    public fun directPathNoLog(): Any? = unwrap(this).getDirectPathNoLog()

    public fun directPathParallelLoad(): Any? = unwrap(this).getDirectPathParallelLoad()

    public fun enableHomogenousTablespace(): Any? = unwrap(this).getEnableHomogenousTablespace()

    public fun extraArchivedLogDestIds(): Any? = unwrap(this).getExtraArchivedLogDestIds()

    public fun failTasksOnLobTruncation(): Any? = unwrap(this).getFailTasksOnLobTruncation()

    public fun numberDatatypeScale(): Number? = unwrap(this).getNumberDatatypeScale()

    public fun oraclePathPrefix(): String? = unwrap(this).getOraclePathPrefix()

    public fun parallelAsmReadThreads(): Number? = unwrap(this).getParallelAsmReadThreads()

    public fun readAheadBlocks(): Number? = unwrap(this).getReadAheadBlocks()

    public fun readTableSpaceName(): Any? = unwrap(this).getReadTableSpaceName()

    public fun replacePathPrefix(): Any? = unwrap(this).getReplacePathPrefix()

    public fun retryInterval(): Number? = unwrap(this).getRetryInterval()

    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    public fun secretsManagerOracleAsmAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerOracleAsmAccessRoleArn()

    public fun secretsManagerOracleAsmSecretId(): String? =
        unwrap(this).getSecretsManagerOracleAsmSecretId()

    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    public fun securityDbEncryption(): String? = unwrap(this).getSecurityDbEncryption()

    public fun securityDbEncryptionName(): String? = unwrap(this).getSecurityDbEncryptionName()

    public fun spatialDataOptionToGeoJsonFunctionName(): String? =
        unwrap(this).getSpatialDataOptionToGeoJsonFunctionName()

    public fun standbyDelayTime(): Number? = unwrap(this).getStandbyDelayTime()

    public fun useAlternateFolderForOnline(): Any? = unwrap(this).getUseAlternateFolderForOnline()

    public fun useBFile(): Any? = unwrap(this).getUseBFile()

    public fun useDirectPathFullLoad(): Any? = unwrap(this).getUseDirectPathFullLoad()

    public fun useLogminerReader(): Any? = unwrap(this).getUseLogminerReader()

    public fun usePathPrefix(): String? = unwrap(this).getUsePathPrefix()

    @CdkDslMarker
    public interface Builder {
      public fun accessAlternateDirectly(accessAlternateDirectly: Boolean)

      public fun accessAlternateDirectly(accessAlternateDirectly: IResolvable)

      public fun addSupplementalLogging(addSupplementalLogging: Boolean)

      public fun addSupplementalLogging(addSupplementalLogging: IResolvable)

      public fun additionalArchivedLogDestId(additionalArchivedLogDestId: Number)

      public fun allowSelectNestedTables(allowSelectNestedTables: Boolean)

      public fun allowSelectNestedTables(allowSelectNestedTables: IResolvable)

      public fun archivedLogDestId(archivedLogDestId: Number)

      public fun archivedLogsOnly(archivedLogsOnly: Boolean)

      public fun archivedLogsOnly(archivedLogsOnly: IResolvable)

      public fun asmPassword(asmPassword: String)

      public fun asmServer(asmServer: String)

      public fun asmUser(asmUser: String)

      public fun charLengthSemantics(charLengthSemantics: String)

      public fun directPathNoLog(directPathNoLog: Boolean)

      public fun directPathNoLog(directPathNoLog: IResolvable)

      public fun directPathParallelLoad(directPathParallelLoad: Boolean)

      public fun directPathParallelLoad(directPathParallelLoad: IResolvable)

      public fun enableHomogenousTablespace(enableHomogenousTablespace: Boolean)

      public fun enableHomogenousTablespace(enableHomogenousTablespace: IResolvable)

      public fun extraArchivedLogDestIds(extraArchivedLogDestIds: IResolvable)

      public fun extraArchivedLogDestIds(extraArchivedLogDestIds: List<Number>)

      public fun extraArchivedLogDestIds(vararg extraArchivedLogDestIds: Number)

      public fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean)

      public fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable)

      public fun numberDatatypeScale(numberDatatypeScale: Number)

      public fun oraclePathPrefix(oraclePathPrefix: String)

      public fun parallelAsmReadThreads(parallelAsmReadThreads: Number)

      public fun readAheadBlocks(readAheadBlocks: Number)

      public fun readTableSpaceName(readTableSpaceName: Boolean)

      public fun readTableSpaceName(readTableSpaceName: IResolvable)

      public fun replacePathPrefix(replacePathPrefix: Boolean)

      public fun replacePathPrefix(replacePathPrefix: IResolvable)

      public fun retryInterval(retryInterval: Number)

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      public fun secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn: String)

      public fun secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId: String)

      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      public fun securityDbEncryption(securityDbEncryption: String)

      public fun securityDbEncryptionName(securityDbEncryptionName: String)

      public
          fun spatialDataOptionToGeoJsonFunctionName(spatialDataOptionToGeoJsonFunctionName: String)

      public fun standbyDelayTime(standbyDelayTime: Number)

      public fun useAlternateFolderForOnline(useAlternateFolderForOnline: Boolean)

      public fun useAlternateFolderForOnline(useAlternateFolderForOnline: IResolvable)

      public fun useBFile(useBFile: Boolean)

      public fun useBFile(useBFile: IResolvable)

      public fun useDirectPathFullLoad(useDirectPathFullLoad: Boolean)

      public fun useDirectPathFullLoad(useDirectPathFullLoad: IResolvable)

      public fun useLogminerReader(useLogminerReader: Boolean)

      public fun useLogminerReader(useLogminerReader: IResolvable)

      public fun usePathPrefix(usePathPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty.builder()

      override fun accessAlternateDirectly(accessAlternateDirectly: Boolean) {
        cdkBuilder.accessAlternateDirectly(accessAlternateDirectly)
      }

      override fun accessAlternateDirectly(accessAlternateDirectly: IResolvable) {
        cdkBuilder.accessAlternateDirectly(accessAlternateDirectly.let(IResolvable::unwrap))
      }

      override fun addSupplementalLogging(addSupplementalLogging: Boolean) {
        cdkBuilder.addSupplementalLogging(addSupplementalLogging)
      }

      override fun addSupplementalLogging(addSupplementalLogging: IResolvable) {
        cdkBuilder.addSupplementalLogging(addSupplementalLogging.let(IResolvable::unwrap))
      }

      override fun additionalArchivedLogDestId(additionalArchivedLogDestId: Number) {
        cdkBuilder.additionalArchivedLogDestId(additionalArchivedLogDestId)
      }

      override fun allowSelectNestedTables(allowSelectNestedTables: Boolean) {
        cdkBuilder.allowSelectNestedTables(allowSelectNestedTables)
      }

      override fun allowSelectNestedTables(allowSelectNestedTables: IResolvable) {
        cdkBuilder.allowSelectNestedTables(allowSelectNestedTables.let(IResolvable::unwrap))
      }

      override fun archivedLogDestId(archivedLogDestId: Number) {
        cdkBuilder.archivedLogDestId(archivedLogDestId)
      }

      override fun archivedLogsOnly(archivedLogsOnly: Boolean) {
        cdkBuilder.archivedLogsOnly(archivedLogsOnly)
      }

      override fun archivedLogsOnly(archivedLogsOnly: IResolvable) {
        cdkBuilder.archivedLogsOnly(archivedLogsOnly.let(IResolvable::unwrap))
      }

      override fun asmPassword(asmPassword: String) {
        cdkBuilder.asmPassword(asmPassword)
      }

      override fun asmServer(asmServer: String) {
        cdkBuilder.asmServer(asmServer)
      }

      override fun asmUser(asmUser: String) {
        cdkBuilder.asmUser(asmUser)
      }

      override fun charLengthSemantics(charLengthSemantics: String) {
        cdkBuilder.charLengthSemantics(charLengthSemantics)
      }

      override fun directPathNoLog(directPathNoLog: Boolean) {
        cdkBuilder.directPathNoLog(directPathNoLog)
      }

      override fun directPathNoLog(directPathNoLog: IResolvable) {
        cdkBuilder.directPathNoLog(directPathNoLog.let(IResolvable::unwrap))
      }

      override fun directPathParallelLoad(directPathParallelLoad: Boolean) {
        cdkBuilder.directPathParallelLoad(directPathParallelLoad)
      }

      override fun directPathParallelLoad(directPathParallelLoad: IResolvable) {
        cdkBuilder.directPathParallelLoad(directPathParallelLoad.let(IResolvable::unwrap))
      }

      override fun enableHomogenousTablespace(enableHomogenousTablespace: Boolean) {
        cdkBuilder.enableHomogenousTablespace(enableHomogenousTablespace)
      }

      override fun enableHomogenousTablespace(enableHomogenousTablespace: IResolvable) {
        cdkBuilder.enableHomogenousTablespace(enableHomogenousTablespace.let(IResolvable::unwrap))
      }

      override fun extraArchivedLogDestIds(extraArchivedLogDestIds: IResolvable) {
        cdkBuilder.extraArchivedLogDestIds(extraArchivedLogDestIds.let(IResolvable::unwrap))
      }

      override fun extraArchivedLogDestIds(extraArchivedLogDestIds: List<Number>) {
        cdkBuilder.extraArchivedLogDestIds(extraArchivedLogDestIds)
      }

      override fun extraArchivedLogDestIds(vararg extraArchivedLogDestIds: Number): Unit =
          extraArchivedLogDestIds(extraArchivedLogDestIds.toList())

      override fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation)
      }

      override fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation.let(IResolvable::unwrap))
      }

      override fun numberDatatypeScale(numberDatatypeScale: Number) {
        cdkBuilder.numberDatatypeScale(numberDatatypeScale)
      }

      override fun oraclePathPrefix(oraclePathPrefix: String) {
        cdkBuilder.oraclePathPrefix(oraclePathPrefix)
      }

      override fun parallelAsmReadThreads(parallelAsmReadThreads: Number) {
        cdkBuilder.parallelAsmReadThreads(parallelAsmReadThreads)
      }

      override fun readAheadBlocks(readAheadBlocks: Number) {
        cdkBuilder.readAheadBlocks(readAheadBlocks)
      }

      override fun readTableSpaceName(readTableSpaceName: Boolean) {
        cdkBuilder.readTableSpaceName(readTableSpaceName)
      }

      override fun readTableSpaceName(readTableSpaceName: IResolvable) {
        cdkBuilder.readTableSpaceName(readTableSpaceName.let(IResolvable::unwrap))
      }

      override fun replacePathPrefix(replacePathPrefix: Boolean) {
        cdkBuilder.replacePathPrefix(replacePathPrefix)
      }

      override fun replacePathPrefix(replacePathPrefix: IResolvable) {
        cdkBuilder.replacePathPrefix(replacePathPrefix.let(IResolvable::unwrap))
      }

      override fun retryInterval(retryInterval: Number) {
        cdkBuilder.retryInterval(retryInterval)
      }

      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      override
          fun secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn: String) {
        cdkBuilder.secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn)
      }

      override fun secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId: String) {
        cdkBuilder.secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId)
      }

      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      override fun securityDbEncryption(securityDbEncryption: String) {
        cdkBuilder.securityDbEncryption(securityDbEncryption)
      }

      override fun securityDbEncryptionName(securityDbEncryptionName: String) {
        cdkBuilder.securityDbEncryptionName(securityDbEncryptionName)
      }

      override
          fun spatialDataOptionToGeoJsonFunctionName(spatialDataOptionToGeoJsonFunctionName: String) {
        cdkBuilder.spatialDataOptionToGeoJsonFunctionName(spatialDataOptionToGeoJsonFunctionName)
      }

      override fun standbyDelayTime(standbyDelayTime: Number) {
        cdkBuilder.standbyDelayTime(standbyDelayTime)
      }

      override fun useAlternateFolderForOnline(useAlternateFolderForOnline: Boolean) {
        cdkBuilder.useAlternateFolderForOnline(useAlternateFolderForOnline)
      }

      override fun useAlternateFolderForOnline(useAlternateFolderForOnline: IResolvable) {
        cdkBuilder.useAlternateFolderForOnline(useAlternateFolderForOnline.let(IResolvable::unwrap))
      }

      override fun useBFile(useBFile: Boolean) {
        cdkBuilder.useBFile(useBFile)
      }

      override fun useBFile(useBFile: IResolvable) {
        cdkBuilder.useBFile(useBFile.let(IResolvable::unwrap))
      }

      override fun useDirectPathFullLoad(useDirectPathFullLoad: Boolean) {
        cdkBuilder.useDirectPathFullLoad(useDirectPathFullLoad)
      }

      override fun useDirectPathFullLoad(useDirectPathFullLoad: IResolvable) {
        cdkBuilder.useDirectPathFullLoad(useDirectPathFullLoad.let(IResolvable::unwrap))
      }

      override fun useLogminerReader(useLogminerReader: Boolean) {
        cdkBuilder.useLogminerReader(useLogminerReader)
      }

      override fun useLogminerReader(useLogminerReader: IResolvable) {
        cdkBuilder.useLogminerReader(useLogminerReader.let(IResolvable::unwrap))
      }

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
      override fun accessAlternateDirectly(): Any? = unwrap(this).getAccessAlternateDirectly()

      override fun addSupplementalLogging(): Any? = unwrap(this).getAddSupplementalLogging()

      override fun additionalArchivedLogDestId(): Number? =
          unwrap(this).getAdditionalArchivedLogDestId()

      override fun allowSelectNestedTables(): Any? = unwrap(this).getAllowSelectNestedTables()

      override fun archivedLogDestId(): Number? = unwrap(this).getArchivedLogDestId()

      override fun archivedLogsOnly(): Any? = unwrap(this).getArchivedLogsOnly()

      override fun asmPassword(): String? = unwrap(this).getAsmPassword()

      override fun asmServer(): String? = unwrap(this).getAsmServer()

      override fun asmUser(): String? = unwrap(this).getAsmUser()

      override fun charLengthSemantics(): String? = unwrap(this).getCharLengthSemantics()

      override fun directPathNoLog(): Any? = unwrap(this).getDirectPathNoLog()

      override fun directPathParallelLoad(): Any? = unwrap(this).getDirectPathParallelLoad()

      override fun enableHomogenousTablespace(): Any? = unwrap(this).getEnableHomogenousTablespace()

      override fun extraArchivedLogDestIds(): Any? = unwrap(this).getExtraArchivedLogDestIds()

      override fun failTasksOnLobTruncation(): Any? = unwrap(this).getFailTasksOnLobTruncation()

      override fun numberDatatypeScale(): Number? = unwrap(this).getNumberDatatypeScale()

      override fun oraclePathPrefix(): String? = unwrap(this).getOraclePathPrefix()

      override fun parallelAsmReadThreads(): Number? = unwrap(this).getParallelAsmReadThreads()

      override fun readAheadBlocks(): Number? = unwrap(this).getReadAheadBlocks()

      override fun readTableSpaceName(): Any? = unwrap(this).getReadTableSpaceName()

      override fun replacePathPrefix(): Any? = unwrap(this).getReplacePathPrefix()

      override fun retryInterval(): Number? = unwrap(this).getRetryInterval()

      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      override fun secretsManagerOracleAsmAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerOracleAsmAccessRoleArn()

      override fun secretsManagerOracleAsmSecretId(): String? =
          unwrap(this).getSecretsManagerOracleAsmSecretId()

      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      override fun securityDbEncryption(): String? = unwrap(this).getSecurityDbEncryption()

      override fun securityDbEncryptionName(): String? = unwrap(this).getSecurityDbEncryptionName()

      override fun spatialDataOptionToGeoJsonFunctionName(): String? =
          unwrap(this).getSpatialDataOptionToGeoJsonFunctionName()

      override fun standbyDelayTime(): Number? = unwrap(this).getStandbyDelayTime()

      override fun useAlternateFolderForOnline(): Any? =
          unwrap(this).getUseAlternateFolderForOnline()

      override fun useBFile(): Any? = unwrap(this).getUseBFile()

      override fun useDirectPathFullLoad(): Any? = unwrap(this).getUseDirectPathFullLoad()

      override fun useLogminerReader(): Any? = unwrap(this).getUseLogminerReader()

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
    public fun addColumnName(): Any? = unwrap(this).getAddColumnName()

    public fun addTrailingPaddingCharacter(): Any? = unwrap(this).getAddTrailingPaddingCharacter()

    public fun bucketFolder(): String? = unwrap(this).getBucketFolder()

    public fun bucketName(): String? = unwrap(this).getBucketName()

    public fun cannedAclForObjects(): String? = unwrap(this).getCannedAclForObjects()

    public fun cdcInsertsAndUpdates(): Any? = unwrap(this).getCdcInsertsAndUpdates()

    public fun cdcInsertsOnly(): Any? = unwrap(this).getCdcInsertsOnly()

    public fun cdcMaxBatchInterval(): Number? = unwrap(this).getCdcMaxBatchInterval()

    public fun cdcMinFileSize(): Number? = unwrap(this).getCdcMinFileSize()

    public fun cdcPath(): String? = unwrap(this).getCdcPath()

    public fun compressionType(): String? = unwrap(this).getCompressionType()

    public fun csvDelimiter(): String? = unwrap(this).getCsvDelimiter()

    public fun csvNoSupValue(): String? = unwrap(this).getCsvNoSupValue()

    public fun csvNullValue(): String? = unwrap(this).getCsvNullValue()

    public fun csvRowDelimiter(): String? = unwrap(this).getCsvRowDelimiter()

    public fun dataFormat(): String? = unwrap(this).getDataFormat()

    public fun dataPageSize(): Number? = unwrap(this).getDataPageSize()

    public fun datePartitionDelimiter(): String? = unwrap(this).getDatePartitionDelimiter()

    public fun datePartitionEnabled(): Any? = unwrap(this).getDatePartitionEnabled()

    public fun datePartitionSequence(): String? = unwrap(this).getDatePartitionSequence()

    public fun datePartitionTimezone(): String? = unwrap(this).getDatePartitionTimezone()

    public fun dictPageSizeLimit(): Number? = unwrap(this).getDictPageSizeLimit()

    public fun enableStatistics(): Any? = unwrap(this).getEnableStatistics()

    public fun encodingType(): String? = unwrap(this).getEncodingType()

    public fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

    public fun expectedBucketOwner(): String? = unwrap(this).getExpectedBucketOwner()

    public fun externalTableDefinition(): String? = unwrap(this).getExternalTableDefinition()

    public fun glueCatalogGeneration(): Any? = unwrap(this).getGlueCatalogGeneration()

    public fun ignoreHeaderRows(): Number? = unwrap(this).getIgnoreHeaderRows()

    public fun includeOpForFullLoad(): Any? = unwrap(this).getIncludeOpForFullLoad()

    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    public fun parquetTimestampInMillisecond(): Any? =
        unwrap(this).getParquetTimestampInMillisecond()

    public fun parquetVersion(): String? = unwrap(this).getParquetVersion()

    public fun preserveTransactions(): Any? = unwrap(this).getPreserveTransactions()

    public fun rfc4180(): Any? = unwrap(this).getRfc4180()

    public fun rowGroupLength(): Number? = unwrap(this).getRowGroupLength()

    public fun serverSideEncryptionKmsKeyId(): String? =
        unwrap(this).getServerSideEncryptionKmsKeyId()

    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    public fun timestampColumnName(): String? = unwrap(this).getTimestampColumnName()

    public fun useCsvNoSupValue(): Any? = unwrap(this).getUseCsvNoSupValue()

    public fun useTaskStartTimeForFullLoadTimestamp(): Any? =
        unwrap(this).getUseTaskStartTimeForFullLoadTimestamp()

    @CdkDslMarker
    public interface Builder {
      public fun addColumnName(addColumnName: Boolean)

      public fun addColumnName(addColumnName: IResolvable)

      public fun addTrailingPaddingCharacter(addTrailingPaddingCharacter: Boolean)

      public fun addTrailingPaddingCharacter(addTrailingPaddingCharacter: IResolvable)

      public fun bucketFolder(bucketFolder: String)

      public fun bucketName(bucketName: String)

      public fun cannedAclForObjects(cannedAclForObjects: String)

      public fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: Boolean)

      public fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: IResolvable)

      public fun cdcInsertsOnly(cdcInsertsOnly: Boolean)

      public fun cdcInsertsOnly(cdcInsertsOnly: IResolvable)

      public fun cdcMaxBatchInterval(cdcMaxBatchInterval: Number)

      public fun cdcMinFileSize(cdcMinFileSize: Number)

      public fun cdcPath(cdcPath: String)

      public fun compressionType(compressionType: String)

      public fun csvDelimiter(csvDelimiter: String)

      public fun csvNoSupValue(csvNoSupValue: String)

      public fun csvNullValue(csvNullValue: String)

      public fun csvRowDelimiter(csvRowDelimiter: String)

      public fun dataFormat(dataFormat: String)

      public fun dataPageSize(dataPageSize: Number)

      public fun datePartitionDelimiter(datePartitionDelimiter: String)

      public fun datePartitionEnabled(datePartitionEnabled: Boolean)

      public fun datePartitionEnabled(datePartitionEnabled: IResolvable)

      public fun datePartitionSequence(datePartitionSequence: String)

      public fun datePartitionTimezone(datePartitionTimezone: String)

      public fun dictPageSizeLimit(dictPageSizeLimit: Number)

      public fun enableStatistics(enableStatistics: Boolean)

      public fun enableStatistics(enableStatistics: IResolvable)

      public fun encodingType(encodingType: String)

      public fun encryptionMode(encryptionMode: String)

      public fun expectedBucketOwner(expectedBucketOwner: String)

      public fun externalTableDefinition(externalTableDefinition: String)

      public fun glueCatalogGeneration(glueCatalogGeneration: Boolean)

      public fun glueCatalogGeneration(glueCatalogGeneration: IResolvable)

      public fun ignoreHeaderRows(ignoreHeaderRows: Number)

      public fun includeOpForFullLoad(includeOpForFullLoad: Boolean)

      public fun includeOpForFullLoad(includeOpForFullLoad: IResolvable)

      public fun maxFileSize(maxFileSize: Number)

      public fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: Boolean)

      public fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: IResolvable)

      public fun parquetVersion(parquetVersion: String)

      public fun preserveTransactions(preserveTransactions: Boolean)

      public fun preserveTransactions(preserveTransactions: IResolvable)

      public fun rfc4180(rfc4180: Boolean)

      public fun rfc4180(rfc4180: IResolvable)

      public fun rowGroupLength(rowGroupLength: Number)

      public fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String)

      public fun serviceAccessRoleArn(serviceAccessRoleArn: String)

      public fun timestampColumnName(timestampColumnName: String)

      public fun useCsvNoSupValue(useCsvNoSupValue: Boolean)

      public fun useCsvNoSupValue(useCsvNoSupValue: IResolvable)

      public fun useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp: Boolean)

      public
          fun useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.builder()

      override fun addColumnName(addColumnName: Boolean) {
        cdkBuilder.addColumnName(addColumnName)
      }

      override fun addColumnName(addColumnName: IResolvable) {
        cdkBuilder.addColumnName(addColumnName.let(IResolvable::unwrap))
      }

      override fun addTrailingPaddingCharacter(addTrailingPaddingCharacter: Boolean) {
        cdkBuilder.addTrailingPaddingCharacter(addTrailingPaddingCharacter)
      }

      override fun addTrailingPaddingCharacter(addTrailingPaddingCharacter: IResolvable) {
        cdkBuilder.addTrailingPaddingCharacter(addTrailingPaddingCharacter.let(IResolvable::unwrap))
      }

      override fun bucketFolder(bucketFolder: String) {
        cdkBuilder.bucketFolder(bucketFolder)
      }

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun cannedAclForObjects(cannedAclForObjects: String) {
        cdkBuilder.cannedAclForObjects(cannedAclForObjects)
      }

      override fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: Boolean) {
        cdkBuilder.cdcInsertsAndUpdates(cdcInsertsAndUpdates)
      }

      override fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: IResolvable) {
        cdkBuilder.cdcInsertsAndUpdates(cdcInsertsAndUpdates.let(IResolvable::unwrap))
      }

      override fun cdcInsertsOnly(cdcInsertsOnly: Boolean) {
        cdkBuilder.cdcInsertsOnly(cdcInsertsOnly)
      }

      override fun cdcInsertsOnly(cdcInsertsOnly: IResolvable) {
        cdkBuilder.cdcInsertsOnly(cdcInsertsOnly.let(IResolvable::unwrap))
      }

      override fun cdcMaxBatchInterval(cdcMaxBatchInterval: Number) {
        cdkBuilder.cdcMaxBatchInterval(cdcMaxBatchInterval)
      }

      override fun cdcMinFileSize(cdcMinFileSize: Number) {
        cdkBuilder.cdcMinFileSize(cdcMinFileSize)
      }

      override fun cdcPath(cdcPath: String) {
        cdkBuilder.cdcPath(cdcPath)
      }

      override fun compressionType(compressionType: String) {
        cdkBuilder.compressionType(compressionType)
      }

      override fun csvDelimiter(csvDelimiter: String) {
        cdkBuilder.csvDelimiter(csvDelimiter)
      }

      override fun csvNoSupValue(csvNoSupValue: String) {
        cdkBuilder.csvNoSupValue(csvNoSupValue)
      }

      override fun csvNullValue(csvNullValue: String) {
        cdkBuilder.csvNullValue(csvNullValue)
      }

      override fun csvRowDelimiter(csvRowDelimiter: String) {
        cdkBuilder.csvRowDelimiter(csvRowDelimiter)
      }

      override fun dataFormat(dataFormat: String) {
        cdkBuilder.dataFormat(dataFormat)
      }

      override fun dataPageSize(dataPageSize: Number) {
        cdkBuilder.dataPageSize(dataPageSize)
      }

      override fun datePartitionDelimiter(datePartitionDelimiter: String) {
        cdkBuilder.datePartitionDelimiter(datePartitionDelimiter)
      }

      override fun datePartitionEnabled(datePartitionEnabled: Boolean) {
        cdkBuilder.datePartitionEnabled(datePartitionEnabled)
      }

      override fun datePartitionEnabled(datePartitionEnabled: IResolvable) {
        cdkBuilder.datePartitionEnabled(datePartitionEnabled.let(IResolvable::unwrap))
      }

      override fun datePartitionSequence(datePartitionSequence: String) {
        cdkBuilder.datePartitionSequence(datePartitionSequence)
      }

      override fun datePartitionTimezone(datePartitionTimezone: String) {
        cdkBuilder.datePartitionTimezone(datePartitionTimezone)
      }

      override fun dictPageSizeLimit(dictPageSizeLimit: Number) {
        cdkBuilder.dictPageSizeLimit(dictPageSizeLimit)
      }

      override fun enableStatistics(enableStatistics: Boolean) {
        cdkBuilder.enableStatistics(enableStatistics)
      }

      override fun enableStatistics(enableStatistics: IResolvable) {
        cdkBuilder.enableStatistics(enableStatistics.let(IResolvable::unwrap))
      }

      override fun encodingType(encodingType: String) {
        cdkBuilder.encodingType(encodingType)
      }

      override fun encryptionMode(encryptionMode: String) {
        cdkBuilder.encryptionMode(encryptionMode)
      }

      override fun expectedBucketOwner(expectedBucketOwner: String) {
        cdkBuilder.expectedBucketOwner(expectedBucketOwner)
      }

      override fun externalTableDefinition(externalTableDefinition: String) {
        cdkBuilder.externalTableDefinition(externalTableDefinition)
      }

      override fun glueCatalogGeneration(glueCatalogGeneration: Boolean) {
        cdkBuilder.glueCatalogGeneration(glueCatalogGeneration)
      }

      override fun glueCatalogGeneration(glueCatalogGeneration: IResolvable) {
        cdkBuilder.glueCatalogGeneration(glueCatalogGeneration.let(IResolvable::unwrap))
      }

      override fun ignoreHeaderRows(ignoreHeaderRows: Number) {
        cdkBuilder.ignoreHeaderRows(ignoreHeaderRows)
      }

      override fun includeOpForFullLoad(includeOpForFullLoad: Boolean) {
        cdkBuilder.includeOpForFullLoad(includeOpForFullLoad)
      }

      override fun includeOpForFullLoad(includeOpForFullLoad: IResolvable) {
        cdkBuilder.includeOpForFullLoad(includeOpForFullLoad.let(IResolvable::unwrap))
      }

      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      override fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: Boolean) {
        cdkBuilder.parquetTimestampInMillisecond(parquetTimestampInMillisecond)
      }

      override fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: IResolvable) {
        cdkBuilder.parquetTimestampInMillisecond(parquetTimestampInMillisecond.let(IResolvable::unwrap))
      }

      override fun parquetVersion(parquetVersion: String) {
        cdkBuilder.parquetVersion(parquetVersion)
      }

      override fun preserveTransactions(preserveTransactions: Boolean) {
        cdkBuilder.preserveTransactions(preserveTransactions)
      }

      override fun preserveTransactions(preserveTransactions: IResolvable) {
        cdkBuilder.preserveTransactions(preserveTransactions.let(IResolvable::unwrap))
      }

      override fun rfc4180(rfc4180: Boolean) {
        cdkBuilder.rfc4180(rfc4180)
      }

      override fun rfc4180(rfc4180: IResolvable) {
        cdkBuilder.rfc4180(rfc4180.let(IResolvable::unwrap))
      }

      override fun rowGroupLength(rowGroupLength: Number) {
        cdkBuilder.rowGroupLength(rowGroupLength)
      }

      override fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String) {
        cdkBuilder.serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId)
      }

      override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      override fun timestampColumnName(timestampColumnName: String) {
        cdkBuilder.timestampColumnName(timestampColumnName)
      }

      override fun useCsvNoSupValue(useCsvNoSupValue: Boolean) {
        cdkBuilder.useCsvNoSupValue(useCsvNoSupValue)
      }

      override fun useCsvNoSupValue(useCsvNoSupValue: IResolvable) {
        cdkBuilder.useCsvNoSupValue(useCsvNoSupValue.let(IResolvable::unwrap))
      }

      override
          fun useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp: Boolean) {
        cdkBuilder.useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp)
      }

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
      override fun addColumnName(): Any? = unwrap(this).getAddColumnName()

      override fun addTrailingPaddingCharacter(): Any? =
          unwrap(this).getAddTrailingPaddingCharacter()

      override fun bucketFolder(): String? = unwrap(this).getBucketFolder()

      override fun bucketName(): String? = unwrap(this).getBucketName()

      override fun cannedAclForObjects(): String? = unwrap(this).getCannedAclForObjects()

      override fun cdcInsertsAndUpdates(): Any? = unwrap(this).getCdcInsertsAndUpdates()

      override fun cdcInsertsOnly(): Any? = unwrap(this).getCdcInsertsOnly()

      override fun cdcMaxBatchInterval(): Number? = unwrap(this).getCdcMaxBatchInterval()

      override fun cdcMinFileSize(): Number? = unwrap(this).getCdcMinFileSize()

      override fun cdcPath(): String? = unwrap(this).getCdcPath()

      override fun compressionType(): String? = unwrap(this).getCompressionType()

      override fun csvDelimiter(): String? = unwrap(this).getCsvDelimiter()

      override fun csvNoSupValue(): String? = unwrap(this).getCsvNoSupValue()

      override fun csvNullValue(): String? = unwrap(this).getCsvNullValue()

      override fun csvRowDelimiter(): String? = unwrap(this).getCsvRowDelimiter()

      override fun dataFormat(): String? = unwrap(this).getDataFormat()

      override fun dataPageSize(): Number? = unwrap(this).getDataPageSize()

      override fun datePartitionDelimiter(): String? = unwrap(this).getDatePartitionDelimiter()

      override fun datePartitionEnabled(): Any? = unwrap(this).getDatePartitionEnabled()

      override fun datePartitionSequence(): String? = unwrap(this).getDatePartitionSequence()

      override fun datePartitionTimezone(): String? = unwrap(this).getDatePartitionTimezone()

      override fun dictPageSizeLimit(): Number? = unwrap(this).getDictPageSizeLimit()

      override fun enableStatistics(): Any? = unwrap(this).getEnableStatistics()

      override fun encodingType(): String? = unwrap(this).getEncodingType()

      override fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

      override fun expectedBucketOwner(): String? = unwrap(this).getExpectedBucketOwner()

      override fun externalTableDefinition(): String? = unwrap(this).getExternalTableDefinition()

      override fun glueCatalogGeneration(): Any? = unwrap(this).getGlueCatalogGeneration()

      override fun ignoreHeaderRows(): Number? = unwrap(this).getIgnoreHeaderRows()

      override fun includeOpForFullLoad(): Any? = unwrap(this).getIncludeOpForFullLoad()

      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      override fun parquetTimestampInMillisecond(): Any? =
          unwrap(this).getParquetTimestampInMillisecond()

      override fun parquetVersion(): String? = unwrap(this).getParquetVersion()

      override fun preserveTransactions(): Any? = unwrap(this).getPreserveTransactions()

      override fun rfc4180(): Any? = unwrap(this).getRfc4180()

      override fun rowGroupLength(): Number? = unwrap(this).getRowGroupLength()

      override fun serverSideEncryptionKmsKeyId(): String? =
          unwrap(this).getServerSideEncryptionKmsKeyId()

      override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

      override fun timestampColumnName(): String? = unwrap(this).getTimestampColumnName()

      override fun useCsvNoSupValue(): Any? = unwrap(this).getUseCsvNoSupValue()

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
    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    @CdkDslMarker
    public interface Builder {
      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      public fun secretsManagerSecretId(secretsManagerSecretId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty.builder()

      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

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
      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

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
    public fun bcpPacketSize(): Number? = unwrap(this).getBcpPacketSize()

    public fun controlTablesFileGroup(): String? = unwrap(this).getControlTablesFileGroup()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun forceLobLookup(): Any? = unwrap(this).getForceLobLookup()

    public fun password(): String? = unwrap(this).getPassword()

    public fun port(): Number? = unwrap(this).getPort()

    public fun querySingleAlwaysOnNode(): Any? = unwrap(this).getQuerySingleAlwaysOnNode()

    public fun readBackupOnly(): Any? = unwrap(this).getReadBackupOnly()

    public fun safeguardPolicy(): String? = unwrap(this).getSafeguardPolicy()

    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    public fun serverName(): String? = unwrap(this).getServerName()

    public fun tlogAccessMode(): String? = unwrap(this).getTlogAccessMode()

    public fun trimSpaceInChar(): Any? = unwrap(this).getTrimSpaceInChar()

    public fun useBcpFullLoad(): Any? = unwrap(this).getUseBcpFullLoad()

    public fun useThirdPartyBackupDevice(): Any? = unwrap(this).getUseThirdPartyBackupDevice()

    public fun username(): String? = unwrap(this).getUsername()

    @CdkDslMarker
    public interface Builder {
      public fun bcpPacketSize(bcpPacketSize: Number)

      public fun controlTablesFileGroup(controlTablesFileGroup: String)

      public fun databaseName(databaseName: String)

      public fun forceLobLookup(forceLobLookup: Boolean)

      public fun forceLobLookup(forceLobLookup: IResolvable)

      public fun password(password: String)

      public fun port(port: Number)

      public fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: Boolean)

      public fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: IResolvable)

      public fun readBackupOnly(readBackupOnly: Boolean)

      public fun readBackupOnly(readBackupOnly: IResolvable)

      public fun safeguardPolicy(safeguardPolicy: String)

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      public fun serverName(serverName: String)

      public fun tlogAccessMode(tlogAccessMode: String)

      public fun trimSpaceInChar(trimSpaceInChar: Boolean)

      public fun trimSpaceInChar(trimSpaceInChar: IResolvable)

      public fun useBcpFullLoad(useBcpFullLoad: Boolean)

      public fun useBcpFullLoad(useBcpFullLoad: IResolvable)

      public fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: Boolean)

      public fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: IResolvable)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty.Builder
          =
          software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty.builder()

      override fun bcpPacketSize(bcpPacketSize: Number) {
        cdkBuilder.bcpPacketSize(bcpPacketSize)
      }

      override fun controlTablesFileGroup(controlTablesFileGroup: String) {
        cdkBuilder.controlTablesFileGroup(controlTablesFileGroup)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun forceLobLookup(forceLobLookup: Boolean) {
        cdkBuilder.forceLobLookup(forceLobLookup)
      }

      override fun forceLobLookup(forceLobLookup: IResolvable) {
        cdkBuilder.forceLobLookup(forceLobLookup.let(IResolvable::unwrap))
      }

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: Boolean) {
        cdkBuilder.querySingleAlwaysOnNode(querySingleAlwaysOnNode)
      }

      override fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: IResolvable) {
        cdkBuilder.querySingleAlwaysOnNode(querySingleAlwaysOnNode.let(IResolvable::unwrap))
      }

      override fun readBackupOnly(readBackupOnly: Boolean) {
        cdkBuilder.readBackupOnly(readBackupOnly)
      }

      override fun readBackupOnly(readBackupOnly: IResolvable) {
        cdkBuilder.readBackupOnly(readBackupOnly.let(IResolvable::unwrap))
      }

      override fun safeguardPolicy(safeguardPolicy: String) {
        cdkBuilder.safeguardPolicy(safeguardPolicy)
      }

      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

      override fun tlogAccessMode(tlogAccessMode: String) {
        cdkBuilder.tlogAccessMode(tlogAccessMode)
      }

      override fun trimSpaceInChar(trimSpaceInChar: Boolean) {
        cdkBuilder.trimSpaceInChar(trimSpaceInChar)
      }

      override fun trimSpaceInChar(trimSpaceInChar: IResolvable) {
        cdkBuilder.trimSpaceInChar(trimSpaceInChar.let(IResolvable::unwrap))
      }

      override fun useBcpFullLoad(useBcpFullLoad: Boolean) {
        cdkBuilder.useBcpFullLoad(useBcpFullLoad)
      }

      override fun useBcpFullLoad(useBcpFullLoad: IResolvable) {
        cdkBuilder.useBcpFullLoad(useBcpFullLoad.let(IResolvable::unwrap))
      }

      override fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: Boolean) {
        cdkBuilder.useThirdPartyBackupDevice(useThirdPartyBackupDevice)
      }

      override fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: IResolvable) {
        cdkBuilder.useThirdPartyBackupDevice(useThirdPartyBackupDevice.let(IResolvable::unwrap))
      }

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
      override fun bcpPacketSize(): Number? = unwrap(this).getBcpPacketSize()

      override fun controlTablesFileGroup(): String? = unwrap(this).getControlTablesFileGroup()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun forceLobLookup(): Any? = unwrap(this).getForceLobLookup()

      override fun password(): String? = unwrap(this).getPassword()

      override fun port(): Number? = unwrap(this).getPort()

      override fun querySingleAlwaysOnNode(): Any? = unwrap(this).getQuerySingleAlwaysOnNode()

      override fun readBackupOnly(): Any? = unwrap(this).getReadBackupOnly()

      override fun safeguardPolicy(): String? = unwrap(this).getSafeguardPolicy()

      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      override fun serverName(): String? = unwrap(this).getServerName()

      override fun tlogAccessMode(): String? = unwrap(this).getTlogAccessMode()

      override fun trimSpaceInChar(): Any? = unwrap(this).getTrimSpaceInChar()

      override fun useBcpFullLoad(): Any? = unwrap(this).getUseBcpFullLoad()

      override fun useThirdPartyBackupDevice(): Any? = unwrap(this).getUseThirdPartyBackupDevice()

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
    public fun currentLsn(): String? = unwrap(this).getCurrentLsn()

    public fun keepCsvFiles(): Any? = unwrap(this).getKeepCsvFiles()

    public fun loadTimeout(): Number? = unwrap(this).getLoadTimeout()

    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    public fun maxKBytesPerRead(): Number? = unwrap(this).getMaxKBytesPerRead()

    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    public fun setDataCaptureChanges(): Any? = unwrap(this).getSetDataCaptureChanges()

    public fun writeBufferSize(): Number? = unwrap(this).getWriteBufferSize()

    @CdkDslMarker
    public interface Builder {
      public fun currentLsn(currentLsn: String)

      public fun dataCaptureChanges(setDataCaptureChanges: Boolean)

      public fun dataCaptureChanges(setDataCaptureChanges: IResolvable)

      public fun keepCsvFiles(keepCsvFiles: Boolean)

      public fun keepCsvFiles(keepCsvFiles: IResolvable)

      public fun loadTimeout(loadTimeout: Number)

      public fun maxFileSize(maxFileSize: Number)

      public fun maxKBytesPerRead(maxKBytesPerRead: Number)

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      public fun writeBufferSize(writeBufferSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty.builder()

      override fun currentLsn(currentLsn: String) {
        cdkBuilder.currentLsn(currentLsn)
      }

      override fun dataCaptureChanges(setDataCaptureChanges: Boolean) {
        cdkBuilder.setDataCaptureChanges(setDataCaptureChanges)
      }

      override fun dataCaptureChanges(setDataCaptureChanges: IResolvable) {
        cdkBuilder.setDataCaptureChanges(setDataCaptureChanges.let(IResolvable::unwrap))
      }

      override fun keepCsvFiles(keepCsvFiles: Boolean) {
        cdkBuilder.keepCsvFiles(keepCsvFiles)
      }

      override fun keepCsvFiles(keepCsvFiles: IResolvable) {
        cdkBuilder.keepCsvFiles(keepCsvFiles.let(IResolvable::unwrap))
      }

      override fun loadTimeout(loadTimeout: Number) {
        cdkBuilder.loadTimeout(loadTimeout)
      }

      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      override fun maxKBytesPerRead(maxKBytesPerRead: Number) {
        cdkBuilder.maxKBytesPerRead(maxKBytesPerRead)
      }

      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

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
      override fun currentLsn(): String? = unwrap(this).getCurrentLsn()

      override fun keepCsvFiles(): Any? = unwrap(this).getKeepCsvFiles()

      override fun loadTimeout(): Number? = unwrap(this).getLoadTimeout()

      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      override fun maxKBytesPerRead(): Number? = unwrap(this).getMaxKBytesPerRead()

      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      override fun setDataCaptureChanges(): Any? = unwrap(this).getSetDataCaptureChanges()

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
    public fun docsToInvestigate(): Number? = unwrap(this).getDocsToInvestigate()

    public fun extractDocId(): Any? = unwrap(this).getExtractDocId()

    public fun nestingLevel(): String? = unwrap(this).getNestingLevel()

    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    @CdkDslMarker
    public interface Builder {
      public fun docsToInvestigate(docsToInvestigate: Number)

      public fun extractDocId(extractDocId: Boolean)

      public fun extractDocId(extractDocId: IResolvable)

      public fun nestingLevel(nestingLevel: String)

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      public fun secretsManagerSecretId(secretsManagerSecretId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty.builder()

      override fun docsToInvestigate(docsToInvestigate: Number) {
        cdkBuilder.docsToInvestigate(docsToInvestigate)
      }

      override fun extractDocId(extractDocId: Boolean) {
        cdkBuilder.extractDocId(extractDocId)
      }

      override fun extractDocId(extractDocId: IResolvable) {
        cdkBuilder.extractDocId(extractDocId.let(IResolvable::unwrap))
      }

      override fun nestingLevel(nestingLevel: String) {
        cdkBuilder.nestingLevel(nestingLevel)
      }

      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty,
    ) : CdkObject(cdkObject), DocDbSettingsProperty {
      override fun docsToInvestigate(): Number? = unwrap(this).getDocsToInvestigate()

      override fun extractDocId(): Any? = unwrap(this).getExtractDocId()

      override fun nestingLevel(): String? = unwrap(this).getNestingLevel()

      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

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
    public fun acceptAnyDate(): Any? = unwrap(this).getAcceptAnyDate()

    public fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

    public fun bucketFolder(): String? = unwrap(this).getBucketFolder()

    public fun bucketName(): String? = unwrap(this).getBucketName()

    public fun caseSensitiveNames(): Any? = unwrap(this).getCaseSensitiveNames()

    public fun compUpdate(): Any? = unwrap(this).getCompUpdate()

    public fun connectionTimeout(): Number? = unwrap(this).getConnectionTimeout()

    public fun dateFormat(): String? = unwrap(this).getDateFormat()

    public fun emptyAsNull(): Any? = unwrap(this).getEmptyAsNull()

    public fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

    public fun explicitIds(): Any? = unwrap(this).getExplicitIds()

    public fun fileTransferUploadStreams(): Number? = unwrap(this).getFileTransferUploadStreams()

    public fun loadTimeout(): Number? = unwrap(this).getLoadTimeout()

    public fun mapBooleanAsBoolean(): Any? = unwrap(this).getMapBooleanAsBoolean()

    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    public fun removeQuotes(): Any? = unwrap(this).getRemoveQuotes()

    public fun replaceChars(): String? = unwrap(this).getReplaceChars()

    public fun replaceInvalidChars(): String? = unwrap(this).getReplaceInvalidChars()

    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    public fun serverSideEncryptionKmsKeyId(): String? =
        unwrap(this).getServerSideEncryptionKmsKeyId()

    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    public fun timeFormat(): String? = unwrap(this).getTimeFormat()

    public fun trimBlanks(): Any? = unwrap(this).getTrimBlanks()

    public fun truncateColumns(): Any? = unwrap(this).getTruncateColumns()

    public fun writeBufferSize(): Number? = unwrap(this).getWriteBufferSize()

    @CdkDslMarker
    public interface Builder {
      public fun acceptAnyDate(acceptAnyDate: Boolean)

      public fun acceptAnyDate(acceptAnyDate: IResolvable)

      public fun afterConnectScript(afterConnectScript: String)

      public fun bucketFolder(bucketFolder: String)

      public fun bucketName(bucketName: String)

      public fun caseSensitiveNames(caseSensitiveNames: Boolean)

      public fun caseSensitiveNames(caseSensitiveNames: IResolvable)

      public fun compUpdate(compUpdate: Boolean)

      public fun compUpdate(compUpdate: IResolvable)

      public fun connectionTimeout(connectionTimeout: Number)

      public fun dateFormat(dateFormat: String)

      public fun emptyAsNull(emptyAsNull: Boolean)

      public fun emptyAsNull(emptyAsNull: IResolvable)

      public fun encryptionMode(encryptionMode: String)

      public fun explicitIds(explicitIds: Boolean)

      public fun explicitIds(explicitIds: IResolvable)

      public fun fileTransferUploadStreams(fileTransferUploadStreams: Number)

      public fun loadTimeout(loadTimeout: Number)

      public fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean)

      public fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable)

      public fun maxFileSize(maxFileSize: Number)

      public fun removeQuotes(removeQuotes: Boolean)

      public fun removeQuotes(removeQuotes: IResolvable)

      public fun replaceChars(replaceChars: String)

      public fun replaceInvalidChars(replaceInvalidChars: String)

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      public fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String)

      public fun serviceAccessRoleArn(serviceAccessRoleArn: String)

      public fun timeFormat(timeFormat: String)

      public fun trimBlanks(trimBlanks: Boolean)

      public fun trimBlanks(trimBlanks: IResolvable)

      public fun truncateColumns(truncateColumns: Boolean)

      public fun truncateColumns(truncateColumns: IResolvable)

      public fun writeBufferSize(writeBufferSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty.builder()

      override fun acceptAnyDate(acceptAnyDate: Boolean) {
        cdkBuilder.acceptAnyDate(acceptAnyDate)
      }

      override fun acceptAnyDate(acceptAnyDate: IResolvable) {
        cdkBuilder.acceptAnyDate(acceptAnyDate.let(IResolvable::unwrap))
      }

      override fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
      }

      override fun bucketFolder(bucketFolder: String) {
        cdkBuilder.bucketFolder(bucketFolder)
      }

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun caseSensitiveNames(caseSensitiveNames: Boolean) {
        cdkBuilder.caseSensitiveNames(caseSensitiveNames)
      }

      override fun caseSensitiveNames(caseSensitiveNames: IResolvable) {
        cdkBuilder.caseSensitiveNames(caseSensitiveNames.let(IResolvable::unwrap))
      }

      override fun compUpdate(compUpdate: Boolean) {
        cdkBuilder.compUpdate(compUpdate)
      }

      override fun compUpdate(compUpdate: IResolvable) {
        cdkBuilder.compUpdate(compUpdate.let(IResolvable::unwrap))
      }

      override fun connectionTimeout(connectionTimeout: Number) {
        cdkBuilder.connectionTimeout(connectionTimeout)
      }

      override fun dateFormat(dateFormat: String) {
        cdkBuilder.dateFormat(dateFormat)
      }

      override fun emptyAsNull(emptyAsNull: Boolean) {
        cdkBuilder.emptyAsNull(emptyAsNull)
      }

      override fun emptyAsNull(emptyAsNull: IResolvable) {
        cdkBuilder.emptyAsNull(emptyAsNull.let(IResolvable::unwrap))
      }

      override fun encryptionMode(encryptionMode: String) {
        cdkBuilder.encryptionMode(encryptionMode)
      }

      override fun explicitIds(explicitIds: Boolean) {
        cdkBuilder.explicitIds(explicitIds)
      }

      override fun explicitIds(explicitIds: IResolvable) {
        cdkBuilder.explicitIds(explicitIds.let(IResolvable::unwrap))
      }

      override fun fileTransferUploadStreams(fileTransferUploadStreams: Number) {
        cdkBuilder.fileTransferUploadStreams(fileTransferUploadStreams)
      }

      override fun loadTimeout(loadTimeout: Number) {
        cdkBuilder.loadTimeout(loadTimeout)
      }

      override fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
      }

      override fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean.let(IResolvable::unwrap))
      }

      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      override fun removeQuotes(removeQuotes: Boolean) {
        cdkBuilder.removeQuotes(removeQuotes)
      }

      override fun removeQuotes(removeQuotes: IResolvable) {
        cdkBuilder.removeQuotes(removeQuotes.let(IResolvable::unwrap))
      }

      override fun replaceChars(replaceChars: String) {
        cdkBuilder.replaceChars(replaceChars)
      }

      override fun replaceInvalidChars(replaceInvalidChars: String) {
        cdkBuilder.replaceInvalidChars(replaceInvalidChars)
      }

      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      override fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String) {
        cdkBuilder.serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId)
      }

      override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      override fun timeFormat(timeFormat: String) {
        cdkBuilder.timeFormat(timeFormat)
      }

      override fun trimBlanks(trimBlanks: Boolean) {
        cdkBuilder.trimBlanks(trimBlanks)
      }

      override fun trimBlanks(trimBlanks: IResolvable) {
        cdkBuilder.trimBlanks(trimBlanks.let(IResolvable::unwrap))
      }

      override fun truncateColumns(truncateColumns: Boolean) {
        cdkBuilder.truncateColumns(truncateColumns)
      }

      override fun truncateColumns(truncateColumns: IResolvable) {
        cdkBuilder.truncateColumns(truncateColumns.let(IResolvable::unwrap))
      }

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
      override fun acceptAnyDate(): Any? = unwrap(this).getAcceptAnyDate()

      override fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

      override fun bucketFolder(): String? = unwrap(this).getBucketFolder()

      override fun bucketName(): String? = unwrap(this).getBucketName()

      override fun caseSensitiveNames(): Any? = unwrap(this).getCaseSensitiveNames()

      override fun compUpdate(): Any? = unwrap(this).getCompUpdate()

      override fun connectionTimeout(): Number? = unwrap(this).getConnectionTimeout()

      override fun dateFormat(): String? = unwrap(this).getDateFormat()

      override fun emptyAsNull(): Any? = unwrap(this).getEmptyAsNull()

      override fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

      override fun explicitIds(): Any? = unwrap(this).getExplicitIds()

      override fun fileTransferUploadStreams(): Number? =
          unwrap(this).getFileTransferUploadStreams()

      override fun loadTimeout(): Number? = unwrap(this).getLoadTimeout()

      override fun mapBooleanAsBoolean(): Any? = unwrap(this).getMapBooleanAsBoolean()

      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      override fun removeQuotes(): Any? = unwrap(this).getRemoveQuotes()

      override fun replaceChars(): String? = unwrap(this).getReplaceChars()

      override fun replaceInvalidChars(): String? = unwrap(this).getReplaceInvalidChars()

      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      override fun serverSideEncryptionKmsKeyId(): String? =
          unwrap(this).getServerSideEncryptionKmsKeyId()

      override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

      override fun timeFormat(): String? = unwrap(this).getTimeFormat()

      override fun trimBlanks(): Any? = unwrap(this).getTrimBlanks()

      override fun truncateColumns(): Any? = unwrap(this).getTruncateColumns()

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
    public fun authMechanism(): String? = unwrap(this).getAuthMechanism()

    public fun authSource(): String? = unwrap(this).getAuthSource()

    public fun authType(): String? = unwrap(this).getAuthType()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun docsToInvestigate(): String? = unwrap(this).getDocsToInvestigate()

    public fun extractDocId(): String? = unwrap(this).getExtractDocId()

    public fun nestingLevel(): String? = unwrap(this).getNestingLevel()

    public fun password(): String? = unwrap(this).getPassword()

    public fun port(): Number? = unwrap(this).getPort()

    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    public fun serverName(): String? = unwrap(this).getServerName()

    public fun username(): String? = unwrap(this).getUsername()

    @CdkDslMarker
    public interface Builder {
      public fun authMechanism(authMechanism: String)

      public fun authSource(authSource: String)

      public fun authType(authType: String)

      public fun databaseName(databaseName: String)

      public fun docsToInvestigate(docsToInvestigate: String)

      public fun extractDocId(extractDocId: String)

      public fun nestingLevel(nestingLevel: String)

      public fun password(password: String)

      public fun port(port: Number)

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      public fun serverName(serverName: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.builder()

      override fun authMechanism(authMechanism: String) {
        cdkBuilder.authMechanism(authMechanism)
      }

      override fun authSource(authSource: String) {
        cdkBuilder.authSource(authSource)
      }

      override fun authType(authType: String) {
        cdkBuilder.authType(authType)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun docsToInvestigate(docsToInvestigate: String) {
        cdkBuilder.docsToInvestigate(docsToInvestigate)
      }

      override fun extractDocId(extractDocId: String) {
        cdkBuilder.extractDocId(extractDocId)
      }

      override fun nestingLevel(nestingLevel: String) {
        cdkBuilder.nestingLevel(nestingLevel)
      }

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

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
      override fun authMechanism(): String? = unwrap(this).getAuthMechanism()

      override fun authSource(): String? = unwrap(this).getAuthSource()

      override fun authType(): String? = unwrap(this).getAuthType()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun docsToInvestigate(): String? = unwrap(this).getDocsToInvestigate()

      override fun extractDocId(): String? = unwrap(this).getExtractDocId()

      override fun nestingLevel(): String? = unwrap(this).getNestingLevel()

      override fun password(): String? = unwrap(this).getPassword()

      override fun port(): Number? = unwrap(this).getPort()

      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      override fun serverName(): String? = unwrap(this).getServerName()

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
    public fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

    public fun babelfishDatabaseName(): String? = unwrap(this).getBabelfishDatabaseName()

    public fun captureDdls(): Any? = unwrap(this).getCaptureDdls()

    public fun databaseMode(): String? = unwrap(this).getDatabaseMode()

    public fun ddlArtifactsSchema(): String? = unwrap(this).getDdlArtifactsSchema()

    public fun executeTimeout(): Number? = unwrap(this).getExecuteTimeout()

    public fun failTasksOnLobTruncation(): Any? = unwrap(this).getFailTasksOnLobTruncation()

    public fun heartbeatEnable(): Any? = unwrap(this).getHeartbeatEnable()

    public fun heartbeatFrequency(): Number? = unwrap(this).getHeartbeatFrequency()

    public fun heartbeatSchema(): String? = unwrap(this).getHeartbeatSchema()

    public fun mapBooleanAsBoolean(): Any? = unwrap(this).getMapBooleanAsBoolean()

    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    public fun pluginName(): String? = unwrap(this).getPluginName()

    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    public fun slotName(): String? = unwrap(this).getSlotName()

    @CdkDslMarker
    public interface Builder {
      public fun afterConnectScript(afterConnectScript: String)

      public fun babelfishDatabaseName(babelfishDatabaseName: String)

      public fun captureDdls(captureDdls: Boolean)

      public fun captureDdls(captureDdls: IResolvable)

      public fun databaseMode(databaseMode: String)

      public fun ddlArtifactsSchema(ddlArtifactsSchema: String)

      public fun executeTimeout(executeTimeout: Number)

      public fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean)

      public fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable)

      public fun heartbeatEnable(heartbeatEnable: Boolean)

      public fun heartbeatEnable(heartbeatEnable: IResolvable)

      public fun heartbeatFrequency(heartbeatFrequency: Number)

      public fun heartbeatSchema(heartbeatSchema: String)

      public fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean)

      public fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable)

      public fun maxFileSize(maxFileSize: Number)

      public fun pluginName(pluginName: String)

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      public fun slotName(slotName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty.builder()

      override fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
      }

      override fun babelfishDatabaseName(babelfishDatabaseName: String) {
        cdkBuilder.babelfishDatabaseName(babelfishDatabaseName)
      }

      override fun captureDdls(captureDdls: Boolean) {
        cdkBuilder.captureDdls(captureDdls)
      }

      override fun captureDdls(captureDdls: IResolvable) {
        cdkBuilder.captureDdls(captureDdls.let(IResolvable::unwrap))
      }

      override fun databaseMode(databaseMode: String) {
        cdkBuilder.databaseMode(databaseMode)
      }

      override fun ddlArtifactsSchema(ddlArtifactsSchema: String) {
        cdkBuilder.ddlArtifactsSchema(ddlArtifactsSchema)
      }

      override fun executeTimeout(executeTimeout: Number) {
        cdkBuilder.executeTimeout(executeTimeout)
      }

      override fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation)
      }

      override fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation.let(IResolvable::unwrap))
      }

      override fun heartbeatEnable(heartbeatEnable: Boolean) {
        cdkBuilder.heartbeatEnable(heartbeatEnable)
      }

      override fun heartbeatEnable(heartbeatEnable: IResolvable) {
        cdkBuilder.heartbeatEnable(heartbeatEnable.let(IResolvable::unwrap))
      }

      override fun heartbeatFrequency(heartbeatFrequency: Number) {
        cdkBuilder.heartbeatFrequency(heartbeatFrequency)
      }

      override fun heartbeatSchema(heartbeatSchema: String) {
        cdkBuilder.heartbeatSchema(heartbeatSchema)
      }

      override fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
      }

      override fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean.let(IResolvable::unwrap))
      }

      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      override fun pluginName(pluginName: String) {
        cdkBuilder.pluginName(pluginName)
      }

      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

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
      override fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

      override fun babelfishDatabaseName(): String? = unwrap(this).getBabelfishDatabaseName()

      override fun captureDdls(): Any? = unwrap(this).getCaptureDdls()

      override fun databaseMode(): String? = unwrap(this).getDatabaseMode()

      override fun ddlArtifactsSchema(): String? = unwrap(this).getDdlArtifactsSchema()

      override fun executeTimeout(): Number? = unwrap(this).getExecuteTimeout()

      override fun failTasksOnLobTruncation(): Any? = unwrap(this).getFailTasksOnLobTruncation()

      override fun heartbeatEnable(): Any? = unwrap(this).getHeartbeatEnable()

      override fun heartbeatFrequency(): Number? = unwrap(this).getHeartbeatFrequency()

      override fun heartbeatSchema(): String? = unwrap(this).getHeartbeatSchema()

      override fun mapBooleanAsBoolean(): Any? = unwrap(this).getMapBooleanAsBoolean()

      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      override fun pluginName(): String? = unwrap(this).getPluginName()

      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

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
    public fun errorRetryDuration(): Number? = unwrap(this).getErrorRetryDuration()

    public fun iamAuthEnabled(): Any? = unwrap(this).getIamAuthEnabled()

    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    public fun maxRetryCount(): Number? = unwrap(this).getMaxRetryCount()

    public fun s3BucketFolder(): String? = unwrap(this).getS3BucketFolder()

    public fun s3BucketName(): String? = unwrap(this).getS3BucketName()

    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    @CdkDslMarker
    public interface Builder {
      public fun errorRetryDuration(errorRetryDuration: Number)

      public fun iamAuthEnabled(iamAuthEnabled: Boolean)

      public fun iamAuthEnabled(iamAuthEnabled: IResolvable)

      public fun maxFileSize(maxFileSize: Number)

      public fun maxRetryCount(maxRetryCount: Number)

      public fun s3BucketFolder(s3BucketFolder: String)

      public fun s3BucketName(s3BucketName: String)

      public fun serviceAccessRoleArn(serviceAccessRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty.builder()

      override fun errorRetryDuration(errorRetryDuration: Number) {
        cdkBuilder.errorRetryDuration(errorRetryDuration)
      }

      override fun iamAuthEnabled(iamAuthEnabled: Boolean) {
        cdkBuilder.iamAuthEnabled(iamAuthEnabled)
      }

      override fun iamAuthEnabled(iamAuthEnabled: IResolvable) {
        cdkBuilder.iamAuthEnabled(iamAuthEnabled.let(IResolvable::unwrap))
      }

      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      override fun maxRetryCount(maxRetryCount: Number) {
        cdkBuilder.maxRetryCount(maxRetryCount)
      }

      override fun s3BucketFolder(s3BucketFolder: String) {
        cdkBuilder.s3BucketFolder(s3BucketFolder)
      }

      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

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
      override fun errorRetryDuration(): Number? = unwrap(this).getErrorRetryDuration()

      override fun iamAuthEnabled(): Any? = unwrap(this).getIamAuthEnabled()

      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      override fun maxRetryCount(): Number? = unwrap(this).getMaxRetryCount()

      override fun s3BucketFolder(): String? = unwrap(this).getS3BucketFolder()

      override fun s3BucketName(): String? = unwrap(this).getS3BucketName()

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
    public fun includeControlDetails(): Any? = unwrap(this).getIncludeControlDetails()

    public fun includeNullAndEmpty(): Any? = unwrap(this).getIncludeNullAndEmpty()

    public fun includePartitionValue(): Any? = unwrap(this).getIncludePartitionValue()

    public fun includeTableAlterOperations(): Any? = unwrap(this).getIncludeTableAlterOperations()

    public fun includeTransactionDetails(): Any? = unwrap(this).getIncludeTransactionDetails()

    public fun messageFormat(): String? = unwrap(this).getMessageFormat()

    public fun noHexPrefix(): Any? = unwrap(this).getNoHexPrefix()

    public fun partitionIncludeSchemaTable(): Any? = unwrap(this).getPartitionIncludeSchemaTable()

    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    public fun streamArn(): String? = unwrap(this).getStreamArn()

    @CdkDslMarker
    public interface Builder {
      public fun includeControlDetails(includeControlDetails: Boolean)

      public fun includeControlDetails(includeControlDetails: IResolvable)

      public fun includeNullAndEmpty(includeNullAndEmpty: Boolean)

      public fun includeNullAndEmpty(includeNullAndEmpty: IResolvable)

      public fun includePartitionValue(includePartitionValue: Boolean)

      public fun includePartitionValue(includePartitionValue: IResolvable)

      public fun includeTableAlterOperations(includeTableAlterOperations: Boolean)

      public fun includeTableAlterOperations(includeTableAlterOperations: IResolvable)

      public fun includeTransactionDetails(includeTransactionDetails: Boolean)

      public fun includeTransactionDetails(includeTransactionDetails: IResolvable)

      public fun messageFormat(messageFormat: String)

      public fun noHexPrefix(noHexPrefix: Boolean)

      public fun noHexPrefix(noHexPrefix: IResolvable)

      public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean)

      public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable)

      public fun serviceAccessRoleArn(serviceAccessRoleArn: String)

      public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.builder()

      override fun includeControlDetails(includeControlDetails: Boolean) {
        cdkBuilder.includeControlDetails(includeControlDetails)
      }

      override fun includeControlDetails(includeControlDetails: IResolvable) {
        cdkBuilder.includeControlDetails(includeControlDetails.let(IResolvable::unwrap))
      }

      override fun includeNullAndEmpty(includeNullAndEmpty: Boolean) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty)
      }

      override fun includeNullAndEmpty(includeNullAndEmpty: IResolvable) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty.let(IResolvable::unwrap))
      }

      override fun includePartitionValue(includePartitionValue: Boolean) {
        cdkBuilder.includePartitionValue(includePartitionValue)
      }

      override fun includePartitionValue(includePartitionValue: IResolvable) {
        cdkBuilder.includePartitionValue(includePartitionValue.let(IResolvable::unwrap))
      }

      override fun includeTableAlterOperations(includeTableAlterOperations: Boolean) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations)
      }

      override fun includeTableAlterOperations(includeTableAlterOperations: IResolvable) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations.let(IResolvable::unwrap))
      }

      override fun includeTransactionDetails(includeTransactionDetails: Boolean) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails)
      }

      override fun includeTransactionDetails(includeTransactionDetails: IResolvable) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails.let(IResolvable::unwrap))
      }

      override fun messageFormat(messageFormat: String) {
        cdkBuilder.messageFormat(messageFormat)
      }

      override fun noHexPrefix(noHexPrefix: Boolean) {
        cdkBuilder.noHexPrefix(noHexPrefix)
      }

      override fun noHexPrefix(noHexPrefix: IResolvable) {
        cdkBuilder.noHexPrefix(noHexPrefix.let(IResolvable::unwrap))
      }

      override fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable)
      }

      override fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable.let(IResolvable::unwrap))
      }

      override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

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
      override fun includeControlDetails(): Any? = unwrap(this).getIncludeControlDetails()

      override fun includeNullAndEmpty(): Any? = unwrap(this).getIncludeNullAndEmpty()

      override fun includePartitionValue(): Any? = unwrap(this).getIncludePartitionValue()

      override fun includeTableAlterOperations(): Any? =
          unwrap(this).getIncludeTableAlterOperations()

      override fun includeTransactionDetails(): Any? = unwrap(this).getIncludeTransactionDetails()

      override fun messageFormat(): String? = unwrap(this).getMessageFormat()

      override fun noHexPrefix(): Any? = unwrap(this).getNoHexPrefix()

      override fun partitionIncludeSchemaTable(): Any? =
          unwrap(this).getPartitionIncludeSchemaTable()

      override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

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
    public fun endpointUri(): String? = unwrap(this).getEndpointUri()

    public fun errorRetryDuration(): Number? = unwrap(this).getErrorRetryDuration()

    public fun fullLoadErrorPercentage(): Number? = unwrap(this).getFullLoadErrorPercentage()

    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    @CdkDslMarker
    public interface Builder {
      public fun endpointUri(endpointUri: String)

      public fun errorRetryDuration(errorRetryDuration: Number)

      public fun fullLoadErrorPercentage(fullLoadErrorPercentage: Number)

      public fun serviceAccessRoleArn(serviceAccessRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.builder()

      override fun endpointUri(endpointUri: String) {
        cdkBuilder.endpointUri(endpointUri)
      }

      override fun errorRetryDuration(errorRetryDuration: Number) {
        cdkBuilder.errorRetryDuration(errorRetryDuration)
      }

      override fun fullLoadErrorPercentage(fullLoadErrorPercentage: Number) {
        cdkBuilder.fullLoadErrorPercentage(fullLoadErrorPercentage)
      }

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
      override fun endpointUri(): String? = unwrap(this).getEndpointUri()

      override fun errorRetryDuration(): Number? = unwrap(this).getErrorRetryDuration()

      override fun fullLoadErrorPercentage(): Number? = unwrap(this).getFullLoadErrorPercentage()

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
    public fun authPassword(): String? = unwrap(this).getAuthPassword()

    public fun authType(): String? = unwrap(this).getAuthType()

    public fun authUserName(): String? = unwrap(this).getAuthUserName()

    public fun port(): Number? = unwrap(this).getPort()

    public fun serverName(): String? = unwrap(this).getServerName()

    public fun sslCaCertificateArn(): String? = unwrap(this).getSslCaCertificateArn()

    public fun sslSecurityProtocol(): String? = unwrap(this).getSslSecurityProtocol()

    @CdkDslMarker
    public interface Builder {
      public fun authPassword(authPassword: String)

      public fun authType(authType: String)

      public fun authUserName(authUserName: String)

      public fun port(port: Number)

      public fun serverName(serverName: String)

      public fun sslCaCertificateArn(sslCaCertificateArn: String)

      public fun sslSecurityProtocol(sslSecurityProtocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty.builder()

      override fun authPassword(authPassword: String) {
        cdkBuilder.authPassword(authPassword)
      }

      override fun authType(authType: String) {
        cdkBuilder.authType(authType)
      }

      override fun authUserName(authUserName: String) {
        cdkBuilder.authUserName(authUserName)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

      override fun sslCaCertificateArn(sslCaCertificateArn: String) {
        cdkBuilder.sslCaCertificateArn(sslCaCertificateArn)
      }

      override fun sslSecurityProtocol(sslSecurityProtocol: String) {
        cdkBuilder.sslSecurityProtocol(sslSecurityProtocol)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty,
    ) : CdkObject(cdkObject), RedisSettingsProperty {
      override fun authPassword(): String? = unwrap(this).getAuthPassword()

      override fun authType(): String? = unwrap(this).getAuthType()

      override fun authUserName(): String? = unwrap(this).getAuthUserName()

      override fun port(): Number? = unwrap(this).getPort()

      override fun serverName(): String? = unwrap(this).getServerName()

      override fun sslCaCertificateArn(): String? = unwrap(this).getSslCaCertificateArn()

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
    public fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

    public fun cleanSourceMetadataOnMismatch(): Any? =
        unwrap(this).getCleanSourceMetadataOnMismatch()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun eventsPollInterval(): Number? = unwrap(this).getEventsPollInterval()

    public fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

    public fun parallelLoadThreads(): Number? = unwrap(this).getParallelLoadThreads()

    public fun password(): String? = unwrap(this).getPassword()

    public fun port(): Number? = unwrap(this).getPort()

    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    public fun serverName(): String? = unwrap(this).getServerName()

    public fun serverTimezone(): String? = unwrap(this).getServerTimezone()

    public fun username(): String? = unwrap(this).getUsername()

    @CdkDslMarker
    public interface Builder {
      public fun afterConnectScript(afterConnectScript: String)

      public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean)

      public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable)

      public fun databaseName(databaseName: String)

      public fun eventsPollInterval(eventsPollInterval: Number)

      public fun maxFileSize(maxFileSize: Number)

      public fun parallelLoadThreads(parallelLoadThreads: Number)

      public fun password(password: String)

      public fun port(port: Number)

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      public fun secretsManagerSecretId(secretsManagerSecretId: String)

      public fun serverName(serverName: String)

      public fun serverTimezone(serverTimezone: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty.builder()

      override fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
      }

      override fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch)
      }

      override fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch.let(IResolvable::unwrap))
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun eventsPollInterval(eventsPollInterval: Number) {
        cdkBuilder.eventsPollInterval(eventsPollInterval)
      }

      override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      override fun parallelLoadThreads(parallelLoadThreads: Number) {
        cdkBuilder.parallelLoadThreads(parallelLoadThreads)
      }

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

      override fun serverTimezone(serverTimezone: String) {
        cdkBuilder.serverTimezone(serverTimezone)
      }

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
      override fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

      override fun cleanSourceMetadataOnMismatch(): Any? =
          unwrap(this).getCleanSourceMetadataOnMismatch()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun eventsPollInterval(): Number? = unwrap(this).getEventsPollInterval()

      override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      override fun parallelLoadThreads(): Number? = unwrap(this).getParallelLoadThreads()

      override fun password(): String? = unwrap(this).getPassword()

      override fun port(): Number? = unwrap(this).getPort()

      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

      override fun serverName(): String? = unwrap(this).getServerName()

      override fun serverTimezone(): String? = unwrap(this).getServerTimezone()

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
