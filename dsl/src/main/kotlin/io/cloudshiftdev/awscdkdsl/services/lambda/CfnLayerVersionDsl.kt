@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnLayerVersion
import software.constructs.Construct

/**
 * The `AWS::Lambda::LayerVersion` resource creates a
 * [Lambda layer](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) from a ZIP
 * archive.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnLayerVersion cfnLayerVersion = CfnLayerVersion.Builder.create(this, "MyCfnLayerVersion")
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
public class CfnLayerVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLayerVersion.Builder = CfnLayerVersion.Builder.create(scope, id)

    private val _compatibleArchitectures: MutableList<String> = mutableListOf()

    private val _compatibleRuntimes: MutableList<String> = mutableListOf()

    /**
     * A list of compatible
     * [instruction set architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatiblearchitectures)
     *
     * @param compatibleArchitectures A list of compatible
     *   [instruction set architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html)
     *   .
     */
    public fun compatibleArchitectures(vararg compatibleArchitectures: String) {
        _compatibleArchitectures.addAll(listOf(*compatibleArchitectures))
    }

    /**
     * A list of compatible
     * [instruction set architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatiblearchitectures)
     *
     * @param compatibleArchitectures A list of compatible
     *   [instruction set architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html)
     *   .
     */
    public fun compatibleArchitectures(compatibleArchitectures: Collection<String>) {
        _compatibleArchitectures.addAll(compatibleArchitectures)
    }

    /**
     * A list of compatible
     * [function runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used
     * for filtering with
     * [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html) and
     * [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatibleruntimes)
     *
     * @param compatibleRuntimes A list of compatible
     *   [function runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) .
     *   Used for filtering with
     *   [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html) and
     *   [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     *   .
     */
    public fun compatibleRuntimes(vararg compatibleRuntimes: String) {
        _compatibleRuntimes.addAll(listOf(*compatibleRuntimes))
    }

    /**
     * A list of compatible
     * [function runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used
     * for filtering with
     * [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html) and
     * [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatibleruntimes)
     *
     * @param compatibleRuntimes A list of compatible
     *   [function runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) .
     *   Used for filtering with
     *   [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html) and
     *   [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     *   .
     */
    public fun compatibleRuntimes(compatibleRuntimes: Collection<String>) {
        _compatibleRuntimes.addAll(compatibleRuntimes)
    }

    /**
     * The function layer archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-content)
     *
     * @param content The function layer archive.
     */
    public fun content(content: IResolvable) {
        cdkBuilder.content(content)
    }

    /**
     * The function layer archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-content)
     *
     * @param content The function layer archive.
     */
    public fun content(content: CfnLayerVersion.ContentProperty) {
        cdkBuilder.content(content)
    }

    /**
     * The description of the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-description)
     *
     * @param description The description of the version.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name or Amazon Resource Name (ARN) of the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-layername)
     *
     * @param layerName The name or Amazon Resource Name (ARN) of the layer.
     */
    public fun layerName(layerName: String) {
        cdkBuilder.layerName(layerName)
    }

    /**
     * The layer's software license. It can be any of the following:.
     * * An [SPDX license identifier](https://docs.aws.amazon.com/https://spdx.org/licenses/) . For
     *   example, `MIT` .
     * * The URL of a license hosted on the internet. For example,
     *   `https://opensource.org/licenses/MIT` .
     * * The full text of the license.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-licenseinfo)
     *
     * @param licenseInfo The layer's software license. It can be any of the following:.
     */
    public fun licenseInfo(licenseInfo: String) {
        cdkBuilder.licenseInfo(licenseInfo)
    }

    public fun build(): CfnLayerVersion {
        if (_compatibleArchitectures.isNotEmpty())
            cdkBuilder.compatibleArchitectures(_compatibleArchitectures)
        if (_compatibleRuntimes.isNotEmpty()) cdkBuilder.compatibleRuntimes(_compatibleRuntimes)
        return cdkBuilder.build()
    }
}
