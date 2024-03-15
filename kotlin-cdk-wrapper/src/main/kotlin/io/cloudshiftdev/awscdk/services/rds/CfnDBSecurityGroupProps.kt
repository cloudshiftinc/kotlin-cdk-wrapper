@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDBSecurityGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnDBSecurityGroupProps cfnDBSecurityGroupProps = CfnDBSecurityGroupProps.builder()
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
public interface CfnDBSecurityGroupProps {
  /**
   * Ingress rules to be applied to the DB security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
   */
  public fun dbSecurityGroupIngress(): Any

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
   */
  public fun ec2VpcId(): String? = unwrap(this).getEc2VpcId()

  /**
   * Provides the description of the DB security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-groupdescription)
   */
  public fun groupDescription(): String

  /**
   * An optional array of key-value pairs to apply to this DB security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDBSecurityGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
     */
    public fun dbSecurityGroupIngress(dbSecurityGroupIngress: IResolvable)

    /**
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
     */
    public fun dbSecurityGroupIngress(dbSecurityGroupIngress: List<Any>)

    /**
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
     */
    public fun dbSecurityGroupIngress(vararg dbSecurityGroupIngress: Any)

    /**
     * @param ec2VpcId The identifier of an Amazon VPC. This property indicates the VPC that this DB
     * security group belongs to.
     *
     * The `EC2VpcId` property is for backward compatibility with older regions, and is no longer
     * recommended for providing security information to an RDS DB instance.
     */
    public fun ec2VpcId(ec2VpcId: String)

    /**
     * @param groupDescription Provides the description of the DB security group. 
     */
    public fun groupDescription(groupDescription: String)

    /**
     * @param tags An optional array of key-value pairs to apply to this DB security group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional array of key-value pairs to apply to this DB security group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps.builder()

    /**
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
     */
    override fun dbSecurityGroupIngress(dbSecurityGroupIngress: IResolvable) {
      cdkBuilder.dbSecurityGroupIngress(dbSecurityGroupIngress.let(IResolvable::unwrap))
    }

    /**
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
     */
    override fun dbSecurityGroupIngress(dbSecurityGroupIngress: List<Any>) {
      cdkBuilder.dbSecurityGroupIngress(dbSecurityGroupIngress)
    }

    /**
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
     */
    override fun dbSecurityGroupIngress(vararg dbSecurityGroupIngress: Any): Unit =
        dbSecurityGroupIngress(dbSecurityGroupIngress.toList())

    /**
     * @param ec2VpcId The identifier of an Amazon VPC. This property indicates the VPC that this DB
     * security group belongs to.
     *
     * The `EC2VpcId` property is for backward compatibility with older regions, and is no longer
     * recommended for providing security information to an RDS DB instance.
     */
    override fun ec2VpcId(ec2VpcId: String) {
      cdkBuilder.ec2VpcId(ec2VpcId)
    }

    /**
     * @param groupDescription Provides the description of the DB security group. 
     */
    override fun groupDescription(groupDescription: String) {
      cdkBuilder.groupDescription(groupDescription)
    }

    /**
     * @param tags An optional array of key-value pairs to apply to this DB security group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An optional array of key-value pairs to apply to this DB security group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps,
  ) : CdkObject(cdkObject), CfnDBSecurityGroupProps {
    /**
     * Ingress rules to be applied to the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
     */
    override fun dbSecurityGroupIngress(): Any = unwrap(this).getDbSecurityGroupIngress()

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
     */
    override fun ec2VpcId(): String? = unwrap(this).getEc2VpcId()

    /**
     * Provides the description of the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-groupdescription)
     */
    override fun groupDescription(): String = unwrap(this).getGroupDescription()

    /**
     * An optional array of key-value pairs to apply to this DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBSecurityGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps):
        CfnDBSecurityGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBSecurityGroupProps):
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps
  }
}
