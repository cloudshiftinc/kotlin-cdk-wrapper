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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable

/**
 * Controls on the query specifications that can be run on a configured table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * ConfiguredTableAnalysisRulePolicyV1Property configuredTableAnalysisRulePolicyV1Property =
 * ConfiguredTableAnalysisRulePolicyV1Property.builder()
 * .aggregation(AnalysisRuleAggregationProperty.builder()
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
 * .build())
 * .custom(AnalysisRuleCustomProperty.builder()
 * .allowedAnalyses(List.of("allowedAnalyses"))
 * // the properties below are optional
 * .allowedAnalysisProviders(List.of("allowedAnalysisProviders"))
 * .build())
 * .list(AnalysisRuleListProperty.builder()
 * .joinColumns(List.of("joinColumns"))
 * .listColumns(List.of("listColumns"))
 * // the properties below are optional
 * .allowedJoinOperators(List.of("allowedJoinOperators"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1.html)
 */
@CdkDslMarker
public class CfnConfiguredTableConfiguredTableAnalysisRulePolicyV1PropertyDsl {
    private val cdkBuilder: CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property.Builder =
        CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property.builder()

    /**
     * @param aggregation Analysis rule type that enables only aggregation queries on a configured
     *   table.
     */
    public fun aggregation(aggregation: IResolvable) {
        cdkBuilder.aggregation(aggregation)
    }

    /**
     * @param aggregation Analysis rule type that enables only aggregation queries on a configured
     *   table.
     */
    public fun aggregation(aggregation: CfnConfiguredTable.AnalysisRuleAggregationProperty) {
        cdkBuilder.aggregation(aggregation)
    }

    /** @param custom Analysis rule type that enables custom SQL queries on a configured table. */
    public fun custom(custom: IResolvable) {
        cdkBuilder.custom(custom)
    }

    /** @param custom Analysis rule type that enables custom SQL queries on a configured table. */
    public fun custom(custom: CfnConfiguredTable.AnalysisRuleCustomProperty) {
        cdkBuilder.custom(custom)
    }

    /** @param list Analysis rule type that enables only list queries on a configured table. */
    public fun list(list: IResolvable) {
        cdkBuilder.list(list)
    }

    /** @param list Analysis rule type that enables only list queries on a configured table. */
    public fun list(list: CfnConfiguredTable.AnalysisRuleListProperty) {
        cdkBuilder.list(list)
    }

    public fun build(): CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property =
        cdkBuilder.build()
}
