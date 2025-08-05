@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Logs::SubscriptionFilter` resource specifies a subscription filter and associates it
 * with the specified log group.
 *
 * Subscription filters allow you to subscribe to a real-time stream of log events and have them
 * delivered to a specific destination. Currently, the supported destinations are:
 *
 * * An Amazon Kinesis data stream belonging to the same account as the subscription filter, for
 * same-account delivery.
 * * A logical destination that belongs to a different account, for cross-account delivery.
 * * An Amazon Kinesis Firehose delivery stream that belongs to the same account as the subscription
 * filter, for same-account delivery.
 * * An AWS Lambda function that belongs to the same account as the subscription filter, for
 * same-account delivery.
 *
 * There can be as many as two subscription filters associated with a log group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnSubscriptionFilter cfnSubscriptionFilter = CfnSubscriptionFilter.Builder.create(this,
 * "MyCfnSubscriptionFilter")
 * .destinationArn("destinationArn")
 * .filterPattern("filterPattern")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .applyOnTransformedLogs(false)
 * .distribution("distribution")
 * .filterName("filterName")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html)
 */
public open class CfnSubscriptionFilter(
  cdkObject: software.amazon.awscdk.services.logs.CfnSubscriptionFilter,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubscriptionFilterProps,
  ) :
      this(software.amazon.awscdk.services.logs.CfnSubscriptionFilter(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSubscriptionFilterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubscriptionFilterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSubscriptionFilterProps(props)
  )

  /**
   * This parameter is valid only for log groups that have an active log transformer.
   */
  public open fun applyOnTransformedLogs(): Any? = unwrap(this).getApplyOnTransformedLogs()

  /**
   * This parameter is valid only for log groups that have an active log transformer.
   */
  public open fun applyOnTransformedLogs(`value`: Boolean) {
    unwrap(this).setApplyOnTransformedLogs(`value`)
  }

  /**
   * This parameter is valid only for log groups that have an active log transformer.
   */
  public open fun applyOnTransformedLogs(`value`: IResolvable) {
    unwrap(this).setApplyOnTransformedLogs(`value`.let(IResolvable.Companion::unwrap))
  }

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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
     * This parameter is valid only for log groups that have an active log transformer.
     *
     * For more information about log transformers, see
     * [PutTransformer](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutTransformer.html)
     * .
     *
     * If this value is `true` , the subscription filter is applied on the transformed version of
     * the log events instead of the original ingested log events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-applyontransformedlogs)
     * @param applyOnTransformedLogs This parameter is valid only for log groups that have an active
     * log transformer. 
     */
    public fun applyOnTransformedLogs(applyOnTransformedLogs: Boolean)

    /**
     * This parameter is valid only for log groups that have an active log transformer.
     *
     * For more information about log transformers, see
     * [PutTransformer](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutTransformer.html)
     * .
     *
     * If this value is `true` , the subscription filter is applied on the transformed version of
     * the log events instead of the original ingested log events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-applyontransformedlogs)
     * @param applyOnTransformedLogs This parameter is valid only for log groups that have an active
     * log transformer. 
     */
    public fun applyOnTransformedLogs(applyOnTransformedLogs: IResolvable)

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
     * This parameter is valid only for log groups that have an active log transformer.
     *
     * For more information about log transformers, see
     * [PutTransformer](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutTransformer.html)
     * .
     *
     * If this value is `true` , the subscription filter is applied on the transformed version of
     * the log events instead of the original ingested log events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-applyontransformedlogs)
     * @param applyOnTransformedLogs This parameter is valid only for log groups that have an active
     * log transformer. 
     */
    override fun applyOnTransformedLogs(applyOnTransformedLogs: Boolean) {
      cdkBuilder.applyOnTransformedLogs(applyOnTransformedLogs)
    }

    /**
     * This parameter is valid only for log groups that have an active log transformer.
     *
     * For more information about log transformers, see
     * [PutTransformer](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutTransformer.html)
     * .
     *
     * If this value is `true` , the subscription filter is applied on the transformed version of
     * the log events instead of the original ingested log events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-applyontransformedlogs)
     * @param applyOnTransformedLogs This parameter is valid only for log groups that have an active
     * log transformer. 
     */
    override fun applyOnTransformedLogs(applyOnTransformedLogs: IResolvable) {
      cdkBuilder.applyOnTransformedLogs(applyOnTransformedLogs.let(IResolvable.Companion::unwrap))
    }

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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnSubscriptionFilter.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.logs.CfnSubscriptionFilter = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.CfnSubscriptionFilter
  }
}
