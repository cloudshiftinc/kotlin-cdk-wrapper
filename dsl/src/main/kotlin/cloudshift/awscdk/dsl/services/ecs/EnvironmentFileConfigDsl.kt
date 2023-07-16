@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.s3.LocationDsl
import kotlin.Unit
import software.amazon.awscdk.services.ecs.EnvironmentFileConfig
import software.amazon.awscdk.services.ecs.EnvironmentFileType
import software.amazon.awscdk.services.s3.Location

@CdkDslMarker
public class EnvironmentFileConfigDsl {
  private val cdkBuilder: EnvironmentFileConfig.Builder = EnvironmentFileConfig.builder()

  public fun fileType(fileType: EnvironmentFileType) {
    cdkBuilder.fileType(fileType)
  }

  public fun s3Location(block: LocationDsl.() -> Unit = {}) {
    val builder = LocationDsl()
    builder.apply(block)
    cdkBuilder.s3Location(builder.build())
  }

  public fun s3Location(s3Location: Location) {
    cdkBuilder.s3Location(s3Location)
  }

  public fun build(): EnvironmentFileConfig = cdkBuilder.build()
}
