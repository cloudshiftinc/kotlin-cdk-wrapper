@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.auditmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.auditmanager.CfnAssessment

@CdkDslMarker
public class CfnAssessmentAssessmentReportsDestinationPropertyDsl {
  private val cdkBuilder: CfnAssessment.AssessmentReportsDestinationProperty.Builder =
      CfnAssessment.AssessmentReportsDestinationProperty.builder()

  /**
   * @param destination The destination bucket where Audit Manager stores assessment reports.
   */
  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destinationType The destination type, such as Amazon S3.
   */
  public fun destinationType(destinationType: String) {
    cdkBuilder.destinationType(destinationType)
  }

  public fun build(): CfnAssessment.AssessmentReportsDestinationProperty = cdkBuilder.build()
}
