@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * PipelineProject project;
 * Repository repository = Repository.Builder.create(this, "MyRepository")
 * .repositoryName("MyRepository")
 * .build();
 * PipelineProject project = new PipelineProject(this, "MyProject");
 * Artifact sourceOutput = new Artifact();
 * CodeCommitSourceAction sourceAction = CodeCommitSourceAction.Builder.create()
 * .actionName("CodeCommit")
 * .repository(repository)
 * .output(sourceOutput)
 * .build();
 * CodeBuildAction buildAction = CodeBuildAction.Builder.create()
 * .actionName("CodeBuild")
 * .project(project)
 * .input(sourceOutput)
 * .outputs(List.of(new Artifact())) // optional
 * .executeBatchBuild(true) // optional, defaults to false
 * .combineBatchBuildArtifacts(true)
 * .build();
 * Pipeline.Builder.create(this, "MyPipeline")
 * .stages(List.of(StageProps.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build(), StageProps.builder()
 * .stageName("Build")
 * .actions(List.of(buildAction))
 * .build()))
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
   * The customer managed key used to encrypt and decrypt the data in repository.
   *
   * Default: - Use an AWS managed key
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

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
     * @param kmsKey The customer managed key used to encrypt and decrypt the data in repository.
     */
    public fun kmsKey(kmsKey: IKey)

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
      cdkBuilder.code(code.let(Code.Companion::unwrap))
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
     * @param kmsKey The customer managed key used to encrypt and decrypt the data in repository.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
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
    cdkObject: software.amazon.awscdk.services.codecommit.RepositoryProps,
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
     * The customer managed key used to encrypt and decrypt the data in repository.
     *
     * Default: - Use an AWS managed key
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

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
        RepositoryProps = CdkObjectWrappers.wrap(cdkObject) as? RepositoryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryProps):
        software.amazon.awscdk.services.codecommit.RepositoryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codecommit.RepositoryProps
  }
}
