@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.sagemaker.CfnImage
import software.constructs.Construct

@CdkDslMarker
public class CfnImageDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnImage.Builder = CfnImage.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun imageDescription(imageDescription: String) {
    cdkBuilder.imageDescription(imageDescription)
  }

  public fun imageDisplayName(imageDisplayName: String) {
    cdkBuilder.imageDisplayName(imageDisplayName)
  }

  public fun imageName(imageName: String) {
    cdkBuilder.imageName(imageName)
  }

  public fun imageRoleArn(imageRoleArn: String) {
    cdkBuilder.imageRoleArn(imageRoleArn)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnImage {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
