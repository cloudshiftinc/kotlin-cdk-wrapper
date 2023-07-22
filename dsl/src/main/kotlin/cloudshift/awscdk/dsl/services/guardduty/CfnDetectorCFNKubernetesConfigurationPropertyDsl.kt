@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector

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
