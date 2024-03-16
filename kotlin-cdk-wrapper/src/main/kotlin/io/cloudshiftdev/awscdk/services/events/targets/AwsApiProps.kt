@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for an AwsApi target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Object parameters;
 * PolicyStatement policyStatement;
 * AwsApiProps awsApiProps = AwsApiProps.builder()
 * .action("action")
 * .service("service")
 * // the properties below are optional
 * .apiVersion("apiVersion")
 * .catchErrorPattern("catchErrorPattern")
 * .parameters(parameters)
 * .policyStatement(policyStatement)
 * .build();
 * ```
 */
public interface AwsApiProps : AwsApiInput {
  /**
   * The IAM policy statement to allow the API call.
   *
   * Use only if
   * resource restriction is needed.
   *
   * Default: - extract the permission from the API call
   */
  public fun policyStatement(): PolicyStatement? =
      unwrap(this).getPolicyStatement()?.let(PolicyStatement::wrap)

  /**
   * A builder for [AwsApiProps]
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
     * @param policyStatement The IAM policy statement to allow the API call.
     * Use only if
     * resource restriction is needed.
     */
    public fun policyStatement(policyStatement: PolicyStatement)

    /**
     * @param policyStatement The IAM policy statement to allow the API call.
     * Use only if
     * resource restriction is needed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41800499d68410d75462e294a5ead6c940017de3b283b864f1f2c8624523131f")
    public fun policyStatement(policyStatement: PolicyStatement.Builder.() -> Unit)

    /**
     * @param service The service to call. 
     */
    public fun service(service: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.AwsApiProps.Builder =
        software.amazon.awscdk.services.events.targets.AwsApiProps.builder()

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
     * @param policyStatement The IAM policy statement to allow the API call.
     * Use only if
     * resource restriction is needed.
     */
    override fun policyStatement(policyStatement: PolicyStatement) {
      cdkBuilder.policyStatement(policyStatement.let(PolicyStatement::unwrap))
    }

    /**
     * @param policyStatement The IAM policy statement to allow the API call.
     * Use only if
     * resource restriction is needed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41800499d68410d75462e294a5ead6c940017de3b283b864f1f2c8624523131f")
    override fun policyStatement(policyStatement: PolicyStatement.Builder.() -> Unit): Unit =
        policyStatement(PolicyStatement(policyStatement))

    /**
     * @param service The service to call. 
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.AwsApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.AwsApiProps,
  ) : CdkObject(cdkObject), AwsApiProps {
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
     * The IAM policy statement to allow the API call.
     *
     * Use only if
     * resource restriction is needed.
     *
     * Default: - extract the permission from the API call
     */
    override fun policyStatement(): PolicyStatement? =
        unwrap(this).getPolicyStatement()?.let(PolicyStatement::wrap)

    /**
     * The service to call.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     */
    override fun service(): String = unwrap(this).getService()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.AwsApiProps):
        AwsApiProps = CdkObjectWrappers.wrap(cdkObject) as AwsApiProps

    internal fun unwrap(wrapped: AwsApiProps):
        software.amazon.awscdk.services.events.targets.AwsApiProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.AwsApiProps
  }
}
