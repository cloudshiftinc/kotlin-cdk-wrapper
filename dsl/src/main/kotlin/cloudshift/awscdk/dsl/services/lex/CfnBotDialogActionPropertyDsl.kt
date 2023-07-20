@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotDialogActionPropertyDsl {
  private val cdkBuilder: CfnBot.DialogActionProperty.Builder =
      CfnBot.DialogActionProperty.builder()

  public fun slotToElicit(slotToElicit: String) {
    cdkBuilder.slotToElicit(slotToElicit)
  }

  public fun suppressNextMessage(suppressNextMessage: Boolean) {
    cdkBuilder.suppressNextMessage(suppressNextMessage)
  }

  public fun suppressNextMessage(suppressNextMessage: IResolvable) {
    cdkBuilder.suppressNextMessage(suppressNextMessage)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnBot.DialogActionProperty = cdkBuilder.build()
}
