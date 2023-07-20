@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.PermissionsBoundaryBindOptions

@CdkDslMarker
public class PermissionsBoundaryBindOptionsDsl {
  private val cdkBuilder: PermissionsBoundaryBindOptions.Builder =
      PermissionsBoundaryBindOptions.builder()

  public fun build(): PermissionsBoundaryBindOptions = cdkBuilder.build()
}
