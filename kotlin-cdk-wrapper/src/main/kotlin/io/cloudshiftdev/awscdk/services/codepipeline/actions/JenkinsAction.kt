@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Jenkins build CodePipeline Action.
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
 *
 * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/tutorials-four-stage-pipeline.html)
 */
public open class JenkinsAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsAction,
) : Action(cdkObject) {
  public constructor(props: JenkinsActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.JenkinsAction(props.let(JenkinsActionProps::unwrap))
  )

  public constructor(props: JenkinsActionProps.Builder.() -> Unit) : this(JenkinsActionProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.actions.JenkinsAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    public fun actionName(actionName: String)

    /**
     * The source to use as input for this build.
     *
     * @param inputs The source to use as input for this build. 
     */
    public fun inputs(inputs: List<Artifact>)

    /**
     * The source to use as input for this build.
     *
     * @param inputs The source to use as input for this build. 
     */
    public fun inputs(vararg inputs: Artifact)

    /**
     * The Jenkins Provider for this Action.
     *
     * @param jenkinsProvider The Jenkins Provider for this Action. 
     */
    public fun jenkinsProvider(jenkinsProvider: IJenkinsProvider)

    /**
     * @param outputs 
     */
    public fun outputs(outputs: List<Artifact>)

    /**
     * @param outputs 
     */
    public fun outputs(vararg outputs: Artifact)

    /**
     * The name of the project (sometimes also called job, or task) on your Jenkins installation
     * that will be invoked by this Action.
     *
     * Example:
     *
     * ```
     * "MyJob";
     * ```
     *
     * @param projectName The name of the project (sometimes also called job, or task) on your
     * Jenkins installation that will be invoked by this Action. 
     */
    public fun projectName(projectName: String)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    public fun runOrder(runOrder: Number)

    /**
     * The type of the Action - Build, or Test.
     *
     * @param type The type of the Action - Build, or Test. 
     */
    public fun type(type: JenkinsActionType)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.JenkinsAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.JenkinsAction.Builder.create()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * The source to use as input for this build.
     *
     * @param inputs The source to use as input for this build. 
     */
    override fun inputs(inputs: List<Artifact>) {
      cdkBuilder.inputs(inputs.map(Artifact::unwrap))
    }

    /**
     * The source to use as input for this build.
     *
     * @param inputs The source to use as input for this build. 
     */
    override fun inputs(vararg inputs: Artifact): Unit = inputs(inputs.toList())

    /**
     * The Jenkins Provider for this Action.
     *
     * @param jenkinsProvider The Jenkins Provider for this Action. 
     */
    override fun jenkinsProvider(jenkinsProvider: IJenkinsProvider) {
      cdkBuilder.jenkinsProvider(jenkinsProvider.let(IJenkinsProvider::unwrap))
    }

    /**
     * @param outputs 
     */
    override fun outputs(outputs: List<Artifact>) {
      cdkBuilder.outputs(outputs.map(Artifact::unwrap))
    }

    /**
     * @param outputs 
     */
    override fun outputs(vararg outputs: Artifact): Unit = outputs(outputs.toList())

    /**
     * The name of the project (sometimes also called job, or task) on your Jenkins installation
     * that will be invoked by this Action.
     *
     * Example:
     *
     * ```
     * "MyJob";
     * ```
     *
     * @param projectName The name of the project (sometimes also called job, or task) on your
     * Jenkins installation that will be invoked by this Action. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * The type of the Action - Build, or Test.
     *
     * @param type The type of the Action - Build, or Test. 
     */
    override fun type(type: JenkinsActionType) {
      cdkBuilder.type(type.let(JenkinsActionType::unwrap))
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
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
        software.amazon.awscdk.services.codepipeline.actions.JenkinsAction = wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.JenkinsAction
  }
}
