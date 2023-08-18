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
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ClarifyShapBaselineConfigProperty clarifyShapBaselineConfigProperty =
 * ClarifyShapBaselineConfigProperty.builder()
 * .mimeType("mimeType")
 * .shapBaseline("shapBaseline")
 * .shapBaselineUri("shapBaselineUri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapbaselineconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigClarifyShapBaselineConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.ClarifyShapBaselineConfigProperty.Builder =
        CfnEndpointConfig.ClarifyShapBaselineConfigProperty.builder()

    /** @param mimeType the value to be set. */
    public fun mimeType(mimeType: String) {
        cdkBuilder.mimeType(mimeType)
    }

    /** @param shapBaseline the value to be set. */
    public fun shapBaseline(shapBaseline: String) {
        cdkBuilder.shapBaseline(shapBaseline)
    }

    /** @param shapBaselineUri the value to be set. */
    public fun shapBaselineUri(shapBaselineUri: String) {
        cdkBuilder.shapBaselineUri(shapBaselineUri)
    }

    public fun build(): CfnEndpointConfig.ClarifyShapBaselineConfigProperty = cdkBuilder.build()
}
