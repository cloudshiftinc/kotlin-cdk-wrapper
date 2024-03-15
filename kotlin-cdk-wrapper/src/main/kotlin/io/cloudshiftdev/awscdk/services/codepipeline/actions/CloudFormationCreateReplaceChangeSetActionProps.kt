@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.CfnCapabilities
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CloudFormationCreateReplaceChangeSetActionProps : CommonAwsActionProps {
  public fun account(): String? = unwrap(this).getAccount()

  public fun adminPermissions(): Boolean

  public fun cfnCapabilities(): List<CfnCapabilities> =
      unwrap(this).getCfnCapabilities()?.map(CfnCapabilities::wrap) ?: emptyList()

  public fun changeSetName(): String

  public fun deploymentRole(): IRole? = unwrap(this).getDeploymentRole()?.let(IRole::wrap)

  public fun extraInputs(): List<Artifact> = unwrap(this).getExtraInputs()?.map(Artifact::wrap) ?:
      emptyList()

  public fun output(): Artifact? = unwrap(this).getOutput()?.let(Artifact::wrap)

  public fun outputFileName(): String? = unwrap(this).getOutputFileName()

  public fun parameterOverrides(): Map<String, Any> = unwrap(this).getParameterOverrides() ?:
      emptyMap()

  public fun region(): String? = unwrap(this).getRegion()

  public fun stackName(): String

  public fun templateConfiguration(): ArtifactPath? =
      unwrap(this).getTemplateConfiguration()?.let(ArtifactPath::wrap)

  public fun templatePath(): ArtifactPath

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
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps.builder()

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
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps,
  ) : CdkObject(cdkObject), CloudFormationCreateReplaceChangeSetActionProps {
    override fun account(): String? = unwrap(this).getAccount()

    override fun actionName(): String = unwrap(this).getActionName()

    override fun adminPermissions(): Boolean = unwrap(this).getAdminPermissions()

    override fun cfnCapabilities(): List<CfnCapabilities> =
        unwrap(this).getCfnCapabilities()?.map(CfnCapabilities::wrap) ?: emptyList()

    override fun changeSetName(): String = unwrap(this).getChangeSetName()

    override fun deploymentRole(): IRole? = unwrap(this).getDeploymentRole()?.let(IRole::wrap)

    override fun extraInputs(): List<Artifact> = unwrap(this).getExtraInputs()?.map(Artifact::wrap)
        ?: emptyList()

    override fun output(): Artifact? = unwrap(this).getOutput()?.let(Artifact::wrap)

    override fun outputFileName(): String? = unwrap(this).getOutputFileName()

    override fun parameterOverrides(): Map<String, Any> = unwrap(this).getParameterOverrides() ?:
        emptyMap()

    override fun region(): String? = unwrap(this).getRegion()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun stackName(): String = unwrap(this).getStackName()

    override fun templateConfiguration(): ArtifactPath? =
        unwrap(this).getTemplateConfiguration()?.let(ArtifactPath::wrap)

    override fun templatePath(): ArtifactPath =
        unwrap(this).getTemplatePath().let(ArtifactPath::wrap)

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationCreateReplaceChangeSetActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps):
        CloudFormationCreateReplaceChangeSetActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationCreateReplaceChangeSetActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps
  }
}
