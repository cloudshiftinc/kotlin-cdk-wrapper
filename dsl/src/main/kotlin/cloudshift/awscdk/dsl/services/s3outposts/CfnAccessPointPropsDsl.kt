@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnAccessPoint
import software.amazon.awscdk.services.s3outposts.CfnAccessPointProps

@CdkDslMarker
public class CfnAccessPointPropsDsl {
  private val cdkBuilder: CfnAccessPointProps.Builder = CfnAccessPointProps.builder()

  /**
   * @param bucket The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated
   * with this access point. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param name The name of this access point. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param policy The access point policy associated with this access point.
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * @param policy The access point policy associated with this access point.
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  /**
   * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point, if
   * one exists. 
   */
  public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  /**
   * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point, if
   * one exists. 
   */
  public fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun build(): CfnAccessPointProps = cdkBuilder.build()
}
