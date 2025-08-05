@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

public enum class BackupMode(
  private val cdkObject: software.amazon.awscdk.services.kinesisfirehose.BackupMode,
) {
  ALL(software.amazon.awscdk.services.kinesisfirehose.BackupMode.ALL),
  FAILED(software.amazon.awscdk.services.kinesisfirehose.BackupMode.FAILED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.BackupMode):
        BackupMode = when (cdkObject) {
      software.amazon.awscdk.services.kinesisfirehose.BackupMode.ALL -> BackupMode.ALL
      software.amazon.awscdk.services.kinesisfirehose.BackupMode.FAILED -> BackupMode.FAILED
    }

    internal fun unwrap(wrapped: BackupMode):
        software.amazon.awscdk.services.kinesisfirehose.BackupMode = wrapped.cdkObject
  }
}
