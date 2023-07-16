@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.frauddetector.CfnList
import software.constructs.Construct

@CdkDslMarker
public class CfnListDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnList.Builder = CfnList.Builder.create(scope, id)

  private val _elements: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun elements(vararg elements: String) {
    _elements.addAll(listOf(*elements))
  }

  public fun elements(elements: Collection<String>) {
    _elements.addAll(elements)
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

  public fun variableType(variableType: String) {
    cdkBuilder.variableType(variableType)
  }

  public fun build(): CfnList {
    if(_elements.isNotEmpty()) cdkBuilder.elements(_elements)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
