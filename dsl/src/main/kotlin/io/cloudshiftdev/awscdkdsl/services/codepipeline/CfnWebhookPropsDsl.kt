@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnWebhook
import software.amazon.awscdk.services.codepipeline.CfnWebhookProps

/**
 * Properties for defining a `CfnWebhook`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
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
@CdkDslMarker
public class CfnWebhookPropsDsl {
    private val cdkBuilder: CfnWebhookProps.Builder = CfnWebhookProps.builder()

    private val _filters: MutableList<Any> = mutableListOf()

    /**
     * @param authentication Supported options are GITHUB_HMAC, IP, and UNAUTHENTICATED.
     * * For information about the authentication scheme implemented by GITHUB_HMAC, see
     *   [Securing your webhooks](https://docs.aws.amazon.com/https://developer.github.com/webhooks/securing/)
     *   on the GitHub Developer website.
     * * IP rejects webhooks trigger requests unless they originate from an IP address in the IP
     *   range whitelisted in the authentication configuration.
     * * UNAUTHENTICATED accepts all webhook trigger requests regardless of origin.
     */
    public fun authentication(authentication: String) {
        cdkBuilder.authentication(authentication)
    }

    /**
     * @param authenticationConfiguration Properties that configure the authentication applied to
     *   incoming webhook trigger requests. The required properties depend on the authentication
     *   type. For GITHUB_HMAC, only the `SecretToken` property must be set. For IP, only the
     *   `AllowedIPRange` property must be set to a valid CIDR range. For UNAUTHENTICATED, no
     *   properties can be set.
     */
    public fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    /**
     * @param authenticationConfiguration Properties that configure the authentication applied to
     *   incoming webhook trigger requests. The required properties depend on the authentication
     *   type. For GITHUB_HMAC, only the `SecretToken` property must be set. For IP, only the
     *   `AllowedIPRange` property must be set to a valid CIDR range. For UNAUTHENTICATED, no
     *   properties can be set.
     */
    public fun authenticationConfiguration(
        authenticationConfiguration: CfnWebhook.WebhookAuthConfigurationProperty
    ) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    /**
     * @param filters A list of rules applied to the body/payload sent in the POST request to a
     *   webhook URL. All defined rules must pass for the request to be accepted and the pipeline
     *   started.
     */
    public fun filters(vararg filters: Any) {
        _filters.addAll(listOf(*filters))
    }

    /**
     * @param filters A list of rules applied to the body/payload sent in the POST request to a
     *   webhook URL. All defined rules must pass for the request to be accepted and the pipeline
     *   started.
     */
    public fun filters(filters: Collection<Any>) {
        _filters.addAll(filters)
    }

    /**
     * @param filters A list of rules applied to the body/payload sent in the POST request to a
     *   webhook URL. All defined rules must pass for the request to be accepted and the pipeline
     *   started.
     */
    public fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters)
    }

    /** @param name The name of the webhook. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param registerWithThirdParty Configures a connection between the webhook that was created
     *   and the external tool with events to be detected.
     */
    public fun registerWithThirdParty(registerWithThirdParty: Boolean) {
        cdkBuilder.registerWithThirdParty(registerWithThirdParty)
    }

    /**
     * @param registerWithThirdParty Configures a connection between the webhook that was created
     *   and the external tool with events to be detected.
     */
    public fun registerWithThirdParty(registerWithThirdParty: IResolvable) {
        cdkBuilder.registerWithThirdParty(registerWithThirdParty)
    }

    /**
     * @param targetAction The name of the action in a pipeline you want to connect to the webhook.
     *   The action must be from the source (first) stage of the pipeline.
     */
    public fun targetAction(targetAction: String) {
        cdkBuilder.targetAction(targetAction)
    }

    /** @param targetPipeline The name of the pipeline you want to connect to the webhook. */
    public fun targetPipeline(targetPipeline: String) {
        cdkBuilder.targetPipeline(targetPipeline)
    }

    /**
     * @param targetPipelineVersion The version number of the pipeline to be connected to the
     *   trigger request. Required: Yes
     *
     * Type: Integer
     *
     * Update requires:
     * [No interruption](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
     */
    public fun targetPipelineVersion(targetPipelineVersion: Number) {
        cdkBuilder.targetPipelineVersion(targetPipelineVersion)
    }

    public fun build(): CfnWebhookProps {
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        return cdkBuilder.build()
    }
}
