@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

@CdkDslMarker
public class CfnComponentVersionComponentPlatformPropertyDsl {
  private val cdkBuilder: CfnComponentVersion.ComponentPlatformProperty.Builder =
      CfnComponentVersion.ComponentPlatformProperty.builder()

  /**
   * @param attributes A dictionary of attributes for the platform.
   * The AWS IoT Greengrass Core software defines the `os` and `platform` by default. You can
   * specify additional platform attributes for a core device when you deploy the AWS IoT Greengrass
   * nucleus component. For more information, see the [AWS IoT Greengrass nucleus
   * component](https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html)
   * in the *AWS IoT Greengrass V2 Developer Guide* .
   */
  public fun attributes(attributes: Map<String, String>) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * @param attributes A dictionary of attributes for the platform.
   * The AWS IoT Greengrass Core software defines the `os` and `platform` by default. You can
   * specify additional platform attributes for a core device when you deploy the AWS IoT Greengrass
   * nucleus component. For more information, see the [AWS IoT Greengrass nucleus
   * component](https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html)
   * in the *AWS IoT Greengrass V2 Developer Guide* .
   */
  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * @param name The friendly name of the platform. This name helps you identify the platform.
   * If you omit this parameter, AWS IoT Greengrass creates a friendly name from the `os` and
   * `architecture` of the platform.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnComponentVersion.ComponentPlatformProperty = cdkBuilder.build()
}
