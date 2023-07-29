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
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * SourceAlgorithmProperty sourceAlgorithmProperty = SourceAlgorithmProperty.builder()
 * .algorithmName("algorithmName")
 * // the properties below are optional
 * .modelDataUrl("modelDataUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-sourcealgorithm.html)
 */
@CdkDslMarker
public class CfnModelCardSourceAlgorithmPropertyDsl {
    private val cdkBuilder: CfnModelCard.SourceAlgorithmProperty.Builder =
        CfnModelCard.SourceAlgorithmProperty.builder()

    /**
     * @param algorithmName The name of an algorithm that was used to create the model package. The
     *   algorithm must be either an algorithm resource in your SageMaker account or an algorithm in
     *   AWS Marketplace that you are subscribed to.
     */
    public fun algorithmName(algorithmName: String) {
        cdkBuilder.algorithmName(algorithmName)
    }

    /**
     * @param modelDataUrl The Amazon S3 path where the model artifacts, which result from model
     *   training, are stored.
     */
    public fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
    }

    public fun build(): CfnModelCard.SourceAlgorithmProperty = cdkBuilder.build()
}
