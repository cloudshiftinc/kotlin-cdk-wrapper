@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnModelPackageGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnModelPackageGroup.Builder = CfnModelPackageGroup.Builder.create(scope,
      id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun modelPackageGroupDescription(modelPackageGroupDescription: String) {
    cdkBuilder.modelPackageGroupDescription(modelPackageGroupDescription)
  }

  public fun modelPackageGroupName(modelPackageGroupName: String) {
    cdkBuilder.modelPackageGroupName(modelPackageGroupName)
  }

  public fun modelPackageGroupPolicy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.modelPackageGroupPolicy(builder.map)
  }

  public fun modelPackageGroupPolicy(modelPackageGroupPolicy: Any) {
    cdkBuilder.modelPackageGroupPolicy(modelPackageGroupPolicy)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnModelPackageGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
