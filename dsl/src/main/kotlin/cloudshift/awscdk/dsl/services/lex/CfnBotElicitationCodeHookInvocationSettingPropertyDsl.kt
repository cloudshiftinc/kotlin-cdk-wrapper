@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotElicitationCodeHookInvocationSettingPropertyDsl {
  private val cdkBuilder: CfnBot.ElicitationCodeHookInvocationSettingProperty.Builder =
      CfnBot.ElicitationCodeHookInvocationSettingProperty.builder()

  public fun enableCodeHookInvocation(enableCodeHookInvocation: Boolean) {
    cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation)
  }

  public fun enableCodeHookInvocation(enableCodeHookInvocation: IResolvable) {
    cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation)
  }

  public fun invocationLabel(invocationLabel: String) {
    cdkBuilder.invocationLabel(invocationLabel)
  }

  public fun build(): CfnBot.ElicitationCodeHookInvocationSettingProperty = cdkBuilder.build()
}
