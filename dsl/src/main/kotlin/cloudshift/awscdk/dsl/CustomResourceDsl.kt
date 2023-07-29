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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.CustomResource
import software.amazon.awscdk.RemovalPolicy
import software.constructs.Construct

/**
 * Instantiation of a custom resource, whose implementation is provided a Provider.
 *
 * This class is intended to be used by construct library authors. Application builder should not be
 * able to tell whether or not a construct is backed by a custom resource, and so the use of this
 * class should be invisible.
 *
 * Instead, construct library authors declare a custom construct that hides the choice of provider,
 * and accepts a strongly-typed properties object with the properties your provider accepts.
 *
 * Your custom resource provider (identified by the `serviceToken` property) can be one of 4
 * constructs:
 * * If you are authoring a construct library or application, we recommend you use the `Provider`
 *   class in the `custom-resources` module.
 * * If you are authoring a construct for the CDK's AWS Construct Library, you should use the
 *   `CustomResourceProvider` construct in this package.
 * * If you want full control over the provider, you can always directly use a Lambda Function or
 *   SNS Topic by passing the ARN into `serviceToken`.
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
public class CustomResourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CustomResource.Builder = CustomResource.Builder.create(scope, id)

    /**
     * Convert all property keys to pascal case.
     *
     * Default: false
     *
     * @param pascalCaseProperties Convert all property keys to pascal case.
     */
    public fun pascalCaseProperties(pascalCaseProperties: Boolean) {
        cdkBuilder.pascalCaseProperties(pascalCaseProperties)
    }

    /**
     * Properties to pass to the Lambda.
     *
     * Default: - No properties.
     *
     * @param properties Properties to pass to the Lambda.
     */
    public fun properties(properties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(properties)
        cdkBuilder.properties(builder.map)
    }

    /**
     * Properties to pass to the Lambda.
     *
     * Default: - No properties.
     *
     * @param properties Properties to pass to the Lambda.
     */
    public fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
    }

    /**
     * The policy to apply when this resource is removed from the application.
     *
     * Default: cdk.RemovalPolicy.Destroy
     *
     * @param removalPolicy The policy to apply when this resource is removed from the application.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * For custom resources, you can specify AWS::CloudFormation::CustomResource (the default) as
     * the resource type, or you can specify your own resource type name.
     *
     * For example, you can use "Custom::MyCustomResourceTypeName".
     *
     * Custom resource type names must begin with "Custom::" and can include alphanumeric characters
     * and the following characters: _&#64;-. You can specify a custom resource type name up to a
     * maximum length of 60 characters. You cannot change the type during an update.
     *
     * Using your own resource type names helps you quickly differentiate the types of custom
     * resources in your stack. For example, if you had two custom resources that conduct two
     * different ping tests, you could name their type as Custom::PingTester to make them easily
     * identifiable as ping testers (instead of using AWS::CloudFormation::CustomResource).
     *
     * Default: - AWS::CloudFormation::CustomResource
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html#aws-cfn-resource-type-name)
     *
     * @param resourceType For custom resources, you can specify AWS::CloudFormation::CustomResource
     *   (the default) as the resource type, or you can specify your own resource type name.
     */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * The ARN of the provider which implements this custom resource type.
     *
     * You can implement a provider by listening to raw AWS CloudFormation events and specify the
     * ARN of an SNS topic (`topic.topicArn`) or the ARN of an AWS Lambda function
     * (`lambda.functionArn`) or use the CDK's custom <a
     * href="https://docs.aws.amazon.com/cdk/api/latest/docs/custom-resources-readme.html">resource
     * provider framework</a> which makes it easier to implement robust providers.
     *
     * Provider framework:
     * ```
     * // use the provider framework from aws-cdk/custom-resources:
     * Provider provider = Provider.Builder.create(this, "ResourceProvider")
     * .onEventHandler(onEventHandler)
     * .isCompleteHandler(isCompleteHandler)
     * .build();
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
     *
     * @param serviceToken The ARN of the provider which implements this custom resource type.
     */
    public fun serviceToken(serviceToken: String) {
        cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): CustomResource = cdkBuilder.build()
}
