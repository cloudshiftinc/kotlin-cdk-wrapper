@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.ExportValueOptions

@CdkDslMarker
public class ExportValueOptionsDsl {
  private val cdkBuilder: ExportValueOptions.Builder = ExportValueOptions.builder()

  /**
   * @param name The name of the export to create.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): ExportValueOptions = cdkBuilder.build()
}
