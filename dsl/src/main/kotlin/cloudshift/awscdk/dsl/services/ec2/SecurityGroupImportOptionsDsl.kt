@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.SecurityGroupImportOptions

@CdkDslMarker
public class SecurityGroupImportOptionsDsl {
  private val cdkBuilder: SecurityGroupImportOptions.Builder = SecurityGroupImportOptions.builder()

  /**
   * @param allowAllIpv6Outbound Mark the SecurityGroup as having been created allowing all outbound
   * ipv6 traffic.
   * Only if this is set to false will egress rules for ipv6 be added to this security
   * group. Be aware, this would undo any potential "all outbound traffic"
   * default.
   */
  public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
    cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
  }

  /**
   * @param allowAllOutbound Mark the SecurityGroup as having been created allowing all outbound
   * traffic.
   * Only if this is set to false will egress rules be added to this security
   * group. Be aware, this would undo any potential "all outbound traffic"
   * default.
   */
  public fun allowAllOutbound(allowAllOutbound: Boolean) {
    cdkBuilder.allowAllOutbound(allowAllOutbound)
  }

  /**
   * @param mutable If a SecurityGroup is mutable CDK can add rules to existing groups.
   * Beware that making a SecurityGroup immutable might lead to issue
   * due to missing ingress/egress rules for new resources.
   */
  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  public fun build(): SecurityGroupImportOptions = cdkBuilder.build()
}
