@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconvert

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnQueue`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconvert.*;
 * Object tags;
 * CfnQueueProps cfnQueueProps = CfnQueueProps.builder()
 * .description("description")
 * .name("name")
 * .pricingPlan("pricingPlan")
 * .status("status")
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html)
 */
public interface CfnQueueProps {
  /**
   * Optional.
   *
   * A description of the queue that you are creating.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the queue that you are creating.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * When you use AWS CloudFormation , you can create only on-demand queues.
   *
   * Therefore, always set `PricingPlan` to the value "ON_DEMAND" when declaring an
   * AWS::MediaConvert::Queue in your AWS CloudFormation template.
   *
   * To create a reserved queue, use the AWS Elemental MediaConvert console at
   * https://console.aws.amazon.com/mediaconvert to set up a contract. For more information, see
   * [Working with AWS Elemental MediaConvert
   * Queues](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html) in the ** .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-pricingplan)
   */
  public fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  /**
   * Initial state of the queue.
   *
   * Queues can be either ACTIVE or PAUSED. If you create a paused queue, then jobs that you send to
   * that queue won't begin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnQueueProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Optional.
     * A description of the queue that you are creating.
     */
    public fun description(description: String)

    /**
     * @param name The name of the queue that you are creating.
     */
    public fun name(name: String)

    /**
     * @param pricingPlan When you use AWS CloudFormation , you can create only on-demand queues.
     * Therefore, always set `PricingPlan` to the value "ON_DEMAND" when declaring an
     * AWS::MediaConvert::Queue in your AWS CloudFormation template.
     *
     * To create a reserved queue, use the AWS Elemental MediaConvert console at
     * https://console.aws.amazon.com/mediaconvert to set up a contract. For more information, see
     * [Working with AWS Elemental MediaConvert
     * Queues](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html) in the ** .
     */
    public fun pricingPlan(pricingPlan: String)

    /**
     * @param status Initial state of the queue.
     * Queues can be either ACTIVE or PAUSED. If you create a paused queue, then jobs that you send
     * to that queue won't begin.
     */
    public fun status(status: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconvert.CfnQueueProps.Builder =
        software.amazon.awscdk.services.mediaconvert.CfnQueueProps.builder()

    /**
     * @param description Optional.
     * A description of the queue that you are creating.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the queue that you are creating.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param pricingPlan When you use AWS CloudFormation , you can create only on-demand queues.
     * Therefore, always set `PricingPlan` to the value "ON_DEMAND" when declaring an
     * AWS::MediaConvert::Queue in your AWS CloudFormation template.
     *
     * To create a reserved queue, use the AWS Elemental MediaConvert console at
     * https://console.aws.amazon.com/mediaconvert to set up a contract. For more information, see
     * [Working with AWS Elemental MediaConvert
     * Queues](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html) in the ** .
     */
    override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    /**
     * @param status Initial state of the queue.
     * Queues can be either ACTIVE or PAUSED. If you create a paused queue, then jobs that you send
     * to that queue won't begin.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.mediaconvert.CfnQueueProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediaconvert.CfnQueueProps,
  ) : CdkObject(cdkObject),
      CfnQueueProps {
    /**
     * Optional.
     *
     * A description of the queue that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the queue that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * When you use AWS CloudFormation , you can create only on-demand queues.
     *
     * Therefore, always set `PricingPlan` to the value "ON_DEMAND" when declaring an
     * AWS::MediaConvert::Queue in your AWS CloudFormation template.
     *
     * To create a reserved queue, use the AWS Elemental MediaConvert console at
     * https://console.aws.amazon.com/mediaconvert to set up a contract. For more information, see
     * [Working with AWS Elemental MediaConvert
     * Queues](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html) in the ** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-pricingplan)
     */
    override fun pricingPlan(): String? = unwrap(this).getPricingPlan()

    /**
     * Initial state of the queue.
     *
     * Queues can be either ACTIVE or PAUSED. If you create a paused queue, then jobs that you send
     * to that queue won't begin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnQueueProps):
        CfnQueueProps = CdkObjectWrappers.wrap(cdkObject) as? CfnQueueProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueueProps):
        software.amazon.awscdk.services.mediaconvert.CfnQueueProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconvert.CfnQueueProps
  }
}
