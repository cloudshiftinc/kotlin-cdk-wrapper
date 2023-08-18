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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps

/**
 * Properties for defining a `CfnAppImageConfig`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnAppImageConfigProps cfnAppImageConfigProps = CfnAppImageConfigProps.builder()
 * .appImageConfigName("appImageConfigName")
 * // the properties below are optional
 * .kernelGatewayImageConfig(KernelGatewayImageConfigProperty.builder()
 * .kernelSpecs(List.of(KernelSpecProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .displayName("displayName")
 * .build()))
 * // the properties below are optional
 * .fileSystemConfig(FileSystemConfigProperty.builder()
 * .defaultGid(123)
 * .defaultUid(123)
 * .mountPath("mountPath")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html)
 */
@CdkDslMarker
public class CfnAppImageConfigPropsDsl {
    private val cdkBuilder: CfnAppImageConfigProps.Builder = CfnAppImageConfigProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param appImageConfigName The name of the AppImageConfig. Must be unique to your account. */
    public fun appImageConfigName(appImageConfigName: String) {
        cdkBuilder.appImageConfigName(appImageConfigName)
    }

    /**
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     *   SageMaker image.
     */
    public fun kernelGatewayImageConfig(kernelGatewayImageConfig: IResolvable) {
        cdkBuilder.kernelGatewayImageConfig(kernelGatewayImageConfig)
    }

    /**
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     *   SageMaker image.
     */
    public fun kernelGatewayImageConfig(
        kernelGatewayImageConfig: CfnAppImageConfig.KernelGatewayImageConfigProperty
    ) {
        cdkBuilder.kernelGatewayImageConfig(kernelGatewayImageConfig)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAppImageConfigProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
