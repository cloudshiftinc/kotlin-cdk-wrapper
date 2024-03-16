@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for `CodeStarConnectionsSourceAction`.
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
public interface CodeStarConnectionsSourceActionProps : CommonAwsActionProps {
  /**
   * The branch to build.
   *
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
   * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodestarConnectionSource.html#action-reference-CodestarConnectionSource-config)
   */
  public fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

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
   */
  public fun connectionArn(): String

  /**
   * The output artifact that this action produces.
   *
   * Can be used as input for further pipeline actions.
   */
  public fun output(): Artifact

  /**
   * The owning user or organization of the repository.
   *
   * Example:
   *
   * ```
   * "aws";
   * ```
   */
  public fun owner(): String

  /**
   * The name of the repository.
   *
   * Example:
   *
   * ```
   * "aws-cdk";
   * ```
   */
  public fun repo(): String

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
   */
  public fun triggerOnPush(): Boolean? = unwrap(this).getTriggerOnPush()

  /**
   * A builder for [CodeStarConnectionsSourceActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param branch The branch to build.
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
     * @param connectionArn The ARN of the CodeStar Connection created in the AWS console that has
     * permissions to access this GitHub or BitBucket repository. 
     */
    public fun connectionArn(connectionArn: String)

    /**
     * @param output The output artifact that this action produces. 
     * Can be used as input for further pipeline actions.
     */
    public fun output(output: Artifact)

    /**
     * @param owner The owning user or organization of the repository. 
     */
    public fun owner(owner: String)

    /**
     * @param repo The name of the repository. 
     */
    public fun repo(repo: String)

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
     * @param triggerOnPush Controls automatically starting your pipeline when a new commit is made
     * on the configured repository and branch.
     * If unspecified,
     * the default value is true, and the field does not display by default.
     */
    public fun triggerOnPush(triggerOnPush: Boolean)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param branch The branch to build.
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
     * @param connectionArn The ARN of the CodeStar Connection created in the AWS console that has
     * permissions to access this GitHub or BitBucket repository. 
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * @param output The output artifact that this action produces. 
     * Can be used as input for further pipeline actions.
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    /**
     * @param owner The owning user or organization of the repository. 
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    /**
     * @param repo The name of the repository. 
     */
    override fun repo(repo: String) {
      cdkBuilder.repo(repo)
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
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param triggerOnPush Controls automatically starting your pipeline when a new commit is made
     * on the configured repository and branch.
     * If unspecified,
     * the default value is true, and the field does not display by default.
     */
    override fun triggerOnPush(triggerOnPush: Boolean) {
      cdkBuilder.triggerOnPush(triggerOnPush)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps,
  ) : CdkObject(cdkObject), CodeStarConnectionsSourceActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The branch to build.
     *
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
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodestarConnectionSource.html#action-reference-CodestarConnectionSource-config)
     */
    override fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

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
     */
    override fun connectionArn(): String = unwrap(this).getConnectionArn()

    /**
     * The output artifact that this action produces.
     *
     * Can be used as input for further pipeline actions.
     */
    override fun output(): Artifact = unwrap(this).getOutput().let(Artifact::wrap)

    /**
     * The owning user or organization of the repository.
     *
     * Example:
     *
     * ```
     * "aws";
     * ```
     */
    override fun owner(): String = unwrap(this).getOwner()

    /**
     * The name of the repository.
     *
     * Example:
     *
     * ```
     * "aws-cdk";
     * ```
     */
    override fun repo(): String = unwrap(this).getRepo()

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
     * Controls automatically starting your pipeline when a new commit is made on the configured
     * repository and branch.
     *
     * If unspecified,
     * the default value is true, and the field does not display by default.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodestarConnectionSource.html)
     */
    override fun triggerOnPush(): Boolean? = unwrap(this).getTriggerOnPush()

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
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CodeStarConnectionsSourceActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps):
        CodeStarConnectionsSourceActionProps = CdkObjectWrappers.wrap(cdkObject) as
        CodeStarConnectionsSourceActionProps

    internal fun unwrap(wrapped: CodeStarConnectionsSourceActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps
  }
}
