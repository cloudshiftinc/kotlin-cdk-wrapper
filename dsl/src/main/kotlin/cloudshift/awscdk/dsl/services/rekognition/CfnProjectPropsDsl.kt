@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rekognition.CfnProjectProps

/**
 * Properties for defining a `CfnProject`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rekognition.*;
 * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
 * .projectName("projectName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-project.html)
 */
@CdkDslMarker
public class CfnProjectPropsDsl {
  private val cdkBuilder: CfnProjectProps.Builder = CfnProjectProps.builder()

  /**
   * @param projectName The name of the project to create. 
   */
  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  public fun build(): CfnProjectProps = cdkBuilder.build()
}
