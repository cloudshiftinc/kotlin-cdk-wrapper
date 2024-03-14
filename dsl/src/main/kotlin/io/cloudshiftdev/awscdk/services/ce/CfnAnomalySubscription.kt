package io.cloudshiftdev.awscdk.services.ce

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAnomalySubscription internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ce.CfnAnomalySubscription,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Your unique account identifier.
   */
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  /**
   * The `AnomalySubscription` Amazon Resource Name (ARN).
   */
  public open fun attrSubscriptionArn(): String = unwrap(this).getAttrSubscriptionArn()

  /**
   * The frequency that anomaly notifications are sent.
   */
  public open fun frequency(): String = unwrap(this).getFrequency()

  /**
   * The frequency that anomaly notifications are sent.
   */
  public open fun frequency(`value`: String) {
    unwrap(this).setFrequency(`value`)
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
   * A list of cost anomaly monitors.
   */
  public open fun monitorArnList(): List<String> = unwrap(this).getMonitorArnList()

  /**
   * A list of cost anomaly monitors.
   */
  public open fun monitorArnList(`value`: List<String>) {
    unwrap(this).setMonitorArnList(`value`)
  }

  /**
   * A list of cost anomaly monitors.
   */
  public open fun monitorArnList(vararg `value`: String): Unit = monitorArnList(`value`.toList())

  /**
   * Tags to assign to subscription.
   */
  public open fun resourceTags(): Any? = unwrap(this).getResourceTags()

  /**
   * Tags to assign to subscription.
   */
  public open fun resourceTags(`value`: IResolvable) {
    unwrap(this).setResourceTags(`value`.let(IResolvable::unwrap))
  }

  /**
   * Tags to assign to subscription.
   */
  public open fun resourceTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setResourceTags(__idx_ac66f0)
  }

  /**
   * Tags to assign to subscription.
   */
  public open fun resourceTags(vararg __idx_ac66f0: Any): Unit = resourceTags(__idx_ac66f0.toList())

  /**
   * A list of subscribers to notify.
   */
  public open fun subscribers(): Any = unwrap(this).getSubscribers()

  /**
   * A list of subscribers to notify.
   */
  public open fun subscribers(`value`: IResolvable) {
    unwrap(this).setSubscribers(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of subscribers to notify.
   */
  public open fun subscribers(__idx_ac66f0: List<Any>) {
    unwrap(this).setSubscribers(__idx_ac66f0)
  }

  /**
   * A list of subscribers to notify.
   */
  public open fun subscribers(vararg __idx_ac66f0: Any): Unit = subscribers(__idx_ac66f0.toList())

  /**
   * The name for the subscription.
   */
  public open fun subscriptionName(): String = unwrap(this).getSubscriptionName()

  /**
   * The name for the subscription.
   */
  public open fun subscriptionName(`value`: String) {
    unwrap(this).setSubscriptionName(`value`)
  }

  /**
   * (deprecated).
   */
  public open fun threshold(): Number? = unwrap(this).getThreshold()

  /**
   * (deprecated).
   */
  public open fun threshold(`value`: Number) {
    unwrap(this).setThreshold(`value`)
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
   */
  public open fun thresholdExpression(): String? = unwrap(this).getThresholdExpression()

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
   */
  public open fun thresholdExpression(`value`: String) {
    unwrap(this).setThresholdExpression(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ce.CfnAnomalySubscription].
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun frequency(frequency: String)

    /**
     * A list of cost anomaly monitors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-monitorarnlist)
     * @param monitorArnList A list of cost anomaly monitors. 
     */
    public fun monitorArnList(monitorArnList: List<String>)

    /**
     * A list of cost anomaly monitors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-monitorarnlist)
     * @param monitorArnList A list of cost anomaly monitors. 
     */
    public fun monitorArnList(vararg monitorArnList: String)

    /**
     * Tags to assign to subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-resourcetags)
     * @param resourceTags Tags to assign to subscription. 
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * Tags to assign to subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-resourcetags)
     * @param resourceTags Tags to assign to subscription. 
     */
    public fun resourceTags(resourceTags: List<Any>)

    /**
     * Tags to assign to subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-resourcetags)
     * @param resourceTags Tags to assign to subscription. 
     */
    public fun resourceTags(vararg resourceTags: Any)

    /**
     * A list of subscribers to notify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscribers)
     * @param subscribers A list of subscribers to notify. 
     */
    public fun subscribers(subscribers: IResolvable)

    /**
     * A list of subscribers to notify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscribers)
     * @param subscribers A list of subscribers to notify. 
     */
    public fun subscribers(subscribers: List<Any>)

    /**
     * A list of subscribers to notify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscribers)
     * @param subscribers A list of subscribers to notify. 
     */
    public fun subscribers(vararg subscribers: Any)

    /**
     * The name for the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscriptionname)
     * @param subscriptionName The name for the subscription. 
     */
    public fun subscriptionName(subscriptionName: String)

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
     * @param threshold (deprecated). 
     */
    public fun threshold(threshold: Number)

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
     */
    public fun thresholdExpression(thresholdExpression: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ce.CfnAnomalySubscription.Builder =
        software.amazon.awscdk.services.ce.CfnAnomalySubscription.Builder.create(scope, id)

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
    override fun frequency(frequency: String) {
      cdkBuilder.frequency(frequency)
    }

    /**
     * A list of cost anomaly monitors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-monitorarnlist)
     * @param monitorArnList A list of cost anomaly monitors. 
     */
    override fun monitorArnList(monitorArnList: List<String>) {
      cdkBuilder.monitorArnList(monitorArnList)
    }

    /**
     * A list of cost anomaly monitors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-monitorarnlist)
     * @param monitorArnList A list of cost anomaly monitors. 
     */
    override fun monitorArnList(vararg monitorArnList: String): Unit =
        monitorArnList(monitorArnList.toList())

    /**
     * Tags to assign to subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-resourcetags)
     * @param resourceTags Tags to assign to subscription. 
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    /**
     * Tags to assign to subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-resourcetags)
     * @param resourceTags Tags to assign to subscription. 
     */
    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    /**
     * Tags to assign to subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-resourcetags)
     * @param resourceTags Tags to assign to subscription. 
     */
    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    /**
     * A list of subscribers to notify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscribers)
     * @param subscribers A list of subscribers to notify. 
     */
    override fun subscribers(subscribers: IResolvable) {
      cdkBuilder.subscribers(subscribers.let(IResolvable::unwrap))
    }

    /**
     * A list of subscribers to notify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscribers)
     * @param subscribers A list of subscribers to notify. 
     */
    override fun subscribers(subscribers: List<Any>) {
      cdkBuilder.subscribers(subscribers)
    }

    /**
     * A list of subscribers to notify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscribers)
     * @param subscribers A list of subscribers to notify. 
     */
    override fun subscribers(vararg subscribers: Any): Unit = subscribers(subscribers.toList())

    /**
     * The name for the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html#cfn-ce-anomalysubscription-subscriptionname)
     * @param subscriptionName The name for the subscription. 
     */
    override fun subscriptionName(subscriptionName: String) {
      cdkBuilder.subscriptionName(subscriptionName)
    }

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
     * @param threshold (deprecated). 
     */
    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

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
     */
    override fun thresholdExpression(thresholdExpression: String) {
      cdkBuilder.thresholdExpression(thresholdExpression)
    }

    public fun build(): software.amazon.awscdk.services.ce.CfnAnomalySubscription =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ce.CfnAnomalySubscription.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAnomalySubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAnomalySubscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalySubscription):
        CfnAnomalySubscription = CfnAnomalySubscription(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalySubscription):
        software.amazon.awscdk.services.ce.CfnAnomalySubscription = wrapped.cdkObject
  }

  public interface ResourceTagProperty {
    /**
     * The key that's associated with the tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalysubscription-resourcetag.html#cfn-ce-anomalysubscription-resourcetag-key)
     */
    public fun key(): String

    /**
     * The value that's associated with the tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalysubscription-resourcetag.html#cfn-ce-anomalysubscription-resourcetag-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ResourceTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key that's associated with the tag. 
       */
      public fun key(key: String)

      /**
       * @param value The value that's associated with the tag. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty.Builder =
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty.builder()

      /**
       * @param key The key that's associated with the tag. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value that's associated with the tag. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty,
    ) : CdkObject(cdkObject), ResourceTagProperty {
      /**
       * The key that's associated with the tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalysubscription-resourcetag.html#cfn-ce-anomalysubscription-resourcetag-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value that's associated with the tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalysubscription-resourcetag.html#cfn-ce-anomalysubscription-resourcetag-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty):
          ResourceTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceTagProperty):
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty
    }
  }

  public interface SubscriberProperty {
    /**
     * The email address or SNS Topic Amazon Resource Name (ARN), depending on the `Type` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalysubscription-subscriber.html#cfn-ce-anomalysubscription-subscriber-address)
     */
    public fun address(): String

    /**
     * Indicates if the subscriber accepts the notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalysubscription-subscriber.html#cfn-ce-anomalysubscription-subscriber-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * The notification delivery channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalysubscription-subscriber.html#cfn-ce-anomalysubscription-subscriber-type)
     */
    public fun type(): String

    /**
     * A builder for [SubscriberProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The email address or SNS Topic Amazon Resource Name (ARN), depending on the
       * `Type` . 
       */
      public fun address(address: String)

      /**
       * @param status Indicates if the subscriber accepts the notifications.
       */
      public fun status(status: String)

      /**
       * @param type The notification delivery channel. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty.Builder =
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty.builder()

      /**
       * @param address The email address or SNS Topic Amazon Resource Name (ARN), depending on the
       * `Type` . 
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param status Indicates if the subscriber accepts the notifications.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param type The notification delivery channel. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty,
    ) : CdkObject(cdkObject), SubscriberProperty {
      /**
       * The email address or SNS Topic Amazon Resource Name (ARN), depending on the `Type` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalysubscription-subscriber.html#cfn-ce-anomalysubscription-subscriber-address)
       */
      override fun address(): String = unwrap(this).getAddress()

      /**
       * Indicates if the subscriber accepts the notifications.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalysubscription-subscriber.html#cfn-ce-anomalysubscription-subscriber-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * The notification delivery channel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalysubscription-subscriber.html#cfn-ce-anomalysubscription-subscriber-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriberProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty):
          SubscriberProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriberProperty):
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty
    }
  }
}
