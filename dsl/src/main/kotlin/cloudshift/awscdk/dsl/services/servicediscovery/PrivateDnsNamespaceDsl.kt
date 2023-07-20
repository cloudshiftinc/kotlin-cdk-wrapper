@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace
import software.constructs.Construct

@CdkDslMarker
public class PrivateDnsNamespaceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: PrivateDnsNamespace.Builder = PrivateDnsNamespace.Builder.create(scope,
      id)

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): PrivateDnsNamespace = cdkBuilder.build()
}
