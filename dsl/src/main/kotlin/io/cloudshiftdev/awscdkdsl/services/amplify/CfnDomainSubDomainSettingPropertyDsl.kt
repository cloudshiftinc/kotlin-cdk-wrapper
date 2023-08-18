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
import kotlin.String
import software.amazon.awscdk.services.amplify.CfnDomain

/**
 * The SubDomainSetting property type enables you to connect a subdomain (for example,
 * example.exampledomain.com) to a specific branch.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplify.*;
 * SubDomainSettingProperty subDomainSettingProperty = SubDomainSettingProperty.builder()
 * .branchName("branchName")
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-subdomainsetting.html)
 */
@CdkDslMarker
public class CfnDomainSubDomainSettingPropertyDsl {
    private val cdkBuilder: CfnDomain.SubDomainSettingProperty.Builder =
        CfnDomain.SubDomainSettingProperty.builder()

    /**
     * @param branchName The branch name setting for the subdomain. *Length Constraints:* Minimum
     *   length of 1. Maximum length of 255.
     *
     * *Pattern:* (?s).+
     */
    public fun branchName(branchName: String) {
        cdkBuilder.branchName(branchName)
    }

    /**
     * @param prefix The prefix setting for the subdomain. *Length Constraints:* Maximum length
     *   of 255.
     *
     * *Pattern:* (?s).*
     */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnDomain.SubDomainSettingProperty = cdkBuilder.build()
}
