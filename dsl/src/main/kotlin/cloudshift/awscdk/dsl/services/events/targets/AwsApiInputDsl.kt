@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.AwsApiInput

/**
 * Rule target input for an AwsApi target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.targets.*;
 * Object parameters;
 * AwsApiInput awsApiInput = AwsApiInput.builder()
 * .action("action")
 * .service("service")
 * // the properties below are optional
 * .apiVersion("apiVersion")
 * .catchErrorPattern("catchErrorPattern")
 * .parameters(parameters)
 * .build();
 * ```
 */
@CdkDslMarker
public class AwsApiInputDsl {
  private val cdkBuilder: AwsApiInput.Builder = AwsApiInput.builder()

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
   * @param catchErrorPattern The regex pattern to use to catch API errors.
   * The `code` property of the
   * `Error` object will be tested against this pattern. If there is a match an
   * error will not be thrown.
   */
  public fun catchErrorPattern(catchErrorPattern: String) {
    cdkBuilder.catchErrorPattern(catchErrorPattern)
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
   * @param service The service to call. 
   */
  public fun service(service: String) {
    cdkBuilder.service(service)
  }

  public fun build(): AwsApiInput = cdkBuilder.build()
}
