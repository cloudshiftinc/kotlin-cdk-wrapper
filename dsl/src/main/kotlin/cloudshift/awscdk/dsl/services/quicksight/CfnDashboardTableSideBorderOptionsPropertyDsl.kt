@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableSideBorderOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableSideBorderOptionsProperty.Builder =
      CfnDashboard.TableSideBorderOptionsProperty.builder()

  /**
   * @param bottom The table border options of the bottom border.
   */
  public fun bottom(bottom: IResolvable) {
    cdkBuilder.bottom(bottom)
  }

  /**
   * @param bottom The table border options of the bottom border.
   */
  public fun bottom(bottom: CfnDashboard.TableBorderOptionsProperty) {
    cdkBuilder.bottom(bottom)
  }

  /**
   * @param innerHorizontal The table border options of the inner horizontal border.
   */
  public fun innerHorizontal(innerHorizontal: IResolvable) {
    cdkBuilder.innerHorizontal(innerHorizontal)
  }

  /**
   * @param innerHorizontal The table border options of the inner horizontal border.
   */
  public fun innerHorizontal(innerHorizontal: CfnDashboard.TableBorderOptionsProperty) {
    cdkBuilder.innerHorizontal(innerHorizontal)
  }

  /**
   * @param innerVertical The table border options of the inner vertical border.
   */
  public fun innerVertical(innerVertical: IResolvable) {
    cdkBuilder.innerVertical(innerVertical)
  }

  /**
   * @param innerVertical The table border options of the inner vertical border.
   */
  public fun innerVertical(innerVertical: CfnDashboard.TableBorderOptionsProperty) {
    cdkBuilder.innerVertical(innerVertical)
  }

  /**
   * @param left The table border options of the left border.
   */
  public fun left(left: IResolvable) {
    cdkBuilder.left(left)
  }

  /**
   * @param left The table border options of the left border.
   */
  public fun left(left: CfnDashboard.TableBorderOptionsProperty) {
    cdkBuilder.left(left)
  }

  /**
   * @param right The table border options of the right border.
   */
  public fun right(right: IResolvable) {
    cdkBuilder.right(right)
  }

  /**
   * @param right The table border options of the right border.
   */
  public fun right(right: CfnDashboard.TableBorderOptionsProperty) {
    cdkBuilder.right(right)
  }

  /**
   * @param top The table border options of the top border.
   */
  public fun top(top: IResolvable) {
    cdkBuilder.top(top)
  }

  /**
   * @param top The table border options of the top border.
   */
  public fun top(top: CfnDashboard.TableBorderOptionsProperty) {
    cdkBuilder.top(top)
  }

  public fun build(): CfnDashboard.TableSideBorderOptionsProperty = cdkBuilder.build()
}
