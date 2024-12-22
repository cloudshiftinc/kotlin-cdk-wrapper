@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
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
public open class CfnPatchBaseline(
  cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPatchBaselineProps,
  ) :
      this(software.amazon.awscdk.services.ssm.CfnPatchBaseline(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPatchBaselineProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPatchBaselineProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPatchBaselineProps(props)
  )

  /**
   * A set of rules used to include patches in the baseline.
   */
  public open fun approvalRules(): Any? = unwrap(this).getApprovalRules()

  /**
   * A set of rules used to include patches in the baseline.
   */
  public open fun approvalRules(`value`: IResolvable) {
    unwrap(this).setApprovalRules(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A set of rules used to include patches in the baseline.
   */
  public open fun approvalRules(`value`: RuleGroupProperty) {
    unwrap(this).setApprovalRules(`value`.let(RuleGroupProperty.Companion::unwrap))
  }

  /**
   * A set of rules used to include patches in the baseline.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("faa23ebab1b153bca4872d0f98570972a16111705446b96cb909d9c1a755dc14")
  public open fun approvalRules(`value`: RuleGroupProperty.Builder.() -> Unit): Unit =
      approvalRules(RuleGroupProperty(`value`))

  /**
   * A list of explicitly approved patches for the baseline.
   */
  public open fun approvedPatches(): List<String> = unwrap(this).getApprovedPatches() ?: emptyList()

  /**
   * A list of explicitly approved patches for the baseline.
   */
  public open fun approvedPatches(`value`: List<String>) {
    unwrap(this).setApprovedPatches(`value`)
  }

  /**
   * A list of explicitly approved patches for the baseline.
   */
  public open fun approvedPatches(vararg `value`: String): Unit = approvedPatches(`value`.toList())

  /**
   * Defines the compliance level for approved patches.
   */
  public open fun approvedPatchesComplianceLevel(): String? =
      unwrap(this).getApprovedPatchesComplianceLevel()

  /**
   * Defines the compliance level for approved patches.
   */
  public open fun approvedPatchesComplianceLevel(`value`: String) {
    unwrap(this).setApprovedPatchesComplianceLevel(`value`)
  }

  /**
   * Indicates whether the list of approved patches includes non-security updates that should be
   * applied to the managed nodes.
   */
  public open fun approvedPatchesEnableNonSecurity(): Any? =
      unwrap(this).getApprovedPatchesEnableNonSecurity()

  /**
   * Indicates whether the list of approved patches includes non-security updates that should be
   * applied to the managed nodes.
   */
  public open fun approvedPatchesEnableNonSecurity(`value`: Boolean) {
    unwrap(this).setApprovedPatchesEnableNonSecurity(`value`)
  }

  /**
   * Indicates whether the list of approved patches includes non-security updates that should be
   * applied to the managed nodes.
   */
  public open fun approvedPatchesEnableNonSecurity(`value`: IResolvable) {
    unwrap(this).setApprovedPatchesEnableNonSecurity(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The ID of the patch baseline.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Set the baseline as default baseline.
   */
  public open fun defaultBaseline(): Any? = unwrap(this).getDefaultBaseline()

  /**
   * Set the baseline as default baseline.
   */
  public open fun defaultBaseline(`value`: Boolean) {
    unwrap(this).setDefaultBaseline(`value`)
  }

  /**
   * Set the baseline as default baseline.
   */
  public open fun defaultBaseline(`value`: IResolvable) {
    unwrap(this).setDefaultBaseline(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A description of the patch baseline.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the patch baseline.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * A set of global filters used to include patches in the baseline.
   */
  public open fun globalFilters(): Any? = unwrap(this).getGlobalFilters()

  /**
   * A set of global filters used to include patches in the baseline.
   */
  public open fun globalFilters(`value`: IResolvable) {
    unwrap(this).setGlobalFilters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A set of global filters used to include patches in the baseline.
   */
  public open fun globalFilters(`value`: PatchFilterGroupProperty) {
    unwrap(this).setGlobalFilters(`value`.let(PatchFilterGroupProperty.Companion::unwrap))
  }

  /**
   * A set of global filters used to include patches in the baseline.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4d919fd4a63a1e2cfc4d0a586490a118c08470c5858ea695b0bebbade9541872")
  public open fun globalFilters(`value`: PatchFilterGroupProperty.Builder.() -> Unit): Unit =
      globalFilters(PatchFilterGroupProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the patch baseline.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the patch baseline.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Defines the operating system the patch baseline applies to.
   */
  public open fun operatingSystem(): String? = unwrap(this).getOperatingSystem()

  /**
   * Defines the operating system the patch baseline applies to.
   */
  public open fun operatingSystem(`value`: String) {
    unwrap(this).setOperatingSystem(`value`)
  }

  /**
   * The name of the patch group to be registered with the patch baseline.
   */
  public open fun patchGroups(): List<String> = unwrap(this).getPatchGroups() ?: emptyList()

  /**
   * The name of the patch group to be registered with the patch baseline.
   */
  public open fun patchGroups(`value`: List<String>) {
    unwrap(this).setPatchGroups(`value`)
  }

  /**
   * The name of the patch group to be registered with the patch baseline.
   */
  public open fun patchGroups(vararg `value`: String): Unit = patchGroups(`value`.toList())

  /**
   * A list of explicitly rejected patches for the baseline.
   */
  public open fun rejectedPatches(): List<String> = unwrap(this).getRejectedPatches() ?: emptyList()

  /**
   * A list of explicitly rejected patches for the baseline.
   */
  public open fun rejectedPatches(`value`: List<String>) {
    unwrap(this).setRejectedPatches(`value`)
  }

  /**
   * A list of explicitly rejected patches for the baseline.
   */
  public open fun rejectedPatches(vararg `value`: String): Unit = rejectedPatches(`value`.toList())

  /**
   * The action for Patch Manager to take on patches included in the `RejectedPackages` list.
   */
  public open fun rejectedPatchesAction(): String? = unwrap(this).getRejectedPatchesAction()

  /**
   * The action for Patch Manager to take on patches included in the `RejectedPackages` list.
   */
  public open fun rejectedPatchesAction(`value`: String) {
    unwrap(this).setRejectedPatchesAction(`value`)
  }

  /**
   * Information about the patches to use to update the managed nodes, including target operating
   * systems and source repositories.
   */
  public open fun sources(): Any? = unwrap(this).getSources()

  /**
   * Information about the patches to use to update the managed nodes, including target operating
   * systems and source repositories.
   */
  public open fun sources(`value`: IResolvable) {
    unwrap(this).setSources(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about the patches to use to update the managed nodes, including target operating
   * systems and source repositories.
   */
  public open fun sources(`value`: List<Any>) {
    unwrap(this).setSources(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Information about the patches to use to update the managed nodes, including target operating
   * systems and source repositories.
   */
  public open fun sources(vararg `value`: Any): Unit = sources(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Optional metadata that you assign to a resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Optional metadata that you assign to a resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Optional metadata that you assign to a resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssm.CfnPatchBaseline].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A set of rules used to include patches in the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvalrules)
     * @param approvalRules A set of rules used to include patches in the baseline. 
     */
    public fun approvalRules(approvalRules: IResolvable)

    /**
     * A set of rules used to include patches in the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvalrules)
     * @param approvalRules A set of rules used to include patches in the baseline. 
     */
    public fun approvalRules(approvalRules: RuleGroupProperty)

    /**
     * A set of rules used to include patches in the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvalrules)
     * @param approvalRules A set of rules used to include patches in the baseline. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46d415bca7b2dc9279fc09df5ef34a8a536b7eaa5785903c7480e88fc90a2b3b")
    public fun approvalRules(approvalRules: RuleGroupProperty.Builder.() -> Unit)

    /**
     * A list of explicitly approved patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches)
     * @param approvedPatches A list of explicitly approved patches for the baseline. 
     */
    public fun approvedPatches(approvedPatches: List<String>)

    /**
     * A list of explicitly approved patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches)
     * @param approvedPatches A list of explicitly approved patches for the baseline. 
     */
    public fun approvedPatches(vararg approvedPatches: String)

    /**
     * Defines the compliance level for approved patches.
     *
     * When an approved patch is reported as missing, this value describes the severity of the
     * compliance violation. The default value is `UNSPECIFIED` .
     *
     * Default: - "UNSPECIFIED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel)
     * @param approvedPatchesComplianceLevel Defines the compliance level for approved patches. 
     */
    public fun approvedPatchesComplianceLevel(approvedPatchesComplianceLevel: String)

    /**
     * Indicates whether the list of approved patches includes non-security updates that should be
     * applied to the managed nodes.
     *
     * The default value is `false` . Applies to Linux managed nodes only.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity)
     * @param approvedPatchesEnableNonSecurity Indicates whether the list of approved patches
     * includes non-security updates that should be applied to the managed nodes. 
     */
    public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: Boolean)

    /**
     * Indicates whether the list of approved patches includes non-security updates that should be
     * applied to the managed nodes.
     *
     * The default value is `false` . Applies to Linux managed nodes only.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity)
     * @param approvedPatchesEnableNonSecurity Indicates whether the list of approved patches
     * includes non-security updates that should be applied to the managed nodes. 
     */
    public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: IResolvable)

    /**
     * Set the baseline as default baseline.
     *
     * Only registering to default patch baseline is allowed.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-defaultbaseline)
     * @param defaultBaseline Set the baseline as default baseline. 
     */
    public fun defaultBaseline(defaultBaseline: Boolean)

    /**
     * Set the baseline as default baseline.
     *
     * Only registering to default patch baseline is allowed.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-defaultbaseline)
     * @param defaultBaseline Set the baseline as default baseline. 
     */
    public fun defaultBaseline(defaultBaseline: IResolvable)

    /**
     * A description of the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description)
     * @param description A description of the patch baseline. 
     */
    public fun description(description: String)

    /**
     * A set of global filters used to include patches in the baseline.
     *
     *
     * The `GlobalFilters` parameter can be configured only by using the AWS CLI or an AWS SDK. It
     * can't be configured from the Patch Manager console, and its value isn't displayed in the
     * console.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-globalfilters)
     * @param globalFilters A set of global filters used to include patches in the baseline. 
     */
    public fun globalFilters(globalFilters: IResolvable)

    /**
     * A set of global filters used to include patches in the baseline.
     *
     *
     * The `GlobalFilters` parameter can be configured only by using the AWS CLI or an AWS SDK. It
     * can't be configured from the Patch Manager console, and its value isn't displayed in the
     * console.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-globalfilters)
     * @param globalFilters A set of global filters used to include patches in the baseline. 
     */
    public fun globalFilters(globalFilters: PatchFilterGroupProperty)

    /**
     * A set of global filters used to include patches in the baseline.
     *
     *
     * The `GlobalFilters` parameter can be configured only by using the AWS CLI or an AWS SDK. It
     * can't be configured from the Patch Manager console, and its value isn't displayed in the
     * console.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-globalfilters)
     * @param globalFilters A set of global filters used to include patches in the baseline. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51b3a6dc20ee5e4012e3f5957be3a49d8591696eb8a2e2f57c566319b32bea10")
    public fun globalFilters(globalFilters: PatchFilterGroupProperty.Builder.() -> Unit)

    /**
     * The name of the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name)
     * @param name The name of the patch baseline. 
     */
    public fun name(name: String)

    /**
     * Defines the operating system the patch baseline applies to.
     *
     * The default value is `WINDOWS` .
     *
     * Default: - "WINDOWS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem)
     * @param operatingSystem Defines the operating system the patch baseline applies to. 
     */
    public fun operatingSystem(operatingSystem: String)

    /**
     * The name of the patch group to be registered with the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups)
     * @param patchGroups The name of the patch group to be registered with the patch baseline. 
     */
    public fun patchGroups(patchGroups: List<String>)

    /**
     * The name of the patch group to be registered with the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups)
     * @param patchGroups The name of the patch group to be registered with the patch baseline. 
     */
    public fun patchGroups(vararg patchGroups: String)

    /**
     * A list of explicitly rejected patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches)
     * @param rejectedPatches A list of explicitly rejected patches for the baseline. 
     */
    public fun rejectedPatches(rejectedPatches: List<String>)

    /**
     * A list of explicitly rejected patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches)
     * @param rejectedPatches A list of explicitly rejected patches for the baseline. 
     */
    public fun rejectedPatches(vararg rejectedPatches: String)

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
     * @param rejectedPatchesAction The action for Patch Manager to take on patches included in the
     * `RejectedPackages` list. 
     */
    public fun rejectedPatchesAction(rejectedPatchesAction: String)

    /**
     * Information about the patches to use to update the managed nodes, including target operating
     * systems and source repositories.
     *
     * Applies to Linux managed nodes only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
     * @param sources Information about the patches to use to update the managed nodes, including
     * target operating systems and source repositories. 
     */
    public fun sources(sources: IResolvable)

    /**
     * Information about the patches to use to update the managed nodes, including target operating
     * systems and source repositories.
     *
     * Applies to Linux managed nodes only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
     * @param sources Information about the patches to use to update the managed nodes, including
     * target operating systems and source repositories. 
     */
    public fun sources(sources: List<Any>)

    /**
     * Information about the patches to use to update the managed nodes, including target operating
     * systems and source repositories.
     *
     * Applies to Linux managed nodes only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
     * @param sources Information about the patches to use to update the managed nodes, including
     * target operating systems and source repositories. 
     */
    public fun sources(vararg sources: Any)

    /**
     * Optional metadata that you assign to a resource.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to identify the severity level
     * of patches it specifies and the operating system family it applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-tags)
     * @param tags Optional metadata that you assign to a resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Optional metadata that you assign to a resource.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to identify the severity level
     * of patches it specifies and the operating system family it applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-tags)
     * @param tags Optional metadata that you assign to a resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnPatchBaseline.Builder =
        software.amazon.awscdk.services.ssm.CfnPatchBaseline.Builder.create(scope, id)

    /**
     * A set of rules used to include patches in the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvalrules)
     * @param approvalRules A set of rules used to include patches in the baseline. 
     */
    override fun approvalRules(approvalRules: IResolvable) {
      cdkBuilder.approvalRules(approvalRules.let(IResolvable.Companion::unwrap))
    }

    /**
     * A set of rules used to include patches in the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvalrules)
     * @param approvalRules A set of rules used to include patches in the baseline. 
     */
    override fun approvalRules(approvalRules: RuleGroupProperty) {
      cdkBuilder.approvalRules(approvalRules.let(RuleGroupProperty.Companion::unwrap))
    }

    /**
     * A set of rules used to include patches in the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvalrules)
     * @param approvalRules A set of rules used to include patches in the baseline. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46d415bca7b2dc9279fc09df5ef34a8a536b7eaa5785903c7480e88fc90a2b3b")
    override fun approvalRules(approvalRules: RuleGroupProperty.Builder.() -> Unit): Unit =
        approvalRules(RuleGroupProperty(approvalRules))

    /**
     * A list of explicitly approved patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches)
     * @param approvedPatches A list of explicitly approved patches for the baseline. 
     */
    override fun approvedPatches(approvedPatches: List<String>) {
      cdkBuilder.approvedPatches(approvedPatches)
    }

    /**
     * A list of explicitly approved patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches)
     * @param approvedPatches A list of explicitly approved patches for the baseline. 
     */
    override fun approvedPatches(vararg approvedPatches: String): Unit =
        approvedPatches(approvedPatches.toList())

    /**
     * Defines the compliance level for approved patches.
     *
     * When an approved patch is reported as missing, this value describes the severity of the
     * compliance violation. The default value is `UNSPECIFIED` .
     *
     * Default: - "UNSPECIFIED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel)
     * @param approvedPatchesComplianceLevel Defines the compliance level for approved patches. 
     */
    override fun approvedPatchesComplianceLevel(approvedPatchesComplianceLevel: String) {
      cdkBuilder.approvedPatchesComplianceLevel(approvedPatchesComplianceLevel)
    }

    /**
     * Indicates whether the list of approved patches includes non-security updates that should be
     * applied to the managed nodes.
     *
     * The default value is `false` . Applies to Linux managed nodes only.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity)
     * @param approvedPatchesEnableNonSecurity Indicates whether the list of approved patches
     * includes non-security updates that should be applied to the managed nodes. 
     */
    override fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: Boolean) {
      cdkBuilder.approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity)
    }

    /**
     * Indicates whether the list of approved patches includes non-security updates that should be
     * applied to the managed nodes.
     *
     * The default value is `false` . Applies to Linux managed nodes only.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity)
     * @param approvedPatchesEnableNonSecurity Indicates whether the list of approved patches
     * includes non-security updates that should be applied to the managed nodes. 
     */
    override fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: IResolvable) {
      cdkBuilder.approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity.let(IResolvable.Companion::unwrap))
    }

    /**
     * Set the baseline as default baseline.
     *
     * Only registering to default patch baseline is allowed.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-defaultbaseline)
     * @param defaultBaseline Set the baseline as default baseline. 
     */
    override fun defaultBaseline(defaultBaseline: Boolean) {
      cdkBuilder.defaultBaseline(defaultBaseline)
    }

    /**
     * Set the baseline as default baseline.
     *
     * Only registering to default patch baseline is allowed.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-defaultbaseline)
     * @param defaultBaseline Set the baseline as default baseline. 
     */
    override fun defaultBaseline(defaultBaseline: IResolvable) {
      cdkBuilder.defaultBaseline(defaultBaseline.let(IResolvable.Companion::unwrap))
    }

    /**
     * A description of the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description)
     * @param description A description of the patch baseline. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A set of global filters used to include patches in the baseline.
     *
     *
     * The `GlobalFilters` parameter can be configured only by using the AWS CLI or an AWS SDK. It
     * can't be configured from the Patch Manager console, and its value isn't displayed in the
     * console.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-globalfilters)
     * @param globalFilters A set of global filters used to include patches in the baseline. 
     */
    override fun globalFilters(globalFilters: IResolvable) {
      cdkBuilder.globalFilters(globalFilters.let(IResolvable.Companion::unwrap))
    }

    /**
     * A set of global filters used to include patches in the baseline.
     *
     *
     * The `GlobalFilters` parameter can be configured only by using the AWS CLI or an AWS SDK. It
     * can't be configured from the Patch Manager console, and its value isn't displayed in the
     * console.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-globalfilters)
     * @param globalFilters A set of global filters used to include patches in the baseline. 
     */
    override fun globalFilters(globalFilters: PatchFilterGroupProperty) {
      cdkBuilder.globalFilters(globalFilters.let(PatchFilterGroupProperty.Companion::unwrap))
    }

    /**
     * A set of global filters used to include patches in the baseline.
     *
     *
     * The `GlobalFilters` parameter can be configured only by using the AWS CLI or an AWS SDK. It
     * can't be configured from the Patch Manager console, and its value isn't displayed in the
     * console.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-globalfilters)
     * @param globalFilters A set of global filters used to include patches in the baseline. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51b3a6dc20ee5e4012e3f5957be3a49d8591696eb8a2e2f57c566319b32bea10")
    override fun globalFilters(globalFilters: PatchFilterGroupProperty.Builder.() -> Unit): Unit =
        globalFilters(PatchFilterGroupProperty(globalFilters))

    /**
     * The name of the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name)
     * @param name The name of the patch baseline. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Defines the operating system the patch baseline applies to.
     *
     * The default value is `WINDOWS` .
     *
     * Default: - "WINDOWS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem)
     * @param operatingSystem Defines the operating system the patch baseline applies to. 
     */
    override fun operatingSystem(operatingSystem: String) {
      cdkBuilder.operatingSystem(operatingSystem)
    }

    /**
     * The name of the patch group to be registered with the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups)
     * @param patchGroups The name of the patch group to be registered with the patch baseline. 
     */
    override fun patchGroups(patchGroups: List<String>) {
      cdkBuilder.patchGroups(patchGroups)
    }

    /**
     * The name of the patch group to be registered with the patch baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups)
     * @param patchGroups The name of the patch group to be registered with the patch baseline. 
     */
    override fun patchGroups(vararg patchGroups: String): Unit = patchGroups(patchGroups.toList())

    /**
     * A list of explicitly rejected patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches)
     * @param rejectedPatches A list of explicitly rejected patches for the baseline. 
     */
    override fun rejectedPatches(rejectedPatches: List<String>) {
      cdkBuilder.rejectedPatches(rejectedPatches)
    }

    /**
     * A list of explicitly rejected patches for the baseline.
     *
     * For information about accepted formats for lists of approved patches and rejected patches,
     * see [Package name formats for approved and rejected patch
     * lists](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches)
     * @param rejectedPatches A list of explicitly rejected patches for the baseline. 
     */
    override fun rejectedPatches(vararg rejectedPatches: String): Unit =
        rejectedPatches(rejectedPatches.toList())

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
     * @param rejectedPatchesAction The action for Patch Manager to take on patches included in the
     * `RejectedPackages` list. 
     */
    override fun rejectedPatchesAction(rejectedPatchesAction: String) {
      cdkBuilder.rejectedPatchesAction(rejectedPatchesAction)
    }

    /**
     * Information about the patches to use to update the managed nodes, including target operating
     * systems and source repositories.
     *
     * Applies to Linux managed nodes only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
     * @param sources Information about the patches to use to update the managed nodes, including
     * target operating systems and source repositories. 
     */
    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about the patches to use to update the managed nodes, including target operating
     * systems and source repositories.
     *
     * Applies to Linux managed nodes only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
     * @param sources Information about the patches to use to update the managed nodes, including
     * target operating systems and source repositories. 
     */
    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Information about the patches to use to update the managed nodes, including target operating
     * systems and source repositories.
     *
     * Applies to Linux managed nodes only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
     * @param sources Information about the patches to use to update the managed nodes, including
     * target operating systems and source repositories. 
     */
    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    /**
     * Optional metadata that you assign to a resource.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to identify the severity level
     * of patches it specifies and the operating system family it applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-tags)
     * @param tags Optional metadata that you assign to a resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Optional metadata that you assign to a resource.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to identify the severity level
     * of patches it specifies and the operating system family it applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-tags)
     * @param tags Optional metadata that you assign to a resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ssm.CfnPatchBaseline = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssm.CfnPatchBaseline.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPatchBaseline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPatchBaseline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline):
        CfnPatchBaseline = CfnPatchBaseline(cdkObject)

    internal fun unwrap(wrapped: CfnPatchBaseline):
        software.amazon.awscdk.services.ssm.CfnPatchBaseline = wrapped.cdkObject as
        software.amazon.awscdk.services.ssm.CfnPatchBaseline
  }

  /**
   * The `PatchFilterGroup` property type specifies a set of patch filters for an AWS Systems
   * Manager patch baseline, typically used for approval rules for a Systems Manager patch baseline.
   *
   * `PatchFilterGroup` is the property type for the `GlobalFilters` property of the
   * [AWS::SSM::PatchBaseline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
   * resource and the `PatchFilterGroup` property of the
   * [Rule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssm.*;
   * PatchFilterGroupProperty patchFilterGroupProperty = PatchFilterGroupProperty.builder()
   * .patchFilters(List.of(PatchFilterProperty.builder()
   * .key("key")
   * .values(List.of("values"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html)
   */
  public interface PatchFilterGroupProperty {
    /**
     * The set of patch filters that make up the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters)
     */
    public fun patchFilters(): Any? = unwrap(this).getPatchFilters()

    /**
     * A builder for [PatchFilterGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param patchFilters The set of patch filters that make up the group.
       */
      public fun patchFilters(patchFilters: IResolvable)

      /**
       * @param patchFilters The set of patch filters that make up the group.
       */
      public fun patchFilters(patchFilters: List<Any>)

      /**
       * @param patchFilters The set of patch filters that make up the group.
       */
      public fun patchFilters(vararg patchFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty.builder()

      /**
       * @param patchFilters The set of patch filters that make up the group.
       */
      override fun patchFilters(patchFilters: IResolvable) {
        cdkBuilder.patchFilters(patchFilters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param patchFilters The set of patch filters that make up the group.
       */
      override fun patchFilters(patchFilters: List<Any>) {
        cdkBuilder.patchFilters(patchFilters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param patchFilters The set of patch filters that make up the group.
       */
      override fun patchFilters(vararg patchFilters: Any): Unit =
          patchFilters(patchFilters.toList())

      public fun build():
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty,
    ) : CdkObject(cdkObject),
        PatchFilterGroupProperty {
      /**
       * The set of patch filters that make up the group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters)
       */
      override fun patchFilters(): Any? = unwrap(this).getPatchFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PatchFilterGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty):
          PatchFilterGroupProperty = CdkObjectWrappers.wrap(cdkObject) as? PatchFilterGroupProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PatchFilterGroupProperty):
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty
    }
  }

  /**
   * The `PatchFilter` property type defines a patch filter for an AWS Systems Manager patch
   * baseline.
   *
   * The `PatchFilters` property of the
   * [PatchFilterGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html)
   * property type contains a list of `PatchFilter` property types.
   *
   * You can view lists of valid values for the patch properties by running the
   * `DescribePatchProperties` command. For more information, see
   * [DescribePatchProperties](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribePatchProperties.html)
   * in the *AWS Systems Manager API Reference* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssm.*;
   * PatchFilterProperty patchFilterProperty = PatchFilterProperty.builder()
   * .key("key")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html)
   */
  public interface PatchFilterProperty {
    /**
     * The key for the filter.
     *
     * For information about valid keys, see
     * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
     * in the *AWS Systems Manager API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The value for the filter key.
     *
     * For information about valid values for each key based on operating system type, see
     * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
     * in the *AWS Systems Manager API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [PatchFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key for the filter.
       * For information about valid keys, see
       * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
       * in the *AWS Systems Manager API Reference* .
       */
      public fun key(key: String)

      /**
       * @param values The value for the filter key.
       * For information about valid values for each key based on operating system type, see
       * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
       * in the *AWS Systems Manager API Reference* .
       */
      public fun values(values: List<String>)

      /**
       * @param values The value for the filter key.
       * For information about valid values for each key based on operating system type, see
       * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
       * in the *AWS Systems Manager API Reference* .
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty.builder()

      /**
       * @param key The key for the filter.
       * For information about valid keys, see
       * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
       * in the *AWS Systems Manager API Reference* .
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param values The value for the filter key.
       * For information about valid values for each key based on operating system type, see
       * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
       * in the *AWS Systems Manager API Reference* .
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The value for the filter key.
       * For information about valid values for each key based on operating system type, see
       * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
       * in the *AWS Systems Manager API Reference* .
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty,
    ) : CdkObject(cdkObject),
        PatchFilterProperty {
      /**
       * The key for the filter.
       *
       * For information about valid keys, see
       * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
       * in the *AWS Systems Manager API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The value for the filter key.
       *
       * For information about valid values for each key based on operating system type, see
       * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
       * in the *AWS Systems Manager API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PatchFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty):
          PatchFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? PatchFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PatchFilterProperty):
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty
    }
  }

  /**
   * `PatchSource` is the property type for the `Sources` resource of the
   * [AWS::SSM::PatchBaseline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
   * resource.
   *
   * The AWS CloudFormation `AWS::SSM::PatchSource` resource is used to provide information about
   * the patches to use to update target instances, including target operating systems and source
   * repository. Applies to Linux managed nodes only.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssm.*;
   * PatchSourceProperty patchSourceProperty = PatchSourceProperty.builder()
   * .configuration("configuration")
   * .name("name")
   * .products(List.of("products"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html)
   */
  public interface PatchSourceProperty {
    /**
     * The value of the yum repo configuration. For example:.
     *
     * `[main]`
     *
     * `name=MyCustomRepository`
     *
     * `baseurl=https://my-custom-repository`
     *
     * `enabled=1`
     *
     *
     * For information about other options available for your yum repository configuration, see
     * [dnf.conf(5)](https://docs.aws.amazon.com/https://man7.org/linux/man-pages/man5/dnf.conf.5.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-configuration)
     */
    public fun configuration(): String? = unwrap(this).getConfiguration()

    /**
     * The name specified to identify the patch source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The specific operating system versions a patch repository applies to, such as "Ubuntu16.04",
     * "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product values, see
     * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
     * in the *AWS Systems Manager API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-products)
     */
    public fun products(): List<String> = unwrap(this).getProducts() ?: emptyList()

    /**
     * A builder for [PatchSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configuration The value of the yum repo configuration. For example:.
       * `[main]`
       *
       * `name=MyCustomRepository`
       *
       * `baseurl=https://my-custom-repository`
       *
       * `enabled=1`
       *
       *
       * For information about other options available for your yum repository configuration, see
       * [dnf.conf(5)](https://docs.aws.amazon.com/https://man7.org/linux/man-pages/man5/dnf.conf.5.html)
       * .
       */
      public fun configuration(configuration: String)

      /**
       * @param name The name specified to identify the patch source.
       */
      public fun name(name: String)

      /**
       * @param products The specific operating system versions a patch repository applies to, such
       * as "Ubuntu16.04", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product
       * values, see
       * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
       * in the *AWS Systems Manager API Reference* .
       */
      public fun products(products: List<String>)

      /**
       * @param products The specific operating system versions a patch repository applies to, such
       * as "Ubuntu16.04", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product
       * values, see
       * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
       * in the *AWS Systems Manager API Reference* .
       */
      public fun products(vararg products: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty.builder()

      /**
       * @param configuration The value of the yum repo configuration. For example:.
       * `[main]`
       *
       * `name=MyCustomRepository`
       *
       * `baseurl=https://my-custom-repository`
       *
       * `enabled=1`
       *
       *
       * For information about other options available for your yum repository configuration, see
       * [dnf.conf(5)](https://docs.aws.amazon.com/https://man7.org/linux/man-pages/man5/dnf.conf.5.html)
       * .
       */
      override fun configuration(configuration: String) {
        cdkBuilder.configuration(configuration)
      }

      /**
       * @param name The name specified to identify the patch source.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param products The specific operating system versions a patch repository applies to, such
       * as "Ubuntu16.04", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product
       * values, see
       * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
       * in the *AWS Systems Manager API Reference* .
       */
      override fun products(products: List<String>) {
        cdkBuilder.products(products)
      }

      /**
       * @param products The specific operating system versions a patch repository applies to, such
       * as "Ubuntu16.04", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product
       * values, see
       * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
       * in the *AWS Systems Manager API Reference* .
       */
      override fun products(vararg products: String): Unit = products(products.toList())

      public fun build(): software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty,
    ) : CdkObject(cdkObject),
        PatchSourceProperty {
      /**
       * The value of the yum repo configuration. For example:.
       *
       * `[main]`
       *
       * `name=MyCustomRepository`
       *
       * `baseurl=https://my-custom-repository`
       *
       * `enabled=1`
       *
       *
       * For information about other options available for your yum repository configuration, see
       * [dnf.conf(5)](https://docs.aws.amazon.com/https://man7.org/linux/man-pages/man5/dnf.conf.5.html)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-configuration)
       */
      override fun configuration(): String? = unwrap(this).getConfiguration()

      /**
       * The name specified to identify the patch source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The specific operating system versions a patch repository applies to, such as
       * "Ubuntu16.04", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product
       * values, see
       * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
       * in the *AWS Systems Manager API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-products)
       */
      override fun products(): List<String> = unwrap(this).getProducts() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PatchSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty):
          PatchSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? PatchSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PatchSourceProperty):
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty
    }
  }

  /**
   * The `RuleGroup` property type specifies a set of rules that define the approval rules for an
   * AWS Systems Manager patch baseline.
   *
   * `RuleGroup` is the property type for the `ApprovalRules` property of the
   * [AWS::SSM::PatchBaseline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssm.*;
   * RuleGroupProperty ruleGroupProperty = RuleGroupProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html)
   */
  public interface RuleGroupProperty {
    /**
     * The rules that make up the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules)
     */
    public fun patchRules(): Any? = unwrap(this).getPatchRules()

    /**
     * A builder for [RuleGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param patchRules The rules that make up the rule group.
       */
      public fun patchRules(patchRules: IResolvable)

      /**
       * @param patchRules The rules that make up the rule group.
       */
      public fun patchRules(patchRules: List<Any>)

      /**
       * @param patchRules The rules that make up the rule group.
       */
      public fun patchRules(vararg patchRules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty.builder()

      /**
       * @param patchRules The rules that make up the rule group.
       */
      override fun patchRules(patchRules: IResolvable) {
        cdkBuilder.patchRules(patchRules.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param patchRules The rules that make up the rule group.
       */
      override fun patchRules(patchRules: List<Any>) {
        cdkBuilder.patchRules(patchRules.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param patchRules The rules that make up the rule group.
       */
      override fun patchRules(vararg patchRules: Any): Unit = patchRules(patchRules.toList())

      public fun build(): software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty,
    ) : CdkObject(cdkObject),
        RuleGroupProperty {
      /**
       * The rules that make up the rule group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules)
       */
      override fun patchRules(): Any? = unwrap(this).getPatchRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty):
          RuleGroupProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleGroupProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleGroupProperty):
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty
    }
  }

  /**
   * The `Rule` property type specifies an approval rule for a Systems Manager patch baseline.
   *
   * The `PatchRules` property of the
   * [RuleGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html)
   * property type contains a list of `Rule` property types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssm.*;
   * RuleProperty ruleProperty = RuleProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html)
   */
  public interface RuleProperty {
    /**
     * The number of days after the release date of each patch matched by the rule that the patch is
     * marked as approved in the patch baseline.
     *
     * For example, a value of `7` means that patches are approved seven days after they are
     * released.
     *
     * This parameter is marked as `Required: No` , but your request must include a value for either
     * `ApproveAfterDays` or `ApproveUntilDate` .
     *
     * Not supported for Debian Server or Ubuntu Server.
     *
     *
     * Use caution when setting this value for Windows Server patch baselines. Because patch updates
     * that are replaced by later updates are removed, setting too broad a value for this parameter can
     * result in crucial patches not being installed. For more information, see the *Windows Server*
     * tab in the topic [How security patches are
     * selected](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-selecting-patches.html)
     * in the *AWS Systems Manager User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays)
     */
    public fun approveAfterDays(): Number? = unwrap(this).getApproveAfterDays()

    /**
     * The cutoff date for auto approval of released patches.
     *
     * Any patches released on or before this date are installed automatically.
     *
     * Enter dates in the format `YYYY-MM-DD` . For example, `2024-12-31` .
     *
     * This parameter is marked as `Required: No` , but your request must include a value for either
     * `ApproveUntilDate` or `ApproveAfterDays` .
     *
     * Not supported for Debian Server or Ubuntu Server.
     *
     *
     * Use caution when setting this value for Windows Server patch baselines. Because patch updates
     * that are replaced by later updates are removed, setting too broad a value for this parameter can
     * result in crucial patches not being installed. For more information, see the *Windows Server*
     * tab in the topic [How security patches are
     * selected](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-selecting-patches.html)
     * in the *AWS Systems Manager User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveuntildate)
     */
    public fun approveUntilDate(): String? = unwrap(this).getApproveUntilDate()

    /**
     * A compliance severity level for all approved patches in a patch baseline.
     *
     * Valid compliance severity levels include the following: `UNSPECIFIED` , `CRITICAL` , `HIGH` ,
     * `MEDIUM` , `LOW` , and `INFORMATIONAL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel)
     */
    public fun complianceLevel(): String? = unwrap(this).getComplianceLevel()

    /**
     * For managed nodes identified by the approval rule filters, enables a patch baseline to apply
     * non-security updates available in the specified repository.
     *
     * The default value is `false` . Applies to Linux managed nodes only.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity)
     */
    public fun enableNonSecurity(): Any? = unwrap(this).getEnableNonSecurity()

    /**
     * The patch filter group that defines the criteria for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-patchfiltergroup)
     */
    public fun patchFilterGroup(): Any? = unwrap(this).getPatchFilterGroup()

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param approveAfterDays The number of days after the release date of each patch matched by
       * the rule that the patch is marked as approved in the patch baseline.
       * For example, a value of `7` means that patches are approved seven days after they are
       * released.
       *
       * This parameter is marked as `Required: No` , but your request must include a value for
       * either `ApproveAfterDays` or `ApproveUntilDate` .
       *
       * Not supported for Debian Server or Ubuntu Server.
       *
       *
       * Use caution when setting this value for Windows Server patch baselines. Because patch
       * updates that are replaced by later updates are removed, setting too broad a value for this
       * parameter can result in crucial patches not being installed. For more information, see the
       * *Windows Server* tab in the topic [How security patches are
       * selected](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-selecting-patches.html)
       * in the *AWS Systems Manager User Guide* .
       */
      public fun approveAfterDays(approveAfterDays: Number)

      /**
       * @param approveUntilDate The cutoff date for auto approval of released patches.
       * Any patches released on or before this date are installed automatically.
       *
       * Enter dates in the format `YYYY-MM-DD` . For example, `2024-12-31` .
       *
       * This parameter is marked as `Required: No` , but your request must include a value for
       * either `ApproveUntilDate` or `ApproveAfterDays` .
       *
       * Not supported for Debian Server or Ubuntu Server.
       *
       *
       * Use caution when setting this value for Windows Server patch baselines. Because patch
       * updates that are replaced by later updates are removed, setting too broad a value for this
       * parameter can result in crucial patches not being installed. For more information, see the
       * *Windows Server* tab in the topic [How security patches are
       * selected](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-selecting-patches.html)
       * in the *AWS Systems Manager User Guide* .
       */
      public fun approveUntilDate(approveUntilDate: String)

      /**
       * @param complianceLevel A compliance severity level for all approved patches in a patch
       * baseline.
       * Valid compliance severity levels include the following: `UNSPECIFIED` , `CRITICAL` , `HIGH`
       * , `MEDIUM` , `LOW` , and `INFORMATIONAL` .
       */
      public fun complianceLevel(complianceLevel: String)

      /**
       * @param enableNonSecurity For managed nodes identified by the approval rule filters, enables
       * a patch baseline to apply non-security updates available in the specified repository.
       * The default value is `false` . Applies to Linux managed nodes only.
       */
      public fun enableNonSecurity(enableNonSecurity: Boolean)

      /**
       * @param enableNonSecurity For managed nodes identified by the approval rule filters, enables
       * a patch baseline to apply non-security updates available in the specified repository.
       * The default value is `false` . Applies to Linux managed nodes only.
       */
      public fun enableNonSecurity(enableNonSecurity: IResolvable)

      /**
       * @param patchFilterGroup The patch filter group that defines the criteria for the rule.
       */
      public fun patchFilterGroup(patchFilterGroup: IResolvable)

      /**
       * @param patchFilterGroup The patch filter group that defines the criteria for the rule.
       */
      public fun patchFilterGroup(patchFilterGroup: PatchFilterGroupProperty)

      /**
       * @param patchFilterGroup The patch filter group that defines the criteria for the rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("188a3d6eaef2727403d5cd8b35fdb8fc1f8b3f82392cf3919cbf36289fa431d8")
      public fun patchFilterGroup(patchFilterGroup: PatchFilterGroupProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty.builder()

      /**
       * @param approveAfterDays The number of days after the release date of each patch matched by
       * the rule that the patch is marked as approved in the patch baseline.
       * For example, a value of `7` means that patches are approved seven days after they are
       * released.
       *
       * This parameter is marked as `Required: No` , but your request must include a value for
       * either `ApproveAfterDays` or `ApproveUntilDate` .
       *
       * Not supported for Debian Server or Ubuntu Server.
       *
       *
       * Use caution when setting this value for Windows Server patch baselines. Because patch
       * updates that are replaced by later updates are removed, setting too broad a value for this
       * parameter can result in crucial patches not being installed. For more information, see the
       * *Windows Server* tab in the topic [How security patches are
       * selected](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-selecting-patches.html)
       * in the *AWS Systems Manager User Guide* .
       */
      override fun approveAfterDays(approveAfterDays: Number) {
        cdkBuilder.approveAfterDays(approveAfterDays)
      }

      /**
       * @param approveUntilDate The cutoff date for auto approval of released patches.
       * Any patches released on or before this date are installed automatically.
       *
       * Enter dates in the format `YYYY-MM-DD` . For example, `2024-12-31` .
       *
       * This parameter is marked as `Required: No` , but your request must include a value for
       * either `ApproveUntilDate` or `ApproveAfterDays` .
       *
       * Not supported for Debian Server or Ubuntu Server.
       *
       *
       * Use caution when setting this value for Windows Server patch baselines. Because patch
       * updates that are replaced by later updates are removed, setting too broad a value for this
       * parameter can result in crucial patches not being installed. For more information, see the
       * *Windows Server* tab in the topic [How security patches are
       * selected](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-selecting-patches.html)
       * in the *AWS Systems Manager User Guide* .
       */
      override fun approveUntilDate(approveUntilDate: String) {
        cdkBuilder.approveUntilDate(approveUntilDate)
      }

      /**
       * @param complianceLevel A compliance severity level for all approved patches in a patch
       * baseline.
       * Valid compliance severity levels include the following: `UNSPECIFIED` , `CRITICAL` , `HIGH`
       * , `MEDIUM` , `LOW` , and `INFORMATIONAL` .
       */
      override fun complianceLevel(complianceLevel: String) {
        cdkBuilder.complianceLevel(complianceLevel)
      }

      /**
       * @param enableNonSecurity For managed nodes identified by the approval rule filters, enables
       * a patch baseline to apply non-security updates available in the specified repository.
       * The default value is `false` . Applies to Linux managed nodes only.
       */
      override fun enableNonSecurity(enableNonSecurity: Boolean) {
        cdkBuilder.enableNonSecurity(enableNonSecurity)
      }

      /**
       * @param enableNonSecurity For managed nodes identified by the approval rule filters, enables
       * a patch baseline to apply non-security updates available in the specified repository.
       * The default value is `false` . Applies to Linux managed nodes only.
       */
      override fun enableNonSecurity(enableNonSecurity: IResolvable) {
        cdkBuilder.enableNonSecurity(enableNonSecurity.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param patchFilterGroup The patch filter group that defines the criteria for the rule.
       */
      override fun patchFilterGroup(patchFilterGroup: IResolvable) {
        cdkBuilder.patchFilterGroup(patchFilterGroup.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param patchFilterGroup The patch filter group that defines the criteria for the rule.
       */
      override fun patchFilterGroup(patchFilterGroup: PatchFilterGroupProperty) {
        cdkBuilder.patchFilterGroup(patchFilterGroup.let(PatchFilterGroupProperty.Companion::unwrap))
      }

      /**
       * @param patchFilterGroup The patch filter group that defines the criteria for the rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("188a3d6eaef2727403d5cd8b35fdb8fc1f8b3f82392cf3919cbf36289fa431d8")
      override fun patchFilterGroup(patchFilterGroup: PatchFilterGroupProperty.Builder.() -> Unit):
          Unit = patchFilterGroup(PatchFilterGroupProperty(patchFilterGroup))

      public fun build(): software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty,
    ) : CdkObject(cdkObject),
        RuleProperty {
      /**
       * The number of days after the release date of each patch matched by the rule that the patch
       * is marked as approved in the patch baseline.
       *
       * For example, a value of `7` means that patches are approved seven days after they are
       * released.
       *
       * This parameter is marked as `Required: No` , but your request must include a value for
       * either `ApproveAfterDays` or `ApproveUntilDate` .
       *
       * Not supported for Debian Server or Ubuntu Server.
       *
       *
       * Use caution when setting this value for Windows Server patch baselines. Because patch
       * updates that are replaced by later updates are removed, setting too broad a value for this
       * parameter can result in crucial patches not being installed. For more information, see the
       * *Windows Server* tab in the topic [How security patches are
       * selected](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-selecting-patches.html)
       * in the *AWS Systems Manager User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays)
       */
      override fun approveAfterDays(): Number? = unwrap(this).getApproveAfterDays()

      /**
       * The cutoff date for auto approval of released patches.
       *
       * Any patches released on or before this date are installed automatically.
       *
       * Enter dates in the format `YYYY-MM-DD` . For example, `2024-12-31` .
       *
       * This parameter is marked as `Required: No` , but your request must include a value for
       * either `ApproveUntilDate` or `ApproveAfterDays` .
       *
       * Not supported for Debian Server or Ubuntu Server.
       *
       *
       * Use caution when setting this value for Windows Server patch baselines. Because patch
       * updates that are replaced by later updates are removed, setting too broad a value for this
       * parameter can result in crucial patches not being installed. For more information, see the
       * *Windows Server* tab in the topic [How security patches are
       * selected](https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-selecting-patches.html)
       * in the *AWS Systems Manager User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveuntildate)
       */
      override fun approveUntilDate(): String? = unwrap(this).getApproveUntilDate()

      /**
       * A compliance severity level for all approved patches in a patch baseline.
       *
       * Valid compliance severity levels include the following: `UNSPECIFIED` , `CRITICAL` , `HIGH`
       * , `MEDIUM` , `LOW` , and `INFORMATIONAL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel)
       */
      override fun complianceLevel(): String? = unwrap(this).getComplianceLevel()

      /**
       * For managed nodes identified by the approval rule filters, enables a patch baseline to
       * apply non-security updates available in the specified repository.
       *
       * The default value is `false` . Applies to Linux managed nodes only.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity)
       */
      override fun enableNonSecurity(): Any? = unwrap(this).getEnableNonSecurity()

      /**
       * The patch filter group that defines the criteria for the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-patchfiltergroup)
       */
      override fun patchFilterGroup(): Any? = unwrap(this).getPatchFilterGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty):
          RuleProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty
    }
  }
}
