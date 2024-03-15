@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface EcrSourceActionProps : CommonAwsActionProps {
  public fun imageTag(): String? = unwrap(this).getImageTag()

  public fun output(): Artifact

  public fun repository(): IRepository

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun imageTag(imageTag: String)

    public fun output(output: Artifact)

    public fun repository(repository: IRepository)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceActionProps.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    override fun repository(repository: IRepository) {
      cdkBuilder.repository(repository.let(IRepository::unwrap))
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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.EcrSourceActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceActionProps,
  ) : CdkObject(cdkObject), EcrSourceActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun imageTag(): String? = unwrap(this).getImageTag()

    override fun output(): Artifact = unwrap(this).getOutput().let(Artifact::wrap)

    override fun repository(): IRepository = unwrap(this).getRepository().let(IRepository::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcrSourceActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcrSourceActionProps):
        EcrSourceActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcrSourceActionProps):
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceActionProps
  }
}
