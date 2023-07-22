@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codebuild.CodeCommitSourceProps
import software.amazon.awscdk.services.codecommit.IRepository

/**
 * Construction properties for `CodeCommitSource`.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.codecommit.*;
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
@CdkDslMarker
public class CodeCommitSourcePropsDsl {
  private val cdkBuilder: CodeCommitSourceProps.Builder = CodeCommitSourceProps.builder()

  /**
   * @param branchOrRef The commit ID, pull request ID, branch name, or tag name that corresponds to
   * the version of the source code you want to build.
   */
  public fun branchOrRef(branchOrRef: String) {
    cdkBuilder.branchOrRef(branchOrRef)
  }

  /**
   * @param cloneDepth The depth of history to download.
   * Minimum value is 0.
   * If this value is 0, greater than 25, or not provided,
   * then the full history is downloaded with each build of the project.
   */
  public fun cloneDepth(cloneDepth: Number) {
    cdkBuilder.cloneDepth(cloneDepth)
  }

  /**
   * @param fetchSubmodules Whether to fetch submodules while cloning git repo.
   */
  public fun fetchSubmodules(fetchSubmodules: Boolean) {
    cdkBuilder.fetchSubmodules(fetchSubmodules)
  }

  /**
   * @param identifier The source identifier.
   * This property is required on secondary sources.
   */
  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  /**
   * @param repository the value to be set. 
   */
  public fun repository(repository: IRepository) {
    cdkBuilder.repository(repository)
  }

  public fun build(): CodeCommitSourceProps = cdkBuilder.build()
}
