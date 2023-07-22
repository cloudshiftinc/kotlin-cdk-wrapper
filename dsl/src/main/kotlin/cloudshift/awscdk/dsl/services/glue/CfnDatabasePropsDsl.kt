@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDatabase
import software.amazon.awscdk.services.glue.CfnDatabaseProps

@CdkDslMarker
public class CfnDatabasePropsDsl {
  private val cdkBuilder: CfnDatabaseProps.Builder = CfnDatabaseProps.builder()

  /**
   * @param catalogId The AWS account ID for the account in which to create the catalog object. 
   *
   * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
   * pseudo parameter. For example: `!Ref AWS::AccountId`
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param databaseInput The metadata for the database. 
   */
  public fun databaseInput(databaseInput: IResolvable) {
    cdkBuilder.databaseInput(databaseInput)
  }

  /**
   * @param databaseInput The metadata for the database. 
   */
  public fun databaseInput(databaseInput: CfnDatabase.DatabaseInputProperty) {
    cdkBuilder.databaseInput(databaseInput)
  }

  public fun build(): CfnDatabaseProps = cdkBuilder.build()
}
