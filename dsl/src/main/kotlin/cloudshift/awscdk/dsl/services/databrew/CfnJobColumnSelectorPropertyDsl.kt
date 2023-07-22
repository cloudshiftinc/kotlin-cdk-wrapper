@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobColumnSelectorPropertyDsl {
  private val cdkBuilder: CfnJob.ColumnSelectorProperty.Builder =
      CfnJob.ColumnSelectorProperty.builder()

  /**
   * @param name The name of a column from a dataset.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param regex A regular expression for selecting a column from a dataset.
   */
  public fun regex(regex: String) {
    cdkBuilder.regex(regex)
  }

  public fun build(): CfnJob.ColumnSelectorProperty = cdkBuilder.build()
}
