@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination

@CdkDslMarker
public class CfnConfigurationSetEventDestinationEventDestinationPropertyDsl {
  private val cdkBuilder: CfnConfigurationSetEventDestination.EventDestinationProperty.Builder =
      CfnConfigurationSetEventDestination.EventDestinationProperty.builder()

  private val _matchingEventTypes: MutableList<String> = mutableListOf()

  /**
   * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination for email
   * events.
   * You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
   */
  public fun cloudWatchDestination(cloudWatchDestination: IResolvable) {
    cdkBuilder.cloudWatchDestination(cloudWatchDestination)
  }

  /**
   * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination for email
   * events.
   * You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
   */
  public
      fun cloudWatchDestination(cloudWatchDestination: CfnConfigurationSetEventDestination.CloudWatchDestinationProperty) {
    cdkBuilder.cloudWatchDestination(cloudWatchDestination)
  }

  /**
   * @param enabled If `true` , the event destination is enabled.
   * When the event destination is enabled, the specified event types are sent to the destinations
   * in this `EventDestinationDefinition` .
   *
   * If `false` , the event destination is disabled. When the event destination is disabled, events
   * aren't sent to the specified destinations.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled If `true` , the event destination is enabled.
   * When the event destination is enabled, the specified event types are sent to the destinations
   * in this `EventDestinationDefinition` .
   *
   * If `false` , the event destination is disabled. When the event destination is disabled, events
   * aren't sent to the specified destinations.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param kinesisFirehoseDestination An object that defines an Amazon Kinesis Data Firehose
   * destination for email events.
   * You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3
   * and Amazon Redshift.
   */
  public fun kinesisFirehoseDestination(kinesisFirehoseDestination: IResolvable) {
    cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination)
  }

  /**
   * @param kinesisFirehoseDestination An object that defines an Amazon Kinesis Data Firehose
   * destination for email events.
   * You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3
   * and Amazon Redshift.
   */
  public
      fun kinesisFirehoseDestination(kinesisFirehoseDestination: CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty) {
    cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination)
  }

  /**
   * @param matchingEventTypes The types of events that Amazon Pinpoint sends to the specified event
   * destinations. 
   * Acceptable values: `SEND` , `REJECT` , `BOUNCE` , `COMPLAINT` , `DELIVERY` , `OPEN` , `CLICK` ,
   * and `RENDERING_FAILURE` .
   */
  public fun matchingEventTypes(vararg matchingEventTypes: String) {
    _matchingEventTypes.addAll(listOf(*matchingEventTypes))
  }

  /**
   * @param matchingEventTypes The types of events that Amazon Pinpoint sends to the specified event
   * destinations. 
   * Acceptable values: `SEND` , `REJECT` , `BOUNCE` , `COMPLAINT` , `DELIVERY` , `OPEN` , `CLICK` ,
   * and `RENDERING_FAILURE` .
   */
  public fun matchingEventTypes(matchingEventTypes: Collection<String>) {
    _matchingEventTypes.addAll(matchingEventTypes)
  }

  /**
   * @param pinpointDestination An object that defines a Amazon Pinpoint destination for email
   * events.
   * You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects. You can
   * use these attributes to create segments for your campaigns.
   */
  public fun pinpointDestination(pinpointDestination: IResolvable) {
    cdkBuilder.pinpointDestination(pinpointDestination)
  }

  /**
   * @param pinpointDestination An object that defines a Amazon Pinpoint destination for email
   * events.
   * You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects. You can
   * use these attributes to create segments for your campaigns.
   */
  public
      fun pinpointDestination(pinpointDestination: CfnConfigurationSetEventDestination.PinpointDestinationProperty) {
    cdkBuilder.pinpointDestination(pinpointDestination)
  }

  /**
   * @param snsDestination An object that defines an Amazon SNS destination for email events.
   * You can use Amazon SNS to send notification when certain email events occur.
   */
  public fun snsDestination(snsDestination: IResolvable) {
    cdkBuilder.snsDestination(snsDestination)
  }

  /**
   * @param snsDestination An object that defines an Amazon SNS destination for email events.
   * You can use Amazon SNS to send notification when certain email events occur.
   */
  public
      fun snsDestination(snsDestination: CfnConfigurationSetEventDestination.SnsDestinationProperty) {
    cdkBuilder.snsDestination(snsDestination)
  }

  public fun build(): CfnConfigurationSetEventDestination.EventDestinationProperty {
    if(_matchingEventTypes.isNotEmpty()) cdkBuilder.matchingEventTypes(_matchingEventTypes)
    return cdkBuilder.build()
  }
}
