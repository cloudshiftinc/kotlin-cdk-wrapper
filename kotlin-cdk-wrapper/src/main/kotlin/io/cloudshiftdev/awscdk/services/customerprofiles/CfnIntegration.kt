@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an Amazon Connect Customer Profiles Integration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
 * CfnIntegration cfnIntegration = CfnIntegration.Builder.create(this, "MyCfnIntegration")
 * .domainName("domainName")
 * // the properties below are optional
 * .flowDefinition(FlowDefinitionProperty.builder()
 * .flowName("flowName")
 * .kmsArn("kmsArn")
 * .sourceFlowConfig(SourceFlowConfigProperty.builder()
 * .connectorType("connectorType")
 * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
 * .marketo(MarketoSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .s3(S3SourcePropertiesProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .build())
 * .salesforce(SalesforceSourcePropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .enableDynamicFieldUpdate(false)
 * .includeDeletedRecords(false)
 * .build())
 * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .zendesk(ZendeskSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .build())
 * // the properties below are optional
 * .connectorProfileName("connectorProfileName")
 * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
 * .datetimeTypeFieldName("datetimeTypeFieldName")
 * .build())
 * .build())
 * .tasks(List.of(TaskProperty.builder()
 * .sourceFields(List.of("sourceFields"))
 * .taskType("taskType")
 * // the properties below are optional
 * .connectorOperator(ConnectorOperatorProperty.builder()
 * .marketo("marketo")
 * .s3("s3")
 * .salesforce("salesforce")
 * .serviceNow("serviceNow")
 * .zendesk("zendesk")
 * .build())
 * .destinationField("destinationField")
 * .taskProperties(List.of(TaskPropertiesMapProperty.builder()
 * .operatorPropertyKey("operatorPropertyKey")
 * .property("property")
 * .build()))
 * .build()))
 * .triggerConfig(TriggerConfigProperty.builder()
 * .triggerType("triggerType")
 * // the properties below are optional
 * .triggerProperties(TriggerPropertiesProperty.builder()
 * .scheduled(ScheduledTriggerPropertiesProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * // the properties below are optional
 * .dataPullMode("dataPullMode")
 * .firstExecutionFrom(123)
 * .scheduleEndTime(123)
 * .scheduleOffset(123)
 * .scheduleStartTime(123)
 * .timezone("timezone")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .build())
 * .objectTypeName("objectTypeName")
 * .objectTypeNames(List.of(ObjectTypeMappingProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .uri("uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html)
 */
public open class CfnIntegration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The timestamp of when the integration was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The timestamp of when the integration was most recently edited.
   */
  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  /**
   * The unique name of the domain.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The unique name of the domain.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * The configuration that controls how Customer Profiles retrieves data from the source.
   */
  public open fun flowDefinition(): Any? = unwrap(this).getFlowDefinition()

  /**
   * The configuration that controls how Customer Profiles retrieves data from the source.
   */
  public open fun flowDefinition(`value`: IResolvable) {
    unwrap(this).setFlowDefinition(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration that controls how Customer Profiles retrieves data from the source.
   */
  public open fun flowDefinition(`value`: FlowDefinitionProperty) {
    unwrap(this).setFlowDefinition(`value`.let(FlowDefinitionProperty::unwrap))
  }

  /**
   * The configuration that controls how Customer Profiles retrieves data from the source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("106c3101070cbd303606afbd389d3a31ef2932e5664f129873a5ca7e080f6e72")
  public open fun flowDefinition(`value`: FlowDefinitionProperty.Builder.() -> Unit): Unit =
      flowDefinition(FlowDefinitionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the profile object type mapping to use.
   */
  public open fun objectTypeName(): String? = unwrap(this).getObjectTypeName()

  /**
   * The name of the profile object type mapping to use.
   */
  public open fun objectTypeName(`value`: String) {
    unwrap(this).setObjectTypeName(`value`)
  }

  /**
   * The object type mapping.
   */
  public open fun objectTypeNames(): Any? = unwrap(this).getObjectTypeNames()

  /**
   * The object type mapping.
   */
  public open fun objectTypeNames(`value`: IResolvable) {
    unwrap(this).setObjectTypeNames(`value`.let(IResolvable::unwrap))
  }

  /**
   * The object type mapping.
   */
  public open fun objectTypeNames(`value`: List<Any>) {
    unwrap(this).setObjectTypeNames(`value`)
  }

  /**
   * The object type mapping.
   */
  public open fun objectTypeNames(vararg `value`: Any): Unit = objectTypeNames(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The URI of the S3 bucket or any other type of data source.
   */
  public open fun uri(): String? = unwrap(this).getUri()

  /**
   * The URI of the S3 bucket or any other type of data source.
   */
  public open fun uri(`value`: String) {
    unwrap(this).setUri(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.customerprofiles.CfnIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-domainname)
     * @param domainName The unique name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * The configuration that controls how Customer Profiles retrieves data from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-flowdefinition)
     * @param flowDefinition The configuration that controls how Customer Profiles retrieves data
     * from the source. 
     */
    public fun flowDefinition(flowDefinition: IResolvable)

    /**
     * The configuration that controls how Customer Profiles retrieves data from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-flowdefinition)
     * @param flowDefinition The configuration that controls how Customer Profiles retrieves data
     * from the source. 
     */
    public fun flowDefinition(flowDefinition: FlowDefinitionProperty)

    /**
     * The configuration that controls how Customer Profiles retrieves data from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-flowdefinition)
     * @param flowDefinition The configuration that controls how Customer Profiles retrieves data
     * from the source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04a0855709d02451743499c02435d7192d2fd29a27f883fbe1c7332f6785d72c")
    public fun flowDefinition(flowDefinition: FlowDefinitionProperty.Builder.() -> Unit)

    /**
     * The name of the profile object type mapping to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypename)
     * @param objectTypeName The name of the profile object type mapping to use. 
     */
    public fun objectTypeName(objectTypeName: String)

    /**
     * The object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypenames)
     * @param objectTypeNames The object type mapping. 
     */
    public fun objectTypeNames(objectTypeNames: IResolvable)

    /**
     * The object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypenames)
     * @param objectTypeNames The object type mapping. 
     */
    public fun objectTypeNames(objectTypeNames: List<Any>)

    /**
     * The object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypenames)
     * @param objectTypeNames The object type mapping. 
     */
    public fun objectTypeNames(vararg objectTypeNames: Any)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The URI of the S3 bucket or any other type of data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-uri)
     * @param uri The URI of the S3 bucket or any other type of data source. 
     */
    public fun uri(uri: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.customerprofiles.CfnIntegration.Builder
        = software.amazon.awscdk.services.customerprofiles.CfnIntegration.Builder.create(scope, id)

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-domainname)
     * @param domainName The unique name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The configuration that controls how Customer Profiles retrieves data from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-flowdefinition)
     * @param flowDefinition The configuration that controls how Customer Profiles retrieves data
     * from the source. 
     */
    override fun flowDefinition(flowDefinition: IResolvable) {
      cdkBuilder.flowDefinition(flowDefinition.let(IResolvable::unwrap))
    }

    /**
     * The configuration that controls how Customer Profiles retrieves data from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-flowdefinition)
     * @param flowDefinition The configuration that controls how Customer Profiles retrieves data
     * from the source. 
     */
    override fun flowDefinition(flowDefinition: FlowDefinitionProperty) {
      cdkBuilder.flowDefinition(flowDefinition.let(FlowDefinitionProperty::unwrap))
    }

    /**
     * The configuration that controls how Customer Profiles retrieves data from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-flowdefinition)
     * @param flowDefinition The configuration that controls how Customer Profiles retrieves data
     * from the source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04a0855709d02451743499c02435d7192d2fd29a27f883fbe1c7332f6785d72c")
    override fun flowDefinition(flowDefinition: FlowDefinitionProperty.Builder.() -> Unit): Unit =
        flowDefinition(FlowDefinitionProperty(flowDefinition))

    /**
     * The name of the profile object type mapping to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypename)
     * @param objectTypeName The name of the profile object type mapping to use. 
     */
    override fun objectTypeName(objectTypeName: String) {
      cdkBuilder.objectTypeName(objectTypeName)
    }

    /**
     * The object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypenames)
     * @param objectTypeNames The object type mapping. 
     */
    override fun objectTypeNames(objectTypeNames: IResolvable) {
      cdkBuilder.objectTypeNames(objectTypeNames.let(IResolvable::unwrap))
    }

    /**
     * The object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypenames)
     * @param objectTypeNames The object type mapping. 
     */
    override fun objectTypeNames(objectTypeNames: List<Any>) {
      cdkBuilder.objectTypeNames(objectTypeNames)
    }

    /**
     * The object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypenames)
     * @param objectTypeNames The object type mapping. 
     */
    override fun objectTypeNames(vararg objectTypeNames: Any): Unit =
        objectTypeNames(objectTypeNames.toList())

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The URI of the S3 bucket or any other type of data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-uri)
     * @param uri The URI of the S3 bucket or any other type of data source. 
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.customerprofiles.CfnIntegration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration):
        CfnIntegration = CfnIntegration(cdkObject)

    internal fun unwrap(wrapped: CfnIntegration):
        software.amazon.awscdk.services.customerprofiles.CfnIntegration = wrapped.cdkObject
  }

  /**
   * The properties that are applied when Marketo is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * MarketoSourcePropertiesProperty marketoSourcePropertiesProperty =
   * MarketoSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-marketosourceproperties.html)
   */
  public interface MarketoSourcePropertiesProperty {
    /**
     * The object specified in the Marketo flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-marketosourceproperties.html#cfn-customerprofiles-integration-marketosourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [MarketoSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Marketo flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the Marketo flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty,
    ) : CdkObject(cdkObject), MarketoSourcePropertiesProperty {
      /**
       * The object specified in the Marketo flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-marketosourceproperties.html#cfn-customerprofiles-integration-marketosourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MarketoSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty):
          MarketoSourcePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MarketoSourcePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MarketoSourcePropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty
    }
  }

  /**
   * The operation to be performed on the provided source fields.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ConnectorOperatorProperty connectorOperatorProperty = ConnectorOperatorProperty.builder()
   * .marketo("marketo")
   * .s3("s3")
   * .salesforce("salesforce")
   * .serviceNow("serviceNow")
   * .zendesk("zendesk")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-connectoroperator.html)
   */
  public interface ConnectorOperatorProperty {
    /**
     * The operation to be performed on the provided Marketo source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-connectoroperator.html#cfn-customerprofiles-integration-connectoroperator-marketo)
     */
    public fun marketo(): String? = unwrap(this).getMarketo()

    /**
     * The operation to be performed on the provided Amazon S3 source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-connectoroperator.html#cfn-customerprofiles-integration-connectoroperator-s3)
     */
    public fun s3(): String? = unwrap(this).getS3()

    /**
     * The operation to be performed on the provided Salesforce source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-connectoroperator.html#cfn-customerprofiles-integration-connectoroperator-salesforce)
     */
    public fun salesforce(): String? = unwrap(this).getSalesforce()

    /**
     * The operation to be performed on the provided ServiceNow source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-connectoroperator.html#cfn-customerprofiles-integration-connectoroperator-servicenow)
     */
    public fun serviceNow(): String? = unwrap(this).getServiceNow()

    /**
     * The operation to be performed on the provided Zendesk source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-connectoroperator.html#cfn-customerprofiles-integration-connectoroperator-zendesk)
     */
    public fun zendesk(): String? = unwrap(this).getZendesk()

    /**
     * A builder for [ConnectorOperatorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param marketo The operation to be performed on the provided Marketo source fields.
       */
      public fun marketo(marketo: String)

      /**
       * @param s3 The operation to be performed on the provided Amazon S3 source fields.
       */
      public fun s3(s3: String)

      /**
       * @param salesforce The operation to be performed on the provided Salesforce source fields.
       */
      public fun salesforce(salesforce: String)

      /**
       * @param serviceNow The operation to be performed on the provided ServiceNow source fields.
       */
      public fun serviceNow(serviceNow: String)

      /**
       * @param zendesk The operation to be performed on the provided Zendesk source fields.
       */
      public fun zendesk(zendesk: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty.builder()

      /**
       * @param marketo The operation to be performed on the provided Marketo source fields.
       */
      override fun marketo(marketo: String) {
        cdkBuilder.marketo(marketo)
      }

      /**
       * @param s3 The operation to be performed on the provided Amazon S3 source fields.
       */
      override fun s3(s3: String) {
        cdkBuilder.s3(s3)
      }

      /**
       * @param salesforce The operation to be performed on the provided Salesforce source fields.
       */
      override fun salesforce(salesforce: String) {
        cdkBuilder.salesforce(salesforce)
      }

      /**
       * @param serviceNow The operation to be performed on the provided ServiceNow source fields.
       */
      override fun serviceNow(serviceNow: String) {
        cdkBuilder.serviceNow(serviceNow)
      }

      /**
       * @param zendesk The operation to be performed on the provided Zendesk source fields.
       */
      override fun zendesk(zendesk: String) {
        cdkBuilder.zendesk(zendesk)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty,
    ) : CdkObject(cdkObject), ConnectorOperatorProperty {
      /**
       * The operation to be performed on the provided Marketo source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-connectoroperator.html#cfn-customerprofiles-integration-connectoroperator-marketo)
       */
      override fun marketo(): String? = unwrap(this).getMarketo()

      /**
       * The operation to be performed on the provided Amazon S3 source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-connectoroperator.html#cfn-customerprofiles-integration-connectoroperator-s3)
       */
      override fun s3(): String? = unwrap(this).getS3()

      /**
       * The operation to be performed on the provided Salesforce source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-connectoroperator.html#cfn-customerprofiles-integration-connectoroperator-salesforce)
       */
      override fun salesforce(): String? = unwrap(this).getSalesforce()

      /**
       * The operation to be performed on the provided ServiceNow source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-connectoroperator.html#cfn-customerprofiles-integration-connectoroperator-servicenow)
       */
      override fun serviceNow(): String? = unwrap(this).getServiceNow()

      /**
       * The operation to be performed on the provided Zendesk source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-connectoroperator.html#cfn-customerprofiles-integration-connectoroperator-zendesk)
       */
      override fun zendesk(): String? = unwrap(this).getZendesk()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectorOperatorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty):
          ConnectorOperatorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectorOperatorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorOperatorProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty
    }
  }

  /**
   * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * TriggerConfigProperty triggerConfigProperty = TriggerConfigProperty.builder()
   * .triggerType("triggerType")
   * // the properties below are optional
   * .triggerProperties(TriggerPropertiesProperty.builder()
   * .scheduled(ScheduledTriggerPropertiesProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * // the properties below are optional
   * .dataPullMode("dataPullMode")
   * .firstExecutionFrom(123)
   * .scheduleEndTime(123)
   * .scheduleOffset(123)
   * .scheduleStartTime(123)
   * .timezone("timezone")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-triggerconfig.html)
   */
  public interface TriggerConfigProperty {
    /**
     * Specifies the configuration details of a schedule-triggered flow that you define.
     *
     * Currently, these settings only apply to the Scheduled trigger type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-triggerconfig.html#cfn-customerprofiles-integration-triggerconfig-triggerproperties)
     */
    public fun triggerProperties(): Any? = unwrap(this).getTriggerProperties()

    /**
     * Specifies the type of flow trigger.
     *
     * It can be OnDemand, Scheduled, or Event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-triggerconfig.html#cfn-customerprofiles-integration-triggerconfig-triggertype)
     */
    public fun triggerType(): String

    /**
     * A builder for [TriggerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
       * that you define.
       * Currently, these settings only apply to the Scheduled trigger type.
       */
      public fun triggerProperties(triggerProperties: IResolvable)

      /**
       * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
       * that you define.
       * Currently, these settings only apply to the Scheduled trigger type.
       */
      public fun triggerProperties(triggerProperties: TriggerPropertiesProperty)

      /**
       * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
       * that you define.
       * Currently, these settings only apply to the Scheduled trigger type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70f093d02bd5940e22cc195bebbe1fe645d686c826f8405fd3155cca76eb605b")
      public fun triggerProperties(triggerProperties: TriggerPropertiesProperty.Builder.() -> Unit)

      /**
       * @param triggerType Specifies the type of flow trigger. 
       * It can be OnDemand, Scheduled, or Event.
       */
      public fun triggerType(triggerType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty.builder()

      /**
       * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
       * that you define.
       * Currently, these settings only apply to the Scheduled trigger type.
       */
      override fun triggerProperties(triggerProperties: IResolvable) {
        cdkBuilder.triggerProperties(triggerProperties.let(IResolvable::unwrap))
      }

      /**
       * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
       * that you define.
       * Currently, these settings only apply to the Scheduled trigger type.
       */
      override fun triggerProperties(triggerProperties: TriggerPropertiesProperty) {
        cdkBuilder.triggerProperties(triggerProperties.let(TriggerPropertiesProperty::unwrap))
      }

      /**
       * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
       * that you define.
       * Currently, these settings only apply to the Scheduled trigger type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70f093d02bd5940e22cc195bebbe1fe645d686c826f8405fd3155cca76eb605b")
      override
          fun triggerProperties(triggerProperties: TriggerPropertiesProperty.Builder.() -> Unit):
          Unit = triggerProperties(TriggerPropertiesProperty(triggerProperties))

      /**
       * @param triggerType Specifies the type of flow trigger. 
       * It can be OnDemand, Scheduled, or Event.
       */
      override fun triggerType(triggerType: String) {
        cdkBuilder.triggerType(triggerType)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty,
    ) : CdkObject(cdkObject), TriggerConfigProperty {
      /**
       * Specifies the configuration details of a schedule-triggered flow that you define.
       *
       * Currently, these settings only apply to the Scheduled trigger type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-triggerconfig.html#cfn-customerprofiles-integration-triggerconfig-triggerproperties)
       */
      override fun triggerProperties(): Any? = unwrap(this).getTriggerProperties()

      /**
       * Specifies the type of flow trigger.
       *
       * It can be OnDemand, Scheduled, or Event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-triggerconfig.html#cfn-customerprofiles-integration-triggerconfig-triggertype)
       */
      override fun triggerType(): String = unwrap(this).getTriggerType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TriggerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty):
          TriggerConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? TriggerConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TriggerConfigProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty
    }
  }

  /**
   * The configurations that control how Customer Profiles retrieves data from the source, Amazon
   * AppFlow.
   *
   * Customer Profiles uses this information to create an AppFlow flow on behalf of customers.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * FlowDefinitionProperty flowDefinitionProperty = FlowDefinitionProperty.builder()
   * .flowName("flowName")
   * .kmsArn("kmsArn")
   * .sourceFlowConfig(SourceFlowConfigProperty.builder()
   * .connectorType("connectorType")
   * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
   * .marketo(MarketoSourcePropertiesProperty.builder()
   * .object("object")
   * .build())
   * .s3(S3SourcePropertiesProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .build())
   * .salesforce(SalesforceSourcePropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .enableDynamicFieldUpdate(false)
   * .includeDeletedRecords(false)
   * .build())
   * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
   * .object("object")
   * .build())
   * .zendesk(ZendeskSourcePropertiesProperty.builder()
   * .object("object")
   * .build())
   * .build())
   * // the properties below are optional
   * .connectorProfileName("connectorProfileName")
   * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
   * .datetimeTypeFieldName("datetimeTypeFieldName")
   * .build())
   * .build())
   * .tasks(List.of(TaskProperty.builder()
   * .sourceFields(List.of("sourceFields"))
   * .taskType("taskType")
   * // the properties below are optional
   * .connectorOperator(ConnectorOperatorProperty.builder()
   * .marketo("marketo")
   * .s3("s3")
   * .salesforce("salesforce")
   * .serviceNow("serviceNow")
   * .zendesk("zendesk")
   * .build())
   * .destinationField("destinationField")
   * .taskProperties(List.of(TaskPropertiesMapProperty.builder()
   * .operatorPropertyKey("operatorPropertyKey")
   * .property("property")
   * .build()))
   * .build()))
   * .triggerConfig(TriggerConfigProperty.builder()
   * .triggerType("triggerType")
   * // the properties below are optional
   * .triggerProperties(TriggerPropertiesProperty.builder()
   * .scheduled(ScheduledTriggerPropertiesProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * // the properties below are optional
   * .dataPullMode("dataPullMode")
   * .firstExecutionFrom(123)
   * .scheduleEndTime(123)
   * .scheduleOffset(123)
   * .scheduleStartTime(123)
   * .timezone("timezone")
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html)
   */
  public interface FlowDefinitionProperty {
    /**
     * A description of the flow you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html#cfn-customerprofiles-integration-flowdefinition-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The specified name of the flow.
     *
     * Use underscores (_) or hyphens (-) only. Spaces are not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html#cfn-customerprofiles-integration-flowdefinition-flowname)
     */
    public fun flowName(): String

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key you provide for
     * encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html#cfn-customerprofiles-integration-flowdefinition-kmsarn)
     */
    public fun kmsArn(): String

    /**
     * The configuration that controls how Customer Profiles retrieves data from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html#cfn-customerprofiles-integration-flowdefinition-sourceflowconfig)
     */
    public fun sourceFlowConfig(): Any

    /**
     * A list of tasks that Customer Profiles performs while transferring the data in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html#cfn-customerprofiles-integration-flowdefinition-tasks)
     */
    public fun tasks(): Any

    /**
     * The trigger settings that determine how and when the flow runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html#cfn-customerprofiles-integration-flowdefinition-triggerconfig)
     */
    public fun triggerConfig(): Any

    /**
     * A builder for [FlowDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A description of the flow you want to create.
       */
      public fun description(description: String)

      /**
       * @param flowName The specified name of the flow. 
       * Use underscores (_) or hyphens (-) only. Spaces are not allowed.
       */
      public fun flowName(flowName: String)

      /**
       * @param kmsArn The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key
       * you provide for encryption. 
       */
      public fun kmsArn(kmsArn: String)

      /**
       * @param sourceFlowConfig The configuration that controls how Customer Profiles retrieves
       * data from the source. 
       */
      public fun sourceFlowConfig(sourceFlowConfig: IResolvable)

      /**
       * @param sourceFlowConfig The configuration that controls how Customer Profiles retrieves
       * data from the source. 
       */
      public fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty)

      /**
       * @param sourceFlowConfig The configuration that controls how Customer Profiles retrieves
       * data from the source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee3bdfbece1c201014020183266f12b2ac387e18895d4f3eecd438dc7378d909")
      public fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty.Builder.() -> Unit)

      /**
       * @param tasks A list of tasks that Customer Profiles performs while transferring the data in
       * the flow run. 
       */
      public fun tasks(tasks: IResolvable)

      /**
       * @param tasks A list of tasks that Customer Profiles performs while transferring the data in
       * the flow run. 
       */
      public fun tasks(tasks: List<Any>)

      /**
       * @param tasks A list of tasks that Customer Profiles performs while transferring the data in
       * the flow run. 
       */
      public fun tasks(vararg tasks: Any)

      /**
       * @param triggerConfig The trigger settings that determine how and when the flow runs. 
       */
      public fun triggerConfig(triggerConfig: IResolvable)

      /**
       * @param triggerConfig The trigger settings that determine how and when the flow runs. 
       */
      public fun triggerConfig(triggerConfig: TriggerConfigProperty)

      /**
       * @param triggerConfig The trigger settings that determine how and when the flow runs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f898f14bbd34b0d3ba64659ba12cddf6cf5c82aa1df7a7efb4e83003421c8bbc")
      public fun triggerConfig(triggerConfig: TriggerConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty.builder()

      /**
       * @param description A description of the flow you want to create.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param flowName The specified name of the flow. 
       * Use underscores (_) or hyphens (-) only. Spaces are not allowed.
       */
      override fun flowName(flowName: String) {
        cdkBuilder.flowName(flowName)
      }

      /**
       * @param kmsArn The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key
       * you provide for encryption. 
       */
      override fun kmsArn(kmsArn: String) {
        cdkBuilder.kmsArn(kmsArn)
      }

      /**
       * @param sourceFlowConfig The configuration that controls how Customer Profiles retrieves
       * data from the source. 
       */
      override fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
        cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(IResolvable::unwrap))
      }

      /**
       * @param sourceFlowConfig The configuration that controls how Customer Profiles retrieves
       * data from the source. 
       */
      override fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty) {
        cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(SourceFlowConfigProperty::unwrap))
      }

      /**
       * @param sourceFlowConfig The configuration that controls how Customer Profiles retrieves
       * data from the source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee3bdfbece1c201014020183266f12b2ac387e18895d4f3eecd438dc7378d909")
      override fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty.Builder.() -> Unit):
          Unit = sourceFlowConfig(SourceFlowConfigProperty(sourceFlowConfig))

      /**
       * @param tasks A list of tasks that Customer Profiles performs while transferring the data in
       * the flow run. 
       */
      override fun tasks(tasks: IResolvable) {
        cdkBuilder.tasks(tasks.let(IResolvable::unwrap))
      }

      /**
       * @param tasks A list of tasks that Customer Profiles performs while transferring the data in
       * the flow run. 
       */
      override fun tasks(tasks: List<Any>) {
        cdkBuilder.tasks(tasks)
      }

      /**
       * @param tasks A list of tasks that Customer Profiles performs while transferring the data in
       * the flow run. 
       */
      override fun tasks(vararg tasks: Any): Unit = tasks(tasks.toList())

      /**
       * @param triggerConfig The trigger settings that determine how and when the flow runs. 
       */
      override fun triggerConfig(triggerConfig: IResolvable) {
        cdkBuilder.triggerConfig(triggerConfig.let(IResolvable::unwrap))
      }

      /**
       * @param triggerConfig The trigger settings that determine how and when the flow runs. 
       */
      override fun triggerConfig(triggerConfig: TriggerConfigProperty) {
        cdkBuilder.triggerConfig(triggerConfig.let(TriggerConfigProperty::unwrap))
      }

      /**
       * @param triggerConfig The trigger settings that determine how and when the flow runs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f898f14bbd34b0d3ba64659ba12cddf6cf5c82aa1df7a7efb4e83003421c8bbc")
      override fun triggerConfig(triggerConfig: TriggerConfigProperty.Builder.() -> Unit): Unit =
          triggerConfig(TriggerConfigProperty(triggerConfig))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty,
    ) : CdkObject(cdkObject), FlowDefinitionProperty {
      /**
       * A description of the flow you want to create.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html#cfn-customerprofiles-integration-flowdefinition-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The specified name of the flow.
       *
       * Use underscores (_) or hyphens (-) only. Spaces are not allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html#cfn-customerprofiles-integration-flowdefinition-flowname)
       */
      override fun flowName(): String = unwrap(this).getFlowName()

      /**
       * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key you provide for
       * encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html#cfn-customerprofiles-integration-flowdefinition-kmsarn)
       */
      override fun kmsArn(): String = unwrap(this).getKmsArn()

      /**
       * The configuration that controls how Customer Profiles retrieves data from the source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html#cfn-customerprofiles-integration-flowdefinition-sourceflowconfig)
       */
      override fun sourceFlowConfig(): Any = unwrap(this).getSourceFlowConfig()

      /**
       * A list of tasks that Customer Profiles performs while transferring the data in the flow
       * run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html#cfn-customerprofiles-integration-flowdefinition-tasks)
       */
      override fun tasks(): Any = unwrap(this).getTasks()

      /**
       * The trigger settings that determine how and when the flow runs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html#cfn-customerprofiles-integration-flowdefinition-triggerconfig)
       */
      override fun triggerConfig(): Any = unwrap(this).getTriggerConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty):
          FlowDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowDefinitionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowDefinitionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty
    }
  }

  /**
   * Specifies the configuration used when importing incremental records from the source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * IncrementalPullConfigProperty incrementalPullConfigProperty =
   * IncrementalPullConfigProperty.builder()
   * .datetimeTypeFieldName("datetimeTypeFieldName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-incrementalpullconfig.html)
   */
  public interface IncrementalPullConfigProperty {
    /**
     * A field that specifies the date time or timestamp field as the criteria to use when importing
     * incremental records from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-incrementalpullconfig.html#cfn-customerprofiles-integration-incrementalpullconfig-datetimetypefieldname)
     */
    public fun datetimeTypeFieldName(): String? = unwrap(this).getDatetimeTypeFieldName()

    /**
     * A builder for [IncrementalPullConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param datetimeTypeFieldName A field that specifies the date time or timestamp field as the
       * criteria to use when importing incremental records from the source.
       */
      public fun datetimeTypeFieldName(datetimeTypeFieldName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty.builder()

      /**
       * @param datetimeTypeFieldName A field that specifies the date time or timestamp field as the
       * criteria to use when importing incremental records from the source.
       */
      override fun datetimeTypeFieldName(datetimeTypeFieldName: String) {
        cdkBuilder.datetimeTypeFieldName(datetimeTypeFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty,
    ) : CdkObject(cdkObject), IncrementalPullConfigProperty {
      /**
       * A field that specifies the date time or timestamp field as the criteria to use when
       * importing incremental records from the source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-incrementalpullconfig.html#cfn-customerprofiles-integration-incrementalpullconfig-datetimetypefieldname)
       */
      override fun datetimeTypeFieldName(): String? = unwrap(this).getDatetimeTypeFieldName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IncrementalPullConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty):
          IncrementalPullConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IncrementalPullConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IncrementalPullConfigProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty
    }
  }

  /**
   * The properties that are applied when Amazon S3 is being used as the flow source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * S3SourcePropertiesProperty s3SourcePropertiesProperty = S3SourcePropertiesProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-s3sourceproperties.html)
   */
  public interface S3SourcePropertiesProperty {
    /**
     * The Amazon S3 bucket name where the source files are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-s3sourceproperties.html#cfn-customerprofiles-integration-s3sourceproperties-bucketname)
     */
    public fun bucketName(): String

    /**
     * The object key for the Amazon S3 bucket in which the source files are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-s3sourceproperties.html#cfn-customerprofiles-integration-s3sourceproperties-bucketprefix)
     */
    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * A builder for [S3SourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The Amazon S3 bucket name where the source files are stored. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param bucketPrefix The object key for the Amazon S3 bucket in which the source files are
       * stored.
       */
      public fun bucketPrefix(bucketPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty.builder()

      /**
       * @param bucketName The Amazon S3 bucket name where the source files are stored. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param bucketPrefix The object key for the Amazon S3 bucket in which the source files are
       * stored.
       */
      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty,
    ) : CdkObject(cdkObject), S3SourcePropertiesProperty {
      /**
       * The Amazon S3 bucket name where the source files are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-s3sourceproperties.html#cfn-customerprofiles-integration-s3sourceproperties-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * The object key for the Amazon S3 bucket in which the source files are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-s3sourceproperties.html#cfn-customerprofiles-integration-s3sourceproperties-bucketprefix)
       */
      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3SourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty):
          S3SourcePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3SourcePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3SourcePropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty
    }
  }

  /**
   * A map in which each key is an event type from an external application such as Segment or
   * Shopify, and each value is an `ObjectTypeName` (template) used to ingest the event.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ObjectTypeMappingProperty objectTypeMappingProperty = ObjectTypeMappingProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-objecttypemapping.html)
   */
  public interface ObjectTypeMappingProperty {
    /**
     * The key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-objecttypemapping.html#cfn-customerprofiles-integration-objecttypemapping-key)
     */
    public fun key(): String

    /**
     * The value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-objecttypemapping.html#cfn-customerprofiles-integration-objecttypemapping-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ObjectTypeMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key. 
       */
      public fun key(key: String)

      /**
       * @param value The value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ObjectTypeMappingProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ObjectTypeMappingProperty.builder()

      /**
       * @param key The key. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ObjectTypeMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ObjectTypeMappingProperty,
    ) : CdkObject(cdkObject), ObjectTypeMappingProperty {
      /**
       * The key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-objecttypemapping.html#cfn-customerprofiles-integration-objecttypemapping-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-objecttypemapping.html#cfn-customerprofiles-integration-objecttypemapping-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ObjectTypeMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.ObjectTypeMappingProperty):
          ObjectTypeMappingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ObjectTypeMappingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectTypeMappingProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ObjectTypeMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ObjectTypeMappingProperty
    }
  }

  /**
   * Specifies the configuration details of a scheduled-trigger flow that you define.
   *
   * Currently, these settings only apply to the scheduled-trigger type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ScheduledTriggerPropertiesProperty scheduledTriggerPropertiesProperty =
   * ScheduledTriggerPropertiesProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * // the properties below are optional
   * .dataPullMode("dataPullMode")
   * .firstExecutionFrom(123)
   * .scheduleEndTime(123)
   * .scheduleOffset(123)
   * .scheduleStartTime(123)
   * .timezone("timezone")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html)
   */
  public interface ScheduledTriggerPropertiesProperty {
    /**
     * Specifies whether a scheduled flow has an incremental data transfer or a complete data
     * transfer for each flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-datapullmode)
     */
    public fun dataPullMode(): String? = unwrap(this).getDataPullMode()

    /**
     * Specifies the date range for the records to import from the connector in the first flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-firstexecutionfrom)
     */
    public fun firstExecutionFrom(): Number? = unwrap(this).getFirstExecutionFrom()

    /**
     * Specifies the scheduled end time for a scheduled-trigger flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-scheduleendtime)
     */
    public fun scheduleEndTime(): Number? = unwrap(this).getScheduleEndTime()

    /**
     * The scheduling expression that determines the rate at which the schedule will run, for
     * example rate (5 minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-scheduleexpression)
     */
    public fun scheduleExpression(): String

    /**
     * Specifies the optional offset that is added to the time interval for a schedule-triggered
     * flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-scheduleoffset)
     */
    public fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

    /**
     * Specifies the scheduled start time for a scheduled-trigger flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-schedulestarttime)
     */
    public fun scheduleStartTime(): Number? = unwrap(this).getScheduleStartTime()

    /**
     * Specifies the time zone used when referring to the date and time of a scheduled-triggered
     * flow, such as America/New_York.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-timezone)
     */
    public fun timezone(): String? = unwrap(this).getTimezone()

    /**
     * A builder for [ScheduledTriggerPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataPullMode Specifies whether a scheduled flow has an incremental data transfer or
       * a complete data transfer for each flow run.
       */
      public fun dataPullMode(dataPullMode: String)

      /**
       * @param firstExecutionFrom Specifies the date range for the records to import from the
       * connector in the first flow run.
       */
      public fun firstExecutionFrom(firstExecutionFrom: Number)

      /**
       * @param scheduleEndTime Specifies the scheduled end time for a scheduled-trigger flow.
       */
      public fun scheduleEndTime(scheduleEndTime: Number)

      /**
       * @param scheduleExpression The scheduling expression that determines the rate at which the
       * schedule will run, for example rate (5 minutes). 
       */
      public fun scheduleExpression(scheduleExpression: String)

      /**
       * @param scheduleOffset Specifies the optional offset that is added to the time interval for
       * a schedule-triggered flow.
       */
      public fun scheduleOffset(scheduleOffset: Number)

      /**
       * @param scheduleStartTime Specifies the scheduled start time for a scheduled-trigger flow.
       */
      public fun scheduleStartTime(scheduleStartTime: Number)

      /**
       * @param timezone Specifies the time zone used when referring to the date and time of a
       * scheduled-triggered flow, such as America/New_York.
       */
      public fun timezone(timezone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty.builder()

      /**
       * @param dataPullMode Specifies whether a scheduled flow has an incremental data transfer or
       * a complete data transfer for each flow run.
       */
      override fun dataPullMode(dataPullMode: String) {
        cdkBuilder.dataPullMode(dataPullMode)
      }

      /**
       * @param firstExecutionFrom Specifies the date range for the records to import from the
       * connector in the first flow run.
       */
      override fun firstExecutionFrom(firstExecutionFrom: Number) {
        cdkBuilder.firstExecutionFrom(firstExecutionFrom)
      }

      /**
       * @param scheduleEndTime Specifies the scheduled end time for a scheduled-trigger flow.
       */
      override fun scheduleEndTime(scheduleEndTime: Number) {
        cdkBuilder.scheduleEndTime(scheduleEndTime)
      }

      /**
       * @param scheduleExpression The scheduling expression that determines the rate at which the
       * schedule will run, for example rate (5 minutes). 
       */
      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      /**
       * @param scheduleOffset Specifies the optional offset that is added to the time interval for
       * a schedule-triggered flow.
       */
      override fun scheduleOffset(scheduleOffset: Number) {
        cdkBuilder.scheduleOffset(scheduleOffset)
      }

      /**
       * @param scheduleStartTime Specifies the scheduled start time for a scheduled-trigger flow.
       */
      override fun scheduleStartTime(scheduleStartTime: Number) {
        cdkBuilder.scheduleStartTime(scheduleStartTime)
      }

      /**
       * @param timezone Specifies the time zone used when referring to the date and time of a
       * scheduled-triggered flow, such as America/New_York.
       */
      override fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty,
    ) : CdkObject(cdkObject), ScheduledTriggerPropertiesProperty {
      /**
       * Specifies whether a scheduled flow has an incremental data transfer or a complete data
       * transfer for each flow run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-datapullmode)
       */
      override fun dataPullMode(): String? = unwrap(this).getDataPullMode()

      /**
       * Specifies the date range for the records to import from the connector in the first flow
       * run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-firstexecutionfrom)
       */
      override fun firstExecutionFrom(): Number? = unwrap(this).getFirstExecutionFrom()

      /**
       * Specifies the scheduled end time for a scheduled-trigger flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-scheduleendtime)
       */
      override fun scheduleEndTime(): Number? = unwrap(this).getScheduleEndTime()

      /**
       * The scheduling expression that determines the rate at which the schedule will run, for
       * example rate (5 minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-scheduleexpression)
       */
      override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()

      /**
       * Specifies the optional offset that is added to the time interval for a schedule-triggered
       * flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-scheduleoffset)
       */
      override fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

      /**
       * Specifies the scheduled start time for a scheduled-trigger flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-schedulestarttime)
       */
      override fun scheduleStartTime(): Number? = unwrap(this).getScheduleStartTime()

      /**
       * Specifies the time zone used when referring to the date and time of a scheduled-triggered
       * flow, such as America/New_York.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html#cfn-customerprofiles-integration-scheduledtriggerproperties-timezone)
       */
      override fun timezone(): String? = unwrap(this).getTimezone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ScheduledTriggerPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty):
          ScheduledTriggerPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ScheduledTriggerPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduledTriggerPropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty
    }
  }

  /**
   * The properties that are applied when using Zendesk as a flow source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ZendeskSourcePropertiesProperty zendeskSourcePropertiesProperty =
   * ZendeskSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-zendesksourceproperties.html)
   */
  public interface ZendeskSourcePropertiesProperty {
    /**
     * The object specified in the Zendesk flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-zendesksourceproperties.html#cfn-customerprofiles-integration-zendesksourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [ZendeskSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the Zendesk flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the Zendesk flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty,
    ) : CdkObject(cdkObject), ZendeskSourcePropertiesProperty {
      /**
       * The object specified in the Zendesk flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-zendesksourceproperties.html#cfn-customerprofiles-integration-zendesksourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ZendeskSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty):
          ZendeskSourcePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ZendeskSourcePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZendeskSourcePropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty
    }
  }

  /**
   * The properties that are applied when Salesforce is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * SalesforceSourcePropertiesProperty salesforceSourcePropertiesProperty =
   * SalesforceSourcePropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .enableDynamicFieldUpdate(false)
   * .includeDeletedRecords(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-salesforcesourceproperties.html)
   */
  public interface SalesforceSourcePropertiesProperty {
    /**
     * The flag that enables dynamic fetching of new (recently added) fields in the Salesforce
     * objects while running a flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-salesforcesourceproperties.html#cfn-customerprofiles-integration-salesforcesourceproperties-enabledynamicfieldupdate)
     */
    public fun enableDynamicFieldUpdate(): Any? = unwrap(this).getEnableDynamicFieldUpdate()

    /**
     * Indicates whether Amazon AppFlow includes deleted files in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-salesforcesourceproperties.html#cfn-customerprofiles-integration-salesforcesourceproperties-includedeletedrecords)
     */
    public fun includeDeletedRecords(): Any? = unwrap(this).getIncludeDeletedRecords()

    /**
     * The object specified in the Salesforce flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-salesforcesourceproperties.html#cfn-customerprofiles-integration-salesforcesourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [SalesforceSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableDynamicFieldUpdate The flag that enables dynamic fetching of new (recently
       * added) fields in the Salesforce objects while running a flow.
       */
      public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: Boolean)

      /**
       * @param enableDynamicFieldUpdate The flag that enables dynamic fetching of new (recently
       * added) fields in the Salesforce objects while running a flow.
       */
      public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: IResolvable)

      /**
       * @param includeDeletedRecords Indicates whether Amazon AppFlow includes deleted files in the
       * flow run.
       */
      public fun includeDeletedRecords(includeDeletedRecords: Boolean)

      /**
       * @param includeDeletedRecords Indicates whether Amazon AppFlow includes deleted files in the
       * flow run.
       */
      public fun includeDeletedRecords(includeDeletedRecords: IResolvable)

      /**
       * @param object The object specified in the Salesforce flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty.builder()

      /**
       * @param enableDynamicFieldUpdate The flag that enables dynamic fetching of new (recently
       * added) fields in the Salesforce objects while running a flow.
       */
      override fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: Boolean) {
        cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate)
      }

      /**
       * @param enableDynamicFieldUpdate The flag that enables dynamic fetching of new (recently
       * added) fields in the Salesforce objects while running a flow.
       */
      override fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: IResolvable) {
        cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate.let(IResolvable::unwrap))
      }

      /**
       * @param includeDeletedRecords Indicates whether Amazon AppFlow includes deleted files in the
       * flow run.
       */
      override fun includeDeletedRecords(includeDeletedRecords: Boolean) {
        cdkBuilder.includeDeletedRecords(includeDeletedRecords)
      }

      /**
       * @param includeDeletedRecords Indicates whether Amazon AppFlow includes deleted files in the
       * flow run.
       */
      override fun includeDeletedRecords(includeDeletedRecords: IResolvable) {
        cdkBuilder.includeDeletedRecords(includeDeletedRecords.let(IResolvable::unwrap))
      }

      /**
       * @param object The object specified in the Salesforce flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty,
    ) : CdkObject(cdkObject), SalesforceSourcePropertiesProperty {
      /**
       * The flag that enables dynamic fetching of new (recently added) fields in the Salesforce
       * objects while running a flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-salesforcesourceproperties.html#cfn-customerprofiles-integration-salesforcesourceproperties-enabledynamicfieldupdate)
       */
      override fun enableDynamicFieldUpdate(): Any? = unwrap(this).getEnableDynamicFieldUpdate()

      /**
       * Indicates whether Amazon AppFlow includes deleted files in the flow run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-salesforcesourceproperties.html#cfn-customerprofiles-integration-salesforcesourceproperties-includedeletedrecords)
       */
      override fun includeDeletedRecords(): Any? = unwrap(this).getIncludeDeletedRecords()

      /**
       * The object specified in the Salesforce flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-salesforcesourceproperties.html#cfn-customerprofiles-integration-salesforcesourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty):
          SalesforceSourcePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SalesforceSourcePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceSourcePropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty
    }
  }

  /**
   * The `Task` property type specifies the class for modeling different type of tasks.
   *
   * Task implementation varies based on the TaskType.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * TaskProperty taskProperty = TaskProperty.builder()
   * .sourceFields(List.of("sourceFields"))
   * .taskType("taskType")
   * // the properties below are optional
   * .connectorOperator(ConnectorOperatorProperty.builder()
   * .marketo("marketo")
   * .s3("s3")
   * .salesforce("salesforce")
   * .serviceNow("serviceNow")
   * .zendesk("zendesk")
   * .build())
   * .destinationField("destinationField")
   * .taskProperties(List.of(TaskPropertiesMapProperty.builder()
   * .operatorPropertyKey("operatorPropertyKey")
   * .property("property")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-task.html)
   */
  public interface TaskProperty {
    /**
     * The operation to be performed on the provided source fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-task.html#cfn-customerprofiles-integration-task-connectoroperator)
     */
    public fun connectorOperator(): Any? = unwrap(this).getConnectorOperator()

    /**
     * A field in a destination connector, or a field value against which Amazon AppFlow validates a
     * source field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-task.html#cfn-customerprofiles-integration-task-destinationfield)
     */
    public fun destinationField(): String? = unwrap(this).getDestinationField()

    /**
     * The source fields to which a particular task is applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-task.html#cfn-customerprofiles-integration-task-sourcefields)
     */
    public fun sourceFields(): List<String>

    /**
     * A map used to store task-related information.
     *
     * The service looks for particular information based on the TaskType.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-task.html#cfn-customerprofiles-integration-task-taskproperties)
     */
    public fun taskProperties(): Any? = unwrap(this).getTaskProperties()

    /**
     * Specifies the particular task implementation that Amazon AppFlow performs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-task.html#cfn-customerprofiles-integration-task-tasktype)
     */
    public fun taskType(): String

    /**
     * A builder for [TaskProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectorOperator The operation to be performed on the provided source fields.
       */
      public fun connectorOperator(connectorOperator: IResolvable)

      /**
       * @param connectorOperator The operation to be performed on the provided source fields.
       */
      public fun connectorOperator(connectorOperator: ConnectorOperatorProperty)

      /**
       * @param connectorOperator The operation to be performed on the provided source fields.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55599f197600a497862a593877646b0451deb8dc2f9983c96e237ae06ce2d179")
      public fun connectorOperator(connectorOperator: ConnectorOperatorProperty.Builder.() -> Unit)

      /**
       * @param destinationField A field in a destination connector, or a field value against which
       * Amazon AppFlow validates a source field.
       */
      public fun destinationField(destinationField: String)

      /**
       * @param sourceFields The source fields to which a particular task is applied. 
       */
      public fun sourceFields(sourceFields: List<String>)

      /**
       * @param sourceFields The source fields to which a particular task is applied. 
       */
      public fun sourceFields(vararg sourceFields: String)

      /**
       * @param taskProperties A map used to store task-related information.
       * The service looks for particular information based on the TaskType.
       */
      public fun taskProperties(taskProperties: IResolvable)

      /**
       * @param taskProperties A map used to store task-related information.
       * The service looks for particular information based on the TaskType.
       */
      public fun taskProperties(taskProperties: List<Any>)

      /**
       * @param taskProperties A map used to store task-related information.
       * The service looks for particular information based on the TaskType.
       */
      public fun taskProperties(vararg taskProperties: Any)

      /**
       * @param taskType Specifies the particular task implementation that Amazon AppFlow performs. 
       */
      public fun taskType(taskType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty.builder()

      /**
       * @param connectorOperator The operation to be performed on the provided source fields.
       */
      override fun connectorOperator(connectorOperator: IResolvable) {
        cdkBuilder.connectorOperator(connectorOperator.let(IResolvable::unwrap))
      }

      /**
       * @param connectorOperator The operation to be performed on the provided source fields.
       */
      override fun connectorOperator(connectorOperator: ConnectorOperatorProperty) {
        cdkBuilder.connectorOperator(connectorOperator.let(ConnectorOperatorProperty::unwrap))
      }

      /**
       * @param connectorOperator The operation to be performed on the provided source fields.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55599f197600a497862a593877646b0451deb8dc2f9983c96e237ae06ce2d179")
      override
          fun connectorOperator(connectorOperator: ConnectorOperatorProperty.Builder.() -> Unit):
          Unit = connectorOperator(ConnectorOperatorProperty(connectorOperator))

      /**
       * @param destinationField A field in a destination connector, or a field value against which
       * Amazon AppFlow validates a source field.
       */
      override fun destinationField(destinationField: String) {
        cdkBuilder.destinationField(destinationField)
      }

      /**
       * @param sourceFields The source fields to which a particular task is applied. 
       */
      override fun sourceFields(sourceFields: List<String>) {
        cdkBuilder.sourceFields(sourceFields)
      }

      /**
       * @param sourceFields The source fields to which a particular task is applied. 
       */
      override fun sourceFields(vararg sourceFields: String): Unit =
          sourceFields(sourceFields.toList())

      /**
       * @param taskProperties A map used to store task-related information.
       * The service looks for particular information based on the TaskType.
       */
      override fun taskProperties(taskProperties: IResolvable) {
        cdkBuilder.taskProperties(taskProperties.let(IResolvable::unwrap))
      }

      /**
       * @param taskProperties A map used to store task-related information.
       * The service looks for particular information based on the TaskType.
       */
      override fun taskProperties(taskProperties: List<Any>) {
        cdkBuilder.taskProperties(taskProperties)
      }

      /**
       * @param taskProperties A map used to store task-related information.
       * The service looks for particular information based on the TaskType.
       */
      override fun taskProperties(vararg taskProperties: Any): Unit =
          taskProperties(taskProperties.toList())

      /**
       * @param taskType Specifies the particular task implementation that Amazon AppFlow performs. 
       */
      override fun taskType(taskType: String) {
        cdkBuilder.taskType(taskType)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty,
    ) : CdkObject(cdkObject), TaskProperty {
      /**
       * The operation to be performed on the provided source fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-task.html#cfn-customerprofiles-integration-task-connectoroperator)
       */
      override fun connectorOperator(): Any? = unwrap(this).getConnectorOperator()

      /**
       * A field in a destination connector, or a field value against which Amazon AppFlow validates
       * a source field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-task.html#cfn-customerprofiles-integration-task-destinationfield)
       */
      override fun destinationField(): String? = unwrap(this).getDestinationField()

      /**
       * The source fields to which a particular task is applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-task.html#cfn-customerprofiles-integration-task-sourcefields)
       */
      override fun sourceFields(): List<String> = unwrap(this).getSourceFields()

      /**
       * A map used to store task-related information.
       *
       * The service looks for particular information based on the TaskType.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-task.html#cfn-customerprofiles-integration-task-taskproperties)
       */
      override fun taskProperties(): Any? = unwrap(this).getTaskProperties()

      /**
       * Specifies the particular task implementation that Amazon AppFlow performs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-task.html#cfn-customerprofiles-integration-task-tasktype)
       */
      override fun taskType(): String = unwrap(this).getTaskType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TaskProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty):
          TaskProperty = CdkObjectWrappers.wrap(cdkObject) as? TaskProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty
    }
  }

  /**
   * Specifies the configuration details that control the trigger for a flow.
   *
   * Currently, these settings only apply to the Scheduled trigger type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * TriggerPropertiesProperty triggerPropertiesProperty = TriggerPropertiesProperty.builder()
   * .scheduled(ScheduledTriggerPropertiesProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * // the properties below are optional
   * .dataPullMode("dataPullMode")
   * .firstExecutionFrom(123)
   * .scheduleEndTime(123)
   * .scheduleOffset(123)
   * .scheduleStartTime(123)
   * .timezone("timezone")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-triggerproperties.html)
   */
  public interface TriggerPropertiesProperty {
    /**
     * Specifies the configuration details of a schedule-triggered flow that you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-triggerproperties.html#cfn-customerprofiles-integration-triggerproperties-scheduled)
     */
    public fun scheduled(): Any? = unwrap(this).getScheduled()

    /**
     * A builder for [TriggerPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param scheduled Specifies the configuration details of a schedule-triggered flow that you
       * define.
       */
      public fun scheduled(scheduled: IResolvable)

      /**
       * @param scheduled Specifies the configuration details of a schedule-triggered flow that you
       * define.
       */
      public fun scheduled(scheduled: ScheduledTriggerPropertiesProperty)

      /**
       * @param scheduled Specifies the configuration details of a schedule-triggered flow that you
       * define.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f1e68d8358801e6d018d1420d012d7b5bc6d75899a8d943ed004542a60365ce")
      public fun scheduled(scheduled: ScheduledTriggerPropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty.builder()

      /**
       * @param scheduled Specifies the configuration details of a schedule-triggered flow that you
       * define.
       */
      override fun scheduled(scheduled: IResolvable) {
        cdkBuilder.scheduled(scheduled.let(IResolvable::unwrap))
      }

      /**
       * @param scheduled Specifies the configuration details of a schedule-triggered flow that you
       * define.
       */
      override fun scheduled(scheduled: ScheduledTriggerPropertiesProperty) {
        cdkBuilder.scheduled(scheduled.let(ScheduledTriggerPropertiesProperty::unwrap))
      }

      /**
       * @param scheduled Specifies the configuration details of a schedule-triggered flow that you
       * define.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f1e68d8358801e6d018d1420d012d7b5bc6d75899a8d943ed004542a60365ce")
      override fun scheduled(scheduled: ScheduledTriggerPropertiesProperty.Builder.() -> Unit): Unit
          = scheduled(ScheduledTriggerPropertiesProperty(scheduled))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty,
    ) : CdkObject(cdkObject), TriggerPropertiesProperty {
      /**
       * Specifies the configuration details of a schedule-triggered flow that you define.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-triggerproperties.html#cfn-customerprofiles-integration-triggerproperties-scheduled)
       */
      override fun scheduled(): Any? = unwrap(this).getScheduled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TriggerPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty):
          TriggerPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TriggerPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TriggerPropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty
    }
  }

  /**
   * The properties that are applied when ServiceNow is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ServiceNowSourcePropertiesProperty serviceNowSourcePropertiesProperty =
   * ServiceNowSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-servicenowsourceproperties.html)
   */
  public interface ServiceNowSourcePropertiesProperty {
    /**
     * The object specified in the ServiceNow flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-servicenowsourceproperties.html#cfn-customerprofiles-integration-servicenowsourceproperties-object)
     */
    public fun `object`(): String

    /**
     * A builder for [ServiceNowSourcePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param object The object specified in the ServiceNow flow source. 
       */
      public fun `object`(`object`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty.builder()

      /**
       * @param object The object specified in the ServiceNow flow source. 
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty,
    ) : CdkObject(cdkObject), ServiceNowSourcePropertiesProperty {
      /**
       * The object specified in the ServiceNow flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-servicenowsourceproperties.html#cfn-customerprofiles-integration-servicenowsourceproperties-object)
       */
      override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceNowSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty):
          ServiceNowSourcePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceNowSourcePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowSourcePropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty
    }
  }

  /**
   * The configuration that controls how Customer Profiles retrieves data from the source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * SourceFlowConfigProperty sourceFlowConfigProperty = SourceFlowConfigProperty.builder()
   * .connectorType("connectorType")
   * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
   * .marketo(MarketoSourcePropertiesProperty.builder()
   * .object("object")
   * .build())
   * .s3(S3SourcePropertiesProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .build())
   * .salesforce(SalesforceSourcePropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .enableDynamicFieldUpdate(false)
   * .includeDeletedRecords(false)
   * .build())
   * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
   * .object("object")
   * .build())
   * .zendesk(ZendeskSourcePropertiesProperty.builder()
   * .object("object")
   * .build())
   * .build())
   * // the properties below are optional
   * .connectorProfileName("connectorProfileName")
   * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
   * .datetimeTypeFieldName("datetimeTypeFieldName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceflowconfig.html)
   */
  public interface SourceFlowConfigProperty {
    /**
     * The name of the Amazon AppFlow connector profile.
     *
     * This name must be unique for each connector profile in the AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceflowconfig.html#cfn-customerprofiles-integration-sourceflowconfig-connectorprofilename)
     */
    public fun connectorProfileName(): String? = unwrap(this).getConnectorProfileName()

    /**
     * The type of connector, such as Salesforce, Marketo, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceflowconfig.html#cfn-customerprofiles-integration-sourceflowconfig-connectortype)
     */
    public fun connectorType(): String

    /**
     * Defines the configuration for a scheduled incremental data pull.
     *
     * If a valid configuration is provided, the fields specified in the configuration are used when
     * querying for the incremental data pull.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceflowconfig.html#cfn-customerprofiles-integration-sourceflowconfig-incrementalpullconfig)
     */
    public fun incrementalPullConfig(): Any? = unwrap(this).getIncrementalPullConfig()

    /**
     * Specifies the information that is required to query a particular source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceflowconfig.html#cfn-customerprofiles-integration-sourceflowconfig-sourceconnectorproperties)
     */
    public fun sourceConnectorProperties(): Any

    /**
     * A builder for [SourceFlowConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectorProfileName The name of the Amazon AppFlow connector profile.
       * This name must be unique for each connector profile in the AWS account .
       */
      public fun connectorProfileName(connectorProfileName: String)

      /**
       * @param connectorType The type of connector, such as Salesforce, Marketo, and so on. 
       */
      public fun connectorType(connectorType: String)

      /**
       * @param incrementalPullConfig Defines the configuration for a scheduled incremental data
       * pull.
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       */
      public fun incrementalPullConfig(incrementalPullConfig: IResolvable)

      /**
       * @param incrementalPullConfig Defines the configuration for a scheduled incremental data
       * pull.
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       */
      public fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty)

      /**
       * @param incrementalPullConfig Defines the configuration for a scheduled incremental data
       * pull.
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48d51bd416d1ee7fc0fa038e2aa3e18540973a149bdc9c39fa032d2d6d13221b")
      public
          fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty.Builder.() -> Unit)

      /**
       * @param sourceConnectorProperties Specifies the information that is required to query a
       * particular source connector. 
       */
      public fun sourceConnectorProperties(sourceConnectorProperties: IResolvable)

      /**
       * @param sourceConnectorProperties Specifies the information that is required to query a
       * particular source connector. 
       */
      public
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty)

      /**
       * @param sourceConnectorProperties Specifies the information that is required to query a
       * particular source connector. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7804759ca70ed0353106d5bfcbc5cf6795677bfc643f6c53ae0e644e38de8309")
      public
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty.builder()

      /**
       * @param connectorProfileName The name of the Amazon AppFlow connector profile.
       * This name must be unique for each connector profile in the AWS account .
       */
      override fun connectorProfileName(connectorProfileName: String) {
        cdkBuilder.connectorProfileName(connectorProfileName)
      }

      /**
       * @param connectorType The type of connector, such as Salesforce, Marketo, and so on. 
       */
      override fun connectorType(connectorType: String) {
        cdkBuilder.connectorType(connectorType)
      }

      /**
       * @param incrementalPullConfig Defines the configuration for a scheduled incremental data
       * pull.
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       */
      override fun incrementalPullConfig(incrementalPullConfig: IResolvable) {
        cdkBuilder.incrementalPullConfig(incrementalPullConfig.let(IResolvable::unwrap))
      }

      /**
       * @param incrementalPullConfig Defines the configuration for a scheduled incremental data
       * pull.
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       */
      override fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty) {
        cdkBuilder.incrementalPullConfig(incrementalPullConfig.let(IncrementalPullConfigProperty::unwrap))
      }

      /**
       * @param incrementalPullConfig Defines the configuration for a scheduled incremental data
       * pull.
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48d51bd416d1ee7fc0fa038e2aa3e18540973a149bdc9c39fa032d2d6d13221b")
      override
          fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty.Builder.() -> Unit):
          Unit = incrementalPullConfig(IncrementalPullConfigProperty(incrementalPullConfig))

      /**
       * @param sourceConnectorProperties Specifies the information that is required to query a
       * particular source connector. 
       */
      override fun sourceConnectorProperties(sourceConnectorProperties: IResolvable) {
        cdkBuilder.sourceConnectorProperties(sourceConnectorProperties.let(IResolvable::unwrap))
      }

      /**
       * @param sourceConnectorProperties Specifies the information that is required to query a
       * particular source connector. 
       */
      override
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty) {
        cdkBuilder.sourceConnectorProperties(sourceConnectorProperties.let(SourceConnectorPropertiesProperty::unwrap))
      }

      /**
       * @param sourceConnectorProperties Specifies the information that is required to query a
       * particular source connector. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7804759ca70ed0353106d5bfcbc5cf6795677bfc643f6c53ae0e644e38de8309")
      override
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty.Builder.() -> Unit):
          Unit =
          sourceConnectorProperties(SourceConnectorPropertiesProperty(sourceConnectorProperties))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty,
    ) : CdkObject(cdkObject), SourceFlowConfigProperty {
      /**
       * The name of the Amazon AppFlow connector profile.
       *
       * This name must be unique for each connector profile in the AWS account .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceflowconfig.html#cfn-customerprofiles-integration-sourceflowconfig-connectorprofilename)
       */
      override fun connectorProfileName(): String? = unwrap(this).getConnectorProfileName()

      /**
       * The type of connector, such as Salesforce, Marketo, and so on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceflowconfig.html#cfn-customerprofiles-integration-sourceflowconfig-connectortype)
       */
      override fun connectorType(): String = unwrap(this).getConnectorType()

      /**
       * Defines the configuration for a scheduled incremental data pull.
       *
       * If a valid configuration is provided, the fields specified in the configuration are used
       * when querying for the incremental data pull.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceflowconfig.html#cfn-customerprofiles-integration-sourceflowconfig-incrementalpullconfig)
       */
      override fun incrementalPullConfig(): Any? = unwrap(this).getIncrementalPullConfig()

      /**
       * Specifies the information that is required to query a particular source connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceflowconfig.html#cfn-customerprofiles-integration-sourceflowconfig-sourceconnectorproperties)
       */
      override fun sourceConnectorProperties(): Any = unwrap(this).getSourceConnectorProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceFlowConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty):
          SourceFlowConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceFlowConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceFlowConfigProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty
    }
  }

  /**
   * Specifies the information that is required to query a particular Amazon AppFlow connector.
   *
   * Customer Profiles supports Salesforce, Zendesk, Marketo, ServiceNow and Amazon S3.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * SourceConnectorPropertiesProperty sourceConnectorPropertiesProperty =
   * SourceConnectorPropertiesProperty.builder()
   * .marketo(MarketoSourcePropertiesProperty.builder()
   * .object("object")
   * .build())
   * .s3(S3SourcePropertiesProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .build())
   * .salesforce(SalesforceSourcePropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .enableDynamicFieldUpdate(false)
   * .includeDeletedRecords(false)
   * .build())
   * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
   * .object("object")
   * .build())
   * .zendesk(ZendeskSourcePropertiesProperty.builder()
   * .object("object")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceconnectorproperties.html)
   */
  public interface SourceConnectorPropertiesProperty {
    /**
     * The properties that are applied when Marketo is being used as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceconnectorproperties.html#cfn-customerprofiles-integration-sourceconnectorproperties-marketo)
     */
    public fun marketo(): Any? = unwrap(this).getMarketo()

    /**
     * The properties that are applied when Amazon S3 is being used as the flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceconnectorproperties.html#cfn-customerprofiles-integration-sourceconnectorproperties-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * The properties that are applied when Salesforce is being used as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceconnectorproperties.html#cfn-customerprofiles-integration-sourceconnectorproperties-salesforce)
     */
    public fun salesforce(): Any? = unwrap(this).getSalesforce()

    /**
     * The properties that are applied when ServiceNow is being used as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceconnectorproperties.html#cfn-customerprofiles-integration-sourceconnectorproperties-servicenow)
     */
    public fun serviceNow(): Any? = unwrap(this).getServiceNow()

    /**
     * The properties that are applied when using Zendesk as a flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceconnectorproperties.html#cfn-customerprofiles-integration-sourceconnectorproperties-zendesk)
     */
    public fun zendesk(): Any? = unwrap(this).getZendesk()

    /**
     * A builder for [SourceConnectorPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param marketo The properties that are applied when Marketo is being used as a source.
       */
      public fun marketo(marketo: IResolvable)

      /**
       * @param marketo The properties that are applied when Marketo is being used as a source.
       */
      public fun marketo(marketo: MarketoSourcePropertiesProperty)

      /**
       * @param marketo The properties that are applied when Marketo is being used as a source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f6166f42c06012d7c509d0d14485cf8e9bf859ff289f251a18ecd3153dd67ae")
      public fun marketo(marketo: MarketoSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param s3 The properties that are applied when Amazon S3 is being used as the flow source.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 The properties that are applied when Amazon S3 is being used as the flow source.
       */
      public fun s3(s3: S3SourcePropertiesProperty)

      /**
       * @param s3 The properties that are applied when Amazon S3 is being used as the flow source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9431f26d4c9cb1700c9ec9acaae9162ca98c1a5a77111b84fcace6c88533b43b")
      public fun s3(s3: S3SourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param salesforce The properties that are applied when Salesforce is being used as a
       * source.
       */
      public fun salesforce(salesforce: IResolvable)

      /**
       * @param salesforce The properties that are applied when Salesforce is being used as a
       * source.
       */
      public fun salesforce(salesforce: SalesforceSourcePropertiesProperty)

      /**
       * @param salesforce The properties that are applied when Salesforce is being used as a
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6358b33533849c833bc905c9ea8afad1d603bef87af3893289be70dc7d6343d")
      public fun salesforce(salesforce: SalesforceSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param serviceNow The properties that are applied when ServiceNow is being used as a
       * source.
       */
      public fun serviceNow(serviceNow: IResolvable)

      /**
       * @param serviceNow The properties that are applied when ServiceNow is being used as a
       * source.
       */
      public fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty)

      /**
       * @param serviceNow The properties that are applied when ServiceNow is being used as a
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1943dc75d6102cd55841aeb85d4f44916396062eeae1b775b1f41b40c9dac715")
      public fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty.Builder.() -> Unit)

      /**
       * @param zendesk The properties that are applied when using Zendesk as a flow source.
       */
      public fun zendesk(zendesk: IResolvable)

      /**
       * @param zendesk The properties that are applied when using Zendesk as a flow source.
       */
      public fun zendesk(zendesk: ZendeskSourcePropertiesProperty)

      /**
       * @param zendesk The properties that are applied when using Zendesk as a flow source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec735fe5819d68f086ce99da421c1742af42cea8a3a0ad71523a809c701813fd")
      public fun zendesk(zendesk: ZendeskSourcePropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty.builder()

      /**
       * @param marketo The properties that are applied when Marketo is being used as a source.
       */
      override fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo.let(IResolvable::unwrap))
      }

      /**
       * @param marketo The properties that are applied when Marketo is being used as a source.
       */
      override fun marketo(marketo: MarketoSourcePropertiesProperty) {
        cdkBuilder.marketo(marketo.let(MarketoSourcePropertiesProperty::unwrap))
      }

      /**
       * @param marketo The properties that are applied when Marketo is being used as a source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f6166f42c06012d7c509d0d14485cf8e9bf859ff289f251a18ecd3153dd67ae")
      override fun marketo(marketo: MarketoSourcePropertiesProperty.Builder.() -> Unit): Unit =
          marketo(MarketoSourcePropertiesProperty(marketo))

      /**
       * @param s3 The properties that are applied when Amazon S3 is being used as the flow source.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      /**
       * @param s3 The properties that are applied when Amazon S3 is being used as the flow source.
       */
      override fun s3(s3: S3SourcePropertiesProperty) {
        cdkBuilder.s3(s3.let(S3SourcePropertiesProperty::unwrap))
      }

      /**
       * @param s3 The properties that are applied when Amazon S3 is being used as the flow source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9431f26d4c9cb1700c9ec9acaae9162ca98c1a5a77111b84fcace6c88533b43b")
      override fun s3(s3: S3SourcePropertiesProperty.Builder.() -> Unit): Unit =
          s3(S3SourcePropertiesProperty(s3))

      /**
       * @param salesforce The properties that are applied when Salesforce is being used as a
       * source.
       */
      override fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce.let(IResolvable::unwrap))
      }

      /**
       * @param salesforce The properties that are applied when Salesforce is being used as a
       * source.
       */
      override fun salesforce(salesforce: SalesforceSourcePropertiesProperty) {
        cdkBuilder.salesforce(salesforce.let(SalesforceSourcePropertiesProperty::unwrap))
      }

      /**
       * @param salesforce The properties that are applied when Salesforce is being used as a
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6358b33533849c833bc905c9ea8afad1d603bef87af3893289be70dc7d6343d")
      override fun salesforce(salesforce: SalesforceSourcePropertiesProperty.Builder.() -> Unit):
          Unit = salesforce(SalesforceSourcePropertiesProperty(salesforce))

      /**
       * @param serviceNow The properties that are applied when ServiceNow is being used as a
       * source.
       */
      override fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow.let(IResolvable::unwrap))
      }

      /**
       * @param serviceNow The properties that are applied when ServiceNow is being used as a
       * source.
       */
      override fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty) {
        cdkBuilder.serviceNow(serviceNow.let(ServiceNowSourcePropertiesProperty::unwrap))
      }

      /**
       * @param serviceNow The properties that are applied when ServiceNow is being used as a
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1943dc75d6102cd55841aeb85d4f44916396062eeae1b775b1f41b40c9dac715")
      override fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty.Builder.() -> Unit):
          Unit = serviceNow(ServiceNowSourcePropertiesProperty(serviceNow))

      /**
       * @param zendesk The properties that are applied when using Zendesk as a flow source.
       */
      override fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk.let(IResolvable::unwrap))
      }

      /**
       * @param zendesk The properties that are applied when using Zendesk as a flow source.
       */
      override fun zendesk(zendesk: ZendeskSourcePropertiesProperty) {
        cdkBuilder.zendesk(zendesk.let(ZendeskSourcePropertiesProperty::unwrap))
      }

      /**
       * @param zendesk The properties that are applied when using Zendesk as a flow source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec735fe5819d68f086ce99da421c1742af42cea8a3a0ad71523a809c701813fd")
      override fun zendesk(zendesk: ZendeskSourcePropertiesProperty.Builder.() -> Unit): Unit =
          zendesk(ZendeskSourcePropertiesProperty(zendesk))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty,
    ) : CdkObject(cdkObject), SourceConnectorPropertiesProperty {
      /**
       * The properties that are applied when Marketo is being used as a source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceconnectorproperties.html#cfn-customerprofiles-integration-sourceconnectorproperties-marketo)
       */
      override fun marketo(): Any? = unwrap(this).getMarketo()

      /**
       * The properties that are applied when Amazon S3 is being used as the flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceconnectorproperties.html#cfn-customerprofiles-integration-sourceconnectorproperties-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()

      /**
       * The properties that are applied when Salesforce is being used as a source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceconnectorproperties.html#cfn-customerprofiles-integration-sourceconnectorproperties-salesforce)
       */
      override fun salesforce(): Any? = unwrap(this).getSalesforce()

      /**
       * The properties that are applied when ServiceNow is being used as a source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceconnectorproperties.html#cfn-customerprofiles-integration-sourceconnectorproperties-servicenow)
       */
      override fun serviceNow(): Any? = unwrap(this).getServiceNow()

      /**
       * The properties that are applied when using Zendesk as a flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceconnectorproperties.html#cfn-customerprofiles-integration-sourceconnectorproperties-zendesk)
       */
      override fun zendesk(): Any? = unwrap(this).getZendesk()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SourceConnectorPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty):
          SourceConnectorPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SourceConnectorPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConnectorPropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty
    }
  }

  /**
   * A map used to store task-related information.
   *
   * The execution service looks for particular information based on the `TaskType` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * TaskPropertiesMapProperty taskPropertiesMapProperty = TaskPropertiesMapProperty.builder()
   * .operatorPropertyKey("operatorPropertyKey")
   * .property("property")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-taskpropertiesmap.html)
   */
  public interface TaskPropertiesMapProperty {
    /**
     * The task property key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-taskpropertiesmap.html#cfn-customerprofiles-integration-taskpropertiesmap-operatorpropertykey)
     */
    public fun operatorPropertyKey(): String

    /**
     * The task property value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-taskpropertiesmap.html#cfn-customerprofiles-integration-taskpropertiesmap-property)
     */
    public fun `property`(): String

    /**
     * A builder for [TaskPropertiesMapProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param operatorPropertyKey The task property key. 
       */
      public fun operatorPropertyKey(operatorPropertyKey: String)

      /**
       * @param property The task property value. 
       */
      public fun `property`(`property`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty.builder()

      /**
       * @param operatorPropertyKey The task property key. 
       */
      override fun operatorPropertyKey(operatorPropertyKey: String) {
        cdkBuilder.operatorPropertyKey(operatorPropertyKey)
      }

      /**
       * @param property The task property value. 
       */
      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty,
    ) : CdkObject(cdkObject), TaskPropertiesMapProperty {
      /**
       * The task property key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-taskpropertiesmap.html#cfn-customerprofiles-integration-taskpropertiesmap-operatorpropertykey)
       */
      override fun operatorPropertyKey(): String = unwrap(this).getOperatorPropertyKey()

      /**
       * The task property value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-taskpropertiesmap.html#cfn-customerprofiles-integration-taskpropertiesmap-property)
       */
      override fun `property`(): String = unwrap(this).getProperty()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TaskPropertiesMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty):
          TaskPropertiesMapProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TaskPropertiesMapProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskPropertiesMapProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty
    }
  }
}
