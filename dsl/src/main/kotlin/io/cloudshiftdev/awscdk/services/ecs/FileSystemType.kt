package io.cloudshiftdev.awscdk.services.ecs

public enum class FileSystemType(
  private val cdkObject: software.amazon.awscdk.services.ecs.FileSystemType,
) {
  EXT3(software.amazon.awscdk.services.ecs.FileSystemType.EXT3),
  EXT4(software.amazon.awscdk.services.ecs.FileSystemType.EXT4),
  XFS(software.amazon.awscdk.services.ecs.FileSystemType.XFS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FileSystemType): FileSystemType
        = when (cdkObject) {
      software.amazon.awscdk.services.ecs.FileSystemType.EXT3 -> FileSystemType.EXT3
      software.amazon.awscdk.services.ecs.FileSystemType.EXT4 -> FileSystemType.EXT4
      software.amazon.awscdk.services.ecs.FileSystemType.XFS -> FileSystemType.XFS
    }

    internal fun unwrap(wrapped: FileSystemType): software.amazon.awscdk.services.ecs.FileSystemType
        = wrapped.cdkObject
  }
}
