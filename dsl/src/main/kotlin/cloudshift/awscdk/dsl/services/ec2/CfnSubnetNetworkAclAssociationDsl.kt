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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation
import software.constructs.Construct

/**
 * Associates a subnet with a network ACL. For more information, see
 * [ReplaceNetworkAclAssociation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-ReplaceNetworkAclAssociation.html)
 * in the *Amazon EC2 API Reference* .
 *
 * When `AWS::EC2::SubnetNetworkAclAssociation` resources are created during create or update
 * operations, AWS CloudFormation adopts existing resources that share the same key properties (the
 * properties that contribute to uniquely identify the resource). However, if the operation fails
 * and rolls back, AWS CloudFormation deletes the previously out-of-band resources. You can protect
 * against this behavior by using `Retain` deletion policies. For more information, see
 * [DeletionPolicy Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnSubnetNetworkAclAssociation cfnSubnetNetworkAclAssociation =
 * CfnSubnetNetworkAclAssociation.Builder.create(this, "MyCfnSubnetNetworkAclAssociation")
 * .networkAclId("networkAclId")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html)
 */
@CdkDslMarker
public class CfnSubnetNetworkAclAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSubnetNetworkAclAssociation.Builder =
        CfnSubnetNetworkAclAssociation.Builder.create(scope, id)

    /**
     * The ID of the network ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-networkaclid)
     *
     * @param networkAclId The ID of the network ACL.
     */
    public fun networkAclId(networkAclId: String) {
        cdkBuilder.networkAclId(networkAclId)
    }

    /**
     * The ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-subnetid)
     *
     * @param subnetId The ID of the subnet.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnSubnetNetworkAclAssociation = cdkBuilder.build()
}
