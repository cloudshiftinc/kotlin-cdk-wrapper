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
 * Represents the drift check model quality baselines that can be used when the model monitor is set
 * using the model package.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DriftCheckModelQualityProperty driftCheckModelQualityProperty =
 * DriftCheckModelQualityProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodelquality.html)
 */
@CdkDslMarker
public class CfnModelPackageDriftCheckModelQualityPropertyDsl {
    private val cdkBuilder: CfnModelPackage.DriftCheckModelQualityProperty.Builder =
        CfnModelPackage.DriftCheckModelQualityProperty.builder()

    /** @param constraints The drift check model quality constraints. */
    public fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints)
    }

    /** @param constraints The drift check model quality constraints. */
    public fun constraints(constraints: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.constraints(constraints)
    }

    /** @param statistics The drift check model quality statistics. */
    public fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics)
    }

    /** @param statistics The drift check model quality statistics. */
    public fun statistics(statistics: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.statistics(statistics)
    }

    public fun build(): CfnModelPackage.DriftCheckModelQualityProperty = cdkBuilder.build()
}
