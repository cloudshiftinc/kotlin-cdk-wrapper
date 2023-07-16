@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.ProductStack
import software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps

@CdkDslMarker
public class ProductStackHistoryPropsDsl {
  private val cdkBuilder: ProductStackHistoryProps.Builder = ProductStackHistoryProps.builder()

  public fun currentVersionLocked(currentVersionLocked: Boolean) {
    cdkBuilder.currentVersionLocked(currentVersionLocked)
  }

  public fun currentVersionName(currentVersionName: String) {
    cdkBuilder.currentVersionName(currentVersionName)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun directory(directory: String) {
    cdkBuilder.directory(directory)
  }

  public fun productStack(productStack: ProductStack) {
    cdkBuilder.productStack(productStack)
  }

  public fun validateTemplate(validateTemplate: Boolean) {
    cdkBuilder.validateTemplate(validateTemplate)
  }

  public fun build(): ProductStackHistoryProps = cdkBuilder.build()
}
