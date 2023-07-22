@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotMessageGroupPropertyDsl {
  private val cdkBuilder: CfnBot.MessageGroupProperty.Builder =
      CfnBot.MessageGroupProperty.builder()

  private val _variations: MutableList<Any> = mutableListOf()

  /**
   * @param message The primary message that Amazon Lex should send to the user. 
   */
  public fun message(message: IResolvable) {
    cdkBuilder.message(message)
  }

  /**
   * @param message The primary message that Amazon Lex should send to the user. 
   */
  public fun message(message: CfnBot.MessageProperty) {
    cdkBuilder.message(message)
  }

  /**
   * @param variations Message variations to send to the user.
   * When variations are defined, Amazon Lex chooses the primary message or one of the variations to
   * send to the user.
   */
  public fun variations(vararg variations: Any) {
    _variations.addAll(listOf(*variations))
  }

  /**
   * @param variations Message variations to send to the user.
   * When variations are defined, Amazon Lex chooses the primary message or one of the variations to
   * send to the user.
   */
  public fun variations(variations: Collection<Any>) {
    _variations.addAll(variations)
  }

  /**
   * @param variations Message variations to send to the user.
   * When variations are defined, Amazon Lex chooses the primary message or one of the variations to
   * send to the user.
   */
  public fun variations(variations: IResolvable) {
    cdkBuilder.variations(variations)
  }

  public fun build(): CfnBot.MessageGroupProperty {
    if(_variations.isNotEmpty()) cdkBuilder.variations(_variations)
    return cdkBuilder.build()
  }
}
