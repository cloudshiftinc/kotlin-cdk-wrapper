@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnProject

@CdkDslMarker
public class CfnProjectAppConfigResourceObjectPropertyDsl {
  private val cdkBuilder: CfnProject.AppConfigResourceObjectProperty.Builder =
      CfnProject.AppConfigResourceObjectProperty.builder()

  /**
   * @param applicationId The ID of the AWS AppConfig application to use for client-side evaluation.
   * 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * @param environmentId The ID of the AWS AppConfig environment to use for client-side evaluation.
   * 
   */
  public fun environmentId(environmentId: String) {
    cdkBuilder.environmentId(environmentId)
  }

  public fun build(): CfnProject.AppConfigResourceObjectProperty = cdkBuilder.build()
}
