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
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnModelPackageInferenceSpecificationPropertyDsl {
    private val cdkBuilder: CfnModelPackage.InferenceSpecificationProperty.Builder =
        CfnModelPackage.InferenceSpecificationProperty.builder()

    private val _containers: MutableList<Any> = mutableListOf()

    private val _supportedContentTypes: MutableList<String> = mutableListOf()

    private val _supportedRealtimeInferenceInstanceTypes: MutableList<String> = mutableListOf()

    private val _supportedResponseMimeTypes: MutableList<String> = mutableListOf()

    private val _supportedTransformInstanceTypes: MutableList<String> = mutableListOf()

    public fun containers(vararg containers: Any) {
        _containers.addAll(listOf(*containers))
    }

    public fun containers(containers: Collection<Any>) {
        _containers.addAll(containers)
    }

    public fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers)
    }

    public fun supportedContentTypes(vararg supportedContentTypes: String) {
        _supportedContentTypes.addAll(listOf(*supportedContentTypes))
    }

    public fun supportedContentTypes(supportedContentTypes: Collection<String>) {
        _supportedContentTypes.addAll(supportedContentTypes)
    }

    public fun supportedRealtimeInferenceInstanceTypes(
        vararg supportedRealtimeInferenceInstanceTypes: String,
    ) {
        _supportedRealtimeInferenceInstanceTypes.addAll(listOf(*supportedRealtimeInferenceInstanceTypes))
    }

    public fun supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes: Collection<String>) {
        _supportedRealtimeInferenceInstanceTypes.addAll(supportedRealtimeInferenceInstanceTypes)
    }

    public fun supportedResponseMimeTypes(vararg supportedResponseMimeTypes: String) {
        _supportedResponseMimeTypes.addAll(listOf(*supportedResponseMimeTypes))
    }

    public fun supportedResponseMimeTypes(supportedResponseMimeTypes: Collection<String>) {
        _supportedResponseMimeTypes.addAll(supportedResponseMimeTypes)
    }

    public fun supportedTransformInstanceTypes(vararg supportedTransformInstanceTypes: String) {
        _supportedTransformInstanceTypes.addAll(listOf(*supportedTransformInstanceTypes))
    }

    public fun supportedTransformInstanceTypes(supportedTransformInstanceTypes: Collection<String>) {
        _supportedTransformInstanceTypes.addAll(supportedTransformInstanceTypes)
    }

    public fun build(): CfnModelPackage.InferenceSpecificationProperty {
        if (_containers.isNotEmpty()) cdkBuilder.containers(_containers)
        if (_supportedContentTypes.isNotEmpty()) cdkBuilder.supportedContentTypes(_supportedContentTypes)
        if (_supportedRealtimeInferenceInstanceTypes.isNotEmpty()) {
            cdkBuilder.supportedRealtimeInferenceInstanceTypes(_supportedRealtimeInferenceInstanceTypes)
        }
        if (_supportedResponseMimeTypes.isNotEmpty()) {
            cdkBuilder.supportedResponseMimeTypes(_supportedResponseMimeTypes)
        }
        if (_supportedTransformInstanceTypes.isNotEmpty()) {
            cdkBuilder.supportedTransformInstanceTypes(_supportedTransformInstanceTypes)
        }
        return cdkBuilder.build()
    }
}
