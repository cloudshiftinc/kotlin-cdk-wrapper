@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataCellsFilter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter,
) : CfnResource(cdkObject), IInspectable {
  public open fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

  public open fun columnNames(`value`: List<String>) {
    unwrap(this).setColumnNames(`value`)
  }

  public open fun columnNames(vararg `value`: String): Unit = columnNames(`value`.toList())

  public open fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

  public open fun columnWildcard(`value`: IResolvable) {
    unwrap(this).setColumnWildcard(`value`.let(IResolvable::unwrap))
  }

  public open fun columnWildcard(`value`: ColumnWildcardProperty) {
    unwrap(this).setColumnWildcard(`value`.let(ColumnWildcardProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7a6707b99fcb777c0e80f2ea7331b82c69af665821f311de54edad3b177b1d9")
  public open fun columnWildcard(`value`: ColumnWildcardProperty.Builder.() -> Unit): Unit =
      columnWildcard(ColumnWildcardProperty(`value`))

  public open fun databaseName(): String = unwrap(this).getDatabaseName()

  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun rowFilter(): Any? = unwrap(this).getRowFilter()

  public open fun rowFilter(`value`: IResolvable) {
    unwrap(this).setRowFilter(`value`.let(IResolvable::unwrap))
  }

  public open fun rowFilter(`value`: RowFilterProperty) {
    unwrap(this).setRowFilter(`value`.let(RowFilterProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bf0bfdd8084d2b3f16564afba1bbbdf7eb63cadfd7a71253ae20c995bf5f5736")
  public open fun rowFilter(`value`: RowFilterProperty.Builder.() -> Unit): Unit =
      rowFilter(RowFilterProperty(`value`))

  public open fun tableCatalogId(): String = unwrap(this).getTableCatalogId()

  public open fun tableCatalogId(`value`: String) {
    unwrap(this).setTableCatalogId(`value`)
  }

  public open fun tableName(): String = unwrap(this).getTableName()

  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun columnNames(columnNames: List<String>)

    public fun columnNames(vararg columnNames: String)

    public fun columnWildcard(columnWildcard: IResolvable)

    public fun columnWildcard(columnWildcard: ColumnWildcardProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a782abca87786545ff85c73d56e1b48a708a17e905a6bad6c589ca7e46f27dd")
    public fun columnWildcard(columnWildcard: ColumnWildcardProperty.Builder.() -> Unit)

    public fun databaseName(databaseName: String)

    public fun name(name: String)

    public fun rowFilter(rowFilter: IResolvable)

    public fun rowFilter(rowFilter: RowFilterProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b8aec745d029dd5db34cc689594c3964031cc29463514afc0d2913022b0dc17")
    public fun rowFilter(rowFilter: RowFilterProperty.Builder.() -> Unit)

    public fun tableCatalogId(tableCatalogId: String)

    public fun tableName(tableName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.Builder
        = software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.Builder.create(scope, id)

    override fun columnNames(columnNames: List<String>) {
      cdkBuilder.columnNames(columnNames)
    }

    override fun columnNames(vararg columnNames: String): Unit = columnNames(columnNames.toList())

    override fun columnWildcard(columnWildcard: IResolvable) {
      cdkBuilder.columnWildcard(columnWildcard.let(IResolvable::unwrap))
    }

    override fun columnWildcard(columnWildcard: ColumnWildcardProperty) {
      cdkBuilder.columnWildcard(columnWildcard.let(ColumnWildcardProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a782abca87786545ff85c73d56e1b48a708a17e905a6bad6c589ca7e46f27dd")
    override fun columnWildcard(columnWildcard: ColumnWildcardProperty.Builder.() -> Unit): Unit =
        columnWildcard(ColumnWildcardProperty(columnWildcard))

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun rowFilter(rowFilter: IResolvable) {
      cdkBuilder.rowFilter(rowFilter.let(IResolvable::unwrap))
    }

    override fun rowFilter(rowFilter: RowFilterProperty) {
      cdkBuilder.rowFilter(rowFilter.let(RowFilterProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b8aec745d029dd5db34cc689594c3964031cc29463514afc0d2913022b0dc17")
    override fun rowFilter(rowFilter: RowFilterProperty.Builder.() -> Unit): Unit =
        rowFilter(RowFilterProperty(rowFilter))

    override fun tableCatalogId(tableCatalogId: String) {
      cdkBuilder.tableCatalogId(tableCatalogId)
    }

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataCellsFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataCellsFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter):
        CfnDataCellsFilter = CfnDataCellsFilter(cdkObject)

    internal fun unwrap(wrapped: CfnDataCellsFilter):
        software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter = wrapped.cdkObject
  }

  public interface ColumnWildcardProperty {
    public fun excludedColumnNames(): List<String> = unwrap(this).getExcludedColumnNames() ?:
        emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun excludedColumnNames(excludedColumnNames: List<String>)

      public fun excludedColumnNames(vararg excludedColumnNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty.builder()

      override fun excludedColumnNames(excludedColumnNames: List<String>) {
        cdkBuilder.excludedColumnNames(excludedColumnNames)
      }

      override fun excludedColumnNames(vararg excludedColumnNames: String): Unit =
          excludedColumnNames(excludedColumnNames.toList())

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty,
    ) : CdkObject(cdkObject), ColumnWildcardProperty {
      override fun excludedColumnNames(): List<String> = unwrap(this).getExcludedColumnNames() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnWildcardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty):
          ColumnWildcardProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnWildcardProperty):
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty
    }
  }

  public interface RowFilterProperty {
    public fun allRowsWildcard(): Any? = unwrap(this).getAllRowsWildcard()

    public fun filterExpression(): String? = unwrap(this).getFilterExpression()

    @CdkDslMarker
    public interface Builder {
      public fun allRowsWildcard(allRowsWildcard: Any)

      public fun filterExpression(filterExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty.builder()

      override fun allRowsWildcard(allRowsWildcard: Any) {
        cdkBuilder.allRowsWildcard(allRowsWildcard)
      }

      override fun filterExpression(filterExpression: String) {
        cdkBuilder.filterExpression(filterExpression)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty,
    ) : CdkObject(cdkObject), RowFilterProperty {
      override fun allRowsWildcard(): Any? = unwrap(this).getAllRowsWildcard()

      override fun filterExpression(): String? = unwrap(this).getFilterExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RowFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty):
          RowFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RowFilterProperty):
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty
    }
  }
}
