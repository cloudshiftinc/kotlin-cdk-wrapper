@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.amazon.awscdk.services.cloudtrail.DataResourceType
import software.amazon.awscdk.services.cloudtrail.S3EventSelector
import software.amazon.awscdk.services.cloudtrail.Trail
import software.amazon.awscdk.services.lambda.IFunction

/**
 * When an event occurs in your account, CloudTrail evaluates whether the event matches the settings
 * for your trails.
 *
 * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
 * CloudWatch Logs log group.
 *
 * This method adds an Event Selector for filtering events that match either S3 or Lambda function
 * operations.
 *
 * Data events: These events provide insight into the resource operations performed on or within a
 * resource.
 * These are also known as data plane operations.
 *
 * @param dataResourceType 
 * @param dataResourceValues the list of data resource ARNs to include in logging (maximum 250
 * entries). 
 * @param options the options to configure logging of management and data events.
 */
public inline fun Trail.addEventSelector(
  dataResourceType: DataResourceType,
  dataResourceValues: List<String>,
  block: AddEventSelectorOptionsDsl.() -> Unit = {},
) {
  val builder = AddEventSelectorOptionsDsl()
  builder.apply(block)
  return addEventSelector(dataResourceType, dataResourceValues, builder.build())
}

/**
 * When an event occurs in your account, CloudTrail evaluates whether the event matches the settings
 * for your trails.
 *
 * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
 * CloudWatch Logs log group.
 *
 * This method adds a Lambda Data Event Selector for filtering events that match Lambda function
 * operations.
 *
 * Data events: These events provide insight into the resource operations performed on or within a
 * resource.
 * These are also known as data plane operations.
 *
 * @param handlers the list of lambda function handlers whose data events should be logged (maximum
 * 250 entries). 
 * @param options the options to configure logging of management and data events.
 */
public inline fun Trail.addLambdaEventSelector(handlers: List<IFunction>,
    block: AddEventSelectorOptionsDsl.() -> Unit = {}) {
  val builder = AddEventSelectorOptionsDsl()
  builder.apply(block)
  return addLambdaEventSelector(handlers, builder.build())
}

/**
 * When an event occurs in your account, CloudTrail evaluates whether the event matches the settings
 * for your trails.
 *
 * Only events that match your trail settings are delivered to your Amazon S3 bucket and Amazon
 * CloudWatch Logs log group.
 *
 * This method adds an S3 Data Event Selector for filtering events that match S3 operations.
 *
 * Data events: These events provide insight into the resource operations performed on or within a
 * resource.
 * These are also known as data plane operations.
 *
 * @param s3Selector the list of S3 bucket with optional prefix to include in logging (maximum 250
 * entries). 
 * @param options the options to configure logging of management and data events.
 */
public inline fun Trail.addS3EventSelector(s3Selector: List<S3EventSelector>,
    block: AddEventSelectorOptionsDsl.() -> Unit = {}) {
  val builder = AddEventSelectorOptionsDsl()
  builder.apply(block)
  return addS3EventSelector(s3Selector, builder.build())
}

/**
 * Log all Lambda data events for all lambda functions the account.
 *
 * Default: false
 *
 * [Documentation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
 * @param options
 */
public inline fun Trail.logAllLambdaDataEvents(block: AddEventSelectorOptionsDsl.() -> Unit = {}) {
  val builder = AddEventSelectorOptionsDsl()
  builder.apply(block)
  return logAllLambdaDataEvents(builder.build())
}

/**
 * Log all S3 data events for all objects for all buckets in the account.
 *
 * Default: false
 *
 * [Documentation](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html)
 * @param options
 */
public inline fun Trail.logAllS3DataEvents(block: AddEventSelectorOptionsDsl.() -> Unit = {}) {
  val builder = AddEventSelectorOptionsDsl()
  builder.apply(block)
  return logAllS3DataEvents(builder.build())
}
