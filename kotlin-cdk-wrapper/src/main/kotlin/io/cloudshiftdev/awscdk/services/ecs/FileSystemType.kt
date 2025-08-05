@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class FileSystemType(
  private val cdkObject: software.amazon.awscdk.services.ecs.FileSystemType,
) {
  EXT3(software.amazon.awscdk.services.ecs.FileSystemType.EXT3),
  EXT4(software.amazon.awscdk.services.ecs.FileSystemType.EXT4),
  XFS(software.amazon.awscdk.services.ecs.FileSystemType.XFS),
  NTFS(software.amazon.awscdk.services.ecs.FileSystemType.NTFS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FileSystemType): FileSystemType
        = when (cdkObject) {
      software.amazon.awscdk.services.ecs.FileSystemType.EXT3 -> FileSystemType.EXT3
      software.amazon.awscdk.services.ecs.FileSystemType.EXT4 -> FileSystemType.EXT4
      software.amazon.awscdk.services.ecs.FileSystemType.XFS -> FileSystemType.XFS
      software.amazon.awscdk.services.ecs.FileSystemType.NTFS -> FileSystemType.NTFS
    }

    internal fun unwrap(wrapped: FileSystemType): software.amazon.awscdk.services.ecs.FileSystemType
        = wrapped.cdkObject
  }
}
