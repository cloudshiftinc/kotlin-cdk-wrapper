@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.codepipeline.IPipeline
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties of the `PipelineInvokeAction`.
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
public interface PipelineInvokeActionProps : CommonAwsActionProps {
  /**
   * The source revisions that you want the target pipeline to use when it is started by the
   * invoking pipeline.
   *
   * Default: - no specific revisions
   */
  public fun sourceRevisions(): List<SourceRevision> =
      unwrap(this).getSourceRevisions()?.map(SourceRevision::wrap) ?: emptyList()

  /**
   * The pipeline that will, upon running, start the current target pipeline.
   *
   * You must have already created the invoking pipeline.
   */
  public fun targetPipeline(): IPipeline

  /**
   * The names and values of variables that you want the action to support.
   *
   * Default: - no specific variable
   */
  public fun variables(): List<Variable> = unwrap(this).getVariables()?.map(Variable::wrap) ?:
      emptyList()

  /**
   * A builder for [PipelineInvokeActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole)

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param sourceRevisions The source revisions that you want the target pipeline to use when it
     * is started by the invoking pipeline.
     */
    public fun sourceRevisions(sourceRevisions: List<SourceRevision>)

    /**
     * @param sourceRevisions The source revisions that you want the target pipeline to use when it
     * is started by the invoking pipeline.
     */
    public fun sourceRevisions(vararg sourceRevisions: SourceRevision)

    /**
     * @param targetPipeline The pipeline that will, upon running, start the current target
     * pipeline. 
     * You must have already created the invoking pipeline.
     */
    public fun targetPipeline(targetPipeline: IPipeline)

    /**
     * @param variables The names and values of variables that you want the action to support.
     */
    public fun variables(variables: List<Variable>)

    /**
     * @param variables The names and values of variables that you want the action to support.
     */
    public fun variables(vararg variables: Variable)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param sourceRevisions The source revisions that you want the target pipeline to use when it
     * is started by the invoking pipeline.
     */
    override fun sourceRevisions(sourceRevisions: List<SourceRevision>) {
      cdkBuilder.sourceRevisions(sourceRevisions.map(SourceRevision.Companion::unwrap))
    }

    /**
     * @param sourceRevisions The source revisions that you want the target pipeline to use when it
     * is started by the invoking pipeline.
     */
    override fun sourceRevisions(vararg sourceRevisions: SourceRevision): Unit =
        sourceRevisions(sourceRevisions.toList())

    /**
     * @param targetPipeline The pipeline that will, upon running, start the current target
     * pipeline. 
     * You must have already created the invoking pipeline.
     */
    override fun targetPipeline(targetPipeline: IPipeline) {
      cdkBuilder.targetPipeline(targetPipeline.let(IPipeline.Companion::unwrap))
    }

    /**
     * @param variables The names and values of variables that you want the action to support.
     */
    override fun variables(variables: List<Variable>) {
      cdkBuilder.variables(variables.map(Variable.Companion::unwrap))
    }

    /**
     * @param variables The names and values of variables that you want the action to support.
     */
    override fun variables(vararg variables: Variable): Unit = variables(variables.toList())

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeActionProps,
  ) : CdkObject(cdkObject),
      PipelineInvokeActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

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
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

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
     * The source revisions that you want the target pipeline to use when it is started by the
     * invoking pipeline.
     *
     * Default: - no specific revisions
     */
    override fun sourceRevisions(): List<SourceRevision> =
        unwrap(this).getSourceRevisions()?.map(SourceRevision::wrap) ?: emptyList()

    /**
     * The pipeline that will, upon running, start the current target pipeline.
     *
     * You must have already created the invoking pipeline.
     */
    override fun targetPipeline(): IPipeline = unwrap(this).getTargetPipeline().let(IPipeline::wrap)

    /**
     * The names and values of variables that you want the action to support.
     *
     * Default: - no specific variable
     */
    override fun variables(): List<Variable> = unwrap(this).getVariables()?.map(Variable::wrap) ?:
        emptyList()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): PipelineInvokeActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeActionProps):
        PipelineInvokeActionProps = CdkObjectWrappers.wrap(cdkObject) as? PipelineInvokeActionProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: PipelineInvokeActionProps):
        software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.PipelineInvokeActionProps
  }
}
