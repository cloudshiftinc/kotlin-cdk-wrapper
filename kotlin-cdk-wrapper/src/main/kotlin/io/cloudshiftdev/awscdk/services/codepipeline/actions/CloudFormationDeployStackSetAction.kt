@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.CfnCapabilities
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class CloudFormationDeployStackSetAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction,
) : Action(cdkObject) {
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
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction.Builder.create()

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
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudFormationDeployStackSetAction {
      val builderImpl = BuilderImpl()
      return CloudFormationDeployStackSetAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction):
        CloudFormationDeployStackSetAction = CloudFormationDeployStackSetAction(cdkObject)

    internal fun unwrap(wrapped: CloudFormationDeployStackSetAction):
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction =
        wrapped.cdkObject
  }
}
