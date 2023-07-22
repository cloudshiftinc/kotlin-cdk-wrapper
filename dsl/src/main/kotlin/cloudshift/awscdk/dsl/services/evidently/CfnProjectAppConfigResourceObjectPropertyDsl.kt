@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnProject

/**
 * This is a structure that defines the configuration of how your application integrates with AWS
 * AppConfig to run client-side evaluation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * AppConfigResourceObjectProperty appConfigResourceObjectProperty =
 * AppConfigResourceObjectProperty.builder()
 * .applicationId("applicationId")
 * .environmentId("environmentId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-appconfigresourceobject.html)
 */
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
