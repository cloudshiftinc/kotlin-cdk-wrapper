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

package io.cloudshiftdev.awscdkdsl.services.amplify

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplify.CfnDomainProps

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplify.*;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
 * .appId("appId")
 * .domainName("domainName")
 * .subDomainSettings(List.of(SubDomainSettingProperty.builder()
 * .branchName("branchName")
 * .prefix("prefix")
 * .build()))
 * // the properties below are optional
 * .autoSubDomainCreationPatterns(List.of("autoSubDomainCreationPatterns"))
 * .autoSubDomainIamRole("autoSubDomainIamRole")
 * .enableAutoSubDomain(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html)
 */
@CdkDslMarker
public class CfnDomainPropsDsl {
    private val cdkBuilder: CfnDomainProps.Builder = CfnDomainProps.builder()

    private val _autoSubDomainCreationPatterns: MutableList<String> = mutableListOf()

    private val _subDomainSettings: MutableList<Any> = mutableListOf()

    /**
     * @param appId The unique ID for an Amplify app. *Length Constraints:* Minimum length of 1.
     *   Maximum length of 20.
     *
     * *Pattern:* d[a-z0-9]+
     */
    public fun appId(appId: String) {
        cdkBuilder.appId(appId)
    }

    /**
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     *   creation.
     */
    public fun autoSubDomainCreationPatterns(vararg autoSubDomainCreationPatterns: String) {
        _autoSubDomainCreationPatterns.addAll(listOf(*autoSubDomainCreationPatterns))
    }

    /**
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     *   creation.
     */
    public fun autoSubDomainCreationPatterns(autoSubDomainCreationPatterns: Collection<String>) {
        _autoSubDomainCreationPatterns.addAll(autoSubDomainCreationPatterns)
    }

    /**
     * @param autoSubDomainIamRole The required AWS Identity and Access Management (IAM) service
     *   role for the Amazon Resource Name (ARN) for automatically creating subdomains. *Length
     *   Constraints:* Maximum length of 1000.
     *
     * *Pattern:* ^$|^arn:aws:iam::\d{12}:role.+
     */
    public fun autoSubDomainIamRole(autoSubDomainIamRole: String) {
        cdkBuilder.autoSubDomainIamRole(autoSubDomainIamRole)
    }

    /**
     * @param domainName The domain name for the domain association. *Length Constraints:* Maximum
     *   length of 255.
     *
     * *Pattern:* ^(((?!-)[A-Za-z0-9-]{0,62}[A-Za-z0-9]).)+((?!-)[A-Za-z0-9-]{1,62}[A-Za-z0-9])(.)?$
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /** @param enableAutoSubDomain Enables the automated creation of subdomains for branches. */
    public fun enableAutoSubDomain(enableAutoSubDomain: Boolean) {
        cdkBuilder.enableAutoSubDomain(enableAutoSubDomain)
    }

    /** @param enableAutoSubDomain Enables the automated creation of subdomains for branches. */
    public fun enableAutoSubDomain(enableAutoSubDomain: IResolvable) {
        cdkBuilder.enableAutoSubDomain(enableAutoSubDomain)
    }

    /** @param subDomainSettings The setting for the subdomain. */
    public fun subDomainSettings(vararg subDomainSettings: Any) {
        _subDomainSettings.addAll(listOf(*subDomainSettings))
    }

    /** @param subDomainSettings The setting for the subdomain. */
    public fun subDomainSettings(subDomainSettings: Collection<Any>) {
        _subDomainSettings.addAll(subDomainSettings)
    }

    /** @param subDomainSettings The setting for the subdomain. */
    public fun subDomainSettings(subDomainSettings: IResolvable) {
        cdkBuilder.subDomainSettings(subDomainSettings)
    }

    public fun build(): CfnDomainProps {
        if (_autoSubDomainCreationPatterns.isNotEmpty())
            cdkBuilder.autoSubDomainCreationPatterns(_autoSubDomainCreationPatterns)
        if (_subDomainSettings.isNotEmpty()) cdkBuilder.subDomainSettings(_subDomainSettings)
        return cdkBuilder.build()
    }
}
