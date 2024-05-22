@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties to provide a Lambda-backed custom resource.
 *
 * Example:
 *
 * ```
 * String serviceToken = CustomResourceProvider.getOrCreate(this, "Custom::MyCustomResourceType",
 * CustomResourceProviderProps.builder()
 * .codeDirectory(String.format("%s/my-handler", __dirname))
 * .runtime(CustomResourceProviderRuntime.NODEJS_18_X)
 * .description("Lambda function created by the custom resource provider")
 * .build());
 * CustomResource.Builder.create(this, "MyResource")
 * .resourceType("Custom::MyCustomResourceType")
 * .serviceToken(serviceToken)
 * .build();
 * ```
 */
public interface CustomResourceProps {
  /**
   * Convert all property keys to pascal case.
   *
   * Default: false
   */
  public fun pascalCaseProperties(): Boolean? = unwrap(this).getPascalCaseProperties()

  /**
   * Properties to pass to the Lambda.
   *
   * Default: - No properties.
   */
  public fun properties(): Map<String, Any> = unwrap(this).getProperties() ?: emptyMap()

  /**
   * The policy to apply when this resource is removed from the application.
   *
   * Default: cdk.RemovalPolicy.Destroy
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * For custom resources, you can specify AWS::CloudFormation::CustomResource (the default) as the
   * resource type, or you can specify your own resource type name.
   *
   * For example, you can use "Custom::MyCustomResourceTypeName".
   *
   * Custom resource type names must begin with "Custom::" and can include
   * alphanumeric characters and the following characters: _&#64;-. You can specify
   * a custom resource type name up to a maximum length of 60 characters. You
   * cannot change the type during an update.
   *
   * Using your own resource type names helps you quickly differentiate the
   * types of custom resources in your stack. For example, if you had two custom
   * resources that conduct two different ping tests, you could name their type
   * as Custom::PingTester to make them easily identifiable as ping testers
   * (instead of using AWS::CloudFormation::CustomResource).
   *
   * Default: - AWS::CloudFormation::CustomResource
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html#aws-cfn-resource-type-name)
   */
  public fun resourceType(): String? = unwrap(this).getResourceType()

  /**
   * The ARN of the provider which implements this custom resource type.
   *
   * You can implement a provider by listening to raw AWS CloudFormation events
   * and specify the ARN of an SNS topic (`topic.topicArn`) or the ARN of an AWS
   * Lambda function (`lambda.functionArn`) or use the CDK's custom <a
   * href="https://docs.aws.amazon.com/cdk/api/latest/docs/custom-resources-readme.html">resource
   * provider framework</a> which makes it easier to implement robust providers.
   *
   * Provider framework:
   *
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
   * AWS Lambda function (not recommended to use AWS Lambda Functions directly,
   * see the module README):
   *
   * ```
   * // invoke an AWS Lambda function when a lifecycle event occurs:
   * // invoke an AWS Lambda function when a lifecycle event occurs:
   * CustomResource.Builder.create(this, "MyResource")
   * .serviceToken(myFunction.getFunctionArn())
   * .build();
   * ```
   *
   * SNS topic (not recommended to use AWS Lambda Functions directly, see the
   * module README):
   *
   * ```
   * // publish lifecycle events to an SNS topic:
   * // publish lifecycle events to an SNS topic:
   * CustomResource.Builder.create(this, "MyResource")
   * .serviceToken(myTopic.getTopicArn())
   * .build();
   * ```
   */
  public fun serviceToken(): String

  /**
   * A builder for [CustomResourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param pascalCaseProperties Convert all property keys to pascal case.
     */
    public fun pascalCaseProperties(pascalCaseProperties: Boolean)

    /**
     * @param properties Properties to pass to the Lambda.
     */
    public fun properties(properties: Map<String, Any>)

    /**
     * @param removalPolicy The policy to apply when this resource is removed from the application.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param resourceType For custom resources, you can specify AWS::CloudFormation::CustomResource
     * (the default) as the resource type, or you can specify your own resource type name.
     * For example, you can use "Custom::MyCustomResourceTypeName".
     *
     * Custom resource type names must begin with "Custom::" and can include
     * alphanumeric characters and the following characters: _&#64;-. You can specify
     * a custom resource type name up to a maximum length of 60 characters. You
     * cannot change the type during an update.
     *
     * Using your own resource type names helps you quickly differentiate the
     * types of custom resources in your stack. For example, if you had two custom
     * resources that conduct two different ping tests, you could name their type
     * as Custom::PingTester to make them easily identifiable as ping testers
     * (instead of using AWS::CloudFormation::CustomResource).
     */
    public fun resourceType(resourceType: String)

    /**
     * @param serviceToken The ARN of the provider which implements this custom resource type. 
     * You can implement a provider by listening to raw AWS CloudFormation events
     * and specify the ARN of an SNS topic (`topic.topicArn`) or the ARN of an AWS
     * Lambda function (`lambda.functionArn`) or use the CDK's custom <a
     * href="https://docs.aws.amazon.com/cdk/api/latest/docs/custom-resources-readme.html">resource
     * provider framework</a> which makes it easier to implement robust providers.
     *
     * Provider framework:
     *
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
     * AWS Lambda function (not recommended to use AWS Lambda Functions directly,
     * see the module README):
     *
     * ```
     * // invoke an AWS Lambda function when a lifecycle event occurs:
     * // invoke an AWS Lambda function when a lifecycle event occurs:
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(myFunction.getFunctionArn())
     * .build();
     * ```
     *
     * SNS topic (not recommended to use AWS Lambda Functions directly, see the
     * module README):
     *
     * ```
     * // publish lifecycle events to an SNS topic:
     * // publish lifecycle events to an SNS topic:
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(myTopic.getTopicArn())
     * .build();
     * ```
     */
    public fun serviceToken(serviceToken: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CustomResourceProps.Builder =
        software.amazon.awscdk.CustomResourceProps.builder()

    /**
     * @param pascalCaseProperties Convert all property keys to pascal case.
     */
    override fun pascalCaseProperties(pascalCaseProperties: Boolean) {
      cdkBuilder.pascalCaseProperties(pascalCaseProperties)
    }

    /**
     * @param properties Properties to pass to the Lambda.
     */
    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param removalPolicy The policy to apply when this resource is removed from the application.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * @param resourceType For custom resources, you can specify AWS::CloudFormation::CustomResource
     * (the default) as the resource type, or you can specify your own resource type name.
     * For example, you can use "Custom::MyCustomResourceTypeName".
     *
     * Custom resource type names must begin with "Custom::" and can include
     * alphanumeric characters and the following characters: _&#64;-. You can specify
     * a custom resource type name up to a maximum length of 60 characters. You
     * cannot change the type during an update.
     *
     * Using your own resource type names helps you quickly differentiate the
     * types of custom resources in your stack. For example, if you had two custom
     * resources that conduct two different ping tests, you could name their type
     * as Custom::PingTester to make them easily identifiable as ping testers
     * (instead of using AWS::CloudFormation::CustomResource).
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param serviceToken The ARN of the provider which implements this custom resource type. 
     * You can implement a provider by listening to raw AWS CloudFormation events
     * and specify the ARN of an SNS topic (`topic.topicArn`) or the ARN of an AWS
     * Lambda function (`lambda.functionArn`) or use the CDK's custom <a
     * href="https://docs.aws.amazon.com/cdk/api/latest/docs/custom-resources-readme.html">resource
     * provider framework</a> which makes it easier to implement robust providers.
     *
     * Provider framework:
     *
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
     * AWS Lambda function (not recommended to use AWS Lambda Functions directly,
     * see the module README):
     *
     * ```
     * // invoke an AWS Lambda function when a lifecycle event occurs:
     * // invoke an AWS Lambda function when a lifecycle event occurs:
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(myFunction.getFunctionArn())
     * .build();
     * ```
     *
     * SNS topic (not recommended to use AWS Lambda Functions directly, see the
     * module README):
     *
     * ```
     * // publish lifecycle events to an SNS topic:
     * // publish lifecycle events to an SNS topic:
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(myTopic.getTopicArn())
     * .build();
     * ```
     */
    override fun serviceToken(serviceToken: String) {
      cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): software.amazon.awscdk.CustomResourceProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CustomResourceProps,
  ) : CdkObject(cdkObject), CustomResourceProps {
    /**
     * Convert all property keys to pascal case.
     *
     * Default: false
     */
    override fun pascalCaseProperties(): Boolean? = unwrap(this).getPascalCaseProperties()

    /**
     * Properties to pass to the Lambda.
     *
     * Default: - No properties.
     */
    override fun properties(): Map<String, Any> = unwrap(this).getProperties() ?: emptyMap()

    /**
     * The policy to apply when this resource is removed from the application.
     *
     * Default: cdk.RemovalPolicy.Destroy
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * For custom resources, you can specify AWS::CloudFormation::CustomResource (the default) as
     * the resource type, or you can specify your own resource type name.
     *
     * For example, you can use "Custom::MyCustomResourceTypeName".
     *
     * Custom resource type names must begin with "Custom::" and can include
     * alphanumeric characters and the following characters: _&#64;-. You can specify
     * a custom resource type name up to a maximum length of 60 characters. You
     * cannot change the type during an update.
     *
     * Using your own resource type names helps you quickly differentiate the
     * types of custom resources in your stack. For example, if you had two custom
     * resources that conduct two different ping tests, you could name their type
     * as Custom::PingTester to make them easily identifiable as ping testers
     * (instead of using AWS::CloudFormation::CustomResource).
     *
     * Default: - AWS::CloudFormation::CustomResource
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html#aws-cfn-resource-type-name)
     */
    override fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * The ARN of the provider which implements this custom resource type.
     *
     * You can implement a provider by listening to raw AWS CloudFormation events
     * and specify the ARN of an SNS topic (`topic.topicArn`) or the ARN of an AWS
     * Lambda function (`lambda.functionArn`) or use the CDK's custom <a
     * href="https://docs.aws.amazon.com/cdk/api/latest/docs/custom-resources-readme.html">resource
     * provider framework</a> which makes it easier to implement robust providers.
     *
     * Provider framework:
     *
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
     * AWS Lambda function (not recommended to use AWS Lambda Functions directly,
     * see the module README):
     *
     * ```
     * // invoke an AWS Lambda function when a lifecycle event occurs:
     * // invoke an AWS Lambda function when a lifecycle event occurs:
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(myFunction.getFunctionArn())
     * .build();
     * ```
     *
     * SNS topic (not recommended to use AWS Lambda Functions directly, see the
     * module README):
     *
     * ```
     * // publish lifecycle events to an SNS topic:
     * // publish lifecycle events to an SNS topic:
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(myTopic.getTopicArn())
     * .build();
     * ```
     */
    override fun serviceToken(): String = unwrap(this).getServiceToken()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResourceProps): CustomResourceProps =
        CdkObjectWrappers.wrap(cdkObject) as? CustomResourceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomResourceProps): software.amazon.awscdk.CustomResourceProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CustomResourceProps
  }
}
