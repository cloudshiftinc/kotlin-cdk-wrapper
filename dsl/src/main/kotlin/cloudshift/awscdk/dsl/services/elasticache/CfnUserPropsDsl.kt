@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnUserProps

@CdkDslMarker
public class CfnUserPropsDsl {
  private val cdkBuilder: CfnUserProps.Builder = CfnUserProps.builder()

  private val _passwords: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accessString(accessString: String) {
    cdkBuilder.accessString(accessString)
  }

  public fun authenticationMode(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.authenticationMode(builder.map)
  }

  public fun authenticationMode(authenticationMode: Any) {
    cdkBuilder.authenticationMode(authenticationMode)
  }

  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
  }

  public fun noPasswordRequired(noPasswordRequired: Boolean) {
    cdkBuilder.noPasswordRequired(noPasswordRequired)
  }

  public fun noPasswordRequired(noPasswordRequired: IResolvable) {
    cdkBuilder.noPasswordRequired(noPasswordRequired)
  }

  public fun passwords(vararg passwords: String) {
    _passwords.addAll(listOf(*passwords))
  }

  public fun passwords(passwords: Collection<String>) {
    _passwords.addAll(passwords)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun userId(userId: String) {
    cdkBuilder.userId(userId)
  }

  public fun userName(userName: String) {
    cdkBuilder.userName(userName)
  }

  public fun build(): CfnUserProps {
    if(_passwords.isNotEmpty()) cdkBuilder.passwords(_passwords)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
