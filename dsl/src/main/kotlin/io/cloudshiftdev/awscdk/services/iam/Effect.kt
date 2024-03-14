package io.cloudshiftdev.awscdk.services.iam

public enum class Effect(
    private val cdkObject: software.amazon.awscdk.services.iam.Effect,
) {
    ALLOW(software.amazon.awscdk.services.iam.Effect.ALLOW),
    DENY(software.amazon.awscdk.services.iam.Effect.DENY),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.Effect): Effect =
            when (cdkObject) {
                software.amazon.awscdk.services.iam.Effect.ALLOW -> Effect.ALLOW
                software.amazon.awscdk.services.iam.Effect.DENY -> Effect.DENY
            }

        internal fun unwrap(wrapped: Effect): software.amazon.awscdk.services.iam.Effect =
            wrapped.cdkObject
    }
}
