@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion

@CdkDslMarker
public class CfnSubscriptionDefinitionVersionSubscriptionPropertyDsl {
  private val cdkBuilder: CfnSubscriptionDefinitionVersion.SubscriptionProperty.Builder =
      CfnSubscriptionDefinitionVersion.SubscriptionProperty.builder()

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun subject(subject: String) {
    cdkBuilder.subject(subject)
  }

  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnSubscriptionDefinitionVersion.SubscriptionProperty = cdkBuilder.build()
}
