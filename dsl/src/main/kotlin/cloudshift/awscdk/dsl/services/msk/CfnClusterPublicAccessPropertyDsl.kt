@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Broker access controls.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * PublicAccessProperty publicAccessProperty = PublicAccessProperty.builder()
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-publicaccess.html)
 */
@CdkDslMarker
public class CfnClusterPublicAccessPropertyDsl {
  private val cdkBuilder: CfnCluster.PublicAccessProperty.Builder =
      CfnCluster.PublicAccessProperty.builder()

  /**
   * @param type DISABLED means that public access is turned off.
   * SERVICE_PROVIDED_EIPS means that public access is turned on.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnCluster.PublicAccessProperty = cdkBuilder.build()
}
