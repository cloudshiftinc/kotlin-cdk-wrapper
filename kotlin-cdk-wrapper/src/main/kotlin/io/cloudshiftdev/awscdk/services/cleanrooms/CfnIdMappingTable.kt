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
 * Describes information about the ID mapping table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
 * CfnIdMappingTable cfnIdMappingTable = CfnIdMappingTable.Builder.create(this,
 * "MyCfnIdMappingTable")
 * .inputReferenceConfig(IdMappingTableInputReferenceConfigProperty.builder()
 * .inputReferenceArn("inputReferenceArn")
 * .manageResourcePolicies(false)
 * .build())
 * .membershipIdentifier("membershipIdentifier")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyArn("kmsKeyArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html)
 */
public open class CfnIdMappingTable(
  cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdMappingTableProps,
  ) :
      this(software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIdMappingTableProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdMappingTableProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIdMappingTableProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the ID mapping table.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Name (ARN) of the collaboration that contains this ID mapping table.
   */
  public open fun attrCollaborationArn(): String = unwrap(this).getAttrCollaborationArn()

  /**
   * The unique identifier of the collaboration that contains this ID mapping table.
   */
  public open fun attrCollaborationIdentifier(): String =
      unwrap(this).getAttrCollaborationIdentifier()

  /**
   * The unique identifier of the ID mapping table identifier that you want to retrieve.
   */
  public open fun attrIdMappingTableIdentifier(): String =
      unwrap(this).getAttrIdMappingTableIdentifier()

  /**
   *
   */
  public open fun attrInputReferenceProperties(): IResolvable =
      unwrap(this).getAttrInputReferenceProperties().let(IResolvable::wrap)

  /**
   * The Amazon Resource Name (ARN) of the membership resource for the ID mapping table.
   */
  public open fun attrMembershipArn(): String = unwrap(this).getAttrMembershipArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the ID mapping table.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the ID mapping table.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The input reference configuration for the ID mapping table.
   */
  public open fun inputReferenceConfig(): Any = unwrap(this).getInputReferenceConfig()

  /**
   * The input reference configuration for the ID mapping table.
   */
  public open fun inputReferenceConfig(`value`: IResolvable) {
    unwrap(this).setInputReferenceConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The input reference configuration for the ID mapping table.
   */
  public open fun inputReferenceConfig(`value`: IdMappingTableInputReferenceConfigProperty) {
    unwrap(this).setInputReferenceConfig(`value`.let(IdMappingTableInputReferenceConfigProperty.Companion::unwrap))
  }

  /**
   * The input reference configuration for the ID mapping table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4939568b89477c0f6fac0759062652da8320758c368649a3f31f4f88c4f2db1b")
  public open
      fun inputReferenceConfig(`value`: IdMappingTableInputReferenceConfigProperty.Builder.() -> Unit):
      Unit = inputReferenceConfig(IdMappingTableInputReferenceConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS KMS key.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The Amazon Resource Name (ARN) of the AWS KMS key.
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * The unique identifier of the membership resource for the ID mapping table.
   */
  public open fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

  /**
   * The unique identifier of the membership resource for the ID mapping table.
   */
  public open fun membershipIdentifier(`value`: String) {
    unwrap(this).setMembershipIdentifier(`value`)
  }

  /**
   * The name of the ID mapping table.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the ID mapping table.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cleanrooms.CfnIdMappingTable].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-description)
     * @param description The description of the ID mapping table. 
     */
    public fun description(description: String)

    /**
     * The input reference configuration for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-inputreferenceconfig)
     * @param inputReferenceConfig The input reference configuration for the ID mapping table. 
     */
    public fun inputReferenceConfig(inputReferenceConfig: IResolvable)

    /**
     * The input reference configuration for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-inputreferenceconfig)
     * @param inputReferenceConfig The input reference configuration for the ID mapping table. 
     */
    public
        fun inputReferenceConfig(inputReferenceConfig: IdMappingTableInputReferenceConfigProperty)

    /**
     * The input reference configuration for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-inputreferenceconfig)
     * @param inputReferenceConfig The input reference configuration for the ID mapping table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f6fde6ce51ee22aeb708d2ab2819fdc4fdb2cf7bc044023d088253ce3ed0605")
    public
        fun inputReferenceConfig(inputReferenceConfig: IdMappingTableInputReferenceConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS key. 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * The unique identifier of the membership resource for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-membershipidentifier)
     * @param membershipIdentifier The unique identifier of the membership resource for the ID
     * mapping table. 
     */
    public fun membershipIdentifier(membershipIdentifier: String)

    /**
     * The name of the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-name)
     * @param name The name of the ID mapping table. 
     */
    public fun name(name: String)

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.Builder.create(scope, id)

    /**
     * The description of the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-description)
     * @param description The description of the ID mapping table. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The input reference configuration for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-inputreferenceconfig)
     * @param inputReferenceConfig The input reference configuration for the ID mapping table. 
     */
    override fun inputReferenceConfig(inputReferenceConfig: IResolvable) {
      cdkBuilder.inputReferenceConfig(inputReferenceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The input reference configuration for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-inputreferenceconfig)
     * @param inputReferenceConfig The input reference configuration for the ID mapping table. 
     */
    override
        fun inputReferenceConfig(inputReferenceConfig: IdMappingTableInputReferenceConfigProperty) {
      cdkBuilder.inputReferenceConfig(inputReferenceConfig.let(IdMappingTableInputReferenceConfigProperty.Companion::unwrap))
    }

    /**
     * The input reference configuration for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-inputreferenceconfig)
     * @param inputReferenceConfig The input reference configuration for the ID mapping table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f6fde6ce51ee22aeb708d2ab2819fdc4fdb2cf7bc044023d088253ce3ed0605")
    override
        fun inputReferenceConfig(inputReferenceConfig: IdMappingTableInputReferenceConfigProperty.Builder.() -> Unit):
        Unit =
        inputReferenceConfig(IdMappingTableInputReferenceConfigProperty(inputReferenceConfig))

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS key. 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * The unique identifier of the membership resource for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-membershipidentifier)
     * @param membershipIdentifier The unique identifier of the membership resource for the ID
     * mapping table. 
     */
    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * The name of the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-name)
     * @param name The name of the ID mapping table. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdMappingTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdMappingTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable):
        CfnIdMappingTable = CfnIdMappingTable(cdkObject)

    internal fun unwrap(wrapped: CfnIdMappingTable):
        software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable = wrapped.cdkObject as
        software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable
  }

  /**
   * Provides the input reference configuration for the ID mapping table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * IdMappingTableInputReferenceConfigProperty idMappingTableInputReferenceConfigProperty =
   * IdMappingTableInputReferenceConfigProperty.builder()
   * .inputReferenceArn("inputReferenceArn")
   * .manageResourcePolicies(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idmappingtable-idmappingtableinputreferenceconfig.html)
   */
  public interface IdMappingTableInputReferenceConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the referenced resource in AWS Entity Resolution .
     *
     * Valid values are ID mapping workflow ARNs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idmappingtable-idmappingtableinputreferenceconfig.html#cfn-cleanrooms-idmappingtable-idmappingtableinputreferenceconfig-inputreferencearn)
     */
    public fun inputReferenceArn(): String

    /**
     * When `TRUE` , AWS Clean Rooms manages permissions for the ID mapping table resource.
     *
     * When `FALSE` , the resource owner manages permissions for the ID mapping table resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idmappingtable-idmappingtableinputreferenceconfig.html#cfn-cleanrooms-idmappingtable-idmappingtableinputreferenceconfig-manageresourcepolicies)
     */
    public fun manageResourcePolicies(): Any

    /**
     * A builder for [IdMappingTableInputReferenceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputReferenceArn The Amazon Resource Name (ARN) of the referenced resource in AWS
       * Entity Resolution . 
       * Valid values are ID mapping workflow ARNs.
       */
      public fun inputReferenceArn(inputReferenceArn: String)

      /**
       * @param manageResourcePolicies When `TRUE` , AWS Clean Rooms manages permissions for the ID
       * mapping table resource. 
       * When `FALSE` , the resource owner manages permissions for the ID mapping table resource.
       */
      public fun manageResourcePolicies(manageResourcePolicies: Boolean)

      /**
       * @param manageResourcePolicies When `TRUE` , AWS Clean Rooms manages permissions for the ID
       * mapping table resource. 
       * When `FALSE` , the resource owner manages permissions for the ID mapping table resource.
       */
      public fun manageResourcePolicies(manageResourcePolicies: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferenceConfigProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferenceConfigProperty.builder()

      /**
       * @param inputReferenceArn The Amazon Resource Name (ARN) of the referenced resource in AWS
       * Entity Resolution . 
       * Valid values are ID mapping workflow ARNs.
       */
      override fun inputReferenceArn(inputReferenceArn: String) {
        cdkBuilder.inputReferenceArn(inputReferenceArn)
      }

      /**
       * @param manageResourcePolicies When `TRUE` , AWS Clean Rooms manages permissions for the ID
       * mapping table resource. 
       * When `FALSE` , the resource owner manages permissions for the ID mapping table resource.
       */
      override fun manageResourcePolicies(manageResourcePolicies: Boolean) {
        cdkBuilder.manageResourcePolicies(manageResourcePolicies)
      }

      /**
       * @param manageResourcePolicies When `TRUE` , AWS Clean Rooms manages permissions for the ID
       * mapping table resource. 
       * When `FALSE` , the resource owner manages permissions for the ID mapping table resource.
       */
      override fun manageResourcePolicies(manageResourcePolicies: IResolvable) {
        cdkBuilder.manageResourcePolicies(manageResourcePolicies.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferenceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferenceConfigProperty,
    ) : CdkObject(cdkObject),
        IdMappingTableInputReferenceConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the referenced resource in AWS Entity Resolution .
       *
       * Valid values are ID mapping workflow ARNs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idmappingtable-idmappingtableinputreferenceconfig.html#cfn-cleanrooms-idmappingtable-idmappingtableinputreferenceconfig-inputreferencearn)
       */
      override fun inputReferenceArn(): String = unwrap(this).getInputReferenceArn()

      /**
       * When `TRUE` , AWS Clean Rooms manages permissions for the ID mapping table resource.
       *
       * When `FALSE` , the resource owner manages permissions for the ID mapping table resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idmappingtable-idmappingtableinputreferenceconfig.html#cfn-cleanrooms-idmappingtable-idmappingtableinputreferenceconfig-manageresourcepolicies)
       */
      override fun manageResourcePolicies(): Any = unwrap(this).getManageResourcePolicies()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdMappingTableInputReferenceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferenceConfigProperty):
          IdMappingTableInputReferenceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdMappingTableInputReferenceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingTableInputReferenceConfigProperty):
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferenceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferenceConfigProperty
    }
  }

  /**
   * The input reference properties for the ID mapping table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * IdMappingTableInputReferencePropertiesProperty idMappingTableInputReferencePropertiesProperty =
   * IdMappingTableInputReferencePropertiesProperty.builder()
   * .idMappingTableInputSource(List.of(IdMappingTableInputSourceProperty.builder()
   * .idNamespaceAssociationId("idNamespaceAssociationId")
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idmappingtable-idmappingtableinputreferenceproperties.html)
   */
  public interface IdMappingTableInputReferencePropertiesProperty {
    /**
     * The input source of the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idmappingtable-idmappingtableinputreferenceproperties.html#cfn-cleanrooms-idmappingtable-idmappingtableinputreferenceproperties-idmappingtableinputsource)
     */
    public fun idMappingTableInputSource(): Any

    /**
     * A builder for [IdMappingTableInputReferencePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idMappingTableInputSource The input source of the ID mapping table. 
       */
      public fun idMappingTableInputSource(idMappingTableInputSource: IResolvable)

      /**
       * @param idMappingTableInputSource The input source of the ID mapping table. 
       */
      public fun idMappingTableInputSource(idMappingTableInputSource: List<Any>)

      /**
       * @param idMappingTableInputSource The input source of the ID mapping table. 
       */
      public fun idMappingTableInputSource(vararg idMappingTableInputSource: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferencePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferencePropertiesProperty.builder()

      /**
       * @param idMappingTableInputSource The input source of the ID mapping table. 
       */
      override fun idMappingTableInputSource(idMappingTableInputSource: IResolvable) {
        cdkBuilder.idMappingTableInputSource(idMappingTableInputSource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param idMappingTableInputSource The input source of the ID mapping table. 
       */
      override fun idMappingTableInputSource(idMappingTableInputSource: List<Any>) {
        cdkBuilder.idMappingTableInputSource(idMappingTableInputSource.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param idMappingTableInputSource The input source of the ID mapping table. 
       */
      override fun idMappingTableInputSource(vararg idMappingTableInputSource: Any): Unit =
          idMappingTableInputSource(idMappingTableInputSource.toList())

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferencePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferencePropertiesProperty,
    ) : CdkObject(cdkObject),
        IdMappingTableInputReferencePropertiesProperty {
      /**
       * The input source of the ID mapping table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idmappingtable-idmappingtableinputreferenceproperties.html#cfn-cleanrooms-idmappingtable-idmappingtableinputreferenceproperties-idmappingtableinputsource)
       */
      override fun idMappingTableInputSource(): Any = unwrap(this).getIdMappingTableInputSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdMappingTableInputReferencePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferencePropertiesProperty):
          IdMappingTableInputReferencePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdMappingTableInputReferencePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingTableInputReferencePropertiesProperty):
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferencePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputReferencePropertiesProperty
    }
  }

  /**
   * The input source of the ID mapping table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * IdMappingTableInputSourceProperty idMappingTableInputSourceProperty =
   * IdMappingTableInputSourceProperty.builder()
   * .idNamespaceAssociationId("idNamespaceAssociationId")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idmappingtable-idmappingtableinputsource.html)
   */
  public interface IdMappingTableInputSourceProperty {
    /**
     * The unique identifier of the ID namespace association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idmappingtable-idmappingtableinputsource.html#cfn-cleanrooms-idmappingtable-idmappingtableinputsource-idnamespaceassociationid)
     */
    public fun idNamespaceAssociationId(): String

    /**
     * The type of the input source of the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idmappingtable-idmappingtableinputsource.html#cfn-cleanrooms-idmappingtable-idmappingtableinputsource-type)
     */
    public fun type(): String

    /**
     * A builder for [IdMappingTableInputSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idNamespaceAssociationId The unique identifier of the ID namespace association. 
       */
      public fun idNamespaceAssociationId(idNamespaceAssociationId: String)

      /**
       * @param type The type of the input source of the ID mapping table. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputSourceProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputSourceProperty.builder()

      /**
       * @param idNamespaceAssociationId The unique identifier of the ID namespace association. 
       */
      override fun idNamespaceAssociationId(idNamespaceAssociationId: String) {
        cdkBuilder.idNamespaceAssociationId(idNamespaceAssociationId)
      }

      /**
       * @param type The type of the input source of the ID mapping table. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputSourceProperty,
    ) : CdkObject(cdkObject),
        IdMappingTableInputSourceProperty {
      /**
       * The unique identifier of the ID namespace association.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idmappingtable-idmappingtableinputsource.html#cfn-cleanrooms-idmappingtable-idmappingtableinputsource-idnamespaceassociationid)
       */
      override fun idNamespaceAssociationId(): String = unwrap(this).getIdNamespaceAssociationId()

      /**
       * The type of the input source of the ID mapping table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-idmappingtable-idmappingtableinputsource.html#cfn-cleanrooms-idmappingtable-idmappingtableinputsource-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdMappingTableInputSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputSourceProperty):
          IdMappingTableInputSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdMappingTableInputSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingTableInputSourceProperty):
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable.IdMappingTableInputSourceProperty
    }
  }
}
