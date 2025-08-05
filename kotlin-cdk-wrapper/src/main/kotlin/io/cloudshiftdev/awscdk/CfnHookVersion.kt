@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

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
 * The `AWS::CloudFormation::HookVersion` resource publishes new or first version of a Hook to the
 * CloudFormation registry.
 *
 * For information about the CloudFormation registry, see [Managing extensions with the
 * CloudFormation
 * registry](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html) in the *AWS
 * CloudFormation User Guide* .
 *
 * This resource type is not compatible with Guard and Lambda Hooks.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnHookVersion cfnHookVersion = CfnHookVersion.Builder.create(this, "MyCfnHookVersion")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html)
 */
public open class CfnHookVersion(
  cdkObject: software.amazon.awscdk.CfnHookVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHookVersionProps,
  ) :
      this(software.amazon.awscdk.CfnHookVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnHookVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHookVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnHookVersionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the Hook.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Whether the specified Hook version is set as the default version.
   */
  public open fun attrIsDefaultVersion(): IResolvable =
      unwrap(this).getAttrIsDefaultVersion().let(IResolvable::wrap)

  /**
   * The Amazon Resource Number (ARN) assigned to this version of the Hook.
   */
  public open fun attrTypeArn(): String = unwrap(this).getAttrTypeArn()

  /**
   * The ID of this version of the Hook.
   */
  public open fun attrVersionId(): String = unwrap(this).getAttrVersionId()

  /**
   * The visibility level that determines who can see and use this Hook in CloudFormation
   * operations:.
   *
   * * `PRIVATE` : The Hook is only visible and usable within the account where it was registered.
   * CloudFormation automatically marks any Hooks you register as `PRIVATE` .
   * * `PUBLIC` : The Hook is publicly visible and usable within any AWS account.
   */
  public open fun attrVisibility(): String = unwrap(this).getAttrVisibility()

  /**
   * The Amazon Resource Name (ARN) of the task execution role that grants the Hook permission.
   */
  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the task execution role that grants the Hook permission.
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
   * Contains logging configuration information for an extension.
   */
  public open fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  /**
   * Contains logging configuration information for an extension.
   */
  public open fun loggingConfig(`value`: IResolvable) {
    unwrap(this).setLoggingConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains logging configuration information for an extension.
   */
  public open fun loggingConfig(`value`: LoggingConfigProperty) {
    unwrap(this).setLoggingConfig(`value`.let(LoggingConfigProperty.Companion::unwrap))
  }

  /**
   * Contains logging configuration information for an extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f5cdeb6cefe2fb06e404764989b301eb4063fa51474a091aa1c684585aedd3e")
  public open fun loggingConfig(`value`: LoggingConfigProperty.Builder.() -> Unit): Unit =
      loggingConfig(LoggingConfigProperty(`value`))

  /**
   * A URL to the Amazon S3 bucket for the Hook project package that contains the necessary files
   * for the Hook you want to register.
   */
  public open fun schemaHandlerPackage(): String = unwrap(this).getSchemaHandlerPackage()

  /**
   * A URL to the Amazon S3 bucket for the Hook project package that contains the necessary files
   * for the Hook you want to register.
   */
  public open fun schemaHandlerPackage(`value`: String) {
    unwrap(this).setSchemaHandlerPackage(`value`)
  }

  /**
   * The unique name for your hook.
   */
  public open fun typeName(): String = unwrap(this).getTypeName()

  /**
   * The unique name for your hook.
   */
  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnHookVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the task execution role that grants the Hook permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-executionrolearn)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution role that grants
     * the Hook permission. 
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * Contains logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-loggingconfig)
     * @param loggingConfig Contains logging configuration information for an extension. 
     */
    public fun loggingConfig(loggingConfig: IResolvable)

    /**
     * Contains logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-loggingconfig)
     * @param loggingConfig Contains logging configuration information for an extension. 
     */
    public fun loggingConfig(loggingConfig: LoggingConfigProperty)

    /**
     * Contains logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-loggingconfig)
     * @param loggingConfig Contains logging configuration information for an extension. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27803a6f475871d542d4fc635e75eeed0ab4ce21d9f0100c5494239cb853aa52")
    public fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit)

    /**
     * A URL to the Amazon S3 bucket for the Hook project package that contains the necessary files
     * for the Hook you want to register.
     *
     * For information on generating a schema handler package, see [Modeling custom CloudFormation
     * Hooks](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-model.html)
     * in the *AWS CloudFormation Hooks User Guide* .
     *
     *
     * To register the Hook, you must have `s3:GetObject` permissions to access the S3 objects.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-schemahandlerpackage)
     * @param schemaHandlerPackage A URL to the Amazon S3 bucket for the Hook project package that
     * contains the necessary files for the Hook you want to register. 
     */
    public fun schemaHandlerPackage(schemaHandlerPackage: String)

    /**
     * The unique name for your hook.
     *
     * Specifies a three-part namespace for your hook, with a recommended pattern of
     * `Organization::Service::Hook` .
     *
     *
     * The following organization namespaces are reserved and can't be used in your hook type names:
     *
     * * `Alexa`
     * * `AMZN`
     * * `Amazon`
     * * `ASK`
     * * `AWS`
     * * `Custom`
     * * `Dev`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-typename)
     * @param typeName The unique name for your hook. 
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnHookVersion.Builder =
        software.amazon.awscdk.CfnHookVersion.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the task execution role that grants the Hook permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-executionrolearn)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution role that grants
     * the Hook permission. 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * Contains logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-loggingconfig)
     * @param loggingConfig Contains logging configuration information for an extension. 
     */
    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-loggingconfig)
     * @param loggingConfig Contains logging configuration information for an extension. 
     */
    override fun loggingConfig(loggingConfig: LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfigProperty.Companion::unwrap))
    }

    /**
     * Contains logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-loggingconfig)
     * @param loggingConfig Contains logging configuration information for an extension. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27803a6f475871d542d4fc635e75eeed0ab4ce21d9f0100c5494239cb853aa52")
    override fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit): Unit =
        loggingConfig(LoggingConfigProperty(loggingConfig))

    /**
     * A URL to the Amazon S3 bucket for the Hook project package that contains the necessary files
     * for the Hook you want to register.
     *
     * For information on generating a schema handler package, see [Modeling custom CloudFormation
     * Hooks](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-model.html)
     * in the *AWS CloudFormation Hooks User Guide* .
     *
     *
     * To register the Hook, you must have `s3:GetObject` permissions to access the S3 objects.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-schemahandlerpackage)
     * @param schemaHandlerPackage A URL to the Amazon S3 bucket for the Hook project package that
     * contains the necessary files for the Hook you want to register. 
     */
    override fun schemaHandlerPackage(schemaHandlerPackage: String) {
      cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
    }

    /**
     * The unique name for your hook.
     *
     * Specifies a three-part namespace for your hook, with a recommended pattern of
     * `Organization::Service::Hook` .
     *
     *
     * The following organization namespaces are reserved and can't be used in your hook type names:
     *
     * * `Alexa`
     * * `AMZN`
     * * `Amazon`
     * * `ASK`
     * * `AWS`
     * * `Custom`
     * * `Dev`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-typename)
     * @param typeName The unique name for your hook. 
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.CfnHookVersion = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.CfnHookVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHookVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHookVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnHookVersion): CfnHookVersion =
        CfnHookVersion(cdkObject)

    internal fun unwrap(wrapped: CfnHookVersion): software.amazon.awscdk.CfnHookVersion =
        wrapped.cdkObject as software.amazon.awscdk.CfnHookVersion
  }

  /**
   * The `LoggingConfig` property type specifies logging configuration information for an extension.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-hookversion-loggingconfig.html)
   */
  public interface LoggingConfigProperty {
    /**
     * The Amazon CloudWatch Logs group to which CloudFormation sends error logging information when
     * invoking the extension's handlers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-hookversion-loggingconfig.html#cfn-cloudformation-hookversion-loggingconfig-loggroupname)
     */
    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    /**
     * The Amazon Resource Name (ARN) of the role that CloudFormation should assume when sending log
     * entries to CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-hookversion-loggingconfig.html#cfn-cloudformation-hookversion-loggingconfig-logrolearn)
     */
    public fun logRoleArn(): String? = unwrap(this).getLogRoleArn()

    /**
     * A builder for [LoggingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupName The Amazon CloudWatch Logs group to which CloudFormation sends error
       * logging information when invoking the extension's handlers.
       */
      public fun logGroupName(logGroupName: String)

      /**
       * @param logRoleArn The Amazon Resource Name (ARN) of the role that CloudFormation should
       * assume when sending log entries to CloudWatch Logs.
       */
      public fun logRoleArn(logRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.CfnHookVersion.LoggingConfigProperty.Builder =
          software.amazon.awscdk.CfnHookVersion.LoggingConfigProperty.builder()

      /**
       * @param logGroupName The Amazon CloudWatch Logs group to which CloudFormation sends error
       * logging information when invoking the extension's handlers.
       */
      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      /**
       * @param logRoleArn The Amazon Resource Name (ARN) of the role that CloudFormation should
       * assume when sending log entries to CloudWatch Logs.
       */
      override fun logRoleArn(logRoleArn: String) {
        cdkBuilder.logRoleArn(logRoleArn)
      }

      public fun build(): software.amazon.awscdk.CfnHookVersion.LoggingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnHookVersion.LoggingConfigProperty,
    ) : CdkObject(cdkObject),
        LoggingConfigProperty {
      /**
       * The Amazon CloudWatch Logs group to which CloudFormation sends error logging information
       * when invoking the extension's handlers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-hookversion-loggingconfig.html#cfn-cloudformation-hookversion-loggingconfig-loggroupname)
       */
      override fun logGroupName(): String? = unwrap(this).getLogGroupName()

      /**
       * The Amazon Resource Name (ARN) of the role that CloudFormation should assume when sending
       * log entries to CloudWatch Logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-hookversion-loggingconfig.html#cfn-cloudformation-hookversion-loggingconfig-logrolearn)
       */
      override fun logRoleArn(): String? = unwrap(this).getLogRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnHookVersion.LoggingConfigProperty):
          LoggingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? LoggingConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigProperty):
          software.amazon.awscdk.CfnHookVersion.LoggingConfigProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.CfnHookVersion.LoggingConfigProperty
    }
  }
}
