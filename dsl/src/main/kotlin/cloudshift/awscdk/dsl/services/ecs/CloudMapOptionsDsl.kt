@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.ContainerDefinition
import software.amazon.awscdk.services.servicediscovery.DnsRecordType
import software.amazon.awscdk.services.servicediscovery.INamespace

@CdkDslMarker
public class CloudMapOptionsDsl {
  private val cdkBuilder: CloudMapOptions.Builder = CloudMapOptions.builder()

  public fun cloudMapNamespace(cloudMapNamespace: INamespace) {
    cdkBuilder.cloudMapNamespace(cloudMapNamespace)
  }

  public fun container(container: ContainerDefinition) {
    cdkBuilder.container(container)
  }

  public fun containerPort(containerPort: Number) {
    cdkBuilder.containerPort(containerPort)
  }

  public fun dnsRecordType(dnsRecordType: DnsRecordType) {
    cdkBuilder.dnsRecordType(dnsRecordType)
  }

  public fun dnsTtl(dnsTtl: Duration) {
    cdkBuilder.dnsTtl(dnsTtl)
  }

  public fun failureThreshold(failureThreshold: Number) {
    cdkBuilder.failureThreshold(failureThreshold)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CloudMapOptions = cdkBuilder.build()
}
