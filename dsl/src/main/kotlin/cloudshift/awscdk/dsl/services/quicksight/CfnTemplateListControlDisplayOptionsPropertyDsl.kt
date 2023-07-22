@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateListControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.ListControlDisplayOptionsProperty.Builder =
      CfnTemplate.ListControlDisplayOptionsProperty.builder()

  /**
   * @param searchOptions The configuration of the search options in a list control.
   */
  public fun searchOptions(searchOptions: IResolvable) {
    cdkBuilder.searchOptions(searchOptions)
  }

  /**
   * @param searchOptions The configuration of the search options in a list control.
   */
  public fun searchOptions(searchOptions: CfnTemplate.ListControlSearchOptionsProperty) {
    cdkBuilder.searchOptions(searchOptions)
  }

  /**
   * @param selectAllOptions The configuration of the `Select all` options in a list control.
   */
  public fun selectAllOptions(selectAllOptions: IResolvable) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  /**
   * @param selectAllOptions The configuration of the `Select all` options in a list control.
   */
  public fun selectAllOptions(selectAllOptions: CfnTemplate.ListControlSelectAllOptionsProperty) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  /**
   * @param titleOptions The options to configure the title visibility, name, and font size.
   */
  public fun titleOptions(titleOptions: IResolvable) {
    cdkBuilder.titleOptions(titleOptions)
  }

  /**
   * @param titleOptions The options to configure the title visibility, name, and font size.
   */
  public fun titleOptions(titleOptions: CfnTemplate.LabelOptionsProperty) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun build(): CfnTemplate.ListControlDisplayOptionsProperty = cdkBuilder.build()
}
