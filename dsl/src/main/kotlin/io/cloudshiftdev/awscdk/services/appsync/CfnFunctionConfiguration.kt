package io.cloudshiftdev.awscdk.services.appsync

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFunctionConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfiguration,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The AWS AppSync GraphQL API that you want to attach using this function.
   */
  public open fun apiId(): String = unwrap(this).getApiId()

  /**
   * The AWS AppSync GraphQL API that you want to attach using this function.
   */
  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  /**
   * The name of data source this function will attach.
   */
  public open fun attrDataSourceName(): String = unwrap(this).getAttrDataSourceName()

  /**
   * ARN of the function, such as
   * `arn:aws:appsync:us-east-1:123456789012:apis/graphqlapiid/functions/functionId` .
   */
  public open fun attrFunctionArn(): String = unwrap(this).getAttrFunctionArn()

  /**
   * The unique ID of this function.
   */
  public open fun attrFunctionId(): String = unwrap(this).getAttrFunctionId()

  /**
   * The name of the function.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

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
   * The name of data source this function will attach.
   */
  public open fun dataSourceName(): String = unwrap(this).getDataSourceName()

  /**
   * The name of data source this function will attach.
   */
  public open fun dataSourceName(`value`: String) {
    unwrap(this).setDataSourceName(`value`)
  }

  /**
   * The `Function` description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The `Function` description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The version of the request mapping template.
   */
  public open fun functionVersion(): String? = unwrap(this).getFunctionVersion()

  /**
   * The version of the request mapping template.
   */
  public open fun functionVersion(`value`: String) {
    unwrap(this).setFunctionVersion(`value`)
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
   * The name of the function.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the function.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The `Function` request mapping template.
   */
  public open fun requestMappingTemplate(): String? = unwrap(this).getRequestMappingTemplate()

  /**
   * The `Function` request mapping template.
   */
  public open fun requestMappingTemplate(`value`: String) {
    unwrap(this).setRequestMappingTemplate(`value`)
  }

  /**
   * Describes a Sync configuration for a resolver.
   */
  public open fun requestMappingTemplateS3Location(): String? =
      unwrap(this).getRequestMappingTemplateS3Location()

  /**
   * Describes a Sync configuration for a resolver.
   */
  public open fun requestMappingTemplateS3Location(`value`: String) {
    unwrap(this).setRequestMappingTemplateS3Location(`value`)
  }

  /**
   * The `Function` response mapping template.
   */
  public open fun responseMappingTemplate(): String? = unwrap(this).getResponseMappingTemplate()

  /**
   * The `Function` response mapping template.
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
  @JvmName("9a1d6a3831ca779af71957c41f9ca96de88cf0d67960548f4622ea6f8e51e2bf")
  public open fun runtime(`value`: AppSyncRuntimeProperty.Builder.() -> Unit): Unit =
      runtime(AppSyncRuntimeProperty(`value`))

  /**
   * Describes a Sync configuration for a resolver.
   */
  public open fun syncConfig(): Any? = unwrap(this).getSyncConfig()

  /**
   * Describes a Sync configuration for a resolver.
   */
  public open fun syncConfig(`value`: IResolvable) {
    unwrap(this).setSyncConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes a Sync configuration for a resolver.
   */
  public open fun syncConfig(`value`: SyncConfigProperty) {
    unwrap(this).setSyncConfig(`value`.let(SyncConfigProperty::unwrap))
  }

  /**
   * Describes a Sync configuration for a resolver.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6950e8658e31216bb8003ba03abe0db09da789cf35131cffc391cfb0036676b8")
  public open fun syncConfig(`value`: SyncConfigProperty.Builder.() -> Unit): Unit =
      syncConfig(SyncConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.CfnFunctionConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS AppSync GraphQL API that you want to attach using this function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-apiid)
     * @param apiId The AWS AppSync GraphQL API that you want to attach using this function. 
     */
    public fun apiId(apiId: String)

    /**
     * The `resolver` code that contains the request and response functions.
     *
     * When code is used, the `runtime` is required. The runtime value must be `APPSYNC_JS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-code)
     * @param code The `resolver` code that contains the request and response functions. 
     */
    public fun code(code: String)

    /**
     * The Amazon S3 endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-codes3location)
     * @param codeS3Location The Amazon S3 endpoint. 
     */
    public fun codeS3Location(codeS3Location: String)

    /**
     * The name of data source this function will attach.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-datasourcename)
     * @param dataSourceName The name of data source this function will attach. 
     */
    public fun dataSourceName(dataSourceName: String)

    /**
     * The `Function` description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-description)
     * @param description The `Function` description. 
     */
    public fun description(description: String)

    /**
     * The version of the request mapping template.
     *
     * Currently, only the 2018-05-29 version of the template is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-functionversion)
     * @param functionVersion The version of the request mapping template. 
     */
    public fun functionVersion(functionVersion: String)

    /**
     * The maximum number of resolver request inputs that will be sent to a single AWS Lambda
     * function in a `BatchInvoke` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-maxbatchsize)
     * @param maxBatchSize The maximum number of resolver request inputs that will be sent to a
     * single AWS Lambda function in a `BatchInvoke` operation. 
     */
    public fun maxBatchSize(maxBatchSize: Number)

    /**
     * The name of the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-name)
     * @param name The name of the function. 
     */
    public fun name(name: String)

    /**
     * The `Function` request mapping template.
     *
     * Functions support only the 2018-05-29 version of the request mapping template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplate)
     * @param requestMappingTemplate The `Function` request mapping template. 
     */
    public fun requestMappingTemplate(requestMappingTemplate: String)

    /**
     * Describes a Sync configuration for a resolver.
     *
     * Contains information on which Conflict Detection, as well as Resolution strategy, should be
     * performed when the resolver is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplates3location)
     * @param requestMappingTemplateS3Location Describes a Sync configuration for a resolver. 
     */
    public fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String)

    /**
     * The `Function` response mapping template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplate)
     * @param responseMappingTemplate The `Function` response mapping template. 
     */
    public fun responseMappingTemplate(responseMappingTemplate: String)

    /**
     * The location of a response mapping template in an Amazon S3 bucket.
     *
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplates3location)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-runtime)
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function. 
     */
    public fun runtime(runtime: IResolvable)

    /**
     * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-runtime)
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function. 
     */
    public fun runtime(runtime: AppSyncRuntimeProperty)

    /**
     * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-runtime)
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aee9cb0c2eac2e09640b5ced407af5454fe685886a2105445fdb2d8de57a1d82")
    public fun runtime(runtime: AppSyncRuntimeProperty.Builder.() -> Unit)

    /**
     * Describes a Sync configuration for a resolver.
     *
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-syncconfig)
     * @param syncConfig Describes a Sync configuration for a resolver. 
     */
    public fun syncConfig(syncConfig: IResolvable)

    /**
     * Describes a Sync configuration for a resolver.
     *
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-syncconfig)
     * @param syncConfig Describes a Sync configuration for a resolver. 
     */
    public fun syncConfig(syncConfig: SyncConfigProperty)

    /**
     * Describes a Sync configuration for a resolver.
     *
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-syncconfig)
     * @param syncConfig Describes a Sync configuration for a resolver. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3450b107b4f5a5b21242e26c0a0af06c4f469169b4ef550e40f90630e7386c4d")
    public fun syncConfig(syncConfig: SyncConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.Builder
        = software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.Builder.create(scope, id)

    /**
     * The AWS AppSync GraphQL API that you want to attach using this function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-apiid)
     * @param apiId The AWS AppSync GraphQL API that you want to attach using this function. 
     */
    override fun apiId(apiId: String) {
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
    override fun code(code: String) {
      cdkBuilder.code(code)
    }

    /**
     * The Amazon S3 endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-codes3location)
     * @param codeS3Location The Amazon S3 endpoint. 
     */
    override fun codeS3Location(codeS3Location: String) {
      cdkBuilder.codeS3Location(codeS3Location)
    }

    /**
     * The name of data source this function will attach.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-datasourcename)
     * @param dataSourceName The name of data source this function will attach. 
     */
    override fun dataSourceName(dataSourceName: String) {
      cdkBuilder.dataSourceName(dataSourceName)
    }

    /**
     * The `Function` description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-description)
     * @param description The `Function` description. 
     */
    override fun description(description: String) {
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
    override fun functionVersion(functionVersion: String) {
      cdkBuilder.functionVersion(functionVersion)
    }

    /**
     * The maximum number of resolver request inputs that will be sent to a single AWS Lambda
     * function in a `BatchInvoke` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-maxbatchsize)
     * @param maxBatchSize The maximum number of resolver request inputs that will be sent to a
     * single AWS Lambda function in a `BatchInvoke` operation. 
     */
    override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    /**
     * The name of the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-name)
     * @param name The name of the function. 
     */
    override fun name(name: String) {
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
    override fun requestMappingTemplate(requestMappingTemplate: String) {
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
    override fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String) {
      cdkBuilder.requestMappingTemplateS3Location(requestMappingTemplateS3Location)
    }

    /**
     * The `Function` response mapping template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplate)
     * @param responseMappingTemplate The `Function` response mapping template. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplates3location)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-runtime)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-runtime)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-runtime)
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aee9cb0c2eac2e09640b5ced407af5454fe685886a2105445fdb2d8de57a1d82")
    override fun runtime(runtime: AppSyncRuntimeProperty.Builder.() -> Unit): Unit =
        runtime(AppSyncRuntimeProperty(runtime))

    /**
     * Describes a Sync configuration for a resolver.
     *
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-syncconfig)
     * @param syncConfig Describes a Sync configuration for a resolver. 
     */
    override fun syncConfig(syncConfig: IResolvable) {
      cdkBuilder.syncConfig(syncConfig.let(IResolvable::unwrap))
    }

    /**
     * Describes a Sync configuration for a resolver.
     *
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-syncconfig)
     * @param syncConfig Describes a Sync configuration for a resolver. 
     */
    override fun syncConfig(syncConfig: SyncConfigProperty) {
      cdkBuilder.syncConfig(syncConfig.let(SyncConfigProperty::unwrap))
    }

    /**
     * Describes a Sync configuration for a resolver.
     *
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-syncconfig)
     * @param syncConfig Describes a Sync configuration for a resolver. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3450b107b4f5a5b21242e26c0a0af06c4f469169b4ef550e40f90630e7386c4d")
    override fun syncConfig(syncConfig: SyncConfigProperty.Builder.() -> Unit): Unit =
        syncConfig(SyncConfigProperty(syncConfig))

    public fun build(): software.amazon.awscdk.services.appsync.CfnFunctionConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFunctionConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFunctionConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfiguration):
        CfnFunctionConfiguration = CfnFunctionConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionConfiguration):
        software.amazon.awscdk.services.appsync.CfnFunctionConfiguration = wrapped.cdkObject
  }

  public interface SyncConfigProperty {
    /**
     * The Conflict Detection strategy to use.
     *
     * * *VERSION* : Detect conflicts based on object versions for this resolver.
     * * *NONE* : Do not detect conflicts when invoking this resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-syncconfig.html#cfn-appsync-functionconfiguration-syncconfig-conflictdetection)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-syncconfig.html#cfn-appsync-functionconfiguration-syncconfig-conflicthandler)
     */
    public fun conflictHandler(): String? = unwrap(this).getConflictHandler()

    /**
     * The `LambdaConflictHandlerConfig` when configuring `LAMBDA` as the Conflict Handler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-syncconfig.html#cfn-appsync-functionconfiguration-syncconfig-lambdaconflicthandlerconfig)
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
      @JvmName("47ad2842ecf8112948437414f67c14c27c4b47f5312b81cf98b245cd5a28ebc2")
      public
          fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: LambdaConflictHandlerConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty.builder()

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
      @JvmName("47ad2842ecf8112948437414f67c14c27c4b47f5312b81cf98b245cd5a28ebc2")
      override
          fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: LambdaConflictHandlerConfigProperty.Builder.() -> Unit):
          Unit =
          lambdaConflictHandlerConfig(LambdaConflictHandlerConfigProperty(lambdaConflictHandlerConfig))

      public fun build():
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty,
    ) : SyncConfigProperty {
      /**
       * The Conflict Detection strategy to use.
       *
       * * *VERSION* : Detect conflicts based on object versions for this resolver.
       * * *NONE* : Do not detect conflicts when invoking this resolver.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-syncconfig.html#cfn-appsync-functionconfiguration-syncconfig-conflictdetection)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-syncconfig.html#cfn-appsync-functionconfiguration-syncconfig-conflicthandler)
       */
      override fun conflictHandler(): String? = unwrap(this).getConflictHandler()

      /**
       * The `LambdaConflictHandlerConfig` when configuring `LAMBDA` as the Conflict Handler.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-syncconfig.html#cfn-appsync-functionconfiguration-syncconfig-lambdaconflicthandlerconfig)
       */
      override fun lambdaConflictHandlerConfig(): Any? =
          unwrap(this).getLambdaConflictHandlerConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SyncConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty):
          SyncConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SyncConfigProperty):
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaConflictHandlerConfigProperty {
    /**
     * The Amazon Resource Name (ARN) for the Lambda function to use as the Conflict Handler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-lambdaconflicthandlerconfig.html#cfn-appsync-functionconfiguration-lambdaconflicthandlerconfig-lambdaconflicthandlerarn)
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
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty.builder()

      /**
       * @param lambdaConflictHandlerArn The Amazon Resource Name (ARN) for the Lambda function to
       * use as the Conflict Handler.
       */
      override fun lambdaConflictHandlerArn(lambdaConflictHandlerArn: String) {
        cdkBuilder.lambdaConflictHandlerArn(lambdaConflictHandlerArn)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty,
    ) : LambdaConflictHandlerConfigProperty {
      /**
       * The Amazon Resource Name (ARN) for the Lambda function to use as the Conflict Handler.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-lambdaconflicthandlerconfig.html#cfn-appsync-functionconfiguration-lambdaconflicthandlerconfig-lambdaconflicthandlerarn)
       */
      override fun lambdaConflictHandlerArn(): String? = unwrap(this).getLambdaConflictHandlerArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaConflictHandlerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty):
          LambdaConflictHandlerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConflictHandlerConfigProperty):
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AppSyncRuntimeProperty {
    /**
     * The `name` of the runtime to use.
     *
     * Currently, the only allowed value is `APPSYNC_JS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-appsyncruntime.html#cfn-appsync-functionconfiguration-appsyncruntime-name)
     */
    public fun name(): String

    /**
     * The `version` of the runtime to use.
     *
     * Currently, the only allowed version is `1.0.0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-appsyncruntime.html#cfn-appsync-functionconfiguration-appsyncruntime-runtimeversion)
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
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.AppSyncRuntimeProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.AppSyncRuntimeProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.AppSyncRuntimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.AppSyncRuntimeProperty,
    ) : AppSyncRuntimeProperty {
      /**
       * The `name` of the runtime to use.
       *
       * Currently, the only allowed value is `APPSYNC_JS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-appsyncruntime.html#cfn-appsync-functionconfiguration-appsyncruntime-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The `version` of the runtime to use.
       *
       * Currently, the only allowed version is `1.0.0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-appsyncruntime.html#cfn-appsync-functionconfiguration-appsyncruntime-runtimeversion)
       */
      override fun runtimeVersion(): String = unwrap(this).getRuntimeVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncRuntimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.AppSyncRuntimeProperty):
          AppSyncRuntimeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppSyncRuntimeProperty):
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.AppSyncRuntimeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
