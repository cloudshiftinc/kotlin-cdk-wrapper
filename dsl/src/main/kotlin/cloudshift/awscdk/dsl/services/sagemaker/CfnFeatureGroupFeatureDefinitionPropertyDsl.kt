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
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup
import kotlin.String

@CdkDslMarker
public class CfnFeatureGroupFeatureDefinitionPropertyDsl {
    private val cdkBuilder: CfnFeatureGroup.FeatureDefinitionProperty.Builder =
        CfnFeatureGroup.FeatureDefinitionProperty.builder()

    public fun featureName(featureName: String) {
        cdkBuilder.featureName(featureName)
    }

    public fun featureType(featureType: String) {
        cdkBuilder.featureType(featureType)
    }

    public fun build(): CfnFeatureGroup.FeatureDefinitionProperty = cdkBuilder.build()
}
