package io.cloudshiftdev.awscdk.services.kinesisanalytics

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

public open class CfnApplicationCloudWatchLoggingOptionV2 internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2,
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
  @JvmName("c1280b0197e04c126267b3a7ddef5bf3146db41870a6a927dcb6e368f38c0cb6")
  public open
      fun cloudWatchLoggingOption(`value`: CloudWatchLoggingOptionProperty.Builder.() -> Unit): Unit
      = cloudWatchLoggingOption(CloudWatchLoggingOptionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun applicationName(applicationName: String) {
    }

    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
    }

    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: CloudWatchLoggingOptionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cceefcbc4f18947a4a912638e5b148ebafa6ffc046b692d4af604efad5c68be8")
    public
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CloudWatchLoggingOptionProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.Builder
        =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.Builder.create(scope,
        id)

    public override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public override fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
      cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(IResolvable::unwrap))
    }

    public override
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CloudWatchLoggingOptionProperty) {
      cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(CloudWatchLoggingOptionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cceefcbc4f18947a4a912638e5b148ebafa6ffc046b692d4af604efad5c68be8")
    public override
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CloudWatchLoggingOptionProperty.Builder.() -> Unit):
        Unit = cloudWatchLoggingOption(CloudWatchLoggingOptionProperty(cloudWatchLoggingOption))

    public fun build():
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2 =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationCloudWatchLoggingOptionV2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationCloudWatchLoggingOptionV2(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2):
        CfnApplicationCloudWatchLoggingOptionV2 = CfnApplicationCloudWatchLoggingOptionV2(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationCloudWatchLoggingOptionV2):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2 =
        wrapped.cdkObject
  }

  public interface CloudWatchLoggingOptionProperty {
    public fun logStreamArn(): String

    public interface Builder {
      public fun logStreamArn(logStreamArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty.builder()

      public override fun logStreamArn(logStreamArn: String) {
        cdkBuilder.logStreamArn(logStreamArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty,
    ) : CloudWatchLoggingOptionProperty {
      public override fun logStreamArn(): String = unwrap(this).getLogStreamArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLoggingOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty):
          CloudWatchLoggingOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLoggingOptionProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
