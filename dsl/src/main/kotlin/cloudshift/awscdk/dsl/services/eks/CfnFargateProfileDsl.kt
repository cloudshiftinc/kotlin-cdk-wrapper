@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnFargateProfile
import software.constructs.Construct

@CdkDslMarker
public class CfnFargateProfileDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFargateProfile.Builder = CfnFargateProfile.Builder.create(scope, id)

  private val _selectors: MutableList<Any> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  public fun fargateProfileName(fargateProfileName: String) {
    cdkBuilder.fargateProfileName(fargateProfileName)
  }

  public fun podExecutionRoleArn(podExecutionRoleArn: String) {
    cdkBuilder.podExecutionRoleArn(podExecutionRoleArn)
  }

  public fun selectors(vararg selectors: Any) {
    _selectors.addAll(listOf(*selectors))
  }

  public fun selectors(selectors: Collection<Any>) {
    _selectors.addAll(selectors)
  }

  public fun selectors(selectors: IResolvable) {
    cdkBuilder.selectors(selectors)
  }

  public fun subnets(vararg subnets: String) {
    _subnets.addAll(listOf(*subnets))
  }

  public fun subnets(subnets: Collection<String>) {
    _subnets.addAll(subnets)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnFargateProfile {
    if(_selectors.isNotEmpty()) cdkBuilder.selectors(_selectors)
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
