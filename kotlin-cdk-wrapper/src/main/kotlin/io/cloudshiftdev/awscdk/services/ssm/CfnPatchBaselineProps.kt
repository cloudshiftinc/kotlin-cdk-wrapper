@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPatchBaseline`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
 * CfnPatchBaselineProps cfnPatchBaselineProps = CfnPatchBaselineProps.builder()
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
 * .defaultBaseline(false)
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
public interface CfnPatchBaselineProps {
  /**
   * A set of rules used to include patches in the baseline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvalrules)
   */
  public fun approvalRules(): Any? = unwrap(this).getApprovalRules()

  /**
   * A list of explicitly approved patches for the baseline.
   *
   * For information about accepted formats for lists of approved patches and rejected patches, see
   * [Package name formats for approved and rejected patch
   * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
   * in the *AWS Systems Manager User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches)
   */
  public fun approvedPatches(): List<String> = unwrap(this).getApprovedPatches() ?: emptyList()

  /**
   * Defines the compliance level for approved patches.
   *
   * When an approved patch is reported as missing, this value describes the severity of the
   * compliance violation. The default value is `UNSPECIFIED` .
   *
   * Default: - "UNSPECIFIED"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel)
   */
  public fun approvedPatchesComplianceLevel(): String? =
      unwrap(this).getApprovedPatchesComplianceLevel()

  /**
   * Indicates whether the list of approved patches includes non-security updates that should be
   * applied to the managed nodes.
   *
   * The default value is `false` . Applies to Linux managed nodes only.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity)
   */
  public fun approvedPatchesEnableNonSecurity(): Any? =
      unwrap(this).getApprovedPatchesEnableNonSecurity()

  /**
   * Set the baseline as default baseline.
   *
   * Only registering to default patch baseline is allowed.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-defaultbaseline)
   */
  public fun defaultBaseline(): Any? = unwrap(this).getDefaultBaseline()

  /**
   * A description of the patch baseline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A set of global filters used to include patches in the baseline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-globalfilters)
   */
  public fun globalFilters(): Any? = unwrap(this).getGlobalFilters()

  /**
   * The name of the patch baseline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name)
   */
  public fun name(): String

  /**
   * Defines the operating system the patch baseline applies to.
   *
   * The default value is `WINDOWS` .
   *
   * Default: - "WINDOWS"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem)
   */
  public fun operatingSystem(): String? = unwrap(this).getOperatingSystem()

  /**
   * The name of the patch group to be registered with the patch baseline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups)
   */
  public fun patchGroups(): List<String> = unwrap(this).getPatchGroups() ?: emptyList()

  /**
   * A list of explicitly rejected patches for the baseline.
   *
   * For information about accepted formats for lists of approved patches and rejected patches, see
   * [Package name formats for approved and rejected patch
   * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
   * in the *AWS Systems Manager User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches)
   */
  public fun rejectedPatches(): List<String> = unwrap(this).getRejectedPatches() ?: emptyList()

  /**
   * The action for Patch Manager to take on patches included in the `RejectedPackages` list.
   *
   * * **ALLOW_AS_DEPENDENCY** - *Linux and macOS* : A package in the rejected patches list is
   * installed only if it is a dependency of another package. It is considered compliant with the patch
   * baseline, and its status is reported as `INSTALLED_OTHER` . This is the default action if no
   * option is specified.
   *
   * *Windows Server* : Windows Server doesn't support the concept of package dependencies. If a
   * package in the rejected patches list and already installed on the node, its status is reported as
   * `INSTALLED_OTHER` . Any package not already installed on the node is skipped. This is the default
   * action if no option is specified.
   *
   * * **BLOCK** - *All OSs* : Packages in the rejected patches list, and packages that include them
   * as dependencies, aren't installed by Patch Manager under any circumstances. If a package was
   * installed before it was added to the rejected patches list, or is installed outside of Patch
   * Manager afterward, it's considered noncompliant with the patch baseline and its status is reported
   * as `INSTALLED_REJECTED` .
   *
   * Default: - "ALLOW_AS_DEPENDENCY"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatchesaction)
   */
  public fun rejectedPatchesAction(): String? = unwrap(this).getRejectedPatchesAction()

  /**
   * Information about the patches to use to update the managed nodes, including target operating
   * systems and source repositories.
   *
   * Applies to Linux managed nodes only.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
   */
  public fun sources(): Any? = unwrap(this).getSources()

  /**
   * Optional metadata that you assign to a resource.
   *
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For example, you might want to tag a patch baseline to identify the severity level of
   * patches it specifies and the operating system family it applies to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPatchBaselineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param approvalRules A set of rules used to include patches in the baseline.
     */
    public fun approvalRules(approvalRules: IResolvable)

    /**
     * @param approvalRules A set of rules used to include patches in the baseline.
     */
    public fun approvalRules(approvalRules: CfnPatchBaseline.RuleGroupProperty)

    /**
     * @param approvalRules A set of rules used to include patches in the baseline.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("324ba23e826492eff004037e8b00408b74a93178e5c92fb7e27342719508ec5b")
    public fun approvalRules(approvalRules: CfnPatchBaseline.RuleGroupProperty.Builder.() -> Unit)

    /**
     * @param approvedPatches A list of explicitly approved patches for the baseline.
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     */
    public fun approvedPatches(approvedPatches: List<String>)

    /**
     * @param approvedPatches A list of explicitly approved patches for the baseline.
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     */
    public fun approvedPatches(vararg approvedPatches: String)

    /**
     * @param approvedPatchesComplianceLevel Defines the compliance level for approved patches.
     * When an approved patch is reported as missing, this value describes the severity of the
     * compliance violation. The default value is `UNSPECIFIED` .
     */
    public fun approvedPatchesComplianceLevel(approvedPatchesComplianceLevel: String)

    /**
     * @param approvedPatchesEnableNonSecurity Indicates whether the list of approved patches
     * includes non-security updates that should be applied to the managed nodes.
     * The default value is `false` . Applies to Linux managed nodes only.
     */
    public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: Boolean)

    /**
     * @param approvedPatchesEnableNonSecurity Indicates whether the list of approved patches
     * includes non-security updates that should be applied to the managed nodes.
     * The default value is `false` . Applies to Linux managed nodes only.
     */
    public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: IResolvable)

    /**
     * @param defaultBaseline Set the baseline as default baseline.
     * Only registering to default patch baseline is allowed.
     */
    public fun defaultBaseline(defaultBaseline: Boolean)

    /**
     * @param defaultBaseline Set the baseline as default baseline.
     * Only registering to default patch baseline is allowed.
     */
    public fun defaultBaseline(defaultBaseline: IResolvable)

    /**
     * @param description A description of the patch baseline.
     */
    public fun description(description: String)

    /**
     * @param globalFilters A set of global filters used to include patches in the baseline.
     */
    public fun globalFilters(globalFilters: IResolvable)

    /**
     * @param globalFilters A set of global filters used to include patches in the baseline.
     */
    public fun globalFilters(globalFilters: CfnPatchBaseline.PatchFilterGroupProperty)

    /**
     * @param globalFilters A set of global filters used to include patches in the baseline.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b37d58e32cb06b692b938425f01ef08937d78805546fde156897b324eb21f50d")
    public
        fun globalFilters(globalFilters: CfnPatchBaseline.PatchFilterGroupProperty.Builder.() -> Unit)

    /**
     * @param name The name of the patch baseline. 
     */
    public fun name(name: String)

    /**
     * @param operatingSystem Defines the operating system the patch baseline applies to.
     * The default value is `WINDOWS` .
     */
    public fun operatingSystem(operatingSystem: String)

    /**
     * @param patchGroups The name of the patch group to be registered with the patch baseline.
     */
    public fun patchGroups(patchGroups: List<String>)

    /**
     * @param patchGroups The name of the patch group to be registered with the patch baseline.
     */
    public fun patchGroups(vararg patchGroups: String)

    /**
     * @param rejectedPatches A list of explicitly rejected patches for the baseline.
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     */
    public fun rejectedPatches(rejectedPatches: List<String>)

    /**
     * @param rejectedPatches A list of explicitly rejected patches for the baseline.
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     */
    public fun rejectedPatches(vararg rejectedPatches: String)

    /**
     * @param rejectedPatchesAction The action for Patch Manager to take on patches included in the
     * `RejectedPackages` list.
     * * **ALLOW_AS_DEPENDENCY** - *Linux and macOS* : A package in the rejected patches list is
     * installed only if it is a dependency of another package. It is considered compliant with the
     * patch baseline, and its status is reported as `INSTALLED_OTHER` . This is the default action if
     * no option is specified.
     *
     * *Windows Server* : Windows Server doesn't support the concept of package dependencies. If a
     * package in the rejected patches list and already installed on the node, its status is reported
     * as `INSTALLED_OTHER` . Any package not already installed on the node is skipped. This is the
     * default action if no option is specified.
     *
     * * **BLOCK** - *All OSs* : Packages in the rejected patches list, and packages that include
     * them as dependencies, aren't installed by Patch Manager under any circumstances. If a package
     * was installed before it was added to the rejected patches list, or is installed outside of Patch
     * Manager afterward, it's considered noncompliant with the patch baseline and its status is
     * reported as `INSTALLED_REJECTED` .
     */
    public fun rejectedPatchesAction(rejectedPatchesAction: String)

    /**
     * @param sources Information about the patches to use to update the managed nodes, including
     * target operating systems and source repositories.
     * Applies to Linux managed nodes only.
     */
    public fun sources(sources: IResolvable)

    /**
     * @param sources Information about the patches to use to update the managed nodes, including
     * target operating systems and source repositories.
     * Applies to Linux managed nodes only.
     */
    public fun sources(sources: List<Any>)

    /**
     * @param sources Information about the patches to use to update the managed nodes, including
     * target operating systems and source repositories.
     * Applies to Linux managed nodes only.
     */
    public fun sources(vararg sources: Any)

    /**
     * @param tags Optional metadata that you assign to a resource.
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to identify the severity level
     * of patches it specifies and the operating system family it applies to.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Optional metadata that you assign to a resource.
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to identify the severity level
     * of patches it specifies and the operating system family it applies to.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnPatchBaselineProps.Builder =
        software.amazon.awscdk.services.ssm.CfnPatchBaselineProps.builder()

    /**
     * @param approvalRules A set of rules used to include patches in the baseline.
     */
    override fun approvalRules(approvalRules: IResolvable) {
      cdkBuilder.approvalRules(approvalRules.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param approvalRules A set of rules used to include patches in the baseline.
     */
    override fun approvalRules(approvalRules: CfnPatchBaseline.RuleGroupProperty) {
      cdkBuilder.approvalRules(approvalRules.let(CfnPatchBaseline.RuleGroupProperty.Companion::unwrap))
    }

    /**
     * @param approvalRules A set of rules used to include patches in the baseline.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("324ba23e826492eff004037e8b00408b74a93178e5c92fb7e27342719508ec5b")
    override
        fun approvalRules(approvalRules: CfnPatchBaseline.RuleGroupProperty.Builder.() -> Unit):
        Unit = approvalRules(CfnPatchBaseline.RuleGroupProperty(approvalRules))

    /**
     * @param approvedPatches A list of explicitly approved patches for the baseline.
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     */
    override fun approvedPatches(approvedPatches: List<String>) {
      cdkBuilder.approvedPatches(approvedPatches)
    }

    /**
     * @param approvedPatches A list of explicitly approved patches for the baseline.
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     */
    override fun approvedPatches(vararg approvedPatches: String): Unit =
        approvedPatches(approvedPatches.toList())

    /**
     * @param approvedPatchesComplianceLevel Defines the compliance level for approved patches.
     * When an approved patch is reported as missing, this value describes the severity of the
     * compliance violation. The default value is `UNSPECIFIED` .
     */
    override fun approvedPatchesComplianceLevel(approvedPatchesComplianceLevel: String) {
      cdkBuilder.approvedPatchesComplianceLevel(approvedPatchesComplianceLevel)
    }

    /**
     * @param approvedPatchesEnableNonSecurity Indicates whether the list of approved patches
     * includes non-security updates that should be applied to the managed nodes.
     * The default value is `false` . Applies to Linux managed nodes only.
     */
    override fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: Boolean) {
      cdkBuilder.approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity)
    }

    /**
     * @param approvedPatchesEnableNonSecurity Indicates whether the list of approved patches
     * includes non-security updates that should be applied to the managed nodes.
     * The default value is `false` . Applies to Linux managed nodes only.
     */
    override fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: IResolvable) {
      cdkBuilder.approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param defaultBaseline Set the baseline as default baseline.
     * Only registering to default patch baseline is allowed.
     */
    override fun defaultBaseline(defaultBaseline: Boolean) {
      cdkBuilder.defaultBaseline(defaultBaseline)
    }

    /**
     * @param defaultBaseline Set the baseline as default baseline.
     * Only registering to default patch baseline is allowed.
     */
    override fun defaultBaseline(defaultBaseline: IResolvable) {
      cdkBuilder.defaultBaseline(defaultBaseline.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param description A description of the patch baseline.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param globalFilters A set of global filters used to include patches in the baseline.
     */
    override fun globalFilters(globalFilters: IResolvable) {
      cdkBuilder.globalFilters(globalFilters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param globalFilters A set of global filters used to include patches in the baseline.
     */
    override fun globalFilters(globalFilters: CfnPatchBaseline.PatchFilterGroupProperty) {
      cdkBuilder.globalFilters(globalFilters.let(CfnPatchBaseline.PatchFilterGroupProperty.Companion::unwrap))
    }

    /**
     * @param globalFilters A set of global filters used to include patches in the baseline.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b37d58e32cb06b692b938425f01ef08937d78805546fde156897b324eb21f50d")
    override
        fun globalFilters(globalFilters: CfnPatchBaseline.PatchFilterGroupProperty.Builder.() -> Unit):
        Unit = globalFilters(CfnPatchBaseline.PatchFilterGroupProperty(globalFilters))

    /**
     * @param name The name of the patch baseline. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param operatingSystem Defines the operating system the patch baseline applies to.
     * The default value is `WINDOWS` .
     */
    override fun operatingSystem(operatingSystem: String) {
      cdkBuilder.operatingSystem(operatingSystem)
    }

    /**
     * @param patchGroups The name of the patch group to be registered with the patch baseline.
     */
    override fun patchGroups(patchGroups: List<String>) {
      cdkBuilder.patchGroups(patchGroups)
    }

    /**
     * @param patchGroups The name of the patch group to be registered with the patch baseline.
     */
    override fun patchGroups(vararg patchGroups: String): Unit = patchGroups(patchGroups.toList())

    /**
     * @param rejectedPatches A list of explicitly rejected patches for the baseline.
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     */
    override fun rejectedPatches(rejectedPatches: List<String>) {
      cdkBuilder.rejectedPatches(rejectedPatches)
    }

    /**
     * @param rejectedPatches A list of explicitly rejected patches for the baseline.
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     */
    override fun rejectedPatches(vararg rejectedPatches: String): Unit =
        rejectedPatches(rejectedPatches.toList())

    /**
     * @param rejectedPatchesAction The action for Patch Manager to take on patches included in the
     * `RejectedPackages` list.
     * * **ALLOW_AS_DEPENDENCY** - *Linux and macOS* : A package in the rejected patches list is
     * installed only if it is a dependency of another package. It is considered compliant with the
     * patch baseline, and its status is reported as `INSTALLED_OTHER` . This is the default action if
     * no option is specified.
     *
     * *Windows Server* : Windows Server doesn't support the concept of package dependencies. If a
     * package in the rejected patches list and already installed on the node, its status is reported
     * as `INSTALLED_OTHER` . Any package not already installed on the node is skipped. This is the
     * default action if no option is specified.
     *
     * * **BLOCK** - *All OSs* : Packages in the rejected patches list, and packages that include
     * them as dependencies, aren't installed by Patch Manager under any circumstances. If a package
     * was installed before it was added to the rejected patches list, or is installed outside of Patch
     * Manager afterward, it's considered noncompliant with the patch baseline and its status is
     * reported as `INSTALLED_REJECTED` .
     */
    override fun rejectedPatchesAction(rejectedPatchesAction: String) {
      cdkBuilder.rejectedPatchesAction(rejectedPatchesAction)
    }

    /**
     * @param sources Information about the patches to use to update the managed nodes, including
     * target operating systems and source repositories.
     * Applies to Linux managed nodes only.
     */
    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sources Information about the patches to use to update the managed nodes, including
     * target operating systems and source repositories.
     * Applies to Linux managed nodes only.
     */
    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param sources Information about the patches to use to update the managed nodes, including
     * target operating systems and source repositories.
     * Applies to Linux managed nodes only.
     */
    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    /**
     * @param tags Optional metadata that you assign to a resource.
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to identify the severity level
     * of patches it specifies and the operating system family it applies to.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Optional metadata that you assign to a resource.
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to identify the severity level
     * of patches it specifies and the operating system family it applies to.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ssm.CfnPatchBaselineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaselineProps,
  ) : CdkObject(cdkObject),
      CfnPatchBaselineProps {
    /**
     * A set of rules used to include patches in the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvalrules)
     */
    override fun approvalRules(): Any? = unwrap(this).getApprovalRules()

    /**
     * A list of explicitly approved patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches)
     */
    override fun approvedPatches(): List<String> = unwrap(this).getApprovedPatches() ?: emptyList()

    /**
     * Defines the compliance level for approved patches.
     *
     * When an approved patch is reported as missing, this value describes the severity of the
     * compliance violation. The default value is `UNSPECIFIED` .
     *
     * Default: - "UNSPECIFIED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel)
     */
    override fun approvedPatchesComplianceLevel(): String? =
        unwrap(this).getApprovedPatchesComplianceLevel()

    /**
     * Indicates whether the list of approved patches includes non-security updates that should be
     * applied to the managed nodes.
     *
     * The default value is `false` . Applies to Linux managed nodes only.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity)
     */
    override fun approvedPatchesEnableNonSecurity(): Any? =
        unwrap(this).getApprovedPatchesEnableNonSecurity()

    /**
     * Set the baseline as default baseline.
     *
     * Only registering to default patch baseline is allowed.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-defaultbaseline)
     */
    override fun defaultBaseline(): Any? = unwrap(this).getDefaultBaseline()

    /**
     * A description of the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A set of global filters used to include patches in the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-globalfilters)
     */
    override fun globalFilters(): Any? = unwrap(this).getGlobalFilters()

    /**
     * The name of the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Defines the operating system the patch baseline applies to.
     *
     * The default value is `WINDOWS` .
     *
     * Default: - "WINDOWS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem)
     */
    override fun operatingSystem(): String? = unwrap(this).getOperatingSystem()

    /**
     * The name of the patch group to be registered with the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups)
     */
    override fun patchGroups(): List<String> = unwrap(this).getPatchGroups() ?: emptyList()

    /**
     * A list of explicitly rejected patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches)
     */
    override fun rejectedPatches(): List<String> = unwrap(this).getRejectedPatches() ?: emptyList()

    /**
     * The action for Patch Manager to take on patches included in the `RejectedPackages` list.
     *
     * * **ALLOW_AS_DEPENDENCY** - *Linux and macOS* : A package in the rejected patches list is
     * installed only if it is a dependency of another package. It is considered compliant with the
     * patch baseline, and its status is reported as `INSTALLED_OTHER` . This is the default action if
     * no option is specified.
     *
     * *Windows Server* : Windows Server doesn't support the concept of package dependencies. If a
     * package in the rejected patches list and already installed on the node, its status is reported
     * as `INSTALLED_OTHER` . Any package not already installed on the node is skipped. This is the
     * default action if no option is specified.
     *
     * * **BLOCK** - *All OSs* : Packages in the rejected patches list, and packages that include
     * them as dependencies, aren't installed by Patch Manager under any circumstances. If a package
     * was installed before it was added to the rejected patches list, or is installed outside of Patch
     * Manager afterward, it's considered noncompliant with the patch baseline and its status is
     * reported as `INSTALLED_REJECTED` .
     *
     * Default: - "ALLOW_AS_DEPENDENCY"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatchesaction)
     */
    override fun rejectedPatchesAction(): String? = unwrap(this).getRejectedPatchesAction()

    /**
     * Information about the patches to use to update the managed nodes, including target operating
     * systems and source repositories.
     *
     * Applies to Linux managed nodes only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
     */
    override fun sources(): Any? = unwrap(this).getSources()

    /**
     * Optional metadata that you assign to a resource.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to identify the severity level
     * of patches it specifies and the operating system family it applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPatchBaselineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaselineProps):
        CfnPatchBaselineProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPatchBaselineProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPatchBaselineProps):
        software.amazon.awscdk.services.ssm.CfnPatchBaselineProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ssm.CfnPatchBaselineProps
  }
}
