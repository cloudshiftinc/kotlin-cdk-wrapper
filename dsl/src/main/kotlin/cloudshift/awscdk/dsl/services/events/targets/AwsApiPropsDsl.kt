@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.AwsApiProps
import software.amazon.awscdk.services.iam.PolicyStatement

@CdkDslMarker
public class AwsApiPropsDsl {
  private val cdkBuilder: AwsApiProps.Builder = AwsApiProps.builder()

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
   * @param policyStatement The IAM policy statement to allow the API call.
   * Use only if
   * resource restriction is needed.
   */
  public fun policyStatement(policyStatement: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(policyStatement)
    cdkBuilder.policyStatement(builder.build())
  }

  /**
   * @param policyStatement The IAM policy statement to allow the API call.
   * Use only if
   * resource restriction is needed.
   */
  public fun policyStatement(policyStatement: PolicyStatement) {
    cdkBuilder.policyStatement(policyStatement)
  }

  /**
   * @param service The service to call. 
   */
  public fun service(service: String) {
    cdkBuilder.service(service)
  }

  public fun build(): AwsApiProps = cdkBuilder.build()
}
