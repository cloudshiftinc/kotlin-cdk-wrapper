@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ivs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps

@CdkDslMarker
public class CfnPlaybackKeyPairPropsDsl {
  private val cdkBuilder: CfnPlaybackKeyPairProps.Builder = CfnPlaybackKeyPairProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun publicKeyMaterial(publicKeyMaterial: String) {
    cdkBuilder.publicKeyMaterial(publicKeyMaterial)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPlaybackKeyPairProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
