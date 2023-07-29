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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation
import software.constructs.Construct

/**
 * Associates an application to an entitlement.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnApplicationEntitlementAssociation cfnApplicationEntitlementAssociation =
 * CfnApplicationEntitlementAssociation.Builder.create(this, "MyCfnApplicationEntitlementAssociation")
 * .applicationIdentifier("applicationIdentifier")
 * .entitlementName("entitlementName")
 * .stackName("stackName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html)
 */
@CdkDslMarker
public class CfnApplicationEntitlementAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplicationEntitlementAssociation.Builder =
        CfnApplicationEntitlementAssociation.Builder.create(scope, id)

    /**
     * The identifier of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-applicationidentifier)
     *
     * @param applicationIdentifier The identifier of the application.
     */
    public fun applicationIdentifier(applicationIdentifier: String) {
        cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    /**
     * The name of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-entitlementname)
     *
     * @param entitlementName The name of the entitlement.
     */
    public fun entitlementName(entitlementName: String) {
        cdkBuilder.entitlementName(entitlementName)
    }

    /**
     * The name of the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-stackname)
     *
     * @param stackName The name of the stack.
     */
    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    public fun build(): CfnApplicationEntitlementAssociation = cdkBuilder.build()
}
