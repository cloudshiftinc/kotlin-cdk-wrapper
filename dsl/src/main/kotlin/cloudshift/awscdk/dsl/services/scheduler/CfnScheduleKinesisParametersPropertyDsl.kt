@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

@CdkDslMarker
public class CfnScheduleKinesisParametersPropertyDsl {
  private val cdkBuilder: CfnSchedule.KinesisParametersProperty.Builder =
      CfnSchedule.KinesisParametersProperty.builder()

  public fun partitionKey(partitionKey: String) {
    cdkBuilder.partitionKey(partitionKey)
  }

  public fun build(): CfnSchedule.KinesisParametersProperty = cdkBuilder.build()
}
