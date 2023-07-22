@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sdb.CfnDomainProps

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sdb.*;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sdb-domain.html)
 */
@CdkDslMarker
public class CfnDomainPropsDsl {
  private val cdkBuilder: CfnDomainProps.Builder = CfnDomainProps.builder()

  /**
   * @param description Information about the SimpleDB domain.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun build(): CfnDomainProps = cdkBuilder.build()
}
