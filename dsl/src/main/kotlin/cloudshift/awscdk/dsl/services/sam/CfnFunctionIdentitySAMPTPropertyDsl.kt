@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionIdentitySAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.IdentitySAMPTProperty.Builder =
      CfnFunction.IdentitySAMPTProperty.builder()

  public fun identityName(identityName: String) {
    cdkBuilder.identityName(identityName)
  }

  public fun build(): CfnFunction.IdentitySAMPTProperty = cdkBuilder.build()
}
