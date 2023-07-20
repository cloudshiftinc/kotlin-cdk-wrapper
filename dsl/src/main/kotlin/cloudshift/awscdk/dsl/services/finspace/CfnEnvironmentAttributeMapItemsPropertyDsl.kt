@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.finspace

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.finspace.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentAttributeMapItemsPropertyDsl {
  private val cdkBuilder: CfnEnvironment.AttributeMapItemsProperty.Builder =
      CfnEnvironment.AttributeMapItemsProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEnvironment.AttributeMapItemsProperty = cdkBuilder.build()
}
