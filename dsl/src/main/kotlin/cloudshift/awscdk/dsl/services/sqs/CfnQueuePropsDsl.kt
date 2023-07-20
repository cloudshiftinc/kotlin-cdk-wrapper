@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sqs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sqs.CfnQueueProps

@CdkDslMarker
public class CfnQueuePropsDsl {
  private val cdkBuilder: CfnQueueProps.Builder = CfnQueueProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
    cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
  }

  public fun contentBasedDeduplication(contentBasedDeduplication: IResolvable) {
    cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
  }

  public fun deduplicationScope(deduplicationScope: String) {
    cdkBuilder.deduplicationScope(deduplicationScope)
  }

  public fun delaySeconds(delaySeconds: Number) {
    cdkBuilder.delaySeconds(delaySeconds)
  }

  public fun fifoQueue(fifoQueue: Boolean) {
    cdkBuilder.fifoQueue(fifoQueue)
  }

  public fun fifoQueue(fifoQueue: IResolvable) {
    cdkBuilder.fifoQueue(fifoQueue)
  }

  public fun fifoThroughputLimit(fifoThroughputLimit: String) {
    cdkBuilder.fifoThroughputLimit(fifoThroughputLimit)
  }

  public fun kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds: Number) {
    cdkBuilder.kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds)
  }

  public fun kmsMasterKeyId(kmsMasterKeyId: String) {
    cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
  }

  public fun maximumMessageSize(maximumMessageSize: Number) {
    cdkBuilder.maximumMessageSize(maximumMessageSize)
  }

  public fun messageRetentionPeriod(messageRetentionPeriod: Number) {
    cdkBuilder.messageRetentionPeriod(messageRetentionPeriod)
  }

  public fun queueName(queueName: String) {
    cdkBuilder.queueName(queueName)
  }

  public fun receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds: Number) {
    cdkBuilder.receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds)
  }

  public fun redriveAllowPolicy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.redriveAllowPolicy(builder.map)
  }

  public fun redriveAllowPolicy(redriveAllowPolicy: Any) {
    cdkBuilder.redriveAllowPolicy(redriveAllowPolicy)
  }

  public fun redrivePolicy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.redrivePolicy(builder.map)
  }

  public fun redrivePolicy(redrivePolicy: Any) {
    cdkBuilder.redrivePolicy(redrivePolicy)
  }

  public fun sqsManagedSseEnabled(sqsManagedSseEnabled: Boolean) {
    cdkBuilder.sqsManagedSseEnabled(sqsManagedSseEnabled)
  }

  public fun sqsManagedSseEnabled(sqsManagedSseEnabled: IResolvable) {
    cdkBuilder.sqsManagedSseEnabled(sqsManagedSseEnabled)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun visibilityTimeout(visibilityTimeout: Number) {
    cdkBuilder.visibilityTimeout(visibilityTimeout)
  }

  public fun build(): CfnQueueProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
