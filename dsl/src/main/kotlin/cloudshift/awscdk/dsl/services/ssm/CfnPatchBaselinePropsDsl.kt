@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnPatchBaseline
import software.amazon.awscdk.services.ssm.CfnPatchBaselineProps

@CdkDslMarker
public class CfnPatchBaselinePropsDsl {
  private val cdkBuilder: CfnPatchBaselineProps.Builder = CfnPatchBaselineProps.builder()

  private val _approvedPatches: MutableList<String> = mutableListOf()

  private val _patchGroups: MutableList<String> = mutableListOf()

  private val _rejectedPatches: MutableList<String> = mutableListOf()

  private val _sources: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun approvalRules(approvalRules: IResolvable) {
    cdkBuilder.approvalRules(approvalRules)
  }

  public fun approvalRules(approvalRules: CfnPatchBaseline.RuleGroupProperty) {
    cdkBuilder.approvalRules(approvalRules)
  }

  public fun approvedPatches(vararg approvedPatches: String) {
    _approvedPatches.addAll(listOf(*approvedPatches))
  }

  public fun approvedPatches(approvedPatches: Collection<String>) {
    _approvedPatches.addAll(approvedPatches)
  }

  public fun approvedPatchesComplianceLevel(approvedPatchesComplianceLevel: String) {
    cdkBuilder.approvedPatchesComplianceLevel(approvedPatchesComplianceLevel)
  }

  public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: Boolean) {
    cdkBuilder.approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity)
  }

  public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: IResolvable) {
    cdkBuilder.approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun globalFilters(globalFilters: IResolvable) {
    cdkBuilder.globalFilters(globalFilters)
  }

  public fun globalFilters(globalFilters: CfnPatchBaseline.PatchFilterGroupProperty) {
    cdkBuilder.globalFilters(globalFilters)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun operatingSystem(operatingSystem: String) {
    cdkBuilder.operatingSystem(operatingSystem)
  }

  public fun patchGroups(vararg patchGroups: String) {
    _patchGroups.addAll(listOf(*patchGroups))
  }

  public fun patchGroups(patchGroups: Collection<String>) {
    _patchGroups.addAll(patchGroups)
  }

  public fun rejectedPatches(vararg rejectedPatches: String) {
    _rejectedPatches.addAll(listOf(*rejectedPatches))
  }

  public fun rejectedPatches(rejectedPatches: Collection<String>) {
    _rejectedPatches.addAll(rejectedPatches)
  }

  public fun rejectedPatchesAction(rejectedPatchesAction: String) {
    cdkBuilder.rejectedPatchesAction(rejectedPatchesAction)
  }

  public fun sources(vararg sources: Any) {
    _sources.addAll(listOf(*sources))
  }

  public fun sources(sources: Collection<Any>) {
    _sources.addAll(sources)
  }

  public fun sources(sources: IResolvable) {
    cdkBuilder.sources(sources)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPatchBaselineProps {
    if(_approvedPatches.isNotEmpty()) cdkBuilder.approvedPatches(_approvedPatches)
    if(_patchGroups.isNotEmpty()) cdkBuilder.patchGroups(_patchGroups)
    if(_rejectedPatches.isNotEmpty()) cdkBuilder.rejectedPatches(_rejectedPatches)
    if(_sources.isNotEmpty()) cdkBuilder.sources(_sources)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
