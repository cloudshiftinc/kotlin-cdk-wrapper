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

package cloudshift.awscdk.dsl.customresources

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.customresources.AwsCustomResource
import software.amazon.awscdk.customresources.AwsCustomResourceProps
import software.amazon.awscdk.customresources.AwsSdkCall
import software.amazon.awscdk.customresources.Provider
import software.amazon.awscdk.customresources.ProviderProps
import software.amazon.awscdk.customresources.SdkCallsPolicyOptions
import software.constructs.Construct

public object customresources {
    /**
     * Defines a custom resource that is materialized using specific AWS API calls.
     *
     * These calls are created using a singleton Lambda function.
     *
     * Use this to bridge any gap that might exist in the CloudFormation Coverage. You can specify
     * exactly which calls are invoked for the 'CREATE', 'UPDATE' and 'DELETE' life cycle events.
     *
     * Example:
     * ```
     * AwsCustomResource getParameter = AwsCustomResource.Builder.create(this, "GetParameter")
     * .onUpdate(AwsSdkCall.builder() // will also be called for a CREATE event
     * .service("SSM")
     * .action("getParameter")
     * .parameters(Map.of(
     * "Name", "my-parameter",
     * "WithDecryption", true))
     * .physicalResourceId(PhysicalResourceId.of(Date.now().toString())).build())
     * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
     * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
     * .build()))
     * .build();
     * // Use the value in another construct with
     * getParameter.getResponseField("Parameter.Value");
     * ```
     */
    public inline fun awsCustomResource(
        scope: Construct,
        id: String,
        block: AwsCustomResourceDsl.() -> Unit = {},
    ): AwsCustomResource {
        val builder = AwsCustomResourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for AwsCustomResource.
     *
     * Note that at least onCreate, onUpdate or onDelete must be specified.
     *
     * Example:
     * ```
     * AwsCustomResource getParameter = AwsCustomResource.Builder.create(this, "GetParameter")
     * .onUpdate(AwsSdkCall.builder() // will also be called for a CREATE event
     * .service("SSM")
     * .action("getParameter")
     * .parameters(Map.of(
     * "Name", "my-parameter",
     * "WithDecryption", true))
     * .physicalResourceId(PhysicalResourceId.of(Date.now().toString())).build())
     * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
     * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
     * .build()))
     * .build();
     * // Use the value in another construct with
     * getParameter.getResponseField("Parameter.Value");
     * ```
     */
    public inline fun awsCustomResourceProps(
        block: AwsCustomResourcePropsDsl.() -> Unit = {}
    ): AwsCustomResourceProps {
        val builder = AwsCustomResourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AWS SDK call.
     *
     * Example:
     * ```
     * AwsCustomResource awsCustom = AwsCustomResource.Builder.create(this, "aws-custom")
     * .onCreate(AwsSdkCall.builder()
     * .service("...")
     * .action("...")
     * .parameters(Map.of(
     * "text", "..."))
     * .physicalResourceId(PhysicalResourceId.of("..."))
     * .build())
     * .onUpdate(AwsSdkCall.builder()
     * .service("...")
     * .action("...")
     * .parameters(Map.of(
     * "text", "...",
     * "resourceId", new PhysicalResourceIdReference()))
     * .build())
     * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
     * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
     * .build()))
     * .build();
     * ```
     */
    public inline fun awsSdkCall(block: AwsSdkCallDsl.() -> Unit = {}): AwsSdkCall {
        val builder = AwsSdkCallDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines an AWS CloudFormation custom resource provider.
     *
     * Example:
     * ```
     * Function onEvent;
     * Function isComplete;
     * Role myRole;
     * Provider myProvider = Provider.Builder.create(this, "MyProvider")
     * .onEventHandler(onEvent)
     * .isCompleteHandler(isComplete)
     * .logRetention(RetentionDays.ONE_DAY)
     * .role(myRole)
     * .providerFunctionName("the-lambda-name")
     * .build();
     * ```
     */
    public inline fun provider(
        scope: Construct,
        id: String,
        block: ProviderDsl.() -> Unit = {},
    ): Provider {
        val builder = ProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Initialization properties for the `Provider` construct.
     *
     * Example:
     * ```
     * Function onEvent;
     * Function isComplete;
     * Role myRole;
     * Provider myProvider = Provider.Builder.create(this, "MyProvider")
     * .onEventHandler(onEvent)
     * .isCompleteHandler(isComplete)
     * .logRetention(RetentionDays.ONE_DAY)
     * .role(myRole)
     * .providerFunctionName("the-lambda-name")
     * .build();
     * ```
     */
    public inline fun providerProps(block: ProviderPropsDsl.() -> Unit = {}): ProviderProps {
        val builder = ProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for the auto-generation of policies based on the configured SDK calls.
     *
     * Example:
     * ```
     * AwsCustomResource getParameter = AwsCustomResource.Builder.create(this, "GetParameter")
     * .onUpdate(AwsSdkCall.builder() // will also be called for a CREATE event
     * .service("SSM")
     * .action("getParameter")
     * .parameters(Map.of(
     * "Name", "my-parameter",
     * "WithDecryption", true))
     * .physicalResourceId(PhysicalResourceId.of(Date.now().toString())).build())
     * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
     * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
     * .build()))
     * .build();
     * // Use the value in another construct with
     * getParameter.getResponseField("Parameter.Value");
     * ```
     */
    public inline fun sdkCallsPolicyOptions(
        block: SdkCallsPolicyOptionsDsl.() -> Unit = {}
    ): SdkCallsPolicyOptions {
        val builder = SdkCallsPolicyOptionsDsl()
        builder.apply(block)
        return builder.build()
    }
}
