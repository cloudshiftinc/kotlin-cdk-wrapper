@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnEventBus

@CdkDslMarker
public class CfnEventBusTagEntryPropertyDsl {
  private val cdkBuilder: CfnEventBus.TagEntryProperty.Builder =
      CfnEventBus.TagEntryProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEventBus.TagEntryProperty = cdkBuilder.build()
}
