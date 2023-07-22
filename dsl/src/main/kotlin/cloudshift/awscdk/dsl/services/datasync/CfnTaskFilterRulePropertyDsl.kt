@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnTask

@CdkDslMarker
public class CfnTaskFilterRulePropertyDsl {
  private val cdkBuilder: CfnTask.FilterRuleProperty.Builder = CfnTask.FilterRuleProperty.builder()

  /**
   * @param filterType The type of filter rule to apply.
   * AWS DataSync only supports the SIMPLE_PATTERN rule type.
   */
  public fun filterType(filterType: String) {
    cdkBuilder.filterType(filterType)
  }

  /**
   * @param value A single filter string that consists of the patterns to include or exclude.
   * The patterns are delimited by "|" (that is, a pipe), for example: `/folder1|/folder2`
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTask.FilterRuleProperty = cdkBuilder.build()
}
