@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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

/**
 * Properties for defining a `CfnIPAM`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnIPAMProps cfnIPAMProps = CfnIPAMProps.builder()
 * .description("description")
 * .enablePrivateGua(false)
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
public interface CfnIPAMProps {
  /**
   * The description for the IPAM.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Enable this option to use your own GUA ranges as private IPv6 addresses.
   *
   * This option is disabled by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-enableprivategua)
   */
  public fun enablePrivateGua(): Any? = unwrap(this).getEnablePrivateGua()

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
   */
  public fun operatingRegions(): Any? = unwrap(this).getOperatingRegions()

  /**
   * The key/value combination of a tag assigned to the resource.
   *
   * Use the tag key in the filter name and the tag value as the filter value. For example, to find
   * all resources that have a tag with the key `Owner` and the value `TeamA` , specify `tag:Owner` for
   * the filter name and `TeamA` for the filter value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * IPAM is offered in a Free Tier and an Advanced Tier.
   *
   * For more information about the features available in each tier and the costs associated with
   * the tiers, see the [VPC IPAM product pricing page](https://docs.aws.amazon.com//vpc/pricing/) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tier)
   */
  public fun tier(): String? = unwrap(this).getTier()

  /**
   * A builder for [CfnIPAMProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description for the IPAM.
     */
    public fun description(description: String)

    /**
     * @param enablePrivateGua Enable this option to use your own GUA ranges as private IPv6
     * addresses.
     * This option is disabled by default.
     */
    public fun enablePrivateGua(enablePrivateGua: Boolean)

    /**
     * @param enablePrivateGua Enable this option to use your own GUA ranges as private IPv6
     * addresses.
     * This option is disabled by default.
     */
    public fun enablePrivateGua(enablePrivateGua: IResolvable)

    /**
     * @param operatingRegions The operating Regions for an IPAM.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see [Create an
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     */
    public fun operatingRegions(operatingRegions: IResolvable)

    /**
     * @param operatingRegions The operating Regions for an IPAM.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see [Create an
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     */
    public fun operatingRegions(operatingRegions: List<Any>)

    /**
     * @param operatingRegions The operating Regions for an IPAM.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see [Create an
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     */
    public fun operatingRegions(vararg operatingRegions: Any)

    /**
     * @param tags The key/value combination of a tag assigned to the resource.
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The key/value combination of a tag assigned to the resource.
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tier IPAM is offered in a Free Tier and an Advanced Tier.
     * For more information about the features available in each tier and the costs associated with
     * the tiers, see the [VPC IPAM product pricing page](https://docs.aws.amazon.com//vpc/pricing/) .
     */
    public fun tier(tier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMProps.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMProps.builder()

    /**
     * @param description The description for the IPAM.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enablePrivateGua Enable this option to use your own GUA ranges as private IPv6
     * addresses.
     * This option is disabled by default.
     */
    override fun enablePrivateGua(enablePrivateGua: Boolean) {
      cdkBuilder.enablePrivateGua(enablePrivateGua)
    }

    /**
     * @param enablePrivateGua Enable this option to use your own GUA ranges as private IPv6
     * addresses.
     * This option is disabled by default.
     */
    override fun enablePrivateGua(enablePrivateGua: IResolvable) {
      cdkBuilder.enablePrivateGua(enablePrivateGua.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param operatingRegions The operating Regions for an IPAM.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see [Create an
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     */
    override fun operatingRegions(operatingRegions: IResolvable) {
      cdkBuilder.operatingRegions(operatingRegions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param operatingRegions The operating Regions for an IPAM.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see [Create an
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     */
    override fun operatingRegions(operatingRegions: List<Any>) {
      cdkBuilder.operatingRegions(operatingRegions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param operatingRegions The operating Regions for an IPAM.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * For more information about operating Regions, see [Create an
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     */
    override fun operatingRegions(vararg operatingRegions: Any): Unit =
        operatingRegions(operatingRegions.toList())

    /**
     * @param tags The key/value combination of a tag assigned to the resource.
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The key/value combination of a tag assigned to the resource.
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tier IPAM is offered in a Free Tier and an Advanced Tier.
     * For more information about the features available in each tier and the costs associated with
     * the tiers, see the [VPC IPAM product pricing page](https://docs.aws.amazon.com//vpc/pricing/) .
     */
    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMProps,
  ) : CdkObject(cdkObject),
      CfnIPAMProps {
    /**
     * The description for the IPAM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Enable this option to use your own GUA ranges as private IPv6 addresses.
     *
     * This option is disabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-enableprivategua)
     */
    override fun enablePrivateGua(): Any? = unwrap(this).getEnablePrivateGua()

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
     */
    override fun operatingRegions(): Any? = unwrap(this).getOperatingRegions()

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * IPAM is offered in a Free Tier and an Advanced Tier.
     *
     * For more information about the features available in each tier and the costs associated with
     * the tiers, see the [VPC IPAM product pricing page](https://docs.aws.amazon.com//vpc/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tier)
     */
    override fun tier(): String? = unwrap(this).getTier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPAMProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMProps): CfnIPAMProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnIPAMProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMProps): software.amazon.awscdk.services.ec2.CfnIPAMProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnIPAMProps
  }
}
