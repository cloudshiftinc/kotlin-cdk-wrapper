@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface OrganizationsDeploymentProps {
  public fun autoDeployment(): StackSetOrganizationsAutoDeployment? =
      unwrap(this).getAutoDeployment()?.let(StackSetOrganizationsAutoDeployment::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun autoDeployment(autoDeployment: StackSetOrganizationsAutoDeployment)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps.builder()

    override fun autoDeployment(autoDeployment: StackSetOrganizationsAutoDeployment) {
      cdkBuilder.autoDeployment(autoDeployment.let(StackSetOrganizationsAutoDeployment::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps,
  ) : CdkObject(cdkObject), OrganizationsDeploymentProps {
    override fun autoDeployment(): StackSetOrganizationsAutoDeployment? =
        unwrap(this).getAutoDeployment()?.let(StackSetOrganizationsAutoDeployment::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OrganizationsDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps):
        OrganizationsDeploymentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OrganizationsDeploymentProps):
        software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps
  }
}
