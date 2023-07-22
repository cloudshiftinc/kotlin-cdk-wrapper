@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnHookVersion
import software.amazon.awscdk.IResolvable
import software.constructs.Construct

/**
 * The `HookVersion` resource publishes new or first hook version to the AWS CloudFormation
 * registry.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnHookVersion cfnHookVersion = CfnHookVersion.Builder.create(this, "MyCfnHookVersion")
 * .schemaHandlerPackage("schemaHandlerPackage")
 * .typeName("typeName")
 * // the properties below are optional
 * .executionRoleArn("executionRoleArn")
 * .loggingConfig(LoggingConfigProperty.builder()
 * .logGroupName("logGroupName")
 * .logRoleArn("logRoleArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html)
 */
@CdkDslMarker
public class CfnHookVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnHookVersion.Builder = CfnHookVersion.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the task execution role that grants the hook permission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-executionrolearn)
   * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution role that grants
   * the hook permission. 
   */
  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  /**
   * Contains logging configuration information for an extension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-loggingconfig)
   * @param loggingConfig Contains logging configuration information for an extension. 
   */
  public fun loggingConfig(loggingConfig: CfnHookVersion.LoggingConfigProperty) {
    cdkBuilder.loggingConfig(loggingConfig)
  }

  /**
   * Contains logging configuration information for an extension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-loggingconfig)
   * @param loggingConfig Contains logging configuration information for an extension. 
   */
  public fun loggingConfig(loggingConfig: IResolvable) {
    cdkBuilder.loggingConfig(loggingConfig)
  }

  /**
   * A URL to the Amazon S3 bucket containing the hook project package that contains the necessary
   * files for the hook you want to register.
   *
   * For information on generating a schema handler package for the resource you want to register,
   * see
   * [submit](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html)
   * in the *CloudFormation CLI User Guide for Extension Development* .
   *
   *
   * The user registering the resource must be able to access the package in the S3 bucket. That's,
   * the user must have [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html)
   * permissions for the schema handler package. For more information, see [Actions, Resources, and
   * Condition Keys for Amazon S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html)
   * in the *AWS Identity and Access Management User Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-schemahandlerpackage)
   * @param schemaHandlerPackage A URL to the Amazon S3 bucket containing the hook project package
   * that contains the necessary files for the hook you want to register. 
   */
  public fun schemaHandlerPackage(schemaHandlerPackage: String) {
    cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
  }

  /**
   * The unique name for your hook.
   *
   * Specifies a three-part namespace for your hook, with a recommended pattern of
   * `Organization::Service::Hook` .
   *
   *
   * The following organization namespaces are reserved and can't be used in your hook type names:
   *
   * * `Alexa`
   * * `AMZN`
   * * `Amazon`
   * * `ASK`
   * * `AWS`
   * * `Custom`
   * * `Dev`
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-typename)
   * @param typeName The unique name for your hook. 
   */
  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun build(): CfnHookVersion = cdkBuilder.build()
}
