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
import software.amazon.awscdk.services.msk.CfnBatchScramSecretProps

/**
 * Properties for defining a `CfnBatchScramSecret`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * CfnBatchScramSecretProps cfnBatchScramSecretProps = CfnBatchScramSecretProps.builder()
 * .clusterArn("clusterArn")
 * // the properties below are optional
 * .secretArnList(List.of("secretArnList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html)
 */
@CdkDslMarker
public class CfnBatchScramSecretPropsDsl {
    private val cdkBuilder: CfnBatchScramSecretProps.Builder = CfnBatchScramSecretProps.builder()

    private val _secretArnList: MutableList<String> = mutableListOf()

    /** @param clusterArn the value to be set. */
    public fun clusterArn(clusterArn: String) {
        cdkBuilder.clusterArn(clusterArn)
    }

    /** @param secretArnList the value to be set. */
    public fun secretArnList(vararg secretArnList: String) {
        _secretArnList.addAll(listOf(*secretArnList))
    }

    /** @param secretArnList the value to be set. */
    public fun secretArnList(secretArnList: Collection<String>) {
        _secretArnList.addAll(secretArnList)
    }

    public fun build(): CfnBatchScramSecretProps {
        if (_secretArnList.isNotEmpty()) cdkBuilder.secretArnList(_secretArnList)
        return cdkBuilder.build()
    }
}
