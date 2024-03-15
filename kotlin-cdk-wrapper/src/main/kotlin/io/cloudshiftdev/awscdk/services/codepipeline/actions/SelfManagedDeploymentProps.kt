@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface SelfManagedDeploymentProps {
  public fun administrationRole(): IRole? = unwrap(this).getAdministrationRole()?.let(IRole::wrap)

  public fun executionRoleName(): String? = unwrap(this).getExecutionRoleName()

  @CdkDslMarker
  public interface Builder {
    public fun administrationRole(administrationRole: IRole)

    public fun executionRoleName(executionRoleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps.builder()

    override fun administrationRole(administrationRole: IRole) {
      cdkBuilder.administrationRole(administrationRole.let(IRole::unwrap))
    }

    override fun executionRoleName(executionRoleName: String) {
      cdkBuilder.executionRoleName(executionRoleName)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps,
  ) : CdkObject(cdkObject), SelfManagedDeploymentProps {
    override fun administrationRole(): IRole? =
        unwrap(this).getAdministrationRole()?.let(IRole::wrap)

    override fun executionRoleName(): String? = unwrap(this).getExecutionRoleName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SelfManagedDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps):
        SelfManagedDeploymentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SelfManagedDeploymentProps):
        software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps
  }
}
