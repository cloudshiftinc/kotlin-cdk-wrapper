@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceSourceCodeVersionPropertyDsl {
  private val cdkBuilder: CfnService.SourceCodeVersionProperty.Builder =
      CfnService.SourceCodeVersionProperty.builder()

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnService.SourceCodeVersionProperty = cdkBuilder.build()
}
