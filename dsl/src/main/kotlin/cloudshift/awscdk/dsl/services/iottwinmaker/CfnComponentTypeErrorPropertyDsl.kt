@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

@CdkDslMarker
public class CfnComponentTypeErrorPropertyDsl {
  private val cdkBuilder: CfnComponentType.ErrorProperty.Builder =
      CfnComponentType.ErrorProperty.builder()

  /**
   * @param code The component type error code.
   */
  public fun code(code: String) {
    cdkBuilder.code(code)
  }

  /**
   * @param message The component type error message.
   */
  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  public fun build(): CfnComponentType.ErrorProperty = cdkBuilder.build()
}
