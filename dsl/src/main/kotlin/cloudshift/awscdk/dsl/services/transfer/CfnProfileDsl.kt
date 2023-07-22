@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.transfer.CfnProfile
import software.constructs.Construct

@CdkDslMarker
public class CfnProfileDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnProfile.Builder = CfnProfile.Builder.create(scope, id)

  private val _certificateIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The `As2Id` is the *AS2-name* , as defined in the [RFC
   * 4130](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc4130) . For inbound
   * transfers, this is the `AS2-From` header for the AS2 messages sent from the partner. For outbound
   * connectors, this is the `AS2-To` header for the AS2 messages sent to the partner using the
   * `StartFileTransfer` API operation. This ID cannot include spaces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-as2id)
   * @param as2Id The `As2Id` is the *AS2-name* , as defined in the [RFC
   * 4130](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc4130) . For inbound
   * transfers, this is the `AS2-From` header for the AS2 messages sent from the partner. For outbound
   * connectors, this is the `AS2-To` header for the AS2 messages sent to the partner using the
   * `StartFileTransfer` API operation. This ID cannot include spaces. 
   */
  public fun as2Id(as2Id: String) {
    cdkBuilder.as2Id(as2Id)
  }

  /**
   * An array of identifiers for the imported certificates.
   *
   * You use this identifier for working with profiles and partner profiles.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-certificateids)
   * @param certificateIds An array of identifiers for the imported certificates. 
   */
  public fun certificateIds(vararg certificateIds: String) {
    _certificateIds.addAll(listOf(*certificateIds))
  }

  /**
   * An array of identifiers for the imported certificates.
   *
   * You use this identifier for working with profiles and partner profiles.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-certificateids)
   * @param certificateIds An array of identifiers for the imported certificates. 
   */
  public fun certificateIds(certificateIds: Collection<String>) {
    _certificateIds.addAll(certificateIds)
  }

  /**
   * Indicates whether to list only `LOCAL` type profiles or only `PARTNER` type profiles.
   *
   * If not supplied in the request, the command lists all types of profiles.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-profiletype)
   * @param profileType Indicates whether to list only `LOCAL` type profiles or only `PARTNER` type
   * profiles. 
   */
  public fun profileType(profileType: String) {
    cdkBuilder.profileType(profileType)
  }

  /**
   * Key-value pairs that can be used to group and search for profiles.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-tags)
   * @param tags Key-value pairs that can be used to group and search for profiles. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Key-value pairs that can be used to group and search for profiles.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-tags)
   * @param tags Key-value pairs that can be used to group and search for profiles. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnProfile {
    if(_certificateIds.isNotEmpty()) cdkBuilder.certificateIds(_certificateIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
