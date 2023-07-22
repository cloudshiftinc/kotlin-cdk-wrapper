@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig

/**
 * Stores information about the location of an object in Amazon S3.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * S3LocationConfig s3LocationConfig = S3LocationConfig.builder()
 * .uri("uri")
 * .build();
 * ```
 */
@CdkDslMarker
public class S3LocationConfigDsl {
  private val cdkBuilder: S3LocationConfig.Builder = S3LocationConfig.builder()

  /**
   * @param uri Uniquely identifies the resource in Amazon S3. 
   */
  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): S3LocationConfig = cdkBuilder.build()
}
