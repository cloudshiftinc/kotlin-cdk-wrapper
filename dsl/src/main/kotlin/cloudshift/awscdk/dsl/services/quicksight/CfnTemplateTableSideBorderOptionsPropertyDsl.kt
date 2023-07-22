@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableSideBorderOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableSideBorderOptionsProperty.Builder =
      CfnTemplate.TableSideBorderOptionsProperty.builder()

  /**
   * @param bottom The table border options of the bottom border.
   */
  public fun bottom(bottom: IResolvable) {
    cdkBuilder.bottom(bottom)
  }

  /**
   * @param bottom The table border options of the bottom border.
   */
  public fun bottom(bottom: CfnTemplate.TableBorderOptionsProperty) {
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
  public fun innerHorizontal(innerHorizontal: CfnTemplate.TableBorderOptionsProperty) {
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
  public fun innerVertical(innerVertical: CfnTemplate.TableBorderOptionsProperty) {
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
  public fun left(left: CfnTemplate.TableBorderOptionsProperty) {
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
  public fun right(right: CfnTemplate.TableBorderOptionsProperty) {
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
  public fun top(top: CfnTemplate.TableBorderOptionsProperty) {
    cdkBuilder.top(top)
  }

  public fun build(): CfnTemplate.TableSideBorderOptionsProperty = cdkBuilder.build()
}
