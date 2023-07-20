@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.ArnComponents
import software.amazon.awscdk.ArnFormat

@CdkDslMarker
public class ArnComponentsDsl {
  private val cdkBuilder: ArnComponents.Builder = ArnComponents.builder()

  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  public fun arnFormat(arnFormat: ArnFormat) {
    cdkBuilder.arnFormat(arnFormat)
  }

  public fun partition(partition: String) {
    cdkBuilder.partition(partition)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun resource(resource: String) {
    cdkBuilder.resource(resource)
  }

  public fun resourceName(resourceName: String) {
    cdkBuilder.resourceName(resourceName)
  }

  public fun service(service: String) {
    cdkBuilder.service(service)
  }

  public fun build(): ArnComponents = cdkBuilder.build()
}
