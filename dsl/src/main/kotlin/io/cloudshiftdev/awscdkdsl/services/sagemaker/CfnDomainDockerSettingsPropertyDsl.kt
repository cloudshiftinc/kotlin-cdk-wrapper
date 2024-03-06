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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnDomain

/**
 * A collection of settings that configure the domain's Docker interaction.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DockerSettingsProperty dockerSettingsProperty = DockerSettingsProperty.builder()
 * .enableDockerAccess("enableDockerAccess")
 * .vpcOnlyTrustedAccounts(List.of("vpcOnlyTrustedAccounts"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-dockersettings.html)
 */
@CdkDslMarker
public class CfnDomainDockerSettingsPropertyDsl {
    private val cdkBuilder: CfnDomain.DockerSettingsProperty.Builder =
        CfnDomain.DockerSettingsProperty.builder()

    private val _vpcOnlyTrustedAccounts: MutableList<String> = mutableListOf()

    /** @param enableDockerAccess Indicates whether the domain can access Docker. */
    public fun enableDockerAccess(enableDockerAccess: String) {
        cdkBuilder.enableDockerAccess(enableDockerAccess)
    }

    /**
     * @param vpcOnlyTrustedAccounts The list of AWS accounts that are trusted when the domain is
     *   created in VPC-only mode.
     */
    public fun vpcOnlyTrustedAccounts(vararg vpcOnlyTrustedAccounts: String) {
        _vpcOnlyTrustedAccounts.addAll(listOf(*vpcOnlyTrustedAccounts))
    }

    /**
     * @param vpcOnlyTrustedAccounts The list of AWS accounts that are trusted when the domain is
     *   created in VPC-only mode.
     */
    public fun vpcOnlyTrustedAccounts(vpcOnlyTrustedAccounts: Collection<String>) {
        _vpcOnlyTrustedAccounts.addAll(vpcOnlyTrustedAccounts)
    }

    public fun build(): CfnDomain.DockerSettingsProperty {
        if (_vpcOnlyTrustedAccounts.isNotEmpty())
            cdkBuilder.vpcOnlyTrustedAccounts(_vpcOnlyTrustedAccounts)
        return cdkBuilder.build()
    }
}
