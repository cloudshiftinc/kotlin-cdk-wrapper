@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.PrefixListOptions

@CdkDslMarker
public class PrefixListOptionsDsl {
  private val cdkBuilder: PrefixListOptions.Builder = PrefixListOptions.builder()

  public fun maxEntries(maxEntries: Number) {
    cdkBuilder.maxEntries(maxEntries)
  }

  public fun build(): PrefixListOptions = cdkBuilder.build()
}
