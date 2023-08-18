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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig

/**
 * A destination for events that failed processing.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * OnFailureProperty onFailureProperty = OnFailureProperty.builder()
 * .destination("destination")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-onfailure.html)
 */
@CdkDslMarker
public class CfnEventInvokeConfigOnFailurePropertyDsl {
    private val cdkBuilder: CfnEventInvokeConfig.OnFailureProperty.Builder =
        CfnEventInvokeConfig.OnFailureProperty.builder()

    /** @param destination The Amazon Resource Name (ARN) of the destination resource. */
    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    public fun build(): CfnEventInvokeConfig.OnFailureProperty = cdkBuilder.build()
}
