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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnCondition
import software.amazon.awscdk.ICfnConditionExpression
import software.constructs.Construct

/**
 * Represents a CloudFormation condition, for resources which must be conditionally created and the
 * determination must be made at deploy time.
 *
 * Example:
 * ```
 * CfnBucket rawBucket = CfnBucket.Builder.create(this, "Bucket").build();
 * // -or-
 * CfnBucket rawBucketAlt = (CfnBucket)myBucket.getNode().getDefaultChild();
 * // then
 * rawBucket.getCfnOptions().getCondition() = CfnCondition.Builder.create(this,
 * "EnableBucket").build();
 * rawBucket.getCfnOptions().getMetadata() = Map.of(
 * "metadataKey", "MetadataValue");
 * ```
 */
@CdkDslMarker
public class CfnConditionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCondition.Builder = CfnCondition.Builder.create(scope, id)

    /**
     * The expression that the condition will evaluate.
     *
     * Default: - None.
     *
     * @param expression The expression that the condition will evaluate.
     */
    public fun expression(expression: ICfnConditionExpression) {
        cdkBuilder.expression(expression)
    }

    public fun build(): CfnCondition = cdkBuilder.build()
}
