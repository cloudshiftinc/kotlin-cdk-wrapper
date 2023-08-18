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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig

/**
 * A configuration object that specifies the destination of an event after Lambda processes it.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * DestinationConfigProperty destinationConfigProperty = DestinationConfigProperty.builder()
 * .onFailure(OnFailureProperty.builder()
 * .destination("destination")
 * .build())
 * .onSuccess(OnSuccessProperty.builder()
 * .destination("destination")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig.html)
 */
@CdkDslMarker
public class CfnEventInvokeConfigDestinationConfigPropertyDsl {
    private val cdkBuilder: CfnEventInvokeConfig.DestinationConfigProperty.Builder =
        CfnEventInvokeConfig.DestinationConfigProperty.builder()

    /** @param onFailure The destination configuration for failed invocations. */
    public fun onFailure(onFailure: IResolvable) {
        cdkBuilder.onFailure(onFailure)
    }

    /** @param onFailure The destination configuration for failed invocations. */
    public fun onFailure(onFailure: CfnEventInvokeConfig.OnFailureProperty) {
        cdkBuilder.onFailure(onFailure)
    }

    /** @param onSuccess The destination configuration for successful invocations. */
    public fun onSuccess(onSuccess: IResolvable) {
        cdkBuilder.onSuccess(onSuccess)
    }

    /** @param onSuccess The destination configuration for successful invocations. */
    public fun onSuccess(onSuccess: CfnEventInvokeConfig.OnSuccessProperty) {
        cdkBuilder.onSuccess(onSuccess)
    }

    public fun build(): CfnEventInvokeConfig.DestinationConfigProperty = cdkBuilder.build()
}
