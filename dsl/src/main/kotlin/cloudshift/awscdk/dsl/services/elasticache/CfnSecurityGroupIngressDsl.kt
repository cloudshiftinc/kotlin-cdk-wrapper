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

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress
import software.constructs.Construct

/**
 * The AWS::ElastiCache::SecurityGroupIngress type authorizes ingress to a cache security group from
 * hosts in specified Amazon EC2 security groups.
 *
 * For more information about ElastiCache security group ingress, go to
 * [AuthorizeCacheSecurityGroupIngress](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_AuthorizeCacheSecurityGroupIngress.html)
 * in the *Amazon ElastiCache API Reference Guide* .
 *
 * Updates are not supported.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
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
@CdkDslMarker
public class CfnSecurityGroupIngressDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSecurityGroupIngress.Builder =
        CfnSecurityGroupIngress.Builder.create(scope, id)

    /**
     * The name of the Cache Security Group to authorize.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-cachesecuritygroupname)
     *
     * @param cacheSecurityGroupName The name of the Cache Security Group to authorize.
     */
    public fun cacheSecurityGroupName(cacheSecurityGroupName: String) {
        cdkBuilder.cacheSecurityGroupName(cacheSecurityGroupName)
    }

    /**
     * Name of the EC2 Security Group to include in the authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupname)
     *
     * @param ec2SecurityGroupName Name of the EC2 Security Group to include in the authorization.
     */
    public fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
        cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    /**
     * Specifies the Amazon Account ID of the owner of the EC2 security group specified in the
     * EC2SecurityGroupName property.
     *
     * The Amazon access key ID is not an acceptable value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroupingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupownerid)
     *
     * @param ec2SecurityGroupOwnerId Specifies the Amazon Account ID of the owner of the EC2
     *   security group specified in the EC2SecurityGroupName property.
     */
    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
        cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): CfnSecurityGroupIngress = cdkBuilder.build()
}
