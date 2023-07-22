@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dax

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnParameterGroupProps

@CdkDslMarker
public class CfnParameterGroupPropsDsl {
  private val cdkBuilder: CfnParameterGroupProps.Builder = CfnParameterGroupProps.builder()

  /**
   * @param description A description of the parameter group.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param parameterGroupName The name of the parameter group.
   */
  public fun parameterGroupName(parameterGroupName: String) {
    cdkBuilder.parameterGroupName(parameterGroupName)
  }

  /**
   * @param parameterNameValues An array of name-value pairs for the parameters in the group.
   * Each element in the array represents a single parameter.
   *
   *
   * `record-ttl-millis` and `query-ttl-millis` are the only supported parameter names. For more
   * details, see [Configuring TTL
   * Settings](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.cluster-management.html#DAX.cluster-management.custom-settings.ttl)
   * .
   */
  public fun parameterNameValues(parameterNameValues: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameterNameValues)
    cdkBuilder.parameterNameValues(builder.map)
  }

  /**
   * @param parameterNameValues An array of name-value pairs for the parameters in the group.
   * Each element in the array represents a single parameter.
   *
   *
   * `record-ttl-millis` and `query-ttl-millis` are the only supported parameter names. For more
   * details, see [Configuring TTL
   * Settings](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.cluster-management.html#DAX.cluster-management.custom-settings.ttl)
   * .
   */
  public fun parameterNameValues(parameterNameValues: Any) {
    cdkBuilder.parameterNameValues(parameterNameValues)
  }

  public fun build(): CfnParameterGroupProps = cdkBuilder.build()
}
