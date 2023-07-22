@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps

@CdkDslMarker
public class CfnModuleVersionPropsDsl {
  private val cdkBuilder: CfnModuleVersionProps.Builder = CfnModuleVersionProps.builder()

  /**
   * @param moduleName The name of the module being registered. 
   */
  public fun moduleName(moduleName: String) {
    cdkBuilder.moduleName(moduleName)
  }

  /**
   * @param modulePackage A URL to the S3 bucket containing the package that contains the template
   * fragment and schema files for the module version to register. 
   *
   * The user registering the module version must be able to access the module package in the S3
   * bucket. That's, the user needs to have
   * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html) permissions for
   * the package. For more information, see [Actions, Resources, and Condition Keys for Amazon
   * S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html) in the *AWS Identity and
   * Access Management User Guide* .
   */
  public fun modulePackage(modulePackage: String) {
    cdkBuilder.modulePackage(modulePackage)
  }

  public fun build(): CfnModuleVersionProps = cdkBuilder.build()
}
