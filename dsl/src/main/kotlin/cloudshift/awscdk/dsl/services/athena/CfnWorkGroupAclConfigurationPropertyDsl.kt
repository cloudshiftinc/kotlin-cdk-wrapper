@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnWorkGroup

@CdkDslMarker
public class CfnWorkGroupAclConfigurationPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.AclConfigurationProperty.Builder =
      CfnWorkGroup.AclConfigurationProperty.builder()

  public fun s3AclOption(s3AclOption: String) {
    cdkBuilder.s3AclOption(s3AclOption)
  }

  public fun build(): CfnWorkGroup.AclConfigurationProperty = cdkBuilder.build()
}
