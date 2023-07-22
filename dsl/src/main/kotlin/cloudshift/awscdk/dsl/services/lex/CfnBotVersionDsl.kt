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

  /**
   * The unique identifier of the bot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botid)
   * @param botId The unique identifier of the bot. 
   */
  public fun botId(botId: String) {
    cdkBuilder.botId(botId)
  }

  /**
   * Specifies the locales that Amazon Lex adds to this version.
   *
   * You can choose the Draft version or any other previously published version for each locale.
   * When you specify a source version, the locale data is copied from the source version to the new
   * version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botversionlocalespecification)
   * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
   * version. 
   */
  public fun botVersionLocaleSpecification(vararg botVersionLocaleSpecification: Any) {
    _botVersionLocaleSpecification.addAll(listOf(*botVersionLocaleSpecification))
  }

  /**
   * Specifies the locales that Amazon Lex adds to this version.
   *
   * You can choose the Draft version or any other previously published version for each locale.
   * When you specify a source version, the locale data is copied from the source version to the new
   * version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botversionlocalespecification)
   * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
   * version. 
   */
  public fun botVersionLocaleSpecification(botVersionLocaleSpecification: Collection<Any>) {
    _botVersionLocaleSpecification.addAll(botVersionLocaleSpecification)
  }

  /**
   * Specifies the locales that Amazon Lex adds to this version.
   *
   * You can choose the Draft version or any other previously published version for each locale.
   * When you specify a source version, the locale data is copied from the source version to the new
   * version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botversionlocalespecification)
   * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
   * version. 
   */
  public fun botVersionLocaleSpecification(botVersionLocaleSpecification: IResolvable) {
    cdkBuilder.botVersionLocaleSpecification(botVersionLocaleSpecification)
  }

  /**
   * The description of the version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-description)
   * @param description The description of the version. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun build(): CfnBotVersion {
    if(_botVersionLocaleSpecification.isNotEmpty())
        cdkBuilder.botVersionLocaleSpecification(_botVersionLocaleSpecification)
    return cdkBuilder.build()
  }
}
