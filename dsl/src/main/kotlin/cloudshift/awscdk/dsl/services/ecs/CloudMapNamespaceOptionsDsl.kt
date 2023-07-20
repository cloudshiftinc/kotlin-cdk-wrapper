@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions
import software.amazon.awscdk.services.servicediscovery.NamespaceType

@CdkDslMarker
public class CloudMapNamespaceOptionsDsl {
  private val cdkBuilder: CloudMapNamespaceOptions.Builder = CloudMapNamespaceOptions.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun type(type: NamespaceType) {
    cdkBuilder.type(type)
  }

  public fun useForServiceConnect(useForServiceConnect: Boolean) {
    cdkBuilder.useForServiceConnect(useForServiceConnect)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): CloudMapNamespaceOptions = cdkBuilder.build()
}
