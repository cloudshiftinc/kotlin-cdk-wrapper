@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

@CdkDslMarker
public class CfnResourceDefinitionSecretsManagerSecretResourceDataPropertyDsl {
  private val cdkBuilder: CfnResourceDefinition.SecretsManagerSecretResourceDataProperty.Builder =
      CfnResourceDefinition.SecretsManagerSecretResourceDataProperty.builder()

  private val _additionalStagingLabelsToDownload: MutableList<String> = mutableListOf()

  /**
   * @param additionalStagingLabelsToDownload The staging labels whose values you want to make
   * available on the core, in addition to `AWSCURRENT` .
   */
  public fun additionalStagingLabelsToDownload(vararg additionalStagingLabelsToDownload: String) {
    _additionalStagingLabelsToDownload.addAll(listOf(*additionalStagingLabelsToDownload))
  }

  /**
   * @param additionalStagingLabelsToDownload The staging labels whose values you want to make
   * available on the core, in addition to `AWSCURRENT` .
   */
  public
      fun additionalStagingLabelsToDownload(additionalStagingLabelsToDownload: Collection<String>) {
    _additionalStagingLabelsToDownload.addAll(additionalStagingLabelsToDownload)
  }

  /**
   * @param arn The Amazon Resource Name (ARN) of the Secrets Manager secret to make available on
   * the core. 
   * The value of the secret's latest version (represented by the `AWSCURRENT` staging label) is
   * included by default.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnResourceDefinition.SecretsManagerSecretResourceDataProperty {
    if(_additionalStagingLabelsToDownload.isNotEmpty())
        cdkBuilder.additionalStagingLabelsToDownload(_additionalStagingLabelsToDownload)
    return cdkBuilder.build()
  }
}
