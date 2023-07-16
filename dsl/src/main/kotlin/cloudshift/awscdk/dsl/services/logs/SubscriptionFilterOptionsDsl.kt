@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.logs.IFilterPattern
import software.amazon.awscdk.services.logs.ILogSubscriptionDestination
import software.amazon.awscdk.services.logs.SubscriptionFilterOptions

@CdkDslMarker
public class SubscriptionFilterOptionsDsl {
  private val cdkBuilder: SubscriptionFilterOptions.Builder = SubscriptionFilterOptions.builder()

  public fun destination(destination: ILogSubscriptionDestination) {
    cdkBuilder.destination(destination)
  }

  public fun filterPattern(filterPattern: IFilterPattern) {
    cdkBuilder.filterPattern(filterPattern)
  }

  public fun build(): SubscriptionFilterOptions = cdkBuilder.build()
}
