@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnFrameworkProps

@CdkDslMarker
public class CfnFrameworkPropsDsl {
  private val cdkBuilder: CfnFrameworkProps.Builder = CfnFrameworkProps.builder()

  private val _frameworkControls: MutableList<Any> = mutableListOf()

  private val _frameworkTags: MutableList<Any> = mutableListOf()

  public fun frameworkControls(vararg frameworkControls: Any) {
    _frameworkControls.addAll(listOf(*frameworkControls))
  }

  public fun frameworkControls(frameworkControls: Collection<Any>) {
    _frameworkControls.addAll(frameworkControls)
  }

  public fun frameworkControls(frameworkControls: IResolvable) {
    cdkBuilder.frameworkControls(frameworkControls)
  }

  public fun frameworkDescription(frameworkDescription: String) {
    cdkBuilder.frameworkDescription(frameworkDescription)
  }

  public fun frameworkName(frameworkName: String) {
    cdkBuilder.frameworkName(frameworkName)
  }

  public fun frameworkTags(vararg frameworkTags: Any) {
    _frameworkTags.addAll(listOf(*frameworkTags))
  }

  public fun frameworkTags(frameworkTags: Collection<Any>) {
    _frameworkTags.addAll(frameworkTags)
  }

  public fun frameworkTags(frameworkTags: IResolvable) {
    cdkBuilder.frameworkTags(frameworkTags)
  }

  public fun build(): CfnFrameworkProps {
    if(_frameworkControls.isNotEmpty()) cdkBuilder.frameworkControls(_frameworkControls)
    if(_frameworkTags.isNotEmpty()) cdkBuilder.frameworkTags(_frameworkTags)
    return cdkBuilder.build()
  }
}
