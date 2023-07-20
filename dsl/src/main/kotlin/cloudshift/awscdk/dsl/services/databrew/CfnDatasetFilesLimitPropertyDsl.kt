@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnDataset

@CdkDslMarker
public class CfnDatasetFilesLimitPropertyDsl {
  private val cdkBuilder: CfnDataset.FilesLimitProperty.Builder =
      CfnDataset.FilesLimitProperty.builder()

  public fun maxFiles(maxFiles: Number) {
    cdkBuilder.maxFiles(maxFiles)
  }

  public fun order(order: String) {
    cdkBuilder.order(order)
  }

  public fun orderedBy(orderedBy: String) {
    cdkBuilder.orderedBy(orderedBy)
  }

  public fun build(): CfnDataset.FilesLimitProperty = cdkBuilder.build()
}
