@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.MessageLanguage
import software.amazon.awscdk.services.servicecatalog.Portfolio
import software.amazon.awscdk.services.servicecatalog.TagOptions
import software.constructs.Construct

@CdkDslMarker
public class PortfolioDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Portfolio.Builder = Portfolio.Builder.create(scope, id)

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

  public fun build(): Portfolio = cdkBuilder.build()
}
