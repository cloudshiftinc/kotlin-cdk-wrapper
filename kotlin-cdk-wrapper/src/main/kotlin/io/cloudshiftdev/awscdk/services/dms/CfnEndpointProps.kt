@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEndpointProps {
  public fun certificateArn(): String? = unwrap(this).getCertificateArn()

  public fun databaseName(): String? = unwrap(this).getDatabaseName()

  public fun docDbSettings(): Any? = unwrap(this).getDocDbSettings()

  public fun dynamoDbSettings(): Any? = unwrap(this).getDynamoDbSettings()

  public fun elasticsearchSettings(): Any? = unwrap(this).getElasticsearchSettings()

  public fun endpointIdentifier(): String? = unwrap(this).getEndpointIdentifier()

  public fun endpointType(): String

  public fun engineName(): String

  public fun extraConnectionAttributes(): String? = unwrap(this).getExtraConnectionAttributes()

  public fun gcpMySqlSettings(): Any? = unwrap(this).getGcpMySqlSettings()

  public fun ibmDb2Settings(): Any? = unwrap(this).getIbmDb2Settings()

  public fun kafkaSettings(): Any? = unwrap(this).getKafkaSettings()

  public fun kinesisSettings(): Any? = unwrap(this).getKinesisSettings()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun microsoftSqlServerSettings(): Any? = unwrap(this).getMicrosoftSqlServerSettings()

  public fun mongoDbSettings(): Any? = unwrap(this).getMongoDbSettings()

  public fun mySqlSettings(): Any? = unwrap(this).getMySqlSettings()

  public fun neptuneSettings(): Any? = unwrap(this).getNeptuneSettings()

  public fun oracleSettings(): Any? = unwrap(this).getOracleSettings()

  public fun password(): String? = unwrap(this).getPassword()

  public fun port(): Number? = unwrap(this).getPort()

  public fun postgreSqlSettings(): Any? = unwrap(this).getPostgreSqlSettings()

  public fun redisSettings(): Any? = unwrap(this).getRedisSettings()

  public fun redshiftSettings(): Any? = unwrap(this).getRedshiftSettings()

  public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  public fun s3Settings(): Any? = unwrap(this).getS3Settings()

  public fun serverName(): String? = unwrap(this).getServerName()

  public fun sslMode(): String? = unwrap(this).getSslMode()

  public fun sybaseSettings(): Any? = unwrap(this).getSybaseSettings()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun username(): String? = unwrap(this).getUsername()

  @CdkDslMarker
  public interface Builder {
    public fun certificateArn(certificateArn: String)

    public fun databaseName(databaseName: String)

    public fun docDbSettings(docDbSettings: IResolvable)

    public fun docDbSettings(docDbSettings: CfnEndpoint.DocDbSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e77dacf15846105a73a00a59a19dff9bcd68da1cfe8b460dd2022428600b8212")
    public fun docDbSettings(docDbSettings: CfnEndpoint.DocDbSettingsProperty.Builder.() -> Unit)

    public fun dynamoDbSettings(dynamoDbSettings: IResolvable)

    public fun dynamoDbSettings(dynamoDbSettings: CfnEndpoint.DynamoDbSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0822ed908d3ab7bf45e9e99cf0606803f960d62cdba5c87bafdfb44f62076cb5")
    public
        fun dynamoDbSettings(dynamoDbSettings: CfnEndpoint.DynamoDbSettingsProperty.Builder.() -> Unit)

    public fun elasticsearchSettings(elasticsearchSettings: IResolvable)

    public
        fun elasticsearchSettings(elasticsearchSettings: CfnEndpoint.ElasticsearchSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c4fc6dc7ca128b49197485a4fb1b96d66305964a873ea584c354f58e4eb0fd8")
    public
        fun elasticsearchSettings(elasticsearchSettings: CfnEndpoint.ElasticsearchSettingsProperty.Builder.() -> Unit)

    public fun endpointIdentifier(endpointIdentifier: String)

    public fun endpointType(endpointType: String)

    public fun engineName(engineName: String)

    public fun extraConnectionAttributes(extraConnectionAttributes: String)

    public fun gcpMySqlSettings(gcpMySqlSettings: IResolvable)

    public fun gcpMySqlSettings(gcpMySqlSettings: CfnEndpoint.GcpMySQLSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bdce1934e8428a7a416d977b65840565c78679136be2bf258bfb775a324b360")
    public
        fun gcpMySqlSettings(gcpMySqlSettings: CfnEndpoint.GcpMySQLSettingsProperty.Builder.() -> Unit)

    public fun ibmDb2Settings(ibmDb2Settings: IResolvable)

    public fun ibmDb2Settings(ibmDb2Settings: CfnEndpoint.IbmDb2SettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3c2afd6f6a01d1e518a78f26262d64d2fff5e8132780de68029053549591e3f")
    public fun ibmDb2Settings(ibmDb2Settings: CfnEndpoint.IbmDb2SettingsProperty.Builder.() -> Unit)

    public fun kafkaSettings(kafkaSettings: IResolvable)

    public fun kafkaSettings(kafkaSettings: CfnEndpoint.KafkaSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19de14fdc024801dae81ce79b34e110500659ebcdea259d5f561d17b98749489")
    public fun kafkaSettings(kafkaSettings: CfnEndpoint.KafkaSettingsProperty.Builder.() -> Unit)

    public fun kinesisSettings(kinesisSettings: IResolvable)

    public fun kinesisSettings(kinesisSettings: CfnEndpoint.KinesisSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab15ec5613d2ed0ebd05453553f36dbf72f5cb328170d11cc63b31678b3677ce")
    public
        fun kinesisSettings(kinesisSettings: CfnEndpoint.KinesisSettingsProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable)

    public
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: CfnEndpoint.MicrosoftSqlServerSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e37f966ee74a291324c8893a322c0eb3ab8b5ef008d9ab14abc8731e7aab6eb4")
    public
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: CfnEndpoint.MicrosoftSqlServerSettingsProperty.Builder.() -> Unit)

    public fun mongoDbSettings(mongoDbSettings: IResolvable)

    public fun mongoDbSettings(mongoDbSettings: CfnEndpoint.MongoDbSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2720bff32948d06229f1bfba05e2c47f01d242d26a8048be87e8124a9f1002d")
    public
        fun mongoDbSettings(mongoDbSettings: CfnEndpoint.MongoDbSettingsProperty.Builder.() -> Unit)

    public fun mySqlSettings(mySqlSettings: IResolvable)

    public fun mySqlSettings(mySqlSettings: CfnEndpoint.MySqlSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd3bee80a35b6f535001f0cf8b63fe9d9d8b631515fc9fc94327b837ad8e80da")
    public fun mySqlSettings(mySqlSettings: CfnEndpoint.MySqlSettingsProperty.Builder.() -> Unit)

    public fun neptuneSettings(neptuneSettings: IResolvable)

    public fun neptuneSettings(neptuneSettings: CfnEndpoint.NeptuneSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f36067e5ce85daa03ca61ac3778c7d894227b2e57d39fb9b4257656bcea43b0")
    public
        fun neptuneSettings(neptuneSettings: CfnEndpoint.NeptuneSettingsProperty.Builder.() -> Unit)

    public fun oracleSettings(oracleSettings: IResolvable)

    public fun oracleSettings(oracleSettings: CfnEndpoint.OracleSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("897a722a39657b5927f4be49354008a87a0b669feacf20ac1de53f733aaf61d9")
    public fun oracleSettings(oracleSettings: CfnEndpoint.OracleSettingsProperty.Builder.() -> Unit)

    public fun password(password: String)

    public fun port(port: Number)

    public fun postgreSqlSettings(postgreSqlSettings: IResolvable)

    public fun postgreSqlSettings(postgreSqlSettings: CfnEndpoint.PostgreSqlSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5700759c8208ccfb744002c2be9d6e2b3a5dae8cebb3f59a3be1ad3b02f4e438")
    public
        fun postgreSqlSettings(postgreSqlSettings: CfnEndpoint.PostgreSqlSettingsProperty.Builder.() -> Unit)

    public fun redisSettings(redisSettings: IResolvable)

    public fun redisSettings(redisSettings: CfnEndpoint.RedisSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b357f517af628a373dacc821735c5ad45c2985aae7edb325d7f6a88625d12a64")
    public fun redisSettings(redisSettings: CfnEndpoint.RedisSettingsProperty.Builder.() -> Unit)

    public fun redshiftSettings(redshiftSettings: IResolvable)

    public fun redshiftSettings(redshiftSettings: CfnEndpoint.RedshiftSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bbb876b980065b8decc8028cc4cfc3dddc084c1d570bd68ce14f00a2688ac5d")
    public
        fun redshiftSettings(redshiftSettings: CfnEndpoint.RedshiftSettingsProperty.Builder.() -> Unit)

    public fun resourceIdentifier(resourceIdentifier: String)

    public fun s3Settings(s3Settings: IResolvable)

    public fun s3Settings(s3Settings: CfnEndpoint.S3SettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2d4e683353cefc8a680a2b529c1ca634f1d3805ad2057229979a7aa25b8d5e6")
    public fun s3Settings(s3Settings: CfnEndpoint.S3SettingsProperty.Builder.() -> Unit)

    public fun serverName(serverName: String)

    public fun sslMode(sslMode: String)

    public fun sybaseSettings(sybaseSettings: IResolvable)

    public fun sybaseSettings(sybaseSettings: CfnEndpoint.SybaseSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bbce14b71fda4deb60dfac3d4695c0afaa6433dcff931c653e22605de1ed014")
    public fun sybaseSettings(sybaseSettings: CfnEndpoint.SybaseSettingsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnEndpointProps.Builder =
        software.amazon.awscdk.services.dms.CfnEndpointProps.builder()

    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    override fun docDbSettings(docDbSettings: IResolvable) {
      cdkBuilder.docDbSettings(docDbSettings.let(IResolvable::unwrap))
    }

    override fun docDbSettings(docDbSettings: CfnEndpoint.DocDbSettingsProperty) {
      cdkBuilder.docDbSettings(docDbSettings.let(CfnEndpoint.DocDbSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e77dacf15846105a73a00a59a19dff9bcd68da1cfe8b460dd2022428600b8212")
    override fun docDbSettings(docDbSettings: CfnEndpoint.DocDbSettingsProperty.Builder.() -> Unit):
        Unit = docDbSettings(CfnEndpoint.DocDbSettingsProperty(docDbSettings))

    override fun dynamoDbSettings(dynamoDbSettings: IResolvable) {
      cdkBuilder.dynamoDbSettings(dynamoDbSettings.let(IResolvable::unwrap))
    }

    override fun dynamoDbSettings(dynamoDbSettings: CfnEndpoint.DynamoDbSettingsProperty) {
      cdkBuilder.dynamoDbSettings(dynamoDbSettings.let(CfnEndpoint.DynamoDbSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0822ed908d3ab7bf45e9e99cf0606803f960d62cdba5c87bafdfb44f62076cb5")
    override
        fun dynamoDbSettings(dynamoDbSettings: CfnEndpoint.DynamoDbSettingsProperty.Builder.() -> Unit):
        Unit = dynamoDbSettings(CfnEndpoint.DynamoDbSettingsProperty(dynamoDbSettings))

    override fun elasticsearchSettings(elasticsearchSettings: IResolvable) {
      cdkBuilder.elasticsearchSettings(elasticsearchSettings.let(IResolvable::unwrap))
    }

    override
        fun elasticsearchSettings(elasticsearchSettings: CfnEndpoint.ElasticsearchSettingsProperty) {
      cdkBuilder.elasticsearchSettings(elasticsearchSettings.let(CfnEndpoint.ElasticsearchSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c4fc6dc7ca128b49197485a4fb1b96d66305964a873ea584c354f58e4eb0fd8")
    override
        fun elasticsearchSettings(elasticsearchSettings: CfnEndpoint.ElasticsearchSettingsProperty.Builder.() -> Unit):
        Unit =
        elasticsearchSettings(CfnEndpoint.ElasticsearchSettingsProperty(elasticsearchSettings))

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

    override fun gcpMySqlSettings(gcpMySqlSettings: CfnEndpoint.GcpMySQLSettingsProperty) {
      cdkBuilder.gcpMySqlSettings(gcpMySqlSettings.let(CfnEndpoint.GcpMySQLSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bdce1934e8428a7a416d977b65840565c78679136be2bf258bfb775a324b360")
    override
        fun gcpMySqlSettings(gcpMySqlSettings: CfnEndpoint.GcpMySQLSettingsProperty.Builder.() -> Unit):
        Unit = gcpMySqlSettings(CfnEndpoint.GcpMySQLSettingsProperty(gcpMySqlSettings))

    override fun ibmDb2Settings(ibmDb2Settings: IResolvable) {
      cdkBuilder.ibmDb2Settings(ibmDb2Settings.let(IResolvable::unwrap))
    }

    override fun ibmDb2Settings(ibmDb2Settings: CfnEndpoint.IbmDb2SettingsProperty) {
      cdkBuilder.ibmDb2Settings(ibmDb2Settings.let(CfnEndpoint.IbmDb2SettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3c2afd6f6a01d1e518a78f26262d64d2fff5e8132780de68029053549591e3f")
    override
        fun ibmDb2Settings(ibmDb2Settings: CfnEndpoint.IbmDb2SettingsProperty.Builder.() -> Unit):
        Unit = ibmDb2Settings(CfnEndpoint.IbmDb2SettingsProperty(ibmDb2Settings))

    override fun kafkaSettings(kafkaSettings: IResolvable) {
      cdkBuilder.kafkaSettings(kafkaSettings.let(IResolvable::unwrap))
    }

    override fun kafkaSettings(kafkaSettings: CfnEndpoint.KafkaSettingsProperty) {
      cdkBuilder.kafkaSettings(kafkaSettings.let(CfnEndpoint.KafkaSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19de14fdc024801dae81ce79b34e110500659ebcdea259d5f561d17b98749489")
    override fun kafkaSettings(kafkaSettings: CfnEndpoint.KafkaSettingsProperty.Builder.() -> Unit):
        Unit = kafkaSettings(CfnEndpoint.KafkaSettingsProperty(kafkaSettings))

    override fun kinesisSettings(kinesisSettings: IResolvable) {
      cdkBuilder.kinesisSettings(kinesisSettings.let(IResolvable::unwrap))
    }

    override fun kinesisSettings(kinesisSettings: CfnEndpoint.KinesisSettingsProperty) {
      cdkBuilder.kinesisSettings(kinesisSettings.let(CfnEndpoint.KinesisSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab15ec5613d2ed0ebd05453553f36dbf72f5cb328170d11cc63b31678b3677ce")
    override
        fun kinesisSettings(kinesisSettings: CfnEndpoint.KinesisSettingsProperty.Builder.() -> Unit):
        Unit = kinesisSettings(CfnEndpoint.KinesisSettingsProperty(kinesisSettings))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable) {
      cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings.let(IResolvable::unwrap))
    }

    override
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: CfnEndpoint.MicrosoftSqlServerSettingsProperty) {
      cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings.let(CfnEndpoint.MicrosoftSqlServerSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e37f966ee74a291324c8893a322c0eb3ab8b5ef008d9ab14abc8731e7aab6eb4")
    override
        fun microsoftSqlServerSettings(microsoftSqlServerSettings: CfnEndpoint.MicrosoftSqlServerSettingsProperty.Builder.() -> Unit):
        Unit =
        microsoftSqlServerSettings(CfnEndpoint.MicrosoftSqlServerSettingsProperty(microsoftSqlServerSettings))

    override fun mongoDbSettings(mongoDbSettings: IResolvable) {
      cdkBuilder.mongoDbSettings(mongoDbSettings.let(IResolvable::unwrap))
    }

    override fun mongoDbSettings(mongoDbSettings: CfnEndpoint.MongoDbSettingsProperty) {
      cdkBuilder.mongoDbSettings(mongoDbSettings.let(CfnEndpoint.MongoDbSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2720bff32948d06229f1bfba05e2c47f01d242d26a8048be87e8124a9f1002d")
    override
        fun mongoDbSettings(mongoDbSettings: CfnEndpoint.MongoDbSettingsProperty.Builder.() -> Unit):
        Unit = mongoDbSettings(CfnEndpoint.MongoDbSettingsProperty(mongoDbSettings))

    override fun mySqlSettings(mySqlSettings: IResolvable) {
      cdkBuilder.mySqlSettings(mySqlSettings.let(IResolvable::unwrap))
    }

    override fun mySqlSettings(mySqlSettings: CfnEndpoint.MySqlSettingsProperty) {
      cdkBuilder.mySqlSettings(mySqlSettings.let(CfnEndpoint.MySqlSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd3bee80a35b6f535001f0cf8b63fe9d9d8b631515fc9fc94327b837ad8e80da")
    override fun mySqlSettings(mySqlSettings: CfnEndpoint.MySqlSettingsProperty.Builder.() -> Unit):
        Unit = mySqlSettings(CfnEndpoint.MySqlSettingsProperty(mySqlSettings))

    override fun neptuneSettings(neptuneSettings: IResolvable) {
      cdkBuilder.neptuneSettings(neptuneSettings.let(IResolvable::unwrap))
    }

    override fun neptuneSettings(neptuneSettings: CfnEndpoint.NeptuneSettingsProperty) {
      cdkBuilder.neptuneSettings(neptuneSettings.let(CfnEndpoint.NeptuneSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f36067e5ce85daa03ca61ac3778c7d894227b2e57d39fb9b4257656bcea43b0")
    override
        fun neptuneSettings(neptuneSettings: CfnEndpoint.NeptuneSettingsProperty.Builder.() -> Unit):
        Unit = neptuneSettings(CfnEndpoint.NeptuneSettingsProperty(neptuneSettings))

    override fun oracleSettings(oracleSettings: IResolvable) {
      cdkBuilder.oracleSettings(oracleSettings.let(IResolvable::unwrap))
    }

    override fun oracleSettings(oracleSettings: CfnEndpoint.OracleSettingsProperty) {
      cdkBuilder.oracleSettings(oracleSettings.let(CfnEndpoint.OracleSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("897a722a39657b5927f4be49354008a87a0b669feacf20ac1de53f733aaf61d9")
    override
        fun oracleSettings(oracleSettings: CfnEndpoint.OracleSettingsProperty.Builder.() -> Unit):
        Unit = oracleSettings(CfnEndpoint.OracleSettingsProperty(oracleSettings))

    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun postgreSqlSettings(postgreSqlSettings: IResolvable) {
      cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(IResolvable::unwrap))
    }

    override fun postgreSqlSettings(postgreSqlSettings: CfnEndpoint.PostgreSqlSettingsProperty) {
      cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(CfnEndpoint.PostgreSqlSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5700759c8208ccfb744002c2be9d6e2b3a5dae8cebb3f59a3be1ad3b02f4e438")
    override
        fun postgreSqlSettings(postgreSqlSettings: CfnEndpoint.PostgreSqlSettingsProperty.Builder.() -> Unit):
        Unit = postgreSqlSettings(CfnEndpoint.PostgreSqlSettingsProperty(postgreSqlSettings))

    override fun redisSettings(redisSettings: IResolvable) {
      cdkBuilder.redisSettings(redisSettings.let(IResolvable::unwrap))
    }

    override fun redisSettings(redisSettings: CfnEndpoint.RedisSettingsProperty) {
      cdkBuilder.redisSettings(redisSettings.let(CfnEndpoint.RedisSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b357f517af628a373dacc821735c5ad45c2985aae7edb325d7f6a88625d12a64")
    override fun redisSettings(redisSettings: CfnEndpoint.RedisSettingsProperty.Builder.() -> Unit):
        Unit = redisSettings(CfnEndpoint.RedisSettingsProperty(redisSettings))

    override fun redshiftSettings(redshiftSettings: IResolvable) {
      cdkBuilder.redshiftSettings(redshiftSettings.let(IResolvable::unwrap))
    }

    override fun redshiftSettings(redshiftSettings: CfnEndpoint.RedshiftSettingsProperty) {
      cdkBuilder.redshiftSettings(redshiftSettings.let(CfnEndpoint.RedshiftSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bbb876b980065b8decc8028cc4cfc3dddc084c1d570bd68ce14f00a2688ac5d")
    override
        fun redshiftSettings(redshiftSettings: CfnEndpoint.RedshiftSettingsProperty.Builder.() -> Unit):
        Unit = redshiftSettings(CfnEndpoint.RedshiftSettingsProperty(redshiftSettings))

    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    override fun s3Settings(s3Settings: IResolvable) {
      cdkBuilder.s3Settings(s3Settings.let(IResolvable::unwrap))
    }

    override fun s3Settings(s3Settings: CfnEndpoint.S3SettingsProperty) {
      cdkBuilder.s3Settings(s3Settings.let(CfnEndpoint.S3SettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2d4e683353cefc8a680a2b529c1ca634f1d3805ad2057229979a7aa25b8d5e6")
    override fun s3Settings(s3Settings: CfnEndpoint.S3SettingsProperty.Builder.() -> Unit): Unit =
        s3Settings(CfnEndpoint.S3SettingsProperty(s3Settings))

    override fun serverName(serverName: String) {
      cdkBuilder.serverName(serverName)
    }

    override fun sslMode(sslMode: String) {
      cdkBuilder.sslMode(sslMode)
    }

    override fun sybaseSettings(sybaseSettings: IResolvable) {
      cdkBuilder.sybaseSettings(sybaseSettings.let(IResolvable::unwrap))
    }

    override fun sybaseSettings(sybaseSettings: CfnEndpoint.SybaseSettingsProperty) {
      cdkBuilder.sybaseSettings(sybaseSettings.let(CfnEndpoint.SybaseSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bbce14b71fda4deb60dfac3d4695c0afaa6433dcff931c653e22605de1ed014")
    override
        fun sybaseSettings(sybaseSettings: CfnEndpoint.SybaseSettingsProperty.Builder.() -> Unit):
        Unit = sybaseSettings(CfnEndpoint.SybaseSettingsProperty(sybaseSettings))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnEndpointProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnEndpointProps,
  ) : CdkObject(cdkObject), CfnEndpointProps {
    override fun certificateArn(): String? = unwrap(this).getCertificateArn()

    override fun databaseName(): String? = unwrap(this).getDatabaseName()

    override fun docDbSettings(): Any? = unwrap(this).getDocDbSettings()

    override fun dynamoDbSettings(): Any? = unwrap(this).getDynamoDbSettings()

    override fun elasticsearchSettings(): Any? = unwrap(this).getElasticsearchSettings()

    override fun endpointIdentifier(): String? = unwrap(this).getEndpointIdentifier()

    override fun endpointType(): String = unwrap(this).getEndpointType()

    override fun engineName(): String = unwrap(this).getEngineName()

    override fun extraConnectionAttributes(): String? = unwrap(this).getExtraConnectionAttributes()

    override fun gcpMySqlSettings(): Any? = unwrap(this).getGcpMySqlSettings()

    override fun ibmDb2Settings(): Any? = unwrap(this).getIbmDb2Settings()

    override fun kafkaSettings(): Any? = unwrap(this).getKafkaSettings()

    override fun kinesisSettings(): Any? = unwrap(this).getKinesisSettings()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun microsoftSqlServerSettings(): Any? = unwrap(this).getMicrosoftSqlServerSettings()

    override fun mongoDbSettings(): Any? = unwrap(this).getMongoDbSettings()

    override fun mySqlSettings(): Any? = unwrap(this).getMySqlSettings()

    override fun neptuneSettings(): Any? = unwrap(this).getNeptuneSettings()

    override fun oracleSettings(): Any? = unwrap(this).getOracleSettings()

    override fun password(): String? = unwrap(this).getPassword()

    override fun port(): Number? = unwrap(this).getPort()

    override fun postgreSqlSettings(): Any? = unwrap(this).getPostgreSqlSettings()

    override fun redisSettings(): Any? = unwrap(this).getRedisSettings()

    override fun redshiftSettings(): Any? = unwrap(this).getRedshiftSettings()

    override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    override fun s3Settings(): Any? = unwrap(this).getS3Settings()

    override fun serverName(): String? = unwrap(this).getServerName()

    override fun sslMode(): String? = unwrap(this).getSslMode()

    override fun sybaseSettings(): Any? = unwrap(this).getSybaseSettings()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun username(): String? = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnEndpointProps):
        CfnEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointProps):
        software.amazon.awscdk.services.dms.CfnEndpointProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.dms.CfnEndpointProps
  }
}
