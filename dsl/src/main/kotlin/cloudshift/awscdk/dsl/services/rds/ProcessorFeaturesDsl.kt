@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.rds.ProcessorFeatures

@CdkDslMarker
public class ProcessorFeaturesDsl {
  private val cdkBuilder: ProcessorFeatures.Builder = ProcessorFeatures.builder()

  public fun coreCount(coreCount: Number) {
    cdkBuilder.coreCount(coreCount)
  }

  public fun threadsPerCore(threadsPerCore: Number) {
    cdkBuilder.threadsPerCore(threadsPerCore)
  }

  public fun build(): ProcessorFeatures = cdkBuilder.build()
}
