@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface DeploymentCircuitBreaker {
  public fun enable(): Boolean? = unwrap(this).getEnable()

  public fun rollback(): Boolean? = unwrap(this).getRollback()

  @CdkDslMarker
  public interface Builder {
    public fun enable(enable: Boolean)

    public fun rollback(rollback: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker.Builder =
        software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker.builder()

    override fun enable(enable: Boolean) {
      cdkBuilder.enable(enable)
    }

    override fun rollback(rollback: Boolean) {
      cdkBuilder.rollback(rollback)
    }

    public fun build(): software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker,
  ) : CdkObject(cdkObject), DeploymentCircuitBreaker {
    override fun enable(): Boolean? = unwrap(this).getEnable()

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
