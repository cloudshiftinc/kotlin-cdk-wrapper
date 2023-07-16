@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codebuild.BitBucketSourceProps
import software.amazon.awscdk.services.codebuild.FilterGroup

@CdkDslMarker
public class BitBucketSourcePropsDsl {
  private val cdkBuilder: BitBucketSourceProps.Builder = BitBucketSourceProps.builder()

  private val _webhookFilters: MutableList<FilterGroup> = mutableListOf()

  public fun branchOrRef(branchOrRef: String) {
    cdkBuilder.branchOrRef(branchOrRef)
  }

  public fun buildStatusName(buildStatusName: String) {
    cdkBuilder.buildStatusName(buildStatusName)
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

  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  public fun repo(repo: String) {
    cdkBuilder.repo(repo)
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

  public fun build(): BitBucketSourceProps {
    if(_webhookFilters.isNotEmpty()) cdkBuilder.webhookFilters(_webhookFilters)
    return cdkBuilder.build()
  }
}
