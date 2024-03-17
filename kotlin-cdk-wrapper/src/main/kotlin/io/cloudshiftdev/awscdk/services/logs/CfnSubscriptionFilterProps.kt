@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSubscriptionFilter`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnSubscriptionFilterProps cfnSubscriptionFilterProps = CfnSubscriptionFilterProps.builder()
 * .destinationArn("destinationArn")
 * .filterPattern("filterPattern")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .distribution("distribution")
 * .filterName("filterName")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html)
 */
public interface CfnSubscriptionFilterProps {
  /**
   * The Amazon Resource Name (ARN) of the destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-destinationarn)
   */
  public fun destinationArn(): String

  /**
   * The method used to distribute log data to the destination, which can be either random or
   * grouped by log stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-distribution)
   */
  public fun distribution(): String? = unwrap(this).getDistribution()

  /**
   * The name of the subscription filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-filtername)
   */
  public fun filterName(): String? = unwrap(this).getFilterName()

  /**
   * The filtering expressions that restrict what gets delivered to the destination AWS resource.
   *
   * For more information about the filter pattern syntax, see [Filter and Pattern
   * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-filterpattern)
   */
  public fun filterPattern(): String

  /**
   * The log group to associate with the subscription filter.
   *
   * All log events that are uploaded to this log group are filtered and delivered to the specified
   * AWS resource if the filter pattern matches the log events.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-loggroupname)
   */
  public fun logGroupName(): String

  /**
   * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events
   * to the destination stream.
   *
   * You don't need to provide the ARN when you are working with a logical destination for
   * cross-account delivery.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * A builder for [CfnSubscriptionFilterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationArn The Amazon Resource Name (ARN) of the destination. 
     */
    public fun destinationArn(destinationArn: String)

    /**
     * @param distribution The method used to distribute log data to the destination, which can be
     * either random or grouped by log stream.
     */
    public fun distribution(distribution: String)

    /**
     * @param filterName The name of the subscription filter.
     */
    public fun filterName(filterName: String)

    /**
     * @param filterPattern The filtering expressions that restrict what gets delivered to the
     * destination AWS resource. 
     * For more information about the filter pattern syntax, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     */
    public fun filterPattern(filterPattern: String)

    /**
     * @param logGroupName The log group to associate with the subscription filter. 
     * All log events that are uploaded to this log group are filtered and delivered to the
     * specified AWS resource if the filter pattern matches the log events.
     */
    public fun logGroupName(logGroupName: String)

    /**
     * @param roleArn The ARN of an IAM role that grants CloudWatch Logs permissions to deliver
     * ingested log events to the destination stream.
     * You don't need to provide the ARN when you are working with a logical destination for
     * cross-account delivery.
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder
        = software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.builder()

    /**
     * @param destinationArn The Amazon Resource Name (ARN) of the destination. 
     */
    override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    /**
     * @param distribution The method used to distribute log data to the destination, which can be
     * either random or grouped by log stream.
     */
    override fun distribution(distribution: String) {
      cdkBuilder.distribution(distribution)
    }

    /**
     * @param filterName The name of the subscription filter.
     */
    override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    /**
     * @param filterPattern The filtering expressions that restrict what gets delivered to the
     * destination AWS resource. 
     * For more information about the filter pattern syntax, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     */
    override fun filterPattern(filterPattern: String) {
      cdkBuilder.filterPattern(filterPattern)
    }

    /**
     * @param logGroupName The log group to associate with the subscription filter. 
     * All log events that are uploaded to this log group are filtered and delivered to the
     * specified AWS resource if the filter pattern matches the log events.
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * @param roleArn The ARN of an IAM role that grants CloudWatch Logs permissions to deliver
     * ingested log events to the destination stream.
     * You don't need to provide the ARN when you are working with a logical destination for
     * cross-account delivery.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps,
  ) : CdkObject(cdkObject), CfnSubscriptionFilterProps {
    /**
     * The Amazon Resource Name (ARN) of the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-destinationarn)
     */
    override fun destinationArn(): String = unwrap(this).getDestinationArn()

    /**
     * The method used to distribute log data to the destination, which can be either random or
     * grouped by log stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-distribution)
     */
    override fun distribution(): String? = unwrap(this).getDistribution()

    /**
     * The name of the subscription filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-filtername)
     */
    override fun filterName(): String? = unwrap(this).getFilterName()

    /**
     * The filtering expressions that restrict what gets delivered to the destination AWS resource.
     *
     * For more information about the filter pattern syntax, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-filterpattern)
     */
    override fun filterPattern(): String = unwrap(this).getFilterPattern()

    /**
     * The log group to associate with the subscription filter.
     *
     * All log events that are uploaded to this log group are filtered and delivered to the
     * specified AWS resource if the filter pattern matches the log events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-loggroupname)
     */
    override fun logGroupName(): String = unwrap(this).getLogGroupName()

    /**
     * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events
     * to the destination stream.
     *
     * You don't need to provide the ARN when you are working with a logical destination for
     * cross-account delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubscriptionFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps):
        CfnSubscriptionFilterProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSubscriptionFilterProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionFilterProps):
        software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps
  }
}
