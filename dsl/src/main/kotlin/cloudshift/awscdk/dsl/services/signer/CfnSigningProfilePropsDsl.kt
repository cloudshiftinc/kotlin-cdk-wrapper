@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.signer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.signer.CfnSigningProfile
import software.amazon.awscdk.services.signer.CfnSigningProfileProps

/**
 * Properties for defining a `CfnSigningProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.signer.*;
 * CfnSigningProfileProps cfnSigningProfileProps = CfnSigningProfileProps.builder()
 * .platformId("platformId")
 * // the properties below are optional
 * .signatureValidityPeriod(SignatureValidityPeriodProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html)
 */
@CdkDslMarker
public class CfnSigningProfilePropsDsl {
  private val cdkBuilder: CfnSigningProfileProps.Builder = CfnSigningProfileProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param platformId The ID of a platform that is available for use by a signing profile. 
   */
  public fun platformId(platformId: String) {
    cdkBuilder.platformId(platformId)
  }

  /**
   * @param signatureValidityPeriod The validity period override for any signature generated using
   * this signing profile.
   * If unspecified, the default is 135 months.
   */
  public fun signatureValidityPeriod(signatureValidityPeriod: IResolvable) {
    cdkBuilder.signatureValidityPeriod(signatureValidityPeriod)
  }

  /**
   * @param signatureValidityPeriod The validity period override for any signature generated using
   * this signing profile.
   * If unspecified, the default is 135 months.
   */
  public
      fun signatureValidityPeriod(signatureValidityPeriod: CfnSigningProfile.SignatureValidityPeriodProperty) {
    cdkBuilder.signatureValidityPeriod(signatureValidityPeriod)
  }

  /**
   * @param tags A list of tags associated with the signing profile.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of tags associated with the signing profile.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSigningProfileProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
