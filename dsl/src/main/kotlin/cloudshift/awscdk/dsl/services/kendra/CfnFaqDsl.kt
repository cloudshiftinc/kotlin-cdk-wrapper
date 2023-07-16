@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnFaq
import software.constructs.Construct

@CdkDslMarker
public class CfnFaqDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFaq.Builder = CfnFaq.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun fileFormat(fileFormat: String) {
    cdkBuilder.fileFormat(fileFormat)
  }

  public fun indexId(indexId: String) {
    cdkBuilder.indexId(indexId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun s3Path(s3Path: IResolvable) {
    cdkBuilder.s3Path(s3Path)
  }

  public fun s3Path(s3Path: CfnFaq.S3PathProperty) {
    cdkBuilder.s3Path(s3Path)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnFaq {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
