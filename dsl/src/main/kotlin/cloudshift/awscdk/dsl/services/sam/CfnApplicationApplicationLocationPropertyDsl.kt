@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnApplication

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
