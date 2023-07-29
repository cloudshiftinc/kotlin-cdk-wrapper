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
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * Additional information about the model.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * AdditionalInformationProperty additionalInformationProperty =
 * AdditionalInformationProperty.builder()
 * .caveatsAndRecommendations("caveatsAndRecommendations")
 * .customDetails(Map.of(
 * "customDetailsKey", "customDetails"))
 * .ethicalConsiderations("ethicalConsiderations")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-additionalinformation.html)
 */
@CdkDslMarker
public class CfnModelCardAdditionalInformationPropertyDsl {
    private val cdkBuilder: CfnModelCard.AdditionalInformationProperty.Builder =
        CfnModelCard.AdditionalInformationProperty.builder()

    /**
     * @param caveatsAndRecommendations Caveats and recommendations for those who might use this
     *   model in their applications.
     */
    public fun caveatsAndRecommendations(caveatsAndRecommendations: String) {
        cdkBuilder.caveatsAndRecommendations(caveatsAndRecommendations)
    }

    /** @param customDetails Any additional information to document about the model. */
    public fun customDetails(customDetails: Map<String, String>) {
        cdkBuilder.customDetails(customDetails)
    }

    /** @param customDetails Any additional information to document about the model. */
    public fun customDetails(customDetails: IResolvable) {
        cdkBuilder.customDetails(customDetails)
    }

    /**
     * @param ethicalConsiderations Any ethical considerations documented by the model card author.
     */
    public fun ethicalConsiderations(ethicalConsiderations: String) {
        cdkBuilder.ethicalConsiderations(ethicalConsiderations)
    }

    public fun build(): CfnModelCard.AdditionalInformationProperty = cdkBuilder.build()
}
