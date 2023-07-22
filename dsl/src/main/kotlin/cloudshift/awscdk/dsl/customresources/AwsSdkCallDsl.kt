@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.customresources

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.customresources.AwsSdkCall
import software.amazon.awscdk.customresources.PhysicalResourceId

/**
 * An AWS SDK call.
 *
 * Example:
 *
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
@CdkDslMarker
public class AwsSdkCallDsl {
  private val cdkBuilder: AwsSdkCall.Builder = AwsSdkCall.builder()

  private val _outputPaths: MutableList<String> = mutableListOf()

  /**
   * @param action The service action to call. 
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  /**
   * @param apiVersion API version to use for the service.
   */
  public fun apiVersion(apiVersion: String) {
    cdkBuilder.apiVersion(apiVersion)
  }

  /**
   * @param assumedRoleArn Used for running the SDK calls in underlying lambda with a different role
   * Can be used primarily for cross-account requests to for example connect hostedzone with a shared
   * vpc.
   * Example for Route53 / associateVPCWithHostedZone
   */
  public fun assumedRoleArn(assumedRoleArn: String) {
    cdkBuilder.assumedRoleArn(assumedRoleArn)
  }

  /**
   * @param ignoreErrorCodesMatching The regex pattern to use to catch API errors.
   * The `code` property of the
   * `Error` object will be tested against this pattern. If there is a match an
   * error will not be thrown.
   */
  public fun ignoreErrorCodesMatching(ignoreErrorCodesMatching: String) {
    cdkBuilder.ignoreErrorCodesMatching(ignoreErrorCodesMatching)
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
  public fun outputPaths(vararg outputPaths: String) {
    _outputPaths.addAll(listOf(*outputPaths))
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
  public fun outputPaths(outputPaths: Collection<String>) {
    _outputPaths.addAll(outputPaths)
  }

  /**
   * @param parameters The parameters for the service action.
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * @param parameters The parameters for the service action.
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param physicalResourceId The physical resource id of the custom resource for this call.
   * Mandatory for onCreate call.
   * In onUpdate, you can omit this to passthrough it from request.
   */
  public fun physicalResourceId(physicalResourceId: PhysicalResourceId) {
    cdkBuilder.physicalResourceId(physicalResourceId)
  }

  /**
   * @param region The region to send service requests to.
   * **Note: Cross-region operations are generally considered an anti-pattern.**
   * **Consider first deploying a stack in that region.**
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param service The service to call. 
   */
  public fun service(service: String) {
    cdkBuilder.service(service)
  }

  public fun build(): AwsSdkCall {
    if(_outputPaths.isNotEmpty()) cdkBuilder.outputPaths(_outputPaths)
    return cdkBuilder.build()
  }
}
