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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * DestinationProperty destinationProperty = DestinationProperty.builder()
 * .destination("destination")
 * // the properties below are optional
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-destination.html)
 */
@CdkDslMarker
public class CfnFunctionDestinationPropertyDsl {
    private val cdkBuilder: CfnFunction.DestinationProperty.Builder =
        CfnFunction.DestinationProperty.builder()

    /** @param destination the value to be set. */
    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    /** @param type the value to be set. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnFunction.DestinationProperty = cdkBuilder.build()
}
