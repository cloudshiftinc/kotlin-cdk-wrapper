@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class EcrSourceAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction,
) : Action(cdkObject) {
  public open fun variables(): EcrSourceVariables =
      unwrap(this).getVariables().let(EcrSourceVariables::wrap)

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
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcrSourceAction {
      val builderImpl = BuilderImpl()
      return EcrSourceAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction):
        EcrSourceAction = EcrSourceAction(cdkObject)

    internal fun unwrap(wrapped: EcrSourceAction):
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction = wrapped.cdkObject
  }
}
