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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import software.amazon.awscdk.TagManager
import software.amazon.awscdk.TagType

/**
 * TagManager facilitates a common implementation of tagging for Constructs.
 *
 * Normally, you do not need to use this class, as the CloudFormation specification will indicate
 * which resources are taggable. However, sometimes you will need this to make custom resources
 * taggable. Used `tagManager.renderedTags` to obtain a value that will resolve to the tags at
 * synthesis time.
 *
 * Example:
 * ```
 * public class MyConstruct extends Resource implements ITaggable {
 * public final Object tags;
 * public MyConstruct(Construct scope, String id) {
 * super(scope, id);
 * CfnResource.Builder.create(this, "Resource")
 * .type("Whatever::The::Type")
 * .properties(Map.of(
 * // ...
 * "Tags", this.tags.getRenderedTags()))
 * .build();
 * }
 * }
 * ```
 */
@CdkDslMarker
public class TagManagerDsl(
    tagType: TagType,
    resourceTypeName: String,
    initialTags: Any,
) {
    private val cdkBuilder: TagManager.Builder =
        TagManager.Builder.create(tagType, resourceTypeName, initialTags)

    /**
     * The name of the property in CloudFormation for these tags.
     *
     * Normally this is `tags`, but Cognito UserPool uses UserPoolTags
     *
     * Default: "tags"
     *
     * @param tagPropertyName The name of the property in CloudFormation for these tags.
     */
    public fun tagPropertyName(tagPropertyName: String) {
        cdkBuilder.tagPropertyName(tagPropertyName)
    }

    public fun build(): TagManager = cdkBuilder.build()
}
