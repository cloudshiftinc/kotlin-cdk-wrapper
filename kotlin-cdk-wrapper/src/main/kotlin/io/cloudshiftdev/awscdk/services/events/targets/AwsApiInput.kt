@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

/**
 * Rule target input for an AwsApi target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * Object parameters;
 * AwsApiInput awsApiInput = AwsApiInput.builder()
 * .action("action")
 * .service("service")
 * // the properties below are optional
 * .apiVersion("apiVersion")
 * .catchErrorPattern("catchErrorPattern")
 * .parameters(parameters)
 * .build();
 * ```
 */
public interface AwsApiInput {
  /**
   * The service action to call.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
   */
  public fun action(): String

  /**
   * (deprecated) API version to use for the service.
   *
   * @deprecated the handler code was migrated to AWS SDK for JavaScript v3, which does not support
   * this feature anymore
   */
  @Deprecated(message = "deprecated in CDK")
  public fun apiVersion(): String? = unwrap(this).getApiVersion()

  /**
   * The regex pattern to use to catch API errors.
   *
   * The `code` property of the
   * `Error` object will be tested against this pattern. If there is a match an
   * error will not be thrown.
   *
   * Default: - do not catch errors
   */
  public fun catchErrorPattern(): String? = unwrap(this).getCatchErrorPattern()

  /**
   * The parameters for the service action.
   *
   * Default: - no parameters
   *
   * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * The service to call.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
   */
  public fun service(): String

  /**
   * A builder for [AwsApiInput]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action The service action to call. 
     */
    public fun action(action: String)

    /**
     * @param apiVersion API version to use for the service.
     * @deprecated the handler code was migrated to AWS SDK for JavaScript v3, which does not
     * support this feature anymore
     */
    @Deprecated(message = "deprecated in CDK")
    public fun apiVersion(apiVersion: String)

    /**
     * @param catchErrorPattern The regex pattern to use to catch API errors.
     * The `code` property of the
     * `Error` object will be tested against this pattern. If there is a match an
     * error will not be thrown.
     */
    public fun catchErrorPattern(catchErrorPattern: String)

    /**
     * @param parameters The parameters for the service action.
     */
    public fun parameters(parameters: Any)

    /**
     * @param service The service to call. 
     */
    public fun service(service: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.AwsApiInput.Builder =
        software.amazon.awscdk.services.events.targets.AwsApiInput.builder()

    /**
     * @param action The service action to call. 
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * @param apiVersion API version to use for the service.
     * @deprecated the handler code was migrated to AWS SDK for JavaScript v3, which does not
     * support this feature anymore
     */
    @Deprecated(message = "deprecated in CDK")
    override fun apiVersion(apiVersion: String) {
      cdkBuilder.apiVersion(apiVersion)
    }

    /**
     * @param catchErrorPattern The regex pattern to use to catch API errors.
     * The `code` property of the
     * `Error` object will be tested against this pattern. If there is a match an
     * error will not be thrown.
     */
    override fun catchErrorPattern(catchErrorPattern: String) {
      cdkBuilder.catchErrorPattern(catchErrorPattern)
    }

    /**
     * @param parameters The parameters for the service action.
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param service The service to call. 
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.AwsApiInput =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.AwsApiInput,
  ) : CdkObject(cdkObject), AwsApiInput {
    /**
     * The service action to call.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     */
    override fun action(): String = unwrap(this).getAction()

    /**
     * (deprecated) API version to use for the service.
     *
     * @deprecated the handler code was migrated to AWS SDK for JavaScript v3, which does not
     * support this feature anymore
     */
    @Deprecated(message = "deprecated in CDK")
    override fun apiVersion(): String? = unwrap(this).getApiVersion()

    /**
     * The regex pattern to use to catch API errors.
     *
     * The `code` property of the
     * `Error` object will be tested against this pattern. If there is a match an
     * error will not be thrown.
     *
     * Default: - do not catch errors
     */
    override fun catchErrorPattern(): String? = unwrap(this).getCatchErrorPattern()

    /**
     * The parameters for the service action.
     *
     * Default: - no parameters
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The service to call.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     */
    override fun service(): String = unwrap(this).getService()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsApiInput {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.AwsApiInput):
        AwsApiInput = CdkObjectWrappers.wrap(cdkObject) as? AwsApiInput ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsApiInput):
        software.amazon.awscdk.services.events.targets.AwsApiInput = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.AwsApiInput
  }
}
