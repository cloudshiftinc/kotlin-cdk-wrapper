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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Defines how to perform inference generation after a training job is run.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object modelInput;
 * InferenceSpecificationProperty inferenceSpecificationProperty =
 * InferenceSpecificationProperty.builder()
 * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .containerHostname("containerHostname")
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .framework("framework")
 * .frameworkVersion("frameworkVersion")
 * .imageDigest("imageDigest")
 * .modelDataUrl("modelDataUrl")
 * .modelInput(modelInput)
 * .nearestModelName("nearestModelName")
 * .build()))
 * .supportedContentTypes(List.of("supportedContentTypes"))
 * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
 * // the properties below are optional
 * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
 * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-inferencespecification.html)
 */
@CdkDslMarker
public class CfnModelPackageInferenceSpecificationPropertyDsl {
    private val cdkBuilder: CfnModelPackage.InferenceSpecificationProperty.Builder =
        CfnModelPackage.InferenceSpecificationProperty.builder()

    private val _containers: MutableList<Any> = mutableListOf()

    private val _supportedContentTypes: MutableList<String> = mutableListOf()

    private val _supportedRealtimeInferenceInstanceTypes: MutableList<String> = mutableListOf()

    private val _supportedResponseMimeTypes: MutableList<String> = mutableListOf()

    private val _supportedTransformInstanceTypes: MutableList<String> = mutableListOf()

    /**
     * @param containers The Amazon ECR registry path of the Docker image that contains the
     *   inference code.
     */
    public fun containers(vararg containers: Any) {
        _containers.addAll(listOf(*containers))
    }

    /**
     * @param containers The Amazon ECR registry path of the Docker image that contains the
     *   inference code.
     */
    public fun containers(containers: Collection<Any>) {
        _containers.addAll(containers)
    }

    /**
     * @param containers The Amazon ECR registry path of the Docker image that contains the
     *   inference code.
     */
    public fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers)
    }

    /** @param supportedContentTypes The supported MIME types for the input data. */
    public fun supportedContentTypes(vararg supportedContentTypes: String) {
        _supportedContentTypes.addAll(listOf(*supportedContentTypes))
    }

    /** @param supportedContentTypes The supported MIME types for the input data. */
    public fun supportedContentTypes(supportedContentTypes: Collection<String>) {
        _supportedContentTypes.addAll(supportedContentTypes)
    }

    /**
     * @param supportedRealtimeInferenceInstanceTypes A list of the instance types that are used to
     *   generate inferences in real-time. This parameter is required for unversioned models, and
     *   optional for versioned models.
     */
    public fun supportedRealtimeInferenceInstanceTypes(
        vararg supportedRealtimeInferenceInstanceTypes: String
    ) {
        _supportedRealtimeInferenceInstanceTypes.addAll(
            listOf(*supportedRealtimeInferenceInstanceTypes)
        )
    }

    /**
     * @param supportedRealtimeInferenceInstanceTypes A list of the instance types that are used to
     *   generate inferences in real-time. This parameter is required for unversioned models, and
     *   optional for versioned models.
     */
    public fun supportedRealtimeInferenceInstanceTypes(
        supportedRealtimeInferenceInstanceTypes: Collection<String>
    ) {
        _supportedRealtimeInferenceInstanceTypes.addAll(supportedRealtimeInferenceInstanceTypes)
    }

    /** @param supportedResponseMimeTypes The supported MIME types for the output data. */
    public fun supportedResponseMimeTypes(vararg supportedResponseMimeTypes: String) {
        _supportedResponseMimeTypes.addAll(listOf(*supportedResponseMimeTypes))
    }

    /** @param supportedResponseMimeTypes The supported MIME types for the output data. */
    public fun supportedResponseMimeTypes(supportedResponseMimeTypes: Collection<String>) {
        _supportedResponseMimeTypes.addAll(supportedResponseMimeTypes)
    }

    /**
     * @param supportedTransformInstanceTypes A list of the instance types on which a transformation
     *   job can be run or on which an endpoint can be deployed. This parameter is required for
     *   unversioned models, and optional for versioned models.
     */
    public fun supportedTransformInstanceTypes(vararg supportedTransformInstanceTypes: String) {
        _supportedTransformInstanceTypes.addAll(listOf(*supportedTransformInstanceTypes))
    }

    /**
     * @param supportedTransformInstanceTypes A list of the instance types on which a transformation
     *   job can be run or on which an endpoint can be deployed. This parameter is required for
     *   unversioned models, and optional for versioned models.
     */
    public fun supportedTransformInstanceTypes(
        supportedTransformInstanceTypes: Collection<String>
    ) {
        _supportedTransformInstanceTypes.addAll(supportedTransformInstanceTypes)
    }

    public fun build(): CfnModelPackage.InferenceSpecificationProperty {
        if (_containers.isNotEmpty()) cdkBuilder.containers(_containers)
        if (_supportedContentTypes.isNotEmpty())
            cdkBuilder.supportedContentTypes(_supportedContentTypes)
        if (_supportedRealtimeInferenceInstanceTypes.isNotEmpty())
            cdkBuilder.supportedRealtimeInferenceInstanceTypes(
                _supportedRealtimeInferenceInstanceTypes
            )
        if (_supportedResponseMimeTypes.isNotEmpty())
            cdkBuilder.supportedResponseMimeTypes(_supportedResponseMimeTypes)
        if (_supportedTransformInstanceTypes.isNotEmpty())
            cdkBuilder.supportedTransformInstanceTypes(_supportedTransformInstanceTypes)
        return cdkBuilder.build()
    }
}
