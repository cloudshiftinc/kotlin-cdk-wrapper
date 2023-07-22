@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location

@CdkDslMarker
public class ApiDefinitionS3LocationDsl {
  private val cdkBuilder: ApiDefinitionS3Location.Builder = ApiDefinitionS3Location.builder()

  /**
   * @param bucket The S3 bucket. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param key The S3 key. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param version An optional version.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): ApiDefinitionS3Location = cdkBuilder.build()
}
