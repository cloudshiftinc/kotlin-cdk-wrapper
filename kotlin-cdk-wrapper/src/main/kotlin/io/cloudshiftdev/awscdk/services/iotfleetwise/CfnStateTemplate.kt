@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a mechanism for vehicle owners to track the state of their vehicles.
 *
 * State templates determine which signal updates the vehicle sends to the cloud.
 *
 * For more information, see [State
 * templates](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/state-templates.html) in
 * the *AWS IoT FleetWise Developer Guide* .
 *
 *
 * Access to certain AWS IoT FleetWise features is currently gated. For more information, see [AWS
 * Region and feature
 * availability](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleetwise-regions.html)
 * in the *AWS IoT FleetWise Developer Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
 * CfnStateTemplate cfnStateTemplate = CfnStateTemplate.Builder.create(this, "MyCfnStateTemplate")
 * .name("name")
 * .signalCatalogArn("signalCatalogArn")
 * .stateTemplateProperties(List.of("stateTemplateProperties"))
 * // the properties below are optional
 * .dataExtraDimensions(List.of("dataExtraDimensions"))
 * .description("description")
 * .metadataExtraDimensions(List.of("metadataExtraDimensions"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html)
 */
public open class CfnStateTemplate(
  cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnStateTemplate,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStateTemplateProps,
  ) :
      this(software.amazon.awscdk.services.iotfleetwise.CfnStateTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStateTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStateTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStateTemplateProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the state template.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time the state template was created, in seconds since epoch (January 1, 1970 at midnight
   * UTC time).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The time the state template was last updated, in seconds since epoch (January 1, 1970 at
   * midnight UTC time).
   */
  public open fun attrLastModificationTime(): String = unwrap(this).getAttrLastModificationTime()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A list of vehicle attributes associated with the payload published on the state template's MQTT
   * topic.
   */
  public open fun dataExtraDimensions(): List<String> = unwrap(this).getDataExtraDimensions() ?:
      emptyList()

  /**
   * A list of vehicle attributes associated with the payload published on the state template's MQTT
   * topic.
   */
  public open fun dataExtraDimensions(`value`: List<String>) {
    unwrap(this).setDataExtraDimensions(`value`)
  }

  /**
   * A list of vehicle attributes associated with the payload published on the state template's MQTT
   * topic.
   */
  public open fun dataExtraDimensions(vararg `value`: String): Unit =
      dataExtraDimensions(`value`.toList())

  /**
   * A brief description of the state template.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A brief description of the state template.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A list of vehicle attributes to associate with the user properties of the messages published on
   * the state template's MQTT topic.
   */
  public open fun metadataExtraDimensions(): List<String> =
      unwrap(this).getMetadataExtraDimensions() ?: emptyList()

  /**
   * A list of vehicle attributes to associate with the user properties of the messages published on
   * the state template's MQTT topic.
   */
  public open fun metadataExtraDimensions(`value`: List<String>) {
    unwrap(this).setMetadataExtraDimensions(`value`)
  }

  /**
   * A list of vehicle attributes to associate with the user properties of the messages published on
   * the state template's MQTT topic.
   */
  public open fun metadataExtraDimensions(vararg `value`: String): Unit =
      metadataExtraDimensions(`value`.toList())

  /**
   * The unique alias of the state template.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The unique alias of the state template.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the signal catalog associated with the state template.
   */
  public open fun signalCatalogArn(): String = unwrap(this).getSignalCatalogArn()

  /**
   * The Amazon Resource Name (ARN) of the signal catalog associated with the state template.
   */
  public open fun signalCatalogArn(`value`: String) {
    unwrap(this).setSignalCatalogArn(`value`)
  }

  /**
   * A list of signals from which data is collected.
   */
  public open fun stateTemplateProperties(): List<String> =
      unwrap(this).getStateTemplateProperties()

  /**
   * A list of signals from which data is collected.
   */
  public open fun stateTemplateProperties(`value`: List<String>) {
    unwrap(this).setStateTemplateProperties(`value`)
  }

  /**
   * A list of signals from which data is collected.
   */
  public open fun stateTemplateProperties(vararg `value`: String): Unit =
      stateTemplateProperties(`value`.toList())

  /**
   * Metadata that can be used to manage the state template.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Metadata that can be used to manage the state template.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata that can be used to manage the state template.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotfleetwise.CfnStateTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of vehicle attributes associated with the payload published on the state template's
     * MQTT topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-dataextradimensions)
     * @param dataExtraDimensions A list of vehicle attributes associated with the payload published
     * on the state template's MQTT topic. 
     */
    public fun dataExtraDimensions(dataExtraDimensions: List<String>)

    /**
     * A list of vehicle attributes associated with the payload published on the state template's
     * MQTT topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-dataextradimensions)
     * @param dataExtraDimensions A list of vehicle attributes associated with the payload published
     * on the state template's MQTT topic. 
     */
    public fun dataExtraDimensions(vararg dataExtraDimensions: String)

    /**
     * A brief description of the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-description)
     * @param description A brief description of the state template. 
     */
    public fun description(description: String)

    /**
     * A list of vehicle attributes to associate with the user properties of the messages published
     * on the state template's MQTT topic.
     *
     * For example, if you add `Vehicle.Attributes.Make` and `Vehicle.Attributes.Model` attributes,
     * these attributes are included as user properties with the MQTT message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-metadataextradimensions)
     * @param metadataExtraDimensions A list of vehicle attributes to associate with the user
     * properties of the messages published on the state template's MQTT topic. 
     */
    public fun metadataExtraDimensions(metadataExtraDimensions: List<String>)

    /**
     * A list of vehicle attributes to associate with the user properties of the messages published
     * on the state template's MQTT topic.
     *
     * For example, if you add `Vehicle.Attributes.Make` and `Vehicle.Attributes.Model` attributes,
     * these attributes are included as user properties with the MQTT message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-metadataextradimensions)
     * @param metadataExtraDimensions A list of vehicle attributes to associate with the user
     * properties of the messages published on the state template's MQTT topic. 
     */
    public fun metadataExtraDimensions(vararg metadataExtraDimensions: String)

    /**
     * The unique alias of the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-name)
     * @param name The unique alias of the state template. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) of the signal catalog associated with the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-signalcatalogarn)
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     * the state template. 
     */
    public fun signalCatalogArn(signalCatalogArn: String)

    /**
     * A list of signals from which data is collected.
     *
     * The state template properties contain the fully qualified names of the signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-statetemplateproperties)
     * @param stateTemplateProperties A list of signals from which data is collected. 
     */
    public fun stateTemplateProperties(stateTemplateProperties: List<String>)

    /**
     * A list of signals from which data is collected.
     *
     * The state template properties contain the fully qualified names of the signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-statetemplateproperties)
     * @param stateTemplateProperties A list of signals from which data is collected. 
     */
    public fun stateTemplateProperties(vararg stateTemplateProperties: String)

    /**
     * Metadata that can be used to manage the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-tags)
     * @param tags Metadata that can be used to manage the state template. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-tags)
     * @param tags Metadata that can be used to manage the state template. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnStateTemplate.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnStateTemplate.Builder.create(scope, id)

    /**
     * A list of vehicle attributes associated with the payload published on the state template's
     * MQTT topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-dataextradimensions)
     * @param dataExtraDimensions A list of vehicle attributes associated with the payload published
     * on the state template's MQTT topic. 
     */
    override fun dataExtraDimensions(dataExtraDimensions: List<String>) {
      cdkBuilder.dataExtraDimensions(dataExtraDimensions)
    }

    /**
     * A list of vehicle attributes associated with the payload published on the state template's
     * MQTT topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-dataextradimensions)
     * @param dataExtraDimensions A list of vehicle attributes associated with the payload published
     * on the state template's MQTT topic. 
     */
    override fun dataExtraDimensions(vararg dataExtraDimensions: String): Unit =
        dataExtraDimensions(dataExtraDimensions.toList())

    /**
     * A brief description of the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-description)
     * @param description A brief description of the state template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A list of vehicle attributes to associate with the user properties of the messages published
     * on the state template's MQTT topic.
     *
     * For example, if you add `Vehicle.Attributes.Make` and `Vehicle.Attributes.Model` attributes,
     * these attributes are included as user properties with the MQTT message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-metadataextradimensions)
     * @param metadataExtraDimensions A list of vehicle attributes to associate with the user
     * properties of the messages published on the state template's MQTT topic. 
     */
    override fun metadataExtraDimensions(metadataExtraDimensions: List<String>) {
      cdkBuilder.metadataExtraDimensions(metadataExtraDimensions)
    }

    /**
     * A list of vehicle attributes to associate with the user properties of the messages published
     * on the state template's MQTT topic.
     *
     * For example, if you add `Vehicle.Attributes.Make` and `Vehicle.Attributes.Model` attributes,
     * these attributes are included as user properties with the MQTT message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-metadataextradimensions)
     * @param metadataExtraDimensions A list of vehicle attributes to associate with the user
     * properties of the messages published on the state template's MQTT topic. 
     */
    override fun metadataExtraDimensions(vararg metadataExtraDimensions: String): Unit =
        metadataExtraDimensions(metadataExtraDimensions.toList())

    /**
     * The unique alias of the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-name)
     * @param name The unique alias of the state template. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the signal catalog associated with the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-signalcatalogarn)
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     * the state template. 
     */
    override fun signalCatalogArn(signalCatalogArn: String) {
      cdkBuilder.signalCatalogArn(signalCatalogArn)
    }

    /**
     * A list of signals from which data is collected.
     *
     * The state template properties contain the fully qualified names of the signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-statetemplateproperties)
     * @param stateTemplateProperties A list of signals from which data is collected. 
     */
    override fun stateTemplateProperties(stateTemplateProperties: List<String>) {
      cdkBuilder.stateTemplateProperties(stateTemplateProperties)
    }

    /**
     * A list of signals from which data is collected.
     *
     * The state template properties contain the fully qualified names of the signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-statetemplateproperties)
     * @param stateTemplateProperties A list of signals from which data is collected. 
     */
    override fun stateTemplateProperties(vararg stateTemplateProperties: String): Unit =
        stateTemplateProperties(stateTemplateProperties.toList())

    /**
     * Metadata that can be used to manage the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-tags)
     * @param tags Metadata that can be used to manage the state template. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata that can be used to manage the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-tags)
     * @param tags Metadata that can be used to manage the state template. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnStateTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotfleetwise.CfnStateTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStateTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStateTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnStateTemplate):
        CfnStateTemplate = CfnStateTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnStateTemplate):
        software.amazon.awscdk.services.iotfleetwise.CfnStateTemplate = wrapped.cdkObject as
        software.amazon.awscdk.services.iotfleetwise.CfnStateTemplate
  }
}
