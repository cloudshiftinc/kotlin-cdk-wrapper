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
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEndpointConfigDataCaptureConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.DataCaptureConfigProperty.Builder =
        CfnEndpointConfig.DataCaptureConfigProperty.builder()

    private val _captureOptions: MutableList<Any> = mutableListOf()

    public fun captureContentTypeHeader(captureContentTypeHeader: IResolvable) {
        cdkBuilder.captureContentTypeHeader(captureContentTypeHeader)
    }

    public fun captureContentTypeHeader(captureContentTypeHeader: CfnEndpointConfig.CaptureContentTypeHeaderProperty) {
        cdkBuilder.captureContentTypeHeader(captureContentTypeHeader)
    }

    public fun captureOptions(vararg captureOptions: Any) {
        _captureOptions.addAll(listOf(*captureOptions))
    }

    public fun captureOptions(captureOptions: Collection<Any>) {
        _captureOptions.addAll(captureOptions)
    }

    public fun captureOptions(captureOptions: IResolvable) {
        cdkBuilder.captureOptions(captureOptions)
    }

    public fun destinationS3Uri(destinationS3Uri: String) {
        cdkBuilder.destinationS3Uri(destinationS3Uri)
    }

    public fun enableCapture(enableCapture: Boolean) {
        cdkBuilder.enableCapture(enableCapture)
    }

    public fun enableCapture(enableCapture: IResolvable) {
        cdkBuilder.enableCapture(enableCapture)
    }

    public fun initialSamplingPercentage(initialSamplingPercentage: Number) {
        cdkBuilder.initialSamplingPercentage(initialSamplingPercentage)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun build(): CfnEndpointConfig.DataCaptureConfigProperty {
        if (_captureOptions.isNotEmpty()) cdkBuilder.captureOptions(_captureOptions)
        return cdkBuilder.build()
    }
}
