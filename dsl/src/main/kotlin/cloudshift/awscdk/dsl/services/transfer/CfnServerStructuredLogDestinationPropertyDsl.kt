@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.transfer.CfnServer

/**
 * Specifies a log group to which your server logs are sent.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * StructuredLogDestinationProperty structuredLogDestinationProperty =
 * StructuredLogDestinationProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-structuredlogdestination.html)
 */
@CdkDslMarker
public class CfnServerStructuredLogDestinationPropertyDsl {
  private val cdkBuilder: CfnServer.StructuredLogDestinationProperty.Builder =
      CfnServer.StructuredLogDestinationProperty.builder()

  public fun build(): CfnServer.StructuredLogDestinationProperty = cdkBuilder.build()
}
