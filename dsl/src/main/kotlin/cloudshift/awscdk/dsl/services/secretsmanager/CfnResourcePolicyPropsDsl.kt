@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps

@CdkDslMarker
public class CfnResourcePolicyPropsDsl {
  private val cdkBuilder: CfnResourcePolicyProps.Builder = CfnResourcePolicyProps.builder()

  public fun blockPublicPolicy(blockPublicPolicy: Boolean) {
    cdkBuilder.blockPublicPolicy(blockPublicPolicy)
  }

  public fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
    cdkBuilder.blockPublicPolicy(blockPublicPolicy)
  }

  public fun resourcePolicy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.resourcePolicy(builder.map)
  }

  public fun resourcePolicy(resourcePolicy: Any) {
    cdkBuilder.resourcePolicy(resourcePolicy)
  }

  public fun secretId(secretId: String) {
    cdkBuilder.secretId(secretId)
  }

  public fun build(): CfnResourcePolicyProps = cdkBuilder.build()
}
