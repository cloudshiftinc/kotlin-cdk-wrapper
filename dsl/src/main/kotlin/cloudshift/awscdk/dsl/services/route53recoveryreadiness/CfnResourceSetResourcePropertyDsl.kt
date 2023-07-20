@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet

@CdkDslMarker
public class CfnResourceSetResourcePropertyDsl {
  private val cdkBuilder: CfnResourceSet.ResourceProperty.Builder =
      CfnResourceSet.ResourceProperty.builder()

  private val _readinessScopes: MutableList<String> = mutableListOf()

  public fun componentId(componentId: String) {
    cdkBuilder.componentId(componentId)
  }

  public fun dnsTargetResource(dnsTargetResource: IResolvable) {
    cdkBuilder.dnsTargetResource(dnsTargetResource)
  }

  public fun dnsTargetResource(dnsTargetResource: CfnResourceSet.DNSTargetResourceProperty) {
    cdkBuilder.dnsTargetResource(dnsTargetResource)
  }

  public fun readinessScopes(vararg readinessScopes: String) {
    _readinessScopes.addAll(listOf(*readinessScopes))
  }

  public fun readinessScopes(readinessScopes: Collection<String>) {
    _readinessScopes.addAll(readinessScopes)
  }

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnResourceSet.ResourceProperty {
    if(_readinessScopes.isNotEmpty()) cdkBuilder.readinessScopes(_readinessScopes)
    return cdkBuilder.build()
  }
}
