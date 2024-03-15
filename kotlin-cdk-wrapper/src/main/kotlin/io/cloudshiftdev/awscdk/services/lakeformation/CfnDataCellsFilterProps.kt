@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDataCellsFilterProps {
  public fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

  public fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

  public fun databaseName(): String

  public fun name(): String

  public fun rowFilter(): Any? = unwrap(this).getRowFilter()

  public fun tableCatalogId(): String

  public fun tableName(): String

  @CdkDslMarker
  public interface Builder {
    public fun columnNames(columnNames: List<String>)

    public fun columnNames(vararg columnNames: String)

    public fun columnWildcard(columnWildcard: IResolvable)

    public fun columnWildcard(columnWildcard: CfnDataCellsFilter.ColumnWildcardProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f493fb4633630bef8ff55c00d186076733406fe36738bc91425129e66c789b05")
    public
        fun columnWildcard(columnWildcard: CfnDataCellsFilter.ColumnWildcardProperty.Builder.() -> Unit)

    public fun databaseName(databaseName: String)

    public fun name(name: String)

    public fun rowFilter(rowFilter: IResolvable)

    public fun rowFilter(rowFilter: CfnDataCellsFilter.RowFilterProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adaca17dde5756c3fe017a23bde3fb1e4968dc6cd2d4984e64813e2ff470aeff")
    public fun rowFilter(rowFilter: CfnDataCellsFilter.RowFilterProperty.Builder.() -> Unit)

    public fun tableCatalogId(tableCatalogId: String)

    public fun tableName(tableName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps.builder()

    override fun columnNames(columnNames: List<String>) {
      cdkBuilder.columnNames(columnNames)
    }

    override fun columnNames(vararg columnNames: String): Unit = columnNames(columnNames.toList())

    override fun columnWildcard(columnWildcard: IResolvable) {
      cdkBuilder.columnWildcard(columnWildcard.let(IResolvable::unwrap))
    }

    override fun columnWildcard(columnWildcard: CfnDataCellsFilter.ColumnWildcardProperty) {
      cdkBuilder.columnWildcard(columnWildcard.let(CfnDataCellsFilter.ColumnWildcardProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f493fb4633630bef8ff55c00d186076733406fe36738bc91425129e66c789b05")
    override
        fun columnWildcard(columnWildcard: CfnDataCellsFilter.ColumnWildcardProperty.Builder.() -> Unit):
        Unit = columnWildcard(CfnDataCellsFilter.ColumnWildcardProperty(columnWildcard))

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun rowFilter(rowFilter: IResolvable) {
      cdkBuilder.rowFilter(rowFilter.let(IResolvable::unwrap))
    }

    override fun rowFilter(rowFilter: CfnDataCellsFilter.RowFilterProperty) {
      cdkBuilder.rowFilter(rowFilter.let(CfnDataCellsFilter.RowFilterProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adaca17dde5756c3fe017a23bde3fb1e4968dc6cd2d4984e64813e2ff470aeff")
    override fun rowFilter(rowFilter: CfnDataCellsFilter.RowFilterProperty.Builder.() -> Unit): Unit
        = rowFilter(CfnDataCellsFilter.RowFilterProperty(rowFilter))

    override fun tableCatalogId(tableCatalogId: String) {
      cdkBuilder.tableCatalogId(tableCatalogId)
    }

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps,
  ) : CdkObject(cdkObject), CfnDataCellsFilterProps {
    override fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

    override fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

    override fun databaseName(): String = unwrap(this).getDatabaseName()

    override fun name(): String = unwrap(this).getName()

    override fun rowFilter(): Any? = unwrap(this).getRowFilter()

    override fun tableCatalogId(): String = unwrap(this).getTableCatalogId()

    override fun tableName(): String = unwrap(this).getTableName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataCellsFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps):
        CfnDataCellsFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataCellsFilterProps):
        software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps
  }
}
