@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSSMLMessagePropertyDsl {
  private val cdkBuilder: CfnBot.SSMLMessageProperty.Builder = CfnBot.SSMLMessageProperty.builder()

  /**
   * @param value The SSML text that defines the prompt. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnBot.SSMLMessageProperty = cdkBuilder.build()
}
