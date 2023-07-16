@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@CdkDslMarker
public class CfnConfigurationSetSuppressionOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.SuppressionOptionsProperty.Builder =
      CfnConfigurationSet.SuppressionOptionsProperty.builder()

  private val _suppressedReasons: MutableList<String> = mutableListOf()

  public fun suppressedReasons(vararg suppressedReasons: String) {
    _suppressedReasons.addAll(listOf(*suppressedReasons))
  }

  public fun suppressedReasons(suppressedReasons: Collection<String>) {
    _suppressedReasons.addAll(suppressedReasons)
  }

  public fun build(): CfnConfigurationSet.SuppressionOptionsProperty {
    if(_suppressedReasons.isNotEmpty()) cdkBuilder.suppressedReasons(_suppressedReasons)
    return cdkBuilder.build()
  }
}
