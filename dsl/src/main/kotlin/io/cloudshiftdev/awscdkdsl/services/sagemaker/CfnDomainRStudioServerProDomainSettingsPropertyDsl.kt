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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDomain

/**
 * A collection of settings that configure the `RStudioServerPro` Domain-level app.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * RStudioServerProDomainSettingsProperty rStudioServerProDomainSettingsProperty =
 * RStudioServerProDomainSettingsProperty.builder()
 * .domainExecutionRoleArn("domainExecutionRoleArn")
 * // the properties below are optional
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .rStudioConnectUrl("rStudioConnectUrl")
 * .rStudioPackageManagerUrl("rStudioPackageManagerUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverprodomainsettings.html)
 */
@CdkDslMarker
public class CfnDomainRStudioServerProDomainSettingsPropertyDsl {
    private val cdkBuilder: CfnDomain.RStudioServerProDomainSettingsProperty.Builder =
        CfnDomain.RStudioServerProDomainSettingsProperty.builder()

    /**
     * @param defaultResourceSpec A collection that defines the default `InstanceType` ,
     *   `SageMakerImageArn` , and `SageMakerImageVersionArn` for the Domain.
     */
    public fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    /**
     * @param defaultResourceSpec A collection that defines the default `InstanceType` ,
     *   `SageMakerImageArn` , and `SageMakerImageVersionArn` for the Domain.
     */
    public fun defaultResourceSpec(defaultResourceSpec: CfnDomain.ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    /**
     * @param domainExecutionRoleArn The ARN of the execution role for the `RStudioServerPro`
     *   Domain-level app.
     */
    public fun domainExecutionRoleArn(domainExecutionRoleArn: String) {
        cdkBuilder.domainExecutionRoleArn(domainExecutionRoleArn)
    }

    /** @param rStudioConnectUrl A URL pointing to an RStudio Connect server. */
    public fun rStudioConnectUrl(rStudioConnectUrl: String) {
        cdkBuilder.rStudioConnectUrl(rStudioConnectUrl)
    }

    /** @param rStudioPackageManagerUrl A URL pointing to an RStudio Package Manager server. */
    public fun rStudioPackageManagerUrl(rStudioPackageManagerUrl: String) {
        cdkBuilder.rStudioPackageManagerUrl(rStudioPackageManagerUrl)
    }

    public fun build(): CfnDomain.RStudioServerProDomainSettingsProperty = cdkBuilder.build()
}
