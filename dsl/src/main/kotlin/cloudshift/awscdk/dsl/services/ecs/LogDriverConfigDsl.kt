@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import software.amazon.awscdk.services.ecs.LogDriverConfig

@CdkDslMarker
public class LogDriverConfigDsl {
  private val cdkBuilder: LogDriverConfig.Builder = LogDriverConfig.builder()

  private val _secretOptions: MutableList<CfnTaskDefinition.SecretProperty> = mutableListOf()

  public fun logDriver(logDriver: String) {
    cdkBuilder.logDriver(logDriver)
  }

  public fun options(options: Map<String, String>) {
    cdkBuilder.options(options)
  }

  public fun secretOptions(secretOptions: CfnTaskDefinitionSecretPropertyDsl.() -> Unit) {
    _secretOptions.add(CfnTaskDefinitionSecretPropertyDsl().apply(secretOptions).build())
  }

  public fun secretOptions(secretOptions: Collection<CfnTaskDefinition.SecretProperty>) {
    _secretOptions.addAll(secretOptions)
  }

  public fun build(): LogDriverConfig {
    if(_secretOptions.isNotEmpty()) cdkBuilder.secretOptions(_secretOptions)
    return cdkBuilder.build()
  }
}
