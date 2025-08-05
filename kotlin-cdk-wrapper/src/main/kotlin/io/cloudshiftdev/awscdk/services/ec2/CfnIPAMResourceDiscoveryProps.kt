@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnIPAMResourceDiscovery`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnIPAMResourceDiscoveryProps cfnIPAMResourceDiscoveryProps =
 * CfnIPAMResourceDiscoveryProps.builder()
 * .description("description")
 * .operatingRegions(List.of(IpamOperatingRegionProperty.builder()
 * .regionName("regionName")
 * .build()))
 * .organizationalUnitExclusions(List.of(IpamResourceDiscoveryOrganizationalUnitExclusionProperty.builder()
 * .organizationsEntityPath("organizationsEntityPath")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html)
 */
public interface CfnIPAMResourceDiscoveryProps {
  /**
   * The resource discovery description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The operating Regions for the resource discovery.
   *
   * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
   * only discovers and monitors resources in the AWS Regions you select as operating Regions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-operatingregions)
   */
  public fun operatingRegions(): Any? = unwrap(this).getOperatingRegions()

  /**
   * If your IPAM is integrated with AWS Organizations, you can exclude an [organizational unit
   * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
   * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
   * accounts in that OU. For more information, see [Exclude organizational units from
   * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual Private
   * Cloud IP Address Manager User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-organizationalunitexclusions)
   */
  public fun organizationalUnitExclusions(): Any? = unwrap(this).getOrganizationalUnitExclusions()

  /**
   * A tag is a label that you assign to an AWS resource.
   *
   * Each tag consists of a key and an optional value. You can use tags to search and filter your
   * resources or track your AWS costs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnIPAMResourceDiscoveryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The resource discovery description.
     */
    public fun description(description: String)

    /**
     * @param operatingRegions The operating Regions for the resource discovery.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     */
    public fun operatingRegions(operatingRegions: IResolvable)

    /**
     * @param operatingRegions The operating Regions for the resource discovery.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     */
    public fun operatingRegions(operatingRegions: List<Any>)

    /**
     * @param operatingRegions The operating Regions for the resource discovery.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     */
    public fun operatingRegions(vararg operatingRegions: Any)

    /**
     * @param organizationalUnitExclusions If your IPAM is integrated with AWS Organizations, you
     * can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* .
     */
    public fun organizationalUnitExclusions(organizationalUnitExclusions: IResolvable)

    /**
     * @param organizationalUnitExclusions If your IPAM is integrated with AWS Organizations, you
     * can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* .
     */
    public fun organizationalUnitExclusions(organizationalUnitExclusions: List<Any>)

    /**
     * @param organizationalUnitExclusions If your IPAM is integrated with AWS Organizations, you
     * can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* .
     */
    public fun organizationalUnitExclusions(vararg organizationalUnitExclusions: Any)

    /**
     * @param tags A tag is a label that you assign to an AWS resource.
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A tag is a label that you assign to an AWS resource.
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps.builder()

    /**
     * @param description The resource discovery description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param operatingRegions The operating Regions for the resource discovery.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     */
    override fun operatingRegions(operatingRegions: IResolvable) {
      cdkBuilder.operatingRegions(operatingRegions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param operatingRegions The operating Regions for the resource discovery.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     */
    override fun operatingRegions(operatingRegions: List<Any>) {
      cdkBuilder.operatingRegions(operatingRegions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param operatingRegions The operating Regions for the resource discovery.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     */
    override fun operatingRegions(vararg operatingRegions: Any): Unit =
        operatingRegions(operatingRegions.toList())

    /**
     * @param organizationalUnitExclusions If your IPAM is integrated with AWS Organizations, you
     * can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* .
     */
    override fun organizationalUnitExclusions(organizationalUnitExclusions: IResolvable) {
      cdkBuilder.organizationalUnitExclusions(organizationalUnitExclusions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param organizationalUnitExclusions If your IPAM is integrated with AWS Organizations, you
     * can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* .
     */
    override fun organizationalUnitExclusions(organizationalUnitExclusions: List<Any>) {
      cdkBuilder.organizationalUnitExclusions(organizationalUnitExclusions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param organizationalUnitExclusions If your IPAM is integrated with AWS Organizations, you
     * can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* .
     */
    override fun organizationalUnitExclusions(vararg organizationalUnitExclusions: Any): Unit =
        organizationalUnitExclusions(organizationalUnitExclusions.toList())

    /**
     * @param tags A tag is a label that you assign to an AWS resource.
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A tag is a label that you assign to an AWS resource.
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps,
  ) : CdkObject(cdkObject),
      CfnIPAMResourceDiscoveryProps {
    /**
     * The resource discovery description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The operating Regions for the resource discovery.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-operatingregions)
     */
    override fun operatingRegions(): Any? = unwrap(this).getOperatingRegions()

    /**
     * If your IPAM is integrated with AWS Organizations, you can exclude an [organizational unit
     * (OU)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#organizationalunit)
     * from being managed by IPAM. When you exclude an OU, IPAM will not manage the IP addresses in
     * accounts in that OU. For more information, see [Exclude organizational units from
     * IPAM](https://docs.aws.amazon.com/vpc/latest/ipam/exclude-ous.html) in the *Amazon Virtual
     * Private Cloud IP Address Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-organizationalunitexclusions)
     */
    override fun organizationalUnitExclusions(): Any? =
        unwrap(this).getOrganizationalUnitExclusions()

    /**
     * A tag is a label that you assign to an AWS resource.
     *
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPAMResourceDiscoveryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps):
        CfnIPAMResourceDiscoveryProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnIPAMResourceDiscoveryProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMResourceDiscoveryProps):
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps
  }
}
