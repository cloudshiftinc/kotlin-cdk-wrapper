@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * HttpNamespaceAttributes httpNamespaceAttributes = HttpNamespaceAttributes.builder()
 * .namespaceArn("namespaceArn")
 * .namespaceId("namespaceId")
 * .namespaceName("namespaceName")
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpNamespaceAttributesDsl {
  private val cdkBuilder: HttpNamespaceAttributes.Builder = HttpNamespaceAttributes.builder()

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

  public fun build(): HttpNamespaceAttributes = cdkBuilder.build()
}
