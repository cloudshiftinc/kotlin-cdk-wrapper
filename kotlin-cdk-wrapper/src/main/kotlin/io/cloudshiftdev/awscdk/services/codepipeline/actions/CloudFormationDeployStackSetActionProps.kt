@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.CfnCapabilities
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CloudFormationDeployStackSetActionProps : CommonAwsActionProps,
    CommonCloudFormationStackSetOptions {
  public fun cfnCapabilities(): List<CfnCapabilities> =
      unwrap(this).getCfnCapabilities()?.map(CfnCapabilities::wrap) ?: emptyList()

  public fun deploymentModel(): StackSetDeploymentModel? =
      unwrap(this).getDeploymentModel()?.let(StackSetDeploymentModel::wrap)

  public fun description(): String? = unwrap(this).getDescription()

  public fun parameters(): StackSetParameters? =
      unwrap(this).getParameters()?.let(StackSetParameters::wrap)

  public fun stackInstances(): StackInstances? =
      unwrap(this).getStackInstances()?.let(StackInstances::wrap)

  public fun stackSetName(): String

  public fun template(): StackSetTemplate

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun cfnCapabilities(cfnCapabilities: List<CfnCapabilities>)

    public fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities)

    public fun deploymentModel(deploymentModel: StackSetDeploymentModel)

    public fun description(description: String)

    public fun failureTolerancePercentage(failureTolerancePercentage: Number)

    public fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number)

    public fun parameters(parameters: StackSetParameters)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun stackInstances(stackInstances: StackInstances)

    public fun stackSetName(stackSetName: String)

    public fun stackSetRegion(stackSetRegion: String)

    public fun template(template: StackSetTemplate)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun cfnCapabilities(cfnCapabilities: List<CfnCapabilities>) {
      cdkBuilder.cfnCapabilities(cfnCapabilities.map(CfnCapabilities::unwrap))
    }

    override fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities): Unit =
        cfnCapabilities(cfnCapabilities.toList())

    override fun deploymentModel(deploymentModel: StackSetDeploymentModel) {
      cdkBuilder.deploymentModel(deploymentModel.let(StackSetDeploymentModel::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun failureTolerancePercentage(failureTolerancePercentage: Number) {
      cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
    }

    override fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number) {
      cdkBuilder.maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage)
    }

    override fun parameters(parameters: StackSetParameters) {
      cdkBuilder.parameters(parameters.let(StackSetParameters::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun stackInstances(stackInstances: StackInstances) {
      cdkBuilder.stackInstances(stackInstances.let(StackInstances::unwrap))
    }

    override fun stackSetName(stackSetName: String) {
      cdkBuilder.stackSetName(stackSetName)
    }

    override fun stackSetRegion(stackSetRegion: String) {
      cdkBuilder.stackSetRegion(stackSetRegion)
    }

    override fun template(template: StackSetTemplate) {
      cdkBuilder.template(template.let(StackSetTemplate::unwrap))
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps,
  ) : CdkObject(cdkObject), CloudFormationDeployStackSetActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun cfnCapabilities(): List<CfnCapabilities> =
        unwrap(this).getCfnCapabilities()?.map(CfnCapabilities::wrap) ?: emptyList()

    override fun deploymentModel(): StackSetDeploymentModel? =
        unwrap(this).getDeploymentModel()?.let(StackSetDeploymentModel::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun failureTolerancePercentage(): Number? =
        unwrap(this).getFailureTolerancePercentage()

    override fun maxAccountConcurrencyPercentage(): Number? =
        unwrap(this).getMaxAccountConcurrencyPercentage()

    override fun parameters(): StackSetParameters? =
        unwrap(this).getParameters()?.let(StackSetParameters::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun stackInstances(): StackInstances? =
        unwrap(this).getStackInstances()?.let(StackInstances::wrap)

    override fun stackSetName(): String = unwrap(this).getStackSetName()

    override fun stackSetRegion(): String? = unwrap(this).getStackSetRegion()

    override fun template(): StackSetTemplate =
        unwrap(this).getTemplate().let(StackSetTemplate::wrap)

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationDeployStackSetActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps):
        CloudFormationDeployStackSetActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationDeployStackSetActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps
  }
}
