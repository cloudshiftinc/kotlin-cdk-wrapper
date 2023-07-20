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
import software.constructs.Construct

@CdkDslMarker
public class CfnPartnerAccountDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPartnerAccount.Builder = CfnPartnerAccount.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accountLinked(accountLinked: Boolean) {
    cdkBuilder.accountLinked(accountLinked)
  }

  public fun accountLinked(accountLinked: IResolvable) {
    cdkBuilder.accountLinked(accountLinked)
  }

  public fun partnerAccountId(partnerAccountId: String) {
    cdkBuilder.partnerAccountId(partnerAccountId)
  }

  public fun partnerType(partnerType: String) {
    cdkBuilder.partnerType(partnerType)
  }

  public fun sidewalk(sidewalk: IResolvable) {
    cdkBuilder.sidewalk(sidewalk)
  }

  public fun sidewalk(sidewalk: CfnPartnerAccount.SidewalkAccountInfoProperty) {
    cdkBuilder.sidewalk(sidewalk)
  }

  public fun sidewalkResponse(sidewalkResponse: IResolvable) {
    cdkBuilder.sidewalkResponse(sidewalkResponse)
  }

  public
      fun sidewalkResponse(sidewalkResponse: CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty) {
    cdkBuilder.sidewalkResponse(sidewalkResponse)
  }

  public fun sidewalkUpdate(sidewalkUpdate: IResolvable) {
    cdkBuilder.sidewalkUpdate(sidewalkUpdate)
  }

  public fun sidewalkUpdate(sidewalkUpdate: CfnPartnerAccount.SidewalkUpdateAccountProperty) {
    cdkBuilder.sidewalkUpdate(sidewalkUpdate)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPartnerAccount {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
