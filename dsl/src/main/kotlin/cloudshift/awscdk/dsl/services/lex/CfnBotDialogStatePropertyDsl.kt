@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotDialogStatePropertyDsl {
  private val cdkBuilder: CfnBot.DialogStateProperty.Builder = CfnBot.DialogStateProperty.builder()

  private val _sessionAttributes: MutableList<Any> = mutableListOf()

  public fun dialogAction(dialogAction: IResolvable) {
    cdkBuilder.dialogAction(dialogAction)
  }

  public fun dialogAction(dialogAction: CfnBot.DialogActionProperty) {
    cdkBuilder.dialogAction(dialogAction)
  }

  public fun intent(intent: IResolvable) {
    cdkBuilder.intent(intent)
  }

  public fun intent(intent: CfnBot.IntentOverrideProperty) {
    cdkBuilder.intent(intent)
  }

  public fun sessionAttributes(vararg sessionAttributes: Any) {
    _sessionAttributes.addAll(listOf(*sessionAttributes))
  }

  public fun sessionAttributes(sessionAttributes: Collection<Any>) {
    _sessionAttributes.addAll(sessionAttributes)
  }

  public fun sessionAttributes(sessionAttributes: IResolvable) {
    cdkBuilder.sessionAttributes(sessionAttributes)
  }

  public fun build(): CfnBot.DialogStateProperty {
    if(_sessionAttributes.isNotEmpty()) cdkBuilder.sessionAttributes(_sessionAttributes)
    return cdkBuilder.build()
  }
}
