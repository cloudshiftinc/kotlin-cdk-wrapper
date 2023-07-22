@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps

@CdkDslMarker
public class HttpNamespacePropsDsl {
  private val cdkBuilder: HttpNamespaceProps.Builder = HttpNamespaceProps.builder()

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

  public fun build(): HttpNamespaceProps = cdkBuilder.build()
}
