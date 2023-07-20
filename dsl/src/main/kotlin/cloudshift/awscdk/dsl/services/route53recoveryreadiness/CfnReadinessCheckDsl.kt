@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck
import software.constructs.Construct

@CdkDslMarker
public class CfnReadinessCheckDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnReadinessCheck.Builder = CfnReadinessCheck.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun readinessCheckName(readinessCheckName: String) {
    cdkBuilder.readinessCheckName(readinessCheckName)
  }

  public fun resourceSetName(resourceSetName: String) {
    cdkBuilder.resourceSetName(resourceSetName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnReadinessCheck {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
