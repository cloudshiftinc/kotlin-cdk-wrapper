@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.transfer.CfnConnector
import software.constructs.Construct

@CdkDslMarker
public class CfnConnectorDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConnector.Builder = CfnConnector.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accessRole(accessRole: String) {
    cdkBuilder.accessRole(accessRole)
  }

  public fun as2Config(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.as2Config(builder.map)
  }

  public fun as2Config(as2Config: Any) {
    cdkBuilder.as2Config(as2Config)
  }

  public fun loggingRole(loggingRole: String) {
    cdkBuilder.loggingRole(loggingRole)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnConnector {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
