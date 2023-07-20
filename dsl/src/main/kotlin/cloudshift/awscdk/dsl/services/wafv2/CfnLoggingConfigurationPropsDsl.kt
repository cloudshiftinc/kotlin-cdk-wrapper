@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps

@CdkDslMarker
public class CfnLoggingConfigurationPropsDsl {
  private val cdkBuilder: CfnLoggingConfigurationProps.Builder =
      CfnLoggingConfigurationProps.builder()

  private val _logDestinationConfigs: MutableList<String> = mutableListOf()

  private val _redactedFields: MutableList<Any> = mutableListOf()

  public fun logDestinationConfigs(vararg logDestinationConfigs: String) {
    _logDestinationConfigs.addAll(listOf(*logDestinationConfigs))
  }

  public fun logDestinationConfigs(logDestinationConfigs: Collection<String>) {
    _logDestinationConfigs.addAll(logDestinationConfigs)
  }

  public fun loggingFilter(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.loggingFilter(builder.map)
  }

  public fun loggingFilter(loggingFilter: Any) {
    cdkBuilder.loggingFilter(loggingFilter)
  }

  public fun redactedFields(vararg redactedFields: Any) {
    _redactedFields.addAll(listOf(*redactedFields))
  }

  public fun redactedFields(redactedFields: Collection<Any>) {
    _redactedFields.addAll(redactedFields)
  }

  public fun redactedFields(redactedFields: IResolvable) {
    cdkBuilder.redactedFields(redactedFields)
  }

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnLoggingConfigurationProps {
    if(_logDestinationConfigs.isNotEmpty()) cdkBuilder.logDestinationConfigs(_logDestinationConfigs)
    if(_redactedFields.isNotEmpty()) cdkBuilder.redactedFields(_redactedFields)
    return cdkBuilder.build()
  }
}
