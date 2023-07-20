@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

@CdkDslMarker
public class CfnImagePipelineSchedulePropertyDsl {
  private val cdkBuilder: CfnImagePipeline.ScheduleProperty.Builder =
      CfnImagePipeline.ScheduleProperty.builder()

  public fun pipelineExecutionStartCondition(pipelineExecutionStartCondition: String) {
    cdkBuilder.pipelineExecutionStartCondition(pipelineExecutionStartCondition)
  }

  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun build(): CfnImagePipeline.ScheduleProperty = cdkBuilder.build()
}
