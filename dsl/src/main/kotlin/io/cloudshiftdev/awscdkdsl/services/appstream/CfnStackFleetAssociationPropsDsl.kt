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
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps

/**
 * Properties for defining a `CfnStackFleetAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnStackFleetAssociationProps cfnStackFleetAssociationProps =
 * CfnStackFleetAssociationProps.builder()
 * .fleetName("fleetName")
 * .stackName("stackName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html)
 */
@CdkDslMarker
public class CfnStackFleetAssociationPropsDsl {
    private val cdkBuilder: CfnStackFleetAssociationProps.Builder =
        CfnStackFleetAssociationProps.builder()

    /**
     * @param fleetName The name of the fleet. To associate a fleet with a stack, you must specify a
     *   dependency on the fleet resource. For more information, see
     *   [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     *   .
     */
    public fun fleetName(fleetName: String) {
        cdkBuilder.fleetName(fleetName)
    }

    /**
     * @param stackName The name of the stack. To associate a fleet with a stack, you must specify a
     *   dependency on the stack resource. For more information, see
     *   [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     *   .
     */
    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    public fun build(): CfnStackFleetAssociationProps = cdkBuilder.build()
}
