@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CloudFormationDeployStackInstancesActionProps : CommonAwsActionProps,
    CommonCloudFormationStackSetOptions {
  public fun parameterOverrides(): StackSetParameters? =
      unwrap(this).getParameterOverrides()?.let(StackSetParameters::wrap)

  public fun stackInstances(): StackInstances

  public fun stackSetName(): String

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
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps.builder()

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
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps,
  ) : CdkObject(cdkObject), CloudFormationDeployStackInstancesActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun failureTolerancePercentage(): Number? =
        unwrap(this).getFailureTolerancePercentage()

    override fun maxAccountConcurrencyPercentage(): Number? =
        unwrap(this).getMaxAccountConcurrencyPercentage()

    override fun parameterOverrides(): StackSetParameters? =
        unwrap(this).getParameterOverrides()?.let(StackSetParameters::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun stackInstances(): StackInstances =
        unwrap(this).getStackInstances().let(StackInstances::wrap)

    override fun stackSetName(): String = unwrap(this).getStackSetName()

    override fun stackSetRegion(): String? = unwrap(this).getStackSetRegion()

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationDeployStackInstancesActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps):
        CloudFormationDeployStackInstancesActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationDeployStackInstancesActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps
  }
}
