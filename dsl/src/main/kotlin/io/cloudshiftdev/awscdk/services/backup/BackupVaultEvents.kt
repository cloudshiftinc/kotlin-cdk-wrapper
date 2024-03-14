package io.cloudshiftdev.awscdk.services.backup

public enum class BackupVaultEvents(
    private val cdkObject: software.amazon.awscdk.services.backup.BackupVaultEvents,
) {
    BACKUP_JOB_STARTED(software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_STARTED),
    BACKUP_JOB_COMPLETED(
        software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_COMPLETED
    ),
    BACKUP_JOB_SUCCESSFUL(
        software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_SUCCESSFUL
    ),
    BACKUP_JOB_FAILED(software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_FAILED),
    BACKUP_JOB_EXPIRED(software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_EXPIRED),
    RESTORE_JOB_STARTED(
        software.amazon.awscdk.services.backup.BackupVaultEvents.RESTORE_JOB_STARTED
    ),
    RESTORE_JOB_COMPLETED(
        software.amazon.awscdk.services.backup.BackupVaultEvents.RESTORE_JOB_COMPLETED
    ),
    RESTORE_JOB_SUCCESSFUL(
        software.amazon.awscdk.services.backup.BackupVaultEvents.RESTORE_JOB_SUCCESSFUL
    ),
    RESTORE_JOB_FAILED(software.amazon.awscdk.services.backup.BackupVaultEvents.RESTORE_JOB_FAILED),
    COPY_JOB_STARTED(software.amazon.awscdk.services.backup.BackupVaultEvents.COPY_JOB_STARTED),
    COPY_JOB_SUCCESSFUL(
        software.amazon.awscdk.services.backup.BackupVaultEvents.COPY_JOB_SUCCESSFUL
    ),
    COPY_JOB_FAILED(software.amazon.awscdk.services.backup.BackupVaultEvents.COPY_JOB_FAILED),
    RECOVERY_POINT_MODIFIED(
        software.amazon.awscdk.services.backup.BackupVaultEvents.RECOVERY_POINT_MODIFIED
    ),
    BACKUP_PLAN_CREATED(
        software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_PLAN_CREATED
    ),
    BACKUP_PLAN_MODIFIED(
        software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_PLAN_MODIFIED
    ),
    S3_BACKUP_OBJECT_FAILED(
        software.amazon.awscdk.services.backup.BackupVaultEvents.S3_BACKUP_OBJECT_FAILED
    ),
    S3_RESTORE_OBJECT_FAILED(
        software.amazon.awscdk.services.backup.BackupVaultEvents.S3_RESTORE_OBJECT_FAILED
    ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.backup.BackupVaultEvents
        ): BackupVaultEvents =
            when (cdkObject) {
                software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_STARTED ->
                    BackupVaultEvents.BACKUP_JOB_STARTED
                software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_COMPLETED ->
                    BackupVaultEvents.BACKUP_JOB_COMPLETED
                software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_SUCCESSFUL ->
                    BackupVaultEvents.BACKUP_JOB_SUCCESSFUL
                software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_FAILED ->
                    BackupVaultEvents.BACKUP_JOB_FAILED
                software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_EXPIRED ->
                    BackupVaultEvents.BACKUP_JOB_EXPIRED
                software.amazon.awscdk.services.backup.BackupVaultEvents.RESTORE_JOB_STARTED ->
                    BackupVaultEvents.RESTORE_JOB_STARTED
                software.amazon.awscdk.services.backup.BackupVaultEvents.RESTORE_JOB_COMPLETED ->
                    BackupVaultEvents.RESTORE_JOB_COMPLETED
                software.amazon.awscdk.services.backup.BackupVaultEvents.RESTORE_JOB_SUCCESSFUL ->
                    BackupVaultEvents.RESTORE_JOB_SUCCESSFUL
                software.amazon.awscdk.services.backup.BackupVaultEvents.RESTORE_JOB_FAILED ->
                    BackupVaultEvents.RESTORE_JOB_FAILED
                software.amazon.awscdk.services.backup.BackupVaultEvents.COPY_JOB_STARTED ->
                    BackupVaultEvents.COPY_JOB_STARTED
                software.amazon.awscdk.services.backup.BackupVaultEvents.COPY_JOB_SUCCESSFUL ->
                    BackupVaultEvents.COPY_JOB_SUCCESSFUL
                software.amazon.awscdk.services.backup.BackupVaultEvents.COPY_JOB_FAILED ->
                    BackupVaultEvents.COPY_JOB_FAILED
                software.amazon.awscdk.services.backup.BackupVaultEvents.RECOVERY_POINT_MODIFIED ->
                    BackupVaultEvents.RECOVERY_POINT_MODIFIED
                software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_PLAN_CREATED ->
                    BackupVaultEvents.BACKUP_PLAN_CREATED
                software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_PLAN_MODIFIED ->
                    BackupVaultEvents.BACKUP_PLAN_MODIFIED
                software.amazon.awscdk.services.backup.BackupVaultEvents.S3_BACKUP_OBJECT_FAILED ->
                    BackupVaultEvents.S3_BACKUP_OBJECT_FAILED
                software.amazon.awscdk.services.backup.BackupVaultEvents.S3_RESTORE_OBJECT_FAILED ->
                    BackupVaultEvents.S3_RESTORE_OBJECT_FAILED
            }

        internal fun unwrap(
            wrapped: BackupVaultEvents
        ): software.amazon.awscdk.services.backup.BackupVaultEvents = wrapped.cdkObject
    }
}
