@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotDialogCodeHookSettingPropertyDsl {
  private val cdkBuilder: CfnBot.DialogCodeHookSettingProperty.Builder =
      CfnBot.DialogCodeHookSettingProperty.builder()

  /**
   * @param enabled Enables the dialog code hook so that it processes user requests. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Enables the dialog code hook so that it processes user requests. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnBot.DialogCodeHookSettingProperty = cdkBuilder.build()
}
