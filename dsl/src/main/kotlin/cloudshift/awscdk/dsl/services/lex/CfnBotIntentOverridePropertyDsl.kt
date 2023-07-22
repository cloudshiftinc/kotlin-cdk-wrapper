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
