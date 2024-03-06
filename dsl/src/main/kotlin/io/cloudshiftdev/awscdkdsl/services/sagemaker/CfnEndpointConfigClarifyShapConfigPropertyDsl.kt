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
 * The configuration for SHAP analysis using SageMaker Clarify Explainer.
 *
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

    /**
     * @param numberOfSamples The number of samples to be used for analysis by the Kernal SHAP
     *   algorithm.
     *
     * The number of samples determines the size of the synthetic dataset, which has an impact on
     * latency of explainability requests. For more information, see the *Synthetic data* of
     * [Configure and create an endpoint](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html)
     * .
     */
    public fun numberOfSamples(numberOfSamples: Number) {
        cdkBuilder.numberOfSamples(numberOfSamples)
    }

    /**
     * @param seed The starting value used to initialize the random number generator in the
     *   explainer. Provide a value for this parameter to obtain a deterministic SHAP result.
     */
    public fun seed(seed: Number) {
        cdkBuilder.seed(seed)
    }

    /**
     * @param shapBaselineConfig The configuration for the SHAP baseline of the Kernal SHAP
     *   algorithm.
     */
    public fun shapBaselineConfig(shapBaselineConfig: IResolvable) {
        cdkBuilder.shapBaselineConfig(shapBaselineConfig)
    }

    /**
     * @param shapBaselineConfig The configuration for the SHAP baseline of the Kernal SHAP
     *   algorithm.
     */
    public fun shapBaselineConfig(
        shapBaselineConfig: CfnEndpointConfig.ClarifyShapBaselineConfigProperty
    ) {
        cdkBuilder.shapBaselineConfig(shapBaselineConfig)
    }

    /**
     * @param textConfig A parameter that indicates if text features are treated as text and
     *   explanations are provided for individual units of text. Required for natural language
     *   processing (NLP) explainability only.
     */
    public fun textConfig(textConfig: IResolvable) {
        cdkBuilder.textConfig(textConfig)
    }

    /**
     * @param textConfig A parameter that indicates if text features are treated as text and
     *   explanations are provided for individual units of text. Required for natural language
     *   processing (NLP) explainability only.
     */
    public fun textConfig(textConfig: CfnEndpointConfig.ClarifyTextConfigProperty) {
        cdkBuilder.textConfig(textConfig)
    }

    /**
     * @param useLogit A Boolean toggle to indicate if you want to use the logit function (true) or
     *   log-odds units (false) for model predictions. Defaults to false.
     */
    public fun useLogit(useLogit: Boolean) {
        cdkBuilder.useLogit(useLogit)
    }

    /**
     * @param useLogit A Boolean toggle to indicate if you want to use the logit function (true) or
     *   log-odds units (false) for model predictions. Defaults to false.
     */
    public fun useLogit(useLogit: IResolvable) {
        cdkBuilder.useLogit(useLogit)
    }

    public fun build(): CfnEndpointConfig.ClarifyShapConfigProperty = cdkBuilder.build()
}
