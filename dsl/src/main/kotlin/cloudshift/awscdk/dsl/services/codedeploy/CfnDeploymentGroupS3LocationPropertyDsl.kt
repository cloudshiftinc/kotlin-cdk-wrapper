@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * `S3Location` is a property of the [CodeDeploy DeploymentGroup
 * Revision](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html)
 * property that specifies the location of an application revision that is stored in Amazon Simple
 * Storage Service ( Amazon S3 ).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .bundleType("bundleType")
 * .eTag("eTag")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-s3location.html)
 */
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
