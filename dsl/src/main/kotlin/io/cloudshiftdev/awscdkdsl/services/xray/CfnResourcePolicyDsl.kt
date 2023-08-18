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

package io.cloudshiftdev.awscdkdsl.services.xray

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnResourcePolicy
import software.constructs.Construct

/**
 * Use `AWS::XRay::ResourcePolicy` to specify an X-Ray resource-based policy, which grants one or
 * more AWS services and accounts permissions to access X-Ray .
 *
 * Each resource-based policy is associated with a specific AWS account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.xray.*;
 * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
 * "MyCfnResourcePolicy")
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
public class CfnResourcePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResourcePolicy.Builder = CfnResourcePolicy.Builder.create(scope, id)

    /**
     * A flag to indicate whether to bypass the resource-based policy lockout safety check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-bypasspolicylockoutcheck)
     *
     * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based
     *   policy lockout safety check.
     */
    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: Boolean) {
        cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck)
    }

    /**
     * A flag to indicate whether to bypass the resource-based policy lockout safety check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-bypasspolicylockoutcheck)
     *
     * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based
     *   policy lockout safety check.
     */
    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: IResolvable) {
        cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck)
    }

    /**
     * The resource-based policy document, which can be up to 5kb in size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-policydocument)
     *
     * @param policyDocument The resource-based policy document, which can be up to 5kb in size.
     */
    public fun policyDocument(policyDocument: String) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The name of the resource-based policy.
     *
     * Must be unique within a specific AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-policyname)
     *
     * @param policyName The name of the resource-based policy.
     */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun build(): CfnResourcePolicy = cdkBuilder.build()
}
