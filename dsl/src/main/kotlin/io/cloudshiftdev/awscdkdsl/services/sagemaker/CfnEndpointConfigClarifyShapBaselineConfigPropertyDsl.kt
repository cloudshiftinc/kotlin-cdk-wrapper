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
 * The configuration for the
 * [SHAP baseline](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-feature-attribute-shap-baselines.html)
 * (also called the background or reference dataset) of the Kernal SHAP algorithm.
 * * The number of records in the baseline data determines the size of the synthetic dataset, which
 *   has an impact on latency of explainability requests. For more information, see the *Synthetic
 *   data* of
 *   [Configure and create an endpoint](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html)
 *   .
 * * `ShapBaseline` and `ShapBaselineUri` are mutually exclusive parameters. One or the either is
 *   required to configure a SHAP baseline.
 *
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

    /**
     * @param mimeType The MIME type of the baseline data. Choose from `'text/csv'` or
     *   `'application/jsonlines'` . Defaults to `'text/csv'` .
     */
    public fun mimeType(mimeType: String) {
        cdkBuilder.mimeType(mimeType)
    }

    /**
     * @param shapBaseline The inline SHAP baseline data in string format. `ShapBaseline` can have
     *   one or multiple records to be used as the baseline dataset. The format of the SHAP baseline
     *   file should be the same format as the training dataset. For example, if the training
     *   dataset is in CSV format and each record contains four features, and all features are
     *   numerical, then the format of the baseline data should also share these characteristics.
     *   For natural language processing (NLP) of text columns, the baseline value should be the
     *   value used to replace the unit of text specified by the `Granularity` of the `TextConfig`
     *   parameter. The size limit for `ShapBasline` is 4 KB. Use the `ShapBaselineUri` parameter if
     *   you want to provide more than 4 KB of baseline data.
     */
    public fun shapBaseline(shapBaseline: String) {
        cdkBuilder.shapBaseline(shapBaseline)
    }

    /**
     * @param shapBaselineUri The uniform resource identifier (URI) of the S3 bucket where the SHAP
     *   baseline file is stored. The format of the SHAP baseline file should be the same format as
     *   the format of the training dataset. For example, if the training dataset is in CSV format,
     *   and each record in the training dataset has four features, and all features are numerical,
     *   then the baseline file should also have this same format. Each record should contain only
     *   the features. If you are using a virtual private cloud (VPC), the `ShapBaselineUri` should
     *   be accessible to the VPC. For more information about setting up endpoints with Amazon
     *   Virtual Private Cloud, see
     *   [Give SageMaker access to Resources in your Amazon Virtual Private Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html)
     *   .
     */
    public fun shapBaselineUri(shapBaselineUri: String) {
        cdkBuilder.shapBaselineUri(shapBaselineUri)
    }

    public fun build(): CfnEndpointConfig.ClarifyShapBaselineConfigProperty = cdkBuilder.build()
}
