@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolRecoveryOptionPropertyDsl {
  private val cdkBuilder: CfnUserPool.RecoveryOptionProperty.Builder =
      CfnUserPool.RecoveryOptionProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): CfnUserPool.RecoveryOptionProperty = cdkBuilder.build()
}
