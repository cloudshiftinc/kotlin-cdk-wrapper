@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@CdkDslMarker
public class CfnDistributionConfigurationDistributionPropertyDsl {
  private val cdkBuilder: CfnDistributionConfiguration.DistributionProperty.Builder =
      CfnDistributionConfiguration.DistributionProperty.builder()

  private val _fastLaunchConfigurations: MutableList<Any> = mutableListOf()

  private val _launchTemplateConfigurations: MutableList<Any> = mutableListOf()

  private val _licenseConfigurationArns: MutableList<String> = mutableListOf()

  public fun amiDistributionConfiguration(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.amiDistributionConfiguration(builder.map)
  }

  public fun amiDistributionConfiguration(amiDistributionConfiguration: Any) {
    cdkBuilder.amiDistributionConfiguration(amiDistributionConfiguration)
  }

  public fun containerDistributionConfiguration(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.containerDistributionConfiguration(builder.map)
  }

  public fun containerDistributionConfiguration(containerDistributionConfiguration: Any) {
    cdkBuilder.containerDistributionConfiguration(containerDistributionConfiguration)
  }

  public fun fastLaunchConfigurations(vararg fastLaunchConfigurations: Any) {
    _fastLaunchConfigurations.addAll(listOf(*fastLaunchConfigurations))
  }

  public fun fastLaunchConfigurations(fastLaunchConfigurations: Collection<Any>) {
    _fastLaunchConfigurations.addAll(fastLaunchConfigurations)
  }

  public fun fastLaunchConfigurations(fastLaunchConfigurations: IResolvable) {
    cdkBuilder.fastLaunchConfigurations(fastLaunchConfigurations)
  }

  public fun launchTemplateConfigurations(vararg launchTemplateConfigurations: Any) {
    _launchTemplateConfigurations.addAll(listOf(*launchTemplateConfigurations))
  }

  public fun launchTemplateConfigurations(launchTemplateConfigurations: Collection<Any>) {
    _launchTemplateConfigurations.addAll(launchTemplateConfigurations)
  }

  public fun launchTemplateConfigurations(launchTemplateConfigurations: IResolvable) {
    cdkBuilder.launchTemplateConfigurations(launchTemplateConfigurations)
  }

  public fun licenseConfigurationArns(vararg licenseConfigurationArns: String) {
    _licenseConfigurationArns.addAll(listOf(*licenseConfigurationArns))
  }

  public fun licenseConfigurationArns(licenseConfigurationArns: Collection<String>) {
    _licenseConfigurationArns.addAll(licenseConfigurationArns)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): CfnDistributionConfiguration.DistributionProperty {
    if(_fastLaunchConfigurations.isNotEmpty())
        cdkBuilder.fastLaunchConfigurations(_fastLaunchConfigurations)
    if(_launchTemplateConfigurations.isNotEmpty())
        cdkBuilder.launchTemplateConfigurations(_launchTemplateConfigurations)
    if(_licenseConfigurationArns.isNotEmpty())
        cdkBuilder.licenseConfigurationArns(_licenseConfigurationArns)
    return cdkBuilder.build()
  }
}
