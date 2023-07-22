@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ce.CfnAnomalySubscription
import software.constructs.Construct

@CdkDslMarker
public class CfnAnomalySubscriptionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAnomalySubscription.Builder =
      CfnAnomalySubscription.Builder.create(scope, id)

  private val _monitorArnList: MutableList<String> = mutableListOf()

  private val _resourceTags: MutableList<Any> = mutableListOf()

  private val _subscribers: MutableList<Any> = mutableListOf()

  /**
   * The frequency that anomaly notifications are sent.
   *
   * Notifications are sent either over email (for DAILY and WEEKLY frequencies) or SNS (for
   * IMMEDIATE frequency). For more information, see [Creating an Amazon SNS topic for anomaly
   * notifications](https://docs.aws.amazon.com/cost-management/latest/userguide/ad-SNS.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-frequency)
   * @param frequency The frequency that anomaly notifications are sent. 
   */
  public fun frequency(frequency: String) {
    cdkBuilder.frequency(frequency)
  }

  /**
   * A list of cost anomaly monitors.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-monitorarnlist)
   * @param monitorArnList A list of cost anomaly monitors. 
   */
  public fun monitorArnList(vararg monitorArnList: String) {
    _monitorArnList.addAll(listOf(*monitorArnList))
  }

  /**
   * A list of cost anomaly monitors.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-monitorarnlist)
   * @param monitorArnList A list of cost anomaly monitors. 
   */
  public fun monitorArnList(monitorArnList: Collection<String>) {
    _monitorArnList.addAll(monitorArnList)
  }

  /**
   * Tags to assign to subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-resourcetags)
   * @param resourceTags Tags to assign to subscription. 
   */
  public fun resourceTags(vararg resourceTags: Any) {
    _resourceTags.addAll(listOf(*resourceTags))
  }

  /**
   * Tags to assign to subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-resourcetags)
   * @param resourceTags Tags to assign to subscription. 
   */
  public fun resourceTags(resourceTags: Collection<Any>) {
    _resourceTags.addAll(resourceTags)
  }

  /**
   * Tags to assign to subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-resourcetags)
   * @param resourceTags Tags to assign to subscription. 
   */
  public fun resourceTags(resourceTags: IResolvable) {
    cdkBuilder.resourceTags(resourceTags)
  }

  /**
   * A list of subscribers to notify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscribers)
   * @param subscribers A list of subscribers to notify. 
   */
  public fun subscribers(vararg subscribers: Any) {
    _subscribers.addAll(listOf(*subscribers))
  }

  /**
   * A list of subscribers to notify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscribers)
   * @param subscribers A list of subscribers to notify. 
   */
  public fun subscribers(subscribers: Collection<Any>) {
    _subscribers.addAll(subscribers)
  }

  /**
   * A list of subscribers to notify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscribers)
   * @param subscribers A list of subscribers to notify. 
   */
  public fun subscribers(subscribers: IResolvable) {
    cdkBuilder.subscribers(subscribers)
  }

  /**
   * The name for the subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscriptionname)
   * @param subscriptionName The name for the subscription. 
   */
  public fun subscriptionName(subscriptionName: String) {
    cdkBuilder.subscriptionName(subscriptionName)
  }

  /**
   * (deprecated).
   *
   * An absolute dollar value that must be exceeded by the anomaly's total impact (see
   * [Impact](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Impact.html) for
   * more details) for an anomaly notification to be generated.
   *
   * This field has been deprecated. To specify a threshold, use ThresholdExpression. Continued use
   * of Threshold will be treated as shorthand syntax for a ThresholdExpression.
   *
   * One of Threshold or ThresholdExpression is required for `AWS::CE::AnomalySubscription` . You
   * cannot specify both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-threshold)
   * @param threshold (deprecated). 
   */
  public fun threshold(threshold: Number) {
    cdkBuilder.threshold(threshold)
  }

  /**
   * An
   * [Expression](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html)
   * object in JSON string format used to specify the anomalies that you want to generate alerts for.
   * This supports dimensions and nested expressions. The supported dimensions are
   * `ANOMALY_TOTAL_IMPACT_ABSOLUTE` and `ANOMALY_TOTAL_IMPACT_PERCENTAGE` , corresponding to an
   * anomaly’s TotalImpact and TotalImpactPercentage, respectively (see
   * [Impact](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Impact.html) for
   * more details). The supported nested expression types are `AND` and `OR` . The match option
   * `GREATER_THAN_OR_EQUAL` is required. Values must be numbers between 0 and 10,000,000,000 in string
   * format.
   *
   * One of Threshold or ThresholdExpression is required for `AWS::CE::AnomalySubscription` . You
   * cannot specify both.
   *
   * For further information, see the
   * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#aws-resource-ce-anomalysubscription--examples)
   * section of this page.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-thresholdexpression)
   * @param thresholdExpression An
   * [Expression](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html)
   * object in JSON string format used to specify the anomalies that you want to generate alerts for.
   * This supports dimensions and nested expressions. The supported dimensions are
   * `ANOMALY_TOTAL_IMPACT_ABSOLUTE` and `ANOMALY_TOTAL_IMPACT_PERCENTAGE` , corresponding to an
   * anomaly’s TotalImpact and TotalImpactPercentage, respectively (see
   * [Impact](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Impact.html) for
   * more details). The supported nested expression types are `AND` and `OR` . The match option
   * `GREATER_THAN_OR_EQUAL` is required. Values must be numbers between 0 and 10,000,000,000 in string
   * format. 
   */
  public fun thresholdExpression(thresholdExpression: String) {
    cdkBuilder.thresholdExpression(thresholdExpression)
  }

  public fun build(): CfnAnomalySubscription {
    if(_monitorArnList.isNotEmpty()) cdkBuilder.monitorArnList(_monitorArnList)
    if(_resourceTags.isNotEmpty()) cdkBuilder.resourceTags(_resourceTags)
    if(_subscribers.isNotEmpty()) cdkBuilder.subscribers(_subscribers)
    return cdkBuilder.build()
  }
}
