@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFunctionConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
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
public interface CfnFunctionConfigurationProps {
  /**
   * The AWS AppSync GraphQL API that you want to attach using this function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-apiid)
   */
  public fun apiId(): String

  /**
   * The `resolver` code that contains the request and response functions.
   *
   * When code is used, the `runtime` is required. The runtime value must be `APPSYNC_JS` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-code)
   */
  public fun code(): String? = unwrap(this).getCode()

  /**
   * The Amazon S3 endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-codes3location)
   */
  public fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

  /**
   * The name of data source this function will attach.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-datasourcename)
   */
  public fun dataSourceName(): String

  /**
   * The `Function` description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The version of the request mapping template.
   *
   * Currently, only the 2018-05-29 version of the template is supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-functionversion)
   */
  public fun functionVersion(): String? = unwrap(this).getFunctionVersion()

  /**
   * The maximum number of resolver request inputs that will be sent to a single AWS Lambda function
   * in a `BatchInvoke` operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-maxbatchsize)
   */
  public fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

  /**
   * The name of the function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-name)
   */
  public fun name(): String

  /**
   * The `Function` request mapping template.
   *
   * Functions support only the 2018-05-29 version of the request mapping template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplate)
   */
  public fun requestMappingTemplate(): String? = unwrap(this).getRequestMappingTemplate()

  /**
   * Describes a Sync configuration for a resolver.
   *
   * Contains information on which Conflict Detection, as well as Resolution strategy, should be
   * performed when the resolver is invoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplates3location)
   */
  public fun requestMappingTemplateS3Location(): String? =
      unwrap(this).getRequestMappingTemplateS3Location()

  /**
   * The `Function` response mapping template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplate)
   */
  public fun responseMappingTemplate(): String? = unwrap(this).getResponseMappingTemplate()

  /**
   * The location of a response mapping template in an Amazon S3 bucket.
   *
   * Use this if you want to provision with a template file in Amazon S3 rather than embedding it in
   * your CloudFormation template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplates3location)
   */
  public fun responseMappingTemplateS3Location(): String? =
      unwrap(this).getResponseMappingTemplateS3Location()

  /**
   * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
   *
   * Specifies the name and version of the runtime to use. Note that if a runtime is specified, code
   * must also be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-runtime)
   */
  public fun runtime(): Any? = unwrap(this).getRuntime()

  /**
   * Describes a Sync configuration for a resolver.
   *
   * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver is
   * invoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-syncconfig)
   */
  public fun syncConfig(): Any? = unwrap(this).getSyncConfig()

  /**
   * A builder for [CfnFunctionConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The AWS AppSync GraphQL API that you want to attach using this function. 
     */
    public fun apiId(apiId: String)

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
     * @param dataSourceName The name of data source this function will attach. 
     */
    public fun dataSourceName(dataSourceName: String)

    /**
     * @param description The `Function` description.
     */
    public fun description(description: String)

    /**
     * @param functionVersion The version of the request mapping template.
     * Currently, only the 2018-05-29 version of the template is supported.
     */
    public fun functionVersion(functionVersion: String)

    /**
     * @param maxBatchSize The maximum number of resolver request inputs that will be sent to a
     * single AWS Lambda function in a `BatchInvoke` operation.
     */
    public fun maxBatchSize(maxBatchSize: Number)

    /**
     * @param name The name of the function. 
     */
    public fun name(name: String)

    /**
     * @param requestMappingTemplate The `Function` request mapping template.
     * Functions support only the 2018-05-29 version of the request mapping template.
     */
    public fun requestMappingTemplate(requestMappingTemplate: String)

    /**
     * @param requestMappingTemplateS3Location Describes a Sync configuration for a resolver.
     * Contains information on which Conflict Detection, as well as Resolution strategy, should be
     * performed when the resolver is invoked.
     */
    public fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String)

    /**
     * @param responseMappingTemplate The `Function` response mapping template.
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
    public fun runtime(runtime: CfnFunctionConfiguration.AppSyncRuntimeProperty)

    /**
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd6b0850a1d43aff3e81e6e3b0f9ba43d82c92c6943f29c1fff4a36ec4eb1031")
    public fun runtime(runtime: CfnFunctionConfiguration.AppSyncRuntimeProperty.Builder.() -> Unit)

    /**
     * @param syncConfig Describes a Sync configuration for a resolver.
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     */
    public fun syncConfig(syncConfig: IResolvable)

    /**
     * @param syncConfig Describes a Sync configuration for a resolver.
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     */
    public fun syncConfig(syncConfig: CfnFunctionConfiguration.SyncConfigProperty)

    /**
     * @param syncConfig Describes a Sync configuration for a resolver.
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aeed83ee53c56109cd9d37578a4f165b3e5d7b143c751ff5b5ba77bee42a2125")
    public
        fun syncConfig(syncConfig: CfnFunctionConfiguration.SyncConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder =
        software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.builder()

    /**
     * @param apiId The AWS AppSync GraphQL API that you want to attach using this function. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

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
     * @param dataSourceName The name of data source this function will attach. 
     */
    override fun dataSourceName(dataSourceName: String) {
      cdkBuilder.dataSourceName(dataSourceName)
    }

    /**
     * @param description The `Function` description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param functionVersion The version of the request mapping template.
     * Currently, only the 2018-05-29 version of the template is supported.
     */
    override fun functionVersion(functionVersion: String) {
      cdkBuilder.functionVersion(functionVersion)
    }

    /**
     * @param maxBatchSize The maximum number of resolver request inputs that will be sent to a
     * single AWS Lambda function in a `BatchInvoke` operation.
     */
    override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    /**
     * @param name The name of the function. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param requestMappingTemplate The `Function` request mapping template.
     * Functions support only the 2018-05-29 version of the request mapping template.
     */
    override fun requestMappingTemplate(requestMappingTemplate: String) {
      cdkBuilder.requestMappingTemplate(requestMappingTemplate)
    }

    /**
     * @param requestMappingTemplateS3Location Describes a Sync configuration for a resolver.
     * Contains information on which Conflict Detection, as well as Resolution strategy, should be
     * performed when the resolver is invoked.
     */
    override fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String) {
      cdkBuilder.requestMappingTemplateS3Location(requestMappingTemplateS3Location)
    }

    /**
     * @param responseMappingTemplate The `Function` response mapping template.
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
    override fun runtime(runtime: CfnFunctionConfiguration.AppSyncRuntimeProperty) {
      cdkBuilder.runtime(runtime.let(CfnFunctionConfiguration.AppSyncRuntimeProperty::unwrap))
    }

    /**
     * @param runtime Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd6b0850a1d43aff3e81e6e3b0f9ba43d82c92c6943f29c1fff4a36ec4eb1031")
    override
        fun runtime(runtime: CfnFunctionConfiguration.AppSyncRuntimeProperty.Builder.() -> Unit):
        Unit = runtime(CfnFunctionConfiguration.AppSyncRuntimeProperty(runtime))

    /**
     * @param syncConfig Describes a Sync configuration for a resolver.
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     */
    override fun syncConfig(syncConfig: IResolvable) {
      cdkBuilder.syncConfig(syncConfig.let(IResolvable::unwrap))
    }

    /**
     * @param syncConfig Describes a Sync configuration for a resolver.
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     */
    override fun syncConfig(syncConfig: CfnFunctionConfiguration.SyncConfigProperty) {
      cdkBuilder.syncConfig(syncConfig.let(CfnFunctionConfiguration.SyncConfigProperty::unwrap))
    }

    /**
     * @param syncConfig Describes a Sync configuration for a resolver.
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aeed83ee53c56109cd9d37578a4f165b3e5d7b143c751ff5b5ba77bee42a2125")
    override
        fun syncConfig(syncConfig: CfnFunctionConfiguration.SyncConfigProperty.Builder.() -> Unit):
        Unit = syncConfig(CfnFunctionConfiguration.SyncConfigProperty(syncConfig))

    public fun build(): software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps,
  ) : CdkObject(cdkObject), CfnFunctionConfigurationProps {
    /**
     * The AWS AppSync GraphQL API that you want to attach using this function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * The `resolver` code that contains the request and response functions.
     *
     * When code is used, the `runtime` is required. The runtime value must be `APPSYNC_JS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-code)
     */
    override fun code(): String? = unwrap(this).getCode()

    /**
     * The Amazon S3 endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-codes3location)
     */
    override fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

    /**
     * The name of data source this function will attach.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-datasourcename)
     */
    override fun dataSourceName(): String = unwrap(this).getDataSourceName()

    /**
     * The `Function` description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The version of the request mapping template.
     *
     * Currently, only the 2018-05-29 version of the template is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-functionversion)
     */
    override fun functionVersion(): String? = unwrap(this).getFunctionVersion()

    /**
     * The maximum number of resolver request inputs that will be sent to a single AWS Lambda
     * function in a `BatchInvoke` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-maxbatchsize)
     */
    override fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

    /**
     * The name of the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The `Function` request mapping template.
     *
     * Functions support only the 2018-05-29 version of the request mapping template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplate)
     */
    override fun requestMappingTemplate(): String? = unwrap(this).getRequestMappingTemplate()

    /**
     * Describes a Sync configuration for a resolver.
     *
     * Contains information on which Conflict Detection, as well as Resolution strategy, should be
     * performed when the resolver is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-requestmappingtemplates3location)
     */
    override fun requestMappingTemplateS3Location(): String? =
        unwrap(this).getRequestMappingTemplateS3Location()

    /**
     * The `Function` response mapping template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplate)
     */
    override fun responseMappingTemplate(): String? = unwrap(this).getResponseMappingTemplate()

    /**
     * The location of a response mapping template in an Amazon S3 bucket.
     *
     * Use this if you want to provision with a template file in Amazon S3 rather than embedding it
     * in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-responsemappingtemplates3location)
     */
    override fun responseMappingTemplateS3Location(): String? =
        unwrap(this).getResponseMappingTemplateS3Location()

    /**
     * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-runtime)
     */
    override fun runtime(): Any? = unwrap(this).getRuntime()

    /**
     * Describes a Sync configuration for a resolver.
     *
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html#cfn-appsync-functionconfiguration-syncconfig)
     */
    override fun syncConfig(): Any? = unwrap(this).getSyncConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFunctionConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps):
        CfnFunctionConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnFunctionConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionConfigurationProps):
        software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps
  }
}
