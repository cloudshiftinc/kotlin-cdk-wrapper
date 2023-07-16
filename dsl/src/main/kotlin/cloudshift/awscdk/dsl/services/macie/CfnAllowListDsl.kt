@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.macie.CfnAllowList
import software.constructs.Construct

@CdkDslMarker
public class CfnAllowListDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAllowList.Builder = CfnAllowList.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun criteria(criteria: IResolvable) {
    cdkBuilder.criteria(criteria)
  }

  public fun criteria(criteria: CfnAllowList.CriteriaProperty) {
    cdkBuilder.criteria(criteria)
  }

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

  public fun build(): CfnAllowList {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
