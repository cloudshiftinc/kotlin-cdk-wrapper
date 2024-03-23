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
 * Properties for defining a `CfnResourceVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnResourceVersionProps cfnResourceVersionProps = CfnResourceVersionProps.builder()
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
public interface CfnResourceVersionProps {
  /**
   * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the
   * resource.
   *
   * If your resource calls AWS APIs in any of its handlers, you must create an *[IAM execution
   * role](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html)* that includes the necessary
   * permissions to call those AWS APIs, and provision that execution role in your account. When
   * CloudFormation needs to invoke the resource type handler, CloudFormation assumes this execution
   * role to create a temporary session token, which it then passes to the resource type handler,
   * thereby supplying your resource type with the appropriate credentials.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-executionrolearn)
   */
  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * Logging configuration information for a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
   */
  public fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  /**
   * A URL to the S3 bucket containing the resource project package that contains the necessary
   * files for the resource you want to register.
   *
   * For information on generating a schema handler package for the resource you want to register,
   * see
   * [submit](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html)
   * in the *CloudFormation CLI User Guide* .
   *
   *
   * The user registering the resource must be able to access the package in the S3 bucket. That is,
   * the user needs to have
   * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html) permissions for
   * the schema handler package. For more information, see [Actions, Resources, and Condition Keys for
   * Amazon S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html) in the *AWS
   * Identity and Access Management User Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-schemahandlerpackage)
   */
  public fun schemaHandlerPackage(): String

  /**
   * The name of the resource being registered.
   *
   * We recommend that resource names adhere to the following pattern: *company_or_organization* ::
   * *service* :: *type* .
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
   */
  public fun typeName(): String

  /**
   * A builder for [CfnResourceVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role for CloudFormation to
     * assume when invoking the resource.
     * If your resource calls AWS APIs in any of its handlers, you must create an *[IAM execution
     * role](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html)* that includes the
     * necessary permissions to call those AWS APIs, and provision that execution role in your account.
     * When CloudFormation needs to invoke the resource type handler, CloudFormation assumes this
     * execution role to create a temporary session token, which it then passes to the resource type
     * handler, thereby supplying your resource type with the appropriate credentials.
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * @param loggingConfig Logging configuration information for a resource.
     */
    public fun loggingConfig(loggingConfig: IResolvable)

    /**
     * @param loggingConfig Logging configuration information for a resource.
     */
    public fun loggingConfig(loggingConfig: CfnResourceVersion.LoggingConfigProperty)

    /**
     * @param loggingConfig Logging configuration information for a resource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e1f17534e4b9c5840c51758e9138ae78f334c5d5ea626007b75859e25d7420a")
    public
        fun loggingConfig(loggingConfig: CfnResourceVersion.LoggingConfigProperty.Builder.() -> Unit)

    /**
     * @param schemaHandlerPackage A URL to the S3 bucket containing the resource project package
     * that contains the necessary files for the resource you want to register. 
     * For information on generating a schema handler package for the resource you want to register,
     * see
     * [submit](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html)
     * in the *CloudFormation CLI User Guide* .
     *
     *
     * The user registering the resource must be able to access the package in the S3 bucket. That
     * is, the user needs to have
     * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html) permissions for
     * the schema handler package. For more information, see [Actions, Resources, and Condition Keys
     * for Amazon S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html) in the *AWS
     * Identity and Access Management User Guide* .
     */
    public fun schemaHandlerPackage(schemaHandlerPackage: String)

    /**
     * @param typeName The name of the resource being registered. 
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
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnResourceVersionProps.Builder =
        software.amazon.awscdk.CfnResourceVersionProps.builder()

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role for CloudFormation to
     * assume when invoking the resource.
     * If your resource calls AWS APIs in any of its handlers, you must create an *[IAM execution
     * role](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html)* that includes the
     * necessary permissions to call those AWS APIs, and provision that execution role in your account.
     * When CloudFormation needs to invoke the resource type handler, CloudFormation assumes this
     * execution role to create a temporary session token, which it then passes to the resource type
     * handler, thereby supplying your resource type with the appropriate credentials.
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param loggingConfig Logging configuration information for a resource.
     */
    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
    }

    /**
     * @param loggingConfig Logging configuration information for a resource.
     */
    override fun loggingConfig(loggingConfig: CfnResourceVersion.LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(CfnResourceVersion.LoggingConfigProperty::unwrap))
    }

    /**
     * @param loggingConfig Logging configuration information for a resource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e1f17534e4b9c5840c51758e9138ae78f334c5d5ea626007b75859e25d7420a")
    override
        fun loggingConfig(loggingConfig: CfnResourceVersion.LoggingConfigProperty.Builder.() -> Unit):
        Unit = loggingConfig(CfnResourceVersion.LoggingConfigProperty(loggingConfig))

    /**
     * @param schemaHandlerPackage A URL to the S3 bucket containing the resource project package
     * that contains the necessary files for the resource you want to register. 
     * For information on generating a schema handler package for the resource you want to register,
     * see
     * [submit](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html)
     * in the *CloudFormation CLI User Guide* .
     *
     *
     * The user registering the resource must be able to access the package in the S3 bucket. That
     * is, the user needs to have
     * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html) permissions for
     * the schema handler package. For more information, see [Actions, Resources, and Condition Keys
     * for Amazon S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html) in the *AWS
     * Identity and Access Management User Guide* .
     */
    override fun schemaHandlerPackage(schemaHandlerPackage: String) {
      cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
    }

    /**
     * @param typeName The name of the resource being registered. 
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
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.CfnResourceVersionProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnResourceVersionProps,
  ) : CdkObject(cdkObject), CfnResourceVersionProps {
    /**
     * The Amazon Resource Name (ARN) of the IAM role for CloudFormation to assume when invoking the
     * resource.
     *
     * If your resource calls AWS APIs in any of its handlers, you must create an *[IAM execution
     * role](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html)* that includes the
     * necessary permissions to call those AWS APIs, and provision that execution role in your account.
     * When CloudFormation needs to invoke the resource type handler, CloudFormation assumes this
     * execution role to create a temporary session token, which it then passes to the resource type
     * handler, thereby supplying your resource type with the appropriate credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-executionrolearn)
     */
    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    /**
     * Logging configuration information for a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-loggingconfig)
     */
    override fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

    /**
     * A URL to the S3 bucket containing the resource project package that contains the necessary
     * files for the resource you want to register.
     *
     * For information on generating a schema handler package for the resource you want to register,
     * see
     * [submit](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html)
     * in the *CloudFormation CLI User Guide* .
     *
     *
     * The user registering the resource must be able to access the package in the S3 bucket. That
     * is, the user needs to have
     * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html) permissions for
     * the schema handler package. For more information, see [Actions, Resources, and Condition Keys
     * for Amazon S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html) in the *AWS
     * Identity and Access Management User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html#cfn-cloudformation-resourceversion-schemahandlerpackage)
     */
    override fun schemaHandlerPackage(): String = unwrap(this).getSchemaHandlerPackage()

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
     */
    override fun typeName(): String = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnResourceVersionProps):
        CfnResourceVersionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnResourceVersionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceVersionProps):
        software.amazon.awscdk.CfnResourceVersionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnResourceVersionProps
  }
}
