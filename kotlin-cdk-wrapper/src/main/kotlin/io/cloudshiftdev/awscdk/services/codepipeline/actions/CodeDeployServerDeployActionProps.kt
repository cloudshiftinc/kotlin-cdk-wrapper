@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codedeploy.IServerDeploymentGroup
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CodeDeployServerDeployActionProps : CommonAwsActionProps {
  public fun deploymentGroup(): IServerDeploymentGroup

  public fun input(): Artifact

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun deploymentGroup(deploymentGroup: IServerDeploymentGroup)

    public fun input(input: Artifact)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun deploymentGroup(deploymentGroup: IServerDeploymentGroup) {
      cdkBuilder.deploymentGroup(deploymentGroup.let(IServerDeploymentGroup::unwrap))
    }

    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps,
  ) : CdkObject(cdkObject), CodeDeployServerDeployActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun deploymentGroup(): IServerDeploymentGroup =
        unwrap(this).getDeploymentGroup().let(IServerDeploymentGroup::wrap)

    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeDeployServerDeployActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps):
        CodeDeployServerDeployActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeDeployServerDeployActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps
  }
}
