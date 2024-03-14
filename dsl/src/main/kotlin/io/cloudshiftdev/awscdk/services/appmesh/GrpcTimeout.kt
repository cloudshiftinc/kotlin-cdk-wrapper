package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface GrpcTimeout {
  /**
   * Represents an idle timeout.
   *
   * The amount of time that a connection may be idle.
   *
   * Default: - none
   */
  public fun idle(): Duration? = unwrap(this).getIdle()?.let(Duration::wrap)

  /**
   * Represents per request timeout.
   *
   * Default: - 15 s
   */
  public fun perRequest(): Duration? = unwrap(this).getPerRequest()?.let(Duration::wrap)

  /**
   * A builder for [GrpcTimeout]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param idle Represents an idle timeout.
     * The amount of time that a connection may be idle.
     */
    public fun idle(idle: Duration)

    /**
     * @param perRequest Represents per request timeout.
     */
    public fun perRequest(perRequest: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcTimeout.Builder =
        software.amazon.awscdk.services.appmesh.GrpcTimeout.builder()

    /**
     * @param idle Represents an idle timeout.
     * The amount of time that a connection may be idle.
     */
    override fun idle(idle: Duration) {
      cdkBuilder.idle(idle.let(Duration::unwrap))
    }

    /**
     * @param perRequest Represents per request timeout.
     */
    override fun perRequest(perRequest: Duration) {
      cdkBuilder.perRequest(perRequest.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcTimeout = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GrpcTimeout,
  ) : CdkObject(cdkObject), GrpcTimeout {
    /**
     * Represents an idle timeout.
     *
     * The amount of time that a connection may be idle.
     *
     * Default: - none
     */
    override fun idle(): Duration? = unwrap(this).getIdle()?.let(Duration::wrap)

    /**
     * Represents per request timeout.
     *
     * Default: - 15 s
     */
    override fun perRequest(): Duration? = unwrap(this).getPerRequest()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcTimeout {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcTimeout): GrpcTimeout =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcTimeout): software.amazon.awscdk.services.appmesh.GrpcTimeout =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.GrpcTimeout
  }
}
