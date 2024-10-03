@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a vehicle model (model manifest) that specifies signals (attributes, branches, sensors,
 * and actuators).
 *
 * For more information, see [Vehicle
 * models](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/vehicle-models.html) in the
 * *AWS IoT FleetWise Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
 * CfnModelManifest cfnModelManifest = CfnModelManifest.Builder.create(this, "MyCfnModelManifest")
 * .name("name")
 * .signalCatalogArn("signalCatalogArn")
 * // the properties below are optional
 * .description("description")
 * .nodes(List.of("nodes"))
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html)
 */
public open class CfnModelManifest(
  cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnModelManifest,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModelManifestProps,
  ) :
      this(software.amazon.awscdk.services.iotfleetwise.CfnModelManifest(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnModelManifestProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModelManifestProps.Builder.() -> Unit,
  ) : this(scope, id, CfnModelManifestProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the vehicle model.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time the vehicle model was created, in seconds since epoch (January 1, 1970 at midnight UTC
   * time).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The time the vehicle model was last updated, in seconds since epoch (January 1, 1970 at
   * midnight UTC time).
   */
  public open fun attrLastModificationTime(): String = unwrap(this).getAttrLastModificationTime()

  /**
   * (Optional) A brief description of the vehicle model.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * (Optional) A brief description of the vehicle model.
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
   * The name of the vehicle model.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the vehicle model.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * (Optional) A list of nodes, which are a general abstraction of signals.
   */
  public open fun nodes(): List<String> = unwrap(this).getNodes() ?: emptyList()

  /**
   * (Optional) A list of nodes, which are a general abstraction of signals.
   */
  public open fun nodes(`value`: List<String>) {
    unwrap(this).setNodes(`value`)
  }

  /**
   * (Optional) A list of nodes, which are a general abstraction of signals.
   */
  public open fun nodes(vararg `value`: String): Unit = nodes(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the signal catalog associated with the vehicle model.
   */
  public open fun signalCatalogArn(): String = unwrap(this).getSignalCatalogArn()

  /**
   * The Amazon Resource Name (ARN) of the signal catalog associated with the vehicle model.
   */
  public open fun signalCatalogArn(`value`: String) {
    unwrap(this).setSignalCatalogArn(`value`)
  }

  /**
   * (Optional) The state of the vehicle model.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * (Optional) The state of the vehicle model.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * (Optional) Metadata that can be used to manage the vehicle model.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * (Optional) Metadata that can be used to manage the vehicle model.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * (Optional) Metadata that can be used to manage the vehicle model.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotfleetwise.CfnModelManifest].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * (Optional) A brief description of the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-description)
     * @param description (Optional) A brief description of the vehicle model. 
     */
    public fun description(description: String)

    /**
     * The name of the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-name)
     * @param name The name of the vehicle model. 
     */
    public fun name(name: String)

    /**
     * (Optional) A list of nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-nodes)
     * @param nodes (Optional) A list of nodes, which are a general abstraction of signals. 
     */
    public fun nodes(nodes: List<String>)

    /**
     * (Optional) A list of nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-nodes)
     * @param nodes (Optional) A list of nodes, which are a general abstraction of signals. 
     */
    public fun nodes(vararg nodes: String)

    /**
     * The Amazon Resource Name (ARN) of the signal catalog associated with the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-signalcatalogarn)
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     * the vehicle model. 
     */
    public fun signalCatalogArn(signalCatalogArn: String)

    /**
     * (Optional) The state of the vehicle model.
     *
     * If the status is `ACTIVE` , the vehicle model can't be edited. If the status is `DRAFT` , you
     * can edit the vehicle model.
     *
     * Default: - "DRAFT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-status)
     * @param status (Optional) The state of the vehicle model. 
     */
    public fun status(status: String)

    /**
     * (Optional) Metadata that can be used to manage the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-tags)
     * @param tags (Optional) Metadata that can be used to manage the vehicle model. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * (Optional) Metadata that can be used to manage the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-tags)
     * @param tags (Optional) Metadata that can be used to manage the vehicle model. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnModelManifest.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnModelManifest.Builder.create(scope, id)

    /**
     * (Optional) A brief description of the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-description)
     * @param description (Optional) A brief description of the vehicle model. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-name)
     * @param name The name of the vehicle model. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * (Optional) A list of nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-nodes)
     * @param nodes (Optional) A list of nodes, which are a general abstraction of signals. 
     */
    override fun nodes(nodes: List<String>) {
      cdkBuilder.nodes(nodes)
    }

    /**
     * (Optional) A list of nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-nodes)
     * @param nodes (Optional) A list of nodes, which are a general abstraction of signals. 
     */
    override fun nodes(vararg nodes: String): Unit = nodes(nodes.toList())

    /**
     * The Amazon Resource Name (ARN) of the signal catalog associated with the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-signalcatalogarn)
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     * the vehicle model. 
     */
    override fun signalCatalogArn(signalCatalogArn: String) {
      cdkBuilder.signalCatalogArn(signalCatalogArn)
    }

    /**
     * (Optional) The state of the vehicle model.
     *
     * If the status is `ACTIVE` , the vehicle model can't be edited. If the status is `DRAFT` , you
     * can edit the vehicle model.
     *
     * Default: - "DRAFT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-status)
     * @param status (Optional) The state of the vehicle model. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * (Optional) Metadata that can be used to manage the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-tags)
     * @param tags (Optional) Metadata that can be used to manage the vehicle model. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * (Optional) Metadata that can be used to manage the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-tags)
     * @param tags (Optional) Metadata that can be used to manage the vehicle model. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnModelManifest =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotfleetwise.CfnModelManifest.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModelManifest {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModelManifest(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnModelManifest):
        CfnModelManifest = CfnModelManifest(cdkObject)

    internal fun unwrap(wrapped: CfnModelManifest):
        software.amazon.awscdk.services.iotfleetwise.CfnModelManifest = wrapped.cdkObject as
        software.amazon.awscdk.services.iotfleetwise.CfnModelManifest
  }
}
