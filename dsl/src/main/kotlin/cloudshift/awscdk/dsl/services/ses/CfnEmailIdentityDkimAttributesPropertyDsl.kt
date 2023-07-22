@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnEmailIdentity

/**
 * Used to enable or disable DKIM authentication for an email identity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * DkimAttributesProperty dkimAttributesProperty = DkimAttributesProperty.builder()
 * .signingEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimattributes.html)
 */
@CdkDslMarker
public class CfnEmailIdentityDkimAttributesPropertyDsl {
  private val cdkBuilder: CfnEmailIdentity.DkimAttributesProperty.Builder =
      CfnEmailIdentity.DkimAttributesProperty.builder()

  /**
   * @param signingEnabled Sets the DKIM signing configuration for the identity.
   * When you set this value `true` , then the messages that are sent from the identity are signed
   * using DKIM. If you set this value to `false` , your messages are sent without DKIM signing.
   */
  public fun signingEnabled(signingEnabled: Boolean) {
    cdkBuilder.signingEnabled(signingEnabled)
  }

  /**
   * @param signingEnabled Sets the DKIM signing configuration for the identity.
   * When you set this value `true` , then the messages that are sent from the identity are signed
   * using DKIM. If you set this value to `false` , your messages are sent without DKIM signing.
   */
  public fun signingEnabled(signingEnabled: IResolvable) {
    cdkBuilder.signingEnabled(signingEnabled)
  }

  public fun build(): CfnEmailIdentity.DkimAttributesProperty = cdkBuilder.build()
}
