@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
 *
 *
 * Only one *ApplicationCloudWatchLoggingOption* resource can be attached per application.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
 * CfnApplicationCloudWatchLoggingOption cfnApplicationCloudWatchLoggingOption =
 * CfnApplicationCloudWatchLoggingOption.Builder.create(this,
 * "MyCfnApplicationCloudWatchLoggingOption")
 * .applicationName("applicationName")
 * .cloudWatchLoggingOption(CloudWatchLoggingOptionProperty.builder()
 * .logStreamArn("logStreamArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html)
 */
public open class CfnApplicationCloudWatchLoggingOption internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The name of the application.
   */
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  /**
   * The name of the application.
   */
  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
   * Resource Name (ARN).
   */
  public open fun cloudWatchLoggingOption(): Any = unwrap(this).getCloudWatchLoggingOption()

  /**
   * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
   * Resource Name (ARN).
   */
  public open fun cloudWatchLoggingOption(`value`: IResolvable) {
    unwrap(this).setCloudWatchLoggingOption(`value`.let(IResolvable::unwrap))
  }

  /**
   * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
   * Resource Name (ARN).
   */
  public open fun cloudWatchLoggingOption(`value`: CloudWatchLoggingOptionProperty) {
    unwrap(this).setCloudWatchLoggingOption(`value`.let(CloudWatchLoggingOptionProperty::unwrap))
  }

  /**
   * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
   * Resource Name (ARN).
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("106d23eb3d8b3c15658a7a10b6ae136b5169cf1e62cbbdbccb27591a01151da9")
  public open
      fun cloudWatchLoggingOption(`value`: CloudWatchLoggingOptionProperty.Builder.() -> Unit): Unit
      = cloudWatchLoggingOption(CloudWatchLoggingOptionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-applicationname)
     * @param applicationName The name of the application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable)

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: CloudWatchLoggingOptionProperty)

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-applicationname)
     * @param applicationName The name of the application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
    override fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
      cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(IResolvable::unwrap))
    }

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
    override fun cloudWatchLoggingOption(cloudWatchLoggingOption: CloudWatchLoggingOptionProperty) {
      cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(CloudWatchLoggingOptionProperty::unwrap))
    }

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     * including the log stream Amazon Resource Name (ARN). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70e3b8aeccc2e35d43c195f60d07ce7988192aee2c13d319446c66d509f8a1fd")
    override
        fun cloudWatchLoggingOption(cloudWatchLoggingOption: CloudWatchLoggingOptionProperty.Builder.() -> Unit):
        Unit = cloudWatchLoggingOption(CloudWatchLoggingOptionProperty(cloudWatchLoggingOption))

    public fun build():
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CFN_RESOURCE_TYPE_NAME

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

  /**
   * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
   * Resource Name (ARN).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * CloudWatchLoggingOptionProperty cloudWatchLoggingOptionProperty =
   * CloudWatchLoggingOptionProperty.builder()
   * .logStreamArn("logStreamArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html)
   */
  public interface CloudWatchLoggingOptionProperty {
    /**
     * The ARN of the CloudWatch log to receive application messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption-logstreamarn)
     */
    public fun logStreamArn(): String

    /**
     * A builder for [CloudWatchLoggingOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logStreamArn The ARN of the CloudWatch log to receive application messages. 
       */
      public fun logStreamArn(logStreamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty.builder()

      /**
       * @param logStreamArn The ARN of the CloudWatch log to receive application messages. 
       */
      override fun logStreamArn(logStreamArn: String) {
        cdkBuilder.logStreamArn(logStreamArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty,
    ) : CdkObject(cdkObject), CloudWatchLoggingOptionProperty {
      /**
       * The ARN of the CloudWatch log to receive application messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption-logstreamarn)
       */
      override fun logStreamArn(): String = unwrap(this).getLogStreamArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLoggingOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty):
          CloudWatchLoggingOptionProperty = CdkObjectWrappers.wrap(cdkObject) as
          CloudWatchLoggingOptionProperty

      internal fun unwrap(wrapped: CloudWatchLoggingOptionProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty
    }
  }
}
