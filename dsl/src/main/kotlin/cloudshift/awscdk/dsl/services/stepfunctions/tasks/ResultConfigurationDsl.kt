@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.s3.LocationDsl
import kotlin.Unit
import software.amazon.awscdk.services.s3.Location
import software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration
import software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration

@CdkDslMarker
public class ResultConfigurationDsl {
  private val cdkBuilder: ResultConfiguration.Builder = ResultConfiguration.builder()

  /**
   * @param encryptionConfiguration Encryption option used if enabled in S3.
   */
  public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationDsl.() -> Unit
      = {}) {
    val builder = EncryptionConfigurationDsl()
    builder.apply(encryptionConfiguration)
    cdkBuilder.encryptionConfiguration(builder.build())
  }

  /**
   * @param encryptionConfiguration Encryption option used if enabled in S3.
   */
  public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * @param outputLocation S3 path of query results.
   * Example value: `s3://query-results-bucket/folder/`
   */
  public fun outputLocation(outputLocation: LocationDsl.() -> Unit = {}) {
    val builder = LocationDsl()
    builder.apply(outputLocation)
    cdkBuilder.outputLocation(builder.build())
  }

  /**
   * @param outputLocation S3 path of query results.
   * Example value: `s3://query-results-bucket/folder/`
   */
  public fun outputLocation(outputLocation: Location) {
    cdkBuilder.outputLocation(outputLocation)
  }

  public fun build(): ResultConfiguration = cdkBuilder.build()
}
