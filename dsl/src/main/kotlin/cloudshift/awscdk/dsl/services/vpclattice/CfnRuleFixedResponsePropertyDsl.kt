@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.vpclattice.CfnRule

@CdkDslMarker
public class CfnRuleFixedResponsePropertyDsl {
  private val cdkBuilder: CfnRule.FixedResponseProperty.Builder =
      CfnRule.FixedResponseProperty.builder()

  /**
   * @param statusCode The HTTP response code. 
   */
  public fun statusCode(statusCode: Number) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun build(): CfnRule.FixedResponseProperty = cdkBuilder.build()
}
