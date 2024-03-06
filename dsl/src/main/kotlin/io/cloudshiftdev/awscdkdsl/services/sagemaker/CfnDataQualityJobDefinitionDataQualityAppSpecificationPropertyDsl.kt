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
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

/**
 * Information about the container that a data quality monitoring job runs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DataQualityAppSpecificationProperty dataQualityAppSpecificationProperty =
 * DataQualityAppSpecificationProperty.builder()
 * .imageUri("imageUri")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-dataqualityappspecification.html)
 */
@CdkDslMarker
public class CfnDataQualityJobDefinitionDataQualityAppSpecificationPropertyDsl {
    private val cdkBuilder:
        CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.Builder =
        CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.builder()

    private val _containerArguments: MutableList<String> = mutableListOf()

    private val _containerEntrypoint: MutableList<String> = mutableListOf()

    /**
     * @param containerArguments The arguments to send to the container that the monitoring job
     *   runs.
     */
    public fun containerArguments(vararg containerArguments: String) {
        _containerArguments.addAll(listOf(*containerArguments))
    }

    /**
     * @param containerArguments The arguments to send to the container that the monitoring job
     *   runs.
     */
    public fun containerArguments(containerArguments: Collection<String>) {
        _containerArguments.addAll(containerArguments)
    }

    /** @param containerEntrypoint The entrypoint for a container used to run a monitoring job. */
    public fun containerEntrypoint(vararg containerEntrypoint: String) {
        _containerEntrypoint.addAll(listOf(*containerEntrypoint))
    }

    /** @param containerEntrypoint The entrypoint for a container used to run a monitoring job. */
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

    /** @param imageUri The container image that the data quality monitoring job runs. */
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
     * @param recordPreprocessorSourceUri An Amazon S3 URI to a script that is called per row prior
     *   to running analysis. It can base64 decode the payload and convert it into a flattened JSON
     *   so that the built-in container can use the converted data. Applicable only for the built-in
     *   (first party) containers.
     */
    public fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String) {
        cdkBuilder.recordPreprocessorSourceUri(recordPreprocessorSourceUri)
    }

    public fun build(): CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty {
        if (_containerArguments.isNotEmpty()) cdkBuilder.containerArguments(_containerArguments)
        if (_containerEntrypoint.isNotEmpty()) cdkBuilder.containerEntrypoint(_containerEntrypoint)
        return cdkBuilder.build()
    }
}
