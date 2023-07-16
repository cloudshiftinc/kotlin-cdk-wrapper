@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.CatchProps

@CdkDslMarker
public class CatchPropsDsl {
  private val cdkBuilder: CatchProps.Builder = CatchProps.builder()

  private val _errors: MutableList<String> = mutableListOf()

  public fun errors(vararg errors: String) {
    _errors.addAll(listOf(*errors))
  }

  public fun errors(errors: Collection<String>) {
    _errors.addAll(errors)
  }

  public fun resultPath(resultPath: String) {
    cdkBuilder.resultPath(resultPath)
  }

  public fun build(): CatchProps {
    if(_errors.isNotEmpty()) cdkBuilder.errors(_errors)
    return cdkBuilder.build()
  }
}
