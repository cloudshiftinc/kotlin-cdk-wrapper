@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointVpcConfigurationPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.VpcConfigurationProperty.Builder =
      CfnAccessPoint.VpcConfigurationProperty.builder()

  /**
   * @param vpcId If this field is specified, the access point will only allow connections from the
   * specified VPC ID.
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnAccessPoint.VpcConfigurationProperty = cdkBuilder.build()
}
