@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@CdkDslMarker
public class CfnInstanceGroupConfigConfigurationPropertyDsl {
  private val cdkBuilder: CfnInstanceGroupConfig.ConfigurationProperty.Builder =
      CfnInstanceGroupConfig.ConfigurationProperty.builder()

  private val _configurations: MutableList<Any> = mutableListOf()

  /**
   * @param classification The classification within a configuration.
   */
  public fun classification(classification: String) {
    cdkBuilder.classification(classification)
  }

  /**
   * @param configurationProperties Within a configuration classification, a set of properties that
   * represent the settings that you want to change in the configuration file.
   * Duplicates not allowed.
   */
  public fun configurationProperties(configurationProperties: Map<String, String>) {
    cdkBuilder.configurationProperties(configurationProperties)
  }

  /**
   * @param configurationProperties Within a configuration classification, a set of properties that
   * represent the settings that you want to change in the configuration file.
   * Duplicates not allowed.
   */
  public fun configurationProperties(configurationProperties: IResolvable) {
    cdkBuilder.configurationProperties(configurationProperties)
  }

  /**
   * @param configurations A list of additional configurations to apply within a configuration
   * object.
   */
  public fun configurations(vararg configurations: Any) {
    _configurations.addAll(listOf(*configurations))
  }

  /**
   * @param configurations A list of additional configurations to apply within a configuration
   * object.
   */
  public fun configurations(configurations: Collection<Any>) {
    _configurations.addAll(configurations)
  }

  /**
   * @param configurations A list of additional configurations to apply within a configuration
   * object.
   */
  public fun configurations(configurations: IResolvable) {
    cdkBuilder.configurations(configurations)
  }

  public fun build(): CfnInstanceGroupConfig.ConfigurationProperty {
    if(_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
    return cdkBuilder.build()
  }
}
