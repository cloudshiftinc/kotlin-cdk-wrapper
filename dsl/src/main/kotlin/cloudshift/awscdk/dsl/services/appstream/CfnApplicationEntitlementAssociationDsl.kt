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
import software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnApplicationEntitlementAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplicationEntitlementAssociation.Builder =
        CfnApplicationEntitlementAssociation.Builder.create(scope, id)

    public fun applicationIdentifier(applicationIdentifier: String) {
        cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    public fun entitlementName(entitlementName: String) {
        cdkBuilder.entitlementName(entitlementName)
    }

    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    public fun build(): CfnApplicationEntitlementAssociation = cdkBuilder.build()
}
