package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ConnectionSourceOptions {
  /**
   * The action name used for this source in the CodePipeline.
   *
   * Default: - The repository string
   */
  public fun actionName(): String? = unwrap(this).getActionName()

  /**
   * If this is set, the next CodeBuild job clones the repository (instead of CodePipeline
   * downloading the files).
   *
   * This provides access to repository history, and retains symlinks (symlinks would otherwise be
   * removed by CodePipeline).
   *
   * **Note**: if this option is true, only CodeBuild jobs can use the output artifact.
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
   * A builder for [ConnectionSourceOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The action name used for this source in the CodePipeline.
     */
    public fun actionName(actionName: String)

    /**
     * @param codeBuildCloneOutput If this is set, the next CodeBuild job clones the repository
     * (instead of CodePipeline downloading the files).
     * This provides access to repository history, and retains symlinks (symlinks would otherwise be
     * removed by CodePipeline).
     *
     * **Note**: if this option is true, only CodeBuild jobs can use the output artifact.
     */
    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean)

    /**
     * @param connectionArn The ARN of the CodeStar Connection created in the AWS console that has
     * permissions to access this GitHub or BitBucket repository. 
     */
    public fun connectionArn(connectionArn: String)

    /**
     * @param triggerOnPush Controls automatically starting your pipeline when a new commit is made
     * on the configured repository and branch.
     * If unspecified,
     * the default value is true, and the field does not display by default.
     */
    public fun triggerOnPush(triggerOnPush: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ConnectionSourceOptions.Builder =
        software.amazon.awscdk.pipelines.ConnectionSourceOptions.builder()

    /**
     * @param actionName The action name used for this source in the CodePipeline.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param codeBuildCloneOutput If this is set, the next CodeBuild job clones the repository
     * (instead of CodePipeline downloading the files).
     * This provides access to repository history, and retains symlinks (symlinks would otherwise be
     * removed by CodePipeline).
     *
     * **Note**: if this option is true, only CodeBuild jobs can use the output artifact.
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
     * @param triggerOnPush Controls automatically starting your pipeline when a new commit is made
     * on the configured repository and branch.
     * If unspecified,
     * the default value is true, and the field does not display by default.
     */
    override fun triggerOnPush(triggerOnPush: Boolean) {
      cdkBuilder.triggerOnPush(triggerOnPush)
    }

    public fun build(): software.amazon.awscdk.pipelines.ConnectionSourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.ConnectionSourceOptions,
  ) : CdkObject(cdkObject), ConnectionSourceOptions {
    /**
     * The action name used for this source in the CodePipeline.
     *
     * Default: - The repository string
     */
    override fun actionName(): String? = unwrap(this).getActionName()

    /**
     * If this is set, the next CodeBuild job clones the repository (instead of CodePipeline
     * downloading the files).
     *
     * This provides access to repository history, and retains symlinks (symlinks would otherwise be
     * removed by CodePipeline).
     *
     * **Note**: if this option is true, only CodeBuild jobs can use the output artifact.
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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionSourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ConnectionSourceOptions):
        ConnectionSourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConnectionSourceOptions):
        software.amazon.awscdk.pipelines.ConnectionSourceOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.pipelines.ConnectionSourceOptions
  }
}
