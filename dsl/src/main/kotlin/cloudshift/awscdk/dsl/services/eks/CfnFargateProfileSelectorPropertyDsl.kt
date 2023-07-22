@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnFargateProfile

@CdkDslMarker
public class CfnFargateProfileSelectorPropertyDsl {
  private val cdkBuilder: CfnFargateProfile.SelectorProperty.Builder =
      CfnFargateProfile.SelectorProperty.builder()

  private val _labels: MutableList<Any> = mutableListOf()

  /**
   * @param labels The Kubernetes labels that the selector should match.
   * A pod must contain all of the labels that are specified in the selector for it to be considered
   * a match.
   */
  public fun labels(vararg labels: Any) {
    _labels.addAll(listOf(*labels))
  }

  /**
   * @param labels The Kubernetes labels that the selector should match.
   * A pod must contain all of the labels that are specified in the selector for it to be considered
   * a match.
   */
  public fun labels(labels: Collection<Any>) {
    _labels.addAll(labels)
  }

  /**
   * @param labels The Kubernetes labels that the selector should match.
   * A pod must contain all of the labels that are specified in the selector for it to be considered
   * a match.
   */
  public fun labels(labels: IResolvable) {
    cdkBuilder.labels(labels)
  }

  /**
   * @param namespace The Kubernetes namespace that the selector should match. 
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun build(): CfnFargateProfile.SelectorProperty {
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    return cdkBuilder.build()
  }
}
