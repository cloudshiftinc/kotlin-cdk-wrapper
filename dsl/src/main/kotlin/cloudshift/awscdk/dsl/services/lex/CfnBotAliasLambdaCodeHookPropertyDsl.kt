@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBotAlias

@CdkDslMarker
public class CfnBotAliasLambdaCodeHookPropertyDsl {
  private val cdkBuilder: CfnBotAlias.LambdaCodeHookProperty.Builder =
      CfnBotAlias.LambdaCodeHookProperty.builder()

  /**
   * @param codeHookInterfaceVersion The version of the request-response that you want Amazon Lex to
   * use to invoke your Lambda function. 
   */
  public fun codeHookInterfaceVersion(codeHookInterfaceVersion: String) {
    cdkBuilder.codeHookInterfaceVersion(codeHookInterfaceVersion)
  }

  /**
   * @param lambdaArn The Amazon Resource Name (ARN) of the Lambda function. 
   */
  public fun lambdaArn(lambdaArn: String) {
    cdkBuilder.lambdaArn(lambdaArn)
  }

  public fun build(): CfnBotAlias.LambdaCodeHookProperty = cdkBuilder.build()
}
