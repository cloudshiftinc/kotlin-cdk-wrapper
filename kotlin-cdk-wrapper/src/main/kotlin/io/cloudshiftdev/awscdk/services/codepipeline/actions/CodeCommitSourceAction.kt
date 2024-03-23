@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codecommit.IRepository
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * CodePipeline Source that is provided by an AWS CodeCommit repository.
 *
 * If the CodeCommit repository is in a different account, you must use
 * `CodeCommitTrigger.EVENTS` to trigger the pipeline.
 *
 * (That is because the Pipeline structure normally only has a `RepositoryName`
 * field, and that is not enough for the pipeline to locate the repository's
 * source account. However, if the pipeline is triggered via an EventBridge
 * event, the event itself has the full repository ARN in there, allowing the
 * pipeline to locate the repository).
 *
 * Example:
 *
 * ```
 * // Source stage: read from repository
 * Repository repo = Repository.Builder.create(stack, "TemplateRepo")
 * .repositoryName("template-repo")
 * .build();
 * Artifact sourceOutput = new Artifact("SourceArtifact");
 * CodeCommitSourceAction source = CodeCommitSourceAction.Builder.create()
 * .actionName("Source")
 * .repository(repo)
 * .output(sourceOutput)
 * .trigger(CodeCommitTrigger.POLL)
 * .build();
 * Map&lt;String, Object&gt; sourceStage = Map.of(
 * "stageName", "Source",
 * "actions", List.of(source));
 * // Deployment stage: create and deploy changeset with manual approval
 * String stackName = "OurStack";
 * String changeSetName = "StagedChangeSet";
 * Map&lt;String, Object&gt; prodStage = Map.of(
 * "stageName", "Deploy",
 * "actions", List.of(
 * CloudFormationCreateReplaceChangeSetAction.Builder.create()
 * .actionName("PrepareChanges")
 * .stackName(stackName)
 * .changeSetName(changeSetName)
 * .adminPermissions(true)
 * .templatePath(sourceOutput.atPath("template.yaml"))
 * .runOrder(1)
 * .build(),
 * ManualApprovalAction.Builder.create()
 * .actionName("ApproveChanges")
 * .runOrder(2)
 * .build(),
 * CloudFormationExecuteChangeSetAction.Builder.create()
 * .actionName("ExecuteChanges")
 * .stackName(stackName)
 * .changeSetName(changeSetName)
 * .runOrder(3)
 * .build()));
 * Pipeline.Builder.create(stack, "Pipeline")
 * .crossAccountKeys(true)
 * .stages(List.of(sourceStage, prodStage))
 * .build();
 * ```
 */
public open class CodeCommitSourceAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction,
) : Action(cdkObject) {
  public constructor(props: CodeCommitSourceActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction(props.let(CodeCommitSourceActionProps::unwrap))
  )

  public constructor(props: CodeCommitSourceActionProps.Builder.() -> Unit) :
      this(CodeCommitSourceActionProps(props)
  )

  /**
   * The variables emitted by this action.
   */
  public open fun variables(): CodeCommitSourceVariables =
      unwrap(this).getVariables().let(CodeCommitSourceVariables::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.CodeCommitSourceAction].
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
     * Default: 'master'
     *
     * @param branch 
     */
    public fun branch(branch: String)

    /**
     * Whether the output should be the contents of the repository (which is the default), or a link
     * that allows CodeBuild to clone the repository before building.
     *
     * **Note**: if this option is true,
     * then only CodeBuild actions can use the resulting `output`.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeCommit.html)
     * @param codeBuildCloneOutput Whether the output should be the contents of the repository
     * (which is the default), or a link that allows CodeBuild to clone the repository before building.
     * 
     */
    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean)

    /**
     * You can pass a `customEventRule` to set up a custom event rule for the CodeCommit source
     * action.
     *
     * You must provide the `eventPattern` and `target` properties in the `customEventRule` object.
     * Check which `eventPattern` to use:
     * https://docs.aws.amazon.com/codecommit/latest/userguide/monitoring-events.html
     *
     * Default: Event rule which is triggered by CodeCommit repository on commit
     *
     * @param customEventRule You can pass a `customEventRule` to set up a custom event rule for the
     * CodeCommit source action. 
     */
    public fun customEventRule(customEventRule: ICustomEventRule)

    /**
     * Role to be used by on commit event rule.
     *
     * Used only when trigger value is CodeCommitTrigger.EVENTS.
     *
     * Default: a new role will be created.
     *
     * @param eventRole Role to be used by on commit event rule. 
     */
    public fun eventRole(eventRole: IRole)

    /**
     * @param output 
     */
    public fun output(output: Artifact)

    /**
     * The CodeCommit repository.
     *
     * @param repository The CodeCommit repository. 
     */
    public fun repository(repository: IRepository)

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
     * How should CodePipeline detect source changes for this Action.
     *
     * Default: CodeCommitTrigger.EVENTS
     *
     * @param trigger How should CodePipeline detect source changes for this Action. 
     */
    public fun trigger(trigger: CodeCommitTrigger)

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
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction.Builder.create()

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
     * Default: 'master'
     *
     * @param branch 
     */
    override fun branch(branch: String) {
      cdkBuilder.branch(branch)
    }

    /**
     * Whether the output should be the contents of the repository (which is the default), or a link
     * that allows CodeBuild to clone the repository before building.
     *
     * **Note**: if this option is true,
     * then only CodeBuild actions can use the resulting `output`.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeCommit.html)
     * @param codeBuildCloneOutput Whether the output should be the contents of the repository
     * (which is the default), or a link that allows CodeBuild to clone the repository before building.
     * 
     */
    override fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
      cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
    }

    /**
     * You can pass a `customEventRule` to set up a custom event rule for the CodeCommit source
     * action.
     *
     * You must provide the `eventPattern` and `target` properties in the `customEventRule` object.
     * Check which `eventPattern` to use:
     * https://docs.aws.amazon.com/codecommit/latest/userguide/monitoring-events.html
     *
     * Default: Event rule which is triggered by CodeCommit repository on commit
     *
     * @param customEventRule You can pass a `customEventRule` to set up a custom event rule for the
     * CodeCommit source action. 
     */
    override fun customEventRule(customEventRule: ICustomEventRule) {
      cdkBuilder.customEventRule(customEventRule.let(ICustomEventRule::unwrap))
    }

    /**
     * Role to be used by on commit event rule.
     *
     * Used only when trigger value is CodeCommitTrigger.EVENTS.
     *
     * Default: a new role will be created.
     *
     * @param eventRole Role to be used by on commit event rule. 
     */
    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole::unwrap))
    }

    /**
     * @param output 
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    /**
     * The CodeCommit repository.
     *
     * @param repository The CodeCommit repository. 
     */
    override fun repository(repository: IRepository) {
      cdkBuilder.repository(repository.let(IRepository::unwrap))
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
      cdkBuilder.role(role.let(IRole::unwrap))
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
     * How should CodePipeline detect source changes for this Action.
     *
     * Default: CodeCommitTrigger.EVENTS
     *
     * @param trigger How should CodePipeline detect source changes for this Action. 
     */
    override fun trigger(trigger: CodeCommitTrigger) {
      cdkBuilder.trigger(trigger.let(CodeCommitTrigger::unwrap))
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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeCommitSourceAction {
      val builderImpl = BuilderImpl()
      return CodeCommitSourceAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction):
        CodeCommitSourceAction = CodeCommitSourceAction(cdkObject)

    internal fun unwrap(wrapped: CodeCommitSourceAction):
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction =
        wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction
  }
}
