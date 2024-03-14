package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDeliveryChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.CfnDeliveryChannel,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun configSnapshotDeliveryProperties(): Any? =
      unwrap(this).getConfigSnapshotDeliveryProperties()

  public open fun configSnapshotDeliveryProperties(`value`: IResolvable) {
    unwrap(this).setConfigSnapshotDeliveryProperties(`value`.let(IResolvable::unwrap))
  }

  public open
      fun configSnapshotDeliveryProperties(`value`: ConfigSnapshotDeliveryPropertiesProperty) {
    unwrap(this).setConfigSnapshotDeliveryProperties(`value`.let(ConfigSnapshotDeliveryPropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12f058971d24c9256517585ee6875022db27101276d4eb66209d4f1077ba37ba")
  public open
      fun configSnapshotDeliveryProperties(`value`: ConfigSnapshotDeliveryPropertiesProperty.Builder.() -> Unit):
      Unit = configSnapshotDeliveryProperties(ConfigSnapshotDeliveryPropertiesProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun s3BucketName(): String = unwrap(this).getS3BucketName()

  public open fun s3BucketName(`value`: String) {
    unwrap(this).setS3BucketName(`value`)
  }

  public open fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

  public open fun s3KeyPrefix(`value`: String) {
    unwrap(this).setS3KeyPrefix(`value`)
  }

  public open fun s3KmsKeyArn(): String? = unwrap(this).getS3KmsKeyArn()

  public open fun s3KmsKeyArn(`value`: String) {
    unwrap(this).setS3KmsKeyArn(`value`)
  }

  public open fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  public open fun snsTopicArn(`value`: String) {
    unwrap(this).setSnsTopicArn(`value`)
  }

  public interface Builder {
    public fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: IResolvable)

    public
        fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: ConfigSnapshotDeliveryPropertiesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfb4bf1ae0c01b5dff6b36efd667367546cb7272c7922473fbf7054028e9e546")
    public
        fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: ConfigSnapshotDeliveryPropertiesProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun s3BucketName(s3BucketName: String)

    public fun s3KeyPrefix(s3KeyPrefix: String)

    public fun s3KmsKeyArn(s3KmsKeyArn: String)

    public fun snsTopicArn(snsTopicArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnDeliveryChannel.Builder =
        software.amazon.awscdk.services.config.CfnDeliveryChannel.Builder.create(scope, id)

    override fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: IResolvable) {
      cdkBuilder.configSnapshotDeliveryProperties(configSnapshotDeliveryProperties.let(IResolvable::unwrap))
    }

    override
        fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: ConfigSnapshotDeliveryPropertiesProperty) {
      cdkBuilder.configSnapshotDeliveryProperties(configSnapshotDeliveryProperties.let(ConfigSnapshotDeliveryPropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfb4bf1ae0c01b5dff6b36efd667367546cb7272c7922473fbf7054028e9e546")
    override
        fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: ConfigSnapshotDeliveryPropertiesProperty.Builder.() -> Unit):
        Unit =
        configSnapshotDeliveryProperties(ConfigSnapshotDeliveryPropertiesProperty(configSnapshotDeliveryProperties))

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

    public fun build(): software.amazon.awscdk.services.config.CfnDeliveryChannel =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeliveryChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeliveryChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnDeliveryChannel):
        CfnDeliveryChannel = CfnDeliveryChannel(cdkObject)

    internal fun unwrap(wrapped: CfnDeliveryChannel):
        software.amazon.awscdk.services.config.CfnDeliveryChannel = wrapped.cdkObject
  }

  public interface ConfigSnapshotDeliveryPropertiesProperty {
    public fun deliveryFrequency(): String? = unwrap(this).getDeliveryFrequency()

    public interface Builder {
      public fun deliveryFrequency(deliveryFrequency: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.builder()

      override fun deliveryFrequency(deliveryFrequency: String) {
        cdkBuilder.deliveryFrequency(deliveryFrequency)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty,
    ) : ConfigSnapshotDeliveryPropertiesProperty {
      override fun deliveryFrequency(): String? = unwrap(this).getDeliveryFrequency()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfigSnapshotDeliveryPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty):
          ConfigSnapshotDeliveryPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigSnapshotDeliveryPropertiesProperty):
          software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
