@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.elasticsearch.CapacityConfig

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class CapacityConfigDsl {
  private val cdkBuilder: CapacityConfig.Builder = CapacityConfig.builder()

  @Deprecated(message = "deprecated in CDK")
  public fun dataNodeInstanceType(dataNodeInstanceType: String) {
    cdkBuilder.dataNodeInstanceType(dataNodeInstanceType)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun dataNodes(dataNodes: Number) {
    cdkBuilder.dataNodes(dataNodes)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun masterNodeInstanceType(masterNodeInstanceType: String) {
    cdkBuilder.masterNodeInstanceType(masterNodeInstanceType)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun masterNodes(masterNodes: Number) {
    cdkBuilder.masterNodes(masterNodes)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun warmInstanceType(warmInstanceType: String) {
    cdkBuilder.warmInstanceType(warmInstanceType)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun warmNodes(warmNodes: Number) {
    cdkBuilder.warmNodes(warmNodes)
  }

  public fun build(): CapacityConfig = cdkBuilder.build()
}
