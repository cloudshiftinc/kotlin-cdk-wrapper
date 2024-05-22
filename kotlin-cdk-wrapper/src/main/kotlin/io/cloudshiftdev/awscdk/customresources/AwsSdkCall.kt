@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * An AWS SDK call.
 *
 * Example:
 *
 * ```
 * AwsCustomResource.Builder.create(this, "GetParameterCustomResource")
 * .onUpdate(AwsSdkCall.builder() // will also be called for a CREATE event
 * .service("SSM")
 * .action("getParameter")
 * .parameters(Map.of(
 * "Name", "my-parameter",
 * "WithDecryption", true))
 * .physicalResourceId(PhysicalResourceId.fromResponse("Parameter.ARN")).build())
 * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
 * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
 * .build()))
 * .build();
 * ```
 */
public interface AwsSdkCall {
  /**
   * The service action to call.
   *
   * This is the name of an AWS API call, in one of the following forms:
   *
   * * An API call name as found in the API Reference documentation (`GetObject`)
   * * The API call name starting with a lowercase letter (`getObject`)
   * * The AWS SDK for JavaScript v3 command class name (`GetObjectCommand`)
   *
   * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
   */
  public fun action(): String

  /**
   * API version to use for the service.
   *
   * Default: - use latest available API version
   *
   * [Documentation](https://docs.aws.amazon.com/sdk-for-javascript/v2/developer-guide/locking-api-versions.html)
   */
  public fun apiVersion(): String? = unwrap(this).getApiVersion()

  /**
   * Used for running the SDK calls in underlying lambda with a different role.
   *
   * Can be used primarily for cross-account requests to for example connect
   * hostedzone with a shared vpc.
   * Region controls where assumeRole call is made.
   *
   * Example for Route53 / associateVPCWithHostedZone
   *
   * Default: - run without assuming role
   */
  public fun assumedRoleArn(): String? = unwrap(this).getAssumedRoleArn()

  /**
   * The regex pattern to use to catch API errors.
   *
   * The `code` property of the
   * `Error` object will be tested against this pattern. If there is a match an
   * error will not be thrown.
   *
   * Default: - do not catch errors
   */
  public fun ignoreErrorCodesMatching(): String? = unwrap(this).getIgnoreErrorCodesMatching()

  /**
   * A property used to configure logging during lambda function execution.
   *
   * Note: The default Logging configuration is all. This configuration will enable logging on all
   * logged data
   * in the lambda handler. This includes:
   *
   * * The event object that is received by the lambda handler
   * * The response received after making a API call
   * * The response object that the lambda handler will return
   * * SDK versioning information
   * * Caught and uncaught errors
   *
   * Default: Logging.all()
   */
  public fun logging(): Logging? = unwrap(this).getLogging()?.let(Logging::wrap)

  /**
   * Restrict the data returned by the custom resource to specific paths in the API response.
   *
   * Use this to limit the data returned by the custom
   * resource if working with API calls that could potentially result in custom
   * response objects exceeding the hard limit of 4096 bytes.
   *
   * Example for ECS / updateService: ['service.deploymentConfiguration.maximumPercent']
   *
   * Default: - return all data
   */
  public fun outputPaths(): List<String> = unwrap(this).getOutputPaths() ?: emptyList()

  /**
   * The parameters for the service action.
   *
   * Default: - no parameters
   *
   * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * The physical resource id of the custom resource for this call.
   *
   * Mandatory for onCreate call.
   * In onUpdate, you can omit this to passthrough it from request.
   *
   * Default: - no physical resource id
   */
  public fun physicalResourceId(): PhysicalResourceId? =
      unwrap(this).getPhysicalResourceId()?.let(PhysicalResourceId::wrap)

  /**
   * The region to send service requests to.
   *
   * **Note: Cross-region operations are generally considered an anti-pattern.**
   * **Consider first deploying a stack in that region.**
   *
   * Default: - the region where this custom resource is deployed
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * The service to call.
   *
   * This is the name of an AWS service, in one of the following forms:
   *
   * * An AWS SDK for JavaScript v3 package name (`&#64;aws-sdk/client-api-gateway`)
   * * An AWS SDK for JavaScript v3 client name (`api-gateway`)
   * * An AWS SDK for JavaScript v2 constructor name (`APIGateway`)
   * * A lowercase AWS SDK for JavaScript v2 constructor name (`apigateway`)
   *
   * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
   */
  public fun service(): String

  /**
   * A builder for [AwsSdkCall]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action The service action to call. 
     * This is the name of an AWS API call, in one of the following forms:
     *
     * * An API call name as found in the API Reference documentation (`GetObject`)
     * * The API call name starting with a lowercase letter (`getObject`)
     * * The AWS SDK for JavaScript v3 command class name (`GetObjectCommand`)
     */
    public fun action(action: String)

    /**
     * @param apiVersion API version to use for the service.
     */
    public fun apiVersion(apiVersion: String)

    /**
     * @param assumedRoleArn Used for running the SDK calls in underlying lambda with a different
     * role.
     * Can be used primarily for cross-account requests to for example connect
     * hostedzone with a shared vpc.
     * Region controls where assumeRole call is made.
     *
     * Example for Route53 / associateVPCWithHostedZone
     */
    public fun assumedRoleArn(assumedRoleArn: String)

    /**
     * @param ignoreErrorCodesMatching The regex pattern to use to catch API errors.
     * The `code` property of the
     * `Error` object will be tested against this pattern. If there is a match an
     * error will not be thrown.
     */
    public fun ignoreErrorCodesMatching(ignoreErrorCodesMatching: String)

    /**
     * @param logging A property used to configure logging during lambda function execution.
     * Note: The default Logging configuration is all. This configuration will enable logging on all
     * logged data
     * in the lambda handler. This includes:
     *
     * * The event object that is received by the lambda handler
     * * The response received after making a API call
     * * The response object that the lambda handler will return
     * * SDK versioning information
     * * Caught and uncaught errors
     */
    public fun logging(logging: Logging)

    /**
     * @param outputPaths Restrict the data returned by the custom resource to specific paths in the
     * API response.
     * Use this to limit the data returned by the custom
     * resource if working with API calls that could potentially result in custom
     * response objects exceeding the hard limit of 4096 bytes.
     *
     * Example for ECS / updateService: ['service.deploymentConfiguration.maximumPercent']
     */
    public fun outputPaths(outputPaths: List<String>)

    /**
     * @param outputPaths Restrict the data returned by the custom resource to specific paths in the
     * API response.
     * Use this to limit the data returned by the custom
     * resource if working with API calls that could potentially result in custom
     * response objects exceeding the hard limit of 4096 bytes.
     *
     * Example for ECS / updateService: ['service.deploymentConfiguration.maximumPercent']
     */
    public fun outputPaths(vararg outputPaths: String)

    /**
     * @param parameters The parameters for the service action.
     */
    public fun parameters(parameters: Any)

    /**
     * @param physicalResourceId The physical resource id of the custom resource for this call.
     * Mandatory for onCreate call.
     * In onUpdate, you can omit this to passthrough it from request.
     */
    public fun physicalResourceId(physicalResourceId: PhysicalResourceId)

    /**
     * @param region The region to send service requests to.
     * **Note: Cross-region operations are generally considered an anti-pattern.**
     * **Consider first deploying a stack in that region.**
     */
    public fun region(region: String)

    /**
     * @param service The service to call. 
     * This is the name of an AWS service, in one of the following forms:
     *
     * * An AWS SDK for JavaScript v3 package name (`&#64;aws-sdk/client-api-gateway`)
     * * An AWS SDK for JavaScript v3 client name (`api-gateway`)
     * * An AWS SDK for JavaScript v2 constructor name (`APIGateway`)
     * * A lowercase AWS SDK for JavaScript v2 constructor name (`apigateway`)
     */
    public fun service(service: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.AwsSdkCall.Builder =
        software.amazon.awscdk.customresources.AwsSdkCall.builder()

    /**
     * @param action The service action to call. 
     * This is the name of an AWS API call, in one of the following forms:
     *
     * * An API call name as found in the API Reference documentation (`GetObject`)
     * * The API call name starting with a lowercase letter (`getObject`)
     * * The AWS SDK for JavaScript v3 command class name (`GetObjectCommand`)
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * @param apiVersion API version to use for the service.
     */
    override fun apiVersion(apiVersion: String) {
      cdkBuilder.apiVersion(apiVersion)
    }

    /**
     * @param assumedRoleArn Used for running the SDK calls in underlying lambda with a different
     * role.
     * Can be used primarily for cross-account requests to for example connect
     * hostedzone with a shared vpc.
     * Region controls where assumeRole call is made.
     *
     * Example for Route53 / associateVPCWithHostedZone
     */
    override fun assumedRoleArn(assumedRoleArn: String) {
      cdkBuilder.assumedRoleArn(assumedRoleArn)
    }

    /**
     * @param ignoreErrorCodesMatching The regex pattern to use to catch API errors.
     * The `code` property of the
     * `Error` object will be tested against this pattern. If there is a match an
     * error will not be thrown.
     */
    override fun ignoreErrorCodesMatching(ignoreErrorCodesMatching: String) {
      cdkBuilder.ignoreErrorCodesMatching(ignoreErrorCodesMatching)
    }

    /**
     * @param logging A property used to configure logging during lambda function execution.
     * Note: The default Logging configuration is all. This configuration will enable logging on all
     * logged data
     * in the lambda handler. This includes:
     *
     * * The event object that is received by the lambda handler
     * * The response received after making a API call
     * * The response object that the lambda handler will return
     * * SDK versioning information
     * * Caught and uncaught errors
     */
    override fun logging(logging: Logging) {
      cdkBuilder.logging(logging.let(Logging.Companion::unwrap))
    }

    /**
     * @param outputPaths Restrict the data returned by the custom resource to specific paths in the
     * API response.
     * Use this to limit the data returned by the custom
     * resource if working with API calls that could potentially result in custom
     * response objects exceeding the hard limit of 4096 bytes.
     *
     * Example for ECS / updateService: ['service.deploymentConfiguration.maximumPercent']
     */
    override fun outputPaths(outputPaths: List<String>) {
      cdkBuilder.outputPaths(outputPaths)
    }

    /**
     * @param outputPaths Restrict the data returned by the custom resource to specific paths in the
     * API response.
     * Use this to limit the data returned by the custom
     * resource if working with API calls that could potentially result in custom
     * response objects exceeding the hard limit of 4096 bytes.
     *
     * Example for ECS / updateService: ['service.deploymentConfiguration.maximumPercent']
     */
    override fun outputPaths(vararg outputPaths: String): Unit = outputPaths(outputPaths.toList())

    /**
     * @param parameters The parameters for the service action.
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param physicalResourceId The physical resource id of the custom resource for this call.
     * Mandatory for onCreate call.
     * In onUpdate, you can omit this to passthrough it from request.
     */
    override fun physicalResourceId(physicalResourceId: PhysicalResourceId) {
      cdkBuilder.physicalResourceId(physicalResourceId.let(PhysicalResourceId.Companion::unwrap))
    }

    /**
     * @param region The region to send service requests to.
     * **Note: Cross-region operations are generally considered an anti-pattern.**
     * **Consider first deploying a stack in that region.**
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param service The service to call. 
     * This is the name of an AWS service, in one of the following forms:
     *
     * * An AWS SDK for JavaScript v3 package name (`&#64;aws-sdk/client-api-gateway`)
     * * An AWS SDK for JavaScript v3 client name (`api-gateway`)
     * * An AWS SDK for JavaScript v2 constructor name (`APIGateway`)
     * * A lowercase AWS SDK for JavaScript v2 constructor name (`apigateway`)
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    public fun build(): software.amazon.awscdk.customresources.AwsSdkCall = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.customresources.AwsSdkCall,
  ) : CdkObject(cdkObject), AwsSdkCall {
    /**
     * The service action to call.
     *
     * This is the name of an AWS API call, in one of the following forms:
     *
     * * An API call name as found in the API Reference documentation (`GetObject`)
     * * The API call name starting with a lowercase letter (`getObject`)
     * * The AWS SDK for JavaScript v3 command class name (`GetObjectCommand`)
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     */
    override fun action(): String = unwrap(this).getAction()

    /**
     * API version to use for the service.
     *
     * Default: - use latest available API version
     *
     * [Documentation](https://docs.aws.amazon.com/sdk-for-javascript/v2/developer-guide/locking-api-versions.html)
     */
    override fun apiVersion(): String? = unwrap(this).getApiVersion()

    /**
     * Used for running the SDK calls in underlying lambda with a different role.
     *
     * Can be used primarily for cross-account requests to for example connect
     * hostedzone with a shared vpc.
     * Region controls where assumeRole call is made.
     *
     * Example for Route53 / associateVPCWithHostedZone
     *
     * Default: - run without assuming role
     */
    override fun assumedRoleArn(): String? = unwrap(this).getAssumedRoleArn()

    /**
     * The regex pattern to use to catch API errors.
     *
     * The `code` property of the
     * `Error` object will be tested against this pattern. If there is a match an
     * error will not be thrown.
     *
     * Default: - do not catch errors
     */
    override fun ignoreErrorCodesMatching(): String? = unwrap(this).getIgnoreErrorCodesMatching()

    /**
     * A property used to configure logging during lambda function execution.
     *
     * Note: The default Logging configuration is all. This configuration will enable logging on all
     * logged data
     * in the lambda handler. This includes:
     *
     * * The event object that is received by the lambda handler
     * * The response received after making a API call
     * * The response object that the lambda handler will return
     * * SDK versioning information
     * * Caught and uncaught errors
     *
     * Default: Logging.all()
     */
    override fun logging(): Logging? = unwrap(this).getLogging()?.let(Logging::wrap)

    /**
     * Restrict the data returned by the custom resource to specific paths in the API response.
     *
     * Use this to limit the data returned by the custom
     * resource if working with API calls that could potentially result in custom
     * response objects exceeding the hard limit of 4096 bytes.
     *
     * Example for ECS / updateService: ['service.deploymentConfiguration.maximumPercent']
     *
     * Default: - return all data
     */
    override fun outputPaths(): List<String> = unwrap(this).getOutputPaths() ?: emptyList()

    /**
     * The parameters for the service action.
     *
     * Default: - no parameters
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The physical resource id of the custom resource for this call.
     *
     * Mandatory for onCreate call.
     * In onUpdate, you can omit this to passthrough it from request.
     *
     * Default: - no physical resource id
     */
    override fun physicalResourceId(): PhysicalResourceId? =
        unwrap(this).getPhysicalResourceId()?.let(PhysicalResourceId::wrap)

    /**
     * The region to send service requests to.
     *
     * **Note: Cross-region operations are generally considered an anti-pattern.**
     * **Consider first deploying a stack in that region.**
     *
     * Default: - the region where this custom resource is deployed
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * The service to call.
     *
     * This is the name of an AWS service, in one of the following forms:
     *
     * * An AWS SDK for JavaScript v3 package name (`&#64;aws-sdk/client-api-gateway`)
     * * An AWS SDK for JavaScript v3 client name (`api-gateway`)
     * * An AWS SDK for JavaScript v2 constructor name (`APIGateway`)
     * * A lowercase AWS SDK for JavaScript v2 constructor name (`apigateway`)
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     */
    override fun service(): String = unwrap(this).getService()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsSdkCall {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.AwsSdkCall): AwsSdkCall =
        CdkObjectWrappers.wrap(cdkObject) as? AwsSdkCall ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsSdkCall): software.amazon.awscdk.customresources.AwsSdkCall =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.customresources.AwsSdkCall
  }
}
