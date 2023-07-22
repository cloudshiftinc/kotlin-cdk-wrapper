@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnNamedQuery
import software.constructs.Construct

/**
 * The `AWS::Athena::NamedQuery` resource specifies an Amazon Athena saved query, where
 * `QueryString` contains the SQL query statements that make up the query.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * CfnNamedQuery cfnNamedQuery = CfnNamedQuery.Builder.create(this, "MyCfnNamedQuery")
 * .database("database")
 * .queryString("queryString")
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .workGroup("workGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html)
 */
@CdkDslMarker
public class CfnNamedQueryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNamedQuery.Builder = CfnNamedQuery.Builder.create(scope, id)

  /**
   * The database to which the query belongs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-database)
   * @param database The database to which the query belongs. 
   */
  public fun database(database: String) {
    cdkBuilder.database(database)
  }

  /**
   * The query description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-description)
   * @param description The query description. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The query name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-name)
   * @param name The query name. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The SQL statements that make up the query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-querystring)
   * @param queryString The SQL statements that make up the query. 
   */
  public fun queryString(queryString: String) {
    cdkBuilder.queryString(queryString)
  }

  /**
   * The name of the workgroup that contains the named query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-workgroup)
   * @param workGroup The name of the workgroup that contains the named query. 
   */
  public fun workGroup(workGroup: String) {
    cdkBuilder.workGroup(workGroup)
  }

  public fun build(): CfnNamedQuery = cdkBuilder.build()
}
