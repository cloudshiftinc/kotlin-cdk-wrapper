@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalytics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApplicationCloudWatchLoggingOption`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
 * CfnApplicationCloudWatchLoggingOptionV2Props cfnApplicationCloudWatchLoggingOptionV2Props =
 * CfnApplicationCloudWatchLoggingOptionV2Props.builder()
 * .applicationName("applicationName")
 * .cloudWatchLoggingOption(CloudWatchLoggingOptionProperty.builder()
 * .logStreamArn("logStreamArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html)
 */
public interface CfnApplicationCloudWatchLoggingOptionV2Props {
  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-applicationname)
   */
  public fun applicationName(): String

  /**
   * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
   * Resource Name (ARN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
   */
  public fun cloudWatchLoggingOption(): Any

  /**
   * A builder for [CfnApplicationCloudWatchLoggingOptionV2Props]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationName The name of the application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable)

    /**
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
    public
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty)

    /**
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
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

    /**
     * @param applicationName The name of the application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
    override fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
      cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(IResolvable::unwrap))
    }

    /**
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
    override
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty) {
      cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty::unwrap))
    }

    /**
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
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
    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-applicationname)
     */
    override fun applicationName(): String = unwrap(this).getApplicationName()

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
     */
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
