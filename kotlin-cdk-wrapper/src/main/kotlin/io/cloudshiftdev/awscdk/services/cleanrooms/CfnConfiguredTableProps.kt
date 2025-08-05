@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConfiguredTable`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
 * CfnConfiguredTableProps cfnConfiguredTableProps = CfnConfiguredTableProps.builder()
 * .allowedColumns(List.of("allowedColumns"))
 * .analysisMethod("analysisMethod")
 * .name("name")
 * .tableReference(TableReferenceProperty.builder()
 * .athena(AthenaTableReferenceProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .workGroup("workGroup")
 * // the properties below are optional
 * .outputLocation("outputLocation")
 * .build())
 * .glue(GlueTableReferenceProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .build())
 * .snowflake(SnowflakeTableReferenceProperty.builder()
 * .accountIdentifier("accountIdentifier")
 * .databaseName("databaseName")
 * .schemaName("schemaName")
 * .secretArn("secretArn")
 * .tableName("tableName")
 * .tableSchema(SnowflakeTableSchemaProperty.builder()
 * .v1(List.of(SnowflakeTableSchemaV1Property.builder()
 * .columnName("columnName")
 * .columnType("columnType")
 * .build()))
 * .build())
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
 * .additionalAnalyses("additionalAnalyses")
 * .allowedJoinOperators(List.of("allowedJoinOperators"))
 * .joinRequired("joinRequired")
 * .build())
 * .custom(AnalysisRuleCustomProperty.builder()
 * .allowedAnalyses(List.of("allowedAnalyses"))
 * // the properties below are optional
 * .additionalAnalyses("additionalAnalyses")
 * .allowedAnalysisProviders(List.of("allowedAnalysisProviders"))
 * .differentialPrivacy(DifferentialPrivacyProperty.builder()
 * .columns(List.of(DifferentialPrivacyColumnProperty.builder()
 * .name("name")
 * .build()))
 * .build())
 * .disallowedOutputColumns(List.of("disallowedOutputColumns"))
 * .build())
 * .list(AnalysisRuleListProperty.builder()
 * .joinColumns(List.of("joinColumns"))
 * .listColumns(List.of("listColumns"))
 * // the properties below are optional
 * .additionalAnalyses("additionalAnalyses")
 * .allowedJoinOperators(List.of("allowedJoinOperators"))
 * .build())
 * .build())
 * .build())
 * .type("type")
 * .build()))
 * .description("description")
 * .selectedAnalysisMethods(List.of("selectedAnalysisMethods"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html)
 */
public interface CfnConfiguredTableProps {
  /**
   * The columns within the underlying AWS Glue table that can be utilized within collaborations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-allowedcolumns)
   */
  public fun allowedColumns(): List<String>

  /**
   * The analysis method for the configured table.
   *
   * `DIRECT_QUERY` allows SQL queries to be run directly on this table.
   *
   * `DIRECT_JOB` allows PySpark jobs to be run directly on this table.
   *
   * `MULTIPLE` allows both SQL queries and PySpark jobs to be run directly on this table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysismethod)
   */
  public fun analysisMethod(): String

  /**
   * The analysis rule that was created for the configured table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysisrules)
   */
  public fun analysisRules(): Any? = unwrap(this).getAnalysisRules()

  /**
   * A description for the configured table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A name for the configured table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-name)
   */
  public fun name(): String

  /**
   * The selected analysis methods for the configured table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-selectedanalysismethods)
   */
  public fun selectedAnalysisMethods(): List<String> = unwrap(this).getSelectedAnalysisMethods() ?:
      emptyList()

  /**
   * The table that this configured table represents.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tablereference)
   */
  public fun tableReference(): Any

  /**
   * An optional label that you can assign to a resource when you create it.
   *
   * Each tag consists of a key and an optional value, both of which you define. When you use
   * tagging, you can also use tag-based access control in IAM policies to control access to this
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnConfiguredTableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedColumns The columns within the underlying AWS Glue table that can be utilized
     * within collaborations. 
     */
    public fun allowedColumns(allowedColumns: List<String>)

    /**
     * @param allowedColumns The columns within the underlying AWS Glue table that can be utilized
     * within collaborations. 
     */
    public fun allowedColumns(vararg allowedColumns: String)

    /**
     * @param analysisMethod The analysis method for the configured table. 
     * `DIRECT_QUERY` allows SQL queries to be run directly on this table.
     *
     * `DIRECT_JOB` allows PySpark jobs to be run directly on this table.
     *
     * `MULTIPLE` allows both SQL queries and PySpark jobs to be run directly on this table.
     */
    public fun analysisMethod(analysisMethod: String)

    /**
     * @param analysisRules The analysis rule that was created for the configured table.
     */
    public fun analysisRules(analysisRules: IResolvable)

    /**
     * @param analysisRules The analysis rule that was created for the configured table.
     */
    public fun analysisRules(analysisRules: List<Any>)

    /**
     * @param analysisRules The analysis rule that was created for the configured table.
     */
    public fun analysisRules(vararg analysisRules: Any)

    /**
     * @param description A description for the configured table.
     */
    public fun description(description: String)

    /**
     * @param name A name for the configured table. 
     */
    public fun name(name: String)

    /**
     * @param selectedAnalysisMethods The selected analysis methods for the configured table.
     */
    public fun selectedAnalysisMethods(selectedAnalysisMethods: List<String>)

    /**
     * @param selectedAnalysisMethods The selected analysis methods for the configured table.
     */
    public fun selectedAnalysisMethods(vararg selectedAnalysisMethods: String)

    /**
     * @param tableReference The table that this configured table represents. 
     */
    public fun tableReference(tableReference: IResolvable)

    /**
     * @param tableReference The table that this configured table represents. 
     */
    public fun tableReference(tableReference: CfnConfiguredTable.TableReferenceProperty)

    /**
     * @param tableReference The table that this configured table represents. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca098f05bb8739c47921256f2d37eebf1e64173c1e52eae729362962f3adab74")
    public
        fun tableReference(tableReference: CfnConfiguredTable.TableReferenceProperty.Builder.() -> Unit)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps.builder()

    /**
     * @param allowedColumns The columns within the underlying AWS Glue table that can be utilized
     * within collaborations. 
     */
    override fun allowedColumns(allowedColumns: List<String>) {
      cdkBuilder.allowedColumns(allowedColumns)
    }

    /**
     * @param allowedColumns The columns within the underlying AWS Glue table that can be utilized
     * within collaborations. 
     */
    override fun allowedColumns(vararg allowedColumns: String): Unit =
        allowedColumns(allowedColumns.toList())

    /**
     * @param analysisMethod The analysis method for the configured table. 
     * `DIRECT_QUERY` allows SQL queries to be run directly on this table.
     *
     * `DIRECT_JOB` allows PySpark jobs to be run directly on this table.
     *
     * `MULTIPLE` allows both SQL queries and PySpark jobs to be run directly on this table.
     */
    override fun analysisMethod(analysisMethod: String) {
      cdkBuilder.analysisMethod(analysisMethod)
    }

    /**
     * @param analysisRules The analysis rule that was created for the configured table.
     */
    override fun analysisRules(analysisRules: IResolvable) {
      cdkBuilder.analysisRules(analysisRules.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param analysisRules The analysis rule that was created for the configured table.
     */
    override fun analysisRules(analysisRules: List<Any>) {
      cdkBuilder.analysisRules(analysisRules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param analysisRules The analysis rule that was created for the configured table.
     */
    override fun analysisRules(vararg analysisRules: Any): Unit =
        analysisRules(analysisRules.toList())

    /**
     * @param description A description for the configured table.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name A name for the configured table. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param selectedAnalysisMethods The selected analysis methods for the configured table.
     */
    override fun selectedAnalysisMethods(selectedAnalysisMethods: List<String>) {
      cdkBuilder.selectedAnalysisMethods(selectedAnalysisMethods)
    }

    /**
     * @param selectedAnalysisMethods The selected analysis methods for the configured table.
     */
    override fun selectedAnalysisMethods(vararg selectedAnalysisMethods: String): Unit =
        selectedAnalysisMethods(selectedAnalysisMethods.toList())

    /**
     * @param tableReference The table that this configured table represents. 
     */
    override fun tableReference(tableReference: IResolvable) {
      cdkBuilder.tableReference(tableReference.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tableReference The table that this configured table represents. 
     */
    override fun tableReference(tableReference: CfnConfiguredTable.TableReferenceProperty) {
      cdkBuilder.tableReference(tableReference.let(CfnConfiguredTable.TableReferenceProperty.Companion::unwrap))
    }

    /**
     * @param tableReference The table that this configured table represents. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca098f05bb8739c47921256f2d37eebf1e64173c1e52eae729362962f3adab74")
    override
        fun tableReference(tableReference: CfnConfiguredTable.TableReferenceProperty.Builder.() -> Unit):
        Unit = tableReference(CfnConfiguredTable.TableReferenceProperty(tableReference))

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps,
  ) : CdkObject(cdkObject),
      CfnConfiguredTableProps {
    /**
     * The columns within the underlying AWS Glue table that can be utilized within collaborations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-allowedcolumns)
     */
    override fun allowedColumns(): List<String> = unwrap(this).getAllowedColumns()

    /**
     * The analysis method for the configured table.
     *
     * `DIRECT_QUERY` allows SQL queries to be run directly on this table.
     *
     * `DIRECT_JOB` allows PySpark jobs to be run directly on this table.
     *
     * `MULTIPLE` allows both SQL queries and PySpark jobs to be run directly on this table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysismethod)
     */
    override fun analysisMethod(): String = unwrap(this).getAnalysisMethod()

    /**
     * The analysis rule that was created for the configured table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-analysisrules)
     */
    override fun analysisRules(): Any? = unwrap(this).getAnalysisRules()

    /**
     * A description for the configured table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A name for the configured table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The selected analysis methods for the configured table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-selectedanalysismethods)
     */
    override fun selectedAnalysisMethods(): List<String> = unwrap(this).getSelectedAnalysisMethods()
        ?: emptyList()

    /**
     * The table that this configured table represents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tablereference)
     */
    override fun tableReference(): Any = unwrap(this).getTableReference()

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html#cfn-cleanrooms-configuredtable-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfiguredTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps):
        CfnConfiguredTableProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConfiguredTableProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfiguredTableProps):
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps
  }
}
