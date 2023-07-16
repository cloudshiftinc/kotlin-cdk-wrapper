@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.apigateway.CfnVpcLink
import software.constructs.Construct

@CdkDslMarker
public class CfnVpcLinkDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVpcLink.Builder = CfnVpcLink.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _targetArns: MutableList<String> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun targetArns(vararg targetArns: String) {
    _targetArns.addAll(listOf(*targetArns))
  }

  public fun targetArns(targetArns: Collection<String>) {
    _targetArns.addAll(targetArns)
  }

  public fun build(): CfnVpcLink {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_targetArns.isNotEmpty()) cdkBuilder.targetArns(_targetArns)
    return cdkBuilder.build()
  }
}
