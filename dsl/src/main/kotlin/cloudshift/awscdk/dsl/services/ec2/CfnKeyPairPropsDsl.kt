@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnKeyPairProps

@CdkDslMarker
public class CfnKeyPairPropsDsl {
  private val cdkBuilder: CfnKeyPairProps.Builder = CfnKeyPairProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun keyFormat(keyFormat: String) {
    cdkBuilder.keyFormat(keyFormat)
  }

  public fun keyName(keyName: String) {
    cdkBuilder.keyName(keyName)
  }

  public fun keyType(keyType: String) {
    cdkBuilder.keyType(keyType)
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

  public fun build(): CfnKeyPairProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
