@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.elasticsearch.CapacityConfig

@CdkDslMarker
public class CapacityConfigDsl {
  private val cdkBuilder: CapacityConfig.Builder = CapacityConfig.builder()

  public fun dataNodeInstanceType(dataNodeInstanceType: String) {
    cdkBuilder.dataNodeInstanceType(dataNodeInstanceType)
  }

  public fun dataNodes(dataNodes: Number) {
    cdkBuilder.dataNodes(dataNodes)
  }

  public fun masterNodeInstanceType(masterNodeInstanceType: String) {
    cdkBuilder.masterNodeInstanceType(masterNodeInstanceType)
  }

  public fun masterNodes(masterNodes: Number) {
    cdkBuilder.masterNodes(masterNodes)
  }

  public fun warmInstanceType(warmInstanceType: String) {
    cdkBuilder.warmInstanceType(warmInstanceType)
  }

  public fun warmNodes(warmNodes: Number) {
    cdkBuilder.warmNodes(warmNodes)
  }

  public fun build(): CapacityConfig = cdkBuilder.build()
}
