@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.managedblockchain.CfnAccessor
import software.constructs.Construct

@CdkDslMarker
public class CfnAccessorDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccessor.Builder = CfnAccessor.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accessorType(accessorType: String) {
    cdkBuilder.accessorType(accessorType)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAccessor {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
