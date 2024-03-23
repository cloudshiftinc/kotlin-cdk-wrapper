@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CfnVersionProps cfnVersionProps = CfnVersionProps.builder()
 * .functionName("functionName")
 * // the properties below are optional
 * .codeSha256("codeSha256")
 * .description("description")
 * .provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty.builder()
 * .provisionedConcurrentExecutions(123)
 * .build())
 * .runtimePolicy(RuntimePolicyProperty.builder()
 * .updateRuntimeOn("updateRuntimeOn")
 * // the properties below are optional
 * .runtimeVersionArn("runtimeVersionArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html)
 */
public interface CfnVersionProps {
  /**
   * Only publish a version if the hash value matches the value that's specified.
   *
   * Use this option to avoid publishing a version if the function code has changed since you last
   * updated it. Updates are not supported for this property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-codesha256)
   */
  public fun codeSha256(): String? = unwrap(this).getCodeSha256()

  /**
   * A description for the version to override the description in the function configuration.
   *
   * Updates are not supported for this property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name or ARN of the Lambda function.
   *
   * **Name formats** - *Function name* - `MyFunction` .
   *
   * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
   * * *Partial ARN* - `123456789012:function:MyFunction` .
   *
   * The length constraint applies only to the full ARN. If you specify only the function name, it
   * is limited to 64 characters in length.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-functionname)
   */
  public fun functionName(): String

  /**
   * Specifies a provisioned concurrency configuration for a function's version.
   *
   * Updates are not supported for this property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-provisionedconcurrencyconfig)
   */
  public fun provisionedConcurrencyConfig(): Any? = unwrap(this).getProvisionedConcurrencyConfig()

  /**
   * Runtime Management Config of a function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-runtimepolicy)
   */
  public fun runtimePolicy(): Any? = unwrap(this).getRuntimePolicy()

  /**
   * A builder for [CfnVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param codeSha256 Only publish a version if the hash value matches the value that's
     * specified.
     * Use this option to avoid publishing a version if the function code has changed since you last
     * updated it. Updates are not supported for this property.
     */
    public fun codeSha256(codeSha256: String)

    /**
     * @param description A description for the version to override the description in the function
     * configuration.
     * Updates are not supported for this property.
     */
    public fun description(description: String)

    /**
     * @param functionName The name or ARN of the Lambda function. 
     * **Name formats** - *Function name* - `MyFunction` .
     *
     * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
     * * *Partial ARN* - `123456789012:function:MyFunction` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name, it
     * is limited to 64 characters in length.
     */
    public fun functionName(functionName: String)

    /**
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     * function's version.
     * Updates are not supported for this property.
     */
    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable)

    /**
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     * function's version.
     * Updates are not supported for this property.
     */
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnVersion.ProvisionedConcurrencyConfigurationProperty)

    /**
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     * function's version.
     * Updates are not supported for this property.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1e8e1eecb08692ac05d0620885866a00c9d01a1068b92ba5647c926aaa78fbd")
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnVersion.ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit)

    /**
     * @param runtimePolicy Runtime Management Config of a function.
     */
    public fun runtimePolicy(runtimePolicy: IResolvable)

    /**
     * @param runtimePolicy Runtime Management Config of a function.
     */
    public fun runtimePolicy(runtimePolicy: CfnVersion.RuntimePolicyProperty)

    /**
     * @param runtimePolicy Runtime Management Config of a function.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f9b1cb19ca34f521f1fc27fc21c0b8f93cd0425a8cca90b0bd665f1391af59f")
    public fun runtimePolicy(runtimePolicy: CfnVersion.RuntimePolicyProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnVersionProps.Builder =
        software.amazon.awscdk.services.lambda.CfnVersionProps.builder()

    /**
     * @param codeSha256 Only publish a version if the hash value matches the value that's
     * specified.
     * Use this option to avoid publishing a version if the function code has changed since you last
     * updated it. Updates are not supported for this property.
     */
    override fun codeSha256(codeSha256: String) {
      cdkBuilder.codeSha256(codeSha256)
    }

    /**
     * @param description A description for the version to override the description in the function
     * configuration.
     * Updates are not supported for this property.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param functionName The name or ARN of the Lambda function. 
     * **Name formats** - *Function name* - `MyFunction` .
     *
     * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
     * * *Partial ARN* - `123456789012:function:MyFunction` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name, it
     * is limited to 64 characters in length.
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     * function's version.
     * Updates are not supported for this property.
     */
    override fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(IResolvable::unwrap))
    }

    /**
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     * function's version.
     * Updates are not supported for this property.
     */
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnVersion.ProvisionedConcurrencyConfigurationProperty) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(CfnVersion.ProvisionedConcurrencyConfigurationProperty::unwrap))
    }

    /**
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     * function's version.
     * Updates are not supported for this property.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1e8e1eecb08692ac05d0620885866a00c9d01a1068b92ba5647c926aaa78fbd")
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnVersion.ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit):
        Unit =
        provisionedConcurrencyConfig(CfnVersion.ProvisionedConcurrencyConfigurationProperty(provisionedConcurrencyConfig))

    /**
     * @param runtimePolicy Runtime Management Config of a function.
     */
    override fun runtimePolicy(runtimePolicy: IResolvable) {
      cdkBuilder.runtimePolicy(runtimePolicy.let(IResolvable::unwrap))
    }

    /**
     * @param runtimePolicy Runtime Management Config of a function.
     */
    override fun runtimePolicy(runtimePolicy: CfnVersion.RuntimePolicyProperty) {
      cdkBuilder.runtimePolicy(runtimePolicy.let(CfnVersion.RuntimePolicyProperty::unwrap))
    }

    /**
     * @param runtimePolicy Runtime Management Config of a function.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f9b1cb19ca34f521f1fc27fc21c0b8f93cd0425a8cca90b0bd665f1391af59f")
    override fun runtimePolicy(runtimePolicy: CfnVersion.RuntimePolicyProperty.Builder.() -> Unit):
        Unit = runtimePolicy(CfnVersion.RuntimePolicyProperty(runtimePolicy))

    public fun build(): software.amazon.awscdk.services.lambda.CfnVersionProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.CfnVersionProps,
  ) : CdkObject(cdkObject), CfnVersionProps {
    /**
     * Only publish a version if the hash value matches the value that's specified.
     *
     * Use this option to avoid publishing a version if the function code has changed since you last
     * updated it. Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-codesha256)
     */
    override fun codeSha256(): String? = unwrap(this).getCodeSha256()

    /**
     * A description for the version to override the description in the function configuration.
     *
     * Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name or ARN of the Lambda function.
     *
     * **Name formats** - *Function name* - `MyFunction` .
     *
     * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
     * * *Partial ARN* - `123456789012:function:MyFunction` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name, it
     * is limited to 64 characters in length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-functionname)
     */
    override fun functionName(): String = unwrap(this).getFunctionName()

    /**
     * Specifies a provisioned concurrency configuration for a function's version.
     *
     * Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-provisionedconcurrencyconfig)
     */
    override fun provisionedConcurrencyConfig(): Any? =
        unwrap(this).getProvisionedConcurrencyConfig()

    /**
     * Runtime Management Config of a function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-runtimepolicy)
     */
    override fun runtimePolicy(): Any? = unwrap(this).getRuntimePolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnVersionProps):
        CfnVersionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVersionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVersionProps):
        software.amazon.awscdk.services.lambda.CfnVersionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.CfnVersionProps
  }
}
