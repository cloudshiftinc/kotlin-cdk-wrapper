@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface GitHubSourceProps : SourceProps {
  public fun branchOrRef(): String? = unwrap(this).getBranchOrRef()

  public fun buildStatusContext(): String? = unwrap(this).getBuildStatusContext()

  public fun buildStatusUrl(): String? = unwrap(this).getBuildStatusUrl()

  public fun cloneDepth(): Number? = unwrap(this).getCloneDepth()

  public fun fetchSubmodules(): Boolean? = unwrap(this).getFetchSubmodules()

  public fun owner(): String

  public fun repo(): String

  public fun reportBuildStatus(): Boolean? = unwrap(this).getReportBuildStatus()

  public fun webhook(): Boolean? = unwrap(this).getWebhook()

  public fun webhookFilters(): List<FilterGroup> =
      unwrap(this).getWebhookFilters()?.map(FilterGroup::wrap) ?: emptyList()

  public fun webhookTriggersBatchBuild(): Boolean? = unwrap(this).getWebhookTriggersBatchBuild()

  @CdkDslMarker
  public interface Builder {
    public fun branchOrRef(branchOrRef: String)

    public fun buildStatusContext(buildStatusContext: String)

    public fun buildStatusUrl(buildStatusUrl: String)

    public fun cloneDepth(cloneDepth: Number)

    public fun fetchSubmodules(fetchSubmodules: Boolean)

    public fun identifier(identifier: String)

    public fun owner(owner: String)

    public fun repo(repo: String)

    public fun reportBuildStatus(reportBuildStatus: Boolean)

    public fun webhook(webhook: Boolean)

    public fun webhookFilters(webhookFilters: List<FilterGroup>)

    public fun webhookFilters(vararg webhookFilters: FilterGroup)

    public fun webhookTriggersBatchBuild(webhookTriggersBatchBuild: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder =
        software.amazon.awscdk.services.codebuild.GitHubSourceProps.builder()

    override fun branchOrRef(branchOrRef: String) {
      cdkBuilder.branchOrRef(branchOrRef)
    }

    override fun buildStatusContext(buildStatusContext: String) {
      cdkBuilder.buildStatusContext(buildStatusContext)
    }

    override fun buildStatusUrl(buildStatusUrl: String) {
      cdkBuilder.buildStatusUrl(buildStatusUrl)
    }

    override fun cloneDepth(cloneDepth: Number) {
      cdkBuilder.cloneDepth(cloneDepth)
    }

    override fun fetchSubmodules(fetchSubmodules: Boolean) {
      cdkBuilder.fetchSubmodules(fetchSubmodules)
    }

    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    override fun repo(repo: String) {
      cdkBuilder.repo(repo)
    }

    override fun reportBuildStatus(reportBuildStatus: Boolean) {
      cdkBuilder.reportBuildStatus(reportBuildStatus)
    }

    override fun webhook(webhook: Boolean) {
      cdkBuilder.webhook(webhook)
    }

    override fun webhookFilters(webhookFilters: List<FilterGroup>) {
      cdkBuilder.webhookFilters(webhookFilters.map(FilterGroup::unwrap))
    }

    override fun webhookFilters(vararg webhookFilters: FilterGroup): Unit =
        webhookFilters(webhookFilters.toList())

    override fun webhookTriggersBatchBuild(webhookTriggersBatchBuild: Boolean) {
      cdkBuilder.webhookTriggersBatchBuild(webhookTriggersBatchBuild)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.GitHubSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.GitHubSourceProps,
  ) : CdkObject(cdkObject), GitHubSourceProps {
    override fun branchOrRef(): String? = unwrap(this).getBranchOrRef()

    override fun buildStatusContext(): String? = unwrap(this).getBuildStatusContext()

    override fun buildStatusUrl(): String? = unwrap(this).getBuildStatusUrl()

    override fun cloneDepth(): Number? = unwrap(this).getCloneDepth()

    override fun fetchSubmodules(): Boolean? = unwrap(this).getFetchSubmodules()

    override fun identifier(): String? = unwrap(this).getIdentifier()

    override fun owner(): String = unwrap(this).getOwner()

    override fun repo(): String = unwrap(this).getRepo()

    override fun reportBuildStatus(): Boolean? = unwrap(this).getReportBuildStatus()

    override fun webhook(): Boolean? = unwrap(this).getWebhook()

    override fun webhookFilters(): List<FilterGroup> =
        unwrap(this).getWebhookFilters()?.map(FilterGroup::wrap) ?: emptyList()

    override fun webhookTriggersBatchBuild(): Boolean? = unwrap(this).getWebhookTriggersBatchBuild()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GitHubSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.GitHubSourceProps):
        GitHubSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitHubSourceProps):
        software.amazon.awscdk.services.codebuild.GitHubSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.GitHubSourceProps
  }
}
