@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sns.BetweenCondition
import software.amazon.awscdk.services.sns.NumericConditions

/**
 * Conditions that can be applied to numeric attributes.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * Function fn;
 * Topic myTopic = new Topic(this, "MyTopic");
 * // Lambda should receive only message matching the following conditions on attributes:
 * // color: 'red' or 'orange' or begins with 'bl'
 * // size: anything but 'small' or 'medium'
 * // price: between 100 and 200 or greater than 300
 * // store: attribute must be present
 * myTopic.addSubscription(LambdaSubscription.Builder.create(fn)
 * .filterPolicy(Map.of(
 * "color", SubscriptionFilter.stringFilter(StringConditions.builder()
 * .allowlist(List.of("red", "orange"))
 * .matchPrefixes(List.of("bl"))
 * .build()),
 * "size", SubscriptionFilter.stringFilter(StringConditions.builder()
 * .denylist(List.of("small", "medium"))
 * .build()),
 * "price", SubscriptionFilter.numericFilter(NumericConditions.builder()
 * .between(BetweenCondition.builder().start(100).stop(200).build())
 * .greaterThan(300)
 * .build()),
 * "store", SubscriptionFilter.existsFilter()))
 * .build());
 * ```
 */
@CdkDslMarker
public class NumericConditionsDsl {
  private val cdkBuilder: NumericConditions.Builder = NumericConditions.builder()

  private val _allowlist: MutableList<Number> = mutableListOf()

  /**
   * @param allowlist Match one or more values.
   */
  public fun allowlist(vararg allowlist: Number) {
    _allowlist.addAll(listOf(*allowlist))
  }

  /**
   * @param allowlist Match one or more values.
   */
  public fun allowlist(allowlist: Collection<Number>) {
    _allowlist.addAll(allowlist)
  }

  /**
   * @param between Match values that are between the specified values.
   */
  public fun between(between: BetweenConditionDsl.() -> Unit = {}) {
    val builder = BetweenConditionDsl()
    builder.apply(between)
    cdkBuilder.between(builder.build())
  }

  /**
   * @param between Match values that are between the specified values.
   */
  public fun between(between: BetweenCondition) {
    cdkBuilder.between(between)
  }

  /**
   * @param betweenStrict Match values that are strictly between the specified values.
   */
  public fun betweenStrict(betweenStrict: BetweenConditionDsl.() -> Unit = {}) {
    val builder = BetweenConditionDsl()
    builder.apply(betweenStrict)
    cdkBuilder.betweenStrict(builder.build())
  }

  /**
   * @param betweenStrict Match values that are strictly between the specified values.
   */
  public fun betweenStrict(betweenStrict: BetweenCondition) {
    cdkBuilder.betweenStrict(betweenStrict)
  }

  /**
   * @param greaterThan Match values that are greater than the specified value.
   */
  public fun greaterThan(greaterThan: Number) {
    cdkBuilder.greaterThan(greaterThan)
  }

  /**
   * @param greaterThanOrEqualTo Match values that are greater than or equal to the specified value.
   */
  public fun greaterThanOrEqualTo(greaterThanOrEqualTo: Number) {
    cdkBuilder.greaterThanOrEqualTo(greaterThanOrEqualTo)
  }

  /**
   * @param lessThan Match values that are less than the specified value.
   */
  public fun lessThan(lessThan: Number) {
    cdkBuilder.lessThan(lessThan)
  }

  /**
   * @param lessThanOrEqualTo Match values that are less than or equal to the specified value.
   */
  public fun lessThanOrEqualTo(lessThanOrEqualTo: Number) {
    cdkBuilder.lessThanOrEqualTo(lessThanOrEqualTo)
  }

  public fun build(): NumericConditions {
    if(_allowlist.isNotEmpty()) cdkBuilder.allowlist(_allowlist)
    return cdkBuilder.build()
  }
}
