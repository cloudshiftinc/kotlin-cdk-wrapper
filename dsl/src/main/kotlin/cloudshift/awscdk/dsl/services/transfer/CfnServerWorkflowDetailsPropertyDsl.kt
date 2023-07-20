@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnServer

@CdkDslMarker
public class CfnServerWorkflowDetailsPropertyDsl {
  private val cdkBuilder: CfnServer.WorkflowDetailsProperty.Builder =
      CfnServer.WorkflowDetailsProperty.builder()

  private val _onPartialUpload: MutableList<Any> = mutableListOf()

  private val _onUpload: MutableList<Any> = mutableListOf()

  public fun onPartialUpload(vararg onPartialUpload: Any) {
    _onPartialUpload.addAll(listOf(*onPartialUpload))
  }

  public fun onPartialUpload(onPartialUpload: Collection<Any>) {
    _onPartialUpload.addAll(onPartialUpload)
  }

  public fun onPartialUpload(onPartialUpload: IResolvable) {
    cdkBuilder.onPartialUpload(onPartialUpload)
  }

  public fun onUpload(vararg onUpload: Any) {
    _onUpload.addAll(listOf(*onUpload))
  }

  public fun onUpload(onUpload: Collection<Any>) {
    _onUpload.addAll(onUpload)
  }

  public fun onUpload(onUpload: IResolvable) {
    cdkBuilder.onUpload(onUpload)
  }

  public fun build(): CfnServer.WorkflowDetailsProperty {
    if(_onPartialUpload.isNotEmpty()) cdkBuilder.onPartialUpload(_onPartialUpload)
    if(_onUpload.isNotEmpty()) cdkBuilder.onUpload(_onUpload)
    return cdkBuilder.build()
  }
}
