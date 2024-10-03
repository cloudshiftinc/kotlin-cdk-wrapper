@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for TableWidget's summary columns.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * dashboard.addWidgets(TableWidget.Builder.create()
 * // ...
 * .summary(TableSummaryProps.builder()
 * .columns(List.of(TableSummaryColumn.AVERAGE))
 * .hideNonSummaryColumns(true)
 * .sticky(true)
 * .build())
 * .build());
 * ```
 */
public interface TableSummaryProps {
  /**
   * Summary columns.
   *
   * Default: - No summary columns will be shown
   */
  public fun columns(): List<TableSummaryColumn> =
      unwrap(this).getColumns()?.map(TableSummaryColumn::wrap) ?: emptyList()

  /**
   * Prevent the columns of datapoints from being displayed, so that only the label and summary
   * columns are displayed.
   *
   * Default: - false
   */
  public fun hideNonSummaryColumns(): Boolean? = unwrap(this).getHideNonSummaryColumns()

  /**
   * Make the summary columns sticky, so that they remain in view while scrolling.
   *
   * Default: - false
   */
  public fun sticky(): Boolean? = unwrap(this).getSticky()

  /**
   * A builder for [TableSummaryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param columns Summary columns.
     */
    public fun columns(columns: List<TableSummaryColumn>)

    /**
     * @param columns Summary columns.
     */
    public fun columns(vararg columns: TableSummaryColumn)

    /**
     * @param hideNonSummaryColumns Prevent the columns of datapoints from being displayed, so that
     * only the label and summary columns are displayed.
     */
    public fun hideNonSummaryColumns(hideNonSummaryColumns: Boolean)

    /**
     * @param sticky Make the summary columns sticky, so that they remain in view while scrolling.
     */
    public fun sticky(sticky: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.TableSummaryProps.Builder =
        software.amazon.awscdk.services.cloudwatch.TableSummaryProps.builder()

    /**
     * @param columns Summary columns.
     */
    override fun columns(columns: List<TableSummaryColumn>) {
      cdkBuilder.columns(columns.map(TableSummaryColumn.Companion::unwrap))
    }

    /**
     * @param columns Summary columns.
     */
    override fun columns(vararg columns: TableSummaryColumn): Unit = columns(columns.toList())

    /**
     * @param hideNonSummaryColumns Prevent the columns of datapoints from being displayed, so that
     * only the label and summary columns are displayed.
     */
    override fun hideNonSummaryColumns(hideNonSummaryColumns: Boolean) {
      cdkBuilder.hideNonSummaryColumns(hideNonSummaryColumns)
    }

    /**
     * @param sticky Make the summary columns sticky, so that they remain in view while scrolling.
     */
    override fun sticky(sticky: Boolean) {
      cdkBuilder.sticky(sticky)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.TableSummaryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.TableSummaryProps,
  ) : CdkObject(cdkObject),
      TableSummaryProps {
    /**
     * Summary columns.
     *
     * Default: - No summary columns will be shown
     */
    override fun columns(): List<TableSummaryColumn> =
        unwrap(this).getColumns()?.map(TableSummaryColumn::wrap) ?: emptyList()

    /**
     * Prevent the columns of datapoints from being displayed, so that only the label and summary
     * columns are displayed.
     *
     * Default: - false
     */
    override fun hideNonSummaryColumns(): Boolean? = unwrap(this).getHideNonSummaryColumns()

    /**
     * Make the summary columns sticky, so that they remain in view while scrolling.
     *
     * Default: - false
     */
    override fun sticky(): Boolean? = unwrap(this).getSticky()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TableSummaryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TableSummaryProps):
        TableSummaryProps = CdkObjectWrappers.wrap(cdkObject) as? TableSummaryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableSummaryProps):
        software.amazon.awscdk.services.cloudwatch.TableSummaryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.TableSummaryProps
  }
}
