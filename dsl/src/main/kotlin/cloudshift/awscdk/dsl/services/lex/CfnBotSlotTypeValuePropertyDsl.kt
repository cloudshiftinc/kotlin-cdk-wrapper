@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSlotTypeValuePropertyDsl {
  private val cdkBuilder: CfnBot.SlotTypeValueProperty.Builder =
      CfnBot.SlotTypeValueProperty.builder()

  private val _synonyms: MutableList<Any> = mutableListOf()

  /**
   * @param sampleValue The value of the slot type entry. 
   */
  public fun sampleValue(sampleValue: IResolvable) {
    cdkBuilder.sampleValue(sampleValue)
  }

  /**
   * @param sampleValue The value of the slot type entry. 
   */
  public fun sampleValue(sampleValue: CfnBot.SampleValueProperty) {
    cdkBuilder.sampleValue(sampleValue)
  }

  /**
   * @param synonyms Additional values related to the slot type entry.
   */
  public fun synonyms(vararg synonyms: Any) {
    _synonyms.addAll(listOf(*synonyms))
  }

  /**
   * @param synonyms Additional values related to the slot type entry.
   */
  public fun synonyms(synonyms: Collection<Any>) {
    _synonyms.addAll(synonyms)
  }

  /**
   * @param synonyms Additional values related to the slot type entry.
   */
  public fun synonyms(synonyms: IResolvable) {
    cdkBuilder.synonyms(synonyms)
  }

  public fun build(): CfnBot.SlotTypeValueProperty {
    if(_synonyms.isNotEmpty()) cdkBuilder.synonyms(_synonyms)
    return cdkBuilder.build()
  }
}
