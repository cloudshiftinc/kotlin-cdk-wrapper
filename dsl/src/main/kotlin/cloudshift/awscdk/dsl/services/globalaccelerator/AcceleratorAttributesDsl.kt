@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes

@CdkDslMarker
public class AcceleratorAttributesDsl {
  private val cdkBuilder: AcceleratorAttributes.Builder = AcceleratorAttributes.builder()

  /**
   * @param acceleratorArn The ARN of the accelerator. 
   */
  public fun acceleratorArn(acceleratorArn: String) {
    cdkBuilder.acceleratorArn(acceleratorArn)
  }

  /**
   * @param dnsName The DNS name of the accelerator. 
   */
  public fun dnsName(dnsName: String) {
    cdkBuilder.dnsName(dnsName)
  }

  public fun build(): AcceleratorAttributes = cdkBuilder.build()
}
