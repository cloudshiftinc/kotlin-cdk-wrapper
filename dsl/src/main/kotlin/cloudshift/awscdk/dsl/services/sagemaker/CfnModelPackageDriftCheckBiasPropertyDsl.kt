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
 * Represents the drift check bias baselines that can be used when the model monitor is set using
 * the model package.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DriftCheckBiasProperty driftCheckBiasProperty = DriftCheckBiasProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbias.html)
 */
@CdkDslMarker
public class CfnModelPackageDriftCheckBiasPropertyDsl {
    private val cdkBuilder: CfnModelPackage.DriftCheckBiasProperty.Builder =
        CfnModelPackage.DriftCheckBiasProperty.builder()

    /** @param configFile The bias config file for a model. */
    public fun configFile(configFile: IResolvable) {
        cdkBuilder.configFile(configFile)
    }

    /** @param configFile The bias config file for a model. */
    public fun configFile(configFile: CfnModelPackage.FileSourceProperty) {
        cdkBuilder.configFile(configFile)
    }

    /** @param postTrainingConstraints The post-training constraints. */
    public fun postTrainingConstraints(postTrainingConstraints: IResolvable) {
        cdkBuilder.postTrainingConstraints(postTrainingConstraints)
    }

    /** @param postTrainingConstraints The post-training constraints. */
    public fun postTrainingConstraints(
        postTrainingConstraints: CfnModelPackage.MetricsSourceProperty
    ) {
        cdkBuilder.postTrainingConstraints(postTrainingConstraints)
    }

    /** @param preTrainingConstraints The pre-training constraints. */
    public fun preTrainingConstraints(preTrainingConstraints: IResolvable) {
        cdkBuilder.preTrainingConstraints(preTrainingConstraints)
    }

    /** @param preTrainingConstraints The pre-training constraints. */
    public fun preTrainingConstraints(
        preTrainingConstraints: CfnModelPackage.MetricsSourceProperty
    ) {
        cdkBuilder.preTrainingConstraints(preTrainingConstraints)
    }

    public fun build(): CfnModelPackage.DriftCheckBiasProperty = cdkBuilder.build()
}
