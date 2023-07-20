@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iot.CfnRoleAliasProps

@CdkDslMarker
public class CfnRoleAliasPropsDsl {
  private val cdkBuilder: CfnRoleAliasProps.Builder = CfnRoleAliasProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun credentialDurationSeconds(credentialDurationSeconds: Number) {
    cdkBuilder.credentialDurationSeconds(credentialDurationSeconds)
  }

  public fun roleAlias(roleAlias: String) {
    cdkBuilder.roleAlias(roleAlias)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnRoleAliasProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
