@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new DB shard group for Aurora Limitless Database.
 *
 * You must enable Aurora Limitless Database to create a DB shard group.
 *
 * Valid for: Aurora DB clusters only
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnDBShardGroup cfnDBShardGroup = CfnDBShardGroup.Builder.create(this, "MyCfnDBShardGroup")
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
public open class CfnDBShardGroup(
  cdkObject: software.amazon.awscdk.services.rds.CfnDBShardGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBShardGroupProps,
  ) :
      this(software.amazon.awscdk.services.rds.CfnDBShardGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDBShardGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBShardGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDBShardGroupProps(props)
  )

  /**
   * The AWS Region -unique, immutable identifier for the DB shard group.
   */
  public open fun attrDbShardGroupResourceId(): String =
      unwrap(this).getAttrDbShardGroupResourceId()

  /**
   * This data type represents the information you need to connect to an Amazon RDS DB instance.
   *
   * This data type is used as a response element in the following actions:
   *
   * * `CreateDBInstance`
   * * `DescribeDBInstances`
   * * `DeleteDBInstance`
   *
   * For the data structure that represents Amazon Aurora DB cluster endpoints, see
   * `DBClusterEndpoint` .
   */
  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Specifies whether to create standby standby DB data access shard for the DB shard group.
   */
  public open fun computeRedundancy(): Number? = unwrap(this).getComputeRedundancy()

  /**
   * Specifies whether to create standby standby DB data access shard for the DB shard group.
   */
  public open fun computeRedundancy(`value`: Number) {
    unwrap(this).setComputeRedundancy(`value`)
  }

  /**
   * The name of the primary DB cluster for the DB shard group.
   */
  public open fun dbClusterIdentifier(): String = unwrap(this).getDbClusterIdentifier()

  /**
   * The name of the primary DB cluster for the DB shard group.
   */
  public open fun dbClusterIdentifier(`value`: String) {
    unwrap(this).setDbClusterIdentifier(`value`)
  }

  /**
   * The name of the DB shard group.
   */
  public open fun dbShardGroupIdentifier(): String? = unwrap(this).getDbShardGroupIdentifier()

  /**
   * The name of the DB shard group.
   */
  public open fun dbShardGroupIdentifier(`value`: String) {
    unwrap(this).setDbShardGroupIdentifier(`value`)
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
   * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
   */
  public open fun maxAcu(): Number = unwrap(this).getMaxAcu()

  /**
   * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
   */
  public open fun maxAcu(`value`: Number) {
    unwrap(this).setMaxAcu(`value`)
  }

  /**
   * The minimum capacity of the DB shard group in Aurora capacity units (ACUs).
   */
  public open fun minAcu(): Number? = unwrap(this).getMinAcu()

  /**
   * The minimum capacity of the DB shard group in Aurora capacity units (ACUs).
   */
  public open fun minAcu(`value`: Number) {
    unwrap(this).setMinAcu(`value`)
  }

  /**
   * Specifies whether the DB shard group is publicly accessible.
   */
  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * Specifies whether the DB shard group is publicly accessible.
   */
  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  /**
   * Specifies whether the DB shard group is publicly accessible.
   */
  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the DB
   * shard group.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the DB
   * shard group.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the DB
   * shard group.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnDBShardGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether to create standby standby DB data access shard for the DB shard group.
     *
     * Valid values are the following:
     *
     * * 0 - Creates a DB shard group without a standby DB data access shard. This is the default
     * value.
     * * 1 - Creates a DB shard group with a standby DB data access shard in a different
     * Availability Zone (AZ).
     * * 2 - Creates a DB shard group with two standby DB data access shard in two different AZs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-computeredundancy)
     * @param computeRedundancy Specifies whether to create standby standby DB data access shard for
     * the DB shard group. 
     */
    public fun computeRedundancy(computeRedundancy: Number)

    /**
     * The name of the primary DB cluster for the DB shard group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-dbclusteridentifier)
     * @param dbClusterIdentifier The name of the primary DB cluster for the DB shard group. 
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    /**
     * The name of the DB shard group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-dbshardgroupidentifier)
     * @param dbShardGroupIdentifier The name of the DB shard group. 
     */
    public fun dbShardGroupIdentifier(dbShardGroupIdentifier: String)

    /**
     * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-maxacu)
     * @param maxAcu The maximum capacity of the DB shard group in Aurora capacity units (ACUs). 
     */
    public fun maxAcu(maxAcu: Number)

    /**
     * The minimum capacity of the DB shard group in Aurora capacity units (ACUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-minacu)
     * @param minAcu The minimum capacity of the DB shard group in Aurora capacity units (ACUs). 
     */
    public fun minAcu(minAcu: Number)

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
     * @param publiclyAccessible Specifies whether the DB shard group is publicly accessible. 
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

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
     * @param publiclyAccessible Specifies whether the DB shard group is publicly accessible. 
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the DB
     * shard group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-tags)
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the DB shard group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the DB
     * shard group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-tags)
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the DB shard group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBShardGroup.Builder =
        software.amazon.awscdk.services.rds.CfnDBShardGroup.Builder.create(scope, id)

    /**
     * Specifies whether to create standby standby DB data access shard for the DB shard group.
     *
     * Valid values are the following:
     *
     * * 0 - Creates a DB shard group without a standby DB data access shard. This is the default
     * value.
     * * 1 - Creates a DB shard group with a standby DB data access shard in a different
     * Availability Zone (AZ).
     * * 2 - Creates a DB shard group with two standby DB data access shard in two different AZs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-computeredundancy)
     * @param computeRedundancy Specifies whether to create standby standby DB data access shard for
     * the DB shard group. 
     */
    override fun computeRedundancy(computeRedundancy: Number) {
      cdkBuilder.computeRedundancy(computeRedundancy)
    }

    /**
     * The name of the primary DB cluster for the DB shard group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-dbclusteridentifier)
     * @param dbClusterIdentifier The name of the primary DB cluster for the DB shard group. 
     */
    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * The name of the DB shard group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-dbshardgroupidentifier)
     * @param dbShardGroupIdentifier The name of the DB shard group. 
     */
    override fun dbShardGroupIdentifier(dbShardGroupIdentifier: String) {
      cdkBuilder.dbShardGroupIdentifier(dbShardGroupIdentifier)
    }

    /**
     * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-maxacu)
     * @param maxAcu The maximum capacity of the DB shard group in Aurora capacity units (ACUs). 
     */
    override fun maxAcu(maxAcu: Number) {
      cdkBuilder.maxAcu(maxAcu)
    }

    /**
     * The minimum capacity of the DB shard group in Aurora capacity units (ACUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-minacu)
     * @param minAcu The minimum capacity of the DB shard group in Aurora capacity units (ACUs). 
     */
    override fun minAcu(minAcu: Number) {
      cdkBuilder.minAcu(minAcu)
    }

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
     * @param publiclyAccessible Specifies whether the DB shard group is publicly accessible. 
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

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
     * @param publiclyAccessible Specifies whether the DB shard group is publicly accessible. 
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable.Companion::unwrap))
    }

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the DB
     * shard group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-tags)
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the DB shard group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the DB
     * shard group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbshardgroup.html#cfn-rds-dbshardgroup-tags)
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the DB shard group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBShardGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBShardGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBShardGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBShardGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBShardGroup):
        CfnDBShardGroup = CfnDBShardGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDBShardGroup):
        software.amazon.awscdk.services.rds.CfnDBShardGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.CfnDBShardGroup
  }
}
