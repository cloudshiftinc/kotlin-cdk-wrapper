@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnResolver
import software.constructs.Construct

/**
 * The `AWS::AppSync::Resolver` resource defines the logical GraphQL resolver that you attach to
 * fields in a schema.
 *
 * Request and response templates for resolvers are written in Apache Velocity Template Language
 * (VTL) format. For more information about resolvers, see
 * [Resolver Mapping Template Reference](https://docs.aws.amazon.com/appsync/latest/devguide/resolver-mapping-template-reference.html)
 * .
 *
 * When you submit an update, AWS CloudFormation updates resources based on differences between what
 * you submit and the stack's current template. To cause this resource to be updated you must change
 * a property value for this resource in the CloudFormation template. Changing the Amazon S3 file
 * content without changing a property value will not result in an update operation.
 *
 * See
 * [Update Behaviors of Stack Resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html)
 * in the *AWS CloudFormation User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CfnResolver cfnResolver = CfnResolver.Builder.create(this, "MyCfnResolver")
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
public class CfnResolverDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResolver.Builder = CfnResolver.Builder.create(scope, id)

    /**
     * The AWS AppSync GraphQL API to which you want to attach this resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-apiid)
     *
     * @param apiId The AWS AppSync GraphQL API to which you want to attach this resolver.
     */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /**
     * The caching configuration for the resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-cachingconfig)
     *
     * @param cachingConfig The caching configuration for the resolver.
     */
    public fun cachingConfig(cachingConfig: IResolvable) {
        cdkBuilder.cachingConfig(cachingConfig)
    }

    /**
     * The caching configuration for the resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-cachingconfig)
     *
     * @param cachingConfig The caching configuration for the resolver.
     */
    public fun cachingConfig(cachingConfig: CfnResolver.CachingConfigProperty) {
        cdkBuilder.cachingConfig(cachingConfig)
    }

    /**
     * The `resolver` code that contains the request and response functions.
     *
     * When code is used, the `runtime` is required. The runtime value must be `APPSYNC_JS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-code)
     *
     * @param code The `resolver` code that contains the request and response functions.
     */
    public fun code(code: String) {
        cdkBuilder.code(code)
    }

    /**
     * The Amazon S3 endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-codes3location)
     *
     * @param codeS3Location The Amazon S3 endpoint.
     */
    public fun codeS3Location(codeS3Location: String) {
        cdkBuilder.codeS3Location(codeS3Location)
    }

    /**
     * The resolver data source name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename)
     *
     * @param dataSourceName The resolver data source name.
     */
    public fun dataSourceName(dataSourceName: String) {
        cdkBuilder.dataSourceName(dataSourceName)
    }

    /**
     * The GraphQL field on a type that invokes the resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-fieldname)
     *
     * @param fieldName The GraphQL field on a type that invokes the resolver.
     */
    public fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
    }

    /**
     * The resolver type.
     * * *UNIT* : A UNIT resolver type. A UNIT resolver is the default resolver type. You can use a
     *   UNIT resolver to run a GraphQL query against a single data source.
     * * *PIPELINE* : A PIPELINE resolver type. You can use a PIPELINE resolver to invoke a series
     *   of `Function` objects in a serial manner. You can use a pipeline resolver to run a GraphQL
     *   query against multiple data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-kind)
     *
     * @param kind The resolver type.
     */
    public fun kind(kind: String) {
        cdkBuilder.kind(kind)
    }

    /**
     * The maximum number of resolver request inputs that will be sent to a single AWS Lambda
     * function in a `BatchInvoke` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-maxbatchsize)
     *
     * @param maxBatchSize The maximum number of resolver request inputs that will be sent to a
     *   single AWS Lambda function in a `BatchInvoke` operation.
     */
    public fun maxBatchSize(maxBatchSize: Number) {
        cdkBuilder.maxBatchSize(maxBatchSize)
    }

    /**
     * Functions linked with the pipeline resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-pipelineconfig)
     *
     * @param pipelineConfig Functions linked with the pipeline resolver.
     */
    public fun pipelineConfig(pipelineConfig: IResolvable) {
        cdkBuilder.pipelineConfig(pipelineConfig)
    }

    /**
     * Functions linked with the pipeline resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-pipelineconfig)
     *
     * @param pipelineConfig Functions linked with the pipeline resolver.
     */
    public fun pipelineConfig(pipelineConfig: CfnResolver.PipelineConfigProperty) {
        cdkBuilder.pipelineConfig(pipelineConfig)
    }

    /**
     * The request mapping template.
     *
     * Request mapping templates are optional when using a Lambda data source. For all other data
     * sources, a request mapping template is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplate)
     *
     * @param requestMappingTemplate The request mapping template.
     */
    public fun requestMappingTemplate(requestMappingTemplate: String) {
        cdkBuilder.requestMappingTemplate(requestMappingTemplate)
    }

    /**
     * The location of a request mapping template in an Amazon S3 bucket.
     *
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location)
     *
     * @param requestMappingTemplateS3Location The location of a request mapping template in an
     *   Amazon S3 bucket.
     */
    public fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String) {
        cdkBuilder.requestMappingTemplateS3Location(requestMappingTemplateS3Location)
    }

    /**
     * The response mapping template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplate)
     *
     * @param responseMappingTemplate The response mapping template.
     */
    public fun responseMappingTemplate(responseMappingTemplate: String) {
        cdkBuilder.responseMappingTemplate(responseMappingTemplate)
    }

    /**
     * The location of a response mapping template in an Amazon S3 bucket.
     *
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplates3location)
     *
     * @param responseMappingTemplateS3Location The location of a response mapping template in an
     *   Amazon S3 bucket.
     */
    public fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String) {
        cdkBuilder.responseMappingTemplateS3Location(responseMappingTemplateS3Location)
    }

    /**
     * Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-runtime)
     *
     * @param runtime Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync
     *   function.
     */
    public fun runtime(runtime: IResolvable) {
        cdkBuilder.runtime(runtime)
    }

    /**
     * Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-runtime)
     *
     * @param runtime Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync
     *   function.
     */
    public fun runtime(runtime: CfnResolver.AppSyncRuntimeProperty) {
        cdkBuilder.runtime(runtime)
    }

    /**
     * The `SyncConfig` for a resolver attached to a versioned data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-syncconfig)
     *
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source.
     */
    public fun syncConfig(syncConfig: IResolvable) {
        cdkBuilder.syncConfig(syncConfig)
    }

    /**
     * The `SyncConfig` for a resolver attached to a versioned data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-syncconfig)
     *
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source.
     */
    public fun syncConfig(syncConfig: CfnResolver.SyncConfigProperty) {
        cdkBuilder.syncConfig(syncConfig)
    }

    /**
     * The GraphQL type that invokes this resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-typename)
     *
     * @param typeName The GraphQL type that invokes this resolver.
     */
    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    public fun build(): CfnResolver = cdkBuilder.build()
}
