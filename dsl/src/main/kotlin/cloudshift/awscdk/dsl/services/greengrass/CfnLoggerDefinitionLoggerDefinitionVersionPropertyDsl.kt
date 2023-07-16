@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinition

@CdkDslMarker
public class CfnLoggerDefinitionLoggerDefinitionVersionPropertyDsl {
  private val cdkBuilder: CfnLoggerDefinition.LoggerDefinitionVersionProperty.Builder =
      CfnLoggerDefinition.LoggerDefinitionVersionProperty.builder()

  private val _loggers: MutableList<Any> = mutableListOf()

  public fun loggers(vararg loggers: Any) {
    _loggers.addAll(listOf(*loggers))
  }

  public fun loggers(loggers: Collection<Any>) {
    _loggers.addAll(loggers)
  }

  public fun loggers(loggers: IResolvable) {
    cdkBuilder.loggers(loggers)
  }

  public fun build(): CfnLoggerDefinition.LoggerDefinitionVersionProperty {
    if(_loggers.isNotEmpty()) cdkBuilder.loggers(_loggers)
    return cdkBuilder.build()
  }
}
