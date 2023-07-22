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
import software.constructs.Construct

@CdkDslMarker
public class CfnSigningProfileDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSigningProfile.Builder = CfnSigningProfile.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The ID of a platform that is available for use by a signing profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-platformid)
   * @param platformId The ID of a platform that is available for use by a signing profile. 
   */
  public fun platformId(platformId: String) {
    cdkBuilder.platformId(platformId)
  }

  /**
   * The validity period override for any signature generated using this signing profile.
   *
   * If unspecified, the default is 135 months.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-signaturevalidityperiod)
   * @param signatureValidityPeriod The validity period override for any signature generated using
   * this signing profile. 
   */
  public fun signatureValidityPeriod(signatureValidityPeriod: IResolvable) {
    cdkBuilder.signatureValidityPeriod(signatureValidityPeriod)
  }

  /**
   * The validity period override for any signature generated using this signing profile.
   *
   * If unspecified, the default is 135 months.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-signaturevalidityperiod)
   * @param signatureValidityPeriod The validity period override for any signature generated using
   * this signing profile. 
   */
  public
      fun signatureValidityPeriod(signatureValidityPeriod: CfnSigningProfile.SignatureValidityPeriodProperty) {
    cdkBuilder.signatureValidityPeriod(signatureValidityPeriod)
  }

  /**
   * A list of tags associated with the signing profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-tags)
   * @param tags A list of tags associated with the signing profile. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of tags associated with the signing profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-tags)
   * @param tags A list of tags associated with the signing profile. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSigningProfile {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
