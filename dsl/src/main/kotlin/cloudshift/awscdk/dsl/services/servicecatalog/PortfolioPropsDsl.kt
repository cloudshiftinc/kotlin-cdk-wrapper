@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.MessageLanguage
import software.amazon.awscdk.services.servicecatalog.PortfolioProps
import software.amazon.awscdk.services.servicecatalog.TagOptions

@CdkDslMarker
public class PortfolioPropsDsl {
  private val cdkBuilder: PortfolioProps.Builder = PortfolioProps.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  public fun messageLanguage(messageLanguage: MessageLanguage) {
    cdkBuilder.messageLanguage(messageLanguage)
  }

  public fun providerName(providerName: String) {
    cdkBuilder.providerName(providerName)
  }

  public fun tagOptions(tagOptions: TagOptions) {
    cdkBuilder.tagOptions(tagOptions)
  }

  public fun build(): PortfolioProps = cdkBuilder.build()
}
