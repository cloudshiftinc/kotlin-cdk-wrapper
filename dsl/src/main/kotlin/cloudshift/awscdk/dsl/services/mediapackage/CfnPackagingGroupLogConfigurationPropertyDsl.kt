@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroup

@CdkDslMarker
public class CfnPackagingGroupLogConfigurationPropertyDsl {
  private val cdkBuilder: CfnPackagingGroup.LogConfigurationProperty.Builder =
      CfnPackagingGroup.LogConfigurationProperty.builder()

  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun build(): CfnPackagingGroup.LogConfigurationProperty = cdkBuilder.build()
}
