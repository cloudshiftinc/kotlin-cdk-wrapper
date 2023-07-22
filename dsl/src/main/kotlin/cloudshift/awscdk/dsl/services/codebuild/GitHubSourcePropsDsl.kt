@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codebuild.FilterGroup
import software.amazon.awscdk.services.codebuild.GitHubSourceProps

/**
 * Construction properties for `GitHubSource` and `GitHubEnterpriseSource`.
 *
 * Example:
 *
 * ```
 * Project project = Project.Builder.create(this, "MyProject")
 * .buildSpec(BuildSpec.fromSourceFilename("my-buildspec.yml"))
 * .source(Source.gitHub(GitHubSourceProps.builder()
 * .owner("awslabs")
 * .repo("aws-cdk")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class GitHubSourcePropsDsl {
  private val cdkBuilder: GitHubSourceProps.Builder = GitHubSourceProps.builder()

  private val _webhookFilters: MutableList<FilterGroup> = mutableListOf()

  /**
   * @param branchOrRef The commit ID, pull request ID, branch name, or tag name that corresponds to
   * the version of the source code you want to build.
   */
  public fun branchOrRef(branchOrRef: String) {
    cdkBuilder.branchOrRef(branchOrRef)
  }

  /**
   * @param buildStatusContext This parameter is used for the `context` parameter in the GitHub
   * commit status.
   * Can use built-in CodeBuild variables, like $AWS_REGION.
   */
  public fun buildStatusContext(buildStatusContext: String) {
    cdkBuilder.buildStatusContext(buildStatusContext)
  }

  /**
   * @param buildStatusUrl The URL that the build will report back to the source provider.
   * Can use built-in CodeBuild variables, like $AWS_REGION.
   */
  public fun buildStatusUrl(buildStatusUrl: String) {
    cdkBuilder.buildStatusUrl(buildStatusUrl)
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
   * @param owner The GitHub account/user that owns the repo. 
   */
  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  /**
   * @param repo The name of the repo (without the username). 
   */
  public fun repo(repo: String) {
    cdkBuilder.repo(repo)
  }

  /**
   * @param reportBuildStatus Whether to send notifications on your build's start and end.
   */
  public fun reportBuildStatus(reportBuildStatus: Boolean) {
    cdkBuilder.reportBuildStatus(reportBuildStatus)
  }

  /**
   * @param webhook Whether to create a webhook that will trigger a build every time an event
   * happens in the repository.
   */
  public fun webhook(webhook: Boolean) {
    cdkBuilder.webhook(webhook)
  }

  /**
   * @param webhookFilters A list of webhook filters that can constraint what events in the
   * repository will trigger a build.
   * A build is triggered if any of the provided filter groups match.
   * Only valid if `webhook` was not provided as false.
   */
  public fun webhookFilters(vararg webhookFilters: FilterGroup) {
    _webhookFilters.addAll(listOf(*webhookFilters))
  }

  /**
   * @param webhookFilters A list of webhook filters that can constraint what events in the
   * repository will trigger a build.
   * A build is triggered if any of the provided filter groups match.
   * Only valid if `webhook` was not provided as false.
   */
  public fun webhookFilters(webhookFilters: Collection<FilterGroup>) {
    _webhookFilters.addAll(webhookFilters)
  }

  /**
   * @param webhookTriggersBatchBuild Trigger a batch build from a webhook instead of a standard
   * one.
   * Enabling this will enable batch builds on the CodeBuild project.
   */
  public fun webhookTriggersBatchBuild(webhookTriggersBatchBuild: Boolean) {
    cdkBuilder.webhookTriggersBatchBuild(webhookTriggersBatchBuild)
  }

  public fun build(): GitHubSourceProps {
    if(_webhookFilters.isNotEmpty()) cdkBuilder.webhookFilters(_webhookFilters)
    return cdkBuilder.build()
  }
}
