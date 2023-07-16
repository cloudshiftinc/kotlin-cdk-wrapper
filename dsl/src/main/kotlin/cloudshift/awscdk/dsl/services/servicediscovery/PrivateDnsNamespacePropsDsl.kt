@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps

@CdkDslMarker
public class PrivateDnsNamespacePropsDsl {
  private val cdkBuilder: PrivateDnsNamespaceProps.Builder = PrivateDnsNamespaceProps.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): PrivateDnsNamespaceProps = cdkBuilder.build()
}
