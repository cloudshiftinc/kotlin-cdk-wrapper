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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDomain

/**
 * The JupyterServer app settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * JupyterServerAppSettingsProperty jupyterServerAppSettingsProperty =
 * JupyterServerAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterserverappsettings.html)
 */
@CdkDslMarker
public class CfnDomainJupyterServerAppSettingsPropertyDsl {
    private val cdkBuilder: CfnDomain.JupyterServerAppSettingsProperty.Builder =
        CfnDomain.JupyterServerAppSettingsProperty.builder()

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
     *   the default SageMaker image used by the JupyterServer app.
     */
    public fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
     *   the default SageMaker image used by the JupyterServer app.
     */
    public fun defaultResourceSpec(defaultResourceSpec: CfnDomain.ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    public fun build(): CfnDomain.JupyterServerAppSettingsProperty = cdkBuilder.build()
}
