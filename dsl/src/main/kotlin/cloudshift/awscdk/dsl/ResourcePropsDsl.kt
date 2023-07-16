@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.ResourceProps

@CdkDslMarker
public class ResourcePropsDsl {
  private val cdkBuilder: ResourceProps.Builder = ResourceProps.builder()

  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  public fun environmentFromArn(environmentFromArn: String) {
    cdkBuilder.environmentFromArn(environmentFromArn)
  }

  public fun physicalName(physicalName: String) {
    cdkBuilder.physicalName(physicalName)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): ResourceProps = cdkBuilder.build()
}
