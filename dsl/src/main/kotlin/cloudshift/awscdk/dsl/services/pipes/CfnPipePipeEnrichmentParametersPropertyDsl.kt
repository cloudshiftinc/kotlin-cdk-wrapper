@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeEnrichmentParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeEnrichmentParametersProperty.Builder =
      CfnPipe.PipeEnrichmentParametersProperty.builder()

  public fun httpParameters(httpParameters: IResolvable) {
    cdkBuilder.httpParameters(httpParameters)
  }

  public fun httpParameters(httpParameters: CfnPipe.PipeEnrichmentHttpParametersProperty) {
    cdkBuilder.httpParameters(httpParameters)
  }

  public fun inputTemplate(inputTemplate: String) {
    cdkBuilder.inputTemplate(inputTemplate)
  }

  public fun build(): CfnPipe.PipeEnrichmentParametersProperty = cdkBuilder.build()
}
