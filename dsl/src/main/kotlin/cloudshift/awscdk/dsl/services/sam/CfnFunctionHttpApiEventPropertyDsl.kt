@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionHttpApiEventPropertyDsl {
  private val cdkBuilder: CfnFunction.HttpApiEventProperty.Builder =
      CfnFunction.HttpApiEventProperty.builder()

  /**
   * @param apiId the value to be set.
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * @param auth the value to be set.
   */
  public fun auth(auth: IResolvable) {
    cdkBuilder.auth(auth)
  }

  /**
   * @param auth the value to be set.
   */
  public fun auth(auth: CfnFunction.HttpApiFunctionAuthProperty) {
    cdkBuilder.auth(auth)
  }

  /**
   * @param method the value to be set.
   */
  public fun method(method: String) {
    cdkBuilder.method(method)
  }

  /**
   * @param path the value to be set.
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  /**
   * @param payloadFormatVersion the value to be set.
   */
  public fun payloadFormatVersion(payloadFormatVersion: String) {
    cdkBuilder.payloadFormatVersion(payloadFormatVersion)
  }

  /**
   * @param routeSettings the value to be set.
   */
  public fun routeSettings(routeSettings: IResolvable) {
    cdkBuilder.routeSettings(routeSettings)
  }

  /**
   * @param routeSettings the value to be set.
   */
  public fun routeSettings(routeSettings: CfnFunction.RouteSettingsProperty) {
    cdkBuilder.routeSettings(routeSettings)
  }

  /**
   * @param timeoutInMillis the value to be set.
   */
  public fun timeoutInMillis(timeoutInMillis: Number) {
    cdkBuilder.timeoutInMillis(timeoutInMillis)
  }

  public fun build(): CfnFunction.HttpApiEventProperty = cdkBuilder.build()
}
