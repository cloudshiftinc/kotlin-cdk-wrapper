@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector

/**
 * Describes which Kubernetes protection data sources are enabled for the detector.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * CFNKubernetesConfigurationProperty cFNKubernetesConfigurationProperty =
 * CFNKubernetesConfigurationProperty.builder()
 * .auditLogs(CFNKubernetesAuditLogsConfigurationProperty.builder()
 * .enable(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnkubernetesconfiguration.html)
 */
@CdkDslMarker
public class CfnDetectorCFNKubernetesConfigurationPropertyDsl {
  private val cdkBuilder: CfnDetector.CFNKubernetesConfigurationProperty.Builder =
      CfnDetector.CFNKubernetesConfigurationProperty.builder()

  /**
   * @param auditLogs Describes whether Kubernetes audit logs are enabled as a data source for the
   * detector.
   */
  public fun auditLogs(auditLogs: IResolvable) {
    cdkBuilder.auditLogs(auditLogs)
  }

  /**
   * @param auditLogs Describes whether Kubernetes audit logs are enabled as a data source for the
   * detector.
   */
  public fun auditLogs(auditLogs: CfnDetector.CFNKubernetesAuditLogsConfigurationProperty) {
    cdkBuilder.auditLogs(auditLogs)
  }

  public fun build(): CfnDetector.CFNKubernetesConfigurationProperty = cdkBuilder.build()
}
