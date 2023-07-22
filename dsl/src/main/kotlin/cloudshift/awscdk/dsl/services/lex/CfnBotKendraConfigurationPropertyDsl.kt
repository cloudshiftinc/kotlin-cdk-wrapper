@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Provides configuration information for the `AMAZON.KendraSearchIntent` intent. When you use this
 * intent, Amazon Lex searches the specified Amazon Kendra index and returns documents from the index
 * that match the user's utterance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * KendraConfigurationProperty kendraConfigurationProperty = KendraConfigurationProperty.builder()
 * .kendraIndex("kendraIndex")
 * // the properties below are optional
 * .queryFilterString("queryFilterString")
 * .queryFilterStringEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-kendraconfiguration.html)
 */
@CdkDslMarker
public class CfnBotKendraConfigurationPropertyDsl {
  private val cdkBuilder: CfnBot.KendraConfigurationProperty.Builder =
      CfnBot.KendraConfigurationProperty.builder()

  /**
   * @param kendraIndex The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the
   * `AMAZON.KendraSearchIntent` intent to search. The index must be in the same account and Region as
   * the Amazon Lex bot. 
   */
  public fun kendraIndex(kendraIndex: String) {
    cdkBuilder.kendraIndex(kendraIndex)
  }

  /**
   * @param queryFilterString A query filter that Amazon Lex sends to Amazon Kendra to filter the
   * response from a query.
   * The filter is in the format defined by Amazon Kendra. For more information, see [Filtering
   * queries](https://docs.aws.amazon.com/kendra/latest/dg/filtering.html) .
   */
  public fun queryFilterString(queryFilterString: String) {
    cdkBuilder.queryFilterString(queryFilterString)
  }

  /**
   * @param queryFilterStringEnabled Determines whether the `AMAZON.KendraSearchIntent` intent uses
   * a custom query string to query the Amazon Kendra index.
   */
  public fun queryFilterStringEnabled(queryFilterStringEnabled: Boolean) {
    cdkBuilder.queryFilterStringEnabled(queryFilterStringEnabled)
  }

  /**
   * @param queryFilterStringEnabled Determines whether the `AMAZON.KendraSearchIntent` intent uses
   * a custom query string to query the Amazon Kendra index.
   */
  public fun queryFilterStringEnabled(queryFilterStringEnabled: IResolvable) {
    cdkBuilder.queryFilterStringEnabled(queryFilterStringEnabled)
  }

  public fun build(): CfnBot.KendraConfigurationProperty = cdkBuilder.build()
}
