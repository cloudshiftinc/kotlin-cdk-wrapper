@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

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
 * Properties for defining a `CfnIdNamespaceAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
 * CfnIdNamespaceAssociationProps cfnIdNamespaceAssociationProps =
 * CfnIdNamespaceAssociationProps.builder()
 * .inputReferenceConfig(IdNamespaceAssociationInputReferenceConfigProperty.builder()
 * .inputReferenceArn("inputReferenceArn")
 * .manageResourcePolicies(false)
 * .build())
 * .membershipIdentifier("membershipIdentifier")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .idMappingConfig(IdMappingConfigProperty.builder()
 * .allowUseAsDimensionColumn(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html)
 */
public interface CfnIdNamespaceAssociationProps {
  /**
   * The description of the ID namespace association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The configuration settings for the ID mapping table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-idmappingconfig)
   */
  public fun idMappingConfig(): Any? = unwrap(this).getIdMappingConfig()

  /**
   * The input reference configuration for the ID namespace association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-inputreferenceconfig)
   */
  public fun inputReferenceConfig(): Any

  /**
   * The unique identifier of the membership that contains the ID namespace association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-membershipidentifier)
   */
  public fun membershipIdentifier(): String

  /**
   * The name of this ID namespace association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-name)
   */
  public fun name(): String

  /**
   * An optional label that you can assign to a resource when you create it.
   *
   * Each tag consists of a key and an optional value, both of which you define. When you use
   * tagging, you can also use tag-based access control in IAM policies to control access to this
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnIdNamespaceAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the ID namespace association.
     */
    public fun description(description: String)

    /**
     * @param idMappingConfig The configuration settings for the ID mapping table.
     */
    public fun idMappingConfig(idMappingConfig: IResolvable)

    /**
     * @param idMappingConfig The configuration settings for the ID mapping table.
     */
    public fun idMappingConfig(idMappingConfig: CfnIdNamespaceAssociation.IdMappingConfigProperty)

    /**
     * @param idMappingConfig The configuration settings for the ID mapping table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d59ce824c58624b987694a60c3b54220de074634c6a4e37f386cc237da0610a8")
    public
        fun idMappingConfig(idMappingConfig: CfnIdNamespaceAssociation.IdMappingConfigProperty.Builder.() -> Unit)

    /**
     * @param inputReferenceConfig The input reference configuration for the ID namespace
     * association. 
     */
    public fun inputReferenceConfig(inputReferenceConfig: IResolvable)

    /**
     * @param inputReferenceConfig The input reference configuration for the ID namespace
     * association. 
     */
    public
        fun inputReferenceConfig(inputReferenceConfig: CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferenceConfigProperty)

    /**
     * @param inputReferenceConfig The input reference configuration for the ID namespace
     * association. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8db4ca3cb779a432fd08dce5fd44df1ebb45d24429640294d9825dda78283b80")
    public
        fun inputReferenceConfig(inputReferenceConfig: CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferenceConfigProperty.Builder.() -> Unit)

    /**
     * @param membershipIdentifier The unique identifier of the membership that contains the ID
     * namespace association. 
     */
    public fun membershipIdentifier(membershipIdentifier: String)

    /**
     * @param name The name of this ID namespace association. 
     */
    public fun name(name: String)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociationProps.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociationProps.builder()

    /**
     * @param description The description of the ID namespace association.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param idMappingConfig The configuration settings for the ID mapping table.
     */
    override fun idMappingConfig(idMappingConfig: IResolvable) {
      cdkBuilder.idMappingConfig(idMappingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param idMappingConfig The configuration settings for the ID mapping table.
     */
    override
        fun idMappingConfig(idMappingConfig: CfnIdNamespaceAssociation.IdMappingConfigProperty) {
      cdkBuilder.idMappingConfig(idMappingConfig.let(CfnIdNamespaceAssociation.IdMappingConfigProperty.Companion::unwrap))
    }

    /**
     * @param idMappingConfig The configuration settings for the ID mapping table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d59ce824c58624b987694a60c3b54220de074634c6a4e37f386cc237da0610a8")
    override
        fun idMappingConfig(idMappingConfig: CfnIdNamespaceAssociation.IdMappingConfigProperty.Builder.() -> Unit):
        Unit = idMappingConfig(CfnIdNamespaceAssociation.IdMappingConfigProperty(idMappingConfig))

    /**
     * @param inputReferenceConfig The input reference configuration for the ID namespace
     * association. 
     */
    override fun inputReferenceConfig(inputReferenceConfig: IResolvable) {
      cdkBuilder.inputReferenceConfig(inputReferenceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param inputReferenceConfig The input reference configuration for the ID namespace
     * association. 
     */
    override
        fun inputReferenceConfig(inputReferenceConfig: CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferenceConfigProperty) {
      cdkBuilder.inputReferenceConfig(inputReferenceConfig.let(CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferenceConfigProperty.Companion::unwrap))
    }

    /**
     * @param inputReferenceConfig The input reference configuration for the ID namespace
     * association. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8db4ca3cb779a432fd08dce5fd44df1ebb45d24429640294d9825dda78283b80")
    override
        fun inputReferenceConfig(inputReferenceConfig: CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferenceConfigProperty.Builder.() -> Unit):
        Unit =
        inputReferenceConfig(CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferenceConfigProperty(inputReferenceConfig))

    /**
     * @param membershipIdentifier The unique identifier of the membership that contains the ID
     * namespace association. 
     */
    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * @param name The name of this ID namespace association. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociationProps,
  ) : CdkObject(cdkObject),
      CfnIdNamespaceAssociationProps {
    /**
     * The description of the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The configuration settings for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-idmappingconfig)
     */
    override fun idMappingConfig(): Any? = unwrap(this).getIdMappingConfig()

    /**
     * The input reference configuration for the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-inputreferenceconfig)
     */
    override fun inputReferenceConfig(): Any = unwrap(this).getInputReferenceConfig()

    /**
     * The unique identifier of the membership that contains the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-membershipidentifier)
     */
    override fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

    /**
     * The name of this ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdNamespaceAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociationProps):
        CfnIdNamespaceAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnIdNamespaceAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdNamespaceAssociationProps):
        software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociationProps
  }
}
