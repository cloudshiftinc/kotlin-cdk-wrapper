@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnPipeline

@CdkDslMarker
public class CfnPipelinePipelineDefinitionPropertyDsl {
  private val cdkBuilder: CfnPipeline.PipelineDefinitionProperty.Builder =
      CfnPipeline.PipelineDefinitionProperty.builder()

  public fun pipelineDefinitionBody(pipelineDefinitionBody: String) {
    cdkBuilder.pipelineDefinitionBody(pipelineDefinitionBody)
  }

  public fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: IResolvable) {
    cdkBuilder.pipelineDefinitionS3Location(pipelineDefinitionS3Location)
  }

  public
      fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: CfnPipeline.S3LocationProperty) {
    cdkBuilder.pipelineDefinitionS3Location(pipelineDefinitionS3Location)
  }

  public fun build(): CfnPipeline.PipelineDefinitionProperty = cdkBuilder.build()
}
