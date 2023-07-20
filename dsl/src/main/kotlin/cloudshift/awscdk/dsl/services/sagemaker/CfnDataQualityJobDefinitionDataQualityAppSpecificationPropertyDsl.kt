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
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataQualityJobDefinitionDataQualityAppSpecificationPropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.Builder =
        CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.builder()

    private val _containerArguments: MutableList<String> = mutableListOf()

    private val _containerEntrypoint: MutableList<String> = mutableListOf()

    public fun containerArguments(vararg containerArguments: String) {
        _containerArguments.addAll(listOf(*containerArguments))
    }

    public fun containerArguments(containerArguments: Collection<String>) {
        _containerArguments.addAll(containerArguments)
    }

    public fun containerEntrypoint(vararg containerEntrypoint: String) {
        _containerEntrypoint.addAll(listOf(*containerEntrypoint))
    }

    public fun containerEntrypoint(containerEntrypoint: Collection<String>) {
        _containerEntrypoint.addAll(containerEntrypoint)
    }

    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    public fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
    }

    public fun postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri: String) {
        cdkBuilder.postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri)
    }

    public fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String) {
        cdkBuilder.recordPreprocessorSourceUri(recordPreprocessorSourceUri)
    }

    public fun build(): CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty {
        if (_containerArguments.isNotEmpty()) cdkBuilder.containerArguments(_containerArguments)
        if (_containerEntrypoint.isNotEmpty()) cdkBuilder.containerEntrypoint(_containerEntrypoint)
        return cdkBuilder.build()
    }
}
