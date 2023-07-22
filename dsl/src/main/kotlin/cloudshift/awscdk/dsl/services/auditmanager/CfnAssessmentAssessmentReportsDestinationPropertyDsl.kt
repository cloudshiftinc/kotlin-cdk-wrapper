@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.auditmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.auditmanager.CfnAssessment

/**
 * The `AssessmentReportsDestination` property type specifies the location in which AWS Audit
 * Manager saves assessment reports for the given assessment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.auditmanager.*;
 * AssessmentReportsDestinationProperty assessmentReportsDestinationProperty =
 * AssessmentReportsDestinationProperty.builder()
 * .destination("destination")
 * .destinationType("destinationType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-assessmentreportsdestination.html)
 */
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
