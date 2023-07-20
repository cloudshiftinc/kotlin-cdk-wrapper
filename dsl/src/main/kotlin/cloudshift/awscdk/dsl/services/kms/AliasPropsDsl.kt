@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.kms.AliasProps
import software.amazon.awscdk.services.kms.IKey

@CdkDslMarker
public class AliasPropsDsl {
  private val cdkBuilder: AliasProps.Builder = AliasProps.builder()

  public fun aliasName(aliasName: String) {
    cdkBuilder.aliasName(aliasName)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun targetKey(targetKey: IKey) {
    cdkBuilder.targetKey(targetKey)
  }

  public fun build(): AliasProps = cdkBuilder.build()
}
