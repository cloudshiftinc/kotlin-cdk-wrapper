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
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnModelCardInferenceEnvironmentPropertyDsl {
    private val cdkBuilder: CfnModelCard.InferenceEnvironmentProperty.Builder =
        CfnModelCard.InferenceEnvironmentProperty.builder()

    private val _containerImage: MutableList<String> = mutableListOf()

    public fun containerImage(vararg containerImage: String) {
        _containerImage.addAll(listOf(*containerImage))
    }

    public fun containerImage(containerImage: Collection<String>) {
        _containerImage.addAll(containerImage)
    }

    public fun build(): CfnModelCard.InferenceEnvironmentProperty {
        if (_containerImage.isNotEmpty()) cdkBuilder.containerImage(_containerImage)
        return cdkBuilder.build()
    }
}
