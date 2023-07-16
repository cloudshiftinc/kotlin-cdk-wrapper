@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot1click

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot1click.CfnProject
import software.amazon.awscdk.services.iot1click.CfnProjectProps

@CdkDslMarker
public class CfnProjectPropsDsl {
  private val cdkBuilder: CfnProjectProps.Builder = CfnProjectProps.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun placementTemplate(placementTemplate: IResolvable) {
    cdkBuilder.placementTemplate(placementTemplate)
  }

  public fun placementTemplate(placementTemplate: CfnProject.PlacementTemplateProperty) {
    cdkBuilder.placementTemplate(placementTemplate)
  }

  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  public fun build(): CfnProjectProps = cdkBuilder.build()
}
