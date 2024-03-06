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
import software.constructs.Construct

/**
 * Creates a new configured table resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * CfnConfiguredTable cfnConfiguredTable = CfnConfiguredTable.Builder.create(this,
 * "MyCfnConfiguredTable")
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
public class CfnConfiguredTableDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConfiguredTable.Builder =
        CfnConfiguredTable.Builder.create(scope, id)

    private val _allowedColumns: MutableList<String> = mutableListOf()

    private val _analysisRules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The columns within the underlying AWS Glue table that can be utilized within collaborations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-allowedcolumns)
     *
     * @param allowedColumns The columns within the underlying AWS Glue table that can be utilized
     *   within collaborations.
     */
    public fun allowedColumns(vararg allowedColumns: String) {
        _allowedColumns.addAll(listOf(*allowedColumns))
    }

    /**
     * The columns within the underlying AWS Glue table that can be utilized within collaborations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-allowedcolumns)
     *
     * @param allowedColumns The columns within the underlying AWS Glue table that can be utilized
     *   within collaborations.
     */
    public fun allowedColumns(allowedColumns: Collection<String>) {
        _allowedColumns.addAll(allowedColumns)
    }

    /**
     * The analysis method for the configured table.
     *
     * The only valid value is currently `DIRECT_QUERY`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysismethod)
     *
     * @param analysisMethod The analysis method for the configured table.
     */
    public fun analysisMethod(analysisMethod: String) {
        cdkBuilder.analysisMethod(analysisMethod)
    }

    /**
     * The entire created analysis rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysisrules)
     *
     * @param analysisRules The entire created analysis rule.
     */
    public fun analysisRules(vararg analysisRules: Any) {
        _analysisRules.addAll(listOf(*analysisRules))
    }

    /**
     * The entire created analysis rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysisrules)
     *
     * @param analysisRules The entire created analysis rule.
     */
    public fun analysisRules(analysisRules: Collection<Any>) {
        _analysisRules.addAll(analysisRules)
    }

    /**
     * The entire created analysis rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysisrules)
     *
     * @param analysisRules The entire created analysis rule.
     */
    public fun analysisRules(analysisRules: IResolvable) {
        cdkBuilder.analysisRules(analysisRules)
    }

    /**
     * A description for the configured table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-description)
     *
     * @param description A description for the configured table.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A name for the configured table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-name)
     *
     * @param name A name for the configured table.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The AWS Glue table that this configured table represents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tablereference)
     *
     * @param tableReference The AWS Glue table that this configured table represents.
     */
    public fun tableReference(tableReference: IResolvable) {
        cdkBuilder.tableReference(tableReference)
    }

    /**
     * The AWS Glue table that this configured table represents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tablereference)
     *
     * @param tableReference The AWS Glue table that this configured table represents.
     */
    public fun tableReference(tableReference: CfnConfiguredTable.TableReferenceProperty) {
        cdkBuilder.tableReference(tableReference)
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tags)
     *
     * @param tags An optional label that you can assign to a resource when you create it.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tags)
     *
     * @param tags An optional label that you can assign to a resource when you create it.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnConfiguredTable {
        if (_allowedColumns.isNotEmpty()) cdkBuilder.allowedColumns(_allowedColumns)
        if (_analysisRules.isNotEmpty()) cdkBuilder.analysisRules(_analysisRules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
