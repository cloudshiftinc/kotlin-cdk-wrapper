package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfiguredTable internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun allowedColumns(): List<String> = unwrap(this).getAllowedColumns() ?: emptyList()

  public open fun allowedColumns(`value`: List<String>) {
    unwrap(this).setAllowedColumns(`value`)
  }

  public open fun analysisMethod(): String = unwrap(this).getAnalysisMethod()

  public open fun analysisMethod(`value`: String) {
    unwrap(this).setAnalysisMethod(`value`)
  }

  public open fun analysisRules(): Any? = unwrap(this).getAnalysisRules()

  public open fun analysisRules(`value`: IResolvable) {
    unwrap(this).setAnalysisRules(`value`.let(IResolvable::unwrap))
  }

  public open fun analysisRules(__idx_ac66f0: List<Any>) {
    unwrap(this).setAnalysisRules(__idx_ac66f0)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrConfiguredTableIdentifier(): String =
      unwrap(this).getAttrConfiguredTableIdentifier()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun tableReference(): Any = unwrap(this).getTableReference()

  public open fun tableReference(`value`: IResolvable) {
    unwrap(this).setTableReference(`value`.let(IResolvable::unwrap))
  }

  public open fun tableReference(`value`: TableReferenceProperty) {
    unwrap(this).setTableReference(`value`.let(TableReferenceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4839bbb0b7a8e4db4d671fed6496347f1c920b201fde8594778c604acc4f4606")
  public open fun tableReference(`value`: TableReferenceProperty.Builder.() -> Unit): Unit =
      tableReference(TableReferenceProperty(`value`))

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun allowedColumns(allowedColumns: List<String>) {
    }

    public fun analysisMethod(analysisMethod: String) {
    }

    public fun analysisRules(analysisRules: IResolvable) {
    }

    public fun analysisRules(analysisRules: List<Any>) {
    }

    public fun description(description: String) {
    }

    public fun name(name: String) {
    }

    public fun tableReference(tableReference: IResolvable) {
    }

    public fun tableReference(tableReference: TableReferenceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecc93edf43a16f86dba9d1e61f5caca0faf208cf696a67f7a196a38ef52bb4ff")
    public fun tableReference(tableReference: TableReferenceProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.Builder.create(scope, id)

    public override fun allowedColumns(allowedColumns: List<String>) {
      cdkBuilder.allowedColumns(allowedColumns)
    }

    public override fun analysisMethod(analysisMethod: String) {
      cdkBuilder.analysisMethod(analysisMethod)
    }

    public override fun analysisRules(analysisRules: IResolvable) {
      cdkBuilder.analysisRules(analysisRules.let(IResolvable::unwrap))
    }

    public override fun analysisRules(analysisRules: List<Any>) {
      cdkBuilder.analysisRules(analysisRules)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tableReference(tableReference: IResolvable) {
      cdkBuilder.tableReference(tableReference.let(IResolvable::unwrap))
    }

    public override fun tableReference(tableReference: TableReferenceProperty) {
      cdkBuilder.tableReference(tableReference.let(TableReferenceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecc93edf43a16f86dba9d1e61f5caca0faf208cf696a67f7a196a38ef52bb4ff")
    public override fun tableReference(tableReference: TableReferenceProperty.Builder.() -> Unit):
        Unit = tableReference(TableReferenceProperty(tableReference))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfiguredTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfiguredTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable):
        CfnConfiguredTable = CfnConfiguredTable(cdkObject)

    internal fun unwrap(wrapped: CfnConfiguredTable):
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable = wrapped.cdkObject
  }

  public interface TableReferenceProperty {
    public fun glue(): Any

    public interface Builder {
      public fun glue(glue: IResolvable) {
      }

      public fun glue(glue: GlueTableReferenceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db4f6a5ba6d28531ae58587a3a8dd814bc5df20896049b36a90d989f5dfa0f07")
      public fun glue(glue: GlueTableReferenceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.TableReferenceProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.TableReferenceProperty.builder()

      public override fun glue(glue: IResolvable) {
        cdkBuilder.glue(glue.let(IResolvable::unwrap))
      }

      public override fun glue(glue: GlueTableReferenceProperty) {
        cdkBuilder.glue(glue.let(GlueTableReferenceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db4f6a5ba6d28531ae58587a3a8dd814bc5df20896049b36a90d989f5dfa0f07")
      public override fun glue(glue: GlueTableReferenceProperty.Builder.() -> Unit): Unit =
          glue(GlueTableReferenceProperty(glue))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.TableReferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.TableReferenceProperty,
    ) : TableReferenceProperty {
      public override fun glue(): Any = unwrap(this).getGlue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TableReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.TableReferenceProperty):
          TableReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableReferenceProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.TableReferenceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AggregationConstraintProperty {
    public fun columnName(): String

    public fun minimum(): Number

    public fun type(): String

    public interface Builder {
      public fun columnName(columnName: String) {
      }

      public fun minimum(minimum: Number) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregationConstraintProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregationConstraintProperty.builder()

      public override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      public override fun minimum(minimum: Number) {
        cdkBuilder.minimum(minimum)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregationConstraintProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregationConstraintProperty,
    ) : AggregationConstraintProperty {
      public override fun columnName(): String = unwrap(this).getColumnName()

      public override fun minimum(): Number = unwrap(this).getMinimum()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AggregationConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregationConstraintProperty):
          AggregationConstraintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AggregationConstraintProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregationConstraintProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AnalysisRuleAggregationProperty {
    public fun aggregateColumns(): Any

    public fun allowedJoinOperators(): List<String> = unwrap(this).getAllowedJoinOperators() ?:
        emptyList()

    public fun dimensionColumns(): List<String>

    public fun joinColumns(): List<String>

    public fun joinRequired(): String? = unwrap(this).getJoinRequired()

    public fun outputConstraints(): Any

    public fun scalarFunctions(): List<String>

    public interface Builder {
      public fun aggregateColumns(aggregateColumns: IResolvable) {
      }

      public fun aggregateColumns(aggregateColumns: List<Any>) {
      }

      public fun allowedJoinOperators(allowedJoinOperators: List<String>) {
      }

      public fun dimensionColumns(dimensionColumns: List<String>) {
      }

      public fun joinColumns(joinColumns: List<String>) {
      }

      public fun joinRequired(joinRequired: String) {
      }

      public fun outputConstraints(outputConstraints: IResolvable) {
      }

      public fun outputConstraints(outputConstraints: List<Any>) {
      }

      public fun scalarFunctions(scalarFunctions: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleAggregationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleAggregationProperty.builder()

      public override fun aggregateColumns(aggregateColumns: IResolvable) {
        cdkBuilder.aggregateColumns(aggregateColumns.let(IResolvable::unwrap))
      }

      public override fun aggregateColumns(aggregateColumns: List<Any>) {
        cdkBuilder.aggregateColumns(aggregateColumns)
      }

      public override fun allowedJoinOperators(allowedJoinOperators: List<String>) {
        cdkBuilder.allowedJoinOperators(allowedJoinOperators)
      }

      public override fun dimensionColumns(dimensionColumns: List<String>) {
        cdkBuilder.dimensionColumns(dimensionColumns)
      }

      public override fun joinColumns(joinColumns: List<String>) {
        cdkBuilder.joinColumns(joinColumns)
      }

      public override fun joinRequired(joinRequired: String) {
        cdkBuilder.joinRequired(joinRequired)
      }

      public override fun outputConstraints(outputConstraints: IResolvable) {
        cdkBuilder.outputConstraints(outputConstraints.let(IResolvable::unwrap))
      }

      public override fun outputConstraints(outputConstraints: List<Any>) {
        cdkBuilder.outputConstraints(outputConstraints)
      }

      public override fun scalarFunctions(scalarFunctions: List<String>) {
        cdkBuilder.scalarFunctions(scalarFunctions)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleAggregationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleAggregationProperty,
    ) : AnalysisRuleAggregationProperty {
      public override fun aggregateColumns(): Any = unwrap(this).getAggregateColumns()

      public override fun allowedJoinOperators(): List<String> =
          unwrap(this).getAllowedJoinOperators() ?: emptyList()

      public override fun dimensionColumns(): List<String> = unwrap(this).getDimensionColumns() ?:
          emptyList()

      public override fun joinColumns(): List<String> = unwrap(this).getJoinColumns() ?: emptyList()

      public override fun joinRequired(): String? = unwrap(this).getJoinRequired()

      public override fun outputConstraints(): Any = unwrap(this).getOutputConstraints()

      public override fun scalarFunctions(): List<String> = unwrap(this).getScalarFunctions() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisRuleAggregationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleAggregationProperty):
          AnalysisRuleAggregationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisRuleAggregationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleAggregationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AnalysisRuleCustomProperty {
    public fun allowedAnalyses(): List<String>

    public fun allowedAnalysisProviders(): List<String> = unwrap(this).getAllowedAnalysisProviders()
        ?: emptyList()

    public interface Builder {
      public fun allowedAnalyses(allowedAnalyses: List<String>) {
      }

      public fun allowedAnalysisProviders(allowedAnalysisProviders: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleCustomProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleCustomProperty.builder()

      public override fun allowedAnalyses(allowedAnalyses: List<String>) {
        cdkBuilder.allowedAnalyses(allowedAnalyses)
      }

      public override fun allowedAnalysisProviders(allowedAnalysisProviders: List<String>) {
        cdkBuilder.allowedAnalysisProviders(allowedAnalysisProviders)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleCustomProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleCustomProperty,
    ) : AnalysisRuleCustomProperty {
      public override fun allowedAnalyses(): List<String> = unwrap(this).getAllowedAnalyses() ?:
          emptyList()

      public override fun allowedAnalysisProviders(): List<String> =
          unwrap(this).getAllowedAnalysisProviders() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisRuleCustomProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleCustomProperty):
          AnalysisRuleCustomProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisRuleCustomProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleCustomProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AggregateColumnProperty {
    public fun columnNames(): List<String>

    public fun function(): String

    public interface Builder {
      public fun columnNames(columnNames: List<String>) {
      }

      public fun function(function: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregateColumnProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregateColumnProperty.builder()

      public override fun columnNames(columnNames: List<String>) {
        cdkBuilder.columnNames(columnNames)
      }

      public override fun function(function: String) {
        cdkBuilder.function(function)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregateColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregateColumnProperty,
    ) : AggregateColumnProperty {
      public override fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

      public override fun function(): String = unwrap(this).getFunction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AggregateColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregateColumnProperty):
          AggregateColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AggregateColumnProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AggregateColumnProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfiguredTableAnalysisRulePolicyProperty {
    public fun v1(): Any

    public interface Builder {
      public fun v1(v1: IResolvable) {
      }

      public fun v1(v1: ConfiguredTableAnalysisRulePolicyV1Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e94b83562724b240a08adee0ffd72a564528ea2c203a921ff233196cdddd8d6")
      public fun v1(v1: ConfiguredTableAnalysisRulePolicyV1Property.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty.builder()

      public override fun v1(v1: IResolvable) {
        cdkBuilder.v1(v1.let(IResolvable::unwrap))
      }

      public override fun v1(v1: ConfiguredTableAnalysisRulePolicyV1Property) {
        cdkBuilder.v1(v1.let(ConfiguredTableAnalysisRulePolicyV1Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e94b83562724b240a08adee0ffd72a564528ea2c203a921ff233196cdddd8d6")
      public override fun v1(v1: ConfiguredTableAnalysisRulePolicyV1Property.Builder.() -> Unit):
          Unit = v1(ConfiguredTableAnalysisRulePolicyV1Property(v1))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty,
    ) : ConfiguredTableAnalysisRulePolicyProperty {
      public override fun v1(): Any = unwrap(this).getV1()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfiguredTableAnalysisRulePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty):
          ConfiguredTableAnalysisRulePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfiguredTableAnalysisRulePolicyProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface GlueTableReferenceProperty {
    public fun databaseName(): String

    public fun tableName(): String

    public interface Builder {
      public fun databaseName(databaseName: String) {
      }

      public fun tableName(tableName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.GlueTableReferenceProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.GlueTableReferenceProperty.builder()

      public override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      public override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.GlueTableReferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.GlueTableReferenceProperty,
    ) : GlueTableReferenceProperty {
      public override fun databaseName(): String = unwrap(this).getDatabaseName()

      public override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GlueTableReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.GlueTableReferenceProperty):
          GlueTableReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueTableReferenceProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.GlueTableReferenceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AnalysisRuleListProperty {
    public fun allowedJoinOperators(): List<String> = unwrap(this).getAllowedJoinOperators() ?:
        emptyList()

    public fun joinColumns(): List<String>

    public fun listColumns(): List<String>

    public interface Builder {
      public fun allowedJoinOperators(allowedJoinOperators: List<String>) {
      }

      public fun joinColumns(joinColumns: List<String>) {
      }

      public fun listColumns(listColumns: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleListProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleListProperty.builder()

      public override fun allowedJoinOperators(allowedJoinOperators: List<String>) {
        cdkBuilder.allowedJoinOperators(allowedJoinOperators)
      }

      public override fun joinColumns(joinColumns: List<String>) {
        cdkBuilder.joinColumns(joinColumns)
      }

      public override fun listColumns(listColumns: List<String>) {
        cdkBuilder.listColumns(listColumns)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleListProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleListProperty,
    ) : AnalysisRuleListProperty {
      public override fun allowedJoinOperators(): List<String> =
          unwrap(this).getAllowedJoinOperators() ?: emptyList()

      public override fun joinColumns(): List<String> = unwrap(this).getJoinColumns() ?: emptyList()

      public override fun listColumns(): List<String> = unwrap(this).getListColumns() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisRuleListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleListProperty):
          AnalysisRuleListProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisRuleListProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleListProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AnalysisRuleProperty {
    public fun policy(): Any

    public fun type(): String

    public interface Builder {
      public fun policy(policy: IResolvable) {
      }

      public fun policy(policy: ConfiguredTableAnalysisRulePolicyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e21ec50cfa5d777cdb4939ff81a5ad2e67ac32d06971c6437a8690e1a5ca72c")
      public fun policy(policy: ConfiguredTableAnalysisRulePolicyProperty.Builder.() -> Unit) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleProperty.builder()

      public override fun policy(policy: IResolvable) {
        cdkBuilder.policy(policy.let(IResolvable::unwrap))
      }

      public override fun policy(policy: ConfiguredTableAnalysisRulePolicyProperty) {
        cdkBuilder.policy(policy.let(ConfiguredTableAnalysisRulePolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e21ec50cfa5d777cdb4939ff81a5ad2e67ac32d06971c6437a8690e1a5ca72c")
      public override
          fun policy(policy: ConfiguredTableAnalysisRulePolicyProperty.Builder.() -> Unit): Unit =
          policy(ConfiguredTableAnalysisRulePolicyProperty(policy))

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleProperty,
    ) : AnalysisRuleProperty {
      public override fun policy(): Any = unwrap(this).getPolicy()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleProperty):
          AnalysisRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisRuleProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.AnalysisRuleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfiguredTableAnalysisRulePolicyV1Property {
    public fun aggregation(): Any? = unwrap(this).getAggregation()

    public fun custom(): Any? = unwrap(this).getCustom()

    public fun list(): Any? = unwrap(this).getList()

    public interface Builder {
      public fun aggregation(aggregation: IResolvable) {
      }

      public fun aggregation(aggregation: AnalysisRuleAggregationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71df3457cfbad5482336d956bec1132cb725114f18aa1d54295766d90ebaf374")
      public fun aggregation(aggregation: AnalysisRuleAggregationProperty.Builder.() -> Unit) {
      }

      public fun custom(custom: IResolvable) {
      }

      public fun custom(custom: AnalysisRuleCustomProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77a08e90fa87700b479f28119cb3c92f924c18b384ef191db8b53323e50405c2")
      public fun custom(custom: AnalysisRuleCustomProperty.Builder.() -> Unit) {
      }

      public fun list(list: IResolvable) {
      }

      public fun list(list: AnalysisRuleListProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("207750a3f78c8b1bf272a370e868e6b9098a56878a4eaddee147ed2a72ac0a63")
      public fun list(list: AnalysisRuleListProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property.builder()

      public override fun aggregation(aggregation: IResolvable) {
        cdkBuilder.aggregation(aggregation.let(IResolvable::unwrap))
      }

      public override fun aggregation(aggregation: AnalysisRuleAggregationProperty) {
        cdkBuilder.aggregation(aggregation.let(AnalysisRuleAggregationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71df3457cfbad5482336d956bec1132cb725114f18aa1d54295766d90ebaf374")
      public override
          fun aggregation(aggregation: AnalysisRuleAggregationProperty.Builder.() -> Unit): Unit =
          aggregation(AnalysisRuleAggregationProperty(aggregation))

      public override fun custom(custom: IResolvable) {
        cdkBuilder.custom(custom.let(IResolvable::unwrap))
      }

      public override fun custom(custom: AnalysisRuleCustomProperty) {
        cdkBuilder.custom(custom.let(AnalysisRuleCustomProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77a08e90fa87700b479f28119cb3c92f924c18b384ef191db8b53323e50405c2")
      public override fun custom(custom: AnalysisRuleCustomProperty.Builder.() -> Unit): Unit =
          custom(AnalysisRuleCustomProperty(custom))

      public override fun list(list: IResolvable) {
        cdkBuilder.list(list.let(IResolvable::unwrap))
      }

      public override fun list(list: AnalysisRuleListProperty) {
        cdkBuilder.list(list.let(AnalysisRuleListProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("207750a3f78c8b1bf272a370e868e6b9098a56878a4eaddee147ed2a72ac0a63")
      public override fun list(list: AnalysisRuleListProperty.Builder.() -> Unit): Unit =
          list(AnalysisRuleListProperty(list))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property,
    ) : ConfiguredTableAnalysisRulePolicyV1Property {
      public override fun aggregation(): Any? = unwrap(this).getAggregation()

      public override fun custom(): Any? = unwrap(this).getCustom()

      public override fun list(): Any? = unwrap(this).getList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfiguredTableAnalysisRulePolicyV1Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property):
          ConfiguredTableAnalysisRulePolicyV1Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfiguredTableAnalysisRulePolicyV1Property):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property
          = (wrapped as Wrapper).cdkObject
    }
  }
}
