@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy

@CdkDslMarker
public class CfnAccessPolicyAccessPolicyResourcePropertyDsl {
  private val cdkBuilder: CfnAccessPolicy.AccessPolicyResourceProperty.Builder =
      CfnAccessPolicy.AccessPolicyResourceProperty.builder()

  public fun portal(portal: IResolvable) {
    cdkBuilder.portal(portal)
  }

  public fun portal(portal: CfnAccessPolicy.PortalProperty) {
    cdkBuilder.portal(portal)
  }

  public fun project(project: IResolvable) {
    cdkBuilder.project(project)
  }

  public fun project(project: CfnAccessPolicy.ProjectProperty) {
    cdkBuilder.project(project)
  }

  public fun build(): CfnAccessPolicy.AccessPolicyResourceProperty = cdkBuilder.build()
}
