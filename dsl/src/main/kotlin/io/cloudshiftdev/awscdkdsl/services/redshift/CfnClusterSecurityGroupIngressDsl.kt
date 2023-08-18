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
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress
import software.constructs.Construct

/**
 * Adds an inbound (ingress) rule to an Amazon Redshift security group.
 *
 * Depending on whether the application accessing your cluster is running on the Internet or an
 * Amazon EC2 instance, you can authorize inbound access to either a Classless Interdomain Routing
 * (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group. You can add as many as 20
 * ingress rules to an Amazon Redshift security group.
 *
 * If you authorize access to an Amazon EC2 security group, specify *EC2SecurityGroupName* and
 * *EC2SecurityGroupOwnerId* . The Amazon EC2 security group and Amazon Redshift cluster must be in
 * the same AWS Region .
 *
 * If you authorize access to a CIDR/IP address range, specify *CIDRIP* . For an overview of CIDR
 * blocks, see the Wikipedia article on
 * [Classless Inter-Domain Routing](https://docs.aws.amazon.com/http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
 * .
 *
 * You must also associate the security group with a cluster so that clients running on these IP
 * addresses or the EC2 instance are authorized to connect to the cluster. For information about
 * managing security groups, go to
 * [Working with Security Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html)
 * in the *Amazon Redshift Cluster Management Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnClusterSecurityGroupIngress cfnClusterSecurityGroupIngress =
 * CfnClusterSecurityGroupIngress.Builder.create(this, "MyCfnClusterSecurityGroupIngress")
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
public class CfnClusterSecurityGroupIngressDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnClusterSecurityGroupIngress.Builder =
        CfnClusterSecurityGroupIngress.Builder.create(scope, id)

    /**
     * The IP range to be added the Amazon Redshift security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-cidrip)
     *
     * @param cidrip The IP range to be added the Amazon Redshift security group.
     */
    public fun cidrip(cidrip: String) {
        cdkBuilder.cidrip(cidrip)
    }

    /**
     * The name of the security group to which the ingress rule is added.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-clustersecuritygroupname)
     *
     * @param clusterSecurityGroupName The name of the security group to which the ingress rule is
     *   added.
     */
    public fun clusterSecurityGroupName(clusterSecurityGroupName: String) {
        cdkBuilder.clusterSecurityGroupName(clusterSecurityGroupName)
    }

    /**
     * The EC2 security group to be added the Amazon Redshift security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupname)
     *
     * @param ec2SecurityGroupName The EC2 security group to be added the Amazon Redshift security
     *   group.
     */
    public fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
        cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    /**
     * The AWS account number of the owner of the security group specified by the
     * *EC2SecurityGroupName* parameter.
     *
     * The AWS Access Key ID is not an acceptable value.
     *
     * Example: `111122223333`
     *
     * Conditional. If you specify the `EC2SecurityGroupName` property, you must specify this
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupownerid)
     *
     * @param ec2SecurityGroupOwnerId The AWS account number of the owner of the security group
     *   specified by the *EC2SecurityGroupName* parameter.
     */
    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
        cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): CfnClusterSecurityGroupIngress = cdkBuilder.build()
}
