@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy

@CdkDslMarker
public class CfnAccessPolicyAccessPolicyResourcePropertyDsl {
  private val cdkBuilder: CfnAccessPolicy.AccessPolicyResourceProperty.Builder =
      CfnAccessPolicy.AccessPolicyResourceProperty.builder()

  /**
   * @param portal The AWS IoT SiteWise Monitor portal for this access policy.
   */
  public fun portal(portal: IResolvable) {
    cdkBuilder.portal(portal)
  }

  /**
   * @param portal The AWS IoT SiteWise Monitor portal for this access policy.
   */
  public fun portal(portal: CfnAccessPolicy.PortalProperty) {
    cdkBuilder.portal(portal)
  }

  /**
   * @param project The AWS IoT SiteWise Monitor project for this access policy.
   */
  public fun project(project: IResolvable) {
    cdkBuilder.project(project)
  }

  /**
   * @param project The AWS IoT SiteWise Monitor project for this access policy.
   */
  public fun project(project: CfnAccessPolicy.ProjectProperty) {
    cdkBuilder.project(project)
  }

  public fun build(): CfnAccessPolicy.AccessPolicyResourceProperty = cdkBuilder.build()
}
