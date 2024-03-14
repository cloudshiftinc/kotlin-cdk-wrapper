package io.cloudshiftdev.awscdk.services.ecs

public enum class BinPackResource(
  private val cdkObject: software.amazon.awscdk.services.ecs.BinPackResource,
) {
  CPU(software.amazon.awscdk.services.ecs.BinPackResource.CPU),
  MEMORY(software.amazon.awscdk.services.ecs.BinPackResource.MEMORY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.BinPackResource):
        BinPackResource = when (cdkObject) {
      software.amazon.awscdk.services.ecs.BinPackResource.CPU -> BinPackResource.CPU
      software.amazon.awscdk.services.ecs.BinPackResource.MEMORY -> BinPackResource.MEMORY
    }

    internal fun unwrap(wrapped: BinPackResource):
        software.amazon.awscdk.services.ecs.BinPackResource = wrapped.cdkObject
  }
}
