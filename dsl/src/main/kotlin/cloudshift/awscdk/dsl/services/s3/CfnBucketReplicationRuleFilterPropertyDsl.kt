@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketReplicationRuleFilterPropertyDsl {
  private val cdkBuilder: CfnBucket.ReplicationRuleFilterProperty.Builder =
      CfnBucket.ReplicationRuleFilterProperty.builder()

  public fun and(and: IResolvable) {
    cdkBuilder.and(and)
  }

  public fun and(and: CfnBucket.ReplicationRuleAndOperatorProperty) {
    cdkBuilder.and(and)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun tagFilter(tagFilter: IResolvable) {
    cdkBuilder.tagFilter(tagFilter)
  }

  public fun tagFilter(tagFilter: CfnBucket.TagFilterProperty) {
    cdkBuilder.tagFilter(tagFilter)
  }

  public fun build(): CfnBucket.ReplicationRuleFilterProperty = cdkBuilder.build()
}
