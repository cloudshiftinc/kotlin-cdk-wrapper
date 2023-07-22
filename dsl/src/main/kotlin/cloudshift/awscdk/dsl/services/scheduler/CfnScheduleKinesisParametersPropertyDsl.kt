@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

@CdkDslMarker
public class CfnScheduleKinesisParametersPropertyDsl {
  private val cdkBuilder: CfnSchedule.KinesisParametersProperty.Builder =
      CfnSchedule.KinesisParametersProperty.builder()

  /**
   * @param partitionKey Specifies the shard to which EventBridge Scheduler sends the event. 
   * For more information, see [Amazon Kinesis Data Streams terminology and
   * concepts](https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html) in the *Amazon Kinesis
   * Streams Developer Guide* .
   */
  public fun partitionKey(partitionKey: String) {
    cdkBuilder.partitionKey(partitionKey)
  }

  public fun build(): CfnSchedule.KinesisParametersProperty = cdkBuilder.build()
}
