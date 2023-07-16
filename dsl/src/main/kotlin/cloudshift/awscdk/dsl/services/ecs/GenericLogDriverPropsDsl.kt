@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.ecs.GenericLogDriverProps
import software.amazon.awscdk.services.ecs.Secret

@CdkDslMarker
public class GenericLogDriverPropsDsl {
  private val cdkBuilder: GenericLogDriverProps.Builder = GenericLogDriverProps.builder()

  public fun logDriver(logDriver: String) {
    cdkBuilder.logDriver(logDriver)
  }

  public fun options(options: Map<String, String>) {
    cdkBuilder.options(options)
  }

  public fun secretOptions(secretOptions: Map<String, out Secret>) {
    cdkBuilder.secretOptions(secretOptions)
  }

  public fun build(): GenericLogDriverProps = cdkBuilder.build()
}
