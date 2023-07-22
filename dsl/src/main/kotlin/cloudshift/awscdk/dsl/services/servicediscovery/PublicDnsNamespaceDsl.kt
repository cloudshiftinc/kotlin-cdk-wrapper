@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace
import software.constructs.Construct

@CdkDslMarker
public class PublicDnsNamespaceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: PublicDnsNamespace.Builder = PublicDnsNamespace.Builder.create(scope, id)

  /**
   * A description of the Namespace.
   *
   * Default: none
   *
   * @param description A description of the Namespace. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * A name for the Namespace.
   *
   * @param name A name for the Namespace. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): PublicDnsNamespace = cdkBuilder.build()
}
