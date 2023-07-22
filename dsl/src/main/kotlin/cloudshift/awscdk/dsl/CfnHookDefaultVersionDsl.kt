@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnHookDefaultVersion
import software.constructs.Construct

/**
 * The `HookDefaultVersion` resource specifies the default version of the hook.
 *
 * The default version of the hook is used in CloudFormation operations for this AWS account and AWS
 * Region .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnHookDefaultVersion cfnHookDefaultVersion = CfnHookDefaultVersion.Builder.create(this,
 * "MyCfnHookDefaultVersion")
 * .typeName("typeName")
 * .typeVersionArn("typeVersionArn")
 * .versionId("versionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html)
 */
@CdkDslMarker
public class CfnHookDefaultVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnHookDefaultVersion.Builder =
      CfnHookDefaultVersion.Builder.create(scope, id)

  /**
   * The name of the hook.
   *
   * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-typename)
   * @param typeName The name of the hook. 
   */
  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  /**
   * The version ID of the type configuration.
   *
   * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-typeversionarn)
   * @param typeVersionArn The version ID of the type configuration. 
   */
  public fun typeVersionArn(typeVersionArn: String) {
    cdkBuilder.typeVersionArn(typeVersionArn)
  }

  /**
   * The version ID of the type specified.
   *
   * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-versionid)
   * @param versionId The version ID of the type specified. 
   */
  public fun versionId(versionId: String) {
    cdkBuilder.versionId(versionId)
  }

  public fun build(): CfnHookDefaultVersion = cdkBuilder.build()
}
