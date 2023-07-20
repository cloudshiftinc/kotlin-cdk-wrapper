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
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnInferenceExperimentCaptureContentTypeHeaderPropertyDsl {
    private val cdkBuilder: CfnInferenceExperiment.CaptureContentTypeHeaderProperty.Builder =
        CfnInferenceExperiment.CaptureContentTypeHeaderProperty.builder()

    private val _csvContentTypes: MutableList<String> = mutableListOf()

    private val _jsonContentTypes: MutableList<String> = mutableListOf()

    public fun csvContentTypes(vararg csvContentTypes: String) {
        _csvContentTypes.addAll(listOf(*csvContentTypes))
    }

    public fun csvContentTypes(csvContentTypes: Collection<String>) {
        _csvContentTypes.addAll(csvContentTypes)
    }

    public fun jsonContentTypes(vararg jsonContentTypes: String) {
        _jsonContentTypes.addAll(listOf(*jsonContentTypes))
    }

    public fun jsonContentTypes(jsonContentTypes: Collection<String>) {
        _jsonContentTypes.addAll(jsonContentTypes)
    }

    public fun build(): CfnInferenceExperiment.CaptureContentTypeHeaderProperty {
        if (_csvContentTypes.isNotEmpty()) cdkBuilder.csvContentTypes(_csvContentTypes)
        if (_jsonContentTypes.isNotEmpty()) cdkBuilder.jsonContentTypes(_jsonContentTypes)
        return cdkBuilder.build()
    }
}
