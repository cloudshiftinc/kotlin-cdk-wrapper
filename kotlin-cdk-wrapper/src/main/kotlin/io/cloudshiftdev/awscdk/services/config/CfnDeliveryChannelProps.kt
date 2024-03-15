@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnDeliveryChannelProps {
  public fun configSnapshotDeliveryProperties(): Any? =
      unwrap(this).getConfigSnapshotDeliveryProperties()

  public fun name(): String? = unwrap(this).getName()

  public fun s3BucketName(): String

  public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

  public fun s3KmsKeyArn(): String? = unwrap(this).getS3KmsKeyArn()

  public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  @CdkDslMarker
  public interface Builder {
    public fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: IResolvable)

    public
        fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9596114f0ba6633e96f0ffbe8717f015f3aa539c0157dc3d4d01e430aab64c0")
    public
        fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun s3BucketName(s3BucketName: String)

    public fun s3KeyPrefix(s3KeyPrefix: String)

    public fun s3KmsKeyArn(s3KmsKeyArn: String)

    public fun snsTopicArn(snsTopicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder =
        software.amazon.awscdk.services.config.CfnDeliveryChannelProps.builder()

    override fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: IResolvable) {
      cdkBuilder.configSnapshotDeliveryProperties(configSnapshotDeliveryProperties.let(IResolvable::unwrap))
    }

    override
        fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty) {
      cdkBuilder.configSnapshotDeliveryProperties(configSnapshotDeliveryProperties.let(CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9596114f0ba6633e96f0ffbe8717f015f3aa539c0157dc3d4d01e430aab64c0")
    override
        fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder.() -> Unit):
        Unit =
        configSnapshotDeliveryProperties(CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty(configSnapshotDeliveryProperties))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun s3BucketName(s3BucketName: String) {
      cdkBuilder.s3BucketName(s3BucketName)
    }

    override fun s3KeyPrefix(s3KeyPrefix: String) {
      cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    override fun s3KmsKeyArn(s3KmsKeyArn: String) {
      cdkBuilder.s3KmsKeyArn(s3KmsKeyArn)
    }

    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnDeliveryChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnDeliveryChannelProps,
  ) : CdkObject(cdkObject), CfnDeliveryChannelProps {
    override fun configSnapshotDeliveryProperties(): Any? =
        unwrap(this).getConfigSnapshotDeliveryProperties()

    override fun name(): String? = unwrap(this).getName()

    override fun s3BucketName(): String = unwrap(this).getS3BucketName()

    override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    override fun s3KmsKeyArn(): String? = unwrap(this).getS3KmsKeyArn()

    override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeliveryChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnDeliveryChannelProps):
        CfnDeliveryChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeliveryChannelProps):
        software.amazon.awscdk.services.config.CfnDeliveryChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.config.CfnDeliveryChannelProps
  }
}
