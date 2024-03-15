@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class ElasticBeanstalkDeployAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction,
) : Action(cdkObject) {
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
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction.Builder.create()

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
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ElasticBeanstalkDeployAction {
      val builderImpl = BuilderImpl()
      return ElasticBeanstalkDeployAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction):
        ElasticBeanstalkDeployAction = ElasticBeanstalkDeployAction(cdkObject)

    internal fun unwrap(wrapped: ElasticBeanstalkDeployAction):
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction =
        wrapped.cdkObject
  }
}
