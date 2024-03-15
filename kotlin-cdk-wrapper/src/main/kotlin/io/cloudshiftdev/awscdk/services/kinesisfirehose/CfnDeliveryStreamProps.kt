@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDeliveryStreamProps {
  public fun amazonOpenSearchServerlessDestinationConfiguration(): Any? =
      unwrap(this).getAmazonOpenSearchServerlessDestinationConfiguration()

  public fun amazonopensearchserviceDestinationConfiguration(): Any? =
      unwrap(this).getAmazonopensearchserviceDestinationConfiguration()

  public fun deliveryStreamEncryptionConfigurationInput(): Any? =
      unwrap(this).getDeliveryStreamEncryptionConfigurationInput()

  public fun deliveryStreamName(): String? = unwrap(this).getDeliveryStreamName()

  public fun deliveryStreamType(): String? = unwrap(this).getDeliveryStreamType()

  public fun elasticsearchDestinationConfiguration(): Any? =
      unwrap(this).getElasticsearchDestinationConfiguration()

  public fun extendedS3DestinationConfiguration(): Any? =
      unwrap(this).getExtendedS3DestinationConfiguration()

  public fun httpEndpointDestinationConfiguration(): Any? =
      unwrap(this).getHttpEndpointDestinationConfiguration()

  public fun kinesisStreamSourceConfiguration(): Any? =
      unwrap(this).getKinesisStreamSourceConfiguration()

  public fun mskSourceConfiguration(): Any? = unwrap(this).getMskSourceConfiguration()

  public fun redshiftDestinationConfiguration(): Any? =
      unwrap(this).getRedshiftDestinationConfiguration()

  public fun s3DestinationConfiguration(): Any? = unwrap(this).getS3DestinationConfiguration()

  public fun snowflakeDestinationConfiguration(): Any? =
      unwrap(this).getSnowflakeDestinationConfiguration()

  public fun splunkDestinationConfiguration(): Any? =
      unwrap(this).getSplunkDestinationConfiguration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: IResolvable)

    public
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e234fa2403c410069e0f2074ad86e674a7b65068ee40b9fee6491065eb244b61")
    public
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder.() -> Unit)

    public
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: IResolvable)

    public
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("123cb966bb02cc9fb476d2e8afc8af1e8160aaab69c6f55d41d5149c4c2afb3a")
    public
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty.Builder.() -> Unit)

    public
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: IResolvable)

    public
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35122e6d3a8e6e2269456f74306f7a9726331c03ad3872a42f3a2465838050e3")
    public
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.Builder.() -> Unit)

    public fun deliveryStreamName(deliveryStreamName: String)

    public fun deliveryStreamType(deliveryStreamType: String)

    public
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: IResolvable)

    public
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60560e5e3128bcfde20dd9cd2817dac6f992ab226a6cd5f971f22ddf132711ec")
    public
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.() -> Unit)

    public fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: IResolvable)

    public
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f27ddfc549e6ae6a9ef238f24475274f447828b1e726bde5806c7e631496c7d5")
    public
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit)

    public
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: IResolvable)

    public
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a5c22a455fb650d9f0de8899a1fc1e3714d9e35a5d04431c07358704b22c2fe")
    public
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Builder.() -> Unit)

    public fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: IResolvable)

    public
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: CfnDeliveryStream.KinesisStreamSourceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eec2b97969432ab2ff37cc3c88a835d4ae5731086ab8cffc00d37cf8579670c9")
    public
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder.() -> Unit)

    public fun mskSourceConfiguration(mskSourceConfiguration: IResolvable)

    public
        fun mskSourceConfiguration(mskSourceConfiguration: CfnDeliveryStream.MSKSourceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9603bd47fbec070706a21200de103b0c80313548891c954ca59012452fc8cb2b")
    public
        fun mskSourceConfiguration(mskSourceConfiguration: CfnDeliveryStream.MSKSourceConfigurationProperty.Builder.() -> Unit)

    public fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: IResolvable)

    public
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: CfnDeliveryStream.RedshiftDestinationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("336a848ce3c95bb0e559116bd71dede6c3711c815150a1ca9018e53ed90a1e61")
    public
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.() -> Unit)

    public fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable)

    public
        fun s3DestinationConfiguration(s3DestinationConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22702d3f83ce6b4146cd848f3ba66c44b8f56f73bb0016651836971ba3605409")
    public
        fun s3DestinationConfiguration(s3DestinationConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.() -> Unit)

    public fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: IResolvable)

    public
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: CfnDeliveryStream.SnowflakeDestinationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d5078c1c1701955e6a654341428466c9795c0b2eff2eda19daa8768873878f5")
    public
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: CfnDeliveryStream.SnowflakeDestinationConfigurationProperty.Builder.() -> Unit)

    public fun splunkDestinationConfiguration(splunkDestinationConfiguration: IResolvable)

    public
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: CfnDeliveryStream.SplunkDestinationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebe1f5c9a1768a811facb2824eb3c1780f5938c79f8a7d0489a9513a7da1103b")
    public
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder =
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.builder()

    override
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: IResolvable) {
      cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty) {
      cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration.let(CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e234fa2403c410069e0f2074ad86e674a7b65068ee40b9fee6491065eb244b61")
    override
        fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        amazonOpenSearchServerlessDestinationConfiguration(CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty(amazonOpenSearchServerlessDestinationConfiguration))

    override
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: IResolvable) {
      cdkBuilder.amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty) {
      cdkBuilder.amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration.let(CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("123cb966bb02cc9fb476d2e8afc8af1e8160aaab69c6f55d41d5149c4c2afb3a")
    override
        fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        amazonopensearchserviceDestinationConfiguration(CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty(amazonopensearchserviceDestinationConfiguration))

    override
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: IResolvable) {
      cdkBuilder.deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput.let(IResolvable::unwrap))
    }

    override
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty) {
      cdkBuilder.deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput.let(CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35122e6d3a8e6e2269456f74306f7a9726331c03ad3872a42f3a2465838050e3")
    override
        fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.Builder.() -> Unit):
        Unit =
        deliveryStreamEncryptionConfigurationInput(CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty(deliveryStreamEncryptionConfigurationInput))

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
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty) {
      cdkBuilder.elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration.let(CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60560e5e3128bcfde20dd9cd2817dac6f992ab226a6cd5f971f22ddf132711ec")
    override
        fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        elasticsearchDestinationConfiguration(CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty(elasticsearchDestinationConfiguration))

    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: IResolvable) {
      cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty) {
      cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration.let(CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f27ddfc549e6ae6a9ef238f24475274f447828b1e726bde5806c7e631496c7d5")
    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        extendedS3DestinationConfiguration(CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty(extendedS3DestinationConfiguration))

    override
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: IResolvable) {
      cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty) {
      cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration.let(CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a5c22a455fb650d9f0de8899a1fc1e3714d9e35a5d04431c07358704b22c2fe")
    override
        fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        httpEndpointDestinationConfiguration(CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty(httpEndpointDestinationConfiguration))

    override fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: IResolvable) {
      cdkBuilder.kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: CfnDeliveryStream.KinesisStreamSourceConfigurationProperty) {
      cdkBuilder.kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration.let(CfnDeliveryStream.KinesisStreamSourceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eec2b97969432ab2ff37cc3c88a835d4ae5731086ab8cffc00d37cf8579670c9")
    override
        fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        kinesisStreamSourceConfiguration(CfnDeliveryStream.KinesisStreamSourceConfigurationProperty(kinesisStreamSourceConfiguration))

    override fun mskSourceConfiguration(mskSourceConfiguration: IResolvable) {
      cdkBuilder.mskSourceConfiguration(mskSourceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun mskSourceConfiguration(mskSourceConfiguration: CfnDeliveryStream.MSKSourceConfigurationProperty) {
      cdkBuilder.mskSourceConfiguration(mskSourceConfiguration.let(CfnDeliveryStream.MSKSourceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9603bd47fbec070706a21200de103b0c80313548891c954ca59012452fc8cb2b")
    override
        fun mskSourceConfiguration(mskSourceConfiguration: CfnDeliveryStream.MSKSourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        mskSourceConfiguration(CfnDeliveryStream.MSKSourceConfigurationProperty(mskSourceConfiguration))

    override fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: IResolvable) {
      cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: CfnDeliveryStream.RedshiftDestinationConfigurationProperty) {
      cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration.let(CfnDeliveryStream.RedshiftDestinationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("336a848ce3c95bb0e559116bd71dede6c3711c815150a1ca9018e53ed90a1e61")
    override
        fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        redshiftDestinationConfiguration(CfnDeliveryStream.RedshiftDestinationConfigurationProperty(redshiftDestinationConfiguration))

    override fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable) {
      cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun s3DestinationConfiguration(s3DestinationConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty) {
      cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration.let(CfnDeliveryStream.S3DestinationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22702d3f83ce6b4146cd848f3ba66c44b8f56f73bb0016651836971ba3605409")
    override
        fun s3DestinationConfiguration(s3DestinationConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        s3DestinationConfiguration(CfnDeliveryStream.S3DestinationConfigurationProperty(s3DestinationConfiguration))

    override fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: IResolvable) {
      cdkBuilder.snowflakeDestinationConfiguration(snowflakeDestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: CfnDeliveryStream.SnowflakeDestinationConfigurationProperty) {
      cdkBuilder.snowflakeDestinationConfiguration(snowflakeDestinationConfiguration.let(CfnDeliveryStream.SnowflakeDestinationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d5078c1c1701955e6a654341428466c9795c0b2eff2eda19daa8768873878f5")
    override
        fun snowflakeDestinationConfiguration(snowflakeDestinationConfiguration: CfnDeliveryStream.SnowflakeDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        snowflakeDestinationConfiguration(CfnDeliveryStream.SnowflakeDestinationConfigurationProperty(snowflakeDestinationConfiguration))

    override fun splunkDestinationConfiguration(splunkDestinationConfiguration: IResolvable) {
      cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: CfnDeliveryStream.SplunkDestinationConfigurationProperty) {
      cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration.let(CfnDeliveryStream.SplunkDestinationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebe1f5c9a1768a811facb2824eb3c1780f5938c79f8a7d0489a9513a7da1103b")
    override
        fun splunkDestinationConfiguration(splunkDestinationConfiguration: CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        splunkDestinationConfiguration(CfnDeliveryStream.SplunkDestinationConfigurationProperty(splunkDestinationConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps,
  ) : CdkObject(cdkObject), CfnDeliveryStreamProps {
    override fun amazonOpenSearchServerlessDestinationConfiguration(): Any? =
        unwrap(this).getAmazonOpenSearchServerlessDestinationConfiguration()

    override fun amazonopensearchserviceDestinationConfiguration(): Any? =
        unwrap(this).getAmazonopensearchserviceDestinationConfiguration()

    override fun deliveryStreamEncryptionConfigurationInput(): Any? =
        unwrap(this).getDeliveryStreamEncryptionConfigurationInput()

    override fun deliveryStreamName(): String? = unwrap(this).getDeliveryStreamName()

    override fun deliveryStreamType(): String? = unwrap(this).getDeliveryStreamType()

    override fun elasticsearchDestinationConfiguration(): Any? =
        unwrap(this).getElasticsearchDestinationConfiguration()

    override fun extendedS3DestinationConfiguration(): Any? =
        unwrap(this).getExtendedS3DestinationConfiguration()

    override fun httpEndpointDestinationConfiguration(): Any? =
        unwrap(this).getHttpEndpointDestinationConfiguration()

    override fun kinesisStreamSourceConfiguration(): Any? =
        unwrap(this).getKinesisStreamSourceConfiguration()

    override fun mskSourceConfiguration(): Any? = unwrap(this).getMskSourceConfiguration()

    override fun redshiftDestinationConfiguration(): Any? =
        unwrap(this).getRedshiftDestinationConfiguration()

    override fun s3DestinationConfiguration(): Any? = unwrap(this).getS3DestinationConfiguration()

    override fun snowflakeDestinationConfiguration(): Any? =
        unwrap(this).getSnowflakeDestinationConfiguration()

    override fun splunkDestinationConfiguration(): Any? =
        unwrap(this).getSplunkDestinationConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeliveryStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps):
        CfnDeliveryStreamProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeliveryStreamProps):
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps
  }
}
