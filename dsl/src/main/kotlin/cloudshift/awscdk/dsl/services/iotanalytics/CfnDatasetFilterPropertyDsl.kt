@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetFilterPropertyDsl {
  private val cdkBuilder: CfnDataset.FilterProperty.Builder = CfnDataset.FilterProperty.builder()

  public fun deltaTime(deltaTime: IResolvable) {
    cdkBuilder.deltaTime(deltaTime)
  }

  public fun deltaTime(deltaTime: CfnDataset.DeltaTimeProperty) {
    cdkBuilder.deltaTime(deltaTime)
  }

  public fun build(): CfnDataset.FilterProperty = cdkBuilder.build()
}
