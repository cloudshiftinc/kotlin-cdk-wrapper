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

package io.cloudshiftdev.awscdkdsl.services.managedblockchain

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.managedblockchain.CfnAccessor
import software.constructs.Construct

/**
 * Creates a new accessor for use with Managed Blockchain Ethereum nodes.
 *
 * An accessor contains information required for token based access to your Ethereum nodes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * CfnAccessor cfnAccessor = CfnAccessor.Builder.create(this, "MyCfnAccessor")
 * .accessorType("accessorType")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html)
 */
@CdkDslMarker
public class CfnAccessorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccessor.Builder = CfnAccessor.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The type of the accessor.
     *
     * Currently, accessor type is restricted to `BILLING_TOKEN` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html#cfn-managedblockchain-accessor-accessortype)
     *
     * @param accessorType The type of the accessor.
     */
    public fun accessorType(accessorType: String) {
        cdkBuilder.accessorType(accessorType)
    }

    /**
     * The tags assigned to the Accessor.
     *
     * For more information about tags, see
     * [Tagging Resources](https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Ethereum Developer Guide* , or
     * [Tagging Resources](https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Hyperledger Fabric Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html#cfn-managedblockchain-accessor-tags)
     *
     * @param tags The tags assigned to the Accessor.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags assigned to the Accessor.
     *
     * For more information about tags, see
     * [Tagging Resources](https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Ethereum Developer Guide* , or
     * [Tagging Resources](https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html)
     * in the *Amazon Managed Blockchain Hyperledger Fabric Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html#cfn-managedblockchain-accessor-tags)
     *
     * @param tags The tags assigned to the Accessor.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAccessor {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
