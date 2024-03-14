package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
  private val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint,
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f0d2fc4245ed559777df72eff656ba7d3742cf4c102193bbcb4ba41f9ff7d3cc")
  public open fun sybaseSettings(`value`: SybaseSettingsProperty.Builder.() -> Unit): Unit =
      sybaseSettings(SybaseSettingsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun username(): String? = unwrap(this).getUsername()

  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  public interface Builder {
    public fun certificateArn(certificateArn: String) {
    }

    public fun databaseName(databaseName: String) {
    }

    public fun docDbSettings(docDbSettings: IResolvable) {
    }

    public fun docDbSettings(docDbSettings: DocDbSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fbde66ac654b5397d727e318fc72d4c5e0ed2add843d1a60ae50a069d8cf78d")
    public fun docDbSettings(docDbSettings: DocDbSettingsProperty.Builder.() -> Unit) {
    }

    public fun dynamoDbSettings(dynamoDbSettings: IResolvable) {
    }

    public fun dynamoDbSettings(dynamoDbSettings: DynamoDbSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5cdc3c3c4090352539fd080a3d02f6645a0a6109d09f40cc53594a993068d096")
    public fun dynamoDbSettings(dynamoDbSettings: DynamoDbSettingsProperty.Builder.() -> Unit) {
    }

    public fun elasticsearchSettings(elasticsearchSettings: IResolvable) {
    }

    public fun elasticsearchSettings(elasticsearchSettings: ElasticsearchSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("889d325b4eeeb0880dc74130a7f1cc5cebd2323685790c333d6149a4f2bfcb8f")
    public
        fun elasticsearchSettings(elasticsearchSettings: ElasticsearchSettingsProperty.Builder.() -> Unit) {
    }

    public fun endpointIdentifier(endpointIdentifier: String) {
    }

    public fun endpointType(endpointType: String) {
    }

    public fun engineName(engineName: String) {
    }

    public fun extraConnectionAttributes(extraConnectionAttributes: String) {
    }

    public fun gcpMySqlSettings(gcpMySqlSettings: IResolvable) {
    }

    public fun gcpMySqlSettings(gcpMySqlSettings: GcpMySQLSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("925d4ba9af14d43c38e62d809c4a9bfbfc5cb3d9712b4896f8527703dd9b701e")
    public fun gcpMySqlSettings(gcpMySqlSettings: GcpMySQLSettingsProperty.Builder.() -> Unit) {
    }

    public fun ibmDb2Settings(ibmDb2Settings: IResolvable) {
    }

    public fun ibmDb2Settings(ibmDb2Settings: IbmDb2SettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a55b78aff146203eb19a530ed10a3898c4b42f0d0fc717956cb7c7f6b0c6fac8")
    public fun ibmDb2Settings(ibmDb2Settings: IbmDb2SettingsProperty.Builder.() -> Unit) {
    }

    public fun kafkaSettings(kafkaSettings: IResolvable) {
    }

    public fun kafkaSettings(kafkaSettings: KafkaSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9ed867348022b36c7694b652e12b1cacfa29155ed279f155e9b6a8ede7b2075")
    public fun kafkaSettings(kafkaSettings: KafkaSettingsProperty.Builder.() -> Unit) {
    }

    public fun kinesisSettings(kinesisSettings: IResolvable) {
    }

    public fun kinesisSettings(kinesisSettings: KinesisSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96defed71e91fdb933b12d6dd79a8a2249d0156ed38c4ecfcd729da4e63e7bd2")
    public fun kinesisSettings(kinesisSettings: KinesisSettingsProperty.Builder.() -> Unit) {
    }

    public fun kmsKeyId(kmsKeyId: String) {
    }

    public fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable) {
    }

    public
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adbf309f1b82d81fad56f56705008f24acb04801869f82f113e9ca86220eba07")
    public
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty.Builder.() -> Unit) {
    }

    public fun mongoDbSettings(mongoDbSettings: IResolvable) {
    }

    public fun mongoDbSettings(mongoDbSettings: MongoDbSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("050ff78e40a1395c73c5b4f2c039e024a8067554393984a41d14a33f0eac6cf4")
    public fun mongoDbSettings(mongoDbSettings: MongoDbSettingsProperty.Builder.() -> Unit) {
    }

    public fun mySqlSettings(mySqlSettings: IResolvable) {
    }

    public fun mySqlSettings(mySqlSettings: MySqlSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c1ef3d7d8d9c26762a1b5268ba864ccfdce78bc3570d3083b6493d47e37b54")
    public fun mySqlSettings(mySqlSettings: MySqlSettingsProperty.Builder.() -> Unit) {
    }

    public fun neptuneSettings(neptuneSettings: IResolvable) {
    }

    public fun neptuneSettings(neptuneSettings: NeptuneSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f44b6d9df7919882c0942ce2d41354a6064d5c40384ff1834ce0fa81ae5d2bb7")
    public fun neptuneSettings(neptuneSettings: NeptuneSettingsProperty.Builder.() -> Unit) {
    }

    public fun oracleSettings(oracleSettings: IResolvable) {
    }

    public fun oracleSettings(oracleSettings: OracleSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf0444a7326a153335d36ebdb3dd8d1f3540e068cbdbf7f679c3a4032dccea88")
    public fun oracleSettings(oracleSettings: OracleSettingsProperty.Builder.() -> Unit) {
    }

    public fun password(password: String) {
    }

    public fun port(port: Number) {
    }

    public fun postgreSqlSettings(postgreSqlSettings: IResolvable) {
    }

    public fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90679fdd6b6c393ffe4be191fbab0408dfed36b58b34c62d52ff4d5baccc34ce")
    public
        fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty.Builder.() -> Unit) {
    }

    public fun redisSettings(redisSettings: IResolvable) {
    }

    public fun redisSettings(redisSettings: RedisSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57864a08b297d92b7b750737cdfc05fd8a6e6de6d220bb98b268830aefc86d30")
    public fun redisSettings(redisSettings: RedisSettingsProperty.Builder.() -> Unit) {
    }

    public fun redshiftSettings(redshiftSettings: IResolvable) {
    }

    public fun redshiftSettings(redshiftSettings: RedshiftSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11b670292b1e44ce7dda450ac19ef54cc289ada19014482359d029ad114fcb7e")
    public fun redshiftSettings(redshiftSettings: RedshiftSettingsProperty.Builder.() -> Unit) {
    }

    public fun resourceIdentifier(resourceIdentifier: String) {
    }

    public fun s3Settings(s3Settings: IResolvable) {
    }

    public fun s3Settings(s3Settings: S3SettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f3e786c777d40066e00740f0ac855a1f9f1dbcb38b044b134764b13af1cbcce")
    public fun s3Settings(s3Settings: S3SettingsProperty.Builder.() -> Unit) {
    }

    public fun serverName(serverName: String) {
    }

    public fun sslMode(sslMode: String) {
    }

    public fun sybaseSettings(sybaseSettings: IResolvable) {
    }

    public fun sybaseSettings(sybaseSettings: SybaseSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40dcc88d57b0b2dd6f75aa352d9dae019e3e8de6e8a1892482e39a7ef92fe742")
    public fun sybaseSettings(sybaseSettings: SybaseSettingsProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun username(username: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnEndpoint.Builder =
        software.amazon.awscdk.services.dms.CfnEndpoint.Builder.create(scope, id)

    public override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    public override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    public override fun docDbSettings(docDbSettings: IResolvable) {
      cdkBuilder.docDbSettings(docDbSettings.let(IResolvable::unwrap))
    }

    public override fun docDbSettings(docDbSettings: DocDbSettingsProperty) {
      cdkBuilder.docDbSettings(docDbSettings.let(DocDbSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fbde66ac654b5397d727e318fc72d4c5e0ed2add843d1a60ae50a069d8cf78d")
    public override fun docDbSettings(docDbSettings: DocDbSettingsProperty.Builder.() -> Unit): Unit
        = docDbSettings(DocDbSettingsProperty(docDbSettings))

    public override fun dynamoDbSettings(dynamoDbSettings: IResolvable) {
      cdkBuilder.dynamoDbSettings(dynamoDbSettings.let(IResolvable::unwrap))
    }

    public override fun dynamoDbSettings(dynamoDbSettings: DynamoDbSettingsProperty) {
      cdkBuilder.dynamoDbSettings(dynamoDbSettings.let(DynamoDbSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5cdc3c3c4090352539fd080a3d02f6645a0a6109d09f40cc53594a993068d096")
    public override
        fun dynamoDbSettings(dynamoDbSettings: DynamoDbSettingsProperty.Builder.() -> Unit): Unit =
        dynamoDbSettings(DynamoDbSettingsProperty(dynamoDbSettings))

    public override fun elasticsearchSettings(elasticsearchSettings: IResolvable) {
      cdkBuilder.elasticsearchSettings(elasticsearchSettings.let(IResolvable::unwrap))
    }

    public override
        fun elasticsearchSettings(elasticsearchSettings: ElasticsearchSettingsProperty) {
      cdkBuilder.elasticsearchSettings(elasticsearchSettings.let(ElasticsearchSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("889d325b4eeeb0880dc74130a7f1cc5cebd2323685790c333d6149a4f2bfcb8f")
    public override
        fun elasticsearchSettings(elasticsearchSettings: ElasticsearchSettingsProperty.Builder.() -> Unit):
        Unit = elasticsearchSettings(ElasticsearchSettingsProperty(elasticsearchSettings))

    public override fun endpointIdentifier(endpointIdentifier: String) {
      cdkBuilder.endpointIdentifier(endpointIdentifier)
    }

    public override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    public override fun engineName(engineName: String) {
      cdkBuilder.engineName(engineName)
    }

    public override fun extraConnectionAttributes(extraConnectionAttributes: String) {
      cdkBuilder.extraConnectionAttributes(extraConnectionAttributes)
    }

    public override fun gcpMySqlSettings(gcpMySqlSettings: IResolvable) {
      cdkBuilder.gcpMySqlSettings(gcpMySqlSettings.let(IResolvable::unwrap))
    }

    public override fun gcpMySqlSettings(gcpMySqlSettings: GcpMySQLSettingsProperty) {
      cdkBuilder.gcpMySqlSettings(gcpMySqlSettings.let(GcpMySQLSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("925d4ba9af14d43c38e62d809c4a9bfbfc5cb3d9712b4896f8527703dd9b701e")
    public override
        fun gcpMySqlSettings(gcpMySqlSettings: GcpMySQLSettingsProperty.Builder.() -> Unit): Unit =
        gcpMySqlSettings(GcpMySQLSettingsProperty(gcpMySqlSettings))

    public override fun ibmDb2Settings(ibmDb2Settings: IResolvable) {
      cdkBuilder.ibmDb2Settings(ibmDb2Settings.let(IResolvable::unwrap))
    }

    public override fun ibmDb2Settings(ibmDb2Settings: IbmDb2SettingsProperty) {
      cdkBuilder.ibmDb2Settings(ibmDb2Settings.let(IbmDb2SettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a55b78aff146203eb19a530ed10a3898c4b42f0d0fc717956cb7c7f6b0c6fac8")
    public override fun ibmDb2Settings(ibmDb2Settings: IbmDb2SettingsProperty.Builder.() -> Unit):
        Unit = ibmDb2Settings(IbmDb2SettingsProperty(ibmDb2Settings))

    public override fun kafkaSettings(kafkaSettings: IResolvable) {
      cdkBuilder.kafkaSettings(kafkaSettings.let(IResolvable::unwrap))
    }

    public override fun kafkaSettings(kafkaSettings: KafkaSettingsProperty) {
      cdkBuilder.kafkaSettings(kafkaSettings.let(KafkaSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9ed867348022b36c7694b652e12b1cacfa29155ed279f155e9b6a8ede7b2075")
    public override fun kafkaSettings(kafkaSettings: KafkaSettingsProperty.Builder.() -> Unit): Unit
        = kafkaSettings(KafkaSettingsProperty(kafkaSettings))

    public override fun kinesisSettings(kinesisSettings: IResolvable) {
      cdkBuilder.kinesisSettings(kinesisSettings.let(IResolvable::unwrap))
    }

    public override fun kinesisSettings(kinesisSettings: KinesisSettingsProperty) {
      cdkBuilder.kinesisSettings(kinesisSettings.let(KinesisSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96defed71e91fdb933b12d6dd79a8a2249d0156ed38c4ecfcd729da4e63e7bd2")
    public override
        fun kinesisSettings(kinesisSettings: KinesisSettingsProperty.Builder.() -> Unit): Unit =
        kinesisSettings(KinesisSettingsProperty(kinesisSettings))

    public override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public override fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable) {
      cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings.let(IResolvable::unwrap))
    }

    public override
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty) {
      cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings.let(MicrosoftSqlServerSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adbf309f1b82d81fad56f56705008f24acb04801869f82f113e9ca86220eba07")
    public override
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty.Builder.() -> Unit):
        Unit =
        microsoftSqlServerSettings(MicrosoftSqlServerSettingsProperty(microsoftSqlServerSettings))

    public override fun mongoDbSettings(mongoDbSettings: IResolvable) {
      cdkBuilder.mongoDbSettings(mongoDbSettings.let(IResolvable::unwrap))
    }

    public override fun mongoDbSettings(mongoDbSettings: MongoDbSettingsProperty) {
      cdkBuilder.mongoDbSettings(mongoDbSettings.let(MongoDbSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("050ff78e40a1395c73c5b4f2c039e024a8067554393984a41d14a33f0eac6cf4")
    public override
        fun mongoDbSettings(mongoDbSettings: MongoDbSettingsProperty.Builder.() -> Unit): Unit =
        mongoDbSettings(MongoDbSettingsProperty(mongoDbSettings))

    public override fun mySqlSettings(mySqlSettings: IResolvable) {
      cdkBuilder.mySqlSettings(mySqlSettings.let(IResolvable::unwrap))
    }

    public override fun mySqlSettings(mySqlSettings: MySqlSettingsProperty) {
      cdkBuilder.mySqlSettings(mySqlSettings.let(MySqlSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c1ef3d7d8d9c26762a1b5268ba864ccfdce78bc3570d3083b6493d47e37b54")
    public override fun mySqlSettings(mySqlSettings: MySqlSettingsProperty.Builder.() -> Unit): Unit
        = mySqlSettings(MySqlSettingsProperty(mySqlSettings))

    public override fun neptuneSettings(neptuneSettings: IResolvable) {
      cdkBuilder.neptuneSettings(neptuneSettings.let(IResolvable::unwrap))
    }

    public override fun neptuneSettings(neptuneSettings: NeptuneSettingsProperty) {
      cdkBuilder.neptuneSettings(neptuneSettings.let(NeptuneSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f44b6d9df7919882c0942ce2d41354a6064d5c40384ff1834ce0fa81ae5d2bb7")
    public override
        fun neptuneSettings(neptuneSettings: NeptuneSettingsProperty.Builder.() -> Unit): Unit =
        neptuneSettings(NeptuneSettingsProperty(neptuneSettings))

    public override fun oracleSettings(oracleSettings: IResolvable) {
      cdkBuilder.oracleSettings(oracleSettings.let(IResolvable::unwrap))
    }

    public override fun oracleSettings(oracleSettings: OracleSettingsProperty) {
      cdkBuilder.oracleSettings(oracleSettings.let(OracleSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf0444a7326a153335d36ebdb3dd8d1f3540e068cbdbf7f679c3a4032dccea88")
    public override fun oracleSettings(oracleSettings: OracleSettingsProperty.Builder.() -> Unit):
        Unit = oracleSettings(OracleSettingsProperty(oracleSettings))

    public override fun password(password: String) {
      cdkBuilder.password(password)
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun postgreSqlSettings(postgreSqlSettings: IResolvable) {
      cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(IResolvable::unwrap))
    }

    public override fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty) {
      cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(PostgreSqlSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90679fdd6b6c393ffe4be191fbab0408dfed36b58b34c62d52ff4d5baccc34ce")
    public override
        fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty.Builder.() -> Unit):
        Unit = postgreSqlSettings(PostgreSqlSettingsProperty(postgreSqlSettings))

    public override fun redisSettings(redisSettings: IResolvable) {
      cdkBuilder.redisSettings(redisSettings.let(IResolvable::unwrap))
    }

    public override fun redisSettings(redisSettings: RedisSettingsProperty) {
      cdkBuilder.redisSettings(redisSettings.let(RedisSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57864a08b297d92b7b750737cdfc05fd8a6e6de6d220bb98b268830aefc86d30")
    public override fun redisSettings(redisSettings: RedisSettingsProperty.Builder.() -> Unit): Unit
        = redisSettings(RedisSettingsProperty(redisSettings))

    public override fun redshiftSettings(redshiftSettings: IResolvable) {
      cdkBuilder.redshiftSettings(redshiftSettings.let(IResolvable::unwrap))
    }

    public override fun redshiftSettings(redshiftSettings: RedshiftSettingsProperty) {
      cdkBuilder.redshiftSettings(redshiftSettings.let(RedshiftSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11b670292b1e44ce7dda450ac19ef54cc289ada19014482359d029ad114fcb7e")
    public override
        fun redshiftSettings(redshiftSettings: RedshiftSettingsProperty.Builder.() -> Unit): Unit =
        redshiftSettings(RedshiftSettingsProperty(redshiftSettings))

    public override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    public override fun s3Settings(s3Settings: IResolvable) {
      cdkBuilder.s3Settings(s3Settings.let(IResolvable::unwrap))
    }

    public override fun s3Settings(s3Settings: S3SettingsProperty) {
      cdkBuilder.s3Settings(s3Settings.let(S3SettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f3e786c777d40066e00740f0ac855a1f9f1dbcb38b044b134764b13af1cbcce")
    public override fun s3Settings(s3Settings: S3SettingsProperty.Builder.() -> Unit): Unit =
        s3Settings(S3SettingsProperty(s3Settings))

    public override fun serverName(serverName: String) {
      cdkBuilder.serverName(serverName)
    }

    public override fun sslMode(sslMode: String) {
      cdkBuilder.sslMode(sslMode)
    }

    public override fun sybaseSettings(sybaseSettings: IResolvable) {
      cdkBuilder.sybaseSettings(sybaseSettings.let(IResolvable::unwrap))
    }

    public override fun sybaseSettings(sybaseSettings: SybaseSettingsProperty) {
      cdkBuilder.sybaseSettings(sybaseSettings.let(SybaseSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40dcc88d57b0b2dd6f75aa352d9dae019e3e8de6e8a1892482e39a7ef92fe742")
    public override fun sybaseSettings(sybaseSettings: SybaseSettingsProperty.Builder.() -> Unit):
        Unit = sybaseSettings(SybaseSettingsProperty(sybaseSettings))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun afterConnectScript(afterConnectScript: String) {
      }

      public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean) {
      }

      public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable) {
      }

      public fun eventsPollInterval(eventsPollInterval: Number) {
      }

      public fun maxFileSize(maxFileSize: Number) {
      }

      public fun parallelLoadThreads(parallelLoadThreads: Number) {
      }

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
      }

      public fun secretsManagerSecretId(secretsManagerSecretId: String) {
      }

      public fun serverTimezone(serverTimezone: String) {
      }

      public fun targetDbType(targetDbType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty.builder()

      public override fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
      }

      public override fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch)
      }

      public override
          fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch.let(IResolvable::unwrap))
      }

      public override fun eventsPollInterval(eventsPollInterval: Number) {
        cdkBuilder.eventsPollInterval(eventsPollInterval)
      }

      public override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      public override fun parallelLoadThreads(parallelLoadThreads: Number) {
        cdkBuilder.parallelLoadThreads(parallelLoadThreads)
      }

      public override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      public override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public override fun serverTimezone(serverTimezone: String) {
        cdkBuilder.serverTimezone(serverTimezone)
      }

      public override fun targetDbType(targetDbType: String) {
        cdkBuilder.targetDbType(targetDbType)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty,
    ) : MySqlSettingsProperty {
      public override fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

      public override fun cleanSourceMetadataOnMismatch(): Any? =
          unwrap(this).getCleanSourceMetadataOnMismatch()

      public override fun eventsPollInterval(): Number? = unwrap(this).getEventsPollInterval()

      public override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      public override fun parallelLoadThreads(): Number? = unwrap(this).getParallelLoadThreads()

      public override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      public override fun secretsManagerSecretId(): String? =
          unwrap(this).getSecretsManagerSecretId()

      public override fun serverTimezone(): String? = unwrap(this).getServerTimezone()

      public override fun targetDbType(): String? = unwrap(this).getTargetDbType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MySqlSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty):
          MySqlSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MySqlSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DynamoDbSettingsProperty {
    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    public interface Builder {
      public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty.builder()

      public override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty,
    ) : DynamoDbSettingsProperty {
      public override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDbSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty):
          DynamoDbSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDbSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun broker(broker: String) {
      }

      public fun includeControlDetails(includeControlDetails: Boolean) {
      }

      public fun includeControlDetails(includeControlDetails: IResolvable) {
      }

      public fun includeNullAndEmpty(includeNullAndEmpty: Boolean) {
      }

      public fun includeNullAndEmpty(includeNullAndEmpty: IResolvable) {
      }

      public fun includePartitionValue(includePartitionValue: Boolean) {
      }

      public fun includePartitionValue(includePartitionValue: IResolvable) {
      }

      public fun includeTableAlterOperations(includeTableAlterOperations: Boolean) {
      }

      public fun includeTableAlterOperations(includeTableAlterOperations: IResolvable) {
      }

      public fun includeTransactionDetails(includeTransactionDetails: Boolean) {
      }

      public fun includeTransactionDetails(includeTransactionDetails: IResolvable) {
      }

      public fun messageFormat(messageFormat: String) {
      }

      public fun messageMaxBytes(messageMaxBytes: Number) {
      }

      public fun noHexPrefix(noHexPrefix: Boolean) {
      }

      public fun noHexPrefix(noHexPrefix: IResolvable) {
      }

      public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean) {
      }

      public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable) {
      }

      public fun saslPassword(saslPassword: String) {
      }

      public fun saslUserName(saslUserName: String) {
      }

      public fun securityProtocol(securityProtocol: String) {
      }

      public fun sslCaCertificateArn(sslCaCertificateArn: String) {
      }

      public fun sslClientCertificateArn(sslClientCertificateArn: String) {
      }

      public fun sslClientKeyArn(sslClientKeyArn: String) {
      }

      public fun sslClientKeyPassword(sslClientKeyPassword: String) {
      }

      public fun topic(topic: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty.builder()

      public override fun broker(broker: String) {
        cdkBuilder.broker(broker)
      }

      public override fun includeControlDetails(includeControlDetails: Boolean) {
        cdkBuilder.includeControlDetails(includeControlDetails)
      }

      public override fun includeControlDetails(includeControlDetails: IResolvable) {
        cdkBuilder.includeControlDetails(includeControlDetails.let(IResolvable::unwrap))
      }

      public override fun includeNullAndEmpty(includeNullAndEmpty: Boolean) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty)
      }

      public override fun includeNullAndEmpty(includeNullAndEmpty: IResolvable) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty.let(IResolvable::unwrap))
      }

      public override fun includePartitionValue(includePartitionValue: Boolean) {
        cdkBuilder.includePartitionValue(includePartitionValue)
      }

      public override fun includePartitionValue(includePartitionValue: IResolvable) {
        cdkBuilder.includePartitionValue(includePartitionValue.let(IResolvable::unwrap))
      }

      public override fun includeTableAlterOperations(includeTableAlterOperations: Boolean) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations)
      }

      public override fun includeTableAlterOperations(includeTableAlterOperations: IResolvable) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations.let(IResolvable::unwrap))
      }

      public override fun includeTransactionDetails(includeTransactionDetails: Boolean) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails)
      }

      public override fun includeTransactionDetails(includeTransactionDetails: IResolvable) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails.let(IResolvable::unwrap))
      }

      public override fun messageFormat(messageFormat: String) {
        cdkBuilder.messageFormat(messageFormat)
      }

      public override fun messageMaxBytes(messageMaxBytes: Number) {
        cdkBuilder.messageMaxBytes(messageMaxBytes)
      }

      public override fun noHexPrefix(noHexPrefix: Boolean) {
        cdkBuilder.noHexPrefix(noHexPrefix)
      }

      public override fun noHexPrefix(noHexPrefix: IResolvable) {
        cdkBuilder.noHexPrefix(noHexPrefix.let(IResolvable::unwrap))
      }

      public override fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable)
      }

      public override fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable.let(IResolvable::unwrap))
      }

      public override fun saslPassword(saslPassword: String) {
        cdkBuilder.saslPassword(saslPassword)
      }

      public override fun saslUserName(saslUserName: String) {
        cdkBuilder.saslUserName(saslUserName)
      }

      public override fun securityProtocol(securityProtocol: String) {
        cdkBuilder.securityProtocol(securityProtocol)
      }

      public override fun sslCaCertificateArn(sslCaCertificateArn: String) {
        cdkBuilder.sslCaCertificateArn(sslCaCertificateArn)
      }

      public override fun sslClientCertificateArn(sslClientCertificateArn: String) {
        cdkBuilder.sslClientCertificateArn(sslClientCertificateArn)
      }

      public override fun sslClientKeyArn(sslClientKeyArn: String) {
        cdkBuilder.sslClientKeyArn(sslClientKeyArn)
      }

      public override fun sslClientKeyPassword(sslClientKeyPassword: String) {
        cdkBuilder.sslClientKeyPassword(sslClientKeyPassword)
      }

      public override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty,
    ) : KafkaSettingsProperty {
      public override fun broker(): String? = unwrap(this).getBroker()

      public override fun includeControlDetails(): Any? = unwrap(this).getIncludeControlDetails()

      public override fun includeNullAndEmpty(): Any? = unwrap(this).getIncludeNullAndEmpty()

      public override fun includePartitionValue(): Any? = unwrap(this).getIncludePartitionValue()

      public override fun includeTableAlterOperations(): Any? =
          unwrap(this).getIncludeTableAlterOperations()

      public override fun includeTransactionDetails(): Any? =
          unwrap(this).getIncludeTransactionDetails()

      public override fun messageFormat(): String? = unwrap(this).getMessageFormat()

      public override fun messageMaxBytes(): Number? = unwrap(this).getMessageMaxBytes()

      public override fun noHexPrefix(): Any? = unwrap(this).getNoHexPrefix()

      public override fun partitionIncludeSchemaTable(): Any? =
          unwrap(this).getPartitionIncludeSchemaTable()

      public override fun saslPassword(): String? = unwrap(this).getSaslPassword()

      public override fun saslUserName(): String? = unwrap(this).getSaslUserName()

      public override fun securityProtocol(): String? = unwrap(this).getSecurityProtocol()

      public override fun sslCaCertificateArn(): String? = unwrap(this).getSslCaCertificateArn()

      public override fun sslClientCertificateArn(): String? =
          unwrap(this).getSslClientCertificateArn()

      public override fun sslClientKeyArn(): String? = unwrap(this).getSslClientKeyArn()

      public override fun sslClientKeyPassword(): String? = unwrap(this).getSslClientKeyPassword()

      public override fun topic(): String? = unwrap(this).getTopic()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KafkaSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty):
          KafkaSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun accessAlternateDirectly(accessAlternateDirectly: Boolean) {
      }

      public fun accessAlternateDirectly(accessAlternateDirectly: IResolvable) {
      }

      public fun addSupplementalLogging(addSupplementalLogging: Boolean) {
      }

      public fun addSupplementalLogging(addSupplementalLogging: IResolvable) {
      }

      public fun additionalArchivedLogDestId(additionalArchivedLogDestId: Number) {
      }

      public fun allowSelectNestedTables(allowSelectNestedTables: Boolean) {
      }

      public fun allowSelectNestedTables(allowSelectNestedTables: IResolvable) {
      }

      public fun archivedLogDestId(archivedLogDestId: Number) {
      }

      public fun archivedLogsOnly(archivedLogsOnly: Boolean) {
      }

      public fun archivedLogsOnly(archivedLogsOnly: IResolvable) {
      }

      public fun asmPassword(asmPassword: String) {
      }

      public fun asmServer(asmServer: String) {
      }

      public fun asmUser(asmUser: String) {
      }

      public fun charLengthSemantics(charLengthSemantics: String) {
      }

      public fun directPathNoLog(directPathNoLog: Boolean) {
      }

      public fun directPathNoLog(directPathNoLog: IResolvable) {
      }

      public fun directPathParallelLoad(directPathParallelLoad: Boolean) {
      }

      public fun directPathParallelLoad(directPathParallelLoad: IResolvable) {
      }

      public fun enableHomogenousTablespace(enableHomogenousTablespace: Boolean) {
      }

      public fun enableHomogenousTablespace(enableHomogenousTablespace: IResolvable) {
      }

      public fun extraArchivedLogDestIds(extraArchivedLogDestIds: IResolvable) {
      }

      public fun extraArchivedLogDestIds(extraArchivedLogDestIds: List<Number>) {
      }

      public fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean) {
      }

      public fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable) {
      }

      public fun numberDatatypeScale(numberDatatypeScale: Number) {
      }

      public fun oraclePathPrefix(oraclePathPrefix: String) {
      }

      public fun parallelAsmReadThreads(parallelAsmReadThreads: Number) {
      }

      public fun readAheadBlocks(readAheadBlocks: Number) {
      }

      public fun readTableSpaceName(readTableSpaceName: Boolean) {
      }

      public fun readTableSpaceName(readTableSpaceName: IResolvable) {
      }

      public fun replacePathPrefix(replacePathPrefix: Boolean) {
      }

      public fun replacePathPrefix(replacePathPrefix: IResolvable) {
      }

      public fun retryInterval(retryInterval: Number) {
      }

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
      }

      public
          fun secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn: String) {
      }

      public fun secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId: String) {
      }

      public fun secretsManagerSecretId(secretsManagerSecretId: String) {
      }

      public fun securityDbEncryption(securityDbEncryption: String) {
      }

      public fun securityDbEncryptionName(securityDbEncryptionName: String) {
      }

      public
          fun spatialDataOptionToGeoJsonFunctionName(spatialDataOptionToGeoJsonFunctionName: String) {
      }

      public fun standbyDelayTime(standbyDelayTime: Number) {
      }

      public fun useAlternateFolderForOnline(useAlternateFolderForOnline: Boolean) {
      }

      public fun useAlternateFolderForOnline(useAlternateFolderForOnline: IResolvable) {
      }

      public fun useBFile(useBFile: Boolean) {
      }

      public fun useBFile(useBFile: IResolvable) {
      }

      public fun useDirectPathFullLoad(useDirectPathFullLoad: Boolean) {
      }

      public fun useDirectPathFullLoad(useDirectPathFullLoad: IResolvable) {
      }

      public fun useLogminerReader(useLogminerReader: Boolean) {
      }

      public fun useLogminerReader(useLogminerReader: IResolvable) {
      }

      public fun usePathPrefix(usePathPrefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty.builder()

      public override fun accessAlternateDirectly(accessAlternateDirectly: Boolean) {
        cdkBuilder.accessAlternateDirectly(accessAlternateDirectly)
      }

      public override fun accessAlternateDirectly(accessAlternateDirectly: IResolvable) {
        cdkBuilder.accessAlternateDirectly(accessAlternateDirectly.let(IResolvable::unwrap))
      }

      public override fun addSupplementalLogging(addSupplementalLogging: Boolean) {
        cdkBuilder.addSupplementalLogging(addSupplementalLogging)
      }

      public override fun addSupplementalLogging(addSupplementalLogging: IResolvable) {
        cdkBuilder.addSupplementalLogging(addSupplementalLogging.let(IResolvable::unwrap))
      }

      public override fun additionalArchivedLogDestId(additionalArchivedLogDestId: Number) {
        cdkBuilder.additionalArchivedLogDestId(additionalArchivedLogDestId)
      }

      public override fun allowSelectNestedTables(allowSelectNestedTables: Boolean) {
        cdkBuilder.allowSelectNestedTables(allowSelectNestedTables)
      }

      public override fun allowSelectNestedTables(allowSelectNestedTables: IResolvable) {
        cdkBuilder.allowSelectNestedTables(allowSelectNestedTables.let(IResolvable::unwrap))
      }

      public override fun archivedLogDestId(archivedLogDestId: Number) {
        cdkBuilder.archivedLogDestId(archivedLogDestId)
      }

      public override fun archivedLogsOnly(archivedLogsOnly: Boolean) {
        cdkBuilder.archivedLogsOnly(archivedLogsOnly)
      }

      public override fun archivedLogsOnly(archivedLogsOnly: IResolvable) {
        cdkBuilder.archivedLogsOnly(archivedLogsOnly.let(IResolvable::unwrap))
      }

      public override fun asmPassword(asmPassword: String) {
        cdkBuilder.asmPassword(asmPassword)
      }

      public override fun asmServer(asmServer: String) {
        cdkBuilder.asmServer(asmServer)
      }

      public override fun asmUser(asmUser: String) {
        cdkBuilder.asmUser(asmUser)
      }

      public override fun charLengthSemantics(charLengthSemantics: String) {
        cdkBuilder.charLengthSemantics(charLengthSemantics)
      }

      public override fun directPathNoLog(directPathNoLog: Boolean) {
        cdkBuilder.directPathNoLog(directPathNoLog)
      }

      public override fun directPathNoLog(directPathNoLog: IResolvable) {
        cdkBuilder.directPathNoLog(directPathNoLog.let(IResolvable::unwrap))
      }

      public override fun directPathParallelLoad(directPathParallelLoad: Boolean) {
        cdkBuilder.directPathParallelLoad(directPathParallelLoad)
      }

      public override fun directPathParallelLoad(directPathParallelLoad: IResolvable) {
        cdkBuilder.directPathParallelLoad(directPathParallelLoad.let(IResolvable::unwrap))
      }

      public override fun enableHomogenousTablespace(enableHomogenousTablespace: Boolean) {
        cdkBuilder.enableHomogenousTablespace(enableHomogenousTablespace)
      }

      public override fun enableHomogenousTablespace(enableHomogenousTablespace: IResolvable) {
        cdkBuilder.enableHomogenousTablespace(enableHomogenousTablespace.let(IResolvable::unwrap))
      }

      public override fun extraArchivedLogDestIds(extraArchivedLogDestIds: IResolvable) {
        cdkBuilder.extraArchivedLogDestIds(extraArchivedLogDestIds.let(IResolvable::unwrap))
      }

      public override fun extraArchivedLogDestIds(extraArchivedLogDestIds: List<Number>) {
        cdkBuilder.extraArchivedLogDestIds(extraArchivedLogDestIds)
      }

      public override fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation)
      }

      public override fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation.let(IResolvable::unwrap))
      }

      public override fun numberDatatypeScale(numberDatatypeScale: Number) {
        cdkBuilder.numberDatatypeScale(numberDatatypeScale)
      }

      public override fun oraclePathPrefix(oraclePathPrefix: String) {
        cdkBuilder.oraclePathPrefix(oraclePathPrefix)
      }

      public override fun parallelAsmReadThreads(parallelAsmReadThreads: Number) {
        cdkBuilder.parallelAsmReadThreads(parallelAsmReadThreads)
      }

      public override fun readAheadBlocks(readAheadBlocks: Number) {
        cdkBuilder.readAheadBlocks(readAheadBlocks)
      }

      public override fun readTableSpaceName(readTableSpaceName: Boolean) {
        cdkBuilder.readTableSpaceName(readTableSpaceName)
      }

      public override fun readTableSpaceName(readTableSpaceName: IResolvable) {
        cdkBuilder.readTableSpaceName(readTableSpaceName.let(IResolvable::unwrap))
      }

      public override fun replacePathPrefix(replacePathPrefix: Boolean) {
        cdkBuilder.replacePathPrefix(replacePathPrefix)
      }

      public override fun replacePathPrefix(replacePathPrefix: IResolvable) {
        cdkBuilder.replacePathPrefix(replacePathPrefix.let(IResolvable::unwrap))
      }

      public override fun retryInterval(retryInterval: Number) {
        cdkBuilder.retryInterval(retryInterval)
      }

      public override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      public override
          fun secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn: String) {
        cdkBuilder.secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn)
      }

      public override fun secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId: String) {
        cdkBuilder.secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId)
      }

      public override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public override fun securityDbEncryption(securityDbEncryption: String) {
        cdkBuilder.securityDbEncryption(securityDbEncryption)
      }

      public override fun securityDbEncryptionName(securityDbEncryptionName: String) {
        cdkBuilder.securityDbEncryptionName(securityDbEncryptionName)
      }

      public override
          fun spatialDataOptionToGeoJsonFunctionName(spatialDataOptionToGeoJsonFunctionName: String) {
        cdkBuilder.spatialDataOptionToGeoJsonFunctionName(spatialDataOptionToGeoJsonFunctionName)
      }

      public override fun standbyDelayTime(standbyDelayTime: Number) {
        cdkBuilder.standbyDelayTime(standbyDelayTime)
      }

      public override fun useAlternateFolderForOnline(useAlternateFolderForOnline: Boolean) {
        cdkBuilder.useAlternateFolderForOnline(useAlternateFolderForOnline)
      }

      public override fun useAlternateFolderForOnline(useAlternateFolderForOnline: IResolvable) {
        cdkBuilder.useAlternateFolderForOnline(useAlternateFolderForOnline.let(IResolvable::unwrap))
      }

      public override fun useBFile(useBFile: Boolean) {
        cdkBuilder.useBFile(useBFile)
      }

      public override fun useBFile(useBFile: IResolvable) {
        cdkBuilder.useBFile(useBFile.let(IResolvable::unwrap))
      }

      public override fun useDirectPathFullLoad(useDirectPathFullLoad: Boolean) {
        cdkBuilder.useDirectPathFullLoad(useDirectPathFullLoad)
      }

      public override fun useDirectPathFullLoad(useDirectPathFullLoad: IResolvable) {
        cdkBuilder.useDirectPathFullLoad(useDirectPathFullLoad.let(IResolvable::unwrap))
      }

      public override fun useLogminerReader(useLogminerReader: Boolean) {
        cdkBuilder.useLogminerReader(useLogminerReader)
      }

      public override fun useLogminerReader(useLogminerReader: IResolvable) {
        cdkBuilder.useLogminerReader(useLogminerReader.let(IResolvable::unwrap))
      }

      public override fun usePathPrefix(usePathPrefix: String) {
        cdkBuilder.usePathPrefix(usePathPrefix)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty,
    ) : OracleSettingsProperty {
      public override fun accessAlternateDirectly(): Any? =
          unwrap(this).getAccessAlternateDirectly()

      public override fun addSupplementalLogging(): Any? = unwrap(this).getAddSupplementalLogging()

      public override fun additionalArchivedLogDestId(): Number? =
          unwrap(this).getAdditionalArchivedLogDestId()

      public override fun allowSelectNestedTables(): Any? =
          unwrap(this).getAllowSelectNestedTables()

      public override fun archivedLogDestId(): Number? = unwrap(this).getArchivedLogDestId()

      public override fun archivedLogsOnly(): Any? = unwrap(this).getArchivedLogsOnly()

      public override fun asmPassword(): String? = unwrap(this).getAsmPassword()

      public override fun asmServer(): String? = unwrap(this).getAsmServer()

      public override fun asmUser(): String? = unwrap(this).getAsmUser()

      public override fun charLengthSemantics(): String? = unwrap(this).getCharLengthSemantics()

      public override fun directPathNoLog(): Any? = unwrap(this).getDirectPathNoLog()

      public override fun directPathParallelLoad(): Any? = unwrap(this).getDirectPathParallelLoad()

      public override fun enableHomogenousTablespace(): Any? =
          unwrap(this).getEnableHomogenousTablespace()

      public override fun extraArchivedLogDestIds(): Any? =
          unwrap(this).getExtraArchivedLogDestIds()

      public override fun failTasksOnLobTruncation(): Any? =
          unwrap(this).getFailTasksOnLobTruncation()

      public override fun numberDatatypeScale(): Number? = unwrap(this).getNumberDatatypeScale()

      public override fun oraclePathPrefix(): String? = unwrap(this).getOraclePathPrefix()

      public override fun parallelAsmReadThreads(): Number? =
          unwrap(this).getParallelAsmReadThreads()

      public override fun readAheadBlocks(): Number? = unwrap(this).getReadAheadBlocks()

      public override fun readTableSpaceName(): Any? = unwrap(this).getReadTableSpaceName()

      public override fun replacePathPrefix(): Any? = unwrap(this).getReplacePathPrefix()

      public override fun retryInterval(): Number? = unwrap(this).getRetryInterval()

      public override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      public override fun secretsManagerOracleAsmAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerOracleAsmAccessRoleArn()

      public override fun secretsManagerOracleAsmSecretId(): String? =
          unwrap(this).getSecretsManagerOracleAsmSecretId()

      public override fun secretsManagerSecretId(): String? =
          unwrap(this).getSecretsManagerSecretId()

      public override fun securityDbEncryption(): String? = unwrap(this).getSecurityDbEncryption()

      public override fun securityDbEncryptionName(): String? =
          unwrap(this).getSecurityDbEncryptionName()

      public override fun spatialDataOptionToGeoJsonFunctionName(): String? =
          unwrap(this).getSpatialDataOptionToGeoJsonFunctionName()

      public override fun standbyDelayTime(): Number? = unwrap(this).getStandbyDelayTime()

      public override fun useAlternateFolderForOnline(): Any? =
          unwrap(this).getUseAlternateFolderForOnline()

      public override fun useBFile(): Any? = unwrap(this).getUseBFile()

      public override fun useDirectPathFullLoad(): Any? = unwrap(this).getUseDirectPathFullLoad()

      public override fun useLogminerReader(): Any? = unwrap(this).getUseLogminerReader()

      public override fun usePathPrefix(): String? = unwrap(this).getUsePathPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OracleSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty):
          OracleSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OracleSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun addColumnName(addColumnName: Boolean) {
      }

      public fun addColumnName(addColumnName: IResolvable) {
      }

      public fun addTrailingPaddingCharacter(addTrailingPaddingCharacter: Boolean) {
      }

      public fun addTrailingPaddingCharacter(addTrailingPaddingCharacter: IResolvable) {
      }

      public fun bucketFolder(bucketFolder: String) {
      }

      public fun bucketName(bucketName: String) {
      }

      public fun cannedAclForObjects(cannedAclForObjects: String) {
      }

      public fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: Boolean) {
      }

      public fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: IResolvable) {
      }

      public fun cdcInsertsOnly(cdcInsertsOnly: Boolean) {
      }

      public fun cdcInsertsOnly(cdcInsertsOnly: IResolvable) {
      }

      public fun cdcMaxBatchInterval(cdcMaxBatchInterval: Number) {
      }

      public fun cdcMinFileSize(cdcMinFileSize: Number) {
      }

      public fun cdcPath(cdcPath: String) {
      }

      public fun compressionType(compressionType: String) {
      }

      public fun csvDelimiter(csvDelimiter: String) {
      }

      public fun csvNoSupValue(csvNoSupValue: String) {
      }

      public fun csvNullValue(csvNullValue: String) {
      }

      public fun csvRowDelimiter(csvRowDelimiter: String) {
      }

      public fun dataFormat(dataFormat: String) {
      }

      public fun dataPageSize(dataPageSize: Number) {
      }

      public fun datePartitionDelimiter(datePartitionDelimiter: String) {
      }

      public fun datePartitionEnabled(datePartitionEnabled: Boolean) {
      }

      public fun datePartitionEnabled(datePartitionEnabled: IResolvable) {
      }

      public fun datePartitionSequence(datePartitionSequence: String) {
      }

      public fun datePartitionTimezone(datePartitionTimezone: String) {
      }

      public fun dictPageSizeLimit(dictPageSizeLimit: Number) {
      }

      public fun enableStatistics(enableStatistics: Boolean) {
      }

      public fun enableStatistics(enableStatistics: IResolvable) {
      }

      public fun encodingType(encodingType: String) {
      }

      public fun encryptionMode(encryptionMode: String) {
      }

      public fun expectedBucketOwner(expectedBucketOwner: String) {
      }

      public fun externalTableDefinition(externalTableDefinition: String) {
      }

      public fun glueCatalogGeneration(glueCatalogGeneration: Boolean) {
      }

      public fun glueCatalogGeneration(glueCatalogGeneration: IResolvable) {
      }

      public fun ignoreHeaderRows(ignoreHeaderRows: Number) {
      }

      public fun includeOpForFullLoad(includeOpForFullLoad: Boolean) {
      }

      public fun includeOpForFullLoad(includeOpForFullLoad: IResolvable) {
      }

      public fun maxFileSize(maxFileSize: Number) {
      }

      public fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: Boolean) {
      }

      public fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: IResolvable) {
      }

      public fun parquetVersion(parquetVersion: String) {
      }

      public fun preserveTransactions(preserveTransactions: Boolean) {
      }

      public fun preserveTransactions(preserveTransactions: IResolvable) {
      }

      public fun rfc4180(rfc4180: Boolean) {
      }

      public fun rfc4180(rfc4180: IResolvable) {
      }

      public fun rowGroupLength(rowGroupLength: Number) {
      }

      public fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String) {
      }

      public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
      }

      public fun timestampColumnName(timestampColumnName: String) {
      }

      public fun useCsvNoSupValue(useCsvNoSupValue: Boolean) {
      }

      public fun useCsvNoSupValue(useCsvNoSupValue: IResolvable) {
      }

      public
          fun useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp: Boolean) {
      }

      public
          fun useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.builder()

      public override fun addColumnName(addColumnName: Boolean) {
        cdkBuilder.addColumnName(addColumnName)
      }

      public override fun addColumnName(addColumnName: IResolvable) {
        cdkBuilder.addColumnName(addColumnName.let(IResolvable::unwrap))
      }

      public override fun addTrailingPaddingCharacter(addTrailingPaddingCharacter: Boolean) {
        cdkBuilder.addTrailingPaddingCharacter(addTrailingPaddingCharacter)
      }

      public override fun addTrailingPaddingCharacter(addTrailingPaddingCharacter: IResolvable) {
        cdkBuilder.addTrailingPaddingCharacter(addTrailingPaddingCharacter.let(IResolvable::unwrap))
      }

      public override fun bucketFolder(bucketFolder: String) {
        cdkBuilder.bucketFolder(bucketFolder)
      }

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun cannedAclForObjects(cannedAclForObjects: String) {
        cdkBuilder.cannedAclForObjects(cannedAclForObjects)
      }

      public override fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: Boolean) {
        cdkBuilder.cdcInsertsAndUpdates(cdcInsertsAndUpdates)
      }

      public override fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: IResolvable) {
        cdkBuilder.cdcInsertsAndUpdates(cdcInsertsAndUpdates.let(IResolvable::unwrap))
      }

      public override fun cdcInsertsOnly(cdcInsertsOnly: Boolean) {
        cdkBuilder.cdcInsertsOnly(cdcInsertsOnly)
      }

      public override fun cdcInsertsOnly(cdcInsertsOnly: IResolvable) {
        cdkBuilder.cdcInsertsOnly(cdcInsertsOnly.let(IResolvable::unwrap))
      }

      public override fun cdcMaxBatchInterval(cdcMaxBatchInterval: Number) {
        cdkBuilder.cdcMaxBatchInterval(cdcMaxBatchInterval)
      }

      public override fun cdcMinFileSize(cdcMinFileSize: Number) {
        cdkBuilder.cdcMinFileSize(cdcMinFileSize)
      }

      public override fun cdcPath(cdcPath: String) {
        cdkBuilder.cdcPath(cdcPath)
      }

      public override fun compressionType(compressionType: String) {
        cdkBuilder.compressionType(compressionType)
      }

      public override fun csvDelimiter(csvDelimiter: String) {
        cdkBuilder.csvDelimiter(csvDelimiter)
      }

      public override fun csvNoSupValue(csvNoSupValue: String) {
        cdkBuilder.csvNoSupValue(csvNoSupValue)
      }

      public override fun csvNullValue(csvNullValue: String) {
        cdkBuilder.csvNullValue(csvNullValue)
      }

      public override fun csvRowDelimiter(csvRowDelimiter: String) {
        cdkBuilder.csvRowDelimiter(csvRowDelimiter)
      }

      public override fun dataFormat(dataFormat: String) {
        cdkBuilder.dataFormat(dataFormat)
      }

      public override fun dataPageSize(dataPageSize: Number) {
        cdkBuilder.dataPageSize(dataPageSize)
      }

      public override fun datePartitionDelimiter(datePartitionDelimiter: String) {
        cdkBuilder.datePartitionDelimiter(datePartitionDelimiter)
      }

      public override fun datePartitionEnabled(datePartitionEnabled: Boolean) {
        cdkBuilder.datePartitionEnabled(datePartitionEnabled)
      }

      public override fun datePartitionEnabled(datePartitionEnabled: IResolvable) {
        cdkBuilder.datePartitionEnabled(datePartitionEnabled.let(IResolvable::unwrap))
      }

      public override fun datePartitionSequence(datePartitionSequence: String) {
        cdkBuilder.datePartitionSequence(datePartitionSequence)
      }

      public override fun datePartitionTimezone(datePartitionTimezone: String) {
        cdkBuilder.datePartitionTimezone(datePartitionTimezone)
      }

      public override fun dictPageSizeLimit(dictPageSizeLimit: Number) {
        cdkBuilder.dictPageSizeLimit(dictPageSizeLimit)
      }

      public override fun enableStatistics(enableStatistics: Boolean) {
        cdkBuilder.enableStatistics(enableStatistics)
      }

      public override fun enableStatistics(enableStatistics: IResolvable) {
        cdkBuilder.enableStatistics(enableStatistics.let(IResolvable::unwrap))
      }

      public override fun encodingType(encodingType: String) {
        cdkBuilder.encodingType(encodingType)
      }

      public override fun encryptionMode(encryptionMode: String) {
        cdkBuilder.encryptionMode(encryptionMode)
      }

      public override fun expectedBucketOwner(expectedBucketOwner: String) {
        cdkBuilder.expectedBucketOwner(expectedBucketOwner)
      }

      public override fun externalTableDefinition(externalTableDefinition: String) {
        cdkBuilder.externalTableDefinition(externalTableDefinition)
      }

      public override fun glueCatalogGeneration(glueCatalogGeneration: Boolean) {
        cdkBuilder.glueCatalogGeneration(glueCatalogGeneration)
      }

      public override fun glueCatalogGeneration(glueCatalogGeneration: IResolvable) {
        cdkBuilder.glueCatalogGeneration(glueCatalogGeneration.let(IResolvable::unwrap))
      }

      public override fun ignoreHeaderRows(ignoreHeaderRows: Number) {
        cdkBuilder.ignoreHeaderRows(ignoreHeaderRows)
      }

      public override fun includeOpForFullLoad(includeOpForFullLoad: Boolean) {
        cdkBuilder.includeOpForFullLoad(includeOpForFullLoad)
      }

      public override fun includeOpForFullLoad(includeOpForFullLoad: IResolvable) {
        cdkBuilder.includeOpForFullLoad(includeOpForFullLoad.let(IResolvable::unwrap))
      }

      public override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      public override fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: Boolean) {
        cdkBuilder.parquetTimestampInMillisecond(parquetTimestampInMillisecond)
      }

      public override
          fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: IResolvable) {
        cdkBuilder.parquetTimestampInMillisecond(parquetTimestampInMillisecond.let(IResolvable::unwrap))
      }

      public override fun parquetVersion(parquetVersion: String) {
        cdkBuilder.parquetVersion(parquetVersion)
      }

      public override fun preserveTransactions(preserveTransactions: Boolean) {
        cdkBuilder.preserveTransactions(preserveTransactions)
      }

      public override fun preserveTransactions(preserveTransactions: IResolvable) {
        cdkBuilder.preserveTransactions(preserveTransactions.let(IResolvable::unwrap))
      }

      public override fun rfc4180(rfc4180: Boolean) {
        cdkBuilder.rfc4180(rfc4180)
      }

      public override fun rfc4180(rfc4180: IResolvable) {
        cdkBuilder.rfc4180(rfc4180.let(IResolvable::unwrap))
      }

      public override fun rowGroupLength(rowGroupLength: Number) {
        cdkBuilder.rowGroupLength(rowGroupLength)
      }

      public override fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String) {
        cdkBuilder.serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId)
      }

      public override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      public override fun timestampColumnName(timestampColumnName: String) {
        cdkBuilder.timestampColumnName(timestampColumnName)
      }

      public override fun useCsvNoSupValue(useCsvNoSupValue: Boolean) {
        cdkBuilder.useCsvNoSupValue(useCsvNoSupValue)
      }

      public override fun useCsvNoSupValue(useCsvNoSupValue: IResolvable) {
        cdkBuilder.useCsvNoSupValue(useCsvNoSupValue.let(IResolvable::unwrap))
      }

      public override
          fun useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp: Boolean) {
        cdkBuilder.useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp)
      }

      public override
          fun useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp: IResolvable) {
        cdkBuilder.useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty,
    ) : S3SettingsProperty {
      public override fun addColumnName(): Any? = unwrap(this).getAddColumnName()

      public override fun addTrailingPaddingCharacter(): Any? =
          unwrap(this).getAddTrailingPaddingCharacter()

      public override fun bucketFolder(): String? = unwrap(this).getBucketFolder()

      public override fun bucketName(): String? = unwrap(this).getBucketName()

      public override fun cannedAclForObjects(): String? = unwrap(this).getCannedAclForObjects()

      public override fun cdcInsertsAndUpdates(): Any? = unwrap(this).getCdcInsertsAndUpdates()

      public override fun cdcInsertsOnly(): Any? = unwrap(this).getCdcInsertsOnly()

      public override fun cdcMaxBatchInterval(): Number? = unwrap(this).getCdcMaxBatchInterval()

      public override fun cdcMinFileSize(): Number? = unwrap(this).getCdcMinFileSize()

      public override fun cdcPath(): String? = unwrap(this).getCdcPath()

      public override fun compressionType(): String? = unwrap(this).getCompressionType()

      public override fun csvDelimiter(): String? = unwrap(this).getCsvDelimiter()

      public override fun csvNoSupValue(): String? = unwrap(this).getCsvNoSupValue()

      public override fun csvNullValue(): String? = unwrap(this).getCsvNullValue()

      public override fun csvRowDelimiter(): String? = unwrap(this).getCsvRowDelimiter()

      public override fun dataFormat(): String? = unwrap(this).getDataFormat()

      public override fun dataPageSize(): Number? = unwrap(this).getDataPageSize()

      public override fun datePartitionDelimiter(): String? =
          unwrap(this).getDatePartitionDelimiter()

      public override fun datePartitionEnabled(): Any? = unwrap(this).getDatePartitionEnabled()

      public override fun datePartitionSequence(): String? = unwrap(this).getDatePartitionSequence()

      public override fun datePartitionTimezone(): String? = unwrap(this).getDatePartitionTimezone()

      public override fun dictPageSizeLimit(): Number? = unwrap(this).getDictPageSizeLimit()

      public override fun enableStatistics(): Any? = unwrap(this).getEnableStatistics()

      public override fun encodingType(): String? = unwrap(this).getEncodingType()

      public override fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

      public override fun expectedBucketOwner(): String? = unwrap(this).getExpectedBucketOwner()

      public override fun externalTableDefinition(): String? =
          unwrap(this).getExternalTableDefinition()

      public override fun glueCatalogGeneration(): Any? = unwrap(this).getGlueCatalogGeneration()

      public override fun ignoreHeaderRows(): Number? = unwrap(this).getIgnoreHeaderRows()

      public override fun includeOpForFullLoad(): Any? = unwrap(this).getIncludeOpForFullLoad()

      public override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      public override fun parquetTimestampInMillisecond(): Any? =
          unwrap(this).getParquetTimestampInMillisecond()

      public override fun parquetVersion(): String? = unwrap(this).getParquetVersion()

      public override fun preserveTransactions(): Any? = unwrap(this).getPreserveTransactions()

      public override fun rfc4180(): Any? = unwrap(this).getRfc4180()

      public override fun rowGroupLength(): Number? = unwrap(this).getRowGroupLength()

      public override fun serverSideEncryptionKmsKeyId(): String? =
          unwrap(this).getServerSideEncryptionKmsKeyId()

      public override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

      public override fun timestampColumnName(): String? = unwrap(this).getTimestampColumnName()

      public override fun useCsvNoSupValue(): Any? = unwrap(this).getUseCsvNoSupValue()

      public override fun useTaskStartTimeForFullLoadTimestamp(): Any? =
          unwrap(this).getUseTaskStartTimeForFullLoadTimestamp()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty):
          S3SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3SettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SybaseSettingsProperty {
    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    public interface Builder {
      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
      }

      public fun secretsManagerSecretId(secretsManagerSecretId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty.builder()

      public override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      public override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty,
    ) : SybaseSettingsProperty {
      public override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      public override fun secretsManagerSecretId(): String? =
          unwrap(this).getSecretsManagerSecretId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SybaseSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty):
          SybaseSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SybaseSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun bcpPacketSize(bcpPacketSize: Number) {
      }

      public fun controlTablesFileGroup(controlTablesFileGroup: String) {
      }

      public fun databaseName(databaseName: String) {
      }

      public fun forceLobLookup(forceLobLookup: Boolean) {
      }

      public fun forceLobLookup(forceLobLookup: IResolvable) {
      }

      public fun password(password: String) {
      }

      public fun port(port: Number) {
      }

      public fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: Boolean) {
      }

      public fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: IResolvable) {
      }

      public fun readBackupOnly(readBackupOnly: Boolean) {
      }

      public fun readBackupOnly(readBackupOnly: IResolvable) {
      }

      public fun safeguardPolicy(safeguardPolicy: String) {
      }

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
      }

      public fun secretsManagerSecretId(secretsManagerSecretId: String) {
      }

      public fun serverName(serverName: String) {
      }

      public fun tlogAccessMode(tlogAccessMode: String) {
      }

      public fun trimSpaceInChar(trimSpaceInChar: Boolean) {
      }

      public fun trimSpaceInChar(trimSpaceInChar: IResolvable) {
      }

      public fun useBcpFullLoad(useBcpFullLoad: Boolean) {
      }

      public fun useBcpFullLoad(useBcpFullLoad: IResolvable) {
      }

      public fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: Boolean) {
      }

      public fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: IResolvable) {
      }

      public fun username(username: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty.Builder
          =
          software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty.builder()

      public override fun bcpPacketSize(bcpPacketSize: Number) {
        cdkBuilder.bcpPacketSize(bcpPacketSize)
      }

      public override fun controlTablesFileGroup(controlTablesFileGroup: String) {
        cdkBuilder.controlTablesFileGroup(controlTablesFileGroup)
      }

      public override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      public override fun forceLobLookup(forceLobLookup: Boolean) {
        cdkBuilder.forceLobLookup(forceLobLookup)
      }

      public override fun forceLobLookup(forceLobLookup: IResolvable) {
        cdkBuilder.forceLobLookup(forceLobLookup.let(IResolvable::unwrap))
      }

      public override fun password(password: String) {
        cdkBuilder.password(password)
      }

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public override fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: Boolean) {
        cdkBuilder.querySingleAlwaysOnNode(querySingleAlwaysOnNode)
      }

      public override fun querySingleAlwaysOnNode(querySingleAlwaysOnNode: IResolvable) {
        cdkBuilder.querySingleAlwaysOnNode(querySingleAlwaysOnNode.let(IResolvable::unwrap))
      }

      public override fun readBackupOnly(readBackupOnly: Boolean) {
        cdkBuilder.readBackupOnly(readBackupOnly)
      }

      public override fun readBackupOnly(readBackupOnly: IResolvable) {
        cdkBuilder.readBackupOnly(readBackupOnly.let(IResolvable::unwrap))
      }

      public override fun safeguardPolicy(safeguardPolicy: String) {
        cdkBuilder.safeguardPolicy(safeguardPolicy)
      }

      public override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      public override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

      public override fun tlogAccessMode(tlogAccessMode: String) {
        cdkBuilder.tlogAccessMode(tlogAccessMode)
      }

      public override fun trimSpaceInChar(trimSpaceInChar: Boolean) {
        cdkBuilder.trimSpaceInChar(trimSpaceInChar)
      }

      public override fun trimSpaceInChar(trimSpaceInChar: IResolvable) {
        cdkBuilder.trimSpaceInChar(trimSpaceInChar.let(IResolvable::unwrap))
      }

      public override fun useBcpFullLoad(useBcpFullLoad: Boolean) {
        cdkBuilder.useBcpFullLoad(useBcpFullLoad)
      }

      public override fun useBcpFullLoad(useBcpFullLoad: IResolvable) {
        cdkBuilder.useBcpFullLoad(useBcpFullLoad.let(IResolvable::unwrap))
      }

      public override fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: Boolean) {
        cdkBuilder.useThirdPartyBackupDevice(useThirdPartyBackupDevice)
      }

      public override fun useThirdPartyBackupDevice(useThirdPartyBackupDevice: IResolvable) {
        cdkBuilder.useThirdPartyBackupDevice(useThirdPartyBackupDevice.let(IResolvable::unwrap))
      }

      public override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty,
    ) : MicrosoftSqlServerSettingsProperty {
      public override fun bcpPacketSize(): Number? = unwrap(this).getBcpPacketSize()

      public override fun controlTablesFileGroup(): String? =
          unwrap(this).getControlTablesFileGroup()

      public override fun databaseName(): String? = unwrap(this).getDatabaseName()

      public override fun forceLobLookup(): Any? = unwrap(this).getForceLobLookup()

      public override fun password(): String? = unwrap(this).getPassword()

      public override fun port(): Number? = unwrap(this).getPort()

      public override fun querySingleAlwaysOnNode(): Any? =
          unwrap(this).getQuerySingleAlwaysOnNode()

      public override fun readBackupOnly(): Any? = unwrap(this).getReadBackupOnly()

      public override fun safeguardPolicy(): String? = unwrap(this).getSafeguardPolicy()

      public override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      public override fun secretsManagerSecretId(): String? =
          unwrap(this).getSecretsManagerSecretId()

      public override fun serverName(): String? = unwrap(this).getServerName()

      public override fun tlogAccessMode(): String? = unwrap(this).getTlogAccessMode()

      public override fun trimSpaceInChar(): Any? = unwrap(this).getTrimSpaceInChar()

      public override fun useBcpFullLoad(): Any? = unwrap(this).getUseBcpFullLoad()

      public override fun useThirdPartyBackupDevice(): Any? =
          unwrap(this).getUseThirdPartyBackupDevice()

      public override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

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
          (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun currentLsn(currentLsn: String) {
      }

      public fun dataCaptureChanges(setDataCaptureChanges: Boolean) {
      }

      public fun dataCaptureChanges(setDataCaptureChanges: IResolvable) {
      }

      public fun keepCsvFiles(keepCsvFiles: Boolean) {
      }

      public fun keepCsvFiles(keepCsvFiles: IResolvable) {
      }

      public fun loadTimeout(loadTimeout: Number) {
      }

      public fun maxFileSize(maxFileSize: Number) {
      }

      public fun maxKBytesPerRead(maxKBytesPerRead: Number) {
      }

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
      }

      public fun secretsManagerSecretId(secretsManagerSecretId: String) {
      }

      public fun writeBufferSize(writeBufferSize: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty.builder()

      public override fun currentLsn(currentLsn: String) {
        cdkBuilder.currentLsn(currentLsn)
      }

      public override fun dataCaptureChanges(setDataCaptureChanges: Boolean) {
        cdkBuilder.setDataCaptureChanges(setDataCaptureChanges)
      }

      public override fun dataCaptureChanges(setDataCaptureChanges: IResolvable) {
        cdkBuilder.setDataCaptureChanges(setDataCaptureChanges.let(IResolvable::unwrap))
      }

      public override fun keepCsvFiles(keepCsvFiles: Boolean) {
        cdkBuilder.keepCsvFiles(keepCsvFiles)
      }

      public override fun keepCsvFiles(keepCsvFiles: IResolvable) {
        cdkBuilder.keepCsvFiles(keepCsvFiles.let(IResolvable::unwrap))
      }

      public override fun loadTimeout(loadTimeout: Number) {
        cdkBuilder.loadTimeout(loadTimeout)
      }

      public override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      public override fun maxKBytesPerRead(maxKBytesPerRead: Number) {
        cdkBuilder.maxKBytesPerRead(maxKBytesPerRead)
      }

      public override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      public override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public override fun writeBufferSize(writeBufferSize: Number) {
        cdkBuilder.writeBufferSize(writeBufferSize)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty,
    ) : IbmDb2SettingsProperty {
      public override fun currentLsn(): String? = unwrap(this).getCurrentLsn()

      public override fun keepCsvFiles(): Any? = unwrap(this).getKeepCsvFiles()

      public override fun loadTimeout(): Number? = unwrap(this).getLoadTimeout()

      public override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      public override fun maxKBytesPerRead(): Number? = unwrap(this).getMaxKBytesPerRead()

      public override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      public override fun secretsManagerSecretId(): String? =
          unwrap(this).getSecretsManagerSecretId()

      public override fun setDataCaptureChanges(): Any? = unwrap(this).getSetDataCaptureChanges()

      public override fun writeBufferSize(): Number? = unwrap(this).getWriteBufferSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IbmDb2SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty):
          IbmDb2SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IbmDb2SettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DocDbSettingsProperty {
    public fun docsToInvestigate(): Number? = unwrap(this).getDocsToInvestigate()

    public fun extractDocId(): Any? = unwrap(this).getExtractDocId()

    public fun nestingLevel(): String? = unwrap(this).getNestingLevel()

    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    public interface Builder {
      public fun docsToInvestigate(docsToInvestigate: Number) {
      }

      public fun extractDocId(extractDocId: Boolean) {
      }

      public fun extractDocId(extractDocId: IResolvable) {
      }

      public fun nestingLevel(nestingLevel: String) {
      }

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
      }

      public fun secretsManagerSecretId(secretsManagerSecretId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty.builder()

      public override fun docsToInvestigate(docsToInvestigate: Number) {
        cdkBuilder.docsToInvestigate(docsToInvestigate)
      }

      public override fun extractDocId(extractDocId: Boolean) {
        cdkBuilder.extractDocId(extractDocId)
      }

      public override fun extractDocId(extractDocId: IResolvable) {
        cdkBuilder.extractDocId(extractDocId.let(IResolvable::unwrap))
      }

      public override fun nestingLevel(nestingLevel: String) {
        cdkBuilder.nestingLevel(nestingLevel)
      }

      public override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      public override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty,
    ) : DocDbSettingsProperty {
      public override fun docsToInvestigate(): Number? = unwrap(this).getDocsToInvestigate()

      public override fun extractDocId(): Any? = unwrap(this).getExtractDocId()

      public override fun nestingLevel(): String? = unwrap(this).getNestingLevel()

      public override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      public override fun secretsManagerSecretId(): String? =
          unwrap(this).getSecretsManagerSecretId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DocDbSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty):
          DocDbSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocDbSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun acceptAnyDate(acceptAnyDate: Boolean) {
      }

      public fun acceptAnyDate(acceptAnyDate: IResolvable) {
      }

      public fun afterConnectScript(afterConnectScript: String) {
      }

      public fun bucketFolder(bucketFolder: String) {
      }

      public fun bucketName(bucketName: String) {
      }

      public fun caseSensitiveNames(caseSensitiveNames: Boolean) {
      }

      public fun caseSensitiveNames(caseSensitiveNames: IResolvable) {
      }

      public fun compUpdate(compUpdate: Boolean) {
      }

      public fun compUpdate(compUpdate: IResolvable) {
      }

      public fun connectionTimeout(connectionTimeout: Number) {
      }

      public fun dateFormat(dateFormat: String) {
      }

      public fun emptyAsNull(emptyAsNull: Boolean) {
      }

      public fun emptyAsNull(emptyAsNull: IResolvable) {
      }

      public fun encryptionMode(encryptionMode: String) {
      }

      public fun explicitIds(explicitIds: Boolean) {
      }

      public fun explicitIds(explicitIds: IResolvable) {
      }

      public fun fileTransferUploadStreams(fileTransferUploadStreams: Number) {
      }

      public fun loadTimeout(loadTimeout: Number) {
      }

      public fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean) {
      }

      public fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable) {
      }

      public fun maxFileSize(maxFileSize: Number) {
      }

      public fun removeQuotes(removeQuotes: Boolean) {
      }

      public fun removeQuotes(removeQuotes: IResolvable) {
      }

      public fun replaceChars(replaceChars: String) {
      }

      public fun replaceInvalidChars(replaceInvalidChars: String) {
      }

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
      }

      public fun secretsManagerSecretId(secretsManagerSecretId: String) {
      }

      public fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String) {
      }

      public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
      }

      public fun timeFormat(timeFormat: String) {
      }

      public fun trimBlanks(trimBlanks: Boolean) {
      }

      public fun trimBlanks(trimBlanks: IResolvable) {
      }

      public fun truncateColumns(truncateColumns: Boolean) {
      }

      public fun truncateColumns(truncateColumns: IResolvable) {
      }

      public fun writeBufferSize(writeBufferSize: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty.builder()

      public override fun acceptAnyDate(acceptAnyDate: Boolean) {
        cdkBuilder.acceptAnyDate(acceptAnyDate)
      }

      public override fun acceptAnyDate(acceptAnyDate: IResolvable) {
        cdkBuilder.acceptAnyDate(acceptAnyDate.let(IResolvable::unwrap))
      }

      public override fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
      }

      public override fun bucketFolder(bucketFolder: String) {
        cdkBuilder.bucketFolder(bucketFolder)
      }

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun caseSensitiveNames(caseSensitiveNames: Boolean) {
        cdkBuilder.caseSensitiveNames(caseSensitiveNames)
      }

      public override fun caseSensitiveNames(caseSensitiveNames: IResolvable) {
        cdkBuilder.caseSensitiveNames(caseSensitiveNames.let(IResolvable::unwrap))
      }

      public override fun compUpdate(compUpdate: Boolean) {
        cdkBuilder.compUpdate(compUpdate)
      }

      public override fun compUpdate(compUpdate: IResolvable) {
        cdkBuilder.compUpdate(compUpdate.let(IResolvable::unwrap))
      }

      public override fun connectionTimeout(connectionTimeout: Number) {
        cdkBuilder.connectionTimeout(connectionTimeout)
      }

      public override fun dateFormat(dateFormat: String) {
        cdkBuilder.dateFormat(dateFormat)
      }

      public override fun emptyAsNull(emptyAsNull: Boolean) {
        cdkBuilder.emptyAsNull(emptyAsNull)
      }

      public override fun emptyAsNull(emptyAsNull: IResolvable) {
        cdkBuilder.emptyAsNull(emptyAsNull.let(IResolvable::unwrap))
      }

      public override fun encryptionMode(encryptionMode: String) {
        cdkBuilder.encryptionMode(encryptionMode)
      }

      public override fun explicitIds(explicitIds: Boolean) {
        cdkBuilder.explicitIds(explicitIds)
      }

      public override fun explicitIds(explicitIds: IResolvable) {
        cdkBuilder.explicitIds(explicitIds.let(IResolvable::unwrap))
      }

      public override fun fileTransferUploadStreams(fileTransferUploadStreams: Number) {
        cdkBuilder.fileTransferUploadStreams(fileTransferUploadStreams)
      }

      public override fun loadTimeout(loadTimeout: Number) {
        cdkBuilder.loadTimeout(loadTimeout)
      }

      public override fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
      }

      public override fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean.let(IResolvable::unwrap))
      }

      public override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      public override fun removeQuotes(removeQuotes: Boolean) {
        cdkBuilder.removeQuotes(removeQuotes)
      }

      public override fun removeQuotes(removeQuotes: IResolvable) {
        cdkBuilder.removeQuotes(removeQuotes.let(IResolvable::unwrap))
      }

      public override fun replaceChars(replaceChars: String) {
        cdkBuilder.replaceChars(replaceChars)
      }

      public override fun replaceInvalidChars(replaceInvalidChars: String) {
        cdkBuilder.replaceInvalidChars(replaceInvalidChars)
      }

      public override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      public override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public override fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String) {
        cdkBuilder.serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId)
      }

      public override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      public override fun timeFormat(timeFormat: String) {
        cdkBuilder.timeFormat(timeFormat)
      }

      public override fun trimBlanks(trimBlanks: Boolean) {
        cdkBuilder.trimBlanks(trimBlanks)
      }

      public override fun trimBlanks(trimBlanks: IResolvable) {
        cdkBuilder.trimBlanks(trimBlanks.let(IResolvable::unwrap))
      }

      public override fun truncateColumns(truncateColumns: Boolean) {
        cdkBuilder.truncateColumns(truncateColumns)
      }

      public override fun truncateColumns(truncateColumns: IResolvable) {
        cdkBuilder.truncateColumns(truncateColumns.let(IResolvable::unwrap))
      }

      public override fun writeBufferSize(writeBufferSize: Number) {
        cdkBuilder.writeBufferSize(writeBufferSize)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty,
    ) : RedshiftSettingsProperty {
      public override fun acceptAnyDate(): Any? = unwrap(this).getAcceptAnyDate()

      public override fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

      public override fun bucketFolder(): String? = unwrap(this).getBucketFolder()

      public override fun bucketName(): String? = unwrap(this).getBucketName()

      public override fun caseSensitiveNames(): Any? = unwrap(this).getCaseSensitiveNames()

      public override fun compUpdate(): Any? = unwrap(this).getCompUpdate()

      public override fun connectionTimeout(): Number? = unwrap(this).getConnectionTimeout()

      public override fun dateFormat(): String? = unwrap(this).getDateFormat()

      public override fun emptyAsNull(): Any? = unwrap(this).getEmptyAsNull()

      public override fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

      public override fun explicitIds(): Any? = unwrap(this).getExplicitIds()

      public override fun fileTransferUploadStreams(): Number? =
          unwrap(this).getFileTransferUploadStreams()

      public override fun loadTimeout(): Number? = unwrap(this).getLoadTimeout()

      public override fun mapBooleanAsBoolean(): Any? = unwrap(this).getMapBooleanAsBoolean()

      public override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      public override fun removeQuotes(): Any? = unwrap(this).getRemoveQuotes()

      public override fun replaceChars(): String? = unwrap(this).getReplaceChars()

      public override fun replaceInvalidChars(): String? = unwrap(this).getReplaceInvalidChars()

      public override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      public override fun secretsManagerSecretId(): String? =
          unwrap(this).getSecretsManagerSecretId()

      public override fun serverSideEncryptionKmsKeyId(): String? =
          unwrap(this).getServerSideEncryptionKmsKeyId()

      public override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

      public override fun timeFormat(): String? = unwrap(this).getTimeFormat()

      public override fun trimBlanks(): Any? = unwrap(this).getTrimBlanks()

      public override fun truncateColumns(): Any? = unwrap(this).getTruncateColumns()

      public override fun writeBufferSize(): Number? = unwrap(this).getWriteBufferSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty):
          RedshiftSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun authMechanism(authMechanism: String) {
      }

      public fun authSource(authSource: String) {
      }

      public fun authType(authType: String) {
      }

      public fun databaseName(databaseName: String) {
      }

      public fun docsToInvestigate(docsToInvestigate: String) {
      }

      public fun extractDocId(extractDocId: String) {
      }

      public fun nestingLevel(nestingLevel: String) {
      }

      public fun password(password: String) {
      }

      public fun port(port: Number) {
      }

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
      }

      public fun secretsManagerSecretId(secretsManagerSecretId: String) {
      }

      public fun serverName(serverName: String) {
      }

      public fun username(username: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.builder()

      public override fun authMechanism(authMechanism: String) {
        cdkBuilder.authMechanism(authMechanism)
      }

      public override fun authSource(authSource: String) {
        cdkBuilder.authSource(authSource)
      }

      public override fun authType(authType: String) {
        cdkBuilder.authType(authType)
      }

      public override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      public override fun docsToInvestigate(docsToInvestigate: String) {
        cdkBuilder.docsToInvestigate(docsToInvestigate)
      }

      public override fun extractDocId(extractDocId: String) {
        cdkBuilder.extractDocId(extractDocId)
      }

      public override fun nestingLevel(nestingLevel: String) {
        cdkBuilder.nestingLevel(nestingLevel)
      }

      public override fun password(password: String) {
        cdkBuilder.password(password)
      }

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      public override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

      public override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty,
    ) : MongoDbSettingsProperty {
      public override fun authMechanism(): String? = unwrap(this).getAuthMechanism()

      public override fun authSource(): String? = unwrap(this).getAuthSource()

      public override fun authType(): String? = unwrap(this).getAuthType()

      public override fun databaseName(): String? = unwrap(this).getDatabaseName()

      public override fun docsToInvestigate(): String? = unwrap(this).getDocsToInvestigate()

      public override fun extractDocId(): String? = unwrap(this).getExtractDocId()

      public override fun nestingLevel(): String? = unwrap(this).getNestingLevel()

      public override fun password(): String? = unwrap(this).getPassword()

      public override fun port(): Number? = unwrap(this).getPort()

      public override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      public override fun secretsManagerSecretId(): String? =
          unwrap(this).getSecretsManagerSecretId()

      public override fun serverName(): String? = unwrap(this).getServerName()

      public override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MongoDbSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty):
          MongoDbSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MongoDbSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun afterConnectScript(afterConnectScript: String) {
      }

      public fun babelfishDatabaseName(babelfishDatabaseName: String) {
      }

      public fun captureDdls(captureDdls: Boolean) {
      }

      public fun captureDdls(captureDdls: IResolvable) {
      }

      public fun databaseMode(databaseMode: String) {
      }

      public fun ddlArtifactsSchema(ddlArtifactsSchema: String) {
      }

      public fun executeTimeout(executeTimeout: Number) {
      }

      public fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean) {
      }

      public fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable) {
      }

      public fun heartbeatEnable(heartbeatEnable: Boolean) {
      }

      public fun heartbeatEnable(heartbeatEnable: IResolvable) {
      }

      public fun heartbeatFrequency(heartbeatFrequency: Number) {
      }

      public fun heartbeatSchema(heartbeatSchema: String) {
      }

      public fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean) {
      }

      public fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable) {
      }

      public fun maxFileSize(maxFileSize: Number) {
      }

      public fun pluginName(pluginName: String) {
      }

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
      }

      public fun secretsManagerSecretId(secretsManagerSecretId: String) {
      }

      public fun slotName(slotName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty.builder()

      public override fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
      }

      public override fun babelfishDatabaseName(babelfishDatabaseName: String) {
        cdkBuilder.babelfishDatabaseName(babelfishDatabaseName)
      }

      public override fun captureDdls(captureDdls: Boolean) {
        cdkBuilder.captureDdls(captureDdls)
      }

      public override fun captureDdls(captureDdls: IResolvable) {
        cdkBuilder.captureDdls(captureDdls.let(IResolvable::unwrap))
      }

      public override fun databaseMode(databaseMode: String) {
        cdkBuilder.databaseMode(databaseMode)
      }

      public override fun ddlArtifactsSchema(ddlArtifactsSchema: String) {
        cdkBuilder.ddlArtifactsSchema(ddlArtifactsSchema)
      }

      public override fun executeTimeout(executeTimeout: Number) {
        cdkBuilder.executeTimeout(executeTimeout)
      }

      public override fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation)
      }

      public override fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation.let(IResolvable::unwrap))
      }

      public override fun heartbeatEnable(heartbeatEnable: Boolean) {
        cdkBuilder.heartbeatEnable(heartbeatEnable)
      }

      public override fun heartbeatEnable(heartbeatEnable: IResolvable) {
        cdkBuilder.heartbeatEnable(heartbeatEnable.let(IResolvable::unwrap))
      }

      public override fun heartbeatFrequency(heartbeatFrequency: Number) {
        cdkBuilder.heartbeatFrequency(heartbeatFrequency)
      }

      public override fun heartbeatSchema(heartbeatSchema: String) {
        cdkBuilder.heartbeatSchema(heartbeatSchema)
      }

      public override fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
      }

      public override fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean.let(IResolvable::unwrap))
      }

      public override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      public override fun pluginName(pluginName: String) {
        cdkBuilder.pluginName(pluginName)
      }

      public override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      public override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public override fun slotName(slotName: String) {
        cdkBuilder.slotName(slotName)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty,
    ) : PostgreSqlSettingsProperty {
      public override fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

      public override fun babelfishDatabaseName(): String? = unwrap(this).getBabelfishDatabaseName()

      public override fun captureDdls(): Any? = unwrap(this).getCaptureDdls()

      public override fun databaseMode(): String? = unwrap(this).getDatabaseMode()

      public override fun ddlArtifactsSchema(): String? = unwrap(this).getDdlArtifactsSchema()

      public override fun executeTimeout(): Number? = unwrap(this).getExecuteTimeout()

      public override fun failTasksOnLobTruncation(): Any? =
          unwrap(this).getFailTasksOnLobTruncation()

      public override fun heartbeatEnable(): Any? = unwrap(this).getHeartbeatEnable()

      public override fun heartbeatFrequency(): Number? = unwrap(this).getHeartbeatFrequency()

      public override fun heartbeatSchema(): String? = unwrap(this).getHeartbeatSchema()

      public override fun mapBooleanAsBoolean(): Any? = unwrap(this).getMapBooleanAsBoolean()

      public override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      public override fun pluginName(): String? = unwrap(this).getPluginName()

      public override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      public override fun secretsManagerSecretId(): String? =
          unwrap(this).getSecretsManagerSecretId()

      public override fun slotName(): String? = unwrap(this).getSlotName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PostgreSqlSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty):
          PostgreSqlSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PostgreSqlSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun errorRetryDuration(errorRetryDuration: Number) {
      }

      public fun iamAuthEnabled(iamAuthEnabled: Boolean) {
      }

      public fun iamAuthEnabled(iamAuthEnabled: IResolvable) {
      }

      public fun maxFileSize(maxFileSize: Number) {
      }

      public fun maxRetryCount(maxRetryCount: Number) {
      }

      public fun s3BucketFolder(s3BucketFolder: String) {
      }

      public fun s3BucketName(s3BucketName: String) {
      }

      public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty.builder()

      public override fun errorRetryDuration(errorRetryDuration: Number) {
        cdkBuilder.errorRetryDuration(errorRetryDuration)
      }

      public override fun iamAuthEnabled(iamAuthEnabled: Boolean) {
        cdkBuilder.iamAuthEnabled(iamAuthEnabled)
      }

      public override fun iamAuthEnabled(iamAuthEnabled: IResolvable) {
        cdkBuilder.iamAuthEnabled(iamAuthEnabled.let(IResolvable::unwrap))
      }

      public override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      public override fun maxRetryCount(maxRetryCount: Number) {
        cdkBuilder.maxRetryCount(maxRetryCount)
      }

      public override fun s3BucketFolder(s3BucketFolder: String) {
        cdkBuilder.s3BucketFolder(s3BucketFolder)
      }

      public override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      public override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty,
    ) : NeptuneSettingsProperty {
      public override fun errorRetryDuration(): Number? = unwrap(this).getErrorRetryDuration()

      public override fun iamAuthEnabled(): Any? = unwrap(this).getIamAuthEnabled()

      public override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      public override fun maxRetryCount(): Number? = unwrap(this).getMaxRetryCount()

      public override fun s3BucketFolder(): String? = unwrap(this).getS3BucketFolder()

      public override fun s3BucketName(): String? = unwrap(this).getS3BucketName()

      public override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NeptuneSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty):
          NeptuneSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NeptuneSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun includeControlDetails(includeControlDetails: Boolean) {
      }

      public fun includeControlDetails(includeControlDetails: IResolvable) {
      }

      public fun includeNullAndEmpty(includeNullAndEmpty: Boolean) {
      }

      public fun includeNullAndEmpty(includeNullAndEmpty: IResolvable) {
      }

      public fun includePartitionValue(includePartitionValue: Boolean) {
      }

      public fun includePartitionValue(includePartitionValue: IResolvable) {
      }

      public fun includeTableAlterOperations(includeTableAlterOperations: Boolean) {
      }

      public fun includeTableAlterOperations(includeTableAlterOperations: IResolvable) {
      }

      public fun includeTransactionDetails(includeTransactionDetails: Boolean) {
      }

      public fun includeTransactionDetails(includeTransactionDetails: IResolvable) {
      }

      public fun messageFormat(messageFormat: String) {
      }

      public fun noHexPrefix(noHexPrefix: Boolean) {
      }

      public fun noHexPrefix(noHexPrefix: IResolvable) {
      }

      public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean) {
      }

      public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable) {
      }

      public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
      }

      public fun streamArn(streamArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.builder()

      public override fun includeControlDetails(includeControlDetails: Boolean) {
        cdkBuilder.includeControlDetails(includeControlDetails)
      }

      public override fun includeControlDetails(includeControlDetails: IResolvable) {
        cdkBuilder.includeControlDetails(includeControlDetails.let(IResolvable::unwrap))
      }

      public override fun includeNullAndEmpty(includeNullAndEmpty: Boolean) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty)
      }

      public override fun includeNullAndEmpty(includeNullAndEmpty: IResolvable) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty.let(IResolvable::unwrap))
      }

      public override fun includePartitionValue(includePartitionValue: Boolean) {
        cdkBuilder.includePartitionValue(includePartitionValue)
      }

      public override fun includePartitionValue(includePartitionValue: IResolvable) {
        cdkBuilder.includePartitionValue(includePartitionValue.let(IResolvable::unwrap))
      }

      public override fun includeTableAlterOperations(includeTableAlterOperations: Boolean) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations)
      }

      public override fun includeTableAlterOperations(includeTableAlterOperations: IResolvable) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations.let(IResolvable::unwrap))
      }

      public override fun includeTransactionDetails(includeTransactionDetails: Boolean) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails)
      }

      public override fun includeTransactionDetails(includeTransactionDetails: IResolvable) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails.let(IResolvable::unwrap))
      }

      public override fun messageFormat(messageFormat: String) {
        cdkBuilder.messageFormat(messageFormat)
      }

      public override fun noHexPrefix(noHexPrefix: Boolean) {
        cdkBuilder.noHexPrefix(noHexPrefix)
      }

      public override fun noHexPrefix(noHexPrefix: IResolvable) {
        cdkBuilder.noHexPrefix(noHexPrefix.let(IResolvable::unwrap))
      }

      public override fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable)
      }

      public override fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable.let(IResolvable::unwrap))
      }

      public override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      public override fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty,
    ) : KinesisSettingsProperty {
      public override fun includeControlDetails(): Any? = unwrap(this).getIncludeControlDetails()

      public override fun includeNullAndEmpty(): Any? = unwrap(this).getIncludeNullAndEmpty()

      public override fun includePartitionValue(): Any? = unwrap(this).getIncludePartitionValue()

      public override fun includeTableAlterOperations(): Any? =
          unwrap(this).getIncludeTableAlterOperations()

      public override fun includeTransactionDetails(): Any? =
          unwrap(this).getIncludeTransactionDetails()

      public override fun messageFormat(): String? = unwrap(this).getMessageFormat()

      public override fun noHexPrefix(): Any? = unwrap(this).getNoHexPrefix()

      public override fun partitionIncludeSchemaTable(): Any? =
          unwrap(this).getPartitionIncludeSchemaTable()

      public override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

      public override fun streamArn(): String? = unwrap(this).getStreamArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty):
          KinesisSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ElasticsearchSettingsProperty {
    public fun endpointUri(): String? = unwrap(this).getEndpointUri()

    public fun errorRetryDuration(): Number? = unwrap(this).getErrorRetryDuration()

    public fun fullLoadErrorPercentage(): Number? = unwrap(this).getFullLoadErrorPercentage()

    public fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()

    public interface Builder {
      public fun endpointUri(endpointUri: String) {
      }

      public fun errorRetryDuration(errorRetryDuration: Number) {
      }

      public fun fullLoadErrorPercentage(fullLoadErrorPercentage: Number) {
      }

      public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.builder()

      public override fun endpointUri(endpointUri: String) {
        cdkBuilder.endpointUri(endpointUri)
      }

      public override fun errorRetryDuration(errorRetryDuration: Number) {
        cdkBuilder.errorRetryDuration(errorRetryDuration)
      }

      public override fun fullLoadErrorPercentage(fullLoadErrorPercentage: Number) {
        cdkBuilder.fullLoadErrorPercentage(fullLoadErrorPercentage)
      }

      public override fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty,
    ) : ElasticsearchSettingsProperty {
      public override fun endpointUri(): String? = unwrap(this).getEndpointUri()

      public override fun errorRetryDuration(): Number? = unwrap(this).getErrorRetryDuration()

      public override fun fullLoadErrorPercentage(): Number? =
          unwrap(this).getFullLoadErrorPercentage()

      public override fun serviceAccessRoleArn(): String? = unwrap(this).getServiceAccessRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticsearchSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty):
          ElasticsearchSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty = (wrapped
          as Wrapper).cdkObject
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

    public interface Builder {
      public fun authPassword(authPassword: String) {
      }

      public fun authType(authType: String) {
      }

      public fun authUserName(authUserName: String) {
      }

      public fun port(port: Number) {
      }

      public fun serverName(serverName: String) {
      }

      public fun sslCaCertificateArn(sslCaCertificateArn: String) {
      }

      public fun sslSecurityProtocol(sslSecurityProtocol: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty.builder()

      public override fun authPassword(authPassword: String) {
        cdkBuilder.authPassword(authPassword)
      }

      public override fun authType(authType: String) {
        cdkBuilder.authType(authType)
      }

      public override fun authUserName(authUserName: String) {
        cdkBuilder.authUserName(authUserName)
      }

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

      public override fun sslCaCertificateArn(sslCaCertificateArn: String) {
        cdkBuilder.sslCaCertificateArn(sslCaCertificateArn)
      }

      public override fun sslSecurityProtocol(sslSecurityProtocol: String) {
        cdkBuilder.sslSecurityProtocol(sslSecurityProtocol)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty,
    ) : RedisSettingsProperty {
      public override fun authPassword(): String? = unwrap(this).getAuthPassword()

      public override fun authType(): String? = unwrap(this).getAuthType()

      public override fun authUserName(): String? = unwrap(this).getAuthUserName()

      public override fun port(): Number? = unwrap(this).getPort()

      public override fun serverName(): String? = unwrap(this).getServerName()

      public override fun sslCaCertificateArn(): String? = unwrap(this).getSslCaCertificateArn()

      public override fun sslSecurityProtocol(): String? = unwrap(this).getSslSecurityProtocol()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RedisSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty):
          RedisSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedisSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.RedisSettingsProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun afterConnectScript(afterConnectScript: String) {
      }

      public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean) {
      }

      public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable) {
      }

      public fun databaseName(databaseName: String) {
      }

      public fun eventsPollInterval(eventsPollInterval: Number) {
      }

      public fun maxFileSize(maxFileSize: Number) {
      }

      public fun parallelLoadThreads(parallelLoadThreads: Number) {
      }

      public fun password(password: String) {
      }

      public fun port(port: Number) {
      }

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
      }

      public fun secretsManagerSecretId(secretsManagerSecretId: String) {
      }

      public fun serverName(serverName: String) {
      }

      public fun serverTimezone(serverTimezone: String) {
      }

      public fun username(username: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty.builder()

      public override fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
      }

      public override fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch)
      }

      public override
          fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch.let(IResolvable::unwrap))
      }

      public override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      public override fun eventsPollInterval(eventsPollInterval: Number) {
        cdkBuilder.eventsPollInterval(eventsPollInterval)
      }

      public override fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
      }

      public override fun parallelLoadThreads(parallelLoadThreads: Number) {
        cdkBuilder.parallelLoadThreads(parallelLoadThreads)
      }

      public override fun password(password: String) {
        cdkBuilder.password(password)
      }

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      public override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

      public override fun serverTimezone(serverTimezone: String) {
        cdkBuilder.serverTimezone(serverTimezone)
      }

      public override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty,
    ) : GcpMySQLSettingsProperty {
      public override fun afterConnectScript(): String? = unwrap(this).getAfterConnectScript()

      public override fun cleanSourceMetadataOnMismatch(): Any? =
          unwrap(this).getCleanSourceMetadataOnMismatch()

      public override fun databaseName(): String? = unwrap(this).getDatabaseName()

      public override fun eventsPollInterval(): Number? = unwrap(this).getEventsPollInterval()

      public override fun maxFileSize(): Number? = unwrap(this).getMaxFileSize()

      public override fun parallelLoadThreads(): Number? = unwrap(this).getParallelLoadThreads()

      public override fun password(): String? = unwrap(this).getPassword()

      public override fun port(): Number? = unwrap(this).getPort()

      public override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      public override fun secretsManagerSecretId(): String? =
          unwrap(this).getSecretsManagerSecretId()

      public override fun serverName(): String? = unwrap(this).getServerName()

      public override fun serverTimezone(): String? = unwrap(this).getServerTimezone()

      public override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GcpMySQLSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty):
          GcpMySQLSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GcpMySQLSettingsProperty):
          software.amazon.awscdk.services.dms.CfnEndpoint.GcpMySQLSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
