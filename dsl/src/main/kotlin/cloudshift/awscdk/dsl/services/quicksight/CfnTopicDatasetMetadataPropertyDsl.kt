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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTopicDatasetMetadataPropertyDsl {
    private val cdkBuilder: CfnTopic.DatasetMetadataProperty.Builder =
        CfnTopic.DatasetMetadataProperty.builder()

    private val _calculatedFields: MutableList<Any> = mutableListOf()

    private val _columns: MutableList<Any> = mutableListOf()

    private val _filters: MutableList<Any> = mutableListOf()

    private val _namedEntities: MutableList<Any> = mutableListOf()

    public fun calculatedFields(vararg calculatedFields: Any) {
        _calculatedFields.addAll(listOf(*calculatedFields))
    }

    public fun calculatedFields(calculatedFields: Collection<Any>) {
        _calculatedFields.addAll(calculatedFields)
    }

    public fun calculatedFields(calculatedFields: IResolvable) {
        cdkBuilder.calculatedFields(calculatedFields)
    }

    public fun columns(vararg columns: Any) {
        _columns.addAll(listOf(*columns))
    }

    public fun columns(columns: Collection<Any>) {
        _columns.addAll(columns)
    }

    public fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns)
    }

    public fun dataAggregation(dataAggregation: IResolvable) {
        cdkBuilder.dataAggregation(dataAggregation)
    }

    public fun dataAggregation(dataAggregation: CfnTopic.DataAggregationProperty) {
        cdkBuilder.dataAggregation(dataAggregation)
    }

    public fun datasetArn(datasetArn: String) {
        cdkBuilder.datasetArn(datasetArn)
    }

    public fun datasetDescription(datasetDescription: String) {
        cdkBuilder.datasetDescription(datasetDescription)
    }

    public fun datasetName(datasetName: String) {
        cdkBuilder.datasetName(datasetName)
    }

    public fun filters(vararg filters: Any) {
        _filters.addAll(listOf(*filters))
    }

    public fun filters(filters: Collection<Any>) {
        _filters.addAll(filters)
    }

    public fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters)
    }

    public fun namedEntities(vararg namedEntities: Any) {
        _namedEntities.addAll(listOf(*namedEntities))
    }

    public fun namedEntities(namedEntities: Collection<Any>) {
        _namedEntities.addAll(namedEntities)
    }

    public fun namedEntities(namedEntities: IResolvable) {
        cdkBuilder.namedEntities(namedEntities)
    }

    public fun build(): CfnTopic.DatasetMetadataProperty {
        if (_calculatedFields.isNotEmpty()) cdkBuilder.calculatedFields(_calculatedFields)
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        if (_namedEntities.isNotEmpty()) cdkBuilder.namedEntities(_namedEntities)
        return cdkBuilder.build()
    }
}
