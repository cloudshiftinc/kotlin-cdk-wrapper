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

package io.cloudshiftdev.awscdkdsl.services.appstream

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps

/**
 * Properties for defining a `CfnApplicationEntitlementAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnApplicationEntitlementAssociationProps cfnApplicationEntitlementAssociationProps =
 * CfnApplicationEntitlementAssociationProps.builder()
 * .applicationIdentifier("applicationIdentifier")
 * .entitlementName("entitlementName")
 * .stackName("stackName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html)
 */
@CdkDslMarker
public class CfnApplicationEntitlementAssociationPropsDsl {
    private val cdkBuilder: CfnApplicationEntitlementAssociationProps.Builder =
        CfnApplicationEntitlementAssociationProps.builder()

    /** @param applicationIdentifier The identifier of the application. */
    public fun applicationIdentifier(applicationIdentifier: String) {
        cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    /** @param entitlementName The name of the entitlement. */
    public fun entitlementName(entitlementName: String) {
        cdkBuilder.entitlementName(entitlementName)
    }

    /** @param stackName The name of the stack. */
    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    public fun build(): CfnApplicationEntitlementAssociationProps = cdkBuilder.build()
}
