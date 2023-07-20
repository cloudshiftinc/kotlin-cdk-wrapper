@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotStillWaitingResponseSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.StillWaitingResponseSpecificationProperty.Builder =
      CfnBot.StillWaitingResponseSpecificationProperty.builder()

  private val _messageGroupsList: MutableList<Any> = mutableListOf()

  public fun allowInterrupt(allowInterrupt: Boolean) {
    cdkBuilder.allowInterrupt(allowInterrupt)
  }

  public fun allowInterrupt(allowInterrupt: IResolvable) {
    cdkBuilder.allowInterrupt(allowInterrupt)
  }

  public fun frequencyInSeconds(frequencyInSeconds: Number) {
    cdkBuilder.frequencyInSeconds(frequencyInSeconds)
  }

  public fun messageGroupsList(vararg messageGroupsList: Any) {
    _messageGroupsList.addAll(listOf(*messageGroupsList))
  }

  public fun messageGroupsList(messageGroupsList: Collection<Any>) {
    _messageGroupsList.addAll(messageGroupsList)
  }

  public fun messageGroupsList(messageGroupsList: IResolvable) {
    cdkBuilder.messageGroupsList(messageGroupsList)
  }

  public fun timeoutInSeconds(timeoutInSeconds: Number) {
    cdkBuilder.timeoutInSeconds(timeoutInSeconds)
  }

  public fun build(): CfnBot.StillWaitingResponseSpecificationProperty {
    if(_messageGroupsList.isNotEmpty()) cdkBuilder.messageGroupsList(_messageGroupsList)
    return cdkBuilder.build()
  }
}
