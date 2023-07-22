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

  /**
   * @param name Specifies the recovery method for a user.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param priority A positive integer specifying priority of a method with 1 being the highest
   * priority.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): CfnUserPool.RecoveryOptionProperty = cdkBuilder.build()
}
