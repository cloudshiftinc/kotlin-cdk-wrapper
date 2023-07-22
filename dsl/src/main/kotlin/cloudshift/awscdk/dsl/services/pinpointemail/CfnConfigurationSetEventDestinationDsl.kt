@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
import software.constructs.Construct

@CdkDslMarker
public class CfnConfigurationSetEventDestinationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConfigurationSetEventDestination.Builder =
      CfnConfigurationSetEventDestination.Builder.create(scope, id)

  /**
   * The name of the configuration set that contains the event destination that you want to modify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-configurationsetname)
   * @param configurationSetName The name of the configuration set that contains the event
   * destination that you want to modify. 
   */
  public fun configurationSetName(configurationSetName: String) {
    cdkBuilder.configurationSetName(configurationSetName)
  }

  /**
   * An object that defines the event destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination)
   * @param eventDestination An object that defines the event destination. 
   */
  public fun eventDestination(eventDestination: IResolvable) {
    cdkBuilder.eventDestination(eventDestination)
  }

  /**
   * An object that defines the event destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination)
   * @param eventDestination An object that defines the event destination. 
   */
  public
      fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty) {
    cdkBuilder.eventDestination(eventDestination)
  }

  /**
   * The name of the event destination that you want to modify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestinationname)
   * @param eventDestinationName The name of the event destination that you want to modify. 
   */
  public fun eventDestinationName(eventDestinationName: String) {
    cdkBuilder.eventDestinationName(eventDestinationName)
  }

  public fun build(): CfnConfigurationSetEventDestination = cdkBuilder.build()
}
