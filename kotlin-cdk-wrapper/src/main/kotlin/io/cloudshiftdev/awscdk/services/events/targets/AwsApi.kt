@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Use an AWS Lambda function that makes API calls as an event rule target.
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
 * AwsApi awsApi = AwsApi.Builder.create()
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
public open class AwsApi(
  cdkObject: software.amazon.awscdk.services.events.targets.AwsApi,
) : CdkObject(cdkObject), IRuleTarget {
  public constructor(props: AwsApiProps) :
      this(software.amazon.awscdk.services.events.targets.AwsApi(props.let(AwsApiProps.Companion::unwrap))
  )

  public constructor(props: AwsApiProps.Builder.() -> Unit) : this(AwsApiProps(props)
  )

  /**
   * Returns a RuleTarget that can be used to trigger this AwsApi as a result from an EventBridge
   * event.
   *
   * @param rule 
   * @param id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to trigger this AwsApi as a result from an EventBridge
   * event.
   *
   * @param rule 
   * @param id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.AwsApi].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The service action to call.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     * @param action The service action to call. 
     */
    public fun action(action: String)

    /**
     * (deprecated) API version to use for the service.
     *
     * @deprecated the handler code was migrated to AWS SDK for JavaScript v3, which does not
     * support this feature anymore
     * @param apiVersion API version to use for the service. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun apiVersion(apiVersion: String)

    /**
     * The regex pattern to use to catch API errors.
     *
     * The `code` property of the
     * `Error` object will be tested against this pattern. If there is a match an
     * error will not be thrown.
     *
     * Default: - do not catch errors
     *
     * @param catchErrorPattern The regex pattern to use to catch API errors. 
     */
    public fun catchErrorPattern(catchErrorPattern: String)

    /**
     * The parameters for the service action.
     *
     * Default: - no parameters
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     * @param parameters The parameters for the service action. 
     */
    public fun parameters(parameters: Any)

    /**
     * The IAM policy statement to allow the API call.
     *
     * Use only if
     * resource restriction is needed.
     *
     * Default: - extract the permission from the API call
     *
     * @param policyStatement The IAM policy statement to allow the API call. 
     */
    public fun policyStatement(policyStatement: PolicyStatement)

    /**
     * The IAM policy statement to allow the API call.
     *
     * Use only if
     * resource restriction is needed.
     *
     * Default: - extract the permission from the API call
     *
     * @param policyStatement The IAM policy statement to allow the API call. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("733bc452c30317d418eb575f2d2c1be3c964cc1b9e882877e3ebcaa3ee762508")
    public fun policyStatement(policyStatement: PolicyStatement.Builder.() -> Unit)

    /**
     * The service to call.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     * @param service The service to call. 
     */
    public fun service(service: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.AwsApi.Builder =
        software.amazon.awscdk.services.events.targets.AwsApi.Builder.create()

    /**
     * The service action to call.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     * @param action The service action to call. 
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * (deprecated) API version to use for the service.
     *
     * @deprecated the handler code was migrated to AWS SDK for JavaScript v3, which does not
     * support this feature anymore
     * @param apiVersion API version to use for the service. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun apiVersion(apiVersion: String) {
      cdkBuilder.apiVersion(apiVersion)
    }

    /**
     * The regex pattern to use to catch API errors.
     *
     * The `code` property of the
     * `Error` object will be tested against this pattern. If there is a match an
     * error will not be thrown.
     *
     * Default: - do not catch errors
     *
     * @param catchErrorPattern The regex pattern to use to catch API errors. 
     */
    override fun catchErrorPattern(catchErrorPattern: String) {
      cdkBuilder.catchErrorPattern(catchErrorPattern)
    }

    /**
     * The parameters for the service action.
     *
     * Default: - no parameters
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     * @param parameters The parameters for the service action. 
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * The IAM policy statement to allow the API call.
     *
     * Use only if
     * resource restriction is needed.
     *
     * Default: - extract the permission from the API call
     *
     * @param policyStatement The IAM policy statement to allow the API call. 
     */
    override fun policyStatement(policyStatement: PolicyStatement) {
      cdkBuilder.policyStatement(policyStatement.let(PolicyStatement.Companion::unwrap))
    }

    /**
     * The IAM policy statement to allow the API call.
     *
     * Use only if
     * resource restriction is needed.
     *
     * Default: - extract the permission from the API call
     *
     * @param policyStatement The IAM policy statement to allow the API call. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("733bc452c30317d418eb575f2d2c1be3c964cc1b9e882877e3ebcaa3ee762508")
    override fun policyStatement(policyStatement: PolicyStatement.Builder.() -> Unit): Unit =
        policyStatement(PolicyStatement(policyStatement))

    /**
     * The service to call.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     * @param service The service to call. 
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.AwsApi = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsApi {
      val builderImpl = BuilderImpl()
      return AwsApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.AwsApi): AwsApi =
        AwsApi(cdkObject)

    internal fun unwrap(wrapped: AwsApi): software.amazon.awscdk.services.events.targets.AwsApi =
        wrapped.cdkObject as software.amazon.awscdk.services.events.targets.AwsApi
  }
}
