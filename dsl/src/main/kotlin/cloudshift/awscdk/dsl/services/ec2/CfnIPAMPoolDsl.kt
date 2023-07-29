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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnIPAMPool
import software.constructs.Construct

/**
 * In IPAM, a pool is a collection of contiguous IP addresses CIDRs.
 *
 * Pools enable you to organize your IP addresses according to your routing and security needs. For
 * example, if you have separate routing and security needs for development and production
 * applications, you can create a pool for each.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnIPAMPool cfnIPAMPool = CfnIPAMPool.Builder.create(this, "MyCfnIPAMPool")
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
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html)
 */
@CdkDslMarker
public class CfnIPAMPoolDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIPAMPool.Builder = CfnIPAMPool.Builder.create(scope, id)

    private val _allocationResourceTags: MutableList<Any> = mutableListOf()

    private val _provisionedCidrs: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The address family of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-addressfamily)
     *
     * @param addressFamily The address family of the pool.
     */
    public fun addressFamily(addressFamily: String) {
        cdkBuilder.addressFamily(addressFamily)
    }

    /**
     * The default netmask length for allocations added to this pool.
     *
     * If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new
     * allocations will default to 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationdefaultnetmasklength)
     *
     * @param allocationDefaultNetmaskLength The default netmask length for allocations added to
     *   this pool.
     */
    public fun allocationDefaultNetmaskLength(allocationDefaultNetmaskLength: Number) {
        cdkBuilder.allocationDefaultNetmaskLength(allocationDefaultNetmaskLength)
    }

    /**
     * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant.
     *
     * The maximum netmask length must be greater than the minimum netmask length. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are
     * 0 - 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationmaxnetmasklength)
     *
     * @param allocationMaxNetmaskLength The maximum netmask length possible for CIDR allocations in
     *   this IPAM pool to be compliant.
     */
    public fun allocationMaxNetmaskLength(allocationMaxNetmaskLength: Number) {
        cdkBuilder.allocationMaxNetmaskLength(allocationMaxNetmaskLength)
    }

    /**
     * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant.
     *
     * The minimum netmask length must be less than the maximum netmask length. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are
     * 0 - 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationminnetmasklength)
     *
     * @param allocationMinNetmaskLength The minimum netmask length required for CIDR allocations in
     *   this IPAM pool to be compliant.
     */
    public fun allocationMinNetmaskLength(allocationMinNetmaskLength: Number) {
        cdkBuilder.allocationMinNetmaskLength(allocationMinNetmaskLength)
    }

    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool.
     *
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationresourcetags)
     *
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     *   IPAM pool.
     */
    public fun allocationResourceTags(vararg allocationResourceTags: Any) {
        _allocationResourceTags.addAll(listOf(*allocationResourceTags))
    }

    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool.
     *
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationresourcetags)
     *
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     *   IPAM pool.
     */
    public fun allocationResourceTags(allocationResourceTags: Collection<Any>) {
        _allocationResourceTags.addAll(allocationResourceTags)
    }

    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool.
     *
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationresourcetags)
     *
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     *   IPAM pool.
     */
    public fun allocationResourceTags(allocationResourceTags: IResolvable) {
        cdkBuilder.allocationResourceTags(allocationResourceTags)
    }

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
     *
     * @param autoImport If selected, IPAM will continuously look for resources within the CIDR
     *   range of this pool and automatically import them as allocations into your IPAM.
     */
    public fun autoImport(autoImport: Boolean) {
        cdkBuilder.autoImport(autoImport)
    }

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
     *
     * @param autoImport If selected, IPAM will continuously look for resources within the CIDR
     *   range of this pool and automatically import them as allocations into your IPAM.
     */
    public fun autoImport(autoImport: IResolvable) {
        cdkBuilder.autoImport(autoImport)
    }

    /**
     * Limits which service in AWS that the pool can be used in.
     *
     * "ec2", for example, allows users to use space for Elastic IP addresses and VPCs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-awsservice)
     *
     * @param awsService Limits which service in AWS that the pool can be used in.
     */
    public fun awsService(awsService: String) {
        cdkBuilder.awsService(awsService)
    }

    /**
     * The description of the IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-description)
     *
     * @param description The description of the IPAM pool.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The ID of the scope in which you would like to create the IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-ipamscopeid)
     *
     * @param ipamScopeId The ID of the scope in which you would like to create the IPAM pool.
     */
    public fun ipamScopeId(ipamScopeId: String) {
        cdkBuilder.ipamScopeId(ipamScopeId)
    }

    /**
     * The locale of the IPAM pool.
     *
     * In IPAM, the locale is the AWS Region where you want to make an IPAM pool available for
     * allocations. Only resources in the same Region as the locale of the pool can get IP address
     * allocations from the pool. You can only allocate a CIDR for a VPC, for example, from an IPAM
     * pool that shares a locale with the VPC’s Region. Note that once you choose a Locale for a
     * pool, you cannot modify it. If you choose an AWS Region for locale that has not been
     * configured as an operating Region for the IPAM, you'll get an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-locale)
     *
     * @param locale The locale of the IPAM pool.
     */
    public fun locale(locale: String) {
        cdkBuilder.locale(locale)
    }

    /**
     * Information about the CIDRs provisioned to an IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-provisionedcidrs)
     *
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool.
     */
    public fun provisionedCidrs(vararg provisionedCidrs: Any) {
        _provisionedCidrs.addAll(listOf(*provisionedCidrs))
    }

    /**
     * Information about the CIDRs provisioned to an IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-provisionedcidrs)
     *
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool.
     */
    public fun provisionedCidrs(provisionedCidrs: Collection<Any>) {
        _provisionedCidrs.addAll(provisionedCidrs)
    }

    /**
     * Information about the CIDRs provisioned to an IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-provisionedcidrs)
     *
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool.
     */
    public fun provisionedCidrs(provisionedCidrs: IResolvable) {
        cdkBuilder.provisionedCidrs(provisionedCidrs)
    }

    /**
     * The IP address source for pools in the public scope.
     *
     * Only used for provisioning IP address CIDRs to pools in the public scope. Default is `BYOIP`
     * . For more information, see
     * [Create IPv6 pools](https://docs.aws.amazon.com//vpc/latest/ipam/intro-create-ipv6-pools.html)
     * in the *Amazon VPC IPAM User Guide* . By default, you can add only one Amazon-provided IPv6
     * CIDR block to a top-level IPv6 pool. For information on increasing the default limit, see
     * [Quotas for your IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/quotas-ipam.html) in the
     * *Amazon VPC IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-publicipsource)
     *
     * @param publicIpSource The IP address source for pools in the public scope.
     */
    public fun publicIpSource(publicIpSource: String) {
        cdkBuilder.publicIpSource(publicIpSource)
    }

    /**
     * Determines if a pool is publicly advertisable.
     *
     * This option is not available for pools with AddressFamily set to `ipv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-publiclyadvertisable)
     *
     * @param publiclyAdvertisable Determines if a pool is publicly advertisable.
     */
    public fun publiclyAdvertisable(publiclyAdvertisable: Boolean) {
        cdkBuilder.publiclyAdvertisable(publiclyAdvertisable)
    }

    /**
     * Determines if a pool is publicly advertisable.
     *
     * This option is not available for pools with AddressFamily set to `ipv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-publiclyadvertisable)
     *
     * @param publiclyAdvertisable Determines if a pool is publicly advertisable.
     */
    public fun publiclyAdvertisable(publiclyAdvertisable: IResolvable) {
        cdkBuilder.publiclyAdvertisable(publiclyAdvertisable)
    }

    /**
     * The ID of the source IPAM pool.
     *
     * You can use this option to create an IPAM pool within an existing source pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-sourceipampoolid)
     *
     * @param sourceIpamPoolId The ID of the source IPAM pool.
     */
    public fun sourceIpamPoolId(sourceIpamPoolId: String) {
        cdkBuilder.sourceIpamPoolId(sourceIpamPoolId)
    }

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-tags)
     *
     * @param tags The key/value combination of a tag assigned to the resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-tags)
     *
     * @param tags The key/value combination of a tag assigned to the resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnIPAMPool {
        if (_allocationResourceTags.isNotEmpty())
            cdkBuilder.allocationResourceTags(_allocationResourceTags)
        if (_provisionedCidrs.isNotEmpty()) cdkBuilder.provisionedCidrs(_provisionedCidrs)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
