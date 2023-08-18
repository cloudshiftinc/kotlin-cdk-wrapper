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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * DestinationConfigProperty destinationConfigProperty = DestinationConfigProperty.builder()
 * .onFailure(DestinationProperty.builder()
 * .destination("destination")
 * // the properties below are optional
 * .type("type")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-destinationconfig.html)
 */
@CdkDslMarker
public class CfnFunctionDestinationConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.DestinationConfigProperty.Builder =
        CfnFunction.DestinationConfigProperty.builder()

    /** @param onFailure the value to be set. */
    public fun onFailure(onFailure: IResolvable) {
        cdkBuilder.onFailure(onFailure)
    }

    /** @param onFailure the value to be set. */
    public fun onFailure(onFailure: CfnFunction.DestinationProperty) {
        cdkBuilder.onFailure(onFailure)
    }

    public fun build(): CfnFunction.DestinationConfigProperty = cdkBuilder.build()
}
