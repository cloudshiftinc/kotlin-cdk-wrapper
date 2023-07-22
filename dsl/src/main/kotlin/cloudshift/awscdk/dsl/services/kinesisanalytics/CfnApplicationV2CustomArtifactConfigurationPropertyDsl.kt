@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2CustomArtifactConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.CustomArtifactConfigurationProperty.Builder =
      CfnApplicationV2.CustomArtifactConfigurationProperty.builder()

  /**
   * @param artifactType Set this to either `UDF` or `DEPENDENCY_JAR` . 
   * `UDF` stands for user-defined functions. This type of artifact must be in an S3 bucket. A
   * `DEPENDENCY_JAR` can be in either Maven or an S3 bucket.
   */
  public fun artifactType(artifactType: String) {
    cdkBuilder.artifactType(artifactType)
  }

  /**
   * @param mavenReference The parameters required to fully specify a Maven reference.
   */
  public fun mavenReference(mavenReference: IResolvable) {
    cdkBuilder.mavenReference(mavenReference)
  }

  /**
   * @param mavenReference The parameters required to fully specify a Maven reference.
   */
  public fun mavenReference(mavenReference: CfnApplicationV2.MavenReferenceProperty) {
    cdkBuilder.mavenReference(mavenReference)
  }

  /**
   * @param s3ContentLocation The location of the custom artifacts.
   */
  public fun s3ContentLocation(s3ContentLocation: IResolvable) {
    cdkBuilder.s3ContentLocation(s3ContentLocation)
  }

  /**
   * @param s3ContentLocation The location of the custom artifacts.
   */
  public fun s3ContentLocation(s3ContentLocation: CfnApplicationV2.S3ContentLocationProperty) {
    cdkBuilder.s3ContentLocation(s3ContentLocation)
  }

  public fun build(): CfnApplicationV2.CustomArtifactConfigurationProperty = cdkBuilder.build()
}
