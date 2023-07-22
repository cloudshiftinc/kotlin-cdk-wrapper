@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication

/**
 * Information about a rendering engine.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.robomaker.*;
 * RenderingEngineProperty renderingEngineProperty = RenderingEngineProperty.builder()
 * .name("name")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-renderingengine.html)
 */
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
