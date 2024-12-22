@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

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

/**
 * Properties for defining a `CfnDBShardGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnDBShardGroupProps cfnDBShardGroupProps = CfnDBShardGroupProps.builder()
 * .dbClusterIdentifier("dbClusterIdentifier")
 * .maxAcu(123)
 * // the properties below are optional
 * .computeRedundancy(123)
 * .dbShardGroupIdentifier("dbShardGroupIdentifier")
 * .minAcu(123)
 * .publiclyAccessible(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html)
 */
public interface CfnDBShardGroupProps {
  /**
   * Specifies whether to create standby DB shard groups for the DB shard group. Valid values are
   * the following:.
   *
   * * 0 - Creates a DB shard group without a standby DB shard group. This is the default value.
   * * 1 - Creates a DB shard group with a standby DB shard group in a different Availability Zone
   * (AZ).
   * * 2 - Creates a DB shard group with two standby DB shard groups in two different AZs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-computeredundancy)
   */
  public fun computeRedundancy(): Number? = unwrap(this).getComputeRedundancy()

  /**
   * The name of the primary DB cluster for the DB shard group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-dbclusteridentifier)
   */
  public fun dbClusterIdentifier(): String

  /**
   * The name of the DB shard group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-dbshardgroupidentifier)
   */
  public fun dbShardGroupIdentifier(): String? = unwrap(this).getDbShardGroupIdentifier()

  /**
   * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-maxacu)
   */
  public fun maxAcu(): Number

  /**
   * The minimum capacity of the DB shard group in Aurora capacity units (ACUs).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-minacu)
   */
  public fun minAcu(): Number? = unwrap(this).getMinAcu()

  /**
   * Specifies whether the DB shard group is publicly accessible.
   *
   * When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint resolves
   * to the private IP address from within the DB shard group's virtual private cloud (VPC). It
   * resolves to the public IP address from outside of the DB shard group's VPC. Access to the DB shard
   * group is ultimately controlled by the security group it uses. That public access is not permitted
   * if the security group assigned to the DB shard group doesn't permit it.
   *
   * When the DB shard group isn't publicly accessible, it is an internal DB shard group with a DNS
   * name that resolves to a private IP address.
   *
   * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
   *
   * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the following
   * applies:
   *
   * * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the
   * DB shard group is private.
   * * If the default VPC in the target Region has an internet gateway attached to it, the DB shard
   * group is public.
   *
   * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
   * applies:
   *
   * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB
   * shard group is private.
   * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB shard
   * group is public.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-publiclyaccessible)
   */
  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the DB
   * shard group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDBShardGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param computeRedundancy Specifies whether to create standby DB shard groups for the DB shard
     * group. Valid values are the following:.
     * * 0 - Creates a DB shard group without a standby DB shard group. This is the default value.
     * * 1 - Creates a DB shard group with a standby DB shard group in a different Availability Zone
     * (AZ).
     * * 2 - Creates a DB shard group with two standby DB shard groups in two different AZs.
     */
    public fun computeRedundancy(computeRedundancy: Number)

    /**
     * @param dbClusterIdentifier The name of the primary DB cluster for the DB shard group. 
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    /**
     * @param dbShardGroupIdentifier The name of the DB shard group.
     */
    public fun dbShardGroupIdentifier(dbShardGroupIdentifier: String)

    /**
     * @param maxAcu The maximum capacity of the DB shard group in Aurora capacity units (ACUs). 
     */
    public fun maxAcu(maxAcu: Number)

    /**
     * @param minAcu The minimum capacity of the DB shard group in Aurora capacity units (ACUs).
     */
    public fun minAcu(minAcu: Number)

    /**
     * @param publiclyAccessible Specifies whether the DB shard group is publicly accessible.
     * When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint
     * resolves to the private IP address from within the DB shard group's virtual private cloud (VPC).
     * It resolves to the public IP address from outside of the DB shard group's VPC. Access to the DB
     * shard group is ultimately controlled by the security group it uses. That public access is not
     * permitted if the security group assigned to the DB shard group doesn't permit it.
     *
     * When the DB shard group isn't publicly accessible, it is an internal DB shard group with a
     * DNS name that resolves to a private IP address.
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB shard group is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * shard group is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB shard group is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB shard
     * group is public.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * @param publiclyAccessible Specifies whether the DB shard group is publicly accessible.
     * When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint
     * resolves to the private IP address from within the DB shard group's virtual private cloud (VPC).
     * It resolves to the public IP address from outside of the DB shard group's VPC. Access to the DB
     * shard group is ultimately controlled by the security group it uses. That public access is not
     * permitted if the security group assigned to the DB shard group doesn't permit it.
     *
     * When the DB shard group isn't publicly accessible, it is an internal DB shard group with a
     * DNS name that resolves to a private IP address.
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB shard group is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * shard group is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB shard group is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB shard
     * group is public.
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the DB shard group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the DB shard group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBShardGroupProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBShardGroupProps.builder()

    /**
     * @param computeRedundancy Specifies whether to create standby DB shard groups for the DB shard
     * group. Valid values are the following:.
     * * 0 - Creates a DB shard group without a standby DB shard group. This is the default value.
     * * 1 - Creates a DB shard group with a standby DB shard group in a different Availability Zone
     * (AZ).
     * * 2 - Creates a DB shard group with two standby DB shard groups in two different AZs.
     */
    override fun computeRedundancy(computeRedundancy: Number) {
      cdkBuilder.computeRedundancy(computeRedundancy)
    }

    /**
     * @param dbClusterIdentifier The name of the primary DB cluster for the DB shard group. 
     */
    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * @param dbShardGroupIdentifier The name of the DB shard group.
     */
    override fun dbShardGroupIdentifier(dbShardGroupIdentifier: String) {
      cdkBuilder.dbShardGroupIdentifier(dbShardGroupIdentifier)
    }

    /**
     * @param maxAcu The maximum capacity of the DB shard group in Aurora capacity units (ACUs). 
     */
    override fun maxAcu(maxAcu: Number) {
      cdkBuilder.maxAcu(maxAcu)
    }

    /**
     * @param minAcu The minimum capacity of the DB shard group in Aurora capacity units (ACUs).
     */
    override fun minAcu(minAcu: Number) {
      cdkBuilder.minAcu(minAcu)
    }

    /**
     * @param publiclyAccessible Specifies whether the DB shard group is publicly accessible.
     * When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint
     * resolves to the private IP address from within the DB shard group's virtual private cloud (VPC).
     * It resolves to the public IP address from outside of the DB shard group's VPC. Access to the DB
     * shard group is ultimately controlled by the security group it uses. That public access is not
     * permitted if the security group assigned to the DB shard group doesn't permit it.
     *
     * When the DB shard group isn't publicly accessible, it is an internal DB shard group with a
     * DNS name that resolves to a private IP address.
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB shard group is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * shard group is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB shard group is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB shard
     * group is public.
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible Specifies whether the DB shard group is publicly accessible.
     * When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint
     * resolves to the private IP address from within the DB shard group's virtual private cloud (VPC).
     * It resolves to the public IP address from outside of the DB shard group's VPC. Access to the DB
     * shard group is ultimately controlled by the security group it uses. That public access is not
     * permitted if the security group assigned to the DB shard group doesn't permit it.
     *
     * When the DB shard group isn't publicly accessible, it is an internal DB shard group with a
     * DNS name that resolves to a private IP address.
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB shard group is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * shard group is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB shard group is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB shard
     * group is public.
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the DB shard group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the DB shard group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBShardGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.CfnDBShardGroupProps,
  ) : CdkObject(cdkObject),
      CfnDBShardGroupProps {
    /**
     * Specifies whether to create standby DB shard groups for the DB shard group. Valid values are
     * the following:.
     *
     * * 0 - Creates a DB shard group without a standby DB shard group. This is the default value.
     * * 1 - Creates a DB shard group with a standby DB shard group in a different Availability Zone
     * (AZ).
     * * 2 - Creates a DB shard group with two standby DB shard groups in two different AZs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-computeredundancy)
     */
    override fun computeRedundancy(): Number? = unwrap(this).getComputeRedundancy()

    /**
     * The name of the primary DB cluster for the DB shard group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-dbclusteridentifier)
     */
    override fun dbClusterIdentifier(): String = unwrap(this).getDbClusterIdentifier()

    /**
     * The name of the DB shard group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-dbshardgroupidentifier)
     */
    override fun dbShardGroupIdentifier(): String? = unwrap(this).getDbShardGroupIdentifier()

    /**
     * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-maxacu)
     */
    override fun maxAcu(): Number = unwrap(this).getMaxAcu()

    /**
     * The minimum capacity of the DB shard group in Aurora capacity units (ACUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-minacu)
     */
    override fun minAcu(): Number? = unwrap(this).getMinAcu()

    /**
     * Specifies whether the DB shard group is publicly accessible.
     *
     * When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint
     * resolves to the private IP address from within the DB shard group's virtual private cloud (VPC).
     * It resolves to the public IP address from outside of the DB shard group's VPC. Access to the DB
     * shard group is ultimately controlled by the security group it uses. That public access is not
     * permitted if the security group assigned to the DB shard group doesn't permit it.
     *
     * When the DB shard group isn't publicly accessible, it is an internal DB shard group with a
     * DNS name that resolves to a private IP address.
     *
     * Default: The default behavior varies depending on whether `DBSubnetGroupName` is specified.
     *
     * If `DBSubnetGroupName` isn't specified, and `PubliclyAccessible` isn't specified, the
     * following applies:
     *
     * * If the default VPC in the target Region doesn’t have an internet gateway attached to it,
     * the DB shard group is private.
     * * If the default VPC in the target Region has an internet gateway attached to it, the DB
     * shard group is public.
     *
     * If `DBSubnetGroupName` is specified, and `PubliclyAccessible` isn't specified, the following
     * applies:
     *
     * * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the
     * DB shard group is private.
     * * If the subnets are part of a VPC that has an internet gateway attached to it, the DB shard
     * group is public.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-publiclyaccessible)
     */
    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the DB
     * shard group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBShardGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBShardGroupProps):
        CfnDBShardGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDBShardGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBShardGroupProps):
        software.amazon.awscdk.services.rds.CfnDBShardGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.CfnDBShardGroupProps
  }
}
