@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconvert

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconvert.CfnQueue
import software.constructs.Construct

@CdkDslMarker
public class CfnQueueDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnQueue.Builder = CfnQueue.Builder.create(scope, id)

  /**
   * Optional.
   *
   * A description of the queue that you are creating.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-description)
   * @param description Optional. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the queue that you are creating.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-name)
   * @param name The name of the queue that you are creating. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

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
   * @param pricingPlan When you use AWS CloudFormation , you can create only on-demand queues. 
   */
  public fun pricingPlan(pricingPlan: String) {
    cdkBuilder.pricingPlan(pricingPlan)
  }

  /**
   * Initial state of the queue.
   *
   * Queues can be either ACTIVE or PAUSED. If you create a paused queue, then jobs that you send to
   * that queue won't begin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-status)
   * @param status Initial state of the queue. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html#cfn-mediaconvert-queue-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnQueue = cdkBuilder.build()
}
