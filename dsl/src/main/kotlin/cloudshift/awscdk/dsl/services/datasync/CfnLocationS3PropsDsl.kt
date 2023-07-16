@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationS3
import software.amazon.awscdk.services.datasync.CfnLocationS3Props

@CdkDslMarker
public class CfnLocationS3PropsDsl {
  private val cdkBuilder: CfnLocationS3Props.Builder = CfnLocationS3Props.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun s3BucketArn(s3BucketArn: String) {
    cdkBuilder.s3BucketArn(s3BucketArn)
  }

  public fun s3Config(s3Config: IResolvable) {
    cdkBuilder.s3Config(s3Config)
  }

  public fun s3Config(s3Config: CfnLocationS3.S3ConfigProperty) {
    cdkBuilder.s3Config(s3Config)
  }

  public fun s3StorageClass(s3StorageClass: String) {
    cdkBuilder.s3StorageClass(s3StorageClass)
  }

  public fun subdirectory(subdirectory: String) {
    cdkBuilder.subdirectory(subdirectory)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLocationS3Props {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
