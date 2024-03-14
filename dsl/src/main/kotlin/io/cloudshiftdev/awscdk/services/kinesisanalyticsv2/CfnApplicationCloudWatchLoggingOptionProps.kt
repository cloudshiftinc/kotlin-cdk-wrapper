package io.cloudshiftdev.awscdk.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnApplicationCloudWatchLoggingOptionProps {
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
   * A builder for [CfnApplicationCloudWatchLoggingOptionProps]
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
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty)

    /**
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9608823a426c07a94953b4fdae7525c5e6e1d221185d107c95f0066576d210c5")
    public
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps.Builder
        =
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps.builder()

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
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty) {
      cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty::unwrap))
    }

    /**
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
