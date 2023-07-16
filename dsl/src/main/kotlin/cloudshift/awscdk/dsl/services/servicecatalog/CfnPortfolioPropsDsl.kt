@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps

@CdkDslMarker
public class CfnPortfolioPropsDsl {
  private val cdkBuilder: CfnPortfolioProps.Builder = CfnPortfolioProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  public fun providerName(providerName: String) {
    cdkBuilder.providerName(providerName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPortfolioProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
