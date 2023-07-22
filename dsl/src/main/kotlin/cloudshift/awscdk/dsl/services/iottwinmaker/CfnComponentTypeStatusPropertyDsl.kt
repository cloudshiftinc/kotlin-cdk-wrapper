@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

/**
 * The component type status.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * StatusProperty statusProperty = StatusProperty.builder()
 * .error(ErrorProperty.builder()
 * .code("code")
 * .message("message")
 * .build())
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-status.html)
 */
@CdkDslMarker
public class CfnComponentTypeStatusPropertyDsl {
  private val cdkBuilder: CfnComponentType.StatusProperty.Builder =
      CfnComponentType.StatusProperty.builder()

  /**
   * @param error The component type error.
   */
  public fun error(error: IResolvable) {
    cdkBuilder.error(error)
  }

  /**
   * @param error The component type error.
   */
  public fun error(error: CfnComponentType.ErrorProperty) {
    cdkBuilder.error(error)
  }

  /**
   * @param state The component type status state.
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun build(): CfnComponentType.StatusProperty = cdkBuilder.build()
}
