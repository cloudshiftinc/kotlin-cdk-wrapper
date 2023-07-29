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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ClarifyExplainerConfigProperty clarifyExplainerConfigProperty =
 * ClarifyExplainerConfigProperty.builder()
 * .shapConfig(ClarifyShapConfigProperty.builder()
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
 * .build())
 * // the properties below are optional
 * .enableExplanations("enableExplanations")
 * .inferenceConfig(ClarifyInferenceConfigProperty.builder()
 * .contentTemplate("contentTemplate")
 * .featureHeaders(List.of("featureHeaders"))
 * .featuresAttribute("featuresAttribute")
 * .featureTypes(List.of("featureTypes"))
 * .labelAttribute("labelAttribute")
 * .labelHeaders(List.of("labelHeaders"))
 * .labelIndex(123)
 * .maxPayloadInMb(123)
 * .maxRecordCount(123)
 * .probabilityAttribute("probabilityAttribute")
 * .probabilityIndex(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyexplainerconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigClarifyExplainerConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.ClarifyExplainerConfigProperty.Builder =
        CfnEndpointConfig.ClarifyExplainerConfigProperty.builder()

    /** @param enableExplanations the value to be set. */
    public fun enableExplanations(enableExplanations: String) {
        cdkBuilder.enableExplanations(enableExplanations)
    }

    /** @param inferenceConfig the value to be set. */
    public fun inferenceConfig(inferenceConfig: IResolvable) {
        cdkBuilder.inferenceConfig(inferenceConfig)
    }

    /** @param inferenceConfig the value to be set. */
    public fun inferenceConfig(inferenceConfig: CfnEndpointConfig.ClarifyInferenceConfigProperty) {
        cdkBuilder.inferenceConfig(inferenceConfig)
    }

    /** @param shapConfig the value to be set. */
    public fun shapConfig(shapConfig: IResolvable) {
        cdkBuilder.shapConfig(shapConfig)
    }

    /** @param shapConfig the value to be set. */
    public fun shapConfig(shapConfig: CfnEndpointConfig.ClarifyShapConfigProperty) {
        cdkBuilder.shapConfig(shapConfig)
    }

    public fun build(): CfnEndpointConfig.ClarifyExplainerConfigProperty = cdkBuilder.build()
}
