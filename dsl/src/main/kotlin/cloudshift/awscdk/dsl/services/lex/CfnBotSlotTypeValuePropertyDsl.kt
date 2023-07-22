@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Each slot type can have a set of values.
 *
 * Each `SlotTypeValue` represents a value that the slot type can take.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotTypeValueProperty slotTypeValueProperty = SlotTypeValueProperty.builder()
 * .sampleValue(SampleValueProperty.builder()
 * .value("value")
 * .build())
 * // the properties below are optional
 * .synonyms(List.of(SampleValueProperty.builder()
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottypevalue.html)
 */
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
