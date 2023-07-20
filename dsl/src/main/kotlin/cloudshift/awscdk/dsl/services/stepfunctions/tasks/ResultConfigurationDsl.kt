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

  public fun encryptionConfiguration(block: EncryptionConfigurationDsl.() -> Unit = {}) {
    val builder = EncryptionConfigurationDsl()
    builder.apply(block)
    cdkBuilder.encryptionConfiguration(builder.build())
  }

  public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  public fun outputLocation(block: LocationDsl.() -> Unit = {}) {
    val builder = LocationDsl()
    builder.apply(block)
    cdkBuilder.outputLocation(builder.build())
  }

  public fun outputLocation(outputLocation: Location) {
    cdkBuilder.outputLocation(outputLocation)
  }

  public fun build(): ResultConfiguration = cdkBuilder.build()
}
