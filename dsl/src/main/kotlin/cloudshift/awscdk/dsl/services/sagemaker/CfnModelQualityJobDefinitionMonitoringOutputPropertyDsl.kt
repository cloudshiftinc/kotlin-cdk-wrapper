@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@CdkDslMarker
public class CfnModelQualityJobDefinitionMonitoringOutputPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.MonitoringOutputProperty.Builder =
      CfnModelQualityJobDefinition.MonitoringOutputProperty.builder()

  /**
   * @param s3Output The Amazon S3 storage location where the results of a monitoring job are saved.
   * 
   */
  public fun s3Output(s3Output: IResolvable) {
    cdkBuilder.s3Output(s3Output)
  }

  /**
   * @param s3Output The Amazon S3 storage location where the results of a monitoring job are saved.
   * 
   */
  public fun s3Output(s3Output: CfnModelQualityJobDefinition.S3OutputProperty) {
    cdkBuilder.s3Output(s3Output)
  }

  public fun build(): CfnModelQualityJobDefinition.MonitoringOutputProperty = cdkBuilder.build()
}
