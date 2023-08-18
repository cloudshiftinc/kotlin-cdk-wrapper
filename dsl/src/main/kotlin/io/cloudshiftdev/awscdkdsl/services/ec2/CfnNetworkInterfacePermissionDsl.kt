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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission
import software.constructs.Construct

/**
 * Specifies a permission for an Amazon EC2 network interface.
 *
 * For example, you can grant an AWS authorized partner account permission to attach the specified
 * network interface to an instance in their account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNetworkInterfacePermission cfnNetworkInterfacePermission =
 * CfnNetworkInterfacePermission.Builder.create(this, "MyCfnNetworkInterfacePermission")
 * .awsAccountId("awsAccountId")
 * .networkInterfaceId("networkInterfaceId")
 * .permission("permission")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html)
 */
@CdkDslMarker
public class CfnNetworkInterfacePermissionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNetworkInterfacePermission.Builder =
        CfnNetworkInterfacePermission.Builder.create(scope, id)

    /**
     * The AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-awsaccountid)
     *
     * @param awsAccountId The AWS account ID.
     */
    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * The ID of the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-networkinterfaceid)
     *
     * @param networkInterfaceId The ID of the network interface.
     */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-permission)
     *
     * @param permission The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` .
     */
    public fun permission(permission: String) {
        cdkBuilder.permission(permission)
    }

    public fun build(): CfnNetworkInterfacePermission = cdkBuilder.build()
}
