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
public class CfnTopicTopicColumnPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicColumnProperty.Builder =
        CfnTopic.TopicColumnProperty.builder()

    private val _allowedAggregations: MutableList<String> = mutableListOf()

    private val _cellValueSynonyms: MutableList<Any> = mutableListOf()

    private val _columnSynonyms: MutableList<String> = mutableListOf()

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

    public fun columnDescription(columnDescription: String) {
        cdkBuilder.columnDescription(columnDescription)
    }

    public fun columnFriendlyName(columnFriendlyName: String) {
        cdkBuilder.columnFriendlyName(columnFriendlyName)
    }

    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    public fun columnSynonyms(vararg columnSynonyms: String) {
        _columnSynonyms.addAll(listOf(*columnSynonyms))
    }

    public fun columnSynonyms(columnSynonyms: Collection<String>) {
        _columnSynonyms.addAll(columnSynonyms)
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

    public fun build(): CfnTopic.TopicColumnProperty {
        if (_allowedAggregations.isNotEmpty()) cdkBuilder.allowedAggregations(_allowedAggregations)
        if (_cellValueSynonyms.isNotEmpty()) cdkBuilder.cellValueSynonyms(_cellValueSynonyms)
        if (_columnSynonyms.isNotEmpty()) cdkBuilder.columnSynonyms(_columnSynonyms)
        if (_notAllowedAggregations.isNotEmpty()) {
            cdkBuilder.notAllowedAggregations(_notAllowedAggregations)
        }
        return cdkBuilder.build()
    }
}
