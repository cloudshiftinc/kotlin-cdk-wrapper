package io.cloudshiftdev.awscdk.services.ecr

import kotlin.String

public open class RepositoryEncryption
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecr.RepositoryEncryption,
) {
    /** the string value of the encryption. */
    public open fun `value`(): String = unwrap(this).getValue()

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecr.RepositoryEncryption
        ): RepositoryEncryption = RepositoryEncryption(cdkObject)

        internal fun unwrap(
            wrapped: RepositoryEncryption
        ): software.amazon.awscdk.services.ecr.RepositoryEncryption = wrapped.cdkObject
    }
}
