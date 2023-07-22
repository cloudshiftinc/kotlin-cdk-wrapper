@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * The operation to be performed on the provided source fields.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * ConnectorOperatorProperty connectorOperatorProperty = ConnectorOperatorProperty.builder()
 * .marketo("marketo")
 * .s3("s3")
 * .salesforce("salesforce")
 * .serviceNow("serviceNow")
 * .zendesk("zendesk")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-connectoroperator.html)
 */
@CdkDslMarker
public class CfnIntegrationConnectorOperatorPropertyDsl {
  private val cdkBuilder: CfnIntegration.ConnectorOperatorProperty.Builder =
      CfnIntegration.ConnectorOperatorProperty.builder()

  /**
   * @param marketo The operation to be performed on the provided Marketo source fields.
   */
  public fun marketo(marketo: String) {
    cdkBuilder.marketo(marketo)
  }

  /**
   * @param s3 The operation to be performed on the provided Amazon S3 source fields.
   */
  public fun s3(s3: String) {
    cdkBuilder.s3(s3)
  }

  /**
   * @param salesforce The operation to be performed on the provided Salesforce source fields.
   */
  public fun salesforce(salesforce: String) {
    cdkBuilder.salesforce(salesforce)
  }

  /**
   * @param serviceNow The operation to be performed on the provided ServiceNow source fields.
   */
  public fun serviceNow(serviceNow: String) {
    cdkBuilder.serviceNow(serviceNow)
  }

  /**
   * @param zendesk The operation to be performed on the provided Zendesk source fields.
   */
  public fun zendesk(zendesk: String) {
    cdkBuilder.zendesk(zendesk)
  }

  public fun build(): CfnIntegration.ConnectorOperatorProperty = cdkBuilder.build()
}
