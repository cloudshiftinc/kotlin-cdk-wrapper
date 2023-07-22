@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetDatasetContentDeliveryRuleDestinationPropertyDsl {
  private val cdkBuilder: CfnDataset.DatasetContentDeliveryRuleDestinationProperty.Builder =
      CfnDataset.DatasetContentDeliveryRuleDestinationProperty.builder()

  /**
   * @param iotEventsDestinationConfiguration Configuration information for delivery of dataset
   * contents to AWS IoT Events .
   */
  public fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IResolvable) {
    cdkBuilder.iotEventsDestinationConfiguration(iotEventsDestinationConfiguration)
  }

  /**
   * @param iotEventsDestinationConfiguration Configuration information for delivery of dataset
   * contents to AWS IoT Events .
   */
  public
      fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: CfnDataset.IotEventsDestinationConfigurationProperty) {
    cdkBuilder.iotEventsDestinationConfiguration(iotEventsDestinationConfiguration)
  }

  /**
   * @param s3DestinationConfiguration Configuration information for delivery of dataset contents to
   * Amazon S3.
   */
  public fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable) {
    cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration)
  }

  /**
   * @param s3DestinationConfiguration Configuration information for delivery of dataset contents to
   * Amazon S3.
   */
  public
      fun s3DestinationConfiguration(s3DestinationConfiguration: CfnDataset.S3DestinationConfigurationProperty) {
    cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration)
  }

  public fun build(): CfnDataset.DatasetContentDeliveryRuleDestinationProperty = cdkBuilder.build()
}
