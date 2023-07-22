@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnHookVersion
import software.amazon.awscdk.CfnHookVersionProps
import software.amazon.awscdk.IResolvable

/**
 * Properties for defining a `CfnHookVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnHookVersionProps cfnHookVersionProps = CfnHookVersionProps.builder()
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
public class CfnHookVersionPropsDsl {
  private val cdkBuilder: CfnHookVersionProps.Builder = CfnHookVersionProps.builder()

  /**
   * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution role that grants
   * the hook permission.
   */
  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  /**
   * @param loggingConfig Contains logging configuration information for an extension.
   */
  public fun loggingConfig(loggingConfig: CfnHookVersion.LoggingConfigProperty) {
    cdkBuilder.loggingConfig(loggingConfig)
  }

  /**
   * @param loggingConfig Contains logging configuration information for an extension.
   */
  public fun loggingConfig(loggingConfig: IResolvable) {
    cdkBuilder.loggingConfig(loggingConfig)
  }

  /**
   * @param schemaHandlerPackage A URL to the Amazon S3 bucket containing the hook project package
   * that contains the necessary files for the hook you want to register. 
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
   */
  public fun schemaHandlerPackage(schemaHandlerPackage: String) {
    cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
  }

  /**
   * @param typeName The unique name for your hook. 
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
   */
  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun build(): CfnHookVersionProps = cdkBuilder.build()
}
