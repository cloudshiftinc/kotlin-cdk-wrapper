@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class JenkinsAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.JenkinsAction,
) : Action(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun inputs(inputs: List<Artifact>)

    public fun inputs(vararg inputs: Artifact)

    public fun jenkinsProvider(jenkinsProvider: IJenkinsProvider)

    public fun outputs(outputs: List<Artifact>)

    public fun outputs(vararg outputs: Artifact)

    public fun projectName(projectName: String)

    public fun runOrder(runOrder: Number)

    public fun type(type: JenkinsActionType)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.JenkinsAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.JenkinsAction.Builder.create()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun inputs(inputs: List<Artifact>) {
      cdkBuilder.inputs(inputs.map(Artifact::unwrap))
    }

    override fun inputs(vararg inputs: Artifact): Unit = inputs(inputs.toList())

    override fun jenkinsProvider(jenkinsProvider: IJenkinsProvider) {
      cdkBuilder.jenkinsProvider(jenkinsProvider.let(IJenkinsProvider::unwrap))
    }

    override fun outputs(outputs: List<Artifact>) {
      cdkBuilder.outputs(outputs.map(Artifact::unwrap))
    }

    override fun outputs(vararg outputs: Artifact): Unit = outputs(outputs.toList())

    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun type(type: JenkinsActionType) {
      cdkBuilder.type(type.let(JenkinsActionType::unwrap))
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.JenkinsAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JenkinsAction {
      val builderImpl = BuilderImpl()
      return JenkinsAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsAction):
        JenkinsAction = JenkinsAction(cdkObject)

    internal fun unwrap(wrapped: JenkinsAction):
        software.amazon.awscdk.services.codepipeline.actions.JenkinsAction = wrapped.cdkObject
  }
}
