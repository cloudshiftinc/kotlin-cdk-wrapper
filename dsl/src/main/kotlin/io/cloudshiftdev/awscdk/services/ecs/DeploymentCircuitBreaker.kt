package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface DeploymentCircuitBreaker {
  /**
   * Whether to enable the deployment circuit breaker logic.
   *
   * Default: true
   */
  public fun enable(): Boolean? = unwrap(this).getEnable()

  /**
   * Whether to enable rollback on deployment failure.
   *
   * Default: false
   */
  public fun rollback(): Boolean? = unwrap(this).getRollback()

  /**
   * A builder for [DeploymentCircuitBreaker]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enable Whether to enable the deployment circuit breaker logic.
     */
    public fun enable(enable: Boolean)

    /**
     * @param rollback Whether to enable rollback on deployment failure.
     */
    public fun rollback(rollback: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker.Builder =
        software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker.builder()

    /**
     * @param enable Whether to enable the deployment circuit breaker logic.
     */
    override fun enable(enable: Boolean) {
      cdkBuilder.enable(enable)
    }

    /**
     * @param rollback Whether to enable rollback on deployment failure.
     */
    override fun rollback(rollback: Boolean) {
      cdkBuilder.rollback(rollback)
    }

    public fun build(): software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker,
  ) : CdkObject(cdkObject), DeploymentCircuitBreaker {
    /**
     * Whether to enable the deployment circuit breaker logic.
     *
     * Default: true
     */
    override fun enable(): Boolean? = unwrap(this).getEnable()

    /**
     * Whether to enable rollback on deployment failure.
     *
     * Default: false
     */
    override fun rollback(): Boolean? = unwrap(this).getRollback()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentCircuitBreaker {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker):
        DeploymentCircuitBreaker = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentCircuitBreaker):
        software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
  }
}
