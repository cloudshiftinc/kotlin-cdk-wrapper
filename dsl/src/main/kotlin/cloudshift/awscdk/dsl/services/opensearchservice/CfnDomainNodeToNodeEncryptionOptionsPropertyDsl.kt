@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@CdkDslMarker
public class CfnDomainNodeToNodeEncryptionOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder =
      CfnDomain.NodeToNodeEncryptionOptionsProperty.builder()

  /**
   * @param enabled Specifies to enable or disable node-to-node encryption on the domain.
   * Required if you enable fine-grained access control in
   * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
   * .
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specifies to enable or disable node-to-node encryption on the domain.
   * Required if you enable fine-grained access control in
   * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
   * .
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnDomain.NodeToNodeEncryptionOptionsProperty = cdkBuilder.build()
}
