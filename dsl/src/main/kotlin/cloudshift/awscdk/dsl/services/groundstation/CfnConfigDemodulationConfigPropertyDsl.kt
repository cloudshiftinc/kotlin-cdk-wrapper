@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigDemodulationConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.DemodulationConfigProperty.Builder =
      CfnConfig.DemodulationConfigProperty.builder()

  public fun unvalidatedJson(unvalidatedJson: String) {
    cdkBuilder.unvalidatedJson(unvalidatedJson)
  }

  public fun build(): CfnConfig.DemodulationConfigProperty = cdkBuilder.build()
}
