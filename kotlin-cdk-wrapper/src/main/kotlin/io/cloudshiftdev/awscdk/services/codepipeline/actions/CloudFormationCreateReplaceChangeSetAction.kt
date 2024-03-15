@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.CfnCapabilities
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class CloudFormationCreateReplaceChangeSetAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetAction,
) : Action(cdkObject) {
  public open fun addToDeploymentRolePolicy(statement: PolicyStatement): Boolean =
      unwrap(this).addToDeploymentRolePolicy(statement.let(PolicyStatement::unwrap))

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe44095aa4e81711afe0beff27bc1e4c16dcc5a3afedec001c0afae9d5844fde")
  public open fun addToDeploymentRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Boolean
      = addToDeploymentRolePolicy(PolicyStatement(statement))

  public open fun deploymentRole(): IRole = unwrap(this).getDeploymentRole().let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun actionName(actionName: String)

    public fun adminPermissions(adminPermissions: Boolean)

    public fun cfnCapabilities(cfnCapabilities: List<CfnCapabilities>)

    public fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities)

    public fun changeSetName(changeSetName: String)

    public fun deploymentRole(deploymentRole: IRole)

    public fun extraInputs(extraInputs: List<Artifact>)

    public fun extraInputs(vararg extraInputs: Artifact)

    public fun output(output: Artifact)

    public fun outputFileName(outputFileName: String)

    public fun parameterOverrides(parameterOverrides: Map<String, Any>)

    public fun region(region: String)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun stackName(stackName: String)

    public fun templateConfiguration(templateConfiguration: ArtifactPath)

    public fun templatePath(templatePath: ArtifactPath)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetAction.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetAction.Builder.create()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun adminPermissions(adminPermissions: Boolean) {
      cdkBuilder.adminPermissions(adminPermissions)
    }

    override fun cfnCapabilities(cfnCapabilities: List<CfnCapabilities>) {
      cdkBuilder.cfnCapabilities(cfnCapabilities.map(CfnCapabilities::unwrap))
    }

    override fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities): Unit =
        cfnCapabilities(cfnCapabilities.toList())

    override fun changeSetName(changeSetName: String) {
      cdkBuilder.changeSetName(changeSetName)
    }

    override fun deploymentRole(deploymentRole: IRole) {
      cdkBuilder.deploymentRole(deploymentRole.let(IRole::unwrap))
    }

    override fun extraInputs(extraInputs: List<Artifact>) {
      cdkBuilder.extraInputs(extraInputs.map(Artifact::unwrap))
    }

    override fun extraInputs(vararg extraInputs: Artifact): Unit = extraInputs(extraInputs.toList())

    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    override fun outputFileName(outputFileName: String) {
      cdkBuilder.outputFileName(outputFileName)
    }

    override fun parameterOverrides(parameterOverrides: Map<String, Any>) {
      cdkBuilder.parameterOverrides(parameterOverrides)
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

    override fun templateConfiguration(templateConfiguration: ArtifactPath) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(ArtifactPath::unwrap))
    }

    override fun templatePath(templatePath: ArtifactPath) {
      cdkBuilder.templatePath(templatePath.let(ArtifactPath::unwrap))
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetAction
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationCreateReplaceChangeSetAction {
      val builderImpl = BuilderImpl()
      return CloudFormationCreateReplaceChangeSetAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetAction):
        CloudFormationCreateReplaceChangeSetAction =
        CloudFormationCreateReplaceChangeSetAction(cdkObject)

    internal fun unwrap(wrapped: CloudFormationCreateReplaceChangeSetAction):
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetAction
        = wrapped.cdkObject
  }
}
