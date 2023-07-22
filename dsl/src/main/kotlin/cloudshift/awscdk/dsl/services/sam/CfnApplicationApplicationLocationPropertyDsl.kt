@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnApplication

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * ApplicationLocationProperty applicationLocationProperty = ApplicationLocationProperty.builder()
 * .applicationId("applicationId")
 * .semanticVersion("semanticVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-application-applicationlocation.html)
 */
@CdkDslMarker
public class CfnApplicationApplicationLocationPropertyDsl {
  private val cdkBuilder: CfnApplication.ApplicationLocationProperty.Builder =
      CfnApplication.ApplicationLocationProperty.builder()

  /**
   * @param applicationId the value to be set. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * @param semanticVersion the value to be set. 
   */
  public fun semanticVersion(semanticVersion: String) {
    cdkBuilder.semanticVersion(semanticVersion)
  }

  public fun build(): CfnApplication.ApplicationLocationProperty = cdkBuilder.build()
}
