@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CodeStarConnectionsSourceActionProps : CommonAwsActionProps {
  public fun branch(): String? = unwrap(this).getBranch()

  public fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

  public fun connectionArn(): String

  public fun output(): Artifact

  public fun owner(): String

  public fun repo(): String

  public fun triggerOnPush(): Boolean? = unwrap(this).getTriggerOnPush()

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun branch(branch: String)

    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean)

    public fun connectionArn(connectionArn: String)

    public fun output(output: Artifact)

    public fun owner(owner: String)

    public fun repo(repo: String)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun triggerOnPush(triggerOnPush: Boolean)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun branch(branch: String) {
      cdkBuilder.branch(branch)
    }

    override fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
      cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
    }

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    override fun repo(repo: String) {
      cdkBuilder.repo(repo)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun triggerOnPush(triggerOnPush: Boolean) {
      cdkBuilder.triggerOnPush(triggerOnPush)
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps,
  ) : CdkObject(cdkObject), CodeStarConnectionsSourceActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun branch(): String? = unwrap(this).getBranch()

    override fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

    override fun connectionArn(): String = unwrap(this).getConnectionArn()

    override fun output(): Artifact = unwrap(this).getOutput().let(Artifact::wrap)

    override fun owner(): String = unwrap(this).getOwner()

    override fun repo(): String = unwrap(this).getRepo()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun triggerOnPush(): Boolean? = unwrap(this).getTriggerOnPush()

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CodeStarConnectionsSourceActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps):
        CodeStarConnectionsSourceActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeStarConnectionsSourceActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps
  }
}
