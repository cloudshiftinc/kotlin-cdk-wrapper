@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.NotificationKeyFilter

@CdkDslMarker
public class NotificationKeyFilterDsl {
  private val cdkBuilder: NotificationKeyFilter.Builder = NotificationKeyFilter.builder()

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun suffix(suffix: String) {
    cdkBuilder.suffix(suffix)
  }

  public fun build(): NotificationKeyFilter = cdkBuilder.build()
}
