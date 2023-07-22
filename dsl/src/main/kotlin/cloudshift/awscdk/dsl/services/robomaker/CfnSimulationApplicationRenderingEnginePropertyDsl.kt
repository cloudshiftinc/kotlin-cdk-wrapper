@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication

@CdkDslMarker
public class CfnSimulationApplicationRenderingEnginePropertyDsl {
  private val cdkBuilder: CfnSimulationApplication.RenderingEngineProperty.Builder =
      CfnSimulationApplication.RenderingEngineProperty.builder()

  /**
   * @param name The name of the rendering engine. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param version The version of the rendering engine. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnSimulationApplication.RenderingEngineProperty = cdkBuilder.build()
}
