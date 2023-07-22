@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnLayerVersion
import software.amazon.awscdk.services.lambda.CfnLayerVersionProps

/**
 * Properties for defining a `CfnLayerVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnLayerVersionProps cfnLayerVersionProps = CfnLayerVersionProps.builder()
 * .content(ContentProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * // the properties below are optional
 * .s3ObjectVersion("s3ObjectVersion")
 * .build())
 * // the properties below are optional
 * .compatibleArchitectures(List.of("compatibleArchitectures"))
 * .compatibleRuntimes(List.of("compatibleRuntimes"))
 * .description("description")
 * .layerName("layerName")
 * .licenseInfo("licenseInfo")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html)
 */
@CdkDslMarker
public class CfnLayerVersionPropsDsl {
  private val cdkBuilder: CfnLayerVersionProps.Builder = CfnLayerVersionProps.builder()

  private val _compatibleArchitectures: MutableList<String> = mutableListOf()

  private val _compatibleRuntimes: MutableList<String> = mutableListOf()

  /**
   * @param compatibleArchitectures A list of compatible [instruction set
   * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
   */
  public fun compatibleArchitectures(vararg compatibleArchitectures: String) {
    _compatibleArchitectures.addAll(listOf(*compatibleArchitectures))
  }

  /**
   * @param compatibleArchitectures A list of compatible [instruction set
   * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
   */
  public fun compatibleArchitectures(compatibleArchitectures: Collection<String>) {
    _compatibleArchitectures.addAll(compatibleArchitectures)
  }

  /**
   * @param compatibleRuntimes A list of compatible [function
   * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for filtering
   * with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html) and
   * [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html) .
   */
  public fun compatibleRuntimes(vararg compatibleRuntimes: String) {
    _compatibleRuntimes.addAll(listOf(*compatibleRuntimes))
  }

  /**
   * @param compatibleRuntimes A list of compatible [function
   * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for filtering
   * with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html) and
   * [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html) .
   */
  public fun compatibleRuntimes(compatibleRuntimes: Collection<String>) {
    _compatibleRuntimes.addAll(compatibleRuntimes)
  }

  /**
   * @param content The function layer archive. 
   */
  public fun content(content: IResolvable) {
    cdkBuilder.content(content)
  }

  /**
   * @param content The function layer archive. 
   */
  public fun content(content: CfnLayerVersion.ContentProperty) {
    cdkBuilder.content(content)
  }

  /**
   * @param description The description of the version.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param layerName The name or Amazon Resource Name (ARN) of the layer.
   */
  public fun layerName(layerName: String) {
    cdkBuilder.layerName(layerName)
  }

  /**
   * @param licenseInfo The layer's software license. It can be any of the following:.
   * * An [SPDX license identifier](https://docs.aws.amazon.com/https://spdx.org/licenses/) . For
   * example, `MIT` .
   * * The URL of a license hosted on the internet. For example,
   * `https://opensource.org/licenses/MIT` .
   * * The full text of the license.
   */
  public fun licenseInfo(licenseInfo: String) {
    cdkBuilder.licenseInfo(licenseInfo)
  }

  public fun build(): CfnLayerVersionProps {
    if(_compatibleArchitectures.isNotEmpty())
        cdkBuilder.compatibleArchitectures(_compatibleArchitectures)
    if(_compatibleRuntimes.isNotEmpty()) cdkBuilder.compatibleRuntimes(_compatibleRuntimes)
    return cdkBuilder.build()
  }
}
