@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
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
public interface RepositoryProps {
  /**
   * The contents with which to initialize the repository after it has been created.
   *
   * Default: - No initialization (create empty repo)
   */
  public fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

  /**
   * A description of the repository.
   *
   * Use the description to identify the
   * purpose of the repository.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Name of the repository.
   *
   * This property is required for all CodeCommit repositories.
   */
  public fun repositoryName(): String

  /**
   * A builder for [RepositoryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param code The contents with which to initialize the repository after it has been created.
     */
    public fun code(code: Code)

    /**
     * @param description A description of the repository.
     * Use the description to identify the
     * purpose of the repository.
     */
    public fun description(description: String)

    /**
     * @param repositoryName Name of the repository. 
     * This property is required for all CodeCommit repositories.
     */
    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codecommit.RepositoryProps.Builder =
        software.amazon.awscdk.services.codecommit.RepositoryProps.builder()

    /**
     * @param code The contents with which to initialize the repository after it has been created.
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    /**
     * @param description A description of the repository.
     * Use the description to identify the
     * purpose of the repository.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param repositoryName Name of the repository. 
     * This property is required for all CodeCommit repositories.
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.services.codecommit.RepositoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codecommit.RepositoryProps,
  ) : CdkObject(cdkObject), RepositoryProps {
    /**
     * The contents with which to initialize the repository after it has been created.
     *
     * Default: - No initialization (create empty repo)
     */
    override fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

    /**
     * A description of the repository.
     *
     * Use the description to identify the
     * purpose of the repository.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Name of the repository.
     *
     * This property is required for all CodeCommit repositories.
     */
    override fun repositoryName(): String = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.RepositoryProps):
        RepositoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryProps):
        software.amazon.awscdk.services.codecommit.RepositoryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codecommit.RepositoryProps
  }
}
