@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.actions.CodeCommitTrigger
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Configuration options for a CodeCommit source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.pipelines.*;
 * Role role;
 * CodeCommitSourceOptions codeCommitSourceOptions = CodeCommitSourceOptions.builder()
 * .actionName("actionName")
 * .codeBuildCloneOutput(false)
 * .eventRole(role)
 * .trigger(CodeCommitTrigger.NONE)
 * .build();
 * ```
 */
public interface CodeCommitSourceOptions {
  /**
   * The action name used for this source in the CodePipeline.
   *
   * Default: - The repository name
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
   * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeCommit.html)
   */
  public fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

  /**
   * Role to be used by on commit event rule.
   *
   * Used only when trigger value is CodeCommitTrigger.EVENTS.
   *
   * Default: a new role will be created.
   */
  public fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

  /**
   * How should CodePipeline detect source changes for this Action.
   *
   * Default: CodeCommitTrigger.EVENTS
   */
  public fun trigger(): CodeCommitTrigger? = unwrap(this).getTrigger()?.let(CodeCommitTrigger::wrap)

  /**
   * A builder for [CodeCommitSourceOptions]
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
     * @param eventRole Role to be used by on commit event rule.
     * Used only when trigger value is CodeCommitTrigger.EVENTS.
     */
    public fun eventRole(eventRole: IRole)

    /**
     * @param trigger How should CodePipeline detect source changes for this Action.
     */
    public fun trigger(trigger: CodeCommitTrigger)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodeCommitSourceOptions.Builder =
        software.amazon.awscdk.pipelines.CodeCommitSourceOptions.builder()

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
     * @param eventRole Role to be used by on commit event rule.
     * Used only when trigger value is CodeCommitTrigger.EVENTS.
     */
    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole::unwrap))
    }

    /**
     * @param trigger How should CodePipeline detect source changes for this Action.
     */
    override fun trigger(trigger: CodeCommitTrigger) {
      cdkBuilder.trigger(trigger.let(CodeCommitTrigger::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.CodeCommitSourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.CodeCommitSourceOptions,
  ) : CdkObject(cdkObject), CodeCommitSourceOptions {
    /**
     * The action name used for this source in the CodePipeline.
     *
     * Default: - The repository name
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
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeCommit.html)
     */
    override fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

    /**
     * Role to be used by on commit event rule.
     *
     * Used only when trigger value is CodeCommitTrigger.EVENTS.
     *
     * Default: a new role will be created.
     */
    override fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

    /**
     * How should CodePipeline detect source changes for this Action.
     *
     * Default: CodeCommitTrigger.EVENTS
     */
    override fun trigger(): CodeCommitTrigger? =
        unwrap(this).getTrigger()?.let(CodeCommitTrigger::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeCommitSourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodeCommitSourceOptions):
        CodeCommitSourceOptions = CdkObjectWrappers.wrap(cdkObject) as CodeCommitSourceOptions

    internal fun unwrap(wrapped: CodeCommitSourceOptions):
        software.amazon.awscdk.pipelines.CodeCommitSourceOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.pipelines.CodeCommitSourceOptions
  }
}
