package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String

public open class PrimaryKey
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.appsync.PrimaryKey,
) {
    /** Renders the key assignment to a VTL string. */
    public open fun renderTemplate(): String = unwrap(this).renderTemplate()

    public companion object {
        public fun partition(key: String): PartitionKeyStep =
            software.amazon.awscdk.services.appsync.PrimaryKey.partition(key)
                .let(PartitionKeyStep::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appsync.PrimaryKey
        ): PrimaryKey = PrimaryKey(cdkObject)

        internal fun unwrap(
            wrapped: PrimaryKey
        ): software.amazon.awscdk.services.appsync.PrimaryKey = wrapped.cdkObject
    }
}
