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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable

/**
 * A type of analysis rule that enables query structure and specified queries that produce aggregate
 * statistics.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * AnalysisRuleAggregationProperty analysisRuleAggregationProperty =
 * AnalysisRuleAggregationProperty.builder()
 * .aggregateColumns(List.of(AggregateColumnProperty.builder()
 * .columnNames(List.of("columnNames"))
 * .function("function")
 * .build()))
 * .dimensionColumns(List.of("dimensionColumns"))
 * .joinColumns(List.of("joinColumns"))
 * .outputConstraints(List.of(AggregationConstraintProperty.builder()
 * .columnName("columnName")
 * .minimum(123)
 * .type("type")
 * .build()))
 * .scalarFunctions(List.of("scalarFunctions"))
 * // the properties below are optional
 * .allowedJoinOperators(List.of("allowedJoinOperators"))
 * .joinRequired("joinRequired")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html)
 */
@CdkDslMarker
public class CfnConfiguredTableAnalysisRuleAggregationPropertyDsl {
    private val cdkBuilder: CfnConfiguredTable.AnalysisRuleAggregationProperty.Builder =
        CfnConfiguredTable.AnalysisRuleAggregationProperty.builder()

    private val _aggregateColumns: MutableList<Any> = mutableListOf()

    private val _allowedJoinOperators: MutableList<String> = mutableListOf()

    private val _dimensionColumns: MutableList<String> = mutableListOf()

    private val _joinColumns: MutableList<String> = mutableListOf()

    private val _outputConstraints: MutableList<Any> = mutableListOf()

    private val _scalarFunctions: MutableList<String> = mutableListOf()

    /**
     * @param aggregateColumns The columns that query runners are allowed to use in aggregation
     *   queries.
     */
    public fun aggregateColumns(vararg aggregateColumns: Any) {
        _aggregateColumns.addAll(listOf(*aggregateColumns))
    }

    /**
     * @param aggregateColumns The columns that query runners are allowed to use in aggregation
     *   queries.
     */
    public fun aggregateColumns(aggregateColumns: Collection<Any>) {
        _aggregateColumns.addAll(aggregateColumns)
    }

    /**
     * @param aggregateColumns The columns that query runners are allowed to use in aggregation
     *   queries.
     */
    public fun aggregateColumns(aggregateColumns: IResolvable) {
        cdkBuilder.aggregateColumns(aggregateColumns)
    }

    /**
     * @param allowedJoinOperators Which logical operators (if any) are to be used in an INNER JOIN
     *   match condition. Default is `AND` .
     */
    public fun allowedJoinOperators(vararg allowedJoinOperators: String) {
        _allowedJoinOperators.addAll(listOf(*allowedJoinOperators))
    }

    /**
     * @param allowedJoinOperators Which logical operators (if any) are to be used in an INNER JOIN
     *   match condition. Default is `AND` .
     */
    public fun allowedJoinOperators(allowedJoinOperators: Collection<String>) {
        _allowedJoinOperators.addAll(allowedJoinOperators)
    }

    /**
     * @param dimensionColumns The columns that query runners are allowed to select, group by, or
     *   filter by.
     */
    public fun dimensionColumns(vararg dimensionColumns: String) {
        _dimensionColumns.addAll(listOf(*dimensionColumns))
    }

    /**
     * @param dimensionColumns The columns that query runners are allowed to select, group by, or
     *   filter by.
     */
    public fun dimensionColumns(dimensionColumns: Collection<String>) {
        _dimensionColumns.addAll(dimensionColumns)
    }

    /**
     * @param joinColumns Columns in configured table that can be used in join statements and/or as
     *   aggregate columns. They can never be outputted directly.
     */
    public fun joinColumns(vararg joinColumns: String) {
        _joinColumns.addAll(listOf(*joinColumns))
    }

    /**
     * @param joinColumns Columns in configured table that can be used in join statements and/or as
     *   aggregate columns. They can never be outputted directly.
     */
    public fun joinColumns(joinColumns: Collection<String>) {
        _joinColumns.addAll(joinColumns)
    }

    /**
     * @param joinRequired Control that requires member who runs query to do a join with their
     *   configured table and/or other configured table in query.
     */
    public fun joinRequired(joinRequired: String) {
        cdkBuilder.joinRequired(joinRequired)
    }

    /**
     * @param outputConstraints Columns that must meet a specific threshold value (after an
     *   aggregation function is applied to it) for each output row to be returned.
     */
    public fun outputConstraints(vararg outputConstraints: Any) {
        _outputConstraints.addAll(listOf(*outputConstraints))
    }

    /**
     * @param outputConstraints Columns that must meet a specific threshold value (after an
     *   aggregation function is applied to it) for each output row to be returned.
     */
    public fun outputConstraints(outputConstraints: Collection<Any>) {
        _outputConstraints.addAll(outputConstraints)
    }

    /**
     * @param outputConstraints Columns that must meet a specific threshold value (after an
     *   aggregation function is applied to it) for each output row to be returned.
     */
    public fun outputConstraints(outputConstraints: IResolvable) {
        cdkBuilder.outputConstraints(outputConstraints)
    }

    /**
     * @param scalarFunctions Set of scalar functions that are allowed to be used on dimension
     *   columns and the output of aggregation of metrics.
     */
    public fun scalarFunctions(vararg scalarFunctions: String) {
        _scalarFunctions.addAll(listOf(*scalarFunctions))
    }

    /**
     * @param scalarFunctions Set of scalar functions that are allowed to be used on dimension
     *   columns and the output of aggregation of metrics.
     */
    public fun scalarFunctions(scalarFunctions: Collection<String>) {
        _scalarFunctions.addAll(scalarFunctions)
    }

    public fun build(): CfnConfiguredTable.AnalysisRuleAggregationProperty {
        if (_aggregateColumns.isNotEmpty()) cdkBuilder.aggregateColumns(_aggregateColumns)
        if (_allowedJoinOperators.isNotEmpty())
            cdkBuilder.allowedJoinOperators(_allowedJoinOperators)
        if (_dimensionColumns.isNotEmpty()) cdkBuilder.dimensionColumns(_dimensionColumns)
        if (_joinColumns.isNotEmpty()) cdkBuilder.joinColumns(_joinColumns)
        if (_outputConstraints.isNotEmpty()) cdkBuilder.outputConstraints(_outputConstraints)
        if (_scalarFunctions.isNotEmpty()) cdkBuilder.scalarFunctions(_scalarFunctions)
        return cdkBuilder.build()
    }
}
