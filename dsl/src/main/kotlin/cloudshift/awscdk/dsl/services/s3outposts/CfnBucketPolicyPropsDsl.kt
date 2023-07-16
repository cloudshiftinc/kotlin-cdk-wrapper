@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps

@CdkDslMarker
public class CfnBucketPolicyPropsDsl {
  private val cdkBuilder: CfnBucketPolicyProps.Builder = CfnBucketPolicyProps.builder()

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun policyDocument(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.policyDocument(builder.map)
  }

  public fun policyDocument(policyDocument: Any) {
    cdkBuilder.policyDocument(policyDocument)
  }

  public fun build(): CfnBucketPolicyProps = cdkBuilder.build()
}
