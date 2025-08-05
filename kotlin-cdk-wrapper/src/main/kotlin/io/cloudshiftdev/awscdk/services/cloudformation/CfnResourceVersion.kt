@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CloudFormation::ResourceVersion` resource registers a resource version with the
 * CloudFormation registry.
 *
 * Registering a resource version makes it available for use in CloudFormation templates in your AWS
 * account , and includes:
 *
 * * Validating the resource schema.
 * * Determining which handlers, if any, have been specified for the resource.
 * * Making the resource available for use in your account.
 *
 * For information about the CloudFormation registry, see [Managing extensions with the
 * CloudFormation
 * registry](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html) in the *AWS
 * CloudFormation User Guide* .
 *
 * You can have a maximum of 50 resource versions registered at a time. This maximum is per account
 * and per Region.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
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
public open class CfnResourceVersion(
  cdkObject: software.amazon.awscdk.services.cloudformation.CfnResourceVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceVersionProps,
  ) :
      this(software.amazon.awscdk.services.cloudformation.CfnResourceVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResourceVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourceVersionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Whether the specified resource version is set as the default version.
   *
   * This applies only to private extensions you have registered in your account, and extensions
   * published by AWS . For public third-party extensions, whether they are activated in your account,
   * CloudFormation returns `null` .
   */
  public open fun attrIsDefaultVersion(): IResolvable =
      unwrap(this).getAttrIsDefaultVersion().let(IResolvable::wrap)

  /**
   * For resource type extensions, the provisioning behavior of the resource type.
   *
   * CloudFormation determines the provisioning type during registration, based on the types of
   * handlers in the schema handler package submitted.
   *
   * Possible values:
   *
   * * `FULLY_MUTABLE` : The resource type includes an update handler to process updates to the type
   * during stack update operations.
   * * `IMMUTABLE` : The resource type doesn't include an update handler, so the type can't be
   * updated and must instead be replaced during stack update operations.
   * * `NON_PROVISIONABLE` : The resource type doesn't include all the following handlers, and
   * therefore can't actually be provisioned.
   * * create
   * * read
   * * delete
   */
  public open fun attrProvisioningType(): String = unwrap(this).getAttrProvisioningType()

  /**
   * The Amazon Resource Name (ARN) for the extension.
   */
  public open fun attrTypeArn(): String = unwrap(this).getAttrTypeArn()

  /**
   * The ID of a specific version of the resource.
   *
   * The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the
   * resource version when it is registered.
   */
  public open fun attrVersionId(): String = unwrap(this).getAttrVersionId()

  /**
   * The visibility level that determines who can see and use this resource in CloudFormation
   * operations:.
   *
   * * `PRIVATE` : The resource is only visible and usable within the account where it was
   * registered. CloudFormation automatically marks any resources you register as `PRIVATE` .
   * * `PUBLIC` : The resource is publicly visible and usable within any AWS account.
   */
  public open fun attrVisibility(): String = unwrap(this).getAttrVisibility()

  /**
   * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the
   * resource.
   */
  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the
   * resource.
   */
  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Logging configuration information for a resource.
   */
  public open fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  /**
   * Logging configuration information for a resource.
   */
  public open fun loggingConfig(`value`: IResolvable) {
    unwrap(this).setLoggingConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Logging configuration information for a resource.
   */
  public open fun loggingConfig(`value`: LoggingConfigProperty) {
    unwrap(this).setLoggingConfig(`value`.let(LoggingConfigProperty.Companion::unwrap))
  }

  /**
   * Logging configuration information for a resource.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a3b08ef49289590863b579c4ddae8ec5fa8bff3fe8f71be2baa93b6e000019")
  public open fun loggingConfig(`value`: LoggingConfigProperty.Builder.() -> Unit): Unit =
      loggingConfig(LoggingConfigProperty(`value`))

  /**
   * A URL to the S3 bucket for the resource project package that contains the necessary files for
   * the resource you want to register.
   */
  public open fun schemaHandlerPackage(): String = unwrap(this).getSchemaHandlerPackage()

  /**
   * A URL to the S3 bucket for the resource project package that contains the necessary files for
   * the resource you want to register.
   */
  public open fun schemaHandlerPackage(`value`: String) {
    unwrap(this).setSchemaHandlerPackage(`value`)
  }

  /**
   * The name of the resource being registered.
   */
  public open fun typeName(): String = unwrap(this).getTypeName()

  /**
   * The name of the resource being registered.
   */
  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudformation.CfnResourceVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the
     * resource.
     *
     * If your resource calls AWS APIs in any of its handlers, you must create an IAM execution role
     * that includes the necessary permissions to call those AWS APIs, and provision that execution
     * role in your account. When CloudFormation needs to invoke the resource type handler,
     * CloudFormation assumes this execution role to create a temporary session token, which it then
     * passes to the resource type handler, thereby supplying your resource type with the appropriate
     * credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-executionrolearn)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role for CloudFormation to
     * assume when invoking the resource. 
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * Logging configuration information for a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
     * @param loggingConfig Logging configuration information for a resource. 
     */
    public fun loggingConfig(loggingConfig: IResolvable)

    /**
     * Logging configuration information for a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
     * @param loggingConfig Logging configuration information for a resource. 
     */
    public fun loggingConfig(loggingConfig: LoggingConfigProperty)

    /**
     * Logging configuration information for a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
     * @param loggingConfig Logging configuration information for a resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10ec3fec1acf1d1aa9b49f4f1698b9b0f234e4248c80ce4ca2272fb706d600b9")
    public fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit)

    /**
     * A URL to the S3 bucket for the resource project package that contains the necessary files for
     * the resource you want to register.
     *
     * For information on generating a schema handler package, see [Modeling resource types to use
     * with AWS
     * CloudFormation](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-model.html)
     * in the *AWS CloudFormation Command Line Interface (CLI) User Guide* .
     *
     *
     * To register the resource version, you must have `s3:GetObject` permissions to access the S3
     * objects.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-schemahandlerpackage)
     * @param schemaHandlerPackage A URL to the S3 bucket for the resource project package that
     * contains the necessary files for the resource you want to register. 
     */
    public fun schemaHandlerPackage(schemaHandlerPackage: String)

    /**
     * The name of the resource being registered.
     *
     * We recommend that resource names adhere to the following pattern: *company_or_organization*
     * :: *service* :: *type* .
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
    public fun typeName(typeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnResourceVersion.Builder =
        software.amazon.awscdk.services.cloudformation.CfnResourceVersion.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the
     * resource.
     *
     * If your resource calls AWS APIs in any of its handlers, you must create an IAM execution role
     * that includes the necessary permissions to call those AWS APIs, and provision that execution
     * role in your account. When CloudFormation needs to invoke the resource type handler,
     * CloudFormation assumes this execution role to create a temporary session token, which it then
     * passes to the resource type handler, thereby supplying your resource type with the appropriate
     * credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-executionrolearn)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role for CloudFormation to
     * assume when invoking the resource. 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * Logging configuration information for a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
     * @param loggingConfig Logging configuration information for a resource. 
     */
    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Logging configuration information for a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
     * @param loggingConfig Logging configuration information for a resource. 
     */
    override fun loggingConfig(loggingConfig: LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfigProperty.Companion::unwrap))
    }

    /**
     * Logging configuration information for a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
     * @param loggingConfig Logging configuration information for a resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10ec3fec1acf1d1aa9b49f4f1698b9b0f234e4248c80ce4ca2272fb706d600b9")
    override fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit): Unit =
        loggingConfig(LoggingConfigProperty(loggingConfig))

    /**
     * A URL to the S3 bucket for the resource project package that contains the necessary files for
     * the resource you want to register.
     *
     * For information on generating a schema handler package, see [Modeling resource types to use
     * with AWS
     * CloudFormation](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-model.html)
     * in the *AWS CloudFormation Command Line Interface (CLI) User Guide* .
     *
     *
     * To register the resource version, you must have `s3:GetObject` permissions to access the S3
     * objects.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-schemahandlerpackage)
     * @param schemaHandlerPackage A URL to the S3 bucket for the resource project package that
     * contains the necessary files for the resource you want to register. 
     */
    override fun schemaHandlerPackage(schemaHandlerPackage: String) {
      cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
    }

    /**
     * The name of the resource being registered.
     *
     * We recommend that resource names adhere to the following pattern: *company_or_organization*
     * :: *service* :: *type* .
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
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnResourceVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudformation.CfnResourceVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnResourceVersion):
        CfnResourceVersion = CfnResourceVersion(cdkObject)

    internal fun unwrap(wrapped: CfnResourceVersion):
        software.amazon.awscdk.services.cloudformation.CfnResourceVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnResourceVersion
  }

  /**
   * Logging configuration information for a resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudformation.*;
   * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-resourceversion-loggingconfig.html)
   */
  public interface LoggingConfigProperty {
    /**
     * The Amazon CloudWatch logs group to which CloudFormation sends error logging information when
     * invoking the type's handlers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-resourceversion-loggingconfig.html#cfn-cloudformation-resourceversion-loggingconfig-loggroupname)
     */
    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    /**
     * The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch
     * logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-resourceversion-loggingconfig.html#cfn-cloudformation-resourceversion-loggingconfig-logrolearn)
     */
    public fun logRoleArn(): String? = unwrap(this).getLogRoleArn()

    /**
     * A builder for [LoggingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupName The Amazon CloudWatch logs group to which CloudFormation sends error
       * logging information when invoking the type's handlers.
       */
      public fun logGroupName(logGroupName: String)

      /**
       * @param logRoleArn The ARN of the role that CloudFormation should assume when sending log
       * entries to CloudWatch logs.
       */
      public fun logRoleArn(logRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty.builder()

      /**
       * @param logGroupName The Amazon CloudWatch logs group to which CloudFormation sends error
       * logging information when invoking the type's handlers.
       */
      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      /**
       * @param logRoleArn The ARN of the role that CloudFormation should assume when sending log
       * entries to CloudWatch logs.
       */
      override fun logRoleArn(logRoleArn: String) {
        cdkBuilder.logRoleArn(logRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty,
    ) : CdkObject(cdkObject),
        LoggingConfigProperty {
      /**
       * The Amazon CloudWatch logs group to which CloudFormation sends error logging information
       * when invoking the type's handlers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-resourceversion-loggingconfig.html#cfn-cloudformation-resourceversion-loggingconfig-loggroupname)
       */
      override fun logGroupName(): String? = unwrap(this).getLogGroupName()

      /**
       * The ARN of the role that CloudFormation should assume when sending log entries to
       * CloudWatch logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-resourceversion-loggingconfig.html#cfn-cloudformation-resourceversion-loggingconfig-logrolearn)
       */
      override fun logRoleArn(): String? = unwrap(this).getLogRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty):
          LoggingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? LoggingConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigProperty):
          software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty
    }
  }
}
