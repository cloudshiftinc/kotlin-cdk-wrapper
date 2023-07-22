@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration
import software.amazon.awscdk.services.stepfunctions.tasks.Classification

/**
 * A configuration specification to be used when provisioning virtual clusters, which can include
 * configurations for applications and software bundled with Amazon EMR on EKS.
 *
 * A configuration consists of a classification, properties, and optional nested configurations.
 * A classification refers to an application-specific configuration file.
 * Properties are the settings you want to change in that file.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * ApplicationConfiguration applicationConfiguration_;
 * Classification classification;
 * ApplicationConfiguration applicationConfiguration = ApplicationConfiguration.builder()
 * .classification(classification)
 * // the properties below are optional
 * .nestedConfig(List.of(applicationConfiguration_))
 * .properties(Map.of(
 * "propertiesKey", "properties"))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html)
 */
@CdkDslMarker
public class ApplicationConfigurationDsl {
  private val cdkBuilder: ApplicationConfiguration.Builder = ApplicationConfiguration.builder()

  private val _nestedConfig: MutableList<ApplicationConfiguration> = mutableListOf()

  /**
   * @param classification The classification within a configuration. 
   * Length Constraints: Minimum length of 1. Maximum length of 1024.
   */
  public fun classification(classification: Classification) {
    cdkBuilder.classification(classification)
  }

  /**
   * @param nestedConfig A list of additional configurations to apply within a configuration object.
   * Array Members: Maximum number of 100 items.
   */
  public fun nestedConfig(nestedConfig: ApplicationConfigurationDsl.() -> Unit) {
    _nestedConfig.add(ApplicationConfigurationDsl().apply(nestedConfig).build())
  }

  /**
   * @param nestedConfig A list of additional configurations to apply within a configuration object.
   * Array Members: Maximum number of 100 items.
   */
  public fun nestedConfig(nestedConfig: Collection<ApplicationConfiguration>) {
    _nestedConfig.addAll(nestedConfig)
  }

  /**
   * @param properties A set of properties specified within a configuration classification.
   * Map Entries: Maximum number of 100 items.
   */
  public fun properties(properties: Map<String, String>) {
    cdkBuilder.properties(properties)
  }

  public fun build(): ApplicationConfiguration {
    if(_nestedConfig.isNotEmpty()) cdkBuilder.nestedConfig(_nestedConfig)
    return cdkBuilder.build()
  }
}
