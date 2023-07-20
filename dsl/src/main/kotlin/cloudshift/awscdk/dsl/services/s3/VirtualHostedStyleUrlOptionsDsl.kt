@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions

@CdkDslMarker
public class VirtualHostedStyleUrlOptionsDsl {
  private val cdkBuilder: VirtualHostedStyleUrlOptions.Builder =
      VirtualHostedStyleUrlOptions.builder()

  public fun regional(regional: Boolean) {
    cdkBuilder.regional(regional)
  }

  public fun build(): VirtualHostedStyleUrlOptions = cdkBuilder.build()
}
