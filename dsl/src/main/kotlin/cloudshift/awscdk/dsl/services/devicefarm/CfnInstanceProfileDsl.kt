@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devicefarm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devicefarm.CfnInstanceProfile
import software.constructs.Construct

@CdkDslMarker
public class CfnInstanceProfileDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInstanceProfile.Builder = CfnInstanceProfile.Builder.create(scope, id)

  private val _excludeAppPackagesFromCleanup: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun excludeAppPackagesFromCleanup(vararg excludeAppPackagesFromCleanup: String) {
    _excludeAppPackagesFromCleanup.addAll(listOf(*excludeAppPackagesFromCleanup))
  }

  public fun excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup: Collection<String>) {
    _excludeAppPackagesFromCleanup.addAll(excludeAppPackagesFromCleanup)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun packageCleanup(packageCleanup: Boolean) {
    cdkBuilder.packageCleanup(packageCleanup)
  }

  public fun packageCleanup(packageCleanup: IResolvable) {
    cdkBuilder.packageCleanup(packageCleanup)
  }

  public fun rebootAfterUse(rebootAfterUse: Boolean) {
    cdkBuilder.rebootAfterUse(rebootAfterUse)
  }

  public fun rebootAfterUse(rebootAfterUse: IResolvable) {
    cdkBuilder.rebootAfterUse(rebootAfterUse)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnInstanceProfile {
    if(_excludeAppPackagesFromCleanup.isNotEmpty())
        cdkBuilder.excludeAppPackagesFromCleanup(_excludeAppPackagesFromCleanup)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
