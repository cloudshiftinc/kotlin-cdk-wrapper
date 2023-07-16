@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace
import software.constructs.Construct

@CdkDslMarker
public class CfnPublicDnsNamespaceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPublicDnsNamespace.Builder =
      CfnPublicDnsNamespace.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun properties(properties: IResolvable) {
    cdkBuilder.properties(properties)
  }

  public fun properties(properties: CfnPublicDnsNamespace.PropertiesProperty) {
    cdkBuilder.properties(properties)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPublicDnsNamespace {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
