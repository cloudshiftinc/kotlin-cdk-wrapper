@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.ecs.IBaseService
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class EcsDeployAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction,
) : Action(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun deploymentTimeout(deploymentTimeout: Duration)

    public fun imageFile(imageFile: ArtifactPath)

    public fun input(input: Artifact)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun service(service: IBaseService)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction.Builder.create()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun deploymentTimeout(deploymentTimeout: Duration) {
      cdkBuilder.deploymentTimeout(deploymentTimeout.let(Duration::unwrap))
    }

    override fun imageFile(imageFile: ArtifactPath) {
      cdkBuilder.imageFile(imageFile.let(ArtifactPath::unwrap))
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

    override fun service(service: IBaseService) {
      cdkBuilder.service(service.let(IBaseService::unwrap))
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsDeployAction {
      val builderImpl = BuilderImpl()
      return EcsDeployAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction):
        EcsDeployAction = EcsDeployAction(cdkObject)

    internal fun unwrap(wrapped: EcsDeployAction):
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction = wrapped.cdkObject
  }
}
