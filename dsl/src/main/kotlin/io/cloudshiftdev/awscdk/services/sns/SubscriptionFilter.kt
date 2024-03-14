package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class SubscriptionFilter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sns.SubscriptionFilter,
) : CdkObject(cdkObject) {
  /**
   * conditions that specify the message attributes that should be included, excluded, matched, etc.
   */
  public open fun conditions(): List<Any> = unwrap(this).getConditions()

  public companion object {
    public fun existsFilter(): SubscriptionFilter =
        software.amazon.awscdk.services.sns.SubscriptionFilter.existsFilter().let(SubscriptionFilter::wrap)

    public fun numericFilter(numericConditions: NumericConditions): SubscriptionFilter =
        software.amazon.awscdk.services.sns.SubscriptionFilter.numericFilter(numericConditions.let(NumericConditions::unwrap)).let(SubscriptionFilter::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08b13c81c934ff078dc391d7a0eb0f646b8df38ba151db3e20855b7921211d74")
    public fun numericFilter(numericConditions: NumericConditions.Builder.() -> Unit):
        SubscriptionFilter = numericFilter(NumericConditions(numericConditions))

    public fun stringFilter(stringConditions: StringConditions): SubscriptionFilter =
        software.amazon.awscdk.services.sns.SubscriptionFilter.stringFilter(stringConditions.let(StringConditions::unwrap)).let(SubscriptionFilter::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("645f93eeb9cc40dcde00a6b98ee9cc4e331957514b7b2805c9615b8abf1b48d4")
    public fun stringFilter(stringConditions: StringConditions.Builder.() -> Unit):
        SubscriptionFilter = stringFilter(StringConditions(stringConditions))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.SubscriptionFilter):
        SubscriptionFilter = SubscriptionFilter(cdkObject)

    internal fun unwrap(wrapped: SubscriptionFilter):
        software.amazon.awscdk.services.sns.SubscriptionFilter = wrapped.cdkObject
  }
}
