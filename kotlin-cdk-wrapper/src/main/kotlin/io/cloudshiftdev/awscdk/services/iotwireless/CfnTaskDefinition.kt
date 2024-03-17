@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

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
 * Creates a gateway task definition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnTaskDefinition cfnTaskDefinition = CfnTaskDefinition.Builder.create(this,
 * "MyCfnTaskDefinition")
 * .autoCreateTasks(false)
 * // the properties below are optional
 * .loRaWanUpdateGatewayTaskEntry(LoRaWANUpdateGatewayTaskEntryProperty.builder()
 * .currentVersion(LoRaWANGatewayVersionProperty.builder()
 * .model("model")
 * .packageVersion("packageVersion")
 * .station("station")
 * .build())
 * .updateVersion(LoRaWANGatewayVersionProperty.builder()
 * .model("model")
 * .packageVersion("packageVersion")
 * .station("station")
 * .build())
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .taskDefinitionType("taskDefinitionType")
 * .update(UpdateWirelessGatewayTaskCreateProperty.builder()
 * .loRaWan(LoRaWANUpdateGatewayTaskCreateProperty.builder()
 * .currentVersion(LoRaWANGatewayVersionProperty.builder()
 * .model("model")
 * .packageVersion("packageVersion")
 * .station("station")
 * .build())
 * .sigKeyCrc(123)
 * .updateSignature("updateSignature")
 * .updateVersion(LoRaWANGatewayVersionProperty.builder()
 * .model("model")
 * .packageVersion("packageVersion")
 * .station("station")
 * .build())
 * .build())
 * .updateDataRole("updateDataRole")
 * .updateDataSource("updateDataSource")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html)
 */
public open class CfnTaskDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name of the resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the new wireless gateway task definition.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Whether to automatically create tasks using this task definition for all gateways with the
   * specified current version.
   */
  public open fun autoCreateTasks(): Any = unwrap(this).getAutoCreateTasks()

  /**
   * Whether to automatically create tasks using this task definition for all gateways with the
   * specified current version.
   */
  public open fun autoCreateTasks(`value`: Boolean) {
    unwrap(this).setAutoCreateTasks(`value`)
  }

  /**
   * Whether to automatically create tasks using this task definition for all gateways with the
   * specified current version.
   */
  public open fun autoCreateTasks(`value`: IResolvable) {
    unwrap(this).setAutoCreateTasks(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * LoRaWANUpdateGatewayTaskEntry object.
   */
  public open fun loRaWanUpdateGatewayTaskEntry(): Any? =
      unwrap(this).getLoRaWanUpdateGatewayTaskEntry()

  /**
   * LoRaWANUpdateGatewayTaskEntry object.
   */
  public open fun loRaWanUpdateGatewayTaskEntry(`value`: IResolvable) {
    unwrap(this).setLoRaWanUpdateGatewayTaskEntry(`value`.let(IResolvable::unwrap))
  }

  /**
   * LoRaWANUpdateGatewayTaskEntry object.
   */
  public open fun loRaWanUpdateGatewayTaskEntry(`value`: LoRaWANUpdateGatewayTaskEntryProperty) {
    unwrap(this).setLoRaWanUpdateGatewayTaskEntry(`value`.let(LoRaWANUpdateGatewayTaskEntryProperty::unwrap))
  }

  /**
   * LoRaWANUpdateGatewayTaskEntry object.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cd114bcf3aaa4f55eb201fd42c4efa24baff839c441452902de638c551e1529e")
  public open
      fun loRaWanUpdateGatewayTaskEntry(`value`: LoRaWANUpdateGatewayTaskEntryProperty.Builder.() -> Unit):
      Unit = loRaWanUpdateGatewayTaskEntry(LoRaWANUpdateGatewayTaskEntryProperty(`value`))

  /**
   * The name of the new resource.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the new resource.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A filter to list only the wireless gateway task definitions that use this task definition type.
   */
  public open fun taskDefinitionType(): String? = unwrap(this).getTaskDefinitionType()

  /**
   * A filter to list only the wireless gateway task definitions that use this task definition type.
   */
  public open fun taskDefinitionType(`value`: String) {
    unwrap(this).setTaskDefinitionType(`value`)
  }

  /**
   * Information about the gateways to update.
   */
  public open fun update(): Any? = unwrap(this).getUpdate()

  /**
   * Information about the gateways to update.
   */
  public open fun update(`value`: IResolvable) {
    unwrap(this).setUpdate(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the gateways to update.
   */
  public open fun update(`value`: UpdateWirelessGatewayTaskCreateProperty) {
    unwrap(this).setUpdate(`value`.let(UpdateWirelessGatewayTaskCreateProperty::unwrap))
  }

  /**
   * Information about the gateways to update.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f3f3e3baec05b04591f177ffb0e9fa881df5d1f0d5868a999b2421cf124cf9c3")
  public open fun update(`value`: UpdateWirelessGatewayTaskCreateProperty.Builder.() -> Unit): Unit
      = update(UpdateWirelessGatewayTaskCreateProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotwireless.CfnTaskDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to automatically create tasks using this task definition for all gateways with the
     * specified current version.
     *
     * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-autocreatetasks)
     * @param autoCreateTasks Whether to automatically create tasks using this task definition for
     * all gateways with the specified current version. 
     */
    public fun autoCreateTasks(autoCreateTasks: Boolean)

    /**
     * Whether to automatically create tasks using this task definition for all gateways with the
     * specified current version.
     *
     * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-autocreatetasks)
     * @param autoCreateTasks Whether to automatically create tasks using this task definition for
     * all gateways with the specified current version. 
     */
    public fun autoCreateTasks(autoCreateTasks: IResolvable)

    /**
     * LoRaWANUpdateGatewayTaskEntry object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry)
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object. 
     */
    public fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: IResolvable)

    /**
     * LoRaWANUpdateGatewayTaskEntry object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry)
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object. 
     */
    public
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: LoRaWANUpdateGatewayTaskEntryProperty)

    /**
     * LoRaWANUpdateGatewayTaskEntry object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry)
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4029b89ab3c57a112afb8f4a10f136caacb63e73b69ed8aec5cb67efdcf6f365")
    public
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: LoRaWANUpdateGatewayTaskEntryProperty.Builder.() -> Unit)

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-name)
     * @param name The name of the new resource. 
     */
    public fun name(name: String)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A filter to list only the wireless gateway task definitions that use this task definition
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-taskdefinitiontype)
     * @param taskDefinitionType A filter to list only the wireless gateway task definitions that
     * use this task definition type. 
     */
    public fun taskDefinitionType(taskDefinitionType: String)

    /**
     * Information about the gateways to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-update)
     * @param update Information about the gateways to update. 
     */
    public fun update(update: IResolvable)

    /**
     * Information about the gateways to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-update)
     * @param update Information about the gateways to update. 
     */
    public fun update(update: UpdateWirelessGatewayTaskCreateProperty)

    /**
     * Information about the gateways to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-update)
     * @param update Information about the gateways to update. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59d42d697f4c628bcaabb093931b235aaafcd93e189237d78bc134273c295dc2")
    public fun update(update: UpdateWirelessGatewayTaskCreateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.Builder =
        software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.Builder.create(scope, id)

    /**
     * Whether to automatically create tasks using this task definition for all gateways with the
     * specified current version.
     *
     * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-autocreatetasks)
     * @param autoCreateTasks Whether to automatically create tasks using this task definition for
     * all gateways with the specified current version. 
     */
    override fun autoCreateTasks(autoCreateTasks: Boolean) {
      cdkBuilder.autoCreateTasks(autoCreateTasks)
    }

    /**
     * Whether to automatically create tasks using this task definition for all gateways with the
     * specified current version.
     *
     * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-autocreatetasks)
     * @param autoCreateTasks Whether to automatically create tasks using this task definition for
     * all gateways with the specified current version. 
     */
    override fun autoCreateTasks(autoCreateTasks: IResolvable) {
      cdkBuilder.autoCreateTasks(autoCreateTasks.let(IResolvable::unwrap))
    }

    /**
     * LoRaWANUpdateGatewayTaskEntry object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry)
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object. 
     */
    override fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: IResolvable) {
      cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry.let(IResolvable::unwrap))
    }

    /**
     * LoRaWANUpdateGatewayTaskEntry object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry)
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object. 
     */
    override
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: LoRaWANUpdateGatewayTaskEntryProperty) {
      cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry.let(LoRaWANUpdateGatewayTaskEntryProperty::unwrap))
    }

    /**
     * LoRaWANUpdateGatewayTaskEntry object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry)
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4029b89ab3c57a112afb8f4a10f136caacb63e73b69ed8aec5cb67efdcf6f365")
    override
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: LoRaWANUpdateGatewayTaskEntryProperty.Builder.() -> Unit):
        Unit =
        loRaWanUpdateGatewayTaskEntry(LoRaWANUpdateGatewayTaskEntryProperty(loRaWanUpdateGatewayTaskEntry))

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-name)
     * @param name The name of the new resource. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A filter to list only the wireless gateway task definitions that use this task definition
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-taskdefinitiontype)
     * @param taskDefinitionType A filter to list only the wireless gateway task definitions that
     * use this task definition type. 
     */
    override fun taskDefinitionType(taskDefinitionType: String) {
      cdkBuilder.taskDefinitionType(taskDefinitionType)
    }

    /**
     * Information about the gateways to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-update)
     * @param update Information about the gateways to update. 
     */
    override fun update(update: IResolvable) {
      cdkBuilder.update(update.let(IResolvable::unwrap))
    }

    /**
     * Information about the gateways to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-update)
     * @param update Information about the gateways to update. 
     */
    override fun update(update: UpdateWirelessGatewayTaskCreateProperty) {
      cdkBuilder.update(update.let(UpdateWirelessGatewayTaskCreateProperty::unwrap))
    }

    /**
     * Information about the gateways to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-update)
     * @param update Information about the gateways to update. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59d42d697f4c628bcaabb093931b235aaafcd93e189237d78bc134273c295dc2")
    override fun update(update: UpdateWirelessGatewayTaskCreateProperty.Builder.() -> Unit): Unit =
        update(UpdateWirelessGatewayTaskCreateProperty(update))

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnTaskDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTaskDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTaskDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition):
        CfnTaskDefinition = CfnTaskDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnTaskDefinition):
        software.amazon.awscdk.services.iotwireless.CfnTaskDefinition = wrapped.cdkObject
  }

  /**
   * UpdateWirelessGatewayTaskCreate object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * UpdateWirelessGatewayTaskCreateProperty updateWirelessGatewayTaskCreateProperty =
   * UpdateWirelessGatewayTaskCreateProperty.builder()
   * .loRaWan(LoRaWANUpdateGatewayTaskCreateProperty.builder()
   * .currentVersion(LoRaWANGatewayVersionProperty.builder()
   * .model("model")
   * .packageVersion("packageVersion")
   * .station("station")
   * .build())
   * .sigKeyCrc(123)
   * .updateSignature("updateSignature")
   * .updateVersion(LoRaWANGatewayVersionProperty.builder()
   * .model("model")
   * .packageVersion("packageVersion")
   * .station("station")
   * .build())
   * .build())
   * .updateDataRole("updateDataRole")
   * .updateDataSource("updateDataSource")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate.html)
   */
  public interface UpdateWirelessGatewayTaskCreateProperty {
    /**
     * The properties that relate to the LoRaWAN wireless gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate.html#cfn-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate-lorawan)
     */
    public fun loRaWan(): Any? = unwrap(this).getLoRaWan()

    /**
     * The IAM role used to read data from the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate.html#cfn-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate-updatedatarole)
     */
    public fun updateDataRole(): String? = unwrap(this).getUpdateDataRole()

    /**
     * The link to the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate.html#cfn-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate-updatedatasource)
     */
    public fun updateDataSource(): String? = unwrap(this).getUpdateDataSource()

    /**
     * A builder for [UpdateWirelessGatewayTaskCreateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param loRaWan The properties that relate to the LoRaWAN wireless gateway.
       */
      public fun loRaWan(loRaWan: IResolvable)

      /**
       * @param loRaWan The properties that relate to the LoRaWAN wireless gateway.
       */
      public fun loRaWan(loRaWan: LoRaWANUpdateGatewayTaskCreateProperty)

      /**
       * @param loRaWan The properties that relate to the LoRaWAN wireless gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9e1b2e9bb716c698778bb5a59a337f75a51f4015d1aee0f4516f361f7795069")
      public fun loRaWan(loRaWan: LoRaWANUpdateGatewayTaskCreateProperty.Builder.() -> Unit)

      /**
       * @param updateDataRole The IAM role used to read data from the S3 bucket.
       */
      public fun updateDataRole(updateDataRole: String)

      /**
       * @param updateDataSource The link to the S3 bucket.
       */
      public fun updateDataSource(updateDataSource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.builder()

      /**
       * @param loRaWan The properties that relate to the LoRaWAN wireless gateway.
       */
      override fun loRaWan(loRaWan: IResolvable) {
        cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
      }

      /**
       * @param loRaWan The properties that relate to the LoRaWAN wireless gateway.
       */
      override fun loRaWan(loRaWan: LoRaWANUpdateGatewayTaskCreateProperty) {
        cdkBuilder.loRaWan(loRaWan.let(LoRaWANUpdateGatewayTaskCreateProperty::unwrap))
      }

      /**
       * @param loRaWan The properties that relate to the LoRaWAN wireless gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9e1b2e9bb716c698778bb5a59a337f75a51f4015d1aee0f4516f361f7795069")
      override fun loRaWan(loRaWan: LoRaWANUpdateGatewayTaskCreateProperty.Builder.() -> Unit): Unit
          = loRaWan(LoRaWANUpdateGatewayTaskCreateProperty(loRaWan))

      /**
       * @param updateDataRole The IAM role used to read data from the S3 bucket.
       */
      override fun updateDataRole(updateDataRole: String) {
        cdkBuilder.updateDataRole(updateDataRole)
      }

      /**
       * @param updateDataSource The link to the S3 bucket.
       */
      override fun updateDataSource(updateDataSource: String) {
        cdkBuilder.updateDataSource(updateDataSource)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty,
    ) : CdkObject(cdkObject), UpdateWirelessGatewayTaskCreateProperty {
      /**
       * The properties that relate to the LoRaWAN wireless gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate.html#cfn-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate-lorawan)
       */
      override fun loRaWan(): Any? = unwrap(this).getLoRaWan()

      /**
       * The IAM role used to read data from the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate.html#cfn-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate-updatedatarole)
       */
      override fun updateDataRole(): String? = unwrap(this).getUpdateDataRole()

      /**
       * The link to the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate.html#cfn-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate-updatedatasource)
       */
      override fun updateDataSource(): String? = unwrap(this).getUpdateDataSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          UpdateWirelessGatewayTaskCreateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty):
          UpdateWirelessGatewayTaskCreateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          UpdateWirelessGatewayTaskCreateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpdateWirelessGatewayTaskCreateProperty):
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty
    }
  }

  /**
   * The signature used to verify the update firmware.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * LoRaWANUpdateGatewayTaskCreateProperty loRaWANUpdateGatewayTaskCreateProperty =
   * LoRaWANUpdateGatewayTaskCreateProperty.builder()
   * .currentVersion(LoRaWANGatewayVersionProperty.builder()
   * .model("model")
   * .packageVersion("packageVersion")
   * .station("station")
   * .build())
   * .sigKeyCrc(123)
   * .updateSignature("updateSignature")
   * .updateVersion(LoRaWANGatewayVersionProperty.builder()
   * .model("model")
   * .packageVersion("packageVersion")
   * .station("station")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate.html)
   */
  public interface LoRaWANUpdateGatewayTaskCreateProperty {
    /**
     * The version of the gateways that should receive the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate-currentversion)
     */
    public fun currentVersion(): Any? = unwrap(this).getCurrentVersion()

    /**
     * The CRC of the signature private key to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate-sigkeycrc)
     */
    public fun sigKeyCrc(): Number? = unwrap(this).getSigKeyCrc()

    /**
     * The signature used to verify the update firmware.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate-updatesignature)
     */
    public fun updateSignature(): String? = unwrap(this).getUpdateSignature()

    /**
     * The firmware version to update the gateway to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate-updateversion)
     */
    public fun updateVersion(): Any? = unwrap(this).getUpdateVersion()

    /**
     * A builder for [LoRaWANUpdateGatewayTaskCreateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param currentVersion The version of the gateways that should receive the update.
       */
      public fun currentVersion(currentVersion: IResolvable)

      /**
       * @param currentVersion The version of the gateways that should receive the update.
       */
      public fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty)

      /**
       * @param currentVersion The version of the gateways that should receive the update.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83e3dbdb85fcfaaeccfd1a6ad8772385e5aa1b77e660d8770f4647676c1b51c0")
      public fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit)

      /**
       * @param sigKeyCrc The CRC of the signature private key to check.
       */
      public fun sigKeyCrc(sigKeyCrc: Number)

      /**
       * @param updateSignature The signature used to verify the update firmware.
       */
      public fun updateSignature(updateSignature: String)

      /**
       * @param updateVersion The firmware version to update the gateway to.
       */
      public fun updateVersion(updateVersion: IResolvable)

      /**
       * @param updateVersion The firmware version to update the gateway to.
       */
      public fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty)

      /**
       * @param updateVersion The firmware version to update the gateway to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52920c2c3e1f516601d9998280389f4e63f6cb3a334cdf420fd38489c65e9bbf")
      public fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty.builder()

      /**
       * @param currentVersion The version of the gateways that should receive the update.
       */
      override fun currentVersion(currentVersion: IResolvable) {
        cdkBuilder.currentVersion(currentVersion.let(IResolvable::unwrap))
      }

      /**
       * @param currentVersion The version of the gateways that should receive the update.
       */
      override fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty) {
        cdkBuilder.currentVersion(currentVersion.let(LoRaWANGatewayVersionProperty::unwrap))
      }

      /**
       * @param currentVersion The version of the gateways that should receive the update.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83e3dbdb85fcfaaeccfd1a6ad8772385e5aa1b77e660d8770f4647676c1b51c0")
      override fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit):
          Unit = currentVersion(LoRaWANGatewayVersionProperty(currentVersion))

      /**
       * @param sigKeyCrc The CRC of the signature private key to check.
       */
      override fun sigKeyCrc(sigKeyCrc: Number) {
        cdkBuilder.sigKeyCrc(sigKeyCrc)
      }

      /**
       * @param updateSignature The signature used to verify the update firmware.
       */
      override fun updateSignature(updateSignature: String) {
        cdkBuilder.updateSignature(updateSignature)
      }

      /**
       * @param updateVersion The firmware version to update the gateway to.
       */
      override fun updateVersion(updateVersion: IResolvable) {
        cdkBuilder.updateVersion(updateVersion.let(IResolvable::unwrap))
      }

      /**
       * @param updateVersion The firmware version to update the gateway to.
       */
      override fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty) {
        cdkBuilder.updateVersion(updateVersion.let(LoRaWANGatewayVersionProperty::unwrap))
      }

      /**
       * @param updateVersion The firmware version to update the gateway to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52920c2c3e1f516601d9998280389f4e63f6cb3a334cdf420fd38489c65e9bbf")
      override fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit):
          Unit = updateVersion(LoRaWANGatewayVersionProperty(updateVersion))

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty,
    ) : CdkObject(cdkObject), LoRaWANUpdateGatewayTaskCreateProperty {
      /**
       * The version of the gateways that should receive the update.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate-currentversion)
       */
      override fun currentVersion(): Any? = unwrap(this).getCurrentVersion()

      /**
       * The CRC of the signature private key to check.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate-sigkeycrc)
       */
      override fun sigKeyCrc(): Number? = unwrap(this).getSigKeyCrc()

      /**
       * The signature used to verify the update firmware.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate-updatesignature)
       */
      override fun updateSignature(): String? = unwrap(this).getUpdateSignature()

      /**
       * The firmware version to update the gateway to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate-updateversion)
       */
      override fun updateVersion(): Any? = unwrap(this).getUpdateVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LoRaWANUpdateGatewayTaskCreateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty):
          LoRaWANUpdateGatewayTaskCreateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoRaWANUpdateGatewayTaskCreateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANUpdateGatewayTaskCreateProperty):
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty
    }
  }

  /**
   * LoRaWANUpdateGatewayTaskEntry object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * LoRaWANUpdateGatewayTaskEntryProperty loRaWANUpdateGatewayTaskEntryProperty =
   * LoRaWANUpdateGatewayTaskEntryProperty.builder()
   * .currentVersion(LoRaWANGatewayVersionProperty.builder()
   * .model("model")
   * .packageVersion("packageVersion")
   * .station("station")
   * .build())
   * .updateVersion(LoRaWANGatewayVersionProperty.builder()
   * .model("model")
   * .packageVersion("packageVersion")
   * .station("station")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskentry.html)
   */
  public interface LoRaWANUpdateGatewayTaskEntryProperty {
    /**
     * The version of the gateways that should receive the update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskentry.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry-currentversion)
     */
    public fun currentVersion(): Any? = unwrap(this).getCurrentVersion()

    /**
     * The firmware version to update the gateway to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskentry.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry-updateversion)
     */
    public fun updateVersion(): Any? = unwrap(this).getUpdateVersion()

    /**
     * A builder for [LoRaWANUpdateGatewayTaskEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param currentVersion The version of the gateways that should receive the update.
       */
      public fun currentVersion(currentVersion: IResolvable)

      /**
       * @param currentVersion The version of the gateways that should receive the update.
       */
      public fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty)

      /**
       * @param currentVersion The version of the gateways that should receive the update.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b83f1b58b8ad73fb0907fded0e7c11ce88aca0abf09a4ae8750fcde7ed6bafe")
      public fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit)

      /**
       * @param updateVersion The firmware version to update the gateway to.
       */
      public fun updateVersion(updateVersion: IResolvable)

      /**
       * @param updateVersion The firmware version to update the gateway to.
       */
      public fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty)

      /**
       * @param updateVersion The firmware version to update the gateway to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a68afc149d3991232ab5c4e32d6fc7ce61c665336a8035635bb16402202f1124")
      public fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty.builder()

      /**
       * @param currentVersion The version of the gateways that should receive the update.
       */
      override fun currentVersion(currentVersion: IResolvable) {
        cdkBuilder.currentVersion(currentVersion.let(IResolvable::unwrap))
      }

      /**
       * @param currentVersion The version of the gateways that should receive the update.
       */
      override fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty) {
        cdkBuilder.currentVersion(currentVersion.let(LoRaWANGatewayVersionProperty::unwrap))
      }

      /**
       * @param currentVersion The version of the gateways that should receive the update.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b83f1b58b8ad73fb0907fded0e7c11ce88aca0abf09a4ae8750fcde7ed6bafe")
      override fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit):
          Unit = currentVersion(LoRaWANGatewayVersionProperty(currentVersion))

      /**
       * @param updateVersion The firmware version to update the gateway to.
       */
      override fun updateVersion(updateVersion: IResolvable) {
        cdkBuilder.updateVersion(updateVersion.let(IResolvable::unwrap))
      }

      /**
       * @param updateVersion The firmware version to update the gateway to.
       */
      override fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty) {
        cdkBuilder.updateVersion(updateVersion.let(LoRaWANGatewayVersionProperty::unwrap))
      }

      /**
       * @param updateVersion The firmware version to update the gateway to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a68afc149d3991232ab5c4e32d6fc7ce61c665336a8035635bb16402202f1124")
      override fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit):
          Unit = updateVersion(LoRaWANGatewayVersionProperty(updateVersion))

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty,
    ) : CdkObject(cdkObject), LoRaWANUpdateGatewayTaskEntryProperty {
      /**
       * The version of the gateways that should receive the update.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskentry.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry-currentversion)
       */
      override fun currentVersion(): Any? = unwrap(this).getCurrentVersion()

      /**
       * The firmware version to update the gateway to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskentry.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry-updateversion)
       */
      override fun updateVersion(): Any? = unwrap(this).getUpdateVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LoRaWANUpdateGatewayTaskEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty):
          LoRaWANUpdateGatewayTaskEntryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoRaWANUpdateGatewayTaskEntryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANUpdateGatewayTaskEntryProperty):
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty
    }
  }

  /**
   * LoRaWANGatewayVersion object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * LoRaWANGatewayVersionProperty loRaWANGatewayVersionProperty =
   * LoRaWANGatewayVersionProperty.builder()
   * .model("model")
   * .packageVersion("packageVersion")
   * .station("station")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawangatewayversion.html)
   */
  public interface LoRaWANGatewayVersionProperty {
    /**
     * The model number of the wireless gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawangatewayversion.html#cfn-iotwireless-taskdefinition-lorawangatewayversion-model)
     */
    public fun model(): String? = unwrap(this).getModel()

    /**
     * The version of the wireless gateway firmware.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawangatewayversion.html#cfn-iotwireless-taskdefinition-lorawangatewayversion-packageversion)
     */
    public fun packageVersion(): String? = unwrap(this).getPackageVersion()

    /**
     * The basic station version of the wireless gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawangatewayversion.html#cfn-iotwireless-taskdefinition-lorawangatewayversion-station)
     */
    public fun station(): String? = unwrap(this).getStation()

    /**
     * A builder for [LoRaWANGatewayVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param model The model number of the wireless gateway.
       */
      public fun model(model: String)

      /**
       * @param packageVersion The version of the wireless gateway firmware.
       */
      public fun packageVersion(packageVersion: String)

      /**
       * @param station The basic station version of the wireless gateway.
       */
      public fun station(station: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty.builder()

      /**
       * @param model The model number of the wireless gateway.
       */
      override fun model(model: String) {
        cdkBuilder.model(model)
      }

      /**
       * @param packageVersion The version of the wireless gateway firmware.
       */
      override fun packageVersion(packageVersion: String) {
        cdkBuilder.packageVersion(packageVersion)
      }

      /**
       * @param station The basic station version of the wireless gateway.
       */
      override fun station(station: String) {
        cdkBuilder.station(station)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty,
    ) : CdkObject(cdkObject), LoRaWANGatewayVersionProperty {
      /**
       * The model number of the wireless gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawangatewayversion.html#cfn-iotwireless-taskdefinition-lorawangatewayversion-model)
       */
      override fun model(): String? = unwrap(this).getModel()

      /**
       * The version of the wireless gateway firmware.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawangatewayversion.html#cfn-iotwireless-taskdefinition-lorawangatewayversion-packageversion)
       */
      override fun packageVersion(): String? = unwrap(this).getPackageVersion()

      /**
       * The basic station version of the wireless gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawangatewayversion.html#cfn-iotwireless-taskdefinition-lorawangatewayversion-station)
       */
      override fun station(): String? = unwrap(this).getStation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANGatewayVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty):
          LoRaWANGatewayVersionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoRaWANGatewayVersionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANGatewayVersionProperty):
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty
    }
  }
}
