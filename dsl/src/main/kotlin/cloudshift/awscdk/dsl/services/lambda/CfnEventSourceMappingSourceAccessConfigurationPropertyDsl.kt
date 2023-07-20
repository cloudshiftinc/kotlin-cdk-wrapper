@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@CdkDslMarker
public class CfnEventSourceMappingSourceAccessConfigurationPropertyDsl {
  private val cdkBuilder: CfnEventSourceMapping.SourceAccessConfigurationProperty.Builder =
      CfnEventSourceMapping.SourceAccessConfigurationProperty.builder()

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): CfnEventSourceMapping.SourceAccessConfigurationProperty = cdkBuilder.build()
}
