package io.cloudshiftdev.awscdk.services.kinesisfirehose

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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDeliveryStream internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun amazonOpenSearchServerlessDestinationConfiguration(): Any? =
      unwrap(this).getAmazonOpenSearchServerlessDestinationConfiguration()

  public open fun amazonOpenSearchServerlessDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setAmazonOpenSearchServerlessDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun amazonOpenSearchServerlessDestinationConfiguration(`value`: AmazonOpenSearchServerlessDestinationConfigurationProperty) {
    unwrap(this).setAmazonOpenSearchServerlessDestinationConfiguration(`value`.let(AmazonOpenSearchServerlessDestinationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5915aff60f1d0638bdfbba93b505f7af60bc52a040509a536e5bc8da8cb6e601")
  public open
      fun amazonOpenSearchServerlessDestinationConfiguration(`value`: AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder.() -> Unit):
      Unit =
      amazonOpenSearchServerlessDestinationConfiguration(AmazonOpenSearchServerlessDestinationConfigurationProperty(`value`))

  public open fun amazonopensearchserviceDestinationConfiguration(): Any? =
      unwrap(this).getAmazonopensearchserviceDestinationConfiguration()

  public open fun amazonopensearchserviceDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setAmazonopensearchserviceDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun amazonopensearchserviceDestinationConfiguration(`value`: AmazonopensearchserviceDestinationConfigurationProperty) {
    unwrap(this).setAmazonopensearchserviceDestinationConfiguration(`value`.let(AmazonopensearchserviceDestinationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("affac0fd96543f0259c27aabaa403cc003377ad41286e7a11605b10abb98413c")
  public open
      fun amazonopensearchserviceDestinationConfiguration(`value`: AmazonopensearchserviceDestinationConfigurationProperty.Builder.() -> Unit):
      Unit =
      amazonopensearchserviceDestinationConfiguration(AmazonopensearchserviceDestinationConfigurationProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun deliveryStreamEncryptionConfigurationInput(): Any? =
      unwrap(this).getDeliveryStreamEncryptionConfigurationInput()

  public open fun deliveryStreamEncryptionConfigurationInput(`value`: IResolvable) {
    unwrap(this).setDeliveryStreamEncryptionConfigurationInput(`value`.let(IResolvable::unwrap))
  }

  public open
      fun deliveryStreamEncryptionConfigurationInput(`value`: DeliveryStreamEncryptionConfigurationInputProperty) {
    unwrap(this).setDeliveryStreamEncryptionConfigurationInput(`value`.let(DeliveryStreamEncryptionConfigurationInputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d97c001fdb104637b35834a93311f749d1616ef59ea428fa2f03a567a389c537")
  public open
      fun deliveryStreamEncryptionConfigurationInput(`value`: DeliveryStreamEncryptionConfigurationInputProperty.Builder.() -> Unit):
      Unit =
      deliveryStreamEncryptionConfigurationInput(DeliveryStreamEncryptionConfigurationInputProperty(`value`))

  public open fun deliveryStreamName(): String? = unwrap(this).getDeliveryStreamName()

  public open fun deliveryStreamName(`value`: String) {
    unwrap(this).setDeliveryStreamName(`value`)
  }

  public open fun deliveryStreamType(): String? = unwrap(this).getDeliveryStreamType()

  public open fun deliveryStreamType(`value`: String) {
    unwrap(this).setDeliveryStreamType(`value`)
  }

  public open fun elasticsearchDestinationConfiguration(): Any? =
      unwrap(this).getElasticsearchDestinationConfiguration()

  public open fun elasticsearchDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setElasticsearchDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun elasticsearchDestinationConfiguration(`value`: ElasticsearchDestinationConfigurationProperty) {
    unwrap(this).setElasticsearchDestinationConfiguration(`value`.let(ElasticsearchDestinationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("41dc2f36d2a4d49721f6662c6fc1465511d3560e22d6649372fda8b2129f1027")
  public open
      fun elasticsearchDestinationConfiguration(`value`: ElasticsearchDestinationConfigurationProperty.Builder.() -> Unit):
      Unit =
      elasticsearchDestinationConfiguration(ElasticsearchDestinationConfigurationProperty(`value`))

  public open fun extendedS3DestinationConfiguration(): Any? =
      unwrap(this).getExtendedS3DestinationConfiguration()

  public open fun extendedS3DestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setExtendedS3DestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun extendedS3DestinationConfiguration(`value`: ExtendedS3DestinationConfigurationProperty) {
    unwrap(this).setExtendedS3DestinationConfiguration(`value`.let(ExtendedS3DestinationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3250254b74951e4534cc96e8656961d1ad33f390c4ae19922de92a0577a4c5cf")
  public open
      fun extendedS3DestinationConfiguration(`value`: ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit):
      Unit = extendedS3DestinationConfiguration(ExtendedS3DestinationConfigurationProperty(`value`))

  public open fun httpEndpointDestinationConfiguration(): Any? =
      unwrap(this).getHttpEndpointDestinationConfiguration()

  public open fun httpEndpointDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setHttpEndpointDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun httpEndpointDestinationConfiguration(`value`: HttpEndpointDestinationConfigurationProperty) {
    unwrap(this).setHttpEndpointDestinationConfiguration(`value`.let(HttpEndpointDestinationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f1127a1e2b30c9ee0de3b6d01c0f51cd4166ed22309696e81146f613d60dfac6")
  public open
      fun httpEndpointDestinationConfiguration(`value`: HttpEndpointDestinationConfigurationProperty.Builder.() -> Unit):
      Unit =
      httpEndpointDestinationConfiguration(HttpEndpointDestinationConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kinesisStreamSourceConfiguration(): Any? =
      unwrap(this).getKinesisStreamSourceConfiguration()

  public open fun kinesisStreamSourceConfiguration(`value`: IResolvable) {
    unwrap(this).setKinesisStreamSourceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun kinesisStreamSourceConfiguration(`value`: KinesisStreamSourceConfigurationProperty) {
    unwrap(this).setKinesisStreamSourceConfiguration(`value`.let(KinesisStreamSourceConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bec64671a039e7f3d600db5b2deafee114b7c8e96a1fcfbb22df4156cfd7d246")
  public open
      fun kinesisStreamSourceConfiguration(`value`: KinesisStreamSourceConfigurationProperty.Builder.() -> Unit):
      Unit = kinesisStreamSourceConfiguration(KinesisStreamSourceConfigurationProperty(`value`))

  public open fun mskSourceConfiguration(): Any? = unwrap(this).getMskSourceConfiguration()

  public open fun mskSourceConfiguration(`value`: IResolvable) {
    unwrap(this).setMskSourceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun mskSourceConfiguration(`value`: MSKSourceConfigurationProperty) {
    unwrap(this).setMskSourceConfiguration(`value`.let(MSKSourceConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3bca8e7b137f0a0fbd4a5462a4adc2507b4bcb66dc4c94ead43a482bd58ce901")
  public open
      fun mskSourceConfiguration(`value`: MSKSourceConfigurationProperty.Builder.() -> Unit): Unit =
      mskSourceConfiguration(MSKSourceConfigurationProperty(`value`))

  public open fun redshiftDestinationConfiguration(): Any? =
      unwrap(this).getRedshiftDestinationConfiguration()

  public open fun redshiftDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setRedshiftDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun redshiftDestinationConfiguration(`value`: RedshiftDestinationConfigurationProperty) {
    unwrap(this).setRedshiftDestinationConfiguration(`value`.let(RedshiftDestinationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e417d11ce2a0067772fc8122139fd232a8c8188f3bcfd5df15c67b5007845752")
  public open
      fun redshiftDestinationConfiguration(`value`: RedshiftDestinationConfigurationProperty.Builder.() -> Unit):
      Unit = redshiftDestinationConfiguration(RedshiftDestinationConfigurationProperty(`value`))

  public open fun s3DestinationConfiguration(): Any? = unwrap(this).getS3DestinationConfiguration()

  public open fun s3DestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setS3DestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun s3DestinationConfiguration(`value`: S3DestinationConfigurationProperty) {
    unwrap(this).setS3DestinationConfiguration(`value`.let(S3DestinationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("15cf8a750eb93a46accbc857845d3567e9cc409852bfea7fd2dff5a5f990a6e9")
  public open
      fun s3DestinationConfiguration(`value`: S3DestinationConfigurationProperty.Builder.() -> Unit):
      Unit = s3DestinationConfiguration(S3DestinationConfigurationProperty(`value`))

  public open fun snowflakeDestinationConfiguration(): Any? =
      unwrap(this).getSnowflakeDestinationConfiguration()

  public open fun snowflakeDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setSnowflakeDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun snowflakeDestinationConfiguration(`value`: SnowflakeDestinationConfigurationProperty) {
    unwrap(this).setSnowflakeDestinationConfiguration(`value`.let(SnowflakeDestinationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("abfbb4a67b1231a5f5ff6a4e3ac8e545473af9b6c88236f592b452affc85ac89")
  public open
      fun snowflakeDestinationConfiguration(`value`: SnowflakeDestinationConfigurationProperty.Builder.() -> Unit):
      Unit = snowflakeDestinationConfiguration(SnowflakeDestinationConfigurationProperty(`value`))

  public open fun splunkDestinationConfiguration(): Any? =
      unwrap(this).getSplunkDestinationConfiguration()

  public open fun splunkDestinationConfiguration(`value`: IResolvable) {
    unwrap(this).setSplunkDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun splunkDestinationConfiguration(`value`: SplunkDestinationConfigurationProperty) {
    unwrap(this).setSplunkDestinationConfiguration(`value`.let(SplunkDestinationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c527b6fdd45ed69e81e7fcdb61119b8c6e5e1991b9774c5fc0ee38f22cb08e59")
  public open
      fun splunkDestinationConfiguration(`value`: SplunkDestinationConfigurationProperty.Builder.() -> Unit):
      Unit = splunkDestinationConfiguration(SplunkDestinationConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: IResolvable)

    public
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: AmazonOpenSearchServerlessDestinationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6853de422f2e16dfe8a986fcc9f02e63b77b55179c8bebfbbec5b5200944acd")
    public
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder.() -> Unit)

    public
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: IResolvable)

    public
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: AmazonopensearchserviceDestinationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0e750dd8298dba0e5c02f301c88e6a2f91f32b1eb4c4d5bf8cd380c5a643229")
    public
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: AmazonopensearchserviceDestinationConfigurationProperty.Builder.() -> Unit)

    public
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: IResolvable)

    public
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: DeliveryStreamEncryptionConfigurationInputProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ab692c19801842492183b9e872222254e095277511bf02e81be652274d244d1")
    public
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: DeliveryStreamEncryptionConfigurationInputProperty.Builder.() -> Unit)

    public fun deliveryStreamName(deliveryStreamName: String)

    public fun deliveryStreamType(deliveryStreamType: String)

    public
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: IResolvable)

    public
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: ElasticsearchDestinationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e250eef7235cc63f426265344f51a8ff69fcc8cd948c0e67f937d5bdf1245fd")
    public
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: ElasticsearchDestinationConfigurationProperty.Builder.() -> Unit)

    public fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: IResolvable)

    public
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: ExtendedS3DestinationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("804c0ad62fefcbd3a84762891f680a28e32d801c8adae97f7dc25df681c39728")
    public
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit)

    public
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: IResolvable)

    public
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: HttpEndpointDestinationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02bda40d7d17a3bea2aa4bdc2c92fe46910fdb0919bfd3fc4954f2bc133f5a85")
    public
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: HttpEndpointDestinationConfigurationProperty.Builder.() -> Unit)

    public fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: IResolvable)

    public
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: KinesisStreamSourceConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c8ff51ace8046f164b30f7b7c7ac9b9cad0a6405a4a04f198383d16b4f369f2")
    public
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: KinesisStreamSourceConfigurationProperty.Builder.() -> Unit)

    public fun mskSourceConfiguration(mskSourceConfiguration: IResolvable)

    public fun mskSourceConfiguration(mskSourceConfiguration: MSKSourceConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("167b672ab608a479965f8b9832f5d781f2ea06250b1edf2687df728d87242969")
    public
        fun mskSourceConfiguration(mskSourceConfiguration: MSKSourceConfigurationProperty.Builder.() -> Unit)

    public fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: IResolvable)

    public
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: RedshiftDestinationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74cb5c9a75ab0d5d3125ae16330f7f4a07f9daa3f09b90f46df915fd8c345a18")
    public
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: RedshiftDestinationConfigurationProperty.Builder.() -> Unit)

    public fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable)

    public
        fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cef601312d98974061b66bd8152f76623e6f4dd72a5526c35dd1f6c5850f24c0")
    public
        fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit)

    public fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: IResolvable)

    public
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: SnowflakeDestinationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15cbf3df7ca5c2d9edaafbedfcc169f3791bdb7c223e6bb201410f57eb9bb10c")
    public
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: SnowflakeDestinationConfigurationProperty.Builder.() -> Unit)

    public fun splunkDestinationConfiguration(splunkDestinationConfiguration: IResolvable)

    public
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: SplunkDestinationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b63f26c8956fbfe5ba15ca0ae73dd495f67dee4d1673fd29dff176ebbeaef6e")
    public
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: SplunkDestinationConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.Builder =
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.Builder.create(scope, id)

    override
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: IResolvable) {
      cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: AmazonOpenSearchServerlessDestinationConfigurationProperty) {
      cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration.let(AmazonOpenSearchServerlessDestinationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6853de422f2e16dfe8a986fcc9f02e63b77b55179c8bebfbbec5b5200944acd")
    override
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        amazonOpenSearchServerlessDestinationConfiguration(AmazonOpenSearchServerlessDestinationConfigurationProperty(amazonOpenSearchServerlessDestinationConfiguration))

    override
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: IResolvable) {
      cdkBuilder.amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: AmazonopensearchserviceDestinationConfigurationProperty) {
      cdkBuilder.amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration.let(AmazonopensearchserviceDestinationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0e750dd8298dba0e5c02f301c88e6a2f91f32b1eb4c4d5bf8cd380c5a643229")
    override
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: AmazonopensearchserviceDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        amazonopensearchserviceDestinationConfiguration(AmazonopensearchserviceDestinationConfigurationProperty(amazonopensearchserviceDestinationConfiguration))

    override
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: IResolvable) {
      cdkBuilder.deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput.let(IResolvable::unwrap))
    }

    override
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: DeliveryStreamEncryptionConfigurationInputProperty) {
      cdkBuilder.deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput.let(DeliveryStreamEncryptionConfigurationInputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ab692c19801842492183b9e872222254e095277511bf02e81be652274d244d1")
    override
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: DeliveryStreamEncryptionConfigurationInputProperty.Builder.() -> Unit):
        Unit =
        deliveryStreamEncryptionConfigurationInput(DeliveryStreamEncryptionConfigurationInputProperty(deliveryStreamEncryptionConfigurationInput))

    override fun deliveryStreamName(deliveryStreamName: String) {
      cdkBuilder.deliveryStreamName(deliveryStreamName)
    }

    override fun deliveryStreamType(deliveryStreamType: String) {
      cdkBuilder.deliveryStreamType(deliveryStreamType)
    }

    override
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: IResolvable) {
      cdkBuilder.elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: ElasticsearchDestinationConfigurationProperty) {
      cdkBuilder.elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration.let(ElasticsearchDestinationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e250eef7235cc63f426265344f51a8ff69fcc8cd948c0e67f937d5bdf1245fd")
    override
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: ElasticsearchDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        elasticsearchDestinationConfiguration(ElasticsearchDestinationConfigurationProperty(elasticsearchDestinationConfiguration))

    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: IResolvable) {
      cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: ExtendedS3DestinationConfigurationProperty) {
      cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration.let(ExtendedS3DestinationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("804c0ad62fefcbd3a84762891f680a28e32d801c8adae97f7dc25df681c39728")
    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        extendedS3DestinationConfiguration(ExtendedS3DestinationConfigurationProperty(extendedS3DestinationConfiguration))

    override
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: IResolvable) {
      cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: HttpEndpointDestinationConfigurationProperty) {
      cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration.let(HttpEndpointDestinationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02bda40d7d17a3bea2aa4bdc2c92fe46910fdb0919bfd3fc4954f2bc133f5a85")
    override
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: HttpEndpointDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        httpEndpointDestinationConfiguration(HttpEndpointDestinationConfigurationProperty(httpEndpointDestinationConfiguration))

    override fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: IResolvable) {
      cdkBuilder.kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: KinesisStreamSourceConfigurationProperty) {
      cdkBuilder.kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration.let(KinesisStreamSourceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c8ff51ace8046f164b30f7b7c7ac9b9cad0a6405a4a04f198383d16b4f369f2")
    override
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: KinesisStreamSourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        kinesisStreamSourceConfiguration(KinesisStreamSourceConfigurationProperty(kinesisStreamSourceConfiguration))

    override fun mskSourceConfiguration(mskSourceConfiguration: IResolvable) {
      cdkBuilder.mskSourceConfiguration(mskSourceConfiguration.let(IResolvable::unwrap))
    }

    override fun mskSourceConfiguration(mskSourceConfiguration: MSKSourceConfigurationProperty) {
      cdkBuilder.mskSourceConfiguration(mskSourceConfiguration.let(MSKSourceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("167b672ab608a479965f8b9832f5d781f2ea06250b1edf2687df728d87242969")
    override
        fun mskSourceConfiguration(mskSourceConfiguration: MSKSourceConfigurationProperty.Builder.() -> Unit):
        Unit = mskSourceConfiguration(MSKSourceConfigurationProperty(mskSourceConfiguration))

    override fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: IResolvable) {
      cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: RedshiftDestinationConfigurationProperty) {
      cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration.let(RedshiftDestinationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74cb5c9a75ab0d5d3125ae16330f7f4a07f9daa3f09b90f46df915fd8c345a18")
    override
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: RedshiftDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        redshiftDestinationConfiguration(RedshiftDestinationConfigurationProperty(redshiftDestinationConfiguration))

    override fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable) {
      cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty) {
      cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration.let(S3DestinationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cef601312d98974061b66bd8152f76623e6f4dd72a5526c35dd1f6c5850f24c0")
    override
        fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        s3DestinationConfiguration(S3DestinationConfigurationProperty(s3DestinationConfiguration))

    override fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: IResolvable) {
      cdkBuilder.snowflakeDestinationConfiguration(snowflakeDestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: SnowflakeDestinationConfigurationProperty) {
      cdkBuilder.snowflakeDestinationConfiguration(snowflakeDestinationConfiguration.let(SnowflakeDestinationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15cbf3df7ca5c2d9edaafbedfcc169f3791bdb7c223e6bb201410f57eb9bb10c")
    override
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: SnowflakeDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        snowflakeDestinationConfiguration(SnowflakeDestinationConfigurationProperty(snowflakeDestinationConfiguration))

    override fun splunkDestinationConfiguration(splunkDestinationConfiguration: IResolvable) {
      cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: SplunkDestinationConfigurationProperty) {
      cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration.let(SplunkDestinationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b63f26c8956fbfe5ba15ca0ae73dd495f67dee4d1673fd29dff176ebbeaef6e")
    override
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: SplunkDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        splunkDestinationConfiguration(SplunkDestinationConfigurationProperty(splunkDestinationConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeliveryStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeliveryStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream):
        CfnDeliveryStream = CfnDeliveryStream(cdkObject)

    internal fun unwrap(wrapped: CfnDeliveryStream):
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream = wrapped.cdkObject
  }

  public interface SchemaConfigurationProperty {
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun region(): String? = unwrap(this).getRegion()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun tableName(): String? = unwrap(this).getTableName()

    public fun versionId(): String? = unwrap(this).getVersionId()

    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun databaseName(databaseName: String)

      public fun region(region: String)

      public fun roleArn(roleArn: String)

      public fun tableName(tableName: String)

      public fun versionId(versionId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      override fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty,
    ) : SchemaConfigurationProperty {
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun region(): String? = unwrap(this).getRegion()

      override fun roleArn(): String? = unwrap(this).getRoleArn()

      override fun tableName(): String? = unwrap(this).getTableName()

      override fun versionId(): String? = unwrap(this).getVersionId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty):
          SchemaConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DocumentIdOptionsProperty {
    public fun defaultDocumentIdFormat(): String

    public interface Builder {
      public fun defaultDocumentIdFormat(defaultDocumentIdFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DocumentIdOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DocumentIdOptionsProperty.builder()

      override fun defaultDocumentIdFormat(defaultDocumentIdFormat: String) {
        cdkBuilder.defaultDocumentIdFormat(defaultDocumentIdFormat)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DocumentIdOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DocumentIdOptionsProperty,
    ) : DocumentIdOptionsProperty {
      override fun defaultDocumentIdFormat(): String = unwrap(this).getDefaultDocumentIdFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentIdOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DocumentIdOptionsProperty):
          DocumentIdOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentIdOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DocumentIdOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ElasticsearchBufferingHintsProperty {
    public fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

    public fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()

    public interface Builder {
      public fun intervalInSeconds(intervalInSeconds: Number)

      public fun sizeInMBs(sizeInMBs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty.builder()

      override fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
      }

      override fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty,
    ) : ElasticsearchBufferingHintsProperty {
      override fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

      override fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ElasticsearchBufferingHintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty):
          ElasticsearchBufferingHintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchBufferingHintsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ElasticsearchDestinationConfigurationProperty {
    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    public fun clusterEndpoint(): String? = unwrap(this).getClusterEndpoint()

    public fun documentIdOptions(): Any? = unwrap(this).getDocumentIdOptions()

    public fun domainArn(): String? = unwrap(this).getDomainArn()

    public fun indexName(): String

    public fun indexRotationPeriod(): String? = unwrap(this).getIndexRotationPeriod()

    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    public fun roleArn(): String

    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    public fun s3Configuration(): Any

    public fun typeName(): String? = unwrap(this).getTypeName()

    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    public interface Builder {
      public fun bufferingHints(bufferingHints: IResolvable)

      public fun bufferingHints(bufferingHints: ElasticsearchBufferingHintsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e340df446c87b68e1e4db744c5bcad411fd76543fd8ac0099e797242ea40d393")
      public
          fun bufferingHints(bufferingHints: ElasticsearchBufferingHintsProperty.Builder.() -> Unit)

      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10a33b53a184502ac926541dc7c0d35cc6f40b520bbe25c32635d17c532d66ce")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      public fun clusterEndpoint(clusterEndpoint: String)

      public fun documentIdOptions(documentIdOptions: IResolvable)

      public fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5929d4c5b569128d81d5a2f4fe012a50b5708c0fcb55a4b2b61b98b307a073c6")
      public fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty.Builder.() -> Unit)

      public fun domainArn(domainArn: String)

      public fun indexName(indexName: String)

      public fun indexRotationPeriod(indexRotationPeriod: String)

      public fun processingConfiguration(processingConfiguration: IResolvable)

      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b9d8492561b471a963248aeed15022e7b6148dc60f9a15c3b359d3ff6126525")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      public fun retryOptions(retryOptions: IResolvable)

      public fun retryOptions(retryOptions: ElasticsearchRetryOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6b3dee5ac7c674196a462de689006c06d8d94e430434c0e18048b01a8631565")
      public fun retryOptions(retryOptions: ElasticsearchRetryOptionsProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)

      public fun s3BackupMode(s3BackupMode: String)

      public fun s3Configuration(s3Configuration: IResolvable)

      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("334e920a445bd1b45df5fceb29dda0b70cf95eb11c35e5d5fa949d75105fba9c")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      public fun typeName(typeName: String)

      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d81a27050691270e4b42417272ed11988a312b2692cd26fdacc00690c2b7d3")
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.builder()

      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      override fun bufferingHints(bufferingHints: ElasticsearchBufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(ElasticsearchBufferingHintsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e340df446c87b68e1e4db744c5bcad411fd76543fd8ac0099e797242ea40d393")
      override
          fun bufferingHints(bufferingHints: ElasticsearchBufferingHintsProperty.Builder.() -> Unit):
          Unit = bufferingHints(ElasticsearchBufferingHintsProperty(bufferingHints))

      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10a33b53a184502ac926541dc7c0d35cc6f40b520bbe25c32635d17c532d66ce")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      override fun clusterEndpoint(clusterEndpoint: String) {
        cdkBuilder.clusterEndpoint(clusterEndpoint)
      }

      override fun documentIdOptions(documentIdOptions: IResolvable) {
        cdkBuilder.documentIdOptions(documentIdOptions.let(IResolvable::unwrap))
      }

      override fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty) {
        cdkBuilder.documentIdOptions(documentIdOptions.let(DocumentIdOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5929d4c5b569128d81d5a2f4fe012a50b5708c0fcb55a4b2b61b98b307a073c6")
      override
          fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty.Builder.() -> Unit):
          Unit = documentIdOptions(DocumentIdOptionsProperty(documentIdOptions))

      override fun domainArn(domainArn: String) {
        cdkBuilder.domainArn(domainArn)
      }

      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      override fun indexRotationPeriod(indexRotationPeriod: String) {
        cdkBuilder.indexRotationPeriod(indexRotationPeriod)
      }

      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b9d8492561b471a963248aeed15022e7b6148dc60f9a15c3b359d3ff6126525")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      override fun retryOptions(retryOptions: ElasticsearchRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(ElasticsearchRetryOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6b3dee5ac7c674196a462de689006c06d8d94e430434c0e18048b01a8631565")
      override fun retryOptions(retryOptions: ElasticsearchRetryOptionsProperty.Builder.() -> Unit):
          Unit = retryOptions(ElasticsearchRetryOptionsProperty(retryOptions))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("334e920a445bd1b45df5fceb29dda0b70cf95eb11c35e5d5fa949d75105fba9c")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      override fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
      }

      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d81a27050691270e4b42417272ed11988a312b2692cd26fdacc00690c2b7d3")
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty,
    ) : ElasticsearchDestinationConfigurationProperty {
      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      override fun clusterEndpoint(): String? = unwrap(this).getClusterEndpoint()

      override fun documentIdOptions(): Any? = unwrap(this).getDocumentIdOptions()

      override fun domainArn(): String? = unwrap(this).getDomainArn()

      override fun indexName(): String = unwrap(this).getIndexName()

      override fun indexRotationPeriod(): String? = unwrap(this).getIndexRotationPeriod()

      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()

      override fun typeName(): String? = unwrap(this).getTypeName()

      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ElasticsearchDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty):
          ElasticsearchDestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisStreamSourceConfigurationProperty {
    public fun kinesisStreamArn(): String

    public fun roleArn(): String

    public interface Builder {
      public fun kinesisStreamArn(kinesisStreamArn: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.builder()

      override fun kinesisStreamArn(kinesisStreamArn: String) {
        cdkBuilder.kinesisStreamArn(kinesisStreamArn)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty,
    ) : KinesisStreamSourceConfigurationProperty {
      override fun kinesisStreamArn(): String = unwrap(this).getKinesisStreamArn()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          KinesisStreamSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty):
          KinesisStreamSourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamSourceConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SnowflakeVpcConfigurationProperty {
    public fun privateLinkVpceId(): String

    public interface Builder {
      public fun privateLinkVpceId(privateLinkVpceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeVpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeVpcConfigurationProperty.builder()

      override fun privateLinkVpceId(privateLinkVpceId: String) {
        cdkBuilder.privateLinkVpceId(privateLinkVpceId)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeVpcConfigurationProperty,
    ) : SnowflakeVpcConfigurationProperty {
      override fun privateLinkVpceId(): String = unwrap(this).getPrivateLinkVpceId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SnowflakeVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeVpcConfigurationProperty):
          SnowflakeVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeVpcConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeVpcConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SplunkDestinationConfigurationProperty {
    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    public fun hecAcknowledgmentTimeoutInSeconds(): Number? =
        unwrap(this).getHecAcknowledgmentTimeoutInSeconds()

    public fun hecEndpoint(): String

    public fun hecEndpointType(): String

    public fun hecToken(): String

    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    public fun s3Configuration(): Any

    public interface Builder {
      public fun bufferingHints(bufferingHints: IResolvable)

      public fun bufferingHints(bufferingHints: SplunkBufferingHintsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e25def6f003540905f3374225e52403efb0d805d8805ec1a33e463075f9addae")
      public fun bufferingHints(bufferingHints: SplunkBufferingHintsProperty.Builder.() -> Unit)

      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e04fa488be9ab07ebb7d1ee306afe46fec4aa0eb8c592b5b13c85ebfd7546987")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      public fun hecAcknowledgmentTimeoutInSeconds(hecAcknowledgmentTimeoutInSeconds: Number)

      public fun hecEndpoint(hecEndpoint: String)

      public fun hecEndpointType(hecEndpointType: String)

      public fun hecToken(hecToken: String)

      public fun processingConfiguration(processingConfiguration: IResolvable)

      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e395e5d9c1fc9badbd09c50045b9b31c56c5260e0d4cc9c3e596589d4ab99d1a")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      public fun retryOptions(retryOptions: IResolvable)

      public fun retryOptions(retryOptions: SplunkRetryOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71f8f02652601f3e606cd73f6578999a420ce7a860cc1cb0de05e8897044a4d2")
      public fun retryOptions(retryOptions: SplunkRetryOptionsProperty.Builder.() -> Unit)

      public fun s3BackupMode(s3BackupMode: String)

      public fun s3Configuration(s3Configuration: IResolvable)

      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa50c6dcaba52e45c88391090c23eef3caf9b4e2903b6fd6aa2a89e92abee921")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.builder()

      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      override fun bufferingHints(bufferingHints: SplunkBufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(SplunkBufferingHintsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e25def6f003540905f3374225e52403efb0d805d8805ec1a33e463075f9addae")
      override fun bufferingHints(bufferingHints: SplunkBufferingHintsProperty.Builder.() -> Unit):
          Unit = bufferingHints(SplunkBufferingHintsProperty(bufferingHints))

      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e04fa488be9ab07ebb7d1ee306afe46fec4aa0eb8c592b5b13c85ebfd7546987")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      override fun hecAcknowledgmentTimeoutInSeconds(hecAcknowledgmentTimeoutInSeconds: Number) {
        cdkBuilder.hecAcknowledgmentTimeoutInSeconds(hecAcknowledgmentTimeoutInSeconds)
      }

      override fun hecEndpoint(hecEndpoint: String) {
        cdkBuilder.hecEndpoint(hecEndpoint)
      }

      override fun hecEndpointType(hecEndpointType: String) {
        cdkBuilder.hecEndpointType(hecEndpointType)
      }

      override fun hecToken(hecToken: String) {
        cdkBuilder.hecToken(hecToken)
      }

      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e395e5d9c1fc9badbd09c50045b9b31c56c5260e0d4cc9c3e596589d4ab99d1a")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      override fun retryOptions(retryOptions: SplunkRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(SplunkRetryOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71f8f02652601f3e606cd73f6578999a420ce7a860cc1cb0de05e8897044a4d2")
      override fun retryOptions(retryOptions: SplunkRetryOptionsProperty.Builder.() -> Unit): Unit =
          retryOptions(SplunkRetryOptionsProperty(retryOptions))

      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa50c6dcaba52e45c88391090c23eef3caf9b4e2903b6fd6aa2a89e92abee921")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty,
    ) : SplunkDestinationConfigurationProperty {
      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      override fun hecAcknowledgmentTimeoutInSeconds(): Number? =
          unwrap(this).getHecAcknowledgmentTimeoutInSeconds()

      override fun hecEndpoint(): String = unwrap(this).getHecEndpoint()

      override fun hecEndpointType(): String = unwrap(this).getHecEndpointType()

      override fun hecToken(): String = unwrap(this).getHecToken()

      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SplunkDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty):
          SplunkDestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SplunkDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RetryOptionsProperty {
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    public interface Builder {
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty.builder()

      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty,
    ) : RetryOptionsProperty {
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty):
          RetryOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HttpEndpointConfigurationProperty {
    public fun accessKey(): String? = unwrap(this).getAccessKey()

    public fun name(): String? = unwrap(this).getName()

    public fun url(): String

    public interface Builder {
      public fun accessKey(accessKey: String)

      public fun name(name: String)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty.builder()

      override fun accessKey(accessKey: String) {
        cdkBuilder.accessKey(accessKey)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty,
    ) : HttpEndpointConfigurationProperty {
      override fun accessKey(): String? = unwrap(this).getAccessKey()

      override fun name(): String? = unwrap(this).getName()

      override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpEndpointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty):
          HttpEndpointConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpEndpointConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SplunkBufferingHintsProperty {
    public fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

    public fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()

    public interface Builder {
      public fun intervalInSeconds(intervalInSeconds: Number)

      public fun sizeInMBs(sizeInMBs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkBufferingHintsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkBufferingHintsProperty.builder()

      override fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
      }

      override fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkBufferingHintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkBufferingHintsProperty,
    ) : SplunkBufferingHintsProperty {
      override fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

      override fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SplunkBufferingHintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkBufferingHintsProperty):
          SplunkBufferingHintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SplunkBufferingHintsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkBufferingHintsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OrcSerDeProperty {
    public fun blockSizeBytes(): Number? = unwrap(this).getBlockSizeBytes()

    public fun bloomFilterColumns(): List<String> = unwrap(this).getBloomFilterColumns() ?:
        emptyList()

    public fun bloomFilterFalsePositiveProbability(): Number? =
        unwrap(this).getBloomFilterFalsePositiveProbability()

    public fun compression(): String? = unwrap(this).getCompression()

    public fun dictionaryKeyThreshold(): Number? = unwrap(this).getDictionaryKeyThreshold()

    public fun enablePadding(): Any? = unwrap(this).getEnablePadding()

    public fun formatVersion(): String? = unwrap(this).getFormatVersion()

    public fun paddingTolerance(): Number? = unwrap(this).getPaddingTolerance()

    public fun rowIndexStride(): Number? = unwrap(this).getRowIndexStride()

    public fun stripeSizeBytes(): Number? = unwrap(this).getStripeSizeBytes()

    public interface Builder {
      public fun blockSizeBytes(blockSizeBytes: Number)

      public fun bloomFilterColumns(bloomFilterColumns: List<String>)

      public fun bloomFilterColumns(vararg bloomFilterColumns: String)

      public fun bloomFilterFalsePositiveProbability(bloomFilterFalsePositiveProbability: Number)

      public fun compression(compression: String)

      public fun dictionaryKeyThreshold(dictionaryKeyThreshold: Number)

      public fun enablePadding(enablePadding: Boolean)

      public fun enablePadding(enablePadding: IResolvable)

      public fun formatVersion(formatVersion: String)

      public fun paddingTolerance(paddingTolerance: Number)

      public fun rowIndexStride(rowIndexStride: Number)

      public fun stripeSizeBytes(stripeSizeBytes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty.builder()

      override fun blockSizeBytes(blockSizeBytes: Number) {
        cdkBuilder.blockSizeBytes(blockSizeBytes)
      }

      override fun bloomFilterColumns(bloomFilterColumns: List<String>) {
        cdkBuilder.bloomFilterColumns(bloomFilterColumns)
      }

      override fun bloomFilterColumns(vararg bloomFilterColumns: String): Unit =
          bloomFilterColumns(bloomFilterColumns.toList())

      override
          fun bloomFilterFalsePositiveProbability(bloomFilterFalsePositiveProbability: Number) {
        cdkBuilder.bloomFilterFalsePositiveProbability(bloomFilterFalsePositiveProbability)
      }

      override fun compression(compression: String) {
        cdkBuilder.compression(compression)
      }

      override fun dictionaryKeyThreshold(dictionaryKeyThreshold: Number) {
        cdkBuilder.dictionaryKeyThreshold(dictionaryKeyThreshold)
      }

      override fun enablePadding(enablePadding: Boolean) {
        cdkBuilder.enablePadding(enablePadding)
      }

      override fun enablePadding(enablePadding: IResolvable) {
        cdkBuilder.enablePadding(enablePadding.let(IResolvable::unwrap))
      }

      override fun formatVersion(formatVersion: String) {
        cdkBuilder.formatVersion(formatVersion)
      }

      override fun paddingTolerance(paddingTolerance: Number) {
        cdkBuilder.paddingTolerance(paddingTolerance)
      }

      override fun rowIndexStride(rowIndexStride: Number) {
        cdkBuilder.rowIndexStride(rowIndexStride)
      }

      override fun stripeSizeBytes(stripeSizeBytes: Number) {
        cdkBuilder.stripeSizeBytes(stripeSizeBytes)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty,
    ) : OrcSerDeProperty {
      override fun blockSizeBytes(): Number? = unwrap(this).getBlockSizeBytes()

      override fun bloomFilterColumns(): List<String> = unwrap(this).getBloomFilterColumns() ?:
          emptyList()

      override fun bloomFilterFalsePositiveProbability(): Number? =
          unwrap(this).getBloomFilterFalsePositiveProbability()

      override fun compression(): String? = unwrap(this).getCompression()

      override fun dictionaryKeyThreshold(): Number? = unwrap(this).getDictionaryKeyThreshold()

      override fun enablePadding(): Any? = unwrap(this).getEnablePadding()

      override fun formatVersion(): String? = unwrap(this).getFormatVersion()

      override fun paddingTolerance(): Number? = unwrap(this).getPaddingTolerance()

      override fun rowIndexStride(): Number? = unwrap(this).getRowIndexStride()

      override fun stripeSizeBytes(): Number? = unwrap(this).getStripeSizeBytes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OrcSerDeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty):
          OrcSerDeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrcSerDeProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OrcSerDeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OpenXJsonSerDeProperty {
    public fun caseInsensitive(): Any? = unwrap(this).getCaseInsensitive()

    public fun columnToJsonKeyMappings(): Any? = unwrap(this).getColumnToJsonKeyMappings()

    public fun convertDotsInJsonKeysToUnderscores(): Any? =
        unwrap(this).getConvertDotsInJsonKeysToUnderscores()

    public interface Builder {
      public fun caseInsensitive(caseInsensitive: Boolean)

      public fun caseInsensitive(caseInsensitive: IResolvable)

      public fun columnToJsonKeyMappings(columnToJsonKeyMappings: IResolvable)

      public fun columnToJsonKeyMappings(columnToJsonKeyMappings: Map<String, String>)

      public fun convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores: Boolean)

      public fun convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty.builder()

      override fun caseInsensitive(caseInsensitive: Boolean) {
        cdkBuilder.caseInsensitive(caseInsensitive)
      }

      override fun caseInsensitive(caseInsensitive: IResolvable) {
        cdkBuilder.caseInsensitive(caseInsensitive.let(IResolvable::unwrap))
      }

      override fun columnToJsonKeyMappings(columnToJsonKeyMappings: IResolvable) {
        cdkBuilder.columnToJsonKeyMappings(columnToJsonKeyMappings.let(IResolvable::unwrap))
      }

      override fun columnToJsonKeyMappings(columnToJsonKeyMappings: Map<String, String>) {
        cdkBuilder.columnToJsonKeyMappings(columnToJsonKeyMappings)
      }

      override fun convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores: Boolean) {
        cdkBuilder.convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores)
      }

      override
          fun convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores: IResolvable) {
        cdkBuilder.convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty,
    ) : OpenXJsonSerDeProperty {
      override fun caseInsensitive(): Any? = unwrap(this).getCaseInsensitive()

      override fun columnToJsonKeyMappings(): Any? = unwrap(this).getColumnToJsonKeyMappings()

      override fun convertDotsInJsonKeysToUnderscores(): Any? =
          unwrap(this).getConvertDotsInJsonKeysToUnderscores()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OpenXJsonSerDeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty):
          OpenXJsonSerDeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenXJsonSerDeProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OpenXJsonSerDeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VpcConfigurationProperty {
    public fun roleArn(): String

    public fun securityGroupIds(): List<String>

    public fun subnetIds(): List<String>

    public interface Builder {
      public fun roleArn(roleArn: String)

      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty.builder()

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty,
    ) : VpcConfigurationProperty {
      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty):
          VpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ElasticsearchRetryOptionsProperty {
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    public interface Builder {
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty.builder()

      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty,
    ) : ElasticsearchRetryOptionsProperty {
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ElasticsearchRetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty):
          ElasticsearchRetryOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchRetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProcessorProperty {
    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun type(): String

    public interface Builder {
      public fun parameters(parameters: IResolvable)

      public fun parameters(parameters: List<Any>)

      public fun parameters(vararg parameters: Any)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty.builder()

      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters)
      }

      override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty,
    ) : ProcessorProperty {
      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProcessorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty):
          ProcessorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProcessorProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SnowflakeRoleConfigurationProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun snowflakeRole(): String? = unwrap(this).getSnowflakeRole()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun snowflakeRole(snowflakeRole: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRoleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRoleConfigurationProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun snowflakeRole(snowflakeRole: String) {
        cdkBuilder.snowflakeRole(snowflakeRole)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRoleConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRoleConfigurationProperty,
    ) : SnowflakeRoleConfigurationProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun snowflakeRole(): String? = unwrap(this).getSnowflakeRole()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SnowflakeRoleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRoleConfigurationProperty):
          SnowflakeRoleConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeRoleConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRoleConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AmazonopensearchserviceDestinationConfigurationProperty {
    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    public fun clusterEndpoint(): String? = unwrap(this).getClusterEndpoint()

    public fun documentIdOptions(): Any? = unwrap(this).getDocumentIdOptions()

    public fun domainArn(): String? = unwrap(this).getDomainArn()

    public fun indexName(): String

    public fun indexRotationPeriod(): String? = unwrap(this).getIndexRotationPeriod()

    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    public fun roleArn(): String

    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    public fun s3Configuration(): Any

    public fun typeName(): String? = unwrap(this).getTypeName()

    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    public interface Builder {
      public fun bufferingHints(bufferingHints: IResolvable)

      public fun bufferingHints(bufferingHints: AmazonopensearchserviceBufferingHintsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b89c7cac5caea6077a6d3afe95c17a6914cfc69f98c077a91f9274521054ff81")
      public
          fun bufferingHints(bufferingHints: AmazonopensearchserviceBufferingHintsProperty.Builder.() -> Unit)

      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0480543c5b31704c8985256dcb75739e4a49b3aecf8cc480932506aa9c7560cc")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      public fun clusterEndpoint(clusterEndpoint: String)

      public fun documentIdOptions(documentIdOptions: IResolvable)

      public fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02068fbba14d0c23ec9989b0831c0bec7802371f7e334303e5d723e9d2cc206c")
      public fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty.Builder.() -> Unit)

      public fun domainArn(domainArn: String)

      public fun indexName(indexName: String)

      public fun indexRotationPeriod(indexRotationPeriod: String)

      public fun processingConfiguration(processingConfiguration: IResolvable)

      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9f815b97b0ea3b87059c8de3ca7b4f2c53ed8b1fc5d2dd5e42221899c8566ab")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      public fun retryOptions(retryOptions: IResolvable)

      public fun retryOptions(retryOptions: AmazonopensearchserviceRetryOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54cc6f9702ca24e1db84ff65e28dcf95334f41b5478662da12a8d4b96bed1803")
      public
          fun retryOptions(retryOptions: AmazonopensearchserviceRetryOptionsProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)

      public fun s3BackupMode(s3BackupMode: String)

      public fun s3Configuration(s3Configuration: IResolvable)

      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6319aa65986b2481919ad9a91034af8e3e076f0e69b4646cd3b6271ed91d9748")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      public fun typeName(typeName: String)

      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("179632889a6656e9eb630e8e460068ded8cf2952111ad805fa353be523234b25")
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty.builder()

      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      override fun bufferingHints(bufferingHints: AmazonopensearchserviceBufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(AmazonopensearchserviceBufferingHintsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b89c7cac5caea6077a6d3afe95c17a6914cfc69f98c077a91f9274521054ff81")
      override
          fun bufferingHints(bufferingHints: AmazonopensearchserviceBufferingHintsProperty.Builder.() -> Unit):
          Unit = bufferingHints(AmazonopensearchserviceBufferingHintsProperty(bufferingHints))

      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0480543c5b31704c8985256dcb75739e4a49b3aecf8cc480932506aa9c7560cc")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      override fun clusterEndpoint(clusterEndpoint: String) {
        cdkBuilder.clusterEndpoint(clusterEndpoint)
      }

      override fun documentIdOptions(documentIdOptions: IResolvable) {
        cdkBuilder.documentIdOptions(documentIdOptions.let(IResolvable::unwrap))
      }

      override fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty) {
        cdkBuilder.documentIdOptions(documentIdOptions.let(DocumentIdOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02068fbba14d0c23ec9989b0831c0bec7802371f7e334303e5d723e9d2cc206c")
      override
          fun documentIdOptions(documentIdOptions: DocumentIdOptionsProperty.Builder.() -> Unit):
          Unit = documentIdOptions(DocumentIdOptionsProperty(documentIdOptions))

      override fun domainArn(domainArn: String) {
        cdkBuilder.domainArn(domainArn)
      }

      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      override fun indexRotationPeriod(indexRotationPeriod: String) {
        cdkBuilder.indexRotationPeriod(indexRotationPeriod)
      }

      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9f815b97b0ea3b87059c8de3ca7b4f2c53ed8b1fc5d2dd5e42221899c8566ab")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      override fun retryOptions(retryOptions: AmazonopensearchserviceRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(AmazonopensearchserviceRetryOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54cc6f9702ca24e1db84ff65e28dcf95334f41b5478662da12a8d4b96bed1803")
      override
          fun retryOptions(retryOptions: AmazonopensearchserviceRetryOptionsProperty.Builder.() -> Unit):
          Unit = retryOptions(AmazonopensearchserviceRetryOptionsProperty(retryOptions))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6319aa65986b2481919ad9a91034af8e3e076f0e69b4646cd3b6271ed91d9748")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      override fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
      }

      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("179632889a6656e9eb630e8e460068ded8cf2952111ad805fa353be523234b25")
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty,
    ) : AmazonopensearchserviceDestinationConfigurationProperty {
      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      override fun clusterEndpoint(): String? = unwrap(this).getClusterEndpoint()

      override fun documentIdOptions(): Any? = unwrap(this).getDocumentIdOptions()

      override fun domainArn(): String? = unwrap(this).getDomainArn()

      override fun indexName(): String = unwrap(this).getIndexName()

      override fun indexRotationPeriod(): String? = unwrap(this).getIndexRotationPeriod()

      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()

      override fun typeName(): String? = unwrap(this).getTypeName()

      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonopensearchserviceDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty):
          AmazonopensearchserviceDestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonopensearchserviceDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RedshiftRetryOptionsProperty {
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    public interface Builder {
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty.builder()

      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty,
    ) : RedshiftRetryOptionsProperty {
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftRetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty):
          RedshiftRetryOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftRetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ParquetSerDeProperty {
    public fun blockSizeBytes(): Number? = unwrap(this).getBlockSizeBytes()

    public fun compression(): String? = unwrap(this).getCompression()

    public fun enableDictionaryCompression(): Any? = unwrap(this).getEnableDictionaryCompression()

    public fun maxPaddingBytes(): Number? = unwrap(this).getMaxPaddingBytes()

    public fun pageSizeBytes(): Number? = unwrap(this).getPageSizeBytes()

    public fun writerVersion(): String? = unwrap(this).getWriterVersion()

    public interface Builder {
      public fun blockSizeBytes(blockSizeBytes: Number)

      public fun compression(compression: String)

      public fun enableDictionaryCompression(enableDictionaryCompression: Boolean)

      public fun enableDictionaryCompression(enableDictionaryCompression: IResolvable)

      public fun maxPaddingBytes(maxPaddingBytes: Number)

      public fun pageSizeBytes(pageSizeBytes: Number)

      public fun writerVersion(writerVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty.builder()

      override fun blockSizeBytes(blockSizeBytes: Number) {
        cdkBuilder.blockSizeBytes(blockSizeBytes)
      }

      override fun compression(compression: String) {
        cdkBuilder.compression(compression)
      }

      override fun enableDictionaryCompression(enableDictionaryCompression: Boolean) {
        cdkBuilder.enableDictionaryCompression(enableDictionaryCompression)
      }

      override fun enableDictionaryCompression(enableDictionaryCompression: IResolvable) {
        cdkBuilder.enableDictionaryCompression(enableDictionaryCompression.let(IResolvable::unwrap))
      }

      override fun maxPaddingBytes(maxPaddingBytes: Number) {
        cdkBuilder.maxPaddingBytes(maxPaddingBytes)
      }

      override fun pageSizeBytes(pageSizeBytes: Number) {
        cdkBuilder.pageSizeBytes(pageSizeBytes)
      }

      override fun writerVersion(writerVersion: String) {
        cdkBuilder.writerVersion(writerVersion)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty,
    ) : ParquetSerDeProperty {
      override fun blockSizeBytes(): Number? = unwrap(this).getBlockSizeBytes()

      override fun compression(): String? = unwrap(this).getCompression()

      override fun enableDictionaryCompression(): Any? =
          unwrap(this).getEnableDictionaryCompression()

      override fun maxPaddingBytes(): Number? = unwrap(this).getMaxPaddingBytes()

      override fun pageSizeBytes(): Number? = unwrap(this).getPageSizeBytes()

      override fun writerVersion(): String? = unwrap(this).getWriterVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParquetSerDeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty):
          ParquetSerDeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParquetSerDeProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ParquetSerDeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AuthenticationConfigurationProperty {
    public fun connectivity(): String

    public fun roleArn(): String

    public interface Builder {
      public fun connectivity(connectivity: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AuthenticationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AuthenticationConfigurationProperty.builder()

      override fun connectivity(connectivity: String) {
        cdkBuilder.connectivity(connectivity)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AuthenticationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AuthenticationConfigurationProperty,
    ) : AuthenticationConfigurationProperty {
      override fun connectivity(): String = unwrap(this).getConnectivity()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuthenticationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AuthenticationConfigurationProperty):
          AuthenticationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AuthenticationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MSKSourceConfigurationProperty {
    public fun authenticationConfiguration(): Any

    public fun mskClusterArn(): String

    public fun topicName(): String

    public interface Builder {
      public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

      public
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a009abd1f8243e28dde7de4258e4bac1917c47952371575f57756fad31e8f105")
      public
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty.Builder.() -> Unit)

      public fun mskClusterArn(mskClusterArn: String)

      public fun topicName(topicName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.MSKSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.MSKSourceConfigurationProperty.builder()

      override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable::unwrap))
      }

      override
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(AuthenticationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a009abd1f8243e28dde7de4258e4bac1917c47952371575f57756fad31e8f105")
      override
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty.Builder.() -> Unit):
          Unit =
          authenticationConfiguration(AuthenticationConfigurationProperty(authenticationConfiguration))

      override fun mskClusterArn(mskClusterArn: String) {
        cdkBuilder.mskClusterArn(mskClusterArn)
      }

      override fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.MSKSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.MSKSourceConfigurationProperty,
    ) : MSKSourceConfigurationProperty {
      override fun authenticationConfiguration(): Any =
          unwrap(this).getAuthenticationConfiguration()

      override fun mskClusterArn(): String = unwrap(this).getMskClusterArn()

      override fun topicName(): String = unwrap(this).getTopicName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MSKSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.MSKSourceConfigurationProperty):
          MSKSourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MSKSourceConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.MSKSourceConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SnowflakeDestinationConfigurationProperty {
    public fun accountUrl(): String

    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    public fun contentColumnName(): String? = unwrap(this).getContentColumnName()

    public fun dataLoadingOption(): String? = unwrap(this).getDataLoadingOption()

    public fun database(): String

    public fun keyPassphrase(): String? = unwrap(this).getKeyPassphrase()

    public fun metaDataColumnName(): String? = unwrap(this).getMetaDataColumnName()

    public fun privateKey(): String

    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    public fun roleArn(): String

    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    public fun s3Configuration(): Any

    public fun schema(): String

    public fun snowflakeRoleConfiguration(): Any? = unwrap(this).getSnowflakeRoleConfiguration()

    public fun snowflakeVpcConfiguration(): Any? = unwrap(this).getSnowflakeVpcConfiguration()

    public fun table(): String

    public fun user(): String

    public interface Builder {
      public fun accountUrl(accountUrl: String)

      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("170277a56d71d5888a1fa0c19bc90f2fb7fcf005ec215173246f019a5b967f23")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      public fun contentColumnName(contentColumnName: String)

      public fun dataLoadingOption(dataLoadingOption: String)

      public fun database(database: String)

      public fun keyPassphrase(keyPassphrase: String)

      public fun metaDataColumnName(metaDataColumnName: String)

      public fun privateKey(privateKey: String)

      public fun processingConfiguration(processingConfiguration: IResolvable)

      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4b7c9eba4d19077ec65fc84e44e03de2e061dd971541a78967a3eb994b65cfc")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      public fun retryOptions(retryOptions: IResolvable)

      public fun retryOptions(retryOptions: SnowflakeRetryOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95f2330e3e5338c6ffe7bd1a73525ae96d392e0dfb3479e1adc537d86f3da813")
      public fun retryOptions(retryOptions: SnowflakeRetryOptionsProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)

      public fun s3BackupMode(s3BackupMode: String)

      public fun s3Configuration(s3Configuration: IResolvable)

      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80cdc5e0777f30389d371b9c606800ce9acc5ddce5043eb2fa0979d38bea4c38")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      public fun schema(schema: String)

      public fun snowflakeRoleConfiguration(snowflakeRoleConfiguration: IResolvable)

      public
          fun snowflakeRoleConfiguration(snowflakeRoleConfiguration: SnowflakeRoleConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("200e025cb87cbf9d6960af9286d74d3371aca4a7b342a4ed533869277c728ef8")
      public
          fun snowflakeRoleConfiguration(snowflakeRoleConfiguration: SnowflakeRoleConfigurationProperty.Builder.() -> Unit)

      public fun snowflakeVpcConfiguration(snowflakeVpcConfiguration: IResolvable)

      public
          fun snowflakeVpcConfiguration(snowflakeVpcConfiguration: SnowflakeVpcConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f1bf2038b878cbf77e526aac4338f21f8c4dd056bf19a9c87bef4f478c1dc7b")
      public
          fun snowflakeVpcConfiguration(snowflakeVpcConfiguration: SnowflakeVpcConfigurationProperty.Builder.() -> Unit)

      public fun table(table: String)

      public fun user(user: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeDestinationConfigurationProperty.builder()

      override fun accountUrl(accountUrl: String) {
        cdkBuilder.accountUrl(accountUrl)
      }

      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("170277a56d71d5888a1fa0c19bc90f2fb7fcf005ec215173246f019a5b967f23")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      override fun contentColumnName(contentColumnName: String) {
        cdkBuilder.contentColumnName(contentColumnName)
      }

      override fun dataLoadingOption(dataLoadingOption: String) {
        cdkBuilder.dataLoadingOption(dataLoadingOption)
      }

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun keyPassphrase(keyPassphrase: String) {
        cdkBuilder.keyPassphrase(keyPassphrase)
      }

      override fun metaDataColumnName(metaDataColumnName: String) {
        cdkBuilder.metaDataColumnName(metaDataColumnName)
      }

      override fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
      }

      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f4b7c9eba4d19077ec65fc84e44e03de2e061dd971541a78967a3eb994b65cfc")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      override fun retryOptions(retryOptions: SnowflakeRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(SnowflakeRetryOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95f2330e3e5338c6ffe7bd1a73525ae96d392e0dfb3479e1adc537d86f3da813")
      override fun retryOptions(retryOptions: SnowflakeRetryOptionsProperty.Builder.() -> Unit):
          Unit = retryOptions(SnowflakeRetryOptionsProperty(retryOptions))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80cdc5e0777f30389d371b9c606800ce9acc5ddce5043eb2fa0979d38bea4c38")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      override fun schema(schema: String) {
        cdkBuilder.schema(schema)
      }

      override fun snowflakeRoleConfiguration(snowflakeRoleConfiguration: IResolvable) {
        cdkBuilder.snowflakeRoleConfiguration(snowflakeRoleConfiguration.let(IResolvable::unwrap))
      }

      override
          fun snowflakeRoleConfiguration(snowflakeRoleConfiguration: SnowflakeRoleConfigurationProperty) {
        cdkBuilder.snowflakeRoleConfiguration(snowflakeRoleConfiguration.let(SnowflakeRoleConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("200e025cb87cbf9d6960af9286d74d3371aca4a7b342a4ed533869277c728ef8")
      override
          fun snowflakeRoleConfiguration(snowflakeRoleConfiguration: SnowflakeRoleConfigurationProperty.Builder.() -> Unit):
          Unit =
          snowflakeRoleConfiguration(SnowflakeRoleConfigurationProperty(snowflakeRoleConfiguration))

      override fun snowflakeVpcConfiguration(snowflakeVpcConfiguration: IResolvable) {
        cdkBuilder.snowflakeVpcConfiguration(snowflakeVpcConfiguration.let(IResolvable::unwrap))
      }

      override
          fun snowflakeVpcConfiguration(snowflakeVpcConfiguration: SnowflakeVpcConfigurationProperty) {
        cdkBuilder.snowflakeVpcConfiguration(snowflakeVpcConfiguration.let(SnowflakeVpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f1bf2038b878cbf77e526aac4338f21f8c4dd056bf19a9c87bef4f478c1dc7b")
      override
          fun snowflakeVpcConfiguration(snowflakeVpcConfiguration: SnowflakeVpcConfigurationProperty.Builder.() -> Unit):
          Unit =
          snowflakeVpcConfiguration(SnowflakeVpcConfigurationProperty(snowflakeVpcConfiguration))

      override fun table(table: String) {
        cdkBuilder.table(table)
      }

      override fun user(user: String) {
        cdkBuilder.user(user)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeDestinationConfigurationProperty,
    ) : SnowflakeDestinationConfigurationProperty {
      override fun accountUrl(): String = unwrap(this).getAccountUrl()

      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      override fun contentColumnName(): String? = unwrap(this).getContentColumnName()

      override fun dataLoadingOption(): String? = unwrap(this).getDataLoadingOption()

      override fun database(): String = unwrap(this).getDatabase()

      override fun keyPassphrase(): String? = unwrap(this).getKeyPassphrase()

      override fun metaDataColumnName(): String? = unwrap(this).getMetaDataColumnName()

      override fun privateKey(): String = unwrap(this).getPrivateKey()

      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()

      override fun schema(): String = unwrap(this).getSchema()

      override fun snowflakeRoleConfiguration(): Any? = unwrap(this).getSnowflakeRoleConfiguration()

      override fun snowflakeVpcConfiguration(): Any? = unwrap(this).getSnowflakeVpcConfiguration()

      override fun table(): String = unwrap(this).getTable()

      override fun user(): String = unwrap(this).getUser()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SnowflakeDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeDestinationConfigurationProperty):
          SnowflakeDestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeDestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AmazonopensearchserviceBufferingHintsProperty {
    public fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

    public fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()

    public interface Builder {
      public fun intervalInSeconds(intervalInSeconds: Number)

      public fun sizeInMBs(sizeInMBs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty.builder()

      override fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
      }

      override fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty,
    ) : AmazonopensearchserviceBufferingHintsProperty {
      override fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

      override fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonopensearchserviceBufferingHintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty):
          AmazonopensearchserviceBufferingHintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonopensearchserviceBufferingHintsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HttpEndpointRequestConfigurationProperty {
    public fun commonAttributes(): Any? = unwrap(this).getCommonAttributes()

    public fun contentEncoding(): String? = unwrap(this).getContentEncoding()

    public interface Builder {
      public fun commonAttributes(commonAttributes: IResolvable)

      public fun commonAttributes(commonAttributes: List<Any>)

      public fun commonAttributes(vararg commonAttributes: Any)

      public fun contentEncoding(contentEncoding: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty.builder()

      override fun commonAttributes(commonAttributes: IResolvable) {
        cdkBuilder.commonAttributes(commonAttributes.let(IResolvable::unwrap))
      }

      override fun commonAttributes(commonAttributes: List<Any>) {
        cdkBuilder.commonAttributes(commonAttributes)
      }

      override fun commonAttributes(vararg commonAttributes: Any): Unit =
          commonAttributes(commonAttributes.toList())

      override fun contentEncoding(contentEncoding: String) {
        cdkBuilder.contentEncoding(contentEncoding)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty,
    ) : HttpEndpointRequestConfigurationProperty {
      override fun commonAttributes(): Any? = unwrap(this).getCommonAttributes()

      override fun contentEncoding(): String? = unwrap(this).getContentEncoding()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpEndpointRequestConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty):
          HttpEndpointRequestConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpEndpointRequestConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3DestinationConfigurationProperty {
    public fun bucketArn(): String

    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    public fun compressionFormat(): String? = unwrap(this).getCompressionFormat()

    public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    public fun errorOutputPrefix(): String? = unwrap(this).getErrorOutputPrefix()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun roleArn(): String

    public interface Builder {
      public fun bucketArn(bucketArn: String)

      public fun bufferingHints(bufferingHints: IResolvable)

      public fun bufferingHints(bufferingHints: BufferingHintsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ca41090aa09a13ec5426865590ddd3f8b1e82a068acd483ca57d70c28240945")
      public fun bufferingHints(bufferingHints: BufferingHintsProperty.Builder.() -> Unit)

      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0d0cd231850b2f6d2f8a9fe62d93558b0f6160910001b5d45539a4dd0579ed6")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      public fun compressionFormat(compressionFormat: String)

      public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

      public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("640a3a95b3147b90f2305f6a8b387a89a87a516f000595d840a59627a444f789")
      public
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

      public fun errorOutputPrefix(errorOutputPrefix: String)

      public fun prefix(prefix: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.builder()

      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      override fun bufferingHints(bufferingHints: BufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(BufferingHintsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ca41090aa09a13ec5426865590ddd3f8b1e82a068acd483ca57d70c28240945")
      override fun bufferingHints(bufferingHints: BufferingHintsProperty.Builder.() -> Unit): Unit =
          bufferingHints(BufferingHintsProperty(bufferingHints))

      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0d0cd231850b2f6d2f8a9fe62d93558b0f6160910001b5d45539a4dd0579ed6")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      override fun compressionFormat(compressionFormat: String) {
        cdkBuilder.compressionFormat(compressionFormat)
      }

      override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
      }

      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("640a3a95b3147b90f2305f6a8b387a89a87a516f000595d840a59627a444f789")
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
          Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

      override fun errorOutputPrefix(errorOutputPrefix: String) {
        cdkBuilder.errorOutputPrefix(errorOutputPrefix)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty,
    ) : S3DestinationConfigurationProperty {
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      override fun compressionFormat(): String? = unwrap(this).getCompressionFormat()

      override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

      override fun errorOutputPrefix(): String? = unwrap(this).getErrorOutputPrefix()

      override fun prefix(): String? = unwrap(this).getPrefix()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty):
          S3DestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AmazonOpenSearchServerlessBufferingHintsProperty {
    public fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

    public fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()

    public interface Builder {
      public fun intervalInSeconds(intervalInSeconds: Number)

      public fun sizeInMBs(sizeInMBs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty.builder()

      override fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
      }

      override fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty,
    ) : AmazonOpenSearchServerlessBufferingHintsProperty {
      override fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

      override fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonOpenSearchServerlessBufferingHintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty):
          AmazonOpenSearchServerlessBufferingHintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonOpenSearchServerlessBufferingHintsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AmazonopensearchserviceRetryOptionsProperty {
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    public interface Builder {
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty.builder()

      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty,
    ) : AmazonopensearchserviceRetryOptionsProperty {
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonopensearchserviceRetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty):
          AmazonopensearchserviceRetryOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonopensearchserviceRetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeserializerProperty {
    public fun hiveJsonSerDe(): Any? = unwrap(this).getHiveJsonSerDe()

    public fun openXJsonSerDe(): Any? = unwrap(this).getOpenXJsonSerDe()

    public interface Builder {
      public fun hiveJsonSerDe(hiveJsonSerDe: IResolvable)

      public fun hiveJsonSerDe(hiveJsonSerDe: HiveJsonSerDeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ea33b2c029a95c087850deaf83c4f3e4a5fdbdff139ee9977885b798807ce2d")
      public fun hiveJsonSerDe(hiveJsonSerDe: HiveJsonSerDeProperty.Builder.() -> Unit)

      public fun openXJsonSerDe(openXJsonSerDe: IResolvable)

      public fun openXJsonSerDe(openXJsonSerDe: OpenXJsonSerDeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7e0b536a1bcf046899c4f672537af31dd8b8a1add133e9cf60bc6036aa85bde")
      public fun openXJsonSerDe(openXJsonSerDe: OpenXJsonSerDeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty.builder()

      override fun hiveJsonSerDe(hiveJsonSerDe: IResolvable) {
        cdkBuilder.hiveJsonSerDe(hiveJsonSerDe.let(IResolvable::unwrap))
      }

      override fun hiveJsonSerDe(hiveJsonSerDe: HiveJsonSerDeProperty) {
        cdkBuilder.hiveJsonSerDe(hiveJsonSerDe.let(HiveJsonSerDeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ea33b2c029a95c087850deaf83c4f3e4a5fdbdff139ee9977885b798807ce2d")
      override fun hiveJsonSerDe(hiveJsonSerDe: HiveJsonSerDeProperty.Builder.() -> Unit): Unit =
          hiveJsonSerDe(HiveJsonSerDeProperty(hiveJsonSerDe))

      override fun openXJsonSerDe(openXJsonSerDe: IResolvable) {
        cdkBuilder.openXJsonSerDe(openXJsonSerDe.let(IResolvable::unwrap))
      }

      override fun openXJsonSerDe(openXJsonSerDe: OpenXJsonSerDeProperty) {
        cdkBuilder.openXJsonSerDe(openXJsonSerDe.let(OpenXJsonSerDeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7e0b536a1bcf046899c4f672537af31dd8b8a1add133e9cf60bc6036aa85bde")
      override fun openXJsonSerDe(openXJsonSerDe: OpenXJsonSerDeProperty.Builder.() -> Unit): Unit =
          openXJsonSerDe(OpenXJsonSerDeProperty(openXJsonSerDe))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty,
    ) : DeserializerProperty {
      override fun hiveJsonSerDe(): Any? = unwrap(this).getHiveJsonSerDe()

      override fun openXJsonSerDe(): Any? = unwrap(this).getOpenXJsonSerDe()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeserializerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty):
          DeserializerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeserializerProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeserializerProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SerializerProperty {
    public fun orcSerDe(): Any? = unwrap(this).getOrcSerDe()

    public fun parquetSerDe(): Any? = unwrap(this).getParquetSerDe()

    public interface Builder {
      public fun orcSerDe(orcSerDe: IResolvable)

      public fun orcSerDe(orcSerDe: OrcSerDeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d783f896de9fcee687d32c744d0e49bce185d90b1b7e3b7cfd4f23ccb4e53da2")
      public fun orcSerDe(orcSerDe: OrcSerDeProperty.Builder.() -> Unit)

      public fun parquetSerDe(parquetSerDe: IResolvable)

      public fun parquetSerDe(parquetSerDe: ParquetSerDeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("953e85fd9f4dd15c7294aa43c03da0cfc0e1f6e7e39d451bb5c5cb6bb68a84b0")
      public fun parquetSerDe(parquetSerDe: ParquetSerDeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty.builder()

      override fun orcSerDe(orcSerDe: IResolvable) {
        cdkBuilder.orcSerDe(orcSerDe.let(IResolvable::unwrap))
      }

      override fun orcSerDe(orcSerDe: OrcSerDeProperty) {
        cdkBuilder.orcSerDe(orcSerDe.let(OrcSerDeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d783f896de9fcee687d32c744d0e49bce185d90b1b7e3b7cfd4f23ccb4e53da2")
      override fun orcSerDe(orcSerDe: OrcSerDeProperty.Builder.() -> Unit): Unit =
          orcSerDe(OrcSerDeProperty(orcSerDe))

      override fun parquetSerDe(parquetSerDe: IResolvable) {
        cdkBuilder.parquetSerDe(parquetSerDe.let(IResolvable::unwrap))
      }

      override fun parquetSerDe(parquetSerDe: ParquetSerDeProperty) {
        cdkBuilder.parquetSerDe(parquetSerDe.let(ParquetSerDeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("953e85fd9f4dd15c7294aa43c03da0cfc0e1f6e7e39d451bb5c5cb6bb68a84b0")
      override fun parquetSerDe(parquetSerDe: ParquetSerDeProperty.Builder.() -> Unit): Unit =
          parquetSerDe(ParquetSerDeProperty(parquetSerDe))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty,
    ) : SerializerProperty {
      override fun orcSerDe(): Any? = unwrap(this).getOrcSerDe()

      override fun parquetSerDe(): Any? = unwrap(this).getParquetSerDe()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SerializerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty):
          SerializerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SerializerProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudWatchLoggingOptionsProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    public fun logStreamName(): String? = unwrap(this).getLogStreamName()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun logGroupName(logGroupName: String)

      public fun logStreamName(logStreamName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      override fun logStreamName(logStreamName: String) {
        cdkBuilder.logStreamName(logStreamName)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty,
    ) : CloudWatchLoggingOptionsProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun logGroupName(): String? = unwrap(this).getLogGroupName()

      override fun logStreamName(): String? = unwrap(this).getLogStreamName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLoggingOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty):
          CloudWatchLoggingOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLoggingOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputFormatConfigurationProperty {
    public fun deserializer(): Any? = unwrap(this).getDeserializer()

    public interface Builder {
      public fun deserializer(deserializer: IResolvable)

      public fun deserializer(deserializer: DeserializerProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23ec1039d99303312bdb2fc16a73f2a2e373ead331e31a481f326503b95ca673")
      public fun deserializer(deserializer: DeserializerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty.builder()

      override fun deserializer(deserializer: IResolvable) {
        cdkBuilder.deserializer(deserializer.let(IResolvable::unwrap))
      }

      override fun deserializer(deserializer: DeserializerProperty) {
        cdkBuilder.deserializer(deserializer.let(DeserializerProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23ec1039d99303312bdb2fc16a73f2a2e373ead331e31a481f326503b95ca673")
      override fun deserializer(deserializer: DeserializerProperty.Builder.() -> Unit): Unit =
          deserializer(DeserializerProperty(deserializer))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty,
    ) : InputFormatConfigurationProperty {
      override fun deserializer(): Any? = unwrap(this).getDeserializer()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputFormatConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty):
          InputFormatConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputFormatConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AmazonOpenSearchServerlessRetryOptionsProperty {
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    public interface Builder {
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty.builder()

      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty,
    ) : AmazonOpenSearchServerlessRetryOptionsProperty {
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonOpenSearchServerlessRetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty):
          AmazonOpenSearchServerlessRetryOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonOpenSearchServerlessRetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HttpEndpointCommonAttributeProperty {
    public fun attributeName(): String

    public fun attributeValue(): String

    public interface Builder {
      public fun attributeName(attributeName: String)

      public fun attributeValue(attributeValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty.builder()

      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      override fun attributeValue(attributeValue: String) {
        cdkBuilder.attributeValue(attributeValue)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty,
    ) : HttpEndpointCommonAttributeProperty {
      override fun attributeName(): String = unwrap(this).getAttributeName()

      override fun attributeValue(): String = unwrap(this).getAttributeValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpEndpointCommonAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty):
          HttpEndpointCommonAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpEndpointCommonAttributeProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointCommonAttributeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HttpEndpointDestinationConfigurationProperty {
    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    public fun endpointConfiguration(): Any

    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    public fun requestConfiguration(): Any? = unwrap(this).getRequestConfiguration()

    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    public fun s3Configuration(): Any

    public interface Builder {
      public fun bufferingHints(bufferingHints: IResolvable)

      public fun bufferingHints(bufferingHints: BufferingHintsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1a13f33fd5f6df119c0b45ed202ee628910f8d4777c13ecb1a927549fcbeaef")
      public fun bufferingHints(bufferingHints: BufferingHintsProperty.Builder.() -> Unit)

      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccdba24c0ec57c435f7fe3732f10b7a42aafaf6bcb6d7405711e1a3bde676be7")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      public fun endpointConfiguration(endpointConfiguration: IResolvable)

      public fun endpointConfiguration(endpointConfiguration: HttpEndpointConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0764ae9bfb42ba183e70fd8c675c00e81b4ebe3ad0ddd795dc13dabb1a6ebe8")
      public
          fun endpointConfiguration(endpointConfiguration: HttpEndpointConfigurationProperty.Builder.() -> Unit)

      public fun processingConfiguration(processingConfiguration: IResolvable)

      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df44256b8689bc61dd24b653a7d54973be448b61c7011b67dce39b8578c1b475")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      public fun requestConfiguration(requestConfiguration: IResolvable)

      public
          fun requestConfiguration(requestConfiguration: HttpEndpointRequestConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("997e41975a88698fdf9438071100b9f58f63b2e3f38260225dc0e978312a56b4")
      public
          fun requestConfiguration(requestConfiguration: HttpEndpointRequestConfigurationProperty.Builder.() -> Unit)

      public fun retryOptions(retryOptions: IResolvable)

      public fun retryOptions(retryOptions: RetryOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("559085756a6e15b1b81c15bfdd751099d912b10160f7c17b843f69e7ef17b819")
      public fun retryOptions(retryOptions: RetryOptionsProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)

      public fun s3BackupMode(s3BackupMode: String)

      public fun s3Configuration(s3Configuration: IResolvable)

      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3028a43c60af828f00c40d725e2fe11ad07370d61b25c36f3684653b96bfcdd7")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.builder()

      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      override fun bufferingHints(bufferingHints: BufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(BufferingHintsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1a13f33fd5f6df119c0b45ed202ee628910f8d4777c13ecb1a927549fcbeaef")
      override fun bufferingHints(bufferingHints: BufferingHintsProperty.Builder.() -> Unit): Unit =
          bufferingHints(BufferingHintsProperty(bufferingHints))

      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccdba24c0ec57c435f7fe3732f10b7a42aafaf6bcb6d7405711e1a3bde676be7")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      override fun endpointConfiguration(endpointConfiguration: IResolvable) {
        cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable::unwrap))
      }

      override fun endpointConfiguration(endpointConfiguration: HttpEndpointConfigurationProperty) {
        cdkBuilder.endpointConfiguration(endpointConfiguration.let(HttpEndpointConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0764ae9bfb42ba183e70fd8c675c00e81b4ebe3ad0ddd795dc13dabb1a6ebe8")
      override
          fun endpointConfiguration(endpointConfiguration: HttpEndpointConfigurationProperty.Builder.() -> Unit):
          Unit = endpointConfiguration(HttpEndpointConfigurationProperty(endpointConfiguration))

      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df44256b8689bc61dd24b653a7d54973be448b61c7011b67dce39b8578c1b475")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      override fun requestConfiguration(requestConfiguration: IResolvable) {
        cdkBuilder.requestConfiguration(requestConfiguration.let(IResolvable::unwrap))
      }

      override
          fun requestConfiguration(requestConfiguration: HttpEndpointRequestConfigurationProperty) {
        cdkBuilder.requestConfiguration(requestConfiguration.let(HttpEndpointRequestConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("997e41975a88698fdf9438071100b9f58f63b2e3f38260225dc0e978312a56b4")
      override
          fun requestConfiguration(requestConfiguration: HttpEndpointRequestConfigurationProperty.Builder.() -> Unit):
          Unit =
          requestConfiguration(HttpEndpointRequestConfigurationProperty(requestConfiguration))

      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      override fun retryOptions(retryOptions: RetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(RetryOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("559085756a6e15b1b81c15bfdd751099d912b10160f7c17b843f69e7ef17b819")
      override fun retryOptions(retryOptions: RetryOptionsProperty.Builder.() -> Unit): Unit =
          retryOptions(RetryOptionsProperty(retryOptions))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3028a43c60af828f00c40d725e2fe11ad07370d61b25c36f3684653b96bfcdd7")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty,
    ) : HttpEndpointDestinationConfigurationProperty {
      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      override fun endpointConfiguration(): Any = unwrap(this).getEndpointConfiguration()

      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      override fun requestConfiguration(): Any? = unwrap(this).getRequestConfiguration()

      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      override fun roleArn(): String? = unwrap(this).getRoleArn()

      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpEndpointDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty):
          HttpEndpointDestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpEndpointDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HiveJsonSerDeProperty {
    public fun timestampFormats(): List<String> = unwrap(this).getTimestampFormats() ?: emptyList()

    public interface Builder {
      public fun timestampFormats(timestampFormats: List<String>)

      public fun timestampFormats(vararg timestampFormats: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty.builder()

      override fun timestampFormats(timestampFormats: List<String>) {
        cdkBuilder.timestampFormats(timestampFormats)
      }

      override fun timestampFormats(vararg timestampFormats: String): Unit =
          timestampFormats(timestampFormats.toList())

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty,
    ) : HiveJsonSerDeProperty {
      override fun timestampFormats(): List<String> = unwrap(this).getTimestampFormats() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HiveJsonSerDeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty):
          HiveJsonSerDeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HiveJsonSerDeProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HiveJsonSerDeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExtendedS3DestinationConfigurationProperty {
    public fun bucketArn(): String

    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    public fun compressionFormat(): String? = unwrap(this).getCompressionFormat()

    public fun customTimeZone(): String? = unwrap(this).getCustomTimeZone()

    public fun dataFormatConversionConfiguration(): Any? =
        unwrap(this).getDataFormatConversionConfiguration()

    public fun dynamicPartitioningConfiguration(): Any? =
        unwrap(this).getDynamicPartitioningConfiguration()

    public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    public fun errorOutputPrefix(): String? = unwrap(this).getErrorOutputPrefix()

    public fun fileExtension(): String? = unwrap(this).getFileExtension()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    public fun roleArn(): String

    public fun s3BackupConfiguration(): Any? = unwrap(this).getS3BackupConfiguration()

    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    public interface Builder {
      public fun bucketArn(bucketArn: String)

      public fun bufferingHints(bufferingHints: IResolvable)

      public fun bufferingHints(bufferingHints: BufferingHintsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76ed7dcfa53f225c44bbfb337353d8351f222239d3db30f3b5c5fd9254fe7561")
      public fun bufferingHints(bufferingHints: BufferingHintsProperty.Builder.() -> Unit)

      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aaf1d827e086a90ccbe61dae63485c39ab22db86dae0ac0592a4ee2c1262c711")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      public fun compressionFormat(compressionFormat: String)

      public fun customTimeZone(customTimeZone: String)

      public fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: IResolvable)

      public
          fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: DataFormatConversionConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67dcd2b258d463c407842d1fc46593e9bb1abbf394cacd7d25a49da3f02d6a8a")
      public
          fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: DataFormatConversionConfigurationProperty.Builder.() -> Unit)

      public fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: IResolvable)

      public
          fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: DynamicPartitioningConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("893f7631d9f20ab8a66513fad134896ba742af22fd769461cf30b85d42e82985")
      public
          fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: DynamicPartitioningConfigurationProperty.Builder.() -> Unit)

      public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

      public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a5d173a1b0584d4adbb2d31b81347141312686f87cb6155670e61726e2bbb2c")
      public
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

      public fun errorOutputPrefix(errorOutputPrefix: String)

      public fun fileExtension(fileExtension: String)

      public fun prefix(prefix: String)

      public fun processingConfiguration(processingConfiguration: IResolvable)

      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a710cd8228354ceb6f3cae2c0decf839f8c2b86f00e8ec1ddb508272af2f7fb2")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)

      public fun s3BackupConfiguration(s3BackupConfiguration: IResolvable)

      public fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41c024b93d3ac730d3df10eb56e1d65de2e17df9c07c47791f82caff1a2658e2")
      public
          fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      public fun s3BackupMode(s3BackupMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.builder()

      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      override fun bufferingHints(bufferingHints: BufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(BufferingHintsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76ed7dcfa53f225c44bbfb337353d8351f222239d3db30f3b5c5fd9254fe7561")
      override fun bufferingHints(bufferingHints: BufferingHintsProperty.Builder.() -> Unit): Unit =
          bufferingHints(BufferingHintsProperty(bufferingHints))

      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aaf1d827e086a90ccbe61dae63485c39ab22db86dae0ac0592a4ee2c1262c711")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      override fun compressionFormat(compressionFormat: String) {
        cdkBuilder.compressionFormat(compressionFormat)
      }

      override fun customTimeZone(customTimeZone: String) {
        cdkBuilder.customTimeZone(customTimeZone)
      }

      override
          fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: IResolvable) {
        cdkBuilder.dataFormatConversionConfiguration(dataFormatConversionConfiguration.let(IResolvable::unwrap))
      }

      override
          fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: DataFormatConversionConfigurationProperty) {
        cdkBuilder.dataFormatConversionConfiguration(dataFormatConversionConfiguration.let(DataFormatConversionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67dcd2b258d463c407842d1fc46593e9bb1abbf394cacd7d25a49da3f02d6a8a")
      override
          fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: DataFormatConversionConfigurationProperty.Builder.() -> Unit):
          Unit =
          dataFormatConversionConfiguration(DataFormatConversionConfigurationProperty(dataFormatConversionConfiguration))

      override fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: IResolvable) {
        cdkBuilder.dynamicPartitioningConfiguration(dynamicPartitioningConfiguration.let(IResolvable::unwrap))
      }

      override
          fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: DynamicPartitioningConfigurationProperty) {
        cdkBuilder.dynamicPartitioningConfiguration(dynamicPartitioningConfiguration.let(DynamicPartitioningConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("893f7631d9f20ab8a66513fad134896ba742af22fd769461cf30b85d42e82985")
      override
          fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: DynamicPartitioningConfigurationProperty.Builder.() -> Unit):
          Unit =
          dynamicPartitioningConfiguration(DynamicPartitioningConfigurationProperty(dynamicPartitioningConfiguration))

      override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
      }

      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a5d173a1b0584d4adbb2d31b81347141312686f87cb6155670e61726e2bbb2c")
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
          Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

      override fun errorOutputPrefix(errorOutputPrefix: String) {
        cdkBuilder.errorOutputPrefix(errorOutputPrefix)
      }

      override fun fileExtension(fileExtension: String) {
        cdkBuilder.fileExtension(fileExtension)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a710cd8228354ceb6f3cae2c0decf839f8c2b86f00e8ec1ddb508272af2f7fb2")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun s3BackupConfiguration(s3BackupConfiguration: IResolvable) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration.let(IResolvable::unwrap))
      }

      override
          fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration.let(S3DestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41c024b93d3ac730d3df10eb56e1d65de2e17df9c07c47791f82caff1a2658e2")
      override
          fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3BackupConfiguration(S3DestinationConfigurationProperty(s3BackupConfiguration))

      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty,
    ) : ExtendedS3DestinationConfigurationProperty {
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      override fun compressionFormat(): String? = unwrap(this).getCompressionFormat()

      override fun customTimeZone(): String? = unwrap(this).getCustomTimeZone()

      override fun dataFormatConversionConfiguration(): Any? =
          unwrap(this).getDataFormatConversionConfiguration()

      override fun dynamicPartitioningConfiguration(): Any? =
          unwrap(this).getDynamicPartitioningConfiguration()

      override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

      override fun errorOutputPrefix(): String? = unwrap(this).getErrorOutputPrefix()

      override fun fileExtension(): String? = unwrap(this).getFileExtension()

      override fun prefix(): String? = unwrap(this).getPrefix()

      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun s3BackupConfiguration(): Any? = unwrap(this).getS3BackupConfiguration()

      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExtendedS3DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty):
          ExtendedS3DestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExtendedS3DestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProcessorParameterProperty {
    public fun parameterName(): String

    public fun parameterValue(): String

    public interface Builder {
      public fun parameterName(parameterName: String)

      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty.builder()

      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty,
    ) : ProcessorParameterProperty {
      override fun parameterName(): String = unwrap(this).getParameterName()

      override fun parameterValue(): String = unwrap(this).getParameterValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProcessorParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty):
          ProcessorParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProcessorParameterProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CopyCommandProperty {
    public fun copyOptions(): String? = unwrap(this).getCopyOptions()

    public fun dataTableColumns(): String? = unwrap(this).getDataTableColumns()

    public fun dataTableName(): String

    public interface Builder {
      public fun copyOptions(copyOptions: String)

      public fun dataTableColumns(dataTableColumns: String)

      public fun dataTableName(dataTableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.builder()

      override fun copyOptions(copyOptions: String) {
        cdkBuilder.copyOptions(copyOptions)
      }

      override fun dataTableColumns(dataTableColumns: String) {
        cdkBuilder.dataTableColumns(dataTableColumns)
      }

      override fun dataTableName(dataTableName: String) {
        cdkBuilder.dataTableName(dataTableName)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty,
    ) : CopyCommandProperty {
      override fun copyOptions(): String? = unwrap(this).getCopyOptions()

      override fun dataTableColumns(): String? = unwrap(this).getDataTableColumns()

      override fun dataTableName(): String = unwrap(this).getDataTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CopyCommandProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty):
          CopyCommandProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CopyCommandProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EncryptionConfigurationProperty {
    public fun kmsEncryptionConfig(): Any? = unwrap(this).getKmsEncryptionConfig()

    public fun noEncryptionConfig(): String? = unwrap(this).getNoEncryptionConfig()

    public interface Builder {
      public fun kmsEncryptionConfig(kmsEncryptionConfig: IResolvable)

      public fun kmsEncryptionConfig(kmsEncryptionConfig: KMSEncryptionConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7557a7e60b43e91e5493722a7945cc9887eae4f02f8cf3a0845a00addc3549b4")
      public
          fun kmsEncryptionConfig(kmsEncryptionConfig: KMSEncryptionConfigProperty.Builder.() -> Unit)

      public fun noEncryptionConfig(noEncryptionConfig: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty.builder()

      override fun kmsEncryptionConfig(kmsEncryptionConfig: IResolvable) {
        cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig.let(IResolvable::unwrap))
      }

      override fun kmsEncryptionConfig(kmsEncryptionConfig: KMSEncryptionConfigProperty) {
        cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig.let(KMSEncryptionConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7557a7e60b43e91e5493722a7945cc9887eae4f02f8cf3a0845a00addc3549b4")
      override
          fun kmsEncryptionConfig(kmsEncryptionConfig: KMSEncryptionConfigProperty.Builder.() -> Unit):
          Unit = kmsEncryptionConfig(KMSEncryptionConfigProperty(kmsEncryptionConfig))

      override fun noEncryptionConfig(noEncryptionConfig: String) {
        cdkBuilder.noEncryptionConfig(noEncryptionConfig)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty,
    ) : EncryptionConfigurationProperty {
      override fun kmsEncryptionConfig(): Any? = unwrap(this).getKmsEncryptionConfig()

      override fun noEncryptionConfig(): String? = unwrap(this).getNoEncryptionConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SplunkRetryOptionsProperty {
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    public interface Builder {
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty.builder()

      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty,
    ) : SplunkRetryOptionsProperty {
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SplunkRetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty):
          SplunkRetryOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SplunkRetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProcessingConfigurationProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun processors(): Any? = unwrap(this).getProcessors()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun processors(processors: IResolvable)

      public fun processors(processors: List<Any>)

      public fun processors(vararg processors: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun processors(processors: IResolvable) {
        cdkBuilder.processors(processors.let(IResolvable::unwrap))
      }

      override fun processors(processors: List<Any>) {
        cdkBuilder.processors(processors)
      }

      override fun processors(vararg processors: Any): Unit = processors(processors.toList())

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty,
    ) : ProcessingConfigurationProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun processors(): Any? = unwrap(this).getProcessors()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProcessingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty):
          ProcessingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProcessingConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BufferingHintsProperty {
    public fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

    public fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()

    public interface Builder {
      public fun intervalInSeconds(intervalInSeconds: Number)

      public fun sizeInMBs(sizeInMBs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty.builder()

      override fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
      }

      override fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty,
    ) : BufferingHintsProperty {
      override fun intervalInSeconds(): Number? = unwrap(this).getIntervalInSeconds()

      override fun sizeInMBs(): Number? = unwrap(this).getSizeInMBs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BufferingHintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty):
          BufferingHintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BufferingHintsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SnowflakeRetryOptionsProperty {
    public fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()

    public interface Builder {
      public fun durationInSeconds(durationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRetryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRetryOptionsProperty.builder()

      override fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRetryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRetryOptionsProperty,
    ) : SnowflakeRetryOptionsProperty {
      override fun durationInSeconds(): Number? = unwrap(this).getDurationInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SnowflakeRetryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRetryOptionsProperty):
          SnowflakeRetryOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeRetryOptionsProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SnowflakeRetryOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeliveryStreamEncryptionConfigurationInputProperty {
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    public fun keyType(): String

    public interface Builder {
      public fun keyArn(keyArn: String)

      public fun keyType(keyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.builder()

      override fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
      }

      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty,
    ) : DeliveryStreamEncryptionConfigurationInputProperty {
      override fun keyArn(): String? = unwrap(this).getKeyArn()

      override fun keyType(): String = unwrap(this).getKeyType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DeliveryStreamEncryptionConfigurationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty):
          DeliveryStreamEncryptionConfigurationInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeliveryStreamEncryptionConfigurationInputProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RedshiftDestinationConfigurationProperty {
    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    public fun clusterJdbcurl(): String

    public fun copyCommand(): Any

    public fun password(): String

    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    public fun roleArn(): String

    public fun s3BackupConfiguration(): Any? = unwrap(this).getS3BackupConfiguration()

    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    public fun s3Configuration(): Any

    public fun username(): String

    public interface Builder {
      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45ef4423662114d977ecc3114c7802625a877da0c62692f1467c0d79e3a2ddac")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      public fun clusterJdbcurl(clusterJdbcurl: String)

      public fun copyCommand(copyCommand: IResolvable)

      public fun copyCommand(copyCommand: CopyCommandProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d2ef5f2291d07a9512a3ff24555b5f91c228a87a4ae9a1b79a43f5f4485d2a3")
      public fun copyCommand(copyCommand: CopyCommandProperty.Builder.() -> Unit)

      public fun password(password: String)

      public fun processingConfiguration(processingConfiguration: IResolvable)

      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87c2f921f49d7736ae64ab395b6ef401195e0ac58e53ca5e9a1d20c29ec9c679")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      public fun retryOptions(retryOptions: IResolvable)

      public fun retryOptions(retryOptions: RedshiftRetryOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c77b9a2c545114228f3d9ae0d91705b4701ea2de7e29d7d742a34ca79f340ab0")
      public fun retryOptions(retryOptions: RedshiftRetryOptionsProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)

      public fun s3BackupConfiguration(s3BackupConfiguration: IResolvable)

      public fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76f495a1f6c03576e673bcb8e356998d035f673113fceb47e468570787f93feb")
      public
          fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      public fun s3BackupMode(s3BackupMode: String)

      public fun s3Configuration(s3Configuration: IResolvable)

      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("180c65a4b7e2398bf76a2db60147c8ea87bb6d69a8be2d7c4a62846c15d24e55")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.builder()

      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45ef4423662114d977ecc3114c7802625a877da0c62692f1467c0d79e3a2ddac")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      override fun clusterJdbcurl(clusterJdbcurl: String) {
        cdkBuilder.clusterJdbcurl(clusterJdbcurl)
      }

      override fun copyCommand(copyCommand: IResolvable) {
        cdkBuilder.copyCommand(copyCommand.let(IResolvable::unwrap))
      }

      override fun copyCommand(copyCommand: CopyCommandProperty) {
        cdkBuilder.copyCommand(copyCommand.let(CopyCommandProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d2ef5f2291d07a9512a3ff24555b5f91c228a87a4ae9a1b79a43f5f4485d2a3")
      override fun copyCommand(copyCommand: CopyCommandProperty.Builder.() -> Unit): Unit =
          copyCommand(CopyCommandProperty(copyCommand))

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87c2f921f49d7736ae64ab395b6ef401195e0ac58e53ca5e9a1d20c29ec9c679")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      override fun retryOptions(retryOptions: RedshiftRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(RedshiftRetryOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c77b9a2c545114228f3d9ae0d91705b4701ea2de7e29d7d742a34ca79f340ab0")
      override fun retryOptions(retryOptions: RedshiftRetryOptionsProperty.Builder.() -> Unit): Unit
          = retryOptions(RedshiftRetryOptionsProperty(retryOptions))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun s3BackupConfiguration(s3BackupConfiguration: IResolvable) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration.let(IResolvable::unwrap))
      }

      override
          fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration.let(S3DestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76f495a1f6c03576e673bcb8e356998d035f673113fceb47e468570787f93feb")
      override
          fun s3BackupConfiguration(s3BackupConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3BackupConfiguration(S3DestinationConfigurationProperty(s3BackupConfiguration))

      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("180c65a4b7e2398bf76a2db60147c8ea87bb6d69a8be2d7c4a62846c15d24e55")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty,
    ) : RedshiftDestinationConfigurationProperty {
      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      override fun clusterJdbcurl(): String = unwrap(this).getClusterJdbcurl()

      override fun copyCommand(): Any = unwrap(this).getCopyCommand()

      override fun password(): String = unwrap(this).getPassword()

      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun s3BackupConfiguration(): Any? = unwrap(this).getS3BackupConfiguration()

      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()

      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty):
          RedshiftDestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DynamicPartitioningConfigurationProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun retryOptions(retryOptions: IResolvable)

      public fun retryOptions(retryOptions: RetryOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6e3695b89866f4eda2f073df2c3303fefb131630b8d3779f0b3e202e4fb0c6e")
      public fun retryOptions(retryOptions: RetryOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      override fun retryOptions(retryOptions: RetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(RetryOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6e3695b89866f4eda2f073df2c3303fefb131630b8d3779f0b3e202e4fb0c6e")
      override fun retryOptions(retryOptions: RetryOptionsProperty.Builder.() -> Unit): Unit =
          retryOptions(RetryOptionsProperty(retryOptions))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty,
    ) : DynamicPartitioningConfigurationProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DynamicPartitioningConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty):
          DynamicPartitioningConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamicPartitioningConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KMSEncryptionConfigProperty {
    public fun awskmsKeyArn(): String

    public interface Builder {
      public fun awskmsKeyArn(awskmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty.builder()

      override fun awskmsKeyArn(awskmsKeyArn: String) {
        cdkBuilder.awskmsKeyArn(awskmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty,
    ) : KMSEncryptionConfigProperty {
      override fun awskmsKeyArn(): String = unwrap(this).getAwskmsKeyArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KMSEncryptionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty):
          KMSEncryptionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KMSEncryptionConfigProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OutputFormatConfigurationProperty {
    public fun serializer(): Any? = unwrap(this).getSerializer()

    public interface Builder {
      public fun serializer(serializer: IResolvable)

      public fun serializer(serializer: SerializerProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7ef4373c5cefbf7b5d68af38d5da0d60c3f2bb67b3fd7c9f10a0c0f75fdef9e")
      public fun serializer(serializer: SerializerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty.builder()

      override fun serializer(serializer: IResolvable) {
        cdkBuilder.serializer(serializer.let(IResolvable::unwrap))
      }

      override fun serializer(serializer: SerializerProperty) {
        cdkBuilder.serializer(serializer.let(SerializerProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7ef4373c5cefbf7b5d68af38d5da0d60c3f2bb67b3fd7c9f10a0c0f75fdef9e")
      override fun serializer(serializer: SerializerProperty.Builder.() -> Unit): Unit =
          serializer(SerializerProperty(serializer))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty,
    ) : OutputFormatConfigurationProperty {
      override fun serializer(): Any? = unwrap(this).getSerializer()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          OutputFormatConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty):
          OutputFormatConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputFormatConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AmazonOpenSearchServerlessDestinationConfigurationProperty {
    public fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

    public fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

    public fun collectionEndpoint(): String? = unwrap(this).getCollectionEndpoint()

    public fun indexName(): String

    public fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

    public fun retryOptions(): Any? = unwrap(this).getRetryOptions()

    public fun roleArn(): String

    public fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

    public fun s3Configuration(): Any

    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    public interface Builder {
      public fun bufferingHints(bufferingHints: IResolvable)

      public fun bufferingHints(bufferingHints: AmazonOpenSearchServerlessBufferingHintsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d856ab156b753ed34b97d707610833958654efb99b63689d310e18ca5cc6583")
      public
          fun bufferingHints(bufferingHints: AmazonOpenSearchServerlessBufferingHintsProperty.Builder.() -> Unit)

      public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable)

      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85c1f70b9d28fa71684e73fc02e4379e2f8d35cf0d80bc3aebfd45885bc13a0a")
      public
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit)

      public fun collectionEndpoint(collectionEndpoint: String)

      public fun indexName(indexName: String)

      public fun processingConfiguration(processingConfiguration: IResolvable)

      public fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b53401fcfe636bcf5972a097267d944d66bb96777d24d33b9b0fed827b4a222")
      public
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit)

      public fun retryOptions(retryOptions: IResolvable)

      public fun retryOptions(retryOptions: AmazonOpenSearchServerlessRetryOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24baa8be39905e54321fc8fe03cede3cf6b3711a56985984f0822b7c0919c876")
      public
          fun retryOptions(retryOptions: AmazonOpenSearchServerlessRetryOptionsProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)

      public fun s3BackupMode(s3BackupMode: String)

      public fun s3Configuration(s3Configuration: IResolvable)

      public fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("347f6c226c18b5f3ec5857d7d02259e43bca74bdb689e2865aee76411fc20f45")
      public
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit)

      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca89cda108d01b6b82ba5abf1a018f9b6d7b1a6b6ea409e8c8f0af1c4b528b01")
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.builder()

      override fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints.let(IResolvable::unwrap))
      }

      override
          fun bufferingHints(bufferingHints: AmazonOpenSearchServerlessBufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints.let(AmazonOpenSearchServerlessBufferingHintsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d856ab156b753ed34b97d707610833958654efb99b63689d310e18ca5cc6583")
      override
          fun bufferingHints(bufferingHints: AmazonOpenSearchServerlessBufferingHintsProperty.Builder.() -> Unit):
          Unit = bufferingHints(AmazonOpenSearchServerlessBufferingHintsProperty(bufferingHints))

      override fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions.let(CloudWatchLoggingOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85c1f70b9d28fa71684e73fc02e4379e2f8d35cf0d80bc3aebfd45885bc13a0a")
      override
          fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CloudWatchLoggingOptionsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty(cloudWatchLoggingOptions))

      override fun collectionEndpoint(collectionEndpoint: String) {
        cdkBuilder.collectionEndpoint(collectionEndpoint)
      }

      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      override fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(IResolvable::unwrap))
      }

      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration.let(ProcessingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b53401fcfe636bcf5972a097267d944d66bb96777d24d33b9b0fed827b4a222")
      override
          fun processingConfiguration(processingConfiguration: ProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = processingConfiguration(ProcessingConfigurationProperty(processingConfiguration))

      override fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions.let(IResolvable::unwrap))
      }

      override fun retryOptions(retryOptions: AmazonOpenSearchServerlessRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions.let(AmazonOpenSearchServerlessRetryOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24baa8be39905e54321fc8fe03cede3cf6b3711a56985984f0822b7c0919c876")
      override
          fun retryOptions(retryOptions: AmazonOpenSearchServerlessRetryOptionsProperty.Builder.() -> Unit):
          Unit = retryOptions(AmazonOpenSearchServerlessRetryOptionsProperty(retryOptions))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
      }

      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      override fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("347f6c226c18b5f3ec5857d7d02259e43bca74bdb689e2865aee76411fc20f45")
      override
          fun s3Configuration(s3Configuration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DestinationConfigurationProperty(s3Configuration))

      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca89cda108d01b6b82ba5abf1a018f9b6d7b1a6b6ea409e8c8f0af1c4b528b01")
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty,
    ) : AmazonOpenSearchServerlessDestinationConfigurationProperty {
      override fun bufferingHints(): Any? = unwrap(this).getBufferingHints()

      override fun cloudWatchLoggingOptions(): Any? = unwrap(this).getCloudWatchLoggingOptions()

      override fun collectionEndpoint(): String? = unwrap(this).getCollectionEndpoint()

      override fun indexName(): String = unwrap(this).getIndexName()

      override fun processingConfiguration(): Any? = unwrap(this).getProcessingConfiguration()

      override fun retryOptions(): Any? = unwrap(this).getRetryOptions()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun s3BackupMode(): String? = unwrap(this).getS3BackupMode()

      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()

      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonOpenSearchServerlessDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty):
          AmazonOpenSearchServerlessDestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonOpenSearchServerlessDestinationConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataFormatConversionConfigurationProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun inputFormatConfiguration(): Any? = unwrap(this).getInputFormatConfiguration()

    public fun outputFormatConfiguration(): Any? = unwrap(this).getOutputFormatConfiguration()

    public fun schemaConfiguration(): Any? = unwrap(this).getSchemaConfiguration()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun inputFormatConfiguration(inputFormatConfiguration: IResolvable)

      public
          fun inputFormatConfiguration(inputFormatConfiguration: InputFormatConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc2b0ec3231b0412fd064bcb2115b381da4a8ed0566f7661555da38c36ee7bdb")
      public
          fun inputFormatConfiguration(inputFormatConfiguration: InputFormatConfigurationProperty.Builder.() -> Unit)

      public fun outputFormatConfiguration(outputFormatConfiguration: IResolvable)

      public
          fun outputFormatConfiguration(outputFormatConfiguration: OutputFormatConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ef4d026eb2d120e4a2efe591bb453b2bb5a3bfc49c0a4fd805eea0f00d12af5")
      public
          fun outputFormatConfiguration(outputFormatConfiguration: OutputFormatConfigurationProperty.Builder.() -> Unit)

      public fun schemaConfiguration(schemaConfiguration: IResolvable)

      public fun schemaConfiguration(schemaConfiguration: SchemaConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9d477f488e9dd4fe6c57ca7eaafa8455b6007569ef7569de70804f8c647fdd5")
      public
          fun schemaConfiguration(schemaConfiguration: SchemaConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun inputFormatConfiguration(inputFormatConfiguration: IResolvable) {
        cdkBuilder.inputFormatConfiguration(inputFormatConfiguration.let(IResolvable::unwrap))
      }

      override
          fun inputFormatConfiguration(inputFormatConfiguration: InputFormatConfigurationProperty) {
        cdkBuilder.inputFormatConfiguration(inputFormatConfiguration.let(InputFormatConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc2b0ec3231b0412fd064bcb2115b381da4a8ed0566f7661555da38c36ee7bdb")
      override
          fun inputFormatConfiguration(inputFormatConfiguration: InputFormatConfigurationProperty.Builder.() -> Unit):
          Unit =
          inputFormatConfiguration(InputFormatConfigurationProperty(inputFormatConfiguration))

      override fun outputFormatConfiguration(outputFormatConfiguration: IResolvable) {
        cdkBuilder.outputFormatConfiguration(outputFormatConfiguration.let(IResolvable::unwrap))
      }

      override
          fun outputFormatConfiguration(outputFormatConfiguration: OutputFormatConfigurationProperty) {
        cdkBuilder.outputFormatConfiguration(outputFormatConfiguration.let(OutputFormatConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ef4d026eb2d120e4a2efe591bb453b2bb5a3bfc49c0a4fd805eea0f00d12af5")
      override
          fun outputFormatConfiguration(outputFormatConfiguration: OutputFormatConfigurationProperty.Builder.() -> Unit):
          Unit =
          outputFormatConfiguration(OutputFormatConfigurationProperty(outputFormatConfiguration))

      override fun schemaConfiguration(schemaConfiguration: IResolvable) {
        cdkBuilder.schemaConfiguration(schemaConfiguration.let(IResolvable::unwrap))
      }

      override fun schemaConfiguration(schemaConfiguration: SchemaConfigurationProperty) {
        cdkBuilder.schemaConfiguration(schemaConfiguration.let(SchemaConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9d477f488e9dd4fe6c57ca7eaafa8455b6007569ef7569de70804f8c647fdd5")
      override
          fun schemaConfiguration(schemaConfiguration: SchemaConfigurationProperty.Builder.() -> Unit):
          Unit = schemaConfiguration(SchemaConfigurationProperty(schemaConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty,
    ) : DataFormatConversionConfigurationProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun inputFormatConfiguration(): Any? = unwrap(this).getInputFormatConfiguration()

      override fun outputFormatConfiguration(): Any? = unwrap(this).getOutputFormatConfiguration()

      override fun schemaConfiguration(): Any? = unwrap(this).getSchemaConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataFormatConversionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty):
          DataFormatConversionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataFormatConversionConfigurationProperty):
          software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
