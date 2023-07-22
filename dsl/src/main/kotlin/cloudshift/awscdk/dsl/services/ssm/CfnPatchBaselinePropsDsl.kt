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

  /**
   * @param approvalRules A set of rules used to include patches in the baseline.
   */
  public fun approvalRules(approvalRules: IResolvable) {
    cdkBuilder.approvalRules(approvalRules)
  }

  /**
   * @param approvalRules A set of rules used to include patches in the baseline.
   */
  public fun approvalRules(approvalRules: CfnPatchBaseline.RuleGroupProperty) {
    cdkBuilder.approvalRules(approvalRules)
  }

  /**
   * @param approvedPatches A list of explicitly approved patches for the baseline.
   * For information about accepted formats for lists of approved patches and rejected patches, see
   * [About package name formats for approved and rejected patch
   * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
   * in the *AWS Systems Manager User Guide* .
   */
  public fun approvedPatches(vararg approvedPatches: String) {
    _approvedPatches.addAll(listOf(*approvedPatches))
  }

  /**
   * @param approvedPatches A list of explicitly approved patches for the baseline.
   * For information about accepted formats for lists of approved patches and rejected patches, see
   * [About package name formats for approved and rejected patch
   * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
   * in the *AWS Systems Manager User Guide* .
   */
  public fun approvedPatches(approvedPatches: Collection<String>) {
    _approvedPatches.addAll(approvedPatches)
  }

  /**
   * @param approvedPatchesComplianceLevel Defines the compliance level for approved patches.
   * When an approved patch is reported as missing, this value describes the severity of the
   * compliance violation. The default value is `UNSPECIFIED` .
   */
  public fun approvedPatchesComplianceLevel(approvedPatchesComplianceLevel: String) {
    cdkBuilder.approvedPatchesComplianceLevel(approvedPatchesComplianceLevel)
  }

  /**
   * @param approvedPatchesEnableNonSecurity Indicates whether the list of approved patches includes
   * non-security updates that should be applied to the managed nodes.
   * The default value is `false` . Applies to Linux managed nodes only.
   */
  public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: Boolean) {
    cdkBuilder.approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity)
  }

  /**
   * @param approvedPatchesEnableNonSecurity Indicates whether the list of approved patches includes
   * non-security updates that should be applied to the managed nodes.
   * The default value is `false` . Applies to Linux managed nodes only.
   */
  public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: IResolvable) {
    cdkBuilder.approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity)
  }

  /**
   * @param description A description of the patch baseline.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param globalFilters A set of global filters used to include patches in the baseline.
   */
  public fun globalFilters(globalFilters: IResolvable) {
    cdkBuilder.globalFilters(globalFilters)
  }

  /**
   * @param globalFilters A set of global filters used to include patches in the baseline.
   */
  public fun globalFilters(globalFilters: CfnPatchBaseline.PatchFilterGroupProperty) {
    cdkBuilder.globalFilters(globalFilters)
  }

  /**
   * @param name The name of the patch baseline. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param operatingSystem Defines the operating system the patch baseline applies to.
   * The default value is `WINDOWS` .
   */
  public fun operatingSystem(operatingSystem: String) {
    cdkBuilder.operatingSystem(operatingSystem)
  }

  /**
   * @param patchGroups The name of the patch group to be registered with the patch baseline.
   */
  public fun patchGroups(vararg patchGroups: String) {
    _patchGroups.addAll(listOf(*patchGroups))
  }

  /**
   * @param patchGroups The name of the patch group to be registered with the patch baseline.
   */
  public fun patchGroups(patchGroups: Collection<String>) {
    _patchGroups.addAll(patchGroups)
  }

  /**
   * @param rejectedPatches A list of explicitly rejected patches for the baseline.
   * For information about accepted formats for lists of approved patches and rejected patches, see
   * [About package name formats for approved and rejected patch
   * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
   * in the *AWS Systems Manager User Guide* .
   */
  public fun rejectedPatches(vararg rejectedPatches: String) {
    _rejectedPatches.addAll(listOf(*rejectedPatches))
  }

  /**
   * @param rejectedPatches A list of explicitly rejected patches for the baseline.
   * For information about accepted formats for lists of approved patches and rejected patches, see
   * [About package name formats for approved and rejected patch
   * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
   * in the *AWS Systems Manager User Guide* .
   */
  public fun rejectedPatches(rejectedPatches: Collection<String>) {
    _rejectedPatches.addAll(rejectedPatches)
  }

  /**
   * @param rejectedPatchesAction The action for Patch Manager to take on patches included in the
   * `RejectedPackages` list.
   * * *`ALLOW_AS_DEPENDENCY`* : A package in the `Rejected` patches list is installed only if it is
   * a dependency of another package. It is considered compliant with the patch baseline, and its
   * status is reported as `InstalledOther` . This is the default action if no option is specified.
   * * *`BLOCK`* : Packages in the `RejectedPatches` list, and packages that include them as
   * dependencies, aren't installed under any circumstances. If a package was installed before it was
   * added to the Rejected patches list, it is considered non-compliant with the patch baseline, and
   * its status is reported as `InstalledRejected` .
   */
  public fun rejectedPatchesAction(rejectedPatchesAction: String) {
    cdkBuilder.rejectedPatchesAction(rejectedPatchesAction)
  }

  /**
   * @param sources Information about the patches to use to update the managed nodes, including
   * target operating systems and source repositories.
   * Applies to Linux managed nodes only.
   */
  public fun sources(vararg sources: Any) {
    _sources.addAll(listOf(*sources))
  }

  /**
   * @param sources Information about the patches to use to update the managed nodes, including
   * target operating systems and source repositories.
   * Applies to Linux managed nodes only.
   */
  public fun sources(sources: Collection<Any>) {
    _sources.addAll(sources)
  }

  /**
   * @param sources Information about the patches to use to update the managed nodes, including
   * target operating systems and source repositories.
   * Applies to Linux managed nodes only.
   */
  public fun sources(sources: IResolvable) {
    cdkBuilder.sources(sources)
  }

  /**
   * @param tags Optional metadata that you assign to a resource.
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For example, you might want to tag a patch baseline to identify the severity level of
   * patches it specifies and the operating system family it applies to.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Optional metadata that you assign to a resource.
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For example, you might want to tag a patch baseline to identify the severity level of
   * patches it specifies and the operating system family it applies to.
   */
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
