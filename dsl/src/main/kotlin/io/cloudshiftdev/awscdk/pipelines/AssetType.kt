package io.cloudshiftdev.awscdk.pipelines

public enum class AssetType(
  private val cdkObject: software.amazon.awscdk.pipelines.AssetType,
) {
  FILE(software.amazon.awscdk.pipelines.AssetType.FILE),
  DOCKER_IMAGE(software.amazon.awscdk.pipelines.AssetType.DOCKER_IMAGE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.AssetType): AssetType = when
        (cdkObject) {
      software.amazon.awscdk.pipelines.AssetType.FILE -> AssetType.FILE
      software.amazon.awscdk.pipelines.AssetType.DOCKER_IMAGE -> AssetType.DOCKER_IMAGE
    }

    internal fun unwrap(wrapped: AssetType): software.amazon.awscdk.pipelines.AssetType =
        wrapped.cdkObject
  }
}
