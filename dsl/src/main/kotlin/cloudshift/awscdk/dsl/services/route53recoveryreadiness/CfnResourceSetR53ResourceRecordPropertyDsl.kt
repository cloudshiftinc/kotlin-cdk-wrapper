@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet

/**
 * The Amazon Route 53 resource that a DNS target resource record points to.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoveryreadiness.*;
 * R53ResourceRecordProperty r53ResourceRecordProperty = R53ResourceRecordProperty.builder()
 * .domainName("domainName")
 * .recordSetId("recordSetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-r53resourcerecord.html)
 */
@CdkDslMarker
public class CfnResourceSetR53ResourceRecordPropertyDsl {
  private val cdkBuilder: CfnResourceSet.R53ResourceRecordProperty.Builder =
      CfnResourceSet.R53ResourceRecordProperty.builder()

  /**
   * @param domainName The DNS target domain name.
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param recordSetId The Amazon Route 53 Resource Record Set ID.
   */
  public fun recordSetId(recordSetId: String) {
    cdkBuilder.recordSetId(recordSetId)
  }

  public fun build(): CfnResourceSet.R53ResourceRecordProperty = cdkBuilder.build()
}
