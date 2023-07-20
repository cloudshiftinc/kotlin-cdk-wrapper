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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnApplicationEntitlementAssociationPropsDsl {
    private val cdkBuilder: CfnApplicationEntitlementAssociationProps.Builder =
        CfnApplicationEntitlementAssociationProps.builder()

    public fun applicationIdentifier(applicationIdentifier: String) {
        cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    public fun entitlementName(entitlementName: String) {
        cdkBuilder.entitlementName(entitlementName)
    }

    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    public fun build(): CfnApplicationEntitlementAssociationProps = cdkBuilder.build()
}
