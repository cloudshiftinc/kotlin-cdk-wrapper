@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotIntentPropertyDsl {
  private val cdkBuilder: CfnBot.IntentProperty.Builder = CfnBot.IntentProperty.builder()

  private val _inputContexts: MutableList<Any> = mutableListOf()

  private val _outputContexts: MutableList<Any> = mutableListOf()

  private val _sampleUtterances: MutableList<Any> = mutableListOf()

  private val _slotPriorities: MutableList<Any> = mutableListOf()

  private val _slots: MutableList<Any> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun dialogCodeHook(dialogCodeHook: IResolvable) {
    cdkBuilder.dialogCodeHook(dialogCodeHook)
  }

  public fun dialogCodeHook(dialogCodeHook: CfnBot.DialogCodeHookSettingProperty) {
    cdkBuilder.dialogCodeHook(dialogCodeHook)
  }

  public fun fulfillmentCodeHook(fulfillmentCodeHook: IResolvable) {
    cdkBuilder.fulfillmentCodeHook(fulfillmentCodeHook)
  }

  public fun fulfillmentCodeHook(fulfillmentCodeHook: CfnBot.FulfillmentCodeHookSettingProperty) {
    cdkBuilder.fulfillmentCodeHook(fulfillmentCodeHook)
  }

  public fun initialResponseSetting(initialResponseSetting: IResolvable) {
    cdkBuilder.initialResponseSetting(initialResponseSetting)
  }

  public fun initialResponseSetting(initialResponseSetting: CfnBot.InitialResponseSettingProperty) {
    cdkBuilder.initialResponseSetting(initialResponseSetting)
  }

  public fun inputContexts(vararg inputContexts: Any) {
    _inputContexts.addAll(listOf(*inputContexts))
  }

  public fun inputContexts(inputContexts: Collection<Any>) {
    _inputContexts.addAll(inputContexts)
  }

  public fun inputContexts(inputContexts: IResolvable) {
    cdkBuilder.inputContexts(inputContexts)
  }

  public fun intentClosingSetting(intentClosingSetting: IResolvable) {
    cdkBuilder.intentClosingSetting(intentClosingSetting)
  }

  public fun intentClosingSetting(intentClosingSetting: CfnBot.IntentClosingSettingProperty) {
    cdkBuilder.intentClosingSetting(intentClosingSetting)
  }

  public fun intentConfirmationSetting(intentConfirmationSetting: IResolvable) {
    cdkBuilder.intentConfirmationSetting(intentConfirmationSetting)
  }

  public
      fun intentConfirmationSetting(intentConfirmationSetting: CfnBot.IntentConfirmationSettingProperty) {
    cdkBuilder.intentConfirmationSetting(intentConfirmationSetting)
  }

  public fun kendraConfiguration(kendraConfiguration: IResolvable) {
    cdkBuilder.kendraConfiguration(kendraConfiguration)
  }

  public fun kendraConfiguration(kendraConfiguration: CfnBot.KendraConfigurationProperty) {
    cdkBuilder.kendraConfiguration(kendraConfiguration)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun outputContexts(vararg outputContexts: Any) {
    _outputContexts.addAll(listOf(*outputContexts))
  }

  public fun outputContexts(outputContexts: Collection<Any>) {
    _outputContexts.addAll(outputContexts)
  }

  public fun outputContexts(outputContexts: IResolvable) {
    cdkBuilder.outputContexts(outputContexts)
  }

  public fun parentIntentSignature(parentIntentSignature: String) {
    cdkBuilder.parentIntentSignature(parentIntentSignature)
  }

  public fun sampleUtterances(vararg sampleUtterances: Any) {
    _sampleUtterances.addAll(listOf(*sampleUtterances))
  }

  public fun sampleUtterances(sampleUtterances: Collection<Any>) {
    _sampleUtterances.addAll(sampleUtterances)
  }

  public fun sampleUtterances(sampleUtterances: IResolvable) {
    cdkBuilder.sampleUtterances(sampleUtterances)
  }

  public fun slotPriorities(vararg slotPriorities: Any) {
    _slotPriorities.addAll(listOf(*slotPriorities))
  }

  public fun slotPriorities(slotPriorities: Collection<Any>) {
    _slotPriorities.addAll(slotPriorities)
  }

  public fun slotPriorities(slotPriorities: IResolvable) {
    cdkBuilder.slotPriorities(slotPriorities)
  }

  public fun slots(vararg slots: Any) {
    _slots.addAll(listOf(*slots))
  }

  public fun slots(slots: Collection<Any>) {
    _slots.addAll(slots)
  }

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
