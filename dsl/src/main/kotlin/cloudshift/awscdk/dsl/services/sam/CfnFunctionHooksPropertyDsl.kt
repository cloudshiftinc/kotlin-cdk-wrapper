@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionHooksPropertyDsl {
  private val cdkBuilder: CfnFunction.HooksProperty.Builder = CfnFunction.HooksProperty.builder()

  /**
   * @param postTraffic the value to be set.
   */
  public fun postTraffic(postTraffic: String) {
    cdkBuilder.postTraffic(postTraffic)
  }

  /**
   * @param preTraffic the value to be set.
   */
  public fun preTraffic(preTraffic: String) {
    cdkBuilder.preTraffic(preTraffic)
  }

  public fun build(): CfnFunction.HooksProperty = cdkBuilder.build()
}
