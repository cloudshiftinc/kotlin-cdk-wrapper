package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityGroupIngress internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress,
) : CfnResource(cdkObject), IInspectable {
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
    init {

    }

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
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress = wrapped.cdkObject
  }
}
