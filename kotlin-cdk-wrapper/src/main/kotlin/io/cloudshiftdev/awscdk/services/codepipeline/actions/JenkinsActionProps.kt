@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonActionProps
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface JenkinsActionProps : CommonActionProps {
  public fun inputs(): List<Artifact> = unwrap(this).getInputs()?.map(Artifact::wrap) ?: emptyList()

  public fun jenkinsProvider(): IJenkinsProvider

  public fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
      emptyList()

  public fun projectName(): String

  public fun type(): JenkinsActionType

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
        software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps.builder()

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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps,
  ) : CdkObject(cdkObject), JenkinsActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun inputs(): List<Artifact> = unwrap(this).getInputs()?.map(Artifact::wrap) ?:
        emptyList()

    override fun jenkinsProvider(): IJenkinsProvider =
        unwrap(this).getJenkinsProvider().let(IJenkinsProvider::wrap)

    override fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
        emptyList()

    override fun projectName(): String = unwrap(this).getProjectName()

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun type(): JenkinsActionType = unwrap(this).getType().let(JenkinsActionType::wrap)

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JenkinsActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps):
        JenkinsActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: JenkinsActionProps):
        software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps
  }
}
