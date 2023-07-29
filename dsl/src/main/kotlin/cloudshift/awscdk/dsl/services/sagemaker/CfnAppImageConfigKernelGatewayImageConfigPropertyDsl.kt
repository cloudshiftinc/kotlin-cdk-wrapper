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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

/**
 * The configuration for the file system and kernels in a SageMaker image running as a KernelGateway
 * app.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * KernelGatewayImageConfigProperty kernelGatewayImageConfigProperty =
 * KernelGatewayImageConfigProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-kernelgatewayimageconfig.html)
 */
@CdkDslMarker
public class CfnAppImageConfigKernelGatewayImageConfigPropertyDsl {
    private val cdkBuilder: CfnAppImageConfig.KernelGatewayImageConfigProperty.Builder =
        CfnAppImageConfig.KernelGatewayImageConfigProperty.builder()

    private val _kernelSpecs: MutableList<Any> = mutableListOf()

    /**
     * @param fileSystemConfig The Amazon Elastic File System (EFS) storage configuration for a
     *   SageMaker image.
     */
    public fun fileSystemConfig(fileSystemConfig: IResolvable) {
        cdkBuilder.fileSystemConfig(fileSystemConfig)
    }

    /**
     * @param fileSystemConfig The Amazon Elastic File System (EFS) storage configuration for a
     *   SageMaker image.
     */
    public fun fileSystemConfig(fileSystemConfig: CfnAppImageConfig.FileSystemConfigProperty) {
        cdkBuilder.fileSystemConfig(fileSystemConfig)
    }

    /** @param kernelSpecs The specification of the Jupyter kernels in the image. */
    public fun kernelSpecs(vararg kernelSpecs: Any) {
        _kernelSpecs.addAll(listOf(*kernelSpecs))
    }

    /** @param kernelSpecs The specification of the Jupyter kernels in the image. */
    public fun kernelSpecs(kernelSpecs: Collection<Any>) {
        _kernelSpecs.addAll(kernelSpecs)
    }

    /** @param kernelSpecs The specification of the Jupyter kernels in the image. */
    public fun kernelSpecs(kernelSpecs: IResolvable) {
        cdkBuilder.kernelSpecs(kernelSpecs)
    }

    public fun build(): CfnAppImageConfig.KernelGatewayImageConfigProperty {
        if (_kernelSpecs.isNotEmpty()) cdkBuilder.kernelSpecs(_kernelSpecs)
        return cdkBuilder.build()
    }
}
