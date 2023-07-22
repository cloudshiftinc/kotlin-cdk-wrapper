@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudformation.CfnResourceVersion
import software.constructs.Construct

/**
 * Registers a resource version with the CloudFormation service.
 *
 * Registering a resource version makes it available for use in CloudFormation templates in your AWS
 * account , and includes:
 *
 * * Validating the resource schema.
 * * Determining which handlers, if any, have been specified for the resource.
 * * Making the resource available for use in your account.
 *
 * For more information on how to develop resources and ready them for registration, see [Creating
 * Resource
 * Providers](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-types.html) in
 * the *CloudFormation CLI User Guide* .
 *
 * You can have a maximum of 50 resource versions registered at a time. This maximum is per account
 * and per Region.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * CfnResourceVersion cfnResourceVersion = CfnResourceVersion.Builder.create(this,
 * "MyCfnResourceVersion")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html)
 */
@CdkDslMarker
public class CfnResourceVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourceVersion.Builder = CfnResourceVersion.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the
   * resource.
   *
   * If your resource calls AWS APIs in any of its handlers, you must create an *[IAM execution
   * role](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html)* that includes the necessary
   * permissions to call those AWS APIs, and provision that execution role in your account. When
   * CloudFormation needs to invoke the resource type handler, CloudFormation assumes this execution
   * role to create a temporary session token, which it then passes to the resource type handler,
   * thereby supplying your resource type with the appropriate credentials.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-executionrolearn)
   * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role for CloudFormation to
   * assume when invoking the resource. 
   */
  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  /**
   * Logging configuration information for a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
   * @param loggingConfig Logging configuration information for a resource. 
   */
  public fun loggingConfig(loggingConfig: IResolvable) {
    cdkBuilder.loggingConfig(loggingConfig)
  }

  /**
   * Logging configuration information for a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
   * @param loggingConfig Logging configuration information for a resource. 
   */
  public fun loggingConfig(loggingConfig: CfnResourceVersion.LoggingConfigProperty) {
    cdkBuilder.loggingConfig(loggingConfig)
  }

  /**
   * A URL to the S3 bucket containing the resource project package that contains the necessary
   * files for the resource you want to register.
   *
   * For information on generating a schema handler package for the resource you want to register,
   * see
   * [submit](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html)
   * in the *CloudFormation CLI User Guide* .
   *
   *
   * The user registering the resource must be able to access the package in the S3 bucket. That is,
   * the user needs to have
   * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html) permissions for
   * the schema handler package. For more information, see [Actions, Resources, and Condition Keys for
   * Amazon S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html) in the *AWS
   * Identity and Access Management User Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-schemahandlerpackage)
   * @param schemaHandlerPackage A URL to the S3 bucket containing the resource project package that
   * contains the necessary files for the resource you want to register. 
   */
  public fun schemaHandlerPackage(schemaHandlerPackage: String) {
    cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
  }

  /**
   * The name of the resource being registered.
   *
   * We recommend that resource names adhere to the following pattern: *company_or_organization* ::
   * *service* :: *type* .
   *
   *
   * The following organization namespaces are reserved and can't be used in your resource names:
   *
   * * `Alexa`
   * * `AMZN`
   * * `Amazon`
   * * `AWS`
   * * `Custom`
   * * `Dev`
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-typename)
   * @param typeName The name of the resource being registered. 
   */
  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun build(): CfnResourceVersion = cdkBuilder.build()
}
