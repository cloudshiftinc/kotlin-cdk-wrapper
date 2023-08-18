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

package io.cloudshiftdev.awscdkdsl.services.wisdom

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation
import software.constructs.Construct

/**
 * Specifies an association between an Amazon Connect Wisdom assistant and another resource.
 *
 * Currently, the only supported association is with a knowledge base. An assistant can have only a
 * single association.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wisdom.*;
 * CfnAssistantAssociation cfnAssistantAssociation = CfnAssistantAssociation.Builder.create(this,
 * "MyCfnAssistantAssociation")
 * .assistantId("assistantId")
 * .association(AssociationDataProperty.builder()
 * .knowledgeBaseId("knowledgeBaseId")
 * .build())
 * .associationType("associationType")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html)
 */
@CdkDslMarker
public class CfnAssistantAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAssistantAssociation.Builder =
        CfnAssistantAssociation.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The identifier of the Wisdom assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-assistantid)
     *
     * @param assistantId The identifier of the Wisdom assistant.
     */
    public fun assistantId(assistantId: String) {
        cdkBuilder.assistantId(assistantId)
    }

    /**
     * The identifier of the associated resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-association)
     *
     * @param association The identifier of the associated resource.
     */
    public fun association(association: IResolvable) {
        cdkBuilder.association(association)
    }

    /**
     * The identifier of the associated resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-association)
     *
     * @param association The identifier of the associated resource.
     */
    public fun association(association: CfnAssistantAssociation.AssociationDataProperty) {
        cdkBuilder.association(association)
    }

    /**
     * The type of association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-associationtype)
     *
     * @param associationType The type of association.
     */
    public fun associationType(associationType: String) {
        cdkBuilder.associationType(associationType)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAssistantAssociation {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
