@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnVerifiedAccessGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVerifiedAccessGroup.Builder =
      CfnVerifiedAccessGroup.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun policyDocument(policyDocument: String) {
    cdkBuilder.policyDocument(policyDocument)
  }

  public fun policyEnabled(policyEnabled: Boolean) {
    cdkBuilder.policyEnabled(policyEnabled)
  }

  public fun policyEnabled(policyEnabled: IResolvable) {
    cdkBuilder.policyEnabled(policyEnabled)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun verifiedAccessInstanceId(verifiedAccessInstanceId: String) {
    cdkBuilder.verifiedAccessInstanceId(verifiedAccessInstanceId)
  }

  public fun build(): CfnVerifiedAccessGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
