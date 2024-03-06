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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * The configuration parameters for the SageMaker Clarify explainer.
 *
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

    /**
     * @param enableExplanations A JMESPath boolean expression used to filter which records to
     *   explain. Explanations are activated by default. See
     *   [`EnableExplanations`](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-enable)
     *   for additional information.
     */
    public fun enableExplanations(enableExplanations: String) {
        cdkBuilder.enableExplanations(enableExplanations)
    }

    /** @param inferenceConfig The inference configuration parameter for the model container. */
    public fun inferenceConfig(inferenceConfig: IResolvable) {
        cdkBuilder.inferenceConfig(inferenceConfig)
    }

    /** @param inferenceConfig The inference configuration parameter for the model container. */
    public fun inferenceConfig(inferenceConfig: CfnEndpointConfig.ClarifyInferenceConfigProperty) {
        cdkBuilder.inferenceConfig(inferenceConfig)
    }

    /** @param shapConfig The configuration for SHAP analysis. */
    public fun shapConfig(shapConfig: IResolvable) {
        cdkBuilder.shapConfig(shapConfig)
    }

    /** @param shapConfig The configuration for SHAP analysis. */
    public fun shapConfig(shapConfig: CfnEndpointConfig.ClarifyShapConfigProperty) {
        cdkBuilder.shapConfig(shapConfig)
    }

    public fun build(): CfnEndpointConfig.ClarifyExplainerConfigProperty = cdkBuilder.build()
}
