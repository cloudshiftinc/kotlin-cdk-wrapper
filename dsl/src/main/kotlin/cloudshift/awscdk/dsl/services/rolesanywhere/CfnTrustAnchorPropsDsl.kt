@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rolesanywhere

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps

@CdkDslMarker
public class CfnTrustAnchorPropsDsl {
  private val cdkBuilder: CfnTrustAnchorProps.Builder = CfnTrustAnchorProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param enabled Indicates whether the trust anchor is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Indicates whether the trust anchor is enabled.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param name The name of the trust anchor. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param source The trust anchor type and its related certificate data. 
   */
  public fun source(source: IResolvable) {
    cdkBuilder.source(source)
  }

  /**
   * @param source The trust anchor type and its related certificate data. 
   */
  public fun source(source: CfnTrustAnchor.SourceProperty) {
    cdkBuilder.source(source)
  }

  /**
   * @param tags The tags to attach to the trust anchor.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to attach to the trust anchor.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnTrustAnchorProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
