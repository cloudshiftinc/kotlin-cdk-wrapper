@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

@CdkDslMarker
public class CfnDatasetJsonOptionsPropertyDsl {
  private val cdkBuilder: CfnDataset.JsonOptionsProperty.Builder =
      CfnDataset.JsonOptionsProperty.builder()

  /**
   * @param multiLine A value that specifies whether JSON input contains embedded new line
   * characters.
   */
  public fun multiLine(multiLine: Boolean) {
    cdkBuilder.multiLine(multiLine)
  }

  /**
   * @param multiLine A value that specifies whether JSON input contains embedded new line
   * characters.
   */
  public fun multiLine(multiLine: IResolvable) {
    cdkBuilder.multiLine(multiLine)
  }

  public fun build(): CfnDataset.JsonOptionsProperty = cdkBuilder.build()
}
