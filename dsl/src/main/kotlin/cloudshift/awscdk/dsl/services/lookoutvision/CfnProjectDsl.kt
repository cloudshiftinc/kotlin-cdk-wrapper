@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutvision

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutvision.CfnProject
import software.constructs.Construct

/**
 * The `AWS::LookoutVision::Project` type creates an Amazon Lookout for Vision project.
 *
 * A project is a grouping of the resources needed to create and manage an Amazon Lookout for Vision
 * model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutvision.*;
 * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
 * .projectName("projectName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutvision-project.html)
 */
@CdkDslMarker
public class CfnProjectDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnProject.Builder = CfnProject.Builder.create(scope, id)

  /**
   * The name of the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutvision-project.html#cfn-lookoutvision-project-projectname)
   * @param projectName The name of the project. 
   */
  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  public fun build(): CfnProject = cdkBuilder.build()
}
