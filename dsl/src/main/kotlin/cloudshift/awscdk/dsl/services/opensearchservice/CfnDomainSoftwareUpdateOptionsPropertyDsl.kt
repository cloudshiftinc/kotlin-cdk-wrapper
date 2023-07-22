@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * Options for configuring service software updates for a domain.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * SoftwareUpdateOptionsProperty softwareUpdateOptionsProperty =
 * SoftwareUpdateOptionsProperty.builder()
 * .autoSoftwareUpdateEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-softwareupdateoptions.html)
 */
@CdkDslMarker
public class CfnDomainSoftwareUpdateOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.SoftwareUpdateOptionsProperty.Builder =
      CfnDomain.SoftwareUpdateOptionsProperty.builder()

  /**
   * @param autoSoftwareUpdateEnabled Specifies whether automatic service software updates are
   * enabled for the domain.
   */
  public fun autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled: Boolean) {
    cdkBuilder.autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled)
  }

  /**
   * @param autoSoftwareUpdateEnabled Specifies whether automatic service software updates are
   * enabled for the domain.
   */
  public fun autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled: IResolvable) {
    cdkBuilder.autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled)
  }

  public fun build(): CfnDomain.SoftwareUpdateOptionsProperty = cdkBuilder.build()
}
