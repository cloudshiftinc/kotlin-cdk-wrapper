package io.cloudshiftdev.awscdk.services.sns

public open class Filter
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.sns.Filter,
) : FilterOrPolicy(cdkObject) {
    /** filter argument to construct. */
    public open fun filterDoc(): SubscriptionFilter =
        unwrap(this).getFilterDoc().let(SubscriptionFilter::wrap)

    /** Type used in DFS buildFilterPolicyWithMessageBody to determine json value type. */
    public override fun type(): FilterOrPolicyType =
        unwrap(this).getType().let(FilterOrPolicyType::wrap)

    public companion object {
        init {}

        internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.Filter): Filter =
            Filter(cdkObject)

        internal fun unwrap(wrapped: Filter): software.amazon.awscdk.services.sns.Filter =
            wrapped.cdkObject
    }
}
