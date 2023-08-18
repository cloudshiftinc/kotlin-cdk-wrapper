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
 * Model quality statistics and constraints.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelQualityProperty modelQualityProperty = ModelQualityProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelquality.html)
 */
@CdkDslMarker
public class CfnModelPackageModelQualityPropertyDsl {
    private val cdkBuilder: CfnModelPackage.ModelQualityProperty.Builder =
        CfnModelPackage.ModelQualityProperty.builder()

    /** @param constraints Model quality constraints. */
    public fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints)
    }

    /** @param constraints Model quality constraints. */
    public fun constraints(constraints: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.constraints(constraints)
    }

    /** @param statistics Model quality statistics. */
    public fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics)
    }

    /** @param statistics Model quality statistics. */
    public fun statistics(statistics: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.statistics(statistics)
    }

    public fun build(): CfnModelPackage.ModelQualityProperty = cdkBuilder.build()
}
