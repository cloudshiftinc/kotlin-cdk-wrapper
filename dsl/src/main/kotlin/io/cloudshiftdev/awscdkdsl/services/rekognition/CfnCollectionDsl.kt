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

package io.cloudshiftdev.awscdkdsl.services.rekognition

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.rekognition.CfnCollection
import software.constructs.Construct

/**
 * The `AWS::Rekognition::Collection` type creates a server-side container called a collection.
 *
 * You can use a collection to store information about detected faces and search for known faces in
 * images, stored videos, and streaming videos.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rekognition.*;
 * CfnCollection cfnCollection = CfnCollection.Builder.create(this, "MyCfnCollection")
 * .collectionId("collectionId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html)
 */
@CdkDslMarker
public class CfnCollectionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCollection.Builder = CfnCollection.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * ID for the collection that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html#cfn-rekognition-collection-collectionid)
     *
     * @param collectionId ID for the collection that you are creating.
     */
    public fun collectionId(collectionId: String) {
        cdkBuilder.collectionId(collectionId)
    }

    /**
     * A set of tags (key-value pairs) that you want to attach to the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html#cfn-rekognition-collection-tags)
     *
     * @param tags A set of tags (key-value pairs) that you want to attach to the collection.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A set of tags (key-value pairs) that you want to attach to the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html#cfn-rekognition-collection-tags)
     *
     * @param tags A set of tags (key-value pairs) that you want to attach to the collection.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCollection {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
