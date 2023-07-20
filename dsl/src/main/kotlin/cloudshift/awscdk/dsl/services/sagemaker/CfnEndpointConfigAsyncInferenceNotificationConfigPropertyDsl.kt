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
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEndpointConfigAsyncInferenceNotificationConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.AsyncInferenceNotificationConfigProperty.Builder =
        CfnEndpointConfig.AsyncInferenceNotificationConfigProperty.builder()

    private val _includeInferenceResponseIn: MutableList<String> = mutableListOf()

    public fun errorTopic(errorTopic: String) {
        cdkBuilder.errorTopic(errorTopic)
    }

    public fun includeInferenceResponseIn(vararg includeInferenceResponseIn: String) {
        _includeInferenceResponseIn.addAll(listOf(*includeInferenceResponseIn))
    }

    public fun includeInferenceResponseIn(includeInferenceResponseIn: Collection<String>) {
        _includeInferenceResponseIn.addAll(includeInferenceResponseIn)
    }

    public fun successTopic(successTopic: String) {
        cdkBuilder.successTopic(successTopic)
    }

    public fun build(): CfnEndpointConfig.AsyncInferenceNotificationConfigProperty {
        if (_includeInferenceResponseIn.isNotEmpty()) {
            cdkBuilder.includeInferenceResponseIn(_includeInferenceResponseIn)
        }
        return cdkBuilder.build()
    }
}
