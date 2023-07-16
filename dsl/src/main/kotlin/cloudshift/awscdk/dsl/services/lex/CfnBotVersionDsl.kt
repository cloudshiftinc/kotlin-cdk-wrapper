@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnBotVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBotVersion.Builder = CfnBotVersion.Builder.create(scope, id)

  private val _botVersionLocaleSpecification: MutableList<Any> = mutableListOf()

  public fun botId(botId: String) {
    cdkBuilder.botId(botId)
  }

  public fun botVersionLocaleSpecification(vararg botVersionLocaleSpecification: Any) {
    _botVersionLocaleSpecification.addAll(listOf(*botVersionLocaleSpecification))
  }

  public fun botVersionLocaleSpecification(botVersionLocaleSpecification: Collection<Any>) {
    _botVersionLocaleSpecification.addAll(botVersionLocaleSpecification)
  }

  public fun botVersionLocaleSpecification(botVersionLocaleSpecification: IResolvable) {
    cdkBuilder.botVersionLocaleSpecification(botVersionLocaleSpecification)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun build(): CfnBotVersion {
    if(_botVersionLocaleSpecification.isNotEmpty())
        cdkBuilder.botVersionLocaleSpecification(_botVersionLocaleSpecification)
    return cdkBuilder.build()
  }
}
