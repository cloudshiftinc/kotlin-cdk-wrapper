@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnDataset

@CdkDslMarker
public class CfnDatasetMetadataPropertyDsl {
  private val cdkBuilder: CfnDataset.MetadataProperty.Builder =
      CfnDataset.MetadataProperty.builder()

  /**
   * @param sourceArn The Amazon Resource Name (ARN) associated with the dataset.
   * Currently, DataBrew only supports ARNs from Amazon AppFlow.
   */
  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  public fun build(): CfnDataset.MetadataProperty = cdkBuilder.build()
}
