@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class TableLayout(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.TableLayout,
) {
  HORIZONTAL(software.amazon.awscdk.services.cloudwatch.TableLayout.HORIZONTAL),
  VERTICAL(software.amazon.awscdk.services.cloudwatch.TableLayout.VERTICAL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TableLayout):
        TableLayout = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.TableLayout.HORIZONTAL -> TableLayout.HORIZONTAL
      software.amazon.awscdk.services.cloudwatch.TableLayout.VERTICAL -> TableLayout.VERTICAL
    }

    internal fun unwrap(wrapped: TableLayout):
        software.amazon.awscdk.services.cloudwatch.TableLayout = wrapped.cdkObject
  }
}
