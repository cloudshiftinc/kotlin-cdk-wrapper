@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.KeyContextQuery

@CdkDslMarker
public class KeyContextQueryDsl {
  private val cdkBuilder: KeyContextQuery.Builder = KeyContextQuery.builder()

  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  public fun aliasName(aliasName: String) {
    cdkBuilder.aliasName(aliasName)
  }

  public fun lookupRoleArn(lookupRoleArn: String) {
    cdkBuilder.lookupRoleArn(lookupRoleArn)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): KeyContextQuery = cdkBuilder.build()
}
