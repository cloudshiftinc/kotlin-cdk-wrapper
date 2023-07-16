@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotCustomPayloadPropertyDsl {
  private val cdkBuilder: CfnBot.CustomPayloadProperty.Builder =
      CfnBot.CustomPayloadProperty.builder()

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnBot.CustomPayloadProperty = cdkBuilder.build()
}
