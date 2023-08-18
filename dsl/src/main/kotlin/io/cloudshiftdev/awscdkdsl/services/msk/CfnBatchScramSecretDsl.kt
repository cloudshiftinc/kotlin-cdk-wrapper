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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.msk.CfnBatchScramSecret
import software.constructs.Construct

/**
 * Resource Type definition for AWS::MSK::BatchScramSecret.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * CfnBatchScramSecret cfnBatchScramSecret = CfnBatchScramSecret.Builder.create(this,
 * "MyCfnBatchScramSecret")
 * .clusterArn("clusterArn")
 * // the properties below are optional
 * .secretArnList(List.of("secretArnList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html)
 */
@CdkDslMarker
public class CfnBatchScramSecretDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBatchScramSecret.Builder =
        CfnBatchScramSecret.Builder.create(scope, id)

    private val _secretArnList: MutableList<String> = mutableListOf()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-clusterarn)
     *
     * @param clusterArn
     */
    public fun clusterArn(clusterArn: String) {
        cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-secretarnlist)
     *
     * @param secretArnList
     */
    public fun secretArnList(vararg secretArnList: String) {
        _secretArnList.addAll(listOf(*secretArnList))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-secretarnlist)
     *
     * @param secretArnList
     */
    public fun secretArnList(secretArnList: Collection<String>) {
        _secretArnList.addAll(secretArnList)
    }

    public fun build(): CfnBatchScramSecret {
        if (_secretArnList.isNotEmpty()) cdkBuilder.secretArnList(_secretArnList)
        return cdkBuilder.build()
    }
}
