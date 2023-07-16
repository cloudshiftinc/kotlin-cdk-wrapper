@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codebuild.FilterGroup
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps

@CdkDslMarker
public class GitHubEnterpriseSourcePropsDsl {
  private val cdkBuilder: GitHubEnterpriseSourceProps.Builder =
      GitHubEnterpriseSourceProps.builder()

  private val _webhookFilters: MutableList<FilterGroup> = mutableListOf()

  public fun branchOrRef(branchOrRef: String) {
    cdkBuilder.branchOrRef(branchOrRef)
  }

  public fun buildStatusContext(buildStatusContext: String) {
    cdkBuilder.buildStatusContext(buildStatusContext)
  }

  public fun buildStatusUrl(buildStatusUrl: String) {
    cdkBuilder.buildStatusUrl(buildStatusUrl)
  }

  public fun cloneDepth(cloneDepth: Number) {
    cdkBuilder.cloneDepth(cloneDepth)
  }

  public fun fetchSubmodules(fetchSubmodules: Boolean) {
    cdkBuilder.fetchSubmodules(fetchSubmodules)
  }

  public fun httpsCloneUrl(httpsCloneUrl: String) {
    cdkBuilder.httpsCloneUrl(httpsCloneUrl)
  }

  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  public fun ignoreSslErrors(ignoreSslErrors: Boolean) {
    cdkBuilder.ignoreSslErrors(ignoreSslErrors)
  }

  public fun reportBuildStatus(reportBuildStatus: Boolean) {
    cdkBuilder.reportBuildStatus(reportBuildStatus)
  }

  public fun webhook(webhook: Boolean) {
    cdkBuilder.webhook(webhook)
  }

  public fun webhookFilters(vararg webhookFilters: FilterGroup) {
    _webhookFilters.addAll(listOf(*webhookFilters))
  }

  public fun webhookFilters(webhookFilters: Collection<FilterGroup>) {
    _webhookFilters.addAll(webhookFilters)
  }

  public fun webhookTriggersBatchBuild(webhookTriggersBatchBuild: Boolean) {
    cdkBuilder.webhookTriggersBatchBuild(webhookTriggersBatchBuild)
  }

  public fun build(): GitHubEnterpriseSourceProps {
    if(_webhookFilters.isNotEmpty()) cdkBuilder.webhookFilters(_webhookFilters)
    return cdkBuilder.build()
  }
}
