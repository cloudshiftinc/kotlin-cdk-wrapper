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

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnResourcePolicyProps

/**
 * Properties for defining a `CfnResourcePolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.xray.*;
 * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
 * .policyDocument("policyDocument")
 * .policyName("policyName")
 * // the properties below are optional
 * .bypassPolicyLockoutCheck(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html)
 */
@CdkDslMarker
public class CfnResourcePolicyPropsDsl {
    private val cdkBuilder: CfnResourcePolicyProps.Builder = CfnResourcePolicyProps.builder()

    /**
     * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based
     *   policy lockout safety check.
     */
    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: Boolean) {
        cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck)
    }

    /**
     * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based
     *   policy lockout safety check.
     */
    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: IResolvable) {
        cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck)
    }

    /** @param policyDocument The resource-based policy document, which can be up to 5kb in size. */
    public fun policyDocument(policyDocument: String) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param policyName The name of the resource-based policy. Must be unique within a specific AWS
     *   account.
     */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun build(): CfnResourcePolicyProps = cdkBuilder.build()
}
