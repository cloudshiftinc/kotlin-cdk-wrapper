@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.CustomResourceProps
import software.amazon.awscdk.RemovalPolicy

@CdkDslMarker
public class CustomResourcePropsDsl {
  private val cdkBuilder: CustomResourceProps.Builder = CustomResourceProps.builder()

  public fun pascalCaseProperties(pascalCaseProperties: Boolean) {
    cdkBuilder.pascalCaseProperties(pascalCaseProperties)
  }

  public fun properties(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.properties(builder.map)
  }

  public fun properties(properties: Map<String, *>) {
    cdkBuilder.properties(properties)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  public fun serviceToken(serviceToken: String) {
    cdkBuilder.serviceToken(serviceToken)
  }

  public fun build(): CustomResourceProps = cdkBuilder.build()
}
