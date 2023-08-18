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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Contains metrics captured from a model.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelMetricsProperty modelMetricsProperty = ModelMetricsProperty.builder()
 * .bias(BiasProperty.builder()
 * .postTrainingReport(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .preTrainingReport(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .report(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .explainability(ExplainabilityProperty.builder()
 * .report(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .modelDataQuality(ModelDataQualityProperty.builder()
 * .constraints(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .statistics(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .modelQuality(ModelQualityProperty.builder()
 * .constraints(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .statistics(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelmetrics.html)
 */
@CdkDslMarker
public class CfnModelPackageModelMetricsPropertyDsl {
    private val cdkBuilder: CfnModelPackage.ModelMetricsProperty.Builder =
        CfnModelPackage.ModelMetricsProperty.builder()

    /** @param bias Metrics that measure bais in a model. */
    public fun bias(bias: IResolvable) {
        cdkBuilder.bias(bias)
    }

    /** @param bias Metrics that measure bais in a model. */
    public fun bias(bias: CfnModelPackage.BiasProperty) {
        cdkBuilder.bias(bias)
    }

    /** @param explainability Metrics that help explain a model. */
    public fun explainability(explainability: IResolvable) {
        cdkBuilder.explainability(explainability)
    }

    /** @param explainability Metrics that help explain a model. */
    public fun explainability(explainability: CfnModelPackage.ExplainabilityProperty) {
        cdkBuilder.explainability(explainability)
    }

    /** @param modelDataQuality Metrics that measure the quality of the input data for a model. */
    public fun modelDataQuality(modelDataQuality: IResolvable) {
        cdkBuilder.modelDataQuality(modelDataQuality)
    }

    /** @param modelDataQuality Metrics that measure the quality of the input data for a model. */
    public fun modelDataQuality(modelDataQuality: CfnModelPackage.ModelDataQualityProperty) {
        cdkBuilder.modelDataQuality(modelDataQuality)
    }

    /** @param modelQuality Metrics that measure the quality of a model. */
    public fun modelQuality(modelQuality: IResolvable) {
        cdkBuilder.modelQuality(modelQuality)
    }

    /** @param modelQuality Metrics that measure the quality of a model. */
    public fun modelQuality(modelQuality: CfnModelPackage.ModelQualityProperty) {
        cdkBuilder.modelQuality(modelQuality)
    }

    public fun build(): CfnModelPackage.ModelMetricsProperty = cdkBuilder.build()
}
