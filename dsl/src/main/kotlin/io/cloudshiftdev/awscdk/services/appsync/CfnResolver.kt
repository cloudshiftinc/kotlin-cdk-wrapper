package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResolver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.CfnResolver,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The AWS AppSync GraphQL API to which you want to attach this resolver.
   */
  public open fun apiId(): String = unwrap(this).getApiId()

  /**
   * The AWS AppSync GraphQL API to which you want to attach this resolver.
   */
  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  /**
   * The GraphQL field on a type that invokes the resolver.
   */
  public open fun attrFieldName(): String = unwrap(this).getAttrFieldName()

  /**
   * ARN of the resolver, such as
   * `arn:aws:appsync:us-east-1:123456789012:apis/graphqlapiid/types/typename/resolvers/resolvername` .
   */
  public open fun attrResolverArn(): String = unwrap(this).getAttrResolverArn()

  /**
   * The GraphQL type that invokes this resolver.
   */
  public open fun attrTypeName(): String = unwrap(this).getAttrTypeName()

  /**
   * The caching configuration for the resolver.
   */
  public open fun cachingConfig(): Any? = unwrap(this).getCachingConfig()

  /**
   * The caching configuration for the resolver.
   */
  public open fun cachingConfig(`value`: IResolvable) {
    unwrap(this).setCachingConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The caching configuration for the resolver.
   */
  public open fun cachingConfig(`value`: CachingConfigProperty) {
    unwrap(this).setCachingConfig(`value`.let(CachingConfigProperty::unwrap))
  }

  /**
   * The caching configuration for the resolver.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7eb54489451f3df1c67b07d9cd3755b4990477a08162b989a812126bff06aad7")
  public open fun cachingConfig(`value`: CachingConfigProperty.Builder.() -> Unit): Unit =
      cachingConfig(CachingConfigProperty(`value`))

  /**
   * The `resolver` code that contains the request and response functions.
   */
  public open fun code(): String? = unwrap(this).getCode()

  /**
   * The `resolver` code that contains the request and response functions.
   */
  public open fun code(`value`: String) {
    unwrap(this).setCode(`value`)
  }

  /**
   * The Amazon S3 endpoint.
   */
  public open fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

  /**
   * The Amazon S3 endpoint.
   */
  public open fun codeS3Location(`value`: String) {
    unwrap(this).setCodeS3Location(`value`)
  }

  /**
   * The resolver data source name.
   */
  public open fun dataSourceName(): String? = unwrap(this).getDataSourceName()

  /**
   * The resolver data source name.
   */
  public open fun dataSourceName(`value`: String) {
    unwrap(this).setDataSourceName(`value`)
  }

  /**
   * The GraphQL field on a type that invokes the resolver.
   */
  public open fun fieldName(): String = unwrap(this).getFieldName()

  /**
   * The GraphQL field on a type that invokes the resolver.
   */
  public open fun fieldName(`value`: String) {
    unwrap(this).setFieldName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The resolver type.
   */
  public open fun kind(): String? = unwrap(this).getKind()

  /**
   * The resolver type.
   */
  public open fun kind(`value`: String) {
    unwrap(this).setKind(`value`)
  }

  /**
   * The maximum number of resolver request inputs that will be sent to a single AWS Lambda function
   * in a `BatchInvoke` operation.
   */
  public open fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

  /**
   * The maximum number of resolver request inputs that will be sent to a single AWS Lambda function
   * in a `BatchInvoke` operation.
   */
  public open fun maxBatchSize(`value`: Number) {
    unwrap(this).setMaxBatchSize(`value`)
  }

  /**
   * Enables or disables enhanced resolver metrics for specified resolvers.
   */
  public open fun metricsConfig(): String? = unwrap(this).getMetricsConfig()

  /**
   * Enables or disables enhanced resolver metrics for specified resolvers.
   */
  public open fun metricsConfig(`value`: String) {
    unwrap(this).setMetricsConfig(`value`)
  }

  /**
   * Functions linked with the pipeline resolver.
   */
  public open fun pipelineConfig(): Any? = unwrap(this).getPipelineConfig()

  /**
   * Functions linked with the pipeline resolver.
   */
  public open fun pipelineConfig(`value`: IResolvable) {
    unwrap(this).setPipelineConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Functions linked with the pipeline resolver.
   */
  public open fun pipelineConfig(`value`: PipelineConfigProperty) {
    unwrap(this).setPipelineConfig(`value`.let(PipelineConfigProperty::unwrap))
  }

  /**
   * Functions linked with the pipeline resolver.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("332ebf50e99b3ff78336f8be68e8bbc1b92949df4bf7fb716f255b781f130675")
  public open fun pipelineConfig(`value`: PipelineConfigProperty.Builder.() -> Unit): Unit =
      pipelineConfig(PipelineConfigProperty(`value`))

  /**
   * The request mapping template.
   */
  public open fun requestMappingTemplate(): String? = unwrap(this).getRequestMappingTemplate()

  /**
   * The request mapping template.
   */
  public open fun requestMappingTemplate(`value`: String) {
    unwrap(this).setRequestMappingTemplate(`value`)
  }

  /**
   * The location of a request mapping template in an Amazon S3 bucket.
   */
  public open fun requestMappingTemplateS3Location(): String? =
      unwrap(this).getRequestMappingTemplateS3Location()

  /**
   * The location of a request mapping template in an Amazon S3 bucket.
   */
  public open fun requestMappingTemplateS3Location(`value`: String) {
    unwrap(this).setRequestMappingTemplateS3Location(`value`)
  }

  /**
   * The response mapping template.
   */
  public open fun responseMappingTemplate(): String? = unwrap(this).getResponseMappingTemplate()

  /**
   * The response mapping template.
   */
  public open fun responseMappingTemplate(`value`: String) {
    unwrap(this).setResponseMappingTemplate(`value`)
  }

  /**
   * The location of a response mapping template in an Amazon S3 bucket.
   */
  public open fun responseMappingTemplateS3Location(): String? =
      unwrap(this).getResponseMappingTemplateS3Location()

  /**
   * The location of a response mapping template in an Amazon S3 bucket.
   */
  public open fun responseMappingTemplateS3Location(`value`: String) {
    unwrap(this).setResponseMappingTemplateS3Location(`value`)
  }

  /**
   * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
   */
  public open fun runtime(): Any? = unwrap(this).getRuntime()

  /**
   * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
   */
  public open fun runtime(`value`: IResolvable) {
    unwrap(this).setRuntime(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
   */
  public open fun runtime(`value`: AppSyncRuntimeProperty) {
    unwrap(this).setRuntime(`value`.let(AppSyncRuntimeProperty::unwrap))
  }

  /**
   * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("627f74e4a4bf4783bdaa65f7751cd0ddbebecdcf1fa58cf43bd49e1f40abd3f4")
  public open fun runtime(`value`: AppSyncRuntimeProperty.Builder.() -> Unit): Unit =
      runtime(AppSyncRuntimeProperty(`value`))

  /**
   * The `SyncConfig` for a resolver attached to a versioned data source.
   */
  public open fun syncConfig(): Any? = unwrap(this).getSyncConfig()

  /**
   * The `SyncConfig` for a resolver attached to a versioned data source.
   */
  public open fun syncConfig(`value`: IResolvable) {
    unwrap(this).setSyncConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The `SyncConfig` for a resolver attached to a versioned data source.
   */
  public open fun syncConfig(`value`: SyncConfigProperty) {
    unwrap(this).setSyncConfig(`value`.let(SyncConfigProperty::unwrap))
  }

  /**
   * The `SyncConfig` for a resolver attached to a versioned data source.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("886c30fa03847637225c53f219d176ab77adfe5c25c94ba0d9919a0083d9dc9f")
  public open fun syncConfig(`value`: SyncConfigProperty.Builder.() -> Unit): Unit =
      syncConfig(SyncConfigProperty(`value`))

  /**
   * The GraphQL type that invokes this resolver.
   */
  public open fun typeName(): String = unwrap(this).getTypeName()

  /**
   * The GraphQL type that invokes this resolver.
   */
  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.CfnResolver].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS AppSync GraphQL API to which you want to attach this resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-apiid)
     * @param apiId The AWS AppSync GraphQL API to which you want to attach this resolver. 
     */
    public fun apiId(apiId: String)

    /**
     * The caching configuration for the resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-cachingconfig)
     * @param cachingConfig The caching configuration for the resolver. 
     */
    public fun cachingConfig(cachingConfig: IResolvable)

    /**
     * The caching configuration for the resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-cachingconfig)
     * @param cachingConfig The caching configuration for the resolver. 
     */
    public fun cachingConfig(cachingConfig: CachingConfigProperty)

    /**
     * The caching configuration for the resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-cachingconfig)
     * @param cachingConfig The caching configuration for the resolver. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feb6883d5ebccdcb3af3fe870e56e03d1c90be563b00a40e759b4e901f8bdd66")
    public fun cachingConfig(cachingConfig: CachingConfigProperty.Builder.() -> Unit)

    /**
     * The `resolver` code that contains the request and response functions.
     *
     * When code is used, the `runtime` is required. The runtime value must be `APPSYNC_JS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-code)
     * @param code The `resolver` code that contains the request and response functions. 
     */
    public fun code(code: String)

    /**
     * The Amazon S3 endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-codes3location)
     * @param codeS3Location The Amazon S3 endpoint. 
     */
    public fun codeS3Location(codeS3Location: String)

    /**
     * The resolver data source name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename)
     * @param dataSourceName The resolver data source name. 
     */
    public fun dataSourceName(dataSourceName: String)

    /**
     * The GraphQL field on a type that invokes the resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-fieldname)
     * @param fieldName The GraphQL field on a type that invokes the resolver. 
     */
    public fun fieldName(fieldName: String)

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
     * @param kind The resolver type. 
     */
    public fun kind(kind: String)

    /**
     * The maximum number of resolver request inputs that will be sent to a single AWS Lambda
     * function in a `BatchInvoke` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-maxbatchsize)
     * @param maxBatchSize The maximum number of resolver request inputs that will be sent to a
     * single AWS Lambda function in a `BatchInvoke` operation. 
     */
    public fun maxBatchSize(maxBatchSize: Number)

    /**
     * Enables or disables enhanced resolver metrics for specified resolvers.
     *
     * Note that `MetricsConfig` won't be used unless the `resolverLevelMetricsBehavior` value is
     * set to `PER_RESOLVER_METRICS` . If the `resolverLevelMetricsBehavior` is set to
     * `FULL_REQUEST_RESOLVER_METRICS` instead, `MetricsConfig` will be ignored. However, you can still
     * set its value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-metricsconfig)
     * @param metricsConfig Enables or disables enhanced resolver metrics for specified resolvers. 
     */
    public fun metricsConfig(metricsConfig: String)

    /**
     * Functions linked with the pipeline resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-pipelineconfig)
     * @param pipelineConfig Functions linked with the pipeline resolver. 
     */
    public fun pipelineConfig(pipelineConfig: IResolvable)

    /**
     * Functions linked with the pipeline resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-pipelineconfig)
     * @param pipelineConfig Functions linked with the pipeline resolver. 
     */
    public fun pipelineConfig(pipelineConfig: PipelineConfigProperty)

    /**
     * Functions linked with the pipeline resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-pipelineconfig)
     * @param pipelineConfig Functions linked with the pipeline resolver. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cf35ea4a60ade7451477b791c4aa18cfd175c94e31d542330d3b46894db9e00")
    public fun pipelineConfig(pipelineConfig: PipelineConfigProperty.Builder.() -> Unit)

    /**
     * The request mapping template.
     *
     * Request mapping templates are optional when using a Lambda data source. For all other data
     * sources, a request mapping template is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplate)
     * @param requestMappingTemplate The request mapping template. 
     */
    public fun requestMappingTemplate(requestMappingTemplate: String)

    /**
     * The location of a request mapping template in an Amazon S3 bucket.
     *
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location)
     * @param requestMappingTemplateS3Location The location of a request mapping template in an
     * Amazon S3 bucket. 
     */
    public fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String)

    /**
     * The response mapping template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplate)
     * @param responseMappingTemplate The response mapping template. 
     */
    public fun responseMappingTemplate(responseMappingTemplate: String)

    /**
     * The location of a response mapping template in an Amazon S3 bucket.
     *
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplates3location)
     * @param responseMappingTemplateS3Location The location of a response mapping template in an
     * Amazon S3 bucket. 
     */
    public fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String)

    /**
     * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-runtime)
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function. 
     */
    public fun runtime(runtime: IResolvable)

    /**
     * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-runtime)
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function. 
     */
    public fun runtime(runtime: AppSyncRuntimeProperty)

    /**
     * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-runtime)
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47b90c8f87bdd56a3ba452cd8e3c7a0ac8a362d4caf4e287a29b39374193ad99")
    public fun runtime(runtime: AppSyncRuntimeProperty.Builder.() -> Unit)

    /**
     * The `SyncConfig` for a resolver attached to a versioned data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-syncconfig)
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source. 
     */
    public fun syncConfig(syncConfig: IResolvable)

    /**
     * The `SyncConfig` for a resolver attached to a versioned data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-syncconfig)
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source. 
     */
    public fun syncConfig(syncConfig: SyncConfigProperty)

    /**
     * The `SyncConfig` for a resolver attached to a versioned data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-syncconfig)
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f308986b1408b28d91fae6da2af586686d81d70f342d1bfa39f7fb10f2bfa9ba")
    public fun syncConfig(syncConfig: SyncConfigProperty.Builder.() -> Unit)

    /**
     * The GraphQL type that invokes this resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-typename)
     * @param typeName The GraphQL type that invokes this resolver. 
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnResolver.Builder =
        software.amazon.awscdk.services.appsync.CfnResolver.Builder.create(scope, id)

    /**
     * The AWS AppSync GraphQL API to which you want to attach this resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-apiid)
     * @param apiId The AWS AppSync GraphQL API to which you want to attach this resolver. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * The caching configuration for the resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-cachingconfig)
     * @param cachingConfig The caching configuration for the resolver. 
     */
    override fun cachingConfig(cachingConfig: IResolvable) {
      cdkBuilder.cachingConfig(cachingConfig.let(IResolvable::unwrap))
    }

    /**
     * The caching configuration for the resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-cachingconfig)
     * @param cachingConfig The caching configuration for the resolver. 
     */
    override fun cachingConfig(cachingConfig: CachingConfigProperty) {
      cdkBuilder.cachingConfig(cachingConfig.let(CachingConfigProperty::unwrap))
    }

    /**
     * The caching configuration for the resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-cachingconfig)
     * @param cachingConfig The caching configuration for the resolver. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feb6883d5ebccdcb3af3fe870e56e03d1c90be563b00a40e759b4e901f8bdd66")
    override fun cachingConfig(cachingConfig: CachingConfigProperty.Builder.() -> Unit): Unit =
        cachingConfig(CachingConfigProperty(cachingConfig))

    /**
     * The `resolver` code that contains the request and response functions.
     *
     * When code is used, the `runtime` is required. The runtime value must be `APPSYNC_JS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-code)
     * @param code The `resolver` code that contains the request and response functions. 
     */
    override fun code(code: String) {
      cdkBuilder.code(code)
    }

    /**
     * The Amazon S3 endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-codes3location)
     * @param codeS3Location The Amazon S3 endpoint. 
     */
    override fun codeS3Location(codeS3Location: String) {
      cdkBuilder.codeS3Location(codeS3Location)
    }

    /**
     * The resolver data source name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename)
     * @param dataSourceName The resolver data source name. 
     */
    override fun dataSourceName(dataSourceName: String) {
      cdkBuilder.dataSourceName(dataSourceName)
    }

    /**
     * The GraphQL field on a type that invokes the resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-fieldname)
     * @param fieldName The GraphQL field on a type that invokes the resolver. 
     */
    override fun fieldName(fieldName: String) {
      cdkBuilder.fieldName(fieldName)
    }

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
     * @param kind The resolver type. 
     */
    override fun kind(kind: String) {
      cdkBuilder.kind(kind)
    }

    /**
     * The maximum number of resolver request inputs that will be sent to a single AWS Lambda
     * function in a `BatchInvoke` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-maxbatchsize)
     * @param maxBatchSize The maximum number of resolver request inputs that will be sent to a
     * single AWS Lambda function in a `BatchInvoke` operation. 
     */
    override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    /**
     * Enables or disables enhanced resolver metrics for specified resolvers.
     *
     * Note that `MetricsConfig` won't be used unless the `resolverLevelMetricsBehavior` value is
     * set to `PER_RESOLVER_METRICS` . If the `resolverLevelMetricsBehavior` is set to
     * `FULL_REQUEST_RESOLVER_METRICS` instead, `MetricsConfig` will be ignored. However, you can still
     * set its value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-metricsconfig)
     * @param metricsConfig Enables or disables enhanced resolver metrics for specified resolvers. 
     */
    override fun metricsConfig(metricsConfig: String) {
      cdkBuilder.metricsConfig(metricsConfig)
    }

    /**
     * Functions linked with the pipeline resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-pipelineconfig)
     * @param pipelineConfig Functions linked with the pipeline resolver. 
     */
    override fun pipelineConfig(pipelineConfig: IResolvable) {
      cdkBuilder.pipelineConfig(pipelineConfig.let(IResolvable::unwrap))
    }

    /**
     * Functions linked with the pipeline resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-pipelineconfig)
     * @param pipelineConfig Functions linked with the pipeline resolver. 
     */
    override fun pipelineConfig(pipelineConfig: PipelineConfigProperty) {
      cdkBuilder.pipelineConfig(pipelineConfig.let(PipelineConfigProperty::unwrap))
    }

    /**
     * Functions linked with the pipeline resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-pipelineconfig)
     * @param pipelineConfig Functions linked with the pipeline resolver. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cf35ea4a60ade7451477b791c4aa18cfd175c94e31d542330d3b46894db9e00")
    override fun pipelineConfig(pipelineConfig: PipelineConfigProperty.Builder.() -> Unit): Unit =
        pipelineConfig(PipelineConfigProperty(pipelineConfig))

    /**
     * The request mapping template.
     *
     * Request mapping templates are optional when using a Lambda data source. For all other data
     * sources, a request mapping template is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplate)
     * @param requestMappingTemplate The request mapping template. 
     */
    override fun requestMappingTemplate(requestMappingTemplate: String) {
      cdkBuilder.requestMappingTemplate(requestMappingTemplate)
    }

    /**
     * The location of a request mapping template in an Amazon S3 bucket.
     *
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location)
     * @param requestMappingTemplateS3Location The location of a request mapping template in an
     * Amazon S3 bucket. 
     */
    override fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String) {
      cdkBuilder.requestMappingTemplateS3Location(requestMappingTemplateS3Location)
    }

    /**
     * The response mapping template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplate)
     * @param responseMappingTemplate The response mapping template. 
     */
    override fun responseMappingTemplate(responseMappingTemplate: String) {
      cdkBuilder.responseMappingTemplate(responseMappingTemplate)
    }

    /**
     * The location of a response mapping template in an Amazon S3 bucket.
     *
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplates3location)
     * @param responseMappingTemplateS3Location The location of a response mapping template in an
     * Amazon S3 bucket. 
     */
    override fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String) {
      cdkBuilder.responseMappingTemplateS3Location(responseMappingTemplateS3Location)
    }

    /**
     * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-runtime)
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function. 
     */
    override fun runtime(runtime: IResolvable) {
      cdkBuilder.runtime(runtime.let(IResolvable::unwrap))
    }

    /**
     * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-runtime)
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function. 
     */
    override fun runtime(runtime: AppSyncRuntimeProperty) {
      cdkBuilder.runtime(runtime.let(AppSyncRuntimeProperty::unwrap))
    }

    /**
     * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-runtime)
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47b90c8f87bdd56a3ba452cd8e3c7a0ac8a362d4caf4e287a29b39374193ad99")
    override fun runtime(runtime: AppSyncRuntimeProperty.Builder.() -> Unit): Unit =
        runtime(AppSyncRuntimeProperty(runtime))

    /**
     * The `SyncConfig` for a resolver attached to a versioned data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-syncconfig)
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source. 
     */
    override fun syncConfig(syncConfig: IResolvable) {
      cdkBuilder.syncConfig(syncConfig.let(IResolvable::unwrap))
    }

    /**
     * The `SyncConfig` for a resolver attached to a versioned data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-syncconfig)
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source. 
     */
    override fun syncConfig(syncConfig: SyncConfigProperty) {
      cdkBuilder.syncConfig(syncConfig.let(SyncConfigProperty::unwrap))
    }

    /**
     * The `SyncConfig` for a resolver attached to a versioned data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-syncconfig)
     * @param syncConfig The `SyncConfig` for a resolver attached to a versioned data source. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f308986b1408b28d91fae6da2af586686d81d70f342d1bfa39f7fb10f2bfa9ba")
    override fun syncConfig(syncConfig: SyncConfigProperty.Builder.() -> Unit): Unit =
        syncConfig(SyncConfigProperty(syncConfig))

    /**
     * The GraphQL type that invokes this resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-typename)
     * @param typeName The GraphQL type that invokes this resolver. 
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnResolver = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appsync.CfnResolver.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolver {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolver): CfnResolver =
        CfnResolver(cdkObject)

    internal fun unwrap(wrapped: CfnResolver): software.amazon.awscdk.services.appsync.CfnResolver =
        wrapped.cdkObject
  }

  public interface SyncConfigProperty {
    /**
     * The Conflict Detection strategy to use.
     *
     * * *VERSION* : Detect conflicts based on object versions for this resolver.
     * * *NONE* : Do not detect conflicts when invoking this resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-conflictdetection)
     */
    public fun conflictDetection(): String

    /**
     * The Conflict Resolution strategy to perform in the event of a conflict.
     *
     * * *OPTIMISTIC_CONCURRENCY* : Resolve conflicts by rejecting mutations when versions don't
     * match the latest version at the server.
     * * *AUTOMERGE* : Resolve conflicts with the Automerge conflict resolution strategy.
     * * *LAMBDA* : Resolve conflicts with an AWS Lambda function supplied in the
     * `LambdaConflictHandlerConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-conflicthandler)
     */
    public fun conflictHandler(): String? = unwrap(this).getConflictHandler()

    /**
     * The `LambdaConflictHandlerConfig` when configuring `LAMBDA` as the Conflict Handler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-lambdaconflicthandlerconfig)
     */
    public fun lambdaConflictHandlerConfig(): Any? = unwrap(this).getLambdaConflictHandlerConfig()

    /**
     * A builder for [SyncConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conflictDetection The Conflict Detection strategy to use. 
       * * *VERSION* : Detect conflicts based on object versions for this resolver.
       * * *NONE* : Do not detect conflicts when invoking this resolver.
       */
      public fun conflictDetection(conflictDetection: String)

      /**
       * @param conflictHandler The Conflict Resolution strategy to perform in the event of a
       * conflict.
       * * *OPTIMISTIC_CONCURRENCY* : Resolve conflicts by rejecting mutations when versions don't
       * match the latest version at the server.
       * * *AUTOMERGE* : Resolve conflicts with the Automerge conflict resolution strategy.
       * * *LAMBDA* : Resolve conflicts with an AWS Lambda function supplied in the
       * `LambdaConflictHandlerConfig` .
       */
      public fun conflictHandler(conflictHandler: String)

      /**
       * @param lambdaConflictHandlerConfig The `LambdaConflictHandlerConfig` when configuring
       * `LAMBDA` as the Conflict Handler.
       */
      public fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: IResolvable)

      /**
       * @param lambdaConflictHandlerConfig The `LambdaConflictHandlerConfig` when configuring
       * `LAMBDA` as the Conflict Handler.
       */
      public
          fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: LambdaConflictHandlerConfigProperty)

      /**
       * @param lambdaConflictHandlerConfig The `LambdaConflictHandlerConfig` when configuring
       * `LAMBDA` as the Conflict Handler.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ace0a826fb44d4c814a0bfdda93f28f3ec2824e57095836c154b44683307bfa6")
      public
          fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: LambdaConflictHandlerConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty.builder()

      /**
       * @param conflictDetection The Conflict Detection strategy to use. 
       * * *VERSION* : Detect conflicts based on object versions for this resolver.
       * * *NONE* : Do not detect conflicts when invoking this resolver.
       */
      override fun conflictDetection(conflictDetection: String) {
        cdkBuilder.conflictDetection(conflictDetection)
      }

      /**
       * @param conflictHandler The Conflict Resolution strategy to perform in the event of a
       * conflict.
       * * *OPTIMISTIC_CONCURRENCY* : Resolve conflicts by rejecting mutations when versions don't
       * match the latest version at the server.
       * * *AUTOMERGE* : Resolve conflicts with the Automerge conflict resolution strategy.
       * * *LAMBDA* : Resolve conflicts with an AWS Lambda function supplied in the
       * `LambdaConflictHandlerConfig` .
       */
      override fun conflictHandler(conflictHandler: String) {
        cdkBuilder.conflictHandler(conflictHandler)
      }

      /**
       * @param lambdaConflictHandlerConfig The `LambdaConflictHandlerConfig` when configuring
       * `LAMBDA` as the Conflict Handler.
       */
      override fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: IResolvable) {
        cdkBuilder.lambdaConflictHandlerConfig(lambdaConflictHandlerConfig.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaConflictHandlerConfig The `LambdaConflictHandlerConfig` when configuring
       * `LAMBDA` as the Conflict Handler.
       */
      override
          fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: LambdaConflictHandlerConfigProperty) {
        cdkBuilder.lambdaConflictHandlerConfig(lambdaConflictHandlerConfig.let(LambdaConflictHandlerConfigProperty::unwrap))
      }

      /**
       * @param lambdaConflictHandlerConfig The `LambdaConflictHandlerConfig` when configuring
       * `LAMBDA` as the Conflict Handler.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ace0a826fb44d4c814a0bfdda93f28f3ec2824e57095836c154b44683307bfa6")
      override
          fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: LambdaConflictHandlerConfigProperty.Builder.() -> Unit):
          Unit =
          lambdaConflictHandlerConfig(LambdaConflictHandlerConfigProperty(lambdaConflictHandlerConfig))

      public fun build(): software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty,
    ) : CdkObject(cdkObject), SyncConfigProperty {
      /**
       * The Conflict Detection strategy to use.
       *
       * * *VERSION* : Detect conflicts based on object versions for this resolver.
       * * *NONE* : Do not detect conflicts when invoking this resolver.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-conflictdetection)
       */
      override fun conflictDetection(): String = unwrap(this).getConflictDetection()

      /**
       * The Conflict Resolution strategy to perform in the event of a conflict.
       *
       * * *OPTIMISTIC_CONCURRENCY* : Resolve conflicts by rejecting mutations when versions don't
       * match the latest version at the server.
       * * *AUTOMERGE* : Resolve conflicts with the Automerge conflict resolution strategy.
       * * *LAMBDA* : Resolve conflicts with an AWS Lambda function supplied in the
       * `LambdaConflictHandlerConfig` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-conflicthandler)
       */
      override fun conflictHandler(): String? = unwrap(this).getConflictHandler()

      /**
       * The `LambdaConflictHandlerConfig` when configuring `LAMBDA` as the Conflict Handler.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html#cfn-appsync-resolver-syncconfig-lambdaconflicthandlerconfig)
       */
      override fun lambdaConflictHandlerConfig(): Any? =
          unwrap(this).getLambdaConflictHandlerConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SyncConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty):
          SyncConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SyncConfigProperty):
          software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty
    }
  }

  public interface PipelineConfigProperty {
    /**
     * A list of `Function` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-pipelineconfig.html#cfn-appsync-resolver-pipelineconfig-functions)
     */
    public fun functions(): List<String> = unwrap(this).getFunctions() ?: emptyList()

    /**
     * A builder for [PipelineConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param functions A list of `Function` objects.
       */
      public fun functions(functions: List<String>)

      /**
       * @param functions A list of `Function` objects.
       */
      public fun functions(vararg functions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty.builder()

      /**
       * @param functions A list of `Function` objects.
       */
      override fun functions(functions: List<String>) {
        cdkBuilder.functions(functions)
      }

      /**
       * @param functions A list of `Function` objects.
       */
      override fun functions(vararg functions: String): Unit = functions(functions.toList())

      public fun build(): software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty,
    ) : CdkObject(cdkObject), PipelineConfigProperty {
      /**
       * A list of `Function` objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-pipelineconfig.html#cfn-appsync-resolver-pipelineconfig-functions)
       */
      override fun functions(): List<String> = unwrap(this).getFunctions() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipelineConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty):
          PipelineConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipelineConfigProperty):
          software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty
    }
  }

  public interface AppSyncRuntimeProperty {
    /**
     * The `name` of the runtime to use.
     *
     * Currently, the only allowed value is `APPSYNC_JS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-appsyncruntime.html#cfn-appsync-resolver-appsyncruntime-name)
     */
    public fun name(): String

    /**
     * The `version` of the runtime to use.
     *
     * Currently, the only allowed version is `1.0.0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-appsyncruntime.html#cfn-appsync-resolver-appsyncruntime-runtimeversion)
     */
    public fun runtimeVersion(): String

    /**
     * A builder for [AppSyncRuntimeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The `name` of the runtime to use. 
       * Currently, the only allowed value is `APPSYNC_JS` .
       */
      public fun name(name: String)

      /**
       * @param runtimeVersion The `version` of the runtime to use. 
       * Currently, the only allowed version is `1.0.0` .
       */
      public fun runtimeVersion(runtimeVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnResolver.AppSyncRuntimeProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnResolver.AppSyncRuntimeProperty.builder()

      /**
       * @param name The `name` of the runtime to use. 
       * Currently, the only allowed value is `APPSYNC_JS` .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param runtimeVersion The `version` of the runtime to use. 
       * Currently, the only allowed version is `1.0.0` .
       */
      override fun runtimeVersion(runtimeVersion: String) {
        cdkBuilder.runtimeVersion(runtimeVersion)
      }

      public fun build(): software.amazon.awscdk.services.appsync.CfnResolver.AppSyncRuntimeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnResolver.AppSyncRuntimeProperty,
    ) : CdkObject(cdkObject), AppSyncRuntimeProperty {
      /**
       * The `name` of the runtime to use.
       *
       * Currently, the only allowed value is `APPSYNC_JS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-appsyncruntime.html#cfn-appsync-resolver-appsyncruntime-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The `version` of the runtime to use.
       *
       * Currently, the only allowed version is `1.0.0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-appsyncruntime.html#cfn-appsync-resolver-appsyncruntime-runtimeversion)
       */
      override fun runtimeVersion(): String = unwrap(this).getRuntimeVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncRuntimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolver.AppSyncRuntimeProperty):
          AppSyncRuntimeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppSyncRuntimeProperty):
          software.amazon.awscdk.services.appsync.CfnResolver.AppSyncRuntimeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnResolver.AppSyncRuntimeProperty
    }
  }

  public interface LambdaConflictHandlerConfigProperty {
    /**
     * The Amazon Resource Name (ARN) for the Lambda function to use as the Conflict Handler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-lambdaconflicthandlerconfig.html#cfn-appsync-resolver-lambdaconflicthandlerconfig-lambdaconflicthandlerarn)
     */
    public fun lambdaConflictHandlerArn(): String? = unwrap(this).getLambdaConflictHandlerArn()

    /**
     * A builder for [LambdaConflictHandlerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaConflictHandlerArn The Amazon Resource Name (ARN) for the Lambda function to
       * use as the Conflict Handler.
       */
      public fun lambdaConflictHandlerArn(lambdaConflictHandlerArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty.builder()

      /**
       * @param lambdaConflictHandlerArn The Amazon Resource Name (ARN) for the Lambda function to
       * use as the Conflict Handler.
       */
      override fun lambdaConflictHandlerArn(lambdaConflictHandlerArn: String) {
        cdkBuilder.lambdaConflictHandlerArn(lambdaConflictHandlerArn)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty,
    ) : CdkObject(cdkObject), LambdaConflictHandlerConfigProperty {
      /**
       * The Amazon Resource Name (ARN) for the Lambda function to use as the Conflict Handler.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-lambdaconflicthandlerconfig.html#cfn-appsync-resolver-lambdaconflicthandlerconfig-lambdaconflicthandlerarn)
       */
      override fun lambdaConflictHandlerArn(): String? = unwrap(this).getLambdaConflictHandlerArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaConflictHandlerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty):
          LambdaConflictHandlerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConflictHandlerConfigProperty):
          software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty
    }
  }

  public interface CachingConfigProperty {
    /**
     * The caching keys for a resolver that has caching activated.
     *
     * Valid values are entries from the `$context.arguments` , `$context.source` , and
     * `$context.identity` maps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html#cfn-appsync-resolver-cachingconfig-cachingkeys)
     */
    public fun cachingKeys(): List<String> = unwrap(this).getCachingKeys() ?: emptyList()

    /**
     * The TTL in seconds for a resolver that has caching activated.
     *
     * Valid values are 1–3,600 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html#cfn-appsync-resolver-cachingconfig-ttl)
     */
    public fun ttl(): Number

    /**
     * A builder for [CachingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cachingKeys The caching keys for a resolver that has caching activated.
       * Valid values are entries from the `$context.arguments` , `$context.source` , and
       * `$context.identity` maps.
       */
      public fun cachingKeys(cachingKeys: List<String>)

      /**
       * @param cachingKeys The caching keys for a resolver that has caching activated.
       * Valid values are entries from the `$context.arguments` , `$context.source` , and
       * `$context.identity` maps.
       */
      public fun cachingKeys(vararg cachingKeys: String)

      /**
       * @param ttl The TTL in seconds for a resolver that has caching activated. 
       * Valid values are 1–3,600 seconds.
       */
      public fun ttl(ttl: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty.builder()

      /**
       * @param cachingKeys The caching keys for a resolver that has caching activated.
       * Valid values are entries from the `$context.arguments` , `$context.source` , and
       * `$context.identity` maps.
       */
      override fun cachingKeys(cachingKeys: List<String>) {
        cdkBuilder.cachingKeys(cachingKeys)
      }

      /**
       * @param cachingKeys The caching keys for a resolver that has caching activated.
       * Valid values are entries from the `$context.arguments` , `$context.source` , and
       * `$context.identity` maps.
       */
      override fun cachingKeys(vararg cachingKeys: String): Unit = cachingKeys(cachingKeys.toList())

      /**
       * @param ttl The TTL in seconds for a resolver that has caching activated. 
       * Valid values are 1–3,600 seconds.
       */
      override fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
      }

      public fun build(): software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty,
    ) : CdkObject(cdkObject), CachingConfigProperty {
      /**
       * The caching keys for a resolver that has caching activated.
       *
       * Valid values are entries from the `$context.arguments` , `$context.source` , and
       * `$context.identity` maps.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html#cfn-appsync-resolver-cachingconfig-cachingkeys)
       */
      override fun cachingKeys(): List<String> = unwrap(this).getCachingKeys() ?: emptyList()

      /**
       * The TTL in seconds for a resolver that has caching activated.
       *
       * Valid values are 1–3,600 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html#cfn-appsync-resolver-cachingconfig-ttl)
       */
      override fun ttl(): Number = unwrap(this).getTtl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CachingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty):
          CachingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CachingConfigProperty):
          software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty
    }
  }
}
