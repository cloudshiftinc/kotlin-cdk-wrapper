@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps

/**
 * Properties for defining a `CfnPartnerAccount`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnPartnerAccountProps cfnPartnerAccountProps = CfnPartnerAccountProps.builder()
 * .accountLinked(false)
 * .partnerAccountId("partnerAccountId")
 * .partnerType("partnerType")
 * .sidewalk(SidewalkAccountInfoProperty.builder()
 * .appServerPrivateKey("appServerPrivateKey")
 * .build())
 * .sidewalkResponse(SidewalkAccountInfoWithFingerprintProperty.builder()
 * .amazonId("amazonId")
 * .arn("arn")
 * .fingerprint("fingerprint")
 * .build())
 * .sidewalkUpdate(SidewalkUpdateAccountProperty.builder()
 * .appServerPrivateKey("appServerPrivateKey")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html)
 */
@CdkDslMarker
public class CfnPartnerAccountPropsDsl {
  private val cdkBuilder: CfnPartnerAccountProps.Builder = CfnPartnerAccountProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param accountLinked Whether the partner account is linked to the AWS account.
   */
  public fun accountLinked(accountLinked: Boolean) {
    cdkBuilder.accountLinked(accountLinked)
  }

  /**
   * @param accountLinked Whether the partner account is linked to the AWS account.
   */
  public fun accountLinked(accountLinked: IResolvable) {
    cdkBuilder.accountLinked(accountLinked)
  }

  /**
   * @param partnerAccountId The ID of the partner account to update.
   */
  public fun partnerAccountId(partnerAccountId: String) {
    cdkBuilder.partnerAccountId(partnerAccountId)
  }

  /**
   * @param partnerType The partner type.
   */
  public fun partnerType(partnerType: String) {
    cdkBuilder.partnerType(partnerType)
  }

  /**
   * @param sidewalk The Sidewalk account credentials.
   */
  public fun sidewalk(sidewalk: IResolvable) {
    cdkBuilder.sidewalk(sidewalk)
  }

  /**
   * @param sidewalk The Sidewalk account credentials.
   */
  public fun sidewalk(sidewalk: CfnPartnerAccount.SidewalkAccountInfoProperty) {
    cdkBuilder.sidewalk(sidewalk)
  }

  /**
   * @param sidewalkResponse the value to be set.
   */
  public fun sidewalkResponse(sidewalkResponse: IResolvable) {
    cdkBuilder.sidewalkResponse(sidewalkResponse)
  }

  /**
   * @param sidewalkResponse the value to be set.
   */
  public
      fun sidewalkResponse(sidewalkResponse: CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty) {
    cdkBuilder.sidewalkResponse(sidewalkResponse)
  }

  /**
   * @param sidewalkUpdate the value to be set.
   */
  public fun sidewalkUpdate(sidewalkUpdate: IResolvable) {
    cdkBuilder.sidewalkUpdate(sidewalkUpdate)
  }

  /**
   * @param sidewalkUpdate the value to be set.
   */
  public fun sidewalkUpdate(sidewalkUpdate: CfnPartnerAccount.SidewalkUpdateAccountProperty) {
    cdkBuilder.sidewalkUpdate(sidewalkUpdate)
  }

  /**
   * @param tags The tags are an array of key-value pairs to attach to the specified resource.
   * Tags can have a minimum of 0 and a maximum of 50 items.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags are an array of key-value pairs to attach to the specified resource.
   * Tags can have a minimum of 0 and a maximum of 50 items.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPartnerAccountProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
