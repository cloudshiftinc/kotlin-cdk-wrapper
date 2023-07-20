@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnModelCardAdditionalInformationPropertyDsl {
    private val cdkBuilder: CfnModelCard.AdditionalInformationProperty.Builder =
        CfnModelCard.AdditionalInformationProperty.builder()

    public fun caveatsAndRecommendations(caveatsAndRecommendations: String) {
        cdkBuilder.caveatsAndRecommendations(caveatsAndRecommendations)
    }

    public fun customDetails(customDetails: Map<String, String>) {
        cdkBuilder.customDetails(customDetails)
    }

    public fun customDetails(customDetails: IResolvable) {
        cdkBuilder.customDetails(customDetails)
    }

    public fun ethicalConsiderations(ethicalConsiderations: String) {
        cdkBuilder.ethicalConsiderations(ethicalConsiderations)
    }

    public fun build(): CfnModelCard.AdditionalInformationProperty = cdkBuilder.build()
}
