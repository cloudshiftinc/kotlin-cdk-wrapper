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
 * Contains bias metrics for a model.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * BiasProperty biasProperty = BiasProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-bias.html)
 */
@CdkDslMarker
public class CfnModelPackageBiasPropertyDsl {
    private val cdkBuilder: CfnModelPackage.BiasProperty.Builder =
        CfnModelPackage.BiasProperty.builder()

    /** @param postTrainingReport The post-training bias report for a model. */
    public fun postTrainingReport(postTrainingReport: IResolvable) {
        cdkBuilder.postTrainingReport(postTrainingReport)
    }

    /** @param postTrainingReport The post-training bias report for a model. */
    public fun postTrainingReport(postTrainingReport: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.postTrainingReport(postTrainingReport)
    }

    /** @param preTrainingReport The pre-training bias report for a model. */
    public fun preTrainingReport(preTrainingReport: IResolvable) {
        cdkBuilder.preTrainingReport(preTrainingReport)
    }

    /** @param preTrainingReport The pre-training bias report for a model. */
    public fun preTrainingReport(preTrainingReport: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.preTrainingReport(preTrainingReport)
    }

    /** @param report The bias report for a model. */
    public fun report(report: IResolvable) {
        cdkBuilder.report(report)
    }

    /** @param report The bias report for a model. */
    public fun report(report: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.report(report)
    }

    public fun build(): CfnModelPackage.BiasProperty = cdkBuilder.build()
}
