@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowPrefixConfigPropertyDsl {
  private val cdkBuilder: CfnFlow.PrefixConfigProperty.Builder =
      CfnFlow.PrefixConfigProperty.builder()

  private val _pathPrefixHierarchy: MutableList<String> = mutableListOf()

  /**
   * @param pathPrefixHierarchy the value to be set.
   */
  public fun pathPrefixHierarchy(vararg pathPrefixHierarchy: String) {
    _pathPrefixHierarchy.addAll(listOf(*pathPrefixHierarchy))
  }

  /**
   * @param pathPrefixHierarchy the value to be set.
   */
  public fun pathPrefixHierarchy(pathPrefixHierarchy: Collection<String>) {
    _pathPrefixHierarchy.addAll(pathPrefixHierarchy)
  }

  /**
   * @param prefixFormat Determines the level of granularity for the date and time that's included
   * in the prefix.
   */
  public fun prefixFormat(prefixFormat: String) {
    cdkBuilder.prefixFormat(prefixFormat)
  }

  /**
   * @param prefixType Determines the format of the prefix, and whether it applies to the file name,
   * file path, or both.
   */
  public fun prefixType(prefixType: String) {
    cdkBuilder.prefixType(prefixType)
  }

  public fun build(): CfnFlow.PrefixConfigProperty {
    if(_pathPrefixHierarchy.isNotEmpty()) cdkBuilder.pathPrefixHierarchy(_pathPrefixHierarchy)
    return cdkBuilder.build()
  }
}
