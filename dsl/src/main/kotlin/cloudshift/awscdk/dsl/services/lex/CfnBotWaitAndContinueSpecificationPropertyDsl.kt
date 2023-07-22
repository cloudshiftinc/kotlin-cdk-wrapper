@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotWaitAndContinueSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.WaitAndContinueSpecificationProperty.Builder =
      CfnBot.WaitAndContinueSpecificationProperty.builder()

  /**
   * @param continueResponse The response that Amazon Lex sends to indicate that the bot is ready to
   * continue the conversation. 
   */
  public fun continueResponse(continueResponse: IResolvable) {
    cdkBuilder.continueResponse(continueResponse)
  }

  /**
   * @param continueResponse The response that Amazon Lex sends to indicate that the bot is ready to
   * continue the conversation. 
   */
  public fun continueResponse(continueResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.continueResponse(continueResponse)
  }

  /**
   * @param isActive Specifies whether the bot will wait for a user to respond.
   * When this field is false, wait and continue responses for a slot aren't used. If the `IsActive`
   * field isn't specified, the default is true.
   */
  public fun isActive(isActive: Boolean) {
    cdkBuilder.isActive(isActive)
  }

  /**
   * @param isActive Specifies whether the bot will wait for a user to respond.
   * When this field is false, wait and continue responses for a slot aren't used. If the `IsActive`
   * field isn't specified, the default is true.
   */
  public fun isActive(isActive: IResolvable) {
    cdkBuilder.isActive(isActive)
  }

  /**
   * @param stillWaitingResponse A response that Amazon Lex sends periodically to the user to
   * indicate that the bot is still waiting for input from the user.
   */
  public fun stillWaitingResponse(stillWaitingResponse: IResolvable) {
    cdkBuilder.stillWaitingResponse(stillWaitingResponse)
  }

  /**
   * @param stillWaitingResponse A response that Amazon Lex sends periodically to the user to
   * indicate that the bot is still waiting for input from the user.
   */
  public
      fun stillWaitingResponse(stillWaitingResponse: CfnBot.StillWaitingResponseSpecificationProperty) {
    cdkBuilder.stillWaitingResponse(stillWaitingResponse)
  }

  /**
   * @param waitingResponse The response that Amazon Lex sends to indicate that the bot is waiting
   * for the conversation to continue. 
   */
  public fun waitingResponse(waitingResponse: IResolvable) {
    cdkBuilder.waitingResponse(waitingResponse)
  }

  /**
   * @param waitingResponse The response that Amazon Lex sends to indicate that the bot is waiting
   * for the conversation to continue. 
   */
  public fun waitingResponse(waitingResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.waitingResponse(waitingResponse)
  }

  public fun build(): CfnBot.WaitAndContinueSpecificationProperty = cdkBuilder.build()
}
