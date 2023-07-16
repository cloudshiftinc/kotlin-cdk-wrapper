@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotButtonPropertyDsl {
  private val cdkBuilder: CfnBot.ButtonProperty.Builder = CfnBot.ButtonProperty.builder()

  public fun text(text: String) {
    cdkBuilder.text(text)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnBot.ButtonProperty = cdkBuilder.build()
}
