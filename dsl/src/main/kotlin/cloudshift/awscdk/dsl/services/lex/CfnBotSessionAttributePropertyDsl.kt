@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

/**
 * A key/value pair representing session-specific context information.
 *
 * It contains application information passed between Amazon Lex V2 and a client application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SessionAttributeProperty sessionAttributeProperty = SessionAttributeProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sessionattribute.html)
 */
@CdkDslMarker
public class CfnBotSessionAttributePropertyDsl {
  private val cdkBuilder: CfnBot.SessionAttributeProperty.Builder =
      CfnBot.SessionAttributeProperty.builder()

  /**
   * @param key The name of the session attribute. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The session-specific context information for the session attribute.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnBot.SessionAttributeProperty = cdkBuilder.build()
}
