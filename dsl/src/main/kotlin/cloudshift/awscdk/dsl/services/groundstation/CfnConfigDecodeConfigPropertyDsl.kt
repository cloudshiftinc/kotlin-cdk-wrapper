@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigDecodeConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.DecodeConfigProperty.Builder =
      CfnConfig.DecodeConfigProperty.builder()

  public fun unvalidatedJson(unvalidatedJson: String) {
    cdkBuilder.unvalidatedJson(unvalidatedJson)
  }

  public fun build(): CfnConfig.DecodeConfigProperty = cdkBuilder.build()
}
