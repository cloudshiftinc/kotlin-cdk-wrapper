@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * In IPAM, an allocation is a CIDR assignment from an IPAM pool to another IPAM pool or to a
 * resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnIPAMAllocation cfnIPAMAllocation = CfnIPAMAllocation.Builder.create(this,
 * "MyCfnIPAMAllocation")
 * .ipamPoolId("ipamPoolId")
 * // the properties below are optional
 * .cidr("cidr")
 * .description("description")
 * .netmaskLength(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html)
 */
public open class CfnIPAMAllocation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMAllocation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID of an allocation.
   */
  public open fun attrIpamPoolAllocationId(): String = unwrap(this).getAttrIpamPoolAllocationId()

  /**
   * The CIDR you would like to allocate from the IPAM pool.
   *
   * Note the following:.
   */
  public open fun cidr(): String? = unwrap(this).getCidr()

  /**
   * The CIDR you would like to allocate from the IPAM pool.
   *
   * Note the following:.
   */
  public open fun cidr(`value`: String) {
    unwrap(this).setCidr(`value`)
  }

  /**
   * A description for the allocation.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the allocation.
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
   * The ID of the IPAM pool from which you would like to allocate a CIDR.
   */
  public open fun ipamPoolId(): String = unwrap(this).getIpamPoolId()

  /**
   * The ID of the IPAM pool from which you would like to allocate a CIDR.
   */
  public open fun ipamPoolId(`value`: String) {
    unwrap(this).setIpamPoolId(`value`)
  }

  /**
   * The netmask length of the CIDR you would like to allocate from the IPAM pool.
   *
   * Note the following:.
   */
  public open fun netmaskLength(): Number? = unwrap(this).getNetmaskLength()

  /**
   * The netmask length of the CIDR you would like to allocate from the IPAM pool.
   *
   * Note the following:.
   */
  public open fun netmaskLength(`value`: Number) {
    unwrap(this).setNetmaskLength(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnIPAMAllocation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The CIDR you would like to allocate from the IPAM pool. Note the following:.
     *
     * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify
     * either the NetmaskLength or the CIDR.
     * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
     * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible values: Any available IPv4 or IPv6 CIDR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-cidr)
     * @param cidr The CIDR you would like to allocate from the IPAM pool. Note the following:. 
     */
    public fun cidr(cidr: String)

    /**
     * A description for the allocation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-description)
     * @param description A description for the allocation. 
     */
    public fun description(description: String)

    /**
     * The ID of the IPAM pool from which you would like to allocate a CIDR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-ipampoolid)
     * @param ipamPoolId The ID of the IPAM pool from which you would like to allocate a CIDR. 
     */
    public fun ipamPoolId(ipamPoolId: String)

    /**
     * The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the
     * following:.
     *
     * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify
     * either the NetmaskLength or the CIDR.
     * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
     * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6
     * addresses are 0 - 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-netmasklength)
     * @param netmaskLength The netmask length of the CIDR you would like to allocate from the IPAM
     * pool. Note the following:. 
     */
    public fun netmaskLength(netmaskLength: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMAllocation.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMAllocation.Builder.create(scope, id)

    /**
     * The CIDR you would like to allocate from the IPAM pool. Note the following:.
     *
     * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify
     * either the NetmaskLength or the CIDR.
     * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
     * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible values: Any available IPv4 or IPv6 CIDR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-cidr)
     * @param cidr The CIDR you would like to allocate from the IPAM pool. Note the following:. 
     */
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    /**
     * A description for the allocation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-description)
     * @param description A description for the allocation. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the IPAM pool from which you would like to allocate a CIDR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-ipampoolid)
     * @param ipamPoolId The ID of the IPAM pool from which you would like to allocate a CIDR. 
     */
    override fun ipamPoolId(ipamPoolId: String) {
      cdkBuilder.ipamPoolId(ipamPoolId)
    }

    /**
     * The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the
     * following:.
     *
     * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify
     * either the NetmaskLength or the CIDR.
     * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
     * NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6
     * addresses are 0 - 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html#cfn-ec2-ipamallocation-netmasklength)
     * @param netmaskLength The netmask length of the CIDR you would like to allocate from the IPAM
     * pool. Note the following:. 
     */
    override fun netmaskLength(netmaskLength: Number) {
      cdkBuilder.netmaskLength(netmaskLength)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMAllocation = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnIPAMAllocation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPAMAllocation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPAMAllocation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMAllocation):
        CfnIPAMAllocation = CfnIPAMAllocation(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMAllocation):
        software.amazon.awscdk.services.ec2.CfnIPAMAllocation = wrapped.cdkObject
  }
}
