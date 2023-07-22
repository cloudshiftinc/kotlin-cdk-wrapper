@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication

@CdkDslMarker
public class CfnSimulationApplicationSimulationSoftwareSuitePropertyDsl {
  private val cdkBuilder: CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder =
      CfnSimulationApplication.SimulationSoftwareSuiteProperty.builder()

  /**
   * @param name The name of the simulation software suite. 
   * `SimulationRuntime` is the only supported value.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param version The version of the simulation software suite.
   * Not applicable for `SimulationRuntime` .
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnSimulationApplication.SimulationSoftwareSuiteProperty = cdkBuilder.build()
}
