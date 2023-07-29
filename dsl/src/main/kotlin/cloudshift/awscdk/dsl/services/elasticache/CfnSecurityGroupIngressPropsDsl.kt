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
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps

/**
 * Properties for defining a `CfnSecurityGroupIngress`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
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
@CdkDslMarker
public class CfnSecurityGroupIngressPropsDsl {
    private val cdkBuilder: CfnSecurityGroupIngressProps.Builder =
        CfnSecurityGroupIngressProps.builder()

    /** @param cacheSecurityGroupName The name of the Cache Security Group to authorize. */
    public fun cacheSecurityGroupName(cacheSecurityGroupName: String) {
        cdkBuilder.cacheSecurityGroupName(cacheSecurityGroupName)
    }

    /**
     * @param ec2SecurityGroupName Name of the EC2 Security Group to include in the authorization.
     */
    public fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
        cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    /**
     * @param ec2SecurityGroupOwnerId Specifies the Amazon Account ID of the owner of the EC2
     *   security group specified in the EC2SecurityGroupName property. The Amazon access key ID is
     *   not an acceptable value.
     */
    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
        cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): CfnSecurityGroupIngressProps = cdkBuilder.build()
}
