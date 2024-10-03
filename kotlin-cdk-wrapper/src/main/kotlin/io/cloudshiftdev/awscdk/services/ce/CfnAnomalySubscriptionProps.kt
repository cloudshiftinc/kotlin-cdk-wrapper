@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ce

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnAnomalySubscription`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ce.*;
 * CfnAnomalySubscriptionProps cfnAnomalySubscriptionProps = CfnAnomalySubscriptionProps.builder()
 * .frequency("frequency")
 * .monitorArnList(List.of("monitorArnList"))
 * .subscribers(List.of(SubscriberProperty.builder()
 * .address("address")
 * .type("type")
 * // the properties below are optional
 * .status("status")
 * .build()))
 * .subscriptionName("subscriptionName")
 * // the properties below are optional
 * .resourceTags(List.of(ResourceTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .threshold(123)
 * .thresholdExpression("thresholdExpression")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html)
 */
public interface CfnAnomalySubscriptionProps {
  /**
   * The frequency that anomaly notifications are sent.
   *
   * Notifications are sent either over email (for DAILY and WEEKLY frequencies) or SNS (for
   * IMMEDIATE frequency). For more information, see [Creating an Amazon SNS topic for anomaly
   * notifications](https://docs.aws.amazon.com/cost-management/latest/userguide/ad-SNS.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-frequency)
   */
  public fun frequency(): String

  /**
   * A list of cost anomaly monitors.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-monitorarnlist)
   */
  public fun monitorArnList(): List<String>

  /**
   * Tags to assign to subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-resourcetags)
   */
  public fun resourceTags(): Any? = unwrap(this).getResourceTags()

  /**
   * A list of subscribers to notify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscribers)
   */
  public fun subscribers(): Any

  /**
   * The name for the subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscriptionname)
   */
  public fun subscriptionName(): String

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
   */
  public fun threshold(): Number? = unwrap(this).getThreshold()

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
   */
  public fun thresholdExpression(): String? = unwrap(this).getThresholdExpression()

  /**
   * A builder for [CfnAnomalySubscriptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param frequency The frequency that anomaly notifications are sent. 
     * Notifications are sent either over email (for DAILY and WEEKLY frequencies) or SNS (for
     * IMMEDIATE frequency). For more information, see [Creating an Amazon SNS topic for anomaly
     * notifications](https://docs.aws.amazon.com/cost-management/latest/userguide/ad-SNS.html) .
     */
    public fun frequency(frequency: String)

    /**
     * @param monitorArnList A list of cost anomaly monitors. 
     */
    public fun monitorArnList(monitorArnList: List<String>)

    /**
     * @param monitorArnList A list of cost anomaly monitors. 
     */
    public fun monitorArnList(vararg monitorArnList: String)

    /**
     * @param resourceTags Tags to assign to subscription.
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * @param resourceTags Tags to assign to subscription.
     */
    public fun resourceTags(resourceTags: List<Any>)

    /**
     * @param resourceTags Tags to assign to subscription.
     */
    public fun resourceTags(vararg resourceTags: Any)

    /**
     * @param subscribers A list of subscribers to notify. 
     */
    public fun subscribers(subscribers: IResolvable)

    /**
     * @param subscribers A list of subscribers to notify. 
     */
    public fun subscribers(subscribers: List<Any>)

    /**
     * @param subscribers A list of subscribers to notify. 
     */
    public fun subscribers(vararg subscribers: Any)

    /**
     * @param subscriptionName The name for the subscription. 
     */
    public fun subscriptionName(subscriptionName: String)

    /**
     * @param threshold (deprecated).
     * An absolute dollar value that must be exceeded by the anomaly's total impact (see
     * [Impact](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Impact.html)
     * for more details) for an anomaly notification to be generated.
     *
     * This field has been deprecated. To specify a threshold, use ThresholdExpression. Continued
     * use of Threshold will be treated as shorthand syntax for a ThresholdExpression.
     *
     * One of Threshold or ThresholdExpression is required for `AWS::CE::AnomalySubscription` . You
     * cannot specify both.
     */
    public fun threshold(threshold: Number)

    /**
     * @param thresholdExpression An
     * [Expression](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html)
     * object in JSON string format used to specify the anomalies that you want to generate alerts for.
     * This supports dimensions and nested expressions. The supported dimensions are
     * `ANOMALY_TOTAL_IMPACT_ABSOLUTE` and `ANOMALY_TOTAL_IMPACT_PERCENTAGE` , corresponding to an
     * anomaly’s TotalImpact and TotalImpactPercentage, respectively (see
     * [Impact](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Impact.html)
     * for more details). The supported nested expression types are `AND` and `OR` . The match option
     * `GREATER_THAN_OR_EQUAL` is required. Values must be numbers between 0 and 10,000,000,000 in
     * string format.
     * One of Threshold or ThresholdExpression is required for `AWS::CE::AnomalySubscription` . You
     * cannot specify both.
     *
     * For further information, see the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#aws-resource-ce-anomalysubscription--examples)
     * section of this page.
     */
    public fun thresholdExpression(thresholdExpression: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps.Builder =
        software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps.builder()

    /**
     * @param frequency The frequency that anomaly notifications are sent. 
     * Notifications are sent either over email (for DAILY and WEEKLY frequencies) or SNS (for
     * IMMEDIATE frequency). For more information, see [Creating an Amazon SNS topic for anomaly
     * notifications](https://docs.aws.amazon.com/cost-management/latest/userguide/ad-SNS.html) .
     */
    override fun frequency(frequency: String) {
      cdkBuilder.frequency(frequency)
    }

    /**
     * @param monitorArnList A list of cost anomaly monitors. 
     */
    override fun monitorArnList(monitorArnList: List<String>) {
      cdkBuilder.monitorArnList(monitorArnList)
    }

    /**
     * @param monitorArnList A list of cost anomaly monitors. 
     */
    override fun monitorArnList(vararg monitorArnList: String): Unit =
        monitorArnList(monitorArnList.toList())

    /**
     * @param resourceTags Tags to assign to subscription.
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resourceTags Tags to assign to subscription.
     */
    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param resourceTags Tags to assign to subscription.
     */
    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    /**
     * @param subscribers A list of subscribers to notify. 
     */
    override fun subscribers(subscribers: IResolvable) {
      cdkBuilder.subscribers(subscribers.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param subscribers A list of subscribers to notify. 
     */
    override fun subscribers(subscribers: List<Any>) {
      cdkBuilder.subscribers(subscribers.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param subscribers A list of subscribers to notify. 
     */
    override fun subscribers(vararg subscribers: Any): Unit = subscribers(subscribers.toList())

    /**
     * @param subscriptionName The name for the subscription. 
     */
    override fun subscriptionName(subscriptionName: String) {
      cdkBuilder.subscriptionName(subscriptionName)
    }

    /**
     * @param threshold (deprecated).
     * An absolute dollar value that must be exceeded by the anomaly's total impact (see
     * [Impact](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Impact.html)
     * for more details) for an anomaly notification to be generated.
     *
     * This field has been deprecated. To specify a threshold, use ThresholdExpression. Continued
     * use of Threshold will be treated as shorthand syntax for a ThresholdExpression.
     *
     * One of Threshold or ThresholdExpression is required for `AWS::CE::AnomalySubscription` . You
     * cannot specify both.
     */
    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

    /**
     * @param thresholdExpression An
     * [Expression](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html)
     * object in JSON string format used to specify the anomalies that you want to generate alerts for.
     * This supports dimensions and nested expressions. The supported dimensions are
     * `ANOMALY_TOTAL_IMPACT_ABSOLUTE` and `ANOMALY_TOTAL_IMPACT_PERCENTAGE` , corresponding to an
     * anomaly’s TotalImpact and TotalImpactPercentage, respectively (see
     * [Impact](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Impact.html)
     * for more details). The supported nested expression types are `AND` and `OR` . The match option
     * `GREATER_THAN_OR_EQUAL` is required. Values must be numbers between 0 and 10,000,000,000 in
     * string format.
     * One of Threshold or ThresholdExpression is required for `AWS::CE::AnomalySubscription` . You
     * cannot specify both.
     *
     * For further information, see the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#aws-resource-ce-anomalysubscription--examples)
     * section of this page.
     */
    override fun thresholdExpression(thresholdExpression: String) {
      cdkBuilder.thresholdExpression(thresholdExpression)
    }

    public fun build(): software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps,
  ) : CdkObject(cdkObject),
      CfnAnomalySubscriptionProps {
    /**
     * The frequency that anomaly notifications are sent.
     *
     * Notifications are sent either over email (for DAILY and WEEKLY frequencies) or SNS (for
     * IMMEDIATE frequency). For more information, see [Creating an Amazon SNS topic for anomaly
     * notifications](https://docs.aws.amazon.com/cost-management/latest/userguide/ad-SNS.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-frequency)
     */
    override fun frequency(): String = unwrap(this).getFrequency()

    /**
     * A list of cost anomaly monitors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-monitorarnlist)
     */
    override fun monitorArnList(): List<String> = unwrap(this).getMonitorArnList()

    /**
     * Tags to assign to subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-resourcetags)
     */
    override fun resourceTags(): Any? = unwrap(this).getResourceTags()

    /**
     * A list of subscribers to notify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscribers)
     */
    override fun subscribers(): Any = unwrap(this).getSubscribers()

    /**
     * The name for the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscriptionname)
     */
    override fun subscriptionName(): String = unwrap(this).getSubscriptionName()

    /**
     * (deprecated).
     *
     * An absolute dollar value that must be exceeded by the anomaly's total impact (see
     * [Impact](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Impact.html)
     * for more details) for an anomaly notification to be generated.
     *
     * This field has been deprecated. To specify a threshold, use ThresholdExpression. Continued
     * use of Threshold will be treated as shorthand syntax for a ThresholdExpression.
     *
     * One of Threshold or ThresholdExpression is required for `AWS::CE::AnomalySubscription` . You
     * cannot specify both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-threshold)
     */
    override fun threshold(): Number? = unwrap(this).getThreshold()

    /**
     * An
     * [Expression](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html)
     * object in JSON string format used to specify the anomalies that you want to generate alerts for.
     * This supports dimensions and nested expressions. The supported dimensions are
     * `ANOMALY_TOTAL_IMPACT_ABSOLUTE` and `ANOMALY_TOTAL_IMPACT_PERCENTAGE` , corresponding to an
     * anomaly’s TotalImpact and TotalImpactPercentage, respectively (see
     * [Impact](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Impact.html)
     * for more details). The supported nested expression types are `AND` and `OR` . The match option
     * `GREATER_THAN_OR_EQUAL` is required. Values must be numbers between 0 and 10,000,000,000 in
     * string format.
     *
     * One of Threshold or ThresholdExpression is required for `AWS::CE::AnomalySubscription` . You
     * cannot specify both.
     *
     * For further information, see the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#aws-resource-ce-anomalysubscription--examples)
     * section of this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-thresholdexpression)
     */
    override fun thresholdExpression(): String? = unwrap(this).getThresholdExpression()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnomalySubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps):
        CfnAnomalySubscriptionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnAnomalySubscriptionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalySubscriptionProps):
        software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps
  }
}
