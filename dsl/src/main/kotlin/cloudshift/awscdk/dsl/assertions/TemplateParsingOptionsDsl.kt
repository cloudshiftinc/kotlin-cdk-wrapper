@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.assertions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.assertions.TemplateParsingOptions

@CdkDslMarker
public class TemplateParsingOptionsDsl {
  private val cdkBuilder: TemplateParsingOptions.Builder = TemplateParsingOptions.builder()

  public fun skipCyclicalDependenciesCheck(skipCyclicalDependenciesCheck: Boolean) {
    cdkBuilder.skipCyclicalDependenciesCheck(skipCyclicalDependenciesCheck)
  }

  public fun build(): TemplateParsingOptions = cdkBuilder.build()
}
