@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ssm

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnPatchBaseline
import software.constructs.Construct

/**
 * The `AWS::SSM::PatchBaseline` resource defines the basic information for an AWS Systems Manager
 * patch baseline.
 *
 * A patch baseline defines which patches are approved for installation on your instances.
 *
 * For more information, see
 * [CreatePatchBaseline](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_CreatePatchBaseline.html)
 * in the *AWS Systems Manager API Reference* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * CfnPatchBaseline cfnPatchBaseline = CfnPatchBaseline.Builder.create(this, "MyCfnPatchBaseline")
 * .name("name")
 * // the properties below are optional
 * .approvalRules(RuleGroupProperty.builder()
 * .patchRules(List.of(RuleProperty.builder()
 * .approveAfterDays(123)
 * .approveUntilDate("approveUntilDate")
 * .complianceLevel("complianceLevel")
 * .enableNonSecurity(false)
 * .patchFilterGroup(PatchFilterGroupProperty.builder()
 * .patchFilters(List.of(PatchFilterProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .build())
 * .build()))
 * .build())
 * .approvedPatches(List.of("approvedPatches"))
 * .approvedPatchesComplianceLevel("approvedPatchesComplianceLevel")
 * .approvedPatchesEnableNonSecurity(false)
 * .description("description")
 * .globalFilters(PatchFilterGroupProperty.builder()
 * .patchFilters(List.of(PatchFilterProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .build())
 * .operatingSystem("operatingSystem")
 * .patchGroups(List.of("patchGroups"))
 * .rejectedPatches(List.of("rejectedPatches"))
 * .rejectedPatchesAction("rejectedPatchesAction")
 * .sources(List.of(PatchSourceProperty.builder()
 * .configuration("configuration")
 * .name("name")
 * .products(List.of("products"))
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
 */
@CdkDslMarker
public class CfnPatchBaselineDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPatchBaseline.Builder = CfnPatchBaseline.Builder.create(scope, id)

    private val _approvedPatches: MutableList<String> = mutableListOf()

    private val _patchGroups: MutableList<String> = mutableListOf()

    private val _rejectedPatches: MutableList<String> = mutableListOf()

    private val _sources: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A set of rules used to include patches in the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvalrules)
     *
     * @param approvalRules A set of rules used to include patches in the baseline.
     */
    public fun approvalRules(approvalRules: IResolvable) {
        cdkBuilder.approvalRules(approvalRules)
    }

    /**
     * A set of rules used to include patches in the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvalrules)
     *
     * @param approvalRules A set of rules used to include patches in the baseline.
     */
    public fun approvalRules(approvalRules: CfnPatchBaseline.RuleGroupProperty) {
        cdkBuilder.approvalRules(approvalRules)
    }

    /**
     * A list of explicitly approved patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see
     * [About package name formats for approved and rejected patch lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches)
     *
     * @param approvedPatches A list of explicitly approved patches for the baseline.
     */
    public fun approvedPatches(vararg approvedPatches: String) {
        _approvedPatches.addAll(listOf(*approvedPatches))
    }

    /**
     * A list of explicitly approved patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see
     * [About package name formats for approved and rejected patch lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches)
     *
     * @param approvedPatches A list of explicitly approved patches for the baseline.
     */
    public fun approvedPatches(approvedPatches: Collection<String>) {
        _approvedPatches.addAll(approvedPatches)
    }

    /**
     * Defines the compliance level for approved patches.
     *
     * When an approved patch is reported as missing, this value describes the severity of the
     * compliance violation. The default value is `UNSPECIFIED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel)
     *
     * @param approvedPatchesComplianceLevel Defines the compliance level for approved patches.
     */
    public fun approvedPatchesComplianceLevel(approvedPatchesComplianceLevel: String) {
        cdkBuilder.approvedPatchesComplianceLevel(approvedPatchesComplianceLevel)
    }

    /**
     * Indicates whether the list of approved patches includes non-security updates that should be
     * applied to the managed nodes.
     *
     * The default value is `false` . Applies to Linux managed nodes only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity)
     *
     * @param approvedPatchesEnableNonSecurity Indicates whether the list of approved patches
     *   includes non-security updates that should be applied to the managed nodes.
     */
    public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: Boolean) {
        cdkBuilder.approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity)
    }

    /**
     * Indicates whether the list of approved patches includes non-security updates that should be
     * applied to the managed nodes.
     *
     * The default value is `false` . Applies to Linux managed nodes only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity)
     *
     * @param approvedPatchesEnableNonSecurity Indicates whether the list of approved patches
     *   includes non-security updates that should be applied to the managed nodes.
     */
    public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: IResolvable) {
        cdkBuilder.approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity)
    }

    /**
     * A description of the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description)
     *
     * @param description A description of the patch baseline.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A set of global filters used to include patches in the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-globalfilters)
     *
     * @param globalFilters A set of global filters used to include patches in the baseline.
     */
    public fun globalFilters(globalFilters: IResolvable) {
        cdkBuilder.globalFilters(globalFilters)
    }

    /**
     * A set of global filters used to include patches in the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-globalfilters)
     *
     * @param globalFilters A set of global filters used to include patches in the baseline.
     */
    public fun globalFilters(globalFilters: CfnPatchBaseline.PatchFilterGroupProperty) {
        cdkBuilder.globalFilters(globalFilters)
    }

    /**
     * The name of the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name)
     *
     * @param name The name of the patch baseline.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Defines the operating system the patch baseline applies to.
     *
     * The default value is `WINDOWS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem)
     *
     * @param operatingSystem Defines the operating system the patch baseline applies to.
     */
    public fun operatingSystem(operatingSystem: String) {
        cdkBuilder.operatingSystem(operatingSystem)
    }

    /**
     * The name of the patch group to be registered with the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups)
     *
     * @param patchGroups The name of the patch group to be registered with the patch baseline.
     */
    public fun patchGroups(vararg patchGroups: String) {
        _patchGroups.addAll(listOf(*patchGroups))
    }

    /**
     * The name of the patch group to be registered with the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups)
     *
     * @param patchGroups The name of the patch group to be registered with the patch baseline.
     */
    public fun patchGroups(patchGroups: Collection<String>) {
        _patchGroups.addAll(patchGroups)
    }

    /**
     * A list of explicitly rejected patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see
     * [About package name formats for approved and rejected patch lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches)
     *
     * @param rejectedPatches A list of explicitly rejected patches for the baseline.
     */
    public fun rejectedPatches(vararg rejectedPatches: String) {
        _rejectedPatches.addAll(listOf(*rejectedPatches))
    }

    /**
     * A list of explicitly rejected patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see
     * [About package name formats for approved and rejected patch lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches)
     *
     * @param rejectedPatches A list of explicitly rejected patches for the baseline.
     */
    public fun rejectedPatches(rejectedPatches: Collection<String>) {
        _rejectedPatches.addAll(rejectedPatches)
    }

    /**
     * The action for Patch Manager to take on patches included in the `RejectedPackages` list.
     * * *`ALLOW_AS_DEPENDENCY`* : A package in the `Rejected` patches list is installed only if it
     *   is a dependency of another package. It is considered compliant with the patch baseline, and
     *   its status is reported as `InstalledOther` . This is the default action if no option is
     *   specified.
     * * *`BLOCK`* : Packages in the `RejectedPatches` list, and packages that include them as
     *   dependencies, aren't installed under any circumstances. If a package was installed before
     *   it was added to the Rejected patches list, it is considered non-compliant with the patch
     *   baseline, and its status is reported as `InstalledRejected` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatchesaction)
     *
     * @param rejectedPatchesAction The action for Patch Manager to take on patches included in the
     *   `RejectedPackages` list.
     */
    public fun rejectedPatchesAction(rejectedPatchesAction: String) {
        cdkBuilder.rejectedPatchesAction(rejectedPatchesAction)
    }

    /**
     * Information about the patches to use to update the managed nodes, including target operating
     * systems and source repositories.
     *
     * Applies to Linux managed nodes only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
     *
     * @param sources Information about the patches to use to update the managed nodes, including
     *   target operating systems and source repositories.
     */
    public fun sources(vararg sources: Any) {
        _sources.addAll(listOf(*sources))
    }

    /**
     * Information about the patches to use to update the managed nodes, including target operating
     * systems and source repositories.
     *
     * Applies to Linux managed nodes only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
     *
     * @param sources Information about the patches to use to update the managed nodes, including
     *   target operating systems and source repositories.
     */
    public fun sources(sources: Collection<Any>) {
        _sources.addAll(sources)
    }

    /**
     * Information about the patches to use to update the managed nodes, including target operating
     * systems and source repositories.
     *
     * Applies to Linux managed nodes only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
     *
     * @param sources Information about the patches to use to update the managed nodes, including
     *   target operating systems and source repositories.
     */
    public fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources)
    }

    /**
     * Optional metadata that you assign to a resource.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to identify the severity
     * level of patches it specifies and the operating system family it applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-tags)
     *
     * @param tags Optional metadata that you assign to a resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Optional metadata that you assign to a resource.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to identify the severity
     * level of patches it specifies and the operating system family it applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-tags)
     *
     * @param tags Optional metadata that you assign to a resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPatchBaseline {
        if (_approvedPatches.isNotEmpty()) cdkBuilder.approvedPatches(_approvedPatches)
        if (_patchGroups.isNotEmpty()) cdkBuilder.patchGroups(_patchGroups)
        if (_rejectedPatches.isNotEmpty()) cdkBuilder.rejectedPatches(_rejectedPatches)
        if (_sources.isNotEmpty()) cdkBuilder.sources(_sources)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
