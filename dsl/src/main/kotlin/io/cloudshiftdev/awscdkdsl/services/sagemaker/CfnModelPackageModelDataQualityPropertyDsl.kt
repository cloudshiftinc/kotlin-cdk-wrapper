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
 * Data quality constraints and statistics for a model.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelDataQualityProperty modelDataQualityProperty = ModelDataQualityProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modeldataquality.html)
 */
@CdkDslMarker
public class CfnModelPackageModelDataQualityPropertyDsl {
    private val cdkBuilder: CfnModelPackage.ModelDataQualityProperty.Builder =
        CfnModelPackage.ModelDataQualityProperty.builder()

    /** @param constraints Data quality constraints for a model. */
    public fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints)
    }

    /** @param constraints Data quality constraints for a model. */
    public fun constraints(constraints: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.constraints(constraints)
    }

    /** @param statistics Data quality statistics for a model. */
    public fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics)
    }

    /** @param statistics Data quality statistics for a model. */
    public fun statistics(statistics: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.statistics(statistics)
    }

    public fun build(): CfnModelPackage.ModelDataQualityProperty = cdkBuilder.build()
}
