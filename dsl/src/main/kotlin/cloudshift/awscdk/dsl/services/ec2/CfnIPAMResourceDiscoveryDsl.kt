@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery
import software.constructs.Construct

@CdkDslMarker
public class CfnIPAMResourceDiscoveryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnIPAMResourceDiscovery.Builder =
      CfnIPAMResourceDiscovery.Builder.create(scope, id)

  private val _operatingRegions: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun operatingRegions(vararg operatingRegions: Any) {
    _operatingRegions.addAll(listOf(*operatingRegions))
  }

  public fun operatingRegions(operatingRegions: Collection<Any>) {
    _operatingRegions.addAll(operatingRegions)
  }

  public fun operatingRegions(operatingRegions: IResolvable) {
    cdkBuilder.operatingRegions(operatingRegions)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnIPAMResourceDiscovery {
    if(_operatingRegions.isNotEmpty()) cdkBuilder.operatingRegions(_operatingRegions)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
