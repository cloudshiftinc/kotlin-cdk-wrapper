@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.macie.CfnAllowList

@CdkDslMarker
public class CfnAllowListCriteriaPropertyDsl {
  private val cdkBuilder: CfnAllowList.CriteriaProperty.Builder =
      CfnAllowList.CriteriaProperty.builder()

  /**
   * @param regex The regular expression ( *regex* ) that defines the text pattern to ignore.
   * The expression can contain 1-512 characters.
   */
  public fun regex(regex: String) {
    cdkBuilder.regex(regex)
  }

  /**
   * @param s3WordsList The location and name of an Amazon S3 object that lists specific text to
   * ignore.
   */
  public fun s3WordsList(s3WordsList: IResolvable) {
    cdkBuilder.s3WordsList(s3WordsList)
  }

  /**
   * @param s3WordsList The location and name of an Amazon S3 object that lists specific text to
   * ignore.
   */
  public fun s3WordsList(s3WordsList: CfnAllowList.S3WordsListProperty) {
    cdkBuilder.s3WordsList(s3WordsList)
  }

  public fun build(): CfnAllowList.CriteriaProperty = cdkBuilder.build()
}
