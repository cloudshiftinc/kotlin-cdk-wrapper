@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * An optional configuration specification to be used when provisioning cluster instances, which can
 * include configurations for applications and software bundled with Amazon EMR.
 *
 * See the RunJobFlow API for complete documentation on input parameters
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * ConfigurationProperty configurationProperty_;
 * ConfigurationProperty configurationProperty = ConfigurationProperty.builder()
 * .classification("classification")
 * .configurations(List.of(configurationProperty_))
 * .properties(Map.of(
 * "propertiesKey", "properties"))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_Configuration.html)
 */
@CdkDslMarker
public class EmrCreateClusterConfigurationPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.ConfigurationProperty.Builder =
      EmrCreateCluster.ConfigurationProperty.builder()

  private val _configurations: MutableList<EmrCreateCluster.ConfigurationProperty> = mutableListOf()

  /**
   * @param classification The classification within a configuration.
   */
  public fun classification(classification: String) {
    cdkBuilder.classification(classification)
  }

  /**
   * @param configurations A list of additional configurations to apply within a configuration
   * object.
   */
  public fun configurations(configurations: EmrCreateClusterConfigurationPropertyDsl.() -> Unit) {
    _configurations.add(EmrCreateClusterConfigurationPropertyDsl().apply(configurations).build())
  }

  /**
   * @param configurations A list of additional configurations to apply within a configuration
   * object.
   */
  public fun configurations(configurations: Collection<EmrCreateCluster.ConfigurationProperty>) {
    _configurations.addAll(configurations)
  }

  /**
   * @param properties A set of properties specified within a configuration classification.
   */
  public fun properties(properties: Map<String, String>) {
    cdkBuilder.properties(properties)
  }

  public fun build(): EmrCreateCluster.ConfigurationProperty {
    if(_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
    return cdkBuilder.build()
  }
}
