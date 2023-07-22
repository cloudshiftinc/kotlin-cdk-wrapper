@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps

@CdkDslMarker
public class BaseNamespacePropsDsl {
  private val cdkBuilder: BaseNamespaceProps.Builder = BaseNamespaceProps.builder()

  /**
   * @param description A description of the Namespace.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name A name for the Namespace. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): BaseNamespaceProps = cdkBuilder.build()
}
