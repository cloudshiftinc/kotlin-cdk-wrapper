@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CloudFormationExecuteChangeSetActionProps : CommonAwsActionProps {
  public fun account(): String? = unwrap(this).getAccount()

  public fun changeSetName(): String

  public fun output(): Artifact? = unwrap(this).getOutput()?.let(Artifact::wrap)

  public fun outputFileName(): String? = unwrap(this).getOutputFileName()

  public fun region(): String? = unwrap(this).getRegion()

  public fun stackName(): String

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
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetActionProps.builder()

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
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetActionProps,
  ) : CdkObject(cdkObject), CloudFormationExecuteChangeSetActionProps {
    override fun account(): String? = unwrap(this).getAccount()

    override fun actionName(): String = unwrap(this).getActionName()

    override fun changeSetName(): String = unwrap(this).getChangeSetName()

    override fun output(): Artifact? = unwrap(this).getOutput()?.let(Artifact::wrap)

    override fun outputFileName(): String? = unwrap(this).getOutputFileName()

    override fun region(): String? = unwrap(this).getRegion()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun stackName(): String = unwrap(this).getStackName()

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationExecuteChangeSetActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetActionProps):
        CloudFormationExecuteChangeSetActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationExecuteChangeSetActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetActionProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetActionProps
  }
}
