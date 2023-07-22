@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnStack

@CdkDslMarker
public class CfnStackUserSettingPropertyDsl {
  private val cdkBuilder: CfnStack.UserSettingProperty.Builder =
      CfnStack.UserSettingProperty.builder()

  /**
   * @param action The action that is enabled or disabled. 
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  /**
   * @param permission Indicates whether the action is enabled or disabled. 
   */
  public fun permission(permission: String) {
    cdkBuilder.permission(permission)
  }

  public fun build(): CfnStack.UserSettingProperty = cdkBuilder.build()
}
