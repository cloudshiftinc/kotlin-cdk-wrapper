package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Unit

public interface RouteSpecOptionsBase {
  public fun priority(): Number? = unwrap(this).getPriority()

  public interface Builder {
    public fun priority(priority: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase.Builder =
        software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase.builder()

    public override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase,
  ) : RouteSpecOptionsBase {
    public override fun priority(): Number? = unwrap(this).getPriority()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RouteSpecOptionsBase {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase):
        RouteSpecOptionsBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RouteSpecOptionsBase):
        software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase = (wrapped as
        Wrapper).cdkObject
  }
}
