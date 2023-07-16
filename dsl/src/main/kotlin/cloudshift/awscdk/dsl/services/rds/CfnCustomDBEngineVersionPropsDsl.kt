@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps

@CdkDslMarker
public class CfnCustomDBEngineVersionPropsDsl {
  private val cdkBuilder: CfnCustomDBEngineVersionProps.Builder =
      CfnCustomDBEngineVersionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName: String) {
    cdkBuilder.databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName)
  }

  public fun databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix: String) {
    cdkBuilder.databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
  }

  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun manifest(manifest: String) {
    cdkBuilder.manifest(manifest)
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

  public fun build(): CfnCustomDBEngineVersionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
