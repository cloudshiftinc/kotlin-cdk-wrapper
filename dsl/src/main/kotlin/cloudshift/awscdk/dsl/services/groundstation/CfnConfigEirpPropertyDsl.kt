@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigEirpPropertyDsl {
  private val cdkBuilder: CfnConfig.EirpProperty.Builder = CfnConfig.EirpProperty.builder()

  /**
   * @param units The units of the EIRP.
   */
  public fun units(units: String) {
    cdkBuilder.units(units)
  }

  /**
   * @param value The value of the EIRP.
   * Valid values are between 20.0 to 50.0 dBW.
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnConfig.EirpProperty = cdkBuilder.build()
}
