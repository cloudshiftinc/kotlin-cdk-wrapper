@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnResolver
import software.amazon.awscdk.services.appsync.CfnResolverProps

/**
 * Properties for defining a `CfnResolver`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CfnResolverProps cfnResolverProps = CfnResolverProps.builder()
 * .apiId("apiId")
 * .fieldName("fieldName")
 * .typeName("typeName")
 * // the properties below are optional
 * .cachingConfig(CachingConfigProperty.builder()
 * .ttl(123)
 * // the properties below are optional
 * .cachingKeys(List.of("cachingKeys"))
 * .build())
 * .code("code")
 * .codeS3Location("codeS3Location")
 * .dataSourceName("dataSourceName")
 * .kind("kind")
 * .maxBatchSize(123)
 * .pipelineConfig(PipelineConfigProperty.builder()
 * .functions(List.of("functions"))
 * .build())
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html)
 */
@CdkDslMarker
public class CfnResolverPropsDsl {
  private val cdkBuilder: CfnResolverProps.Builder = CfnResolverProps.builder()

  /**
   * @param apiId The AWS AppSync GraphQL API to which you want to attach this resolver. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * @param cachingConfig The caching configuration for the resolver.
   */
  public fun cachingConfig(cachingConfig: IResolvable) {
    cdkBuilder.cachingConfig(cachingConfig)
  }

  /**
   * @param cachingConfig The caching configuration for the resolver.
   */
  public fun cachingConfig(cachingConfig: CfnResolver.CachingConfigProperty) {
    cdkBuilder.cachingConfig(cachingConfig)
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
   * @param dataSourceName The resolver data source name.
   */
  public fun dataSourceName(dataSourceName: String) {
    cdkBuilder.dataSourceName(dataSourceName)
  }

  /**
   * @param fieldName The GraphQL field on a type that invokes the resolver. 
   */
  public fun fieldName(fieldName: String) {
    cdkBuilder.fieldName(fieldName)
  }

  /**
   * @param kind The resolver type.
   * * *UNIT* : A UNIT resolver type. A UNIT resolver is the default resolver type. You can use a
   * UNIT resolver to run a GraphQL query against a single data source.
   * * *PIPELINE* : A PIPELINE resolver type. You can use a PIPELINE resolver to invoke a series of
   * `Function` objects in a serial manner. You can use a pipeline resolver to run a GraphQL query
   * against multiple data sources.
   */
  public fun kind(kind: String) {
    cdkBuilder.kind(kind)
  }

  /**
   * @param maxBatchSize The maximum number of resolver request inputs that will be sent to a single
   * AWS Lambda function in a `BatchInvoke` operation.
   */
  public fun maxBatchSize(maxBatchSize: Number) {
    cdkBuilder.maxBatchSize(maxBatchSize)
  }

  /**
   * @param pipelineConfig Functions linked with the pipeline resolver.
   */
  public fun pipelineConfig(pipelineConfig: IResolvable) {
    cdkBuilder.pipelineConfig(pipelineConfig)
  }

  /**
   * @param pipelineConfig Functions linked with the pipeline resolver.
   */
  public fun pipelineConfig(pipelineConfig: CfnResolver.PipelineConfigProperty) {
    cdkBuilder.pipelineConfig(pipelineConfig)
  }

  /**
   * @param requestMappingTemplate The request mapping template.
   * Request mapping templates are optional when using a Lambda data source. For all other data
   * sources, a request mapping template is required.
   */
  public fun requestMappingTemplate(requestMappingTemplate: String) {
    cdkBuilder.requestMappingTemplate(requestMappingTemplate)
  }

  /**
   * @param requestMappingTemplateS3Location The location of a request mapping template in an Amazon
   * S3 bucket.
   * Use this if you want to provision with a template file in Amazon S3 rather than embedding it in
   * your CloudFormation template.
   */
  public fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String) {
    cdkBuilder.requestMappingTemplateS3Location(requestMappingTemplateS3Location)
  }

  /**
   * @param responseMappingTemplate The response mapping template.
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
  public fun runtime(runtime: CfnResolver.AppSyncRuntimeProperty) {
    cdkBuilder.runtime(runtime)
  }

  /**
   * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source.
   */
  public fun syncConfig(syncConfig: IResolvable) {
    cdkBuilder.syncConfig(syncConfig)
  }

  /**
   * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source.
   */
  public fun syncConfig(syncConfig: CfnResolver.SyncConfigProperty) {
    cdkBuilder.syncConfig(syncConfig)
  }

  /**
   * @param typeName The GraphQL type that invokes this resolver. 
   */
  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun build(): CfnResolverProps = cdkBuilder.build()
}
