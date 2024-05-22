@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::ElastiCache::SecurityGroupIngress type authorizes ingress to a cache security group from
 * hosts in specified Amazon EC2 security groups.
 *
 * For more information about ElastiCache security group ingress, go to
 * [AuthorizeCacheSecurityGroupIngress](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_AuthorizeCacheSecurityGroupIngress.html)
 * in the *Amazon ElastiCache API Reference Guide* .
 *
 *
 * Updates are not supported.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * CfnSecurityGroupIngress cfnSecurityGroupIngress = CfnSecurityGroupIngress.Builder.create(this,
 * "MyCfnSecurityGroupIngress")
 * .cacheSecurityGroupName("cacheSecurityGroupName")
 * .ec2SecurityGroupName("ec2SecurityGroupName")
 * // the properties below are optional
 * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html)
 */
public open class CfnSecurityGroupIngress(
  cdkObject: software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityGroupIngressProps,
  ) :
      this(software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSecurityGroupIngressProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityGroupIngressProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSecurityGroupIngressProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the Cache Security Group to authorize.
   */
  public open fun cacheSecurityGroupName(): String = unwrap(this).getCacheSecurityGroupName()

  /**
   * The name of the Cache Security Group to authorize.
   */
  public open fun cacheSecurityGroupName(`value`: String) {
    unwrap(this).setCacheSecurityGroupName(`value`)
  }

  /**
   * Name of the EC2 Security Group to include in the authorization.
   */
  public open fun ec2SecurityGroupName(): String = unwrap(this).getEc2SecurityGroupName()

  /**
   * Name of the EC2 Security Group to include in the authorization.
   */
  public open fun ec2SecurityGroupName(`value`: String) {
    unwrap(this).setEc2SecurityGroupName(`value`)
  }

  /**
   * Specifies the Amazon Account ID of the owner of the EC2 security group specified in the
   * EC2SecurityGroupName property.
   */
  public open fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()

  /**
   * Specifies the Amazon Account ID of the owner of the EC2 security group specified in the
   * EC2SecurityGroupName property.
   */
  public open fun ec2SecurityGroupOwnerId(`value`: String) {
    unwrap(this).setEc2SecurityGroupOwnerId(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticache.CfnSecurityGroupIngress].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Cache Security Group to authorize.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-cachesecuritygroupname)
     * @param cacheSecurityGroupName The name of the Cache Security Group to authorize. 
     */
    public fun cacheSecurityGroupName(cacheSecurityGroupName: String)

    /**
     * Name of the EC2 Security Group to include in the authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupname)
     * @param ec2SecurityGroupName Name of the EC2 Security Group to include in the authorization. 
     */
    public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

    /**
     * Specifies the Amazon Account ID of the owner of the EC2 security group specified in the
     * EC2SecurityGroupName property.
     *
     * The Amazon access key ID is not an acceptable value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupownerid)
     * @param ec2SecurityGroupOwnerId Specifies the Amazon Account ID of the owner of the EC2
     * security group specified in the EC2SecurityGroupName property. 
     */
    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress.Builder =
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress.Builder.create(scope,
        id)

    /**
     * The name of the Cache Security Group to authorize.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-cachesecuritygroupname)
     * @param cacheSecurityGroupName The name of the Cache Security Group to authorize. 
     */
    override fun cacheSecurityGroupName(cacheSecurityGroupName: String) {
      cdkBuilder.cacheSecurityGroupName(cacheSecurityGroupName)
    }

    /**
     * Name of the EC2 Security Group to include in the authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupname)
     * @param ec2SecurityGroupName Name of the EC2 Security Group to include in the authorization. 
     */
    override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
      cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    /**
     * Specifies the Amazon Account ID of the owner of the EC2 security group specified in the
     * EC2SecurityGroupName property.
     *
     * The Amazon access key ID is not an acceptable value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupownerid)
     * @param ec2SecurityGroupOwnerId Specifies the Amazon Account ID of the owner of the EC2
     * security group specified in the EC2SecurityGroupName property. 
     */
    override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
      cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityGroupIngress {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityGroupIngress(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress):
        CfnSecurityGroupIngress = CfnSecurityGroupIngress(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupIngress):
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress = wrapped.cdkObject as
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress
  }
}
