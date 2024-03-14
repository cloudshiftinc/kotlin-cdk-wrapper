package io.cloudshiftdev.awscdk.services.rds

public enum class DBClusterStorageType(
    private val cdkObject: software.amazon.awscdk.services.rds.DBClusterStorageType,
) {
    AURORA(software.amazon.awscdk.services.rds.DBClusterStorageType.AURORA),
    AURORA_IOPT1(software.amazon.awscdk.services.rds.DBClusterStorageType.AURORA_IOPT1),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rds.DBClusterStorageType
        ): DBClusterStorageType =
            when (cdkObject) {
                software.amazon.awscdk.services.rds.DBClusterStorageType.AURORA ->
                    DBClusterStorageType.AURORA
                software.amazon.awscdk.services.rds.DBClusterStorageType.AURORA_IOPT1 ->
                    DBClusterStorageType.AURORA_IOPT1
            }

        internal fun unwrap(
            wrapped: DBClusterStorageType
        ): software.amazon.awscdk.services.rds.DBClusterStorageType = wrapped.cdkObject
    }
}
