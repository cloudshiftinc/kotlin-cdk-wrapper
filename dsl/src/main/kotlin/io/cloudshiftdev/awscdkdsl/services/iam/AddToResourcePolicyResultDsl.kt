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

package io.cloudshiftdev.awscdkdsl.services.iam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.constructs.IDependable

/**
 * Result of calling addToResourcePolicy.
 *
 * Example:
 * ```
 * IBucket bucket = Bucket.fromBucketName(this, "existingBucket", "bucket-name");
 * // No policy statement will be added to the resource
 * AddToResourcePolicyResult result = bucket.addToResourcePolicy(
 * PolicyStatement.Builder.create()
 * .actions(List.of("s3:GetObject"))
 * .resources(List.of(bucket.arnForObjects("file.txt")))
 * .principals(List.of(new AccountRootPrincipal()))
 * .build());
 * ```
 */
@CdkDslMarker
public class AddToResourcePolicyResultDsl {
    private val cdkBuilder: AddToResourcePolicyResult.Builder = AddToResourcePolicyResult.builder()

    /**
     * @param policyDependable Dependable which allows depending on the policy change being applied.
     */
    public fun policyDependable(policyDependable: IDependable) {
        cdkBuilder.policyDependable(policyDependable)
    }

    /** @param statementAdded Whether the statement was added. */
    public fun statementAdded(statementAdded: Boolean) {
        cdkBuilder.statementAdded(statementAdded)
    }

    public fun build(): AddToResourcePolicyResult = cdkBuilder.build()
}
