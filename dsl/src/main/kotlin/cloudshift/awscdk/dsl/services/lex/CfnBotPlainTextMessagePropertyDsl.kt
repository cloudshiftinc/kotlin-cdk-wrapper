@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotPlainTextMessagePropertyDsl {
  private val cdkBuilder: CfnBot.PlainTextMessageProperty.Builder =
      CfnBot.PlainTextMessageProperty.builder()

  /**
   * @param value The message to send to the user. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnBot.PlainTextMessageProperty = cdkBuilder.build()
}
