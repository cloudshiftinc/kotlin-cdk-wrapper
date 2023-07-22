@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.s3.LocationDsl
import kotlin.Unit
import software.amazon.awscdk.services.ecs.EnvironmentFileConfig
import software.amazon.awscdk.services.ecs.EnvironmentFileType
import software.amazon.awscdk.services.s3.Location

/**
 * Configuration for the environment file.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * EnvironmentFileConfig environmentFileConfig = EnvironmentFileConfig.builder()
 * .fileType(EnvironmentFileType.S3)
 * .s3Location(Location.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class EnvironmentFileConfigDsl {
  private val cdkBuilder: EnvironmentFileConfig.Builder = EnvironmentFileConfig.builder()

  /**
   * @param fileType The type of environment file. 
   */
  public fun fileType(fileType: EnvironmentFileType) {
    cdkBuilder.fileType(fileType)
  }

  /**
   * @param s3Location The location of the environment file in S3. 
   */
  public fun s3Location(s3Location: LocationDsl.() -> Unit = {}) {
    val builder = LocationDsl()
    builder.apply(s3Location)
    cdkBuilder.s3Location(builder.build())
  }

  /**
   * @param s3Location The location of the environment file in S3. 
   */
  public fun s3Location(s3Location: Location) {
    cdkBuilder.s3Location(s3Location)
  }

  public fun build(): EnvironmentFileConfig = cdkBuilder.build()
}
