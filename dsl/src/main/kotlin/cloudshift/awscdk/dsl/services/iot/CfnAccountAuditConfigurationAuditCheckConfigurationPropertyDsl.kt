@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration

@CdkDslMarker
public class CfnAccountAuditConfigurationAuditCheckConfigurationPropertyDsl {
  private val cdkBuilder: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty.Builder =
      CfnAccountAuditConfiguration.AuditCheckConfigurationProperty.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnAccountAuditConfiguration.AuditCheckConfigurationProperty =
      cdkBuilder.build()
}
