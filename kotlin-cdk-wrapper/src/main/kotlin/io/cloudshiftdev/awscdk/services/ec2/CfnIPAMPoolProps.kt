@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
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

/**
 * Properties for defining a `CfnIPAMPool`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnIPAMPoolProps cfnIPAMPoolProps = CfnIPAMPoolProps.builder()
 * .addressFamily("addressFamily")
 * .ipamScopeId("ipamScopeId")
 * // the properties below are optional
 * .allocationDefaultNetmaskLength(123)
 * .allocationMaxNetmaskLength(123)
 * .allocationMinNetmaskLength(123)
 * .allocationResourceTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .autoImport(false)
 * .awsService("awsService")
 * .description("description")
 * .locale("locale")
 * .provisionedCidrs(List.of(ProvisionedCidrProperty.builder()
 * .cidr("cidr")
 * .build()))
 * .publicIpSource("publicIpSource")
 * .publiclyAdvertisable(false)
 * .sourceIpamPoolId("sourceIpamPoolId")
 * .sourceResource(SourceResourceProperty.builder()
 * .resourceId("resourceId")
 * .resourceOwner("resourceOwner")
 * .resourceRegion("resourceRegion")
 * .resourceType("resourceType")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html)
 */
public interface CfnIPAMPoolProps {
  /**
   * The address family of the pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-addressfamily)
   */
  public fun addressFamily(): String

  /**
   * The default netmask length for allocations added to this pool.
   *
   * If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new
   * allocations will default to 10.0.0.0/16.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationdefaultnetmasklength)
   */
  public fun allocationDefaultNetmaskLength(): Number? =
      unwrap(this).getAllocationDefaultNetmaskLength()

  /**
   * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant.
   *
   * The maximum netmask length must be greater than the minimum netmask length. Possible netmask
   * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationmaxnetmasklength)
   */
  public fun allocationMaxNetmaskLength(): Number? = unwrap(this).getAllocationMaxNetmaskLength()

  /**
   * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant.
   *
   * The minimum netmask length must be less than the maximum netmask length. Possible netmask
   * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationminnetmasklength)
   */
  public fun allocationMinNetmaskLength(): Number? = unwrap(this).getAllocationMinNetmaskLength()

  /**
   * Tags that are required for resources that use CIDRs from this IPAM pool.
   *
   * Resources that do not have these tags will not be allowed to allocate space from the pool. If
   * the resources have their tags changed after they have allocated space or if the allocation tagging
   * requirements are changed on the pool, the resource may be marked as noncompliant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationresourcetags)
   */
  public fun allocationResourceTags(): Any? = unwrap(this).getAllocationResourceTags()

  /**
   * If selected, IPAM will continuously look for resources within the CIDR range of this pool and
   * automatically import them as allocations into your IPAM.
   *
   * The CIDRs that will be allocated for these resources must not already be allocated to other
   * resources in order for the import to succeed. IPAM will import a CIDR regardless of its compliance
   * with the pool's allocation rules, so a resource might be imported and subsequently marked as
   * noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the largest CIDR
   * only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of them
   * only.
   *
   * A locale must be set on the pool for this feature to work.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-autoimport)
   */
  public fun autoImport(): Any? = unwrap(this).getAutoImport()

  /**
   * Limits which service in AWS that the pool can be used in.
   *
   * "ec2", for example, allows users to use space for Elastic IP addresses and VPCs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-awsservice)
   */
  public fun awsService(): String? = unwrap(this).getAwsService()

  /**
   * The description of the IPAM pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the scope in which you would like to create the IPAM pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-ipamscopeid)
   */
  public fun ipamScopeId(): String

  /**
   * The locale of the IPAM pool.
   *
   * The locale for the pool should be one of the following:
   *
   * * An AWS Region where you want this IPAM pool to be available for allocations.
   * * The network border group for an AWS Local Zone where you want this IPAM pool to be available
   * for allocations ( [supported Local
   * Zones](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html#byoip-zone-avail) ).
   * This option is only available for IPAM IPv4 pools in the public scope.
   *
   * If you choose an AWS Region for locale that has not been configured as an operating Region for
   * the IPAM, you'll get an error.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-locale)
   */
  public fun locale(): String? = unwrap(this).getLocale()

  /**
   * Information about the CIDRs provisioned to an IPAM pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-provisionedcidrs)
   */
  public fun provisionedCidrs(): Any? = unwrap(this).getProvisionedCidrs()

  /**
   * The IP address source for pools in the public scope.
   *
   * Only used for provisioning IP address CIDRs to pools in the public scope. Default is `BYOIP` .
   * For more information, see [Create IPv6
   * pools](https://docs.aws.amazon.com//vpc/latest/ipam/intro-create-ipv6-pools.html) in the *Amazon
   * VPC IPAM User Guide* . By default, you can add only one Amazon-provided IPv6 CIDR block to a
   * top-level IPv6 pool. For information on increasing the default limit, see [Quotas for your
   * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/quotas-ipam.html) in the *Amazon VPC IPAM User
   * Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-publicipsource)
   */
  public fun publicIpSource(): String? = unwrap(this).getPublicIpSource()

  /**
   * Determines if a pool is publicly advertisable.
   *
   * This option is not available for pools with AddressFamily set to `ipv4` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-publiclyadvertisable)
   */
  public fun publiclyAdvertisable(): Any? = unwrap(this).getPubliclyAdvertisable()

  /**
   * The ID of the source IPAM pool.
   *
   * You can use this option to create an IPAM pool within an existing source pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-sourceipampoolid)
   */
  public fun sourceIpamPoolId(): String? = unwrap(this).getSourceIpamPoolId()

  /**
   * The resource used to provision CIDRs to a resource planning pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-sourceresource)
   */
  public fun sourceResource(): Any? = unwrap(this).getSourceResource()

  /**
   * The key/value combination of a tag assigned to the resource.
   *
   * Use the tag key in the filter name and the tag value as the filter value. For example, to find
   * all resources that have a tag with the key `Owner` and the value `TeamA` , specify `tag:Owner` for
   * the filter name and `TeamA` for the filter value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnIPAMPoolProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addressFamily The address family of the pool. 
     */
    public fun addressFamily(addressFamily: String)

    /**
     * @param allocationDefaultNetmaskLength The default netmask length for allocations added to
     * this pool.
     * If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new
     * allocations will default to 10.0.0.0/16.
     */
    public fun allocationDefaultNetmaskLength(allocationDefaultNetmaskLength: Number)

    /**
     * @param allocationMaxNetmaskLength The maximum netmask length possible for CIDR allocations in
     * this IPAM pool to be compliant.
     * The maximum netmask length must be greater than the minimum netmask length. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     */
    public fun allocationMaxNetmaskLength(allocationMaxNetmaskLength: Number)

    /**
     * @param allocationMinNetmaskLength The minimum netmask length required for CIDR allocations in
     * this IPAM pool to be compliant.
     * The minimum netmask length must be less than the maximum netmask length. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     */
    public fun allocationMinNetmaskLength(allocationMinNetmaskLength: Number)

    /**
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     * IPAM pool.
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     */
    public fun allocationResourceTags(allocationResourceTags: IResolvable)

    /**
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     * IPAM pool.
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     */
    public fun allocationResourceTags(allocationResourceTags: List<Any>)

    /**
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     * IPAM pool.
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     */
    public fun allocationResourceTags(vararg allocationResourceTags: Any)

    /**
     * @param autoImport If selected, IPAM will continuously look for resources within the CIDR
     * range of this pool and automatically import them as allocations into your IPAM.
     * The CIDRs that will be allocated for these resources must not already be allocated to other
     * resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently
     * marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the
     * largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly
     * import one of them only.
     *
     * A locale must be set on the pool for this feature to work.
     */
    public fun autoImport(autoImport: Boolean)

    /**
     * @param autoImport If selected, IPAM will continuously look for resources within the CIDR
     * range of this pool and automatically import them as allocations into your IPAM.
     * The CIDRs that will be allocated for these resources must not already be allocated to other
     * resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently
     * marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the
     * largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly
     * import one of them only.
     *
     * A locale must be set on the pool for this feature to work.
     */
    public fun autoImport(autoImport: IResolvable)

    /**
     * @param awsService Limits which service in AWS that the pool can be used in.
     * "ec2", for example, allows users to use space for Elastic IP addresses and VPCs.
     */
    public fun awsService(awsService: String)

    /**
     * @param description The description of the IPAM pool.
     */
    public fun description(description: String)

    /**
     * @param ipamScopeId The ID of the scope in which you would like to create the IPAM pool. 
     */
    public fun ipamScopeId(ipamScopeId: String)

    /**
     * @param locale The locale of the IPAM pool.
     * The locale for the pool should be one of the following:
     *
     * * An AWS Region where you want this IPAM pool to be available for allocations.
     * * The network border group for an AWS Local Zone where you want this IPAM pool to be
     * available for allocations ( [supported Local
     * Zones](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html#byoip-zone-avail) ).
     * This option is only available for IPAM IPv4 pools in the public scope.
     *
     * If you choose an AWS Region for locale that has not been configured as an operating Region
     * for the IPAM, you'll get an error.
     */
    public fun locale(locale: String)

    /**
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool.
     */
    public fun provisionedCidrs(provisionedCidrs: IResolvable)

    /**
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool.
     */
    public fun provisionedCidrs(provisionedCidrs: List<Any>)

    /**
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool.
     */
    public fun provisionedCidrs(vararg provisionedCidrs: Any)

    /**
     * @param publicIpSource The IP address source for pools in the public scope.
     * Only used for provisioning IP address CIDRs to pools in the public scope. Default is `BYOIP`
     * . For more information, see [Create IPv6
     * pools](https://docs.aws.amazon.com//vpc/latest/ipam/intro-create-ipv6-pools.html) in the *Amazon
     * VPC IPAM User Guide* . By default, you can add only one Amazon-provided IPv6 CIDR block to a
     * top-level IPv6 pool. For information on increasing the default limit, see [Quotas for your
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/quotas-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     */
    public fun publicIpSource(publicIpSource: String)

    /**
     * @param publiclyAdvertisable Determines if a pool is publicly advertisable.
     * This option is not available for pools with AddressFamily set to `ipv4` .
     */
    public fun publiclyAdvertisable(publiclyAdvertisable: Boolean)

    /**
     * @param publiclyAdvertisable Determines if a pool is publicly advertisable.
     * This option is not available for pools with AddressFamily set to `ipv4` .
     */
    public fun publiclyAdvertisable(publiclyAdvertisable: IResolvable)

    /**
     * @param sourceIpamPoolId The ID of the source IPAM pool.
     * You can use this option to create an IPAM pool within an existing source pool.
     */
    public fun sourceIpamPoolId(sourceIpamPoolId: String)

    /**
     * @param sourceResource The resource used to provision CIDRs to a resource planning pool.
     */
    public fun sourceResource(sourceResource: IResolvable)

    /**
     * @param sourceResource The resource used to provision CIDRs to a resource planning pool.
     */
    public fun sourceResource(sourceResource: CfnIPAMPool.SourceResourceProperty)

    /**
     * @param sourceResource The resource used to provision CIDRs to a resource planning pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4db6925277dc3dc73c32de05b67eeff3227a012c8b9523d394c6cb0022bee1b")
    public fun sourceResource(sourceResource: CfnIPAMPool.SourceResourceProperty.Builder.() -> Unit)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMPoolProps.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMPoolProps.builder()

    /**
     * @param addressFamily The address family of the pool. 
     */
    override fun addressFamily(addressFamily: String) {
      cdkBuilder.addressFamily(addressFamily)
    }

    /**
     * @param allocationDefaultNetmaskLength The default netmask length for allocations added to
     * this pool.
     * If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new
     * allocations will default to 10.0.0.0/16.
     */
    override fun allocationDefaultNetmaskLength(allocationDefaultNetmaskLength: Number) {
      cdkBuilder.allocationDefaultNetmaskLength(allocationDefaultNetmaskLength)
    }

    /**
     * @param allocationMaxNetmaskLength The maximum netmask length possible for CIDR allocations in
     * this IPAM pool to be compliant.
     * The maximum netmask length must be greater than the minimum netmask length. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     */
    override fun allocationMaxNetmaskLength(allocationMaxNetmaskLength: Number) {
      cdkBuilder.allocationMaxNetmaskLength(allocationMaxNetmaskLength)
    }

    /**
     * @param allocationMinNetmaskLength The minimum netmask length required for CIDR allocations in
     * this IPAM pool to be compliant.
     * The minimum netmask length must be less than the maximum netmask length. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     */
    override fun allocationMinNetmaskLength(allocationMinNetmaskLength: Number) {
      cdkBuilder.allocationMinNetmaskLength(allocationMinNetmaskLength)
    }

    /**
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     * IPAM pool.
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     */
    override fun allocationResourceTags(allocationResourceTags: IResolvable) {
      cdkBuilder.allocationResourceTags(allocationResourceTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     * IPAM pool.
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     */
    override fun allocationResourceTags(allocationResourceTags: List<Any>) {
      cdkBuilder.allocationResourceTags(allocationResourceTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     * IPAM pool.
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     */
    override fun allocationResourceTags(vararg allocationResourceTags: Any): Unit =
        allocationResourceTags(allocationResourceTags.toList())

    /**
     * @param autoImport If selected, IPAM will continuously look for resources within the CIDR
     * range of this pool and automatically import them as allocations into your IPAM.
     * The CIDRs that will be allocated for these resources must not already be allocated to other
     * resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently
     * marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the
     * largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly
     * import one of them only.
     *
     * A locale must be set on the pool for this feature to work.
     */
    override fun autoImport(autoImport: Boolean) {
      cdkBuilder.autoImport(autoImport)
    }

    /**
     * @param autoImport If selected, IPAM will continuously look for resources within the CIDR
     * range of this pool and automatically import them as allocations into your IPAM.
     * The CIDRs that will be allocated for these resources must not already be allocated to other
     * resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently
     * marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the
     * largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly
     * import one of them only.
     *
     * A locale must be set on the pool for this feature to work.
     */
    override fun autoImport(autoImport: IResolvable) {
      cdkBuilder.autoImport(autoImport.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param awsService Limits which service in AWS that the pool can be used in.
     * "ec2", for example, allows users to use space for Elastic IP addresses and VPCs.
     */
    override fun awsService(awsService: String) {
      cdkBuilder.awsService(awsService)
    }

    /**
     * @param description The description of the IPAM pool.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param ipamScopeId The ID of the scope in which you would like to create the IPAM pool. 
     */
    override fun ipamScopeId(ipamScopeId: String) {
      cdkBuilder.ipamScopeId(ipamScopeId)
    }

    /**
     * @param locale The locale of the IPAM pool.
     * The locale for the pool should be one of the following:
     *
     * * An AWS Region where you want this IPAM pool to be available for allocations.
     * * The network border group for an AWS Local Zone where you want this IPAM pool to be
     * available for allocations ( [supported Local
     * Zones](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html#byoip-zone-avail) ).
     * This option is only available for IPAM IPv4 pools in the public scope.
     *
     * If you choose an AWS Region for locale that has not been configured as an operating Region
     * for the IPAM, you'll get an error.
     */
    override fun locale(locale: String) {
      cdkBuilder.locale(locale)
    }

    /**
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool.
     */
    override fun provisionedCidrs(provisionedCidrs: IResolvable) {
      cdkBuilder.provisionedCidrs(provisionedCidrs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool.
     */
    override fun provisionedCidrs(provisionedCidrs: List<Any>) {
      cdkBuilder.provisionedCidrs(provisionedCidrs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool.
     */
    override fun provisionedCidrs(vararg provisionedCidrs: Any): Unit =
        provisionedCidrs(provisionedCidrs.toList())

    /**
     * @param publicIpSource The IP address source for pools in the public scope.
     * Only used for provisioning IP address CIDRs to pools in the public scope. Default is `BYOIP`
     * . For more information, see [Create IPv6
     * pools](https://docs.aws.amazon.com//vpc/latest/ipam/intro-create-ipv6-pools.html) in the *Amazon
     * VPC IPAM User Guide* . By default, you can add only one Amazon-provided IPv6 CIDR block to a
     * top-level IPv6 pool. For information on increasing the default limit, see [Quotas for your
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/quotas-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     */
    override fun publicIpSource(publicIpSource: String) {
      cdkBuilder.publicIpSource(publicIpSource)
    }

    /**
     * @param publiclyAdvertisable Determines if a pool is publicly advertisable.
     * This option is not available for pools with AddressFamily set to `ipv4` .
     */
    override fun publiclyAdvertisable(publiclyAdvertisable: Boolean) {
      cdkBuilder.publiclyAdvertisable(publiclyAdvertisable)
    }

    /**
     * @param publiclyAdvertisable Determines if a pool is publicly advertisable.
     * This option is not available for pools with AddressFamily set to `ipv4` .
     */
    override fun publiclyAdvertisable(publiclyAdvertisable: IResolvable) {
      cdkBuilder.publiclyAdvertisable(publiclyAdvertisable.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceIpamPoolId The ID of the source IPAM pool.
     * You can use this option to create an IPAM pool within an existing source pool.
     */
    override fun sourceIpamPoolId(sourceIpamPoolId: String) {
      cdkBuilder.sourceIpamPoolId(sourceIpamPoolId)
    }

    /**
     * @param sourceResource The resource used to provision CIDRs to a resource planning pool.
     */
    override fun sourceResource(sourceResource: IResolvable) {
      cdkBuilder.sourceResource(sourceResource.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceResource The resource used to provision CIDRs to a resource planning pool.
     */
    override fun sourceResource(sourceResource: CfnIPAMPool.SourceResourceProperty) {
      cdkBuilder.sourceResource(sourceResource.let(CfnIPAMPool.SourceResourceProperty.Companion::unwrap))
    }

    /**
     * @param sourceResource The resource used to provision CIDRs to a resource planning pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4db6925277dc3dc73c32de05b67eeff3227a012c8b9523d394c6cb0022bee1b")
    override
        fun sourceResource(sourceResource: CfnIPAMPool.SourceResourceProperty.Builder.() -> Unit):
        Unit = sourceResource(CfnIPAMPool.SourceResourceProperty(sourceResource))

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

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMPoolProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPoolProps,
  ) : CdkObject(cdkObject),
      CfnIPAMPoolProps {
    /**
     * The address family of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-addressfamily)
     */
    override fun addressFamily(): String = unwrap(this).getAddressFamily()

    /**
     * The default netmask length for allocations added to this pool.
     *
     * If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new
     * allocations will default to 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationdefaultnetmasklength)
     */
    override fun allocationDefaultNetmaskLength(): Number? =
        unwrap(this).getAllocationDefaultNetmaskLength()

    /**
     * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant.
     *
     * The maximum netmask length must be greater than the minimum netmask length. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationmaxnetmasklength)
     */
    override fun allocationMaxNetmaskLength(): Number? =
        unwrap(this).getAllocationMaxNetmaskLength()

    /**
     * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant.
     *
     * The minimum netmask length must be less than the maximum netmask length. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationminnetmasklength)
     */
    override fun allocationMinNetmaskLength(): Number? =
        unwrap(this).getAllocationMinNetmaskLength()

    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool.
     *
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationresourcetags)
     */
    override fun allocationResourceTags(): Any? = unwrap(this).getAllocationResourceTags()

    /**
     * If selected, IPAM will continuously look for resources within the CIDR range of this pool and
     * automatically import them as allocations into your IPAM.
     *
     * The CIDRs that will be allocated for these resources must not already be allocated to other
     * resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently
     * marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the
     * largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly
     * import one of them only.
     *
     * A locale must be set on the pool for this feature to work.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-autoimport)
     */
    override fun autoImport(): Any? = unwrap(this).getAutoImport()

    /**
     * Limits which service in AWS that the pool can be used in.
     *
     * "ec2", for example, allows users to use space for Elastic IP addresses and VPCs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-awsservice)
     */
    override fun awsService(): String? = unwrap(this).getAwsService()

    /**
     * The description of the IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the scope in which you would like to create the IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-ipamscopeid)
     */
    override fun ipamScopeId(): String = unwrap(this).getIpamScopeId()

    /**
     * The locale of the IPAM pool.
     *
     * The locale for the pool should be one of the following:
     *
     * * An AWS Region where you want this IPAM pool to be available for allocations.
     * * The network border group for an AWS Local Zone where you want this IPAM pool to be
     * available for allocations ( [supported Local
     * Zones](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html#byoip-zone-avail) ).
     * This option is only available for IPAM IPv4 pools in the public scope.
     *
     * If you choose an AWS Region for locale that has not been configured as an operating Region
     * for the IPAM, you'll get an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-locale)
     */
    override fun locale(): String? = unwrap(this).getLocale()

    /**
     * Information about the CIDRs provisioned to an IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-provisionedcidrs)
     */
    override fun provisionedCidrs(): Any? = unwrap(this).getProvisionedCidrs()

    /**
     * The IP address source for pools in the public scope.
     *
     * Only used for provisioning IP address CIDRs to pools in the public scope. Default is `BYOIP`
     * . For more information, see [Create IPv6
     * pools](https://docs.aws.amazon.com//vpc/latest/ipam/intro-create-ipv6-pools.html) in the *Amazon
     * VPC IPAM User Guide* . By default, you can add only one Amazon-provided IPv6 CIDR block to a
     * top-level IPv6 pool. For information on increasing the default limit, see [Quotas for your
     * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/quotas-ipam.html) in the *Amazon VPC IPAM
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-publicipsource)
     */
    override fun publicIpSource(): String? = unwrap(this).getPublicIpSource()

    /**
     * Determines if a pool is publicly advertisable.
     *
     * This option is not available for pools with AddressFamily set to `ipv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-publiclyadvertisable)
     */
    override fun publiclyAdvertisable(): Any? = unwrap(this).getPubliclyAdvertisable()

    /**
     * The ID of the source IPAM pool.
     *
     * You can use this option to create an IPAM pool within an existing source pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-sourceipampoolid)
     */
    override fun sourceIpamPoolId(): String? = unwrap(this).getSourceIpamPoolId()

    /**
     * The resource used to provision CIDRs to a resource planning pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-sourceresource)
     */
    override fun sourceResource(): Any? = unwrap(this).getSourceResource()

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPAMPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPoolProps):
        CfnIPAMPoolProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIPAMPoolProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMPoolProps):
        software.amazon.awscdk.services.ec2.CfnIPAMPoolProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnIPAMPoolProps
  }
}
