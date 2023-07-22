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

  /**
   * @param attributes A string map that contains attributes with values that you can use to filter
   * instances by any custom attribute that you specified when you registered the instance.
   * Only instances that match all of the specified key/value pairs will be returned.
   */
  public fun attributes(vararg attributes: Any) {
    _attributes.addAll(listOf(*attributes))
  }

  /**
   * @param attributes A string map that contains attributes with values that you can use to filter
   * instances by any custom attribute that you specified when you registered the instance.
   * Only instances that match all of the specified key/value pairs will be returned.
   */
  public fun attributes(attributes: Collection<Any>) {
    _attributes.addAll(attributes)
  }

  /**
   * @param attributes A string map that contains attributes with values that you can use to filter
   * instances by any custom attribute that you specified when you registered the instance.
   * Only instances that match all of the specified key/value pairs will be returned.
   */
  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * @param ipPreference The preferred IP version that this virtual node uses.
   * Setting the IP preference on the virtual node only overrides the IP preference set for the mesh
   * on this specific node.
   */
  public fun ipPreference(ipPreference: String) {
    cdkBuilder.ipPreference(ipPreference)
  }

  /**
   * @param namespaceName The HTTP name of the AWS Cloud Map namespace to use. 
   */
  public fun namespaceName(namespaceName: String) {
    cdkBuilder.namespaceName(namespaceName)
  }

  /**
   * @param serviceName The name of the AWS Cloud Map service to use. 
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty {
    if(_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
    return cdkBuilder.build()
  }
}
