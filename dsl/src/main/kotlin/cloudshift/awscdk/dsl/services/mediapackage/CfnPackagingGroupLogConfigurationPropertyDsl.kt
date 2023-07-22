@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroup

@CdkDslMarker
public class CfnPackagingGroupLogConfigurationPropertyDsl {
  private val cdkBuilder: CfnPackagingGroup.LogConfigurationProperty.Builder =
      CfnPackagingGroup.LogConfigurationProperty.builder()

  /**
   * @param logGroupName Sets a custom Amazon CloudWatch log group name for egress logs.
   * If a log group name isn't specified, the default name is used:
   * /aws/MediaPackage/EgressAccessLogs.
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun build(): CfnPackagingGroup.LogConfigurationProperty = cdkBuilder.build()
}
