@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnResolver`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
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
 * .metricsConfig("metricsConfig")
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
public interface CfnResolverProps {
  /**
   * The AWS AppSync GraphQL API to which you want to attach this resolver.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-apiid)
   */
  public fun apiId(): String

  /**
   * The caching configuration for the resolver.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-cachingconfig)
   */
  public fun cachingConfig(): Any? = unwrap(this).getCachingConfig()

  /**
   * The `resolver` code that contains the request and response functions.
   *
   * When code is used, the `runtime` is required. The runtime value must be `APPSYNC_JS` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-code)
   */
  public fun code(): String? = unwrap(this).getCode()

  /**
   * The Amazon S3 endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-codes3location)
   */
  public fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

  /**
   * The resolver data source name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename)
   */
  public fun dataSourceName(): String? = unwrap(this).getDataSourceName()

  /**
   * The GraphQL field on a type that invokes the resolver.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-fieldname)
   */
  public fun fieldName(): String

  /**
   * The resolver type.
   *
   * * *UNIT* : A UNIT resolver type. A UNIT resolver is the default resolver type. You can use a
   * UNIT resolver to run a GraphQL query against a single data source.
   * * *PIPELINE* : A PIPELINE resolver type. You can use a PIPELINE resolver to invoke a series of
   * `Function` objects in a serial manner. You can use a pipeline resolver to run a GraphQL query
   * against multiple data sources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-kind)
   */
  public fun kind(): String? = unwrap(this).getKind()

  /**
   * The maximum number of resolver request inputs that will be sent to a single AWS Lambda function
   * in a `BatchInvoke` operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-maxbatchsize)
   */
  public fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

  /**
   * Enables or disables enhanced resolver metrics for specified resolvers.
   *
   * Note that `MetricsConfig` won't be used unless the `resolverLevelMetricsBehavior` value is set
   * to `PER_RESOLVER_METRICS` . If the `resolverLevelMetricsBehavior` is set to
   * `FULL_REQUEST_RESOLVER_METRICS` instead, `MetricsConfig` will be ignored. However, you can still
   * set its value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-metricsconfig)
   */
  public fun metricsConfig(): String? = unwrap(this).getMetricsConfig()

  /**
   * Functions linked with the pipeline resolver.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-pipelineconfig)
   */
  public fun pipelineConfig(): Any? = unwrap(this).getPipelineConfig()

  /**
   * The request mapping template.
   *
   * Request mapping templates are optional when using a Lambda data source. For all other data
   * sources, a request mapping template is required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplate)
   */
  public fun requestMappingTemplate(): String? = unwrap(this).getRequestMappingTemplate()

  /**
   * The location of a request mapping template in an Amazon S3 bucket.
   *
   * Use this if you want to provision with a template file in Amazon S3 rather than embedding it in
   * your CloudFormation template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location)
   */
  public fun requestMappingTemplateS3Location(): String? =
      unwrap(this).getRequestMappingTemplateS3Location()

  /**
   * The response mapping template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplate)
   */
  public fun responseMappingTemplate(): String? = unwrap(this).getResponseMappingTemplate()

  /**
   * The location of a response mapping template in an Amazon S3 bucket.
   *
   * Use this if you want to provision with a template file in Amazon S3 rather than embedding it in
   * your CloudFormation template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplates3location)
   */
  public fun responseMappingTemplateS3Location(): String? =
      unwrap(this).getResponseMappingTemplateS3Location()

  /**
   * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
   *
   * Specifies the name and version of the runtime to use. Note that if a runtime is specified, code
   * must also be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-runtime)
   */
  public fun runtime(): Any? = unwrap(this).getRuntime()

  /**
   * The `SyncConfig` for a resolver attached to a versioned data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-syncconfig)
   */
  public fun syncConfig(): Any? = unwrap(this).getSyncConfig()

  /**
   * The GraphQL type that invokes this resolver.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-typename)
   */
  public fun typeName(): String

  /**
   * A builder for [CfnResolverProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The AWS AppSync GraphQL API to which you want to attach this resolver. 
     */
    public fun apiId(apiId: String)

    /**
     * @param cachingConfig The caching configuration for the resolver.
     */
    public fun cachingConfig(cachingConfig: IResolvable)

    /**
     * @param cachingConfig The caching configuration for the resolver.
     */
    public fun cachingConfig(cachingConfig: CfnResolver.CachingConfigProperty)

    /**
     * @param cachingConfig The caching configuration for the resolver.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0676a7dc9fa8f823d88395e2ff860c8ef071e1855b4488382627a75a5407e7e")
    public fun cachingConfig(cachingConfig: CfnResolver.CachingConfigProperty.Builder.() -> Unit)

    /**
     * @param code The `resolver` code that contains the request and response functions.
     * When code is used, the `runtime` is required. The runtime value must be `APPSYNC_JS` .
     */
    public fun code(code: String)

    /**
     * @param codeS3Location The Amazon S3 endpoint.
     */
    public fun codeS3Location(codeS3Location: String)

    /**
     * @param dataSourceName The resolver data source name.
     */
    public fun dataSourceName(dataSourceName: String)

    /**
     * @param fieldName The GraphQL field on a type that invokes the resolver. 
     */
    public fun fieldName(fieldName: String)

    /**
     * @param kind The resolver type.
     * * *UNIT* : A UNIT resolver type. A UNIT resolver is the default resolver type. You can use a
     * UNIT resolver to run a GraphQL query against a single data source.
     * * *PIPELINE* : A PIPELINE resolver type. You can use a PIPELINE resolver to invoke a series
     * of `Function` objects in a serial manner. You can use a pipeline resolver to run a GraphQL query
     * against multiple data sources.
     */
    public fun kind(kind: String)

    /**
     * @param maxBatchSize The maximum number of resolver request inputs that will be sent to a
     * single AWS Lambda function in a `BatchInvoke` operation.
     */
    public fun maxBatchSize(maxBatchSize: Number)

    /**
     * @param metricsConfig Enables or disables enhanced resolver metrics for specified resolvers.
     * Note that `MetricsConfig` won't be used unless the `resolverLevelMetricsBehavior` value is
     * set to `PER_RESOLVER_METRICS` . If the `resolverLevelMetricsBehavior` is set to
     * `FULL_REQUEST_RESOLVER_METRICS` instead, `MetricsConfig` will be ignored. However, you can still
     * set its value.
     */
    public fun metricsConfig(metricsConfig: String)

    /**
     * @param pipelineConfig Functions linked with the pipeline resolver.
     */
    public fun pipelineConfig(pipelineConfig: IResolvable)

    /**
     * @param pipelineConfig Functions linked with the pipeline resolver.
     */
    public fun pipelineConfig(pipelineConfig: CfnResolver.PipelineConfigProperty)

    /**
     * @param pipelineConfig Functions linked with the pipeline resolver.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80649d996e1c238fedf75538fab2e9f4753896a0cbce1d17dc0a722714024a59")
    public fun pipelineConfig(pipelineConfig: CfnResolver.PipelineConfigProperty.Builder.() -> Unit)

    /**
     * @param requestMappingTemplate The request mapping template.
     * Request mapping templates are optional when using a Lambda data source. For all other data
     * sources, a request mapping template is required.
     */
    public fun requestMappingTemplate(requestMappingTemplate: String)

    /**
     * @param requestMappingTemplateS3Location The location of a request mapping template in an
     * Amazon S3 bucket.
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     */
    public fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String)

    /**
     * @param responseMappingTemplate The response mapping template.
     */
    public fun responseMappingTemplate(responseMappingTemplate: String)

    /**
     * @param responseMappingTemplateS3Location The location of a response mapping template in an
     * Amazon S3 bucket.
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     */
    public fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String)

    /**
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     */
    public fun runtime(runtime: IResolvable)

    /**
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     */
    public fun runtime(runtime: CfnResolver.AppSyncRuntimeProperty)

    /**
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("703be5706db583e1e4afb3749a830762a76afe65264badde72f624f80502aa69")
    public fun runtime(runtime: CfnResolver.AppSyncRuntimeProperty.Builder.() -> Unit)

    /**
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source.
     */
    public fun syncConfig(syncConfig: IResolvable)

    /**
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source.
     */
    public fun syncConfig(syncConfig: CfnResolver.SyncConfigProperty)

    /**
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7631604228cbcf30cb0959811b602076db233928c5f40ac3ce38c2e282f5dcda")
    public fun syncConfig(syncConfig: CfnResolver.SyncConfigProperty.Builder.() -> Unit)

    /**
     * @param typeName The GraphQL type that invokes this resolver. 
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnResolverProps.Builder =
        software.amazon.awscdk.services.appsync.CfnResolverProps.builder()

    /**
     * @param apiId The AWS AppSync GraphQL API to which you want to attach this resolver. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param cachingConfig The caching configuration for the resolver.
     */
    override fun cachingConfig(cachingConfig: IResolvable) {
      cdkBuilder.cachingConfig(cachingConfig.let(IResolvable::unwrap))
    }

    /**
     * @param cachingConfig The caching configuration for the resolver.
     */
    override fun cachingConfig(cachingConfig: CfnResolver.CachingConfigProperty) {
      cdkBuilder.cachingConfig(cachingConfig.let(CfnResolver.CachingConfigProperty::unwrap))
    }

    /**
     * @param cachingConfig The caching configuration for the resolver.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0676a7dc9fa8f823d88395e2ff860c8ef071e1855b4488382627a75a5407e7e")
    override fun cachingConfig(cachingConfig: CfnResolver.CachingConfigProperty.Builder.() -> Unit):
        Unit = cachingConfig(CfnResolver.CachingConfigProperty(cachingConfig))

    /**
     * @param code The `resolver` code that contains the request and response functions.
     * When code is used, the `runtime` is required. The runtime value must be `APPSYNC_JS` .
     */
    override fun code(code: String) {
      cdkBuilder.code(code)
    }

    /**
     * @param codeS3Location The Amazon S3 endpoint.
     */
    override fun codeS3Location(codeS3Location: String) {
      cdkBuilder.codeS3Location(codeS3Location)
    }

    /**
     * @param dataSourceName The resolver data source name.
     */
    override fun dataSourceName(dataSourceName: String) {
      cdkBuilder.dataSourceName(dataSourceName)
    }

    /**
     * @param fieldName The GraphQL field on a type that invokes the resolver. 
     */
    override fun fieldName(fieldName: String) {
      cdkBuilder.fieldName(fieldName)
    }

    /**
     * @param kind The resolver type.
     * * *UNIT* : A UNIT resolver type. A UNIT resolver is the default resolver type. You can use a
     * UNIT resolver to run a GraphQL query against a single data source.
     * * *PIPELINE* : A PIPELINE resolver type. You can use a PIPELINE resolver to invoke a series
     * of `Function` objects in a serial manner. You can use a pipeline resolver to run a GraphQL query
     * against multiple data sources.
     */
    override fun kind(kind: String) {
      cdkBuilder.kind(kind)
    }

    /**
     * @param maxBatchSize The maximum number of resolver request inputs that will be sent to a
     * single AWS Lambda function in a `BatchInvoke` operation.
     */
    override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    /**
     * @param metricsConfig Enables or disables enhanced resolver metrics for specified resolvers.
     * Note that `MetricsConfig` won't be used unless the `resolverLevelMetricsBehavior` value is
     * set to `PER_RESOLVER_METRICS` . If the `resolverLevelMetricsBehavior` is set to
     * `FULL_REQUEST_RESOLVER_METRICS` instead, `MetricsConfig` will be ignored. However, you can still
     * set its value.
     */
    override fun metricsConfig(metricsConfig: String) {
      cdkBuilder.metricsConfig(metricsConfig)
    }

    /**
     * @param pipelineConfig Functions linked with the pipeline resolver.
     */
    override fun pipelineConfig(pipelineConfig: IResolvable) {
      cdkBuilder.pipelineConfig(pipelineConfig.let(IResolvable::unwrap))
    }

    /**
     * @param pipelineConfig Functions linked with the pipeline resolver.
     */
    override fun pipelineConfig(pipelineConfig: CfnResolver.PipelineConfigProperty) {
      cdkBuilder.pipelineConfig(pipelineConfig.let(CfnResolver.PipelineConfigProperty::unwrap))
    }

    /**
     * @param pipelineConfig Functions linked with the pipeline resolver.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80649d996e1c238fedf75538fab2e9f4753896a0cbce1d17dc0a722714024a59")
    override
        fun pipelineConfig(pipelineConfig: CfnResolver.PipelineConfigProperty.Builder.() -> Unit):
        Unit = pipelineConfig(CfnResolver.PipelineConfigProperty(pipelineConfig))

    /**
     * @param requestMappingTemplate The request mapping template.
     * Request mapping templates are optional when using a Lambda data source. For all other data
     * sources, a request mapping template is required.
     */
    override fun requestMappingTemplate(requestMappingTemplate: String) {
      cdkBuilder.requestMappingTemplate(requestMappingTemplate)
    }

    /**
     * @param requestMappingTemplateS3Location The location of a request mapping template in an
     * Amazon S3 bucket.
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     */
    override fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String) {
      cdkBuilder.requestMappingTemplateS3Location(requestMappingTemplateS3Location)
    }

    /**
     * @param responseMappingTemplate The response mapping template.
     */
    override fun responseMappingTemplate(responseMappingTemplate: String) {
      cdkBuilder.responseMappingTemplate(responseMappingTemplate)
    }

    /**
     * @param responseMappingTemplateS3Location The location of a response mapping template in an
     * Amazon S3 bucket.
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     */
    override fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String) {
      cdkBuilder.responseMappingTemplateS3Location(responseMappingTemplateS3Location)
    }

    /**
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     */
    override fun runtime(runtime: IResolvable) {
      cdkBuilder.runtime(runtime.let(IResolvable::unwrap))
    }

    /**
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     */
    override fun runtime(runtime: CfnResolver.AppSyncRuntimeProperty) {
      cdkBuilder.runtime(runtime.let(CfnResolver.AppSyncRuntimeProperty::unwrap))
    }

    /**
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("703be5706db583e1e4afb3749a830762a76afe65264badde72f624f80502aa69")
    override fun runtime(runtime: CfnResolver.AppSyncRuntimeProperty.Builder.() -> Unit): Unit =
        runtime(CfnResolver.AppSyncRuntimeProperty(runtime))

    /**
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source.
     */
    override fun syncConfig(syncConfig: IResolvable) {
      cdkBuilder.syncConfig(syncConfig.let(IResolvable::unwrap))
    }

    /**
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source.
     */
    override fun syncConfig(syncConfig: CfnResolver.SyncConfigProperty) {
      cdkBuilder.syncConfig(syncConfig.let(CfnResolver.SyncConfigProperty::unwrap))
    }

    /**
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7631604228cbcf30cb0959811b602076db233928c5f40ac3ce38c2e282f5dcda")
    override fun syncConfig(syncConfig: CfnResolver.SyncConfigProperty.Builder.() -> Unit): Unit =
        syncConfig(CfnResolver.SyncConfigProperty(syncConfig))

    /**
     * @param typeName The GraphQL type that invokes this resolver. 
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnResolverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnResolverProps,
  ) : CdkObject(cdkObject), CfnResolverProps {
    /**
     * The AWS AppSync GraphQL API to which you want to attach this resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * The caching configuration for the resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-cachingconfig)
     */
    override fun cachingConfig(): Any? = unwrap(this).getCachingConfig()

    /**
     * The `resolver` code that contains the request and response functions.
     *
     * When code is used, the `runtime` is required. The runtime value must be `APPSYNC_JS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-code)
     */
    override fun code(): String? = unwrap(this).getCode()

    /**
     * The Amazon S3 endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-codes3location)
     */
    override fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

    /**
     * The resolver data source name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename)
     */
    override fun dataSourceName(): String? = unwrap(this).getDataSourceName()

    /**
     * The GraphQL field on a type that invokes the resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-fieldname)
     */
    override fun fieldName(): String = unwrap(this).getFieldName()

    /**
     * The resolver type.
     *
     * * *UNIT* : A UNIT resolver type. A UNIT resolver is the default resolver type. You can use a
     * UNIT resolver to run a GraphQL query against a single data source.
     * * *PIPELINE* : A PIPELINE resolver type. You can use a PIPELINE resolver to invoke a series
     * of `Function` objects in a serial manner. You can use a pipeline resolver to run a GraphQL query
     * against multiple data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-kind)
     */
    override fun kind(): String? = unwrap(this).getKind()

    /**
     * The maximum number of resolver request inputs that will be sent to a single AWS Lambda
     * function in a `BatchInvoke` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-maxbatchsize)
     */
    override fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

    /**
     * Enables or disables enhanced resolver metrics for specified resolvers.
     *
     * Note that `MetricsConfig` won't be used unless the `resolverLevelMetricsBehavior` value is
     * set to `PER_RESOLVER_METRICS` . If the `resolverLevelMetricsBehavior` is set to
     * `FULL_REQUEST_RESOLVER_METRICS` instead, `MetricsConfig` will be ignored. However, you can still
     * set its value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-metricsconfig)
     */
    override fun metricsConfig(): String? = unwrap(this).getMetricsConfig()

    /**
     * Functions linked with the pipeline resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-pipelineconfig)
     */
    override fun pipelineConfig(): Any? = unwrap(this).getPipelineConfig()

    /**
     * The request mapping template.
     *
     * Request mapping templates are optional when using a Lambda data source. For all other data
     * sources, a request mapping template is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplate)
     */
    override fun requestMappingTemplate(): String? = unwrap(this).getRequestMappingTemplate()

    /**
     * The location of a request mapping template in an Amazon S3 bucket.
     *
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location)
     */
    override fun requestMappingTemplateS3Location(): String? =
        unwrap(this).getRequestMappingTemplateS3Location()

    /**
     * The response mapping template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplate)
     */
    override fun responseMappingTemplate(): String? = unwrap(this).getResponseMappingTemplate()

    /**
     * The location of a response mapping template in an Amazon S3 bucket.
     *
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplates3location)
     */
    override fun responseMappingTemplateS3Location(): String? =
        unwrap(this).getResponseMappingTemplateS3Location()

    /**
     * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-runtime)
     */
    override fun runtime(): Any? = unwrap(this).getRuntime()

    /**
     * The `SyncConfig` for a resolver attached to a versioned data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-syncconfig)
     */
    override fun syncConfig(): Any? = unwrap(this).getSyncConfig()

    /**
     * The GraphQL type that invokes this resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-typename)
     */
    override fun typeName(): String = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResolverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolverProps):
        CfnResolverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverProps):
        software.amazon.awscdk.services.appsync.CfnResolverProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.CfnResolverProps
  }
}
