@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineIAMPolicyDocumentPropertyDsl {
  private val cdkBuilder: CfnStateMachine.IAMPolicyDocumentProperty.Builder =
      CfnStateMachine.IAMPolicyDocumentProperty.builder()

  /**
   * @param statement the value to be set. 
   */
  public fun statement(statement: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(statement)
    cdkBuilder.statement(builder.map)
  }

  /**
   * @param statement the value to be set. 
   */
  public fun statement(statement: Any) {
    cdkBuilder.statement(statement)
  }

  /**
   * @param version the value to be set. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnStateMachine.IAMPolicyDocumentProperty = cdkBuilder.build()
}
