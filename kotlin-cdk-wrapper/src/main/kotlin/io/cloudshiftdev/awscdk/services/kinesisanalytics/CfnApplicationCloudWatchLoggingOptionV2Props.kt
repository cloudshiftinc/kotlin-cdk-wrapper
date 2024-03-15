@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalytics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnApplicationCloudWatchLoggingOptionV2Props {
  public fun applicationName(): String

  public fun cloudWatchLoggingOption(): Any

  @CdkDslMarker
  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable)

    public
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24e7e543a151910f0f2222a4116564ef9968bec4962f37dedf83ad27fe9eaca8")
    public
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props.Builder
        =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props.builder()

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
      cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(IResolvable::unwrap))
    }

    override
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty) {
      cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24e7e543a151910f0f2222a4116564ef9968bec4962f37dedf83ad27fe9eaca8")
    override
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty.Builder.() -> Unit):
        Unit =
        cloudWatchLoggingOption(CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty(cloudWatchLoggingOption))

    public fun build():
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props,
  ) : CdkObject(cdkObject), CfnApplicationCloudWatchLoggingOptionV2Props {
    override fun applicationName(): String = unwrap(this).getApplicationName()

    override fun cloudWatchLoggingOption(): Any = unwrap(this).getCloudWatchLoggingOption()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnApplicationCloudWatchLoggingOptionV2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props):
        CfnApplicationCloudWatchLoggingOptionV2Props = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationCloudWatchLoggingOptionV2Props):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props
  }
}
