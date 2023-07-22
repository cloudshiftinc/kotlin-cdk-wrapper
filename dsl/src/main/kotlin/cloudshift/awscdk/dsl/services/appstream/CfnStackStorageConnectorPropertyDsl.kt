@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appstream.CfnStack

/**
 * A connector that enables persistent storage for users.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * StorageConnectorProperty storageConnectorProperty = StorageConnectorProperty.builder()
 * .connectorType("connectorType")
 * // the properties below are optional
 * .domains(List.of("domains"))
 * .resourceIdentifier("resourceIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html)
 */
@CdkDslMarker
public class CfnStackStorageConnectorPropertyDsl {
  private val cdkBuilder: CfnStack.StorageConnectorProperty.Builder =
      CfnStack.StorageConnectorProperty.builder()

  private val _domains: MutableList<String> = mutableListOf()

  /**
   * @param connectorType The type of storage connector. 
   */
  public fun connectorType(connectorType: String) {
    cdkBuilder.connectorType(connectorType)
  }

  /**
   * @param domains The names of the domains for the account.
   */
  public fun domains(vararg domains: String) {
    _domains.addAll(listOf(*domains))
  }

  /**
   * @param domains The names of the domains for the account.
   */
  public fun domains(domains: Collection<String>) {
    _domains.addAll(domains)
  }

  /**
   * @param resourceIdentifier The ARN of the storage connector.
   */
  public fun resourceIdentifier(resourceIdentifier: String) {
    cdkBuilder.resourceIdentifier(resourceIdentifier)
  }

  public fun build(): CfnStack.StorageConnectorProperty {
    if(_domains.isNotEmpty()) cdkBuilder.domains(_domains)
    return cdkBuilder.build()
  }
}
