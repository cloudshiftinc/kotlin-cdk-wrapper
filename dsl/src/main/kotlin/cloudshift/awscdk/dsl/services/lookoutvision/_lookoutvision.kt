@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutvision

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lookoutvision.CfnProject
import software.amazon.awscdk.services.lookoutvision.CfnProjectProps
import software.constructs.Construct

public object lookoutvision {
  /**
   * The `AWS::LookoutVision::Project` type creates an Amazon Lookout for Vision project.
   *
   * A project is a grouping of the resources needed to create and manage an Amazon Lookout for
   * Vision model.
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
  public inline fun cfnProject(
    scope: Construct,
    id: String,
    block: CfnProjectDsl.() -> Unit = {},
  ): CfnProject {
    val builder = CfnProjectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnProject`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.lookoutvision.*;
   * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
   * .projectName("projectName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutvision-project.html)
   */
  public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
    val builder = CfnProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
