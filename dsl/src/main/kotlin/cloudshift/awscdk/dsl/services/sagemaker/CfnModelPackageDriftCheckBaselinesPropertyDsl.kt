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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Represents the drift check baselines that can be used when the model monitor is set using the
 * model package.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DriftCheckBaselinesProperty driftCheckBaselinesProperty = DriftCheckBaselinesProperty.builder()
 * .bias(DriftCheckBiasProperty.builder()
 * .configFile(FileSourceProperty.builder()
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .contentType("contentType")
 * .build())
 * .postTrainingConstraints(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .preTrainingConstraints(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .explainability(DriftCheckExplainabilityProperty.builder()
 * .configFile(FileSourceProperty.builder()
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .contentType("contentType")
 * .build())
 * .constraints(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build())
 * .modelDataQuality(DriftCheckModelDataQualityProperty.builder()
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
 * .modelQuality(DriftCheckModelQualityProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbaselines.html)
 */
@CdkDslMarker
public class CfnModelPackageDriftCheckBaselinesPropertyDsl {
    private val cdkBuilder: CfnModelPackage.DriftCheckBaselinesProperty.Builder =
        CfnModelPackage.DriftCheckBaselinesProperty.builder()

    /**
     * @param bias Represents the drift check bias baselines that can be used when the model monitor
     *   is set using the model package.
     */
    public fun bias(bias: IResolvable) {
        cdkBuilder.bias(bias)
    }

    /**
     * @param bias Represents the drift check bias baselines that can be used when the model monitor
     *   is set using the model package.
     */
    public fun bias(bias: CfnModelPackage.DriftCheckBiasProperty) {
        cdkBuilder.bias(bias)
    }

    /**
     * @param explainability Represents the drift check explainability baselines that can be used
     *   when the model monitor is set using the model package.
     */
    public fun explainability(explainability: IResolvable) {
        cdkBuilder.explainability(explainability)
    }

    /**
     * @param explainability Represents the drift check explainability baselines that can be used
     *   when the model monitor is set using the model package.
     */
    public fun explainability(explainability: CfnModelPackage.DriftCheckExplainabilityProperty) {
        cdkBuilder.explainability(explainability)
    }

    /**
     * @param modelDataQuality Represents the drift check model data quality baselines that can be
     *   used when the model monitor is set using the model package.
     */
    public fun modelDataQuality(modelDataQuality: IResolvable) {
        cdkBuilder.modelDataQuality(modelDataQuality)
    }

    /**
     * @param modelDataQuality Represents the drift check model data quality baselines that can be
     *   used when the model monitor is set using the model package.
     */
    public fun modelDataQuality(
        modelDataQuality: CfnModelPackage.DriftCheckModelDataQualityProperty
    ) {
        cdkBuilder.modelDataQuality(modelDataQuality)
    }

    /**
     * @param modelQuality Represents the drift check model quality baselines that can be used when
     *   the model monitor is set using the model package.
     */
    public fun modelQuality(modelQuality: IResolvable) {
        cdkBuilder.modelQuality(modelQuality)
    }

    /**
     * @param modelQuality Represents the drift check model quality baselines that can be used when
     *   the model monitor is set using the model package.
     */
    public fun modelQuality(modelQuality: CfnModelPackage.DriftCheckModelQualityProperty) {
        cdkBuilder.modelQuality(modelQuality)
    }

    public fun build(): CfnModelPackage.DriftCheckBaselinesProperty = cdkBuilder.build()
}
