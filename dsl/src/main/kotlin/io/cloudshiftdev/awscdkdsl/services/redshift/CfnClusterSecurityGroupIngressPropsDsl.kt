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

package io.cloudshiftdev.awscdkdsl.services.redshift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps

/**
 * Properties for defining a `CfnClusterSecurityGroupIngress`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnClusterSecurityGroupIngressProps cfnClusterSecurityGroupIngressProps =
 * CfnClusterSecurityGroupIngressProps.builder()
 * .clusterSecurityGroupName("clusterSecurityGroupName")
 * // the properties below are optional
 * .cidrip("cidrip")
 * .ec2SecurityGroupName("ec2SecurityGroupName")
 * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html)
 */
@CdkDslMarker
public class CfnClusterSecurityGroupIngressPropsDsl {
    private val cdkBuilder: CfnClusterSecurityGroupIngressProps.Builder =
        CfnClusterSecurityGroupIngressProps.builder()

    /** @param cidrip The IP range to be added the Amazon Redshift security group. */
    public fun cidrip(cidrip: String) {
        cdkBuilder.cidrip(cidrip)
    }

    /**
     * @param clusterSecurityGroupName The name of the security group to which the ingress rule is
     *   added.
     */
    public fun clusterSecurityGroupName(clusterSecurityGroupName: String) {
        cdkBuilder.clusterSecurityGroupName(clusterSecurityGroupName)
    }

    /**
     * @param ec2SecurityGroupName The EC2 security group to be added the Amazon Redshift security
     *   group.
     */
    public fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
        cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    /**
     * @param ec2SecurityGroupOwnerId The AWS account number of the owner of the security group
     *   specified by the *EC2SecurityGroupName* parameter. The AWS Access Key ID is not an
     *   acceptable value.
     *
     * Example: `111122223333`
     *
     * Conditional. If you specify the `EC2SecurityGroupName` property, you must specify this
     * property.
     */
    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
        cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): CfnClusterSecurityGroupIngressProps = cdkBuilder.build()
}
