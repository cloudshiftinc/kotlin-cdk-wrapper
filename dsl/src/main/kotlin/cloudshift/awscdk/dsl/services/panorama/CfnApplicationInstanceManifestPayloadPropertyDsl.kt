@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.panorama.CfnApplicationInstance

/**
 * A application verion's manifest file.
 *
 * This is a JSON document that has a single key ( `PayloadData` ) where the value is an escaped
 * string representation of the application manifest ( `graph.json` ). This file is located in the
 * `graphs` folder in your application source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.panorama.*;
 * ManifestPayloadProperty manifestPayloadProperty = ManifestPayloadProperty.builder()
 * .payloadData("payloadData")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-applicationinstance-manifestpayload.html)
 */
@CdkDslMarker
public class CfnApplicationInstanceManifestPayloadPropertyDsl {
  private val cdkBuilder: CfnApplicationInstance.ManifestPayloadProperty.Builder =
      CfnApplicationInstance.ManifestPayloadProperty.builder()

  /**
   * @param payloadData The application manifest.
   */
  public fun payloadData(payloadData: String) {
    cdkBuilder.payloadData(payloadData)
  }

  public fun build(): CfnApplicationInstance.ManifestPayloadProperty = cdkBuilder.build()
}
