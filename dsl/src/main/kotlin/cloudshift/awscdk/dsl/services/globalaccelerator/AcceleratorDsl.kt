@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.globalaccelerator.Accelerator
import software.constructs.Construct

@CdkDslMarker
public class AcceleratorDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Accelerator.Builder = Accelerator.Builder.create(scope, id)

  /**
   * The name of the accelerator.
   *
   * Default: - resource ID
   *
   * @param acceleratorName The name of the accelerator. 
   */
  public fun acceleratorName(acceleratorName: String) {
    cdkBuilder.acceleratorName(acceleratorName)
  }

  /**
   * Indicates whether the accelerator is enabled.
   *
   * Default: true
   *
   * @param enabled Indicates whether the accelerator is enabled. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): Accelerator = cdkBuilder.build()
}
