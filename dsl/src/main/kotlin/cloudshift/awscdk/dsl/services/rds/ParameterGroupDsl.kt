@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.rds.IEngine
import software.amazon.awscdk.services.rds.ParameterGroup
import software.constructs.Construct

@CdkDslMarker
public class ParameterGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ParameterGroup.Builder = ParameterGroup.Builder.create(scope, id)

  /**
   * Description for this parameter group.
   *
   * Default: a CDK generated description
   *
   * @param description Description for this parameter group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The database engine for this parameter group.
   *
   * @param engine The database engine for this parameter group. 
   */
  public fun engine(engine: IEngine) {
    cdkBuilder.engine(engine)
  }

  /**
   * The parameters in this parameter group.
   *
   * Default: - None
   *
   * @param parameters The parameters in this parameter group. 
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): ParameterGroup = cdkBuilder.build()
}
