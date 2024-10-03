@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSecurityGroupIngress`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * CfnSecurityGroupIngressProps cfnSecurityGroupIngressProps =
 * CfnSecurityGroupIngressProps.builder()
 * .cacheSecurityGroupName("cacheSecurityGroupName")
 * .ec2SecurityGroupName("ec2SecurityGroupName")
 * // the properties below are optional
 * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html)
 */
public interface CfnSecurityGroupIngressProps {
  /**
   * The name of the Cache Security Group to authorize.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-cachesecuritygroupname)
   */
  public fun cacheSecurityGroupName(): String

  /**
   * Name of the EC2 Security Group to include in the authorization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupname)
   */
  public fun ec2SecurityGroupName(): String

  /**
   * Specifies the Amazon Account ID of the owner of the EC2 security group specified in the
   * EC2SecurityGroupName property.
   *
   * The Amazon access key ID is not an acceptable value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupownerid)
   */
  public fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()

  /**
   * A builder for [CfnSecurityGroupIngressProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cacheSecurityGroupName The name of the Cache Security Group to authorize. 
     */
    public fun cacheSecurityGroupName(cacheSecurityGroupName: String)

    /**
     * @param ec2SecurityGroupName Name of the EC2 Security Group to include in the authorization. 
     */
    public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

    /**
     * @param ec2SecurityGroupOwnerId Specifies the Amazon Account ID of the owner of the EC2
     * security group specified in the EC2SecurityGroupName property.
     * The Amazon access key ID is not an acceptable value.
     */
    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.builder()

    /**
     * @param cacheSecurityGroupName The name of the Cache Security Group to authorize. 
     */
    override fun cacheSecurityGroupName(cacheSecurityGroupName: String) {
      cdkBuilder.cacheSecurityGroupName(cacheSecurityGroupName)
    }

    /**
     * @param ec2SecurityGroupName Name of the EC2 Security Group to include in the authorization. 
     */
    override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
      cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    /**
     * @param ec2SecurityGroupOwnerId Specifies the Amazon Account ID of the owner of the EC2
     * security group specified in the EC2SecurityGroupName property.
     * The Amazon access key ID is not an acceptable value.
     */
    override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
      cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps,
  ) : CdkObject(cdkObject),
      CfnSecurityGroupIngressProps {
    /**
     * The name of the Cache Security Group to authorize.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-cachesecuritygroupname)
     */
    override fun cacheSecurityGroupName(): String = unwrap(this).getCacheSecurityGroupName()

    /**
     * Name of the EC2 Security Group to include in the authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupname)
     */
    override fun ec2SecurityGroupName(): String = unwrap(this).getEc2SecurityGroupName()

    /**
     * Specifies the Amazon Account ID of the owner of the EC2 security group specified in the
     * EC2SecurityGroupName property.
     *
     * The Amazon access key ID is not an acceptable value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupownerid)
     */
    override fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityGroupIngressProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps):
        CfnSecurityGroupIngressProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSecurityGroupIngressProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupIngressProps):
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps
  }
}
