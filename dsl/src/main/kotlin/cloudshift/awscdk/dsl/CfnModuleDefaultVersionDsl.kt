@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnModuleDefaultVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnModuleDefaultVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnModuleDefaultVersion.Builder =
      CfnModuleDefaultVersion.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the module version to set as the default version.
   *
   * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-arn)
   * @param arn The Amazon Resource Name (ARN) of the module version to set as the default version. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * The name of the module.
   *
   * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-modulename)
   * @param moduleName The name of the module. 
   */
  public fun moduleName(moduleName: String) {
    cdkBuilder.moduleName(moduleName)
  }

  /**
   * The ID for the specific version of the module.
   *
   * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-versionid)
   * @param versionId The ID for the specific version of the module. 
   */
  public fun versionId(versionId: String) {
    cdkBuilder.versionId(versionId)
  }

  public fun build(): CfnModuleDefaultVersion = cdkBuilder.build()
}
