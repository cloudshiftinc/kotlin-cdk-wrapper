package io.cloudshiftdev.awscdk.services.efs

public enum class ReplicationOverwriteProtection(
    private val cdkObject: software.amazon.awscdk.services.efs.ReplicationOverwriteProtection,
) {
    ENABLED(software.amazon.awscdk.services.efs.ReplicationOverwriteProtection.ENABLED),
    DISABLED(software.amazon.awscdk.services.efs.ReplicationOverwriteProtection.DISABLED),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.efs.ReplicationOverwriteProtection
        ): ReplicationOverwriteProtection =
            when (cdkObject) {
                software.amazon.awscdk.services.efs.ReplicationOverwriteProtection.ENABLED ->
                    ReplicationOverwriteProtection.ENABLED
                software.amazon.awscdk.services.efs.ReplicationOverwriteProtection.DISABLED ->
                    ReplicationOverwriteProtection.DISABLED
            }

        internal fun unwrap(
            wrapped: ReplicationOverwriteProtection
        ): software.amazon.awscdk.services.efs.ReplicationOverwriteProtection = wrapped.cdkObject
    }
}
