@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps

@CdkDslMarker
public class CfnStackFleetAssociationPropsDsl {
  private val cdkBuilder: CfnStackFleetAssociationProps.Builder =
      CfnStackFleetAssociationProps.builder()

  /**
   * @param fleetName The name of the fleet. 
   * To associate a fleet with a stack, you must specify a dependency on the fleet resource. For
   * more information, see [DependsOn
   * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * .
   */
  public fun fleetName(fleetName: String) {
    cdkBuilder.fleetName(fleetName)
  }

  /**
   * @param stackName The name of the stack. 
   * To associate a fleet with a stack, you must specify a dependency on the stack resource. For
   * more information, see [DependsOn
   * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * .
   */
  public fun stackName(stackName: String) {
    cdkBuilder.stackName(stackName)
  }

  public fun build(): CfnStackFleetAssociationProps = cdkBuilder.build()
}
