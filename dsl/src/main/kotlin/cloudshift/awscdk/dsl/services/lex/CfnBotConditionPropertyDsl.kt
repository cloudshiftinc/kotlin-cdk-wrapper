@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotConditionPropertyDsl {
  private val cdkBuilder: CfnBot.ConditionProperty.Builder = CfnBot.ConditionProperty.builder()

  /**
   * @param expressionString The expression string that is evaluated. 
   */
  public fun expressionString(expressionString: String) {
    cdkBuilder.expressionString(expressionString)
  }

  public fun build(): CfnBot.ConditionProperty = cdkBuilder.build()
}
