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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

/**
 * Container image configuration object for the monitoring job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelQualityAppSpecificationProperty modelQualityAppSpecificationProperty =
 * ModelQualityAppSpecificationProperty.builder()
 * .imageUri("imageUri")
 * .problemType("problemType")
 * // the properties below are optional
 * .containerArguments(List.of("containerArguments"))
 * .containerEntrypoint(List.of("containerEntrypoint"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
 * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html)
 */
@CdkDslMarker
public class CfnModelQualityJobDefinitionModelQualityAppSpecificationPropertyDsl {
    private val cdkBuilder:
        CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty.Builder =
        CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty.builder()

    private val _containerArguments: MutableList<String> = mutableListOf()

    private val _containerEntrypoint: MutableList<String> = mutableListOf()

    /**
     * @param containerArguments An array of arguments for the container used to run the monitoring
     *   job.
     */
    public fun containerArguments(vararg containerArguments: String) {
        _containerArguments.addAll(listOf(*containerArguments))
    }

    /**
     * @param containerArguments An array of arguments for the container used to run the monitoring
     *   job.
     */
    public fun containerArguments(containerArguments: Collection<String>) {
        _containerArguments.addAll(containerArguments)
    }

    /**
     * @param containerEntrypoint Specifies the entrypoint for a container that the monitoring job
     *   runs.
     */
    public fun containerEntrypoint(vararg containerEntrypoint: String) {
        _containerEntrypoint.addAll(listOf(*containerEntrypoint))
    }

    /**
     * @param containerEntrypoint Specifies the entrypoint for a container that the monitoring job
     *   runs.
     */
    public fun containerEntrypoint(containerEntrypoint: Collection<String>) {
        _containerEntrypoint.addAll(containerEntrypoint)
    }

    /**
     * @param environment Sets the environment variables in the container that the monitoring job
     *   runs.
     */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param environment Sets the environment variables in the container that the monitoring job
     *   runs.
     */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /** @param imageUri The address of the container image that the monitoring job runs. */
    public fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
    }

    /**
     * @param postAnalyticsProcessorSourceUri An Amazon S3 URI to a script that is called after
     *   analysis has been performed. Applicable only for the built-in (first party) containers.
     */
    public fun postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri: String) {
        cdkBuilder.postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri)
    }

    /**
     * @param problemType The machine learning problem type of the model that the monitoring job
     *   monitors.
     */
    public fun problemType(problemType: String) {
        cdkBuilder.problemType(problemType)
    }

    /**
     * @param recordPreprocessorSourceUri An Amazon S3 URI to a script that is called per row prior
     *   to running analysis. It can base64 decode the payload and convert it into a flattened JSON
     *   so that the built-in container can use the converted data. Applicable only for the built-in
     *   (first party) containers.
     */
    public fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String) {
        cdkBuilder.recordPreprocessorSourceUri(recordPreprocessorSourceUri)
    }

    public fun build(): CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty {
        if (_containerArguments.isNotEmpty()) cdkBuilder.containerArguments(_containerArguments)
        if (_containerEntrypoint.isNotEmpty()) cdkBuilder.containerEntrypoint(_containerEntrypoint)
        return cdkBuilder.build()
    }
}
