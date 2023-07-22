@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sdb.CfnDomain
import software.constructs.Construct

/**
 * Use the `AWS::SDB::Domain` resource to declare a SimpleDB domain.
 *
 * When you specify `AWS::SDB::Domain` as an argument in a `Ref` function, AWS CloudFormation
 * returns the value of the `DomainName` .
 *
 *
 * The `AWS::SDB::Domain` resource does not allow any updates, including metadata updates.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sdb.*;
 * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sdb-domain.html)
 */
@CdkDslMarker
public class CfnDomainDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

  /**
   * Information about the SimpleDB domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sdb-domain.html#cfn-sdb-domain-description)
   * @param description Information about the SimpleDB domain. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun build(): CfnDomain = cdkBuilder.build()
}
