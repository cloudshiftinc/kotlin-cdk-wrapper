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
 * .ruleBasedProperties(NamespaceRuleBasedPropertiesProperty.builder()
 * .attributeMatchingModel("attributeMatchingModel")
 * .recordMatchingModels(List.of("recordMatchingModels"))
 * .ruleDefinitionTypes(List.of("ruleDefinitionTypes"))
 * .rules(List.of(RuleProperty.builder()
 * .matchingKeys(List.of("matchingKeys"))
 * .ruleName("ruleName")
 * .build()))
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
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdNamespaceProps,
  ) :
      this(software.amazon.awscdk.services.entityresolution.CfnIdNamespace(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIdNamespaceProps.Companion::unwrap))
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
    unwrap(this).setIdMappingWorkflowProperties(`value`.let(IResolvable.Companion::unwrap))
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
    unwrap(this).setInputSourceConfig(`value`.let(IResolvable.Companion::unwrap))
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
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
     * The `TARGET` contains a configuration of `targetId` which all `sourceIds` will resolve to.
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
      cdkBuilder.idMappingWorkflowProperties(idMappingWorkflowProperties.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.inputSourceConfig(inputSourceConfig.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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
     * The `TARGET` contains a configuration of `targetId` which all `sourceIds` will resolve to.
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
   * An object containing `IdMappingType` , `ProviderProperties` , and `RuleBasedProperties` .
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
   * .ruleBasedProperties(NamespaceRuleBasedPropertiesProperty.builder()
   * .attributeMatchingModel("attributeMatchingModel")
   * .recordMatchingModels(List.of("recordMatchingModels"))
   * .ruleDefinitionTypes(List.of("ruleDefinitionTypes"))
   * .rules(List.of(RuleProperty.builder()
   * .matchingKeys(List.of("matchingKeys"))
   * .ruleName("ruleName")
   * .build()))
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
     * An object which defines any additional configurations required by rule-based matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-idnamespaceidmappingworkflowproperties.html#cfn-entityresolution-idnamespace-idnamespaceidmappingworkflowproperties-rulebasedproperties)
     */
    public fun ruleBasedProperties(): Any? = unwrap(this).getRuleBasedProperties()

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

      /**
       * @param ruleBasedProperties An object which defines any additional configurations required
       * by rule-based matching.
       */
      public fun ruleBasedProperties(ruleBasedProperties: IResolvable)

      /**
       * @param ruleBasedProperties An object which defines any additional configurations required
       * by rule-based matching.
       */
      public fun ruleBasedProperties(ruleBasedProperties: NamespaceRuleBasedPropertiesProperty)

      /**
       * @param ruleBasedProperties An object which defines any additional configurations required
       * by rule-based matching.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a700a811b7510231362a5c6d97b3a9e9ee067505f69870f37003feeb7864965c")
      public
          fun ruleBasedProperties(ruleBasedProperties: NamespaceRuleBasedPropertiesProperty.Builder.() -> Unit)
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
        cdkBuilder.providerProperties(providerProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      override fun providerProperties(providerProperties: NamespaceProviderPropertiesProperty) {
        cdkBuilder.providerProperties(providerProperties.let(NamespaceProviderPropertiesProperty.Companion::unwrap))
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

      /**
       * @param ruleBasedProperties An object which defines any additional configurations required
       * by rule-based matching.
       */
      override fun ruleBasedProperties(ruleBasedProperties: IResolvable) {
        cdkBuilder.ruleBasedProperties(ruleBasedProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ruleBasedProperties An object which defines any additional configurations required
       * by rule-based matching.
       */
      override fun ruleBasedProperties(ruleBasedProperties: NamespaceRuleBasedPropertiesProperty) {
        cdkBuilder.ruleBasedProperties(ruleBasedProperties.let(NamespaceRuleBasedPropertiesProperty.Companion::unwrap))
      }

      /**
       * @param ruleBasedProperties An object which defines any additional configurations required
       * by rule-based matching.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a700a811b7510231362a5c6d97b3a9e9ee067505f69870f37003feeb7864965c")
      override
          fun ruleBasedProperties(ruleBasedProperties: NamespaceRuleBasedPropertiesProperty.Builder.() -> Unit):
          Unit = ruleBasedProperties(NamespaceRuleBasedPropertiesProperty(ruleBasedProperties))

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceIdMappingWorkflowPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespace.IdNamespaceIdMappingWorkflowPropertiesProperty,
    ) : CdkObject(cdkObject),
        IdNamespaceIdMappingWorkflowPropertiesProperty {
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

      /**
       * An object which defines any additional configurations required by rule-based matching.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-idnamespaceidmappingworkflowproperties.html#cfn-entityresolution-idnamespace-idnamespaceidmappingworkflowproperties-rulebasedproperties)
       */
      override fun ruleBasedProperties(): Any? = unwrap(this).getRuleBasedProperties()
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
     * An AWS Glue table Amazon Resource Name (ARN) or a matching workflow ARN for the input source
     * table.
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
       * @param inputSourceArn An AWS Glue table Amazon Resource Name (ARN) or a matching workflow
       * ARN for the input source table. 
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
       * @param inputSourceArn An AWS Glue table Amazon Resource Name (ARN) or a matching workflow
       * ARN for the input source table. 
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
    ) : CdkObject(cdkObject),
        IdNamespaceInputSourceProperty {
      /**
       * An AWS Glue table Amazon Resource Name (ARN) or a matching workflow ARN for the input
       * source table.
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
        cdkBuilder.providerConfiguration(providerConfiguration.let(IResolvable.Companion::unwrap))
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
    ) : CdkObject(cdkObject),
        NamespaceProviderPropertiesProperty {
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

  /**
   * The rule-based properties of an ID namespace.
   *
   * These properties define how the ID namespace can be used in an ID mapping workflow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
   * NamespaceRuleBasedPropertiesProperty namespaceRuleBasedPropertiesProperty =
   * NamespaceRuleBasedPropertiesProperty.builder()
   * .attributeMatchingModel("attributeMatchingModel")
   * .recordMatchingModels(List.of("recordMatchingModels"))
   * .ruleDefinitionTypes(List.of("ruleDefinitionTypes"))
   * .rules(List.of(RuleProperty.builder()
   * .matchingKeys(List.of("matchingKeys"))
   * .ruleName("ruleName")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespacerulebasedproperties.html)
   */
  public interface NamespaceRuleBasedPropertiesProperty {
    /**
     * The comparison type. You can either choose `ONE_TO_ONE` or `MANY_TO_MANY` as the
     * `attributeMatchingModel` .
     *
     * If you choose `MANY_TO_MANY` , the system can match attributes across the sub-types of an
     * attribute type. For example, if the value of the `Email` field of Profile A matches the value of
     * `BusinessEmail` field of Profile B, the two profiles are matched on the `Email` attribute type.
     *
     * If you choose `ONE_TO_ONE` , the system can only match attributes if the sub-types are an
     * exact match. For example, for the `Email` attribute type, the system will only consider it a
     * match if the value of the `Email` field of Profile A matches the value of the `Email` field of
     * Profile B.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespacerulebasedproperties.html#cfn-entityresolution-idnamespace-namespacerulebasedproperties-attributematchingmodel)
     */
    public fun attributeMatchingModel(): String? = unwrap(this).getAttributeMatchingModel()

    /**
     * The type of matching record that is allowed to be used in an ID mapping workflow.
     *
     * If the value is set to `ONE_SOURCE_TO_ONE_TARGET` , only one record in the source is matched
     * to one record in the target.
     *
     * If the value is set to `MANY_SOURCE_TO_ONE_TARGET` , all matching records in the source are
     * matched to one record in the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespacerulebasedproperties.html#cfn-entityresolution-idnamespace-namespacerulebasedproperties-recordmatchingmodels)
     */
    public fun recordMatchingModels(): List<String> = unwrap(this).getRecordMatchingModels() ?:
        emptyList()

    /**
     * The sets of rules you can use in an ID mapping workflow.
     *
     * The limitations specified for the source and target must be compatible.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespacerulebasedproperties.html#cfn-entityresolution-idnamespace-namespacerulebasedproperties-ruledefinitiontypes)
     */
    public fun ruleDefinitionTypes(): List<String> = unwrap(this).getRuleDefinitionTypes() ?:
        emptyList()

    /**
     * The rules for the ID namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespacerulebasedproperties.html#cfn-entityresolution-idnamespace-namespacerulebasedproperties-rules)
     */
    public fun rules(): Any? = unwrap(this).getRules()

    /**
     * A builder for [NamespaceRuleBasedPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeMatchingModel The comparison type. You can either choose `ONE_TO_ONE` or
       * `MANY_TO_MANY` as the `attributeMatchingModel` .
       * If you choose `MANY_TO_MANY` , the system can match attributes across the sub-types of an
       * attribute type. For example, if the value of the `Email` field of Profile A matches the value
       * of `BusinessEmail` field of Profile B, the two profiles are matched on the `Email` attribute
       * type.
       *
       * If you choose `ONE_TO_ONE` , the system can only match attributes if the sub-types are an
       * exact match. For example, for the `Email` attribute type, the system will only consider it a
       * match if the value of the `Email` field of Profile A matches the value of the `Email` field of
       * Profile B.
       */
      public fun attributeMatchingModel(attributeMatchingModel: String)

      /**
       * @param recordMatchingModels The type of matching record that is allowed to be used in an ID
       * mapping workflow.
       * If the value is set to `ONE_SOURCE_TO_ONE_TARGET` , only one record in the source is
       * matched to one record in the target.
       *
       * If the value is set to `MANY_SOURCE_TO_ONE_TARGET` , all matching records in the source are
       * matched to one record in the target.
       */
      public fun recordMatchingModels(recordMatchingModels: List<String>)

      /**
       * @param recordMatchingModels The type of matching record that is allowed to be used in an ID
       * mapping workflow.
       * If the value is set to `ONE_SOURCE_TO_ONE_TARGET` , only one record in the source is
       * matched to one record in the target.
       *
       * If the value is set to `MANY_SOURCE_TO_ONE_TARGET` , all matching records in the source are
       * matched to one record in the target.
       */
      public fun recordMatchingModels(vararg recordMatchingModels: String)

      /**
       * @param ruleDefinitionTypes The sets of rules you can use in an ID mapping workflow.
       * The limitations specified for the source and target must be compatible.
       */
      public fun ruleDefinitionTypes(ruleDefinitionTypes: List<String>)

      /**
       * @param ruleDefinitionTypes The sets of rules you can use in an ID mapping workflow.
       * The limitations specified for the source and target must be compatible.
       */
      public fun ruleDefinitionTypes(vararg ruleDefinitionTypes: String)

      /**
       * @param rules The rules for the ID namespace.
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules The rules for the ID namespace.
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules The rules for the ID namespace.
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceRuleBasedPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceRuleBasedPropertiesProperty.builder()

      /**
       * @param attributeMatchingModel The comparison type. You can either choose `ONE_TO_ONE` or
       * `MANY_TO_MANY` as the `attributeMatchingModel` .
       * If you choose `MANY_TO_MANY` , the system can match attributes across the sub-types of an
       * attribute type. For example, if the value of the `Email` field of Profile A matches the value
       * of `BusinessEmail` field of Profile B, the two profiles are matched on the `Email` attribute
       * type.
       *
       * If you choose `ONE_TO_ONE` , the system can only match attributes if the sub-types are an
       * exact match. For example, for the `Email` attribute type, the system will only consider it a
       * match if the value of the `Email` field of Profile A matches the value of the `Email` field of
       * Profile B.
       */
      override fun attributeMatchingModel(attributeMatchingModel: String) {
        cdkBuilder.attributeMatchingModel(attributeMatchingModel)
      }

      /**
       * @param recordMatchingModels The type of matching record that is allowed to be used in an ID
       * mapping workflow.
       * If the value is set to `ONE_SOURCE_TO_ONE_TARGET` , only one record in the source is
       * matched to one record in the target.
       *
       * If the value is set to `MANY_SOURCE_TO_ONE_TARGET` , all matching records in the source are
       * matched to one record in the target.
       */
      override fun recordMatchingModels(recordMatchingModels: List<String>) {
        cdkBuilder.recordMatchingModels(recordMatchingModels)
      }

      /**
       * @param recordMatchingModels The type of matching record that is allowed to be used in an ID
       * mapping workflow.
       * If the value is set to `ONE_SOURCE_TO_ONE_TARGET` , only one record in the source is
       * matched to one record in the target.
       *
       * If the value is set to `MANY_SOURCE_TO_ONE_TARGET` , all matching records in the source are
       * matched to one record in the target.
       */
      override fun recordMatchingModels(vararg recordMatchingModels: String): Unit =
          recordMatchingModels(recordMatchingModels.toList())

      /**
       * @param ruleDefinitionTypes The sets of rules you can use in an ID mapping workflow.
       * The limitations specified for the source and target must be compatible.
       */
      override fun ruleDefinitionTypes(ruleDefinitionTypes: List<String>) {
        cdkBuilder.ruleDefinitionTypes(ruleDefinitionTypes)
      }

      /**
       * @param ruleDefinitionTypes The sets of rules you can use in an ID mapping workflow.
       * The limitations specified for the source and target must be compatible.
       */
      override fun ruleDefinitionTypes(vararg ruleDefinitionTypes: String): Unit =
          ruleDefinitionTypes(ruleDefinitionTypes.toList())

      /**
       * @param rules The rules for the ID namespace.
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rules The rules for the ID namespace.
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param rules The rules for the ID namespace.
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceRuleBasedPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceRuleBasedPropertiesProperty,
    ) : CdkObject(cdkObject),
        NamespaceRuleBasedPropertiesProperty {
      /**
       * The comparison type. You can either choose `ONE_TO_ONE` or `MANY_TO_MANY` as the
       * `attributeMatchingModel` .
       *
       * If you choose `MANY_TO_MANY` , the system can match attributes across the sub-types of an
       * attribute type. For example, if the value of the `Email` field of Profile A matches the value
       * of `BusinessEmail` field of Profile B, the two profiles are matched on the `Email` attribute
       * type.
       *
       * If you choose `ONE_TO_ONE` , the system can only match attributes if the sub-types are an
       * exact match. For example, for the `Email` attribute type, the system will only consider it a
       * match if the value of the `Email` field of Profile A matches the value of the `Email` field of
       * Profile B.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespacerulebasedproperties.html#cfn-entityresolution-idnamespace-namespacerulebasedproperties-attributematchingmodel)
       */
      override fun attributeMatchingModel(): String? = unwrap(this).getAttributeMatchingModel()

      /**
       * The type of matching record that is allowed to be used in an ID mapping workflow.
       *
       * If the value is set to `ONE_SOURCE_TO_ONE_TARGET` , only one record in the source is
       * matched to one record in the target.
       *
       * If the value is set to `MANY_SOURCE_TO_ONE_TARGET` , all matching records in the source are
       * matched to one record in the target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespacerulebasedproperties.html#cfn-entityresolution-idnamespace-namespacerulebasedproperties-recordmatchingmodels)
       */
      override fun recordMatchingModels(): List<String> = unwrap(this).getRecordMatchingModels() ?:
          emptyList()

      /**
       * The sets of rules you can use in an ID mapping workflow.
       *
       * The limitations specified for the source and target must be compatible.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespacerulebasedproperties.html#cfn-entityresolution-idnamespace-namespacerulebasedproperties-ruledefinitiontypes)
       */
      override fun ruleDefinitionTypes(): List<String> = unwrap(this).getRuleDefinitionTypes() ?:
          emptyList()

      /**
       * The rules for the ID namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-namespacerulebasedproperties.html#cfn-entityresolution-idnamespace-namespacerulebasedproperties-rules)
       */
      override fun rules(): Any? = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NamespaceRuleBasedPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceRuleBasedPropertiesProperty):
          NamespaceRuleBasedPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NamespaceRuleBasedPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NamespaceRuleBasedPropertiesProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceRuleBasedPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.NamespaceRuleBasedPropertiesProperty
    }
  }

  /**
   * An object containing `RuleName` , and `MatchingKeys` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
   * RuleProperty ruleProperty = RuleProperty.builder()
   * .matchingKeys(List.of("matchingKeys"))
   * .ruleName("ruleName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-rule.html)
   */
  public interface RuleProperty {
    /**
     * A list of `MatchingKeys` .
     *
     * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are considered
     * to match according to this rule if all of the `MatchingKeys` match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-rule.html#cfn-entityresolution-idnamespace-rule-matchingkeys)
     */
    public fun matchingKeys(): List<String>

    /**
     * A name for the matching rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-rule.html#cfn-entityresolution-idnamespace-rule-rulename)
     */
    public fun ruleName(): String

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param matchingKeys A list of `MatchingKeys` . 
       * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are
       * considered to match according to this rule if all of the `MatchingKeys` match.
       */
      public fun matchingKeys(matchingKeys: List<String>)

      /**
       * @param matchingKeys A list of `MatchingKeys` . 
       * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are
       * considered to match according to this rule if all of the `MatchingKeys` match.
       */
      public fun matchingKeys(vararg matchingKeys: String)

      /**
       * @param ruleName A name for the matching rule. 
       */
      public fun ruleName(ruleName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.RuleProperty.Builder =
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.RuleProperty.builder()

      /**
       * @param matchingKeys A list of `MatchingKeys` . 
       * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are
       * considered to match according to this rule if all of the `MatchingKeys` match.
       */
      override fun matchingKeys(matchingKeys: List<String>) {
        cdkBuilder.matchingKeys(matchingKeys)
      }

      /**
       * @param matchingKeys A list of `MatchingKeys` . 
       * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are
       * considered to match according to this rule if all of the `MatchingKeys` match.
       */
      override fun matchingKeys(vararg matchingKeys: String): Unit =
          matchingKeys(matchingKeys.toList())

      /**
       * @param ruleName A name for the matching rule. 
       */
      override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespace.RuleProperty,
    ) : CdkObject(cdkObject),
        RuleProperty {
      /**
       * A list of `MatchingKeys` .
       *
       * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are
       * considered to match according to this rule if all of the `MatchingKeys` match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-rule.html#cfn-entityresolution-idnamespace-rule-matchingkeys)
       */
      override fun matchingKeys(): List<String> = unwrap(this).getMatchingKeys()

      /**
       * A name for the matching rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idnamespace-rule.html#cfn-entityresolution-idnamespace-rule-rulename)
       */
      override fun ruleName(): String = unwrap(this).getRuleName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespace.RuleProperty):
          RuleProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.RuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdNamespace.RuleProperty
    }
  }
}
