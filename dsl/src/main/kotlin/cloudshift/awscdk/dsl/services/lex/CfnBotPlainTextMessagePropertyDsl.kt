@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Defines an ASCII text message to send to the user.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * PlainTextMessageProperty plainTextMessageProperty = PlainTextMessageProperty.builder()
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-plaintextmessage.html)
 */
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
