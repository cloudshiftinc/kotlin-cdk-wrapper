@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnProject

@CdkDslMarker
public class CfnProjectAppConfigResourceObjectPropertyDsl {
  private val cdkBuilder: CfnProject.AppConfigResourceObjectProperty.Builder =
      CfnProject.AppConfigResourceObjectProperty.builder()

  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  public fun environmentId(environmentId: String) {
    cdkBuilder.environmentId(environmentId)
  }

  public fun build(): CfnProject.AppConfigResourceObjectProperty = cdkBuilder.build()
}
