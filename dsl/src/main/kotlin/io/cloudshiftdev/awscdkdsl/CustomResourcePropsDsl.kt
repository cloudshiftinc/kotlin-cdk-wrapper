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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.CustomResourceProps
import software.amazon.awscdk.RemovalPolicy

/**
 * Properties to provide a Lambda-backed custom resource.
 *
 * Example:
 * ```
 * String serviceToken = CustomResourceProvider.getOrCreate(this, "Custom::MyCustomResourceType",
 * CustomResourceProviderProps.builder()
 * .codeDirectory(String.format("%s/my-handler", __dirname))
 * .runtime(CustomResourceProviderRuntime.NODEJS_14_X)
 * .description("Lambda function created by the custom resource provider")
 * .build());
 * CustomResource.Builder.create(this, "MyResource")
 * .resourceType("Custom::MyCustomResourceType")
 * .serviceToken(serviceToken)
 * .build();
 * ```
 */
@CdkDslMarker
public class CustomResourcePropsDsl {
    private val cdkBuilder: CustomResourceProps.Builder = CustomResourceProps.builder()

    /** @param pascalCaseProperties Convert all property keys to pascal case. */
    public fun pascalCaseProperties(pascalCaseProperties: Boolean) {
        cdkBuilder.pascalCaseProperties(pascalCaseProperties)
    }

    /** @param properties Properties to pass to the Lambda. */
    public fun properties(properties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(properties)
        cdkBuilder.properties(builder.map)
    }

    /** @param properties Properties to pass to the Lambda. */
    public fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
    }

    /**
     * @param removalPolicy The policy to apply when this resource is removed from the application.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * @param resourceType For custom resources, you can specify AWS::CloudFormation::CustomResource
     *   (the default) as the resource type, or you can specify your own resource type name. For
     *   example, you can use "Custom::MyCustomResourceTypeName".
     *
     * Custom resource type names must begin with "Custom::" and can include alphanumeric characters
     * and the following characters: _&#64;-. You can specify a custom resource type name up to a
     * maximum length of 60 characters. You cannot change the type during an update.
     *
     * Using your own resource type names helps you quickly differentiate the types of custom
     * resources in your stack. For example, if you had two custom resources that conduct two
     * different ping tests, you could name their type as Custom::PingTester to make them easily
     * identifiable as ping testers (instead of using AWS::CloudFormation::CustomResource).
     */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param serviceToken The ARN of the provider which implements this custom resource type. You
     *   can implement a provider by listening to raw AWS CloudFormation events and specify the ARN
     *   of an SNS topic (`topic.topicArn`) or the ARN of an AWS Lambda function
     *   (`lambda.functionArn`) or use the CDK's custom <a
     *   href="https://docs.aws.amazon.com/cdk/api/latest/docs/custom-resources-readme.html">resource
     *   provider framework</a> which makes it easier to implement robust providers.
     *
     * Provider framework:
     * ```
     * // use the provider framework from aws-cdk/custom-resources:
     * Provider provider = Provider.Builder.create(this, "ResourceProvider")
     * .onEventHandler(onEventHandler)
     * .isCompleteHandler(isCompleteHandler)
     * .build();
     * *
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(provider.getServiceToken())
     * .build();
     * ```
     *
     * AWS Lambda function (not recommended to use AWS Lambda Functions directly, see the module
     * README):
     * ```
     * // invoke an AWS Lambda function when a lifecycle event occurs:
     * // invoke an AWS Lambda function when a lifecycle event occurs:
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(myFunction.getFunctionArn())
     * .build();
     * ```
     *
     * SNS topic (not recommended to use AWS Lambda Functions directly, see the module README):
     * ```
     * // publish lifecycle events to an SNS topic:
     * // publish lifecycle events to an SNS topic:
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(myTopic.getTopicArn())
     * .build();
     * ```
     */
    public fun serviceToken(serviceToken: String) {
        cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): CustomResourceProps = cdkBuilder.build()
}
