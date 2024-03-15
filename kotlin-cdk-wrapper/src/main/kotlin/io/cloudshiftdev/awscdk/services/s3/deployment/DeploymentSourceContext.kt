@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit

public interface DeploymentSourceContext {
  public fun handlerRole(): IRole

  @CdkDslMarker
  public interface Builder {
    public fun handlerRole(handlerRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext.Builder =
        software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext.builder()

    override fun handlerRole(handlerRole: IRole) {
      cdkBuilder.handlerRole(handlerRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext,
  ) : CdkObject(cdkObject), DeploymentSourceContext {
    override fun handlerRole(): IRole = unwrap(this).getHandlerRole().let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentSourceContext {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext):
        DeploymentSourceContext = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentSourceContext):
        software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext
  }
}
