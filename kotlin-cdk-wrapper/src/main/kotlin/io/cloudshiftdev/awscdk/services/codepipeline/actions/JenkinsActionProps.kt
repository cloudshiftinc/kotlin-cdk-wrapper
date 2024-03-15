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

/**
 * Construction properties of `JenkinsAction`.
 *
 * Example:
 *
 * ```
 * JenkinsProvider jenkinsProvider;
 * JenkinsAction buildAction = JenkinsAction.Builder.create()
 * .actionName("JenkinsBuild")
 * .jenkinsProvider(jenkinsProvider)
 * .projectName("MyProject")
 * .type(JenkinsActionType.BUILD)
 * .build();
 * ```
 */
public interface JenkinsActionProps : CommonActionProps {
  /**
   * The source to use as input for this build.
   */
  public fun inputs(): List<Artifact> = unwrap(this).getInputs()?.map(Artifact::wrap) ?: emptyList()

  /**
   * The Jenkins Provider for this Action.
   */
  public fun jenkinsProvider(): IJenkinsProvider

  /**
   *
   */
  public fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
      emptyList()

  /**
   * The name of the project (sometimes also called job, or task) on your Jenkins installation that
   * will be invoked by this Action.
   *
   * Example:
   *
   * ```
   * "MyJob";
   * ```
   */
  public fun projectName(): String

  /**
   * The type of the Action - Build, or Test.
   */
  public fun type(): JenkinsActionType

  /**
   * A builder for [JenkinsActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param inputs The source to use as input for this build.
     */
    public fun inputs(inputs: List<Artifact>)

    /**
     * @param inputs The source to use as input for this build.
     */
    public fun inputs(vararg inputs: Artifact)

    /**
     * @param jenkinsProvider The Jenkins Provider for this Action. 
     */
    public fun jenkinsProvider(jenkinsProvider: IJenkinsProvider)

    /**
     * @param outputs the value to be set.
     */
    public fun outputs(outputs: List<Artifact>)

    /**
     * @param outputs the value to be set.
     */
    public fun outputs(vararg outputs: Artifact)

    /**
     * @param projectName The name of the project (sometimes also called job, or task) on your
     * Jenkins installation that will be invoked by this Action. 
     */
    public fun projectName(projectName: String)

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param type The type of the Action - Build, or Test. 
     */
    public fun type(type: JenkinsActionType)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param inputs The source to use as input for this build.
     */
    override fun inputs(inputs: List<Artifact>) {
      cdkBuilder.inputs(inputs.map(Artifact::unwrap))
    }

    /**
     * @param inputs The source to use as input for this build.
     */
    override fun inputs(vararg inputs: Artifact): Unit = inputs(inputs.toList())

    /**
     * @param jenkinsProvider The Jenkins Provider for this Action. 
     */
    override fun jenkinsProvider(jenkinsProvider: IJenkinsProvider) {
      cdkBuilder.jenkinsProvider(jenkinsProvider.let(IJenkinsProvider::unwrap))
    }

    /**
     * @param outputs the value to be set.
     */
    override fun outputs(outputs: List<Artifact>) {
      cdkBuilder.outputs(outputs.map(Artifact::unwrap))
    }

    /**
     * @param outputs the value to be set.
     */
    override fun outputs(vararg outputs: Artifact): Unit = outputs(outputs.toList())

    /**
     * @param projectName The name of the project (sometimes also called job, or task) on your
     * Jenkins installation that will be invoked by this Action. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param type The type of the Action - Build, or Test. 
     */
    override fun type(type: JenkinsActionType) {
      cdkBuilder.type(type.let(JenkinsActionType::unwrap))
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps,
  ) : CdkObject(cdkObject), JenkinsActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The source to use as input for this build.
     */
    override fun inputs(): List<Artifact> = unwrap(this).getInputs()?.map(Artifact::wrap) ?:
        emptyList()

    /**
     * The Jenkins Provider for this Action.
     */
    override fun jenkinsProvider(): IJenkinsProvider =
        unwrap(this).getJenkinsProvider().let(IJenkinsProvider::wrap)

    /**
     *
     */
    override fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
        emptyList()

    /**
     * The name of the project (sometimes also called job, or task) on your Jenkins installation
     * that will be invoked by this Action.
     *
     * Example:
     *
     * ```
     * "MyJob";
     * ```
     */
    override fun projectName(): String = unwrap(this).getProjectName()

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     */
    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    /**
     * The type of the Action - Build, or Test.
     */
    override fun type(): JenkinsActionType = unwrap(this).getType().let(JenkinsActionType::wrap)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
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
