@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetDatasetContentDeliveryRulePropertyDsl {
  private val cdkBuilder: CfnDataset.DatasetContentDeliveryRuleProperty.Builder =
      CfnDataset.DatasetContentDeliveryRuleProperty.builder()

  /**
   * @param destination The destination to which dataset contents are delivered. 
   */
  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destination The destination to which dataset contents are delivered. 
   */
  public fun destination(destination: CfnDataset.DatasetContentDeliveryRuleDestinationProperty) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param entryName The name of the dataset content delivery rules entry.
   */
  public fun entryName(entryName: String) {
    cdkBuilder.entryName(entryName)
  }

  public fun build(): CfnDataset.DatasetContentDeliveryRuleProperty = cdkBuilder.build()
}
