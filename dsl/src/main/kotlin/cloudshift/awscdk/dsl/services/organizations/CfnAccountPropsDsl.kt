@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.organizations

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.organizations.CfnAccountProps

@CdkDslMarker
public class CfnAccountPropsDsl {
  private val cdkBuilder: CfnAccountProps.Builder = CfnAccountProps.builder()

  private val _parentIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accountName(accountName: String) {
    cdkBuilder.accountName(accountName)
  }

  public fun email(email: String) {
    cdkBuilder.email(email)
  }

  public fun parentIds(vararg parentIds: String) {
    _parentIds.addAll(listOf(*parentIds))
  }

  public fun parentIds(parentIds: Collection<String>) {
    _parentIds.addAll(parentIds)
  }

  public fun roleName(roleName: String) {
    cdkBuilder.roleName(roleName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAccountProps {
    if(_parentIds.isNotEmpty()) cdkBuilder.parentIds(_parentIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
