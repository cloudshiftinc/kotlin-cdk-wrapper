@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

@CdkDslMarker
public class CfnFormFileUploaderFieldConfigPropertyDsl {
  private val cdkBuilder: CfnForm.FileUploaderFieldConfigProperty.Builder =
      CfnForm.FileUploaderFieldConfigProperty.builder()

  private val _acceptedFileTypes: MutableList<String> = mutableListOf()

  public fun acceptedFileTypes(vararg acceptedFileTypes: String) {
    _acceptedFileTypes.addAll(listOf(*acceptedFileTypes))
  }

  public fun acceptedFileTypes(acceptedFileTypes: Collection<String>) {
    _acceptedFileTypes.addAll(acceptedFileTypes)
  }

  public fun accessLevel(accessLevel: String) {
    cdkBuilder.accessLevel(accessLevel)
  }

  public fun isResumable(isResumable: Boolean) {
    cdkBuilder.isResumable(isResumable)
  }

  public fun isResumable(isResumable: IResolvable) {
    cdkBuilder.isResumable(isResumable)
  }

  public fun maxFileCount(maxFileCount: Number) {
    cdkBuilder.maxFileCount(maxFileCount)
  }

  public fun maxSize(maxSize: Number) {
    cdkBuilder.maxSize(maxSize)
  }

  public fun showThumbnails(showThumbnails: Boolean) {
    cdkBuilder.showThumbnails(showThumbnails)
  }

  public fun showThumbnails(showThumbnails: IResolvable) {
    cdkBuilder.showThumbnails(showThumbnails)
  }

  public fun build(): CfnForm.FileUploaderFieldConfigProperty {
    if(_acceptedFileTypes.isNotEmpty()) cdkBuilder.acceptedFileTypes(_acceptedFileTypes)
    return cdkBuilder.build()
  }
}
