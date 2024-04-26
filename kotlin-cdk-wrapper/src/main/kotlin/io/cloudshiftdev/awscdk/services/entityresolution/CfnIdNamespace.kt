@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.entityresolution

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an ID namespace object which will help customers provide metadata explaining their
 * dataset and how to use it.
 *
 * Each ID namespace must have a unique name. To modify an existing ID namespace, use the
 * `UpdateIdNamespace` API.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.entityresolution.*;
 * CfnIdNamespace cfnIdNamespace = CfnIdNamespace.Builder.create(this, "MyCfnIdNamespace")
 * .idNamespaceName("idNamespaceName")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .idMappingWorkflowProperties(List.of(IdNamespaceIdMappingWorkflowPropertiesProperty.builder()
 * .idMappingType("idMappingType")
 * // the properties below are optional
 * .providerProperties(NamespaceProviderPropertiesProperty.builder()
 * .providerServiceArn("providerServiceArn")
 * // the properties below are optional
 * .providerConfiguration(Map.of(
 * "providerConfigurationKey", "providerConfiguration"))
 * .build())
 * .build()))
 * .inputSourceConfig(List.of(IdNamespaceInputSourceProperty.builder()
 * .inputSourceArn("inputSourceArn")
 * // the properties below are optional
 * .schemaName("schemaName")
 * .build()))
 * .roleArn("roleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html)
 */
public open class CfnIdNamespace(
  cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespace,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdNamespaceProps,
  ) :
      this(software.amazon.awscdk.services.entityresolution.CfnIdNamespace(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnIdNamespaceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdNamespaceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIdNamespaceProps(props)
  )

  /**
   * The date and time when the IdNamespace was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The arn associated with the IdNamespace.
   */
  public open fun attrIdNamespaceArn(): String = unwrap(this).getAttrIdNamespaceArn()

  /**
   * The date and time when the IdNamespace was updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the ID namespace.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the ID namespace.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Determines the properties of `IdMappingWorflow` where this `IdNamespace` can be used as a
   * `Source` or a `Target` .
   */
  public open fun idMappingWorkflowProperties(): Any? =
      unwrap(this).getIdMappingWorkflowProperties()

  /**
   * Determines the properties of `IdMappingWorflow` where this `IdNamespace` can be used as a
   * `Source` or a `Target` .
   */
  public open fun idMappingWorkflowProperties(`value`: IResolvable) {
    unwrap(this).setIdMappingWorkflowProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * Determines the properties of `IdMappingWorflow` where this `IdNamespace` can be used as a
   * `Source` or a `Target` .
   */
  public open fun idMappingWorkflowProperties(`value`: List<Any>) {
    unwrap(this).setIdMappingWorkflowProperties(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Determines the properties of `IdMappingWorflow` where this `IdNamespace` can be used as a
   * `Source` or a `Target` .
   */
  public open fun idMappingWorkflowProperties(vararg `value`: Any): Unit =
      idMappingWorkflowProperties(`value`.toList())

  /**
   * The name of the ID namespace.
   */
  public open fun idNamespaceName(): String = unwrap(this).getIdNamespaceName()

  /**
   * The name of the ID namespace.
   */
  public open fun idNamespaceName(`value`: String) {
    unwrap(this).setIdNamespaceName(`value`)
  }

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   */
  public open fun inputSourceConfig(): Any? = unwrap(this).getInputSourceConfig()

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   */
  public open fun inputSourceConfig(`value`: IResolvable) {
    unwrap(this).setInputSourceConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   */
  public open fun inputSourceConfig(`value`: List<Any>) {
    unwrap(this).setInputSourceConfig(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   */
  public open fun inputSourceConfig(vararg `value`: Any): Unit = inputSourceConfig(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The type of ID namespace.
   *
   * There are two types: `SOURCE` and `TARGET` .
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of ID namespace.
   *
   * There are two types: `SOURCE` and `TARGET` .
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.entityresolution.CfnIdNamespace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the ID namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-description)
     * @param description The description of the ID namespace. 
     */
    public fun description(description: String)

    /**
     * Determines the properties of `IdMappingWorflow` where this `IdNamespace` can be used as a
     * `Source` or a `Target` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-idmappingworkflowproperties)
     * @param idMappingWorkflowProperties Determines the properties of `IdMappingWorflow` where this
     * `IdNamespace` can be used as a `Source` or a `Target` . 
     */
    public fun idMappingWorkflowProperties(idMappingWorkflowProperties: IResolvable)

    /**
     * Determines the properties of `IdMappingWorflow` where this `IdNamespace` can be used as a
     * `Source` or a `Target` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-idmappingworkflowproperties)
     * @param idMappingWorkflowProperties Determines the properties of `IdMappingWorflow` where this
     * `IdNamespace` can be used as a `Source` or a `Target` . 
     */
    public fun idMappingWorkflowProperties(idMappingWorkflowProperties: List<Any>)

    /**
     * Determines the properties of `IdMappingWorflow` where this `IdNamespace` can be used as a
     * `Source` or a `Target` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-idmappingworkflowproperties)
     * @param idMappingWorkflowProperties Determines the properties of `IdMappingWorflow` where this
     * `IdNamespace` can be used as a `Source` or a `Target` . 
     */
    public fun idMappingWorkflowProperties(vararg idMappingWorkflowProperties: Any)

    /**
     * The name of the ID namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-idnamespacename)
     * @param idNamespaceName The name of the ID namespace. 
     */
    public fun idNamespaceName(idNamespaceName: String)

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    public fun inputSourceConfig(inputSourceConfig: IResolvable)

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    public fun inputSourceConfig(inputSourceConfig: List<Any>)

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    public fun inputSourceConfig(vararg inputSourceConfig: Any)

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     *
     * AWS Entity Resolution assumes this role to access the resources defined in this `IdNamespace`
     * on your behalf as part of the workflow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of ID namespace. There are two types: `SOURCE` and `TARGET` .
     *
     * The `SOURCE` contains configurations for `sourceId` data that will be processed in an ID
     * mapping workflow.
     *
     * The `TARGET` contains a configuration of `targetId` to which all `sourceIds` will resolve to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-type)
     * @param type The type of ID namespace. There are two types: `SOURCE` and `TARGET` . 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.entityresolution.CfnIdNamespace.Builder
        = software.amazon.awscdk.services.entityresolution.CfnIdNamespace.Builder.create(scope, id)

    /**
     * The description of the ID namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-description)
     * @param description The description of the ID namespace. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Determines the properties of `IdMappingWorflow` where this `IdNamespace` can be used as a
     * `Source` or a `Target` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-idmappingworkflowproperties)
     * @param idMappingWorkflowProperties Determines the properties of `IdMappingWorflow` where this
     * `IdNamespace` can be used as a `Source` or a `Target` . 
     */
    override fun idMappingWorkflowProperties(idMappingWorkflowProperties: IResolvable) {
      cdkBuilder.idMappingWorkflowProperties(idMappingWorkflowProperties.let(IResolvable::unwrap))
    }

    /**
     * Determines the properties of `IdMappingWorflow` where this `IdNamespace` can be used as a
     * `Source` or a `Target` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-idmappingworkflowproperties)
     * @param idMappingWorkflowProperties Determines the properties of `IdMappingWorflow` where this
     * `IdNamespace` can be used as a `Source` or a `Target` . 
     */
    override fun idMappingWorkflowProperties(idMappingWorkflowProperties: List<Any>) {
      cdkBuilder.idMappingWorkflowProperties(idMappingWorkflowProperties.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Determines the properties of `IdMappingWorflow` where this `IdNamespace` can be used as a
     * `Source` or a `Target` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-idmappingworkflowproperties)
     * @param idMappingWorkflowProperties Determines the properties of `IdMappingWorflow` where this
     * `IdNamespace` can be used as a `Source` or a `Target` . 
     */
    override fun idMappingWorkflowProperties(vararg idMappingWorkflowProperties: Any): Unit =
        idMappingWorkflowProperties(idMappingWorkflowProperties.toList())

    /**
     * The name of the ID namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-idnamespacename)
     * @param idNamespaceName The name of the ID namespace. 
     */
    override fun idNamespaceName(idNamespaceName: String) {
      cdkBuilder.idNamespaceName(idNamespaceName)
    }

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(inputSourceConfig: IResolvable) {
      cdkBuilder.inputSourceConfig(inputSourceConfig.let(IResolvable::unwrap))
    }

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(inputSourceConfig: List<Any>) {
      cdkBuilder.inputSourceConfig(inputSourceConfig.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(vararg inputSourceConfig: Any): Unit =
        inputSourceConfig(inputSourceConfig.toList())

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     *
     * AWS Entity Resolution assumes this role to access the resources defined in this `IdNamespace`
     * on your behalf as part of the workflow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of ID namespace. There are two types: `SOURCE` and `TARGET` .
     *
     * The `SOURCE` contains configurations for `sourceId` data that will be processed in an ID
     * mapping workflow.
     *
     * The `TARGET` contains a configuration of `targetId` to which all `sourceIds` will resolve to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-type)
     * @param type The type of ID namespace. There are two types: `SOURCE` and `TARGET` . 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnIdNamespace =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.entityresolution.CfnIdNamespace.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdNamespace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespace):
        CfnIdNamespace = CfnIdNamespace(cdkObject)

    internal fun unwrap(wrapped: CfnIdNamespace):
        software.amazon.awscdk.services.entityresolution.CfnIdNamespace = wrapped.cdkObject as
        software.amazon.awscdk.services.entityresolution.CfnIdNamespace
  }

  /**
   * An object containing `IdMappingType` and `ProviderProperties` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
   * IdNamespaceIdMappingWorkflowPropertiesProperty idNamespaceIdMappingWorkflowPropertiesProperty =
   * IdNamespaceIdMappingWorkflowPropertiesProperty.builder()
   * .idMappingType("idMappingType")
   * // the properties below are optional
   * .providerProperties(NamespaceProviderPropertiesProperty.builder()
   * .providerServiceArn("providerServiceArn")
   * // the properties below are optional
   * .providerConfiguration(Map.of(
   * "providerConfigurationKey", "providerConfiguration"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-idnamespaceidmappingworkflowproperties.html)
   */
  public interface IdNamespaceIdMappingWorkflowPropertiesProperty {
    /**
     * The type of ID mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-idnamespaceidmappingworkflowproperties.html#cfn-entityresolution-idnamespace-idnamespaceidmappingworkflowproperties-idmappingtype)
     */
    public fun idMappingType(): String

    /**
     * An object which defines any additional configurations required by the provider service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-idnamespaceidmappingworkflowproperties.html#cfn-entityresolution-idnamespace-idnamespaceidmappingworkflowproperties-providerproperties)
     */
    public fun providerProperties(): Any? = unwrap(this).getProviderProperties()

    /**
     * A builder for [IdNamespaceIdMappingWorkflowPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idMappingType The type of ID mapping. 
       */
      public fun idMappingType(idMappingType: String)

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      public fun providerProperties(providerProperties: IResolvable)

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      public fun providerProperties(providerProperties: NamespaceProviderPropertiesProperty)

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78ad4e8085bdee3d62dad29fd5bb09ed9a22f0461305c03a444452386fd185e0")
      public
          fun providerProperties(providerProperties: NamespaceProviderPropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceIdMappingWorkflowPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceIdMappingWorkflowPropertiesProperty.builder()

      /**
       * @param idMappingType The type of ID mapping. 
       */
      override fun idMappingType(idMappingType: String) {
        cdkBuilder.idMappingType(idMappingType)
      }

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      override fun providerProperties(providerProperties: IResolvable) {
        cdkBuilder.providerProperties(providerProperties.let(IResolvable::unwrap))
      }

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      override fun providerProperties(providerProperties: NamespaceProviderPropertiesProperty) {
        cdkBuilder.providerProperties(providerProperties.let(NamespaceProviderPropertiesProperty::unwrap))
      }

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78ad4e8085bdee3d62dad29fd5bb09ed9a22f0461305c03a444452386fd185e0")
      override
          fun providerProperties(providerProperties: NamespaceProviderPropertiesProperty.Builder.() -> Unit):
          Unit = providerProperties(NamespaceProviderPropertiesProperty(providerProperties))

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceIdMappingWorkflowPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceIdMappingWorkflowPropertiesProperty,
    ) : CdkObject(cdkObject), IdNamespaceIdMappingWorkflowPropertiesProperty {
      /**
       * The type of ID mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-idnamespaceidmappingworkflowproperties.html#cfn-entityresolution-idnamespace-idnamespaceidmappingworkflowproperties-idmappingtype)
       */
      override fun idMappingType(): String = unwrap(this).getIdMappingType()

      /**
       * An object which defines any additional configurations required by the provider service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-idnamespaceidmappingworkflowproperties.html#cfn-entityresolution-idnamespace-idnamespaceidmappingworkflowproperties-providerproperties)
       */
      override fun providerProperties(): Any? = unwrap(this).getProviderProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdNamespaceIdMappingWorkflowPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceIdMappingWorkflowPropertiesProperty):
          IdNamespaceIdMappingWorkflowPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdNamespaceIdMappingWorkflowPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdNamespaceIdMappingWorkflowPropertiesProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceIdMappingWorkflowPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceIdMappingWorkflowPropertiesProperty
    }
  }

  /**
   * An object containing `InputSourceARN` and `SchemaName` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
   * IdNamespaceInputSourceProperty idNamespaceInputSourceProperty =
   * IdNamespaceInputSourceProperty.builder()
   * .inputSourceArn("inputSourceArn")
   * // the properties below are optional
   * .schemaName("schemaName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-idnamespaceinputsource.html)
   */
  public interface IdNamespaceInputSourceProperty {
    /**
     * An AWS Glue table ARN for the input source table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-idnamespaceinputsource.html#cfn-entityresolution-idnamespace-idnamespaceinputsource-inputsourcearn)
     */
    public fun inputSourceArn(): String

    /**
     * The name of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-idnamespaceinputsource.html#cfn-entityresolution-idnamespace-idnamespaceinputsource-schemaname)
     */
    public fun schemaName(): String? = unwrap(this).getSchemaName()

    /**
     * A builder for [IdNamespaceInputSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputSourceArn An AWS Glue table ARN for the input source table. 
       */
      public fun inputSourceArn(inputSourceArn: String)

      /**
       * @param schemaName The name of the schema.
       */
      public fun schemaName(schemaName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceInputSourceProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceInputSourceProperty.builder()

      /**
       * @param inputSourceArn An AWS Glue table ARN for the input source table. 
       */
      override fun inputSourceArn(inputSourceArn: String) {
        cdkBuilder.inputSourceArn(inputSourceArn)
      }

      /**
       * @param schemaName The name of the schema.
       */
      override fun schemaName(schemaName: String) {
        cdkBuilder.schemaName(schemaName)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceInputSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceInputSourceProperty,
    ) : CdkObject(cdkObject), IdNamespaceInputSourceProperty {
      /**
       * An AWS Glue table ARN for the input source table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-idnamespaceinputsource.html#cfn-entityresolution-idnamespace-idnamespaceinputsource-inputsourcearn)
       */
      override fun inputSourceArn(): String = unwrap(this).getInputSourceArn()

      /**
       * The name of the schema.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-idnamespaceinputsource.html#cfn-entityresolution-idnamespace-idnamespaceinputsource-schemaname)
       */
      override fun schemaName(): String? = unwrap(this).getSchemaName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IdNamespaceInputSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceInputSourceProperty):
          IdNamespaceInputSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdNamespaceInputSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdNamespaceInputSourceProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceInputSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceInputSourceProperty
    }
  }

  /**
   * An object containing `ProviderConfiguration` and `ProviderServiceArn` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
   * NamespaceProviderPropertiesProperty namespaceProviderPropertiesProperty =
   * NamespaceProviderPropertiesProperty.builder()
   * .providerServiceArn("providerServiceArn")
   * // the properties below are optional
   * .providerConfiguration(Map.of(
   * "providerConfigurationKey", "providerConfiguration"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespaceproviderproperties.html)
   */
  public interface NamespaceProviderPropertiesProperty {
    /**
     * An object which defines any additional configurations required by the provider service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespaceproviderproperties.html#cfn-entityresolution-idnamespace-namespaceproviderproperties-providerconfiguration)
     */
    public fun providerConfiguration(): Any? = unwrap(this).getProviderConfiguration()

    /**
     * The Amazon Resource Name (ARN) of the provider service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespaceproviderproperties.html#cfn-entityresolution-idnamespace-namespaceproviderproperties-providerservicearn)
     */
    public fun providerServiceArn(): String

    /**
     * A builder for [NamespaceProviderPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param providerConfiguration An object which defines any additional configurations required
       * by the provider service.
       */
      public fun providerConfiguration(providerConfiguration: IResolvable)

      /**
       * @param providerConfiguration An object which defines any additional configurations required
       * by the provider service.
       */
      public fun providerConfiguration(providerConfiguration: Map<String, String>)

      /**
       * @param providerServiceArn The Amazon Resource Name (ARN) of the provider service. 
       */
      public fun providerServiceArn(providerServiceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceProviderPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceProviderPropertiesProperty.builder()

      /**
       * @param providerConfiguration An object which defines any additional configurations required
       * by the provider service.
       */
      override fun providerConfiguration(providerConfiguration: IResolvable) {
        cdkBuilder.providerConfiguration(providerConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param providerConfiguration An object which defines any additional configurations required
       * by the provider service.
       */
      override fun providerConfiguration(providerConfiguration: Map<String, String>) {
        cdkBuilder.providerConfiguration(providerConfiguration)
      }

      /**
       * @param providerServiceArn The Amazon Resource Name (ARN) of the provider service. 
       */
      override fun providerServiceArn(providerServiceArn: String) {
        cdkBuilder.providerServiceArn(providerServiceArn)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceProviderPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceProviderPropertiesProperty,
    ) : CdkObject(cdkObject), NamespaceProviderPropertiesProperty {
      /**
       * An object which defines any additional configurations required by the provider service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespaceproviderproperties.html#cfn-entityresolution-idnamespace-namespaceproviderproperties-providerconfiguration)
       */
      override fun providerConfiguration(): Any? = unwrap(this).getProviderConfiguration()

      /**
       * The Amazon Resource Name (ARN) of the provider service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespaceproviderproperties.html#cfn-entityresolution-idnamespace-namespaceproviderproperties-providerservicearn)
       */
      override fun providerServiceArn(): String = unwrap(this).getProviderServiceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NamespaceProviderPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceProviderPropertiesProperty):
          NamespaceProviderPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NamespaceProviderPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NamespaceProviderPropertiesProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceProviderPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceProviderPropertiesProperty
    }
  }
}
