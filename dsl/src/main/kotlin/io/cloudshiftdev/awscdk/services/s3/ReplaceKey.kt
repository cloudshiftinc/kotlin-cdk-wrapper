package io.cloudshiftdev.awscdk.services.s3

import kotlin.String

public open class ReplaceKey
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.s3.ReplaceKey,
) {
    /**  */
    public open fun prefixWithKey(): String? = unwrap(this).getPrefixWithKey()

    /**  */
    public open fun withKey(): String? = unwrap(this).getWithKey()

    public companion object {
        public fun prefixWith(keyReplacement: String): ReplaceKey =
            software.amazon.awscdk.services.s3.ReplaceKey.prefixWith(keyReplacement)
                .let(ReplaceKey::wrap)

        public fun with(keyReplacement: String): ReplaceKey =
            software.amazon.awscdk.services.s3.ReplaceKey.with(keyReplacement).let(ReplaceKey::wrap)

        internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.ReplaceKey): ReplaceKey =
            ReplaceKey(cdkObject)

        internal fun unwrap(wrapped: ReplaceKey): software.amazon.awscdk.services.s3.ReplaceKey =
            wrapped.cdkObject
    }
}
