@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnApplicationCloudWatchLoggingOptionProps {
  public fun applicationName(): String

  public fun cloudWatchLoggingOption(): Any

  @CdkDslMarker
  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable)

    public
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9608823a426c07a94953b4fdae7525c5e6e1d221185d107c95f0066576d210c5")
    public
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps.Builder
        =
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps.builder()

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
      cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(IResolvable::unwrap))
    }

    override
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty) {
      cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9608823a426c07a94953b4fdae7525c5e6e1d221185d107c95f0066576d210c5")
    override
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty.Builder.() -> Unit):
        Unit =
        cloudWatchLoggingOption(CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty(cloudWatchLoggingOption))

    public fun build():
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps,
  ) : CdkObject(cdkObject), CfnApplicationCloudWatchLoggingOptionProps {
    override fun applicationName(): String = unwrap(this).getApplicationName()

    override fun cloudWatchLoggingOption(): Any = unwrap(this).getCloudWatchLoggingOption()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnApplicationCloudWatchLoggingOptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps):
        CfnApplicationCloudWatchLoggingOptionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationCloudWatchLoggingOptionProps):
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps
  }
}
