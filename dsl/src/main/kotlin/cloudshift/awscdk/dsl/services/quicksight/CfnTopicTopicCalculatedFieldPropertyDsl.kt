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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTopicTopicCalculatedFieldPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicCalculatedFieldProperty.Builder =
        CfnTopic.TopicCalculatedFieldProperty.builder()

    private val _allowedAggregations: MutableList<String> = mutableListOf()

    private val _calculatedFieldSynonyms: MutableList<String> = mutableListOf()

    private val _cellValueSynonyms: MutableList<Any> = mutableListOf()

    private val _notAllowedAggregations: MutableList<String> = mutableListOf()

    public fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
    }

    public fun allowedAggregations(vararg allowedAggregations: String) {
        _allowedAggregations.addAll(listOf(*allowedAggregations))
    }

    public fun allowedAggregations(allowedAggregations: Collection<String>) {
        _allowedAggregations.addAll(allowedAggregations)
    }

    public fun calculatedFieldDescription(calculatedFieldDescription: String) {
        cdkBuilder.calculatedFieldDescription(calculatedFieldDescription)
    }

    public fun calculatedFieldName(calculatedFieldName: String) {
        cdkBuilder.calculatedFieldName(calculatedFieldName)
    }

    public fun calculatedFieldSynonyms(vararg calculatedFieldSynonyms: String) {
        _calculatedFieldSynonyms.addAll(listOf(*calculatedFieldSynonyms))
    }

    public fun calculatedFieldSynonyms(calculatedFieldSynonyms: Collection<String>) {
        _calculatedFieldSynonyms.addAll(calculatedFieldSynonyms)
    }

    public fun cellValueSynonyms(vararg cellValueSynonyms: Any) {
        _cellValueSynonyms.addAll(listOf(*cellValueSynonyms))
    }

    public fun cellValueSynonyms(cellValueSynonyms: Collection<Any>) {
        _cellValueSynonyms.addAll(cellValueSynonyms)
    }

    public fun cellValueSynonyms(cellValueSynonyms: IResolvable) {
        cdkBuilder.cellValueSynonyms(cellValueSynonyms)
    }

    public fun columnDataRole(columnDataRole: String) {
        cdkBuilder.columnDataRole(columnDataRole)
    }

    public fun comparativeOrder(comparativeOrder: IResolvable) {
        cdkBuilder.comparativeOrder(comparativeOrder)
    }

    public fun comparativeOrder(comparativeOrder: CfnTopic.ComparativeOrderProperty) {
        cdkBuilder.comparativeOrder(comparativeOrder)
    }

    public fun defaultFormatting(defaultFormatting: IResolvable) {
        cdkBuilder.defaultFormatting(defaultFormatting)
    }

    public fun defaultFormatting(defaultFormatting: CfnTopic.DefaultFormattingProperty) {
        cdkBuilder.defaultFormatting(defaultFormatting)
    }

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun isIncludedInTopic(isIncludedInTopic: Boolean) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic)
    }

    public fun isIncludedInTopic(isIncludedInTopic: IResolvable) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic)
    }

    public fun neverAggregateInFilter(neverAggregateInFilter: Boolean) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter)
    }

    public fun neverAggregateInFilter(neverAggregateInFilter: IResolvable) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter)
    }

    public fun notAllowedAggregations(vararg notAllowedAggregations: String) {
        _notAllowedAggregations.addAll(listOf(*notAllowedAggregations))
    }

    public fun notAllowedAggregations(notAllowedAggregations: Collection<String>) {
        _notAllowedAggregations.addAll(notAllowedAggregations)
    }

    public fun semanticType(semanticType: IResolvable) {
        cdkBuilder.semanticType(semanticType)
    }

    public fun semanticType(semanticType: CfnTopic.SemanticTypeProperty) {
        cdkBuilder.semanticType(semanticType)
    }

    public fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
    }

    public fun build(): CfnTopic.TopicCalculatedFieldProperty {
        if (_allowedAggregations.isNotEmpty()) cdkBuilder.allowedAggregations(_allowedAggregations)
        if (_calculatedFieldSynonyms.isNotEmpty()) {
            cdkBuilder.calculatedFieldSynonyms(_calculatedFieldSynonyms)
        }
        if (_cellValueSynonyms.isNotEmpty()) cdkBuilder.cellValueSynonyms(_cellValueSynonyms)
        if (_notAllowedAggregations.isNotEmpty()) {
            cdkBuilder.notAllowedAggregations(_notAllowedAggregations)
        }
        return cdkBuilder.build()
    }
}
