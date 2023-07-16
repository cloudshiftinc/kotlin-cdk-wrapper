@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotImageResponseCardPropertyDsl {
  private val cdkBuilder: CfnBot.ImageResponseCardProperty.Builder =
      CfnBot.ImageResponseCardProperty.builder()

  private val _buttons: MutableList<Any> = mutableListOf()

  public fun buttons(vararg buttons: Any) {
    _buttons.addAll(listOf(*buttons))
  }

  public fun buttons(buttons: Collection<Any>) {
    _buttons.addAll(buttons)
  }

  public fun buttons(buttons: IResolvable) {
    cdkBuilder.buttons(buttons)
  }

  public fun imageUrl(imageUrl: String) {
    cdkBuilder.imageUrl(imageUrl)
  }

  public fun subtitle(subtitle: String) {
    cdkBuilder.subtitle(subtitle)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnBot.ImageResponseCardProperty {
    if(_buttons.isNotEmpty()) cdkBuilder.buttons(_buttons)
    return cdkBuilder.build()
  }
}
