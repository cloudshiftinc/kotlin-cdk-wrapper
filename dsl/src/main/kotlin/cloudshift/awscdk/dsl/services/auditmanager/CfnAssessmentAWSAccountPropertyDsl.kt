@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.auditmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.auditmanager.CfnAssessment

@CdkDslMarker
public class CfnAssessmentAWSAccountPropertyDsl {
  private val cdkBuilder: CfnAssessment.AWSAccountProperty.Builder =
      CfnAssessment.AWSAccountProperty.builder()

  /**
   * @param emailAddress The email address that's associated with the AWS account .
   */
  public fun emailAddress(emailAddress: String) {
    cdkBuilder.emailAddress(emailAddress)
  }

  /**
   * @param id The identifier for the AWS account .
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param name The name of the AWS account .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnAssessment.AWSAccountProperty = cdkBuilder.build()
}
