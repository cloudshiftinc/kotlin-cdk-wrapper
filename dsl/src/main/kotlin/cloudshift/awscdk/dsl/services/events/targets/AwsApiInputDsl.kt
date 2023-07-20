@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.AwsApiInput

@CdkDslMarker
public class AwsApiInputDsl {
  private val cdkBuilder: AwsApiInput.Builder = AwsApiInput.builder()

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun apiVersion(apiVersion: String) {
    cdkBuilder.apiVersion(apiVersion)
  }

  public fun catchErrorPattern(catchErrorPattern: String) {
    cdkBuilder.catchErrorPattern(catchErrorPattern)
  }

  public fun parameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.parameters(builder.map)
  }

  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  public fun service(service: String) {
    cdkBuilder.service(service)
  }

  public fun build(): AwsApiInput = cdkBuilder.build()
}
