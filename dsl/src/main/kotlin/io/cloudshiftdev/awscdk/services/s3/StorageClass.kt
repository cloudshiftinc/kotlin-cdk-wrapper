package io.cloudshiftdev.awscdk.services.s3

import kotlin.String

public open class StorageClass
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.s3.StorageClass,
) {
    /**  */
    public open fun `value`(): String = unwrap(this).getValue()

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.StorageClass
        ): StorageClass = StorageClass(cdkObject)

        internal fun unwrap(
            wrapped: StorageClass
        ): software.amazon.awscdk.services.s3.StorageClass = wrapped.cdkObject
    }
}
