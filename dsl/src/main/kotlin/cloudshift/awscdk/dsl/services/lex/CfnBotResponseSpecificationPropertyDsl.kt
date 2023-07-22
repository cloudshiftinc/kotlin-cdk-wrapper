@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotResponseSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.ResponseSpecificationProperty.Builder =
      CfnBot.ResponseSpecificationProperty.builder()

  private val _messageGroupsList: MutableList<Any> = mutableListOf()

  /**
   * @param allowInterrupt Indicates whether the user can interrupt a speech response from Amazon
   * Lex.
   */
  public fun allowInterrupt(allowInterrupt: Boolean) {
    cdkBuilder.allowInterrupt(allowInterrupt)
  }

  /**
   * @param allowInterrupt Indicates whether the user can interrupt a speech response from Amazon
   * Lex.
   */
  public fun allowInterrupt(allowInterrupt: IResolvable) {
    cdkBuilder.allowInterrupt(allowInterrupt)
  }

  /**
   * @param messageGroupsList A collection of responses that Amazon Lex can send to the user. 
   * Amazon Lex chooses the actual response to send at runtime.
   */
  public fun messageGroupsList(vararg messageGroupsList: Any) {
    _messageGroupsList.addAll(listOf(*messageGroupsList))
  }

  /**
   * @param messageGroupsList A collection of responses that Amazon Lex can send to the user. 
   * Amazon Lex chooses the actual response to send at runtime.
   */
  public fun messageGroupsList(messageGroupsList: Collection<Any>) {
    _messageGroupsList.addAll(messageGroupsList)
  }

  /**
   * @param messageGroupsList A collection of responses that Amazon Lex can send to the user. 
   * Amazon Lex chooses the actual response to send at runtime.
   */
  public fun messageGroupsList(messageGroupsList: IResolvable) {
    cdkBuilder.messageGroupsList(messageGroupsList)
  }

  public fun build(): CfnBot.ResponseSpecificationProperty {
    if(_messageGroupsList.isNotEmpty()) cdkBuilder.messageGroupsList(_messageGroupsList)
    return cdkBuilder.build()
  }
}
