@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceVpcConnectionPropertiesPropertyDsl {
  private val cdkBuilder: CfnDataSource.VpcConnectionPropertiesProperty.Builder =
      CfnDataSource.VpcConnectionPropertiesProperty.builder()

  /**
   * @param vpcConnectionArn The Amazon Resource Name (ARN) for the VPC connection. 
   */
  public fun vpcConnectionArn(vpcConnectionArn: String) {
    cdkBuilder.vpcConnectionArn(vpcConnectionArn)
  }

  public fun build(): CfnDataSource.VpcConnectionPropertiesProperty = cdkBuilder.build()
}
