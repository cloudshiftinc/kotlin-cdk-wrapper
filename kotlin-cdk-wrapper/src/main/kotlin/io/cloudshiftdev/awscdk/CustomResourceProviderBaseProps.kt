@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Initialization properties for `CustomResourceProviderBase`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * Object policyStatements;
 * Size size;
 * CustomResourceProviderBaseProps customResourceProviderBaseProps =
 * CustomResourceProviderBaseProps.builder()
 * .codeDirectory("codeDirectory")
 * .runtimeName("runtimeName")
 * // the properties below are optional
 * .description("description")
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .memorySize(size)
 * .policyStatements(List.of(policyStatements))
 * .timeout(Duration.minutes(30))
 * .useCfnResponseWrapper(false)
 * .build();
 * ```
 */
public interface CustomResourceProviderBaseProps : CustomResourceProviderOptions {
  /**
   * A local file system directory with the provider's code.
   *
   * The code will be
   * bundled into a zip asset and wired to the provider's AWS Lambda function.
   */
  public fun codeDirectory(): String

  /**
   * The AWS Lambda runtime and version name to use for the provider.
   */
  public fun runtimeName(): String

  /**
   * A builder for [CustomResourceProviderBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param codeDirectory A local file system directory with the provider's code. 
     * The code will be
     * bundled into a zip asset and wired to the provider's AWS Lambda function.
     */
    public fun codeDirectory(codeDirectory: String)

    /**
     * @param description A description of the function.
     */
    public fun description(description: String)

    /**
     * @param environment Key-value pairs that are passed to Lambda as Environment.
     */
    public fun environment(environment: Map<String, String>)

    /**
     * @param memorySize The amount of memory that your function has access to.
     * Increasing the
     * function's memory also increases its CPU allocation.
     */
    public fun memorySize(memorySize: Size)

    /**
     * @param policyStatements A set of IAM policy statements to include in the inline policy of the
     * provider's lambda function.
     * **Please note**: these are direct IAM JSON policy blobs, *not* `iam.PolicyStatement`
     * objects like you will see in the rest of the CDK.
     */
    public fun policyStatements(policyStatements: List<Any>)

    /**
     * @param policyStatements A set of IAM policy statements to include in the inline policy of the
     * provider's lambda function.
     * **Please note**: these are direct IAM JSON policy blobs, *not* `iam.PolicyStatement`
     * objects like you will see in the rest of the CDK.
     */
    public fun policyStatements(vararg policyStatements: Any)

    /**
     * @param runtimeName The AWS Lambda runtime and version name to use for the provider. 
     */
    public fun runtimeName(runtimeName: String)

    /**
     * @param timeout AWS Lambda timeout for the provider.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param useCfnResponseWrapper Whether or not the cloudformation response wrapper
     * (`nodejs-entrypoint.ts`) is used. If set to `true`, `nodejs-entrypoint.js` is bundled in the
     * same asset as the custom resource and set as the entrypoint. If set to `false`, the custom
     * resource provided is the entrypoint.
     */
    public fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CustomResourceProviderBaseProps.Builder =
        software.amazon.awscdk.CustomResourceProviderBaseProps.builder()

    /**
     * @param codeDirectory A local file system directory with the provider's code. 
     * The code will be
     * bundled into a zip asset and wired to the provider's AWS Lambda function.
     */
    override fun codeDirectory(codeDirectory: String) {
      cdkBuilder.codeDirectory(codeDirectory)
    }

    /**
     * @param description A description of the function.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param environment Key-value pairs that are passed to Lambda as Environment.
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param memorySize The amount of memory that your function has access to.
     * Increasing the
     * function's memory also increases its CPU allocation.
     */
    override fun memorySize(memorySize: Size) {
      cdkBuilder.memorySize(memorySize.let(Size::unwrap))
    }

    /**
     * @param policyStatements A set of IAM policy statements to include in the inline policy of the
     * provider's lambda function.
     * **Please note**: these are direct IAM JSON policy blobs, *not* `iam.PolicyStatement`
     * objects like you will see in the rest of the CDK.
     */
    override fun policyStatements(policyStatements: List<Any>) {
      cdkBuilder.policyStatements(policyStatements)
    }

    /**
     * @param policyStatements A set of IAM policy statements to include in the inline policy of the
     * provider's lambda function.
     * **Please note**: these are direct IAM JSON policy blobs, *not* `iam.PolicyStatement`
     * objects like you will see in the rest of the CDK.
     */
    override fun policyStatements(vararg policyStatements: Any): Unit =
        policyStatements(policyStatements.toList())

    /**
     * @param runtimeName The AWS Lambda runtime and version name to use for the provider. 
     */
    override fun runtimeName(runtimeName: String) {
      cdkBuilder.runtimeName(runtimeName)
    }

    /**
     * @param timeout AWS Lambda timeout for the provider.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * @param useCfnResponseWrapper Whether or not the cloudformation response wrapper
     * (`nodejs-entrypoint.ts`) is used. If set to `true`, `nodejs-entrypoint.js` is bundled in the
     * same asset as the custom resource and set as the entrypoint. If set to `false`, the custom
     * resource provided is the entrypoint.
     */
    override fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean) {
      cdkBuilder.useCfnResponseWrapper(useCfnResponseWrapper)
    }

    public fun build(): software.amazon.awscdk.CustomResourceProviderBaseProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CustomResourceProviderBaseProps,
  ) : CdkObject(cdkObject), CustomResourceProviderBaseProps {
    /**
     * A local file system directory with the provider's code.
     *
     * The code will be
     * bundled into a zip asset and wired to the provider's AWS Lambda function.
     */
    override fun codeDirectory(): String = unwrap(this).getCodeDirectory()

    /**
     * A description of the function.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Key-value pairs that are passed to Lambda as Environment.
     *
     * Default: - No environment variables.
     */
    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    /**
     * The amount of memory that your function has access to.
     *
     * Increasing the
     * function's memory also increases its CPU allocation.
     *
     * Default: Size.mebibytes(128)
     */
    override fun memorySize(): Size? = unwrap(this).getMemorySize()?.let(Size::wrap)

    /**
     * A set of IAM policy statements to include in the inline policy of the provider's lambda
     * function.
     *
     * **Please note**: these are direct IAM JSON policy blobs, *not* `iam.PolicyStatement`
     * objects like you will see in the rest of the CDK.
     *
     * Default: - no additional inline policy
     *
     * Example:
     *
     * ```
     * CustomResourceProvider provider = CustomResourceProvider.getOrCreateProvider(this,
     * "Custom::MyCustomResourceType", CustomResourceProviderProps.builder()
     * .codeDirectory(String.format("%s/my-handler", __dirname))
     * .runtime(CustomResourceProviderRuntime.NODEJS_18_X)
     * .policyStatements(List.of(Map.of(
     * "Effect", "Allow",
     * "Action", "s3:PutObject*",
     * "Resource", "*")))
     * .build());
     * ```
     */
    override fun policyStatements(): List<Any> = unwrap(this).getPolicyStatements() ?: emptyList()

    /**
     * The AWS Lambda runtime and version name to use for the provider.
     */
    override fun runtimeName(): String = unwrap(this).getRuntimeName()

    /**
     * AWS Lambda timeout for the provider.
     *
     * Default: Duration.minutes(15)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * Whether or not the cloudformation response wrapper (`nodejs-entrypoint.ts`) is used. If set
     * to `true`, `nodejs-entrypoint.js` is bundled in the same asset as the custom resource and set as
     * the entrypoint. If set to `false`, the custom resource provided is the entrypoint.
     *
     * Default: - `true` if `inlineCode: false` and `false` otherwise.
     */
    override fun useCfnResponseWrapper(): Boolean? = unwrap(this).getUseCfnResponseWrapper()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomResourceProviderBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResourceProviderBaseProps):
        CustomResourceProviderBaseProps = CdkObjectWrappers.wrap(cdkObject) as
        CustomResourceProviderBaseProps

    internal fun unwrap(wrapped: CustomResourceProviderBaseProps):
        software.amazon.awscdk.CustomResourceProviderBaseProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CustomResourceProviderBaseProps
  }
}
