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

  /**
   * @param account Query account. 
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  /**
   * @param loadBalancerArn Find by load balancer's ARN.
   */
  public fun loadBalancerArn(loadBalancerArn: String) {
    cdkBuilder.loadBalancerArn(loadBalancerArn)
  }

  /**
   * @param loadBalancerTags Match load balancer tags.
   */
  public fun loadBalancerTags(loadBalancerTags: TagDsl.() -> Unit) {
    _loadBalancerTags.add(TagDsl().apply(loadBalancerTags).build())
  }

  /**
   * @param loadBalancerTags Match load balancer tags.
   */
  public fun loadBalancerTags(loadBalancerTags: Collection<Tag>) {
    _loadBalancerTags.addAll(loadBalancerTags)
  }

  /**
   * @param loadBalancerType Filter load balancers by their type. 
   */
  public fun loadBalancerType(loadBalancerType: LoadBalancerType) {
    cdkBuilder.loadBalancerType(loadBalancerType)
  }

  /**
   * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
   */
  public fun lookupRoleArn(lookupRoleArn: String) {
    cdkBuilder.lookupRoleArn(lookupRoleArn)
  }

  /**
   * @param region Query region. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): LoadBalancerContextQuery {
    if(_loadBalancerTags.isNotEmpty()) cdkBuilder.loadBalancerTags(_loadBalancerTags)
    return cdkBuilder.build()
  }
}
