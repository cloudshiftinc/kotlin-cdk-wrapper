@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule

/**
 * These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke the
 * Amazon Redshift Data API ExecuteStatement based on EventBridge events.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * RedshiftDataParametersProperty redshiftDataParametersProperty =
 * RedshiftDataParametersProperty.builder()
 * .database("database")
 * .sql("sql")
 * // the properties below are optional
 * .dbUser("dbUser")
 * .secretManagerArn("secretManagerArn")
 * .statementName("statementName")
 * .withEvent(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html)
 */
@CdkDslMarker
public class CfnRuleRedshiftDataParametersPropertyDsl {
  private val cdkBuilder: CfnRule.RedshiftDataParametersProperty.Builder =
      CfnRule.RedshiftDataParametersProperty.builder()

  /**
   * @param database The name of the database. 
   * Required when authenticating using temporary credentials.
   */
  public fun database(database: String) {
    cdkBuilder.database(database)
  }

  /**
   * @param dbUser The database user name.
   * Required when authenticating using temporary credentials.
   */
  public fun dbUser(dbUser: String) {
    cdkBuilder.dbUser(dbUser)
  }

  /**
   * @param secretManagerArn The name or ARN of the secret that enables access to the database.
   * Required when authenticating using AWS Secrets Manager.
   */
  public fun secretManagerArn(secretManagerArn: String) {
    cdkBuilder.secretManagerArn(secretManagerArn)
  }

  /**
   * @param sql The SQL statement text to run. 
   */
  public fun sql(sql: String) {
    cdkBuilder.sql(sql)
  }

  /**
   * @param statementName The name of the SQL statement.
   * You can name the SQL statement when you create it to identify the query.
   */
  public fun statementName(statementName: String) {
    cdkBuilder.statementName(statementName)
  }

  /**
   * @param withEvent Indicates whether to send an event back to EventBridge after the SQL statement
   * runs.
   */
  public fun withEvent(withEvent: Boolean) {
    cdkBuilder.withEvent(withEvent)
  }

  /**
   * @param withEvent Indicates whether to send an event back to EventBridge after the SQL statement
   * runs.
   */
  public fun withEvent(withEvent: IResolvable) {
    cdkBuilder.withEvent(withEvent)
  }

  public fun build(): CfnRule.RedshiftDataParametersProperty = cdkBuilder.build()
}
