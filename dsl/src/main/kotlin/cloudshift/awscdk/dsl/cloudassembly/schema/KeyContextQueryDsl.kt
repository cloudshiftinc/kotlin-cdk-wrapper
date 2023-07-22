@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.KeyContextQuery

/**
 * Query input for looking up a KMS Key.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * KeyContextQuery keyContextQuery = KeyContextQuery.builder()
 * .account("account")
 * .aliasName("aliasName")
 * .region("region")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class KeyContextQueryDsl {
  private val cdkBuilder: KeyContextQuery.Builder = KeyContextQuery.builder()

  /**
   * @param account Query account. 
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  /**
   * @param aliasName Alias name used to search the Key. 
   */
  public fun aliasName(aliasName: String) {
    cdkBuilder.aliasName(aliasName)
  }

  /**
   * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
   */
  public fun lookupRoleArn(lookupRoleArn: String) {
    cdkBuilder.lookupRoleArn(lookupRoleArn)
  }

  /**
   * @param region Query region. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): KeyContextQuery = cdkBuilder.build()
}
