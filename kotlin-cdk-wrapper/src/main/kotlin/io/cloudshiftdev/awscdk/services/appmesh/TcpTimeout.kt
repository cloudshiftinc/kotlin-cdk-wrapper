@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Represents timeouts for TCP protocols.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * TcpTimeout tcpTimeout = TcpTimeout.builder()
 * .idle(Duration.minutes(30))
 * .build();
 * ```
 */
public interface TcpTimeout {
  /**
   * Represents an idle timeout.
   *
   * The amount of time that a connection may be idle.
   *
   * Default: - none
   */
  public fun idle(): Duration? = unwrap(this).getIdle()?.let(Duration::wrap)

  /**
   * A builder for [TcpTimeout]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param idle Represents an idle timeout.
     * The amount of time that a connection may be idle.
     */
    public fun idle(idle: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TcpTimeout.Builder =
        software.amazon.awscdk.services.appmesh.TcpTimeout.builder()

    /**
     * @param idle Represents an idle timeout.
     * The amount of time that a connection may be idle.
     */
    override fun idle(idle: Duration) {
      cdkBuilder.idle(idle.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.TcpTimeout = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.TcpTimeout,
  ) : CdkObject(cdkObject), TcpTimeout {
    /**
     * Represents an idle timeout.
     *
     * The amount of time that a connection may be idle.
     *
     * Default: - none
     */
    override fun idle(): Duration? = unwrap(this).getIdle()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TcpTimeout {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TcpTimeout): TcpTimeout =
        CdkObjectWrappers.wrap(cdkObject) as? TcpTimeout ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TcpTimeout): software.amazon.awscdk.services.appmesh.TcpTimeout =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.TcpTimeout
  }
}
