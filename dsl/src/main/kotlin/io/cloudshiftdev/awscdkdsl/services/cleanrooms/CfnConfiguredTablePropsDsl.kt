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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps

/**
 * Properties for defining a `CfnConfiguredTable`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * CfnConfiguredTableProps cfnConfiguredTableProps = CfnConfiguredTableProps.builder()
 * .allowedColumns(List.of("allowedColumns"))
 * .analysisMethod("analysisMethod")
 * .name("name")
 * .tableReference(TableReferenceProperty.builder()
 * .glue(GlueTableReferenceProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .build())
 * .build())
 * // the properties below are optional
 * .analysisRules(List.of(AnalysisRuleProperty.builder()
 * .policy(ConfiguredTableAnalysisRulePolicyProperty.builder()
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
 * .build())
 * .type("type")
 * .build()))
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html)
 */
@CdkDslMarker
public class CfnConfiguredTablePropsDsl {
    private val cdkBuilder: CfnConfiguredTableProps.Builder = CfnConfiguredTableProps.builder()

    private val _allowedColumns: MutableList<String> = mutableListOf()

    private val _analysisRules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param allowedColumns The columns within the underlying AWS Glue table that can be utilized
     *   within collaborations.
     */
    public fun allowedColumns(vararg allowedColumns: String) {
        _allowedColumns.addAll(listOf(*allowedColumns))
    }

    /**
     * @param allowedColumns The columns within the underlying AWS Glue table that can be utilized
     *   within collaborations.
     */
    public fun allowedColumns(allowedColumns: Collection<String>) {
        _allowedColumns.addAll(allowedColumns)
    }

    /**
     * @param analysisMethod The analysis method for the configured table. The only valid value is
     *   currently `DIRECT_QUERY`.
     */
    public fun analysisMethod(analysisMethod: String) {
        cdkBuilder.analysisMethod(analysisMethod)
    }

    /** @param analysisRules The entire created analysis rule. */
    public fun analysisRules(vararg analysisRules: Any) {
        _analysisRules.addAll(listOf(*analysisRules))
    }

    /** @param analysisRules The entire created analysis rule. */
    public fun analysisRules(analysisRules: Collection<Any>) {
        _analysisRules.addAll(analysisRules)
    }

    /** @param analysisRules The entire created analysis rule. */
    public fun analysisRules(analysisRules: IResolvable) {
        cdkBuilder.analysisRules(analysisRules)
    }

    /** @param description A description for the configured table. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name A name for the configured table. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tableReference The AWS Glue table that this configured table represents. */
    public fun tableReference(tableReference: IResolvable) {
        cdkBuilder.tableReference(tableReference)
    }

    /** @param tableReference The AWS Glue table that this configured table represents. */
    public fun tableReference(tableReference: CfnConfiguredTable.TableReferenceProperty) {
        cdkBuilder.tableReference(tableReference)
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it. Each tag
     *   consists of a key and an optional value, both of which you define. When you use tagging,
     *   you can also use tag-based access control in IAM policies to control access to this
     *   resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it. Each tag
     *   consists of a key and an optional value, both of which you define. When you use tagging,
     *   you can also use tag-based access control in IAM policies to control access to this
     *   resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnConfiguredTableProps {
        if (_allowedColumns.isNotEmpty()) cdkBuilder.allowedColumns(_allowedColumns)
        if (_analysisRules.isNotEmpty()) cdkBuilder.analysisRules(_analysisRules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
