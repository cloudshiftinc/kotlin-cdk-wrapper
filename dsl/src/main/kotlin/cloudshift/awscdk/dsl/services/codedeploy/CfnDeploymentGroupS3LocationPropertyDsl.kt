@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupS3LocationPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.S3LocationProperty.Builder =
      CfnDeploymentGroup.S3LocationProperty.builder()

  /**
   * @param bucket The name of the Amazon S3 bucket where the application revision is stored. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param bundleType The file type of the application revision. Must be one of the following:.
   * * JSON
   * * tar: A tar archive file.
   * * tgz: A compressed tar archive file.
   * * YAML
   * * zip: A zip archive file.
   */
  public fun bundleType(bundleType: String) {
    cdkBuilder.bundleType(bundleType)
  }

  /**
   * @param eTag The ETag of the Amazon S3 object that represents the bundled artifacts for the
   * application revision.
   * If the ETag is not specified as an input parameter, ETag validation of the object is skipped.
   */
  public fun eTag(eTag: String) {
    cdkBuilder.eTag(eTag)
  }

  /**
   * @param key The name of the Amazon S3 object that represents the bundled artifacts for the
   * application revision. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param version A specific version of the Amazon S3 object that represents the bundled artifacts
   * for the application revision.
   * If the version is not specified, the system uses the most recent version by default.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnDeploymentGroup.S3LocationProperty = cdkBuilder.build()
}
