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
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps

/**
 * Properties for defining a `CfnNetworkInterfacePermission`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNetworkInterfacePermissionProps cfnNetworkInterfacePermissionProps =
 * CfnNetworkInterfacePermissionProps.builder()
 * .awsAccountId("awsAccountId")
 * .networkInterfaceId("networkInterfaceId")
 * .permission("permission")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html)
 */
@CdkDslMarker
public class CfnNetworkInterfacePermissionPropsDsl {
    private val cdkBuilder: CfnNetworkInterfacePermissionProps.Builder =
        CfnNetworkInterfacePermissionProps.builder()

    /** @param awsAccountId The AWS account ID. */
    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /** @param networkInterfaceId The ID of the network interface. */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /** @param permission The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` . */
    public fun permission(permission: String) {
        cdkBuilder.permission(permission)
    }

    public fun build(): CfnNetworkInterfacePermissionProps = cdkBuilder.build()
}
