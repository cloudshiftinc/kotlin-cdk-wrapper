@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.globalaccelerator.AcceleratorProps

@CdkDslMarker
public class AcceleratorPropsDsl {
  private val cdkBuilder: AcceleratorProps.Builder = AcceleratorProps.builder()

  /**
   * @param acceleratorName The name of the accelerator.
   */
  public fun acceleratorName(acceleratorName: String) {
    cdkBuilder.acceleratorName(acceleratorName)
  }

  /**
   * @param enabled Indicates whether the accelerator is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): AcceleratorProps = cdkBuilder.build()
}
