@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotAlias

@CdkDslMarker
public class CfnBotAliasCodeHookSpecificationPropertyDsl {
  private val cdkBuilder: CfnBotAlias.CodeHookSpecificationProperty.Builder =
      CfnBotAlias.CodeHookSpecificationProperty.builder()

  public fun lambdaCodeHook(lambdaCodeHook: IResolvable) {
    cdkBuilder.lambdaCodeHook(lambdaCodeHook)
  }

  public fun lambdaCodeHook(lambdaCodeHook: CfnBotAlias.LambdaCodeHookProperty) {
    cdkBuilder.lambdaCodeHook(lambdaCodeHook)
  }

  public fun build(): CfnBotAlias.CodeHookSpecificationProperty = cdkBuilder.build()
}
