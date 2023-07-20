@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector

@CdkDslMarker
public class CfnDetectorCFNKubernetesConfigurationPropertyDsl {
  private val cdkBuilder: CfnDetector.CFNKubernetesConfigurationProperty.Builder =
      CfnDetector.CFNKubernetesConfigurationProperty.builder()

  public fun auditLogs(auditLogs: IResolvable) {
    cdkBuilder.auditLogs(auditLogs)
  }

  public fun auditLogs(auditLogs: CfnDetector.CFNKubernetesAuditLogsConfigurationProperty) {
    cdkBuilder.auditLogs(auditLogs)
  }

  public fun build(): CfnDetector.CFNKubernetesConfigurationProperty = cdkBuilder.build()
}
