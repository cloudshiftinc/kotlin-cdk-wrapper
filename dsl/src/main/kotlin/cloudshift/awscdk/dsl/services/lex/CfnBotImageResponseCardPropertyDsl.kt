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

  /**
   * @param buttons A list of buttons that should be displayed on the response card.
   * The arrangement of the buttons is determined by the platform that displays the button.
   */
  public fun buttons(vararg buttons: Any) {
    _buttons.addAll(listOf(*buttons))
  }

  /**
   * @param buttons A list of buttons that should be displayed on the response card.
   * The arrangement of the buttons is determined by the platform that displays the button.
   */
  public fun buttons(buttons: Collection<Any>) {
    _buttons.addAll(buttons)
  }

  /**
   * @param buttons A list of buttons that should be displayed on the response card.
   * The arrangement of the buttons is determined by the platform that displays the button.
   */
  public fun buttons(buttons: IResolvable) {
    cdkBuilder.buttons(buttons)
  }

  /**
   * @param imageUrl The URL of an image to display on the response card.
   * The image URL must be publicly available so that the platform displaying the response card has
   * access to the image.
   */
  public fun imageUrl(imageUrl: String) {
    cdkBuilder.imageUrl(imageUrl)
  }

  /**
   * @param subtitle The subtitle to display on the response card.
   * The format of the subtitle is determined by the platform displaying the response card.
   */
  public fun subtitle(subtitle: String) {
    cdkBuilder.subtitle(subtitle)
  }

  /**
   * @param title The title to display on the response card. 
   * The format of the title is determined by the platform displaying the response card.
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnBot.ImageResponseCardProperty {
    if(_buttons.isNotEmpty()) cdkBuilder.buttons(_buttons)
    return cdkBuilder.build()
  }
}
