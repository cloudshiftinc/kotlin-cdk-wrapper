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
 * The slot values that Amazon Lex uses when it sets slot values in a dialog step.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotValueOverrideProperty slotValueOverrideProperty_;
 * SlotValueOverrideProperty slotValueOverrideProperty = SlotValueOverrideProperty.builder()
 * .shape("shape")
 * .value(SlotValueProperty.builder()
 * .interpretedValue("interpretedValue")
 * .build())
 * .values(List.of(slotValueOverrideProperty_))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverride.html)
 */
@CdkDslMarker
public class CfnBotSlotValueOverridePropertyDsl {
  private val cdkBuilder: CfnBot.SlotValueOverrideProperty.Builder =
      CfnBot.SlotValueOverrideProperty.builder()

  private val _values: MutableList<Any> = mutableListOf()

  /**
   * @param shape When the shape value is `List` , it indicates that the `values` field contains a
   * list of slot values.
   * When the value is `Scalar` , it indicates that the `value` field contains a single value.
   */
  public fun shape(shape: String) {
    cdkBuilder.shape(shape)
  }

  /**
   * @param value The current value of the slot.
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value The current value of the slot.
   */
  public fun `value`(`value`: CfnBot.SlotValueProperty) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param values A list of one or more values that the user provided for the slot.
   * For example, for a slot that elicits pizza toppings, the values might be "pepperoni" and
   * "pineapple."
   */
  public fun values(vararg values: Any) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values A list of one or more values that the user provided for the slot.
   * For example, for a slot that elicits pizza toppings, the values might be "pepperoni" and
   * "pineapple."
   */
  public fun values(values: Collection<Any>) {
    _values.addAll(values)
  }

  /**
   * @param values A list of one or more values that the user provided for the slot.
   * For example, for a slot that elicits pizza toppings, the values might be "pepperoni" and
   * "pineapple."
   */
  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnBot.SlotValueOverrideProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
