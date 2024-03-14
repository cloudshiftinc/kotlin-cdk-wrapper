package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIPAMPool internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPool,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The address family of the pool.
   */
  public open fun addressFamily(): String = unwrap(this).getAddressFamily()

  /**
   * The address family of the pool.
   */
  public open fun addressFamily(`value`: String) {
    unwrap(this).setAddressFamily(`value`)
  }

  /**
   * The default netmask length for allocations added to this pool.
   */
  public open fun allocationDefaultNetmaskLength(): Number? =
      unwrap(this).getAllocationDefaultNetmaskLength()

  /**
   * The default netmask length for allocations added to this pool.
   */
  public open fun allocationDefaultNetmaskLength(`value`: Number) {
    unwrap(this).setAllocationDefaultNetmaskLength(`value`)
  }

  /**
   * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant.
   */
  public open fun allocationMaxNetmaskLength(): Number? =
      unwrap(this).getAllocationMaxNetmaskLength()

  /**
   * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant.
   */
  public open fun allocationMaxNetmaskLength(`value`: Number) {
    unwrap(this).setAllocationMaxNetmaskLength(`value`)
  }

  /**
   * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant.
   */
  public open fun allocationMinNetmaskLength(): Number? =
      unwrap(this).getAllocationMinNetmaskLength()

  /**
   * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant.
   */
  public open fun allocationMinNetmaskLength(`value`: Number) {
    unwrap(this).setAllocationMinNetmaskLength(`value`)
  }

  /**
   * Tags that are required for resources that use CIDRs from this IPAM pool.
   */
  public open fun allocationResourceTags(): Any? = unwrap(this).getAllocationResourceTags()

  /**
   * Tags that are required for resources that use CIDRs from this IPAM pool.
   */
  public open fun allocationResourceTags(`value`: IResolvable) {
    unwrap(this).setAllocationResourceTags(`value`.let(IResolvable::unwrap))
  }

  /**
   * Tags that are required for resources that use CIDRs from this IPAM pool.
   */
  public open fun allocationResourceTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setAllocationResourceTags(__idx_ac66f0)
  }

  /**
   * Tags that are required for resources that use CIDRs from this IPAM pool.
   */
  public open fun allocationResourceTags(vararg __idx_ac66f0: Any): Unit =
      allocationResourceTags(__idx_ac66f0.toList())

  /**
   * The ARN of the IPAM pool.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ARN of the IPAM.
   */
  public open fun attrIpamArn(): String = unwrap(this).getAttrIpamArn()

  /**
   * The ID of the IPAM pool.
   */
  public open fun attrIpamPoolId(): String = unwrap(this).getAttrIpamPoolId()

  /**
   * The ARN of the scope of the IPAM pool.
   */
  public open fun attrIpamScopeArn(): String = unwrap(this).getAttrIpamScopeArn()

  /**
   * The scope of the IPAM.
   */
  public open fun attrIpamScopeType(): String = unwrap(this).getAttrIpamScopeType()

  /**
   * The depth of pools in your IPAM pool.
   *
   * The pool depth quota is 10.
   */
  public open fun attrPoolDepth(): Number = unwrap(this).getAttrPoolDepth()

  /**
   * The state of the IPAM pool.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * A message related to the failed creation of an IPAM pool.
   */
  public open fun attrStateMessage(): String = unwrap(this).getAttrStateMessage()

  /**
   * If selected, IPAM will continuously look for resources within the CIDR range of this pool and
   * automatically import them as allocations into your IPAM.
   */
  public open fun autoImport(): Any? = unwrap(this).getAutoImport()

  /**
   * If selected, IPAM will continuously look for resources within the CIDR range of this pool and
   * automatically import them as allocations into your IPAM.
   */
  public open fun autoImport(`value`: Boolean) {
    unwrap(this).setAutoImport(`value`)
  }

  /**
   * If selected, IPAM will continuously look for resources within the CIDR range of this pool and
   * automatically import them as allocations into your IPAM.
   */
  public open fun autoImport(`value`: IResolvable) {
    unwrap(this).setAutoImport(`value`.let(IResolvable::unwrap))
  }

  /**
   * Limits which service in AWS that the pool can be used in.
   */
  public open fun awsService(): String? = unwrap(this).getAwsService()

  /**
   * Limits which service in AWS that the pool can be used in.
   */
  public open fun awsService(`value`: String) {
    unwrap(this).setAwsService(`value`)
  }

  /**
   * The description of the IPAM pool.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the IPAM pool.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the scope in which you would like to create the IPAM pool.
   */
  public open fun ipamScopeId(): String = unwrap(this).getIpamScopeId()

  /**
   * The ID of the scope in which you would like to create the IPAM pool.
   */
  public open fun ipamScopeId(`value`: String) {
    unwrap(this).setIpamScopeId(`value`)
  }

  /**
   * The locale of the IPAM pool.
   */
  public open fun locale(): String? = unwrap(this).getLocale()

  /**
   * The locale of the IPAM pool.
   */
  public open fun locale(`value`: String) {
    unwrap(this).setLocale(`value`)
  }

  /**
   * Information about the CIDRs provisioned to an IPAM pool.
   */
  public open fun provisionedCidrs(): Any? = unwrap(this).getProvisionedCidrs()

  /**
   * Information about the CIDRs provisioned to an IPAM pool.
   */
  public open fun provisionedCidrs(`value`: IResolvable) {
    unwrap(this).setProvisionedCidrs(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the CIDRs provisioned to an IPAM pool.
   */
  public open fun provisionedCidrs(__idx_ac66f0: List<Any>) {
    unwrap(this).setProvisionedCidrs(__idx_ac66f0)
  }

  /**
   * Information about the CIDRs provisioned to an IPAM pool.
   */
  public open fun provisionedCidrs(vararg __idx_ac66f0: Any): Unit =
      provisionedCidrs(__idx_ac66f0.toList())

  /**
   * The IP address source for pools in the public scope.
   */
  public open fun publicIpSource(): String? = unwrap(this).getPublicIpSource()

  /**
   * The IP address source for pools in the public scope.
   */
  public open fun publicIpSource(`value`: String) {
    unwrap(this).setPublicIpSource(`value`)
  }

  /**
   * Determines if a pool is publicly advertisable.
   */
  public open fun publiclyAdvertisable(): Any? = unwrap(this).getPubliclyAdvertisable()

  /**
   * Determines if a pool is publicly advertisable.
   */
  public open fun publiclyAdvertisable(`value`: Boolean) {
    unwrap(this).setPubliclyAdvertisable(`value`)
  }

  /**
   * Determines if a pool is publicly advertisable.
   */
  public open fun publiclyAdvertisable(`value`: IResolvable) {
    unwrap(this).setPubliclyAdvertisable(`value`.let(IResolvable::unwrap))
  }

  /**
   * The ID of the source IPAM pool.
   */
  public open fun sourceIpamPoolId(): String? = unwrap(this).getSourceIpamPoolId()

  /**
   * The ID of the source IPAM pool.
   */
  public open fun sourceIpamPoolId(`value`: String) {
    unwrap(this).setSourceIpamPoolId(`value`)
  }

  /**
   * The resource used to provision CIDRs to a resource planning pool.
   */
  public open fun sourceResource(): Any? = unwrap(this).getSourceResource()

  /**
   * The resource used to provision CIDRs to a resource planning pool.
   */
  public open fun sourceResource(`value`: IResolvable) {
    unwrap(this).setSourceResource(`value`.let(IResolvable::unwrap))
  }

  /**
   * The resource used to provision CIDRs to a resource planning pool.
   */
  public open fun sourceResource(`value`: SourceResourceProperty) {
    unwrap(this).setSourceResource(`value`.let(SourceResourceProperty::unwrap))
  }

  /**
   * The resource used to provision CIDRs to a resource planning pool.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f1f78231e46e0069c652a03fe2036b256d93cdaac995dc88a3bef085e9ceb678")
  public open fun sourceResource(`value`: SourceResourceProperty.Builder.() -> Unit): Unit =
      sourceResource(SourceResourceProperty(`value`))

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
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The key/value combination of a tag assigned to the resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnIPAMPool].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The address family of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-addressfamily)
     * @param addressFamily The address family of the pool. 
     */
    public fun addressFamily(addressFamily: String)

    /**
     * The default netmask length for allocations added to this pool.
     *
     * If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new
     * allocations will default to 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationdefaultnetmasklength)
     * @param allocationDefaultNetmaskLength The default netmask length for allocations added to
     * this pool. 
     */
    public fun allocationDefaultNetmaskLength(allocationDefaultNetmaskLength: Number)

    /**
     * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant.
     *
     * The maximum netmask length must be greater than the minimum netmask length. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationmaxnetmasklength)
     * @param allocationMaxNetmaskLength The maximum netmask length possible for CIDR allocations in
     * this IPAM pool to be compliant. 
     */
    public fun allocationMaxNetmaskLength(allocationMaxNetmaskLength: Number)

    /**
     * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant.
     *
     * The minimum netmask length must be less than the maximum netmask length. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationminnetmasklength)
     * @param allocationMinNetmaskLength The minimum netmask length required for CIDR allocations in
     * this IPAM pool to be compliant. 
     */
    public fun allocationMinNetmaskLength(allocationMinNetmaskLength: Number)

    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool.
     *
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationresourcetags)
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     * IPAM pool. 
     */
    public fun allocationResourceTags(allocationResourceTags: IResolvable)

    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool.
     *
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationresourcetags)
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     * IPAM pool. 
     */
    public fun allocationResourceTags(allocationResourceTags: List<Any>)

    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool.
     *
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationresourcetags)
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     * IPAM pool. 
     */
    public fun allocationResourceTags(vararg allocationResourceTags: Any)

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
     * @param autoImport If selected, IPAM will continuously look for resources within the CIDR
     * range of this pool and automatically import them as allocations into your IPAM. 
     */
    public fun autoImport(autoImport: Boolean)

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
     * @param autoImport If selected, IPAM will continuously look for resources within the CIDR
     * range of this pool and automatically import them as allocations into your IPAM. 
     */
    public fun autoImport(autoImport: IResolvable)

    /**
     * Limits which service in AWS that the pool can be used in.
     *
     * "ec2", for example, allows users to use space for Elastic IP addresses and VPCs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-awsservice)
     * @param awsService Limits which service in AWS that the pool can be used in. 
     */
    public fun awsService(awsService: String)

    /**
     * The description of the IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-description)
     * @param description The description of the IPAM pool. 
     */
    public fun description(description: String)

    /**
     * The ID of the scope in which you would like to create the IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-ipamscopeid)
     * @param ipamScopeId The ID of the scope in which you would like to create the IPAM pool. 
     */
    public fun ipamScopeId(ipamScopeId: String)

    /**
     * The locale of the IPAM pool.
     *
     * In IPAM, the locale is the AWS Region where you want to make an IPAM pool available for
     * allocations. Only resources in the same Region as the locale of the pool can get IP address
     * allocations from the pool. You can only allocate a CIDR for a VPC, for example, from an IPAM
     * pool that shares a locale with the VPC’s Region. Note that once you choose a Locale for a pool,
     * you cannot modify it. If you choose an AWS Region for locale that has not been configured as an
     * operating Region for the IPAM, you'll get an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-locale)
     * @param locale The locale of the IPAM pool. 
     */
    public fun locale(locale: String)

    /**
     * Information about the CIDRs provisioned to an IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-provisionedcidrs)
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool. 
     */
    public fun provisionedCidrs(provisionedCidrs: IResolvable)

    /**
     * Information about the CIDRs provisioned to an IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-provisionedcidrs)
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool. 
     */
    public fun provisionedCidrs(provisionedCidrs: List<Any>)

    /**
     * Information about the CIDRs provisioned to an IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-provisionedcidrs)
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool. 
     */
    public fun provisionedCidrs(vararg provisionedCidrs: Any)

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
     * @param publicIpSource The IP address source for pools in the public scope. 
     */
    public fun publicIpSource(publicIpSource: String)

    /**
     * Determines if a pool is publicly advertisable.
     *
     * This option is not available for pools with AddressFamily set to `ipv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-publiclyadvertisable)
     * @param publiclyAdvertisable Determines if a pool is publicly advertisable. 
     */
    public fun publiclyAdvertisable(publiclyAdvertisable: Boolean)

    /**
     * Determines if a pool is publicly advertisable.
     *
     * This option is not available for pools with AddressFamily set to `ipv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-publiclyadvertisable)
     * @param publiclyAdvertisable Determines if a pool is publicly advertisable. 
     */
    public fun publiclyAdvertisable(publiclyAdvertisable: IResolvable)

    /**
     * The ID of the source IPAM pool.
     *
     * You can use this option to create an IPAM pool within an existing source pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-sourceipampoolid)
     * @param sourceIpamPoolId The ID of the source IPAM pool. 
     */
    public fun sourceIpamPoolId(sourceIpamPoolId: String)

    /**
     * The resource used to provision CIDRs to a resource planning pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-sourceresource)
     * @param sourceResource The resource used to provision CIDRs to a resource planning pool. 
     */
    public fun sourceResource(sourceResource: IResolvable)

    /**
     * The resource used to provision CIDRs to a resource planning pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-sourceresource)
     * @param sourceResource The resource used to provision CIDRs to a resource planning pool. 
     */
    public fun sourceResource(sourceResource: SourceResourceProperty)

    /**
     * The resource used to provision CIDRs to a resource planning pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-sourceresource)
     * @param sourceResource The resource used to provision CIDRs to a resource planning pool. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef83e558225eb21dddf1d39328df53c2bd0b498f2d5a26d4bc20ea20a24682a6")
    public fun sourceResource(sourceResource: SourceResourceProperty.Builder.() -> Unit)

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-tags)
     * @param tags The key/value combination of a tag assigned to the resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMPool.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMPool.Builder.create(scope, id)

    /**
     * The address family of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-addressfamily)
     * @param addressFamily The address family of the pool. 
     */
    override fun addressFamily(addressFamily: String) {
      cdkBuilder.addressFamily(addressFamily)
    }

    /**
     * The default netmask length for allocations added to this pool.
     *
     * If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new
     * allocations will default to 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationdefaultnetmasklength)
     * @param allocationDefaultNetmaskLength The default netmask length for allocations added to
     * this pool. 
     */
    override fun allocationDefaultNetmaskLength(allocationDefaultNetmaskLength: Number) {
      cdkBuilder.allocationDefaultNetmaskLength(allocationDefaultNetmaskLength)
    }

    /**
     * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant.
     *
     * The maximum netmask length must be greater than the minimum netmask length. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationmaxnetmasklength)
     * @param allocationMaxNetmaskLength The maximum netmask length possible for CIDR allocations in
     * this IPAM pool to be compliant. 
     */
    override fun allocationMaxNetmaskLength(allocationMaxNetmaskLength: Number) {
      cdkBuilder.allocationMaxNetmaskLength(allocationMaxNetmaskLength)
    }

    /**
     * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant.
     *
     * The minimum netmask length must be less than the maximum netmask length. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationminnetmasklength)
     * @param allocationMinNetmaskLength The minimum netmask length required for CIDR allocations in
     * this IPAM pool to be compliant. 
     */
    override fun allocationMinNetmaskLength(allocationMinNetmaskLength: Number) {
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
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     * IPAM pool. 
     */
    override fun allocationResourceTags(allocationResourceTags: IResolvable) {
      cdkBuilder.allocationResourceTags(allocationResourceTags.let(IResolvable::unwrap))
    }

    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool.
     *
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationresourcetags)
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     * IPAM pool. 
     */
    override fun allocationResourceTags(allocationResourceTags: List<Any>) {
      cdkBuilder.allocationResourceTags(allocationResourceTags)
    }

    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool.
     *
     * Resources that do not have these tags will not be allowed to allocate space from the pool. If
     * the resources have their tags changed after they have allocated space or if the allocation
     * tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-allocationresourcetags)
     * @param allocationResourceTags Tags that are required for resources that use CIDRs from this
     * IPAM pool. 
     */
    override fun allocationResourceTags(vararg allocationResourceTags: Any): Unit =
        allocationResourceTags(allocationResourceTags.toList())

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
     * @param autoImport If selected, IPAM will continuously look for resources within the CIDR
     * range of this pool and automatically import them as allocations into your IPAM. 
     */
    override fun autoImport(autoImport: Boolean) {
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
     * @param autoImport If selected, IPAM will continuously look for resources within the CIDR
     * range of this pool and automatically import them as allocations into your IPAM. 
     */
    override fun autoImport(autoImport: IResolvable) {
      cdkBuilder.autoImport(autoImport.let(IResolvable::unwrap))
    }

    /**
     * Limits which service in AWS that the pool can be used in.
     *
     * "ec2", for example, allows users to use space for Elastic IP addresses and VPCs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-awsservice)
     * @param awsService Limits which service in AWS that the pool can be used in. 
     */
    override fun awsService(awsService: String) {
      cdkBuilder.awsService(awsService)
    }

    /**
     * The description of the IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-description)
     * @param description The description of the IPAM pool. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the scope in which you would like to create the IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-ipamscopeid)
     * @param ipamScopeId The ID of the scope in which you would like to create the IPAM pool. 
     */
    override fun ipamScopeId(ipamScopeId: String) {
      cdkBuilder.ipamScopeId(ipamScopeId)
    }

    /**
     * The locale of the IPAM pool.
     *
     * In IPAM, the locale is the AWS Region where you want to make an IPAM pool available for
     * allocations. Only resources in the same Region as the locale of the pool can get IP address
     * allocations from the pool. You can only allocate a CIDR for a VPC, for example, from an IPAM
     * pool that shares a locale with the VPC’s Region. Note that once you choose a Locale for a pool,
     * you cannot modify it. If you choose an AWS Region for locale that has not been configured as an
     * operating Region for the IPAM, you'll get an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-locale)
     * @param locale The locale of the IPAM pool. 
     */
    override fun locale(locale: String) {
      cdkBuilder.locale(locale)
    }

    /**
     * Information about the CIDRs provisioned to an IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-provisionedcidrs)
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool. 
     */
    override fun provisionedCidrs(provisionedCidrs: IResolvable) {
      cdkBuilder.provisionedCidrs(provisionedCidrs.let(IResolvable::unwrap))
    }

    /**
     * Information about the CIDRs provisioned to an IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-provisionedcidrs)
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool. 
     */
    override fun provisionedCidrs(provisionedCidrs: List<Any>) {
      cdkBuilder.provisionedCidrs(provisionedCidrs)
    }

    /**
     * Information about the CIDRs provisioned to an IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-provisionedcidrs)
     * @param provisionedCidrs Information about the CIDRs provisioned to an IPAM pool. 
     */
    override fun provisionedCidrs(vararg provisionedCidrs: Any): Unit =
        provisionedCidrs(provisionedCidrs.toList())

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
     * @param publicIpSource The IP address source for pools in the public scope. 
     */
    override fun publicIpSource(publicIpSource: String) {
      cdkBuilder.publicIpSource(publicIpSource)
    }

    /**
     * Determines if a pool is publicly advertisable.
     *
     * This option is not available for pools with AddressFamily set to `ipv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-publiclyadvertisable)
     * @param publiclyAdvertisable Determines if a pool is publicly advertisable. 
     */
    override fun publiclyAdvertisable(publiclyAdvertisable: Boolean) {
      cdkBuilder.publiclyAdvertisable(publiclyAdvertisable)
    }

    /**
     * Determines if a pool is publicly advertisable.
     *
     * This option is not available for pools with AddressFamily set to `ipv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-publiclyadvertisable)
     * @param publiclyAdvertisable Determines if a pool is publicly advertisable. 
     */
    override fun publiclyAdvertisable(publiclyAdvertisable: IResolvable) {
      cdkBuilder.publiclyAdvertisable(publiclyAdvertisable.let(IResolvable::unwrap))
    }

    /**
     * The ID of the source IPAM pool.
     *
     * You can use this option to create an IPAM pool within an existing source pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-sourceipampoolid)
     * @param sourceIpamPoolId The ID of the source IPAM pool. 
     */
    override fun sourceIpamPoolId(sourceIpamPoolId: String) {
      cdkBuilder.sourceIpamPoolId(sourceIpamPoolId)
    }

    /**
     * The resource used to provision CIDRs to a resource planning pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-sourceresource)
     * @param sourceResource The resource used to provision CIDRs to a resource planning pool. 
     */
    override fun sourceResource(sourceResource: IResolvable) {
      cdkBuilder.sourceResource(sourceResource.let(IResolvable::unwrap))
    }

    /**
     * The resource used to provision CIDRs to a resource planning pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-sourceresource)
     * @param sourceResource The resource used to provision CIDRs to a resource planning pool. 
     */
    override fun sourceResource(sourceResource: SourceResourceProperty) {
      cdkBuilder.sourceResource(sourceResource.let(SourceResourceProperty::unwrap))
    }

    /**
     * The resource used to provision CIDRs to a resource planning pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-sourceresource)
     * @param sourceResource The resource used to provision CIDRs to a resource planning pool. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef83e558225eb21dddf1d39328df53c2bd0b498f2d5a26d4bc20ea20a24682a6")
    override fun sourceResource(sourceResource: SourceResourceProperty.Builder.() -> Unit): Unit =
        sourceResource(SourceResourceProperty(sourceResource))

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-tags)
     * @param tags The key/value combination of a tag assigned to the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampool.html#cfn-ec2-ipampool-tags)
     * @param tags The key/value combination of a tag assigned to the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMPool = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPAMPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPAMPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPool): CfnIPAMPool =
        CfnIPAMPool(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMPool): software.amazon.awscdk.services.ec2.CfnIPAMPool =
        wrapped.cdkObject
  }

  public interface ProvisionedCidrProperty {
    /**
     * The CIDR provisioned to the IPAM pool.
     *
     * A CIDR is a representation of an IP address and its associated network mask (or netmask) and
     * refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR
     * example is `2001:DB8::/32` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipampool-provisionedcidr.html#cfn-ec2-ipampool-provisionedcidr-cidr)
     */
    public fun cidr(): String

    /**
     * A builder for [ProvisionedCidrProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidr The CIDR provisioned to the IPAM pool. 
       * A CIDR is a representation of an IP address and its associated network mask (or netmask)
       * and refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR
       * example is `2001:DB8::/32` .
       */
      public fun cidr(cidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty.builder()

      /**
       * @param cidr The CIDR provisioned to the IPAM pool. 
       * A CIDR is a representation of an IP address and its associated network mask (or netmask)
       * and refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR
       * example is `2001:DB8::/32` .
       */
      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty,
    ) : CdkObject(cdkObject), ProvisionedCidrProperty {
      /**
       * The CIDR provisioned to the IPAM pool.
       *
       * A CIDR is a representation of an IP address and its associated network mask (or netmask)
       * and refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR
       * example is `2001:DB8::/32` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipampool-provisionedcidr.html#cfn-ec2-ipampool-provisionedcidr-cidr)
       */
      override fun cidr(): String = unwrap(this).getCidr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedCidrProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty):
          ProvisionedCidrProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedCidrProperty):
          software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnIPAMPool.ProvisionedCidrProperty
    }
  }

  public interface SourceResourceProperty {
    /**
     * The source resource ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipampool-sourceresource.html#cfn-ec2-ipampool-sourceresource-resourceid)
     */
    public fun resourceId(): String

    /**
     * The source resource owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipampool-sourceresource.html#cfn-ec2-ipampool-sourceresource-resourceowner)
     */
    public fun resourceOwner(): String

    /**
     * The source resource Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipampool-sourceresource.html#cfn-ec2-ipampool-sourceresource-resourceregion)
     */
    public fun resourceRegion(): String

    /**
     * The source resource type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipampool-sourceresource.html#cfn-ec2-ipampool-sourceresource-resourcetype)
     */
    public fun resourceType(): String

    /**
     * A builder for [SourceResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceId The source resource ID. 
       */
      public fun resourceId(resourceId: String)

      /**
       * @param resourceOwner The source resource owner. 
       */
      public fun resourceOwner(resourceOwner: String)

      /**
       * @param resourceRegion The source resource Region. 
       */
      public fun resourceRegion(resourceRegion: String)

      /**
       * @param resourceType The source resource type. 
       */
      public fun resourceType(resourceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty.builder()

      /**
       * @param resourceId The source resource ID. 
       */
      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      /**
       * @param resourceOwner The source resource owner. 
       */
      override fun resourceOwner(resourceOwner: String) {
        cdkBuilder.resourceOwner(resourceOwner)
      }

      /**
       * @param resourceRegion The source resource Region. 
       */
      override fun resourceRegion(resourceRegion: String) {
        cdkBuilder.resourceRegion(resourceRegion)
      }

      /**
       * @param resourceType The source resource type. 
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty,
    ) : CdkObject(cdkObject), SourceResourceProperty {
      /**
       * The source resource ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipampool-sourceresource.html#cfn-ec2-ipampool-sourceresource-resourceid)
       */
      override fun resourceId(): String = unwrap(this).getResourceId()

      /**
       * The source resource owner.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipampool-sourceresource.html#cfn-ec2-ipampool-sourceresource-resourceowner)
       */
      override fun resourceOwner(): String = unwrap(this).getResourceOwner()

      /**
       * The source resource Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipampool-sourceresource.html#cfn-ec2-ipampool-sourceresource-resourceregion)
       */
      override fun resourceRegion(): String = unwrap(this).getResourceRegion()

      /**
       * The source resource type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipampool-sourceresource.html#cfn-ec2-ipampool-sourceresource-resourcetype)
       */
      override fun resourceType(): String = unwrap(this).getResourceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty):
          SourceResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceResourceProperty):
          software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnIPAMPool.SourceResourceProperty
    }
  }
}
