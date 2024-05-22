@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * A CodePipeline source action for the CodeStar Connections source, which allows connecting to
 * GitHub and BitBucket.
 *
 * Example:
 *
 * ```
 * Artifact sourceOutput = new Artifact();
 * CodeStarConnectionsSourceAction sourceAction = CodeStarConnectionsSourceAction.Builder.create()
 * .actionName("BitBucket_Source")
 * .owner("aws")
 * .repo("aws-cdk")
 * .output(sourceOutput)
 * .connectionArn("arn:aws:codestar-connections:us-east-1:123456789012:connection/12345678-abcd-12ab-34cdef5678gh")
 * .build();
 * ```
 */
public open class CodeStarConnectionsSourceAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction,
) : Action(cdkObject) {
  public constructor(props: CodeStarConnectionsSourceActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction(props.let(CodeStarConnectionsSourceActionProps.Companion::unwrap))
  )

  public constructor(props: CodeStarConnectionsSourceActionProps.Builder.() -> Unit) :
      this(CodeStarConnectionsSourceActionProps(props)
  )

  /**
   * The variables emitted by this action.
   */
  public open fun variables(): CodeStarSourceVariables =
      unwrap(this).getVariables().let(CodeStarSourceVariables::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction].
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
     * The branch to build.
     *
     * Default: 'master'
     *
     * @param branch The branch to build. 
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
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodestarConnectionSource.html#action-reference-CodestarConnectionSource-config)
     * @param codeBuildCloneOutput Whether the output should be the contents of the repository
     * (which is the default), or a link that allows CodeBuild to clone the repository before building.
     * 
     */
    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean)

    /**
     * The ARN of the CodeStar Connection created in the AWS console that has permissions to access
     * this GitHub or BitBucket repository.
     *
     * Example:
     *
     * ```
     * "arn:aws:codestar-connections:us-east-1:123456789012:connection/12345678-abcd-12ab-34cdef5678gh";
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/connections-create.html)
     * @param connectionArn The ARN of the CodeStar Connection created in the AWS console that has
     * permissions to access this GitHub or BitBucket repository. 
     */
    public fun connectionArn(connectionArn: String)

    /**
     * The output artifact that this action produces.
     *
     * Can be used as input for further pipeline actions.
     *
     * @param output The output artifact that this action produces. 
     */
    public fun output(output: Artifact)

    /**
     * The owning user or organization of the repository.
     *
     * Example:
     *
     * ```
     * "aws";
     * ```
     *
     * @param owner The owning user or organization of the repository. 
     */
    public fun owner(owner: String)

    /**
     * The name of the repository.
     *
     * Example:
     *
     * ```
     * "aws-cdk";
     * ```
     *
     * @param repo The name of the repository. 
     */
    public fun repo(repo: String)

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
     * Controls automatically starting your pipeline when a new commit is made on the configured
     * repository and branch.
     *
     * If unspecified,
     * the default value is true, and the field does not display by default.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodestarConnectionSource.html)
     * @param triggerOnPush Controls automatically starting your pipeline when a new commit is made
     * on the configured repository and branch. 
     */
    public fun triggerOnPush(triggerOnPush: Boolean)

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
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction.Builder.create()

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
     * The branch to build.
     *
     * Default: 'master'
     *
     * @param branch The branch to build. 
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
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodestarConnectionSource.html#action-reference-CodestarConnectionSource-config)
     * @param codeBuildCloneOutput Whether the output should be the contents of the repository
     * (which is the default), or a link that allows CodeBuild to clone the repository before building.
     * 
     */
    override fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
      cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
    }

    /**
     * The ARN of the CodeStar Connection created in the AWS console that has permissions to access
     * this GitHub or BitBucket repository.
     *
     * Example:
     *
     * ```
     * "arn:aws:codestar-connections:us-east-1:123456789012:connection/12345678-abcd-12ab-34cdef5678gh";
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/connections-create.html)
     * @param connectionArn The ARN of the CodeStar Connection created in the AWS console that has
     * permissions to access this GitHub or BitBucket repository. 
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * The output artifact that this action produces.
     *
     * Can be used as input for further pipeline actions.
     *
     * @param output The output artifact that this action produces. 
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact.Companion::unwrap))
    }

    /**
     * The owning user or organization of the repository.
     *
     * Example:
     *
     * ```
     * "aws";
     * ```
     *
     * @param owner The owning user or organization of the repository. 
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    /**
     * The name of the repository.
     *
     * Example:
     *
     * ```
     * "aws-cdk";
     * ```
     *
     * @param repo The name of the repository. 
     */
    override fun repo(repo: String) {
      cdkBuilder.repo(repo)
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
     * Controls automatically starting your pipeline when a new commit is made on the configured
     * repository and branch.
     *
     * If unspecified,
     * the default value is true, and the field does not display by default.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodestarConnectionSource.html)
     * @param triggerOnPush Controls automatically starting your pipeline when a new commit is made
     * on the configured repository and branch. 
     */
    override fun triggerOnPush(triggerOnPush: Boolean) {
      cdkBuilder.triggerOnPush(triggerOnPush)
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

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeStarConnectionsSourceAction {
      val builderImpl = BuilderImpl()
      return CodeStarConnectionsSourceAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction):
        CodeStarConnectionsSourceAction = CodeStarConnectionsSourceAction(cdkObject)

    internal fun unwrap(wrapped: CodeStarConnectionsSourceAction):
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction =
        wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction
  }
}
