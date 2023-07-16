@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnAddon
import software.constructs.Construct

@CdkDslMarker
public class CfnAddonDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAddon.Builder = CfnAddon.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun addonName(addonName: String) {
    cdkBuilder.addonName(addonName)
  }

  public fun addonVersion(addonVersion: String) {
    cdkBuilder.addonVersion(addonVersion)
  }

  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  public fun configurationValues(configurationValues: String) {
    cdkBuilder.configurationValues(configurationValues)
  }

  public fun preserveOnDelete(preserveOnDelete: Boolean) {
    cdkBuilder.preserveOnDelete(preserveOnDelete)
  }

  public fun preserveOnDelete(preserveOnDelete: IResolvable) {
    cdkBuilder.preserveOnDelete(preserveOnDelete)
  }

  public fun resolveConflicts(resolveConflicts: String) {
    cdkBuilder.resolveConflicts(resolveConflicts)
  }

  public fun serviceAccountRoleArn(serviceAccountRoleArn: String) {
    cdkBuilder.serviceAccountRoleArn(serviceAccountRoleArn)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAddon {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
