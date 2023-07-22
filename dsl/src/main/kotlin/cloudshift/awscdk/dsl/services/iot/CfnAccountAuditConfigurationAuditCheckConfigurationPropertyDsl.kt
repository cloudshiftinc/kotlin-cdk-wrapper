@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration

/**
 * Which audit checks are enabled and disabled for this account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * AuditCheckConfigurationProperty auditCheckConfigurationProperty =
 * AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfiguration.html)
 */
@CdkDslMarker
public class CfnAccountAuditConfigurationAuditCheckConfigurationPropertyDsl {
  private val cdkBuilder: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty.Builder =
      CfnAccountAuditConfiguration.AuditCheckConfigurationProperty.builder()

  /**
   * @param enabled True if this audit check is enabled for this account.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled True if this audit check is enabled for this account.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnAccountAuditConfiguration.AuditCheckConfigurationProperty =
      cdkBuilder.build()
}
