@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.rds.ClusterInstanceProps
import software.amazon.awscdk.services.rds.ClusterInstanceType
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.PerformanceInsightRetention

@CdkDslMarker
public class ClusterInstancePropsDsl {
  private val cdkBuilder: ClusterInstanceProps.Builder = ClusterInstanceProps.builder()

  public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
    cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
  }

  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
    cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
  }

  public fun instanceIdentifier(instanceIdentifier: String) {
    cdkBuilder.instanceIdentifier(instanceIdentifier)
  }

  public fun instanceType(instanceType: ClusterInstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun isFromLegacyInstanceProps(isFromLegacyInstanceProps: Boolean) {
    cdkBuilder.isFromLegacyInstanceProps(isFromLegacyInstanceProps)
  }

  public fun parameterGroup(parameterGroup: IParameterGroup) {
    cdkBuilder.parameterGroup(parameterGroup)
  }

  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
    cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey)
  }

  public fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
    cdkBuilder.performanceInsightRetention(performanceInsightRetention)
  }

  public fun promotionTier(promotionTier: Number) {
    cdkBuilder.promotionTier(promotionTier)
  }

  public fun publiclyAccessible(publiclyAccessible: Boolean) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  public fun build(): ClusterInstanceProps = cdkBuilder.build()
}
