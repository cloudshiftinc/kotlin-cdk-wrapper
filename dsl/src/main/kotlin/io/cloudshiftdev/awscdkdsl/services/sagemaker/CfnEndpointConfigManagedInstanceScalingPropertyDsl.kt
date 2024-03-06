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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ManagedInstanceScalingProperty managedInstanceScalingProperty =
 * ManagedInstanceScalingProperty.builder()
 * .maxInstanceCount(123)
 * .minInstanceCount(123)
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-managedinstancescaling.html)
 */
@CdkDslMarker
public class CfnEndpointConfigManagedInstanceScalingPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.ManagedInstanceScalingProperty.Builder =
        CfnEndpointConfig.ManagedInstanceScalingProperty.builder()

    /** @param maxInstanceCount the value to be set. */
    public fun maxInstanceCount(maxInstanceCount: Number) {
        cdkBuilder.maxInstanceCount(maxInstanceCount)
    }

    /** @param minInstanceCount the value to be set. */
    public fun minInstanceCount(minInstanceCount: Number) {
        cdkBuilder.minInstanceCount(minInstanceCount)
    }

    /** @param status the value to be set. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnEndpointConfig.ManagedInstanceScalingProperty = cdkBuilder.build()
}
