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
public class CfnBotSlotValueElicitationSettingPropertyDsl {
  private val cdkBuilder: CfnBot.SlotValueElicitationSettingProperty.Builder =
      CfnBot.SlotValueElicitationSettingProperty.builder()

  private val _sampleUtterances: MutableList<Any> = mutableListOf()

  public fun defaultValueSpecification(defaultValueSpecification: IResolvable) {
    cdkBuilder.defaultValueSpecification(defaultValueSpecification)
  }

  public
      fun defaultValueSpecification(defaultValueSpecification: CfnBot.SlotDefaultValueSpecificationProperty) {
    cdkBuilder.defaultValueSpecification(defaultValueSpecification)
  }

  public fun promptSpecification(promptSpecification: IResolvable) {
    cdkBuilder.promptSpecification(promptSpecification)
  }

  public fun promptSpecification(promptSpecification: CfnBot.PromptSpecificationProperty) {
    cdkBuilder.promptSpecification(promptSpecification)
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

  public fun slotCaptureSetting(slotCaptureSetting: IResolvable) {
    cdkBuilder.slotCaptureSetting(slotCaptureSetting)
  }

  public fun slotCaptureSetting(slotCaptureSetting: CfnBot.SlotCaptureSettingProperty) {
    cdkBuilder.slotCaptureSetting(slotCaptureSetting)
  }

  public fun slotConstraint(slotConstraint: String) {
    cdkBuilder.slotConstraint(slotConstraint)
  }

  public fun waitAndContinueSpecification(waitAndContinueSpecification: IResolvable) {
    cdkBuilder.waitAndContinueSpecification(waitAndContinueSpecification)
  }

  public
      fun waitAndContinueSpecification(waitAndContinueSpecification: CfnBot.WaitAndContinueSpecificationProperty) {
    cdkBuilder.waitAndContinueSpecification(waitAndContinueSpecification)
  }

  public fun build(): CfnBot.SlotValueElicitationSettingProperty {
    if(_sampleUtterances.isNotEmpty()) cdkBuilder.sampleUtterances(_sampleUtterances)
    return cdkBuilder.build()
  }
}
