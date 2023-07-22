@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate
import software.amazon.awscdk.services.s3.IBucket

/**
 * Location of a PEM certificate on S3.
 *
 * Example:
 *
 * ```
 * Repository ecrRepository;
 * Project.Builder.create(this, "Project")
 * .environment(BuildEnvironment.builder()
 * .buildImage(WindowsBuildImage.fromEcrRepository(ecrRepository, "v1.0",
 * WindowsImageType.SERVER_2019))
 * // optional certificate to include in the build image
 * .certificate(BuildEnvironmentCertificate.builder()
 * .bucket(Bucket.fromBucketName(this, "Bucket", "my-bucket"))
 * .objectKey("path/to/cert.pem")
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class BuildEnvironmentCertificateDsl {
  private val cdkBuilder: BuildEnvironmentCertificate.Builder =
      BuildEnvironmentCertificate.builder()

  /**
   * @param bucket The bucket where the certificate is. 
   */
  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param objectKey The full path and name of the key file. 
   */
  public fun objectKey(objectKey: String) {
    cdkBuilder.objectKey(objectKey)
  }

  public fun build(): BuildEnvironmentCertificate = cdkBuilder.build()
}
