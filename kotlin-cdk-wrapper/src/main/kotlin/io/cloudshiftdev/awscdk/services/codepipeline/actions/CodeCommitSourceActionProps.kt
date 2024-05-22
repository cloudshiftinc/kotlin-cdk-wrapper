@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codecommit.IRepository
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Construction properties of the `CodeCommitSourceAction CodeCommit source CodePipeline Action`.
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
public interface CodeCommitSourceActionProps : CommonAwsActionProps {
  /**
   * Default: 'master'
   */
  public fun branch(): String? = unwrap(this).getBranch()

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
   */
  public fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

  /**
   * You can pass a `customEventRule` to set up a custom event rule for the CodeCommit source
   * action.
   *
   * You must provide the `eventPattern` and `target` properties in the `customEventRule` object.
   * Check which `eventPattern` to use:
   * https://docs.aws.amazon.com/codecommit/latest/userguide/monitoring-events.html
   *
   * Default: Event rule which is triggered by CodeCommit repository on commit
   */
  public fun customEventRule(): ICustomEventRule? =
      unwrap(this).getCustomEventRule()?.let(ICustomEventRule::wrap)

  /**
   * Role to be used by on commit event rule.
   *
   * Used only when trigger value is CodeCommitTrigger.EVENTS.
   *
   * Default: a new role will be created.
   */
  public fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

  /**
   *
   */
  public fun output(): Artifact

  /**
   * The CodeCommit repository.
   */
  public fun repository(): IRepository

  /**
   * How should CodePipeline detect source changes for this Action.
   *
   * Default: CodeCommitTrigger.EVENTS
   */
  public fun trigger(): CodeCommitTrigger? = unwrap(this).getTrigger()?.let(CodeCommitTrigger::wrap)

  /**
   * A builder for [CodeCommitSourceActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param branch the value to be set.
     */
    public fun branch(branch: String)

    /**
     * @param codeBuildCloneOutput Whether the output should be the contents of the repository
     * (which is the default), or a link that allows CodeBuild to clone the repository before building.
     * **Note**: if this option is true,
     * then only CodeBuild actions can use the resulting `output`.
     */
    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean)

    /**
     * @param customEventRule You can pass a `customEventRule` to set up a custom event rule for the
     * CodeCommit source action.
     * You must provide the `eventPattern` and `target` properties in the `customEventRule` object.
     * Check which `eventPattern` to use:
     * https://docs.aws.amazon.com/codecommit/latest/userguide/monitoring-events.html
     */
    public fun customEventRule(customEventRule: ICustomEventRule)

    /**
     * @param eventRole Role to be used by on commit event rule.
     * Used only when trigger value is CodeCommitTrigger.EVENTS.
     */
    public fun eventRole(eventRole: IRole)

    /**
     * @param output the value to be set. 
     */
    public fun output(output: Artifact)

    /**
     * @param repository The CodeCommit repository. 
     */
    public fun repository(repository: IRepository)

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
     * @param trigger How should CodePipeline detect source changes for this Action.
     */
    public fun trigger(trigger: CodeCommitTrigger)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param branch the value to be set.
     */
    override fun branch(branch: String) {
      cdkBuilder.branch(branch)
    }

    /**
     * @param codeBuildCloneOutput Whether the output should be the contents of the repository
     * (which is the default), or a link that allows CodeBuild to clone the repository before building.
     * **Note**: if this option is true,
     * then only CodeBuild actions can use the resulting `output`.
     */
    override fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
      cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
    }

    /**
     * @param customEventRule You can pass a `customEventRule` to set up a custom event rule for the
     * CodeCommit source action.
     * You must provide the `eventPattern` and `target` properties in the `customEventRule` object.
     * Check which `eventPattern` to use:
     * https://docs.aws.amazon.com/codecommit/latest/userguide/monitoring-events.html
     */
    override fun customEventRule(customEventRule: ICustomEventRule) {
      cdkBuilder.customEventRule(customEventRule.let(ICustomEventRule.Companion::unwrap))
    }

    /**
     * @param eventRole Role to be used by on commit event rule.
     * Used only when trigger value is CodeCommitTrigger.EVENTS.
     */
    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param output the value to be set. 
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact.Companion::unwrap))
    }

    /**
     * @param repository The CodeCommit repository. 
     */
    override fun repository(repository: IRepository) {
      cdkBuilder.repository(repository.let(IRepository.Companion::unwrap))
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
     * @param trigger How should CodePipeline detect source changes for this Action.
     */
    override fun trigger(trigger: CodeCommitTrigger) {
      cdkBuilder.trigger(trigger.let(CodeCommitTrigger.Companion::unwrap))
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps,
  ) : CdkObject(cdkObject), CodeCommitSourceActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * Default: 'master'
     */
    override fun branch(): String? = unwrap(this).getBranch()

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
     */
    override fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

    /**
     * You can pass a `customEventRule` to set up a custom event rule for the CodeCommit source
     * action.
     *
     * You must provide the `eventPattern` and `target` properties in the `customEventRule` object.
     * Check which `eventPattern` to use:
     * https://docs.aws.amazon.com/codecommit/latest/userguide/monitoring-events.html
     *
     * Default: Event rule which is triggered by CodeCommit repository on commit
     */
    override fun customEventRule(): ICustomEventRule? =
        unwrap(this).getCustomEventRule()?.let(ICustomEventRule::wrap)

    /**
     * Role to be used by on commit event rule.
     *
     * Used only when trigger value is CodeCommitTrigger.EVENTS.
     *
     * Default: a new role will be created.
     */
    override fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

    /**
     *
     */
    override fun output(): Artifact = unwrap(this).getOutput().let(Artifact::wrap)

    /**
     * The CodeCommit repository.
     */
    override fun repository(): IRepository = unwrap(this).getRepository().let(IRepository::wrap)

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
     * How should CodePipeline detect source changes for this Action.
     *
     * Default: CodeCommitTrigger.EVENTS
     */
    override fun trigger(): CodeCommitTrigger? =
        unwrap(this).getTrigger()?.let(CodeCommitTrigger::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeCommitSourceActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps):
        CodeCommitSourceActionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CodeCommitSourceActionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeCommitSourceActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps
  }
}
