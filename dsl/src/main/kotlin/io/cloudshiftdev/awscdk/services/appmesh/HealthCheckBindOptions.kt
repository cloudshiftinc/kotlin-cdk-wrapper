package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface HealthCheckBindOptions {
  /**
   * Port for Health Check interface.
   *
   * Default: - no default port is provided
   */
  public fun defaultPort(): Number? = unwrap(this).getDefaultPort()

  /**
   * A builder for [HealthCheckBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultPort Port for Health Check interface.
     */
    public fun defaultPort(defaultPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HealthCheckBindOptions.Builder =
        software.amazon.awscdk.services.appmesh.HealthCheckBindOptions.builder()

    /**
     * @param defaultPort Port for Health Check interface.
     */
    override fun defaultPort(defaultPort: Number) {
      cdkBuilder.defaultPort(defaultPort)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HealthCheckBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HealthCheckBindOptions,
  ) : HealthCheckBindOptions {
    /**
     * Port for Health Check interface.
     *
     * Default: - no default port is provided
     */
    override fun defaultPort(): Number? = unwrap(this).getDefaultPort()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HealthCheckBindOptions):
        HealthCheckBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheckBindOptions):
        software.amazon.awscdk.services.appmesh.HealthCheckBindOptions = (wrapped as
        Wrapper).cdkObject
  }
}
