@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface TableSummaryProps {
  public fun columns(): List<TableSummaryColumn> =
      unwrap(this).getColumns()?.map(TableSummaryColumn::wrap) ?: emptyList()

  public fun hideNonSummaryColumns(): Boolean? = unwrap(this).getHideNonSummaryColumns()

  public fun sticky(): Boolean? = unwrap(this).getSticky()

  @CdkDslMarker
  public interface Builder {
    public fun columns(columns: List<TableSummaryColumn>)

    public fun columns(vararg columns: TableSummaryColumn)

    public fun hideNonSummaryColumns(hideNonSummaryColumns: Boolean)

    public fun sticky(sticky: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.TableSummaryProps.Builder =
        software.amazon.awscdk.services.cloudwatch.TableSummaryProps.builder()

    override fun columns(columns: List<TableSummaryColumn>) {
      cdkBuilder.columns(columns.map(TableSummaryColumn::unwrap))
    }

    override fun columns(vararg columns: TableSummaryColumn): Unit = columns(columns.toList())

    override fun hideNonSummaryColumns(hideNonSummaryColumns: Boolean) {
      cdkBuilder.hideNonSummaryColumns(hideNonSummaryColumns)
    }

    override fun sticky(sticky: Boolean) {
      cdkBuilder.sticky(sticky)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.TableSummaryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.TableSummaryProps,
  ) : CdkObject(cdkObject), TableSummaryProps {
    override fun columns(): List<TableSummaryColumn> =
        unwrap(this).getColumns()?.map(TableSummaryColumn::wrap) ?: emptyList()

    override fun hideNonSummaryColumns(): Boolean? = unwrap(this).getHideNonSummaryColumns()

    override fun sticky(): Boolean? = unwrap(this).getSticky()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TableSummaryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TableSummaryProps):
        TableSummaryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableSummaryProps):
        software.amazon.awscdk.services.cloudwatch.TableSummaryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.TableSummaryProps
  }
}
