@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

/**
 * Settings for a secret resource, which references a secret from AWS Secrets Manager .
 *
 * AWS IoT Greengrass stores a local, encrypted copy of the secret on the Greengrass core, where it
 * can be securely accessed by connectors and Lambda functions. For more information, see [Deploy
 * Secrets to the AWS IoT Greengrass
 * Core](https://docs.aws.amazon.com/greengrass/latest/developerguide/secrets.html) in the *Developer
 * Guide* .
 *
 * In an AWS CloudFormation template, `SecretsManagerSecretResourceData` can be used in the
 * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * SecretsManagerSecretResourceDataProperty secretsManagerSecretResourceDataProperty =
 * SecretsManagerSecretResourceDataProperty.builder()
 * .arn("arn")
 * // the properties below are optional
 * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html)
 */
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
