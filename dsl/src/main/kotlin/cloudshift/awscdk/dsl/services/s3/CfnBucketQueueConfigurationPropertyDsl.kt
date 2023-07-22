@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketQueueConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.QueueConfigurationProperty.Builder =
      CfnBucket.QueueConfigurationProperty.builder()

  /**
   * @param event The Amazon S3 bucket event about which you want to publish messages to Amazon SQS.
   * 
   * For more information, see [Supported Event
   * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon S3
   * User Guide* .
   */
  public fun event(event: String) {
    cdkBuilder.event(event)
  }

  /**
   * @param filter The filtering rules that determine which objects trigger notifications.
   * For example, you can create a filter so that Amazon S3 sends notifications only when image
   * files with a `.jpg` extension are added to the bucket. For more information, see [Configuring
   * event notifications using object key name
   * filtering](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/notification-how-to-filtering.html)
   * in the *Amazon S3 User Guide* .
   */
  public fun filter(filter: IResolvable) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param filter The filtering rules that determine which objects trigger notifications.
   * For example, you can create a filter so that Amazon S3 sends notifications only when image
   * files with a `.jpg` extension are added to the bucket. For more information, see [Configuring
   * event notifications using object key name
   * filtering](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/notification-how-to-filtering.html)
   * in the *Amazon S3 User Guide* .
   */
  public fun filter(filter: CfnBucket.NotificationFilterProperty) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param queue The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3
   * publishes a message when it detects events of the specified type. 
   * FIFO queues are not allowed when enabling an SQS queue as the event notification destination.
   */
  public fun queue(queue: String) {
    cdkBuilder.queue(queue)
  }

  public fun build(): CfnBucket.QueueConfigurationProperty = cdkBuilder.build()
}
