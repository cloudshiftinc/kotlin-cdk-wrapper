@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.rds.IEngine
import software.amazon.awscdk.services.rds.ParameterGroupProps

@CdkDslMarker
public class ParameterGroupPropsDsl {
  private val cdkBuilder: ParameterGroupProps.Builder = ParameterGroupProps.builder()

  /**
   * @param description Description for this parameter group.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param engine The database engine for this parameter group. 
   */
  public fun engine(engine: IEngine) {
    cdkBuilder.engine(engine)
  }

  /**
   * @param parameters The parameters in this parameter group.
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): ParameterGroupProps = cdkBuilder.build()
}
