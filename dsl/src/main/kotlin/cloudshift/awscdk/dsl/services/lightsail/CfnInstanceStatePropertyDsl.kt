@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnInstance

@CdkDslMarker
public class CfnInstanceStatePropertyDsl {
  private val cdkBuilder: CfnInstance.StateProperty.Builder = CfnInstance.StateProperty.builder()

  /**
   * @param code The status code of the instance.
   */
  public fun code(code: Number) {
    cdkBuilder.code(code)
  }

  /**
   * @param name The state of the instance (for example, `running` or `pending` ).
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnInstance.StateProperty = cdkBuilder.build()
}
