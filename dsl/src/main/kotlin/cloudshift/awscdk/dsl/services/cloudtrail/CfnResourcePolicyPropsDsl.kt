@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnResourcePolicyProps

@CdkDslMarker
public class CfnResourcePolicyPropsDsl {
  private val cdkBuilder: CfnResourcePolicyProps.Builder = CfnResourcePolicyProps.builder()

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun resourcePolicy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.resourcePolicy(builder.map)
  }

  public fun resourcePolicy(resourcePolicy: Any) {
    cdkBuilder.resourcePolicy(resourcePolicy)
  }

  public fun build(): CfnResourcePolicyProps = cdkBuilder.build()
}
