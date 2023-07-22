@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration
import software.constructs.Construct

/**
 * The `AWS::AppSync::FunctionConfiguration` resource defines the functions in GraphQL APIs to
 * perform certain operations.
 *
 * You can use pipeline resolvers to attach functions. For more information, see [Pipeline
 * Resolvers](https://docs.aws.amazon.com/appsync/latest/devguide/pipeline-resolvers.html) in the *AWS
 * AppSync Developer Guide* .
 *
 *
 * When you submit an update, AWS CloudFormation updates resources based on differences between what
 * you submit and the stack's current template. To cause this resource to be updated you must change a
 * property value for this resource in the AWS CloudFormation template. Changing the Amazon S3 file
 * content without changing a property value will not result in an update operation.
 *
 * See [Update Behaviors of Stack
 * Resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html)
 * in the *AWS CloudFormation User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CfnFunctionConfiguration cfnFunctionConfiguration = CfnFunctionConfiguration.Builder.create(this,
 * "MyCfnFunctionConfiguration")
 * .apiId("apiId")
 * .dataSourceName("dataSourceName")
 * .name("name")
 * // the properties below are optional
 * .code("code")
 * .codeS3Location("codeS3Location")
 * .description("description")
 * .functionVersion("functionVersion")
 * .maxBatchSize(123)
 * .requestMappingTemplate("requestMappingTemplate")
 * .requestMappingTemplateS3Location("requestMappingTemplateS3Location")
 * .responseMappingTemplate("responseMappingTemplate")
 * .responseMappingTemplateS3Location("responseMappingTemplateS3Location")
 * .runtime(AppSyncRuntimeProperty.builder()
 * .name("name")
 * .runtimeVersion("runtimeVersion")
 * .build())
 * .syncConfig(SyncConfigProperty.builder()
 * .conflictDetection("conflictDetection")
 * // the properties below are optional
 * .conflictHandler("conflictHandler")
 * .lambdaConflictHandlerConfig(LambdaConflictHandlerConfigProperty.builder()
 * .lambdaConflictHandlerArn("lambdaConflictHandlerArn")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html)
 */
@CdkDslMarker
public class CfnFunctionConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFunctionConfiguration.Builder =
      CfnFunctionConfiguration.Builder.create(scope, id)

  /**
   * The AWS AppSync GraphQL API that you want to attach using this function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-apiid)
   * @param apiId The AWS AppSync GraphQL API that you want to attach using this function. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * The `resolver` code that contains the request and response functions.
   *
   * When code is used, the `runtime` is required. The runtime value must be `APPSYNC_JS` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-code)
   * @param code The `resolver` code that contains the request and response functions. 
   */
  public fun code(code: String) {
    cdkBuilder.code(code)
  }

  /**
   * The Amazon S3 endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-codes3location)
   * @param codeS3Location The Amazon S3 endpoint. 
   */
  public fun codeS3Location(codeS3Location: String) {
    cdkBuilder.codeS3Location(codeS3Location)
  }

  /**
   * The name of data source this function will attach.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-datasourcename)
   * @param dataSourceName The name of data source this function will attach. 
   */
  public fun dataSourceName(dataSourceName: String) {
    cdkBuilder.dataSourceName(dataSourceName)
  }

  /**
   * The `Function` description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-description)
   * @param description The `Function` description. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The version of the request mapping template.
   *
   * Currently, only the 2018-05-29 version of the template is supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-functionversion)
   * @param functionVersion The version of the request mapping template. 
   */
  public fun functionVersion(functionVersion: String) {
    cdkBuilder.functionVersion(functionVersion)
  }

  /**
   * The maximum number of resolver request inputs that will be sent to a single AWS Lambda function
   * in a `BatchInvoke` operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-maxbatchsize)
   * @param maxBatchSize The maximum number of resolver request inputs that will be sent to a single
   * AWS Lambda function in a `BatchInvoke` operation. 
   */
  public fun maxBatchSize(maxBatchSize: Number) {
    cdkBuilder.maxBatchSize(maxBatchSize)
  }

  /**
   * The name of the function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-name)
   * @param name The name of the function. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The `Function` request mapping template.
   *
   * Functions support only the 2018-05-29 version of the request mapping template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplate)
   * @param requestMappingTemplate The `Function` request mapping template. 
   */
  public fun requestMappingTemplate(requestMappingTemplate: String) {
    cdkBuilder.requestMappingTemplate(requestMappingTemplate)
  }

  /**
   * Describes a Sync configuration for a resolver.
   *
   * Contains information on which Conflict Detection, as well as Resolution strategy, should be
   * performed when the resolver is invoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplates3location)
   * @param requestMappingTemplateS3Location Describes a Sync configuration for a resolver. 
   */
  public fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String) {
    cdkBuilder.requestMappingTemplateS3Location(requestMappingTemplateS3Location)
  }

  /**
   * The `Function` response mapping template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplate)
   * @param responseMappingTemplate The `Function` response mapping template. 
   */
  public fun responseMappingTemplate(responseMappingTemplate: String) {
    cdkBuilder.responseMappingTemplate(responseMappingTemplate)
  }

  /**
   * The location of a response mapping template in an Amazon S3 bucket.
   *
   * Use this if you want to provision with a template file in Amazon S3 rather than embedding it in
   * your CloudFormation template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplates3location)
   * @param responseMappingTemplateS3Location The location of a response mapping template in an
   * Amazon S3 bucket. 
   */
  public fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String) {
    cdkBuilder.responseMappingTemplateS3Location(responseMappingTemplateS3Location)
  }

  /**
   * Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function.
   *
   * Specifies the name and version of the runtime to use. Note that if a runtime is specified, code
   * must also be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-runtime)
   * @param runtime Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync
   * function. 
   */
  public fun runtime(runtime: IResolvable) {
    cdkBuilder.runtime(runtime)
  }

  /**
   * Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function.
   *
   * Specifies the name and version of the runtime to use. Note that if a runtime is specified, code
   * must also be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-runtime)
   * @param runtime Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync
   * function. 
   */
  public fun runtime(runtime: CfnFunctionConfiguration.AppSyncRuntimeProperty) {
    cdkBuilder.runtime(runtime)
  }

  /**
   * Describes a Sync configuration for a resolver.
   *
   * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver is
   * invoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-syncconfig)
   * @param syncConfig Describes a Sync configuration for a resolver. 
   */
  public fun syncConfig(syncConfig: IResolvable) {
    cdkBuilder.syncConfig(syncConfig)
  }

  /**
   * Describes a Sync configuration for a resolver.
   *
   * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver is
   * invoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-syncconfig)
   * @param syncConfig Describes a Sync configuration for a resolver. 
   */
  public fun syncConfig(syncConfig: CfnFunctionConfiguration.SyncConfigProperty) {
    cdkBuilder.syncConfig(syncConfig)
  }

  public fun build(): CfnFunctionConfiguration = cdkBuilder.build()
}
