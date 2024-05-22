@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * A subscription filter for an attribute.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
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
 * .matchSuffixes(List.of("ue"))
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
public open class SubscriptionFilter(
  cdkObject: software.amazon.awscdk.services.sns.SubscriptionFilter,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.sns.SubscriptionFilter()
  )

  public constructor(conditions: List<Any>) :
      this(software.amazon.awscdk.services.sns.SubscriptionFilter(conditions.map{CdkObjectWrappers.unwrap(it)})
  )

  public constructor(vararg conditions: Any) : this(conditions.toList()
  )

  /**
   * conditions that specify the message attributes that should be included, excluded, matched, etc.
   */
  public open fun conditions(): List<Any> = unwrap(this).getConditions()

  public companion object {
    public fun existsFilter(): SubscriptionFilter =
        software.amazon.awscdk.services.sns.SubscriptionFilter.existsFilter().let(SubscriptionFilter::wrap)

    public fun numericFilter(numericConditions: NumericConditions): SubscriptionFilter =
        software.amazon.awscdk.services.sns.SubscriptionFilter.numericFilter(numericConditions.let(NumericConditions.Companion::unwrap)).let(SubscriptionFilter::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08b13c81c934ff078dc391d7a0eb0f646b8df38ba151db3e20855b7921211d74")
    public fun numericFilter(numericConditions: NumericConditions.Builder.() -> Unit):
        SubscriptionFilter = numericFilter(NumericConditions(numericConditions))

    public fun stringFilter(stringConditions: StringConditions): SubscriptionFilter =
        software.amazon.awscdk.services.sns.SubscriptionFilter.stringFilter(stringConditions.let(StringConditions.Companion::unwrap)).let(SubscriptionFilter::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("645f93eeb9cc40dcde00a6b98ee9cc4e331957514b7b2805c9615b8abf1b48d4")
    public fun stringFilter(stringConditions: StringConditions.Builder.() -> Unit):
        SubscriptionFilter = stringFilter(StringConditions(stringConditions))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.SubscriptionFilter):
        SubscriptionFilter = SubscriptionFilter(cdkObject)

    internal fun unwrap(wrapped: SubscriptionFilter):
        software.amazon.awscdk.services.sns.SubscriptionFilter = wrapped.cdkObject as
        software.amazon.awscdk.services.sns.SubscriptionFilter
  }
}
