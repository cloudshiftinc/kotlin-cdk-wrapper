@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2ZeppelinApplicationConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.ZeppelinApplicationConfigurationProperty.Builder =
      CfnApplicationV2.ZeppelinApplicationConfigurationProperty.builder()

  private val _customArtifactsConfiguration: MutableList<Any> = mutableListOf()

  /**
   * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a Kinesis
   * Data Analytics Studio notebook.
   */
  public fun catalogConfiguration(catalogConfiguration: IResolvable) {
    cdkBuilder.catalogConfiguration(catalogConfiguration)
  }

  /**
   * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a Kinesis
   * Data Analytics Studio notebook.
   */
  public
      fun catalogConfiguration(catalogConfiguration: CfnApplicationV2.CatalogConfigurationProperty) {
    cdkBuilder.catalogConfiguration(catalogConfiguration)
  }

  /**
   * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
   */
  public fun customArtifactsConfiguration(vararg customArtifactsConfiguration: Any) {
    _customArtifactsConfiguration.addAll(listOf(*customArtifactsConfiguration))
  }

  /**
   * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
   */
  public fun customArtifactsConfiguration(customArtifactsConfiguration: Collection<Any>) {
    _customArtifactsConfiguration.addAll(customArtifactsConfiguration)
  }

  /**
   * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
   */
  public fun customArtifactsConfiguration(customArtifactsConfiguration: IResolvable) {
    cdkBuilder.customArtifactsConfiguration(customArtifactsConfiguration)
  }

  /**
   * @param deployAsApplicationConfiguration The information required to deploy a Kinesis Data
   * Analytics Studio notebook as an application with durable state.
   */
  public fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: IResolvable) {
    cdkBuilder.deployAsApplicationConfiguration(deployAsApplicationConfiguration)
  }

  /**
   * @param deployAsApplicationConfiguration The information required to deploy a Kinesis Data
   * Analytics Studio notebook as an application with durable state.
   */
  public
      fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: CfnApplicationV2.DeployAsApplicationConfigurationProperty) {
    cdkBuilder.deployAsApplicationConfiguration(deployAsApplicationConfiguration)
  }

  /**
   * @param monitoringConfiguration The monitoring configuration of a Kinesis Data Analytics Studio
   * notebook.
   */
  public fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
    cdkBuilder.monitoringConfiguration(monitoringConfiguration)
  }

  /**
   * @param monitoringConfiguration The monitoring configuration of a Kinesis Data Analytics Studio
   * notebook.
   */
  public
      fun monitoringConfiguration(monitoringConfiguration: CfnApplicationV2.ZeppelinMonitoringConfigurationProperty) {
    cdkBuilder.monitoringConfiguration(monitoringConfiguration)
  }

  public fun build(): CfnApplicationV2.ZeppelinApplicationConfigurationProperty {
    if(_customArtifactsConfiguration.isNotEmpty())
        cdkBuilder.customArtifactsConfiguration(_customArtifactsConfiguration)
    return cdkBuilder.build()
  }
}
