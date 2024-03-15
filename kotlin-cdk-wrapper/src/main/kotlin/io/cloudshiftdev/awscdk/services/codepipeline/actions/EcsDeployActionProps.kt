@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.ecs.IBaseService
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface EcsDeployActionProps : CommonAwsActionProps {
  public fun deploymentTimeout(): Duration? =
      unwrap(this).getDeploymentTimeout()?.let(Duration::wrap)

  public fun imageFile(): ArtifactPath? = unwrap(this).getImageFile()?.let(ArtifactPath::wrap)

  public fun input(): Artifact? = unwrap(this).getInput()?.let(Artifact::wrap)

  public fun service(): IBaseService

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
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps.builder()

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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps,
  ) : CdkObject(cdkObject), EcsDeployActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun deploymentTimeout(): Duration? =
        unwrap(this).getDeploymentTimeout()?.let(Duration::wrap)

    override fun imageFile(): ArtifactPath? = unwrap(this).getImageFile()?.let(ArtifactPath::wrap)

    override fun input(): Artifact? = unwrap(this).getInput()?.let(Artifact::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun service(): IBaseService = unwrap(this).getService().let(IBaseService::wrap)

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsDeployActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps):
        EcsDeployActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsDeployActionProps):
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps
  }
}
