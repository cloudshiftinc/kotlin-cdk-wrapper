@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class CloudFormationExecuteChangeSetAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetAction,
) : Action(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun actionName(actionName: String)

    public fun changeSetName(changeSetName: String)

    public fun output(output: Artifact)

    public fun outputFileName(outputFileName: String)

    public fun region(region: String)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun stackName(stackName: String)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetAction.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetAction.Builder.create()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun changeSetName(changeSetName: String) {
      cdkBuilder.changeSetName(changeSetName)
    }

    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    override fun outputFileName(outputFileName: String) {
      cdkBuilder.outputFileName(outputFileName)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationExecuteChangeSetAction {
      val builderImpl = BuilderImpl()
      return CloudFormationExecuteChangeSetAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetAction):
        CloudFormationExecuteChangeSetAction = CloudFormationExecuteChangeSetAction(cdkObject)

    internal fun unwrap(wrapped: CloudFormationExecuteChangeSetAction):
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetAction =
        wrapped.cdkObject
  }
}
