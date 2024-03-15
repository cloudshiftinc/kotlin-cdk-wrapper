@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
      cdkBuilder.operatingRegions(operatingRegions.let(IResolvable::unwrap))
    }

    /**
     * @param operatingRegions The operating Regions for the resource discovery.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     */
    override fun operatingRegions(operatingRegions: List<Any>) {
      cdkBuilder.operatingRegions(operatingRegions)
    }

    /**
     * @param operatingRegions The operating Regions for the resource discovery.
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     */
    override fun operatingRegions(vararg operatingRegions: Any): Unit =
        operatingRegions(operatingRegions.toList())

    /**
     * @param tags A tag is a label that you assign to an AWS resource.
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps,
  ) : CdkObject(cdkObject), CfnIPAMResourceDiscoveryProps {
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
        CfnIPAMResourceDiscoveryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMResourceDiscoveryProps):
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps
  }
}
