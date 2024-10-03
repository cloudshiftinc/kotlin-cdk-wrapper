@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codecommit.IRepository
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for `CodeCommitSource`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.codecommit.*;
 * Repository repo;
 * Bucket bucket;
 * Project project = Project.Builder.create(this, "MyProject")
 * .secondarySources(List.of(Source.codeCommit(CodeCommitSourceProps.builder()
 * .identifier("source2")
 * .repository(repo)
 * .build())))
 * .secondaryArtifacts(List.of(Artifacts.s3(S3ArtifactsProps.builder()
 * .identifier("artifact2")
 * .bucket(bucket)
 * .path("some/path")
 * .name("file.zip")
 * .build())))
 * .build();
 * ```
 */
public interface CodeCommitSourceProps : SourceProps {
  /**
   * The commit ID, pull request ID, branch name, or tag name that corresponds to the version of the
   * source code you want to build.
   *
   * Default: the default branch's HEAD commit ID is used
   *
   * Example:
   *
   * ```
   * "mybranch";
   * ```
   */
  public fun branchOrRef(): String? = unwrap(this).getBranchOrRef()

  /**
   * The depth of history to download.
   *
   * Minimum value is 0.
   * If this value is 0, greater than 25, or not provided,
   * then the full history is downloaded with each build of the project.
   */
  public fun cloneDepth(): Number? = unwrap(this).getCloneDepth()

  /**
   * Whether to fetch submodules while cloning git repo.
   *
   * Default: false
   */
  public fun fetchSubmodules(): Boolean? = unwrap(this).getFetchSubmodules()

  /**
   *
   */
  public fun repository(): IRepository

  /**
   * A builder for [CodeCommitSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param branchOrRef The commit ID, pull request ID, branch name, or tag name that corresponds
     * to the version of the source code you want to build.
     */
    public fun branchOrRef(branchOrRef: String)

    /**
     * @param cloneDepth The depth of history to download.
     * Minimum value is 0.
     * If this value is 0, greater than 25, or not provided,
     * then the full history is downloaded with each build of the project.
     */
    public fun cloneDepth(cloneDepth: Number)

    /**
     * @param fetchSubmodules Whether to fetch submodules while cloning git repo.
     */
    public fun fetchSubmodules(fetchSubmodules: Boolean)

    /**
     * @param identifier The source identifier.
     * This property is required on secondary sources.
     */
    public fun identifier(identifier: String)

    /**
     * @param repository the value to be set. 
     */
    public fun repository(repository: IRepository)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.Builder
        = software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.builder()

    /**
     * @param branchOrRef The commit ID, pull request ID, branch name, or tag name that corresponds
     * to the version of the source code you want to build.
     */
    override fun branchOrRef(branchOrRef: String) {
      cdkBuilder.branchOrRef(branchOrRef)
    }

    /**
     * @param cloneDepth The depth of history to download.
     * Minimum value is 0.
     * If this value is 0, greater than 25, or not provided,
     * then the full history is downloaded with each build of the project.
     */
    override fun cloneDepth(cloneDepth: Number) {
      cdkBuilder.cloneDepth(cloneDepth)
    }

    /**
     * @param fetchSubmodules Whether to fetch submodules while cloning git repo.
     */
    override fun fetchSubmodules(fetchSubmodules: Boolean) {
      cdkBuilder.fetchSubmodules(fetchSubmodules)
    }

    /**
     * @param identifier The source identifier.
     * This property is required on secondary sources.
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    /**
     * @param repository the value to be set. 
     */
    override fun repository(repository: IRepository) {
      cdkBuilder.repository(repository.let(IRepository.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.CodeCommitSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.CodeCommitSourceProps,
  ) : CdkObject(cdkObject),
      CodeCommitSourceProps {
    /**
     * The commit ID, pull request ID, branch name, or tag name that corresponds to the version of
     * the source code you want to build.
     *
     * Default: the default branch's HEAD commit ID is used
     *
     * Example:
     *
     * ```
     * "mybranch";
     * ```
     */
    override fun branchOrRef(): String? = unwrap(this).getBranchOrRef()

    /**
     * The depth of history to download.
     *
     * Minimum value is 0.
     * If this value is 0, greater than 25, or not provided,
     * then the full history is downloaded with each build of the project.
     */
    override fun cloneDepth(): Number? = unwrap(this).getCloneDepth()

    /**
     * Whether to fetch submodules while cloning git repo.
     *
     * Default: false
     */
    override fun fetchSubmodules(): Boolean? = unwrap(this).getFetchSubmodules()

    /**
     * The source identifier.
     *
     * This property is required on secondary sources.
     */
    override fun identifier(): String? = unwrap(this).getIdentifier()

    /**
     *
     */
    override fun repository(): IRepository = unwrap(this).getRepository().let(IRepository::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeCommitSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CodeCommitSourceProps):
        CodeCommitSourceProps = CdkObjectWrappers.wrap(cdkObject) as? CodeCommitSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeCommitSourceProps):
        software.amazon.awscdk.services.codebuild.CodeCommitSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.CodeCommitSourceProps
  }
}
