package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubscriptionFilter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.CfnSubscriptionFilter,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of the destination.
   */
  public open fun destinationArn(): String = unwrap(this).getDestinationArn()

  /**
   * The Amazon Resource Name (ARN) of the destination.
   */
  public open fun destinationArn(`value`: String) {
    unwrap(this).setDestinationArn(`value`)
  }

  /**
   * The method used to distribute log data to the destination, which can be either random or
   * grouped by log stream.
   */
  public open fun distribution(): String? = unwrap(this).getDistribution()

  /**
   * The method used to distribute log data to the destination, which can be either random or
   * grouped by log stream.
   */
  public open fun distribution(`value`: String) {
    unwrap(this).setDistribution(`value`)
  }

  /**
   * The name of the subscription filter.
   */
  public open fun filterName(): String? = unwrap(this).getFilterName()

  /**
   * The name of the subscription filter.
   */
  public open fun filterName(`value`: String) {
    unwrap(this).setFilterName(`value`)
  }

  /**
   * The filtering expressions that restrict what gets delivered to the destination AWS resource.
   */
  public open fun filterPattern(): String = unwrap(this).getFilterPattern()

  /**
   * The filtering expressions that restrict what gets delivered to the destination AWS resource.
   */
  public open fun filterPattern(`value`: String) {
    unwrap(this).setFilterPattern(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The log group to associate with the subscription filter.
   */
  public open fun logGroupName(): String = unwrap(this).getLogGroupName()

  /**
   * The log group to associate with the subscription filter.
   */
  public open fun logGroupName(`value`: String) {
    unwrap(this).setLogGroupName(`value`)
  }

  /**
   * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events
   * to the destination stream.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events
   * to the destination stream.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnSubscriptionFilter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-destinationarn)
     * @param destinationArn The Amazon Resource Name (ARN) of the destination. 
     */
    public fun destinationArn(destinationArn: String)

    /**
     * The method used to distribute log data to the destination, which can be either random or
     * grouped by log stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-distribution)
     * @param distribution The method used to distribute log data to the destination, which can be
     * either random or grouped by log stream. 
     */
    public fun distribution(distribution: String)

    /**
     * The name of the subscription filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-filtername)
     * @param filterName The name of the subscription filter. 
     */
    public fun filterName(filterName: String)

    /**
     * The filtering expressions that restrict what gets delivered to the destination AWS resource.
     *
     * For more information about the filter pattern syntax, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-filterpattern)
     * @param filterPattern The filtering expressions that restrict what gets delivered to the
     * destination AWS resource. 
     */
    public fun filterPattern(filterPattern: String)

    /**
     * The log group to associate with the subscription filter.
     *
     * All log events that are uploaded to this log group are filtered and delivered to the
     * specified AWS resource if the filter pattern matches the log events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-loggroupname)
     * @param logGroupName The log group to associate with the subscription filter. 
     */
    public fun logGroupName(logGroupName: String)

    /**
     * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events
     * to the destination stream.
     *
     * You don't need to provide the ARN when you are working with a logical destination for
     * cross-account delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-rolearn)
     * @param roleArn The ARN of an IAM role that grants CloudWatch Logs permissions to deliver
     * ingested log events to the destination stream. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnSubscriptionFilter.Builder =
        software.amazon.awscdk.services.logs.CfnSubscriptionFilter.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-destinationarn)
     * @param destinationArn The Amazon Resource Name (ARN) of the destination. 
     */
    override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    /**
     * The method used to distribute log data to the destination, which can be either random or
     * grouped by log stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-distribution)
     * @param distribution The method used to distribute log data to the destination, which can be
     * either random or grouped by log stream. 
     */
    override fun distribution(distribution: String) {
      cdkBuilder.distribution(distribution)
    }

    /**
     * The name of the subscription filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-filtername)
     * @param filterName The name of the subscription filter. 
     */
    override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    /**
     * The filtering expressions that restrict what gets delivered to the destination AWS resource.
     *
     * For more information about the filter pattern syntax, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-filterpattern)
     * @param filterPattern The filtering expressions that restrict what gets delivered to the
     * destination AWS resource. 
     */
    override fun filterPattern(filterPattern: String) {
      cdkBuilder.filterPattern(filterPattern)
    }

    /**
     * The log group to associate with the subscription filter.
     *
     * All log events that are uploaded to this log group are filtered and delivered to the
     * specified AWS resource if the filter pattern matches the log events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-loggroupname)
     * @param logGroupName The log group to associate with the subscription filter. 
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events
     * to the destination stream.
     *
     * You don't need to provide the ARN when you are working with a logical destination for
     * cross-account delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-rolearn)
     * @param roleArn The ARN of an IAM role that grants CloudWatch Logs permissions to deliver
     * ingested log events to the destination stream. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnSubscriptionFilter =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubscriptionFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubscriptionFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnSubscriptionFilter):
        CfnSubscriptionFilter = CfnSubscriptionFilter(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionFilter):
        software.amazon.awscdk.services.logs.CfnSubscriptionFilter = wrapped.cdkObject
  }
}