@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.grafana

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.grafana.CfnWorkspace

@CdkDslMarker
public class CfnWorkspaceAssertionAttributesPropertyDsl {
  private val cdkBuilder: CfnWorkspace.AssertionAttributesProperty.Builder =
      CfnWorkspace.AssertionAttributesProperty.builder()

  public fun email(email: String) {
    cdkBuilder.email(email)
  }

  public fun groups(groups: String) {
    cdkBuilder.groups(groups)
  }

  public fun login(login: String) {
    cdkBuilder.login(login)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun org(org: String) {
    cdkBuilder.org(org)
  }

  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  public fun build(): CfnWorkspace.AssertionAttributesProperty = cdkBuilder.build()
}
