@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnPreparedStatement
import software.constructs.Construct

@CdkDslMarker
public class CfnPreparedStatementDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPreparedStatement.Builder = CfnPreparedStatement.Builder.create(scope,
      id)

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun queryStatement(queryStatement: String) {
    cdkBuilder.queryStatement(queryStatement)
  }

  public fun statementName(statementName: String) {
    cdkBuilder.statementName(statementName)
  }

  public fun workGroup(workGroup: String) {
    cdkBuilder.workGroup(workGroup)
  }

  public fun build(): CfnPreparedStatement = cdkBuilder.build()
}
