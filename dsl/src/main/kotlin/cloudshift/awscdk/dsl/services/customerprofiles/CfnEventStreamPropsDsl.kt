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

  /**
   * @param domainName The unique name of the domain. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param eventStreamName The name of the event stream. 
   */
  public fun eventStreamName(eventStreamName: String) {
    cdkBuilder.eventStreamName(eventStreamName)
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param uri The StreamARN of the destination to deliver profile events to. 
   * For example, arn:aws:kinesis:region:account-id:stream/stream-name.
   */
  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): CfnEventStreamProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
