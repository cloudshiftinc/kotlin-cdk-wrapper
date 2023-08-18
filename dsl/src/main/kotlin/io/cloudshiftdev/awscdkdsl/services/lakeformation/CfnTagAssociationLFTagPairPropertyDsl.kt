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

package io.cloudshiftdev.awscdkdsl.services.lakeformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation

/**
 * A structure containing the catalog ID, tag key, and tag values of an LF-tag key-value pair.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * LFTagPairProperty lFTagPairProperty = LFTagPairProperty.builder()
 * .catalogId("catalogId")
 * .tagKey("tagKey")
 * .tagValues(List.of("tagValues"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-lftagpair.html)
 */
@CdkDslMarker
public class CfnTagAssociationLFTagPairPropertyDsl {
    private val cdkBuilder: CfnTagAssociation.LFTagPairProperty.Builder =
        CfnTagAssociation.LFTagPairProperty.builder()

    private val _tagValues: MutableList<String> = mutableListOf()

    /**
     * @param catalogId The identifier for the Data Catalog . By default, it is the account ID of
     *   the caller.
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /** @param tagKey The key-name for the LF-tag. */
    public fun tagKey(tagKey: String) {
        cdkBuilder.tagKey(tagKey)
    }

    /**
     * @param tagValues A list of possible values of the corresponding `TagKey` of an LF-tag
     *   key-value pair.
     */
    public fun tagValues(vararg tagValues: String) {
        _tagValues.addAll(listOf(*tagValues))
    }

    /**
     * @param tagValues A list of possible values of the corresponding `TagKey` of an LF-tag
     *   key-value pair.
     */
    public fun tagValues(tagValues: Collection<String>) {
        _tagValues.addAll(tagValues)
    }

    public fun build(): CfnTagAssociation.LFTagPairProperty {
        if (_tagValues.isNotEmpty()) cdkBuilder.tagValues(_tagValues)
        return cdkBuilder.build()
    }
}
