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
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation
import software.constructs.Construct

/**
 * This resource associates the specified application with the specified fleet.
 *
 * This is only supported for Elastic fleets.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnApplicationFleetAssociation cfnApplicationFleetAssociation =
 * CfnApplicationFleetAssociation.Builder.create(this, "MyCfnApplicationFleetAssociation")
 * .applicationArn("applicationArn")
 * .fleetName("fleetName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html)
 */
@CdkDslMarker
public class CfnApplicationFleetAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplicationFleetAssociation.Builder =
        CfnApplicationFleetAssociation.Builder.create(scope, id)

    /**
     * The ARN of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html#cfn-appstream-applicationfleetassociation-applicationarn)
     *
     * @param applicationArn The ARN of the application.
     */
    public fun applicationArn(applicationArn: String) {
        cdkBuilder.applicationArn(applicationArn)
    }

    /**
     * The name of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html#cfn-appstream-applicationfleetassociation-fleetname)
     *
     * @param fleetName The name of the fleet.
     */
    public fun fleetName(fleetName: String) {
        cdkBuilder.fleetName(fleetName)
    }

    public fun build(): CfnApplicationFleetAssociation = cdkBuilder.build()
}
