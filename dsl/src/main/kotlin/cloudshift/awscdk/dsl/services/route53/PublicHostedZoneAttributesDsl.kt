@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.PublicHostedZoneAttributes

@CdkDslMarker
public class PublicHostedZoneAttributesDsl {
  private val cdkBuilder: PublicHostedZoneAttributes.Builder = PublicHostedZoneAttributes.builder()

  /**
   * @param hostedZoneId Identifier of the hosted zone. 
   */
  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  /**
   * @param zoneName Name of the hosted zone. 
   */
  public fun zoneName(zoneName: String) {
    cdkBuilder.zoneName(zoneName)
  }

  public fun build(): PublicHostedZoneAttributes = cdkBuilder.build()
}
