package io.cloudshiftdev.awscdk.services.appmesh

public enum class MeshFilterType(
  private val cdkObject: software.amazon.awscdk.services.appmesh.MeshFilterType,
) {
  ALLOW_ALL(software.amazon.awscdk.services.appmesh.MeshFilterType.ALLOW_ALL),
  DROP_ALL(software.amazon.awscdk.services.appmesh.MeshFilterType.DROP_ALL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.MeshFilterType):
        MeshFilterType = when (cdkObject) {
      software.amazon.awscdk.services.appmesh.MeshFilterType.ALLOW_ALL -> MeshFilterType.ALLOW_ALL
      software.amazon.awscdk.services.appmesh.MeshFilterType.DROP_ALL -> MeshFilterType.DROP_ALL
    }

    internal fun unwrap(wrapped: MeshFilterType):
        software.amazon.awscdk.services.appmesh.MeshFilterType = wrapped.cdkObject
  }
}
