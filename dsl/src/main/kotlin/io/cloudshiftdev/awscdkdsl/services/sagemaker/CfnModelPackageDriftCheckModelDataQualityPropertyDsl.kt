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
 * Represents the drift check data quality baselines that can be used when the model monitor is set
 * using the model package.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DriftCheckModelDataQualityProperty driftCheckModelDataQualityProperty =
 * DriftCheckModelDataQualityProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodeldataquality.html)
 */
@CdkDslMarker
public class CfnModelPackageDriftCheckModelDataQualityPropertyDsl {
    private val cdkBuilder: CfnModelPackage.DriftCheckModelDataQualityProperty.Builder =
        CfnModelPackage.DriftCheckModelDataQualityProperty.builder()

    /** @param constraints The drift check model data quality constraints. */
    public fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints)
    }

    /** @param constraints The drift check model data quality constraints. */
    public fun constraints(constraints: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.constraints(constraints)
    }

    /** @param statistics The drift check model data quality statistics. */
    public fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics)
    }

    /** @param statistics The drift check model data quality statistics. */
    public fun statistics(statistics: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.statistics(statistics)
    }

    public fun build(): CfnModelPackage.DriftCheckModelDataQualityProperty = cdkBuilder.build()
}
