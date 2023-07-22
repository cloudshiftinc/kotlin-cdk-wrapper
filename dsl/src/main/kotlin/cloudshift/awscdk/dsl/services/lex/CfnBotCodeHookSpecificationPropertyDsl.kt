@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotCodeHookSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.CodeHookSpecificationProperty.Builder =
      CfnBot.CodeHookSpecificationProperty.builder()

  /**
   * @param lambdaCodeHook Specifies a Lambda function that verifies requests to a bot or fulfills
   * the user's request to a bot. 
   */
  public fun lambdaCodeHook(lambdaCodeHook: IResolvable) {
    cdkBuilder.lambdaCodeHook(lambdaCodeHook)
  }

  /**
   * @param lambdaCodeHook Specifies a Lambda function that verifies requests to a bot or fulfills
   * the user's request to a bot. 
   */
  public fun lambdaCodeHook(lambdaCodeHook: CfnBot.LambdaCodeHookProperty) {
    cdkBuilder.lambdaCodeHook(lambdaCodeHook)
  }

  public fun build(): CfnBot.CodeHookSpecificationProperty = cdkBuilder.build()
}
