@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps

@CdkDslMarker
public class CfnAccessPointPolicyPropsDsl {
  private val cdkBuilder: CfnAccessPointPolicyProps.Builder = CfnAccessPointPolicyProps.builder()

  public fun objectLambdaAccessPoint(objectLambdaAccessPoint: String) {
    cdkBuilder.objectLambdaAccessPoint(objectLambdaAccessPoint)
  }

  public fun policyDocument(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.policyDocument(builder.map)
  }

  public fun policyDocument(policyDocument: Any) {
    cdkBuilder.policyDocument(policyDocument)
  }

  public fun build(): CfnAccessPointPolicyProps = cdkBuilder.build()
}
