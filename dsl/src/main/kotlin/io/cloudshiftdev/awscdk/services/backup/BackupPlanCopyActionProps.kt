package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface BackupPlanCopyActionProps {
    /**
     * Specifies the duration after creation that a copied recovery point is deleted from the
     * destination vault.
     *
     * Must be at least 90 days greater than `moveToColdStorageAfter`, if specified.
     *
     * Default: - recovery point is never deleted
     */
    public fun deleteAfter(): Duration? = unwrap(this).getDeleteAfter()?.let(Duration::wrap)

    /** Destination Vault for recovery points to be copied into. */
    public fun destinationBackupVault(): IBackupVault

    /**
     * Specifies the duration after creation that a copied recovery point is moved to cold storage.
     *
     * Default: - recovery point is never moved to cold storage
     */
    public fun moveToColdStorageAfter(): Duration? =
        unwrap(this).getMoveToColdStorageAfter()?.let(Duration::wrap)

    /** A builder for [BackupPlanCopyActionProps] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param deleteAfter Specifies the duration after creation that a copied recovery point is
         *   deleted from the destination vault. Must be at least 90 days greater than
         *   `moveToColdStorageAfter`, if specified.
         */
        public fun deleteAfter(deleteAfter: Duration)

        /**
         * @param destinationBackupVault Destination Vault for recovery points to be copied into.
         */
        public fun destinationBackupVault(destinationBackupVault: IBackupVault)

        /**
         * @param moveToColdStorageAfter Specifies the duration after creation that a copied
         *   recovery point is moved to cold storage.
         */
        public fun moveToColdStorageAfter(moveToColdStorageAfter: Duration)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.backup.BackupPlanCopyActionProps.Builder =
            software.amazon.awscdk.services.backup.BackupPlanCopyActionProps.builder()

        /**
         * @param deleteAfter Specifies the duration after creation that a copied recovery point is
         *   deleted from the destination vault. Must be at least 90 days greater than
         *   `moveToColdStorageAfter`, if specified.
         */
        override fun deleteAfter(deleteAfter: Duration) {
            cdkBuilder.deleteAfter(deleteAfter.let(Duration::unwrap))
        }

        /**
         * @param destinationBackupVault Destination Vault for recovery points to be copied into.
         */
        override fun destinationBackupVault(destinationBackupVault: IBackupVault) {
            cdkBuilder.destinationBackupVault(destinationBackupVault.let(IBackupVault::unwrap))
        }

        /**
         * @param moveToColdStorageAfter Specifies the duration after creation that a copied
         *   recovery point is moved to cold storage.
         */
        override fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
            cdkBuilder.moveToColdStorageAfter(moveToColdStorageAfter.let(Duration::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.backup.BackupPlanCopyActionProps =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.backup.BackupPlanCopyActionProps,
    ) : BackupPlanCopyActionProps {
        /**
         * Specifies the duration after creation that a copied recovery point is deleted from the
         * destination vault.
         *
         * Must be at least 90 days greater than `moveToColdStorageAfter`, if specified.
         *
         * Default: - recovery point is never deleted
         */
        override fun deleteAfter(): Duration? = unwrap(this).getDeleteAfter()?.let(Duration::wrap)

        /** Destination Vault for recovery points to be copied into. */
        override fun destinationBackupVault(): IBackupVault =
            unwrap(this).getDestinationBackupVault().let(IBackupVault::wrap)

        /**
         * Specifies the duration after creation that a copied recovery point is moved to cold
         * storage.
         *
         * Default: - recovery point is never moved to cold storage
         */
        override fun moveToColdStorageAfter(): Duration? =
            unwrap(this).getMoveToColdStorageAfter()?.let(Duration::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): BackupPlanCopyActionProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.backup.BackupPlanCopyActionProps
        ): BackupPlanCopyActionProps = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: BackupPlanCopyActionProps
        ): software.amazon.awscdk.services.backup.BackupPlanCopyActionProps =
            (wrapped as Wrapper).cdkObject
    }
}
