@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * IPAM is a VPC feature that you can use to automate your IP address management workflows including
 * assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts
 * throughout your AWS Organization.
 *
 * For more information, see [What is
 * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
 * User Guide* .
 *
 * There are AWS Identity and Access Management (IAM) permissions required to fully manage an IPAM
 * in CloudFormation. For more information, see [Example
 * policy](https://docs.aws.amazon.com//vpc/latest/ipam/iam-ipam-policy-examples.html) in the *Amazon
 * VPC IPAM User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnIPAM cfnIPAM = CfnIPAM.Builder.create(this, "MyCfnIPAM")
 * .defaultResourceDiscoveryOrganizationalUnitExclusions(List.of(IpamOrganizationalUnitExclusionProperty.builder()
 * .organizationsEntityPath("organizationsEntityPath")
 * .build()))
 * .description("description")
 * .enablePrivateGua(false)
 * .meteredAccount("meteredAccount")
 * .operatingRegions(List.of(IpamOperatingRegionProperty.builder()
 * .regionName("regionName")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tier("tier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html)
 */
public open class CfnIPAM(
  cdkObject: software.amazon.awscdk.services.ec2.CfnIPAM,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ec2.CfnIPAM(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIPAMProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnIPAM(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIPAMProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIPAMProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIPAMProps(props)
  )

  /**
   * The ARN of the IPAM.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the default resource discovery association.
   */
  public open fun attrDefaultResourceDiscoveryAssociationId(): String =
      unwrap(this).getAttrDefaultResourceDiscoveryAssociationId()

  /**
   * The ID of the default resource discovery.
   */
  public open fun attrDefaultResourceDiscoveryId(): String =
      unwrap(this).getAttrDefaultResourceDiscoveryId()

  /**
   * The ID of the IPAM.
   */
  public open fun attrIpamId(): String = unwrap(this).getAttrIpamId()

  /**
   * The ID of the default private scope.
   */
  public open fun attrPrivateDefaultScopeId(): String = unwrap(this).getAttrPrivateDefaultScopeId()

  /**
   * The ID of the default public scope.
   */
  public open fun attrPublicDefaultScopeId(): String = unwrap(this).getAttrPublicDefaultScopeId()

  /**
   * The number of resource discovery associations.
   */
  public open fun attrResourceDiscoveryAssociationCount(): Number =
      unwrap(this).getAttrResourceDiscoveryAssociationCount()

  /**
   * The number of scopes.
   */
  public open fun attrScopeCount(): Number = unwrap(this).getAttrScopeCount()

  /**
   * If your IPAM is integrated with AWS Organizations, you can exclude an [organizational unit
   * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
   * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
   * accounts in that OU. For more information, see [Exclude organizational units from
   * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual Private
   * Cloud IP Address Manager User Guide* .
   */
  public open fun defaultResourceDiscoveryOrganizationalUnitExclusions(): Any? =
      unwrap(this).getDefaultResourceDiscoveryOrganizationalUnitExclusions()

  /**
   * If your IPAM is integrated with AWS Organizations, you can exclude an [organizational unit
   * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
   * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
   * accounts in that OU. For more information, see [Exclude organizational units from
   * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual Private
   * Cloud IP Address Manager User Guide* .
   */
  public open fun defaultResourceDiscoveryOrganizationalUnitExclusions(`value`: IResolvable) {
    unwrap(this).setDefaultResourceDiscoveryOrganizationalUnitExclusions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * If your IPAM is integrated with AWS Organizations, you can exclude an [organizational unit
   * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
   * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
   * accounts in that OU. For more information, see [Exclude organizational units from
   * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual Private
   * Cloud IP Address Manager User Guide* .
   */
  public open fun defaultResourceDiscoveryOrganizationalUnitExclusions(`value`: List<Any>) {
    unwrap(this).setDefaultResourceDiscoveryOrganizationalUnitExclusions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * If your IPAM is integrated with AWS Organizations, you can exclude an [organizational unit
   * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
   * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
   * accounts in that OU. For more information, see [Exclude organizational units from
   * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual Private
   * Cloud IP Address Manager User Guide* .
   */
  public open fun defaultResourceDiscoveryOrganizationalUnitExclusions(vararg `value`: Any): Unit =
      defaultResourceDiscoveryOrganizationalUnitExclusions(`value`.toList())

  /**
   * The description for the IPAM.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description for the IPAM.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Enable this option to use your own GUA ranges as private IPv6 addresses.
   */
  public open fun enablePrivateGua(): Any? = unwrap(this).getEnablePrivateGua()

  /**
   * Enable this option to use your own GUA ranges as private IPv6 addresses.
   */
  public open fun enablePrivateGua(`value`: Boolean) {
    unwrap(this).setEnablePrivateGua(`value`)
  }

  /**
   * Enable this option to use your own GUA ranges as private IPv6 addresses.
   */
  public open fun enablePrivateGua(`value`: IResolvable) {
    unwrap(this).setEnablePrivateGua(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A metered account is an account that is charged for active IP addresses managed in IPAM.
   */
  public open fun meteredAccount(): String? = unwrap(this).getMeteredAccount()

  /**
   * A metered account is an account that is charged for active IP addresses managed in IPAM.
   */
  public open fun meteredAccount(`value`: String) {
    unwrap(this).setMeteredAccount(`value`)
  }

  /**
   * The operating Regions for an IPAM.
   */
  public open fun operatingRegions(): Any? = unwrap(this).getOperatingRegions()

  /**
   * The operating Regions for an IPAM.
   */
  public open fun operatingRegions(`value`: IResolvable) {
    unwrap(this).setOperatingRegions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The operating Regions for an IPAM.
   */
  public open fun operatingRegions(`value`: List<Any>) {
    unwrap(this).setOperatingRegions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The operating Regions for an IPAM.
   */
  public open fun operatingRegions(vararg `value`: Any): Unit = operatingRegions(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The key/value combination of a tag assigned to the resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The key/value combination of a tag assigned to the resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The key/value combination of a tag assigned to the resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * IPAM is offered in a Free Tier and an Advanced Tier.
   */
  public open fun tier(): String? = unwrap(this).getTier()

  /**
   * IPAM is offered in a Free Tier and an Advanced Tier.
   */
  public open fun tier(`value`: String) {
    unwrap(this).setTier(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnIPAM].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * If your IPAM is integrated with AWS Organizations, you can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-defaultresourcediscoveryorganizationalunitexclusions)
     * @param defaultResourceDiscoveryOrganizationalUnitExclusions If your IPAM is integrated with
     * AWS Organizations, you can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* . 
     */
    public
        fun defaultResourceDiscoveryOrganizationalUnitExclusions(defaultResourceDiscoveryOrganizationalUnitExclusions: IResolvable)

    /**
     * If your IPAM is integrated with AWS Organizations, you can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-defaultresourcediscoveryorganizationalunitexclusions)
     * @param defaultResourceDiscoveryOrganizationalUnitExclusions If your IPAM is integrated with
     * AWS Organizations, you can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* . 
     */
    public
        fun defaultResourceDiscoveryOrganizationalUnitExclusions(defaultResourceDiscoveryOrganizationalUnitExclusions: List<Any>)

    /**
     * If your IPAM is integrated with AWS Organizations, you can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-defaultresourcediscoveryorganizationalunitexclusions)
     * @param defaultResourceDiscoveryOrganizationalUnitExclusions If your IPAM is integrated with
     * AWS Organizations, you can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* . 
     */
    public fun defaultResourceDiscoveryOrganizationalUnitExclusions(vararg
        defaultResourceDiscoveryOrganizationalUnitExclusions: Any)

    /**
     * The description for the IPAM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-description)
     * @param description The description for the IPAM. 
     */
    public fun description(description: String)

    /**
     * Enable this option to use your own GUA ranges as private IPv6 addresses.
     *
     * This option is disabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-enableprivategua)
     * @param enablePrivateGua Enable this option to use your own GUA ranges as private IPv6
     * addresses. 
     */
    public fun enablePrivateGua(enablePrivateGua: Boolean)

    /**
     * Enable this option to use your own GUA ranges as private IPv6 addresses.
     *
     * This option is disabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-enableprivategua)
     * @param enablePrivateGua Enable this option to use your own GUA ranges as private IPv6
     * addresses. 
     */
    public fun enablePrivateGua(enablePrivateGua: IResolvable)

    /**
     * A metered account is an account that is charged for active IP addresses managed in IPAM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-meteredaccount)
     * @param meteredAccount A metered account is an account that is charged for active IP addresses
     * managed in IPAM. 
     */
    public fun meteredAccount(meteredAccount: String)

    /**
     * The operating Regions for an IPAM.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see [Create an
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
     * @param operatingRegions The operating Regions for an IPAM. 
     */
    public fun operatingRegions(operatingRegions: IResolvable)

    /**
     * The operating Regions for an IPAM.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see [Create an
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
     * @param operatingRegions The operating Regions for an IPAM. 
     */
    public fun operatingRegions(operatingRegions: List<Any>)

    /**
     * The operating Regions for an IPAM.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see [Create an
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
     * @param operatingRegions The operating Regions for an IPAM. 
     */
    public fun operatingRegions(vararg operatingRegions: Any)

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tags)
     * @param tags The key/value combination of a tag assigned to the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tags)
     * @param tags The key/value combination of a tag assigned to the resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * IPAM is offered in a Free Tier and an Advanced Tier.
     *
     * For more information about the features available in each tier and the costs associated with
     * the tiers, see the [VPC IPAM product pricing page](https://docs.aws.amazon.com//vpc/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tier)
     * @param tier IPAM is offered in a Free Tier and an Advanced Tier. 
     */
    public fun tier(tier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAM.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAM.Builder.create(scope, id)

    /**
     * If your IPAM is integrated with AWS Organizations, you can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-defaultresourcediscoveryorganizationalunitexclusions)
     * @param defaultResourceDiscoveryOrganizationalUnitExclusions If your IPAM is integrated with
     * AWS Organizations, you can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* . 
     */
    override
        fun defaultResourceDiscoveryOrganizationalUnitExclusions(defaultResourceDiscoveryOrganizationalUnitExclusions: IResolvable) {
      cdkBuilder.defaultResourceDiscoveryOrganizationalUnitExclusions(defaultResourceDiscoveryOrganizationalUnitExclusions.let(IResolvable.Companion::unwrap))
    }

    /**
     * If your IPAM is integrated with AWS Organizations, you can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-defaultresourcediscoveryorganizationalunitexclusions)
     * @param defaultResourceDiscoveryOrganizationalUnitExclusions If your IPAM is integrated with
     * AWS Organizations, you can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* . 
     */
    override
        fun defaultResourceDiscoveryOrganizationalUnitExclusions(defaultResourceDiscoveryOrganizationalUnitExclusions: List<Any>) {
      cdkBuilder.defaultResourceDiscoveryOrganizationalUnitExclusions(defaultResourceDiscoveryOrganizationalUnitExclusions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * If your IPAM is integrated with AWS Organizations, you can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-defaultresourcediscoveryorganizationalunitexclusions)
     * @param defaultResourceDiscoveryOrganizationalUnitExclusions If your IPAM is integrated with
     * AWS Organizations, you can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* . 
     */
    override fun defaultResourceDiscoveryOrganizationalUnitExclusions(vararg
        defaultResourceDiscoveryOrganizationalUnitExclusions: Any): Unit =
        defaultResourceDiscoveryOrganizationalUnitExclusions(defaultResourceDiscoveryOrganizationalUnitExclusions.toList())

    /**
     * The description for the IPAM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-description)
     * @param description The description for the IPAM. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Enable this option to use your own GUA ranges as private IPv6 addresses.
     *
     * This option is disabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-enableprivategua)
     * @param enablePrivateGua Enable this option to use your own GUA ranges as private IPv6
     * addresses. 
     */
    override fun enablePrivateGua(enablePrivateGua: Boolean) {
      cdkBuilder.enablePrivateGua(enablePrivateGua)
    }

    /**
     * Enable this option to use your own GUA ranges as private IPv6 addresses.
     *
     * This option is disabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-enableprivategua)
     * @param enablePrivateGua Enable this option to use your own GUA ranges as private IPv6
     * addresses. 
     */
    override fun enablePrivateGua(enablePrivateGua: IResolvable) {
      cdkBuilder.enablePrivateGua(enablePrivateGua.let(IResolvable.Companion::unwrap))
    }

    /**
     * A metered account is an account that is charged for active IP addresses managed in IPAM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-meteredaccount)
     * @param meteredAccount A metered account is an account that is charged for active IP addresses
     * managed in IPAM. 
     */
    override fun meteredAccount(meteredAccount: String) {
      cdkBuilder.meteredAccount(meteredAccount)
    }

    /**
     * The operating Regions for an IPAM.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see [Create an
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
     * @param operatingRegions The operating Regions for an IPAM. 
     */
    override fun operatingRegions(operatingRegions: IResolvable) {
      cdkBuilder.operatingRegions(operatingRegions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The operating Regions for an IPAM.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see [Create an
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
     * @param operatingRegions The operating Regions for an IPAM. 
     */
    override fun operatingRegions(operatingRegions: List<Any>) {
      cdkBuilder.operatingRegions(operatingRegions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The operating Regions for an IPAM.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see [Create an
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
     * @param operatingRegions The operating Regions for an IPAM. 
     */
    override fun operatingRegions(vararg operatingRegions: Any): Unit =
        operatingRegions(operatingRegions.toList())

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tags)
     * @param tags The key/value combination of a tag assigned to the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tags)
     * @param tags The key/value combination of a tag assigned to the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * IPAM is offered in a Free Tier and an Advanced Tier.
     *
     * For more information about the features available in each tier and the costs associated with
     * the tiers, see the [VPC IPAM product pricing page](https://docs.aws.amazon.com//vpc/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tier)
     * @param tier IPAM is offered in a Free Tier and an Advanced Tier. 
     */
    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAM = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnIPAM.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPAM {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPAM(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAM): CfnIPAM =
        CfnIPAM(cdkObject)

    internal fun unwrap(wrapped: CfnIPAM): software.amazon.awscdk.services.ec2.CfnIPAM =
        wrapped.cdkObject as software.amazon.awscdk.services.ec2.CfnIPAM
  }

  /**
   * The operating Regions for an IPAM.
   *
   * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
   * only discovers and monitors resources in the AWS Regions you select as operating Regions.
   *
   * For more information about operating Regions, see [Create an
   * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM User
   * Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * IpamOperatingRegionProperty ipamOperatingRegionProperty = IpamOperatingRegionProperty.builder()
   * .regionName("regionName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipam-ipamoperatingregion.html)
   */
  public interface IpamOperatingRegionProperty {
    /**
     * The name of the operating Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipam-ipamoperatingregion.html#cfn-ec2-ipam-ipamoperatingregion-regionname)
     */
    public fun regionName(): String

    /**
     * A builder for [IpamOperatingRegionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param regionName The name of the operating Region. 
       */
      public fun regionName(regionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnIPAM.IpamOperatingRegionProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnIPAM.IpamOperatingRegionProperty.builder()

      /**
       * @param regionName The name of the operating Region. 
       */
      override fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnIPAM.IpamOperatingRegionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnIPAM.IpamOperatingRegionProperty,
    ) : CdkObject(cdkObject),
        IpamOperatingRegionProperty {
      /**
       * The name of the operating Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipam-ipamoperatingregion.html#cfn-ec2-ipam-ipamoperatingregion-regionname)
       */
      override fun regionName(): String = unwrap(this).getRegionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IpamOperatingRegionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAM.IpamOperatingRegionProperty):
          IpamOperatingRegionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IpamOperatingRegionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpamOperatingRegionProperty):
          software.amazon.awscdk.services.ec2.CfnIPAM.IpamOperatingRegionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnIPAM.IpamOperatingRegionProperty
    }
  }

  /**
   * If your IPAM is integrated with AWS Organizations, you can exclude an [organizational unit
   * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
   * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
   * accounts in that OU. For more information, see [Exclude organizational units from
   * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual Private
   * Cloud IP Address Manager User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * IpamOrganizationalUnitExclusionProperty ipamOrganizationalUnitExclusionProperty =
   * IpamOrganizationalUnitExclusionProperty.builder()
   * .organizationsEntityPath("organizationsEntityPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipam-ipamorganizationalunitexclusion.html)
   */
  public interface IpamOrganizationalUnitExclusionProperty {
    /**
     * An AWS Organizations entity path.
     *
     * For more information on the entity path, see [Understand the AWS Organizations entity
     * path](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_last-accessed-view-data-orgs.html#access_policies_access-advisor-viewing-orgs-entity-path)
     * in the *AWS Identity and Access Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipam-ipamorganizationalunitexclusion.html#cfn-ec2-ipam-ipamorganizationalunitexclusion-organizationsentitypath)
     */
    public fun organizationsEntityPath(): String

    /**
     * A builder for [IpamOrganizationalUnitExclusionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param organizationsEntityPath An AWS Organizations entity path. 
       * For more information on the entity path, see [Understand the AWS Organizations entity
       * path](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_last-accessed-view-data-orgs.html#access_policies_access-advisor-viewing-orgs-entity-path)
       * in the *AWS Identity and Access Management User Guide* .
       */
      public fun organizationsEntityPath(organizationsEntityPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnIPAM.IpamOrganizationalUnitExclusionProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnIPAM.IpamOrganizationalUnitExclusionProperty.builder()

      /**
       * @param organizationsEntityPath An AWS Organizations entity path. 
       * For more information on the entity path, see [Understand the AWS Organizations entity
       * path](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_last-accessed-view-data-orgs.html#access_policies_access-advisor-viewing-orgs-entity-path)
       * in the *AWS Identity and Access Management User Guide* .
       */
      override fun organizationsEntityPath(organizationsEntityPath: String) {
        cdkBuilder.organizationsEntityPath(organizationsEntityPath)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnIPAM.IpamOrganizationalUnitExclusionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnIPAM.IpamOrganizationalUnitExclusionProperty,
    ) : CdkObject(cdkObject),
        IpamOrganizationalUnitExclusionProperty {
      /**
       * An AWS Organizations entity path.
       *
       * For more information on the entity path, see [Understand the AWS Organizations entity
       * path](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_last-accessed-view-data-orgs.html#access_policies_access-advisor-viewing-orgs-entity-path)
       * in the *AWS Identity and Access Management User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipam-ipamorganizationalunitexclusion.html#cfn-ec2-ipam-ipamorganizationalunitexclusion-organizationsentitypath)
       */
      override fun organizationsEntityPath(): String = unwrap(this).getOrganizationsEntityPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IpamOrganizationalUnitExclusionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAM.IpamOrganizationalUnitExclusionProperty):
          IpamOrganizationalUnitExclusionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IpamOrganizationalUnitExclusionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpamOrganizationalUnitExclusionProperty):
          software.amazon.awscdk.services.ec2.CfnIPAM.IpamOrganizationalUnitExclusionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnIPAM.IpamOrganizationalUnitExclusionProperty
    }
  }
}
