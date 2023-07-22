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

  /**
   * @param acceptLanguage The language code.
   * * `jp` - Japanese
   * * `zh` - Chinese
   */
  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  /**
   * @param description The description of the portfolio.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param displayName The name to use for display purposes. 
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * @param providerName The name of the portfolio provider. 
   */
  public fun providerName(providerName: String) {
    cdkBuilder.providerName(providerName)
  }

  /**
   * @param tags One or more tags.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags One or more tags.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPortfolioProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
