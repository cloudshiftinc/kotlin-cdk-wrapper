package io.cloudshiftdev.awscdk.services.kinesisanalyticsv2

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

public open class CfnApplicationCloudWatchLoggingOption internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cloudWatchLoggingOption(): Any = unwrap(this).getCloudWatchLoggingOption()

  public open fun cloudWatchLoggingOption(`value`: IResolvable) {
    unwrap(this).setCloudWatchLoggingOption(`value`.let(IResolvable::unwrap))
  }

  public open fun cloudWatchLoggingOption(`value`: CloudWatchLoggingOptionProperty) {
    unwrap(this).setCloudWatchLoggingOption(`value`.let(CloudWatchLoggingOptionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("106d23eb3d8b3c15658a7a10b6ae136b5169cf1e62cbbdbccb27591a01151da9")
  public open
      fun cloudWatchLoggingOption(`value`: CloudWatchLoggingOptionProperty.Builder.() -> Unit): Unit
      = cloudWatchLoggingOption(CloudWatchLoggingOptionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable)

    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: CloudWatchLoggingOptionProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70e3b8aeccc2e35d43c195f60d07ce7988192aee2c13d319446c66d509f8a1fd")
    public
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CloudWatchLoggingOptionProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.Builder
        =
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.Builder.create(scope,
        id)

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
      cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(IResolvable::unwrap))
    }

    override fun cloudWatchLoggingOption(cloudWatchLoggingOption: CloudWatchLoggingOptionProperty) {
      cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(CloudWatchLoggingOptionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70e3b8aeccc2e35d43c195f60d07ce7988192aee2c13d319446c66d509f8a1fd")
    override
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CloudWatchLoggingOptionProperty.Builder.() -> Unit):
        Unit = cloudWatchLoggingOption(CloudWatchLoggingOptionProperty(cloudWatchLoggingOption))

    public fun build():
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationCloudWatchLoggingOption {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationCloudWatchLoggingOption(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption):
        CfnApplicationCloudWatchLoggingOption = CfnApplicationCloudWatchLoggingOption(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationCloudWatchLoggingOption):
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption =
        wrapped.cdkObject
  }

  public interface CloudWatchLoggingOptionProperty {
    public fun logStreamArn(): String

    public interface Builder {
      public fun logStreamArn(logStreamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty.builder()

      override fun logStreamArn(logStreamArn: String) {
        cdkBuilder.logStreamArn(logStreamArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty,
    ) : CloudWatchLoggingOptionProperty {
      override fun logStreamArn(): String = unwrap(this).getLogStreamArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLoggingOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty):
          CloudWatchLoggingOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLoggingOptionProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
