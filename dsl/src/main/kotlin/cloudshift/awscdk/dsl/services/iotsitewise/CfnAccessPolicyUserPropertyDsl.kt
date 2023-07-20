@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy

@CdkDslMarker
public class CfnAccessPolicyUserPropertyDsl {
  private val cdkBuilder: CfnAccessPolicy.UserProperty.Builder =
      CfnAccessPolicy.UserProperty.builder()

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun build(): CfnAccessPolicy.UserProperty = cdkBuilder.build()
}
