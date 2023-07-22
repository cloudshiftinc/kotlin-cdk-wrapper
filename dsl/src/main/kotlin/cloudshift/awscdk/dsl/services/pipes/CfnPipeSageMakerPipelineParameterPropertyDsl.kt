@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeSageMakerPipelineParameterPropertyDsl {
  private val cdkBuilder: CfnPipe.SageMakerPipelineParameterProperty.Builder =
      CfnPipe.SageMakerPipelineParameterProperty.builder()

  /**
   * @param name Name of parameter to start execution of a SageMaker Model Building Pipeline. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value Value of parameter to start execution of a SageMaker Model Building Pipeline. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnPipe.SageMakerPipelineParameterProperty = cdkBuilder.build()
}
