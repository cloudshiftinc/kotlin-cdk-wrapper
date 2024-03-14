package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

public interface ReplicaRegion {
    /**
     * The customer-managed encryption key to use for encrypting the secret value.
     *
     * Default: - A default KMS key for the account and region is used.
     */
    public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /** The name of the region. */
    public fun region(): String

    /** A builder for [ReplicaRegion] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
         *   value.
         */
        public fun encryptionKey(encryptionKey: IKey)

        /** @param region The name of the region. */
        public fun region(region: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.secretsmanager.ReplicaRegion.Builder =
            software.amazon.awscdk.services.secretsmanager.ReplicaRegion.builder()

        /**
         * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
         *   value.
         */
        override fun encryptionKey(encryptionKey: IKey) {
            cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
        }

        /** @param region The name of the region. */
        override fun region(region: String) {
            cdkBuilder.region(region)
        }

        public fun build(): software.amazon.awscdk.services.secretsmanager.ReplicaRegion =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.secretsmanager.ReplicaRegion,
    ) : ReplicaRegion {
        /**
         * The customer-managed encryption key to use for encrypting the secret value.
         *
         * Default: - A default KMS key for the account and region is used.
         */
        override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

        /** The name of the region. */
        override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaRegion {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.secretsmanager.ReplicaRegion
        ): ReplicaRegion = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ReplicaRegion
        ): software.amazon.awscdk.services.secretsmanager.ReplicaRegion =
            (wrapped as Wrapper).cdkObject
    }
}
