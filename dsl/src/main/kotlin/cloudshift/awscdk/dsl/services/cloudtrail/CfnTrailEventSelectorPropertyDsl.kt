@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudtrail.CfnTrail

/**
 * Use event selectors to further specify the management and data event settings for your trail.
 *
 * By default, trails created without specific event selectors will be configured to log all read
 * and write management events, and no data events. When an event occurs in your account, CloudTrail
 * evaluates the event selector for all trails. For each trail, if the event matches any event
 * selector, the trail processes and logs the event. If the event doesn't match any event selector, the
 * trail doesn't log the event.
 *
 * You can configure up to five event selectors for a trail.
 *
 * You cannot apply both event selectors and advanced event selectors to a trail.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudtrail.*;
 * EventSelectorProperty eventSelectorProperty = EventSelectorProperty.builder()
 * .dataResources(List.of(DataResourceProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .values(List.of("values"))
 * .build()))
 * .excludeManagementEventSources(List.of("excludeManagementEventSources"))
 * .includeManagementEvents(false)
 * .readWriteType("readWriteType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html)
 */
@CdkDslMarker
public class CfnTrailEventSelectorPropertyDsl {
  private val cdkBuilder: CfnTrail.EventSelectorProperty.Builder =
      CfnTrail.EventSelectorProperty.builder()

  private val _dataResources: MutableList<Any> = mutableListOf()

  private val _excludeManagementEventSources: MutableList<String> = mutableListOf()

  /**
   * @param dataResources In AWS CloudFormation , CloudTrail supports data event logging for Amazon
   * S3 objects, Amazon DynamoDB tables, and AWS Lambda functions.
   * Currently, advanced event selectors for data events are not supported in AWS CloudFormation
   * templates. You can specify up to 250 resources for an individual event selector, but the total
   * number of data resources cannot exceed 250 across all event selectors in a trail. This limit does
   * not apply if you configure resource logging for all data events.
   *
   * For more information, see [Logging data
   * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
   * and [Limits in AWS
   * CloudTrail](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html)
   * in the *AWS CloudTrail User Guide* .
   */
  public fun dataResources(vararg dataResources: Any) {
    _dataResources.addAll(listOf(*dataResources))
  }

  /**
   * @param dataResources In AWS CloudFormation , CloudTrail supports data event logging for Amazon
   * S3 objects, Amazon DynamoDB tables, and AWS Lambda functions.
   * Currently, advanced event selectors for data events are not supported in AWS CloudFormation
   * templates. You can specify up to 250 resources for an individual event selector, but the total
   * number of data resources cannot exceed 250 across all event selectors in a trail. This limit does
   * not apply if you configure resource logging for all data events.
   *
   * For more information, see [Logging data
   * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
   * and [Limits in AWS
   * CloudTrail](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html)
   * in the *AWS CloudTrail User Guide* .
   */
  public fun dataResources(dataResources: Collection<Any>) {
    _dataResources.addAll(dataResources)
  }

  /**
   * @param dataResources In AWS CloudFormation , CloudTrail supports data event logging for Amazon
   * S3 objects, Amazon DynamoDB tables, and AWS Lambda functions.
   * Currently, advanced event selectors for data events are not supported in AWS CloudFormation
   * templates. You can specify up to 250 resources for an individual event selector, but the total
   * number of data resources cannot exceed 250 across all event selectors in a trail. This limit does
   * not apply if you configure resource logging for all data events.
   *
   * For more information, see [Logging data
   * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
   * and [Limits in AWS
   * CloudTrail](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html)
   * in the *AWS CloudTrail User Guide* .
   */
  public fun dataResources(dataResources: IResolvable) {
    cdkBuilder.dataResources(dataResources)
  }

  /**
   * @param excludeManagementEventSources An optional list of service event sources from which you
   * do not want management events to be logged on your trail.
   * In this release, the list can be empty (disables the filter), or it can filter out AWS Key
   * Management Service or Amazon RDS Data API events by containing `kms.amazonaws.com` or
   * `rdsdata.amazonaws.com` . By default, `ExcludeManagementEventSources` is empty, and AWS KMS and
   * Amazon RDS Data API events are logged to your trail. You can exclude management event sources only
   * in Regions that support the event source.
   */
  public fun excludeManagementEventSources(vararg excludeManagementEventSources: String) {
    _excludeManagementEventSources.addAll(listOf(*excludeManagementEventSources))
  }

  /**
   * @param excludeManagementEventSources An optional list of service event sources from which you
   * do not want management events to be logged on your trail.
   * In this release, the list can be empty (disables the filter), or it can filter out AWS Key
   * Management Service or Amazon RDS Data API events by containing `kms.amazonaws.com` or
   * `rdsdata.amazonaws.com` . By default, `ExcludeManagementEventSources` is empty, and AWS KMS and
   * Amazon RDS Data API events are logged to your trail. You can exclude management event sources only
   * in Regions that support the event source.
   */
  public fun excludeManagementEventSources(excludeManagementEventSources: Collection<String>) {
    _excludeManagementEventSources.addAll(excludeManagementEventSources)
  }

  /**
   * @param includeManagementEvents Specify if you want your event selector to include management
   * events for your trail.
   * For more information, see [Management
   * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html)
   * in the *AWS CloudTrail User Guide* .
   *
   * By default, the value is `true` .
   *
   * The first copy of management events is free. You are charged for additional copies of
   * management events that you are logging on any subsequent trail in the same Region. For more
   * information about CloudTrail pricing, see [AWS CloudTrail
   * Pricing](https://docs.aws.amazon.com/cloudtrail/pricing/) .
   */
  public fun includeManagementEvents(includeManagementEvents: Boolean) {
    cdkBuilder.includeManagementEvents(includeManagementEvents)
  }

  /**
   * @param includeManagementEvents Specify if you want your event selector to include management
   * events for your trail.
   * For more information, see [Management
   * Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html)
   * in the *AWS CloudTrail User Guide* .
   *
   * By default, the value is `true` .
   *
   * The first copy of management events is free. You are charged for additional copies of
   * management events that you are logging on any subsequent trail in the same Region. For more
   * information about CloudTrail pricing, see [AWS CloudTrail
   * Pricing](https://docs.aws.amazon.com/cloudtrail/pricing/) .
   */
  public fun includeManagementEvents(includeManagementEvents: IResolvable) {
    cdkBuilder.includeManagementEvents(includeManagementEvents)
  }

  /**
   * @param readWriteType Specify if you want your trail to log read-only events, write-only events,
   * or all.
   * For example, the EC2 `GetConsoleOutput` is a read-only API operation and `RunInstances` is a
   * write-only API operation.
   *
   * By default, the value is `All` .
   */
  public fun readWriteType(readWriteType: String) {
    cdkBuilder.readWriteType(readWriteType)
  }

  public fun build(): CfnTrail.EventSelectorProperty {
    if(_dataResources.isNotEmpty()) cdkBuilder.dataResources(_dataResources)
    if(_excludeManagementEventSources.isNotEmpty())
        cdkBuilder.excludeManagementEventSources(_excludeManagementEventSources)
    return cdkBuilder.build()
  }
}
