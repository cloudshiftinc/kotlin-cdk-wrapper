@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.SourceAccessConfiguration
import software.amazon.awscdk.services.lambda.SourceAccessConfigurationType

@CdkDslMarker
public class SourceAccessConfigurationDsl {
  private val cdkBuilder: SourceAccessConfiguration.Builder = SourceAccessConfiguration.builder()

  public fun type(type: SourceAccessConfigurationType) {
    cdkBuilder.type(type)
  }

  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): SourceAccessConfiguration = cdkBuilder.build()
}
