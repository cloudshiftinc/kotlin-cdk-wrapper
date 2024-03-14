package io.cloudshiftdev.awscdk.services.ecs

public enum class FirelensConfigFileType(
  private val cdkObject: software.amazon.awscdk.services.ecs.FirelensConfigFileType,
) {
  S3(software.amazon.awscdk.services.ecs.FirelensConfigFileType.S3),
  FILE(software.amazon.awscdk.services.ecs.FirelensConfigFileType.FILE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FirelensConfigFileType):
        FirelensConfigFileType = when (cdkObject) {
      software.amazon.awscdk.services.ecs.FirelensConfigFileType.S3 -> FirelensConfigFileType.S3
      software.amazon.awscdk.services.ecs.FirelensConfigFileType.FILE -> FirelensConfigFileType.FILE
    }

    internal fun unwrap(wrapped: FirelensConfigFileType):
        software.amazon.awscdk.services.ecs.FirelensConfigFileType = wrapped.cdkObject
  }
}
