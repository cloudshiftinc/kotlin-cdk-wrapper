@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Provides information to create the ID namespace association.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
 * CfnIdNamespaceAssociation cfnIdNamespaceAssociation =
 * CfnIdNamespaceAssociation.Builder.create(this, "MyCfnIdNamespaceAssociation")
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
public open class CfnIdNamespaceAssociation(
  cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdNamespaceAssociationProps,
  ) :
      this(software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIdNamespaceAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdNamespaceAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIdNamespaceAssociationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the ID namespace association.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Name (ARN) of the collaboration that contains this ID namespace
   * association.
   */
  public open fun attrCollaborationArn(): String = unwrap(this).getAttrCollaborationArn()

  /**
   *
   */
  public open fun attrCollaborationIdentifier(): String =
      unwrap(this).getAttrCollaborationIdentifier()

  /**
   *
   */
  public open fun attrIdNamespaceAssociationIdentifier(): String =
      unwrap(this).getAttrIdNamespaceAssociationIdentifier()

  /**
   *
   */
  public open fun attrInputReferenceProperties(): IResolvable =
      unwrap(this).getAttrInputReferenceProperties().let(IResolvable::wrap)

  /**
   * The Amazon Resource Name (ARN) of the membership resource for this ID namespace association.
   */
  public open fun attrMembershipArn(): String = unwrap(this).getAttrMembershipArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the ID namespace association.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the ID namespace association.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The configuration settings for the ID mapping table.
   */
  public open fun idMappingConfig(): Any? = unwrap(this).getIdMappingConfig()

  /**
   * The configuration settings for the ID mapping table.
   */
  public open fun idMappingConfig(`value`: IResolvable) {
    unwrap(this).setIdMappingConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration settings for the ID mapping table.
   */
  public open fun idMappingConfig(`value`: IdMappingConfigProperty) {
    unwrap(this).setIdMappingConfig(`value`.let(IdMappingConfigProperty.Companion::unwrap))
  }

  /**
   * The configuration settings for the ID mapping table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ddf873a3f962a710e3204774c79f5df06fbbd95f2899a134309d3c2771a64de8")
  public open fun idMappingConfig(`value`: IdMappingConfigProperty.Builder.() -> Unit): Unit =
      idMappingConfig(IdMappingConfigProperty(`value`))

  /**
   * The input reference configuration for the ID namespace association.
   */
  public open fun inputReferenceConfig(): Any = unwrap(this).getInputReferenceConfig()

  /**
   * The input reference configuration for the ID namespace association.
   */
  public open fun inputReferenceConfig(`value`: IResolvable) {
    unwrap(this).setInputReferenceConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The input reference configuration for the ID namespace association.
   */
  public open
      fun inputReferenceConfig(`value`: IdNamespaceAssociationInputReferenceConfigProperty) {
    unwrap(this).setInputReferenceConfig(`value`.let(IdNamespaceAssociationInputReferenceConfigProperty.Companion::unwrap))
  }

  /**
   * The input reference configuration for the ID namespace association.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5b7c998b64168441712f562c9e9e3bf72510bda0a9946a3b4f8f2143217687fc")
  public open
      fun inputReferenceConfig(`value`: IdNamespaceAssociationInputReferenceConfigProperty.Builder.() -> Unit):
      Unit = inputReferenceConfig(IdNamespaceAssociationInputReferenceConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The unique identifier of the membership that contains the ID namespace association.
   */
  public open fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

  /**
   * The unique identifier of the membership that contains the ID namespace association.
   */
  public open fun membershipIdentifier(`value`: String) {
    unwrap(this).setMembershipIdentifier(`value`)
  }

  /**
   * The name of this ID namespace association.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of this ID namespace association.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   *
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   *
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   *
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cleanrooms.CfnIdNamespaceAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-description)
     * @param description The description of the ID namespace association. 
     */
    public fun description(description: String)

    /**
     * The configuration settings for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-idmappingconfig)
     * @param idMappingConfig The configuration settings for the ID mapping table. 
     */
    public fun idMappingConfig(idMappingConfig: IResolvable)

    /**
     * The configuration settings for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-idmappingconfig)
     * @param idMappingConfig The configuration settings for the ID mapping table. 
     */
    public fun idMappingConfig(idMappingConfig: IdMappingConfigProperty)

    /**
     * The configuration settings for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-idmappingconfig)
     * @param idMappingConfig The configuration settings for the ID mapping table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8af315196a9f2ff6ba218fa3802e818c07063970d4607c0a8c5d47937eb2d91b")
    public fun idMappingConfig(idMappingConfig: IdMappingConfigProperty.Builder.() -> Unit)

    /**
     * The input reference configuration for the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-inputreferenceconfig)
     * @param inputReferenceConfig The input reference configuration for the ID namespace
     * association. 
     */
    public fun inputReferenceConfig(inputReferenceConfig: IResolvable)

    /**
     * The input reference configuration for the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-inputreferenceconfig)
     * @param inputReferenceConfig The input reference configuration for the ID namespace
     * association. 
     */
    public
        fun inputReferenceConfig(inputReferenceConfig: IdNamespaceAssociationInputReferenceConfigProperty)

    /**
     * The input reference configuration for the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-inputreferenceconfig)
     * @param inputReferenceConfig The input reference configuration for the ID namespace
     * association. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("065666178761ee7b06da0fe67dd357e7b728a1cc03d777b0296c77e897b33d22")
    public
        fun inputReferenceConfig(inputReferenceConfig: IdNamespaceAssociationInputReferenceConfigProperty.Builder.() -> Unit)

    /**
     * The unique identifier of the membership that contains the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-membershipidentifier)
     * @param membershipIdentifier The unique identifier of the membership that contains the ID
     * namespace association. 
     */
    public fun membershipIdentifier(membershipIdentifier: String)

    /**
     * The name of this ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-name)
     * @param name The name of this ID namespace association. 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-tags)
     * @param tags 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-tags)
     * @param tags 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.Builder.create(scope,
        id)

    /**
     * The description of the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-description)
     * @param description The description of the ID namespace association. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The configuration settings for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-idmappingconfig)
     * @param idMappingConfig The configuration settings for the ID mapping table. 
     */
    override fun idMappingConfig(idMappingConfig: IResolvable) {
      cdkBuilder.idMappingConfig(idMappingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration settings for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-idmappingconfig)
     * @param idMappingConfig The configuration settings for the ID mapping table. 
     */
    override fun idMappingConfig(idMappingConfig: IdMappingConfigProperty) {
      cdkBuilder.idMappingConfig(idMappingConfig.let(IdMappingConfigProperty.Companion::unwrap))
    }

    /**
     * The configuration settings for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-idmappingconfig)
     * @param idMappingConfig The configuration settings for the ID mapping table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8af315196a9f2ff6ba218fa3802e818c07063970d4607c0a8c5d47937eb2d91b")
    override fun idMappingConfig(idMappingConfig: IdMappingConfigProperty.Builder.() -> Unit): Unit
        = idMappingConfig(IdMappingConfigProperty(idMappingConfig))

    /**
     * The input reference configuration for the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-inputreferenceconfig)
     * @param inputReferenceConfig The input reference configuration for the ID namespace
     * association. 
     */
    override fun inputReferenceConfig(inputReferenceConfig: IResolvable) {
      cdkBuilder.inputReferenceConfig(inputReferenceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The input reference configuration for the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-inputreferenceconfig)
     * @param inputReferenceConfig The input reference configuration for the ID namespace
     * association. 
     */
    override
        fun inputReferenceConfig(inputReferenceConfig: IdNamespaceAssociationInputReferenceConfigProperty) {
      cdkBuilder.inputReferenceConfig(inputReferenceConfig.let(IdNamespaceAssociationInputReferenceConfigProperty.Companion::unwrap))
    }

    /**
     * The input reference configuration for the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-inputreferenceconfig)
     * @param inputReferenceConfig The input reference configuration for the ID namespace
     * association. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("065666178761ee7b06da0fe67dd357e7b728a1cc03d777b0296c77e897b33d22")
    override
        fun inputReferenceConfig(inputReferenceConfig: IdNamespaceAssociationInputReferenceConfigProperty.Builder.() -> Unit):
        Unit =
        inputReferenceConfig(IdNamespaceAssociationInputReferenceConfigProperty(inputReferenceConfig))

    /**
     * The unique identifier of the membership that contains the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-membershipidentifier)
     * @param membershipIdentifier The unique identifier of the membership that contains the ID
     * namespace association. 
     */
    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * The name of this ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-name)
     * @param name The name of this ID namespace association. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-tags)
     * @param tags 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idnamespaceassociation.html#cfn-cleanrooms-idnamespaceassociation-tags)
     * @param tags 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdNamespaceAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdNamespaceAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation):
        CfnIdNamespaceAssociation = CfnIdNamespaceAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnIdNamespaceAssociation):
        software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation = wrapped.cdkObject as
        software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation
  }

  /**
   * The configuration settings for the ID mapping table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * IdMappingConfigProperty idMappingConfigProperty = IdMappingConfigProperty.builder()
   * .allowUseAsDimensionColumn(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idnamespaceassociation-idmappingconfig.html)
   */
  public interface IdMappingConfigProperty {
    /**
     * An indicator as to whether you can use your column as a dimension column in the ID mapping
     * table ( `TRUE` ) or not ( `FALSE` ).
     *
     * Default is `FALSE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idnamespaceassociation-idmappingconfig.html#cfn-cleanrooms-idnamespaceassociation-idmappingconfig-allowuseasdimensioncolumn)
     */
    public fun allowUseAsDimensionColumn(): Any

    /**
     * A builder for [IdMappingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowUseAsDimensionColumn An indicator as to whether you can use your column as a
       * dimension column in the ID mapping table ( `TRUE` ) or not ( `FALSE` ). 
       * Default is `FALSE` .
       */
      public fun allowUseAsDimensionColumn(allowUseAsDimensionColumn: Boolean)

      /**
       * @param allowUseAsDimensionColumn An indicator as to whether you can use your column as a
       * dimension column in the ID mapping table ( `TRUE` ) or not ( `FALSE` ). 
       * Default is `FALSE` .
       */
      public fun allowUseAsDimensionColumn(allowUseAsDimensionColumn: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdMappingConfigProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdMappingConfigProperty.builder()

      /**
       * @param allowUseAsDimensionColumn An indicator as to whether you can use your column as a
       * dimension column in the ID mapping table ( `TRUE` ) or not ( `FALSE` ). 
       * Default is `FALSE` .
       */
      override fun allowUseAsDimensionColumn(allowUseAsDimensionColumn: Boolean) {
        cdkBuilder.allowUseAsDimensionColumn(allowUseAsDimensionColumn)
      }

      /**
       * @param allowUseAsDimensionColumn An indicator as to whether you can use your column as a
       * dimension column in the ID mapping table ( `TRUE` ) or not ( `FALSE` ). 
       * Default is `FALSE` .
       */
      override fun allowUseAsDimensionColumn(allowUseAsDimensionColumn: IResolvable) {
        cdkBuilder.allowUseAsDimensionColumn(allowUseAsDimensionColumn.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdMappingConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdMappingConfigProperty,
    ) : CdkObject(cdkObject),
        IdMappingConfigProperty {
      /**
       * An indicator as to whether you can use your column as a dimension column in the ID mapping
       * table ( `TRUE` ) or not ( `FALSE` ).
       *
       * Default is `FALSE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idnamespaceassociation-idmappingconfig.html#cfn-cleanrooms-idnamespaceassociation-idmappingconfig-allowuseasdimensioncolumn)
       */
      override fun allowUseAsDimensionColumn(): Any = unwrap(this).getAllowUseAsDimensionColumn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IdMappingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdMappingConfigProperty):
          IdMappingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? IdMappingConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingConfigProperty):
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdMappingConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdMappingConfigProperty
    }
  }

  /**
   * Provides the information for the ID namespace association input reference configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * IdNamespaceAssociationInputReferenceConfigProperty
   * idNamespaceAssociationInputReferenceConfigProperty =
   * IdNamespaceAssociationInputReferenceConfigProperty.builder()
   * .inputReferenceArn("inputReferenceArn")
   * .manageResourcePolicies(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceconfig.html)
   */
  public interface IdNamespaceAssociationInputReferenceConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the AWS Entity Resolution resource that is being associated
     * to the collaboration.
     *
     * Valid resource ARNs are from the ID namespaces that you own.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceconfig.html#cfn-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceconfig-inputreferencearn)
     */
    public fun inputReferenceArn(): String

    /**
     * When `TRUE` , AWS Clean Rooms manages permissions for the ID namespace association resource.
     *
     * When `FALSE` , the resource owner manages permissions for the ID namespace association
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceconfig.html#cfn-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceconfig-manageresourcepolicies)
     */
    public fun manageResourcePolicies(): Any

    /**
     * A builder for [IdNamespaceAssociationInputReferenceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputReferenceArn The Amazon Resource Name (ARN) of the AWS Entity Resolution
       * resource that is being associated to the collaboration. 
       * Valid resource ARNs are from the ID namespaces that you own.
       */
      public fun inputReferenceArn(inputReferenceArn: String)

      /**
       * @param manageResourcePolicies When `TRUE` , AWS Clean Rooms manages permissions for the ID
       * namespace association resource. 
       * When `FALSE` , the resource owner manages permissions for the ID namespace association
       * resource.
       */
      public fun manageResourcePolicies(manageResourcePolicies: Boolean)

      /**
       * @param manageResourcePolicies When `TRUE` , AWS Clean Rooms manages permissions for the ID
       * namespace association resource. 
       * When `FALSE` , the resource owner manages permissions for the ID namespace association
       * resource.
       */
      public fun manageResourcePolicies(manageResourcePolicies: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferenceConfigProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferenceConfigProperty.builder()

      /**
       * @param inputReferenceArn The Amazon Resource Name (ARN) of the AWS Entity Resolution
       * resource that is being associated to the collaboration. 
       * Valid resource ARNs are from the ID namespaces that you own.
       */
      override fun inputReferenceArn(inputReferenceArn: String) {
        cdkBuilder.inputReferenceArn(inputReferenceArn)
      }

      /**
       * @param manageResourcePolicies When `TRUE` , AWS Clean Rooms manages permissions for the ID
       * namespace association resource. 
       * When `FALSE` , the resource owner manages permissions for the ID namespace association
       * resource.
       */
      override fun manageResourcePolicies(manageResourcePolicies: Boolean) {
        cdkBuilder.manageResourcePolicies(manageResourcePolicies)
      }

      /**
       * @param manageResourcePolicies When `TRUE` , AWS Clean Rooms manages permissions for the ID
       * namespace association resource. 
       * When `FALSE` , the resource owner manages permissions for the ID namespace association
       * resource.
       */
      override fun manageResourcePolicies(manageResourcePolicies: IResolvable) {
        cdkBuilder.manageResourcePolicies(manageResourcePolicies.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferenceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferenceConfigProperty,
    ) : CdkObject(cdkObject),
        IdNamespaceAssociationInputReferenceConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the AWS Entity Resolution resource that is being
       * associated to the collaboration.
       *
       * Valid resource ARNs are from the ID namespaces that you own.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceconfig.html#cfn-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceconfig-inputreferencearn)
       */
      override fun inputReferenceArn(): String = unwrap(this).getInputReferenceArn()

      /**
       * When `TRUE` , AWS Clean Rooms manages permissions for the ID namespace association
       * resource.
       *
       * When `FALSE` , the resource owner manages permissions for the ID namespace association
       * resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceconfig.html#cfn-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceconfig-manageresourcepolicies)
       */
      override fun manageResourcePolicies(): Any = unwrap(this).getManageResourcePolicies()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdNamespaceAssociationInputReferenceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferenceConfigProperty):
          IdNamespaceAssociationInputReferenceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdNamespaceAssociationInputReferenceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdNamespaceAssociationInputReferenceConfigProperty):
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferenceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferenceConfigProperty
    }
  }

  /**
   * Provides the information for the ID namespace association input reference properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * Object idMappingWorkflowsSupported;
   * IdNamespaceAssociationInputReferencePropertiesProperty
   * idNamespaceAssociationInputReferencePropertiesProperty =
   * IdNamespaceAssociationInputReferencePropertiesProperty.builder()
   * .idMappingWorkflowsSupported(List.of(idMappingWorkflowsSupported))
   * .idNamespaceType("idNamespaceType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceproperties.html)
   */
  public interface IdNamespaceAssociationInputReferencePropertiesProperty {
    /**
     * Defines how ID mapping workflows are supported for this ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceproperties.html#cfn-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceproperties-idmappingworkflowssupported)
     */
    public fun idMappingWorkflowsSupported(): Any? = unwrap(this).getIdMappingWorkflowsSupported()

    /**
     * The ID namespace type for this ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceproperties.html#cfn-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceproperties-idnamespacetype)
     */
    public fun idNamespaceType(): String? = unwrap(this).getIdNamespaceType()

    /**
     * A builder for [IdNamespaceAssociationInputReferencePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idMappingWorkflowsSupported Defines how ID mapping workflows are supported for this
       * ID namespace association.
       */
      public fun idMappingWorkflowsSupported(idMappingWorkflowsSupported: List<Any>)

      /**
       * @param idMappingWorkflowsSupported Defines how ID mapping workflows are supported for this
       * ID namespace association.
       */
      public fun idMappingWorkflowsSupported(vararg idMappingWorkflowsSupported: Any)

      /**
       * @param idMappingWorkflowsSupported Defines how ID mapping workflows are supported for this
       * ID namespace association.
       */
      public fun idMappingWorkflowsSupported(idMappingWorkflowsSupported: IResolvable)

      /**
       * @param idNamespaceType The ID namespace type for this ID namespace association.
       */
      public fun idNamespaceType(idNamespaceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferencePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferencePropertiesProperty.builder()

      /**
       * @param idMappingWorkflowsSupported Defines how ID mapping workflows are supported for this
       * ID namespace association.
       */
      override fun idMappingWorkflowsSupported(idMappingWorkflowsSupported: List<Any>) {
        cdkBuilder.idMappingWorkflowsSupported(idMappingWorkflowsSupported.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param idMappingWorkflowsSupported Defines how ID mapping workflows are supported for this
       * ID namespace association.
       */
      override fun idMappingWorkflowsSupported(vararg idMappingWorkflowsSupported: Any): Unit =
          idMappingWorkflowsSupported(idMappingWorkflowsSupported.toList())

      /**
       * @param idMappingWorkflowsSupported Defines how ID mapping workflows are supported for this
       * ID namespace association.
       */
      override fun idMappingWorkflowsSupported(idMappingWorkflowsSupported: IResolvable) {
        cdkBuilder.idMappingWorkflowsSupported(idMappingWorkflowsSupported.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param idNamespaceType The ID namespace type for this ID namespace association.
       */
      override fun idNamespaceType(idNamespaceType: String) {
        cdkBuilder.idNamespaceType(idNamespaceType)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferencePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferencePropertiesProperty,
    ) : CdkObject(cdkObject),
        IdNamespaceAssociationInputReferencePropertiesProperty {
      /**
       * Defines how ID mapping workflows are supported for this ID namespace association.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceproperties.html#cfn-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceproperties-idmappingworkflowssupported)
       */
      override fun idMappingWorkflowsSupported(): Any? =
          unwrap(this).getIdMappingWorkflowsSupported()

      /**
       * The ID namespace type for this ID namespace association.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceproperties.html#cfn-cleanrooms-idnamespaceassociation-idnamespaceassociationinputreferenceproperties-idnamespacetype)
       */
      override fun idNamespaceType(): String? = unwrap(this).getIdNamespaceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdNamespaceAssociationInputReferencePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferencePropertiesProperty):
          IdNamespaceAssociationInputReferencePropertiesProperty = CdkObjectWrappers.wrap(cdkObject)
          as? IdNamespaceAssociationInputReferencePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdNamespaceAssociationInputReferencePropertiesProperty):
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferencePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnIdNamespaceAssociation.IdNamespaceAssociationInputReferencePropertiesProperty
    }
  }
}
