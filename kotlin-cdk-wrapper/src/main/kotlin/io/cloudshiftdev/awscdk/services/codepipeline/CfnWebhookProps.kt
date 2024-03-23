@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWebhook`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * CfnWebhookProps cfnWebhookProps = CfnWebhookProps.builder()
 * .authentication("authentication")
 * .authenticationConfiguration(WebhookAuthConfigurationProperty.builder()
 * .allowedIpRange("allowedIpRange")
 * .secretToken("secretToken")
 * .build())
 * .filters(List.of(WebhookFilterRuleProperty.builder()
 * .jsonPath("jsonPath")
 * // the properties below are optional
 * .matchEquals("matchEquals")
 * .build()))
 * .targetAction("targetAction")
 * .targetPipeline("targetPipeline")
 * .targetPipelineVersion(123)
 * // the properties below are optional
 * .name("name")
 * .registerWithThirdParty(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html)
 */
public interface CfnWebhookProps {
  /**
   * Supported options are GITHUB_HMAC, IP, and UNAUTHENTICATED.
   *
   * * For information about the authentication scheme implemented by GITHUB_HMAC, see [Securing
   * your webhooks](https://docs.aws.amazon.com/https://developer.github.com/webhooks/securing/) on the
   * GitHub Developer website.
   * * IP rejects webhooks trigger requests unless they originate from an IP address in the IP range
   * whitelisted in the authentication configuration.
   * * UNAUTHENTICATED accepts all webhook trigger requests regardless of origin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authentication)
   */
  public fun authentication(): String

  /**
   * Properties that configure the authentication applied to incoming webhook trigger requests.
   *
   * The required properties depend on the authentication type. For GITHUB_HMAC, only the
   * `SecretToken` property must be set. For IP, only the `AllowedIPRange` property must be set to a
   * valid CIDR range. For UNAUTHENTICATED, no properties can be set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authenticationconfiguration)
   */
  public fun authenticationConfiguration(): Any

  /**
   * A list of rules applied to the body/payload sent in the POST request to a webhook URL.
   *
   * All defined rules must pass for the request to be accepted and the pipeline started.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters)
   */
  public fun filters(): Any

  /**
   * The name of the webhook.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Configures a connection between the webhook that was created and the external tool with events
   * to be detected.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty)
   */
  public fun registerWithThirdParty(): Any? = unwrap(this).getRegisterWithThirdParty()

  /**
   * The name of the action in a pipeline you want to connect to the webhook.
   *
   * The action must be from the source (first) stage of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction)
   */
  public fun targetAction(): String

  /**
   * The name of the pipeline you want to connect to the webhook.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline)
   */
  public fun targetPipeline(): String

  /**
   * The version number of the pipeline to be connected to the trigger request.
   *
   * Required: Yes
   *
   * Type: Integer
   *
   * Update requires: [No
   * interruption](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipelineversion)
   */
  public fun targetPipelineVersion(): Number

  /**
   * A builder for [CfnWebhookProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authentication Supported options are GITHUB_HMAC, IP, and UNAUTHENTICATED. 
     * * For information about the authentication scheme implemented by GITHUB_HMAC, see [Securing
     * your webhooks](https://docs.aws.amazon.com/https://developer.github.com/webhooks/securing/) on
     * the GitHub Developer website.
     * * IP rejects webhooks trigger requests unless they originate from an IP address in the IP
     * range whitelisted in the authentication configuration.
     * * UNAUTHENTICATED accepts all webhook trigger requests regardless of origin.
     */
    public fun authentication(authentication: String)

    /**
     * @param authenticationConfiguration Properties that configure the authentication applied to
     * incoming webhook trigger requests. 
     * The required properties depend on the authentication type. For GITHUB_HMAC, only the
     * `SecretToken` property must be set. For IP, only the `AllowedIPRange` property must be set to a
     * valid CIDR range. For UNAUTHENTICATED, no properties can be set.
     */
    public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

    /**
     * @param authenticationConfiguration Properties that configure the authentication applied to
     * incoming webhook trigger requests. 
     * The required properties depend on the authentication type. For GITHUB_HMAC, only the
     * `SecretToken` property must be set. For IP, only the `AllowedIPRange` property must be set to a
     * valid CIDR range. For UNAUTHENTICATED, no properties can be set.
     */
    public
        fun authenticationConfiguration(authenticationConfiguration: CfnWebhook.WebhookAuthConfigurationProperty)

    /**
     * @param authenticationConfiguration Properties that configure the authentication applied to
     * incoming webhook trigger requests. 
     * The required properties depend on the authentication type. For GITHUB_HMAC, only the
     * `SecretToken` property must be set. For IP, only the `AllowedIPRange` property must be set to a
     * valid CIDR range. For UNAUTHENTICATED, no properties can be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72cc769a72a7c03ae5fb86b5d6df924f56c7dc693080b010e3e61daf78ef0e60")
    public
        fun authenticationConfiguration(authenticationConfiguration: CfnWebhook.WebhookAuthConfigurationProperty.Builder.() -> Unit)

    /**
     * @param filters A list of rules applied to the body/payload sent in the POST request to a
     * webhook URL. 
     * All defined rules must pass for the request to be accepted and the pipeline started.
     */
    public fun filters(filters: IResolvable)

    /**
     * @param filters A list of rules applied to the body/payload sent in the POST request to a
     * webhook URL. 
     * All defined rules must pass for the request to be accepted and the pipeline started.
     */
    public fun filters(filters: List<Any>)

    /**
     * @param filters A list of rules applied to the body/payload sent in the POST request to a
     * webhook URL. 
     * All defined rules must pass for the request to be accepted and the pipeline started.
     */
    public fun filters(vararg filters: Any)

    /**
     * @param name The name of the webhook.
     */
    public fun name(name: String)

    /**
     * @param registerWithThirdParty Configures a connection between the webhook that was created
     * and the external tool with events to be detected.
     */
    public fun registerWithThirdParty(registerWithThirdParty: Boolean)

    /**
     * @param registerWithThirdParty Configures a connection between the webhook that was created
     * and the external tool with events to be detected.
     */
    public fun registerWithThirdParty(registerWithThirdParty: IResolvable)

    /**
     * @param targetAction The name of the action in a pipeline you want to connect to the webhook. 
     * The action must be from the source (first) stage of the pipeline.
     */
    public fun targetAction(targetAction: String)

    /**
     * @param targetPipeline The name of the pipeline you want to connect to the webhook. 
     */
    public fun targetPipeline(targetPipeline: String)

    /**
     * @param targetPipelineVersion The version number of the pipeline to be connected to the
     * trigger request. 
     * Required: Yes
     *
     * Type: Integer
     *
     * Update requires: [No
     * interruption](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
     */
    public fun targetPipelineVersion(targetPipelineVersion: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder =
        software.amazon.awscdk.services.codepipeline.CfnWebhookProps.builder()

    /**
     * @param authentication Supported options are GITHUB_HMAC, IP, and UNAUTHENTICATED. 
     * * For information about the authentication scheme implemented by GITHUB_HMAC, see [Securing
     * your webhooks](https://docs.aws.amazon.com/https://developer.github.com/webhooks/securing/) on
     * the GitHub Developer website.
     * * IP rejects webhooks trigger requests unless they originate from an IP address in the IP
     * range whitelisted in the authentication configuration.
     * * UNAUTHENTICATED accepts all webhook trigger requests regardless of origin.
     */
    override fun authentication(authentication: String) {
      cdkBuilder.authentication(authentication)
    }

    /**
     * @param authenticationConfiguration Properties that configure the authentication applied to
     * incoming webhook trigger requests. 
     * The required properties depend on the authentication type. For GITHUB_HMAC, only the
     * `SecretToken` property must be set. For IP, only the `AllowedIPRange` property must be set to a
     * valid CIDR range. For UNAUTHENTICATED, no properties can be set.
     */
    override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param authenticationConfiguration Properties that configure the authentication applied to
     * incoming webhook trigger requests. 
     * The required properties depend on the authentication type. For GITHUB_HMAC, only the
     * `SecretToken` property must be set. For IP, only the `AllowedIPRange` property must be set to a
     * valid CIDR range. For UNAUTHENTICATED, no properties can be set.
     */
    override
        fun authenticationConfiguration(authenticationConfiguration: CfnWebhook.WebhookAuthConfigurationProperty) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(CfnWebhook.WebhookAuthConfigurationProperty::unwrap))
    }

    /**
     * @param authenticationConfiguration Properties that configure the authentication applied to
     * incoming webhook trigger requests. 
     * The required properties depend on the authentication type. For GITHUB_HMAC, only the
     * `SecretToken` property must be set. For IP, only the `AllowedIPRange` property must be set to a
     * valid CIDR range. For UNAUTHENTICATED, no properties can be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72cc769a72a7c03ae5fb86b5d6df924f56c7dc693080b010e3e61daf78ef0e60")
    override
        fun authenticationConfiguration(authenticationConfiguration: CfnWebhook.WebhookAuthConfigurationProperty.Builder.() -> Unit):
        Unit =
        authenticationConfiguration(CfnWebhook.WebhookAuthConfigurationProperty(authenticationConfiguration))

    /**
     * @param filters A list of rules applied to the body/payload sent in the POST request to a
     * webhook URL. 
     * All defined rules must pass for the request to be accepted and the pipeline started.
     */
    override fun filters(filters: IResolvable) {
      cdkBuilder.filters(filters.let(IResolvable::unwrap))
    }

    /**
     * @param filters A list of rules applied to the body/payload sent in the POST request to a
     * webhook URL. 
     * All defined rules must pass for the request to be accepted and the pipeline started.
     */
    override fun filters(filters: List<Any>) {
      cdkBuilder.filters(filters)
    }

    /**
     * @param filters A list of rules applied to the body/payload sent in the POST request to a
     * webhook URL. 
     * All defined rules must pass for the request to be accepted and the pipeline started.
     */
    override fun filters(vararg filters: Any): Unit = filters(filters.toList())

    /**
     * @param name The name of the webhook.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param registerWithThirdParty Configures a connection between the webhook that was created
     * and the external tool with events to be detected.
     */
    override fun registerWithThirdParty(registerWithThirdParty: Boolean) {
      cdkBuilder.registerWithThirdParty(registerWithThirdParty)
    }

    /**
     * @param registerWithThirdParty Configures a connection between the webhook that was created
     * and the external tool with events to be detected.
     */
    override fun registerWithThirdParty(registerWithThirdParty: IResolvable) {
      cdkBuilder.registerWithThirdParty(registerWithThirdParty.let(IResolvable::unwrap))
    }

    /**
     * @param targetAction The name of the action in a pipeline you want to connect to the webhook. 
     * The action must be from the source (first) stage of the pipeline.
     */
    override fun targetAction(targetAction: String) {
      cdkBuilder.targetAction(targetAction)
    }

    /**
     * @param targetPipeline The name of the pipeline you want to connect to the webhook. 
     */
    override fun targetPipeline(targetPipeline: String) {
      cdkBuilder.targetPipeline(targetPipeline)
    }

    /**
     * @param targetPipelineVersion The version number of the pipeline to be connected to the
     * trigger request. 
     * Required: Yes
     *
     * Type: Integer
     *
     * Update requires: [No
     * interruption](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
     */
    override fun targetPipelineVersion(targetPipelineVersion: Number) {
      cdkBuilder.targetPipelineVersion(targetPipelineVersion)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CfnWebhookProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.CfnWebhookProps,
  ) : CdkObject(cdkObject), CfnWebhookProps {
    /**
     * Supported options are GITHUB_HMAC, IP, and UNAUTHENTICATED.
     *
     * * For information about the authentication scheme implemented by GITHUB_HMAC, see [Securing
     * your webhooks](https://docs.aws.amazon.com/https://developer.github.com/webhooks/securing/) on
     * the GitHub Developer website.
     * * IP rejects webhooks trigger requests unless they originate from an IP address in the IP
     * range whitelisted in the authentication configuration.
     * * UNAUTHENTICATED accepts all webhook trigger requests regardless of origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authentication)
     */
    override fun authentication(): String = unwrap(this).getAuthentication()

    /**
     * Properties that configure the authentication applied to incoming webhook trigger requests.
     *
     * The required properties depend on the authentication type. For GITHUB_HMAC, only the
     * `SecretToken` property must be set. For IP, only the `AllowedIPRange` property must be set to a
     * valid CIDR range. For UNAUTHENTICATED, no properties can be set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authenticationconfiguration)
     */
    override fun authenticationConfiguration(): Any = unwrap(this).getAuthenticationConfiguration()

    /**
     * A list of rules applied to the body/payload sent in the POST request to a webhook URL.
     *
     * All defined rules must pass for the request to be accepted and the pipeline started.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters)
     */
    override fun filters(): Any = unwrap(this).getFilters()

    /**
     * The name of the webhook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Configures a connection between the webhook that was created and the external tool with
     * events to be detected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty)
     */
    override fun registerWithThirdParty(): Any? = unwrap(this).getRegisterWithThirdParty()

    /**
     * The name of the action in a pipeline you want to connect to the webhook.
     *
     * The action must be from the source (first) stage of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction)
     */
    override fun targetAction(): String = unwrap(this).getTargetAction()

    /**
     * The name of the pipeline you want to connect to the webhook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline)
     */
    override fun targetPipeline(): String = unwrap(this).getTargetPipeline()

    /**
     * The version number of the pipeline to be connected to the trigger request.
     *
     * Required: Yes
     *
     * Type: Integer
     *
     * Update requires: [No
     * interruption](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipelineversion)
     */
    override fun targetPipelineVersion(): Number = unwrap(this).getTargetPipelineVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWebhookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnWebhookProps):
        CfnWebhookProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWebhookProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWebhookProps):
        software.amazon.awscdk.services.codepipeline.CfnWebhookProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.CfnWebhookProps
  }
}
