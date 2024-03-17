@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

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
public interface GitHubSourceProps : SourceProps {
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
   * This parameter is used for the `context` parameter in the GitHub commit status.
   *
   * Can use built-in CodeBuild variables, like $AWS_REGION.
   *
   * Default: "AWS CodeBuild $AWS_REGION ($PROJECT_NAME)"
   *
   * Example:
   *
   * ```
   * "My build #$CODEBUILD_BUILD_NUMBER";
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-env-vars.html)
   */
  public fun buildStatusContext(): String? = unwrap(this).getBuildStatusContext()

  /**
   * The URL that the build will report back to the source provider.
   *
   * Can use built-in CodeBuild variables, like $AWS_REGION.
   *
   * Default: - link to the AWS Console for CodeBuild to a particular build execution
   *
   * Example:
   *
   * ```
   * "$CODEBUILD_PUBLIC_BUILD_URL";
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-env-vars.html)
   */
  public fun buildStatusUrl(): String? = unwrap(this).getBuildStatusUrl()

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
   * The GitHub account/user that owns the repo.
   *
   * Example:
   *
   * ```
   * "awslabs";
   * ```
   */
  public fun owner(): String

  /**
   * The name of the repo (without the username).
   *
   * Example:
   *
   * ```
   * "aws-cdk";
   * ```
   */
  public fun repo(): String

  /**
   * Whether to send notifications on your build's start and end.
   *
   * Default: true
   */
  public fun reportBuildStatus(): Boolean? = unwrap(this).getReportBuildStatus()

  /**
   * Whether to create a webhook that will trigger a build every time an event happens in the
   * repository.
   *
   * Default: true if any `webhookFilters` were provided, false otherwise
   */
  public fun webhook(): Boolean? = unwrap(this).getWebhook()

  /**
   * A list of webhook filters that can constraint what events in the repository will trigger a
   * build.
   *
   * A build is triggered if any of the provided filter groups match.
   * Only valid if `webhook` was not provided as false.
   *
   * Default: every push and every Pull Request (create or update) triggers a build
   */
  public fun webhookFilters(): List<FilterGroup> =
      unwrap(this).getWebhookFilters()?.map(FilterGroup::wrap) ?: emptyList()

  /**
   * Trigger a batch build from a webhook instead of a standard one.
   *
   * Enabling this will enable batch builds on the CodeBuild project.
   *
   * Default: false
   */
  public fun webhookTriggersBatchBuild(): Boolean? = unwrap(this).getWebhookTriggersBatchBuild()

  /**
   * A builder for [GitHubSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param branchOrRef The commit ID, pull request ID, branch name, or tag name that corresponds
     * to the version of the source code you want to build.
     */
    public fun branchOrRef(branchOrRef: String)

    /**
     * @param buildStatusContext This parameter is used for the `context` parameter in the GitHub
     * commit status.
     * Can use built-in CodeBuild variables, like $AWS_REGION.
     */
    public fun buildStatusContext(buildStatusContext: String)

    /**
     * @param buildStatusUrl The URL that the build will report back to the source provider.
     * Can use built-in CodeBuild variables, like $AWS_REGION.
     */
    public fun buildStatusUrl(buildStatusUrl: String)

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
     * @param owner The GitHub account/user that owns the repo. 
     */
    public fun owner(owner: String)

    /**
     * @param repo The name of the repo (without the username). 
     */
    public fun repo(repo: String)

    /**
     * @param reportBuildStatus Whether to send notifications on your build's start and end.
     */
    public fun reportBuildStatus(reportBuildStatus: Boolean)

    /**
     * @param webhook Whether to create a webhook that will trigger a build every time an event
     * happens in the repository.
     */
    public fun webhook(webhook: Boolean)

    /**
     * @param webhookFilters A list of webhook filters that can constraint what events in the
     * repository will trigger a build.
     * A build is triggered if any of the provided filter groups match.
     * Only valid if `webhook` was not provided as false.
     */
    public fun webhookFilters(webhookFilters: List<FilterGroup>)

    /**
     * @param webhookFilters A list of webhook filters that can constraint what events in the
     * repository will trigger a build.
     * A build is triggered if any of the provided filter groups match.
     * Only valid if `webhook` was not provided as false.
     */
    public fun webhookFilters(vararg webhookFilters: FilterGroup)

    /**
     * @param webhookTriggersBatchBuild Trigger a batch build from a webhook instead of a standard
     * one.
     * Enabling this will enable batch builds on the CodeBuild project.
     */
    public fun webhookTriggersBatchBuild(webhookTriggersBatchBuild: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder =
        software.amazon.awscdk.services.codebuild.GitHubSourceProps.builder()

    /**
     * @param branchOrRef The commit ID, pull request ID, branch name, or tag name that corresponds
     * to the version of the source code you want to build.
     */
    override fun branchOrRef(branchOrRef: String) {
      cdkBuilder.branchOrRef(branchOrRef)
    }

    /**
     * @param buildStatusContext This parameter is used for the `context` parameter in the GitHub
     * commit status.
     * Can use built-in CodeBuild variables, like $AWS_REGION.
     */
    override fun buildStatusContext(buildStatusContext: String) {
      cdkBuilder.buildStatusContext(buildStatusContext)
    }

    /**
     * @param buildStatusUrl The URL that the build will report back to the source provider.
     * Can use built-in CodeBuild variables, like $AWS_REGION.
     */
    override fun buildStatusUrl(buildStatusUrl: String) {
      cdkBuilder.buildStatusUrl(buildStatusUrl)
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
     * @param owner The GitHub account/user that owns the repo. 
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    /**
     * @param repo The name of the repo (without the username). 
     */
    override fun repo(repo: String) {
      cdkBuilder.repo(repo)
    }

    /**
     * @param reportBuildStatus Whether to send notifications on your build's start and end.
     */
    override fun reportBuildStatus(reportBuildStatus: Boolean) {
      cdkBuilder.reportBuildStatus(reportBuildStatus)
    }

    /**
     * @param webhook Whether to create a webhook that will trigger a build every time an event
     * happens in the repository.
     */
    override fun webhook(webhook: Boolean) {
      cdkBuilder.webhook(webhook)
    }

    /**
     * @param webhookFilters A list of webhook filters that can constraint what events in the
     * repository will trigger a build.
     * A build is triggered if any of the provided filter groups match.
     * Only valid if `webhook` was not provided as false.
     */
    override fun webhookFilters(webhookFilters: List<FilterGroup>) {
      cdkBuilder.webhookFilters(webhookFilters.map(FilterGroup::unwrap))
    }

    /**
     * @param webhookFilters A list of webhook filters that can constraint what events in the
     * repository will trigger a build.
     * A build is triggered if any of the provided filter groups match.
     * Only valid if `webhook` was not provided as false.
     */
    override fun webhookFilters(vararg webhookFilters: FilterGroup): Unit =
        webhookFilters(webhookFilters.toList())

    /**
     * @param webhookTriggersBatchBuild Trigger a batch build from a webhook instead of a standard
     * one.
     * Enabling this will enable batch builds on the CodeBuild project.
     */
    override fun webhookTriggersBatchBuild(webhookTriggersBatchBuild: Boolean) {
      cdkBuilder.webhookTriggersBatchBuild(webhookTriggersBatchBuild)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.GitHubSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.GitHubSourceProps,
  ) : CdkObject(cdkObject), GitHubSourceProps {
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
     * This parameter is used for the `context` parameter in the GitHub commit status.
     *
     * Can use built-in CodeBuild variables, like $AWS_REGION.
     *
     * Default: "AWS CodeBuild $AWS_REGION ($PROJECT_NAME)"
     *
     * Example:
     *
     * ```
     * "My build #$CODEBUILD_BUILD_NUMBER";
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-env-vars.html)
     */
    override fun buildStatusContext(): String? = unwrap(this).getBuildStatusContext()

    /**
     * The URL that the build will report back to the source provider.
     *
     * Can use built-in CodeBuild variables, like $AWS_REGION.
     *
     * Default: - link to the AWS Console for CodeBuild to a particular build execution
     *
     * Example:
     *
     * ```
     * "$CODEBUILD_PUBLIC_BUILD_URL";
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-env-vars.html)
     */
    override fun buildStatusUrl(): String? = unwrap(this).getBuildStatusUrl()

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
     * The GitHub account/user that owns the repo.
     *
     * Example:
     *
     * ```
     * "awslabs";
     * ```
     */
    override fun owner(): String = unwrap(this).getOwner()

    /**
     * The name of the repo (without the username).
     *
     * Example:
     *
     * ```
     * "aws-cdk";
     * ```
     */
    override fun repo(): String = unwrap(this).getRepo()

    /**
     * Whether to send notifications on your build's start and end.
     *
     * Default: true
     */
    override fun reportBuildStatus(): Boolean? = unwrap(this).getReportBuildStatus()

    /**
     * Whether to create a webhook that will trigger a build every time an event happens in the
     * repository.
     *
     * Default: true if any `webhookFilters` were provided, false otherwise
     */
    override fun webhook(): Boolean? = unwrap(this).getWebhook()

    /**
     * A list of webhook filters that can constraint what events in the repository will trigger a
     * build.
     *
     * A build is triggered if any of the provided filter groups match.
     * Only valid if `webhook` was not provided as false.
     *
     * Default: every push and every Pull Request (create or update) triggers a build
     */
    override fun webhookFilters(): List<FilterGroup> =
        unwrap(this).getWebhookFilters()?.map(FilterGroup::wrap) ?: emptyList()

    /**
     * Trigger a batch build from a webhook instead of a standard one.
     *
     * Enabling this will enable batch builds on the CodeBuild project.
     *
     * Default: false
     */
    override fun webhookTriggersBatchBuild(): Boolean? = unwrap(this).getWebhookTriggersBatchBuild()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GitHubSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.GitHubSourceProps):
        GitHubSourceProps = CdkObjectWrappers.wrap(cdkObject) as? GitHubSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitHubSourceProps):
        software.amazon.awscdk.services.codebuild.GitHubSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.GitHubSourceProps
  }
}
