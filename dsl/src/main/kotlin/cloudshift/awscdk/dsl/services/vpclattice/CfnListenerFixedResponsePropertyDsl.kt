@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.vpclattice.CfnListener

@CdkDslMarker
public class CfnListenerFixedResponsePropertyDsl {
  private val cdkBuilder: CfnListener.FixedResponseProperty.Builder =
      CfnListener.FixedResponseProperty.builder()

  public fun statusCode(statusCode: Number) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun build(): CfnListener.FixedResponseProperty = cdkBuilder.build()
}
