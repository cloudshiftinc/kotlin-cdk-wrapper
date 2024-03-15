@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class CloudFormationDeployStackInstancesAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction,
) : Action(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun failureTolerancePercentage(failureTolerancePercentage: Number)

    public fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number)

    public fun parameterOverrides(parameterOverrides: StackSetParameters)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun stackInstances(stackInstances: StackInstances)

    public fun stackSetName(stackSetName: String)

    public fun stackSetRegion(stackSetRegion: String)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction.Builder.create()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun failureTolerancePercentage(failureTolerancePercentage: Number) {
      cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
    }

    override fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number) {
      cdkBuilder.maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage)
    }

    override fun parameterOverrides(parameterOverrides: StackSetParameters) {
      cdkBuilder.parameterOverrides(parameterOverrides.let(StackSetParameters::unwrap))
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

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationDeployStackInstancesAction {
      val builderImpl = BuilderImpl()
      return CloudFormationDeployStackInstancesAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction):
        CloudFormationDeployStackInstancesAction =
        CloudFormationDeployStackInstancesAction(cdkObject)

    internal fun unwrap(wrapped: CloudFormationDeployStackInstancesAction):
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction
        = wrapped.cdkObject
  }
}
