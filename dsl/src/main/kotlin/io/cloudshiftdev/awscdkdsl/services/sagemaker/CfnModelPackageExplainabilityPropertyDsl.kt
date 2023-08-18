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
 * Contains explainability metrics for a model.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ExplainabilityProperty explainabilityProperty = ExplainabilityProperty.builder()
 * .report(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-explainability.html)
 */
@CdkDslMarker
public class CfnModelPackageExplainabilityPropertyDsl {
    private val cdkBuilder: CfnModelPackage.ExplainabilityProperty.Builder =
        CfnModelPackage.ExplainabilityProperty.builder()

    /** @param report The explainability report for a model. */
    public fun report(report: IResolvable) {
        cdkBuilder.report(report)
    }

    /** @param report The explainability report for a model. */
    public fun report(report: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.report(report)
    }

    public fun build(): CfnModelPackage.ExplainabilityProperty = cdkBuilder.build()
}
