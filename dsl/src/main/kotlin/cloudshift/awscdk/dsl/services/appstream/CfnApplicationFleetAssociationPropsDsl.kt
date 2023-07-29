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
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps

/**
 * Properties for defining a `CfnApplicationFleetAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnApplicationFleetAssociationProps cfnApplicationFleetAssociationProps =
 * CfnApplicationFleetAssociationProps.builder()
 * .applicationArn("applicationArn")
 * .fleetName("fleetName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html)
 */
@CdkDslMarker
public class CfnApplicationFleetAssociationPropsDsl {
    private val cdkBuilder: CfnApplicationFleetAssociationProps.Builder =
        CfnApplicationFleetAssociationProps.builder()

    /** @param applicationArn The ARN of the application. */
    public fun applicationArn(applicationArn: String) {
        cdkBuilder.applicationArn(applicationArn)
    }

    /** @param fleetName The name of the fleet. */
    public fun fleetName(fleetName: String) {
        cdkBuilder.fleetName(fleetName)
    }

    public fun build(): CfnApplicationFleetAssociationProps = cdkBuilder.build()
}
