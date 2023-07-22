@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

@CdkDslMarker
public class CfnThemeTypographyPropertyDsl {
  private val cdkBuilder: CfnTheme.TypographyProperty.Builder =
      CfnTheme.TypographyProperty.builder()

  private val _fontFamilies: MutableList<Any> = mutableListOf()

  /**
   * @param fontFamilies the value to be set.
   */
  public fun fontFamilies(vararg fontFamilies: Any) {
    _fontFamilies.addAll(listOf(*fontFamilies))
  }

  /**
   * @param fontFamilies the value to be set.
   */
  public fun fontFamilies(fontFamilies: Collection<Any>) {
    _fontFamilies.addAll(fontFamilies)
  }

  /**
   * @param fontFamilies the value to be set.
   */
  public fun fontFamilies(fontFamilies: IResolvable) {
    cdkBuilder.fontFamilies(fontFamilies)
  }

  public fun build(): CfnTheme.TypographyProperty {
    if(_fontFamilies.isNotEmpty()) cdkBuilder.fontFamilies(_fontFamilies)
    return cdkBuilder.build()
  }
}
