@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnHookVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnHookVersionProps cfnHookVersionProps = CfnHookVersionProps.builder()
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
public interface CfnHookVersionProps {
  /**
   * The Amazon Resource Name (ARN) of the task execution role that grants the hook permission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-executionrolearn)
   */
  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * Contains logging configuration information for an extension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-loggingconfig)
   */
  public fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  /**
   * A URL to the Amazon S3 bucket containing the hook project package that contains the necessary
   * files for the hook you want to register.
   *
   * For information on generating a schema handler package for the resource you want to register,
   * see
   * [submit](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html)
   * in the *CloudFormation CLI User Guide for Extension Development* .
   *
   *
   * The user registering the resource must be able to access the package in the S3 bucket. That's,
   * the user must have [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html)
   * permissions for the schema handler package. For more information, see [Actions, Resources, and
   * Condition Keys for Amazon S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html)
   * in the *AWS Identity and Access Management User Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-schemahandlerpackage)
   */
  public fun schemaHandlerPackage(): String

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
   */
  public fun typeName(): String

  /**
   * A builder for [CfnHookVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution role that grants
     * the hook permission.
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * @param loggingConfig Contains logging configuration information for an extension.
     */
    public fun loggingConfig(loggingConfig: IResolvable)

    /**
     * @param loggingConfig Contains logging configuration information for an extension.
     */
    public fun loggingConfig(loggingConfig: CfnHookVersion.LoggingConfigProperty)

    /**
     * @param loggingConfig Contains logging configuration information for an extension.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f919faf1015d5a9527bc8c4bc1b7adf53fc3dfa1b8ba24e74cbf8001a5ccb8f")
    public fun loggingConfig(loggingConfig: CfnHookVersion.LoggingConfigProperty.Builder.() -> Unit)

    /**
     * @param schemaHandlerPackage A URL to the Amazon S3 bucket containing the hook project package
     * that contains the necessary files for the hook you want to register. 
     * For information on generating a schema handler package for the resource you want to register,
     * see
     * [submit](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html)
     * in the *CloudFormation CLI User Guide for Extension Development* .
     *
     *
     * The user registering the resource must be able to access the package in the S3 bucket.
     * That's, the user must have
     * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html) permissions for
     * the schema handler package. For more information, see [Actions, Resources, and Condition Keys
     * for Amazon S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html) in the *AWS
     * Identity and Access Management User Guide* .
     */
    public fun schemaHandlerPackage(schemaHandlerPackage: String)

    /**
     * @param typeName The unique name for your hook. 
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
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnHookVersionProps.Builder =
        software.amazon.awscdk.CfnHookVersionProps.builder()

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution role that grants
     * the hook permission.
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param loggingConfig Contains logging configuration information for an extension.
     */
    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
    }

    /**
     * @param loggingConfig Contains logging configuration information for an extension.
     */
    override fun loggingConfig(loggingConfig: CfnHookVersion.LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(CfnHookVersion.LoggingConfigProperty::unwrap))
    }

    /**
     * @param loggingConfig Contains logging configuration information for an extension.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f919faf1015d5a9527bc8c4bc1b7adf53fc3dfa1b8ba24e74cbf8001a5ccb8f")
    override
        fun loggingConfig(loggingConfig: CfnHookVersion.LoggingConfigProperty.Builder.() -> Unit):
        Unit = loggingConfig(CfnHookVersion.LoggingConfigProperty(loggingConfig))

    /**
     * @param schemaHandlerPackage A URL to the Amazon S3 bucket containing the hook project package
     * that contains the necessary files for the hook you want to register. 
     * For information on generating a schema handler package for the resource you want to register,
     * see
     * [submit](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html)
     * in the *CloudFormation CLI User Guide for Extension Development* .
     *
     *
     * The user registering the resource must be able to access the package in the S3 bucket.
     * That's, the user must have
     * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html) permissions for
     * the schema handler package. For more information, see [Actions, Resources, and Condition Keys
     * for Amazon S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html) in the *AWS
     * Identity and Access Management User Guide* .
     */
    override fun schemaHandlerPackage(schemaHandlerPackage: String) {
      cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
    }

    /**
     * @param typeName The unique name for your hook. 
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
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.CfnHookVersionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnHookVersionProps,
  ) : CdkObject(cdkObject), CfnHookVersionProps {
    /**
     * The Amazon Resource Name (ARN) of the task execution role that grants the hook permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-executionrolearn)
     */
    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    /**
     * Contains logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-loggingconfig)
     */
    override fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

    /**
     * A URL to the Amazon S3 bucket containing the hook project package that contains the necessary
     * files for the hook you want to register.
     *
     * For information on generating a schema handler package for the resource you want to register,
     * see
     * [submit](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html)
     * in the *CloudFormation CLI User Guide for Extension Development* .
     *
     *
     * The user registering the resource must be able to access the package in the S3 bucket.
     * That's, the user must have
     * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html) permissions for
     * the schema handler package. For more information, see [Actions, Resources, and Condition Keys
     * for Amazon S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html) in the *AWS
     * Identity and Access Management User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html#cfn-cloudformation-hookversion-schemahandlerpackage)
     */
    override fun schemaHandlerPackage(): String = unwrap(this).getSchemaHandlerPackage()

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
     */
    override fun typeName(): String = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHookVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnHookVersionProps): CfnHookVersionProps =
        CdkObjectWrappers.wrap(cdkObject) as CfnHookVersionProps

    internal fun unwrap(wrapped: CfnHookVersionProps): software.amazon.awscdk.CfnHookVersionProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnHookVersionProps
  }
}
