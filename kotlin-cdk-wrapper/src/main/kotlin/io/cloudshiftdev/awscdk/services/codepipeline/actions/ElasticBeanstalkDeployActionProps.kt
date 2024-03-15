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

public interface ElasticBeanstalkDeployActionProps : CommonAwsActionProps {
  public fun applicationName(): String

  public fun environmentName(): String

  public fun input(): Artifact

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun applicationName(applicationName: String)

    public fun environmentName(environmentName: String)

    public fun input(input: Artifact)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
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
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps,
  ) : CdkObject(cdkObject), ElasticBeanstalkDeployActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun applicationName(): String = unwrap(this).getApplicationName()

    override fun environmentName(): String = unwrap(this).getEnvironmentName()

    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ElasticBeanstalkDeployActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps):
        ElasticBeanstalkDeployActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ElasticBeanstalkDeployActionProps):
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps
  }
}
