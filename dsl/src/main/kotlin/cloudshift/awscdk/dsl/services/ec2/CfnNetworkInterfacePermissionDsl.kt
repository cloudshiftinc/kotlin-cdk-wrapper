@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnNetworkInterfacePermissionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNetworkInterfacePermission.Builder =
        CfnNetworkInterfacePermission.Builder.create(scope, id)

    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun permission(permission: String) {
        cdkBuilder.permission(permission)
    }

    public fun build(): CfnNetworkInterfacePermission = cdkBuilder.build()
}
