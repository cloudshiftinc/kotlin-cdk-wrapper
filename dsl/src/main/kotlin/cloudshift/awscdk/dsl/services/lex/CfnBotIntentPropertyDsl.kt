@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Represents an action that the user wants to perform.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intent.html)
 */
@CdkDslMarker
public class CfnBotIntentPropertyDsl {
  private val cdkBuilder: CfnBot.IntentProperty.Builder = CfnBot.IntentProperty.builder()

  private val _inputContexts: MutableList<Any> = mutableListOf()

  private val _outputContexts: MutableList<Any> = mutableListOf()

  private val _sampleUtterances: MutableList<Any> = mutableListOf()

  private val _slotPriorities: MutableList<Any> = mutableListOf()

  private val _slots: MutableList<Any> = mutableListOf()

  /**
   * @param description A description of the intent.
   * Use the description to help identify the intent in lists.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param dialogCodeHook Specifies that Amazon Lex invokes the alias Lambda function for each user
   * input.
   * You can invoke this Lambda function to personalize user interaction.
   */
  public fun dialogCodeHook(dialogCodeHook: IResolvable) {
    cdkBuilder.dialogCodeHook(dialogCodeHook)
  }

  /**
   * @param dialogCodeHook Specifies that Amazon Lex invokes the alias Lambda function for each user
   * input.
   * You can invoke this Lambda function to personalize user interaction.
   */
  public fun dialogCodeHook(dialogCodeHook: CfnBot.DialogCodeHookSettingProperty) {
    cdkBuilder.dialogCodeHook(dialogCodeHook)
  }

  /**
   * @param fulfillmentCodeHook Specifies that Amazon Lex invokes the alias Lambda function when the
   * intent is ready for fulfillment.
   * You can invoke this function to complete the bot's transaction with the user.
   */
  public fun fulfillmentCodeHook(fulfillmentCodeHook: IResolvable) {
    cdkBuilder.fulfillmentCodeHook(fulfillmentCodeHook)
  }

  /**
   * @param fulfillmentCodeHook Specifies that Amazon Lex invokes the alias Lambda function when the
   * intent is ready for fulfillment.
   * You can invoke this function to complete the bot's transaction with the user.
   */
  public fun fulfillmentCodeHook(fulfillmentCodeHook: CfnBot.FulfillmentCodeHookSettingProperty) {
    cdkBuilder.fulfillmentCodeHook(fulfillmentCodeHook)
  }

  /**
   * @param initialResponseSetting Configuration setting for a response sent to the user before
   * Amazon Lex starts eliciting slots.
   */
  public fun initialResponseSetting(initialResponseSetting: IResolvable) {
    cdkBuilder.initialResponseSetting(initialResponseSetting)
  }

  /**
   * @param initialResponseSetting Configuration setting for a response sent to the user before
   * Amazon Lex starts eliciting slots.
   */
  public fun initialResponseSetting(initialResponseSetting: CfnBot.InitialResponseSettingProperty) {
    cdkBuilder.initialResponseSetting(initialResponseSetting)
  }

  /**
   * @param inputContexts A list of contexts that must be active for this intent to be considered by
   * Amazon Lex .
   */
  public fun inputContexts(vararg inputContexts: Any) {
    _inputContexts.addAll(listOf(*inputContexts))
  }

  /**
   * @param inputContexts A list of contexts that must be active for this intent to be considered by
   * Amazon Lex .
   */
  public fun inputContexts(inputContexts: Collection<Any>) {
    _inputContexts.addAll(inputContexts)
  }

  /**
   * @param inputContexts A list of contexts that must be active for this intent to be considered by
   * Amazon Lex .
   */
  public fun inputContexts(inputContexts: IResolvable) {
    cdkBuilder.inputContexts(inputContexts)
  }

  /**
   * @param intentClosingSetting Sets the response that Amazon Lex sends to the user when the intent
   * is closed.
   */
  public fun intentClosingSetting(intentClosingSetting: IResolvable) {
    cdkBuilder.intentClosingSetting(intentClosingSetting)
  }

  /**
   * @param intentClosingSetting Sets the response that Amazon Lex sends to the user when the intent
   * is closed.
   */
  public fun intentClosingSetting(intentClosingSetting: CfnBot.IntentClosingSettingProperty) {
    cdkBuilder.intentClosingSetting(intentClosingSetting)
  }

  /**
   * @param intentConfirmationSetting Provides prompts that Amazon Lex sends to the user to confirm
   * the completion of an intent.
   * If the user answers "no," the settings contain a statement that is sent to the user to end the
   * intent.
   */
  public fun intentConfirmationSetting(intentConfirmationSetting: IResolvable) {
    cdkBuilder.intentConfirmationSetting(intentConfirmationSetting)
  }

  /**
   * @param intentConfirmationSetting Provides prompts that Amazon Lex sends to the user to confirm
   * the completion of an intent.
   * If the user answers "no," the settings contain a statement that is sent to the user to end the
   * intent.
   */
  public
      fun intentConfirmationSetting(intentConfirmationSetting: CfnBot.IntentConfirmationSettingProperty) {
    cdkBuilder.intentConfirmationSetting(intentConfirmationSetting)
  }

  /**
   * @param kendraConfiguration Provides configuration information for the
   * `AMAZON.KendraSearchIntent` intent. When you use this intent, Amazon Lex searches the specified
   * Amazon Kendra index and returns documents from the index that match the user's utterance.
   */
  public fun kendraConfiguration(kendraConfiguration: IResolvable) {
    cdkBuilder.kendraConfiguration(kendraConfiguration)
  }

  /**
   * @param kendraConfiguration Provides configuration information for the
   * `AMAZON.KendraSearchIntent` intent. When you use this intent, Amazon Lex searches the specified
   * Amazon Kendra index and returns documents from the index that match the user's utterance.
   */
  public fun kendraConfiguration(kendraConfiguration: CfnBot.KendraConfigurationProperty) {
    cdkBuilder.kendraConfiguration(kendraConfiguration)
  }

  /**
   * @param name The name of the intent. 
   * Intent names must be unique within the locale that contains the intent and can't match the name
   * of any built-in intent.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param outputContexts A list of contexts that the intent activates when it is fulfilled.
   */
  public fun outputContexts(vararg outputContexts: Any) {
    _outputContexts.addAll(listOf(*outputContexts))
  }

  /**
   * @param outputContexts A list of contexts that the intent activates when it is fulfilled.
   */
  public fun outputContexts(outputContexts: Collection<Any>) {
    _outputContexts.addAll(outputContexts)
  }

  /**
   * @param outputContexts A list of contexts that the intent activates when it is fulfilled.
   */
  public fun outputContexts(outputContexts: IResolvable) {
    cdkBuilder.outputContexts(outputContexts)
  }

  /**
   * @param parentIntentSignature A unique identifier for the built-in intent to base this intent
   * on.
   */
  public fun parentIntentSignature(parentIntentSignature: String) {
    cdkBuilder.parentIntentSignature(parentIntentSignature)
  }

  /**
   * @param sampleUtterances A list of utterances that a user might say to signal the intent.
   */
  public fun sampleUtterances(vararg sampleUtterances: Any) {
    _sampleUtterances.addAll(listOf(*sampleUtterances))
  }

  /**
   * @param sampleUtterances A list of utterances that a user might say to signal the intent.
   */
  public fun sampleUtterances(sampleUtterances: Collection<Any>) {
    _sampleUtterances.addAll(sampleUtterances)
  }

  /**
   * @param sampleUtterances A list of utterances that a user might say to signal the intent.
   */
  public fun sampleUtterances(sampleUtterances: IResolvable) {
    cdkBuilder.sampleUtterances(sampleUtterances)
  }

  /**
   * @param slotPriorities Indicates the priority for slots.
   * Amazon Lex prompts the user for slot values in priority order.
   */
  public fun slotPriorities(vararg slotPriorities: Any) {
    _slotPriorities.addAll(listOf(*slotPriorities))
  }

  /**
   * @param slotPriorities Indicates the priority for slots.
   * Amazon Lex prompts the user for slot values in priority order.
   */
  public fun slotPriorities(slotPriorities: Collection<Any>) {
    _slotPriorities.addAll(slotPriorities)
  }

  /**
   * @param slotPriorities Indicates the priority for slots.
   * Amazon Lex prompts the user for slot values in priority order.
   */
  public fun slotPriorities(slotPriorities: IResolvable) {
    cdkBuilder.slotPriorities(slotPriorities)
  }

  /**
   * @param slots A list of slots that the intent requires for fulfillment.
   */
  public fun slots(vararg slots: Any) {
    _slots.addAll(listOf(*slots))
  }

  /**
   * @param slots A list of slots that the intent requires for fulfillment.
   */
  public fun slots(slots: Collection<Any>) {
    _slots.addAll(slots)
  }

  /**
   * @param slots A list of slots that the intent requires for fulfillment.
   */
  public fun slots(slots: IResolvable) {
    cdkBuilder.slots(slots)
  }

  public fun build(): CfnBot.IntentProperty {
    if(_inputContexts.isNotEmpty()) cdkBuilder.inputContexts(_inputContexts)
    if(_outputContexts.isNotEmpty()) cdkBuilder.outputContexts(_outputContexts)
    if(_sampleUtterances.isNotEmpty()) cdkBuilder.sampleUtterances(_sampleUtterances)
    if(_slotPriorities.isNotEmpty()) cdkBuilder.slotPriorities(_slotPriorities)
    if(_slots.isNotEmpty()) cdkBuilder.slots(_slots)
    return cdkBuilder.build()
  }
}
