@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.LoadBalancerContextQuery
import software.amazon.awscdk.cloudassembly.schema.LoadBalancerType
import software.amazon.awscdk.cloudassembly.schema.Tag

@CdkDslMarker
public class LoadBalancerContextQueryDsl {
  private val cdkBuilder: LoadBalancerContextQuery.Builder = LoadBalancerContextQuery.builder()

  private val _loadBalancerTags: MutableList<Tag> = mutableListOf()

  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  public fun loadBalancerArn(loadBalancerArn: String) {
    cdkBuilder.loadBalancerArn(loadBalancerArn)
  }

  public fun loadBalancerTags(loadBalancerTags: TagDsl.() -> Unit) {
    _loadBalancerTags.add(TagDsl().apply(loadBalancerTags).build())
  }

  public fun loadBalancerTags(loadBalancerTags: Collection<Tag>) {
    _loadBalancerTags.addAll(loadBalancerTags)
  }

  public fun loadBalancerType(loadBalancerType: LoadBalancerType) {
    cdkBuilder.loadBalancerType(loadBalancerType)
  }

  public fun lookupRoleArn(lookupRoleArn: String) {
    cdkBuilder.lookupRoleArn(lookupRoleArn)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): LoadBalancerContextQuery {
    if(_loadBalancerTags.isNotEmpty()) cdkBuilder.loadBalancerTags(_loadBalancerTags)
    return cdkBuilder.build()
  }
}
