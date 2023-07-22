@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.CfnConfigurationSet

/**
 * An object that contains information about the suppression list preferences for your account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * SuppressionOptionsProperty suppressionOptionsProperty = SuppressionOptionsProperty.builder()
 * .suppressedReasons(List.of("suppressedReasons"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-suppressionoptions.html)
 */
@CdkDslMarker
public class CfnConfigurationSetSuppressionOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.SuppressionOptionsProperty.Builder =
      CfnConfigurationSet.SuppressionOptionsProperty.builder()

  private val _suppressedReasons: MutableList<String> = mutableListOf()

  /**
   * @param suppressedReasons A list that contains the reasons that email addresses are
   * automatically added to the suppression list for your account.
   * This list can contain any or all of the following:
   *
   * * `COMPLAINT` – Amazon SES adds an email address to the suppression list for your account when
   * a message sent to that address results in a complaint.
   * * `BOUNCE` – Amazon SES adds an email address to the suppression list for your account when a
   * message sent to that address results in a hard bounce.
   */
  public fun suppressedReasons(vararg suppressedReasons: String) {
    _suppressedReasons.addAll(listOf(*suppressedReasons))
  }

  /**
   * @param suppressedReasons A list that contains the reasons that email addresses are
   * automatically added to the suppression list for your account.
   * This list can contain any or all of the following:
   *
   * * `COMPLAINT` – Amazon SES adds an email address to the suppression list for your account when
   * a message sent to that address results in a complaint.
   * * `BOUNCE` – Amazon SES adds an email address to the suppression list for your account when a
   * message sent to that address results in a hard bounce.
   */
  public fun suppressedReasons(suppressedReasons: Collection<String>) {
    _suppressedReasons.addAll(suppressedReasons)
  }

  public fun build(): CfnConfigurationSet.SuppressionOptionsProperty {
    if(_suppressedReasons.isNotEmpty()) cdkBuilder.suppressedReasons(_suppressedReasons)
    return cdkBuilder.build()
  }
}
