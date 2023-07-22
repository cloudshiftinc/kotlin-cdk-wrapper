@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociation
import software.constructs.Construct

/**
 * The `AWS::AppStream::StackFleetAssociation` resource associates the specified fleet with the
 * specified stack for Amazon AppStream 2.0.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnStackFleetAssociation cfnStackFleetAssociation = CfnStackFleetAssociation.Builder.create(this,
 * "MyCfnStackFleetAssociation")
 * .fleetName("fleetName")
 * .stackName("stackName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html)
 */
@CdkDslMarker
public class CfnStackFleetAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStackFleetAssociation.Builder =
      CfnStackFleetAssociation.Builder.create(scope, id)

  /**
   * The name of the fleet.
   *
   * To associate a fleet with a stack, you must specify a dependency on the fleet resource. For
   * more information, see [DependsOn
   * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-fleetname)
   * @param fleetName The name of the fleet. 
   */
  public fun fleetName(fleetName: String) {
    cdkBuilder.fleetName(fleetName)
  }

  /**
   * The name of the stack.
   *
   * To associate a fleet with a stack, you must specify a dependency on the stack resource. For
   * more information, see [DependsOn
   * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-stackname)
   * @param stackName The name of the stack. 
   */
  public fun stackName(stackName: String) {
    cdkBuilder.stackName(stackName)
  }

  public fun build(): CfnStackFleetAssociation = cdkBuilder.build()
}
