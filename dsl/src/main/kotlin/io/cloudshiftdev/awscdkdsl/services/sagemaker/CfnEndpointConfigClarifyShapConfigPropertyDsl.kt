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
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ClarifyShapConfigProperty clarifyShapConfigProperty = ClarifyShapConfigProperty.builder()
 * .shapBaselineConfig(ClarifyShapBaselineConfigProperty.builder()
 * .mimeType("mimeType")
 * .shapBaseline("shapBaseline")
 * .shapBaselineUri("shapBaselineUri")
 * .build())
 * // the properties below are optional
 * .numberOfSamples(123)
 * .seed(123)
 * .textConfig(ClarifyTextConfigProperty.builder()
 * .granularity("granularity")
 * .language("language")
 * .build())
 * .useLogit(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigClarifyShapConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.ClarifyShapConfigProperty.Builder =
        CfnEndpointConfig.ClarifyShapConfigProperty.builder()

    /** @param numberOfSamples the value to be set. */
    public fun numberOfSamples(numberOfSamples: Number) {
        cdkBuilder.numberOfSamples(numberOfSamples)
    }

    /** @param seed the value to be set. */
    public fun seed(seed: Number) {
        cdkBuilder.seed(seed)
    }

    /** @param shapBaselineConfig the value to be set. */
    public fun shapBaselineConfig(shapBaselineConfig: IResolvable) {
        cdkBuilder.shapBaselineConfig(shapBaselineConfig)
    }

    /** @param shapBaselineConfig the value to be set. */
    public fun shapBaselineConfig(
        shapBaselineConfig: CfnEndpointConfig.ClarifyShapBaselineConfigProperty
    ) {
        cdkBuilder.shapBaselineConfig(shapBaselineConfig)
    }

    /** @param textConfig the value to be set. */
    public fun textConfig(textConfig: IResolvable) {
        cdkBuilder.textConfig(textConfig)
    }

    /** @param textConfig the value to be set. */
    public fun textConfig(textConfig: CfnEndpointConfig.ClarifyTextConfigProperty) {
        cdkBuilder.textConfig(textConfig)
    }

    /** @param useLogit the value to be set. */
    public fun useLogit(useLogit: Boolean) {
        cdkBuilder.useLogit(useLogit)
    }

    /** @param useLogit the value to be set. */
    public fun useLogit(useLogit: IResolvable) {
        cdkBuilder.useLogit(useLogit)
    }

    public fun build(): CfnEndpointConfig.ClarifyShapConfigProperty = cdkBuilder.build()
}
