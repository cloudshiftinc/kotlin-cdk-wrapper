@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.transfer.CfnAgreement
import software.constructs.Construct

@CdkDslMarker
public class CfnAgreementDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAgreement.Builder = CfnAgreement.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accessRole(accessRole: String) {
    cdkBuilder.accessRole(accessRole)
  }

  public fun baseDirectory(baseDirectory: String) {
    cdkBuilder.baseDirectory(baseDirectory)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun localProfileId(localProfileId: String) {
    cdkBuilder.localProfileId(localProfileId)
  }

  public fun partnerProfileId(partnerProfileId: String) {
    cdkBuilder.partnerProfileId(partnerProfileId)
  }

  public fun serverId(serverId: String) {
    cdkBuilder.serverId(serverId)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAgreement {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
