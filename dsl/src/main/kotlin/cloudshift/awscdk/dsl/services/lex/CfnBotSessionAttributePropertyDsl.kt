@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

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
