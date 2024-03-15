@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnInstanceStorageConfigProps {
  public fun instanceArn(): String

  public fun kinesisFirehoseConfig(): Any? = unwrap(this).getKinesisFirehoseConfig()

  public fun kinesisStreamConfig(): Any? = unwrap(this).getKinesisStreamConfig()

  public fun kinesisVideoStreamConfig(): Any? = unwrap(this).getKinesisVideoStreamConfig()

  public fun resourceType(): String

  public fun s3Config(): Any? = unwrap(this).getS3Config()

  public fun storageType(): String

  @CdkDslMarker
  public interface Builder {
    public fun instanceArn(instanceArn: String)

    public fun kinesisFirehoseConfig(kinesisFirehoseConfig: IResolvable)

    public
        fun kinesisFirehoseConfig(kinesisFirehoseConfig: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f939387890bbef1e631967af20e190c6bd1ae637316c38d992c17fa899a77e7e")
    public
        fun kinesisFirehoseConfig(kinesisFirehoseConfig: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.Builder.() -> Unit)

    public fun kinesisStreamConfig(kinesisStreamConfig: IResolvable)

    public
        fun kinesisStreamConfig(kinesisStreamConfig: CfnInstanceStorageConfig.KinesisStreamConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33f964d777fe3257da6aab597537b8fcac5df036916048e8644404f58c1b4acc")
    public
        fun kinesisStreamConfig(kinesisStreamConfig: CfnInstanceStorageConfig.KinesisStreamConfigProperty.Builder.() -> Unit)

    public fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: IResolvable)

    public
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1fcd69952ced2cc8c898f8a8ad318b90713a1d3b9a81f264e6aca7f92897bdde")
    public
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.Builder.() -> Unit)

    public fun resourceType(resourceType: String)

    public fun s3Config(s3Config: IResolvable)

    public fun s3Config(s3Config: CfnInstanceStorageConfig.S3ConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d82f0bd8cd95ff5062bb481b56ca2bd931d5deeab25df14606a61f363e0fddfb")
    public fun s3Config(s3Config: CfnInstanceStorageConfig.S3ConfigProperty.Builder.() -> Unit)

    public fun storageType(storageType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps.Builder =
        software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps.builder()

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun kinesisFirehoseConfig(kinesisFirehoseConfig: IResolvable) {
      cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig.let(IResolvable::unwrap))
    }

    override
        fun kinesisFirehoseConfig(kinesisFirehoseConfig: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty) {
      cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig.let(CfnInstanceStorageConfig.KinesisFirehoseConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f939387890bbef1e631967af20e190c6bd1ae637316c38d992c17fa899a77e7e")
    override
        fun kinesisFirehoseConfig(kinesisFirehoseConfig: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.Builder.() -> Unit):
        Unit =
        kinesisFirehoseConfig(CfnInstanceStorageConfig.KinesisFirehoseConfigProperty(kinesisFirehoseConfig))

    override fun kinesisStreamConfig(kinesisStreamConfig: IResolvable) {
      cdkBuilder.kinesisStreamConfig(kinesisStreamConfig.let(IResolvable::unwrap))
    }

    override
        fun kinesisStreamConfig(kinesisStreamConfig: CfnInstanceStorageConfig.KinesisStreamConfigProperty) {
      cdkBuilder.kinesisStreamConfig(kinesisStreamConfig.let(CfnInstanceStorageConfig.KinesisStreamConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33f964d777fe3257da6aab597537b8fcac5df036916048e8644404f58c1b4acc")
    override
        fun kinesisStreamConfig(kinesisStreamConfig: CfnInstanceStorageConfig.KinesisStreamConfigProperty.Builder.() -> Unit):
        Unit =
        kinesisStreamConfig(CfnInstanceStorageConfig.KinesisStreamConfigProperty(kinesisStreamConfig))

    override fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: IResolvable) {
      cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig.let(IResolvable::unwrap))
    }

    override
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty) {
      cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig.let(CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1fcd69952ced2cc8c898f8a8ad318b90713a1d3b9a81f264e6aca7f92897bdde")
    override
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.Builder.() -> Unit):
        Unit =
        kinesisVideoStreamConfig(CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty(kinesisVideoStreamConfig))

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun s3Config(s3Config: IResolvable) {
      cdkBuilder.s3Config(s3Config.let(IResolvable::unwrap))
    }

    override fun s3Config(s3Config: CfnInstanceStorageConfig.S3ConfigProperty) {
      cdkBuilder.s3Config(s3Config.let(CfnInstanceStorageConfig.S3ConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d82f0bd8cd95ff5062bb481b56ca2bd931d5deeab25df14606a61f363e0fddfb")
    override fun s3Config(s3Config: CfnInstanceStorageConfig.S3ConfigProperty.Builder.() -> Unit):
        Unit = s3Config(CfnInstanceStorageConfig.S3ConfigProperty(s3Config))

    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps,
  ) : CdkObject(cdkObject), CfnInstanceStorageConfigProps {
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun kinesisFirehoseConfig(): Any? = unwrap(this).getKinesisFirehoseConfig()

    override fun kinesisStreamConfig(): Any? = unwrap(this).getKinesisStreamConfig()

    override fun kinesisVideoStreamConfig(): Any? = unwrap(this).getKinesisVideoStreamConfig()

    override fun resourceType(): String = unwrap(this).getResourceType()

    override fun s3Config(): Any? = unwrap(this).getS3Config()

    override fun storageType(): String = unwrap(this).getStorageType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceStorageConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps):
        CfnInstanceStorageConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceStorageConfigProps):
        software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps
  }
}
