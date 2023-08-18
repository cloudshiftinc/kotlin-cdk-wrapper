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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when Amplitude is being used as a source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * AmplitudeSourcePropertiesProperty amplitudeSourcePropertiesProperty =
 * AmplitudeSourcePropertiesProperty.builder()
 * .object("object")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-amplitudesourceproperties.html)
 */
@CdkDslMarker
public class CfnFlowAmplitudeSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.AmplitudeSourcePropertiesProperty.Builder =
        CfnFlow.AmplitudeSourcePropertiesProperty.builder()

    /** @param object The object specified in the Amplitude flow source. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.AmplitudeSourcePropertiesProperty = cdkBuilder.build()
}
