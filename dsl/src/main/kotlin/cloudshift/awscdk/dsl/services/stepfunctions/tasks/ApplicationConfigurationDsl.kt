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

@CdkDslMarker
public class ApplicationConfigurationDsl {
  private val cdkBuilder: ApplicationConfiguration.Builder = ApplicationConfiguration.builder()

  private val _nestedConfig: MutableList<ApplicationConfiguration> = mutableListOf()

  public fun classification(classification: Classification) {
    cdkBuilder.classification(classification)
  }

  public fun nestedConfig(nestedConfig: ApplicationConfigurationDsl.() -> Unit) {
    _nestedConfig.add(ApplicationConfigurationDsl().apply(nestedConfig).build())
  }

  public fun nestedConfig(nestedConfig: Collection<ApplicationConfiguration>) {
    _nestedConfig.addAll(nestedConfig)
  }

  public fun properties(properties: Map<String, String>) {
    cdkBuilder.properties(properties)
  }

  public fun build(): ApplicationConfiguration {
    if(_nestedConfig.isNotEmpty()) cdkBuilder.nestedConfig(_nestedConfig)
    return cdkBuilder.build()
  }
}
