@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrcontainers

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster
import software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps

@CdkDslMarker
public class CfnVirtualClusterPropsDsl {
  private val cdkBuilder: CfnVirtualClusterProps.Builder = CfnVirtualClusterProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param containerProvider The container provider of the virtual cluster. 
   */
  public fun containerProvider(containerProvider: IResolvable) {
    cdkBuilder.containerProvider(containerProvider)
  }

  /**
   * @param containerProvider The container provider of the virtual cluster. 
   */
  public fun containerProvider(containerProvider: CfnVirtualCluster.ContainerProviderProperty) {
    cdkBuilder.containerProvider(containerProvider)
  }

  /**
   * @param name The name of the virtual cluster. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnVirtualClusterProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
