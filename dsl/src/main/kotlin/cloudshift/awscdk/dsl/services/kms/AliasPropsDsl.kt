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

  /**
   * @param aliasName The name of the alias. 
   * The name must start with alias followed by a
   * forward slash, such as alias/. You can't specify aliases that begin with
   * alias/AWS. These aliases are reserved.
   */
  public fun aliasName(aliasName: String) {
    cdkBuilder.aliasName(aliasName)
  }

  /**
   * @param removalPolicy Policy to apply when the alias is removed from this stack.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * @param targetKey The ID of the key for which you are creating the alias. 
   * Specify the key's
   * globally unique identifier or Amazon Resource Name (ARN). You can't
   * specify another alias.
   */
  public fun targetKey(targetKey: IKey) {
    cdkBuilder.targetKey(targetKey)
  }

  public fun build(): AliasProps = cdkBuilder.build()
}
