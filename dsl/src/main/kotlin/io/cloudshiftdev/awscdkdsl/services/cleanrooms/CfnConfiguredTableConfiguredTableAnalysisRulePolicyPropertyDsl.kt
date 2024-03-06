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
 * ConfiguredTableAnalysisRulePolicyProperty configuredTableAnalysisRulePolicyProperty =
 * ConfiguredTableAnalysisRulePolicyProperty.builder()
 * .v1(ConfiguredTableAnalysisRulePolicyV1Property.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-configuredtableanalysisrulepolicy.html)
 */
@CdkDslMarker
public class CfnConfiguredTableConfiguredTableAnalysisRulePolicyPropertyDsl {
    private val cdkBuilder: CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty.Builder =
        CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty.builder()

    /** @param v1 Controls on the query specifications that can be run on a configured table. */
    public fun v1(v1: IResolvable) {
        cdkBuilder.v1(v1)
    }

    /** @param v1 Controls on the query specifications that can be run on a configured table. */
    public fun v1(v1: CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property) {
        cdkBuilder.v1(v1)
    }

    public fun build(): CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty =
        cdkBuilder.build()
}
