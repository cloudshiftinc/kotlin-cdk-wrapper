@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.servicecatalog.MessageLanguage
import software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions

@CdkDslMarker
public class PortfolioShareOptionsDsl {
  private val cdkBuilder: PortfolioShareOptions.Builder = PortfolioShareOptions.builder()

  public fun messageLanguage(messageLanguage: MessageLanguage) {
    cdkBuilder.messageLanguage(messageLanguage)
  }

  public fun shareTagOptions(shareTagOptions: Boolean) {
    cdkBuilder.shareTagOptions(shareTagOptions)
  }

  public fun build(): PortfolioShareOptions = cdkBuilder.build()
}
