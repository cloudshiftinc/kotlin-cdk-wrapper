@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector

@CdkDslMarker
public class CfnDetectorCFNDataSourceConfigurationsPropertyDsl {
  private val cdkBuilder: CfnDetector.CFNDataSourceConfigurationsProperty.Builder =
      CfnDetector.CFNDataSourceConfigurationsProperty.builder()

  /**
   * @param kubernetes Describes which Kubernetes data sources are enabled for a detector.
   */
  public fun kubernetes(kubernetes: IResolvable) {
    cdkBuilder.kubernetes(kubernetes)
  }

  /**
   * @param kubernetes Describes which Kubernetes data sources are enabled for a detector.
   */
  public fun kubernetes(kubernetes: CfnDetector.CFNKubernetesConfigurationProperty) {
    cdkBuilder.kubernetes(kubernetes)
  }

  /**
   * @param malwareProtection Describes whether Malware Protection will be enabled as a data source.
   */
  public fun malwareProtection(malwareProtection: IResolvable) {
    cdkBuilder.malwareProtection(malwareProtection)
  }

  /**
   * @param malwareProtection Describes whether Malware Protection will be enabled as a data source.
   */
  public
      fun malwareProtection(malwareProtection: CfnDetector.CFNMalwareProtectionConfigurationProperty) {
    cdkBuilder.malwareProtection(malwareProtection)
  }

  /**
   * @param s3Logs Describes whether S3 data event logs are enabled as a data source.
   */
  public fun s3Logs(s3Logs: IResolvable) {
    cdkBuilder.s3Logs(s3Logs)
  }

  /**
   * @param s3Logs Describes whether S3 data event logs are enabled as a data source.
   */
  public fun s3Logs(s3Logs: CfnDetector.CFNS3LogsConfigurationProperty) {
    cdkBuilder.s3Logs(s3Logs)
  }

  public fun build(): CfnDetector.CFNDataSourceConfigurationsProperty = cdkBuilder.build()
}
