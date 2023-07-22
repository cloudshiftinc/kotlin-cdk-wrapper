@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.CfnSubscriptionFilter
import software.constructs.Construct

@CdkDslMarker
public class CfnSubscriptionFilterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSubscriptionFilter.Builder =
      CfnSubscriptionFilter.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-destinationarn)
   * @param destinationArn The Amazon Resource Name (ARN) of the destination. 
   */
  public fun destinationArn(destinationArn: String) {
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
  public fun distribution(distribution: String) {
    cdkBuilder.distribution(distribution)
  }

  /**
   * The name of the subscription filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-filtername)
   * @param filterName The name of the subscription filter. 
   */
  public fun filterName(filterName: String) {
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
  public fun filterPattern(filterPattern: String) {
    cdkBuilder.filterPattern(filterPattern)
  }

  /**
   * The log group to associate with the subscription filter.
   *
   * All log events that are uploaded to this log group are filtered and delivered to the specified
   * AWS resource if the filter pattern matches the log events.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-loggroupname)
   * @param logGroupName The log group to associate with the subscription filter. 
   */
  public fun logGroupName(logGroupName: String) {
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
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnSubscriptionFilter = cdkBuilder.build()
}
