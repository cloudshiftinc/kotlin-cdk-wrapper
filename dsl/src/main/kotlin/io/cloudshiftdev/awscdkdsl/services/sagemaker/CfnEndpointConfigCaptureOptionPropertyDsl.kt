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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Specifies whether the endpoint captures input data or output data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CaptureOptionProperty captureOptionProperty = CaptureOptionProperty.builder()
 * .captureMode("captureMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-captureoption.html)
 */
@CdkDslMarker
public class CfnEndpointConfigCaptureOptionPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.CaptureOptionProperty.Builder =
        CfnEndpointConfig.CaptureOptionProperty.builder()

    /** @param captureMode Specifies whether the endpoint captures input data or output data. */
    public fun captureMode(captureMode: String) {
        cdkBuilder.captureMode(captureMode)
    }

    public fun build(): CfnEndpointConfig.CaptureOptionProperty = cdkBuilder.build()
}
