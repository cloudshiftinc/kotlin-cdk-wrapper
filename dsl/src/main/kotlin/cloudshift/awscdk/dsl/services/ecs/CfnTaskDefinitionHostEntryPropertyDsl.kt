@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * The `HostEntry` property specifies a hostname and an IP address that are added to the
 * `/etc/hosts` file of a container through the `extraHosts` parameter of its `ContainerDefinition`
 * resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * HostEntryProperty hostEntryProperty = HostEntryProperty.builder()
 * .hostname("hostname")
 * .ipAddress("ipAddress")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-hostentry.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionHostEntryPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.HostEntryProperty.Builder =
      CfnTaskDefinition.HostEntryProperty.builder()

  /**
   * @param hostname The hostname to use in the `/etc/hosts` entry.
   */
  public fun hostname(hostname: String) {
    cdkBuilder.hostname(hostname)
  }

  /**
   * @param ipAddress The IP address to use in the `/etc/hosts` entry.
   */
  public fun ipAddress(ipAddress: String) {
    cdkBuilder.ipAddress(ipAddress)
  }

  public fun build(): CfnTaskDefinition.HostEntryProperty = cdkBuilder.build()
}
