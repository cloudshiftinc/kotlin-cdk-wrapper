@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.IPipeline
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * CodePipeline action to invoke a pipeline.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * IPipeline targetPipeline = Pipeline.fromPipelineArn(this, "Pipeline",
 * "arn:aws:codepipeline:us-east-1:123456789012:InvokePipelineAction"); // If targetPipeline is not
 * created by cdk, import from arn.
 * pipeline.addStage(StageOptions.builder()
 * .stageName("stageName")
 * .actions(List.of(PipelineInvokeAction.Builder.create()
 * .actionName("Invoke")
 * .targetPipeline(targetPipeline)
 * .variables(List.of(Variable.builder()
 * .name("name1")
 * .value("value1")
 * .build()))
 * .sourceRevisions(List.of(SourceRevision.builder()
 * .actionName("Source")
 * .revisionType(RevisionType.S3_OBJECT_VERSION_ID)
 * .revisionValue("testRevisionValue")
 * .build()))
 * .build()))
 * .build());
 * ```
 */
public open class PipelineInvokeAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeAction,
) : Action(cdkObject) {
  public constructor(props: PipelineInvokeActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeAction(props.let(PipelineInvokeActionProps.Companion::unwrap))
  )

  public constructor(props: PipelineInvokeActionProps.Builder.() -> Unit) :
      this(PipelineInvokeActionProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.PipelineInvokeAction].
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
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    public fun role(role: IRole)

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
     * The source revisions that you want the target pipeline to use when it is started by the
     * invoking pipeline.
     *
     * Default: - no specific revisions
     *
     * @param sourceRevisions The source revisions that you want the target pipeline to use when it
     * is started by the invoking pipeline. 
     */
    public fun sourceRevisions(sourceRevisions: List<SourceRevision>)

    /**
     * The source revisions that you want the target pipeline to use when it is started by the
     * invoking pipeline.
     *
     * Default: - no specific revisions
     *
     * @param sourceRevisions The source revisions that you want the target pipeline to use when it
     * is started by the invoking pipeline. 
     */
    public fun sourceRevisions(vararg sourceRevisions: SourceRevision)

    /**
     * The pipeline that will, upon running, start the current target pipeline.
     *
     * You must have already created the invoking pipeline.
     *
     * @param targetPipeline The pipeline that will, upon running, start the current target
     * pipeline. 
     */
    public fun targetPipeline(targetPipeline: IPipeline)

    /**
     * The names and values of variables that you want the action to support.
     *
     * Default: - no specific variable
     *
     * @param variables The names and values of variables that you want the action to support. 
     */
    public fun variables(variables: List<Variable>)

    /**
     * The names and values of variables that you want the action to support.
     *
     * Default: - no specific variable
     *
     * @param variables The names and values of variables that you want the action to support. 
     */
    public fun variables(vararg variables: Variable)

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
        software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeAction.Builder.create()

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
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
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
     * The source revisions that you want the target pipeline to use when it is started by the
     * invoking pipeline.
     *
     * Default: - no specific revisions
     *
     * @param sourceRevisions The source revisions that you want the target pipeline to use when it
     * is started by the invoking pipeline. 
     */
    override fun sourceRevisions(sourceRevisions: List<SourceRevision>) {
      cdkBuilder.sourceRevisions(sourceRevisions.map(SourceRevision.Companion::unwrap))
    }

    /**
     * The source revisions that you want the target pipeline to use when it is started by the
     * invoking pipeline.
     *
     * Default: - no specific revisions
     *
     * @param sourceRevisions The source revisions that you want the target pipeline to use when it
     * is started by the invoking pipeline. 
     */
    override fun sourceRevisions(vararg sourceRevisions: SourceRevision): Unit =
        sourceRevisions(sourceRevisions.toList())

    /**
     * The pipeline that will, upon running, start the current target pipeline.
     *
     * You must have already created the invoking pipeline.
     *
     * @param targetPipeline The pipeline that will, upon running, start the current target
     * pipeline. 
     */
    override fun targetPipeline(targetPipeline: IPipeline) {
      cdkBuilder.targetPipeline(targetPipeline.let(IPipeline.Companion::unwrap))
    }

    /**
     * The names and values of variables that you want the action to support.
     *
     * Default: - no specific variable
     *
     * @param variables The names and values of variables that you want the action to support. 
     */
    override fun variables(variables: List<Variable>) {
      cdkBuilder.variables(variables.map(Variable.Companion::unwrap))
    }

    /**
     * The names and values of variables that you want the action to support.
     *
     * Default: - no specific variable
     *
     * @param variables The names and values of variables that you want the action to support. 
     */
    override fun variables(vararg variables: Variable): Unit = variables(variables.toList())

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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PipelineInvokeAction {
      val builderImpl = BuilderImpl()
      return PipelineInvokeAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeAction):
        PipelineInvokeAction = PipelineInvokeAction(cdkObject)

    internal fun unwrap(wrapped: PipelineInvokeAction):
        software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeAction =
        wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeAction
  }
}
