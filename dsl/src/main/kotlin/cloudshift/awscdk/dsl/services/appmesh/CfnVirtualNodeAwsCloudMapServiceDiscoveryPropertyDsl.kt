@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeAwsCloudMapServiceDiscoveryPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty.Builder =
      CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty.builder()

  private val _attributes: MutableList<Any> = mutableListOf()

  public fun attributes(vararg attributes: Any) {
    _attributes.addAll(listOf(*attributes))
  }

  public fun attributes(attributes: Collection<Any>) {
    _attributes.addAll(attributes)
  }

  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  public fun ipPreference(ipPreference: String) {
    cdkBuilder.ipPreference(ipPreference)
  }

  public fun namespaceName(namespaceName: String) {
    cdkBuilder.namespaceName(namespaceName)
  }

  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty {
    if(_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
    return cdkBuilder.build()
  }
}
