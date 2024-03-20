@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::RDS::DBSecurityGroup` resource creates or updates an Amazon RDS DB security group.
 *
 *
 * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC, we
 * recommend that you migrate as soon as possible. For more information, see [Migrate from EC2-Classic
 * to a VPC](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html) in the *Amazon EC2
 * User Guide* , the blog [EC2-Classic Networking is Retiring – Here’s How to
 * Prepare](https://docs.aws.amazon.com/aws/ec2-classic-is-retiring-heres-how-to-prepare/) , and
 * [Moving a DB instance not in a VPC into a
 * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html) in the
 * *Amazon RDS User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnDBSecurityGroup cfnDBSecurityGroup = CfnDBSecurityGroup.Builder.create(this,
 * "MyCfnDBSecurityGroup")
 * .dbSecurityGroupIngress(List.of(IngressProperty.builder()
 * .cidrip("cidrip")
 * .ec2SecurityGroupId("ec2SecurityGroupId")
 * .ec2SecurityGroupName("ec2SecurityGroupName")
 * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
 * .build()))
 * .groupDescription("groupDescription")
 * // the properties below are optional
 * .ec2VpcId("ec2VpcId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html)
 */
public open class CfnDBSecurityGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBSecurityGroupProps,
  ) :
      this(software.amazon.awscdk.services.rds.CfnDBSecurityGroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDBSecurityGroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBSecurityGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDBSecurityGroupProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Ingress rules to be applied to the DB security group.
   */
  public open fun dbSecurityGroupIngress(): Any = unwrap(this).getDbSecurityGroupIngress()

  /**
   * Ingress rules to be applied to the DB security group.
   */
  public open fun dbSecurityGroupIngress(`value`: IResolvable) {
    unwrap(this).setDbSecurityGroupIngress(`value`.let(IResolvable::unwrap))
  }

  /**
   * Ingress rules to be applied to the DB security group.
   */
  public open fun dbSecurityGroupIngress(`value`: List<Any>) {
    unwrap(this).setDbSecurityGroupIngress(`value`)
  }

  /**
   * Ingress rules to be applied to the DB security group.
   */
  public open fun dbSecurityGroupIngress(vararg `value`: Any): Unit =
      dbSecurityGroupIngress(`value`.toList())

  /**
   * The identifier of an Amazon VPC.
   *
   * This property indicates the VPC that this DB security group belongs to.
   */
  public open fun ec2VpcId(): String? = unwrap(this).getEc2VpcId()

  /**
   * The identifier of an Amazon VPC.
   *
   * This property indicates the VPC that this DB security group belongs to.
   */
  public open fun ec2VpcId(`value`: String) {
    unwrap(this).setEc2VpcId(`value`)
  }

  /**
   * Provides the description of the DB security group.
   */
  public open fun groupDescription(): String = unwrap(this).getGroupDescription()

  /**
   * Provides the description of the DB security group.
   */
  public open fun groupDescription(`value`: String) {
    unwrap(this).setGroupDescription(`value`)
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
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An optional array of key-value pairs to apply to this DB security group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An optional array of key-value pairs to apply to this DB security group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An optional array of key-value pairs to apply to this DB security group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnDBSecurityGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Ingress rules to be applied to the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
     */
    public fun dbSecurityGroupIngress(dbSecurityGroupIngress: IResolvable)

    /**
     * Ingress rules to be applied to the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
     */
    public fun dbSecurityGroupIngress(dbSecurityGroupIngress: List<Any>)

    /**
     * Ingress rules to be applied to the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
     */
    public fun dbSecurityGroupIngress(vararg dbSecurityGroupIngress: Any)

    /**
     * The identifier of an Amazon VPC. This property indicates the VPC that this DB security group
     * belongs to.
     *
     *
     * The `EC2VpcId` property is for backward compatibility with older regions, and is no longer
     * recommended for providing security information to an RDS DB instance.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-ec2vpcid)
     * @param ec2VpcId The identifier of an Amazon VPC. This property indicates the VPC that this DB
     * security group belongs to. 
     */
    public fun ec2VpcId(ec2VpcId: String)

    /**
     * Provides the description of the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-groupdescription)
     * @param groupDescription Provides the description of the DB security group. 
     */
    public fun groupDescription(groupDescription: String)

    /**
     * An optional array of key-value pairs to apply to this DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-tags)
     * @param tags An optional array of key-value pairs to apply to this DB security group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional array of key-value pairs to apply to this DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-tags)
     * @param tags An optional array of key-value pairs to apply to this DB security group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBSecurityGroup.Builder =
        software.amazon.awscdk.services.rds.CfnDBSecurityGroup.Builder.create(scope, id)

    /**
     * Ingress rules to be applied to the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
     */
    override fun dbSecurityGroupIngress(dbSecurityGroupIngress: IResolvable) {
      cdkBuilder.dbSecurityGroupIngress(dbSecurityGroupIngress.let(IResolvable::unwrap))
    }

    /**
     * Ingress rules to be applied to the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
     */
    override fun dbSecurityGroupIngress(dbSecurityGroupIngress: List<Any>) {
      cdkBuilder.dbSecurityGroupIngress(dbSecurityGroupIngress)
    }

    /**
     * Ingress rules to be applied to the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
     */
    override fun dbSecurityGroupIngress(vararg dbSecurityGroupIngress: Any): Unit =
        dbSecurityGroupIngress(dbSecurityGroupIngress.toList())

    /**
     * The identifier of an Amazon VPC. This property indicates the VPC that this DB security group
     * belongs to.
     *
     *
     * The `EC2VpcId` property is for backward compatibility with older regions, and is no longer
     * recommended for providing security information to an RDS DB instance.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-ec2vpcid)
     * @param ec2VpcId The identifier of an Amazon VPC. This property indicates the VPC that this DB
     * security group belongs to. 
     */
    override fun ec2VpcId(ec2VpcId: String) {
      cdkBuilder.ec2VpcId(ec2VpcId)
    }

    /**
     * Provides the description of the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-groupdescription)
     * @param groupDescription Provides the description of the DB security group. 
     */
    override fun groupDescription(groupDescription: String) {
      cdkBuilder.groupDescription(groupDescription)
    }

    /**
     * An optional array of key-value pairs to apply to this DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-tags)
     * @param tags An optional array of key-value pairs to apply to this DB security group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An optional array of key-value pairs to apply to this DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-tags)
     * @param tags An optional array of key-value pairs to apply to this DB security group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBSecurityGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBSecurityGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBSecurityGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBSecurityGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroup):
        CfnDBSecurityGroup = CfnDBSecurityGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDBSecurityGroup):
        software.amazon.awscdk.services.rds.CfnDBSecurityGroup = wrapped.cdkObject
  }

  /**
   * The `Ingress` property type specifies an individual ingress rule within an
   * `AWS::RDS::DBSecurityGroup` resource.
   *
   *
   * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC,
   * we recommend that you migrate as soon as possible. For more information, see [Migrate from
   * EC2-Classic to a VPC](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html) in the
   * *Amazon EC2 User Guide* , the blog [EC2-Classic Networking is Retiring – Here’s How to
   * Prepare](https://docs.aws.amazon.com/aws/ec2-classic-is-retiring-heres-how-to-prepare/) , and
   * [Moving a DB instance not in a VPC into a
   * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html) in the
   * *Amazon RDS User Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * IngressProperty ingressProperty = IngressProperty.builder()
   * .cidrip("cidrip")
   * .ec2SecurityGroupId("ec2SecurityGroupId")
   * .ec2SecurityGroupName("ec2SecurityGroupName")
   * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html)
   */
  public interface IngressProperty {
    /**
     * The IP range to authorize.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-cidrip)
     */
    public fun cidrip(): String? = unwrap(this).getCidrip()

    /**
     * Id of the EC2 security group to authorize.
     *
     * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
     * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
     * provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-ec2securitygroupid)
     */
    public fun ec2SecurityGroupId(): String? = unwrap(this).getEc2SecurityGroupId()

    /**
     * Name of the EC2 security group to authorize.
     *
     * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
     * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
     * provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-ec2securitygroupname)
     */
    public fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

    /**
     * AWS account number of the owner of the EC2 security group specified in the
     * `EC2SecurityGroupName` parameter.
     *
     * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
     * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and either
     * `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-ec2securitygroupownerid)
     */
    public fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()

    /**
     * A builder for [IngressProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidrip The IP range to authorize.
       */
      public fun cidrip(cidrip: String)

      /**
       * @param ec2SecurityGroupId Id of the EC2 security group to authorize.
       * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
       * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
       * provided.
       */
      public fun ec2SecurityGroupId(ec2SecurityGroupId: String)

      /**
       * @param ec2SecurityGroupName Name of the EC2 security group to authorize.
       * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
       * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
       * provided.
       */
      public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

      /**
       * @param ec2SecurityGroupOwnerId AWS account number of the owner of the EC2 security group
       * specified in the `EC2SecurityGroupName` parameter.
       * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
       * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and either
       * `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
       */
      public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty.builder()

      /**
       * @param cidrip The IP range to authorize.
       */
      override fun cidrip(cidrip: String) {
        cdkBuilder.cidrip(cidrip)
      }

      /**
       * @param ec2SecurityGroupId Id of the EC2 security group to authorize.
       * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
       * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
       * provided.
       */
      override fun ec2SecurityGroupId(ec2SecurityGroupId: String) {
        cdkBuilder.ec2SecurityGroupId(ec2SecurityGroupId)
      }

      /**
       * @param ec2SecurityGroupName Name of the EC2 security group to authorize.
       * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
       * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
       * provided.
       */
      override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
        cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
      }

      /**
       * @param ec2SecurityGroupOwnerId AWS account number of the owner of the EC2 security group
       * specified in the `EC2SecurityGroupName` parameter.
       * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
       * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and either
       * `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
       */
      override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
        cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty,
    ) : CdkObject(cdkObject), IngressProperty {
      /**
       * The IP range to authorize.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-cidrip)
       */
      override fun cidrip(): String? = unwrap(this).getCidrip()

      /**
       * Id of the EC2 security group to authorize.
       *
       * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
       * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
       * provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-ec2securitygroupid)
       */
      override fun ec2SecurityGroupId(): String? = unwrap(this).getEc2SecurityGroupId()

      /**
       * Name of the EC2 security group to authorize.
       *
       * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
       * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
       * provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-ec2securitygroupname)
       */
      override fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

      /**
       * AWS account number of the owner of the EC2 security group specified in the
       * `EC2SecurityGroupName` parameter.
       *
       * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
       * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and either
       * `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-ec2securitygroupownerid)
       */
      override fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty):
          IngressProperty = CdkObjectWrappers.wrap(cdkObject) as? IngressProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressProperty):
          software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty
    }
  }
}
