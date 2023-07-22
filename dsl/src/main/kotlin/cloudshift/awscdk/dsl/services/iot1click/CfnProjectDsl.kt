@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot1click

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot1click.CfnProject
import software.constructs.Construct

@CdkDslMarker
public class CfnProjectDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnProject.Builder = CfnProject.Builder.create(scope, id)

  /**
   * The description of the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-description)
   * @param description The description of the project. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * An object describing the project's placement specifications.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
   * @param placementTemplate An object describing the project's placement specifications. 
   */
  public fun placementTemplate(placementTemplate: IResolvable) {
    cdkBuilder.placementTemplate(placementTemplate)
  }

  /**
   * An object describing the project's placement specifications.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
   * @param placementTemplate An object describing the project's placement specifications. 
   */
  public fun placementTemplate(placementTemplate: CfnProject.PlacementTemplateProperty) {
    cdkBuilder.placementTemplate(placementTemplate)
  }

  /**
   * The name of the project from which to obtain information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-projectname)
   * @param projectName The name of the project from which to obtain information. 
   */
  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  public fun build(): CfnProject = cdkBuilder.build()
}
