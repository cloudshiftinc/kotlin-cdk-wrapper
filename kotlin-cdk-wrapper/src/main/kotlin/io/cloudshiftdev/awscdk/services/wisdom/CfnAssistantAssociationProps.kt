@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAssistantAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAssistantAssociationProps cfnAssistantAssociationProps =
 * CfnAssistantAssociationProps.builder()
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
public interface CfnAssistantAssociationProps {
  /**
   * The identifier of the Wisdom assistant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-assistantid)
   */
  public fun assistantId(): String

  /**
   * The identifier of the associated resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-association)
   */
  public fun association(): Any

  /**
   * The type of association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-associationtype)
   */
  public fun associationType(): String

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAssistantAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assistantId The identifier of the Wisdom assistant. 
     */
    public fun assistantId(assistantId: String)

    /**
     * @param association The identifier of the associated resource. 
     */
    public fun association(association: IResolvable)

    /**
     * @param association The identifier of the associated resource. 
     */
    public fun association(association: CfnAssistantAssociation.AssociationDataProperty)

    /**
     * @param association The identifier of the associated resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f6e0cdff817007d24cc1cdcfa99a228646ef052530af1bf9649c5c92d804fd2")
    public
        fun association(association: CfnAssistantAssociation.AssociationDataProperty.Builder.() -> Unit)

    /**
     * @param associationType The type of association. 
     */
    public fun associationType(associationType: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps.builder()

    /**
     * @param assistantId The identifier of the Wisdom assistant. 
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * @param association The identifier of the associated resource. 
     */
    override fun association(association: IResolvable) {
      cdkBuilder.association(association.let(IResolvable::unwrap))
    }

    /**
     * @param association The identifier of the associated resource. 
     */
    override fun association(association: CfnAssistantAssociation.AssociationDataProperty) {
      cdkBuilder.association(association.let(CfnAssistantAssociation.AssociationDataProperty::unwrap))
    }

    /**
     * @param association The identifier of the associated resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f6e0cdff817007d24cc1cdcfa99a228646ef052530af1bf9649c5c92d804fd2")
    override
        fun association(association: CfnAssistantAssociation.AssociationDataProperty.Builder.() -> Unit):
        Unit = association(CfnAssistantAssociation.AssociationDataProperty(association))

    /**
     * @param associationType The type of association. 
     */
    override fun associationType(associationType: String) {
      cdkBuilder.associationType(associationType)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps,
  ) : CdkObject(cdkObject), CfnAssistantAssociationProps {
    /**
     * The identifier of the Wisdom assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-assistantid)
     */
    override fun assistantId(): String = unwrap(this).getAssistantId()

    /**
     * The identifier of the associated resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-association)
     */
    override fun association(): Any = unwrap(this).getAssociation()

    /**
     * The type of association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-associationtype)
     */
    override fun associationType(): String = unwrap(this).getAssociationType()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html#cfn-wisdom-assistantassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssistantAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps):
        CfnAssistantAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnAssistantAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssistantAssociationProps):
        software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps
  }
}
