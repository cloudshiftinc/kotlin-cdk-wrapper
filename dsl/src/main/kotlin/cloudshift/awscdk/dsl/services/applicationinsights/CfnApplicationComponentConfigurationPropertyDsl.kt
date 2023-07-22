@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@CdkDslMarker
public class CfnApplicationComponentConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.ComponentConfigurationProperty.Builder =
      CfnApplication.ComponentConfigurationProperty.builder()

  private val _subComponentTypeConfigurations: MutableList<Any> = mutableListOf()

  /**
   * @param configurationDetails The configuration settings.
   */
  public fun configurationDetails(configurationDetails: IResolvable) {
    cdkBuilder.configurationDetails(configurationDetails)
  }

  /**
   * @param configurationDetails The configuration settings.
   */
  public
      fun configurationDetails(configurationDetails: CfnApplication.ConfigurationDetailsProperty) {
    cdkBuilder.configurationDetails(configurationDetails)
  }

  /**
   * @param subComponentTypeConfigurations Sub-component configurations of the component.
   */
  public fun subComponentTypeConfigurations(vararg subComponentTypeConfigurations: Any) {
    _subComponentTypeConfigurations.addAll(listOf(*subComponentTypeConfigurations))
  }

  /**
   * @param subComponentTypeConfigurations Sub-component configurations of the component.
   */
  public fun subComponentTypeConfigurations(subComponentTypeConfigurations: Collection<Any>) {
    _subComponentTypeConfigurations.addAll(subComponentTypeConfigurations)
  }

  /**
   * @param subComponentTypeConfigurations Sub-component configurations of the component.
   */
  public fun subComponentTypeConfigurations(subComponentTypeConfigurations: IResolvable) {
    cdkBuilder.subComponentTypeConfigurations(subComponentTypeConfigurations)
  }

  public fun build(): CfnApplication.ComponentConfigurationProperty {
    if(_subComponentTypeConfigurations.isNotEmpty())
        cdkBuilder.subComponentTypeConfigurations(_subComponentTypeConfigurations)
    return cdkBuilder.build()
  }
}
