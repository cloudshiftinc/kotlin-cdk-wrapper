@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnStateTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
 * CfnStateTemplateProps cfnStateTemplateProps = CfnStateTemplateProps.builder()
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
public interface CfnStateTemplateProps {
  /**
   * A list of vehicle attributes associated with the payload published on the state template's MQTT
   * topic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-dataextradimensions)
   */
  public fun dataExtraDimensions(): List<String> = unwrap(this).getDataExtraDimensions() ?:
      emptyList()

  /**
   * A brief description of the state template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A list of vehicle attributes to associate with the user properties of the messages published on
   * the state template's MQTT topic.
   *
   * For example, if you add `Vehicle.Attributes.Make` and `Vehicle.Attributes.Model` attributes,
   * these attributes are included as user properties with the MQTT message.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-metadataextradimensions)
   */
  public fun metadataExtraDimensions(): List<String> = unwrap(this).getMetadataExtraDimensions() ?:
      emptyList()

  /**
   * The unique alias of the state template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) of the signal catalog associated with the state template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-signalcatalogarn)
   */
  public fun signalCatalogArn(): String

  /**
   * A list of signals from which data is collected.
   *
   * The state template properties contain the fully qualified names of the signals.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-statetemplateproperties)
   */
  public fun stateTemplateProperties(): List<String>

  /**
   * Metadata that can be used to manage the state template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStateTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataExtraDimensions A list of vehicle attributes associated with the payload published
     * on the state template's MQTT topic.
     */
    public fun dataExtraDimensions(dataExtraDimensions: List<String>)

    /**
     * @param dataExtraDimensions A list of vehicle attributes associated with the payload published
     * on the state template's MQTT topic.
     */
    public fun dataExtraDimensions(vararg dataExtraDimensions: String)

    /**
     * @param description A brief description of the state template.
     */
    public fun description(description: String)

    /**
     * @param metadataExtraDimensions A list of vehicle attributes to associate with the user
     * properties of the messages published on the state template's MQTT topic.
     * For example, if you add `Vehicle.Attributes.Make` and `Vehicle.Attributes.Model` attributes,
     * these attributes are included as user properties with the MQTT message.
     */
    public fun metadataExtraDimensions(metadataExtraDimensions: List<String>)

    /**
     * @param metadataExtraDimensions A list of vehicle attributes to associate with the user
     * properties of the messages published on the state template's MQTT topic.
     * For example, if you add `Vehicle.Attributes.Make` and `Vehicle.Attributes.Model` attributes,
     * these attributes are included as user properties with the MQTT message.
     */
    public fun metadataExtraDimensions(vararg metadataExtraDimensions: String)

    /**
     * @param name The unique alias of the state template. 
     */
    public fun name(name: String)

    /**
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     * the state template. 
     */
    public fun signalCatalogArn(signalCatalogArn: String)

    /**
     * @param stateTemplateProperties A list of signals from which data is collected. 
     * The state template properties contain the fully qualified names of the signals.
     */
    public fun stateTemplateProperties(stateTemplateProperties: List<String>)

    /**
     * @param stateTemplateProperties A list of signals from which data is collected. 
     * The state template properties contain the fully qualified names of the signals.
     */
    public fun stateTemplateProperties(vararg stateTemplateProperties: String)

    /**
     * @param tags Metadata that can be used to manage the state template.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that can be used to manage the state template.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotfleetwise.CfnStateTemplateProps.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnStateTemplateProps.builder()

    /**
     * @param dataExtraDimensions A list of vehicle attributes associated with the payload published
     * on the state template's MQTT topic.
     */
    override fun dataExtraDimensions(dataExtraDimensions: List<String>) {
      cdkBuilder.dataExtraDimensions(dataExtraDimensions)
    }

    /**
     * @param dataExtraDimensions A list of vehicle attributes associated with the payload published
     * on the state template's MQTT topic.
     */
    override fun dataExtraDimensions(vararg dataExtraDimensions: String): Unit =
        dataExtraDimensions(dataExtraDimensions.toList())

    /**
     * @param description A brief description of the state template.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param metadataExtraDimensions A list of vehicle attributes to associate with the user
     * properties of the messages published on the state template's MQTT topic.
     * For example, if you add `Vehicle.Attributes.Make` and `Vehicle.Attributes.Model` attributes,
     * these attributes are included as user properties with the MQTT message.
     */
    override fun metadataExtraDimensions(metadataExtraDimensions: List<String>) {
      cdkBuilder.metadataExtraDimensions(metadataExtraDimensions)
    }

    /**
     * @param metadataExtraDimensions A list of vehicle attributes to associate with the user
     * properties of the messages published on the state template's MQTT topic.
     * For example, if you add `Vehicle.Attributes.Make` and `Vehicle.Attributes.Model` attributes,
     * these attributes are included as user properties with the MQTT message.
     */
    override fun metadataExtraDimensions(vararg metadataExtraDimensions: String): Unit =
        metadataExtraDimensions(metadataExtraDimensions.toList())

    /**
     * @param name The unique alias of the state template. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     * the state template. 
     */
    override fun signalCatalogArn(signalCatalogArn: String) {
      cdkBuilder.signalCatalogArn(signalCatalogArn)
    }

    /**
     * @param stateTemplateProperties A list of signals from which data is collected. 
     * The state template properties contain the fully qualified names of the signals.
     */
    override fun stateTemplateProperties(stateTemplateProperties: List<String>) {
      cdkBuilder.stateTemplateProperties(stateTemplateProperties)
    }

    /**
     * @param stateTemplateProperties A list of signals from which data is collected. 
     * The state template properties contain the fully qualified names of the signals.
     */
    override fun stateTemplateProperties(vararg stateTemplateProperties: String): Unit =
        stateTemplateProperties(stateTemplateProperties.toList())

    /**
     * @param tags Metadata that can be used to manage the state template.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata that can be used to manage the state template.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnStateTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnStateTemplateProps,
  ) : CdkObject(cdkObject),
      CfnStateTemplateProps {
    /**
     * A list of vehicle attributes associated with the payload published on the state template's
     * MQTT topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-dataextradimensions)
     */
    override fun dataExtraDimensions(): List<String> = unwrap(this).getDataExtraDimensions() ?:
        emptyList()

    /**
     * A brief description of the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A list of vehicle attributes to associate with the user properties of the messages published
     * on the state template's MQTT topic.
     *
     * For example, if you add `Vehicle.Attributes.Make` and `Vehicle.Attributes.Model` attributes,
     * these attributes are included as user properties with the MQTT message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-metadataextradimensions)
     */
    override fun metadataExtraDimensions(): List<String> = unwrap(this).getMetadataExtraDimensions()
        ?: emptyList()

    /**
     * The unique alias of the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of the signal catalog associated with the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-signalcatalogarn)
     */
    override fun signalCatalogArn(): String = unwrap(this).getSignalCatalogArn()

    /**
     * A list of signals from which data is collected.
     *
     * The state template properties contain the fully qualified names of the signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-statetemplateproperties)
     */
    override fun stateTemplateProperties(): List<String> = unwrap(this).getStateTemplateProperties()

    /**
     * Metadata that can be used to manage the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-statetemplate.html#cfn-iotfleetwise-statetemplate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStateTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnStateTemplateProps):
        CfnStateTemplateProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStateTemplateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStateTemplateProps):
        software.amazon.awscdk.services.iotfleetwise.CfnStateTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotfleetwise.CfnStateTemplateProps
  }
}
