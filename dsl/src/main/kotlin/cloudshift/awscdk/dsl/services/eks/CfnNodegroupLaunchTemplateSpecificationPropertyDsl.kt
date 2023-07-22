@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CfnNodegroup

@CdkDslMarker
public class CfnNodegroupLaunchTemplateSpecificationPropertyDsl {
  private val cdkBuilder: CfnNodegroup.LaunchTemplateSpecificationProperty.Builder =
      CfnNodegroup.LaunchTemplateSpecificationProperty.builder()

  /**
   * @param id The ID of the launch template.
   * You must specify either the launch template ID or the launch template name in the request, but
   * not both.
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param name The name of the launch template.
   * You must specify either the launch template name or the launch template ID in the request, but
   * not both.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param version The version number of the launch template to use.
   * If no version is specified, then the template's default version is used.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnNodegroup.LaunchTemplateSpecificationProperty = cdkBuilder.build()
}
