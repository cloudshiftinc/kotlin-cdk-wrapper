@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceAttributes

@CdkDslMarker
public class PrivateDnsNamespaceAttributesDsl {
  private val cdkBuilder: PrivateDnsNamespaceAttributes.Builder =
      PrivateDnsNamespaceAttributes.builder()

  /**
   * @param namespaceArn Namespace ARN for the Namespace. 
   */
  public fun namespaceArn(namespaceArn: String) {
    cdkBuilder.namespaceArn(namespaceArn)
  }

  /**
   * @param namespaceId Namespace Id for the Namespace. 
   */
  public fun namespaceId(namespaceId: String) {
    cdkBuilder.namespaceId(namespaceId)
  }

  /**
   * @param namespaceName A name for the Namespace. 
   */
  public fun namespaceName(namespaceName: String) {
    cdkBuilder.namespaceName(namespaceName)
  }

  public fun build(): PrivateDnsNamespaceAttributes = cdkBuilder.build()
}
