@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.SecurityGroupImportOptions

@CdkDslMarker
public class SecurityGroupImportOptionsDsl {
  private val cdkBuilder: SecurityGroupImportOptions.Builder = SecurityGroupImportOptions.builder()

  public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
    cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
  }

  public fun allowAllOutbound(allowAllOutbound: Boolean) {
    cdkBuilder.allowAllOutbound(allowAllOutbound)
  }

  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  public fun build(): SecurityGroupImportOptions = cdkBuilder.build()
}
