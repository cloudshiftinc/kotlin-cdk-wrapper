@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy

@CdkDslMarker
public class CfnAccessPolicyProjectPropertyDsl {
  private val cdkBuilder: CfnAccessPolicy.ProjectProperty.Builder =
      CfnAccessPolicy.ProjectProperty.builder()

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun build(): CfnAccessPolicy.ProjectProperty = cdkBuilder.build()
}
