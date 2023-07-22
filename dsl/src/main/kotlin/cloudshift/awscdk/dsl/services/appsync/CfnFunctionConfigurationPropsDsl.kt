@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration
import software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps

/**
 * Properties for defining a `CfnFunctionConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CfnFunctionConfigurationProps cfnFunctionConfigurationProps =
 * CfnFunctionConfigurationProps.builder()
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
public class CfnFunctionConfigurationPropsDsl {
  private val cdkBuilder: CfnFunctionConfigurationProps.Builder =
      CfnFunctionConfigurationProps.builder()

  /**
   * @param apiId The AWS AppSync GraphQL API that you want to attach using this function. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * @param code The `resolver` code that contains the request and response functions.
   * When code is used, the `runtime` is required. The runtime value must be `APPSYNC_JS` .
   */
  public fun code(code: String) {
    cdkBuilder.code(code)
  }

  /**
   * @param codeS3Location The Amazon S3 endpoint.
   */
  public fun codeS3Location(codeS3Location: String) {
    cdkBuilder.codeS3Location(codeS3Location)
  }

  /**
   * @param dataSourceName The name of data source this function will attach. 
   */
  public fun dataSourceName(dataSourceName: String) {
    cdkBuilder.dataSourceName(dataSourceName)
  }

  /**
   * @param description The `Function` description.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param functionVersion The version of the request mapping template.
   * Currently, only the 2018-05-29 version of the template is supported.
   */
  public fun functionVersion(functionVersion: String) {
    cdkBuilder.functionVersion(functionVersion)
  }

  /**
   * @param maxBatchSize The maximum number of resolver request inputs that will be sent to a single
   * AWS Lambda function in a `BatchInvoke` operation.
   */
  public fun maxBatchSize(maxBatchSize: Number) {
    cdkBuilder.maxBatchSize(maxBatchSize)
  }

  /**
   * @param name The name of the function. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param requestMappingTemplate The `Function` request mapping template.
   * Functions support only the 2018-05-29 version of the request mapping template.
   */
  public fun requestMappingTemplate(requestMappingTemplate: String) {
    cdkBuilder.requestMappingTemplate(requestMappingTemplate)
  }

  /**
   * @param requestMappingTemplateS3Location Describes a Sync configuration for a resolver.
   * Contains information on which Conflict Detection, as well as Resolution strategy, should be
   * performed when the resolver is invoked.
   */
  public fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String) {
    cdkBuilder.requestMappingTemplateS3Location(requestMappingTemplateS3Location)
  }

  /**
   * @param responseMappingTemplate The `Function` response mapping template.
   */
  public fun responseMappingTemplate(responseMappingTemplate: String) {
    cdkBuilder.responseMappingTemplate(responseMappingTemplate)
  }

  /**
   * @param responseMappingTemplateS3Location The location of a response mapping template in an
   * Amazon S3 bucket.
   * Use this if you want to provision with a template file in Amazon S3 rather than embedding it in
   * your CloudFormation template.
   */
  public fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String) {
    cdkBuilder.responseMappingTemplateS3Location(responseMappingTemplateS3Location)
  }

  /**
   * @param runtime Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync
   * function.
   * Specifies the name and version of the runtime to use. Note that if a runtime is specified, code
   * must also be specified.
   */
  public fun runtime(runtime: IResolvable) {
    cdkBuilder.runtime(runtime)
  }

  /**
   * @param runtime Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync
   * function.
   * Specifies the name and version of the runtime to use. Note that if a runtime is specified, code
   * must also be specified.
   */
  public fun runtime(runtime: CfnFunctionConfiguration.AppSyncRuntimeProperty) {
    cdkBuilder.runtime(runtime)
  }

  /**
   * @param syncConfig Describes a Sync configuration for a resolver.
   * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver is
   * invoked.
   */
  public fun syncConfig(syncConfig: IResolvable) {
    cdkBuilder.syncConfig(syncConfig)
  }

  /**
   * @param syncConfig Describes a Sync configuration for a resolver.
   * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver is
   * invoked.
   */
  public fun syncConfig(syncConfig: CfnFunctionConfiguration.SyncConfigProperty) {
    cdkBuilder.syncConfig(syncConfig)
  }

  public fun build(): CfnFunctionConfigurationProps = cdkBuilder.build()
}
