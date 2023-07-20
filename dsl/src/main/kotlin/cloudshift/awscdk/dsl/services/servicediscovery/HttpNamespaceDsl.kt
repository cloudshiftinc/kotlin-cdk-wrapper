@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.HttpNamespace
import software.constructs.Construct

@CdkDslMarker
public class HttpNamespaceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: HttpNamespace.Builder = HttpNamespace.Builder.create(scope, id)

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): HttpNamespace = cdkBuilder.build()
}
