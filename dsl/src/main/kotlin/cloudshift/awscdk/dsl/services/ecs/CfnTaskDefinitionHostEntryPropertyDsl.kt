@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionHostEntryPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.HostEntryProperty.Builder =
      CfnTaskDefinition.HostEntryProperty.builder()

  /**
   * @param hostname The hostname to use in the `/etc/hosts` entry.
   */
  public fun hostname(hostname: String) {
    cdkBuilder.hostname(hostname)
  }

  /**
   * @param ipAddress The IP address to use in the `/etc/hosts` entry.
   */
  public fun ipAddress(ipAddress: String) {
    cdkBuilder.ipAddress(ipAddress)
  }

  public fun build(): CfnTaskDefinition.HostEntryProperty = cdkBuilder.build()
}
