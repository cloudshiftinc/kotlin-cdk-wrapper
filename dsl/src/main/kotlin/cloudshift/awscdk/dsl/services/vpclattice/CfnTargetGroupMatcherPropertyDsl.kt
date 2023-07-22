@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

@CdkDslMarker
public class CfnTargetGroupMatcherPropertyDsl {
  private val cdkBuilder: CfnTargetGroup.MatcherProperty.Builder =
      CfnTargetGroup.MatcherProperty.builder()

  /**
   * @param httpCode The HTTP code to use when checking for a successful response from a target. 
   */
  public fun httpCode(httpCode: String) {
    cdkBuilder.httpCode(httpCode)
  }

  public fun build(): CfnTargetGroup.MatcherProperty = cdkBuilder.build()
}
