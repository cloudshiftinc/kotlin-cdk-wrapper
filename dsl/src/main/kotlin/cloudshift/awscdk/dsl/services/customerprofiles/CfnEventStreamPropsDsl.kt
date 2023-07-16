@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.customerprofiles.CfnEventStreamProps

@CdkDslMarker
public class CfnEventStreamPropsDsl {
  private val cdkBuilder: CfnEventStreamProps.Builder = CfnEventStreamProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun eventStreamName(eventStreamName: String) {
    cdkBuilder.eventStreamName(eventStreamName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): CfnEventStreamProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
