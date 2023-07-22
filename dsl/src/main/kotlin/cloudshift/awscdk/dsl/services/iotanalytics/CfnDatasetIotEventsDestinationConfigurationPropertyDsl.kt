@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetIotEventsDestinationConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataset.IotEventsDestinationConfigurationProperty.Builder =
      CfnDataset.IotEventsDestinationConfigurationProperty.builder()

  /**
   * @param inputName The name of the AWS IoT Events input to which dataset contents are delivered. 
   */
  public fun inputName(inputName: String) {
    cdkBuilder.inputName(inputName)
  }

  /**
   * @param roleArn The ARN of the role that grants AWS IoT Analytics permission to deliver dataset
   * contents to an AWS IoT Events input. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnDataset.IotEventsDestinationConfigurationProperty = cdkBuilder.build()
}
