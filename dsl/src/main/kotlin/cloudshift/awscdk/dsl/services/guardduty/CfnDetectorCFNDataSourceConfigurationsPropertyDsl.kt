@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector

/**
 * Describes whether S3 data event logs, Kubernetes audit logs, or Malware Protection will be
 * enabled as a data source when the detector is created.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * CFNDataSourceConfigurationsProperty cFNDataSourceConfigurationsProperty =
 * CFNDataSourceConfigurationsProperty.builder()
 * .kubernetes(CFNKubernetesConfigurationProperty.builder()
 * .auditLogs(CFNKubernetesAuditLogsConfigurationProperty.builder()
 * .enable(false)
 * .build())
 * .build())
 * .malwareProtection(CFNMalwareProtectionConfigurationProperty.builder()
 * .scanEc2InstanceWithFindings(CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()
 * .ebsVolumes(false)
 * .build())
 * .build())
 * .s3Logs(CFNS3LogsConfigurationProperty.builder()
 * .enable(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfndatasourceconfigurations.html)
 */
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
