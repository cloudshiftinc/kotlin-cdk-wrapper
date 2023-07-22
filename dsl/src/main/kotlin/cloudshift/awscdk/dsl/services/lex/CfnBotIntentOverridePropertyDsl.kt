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
 * Override settings to configure the intent state.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotValueOverrideProperty slotValueOverrideProperty_;
 * IntentOverrideProperty intentOverrideProperty = IntentOverrideProperty.builder()
 * .name("name")
 * .slots(List.of(SlotValueOverrideMapProperty.builder()
 * .slotName("slotName")
 * .slotValueOverride(SlotValueOverrideProperty.builder()
 * .shape("shape")
 * .value(SlotValueProperty.builder()
 * .interpretedValue("interpretedValue")
 * .build())
 * .values(List.of(slotValueOverrideProperty_))
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-intentoverride.html)
 */
@CdkDslMarker
public class CfnBotIntentOverridePropertyDsl {
  private val cdkBuilder: CfnBot.IntentOverrideProperty.Builder =
      CfnBot.IntentOverrideProperty.builder()

  private val _slots: MutableList<Any> = mutableListOf()

  /**
   * @param name The name of the intent.
   * Only required when you're switching intents.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param slots A map of all of the slot value overrides for the intent.
   * The name of the slot maps to the value of the slot. Slots that are not included in the map
   * aren't overridden.
   */
  public fun slots(vararg slots: Any) {
    _slots.addAll(listOf(*slots))
  }

  /**
   * @param slots A map of all of the slot value overrides for the intent.
   * The name of the slot maps to the value of the slot. Slots that are not included in the map
   * aren't overridden.
   */
  public fun slots(slots: Collection<Any>) {
    _slots.addAll(slots)
  }

  /**
   * @param slots A map of all of the slot value overrides for the intent.
   * The name of the slot maps to the value of the slot. Slots that are not included in the map
   * aren't overridden.
   */
  public fun slots(slots: IResolvable) {
    cdkBuilder.slots(slots)
  }

  public fun build(): CfnBot.IntentOverrideProperty {
    if(_slots.isNotEmpty()) cdkBuilder.slots(_slots)
    return cdkBuilder.build()
  }
}
