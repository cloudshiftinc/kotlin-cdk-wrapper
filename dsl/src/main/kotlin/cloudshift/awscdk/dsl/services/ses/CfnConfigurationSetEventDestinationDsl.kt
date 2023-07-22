@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
import software.constructs.Construct

@CdkDslMarker
public class CfnConfigurationSetEventDestinationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConfigurationSetEventDestination.Builder =
      CfnConfigurationSetEventDestination.Builder.create(scope, id)

  /**
   * The name of the configuration set that contains the event destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-configurationsetname)
   * @param configurationSetName The name of the configuration set that contains the event
   * destination. 
   */
  public fun configurationSetName(configurationSetName: String) {
    cdkBuilder.configurationSetName(configurationSetName)
  }

  /**
   * The event destination object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
   * @param eventDestination The event destination object. 
   */
  public fun eventDestination(eventDestination: IResolvable) {
    cdkBuilder.eventDestination(eventDestination)
  }

  /**
   * The event destination object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
   * @param eventDestination The event destination object. 
   */
  public
      fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty) {
    cdkBuilder.eventDestination(eventDestination)
  }

  public fun build(): CfnConfigurationSetEventDestination = cdkBuilder.build()
}
