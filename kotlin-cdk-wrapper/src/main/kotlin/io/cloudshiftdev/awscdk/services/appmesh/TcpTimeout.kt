@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface TcpTimeout {
  public fun idle(): Duration? = unwrap(this).getIdle()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun idle(idle: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TcpTimeout.Builder =
        software.amazon.awscdk.services.appmesh.TcpTimeout.builder()

    override fun idle(idle: Duration) {
      cdkBuilder.idle(idle.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.TcpTimeout = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.TcpTimeout,
  ) : CdkObject(cdkObject), TcpTimeout {
    override fun idle(): Duration? = unwrap(this).getIdle()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TcpTimeout {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TcpTimeout): TcpTimeout =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TcpTimeout): software.amazon.awscdk.services.appmesh.TcpTimeout =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.TcpTimeout
  }
}
