@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a vehicle, which is an instance of a vehicle model (model manifest).
 *
 * Vehicles created from the same vehicle model consist of the same signals inherited from the
 * vehicle model.
 *
 *
 * If you have an existing AWS IoT thing, you can use AWS IoT FleetWise to create a vehicle and
 * collect data from your thing.
 *
 *
 * For more information, see
 * [Vehicles](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/vehicles.html) in the
 * *AWS IoT FleetWise Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
 * Object onChange;
 * CfnVehicle cfnVehicle = CfnVehicle.Builder.create(this, "MyCfnVehicle")
 * .decoderManifestArn("decoderManifestArn")
 * .modelManifestArn("modelManifestArn")
 * .name("name")
 * // the properties below are optional
 * .associationBehavior("associationBehavior")
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .stateTemplates(List.of(StateTemplateAssociationProperty.builder()
 * .identifier("identifier")
 * .stateTemplateUpdateStrategy(StateTemplateUpdateStrategyProperty.builder()
 * .onChange(onChange)
 * .periodic(PeriodicStateTemplateUpdateStrategyProperty.builder()
 * .stateTemplateUpdateRate(TimePeriodProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .build())
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html)
 */
public open class CfnVehicle(
  cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicle,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVehicleProps,
  ) :
      this(software.amazon.awscdk.services.iotfleetwise.CfnVehicle(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVehicleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVehicleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVehicleProps(props)
  )

  /**
   * An option to create a new AWS IoT thing when creating a vehicle, or to validate an existing
   * thing as a vehicle.
   */
  public open fun associationBehavior(): String? = unwrap(this).getAssociationBehavior()

  /**
   * An option to create a new AWS IoT thing when creating a vehicle, or to validate an existing
   * thing as a vehicle.
   */
  public open fun associationBehavior(`value`: String) {
    unwrap(this).setAssociationBehavior(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the vehicle.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time the vehicle was created in seconds since epoch (January 1, 1970 at midnight UTC time).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The time the vehicle was last updated in seconds since epoch (January 1, 1970 at midnight UTC
   * time).
   */
  public open fun attrLastModificationTime(): String = unwrap(this).getAttrLastModificationTime()

  /**
   * Static information about a vehicle in a key-value pair.
   */
  public open fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * Static information about a vehicle in a key-value pair.
   */
  public open fun attributes(`value`: Map<String, String>) {
    unwrap(this).setAttributes(`value`)
  }

  /**
   * Static information about a vehicle in a key-value pair.
   */
  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of a decoder manifest associated with the vehicle to create.
   */
  public open fun decoderManifestArn(): String = unwrap(this).getDecoderManifestArn()

  /**
   * The Amazon Resource Name (ARN) of a decoder manifest associated with the vehicle to create.
   */
  public open fun decoderManifestArn(`value`: String) {
    unwrap(this).setDecoderManifestArn(`value`)
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
   * The Amazon Resource Name (ARN) of the vehicle model (model manifest) to create the vehicle
   * from.
   */
  public open fun modelManifestArn(): String = unwrap(this).getModelManifestArn()

  /**
   * The Amazon Resource Name (ARN) of the vehicle model (model manifest) to create the vehicle
   * from.
   */
  public open fun modelManifestArn(`value`: String) {
    unwrap(this).setModelManifestArn(`value`)
  }

  /**
   * The unique ID of the vehicle.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The unique ID of the vehicle.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Associate state templates to track the state of the vehicle.
   */
  public open fun stateTemplates(): Any? = unwrap(this).getStateTemplates()

  /**
   * Associate state templates to track the state of the vehicle.
   */
  public open fun stateTemplates(`value`: IResolvable) {
    unwrap(this).setStateTemplates(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Associate state templates to track the state of the vehicle.
   */
  public open fun stateTemplates(`value`: List<Any>) {
    unwrap(this).setStateTemplates(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Associate state templates to track the state of the vehicle.
   */
  public open fun stateTemplates(vararg `value`: Any): Unit = stateTemplates(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata which can be used to manage the vehicle.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata which can be used to manage the vehicle.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata which can be used to manage the vehicle.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotfleetwise.CfnVehicle].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An option to create a new AWS IoT thing when creating a vehicle, or to validate an existing
     * thing as a vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-associationbehavior)
     * @param associationBehavior An option to create a new AWS IoT thing when creating a vehicle,
     * or to validate an existing thing as a vehicle. 
     */
    public fun associationBehavior(associationBehavior: String)

    /**
     * Static information about a vehicle in a key-value pair.
     *
     * For example: `"engine Type"` : `"v6"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-attributes)
     * @param attributes Static information about a vehicle in a key-value pair. 
     */
    public fun attributes(attributes: Map<String, String>)

    /**
     * Static information about a vehicle in a key-value pair.
     *
     * For example: `"engine Type"` : `"v6"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-attributes)
     * @param attributes Static information about a vehicle in a key-value pair. 
     */
    public fun attributes(attributes: IResolvable)

    /**
     * The Amazon Resource Name (ARN) of a decoder manifest associated with the vehicle to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-decodermanifestarn)
     * @param decoderManifestArn The Amazon Resource Name (ARN) of a decoder manifest associated
     * with the vehicle to create. 
     */
    public fun decoderManifestArn(decoderManifestArn: String)

    /**
     * The Amazon Resource Name (ARN) of the vehicle model (model manifest) to create the vehicle
     * from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-modelmanifestarn)
     * @param modelManifestArn The Amazon Resource Name (ARN) of the vehicle model (model manifest)
     * to create the vehicle from. 
     */
    public fun modelManifestArn(modelManifestArn: String)

    /**
     * The unique ID of the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-name)
     * @param name The unique ID of the vehicle. 
     */
    public fun name(name: String)

    /**
     * Associate state templates to track the state of the vehicle.
     *
     * State templates determine which signal updates the vehicle sends to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-statetemplates)
     * @param stateTemplates Associate state templates to track the state of the vehicle. 
     */
    public fun stateTemplates(stateTemplates: IResolvable)

    /**
     * Associate state templates to track the state of the vehicle.
     *
     * State templates determine which signal updates the vehicle sends to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-statetemplates)
     * @param stateTemplates Associate state templates to track the state of the vehicle. 
     */
    public fun stateTemplates(stateTemplates: List<Any>)

    /**
     * Associate state templates to track the state of the vehicle.
     *
     * State templates determine which signal updates the vehicle sends to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-statetemplates)
     * @param stateTemplates Associate state templates to track the state of the vehicle. 
     */
    public fun stateTemplates(vararg stateTemplates: Any)

    /**
     * Metadata which can be used to manage the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-tags)
     * @param tags Metadata which can be used to manage the vehicle. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata which can be used to manage the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-tags)
     * @param tags Metadata which can be used to manage the vehicle. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnVehicle.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnVehicle.Builder.create(scope, id)

    /**
     * An option to create a new AWS IoT thing when creating a vehicle, or to validate an existing
     * thing as a vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-associationbehavior)
     * @param associationBehavior An option to create a new AWS IoT thing when creating a vehicle,
     * or to validate an existing thing as a vehicle. 
     */
    override fun associationBehavior(associationBehavior: String) {
      cdkBuilder.associationBehavior(associationBehavior)
    }

    /**
     * Static information about a vehicle in a key-value pair.
     *
     * For example: `"engine Type"` : `"v6"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-attributes)
     * @param attributes Static information about a vehicle in a key-value pair. 
     */
    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * Static information about a vehicle in a key-value pair.
     *
     * For example: `"engine Type"` : `"v6"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-attributes)
     * @param attributes Static information about a vehicle in a key-value pair. 
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) of a decoder manifest associated with the vehicle to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-decodermanifestarn)
     * @param decoderManifestArn The Amazon Resource Name (ARN) of a decoder manifest associated
     * with the vehicle to create. 
     */
    override fun decoderManifestArn(decoderManifestArn: String) {
      cdkBuilder.decoderManifestArn(decoderManifestArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the vehicle model (model manifest) to create the vehicle
     * from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-modelmanifestarn)
     * @param modelManifestArn The Amazon Resource Name (ARN) of the vehicle model (model manifest)
     * to create the vehicle from. 
     */
    override fun modelManifestArn(modelManifestArn: String) {
      cdkBuilder.modelManifestArn(modelManifestArn)
    }

    /**
     * The unique ID of the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-name)
     * @param name The unique ID of the vehicle. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Associate state templates to track the state of the vehicle.
     *
     * State templates determine which signal updates the vehicle sends to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-statetemplates)
     * @param stateTemplates Associate state templates to track the state of the vehicle. 
     */
    override fun stateTemplates(stateTemplates: IResolvable) {
      cdkBuilder.stateTemplates(stateTemplates.let(IResolvable.Companion::unwrap))
    }

    /**
     * Associate state templates to track the state of the vehicle.
     *
     * State templates determine which signal updates the vehicle sends to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-statetemplates)
     * @param stateTemplates Associate state templates to track the state of the vehicle. 
     */
    override fun stateTemplates(stateTemplates: List<Any>) {
      cdkBuilder.stateTemplates(stateTemplates.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Associate state templates to track the state of the vehicle.
     *
     * State templates determine which signal updates the vehicle sends to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-statetemplates)
     * @param stateTemplates Associate state templates to track the state of the vehicle. 
     */
    override fun stateTemplates(vararg stateTemplates: Any): Unit =
        stateTemplates(stateTemplates.toList())

    /**
     * Metadata which can be used to manage the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-tags)
     * @param tags Metadata which can be used to manage the vehicle. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata which can be used to manage the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-tags)
     * @param tags Metadata which can be used to manage the vehicle. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnVehicle = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotfleetwise.CfnVehicle.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVehicle {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVehicle(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicle):
        CfnVehicle = CfnVehicle(cdkObject)

    internal fun unwrap(wrapped: CfnVehicle):
        software.amazon.awscdk.services.iotfleetwise.CfnVehicle = wrapped.cdkObject as
        software.amazon.awscdk.services.iotfleetwise.CfnVehicle
  }

  /**
   * Vehicles associated with the state template will stream telemetry data during a specified time
   * period.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * PeriodicStateTemplateUpdateStrategyProperty periodicStateTemplateUpdateStrategyProperty =
   * PeriodicStateTemplateUpdateStrategyProperty.builder()
   * .stateTemplateUpdateRate(TimePeriodProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-periodicstatetemplateupdatestrategy.html)
   */
  public interface PeriodicStateTemplateUpdateStrategyProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-periodicstatetemplateupdatestrategy.html#cfn-iotfleetwise-vehicle-periodicstatetemplateupdatestrategy-statetemplateupdaterate)
     */
    public fun stateTemplateUpdateRate(): Any

    /**
     * A builder for [PeriodicStateTemplateUpdateStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param stateTemplateUpdateRate the value to be set. 
       */
      public fun stateTemplateUpdateRate(stateTemplateUpdateRate: IResolvable)

      /**
       * @param stateTemplateUpdateRate the value to be set. 
       */
      public fun stateTemplateUpdateRate(stateTemplateUpdateRate: TimePeriodProperty)

      /**
       * @param stateTemplateUpdateRate the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65ab43a3a32d5397730e5bb8571c6160269a61ce3d252c257ad41f3c13640a0f")
      public
          fun stateTemplateUpdateRate(stateTemplateUpdateRate: TimePeriodProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.PeriodicStateTemplateUpdateStrategyProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.PeriodicStateTemplateUpdateStrategyProperty.builder()

      /**
       * @param stateTemplateUpdateRate the value to be set. 
       */
      override fun stateTemplateUpdateRate(stateTemplateUpdateRate: IResolvable) {
        cdkBuilder.stateTemplateUpdateRate(stateTemplateUpdateRate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stateTemplateUpdateRate the value to be set. 
       */
      override fun stateTemplateUpdateRate(stateTemplateUpdateRate: TimePeriodProperty) {
        cdkBuilder.stateTemplateUpdateRate(stateTemplateUpdateRate.let(TimePeriodProperty.Companion::unwrap))
      }

      /**
       * @param stateTemplateUpdateRate the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65ab43a3a32d5397730e5bb8571c6160269a61ce3d252c257ad41f3c13640a0f")
      override
          fun stateTemplateUpdateRate(stateTemplateUpdateRate: TimePeriodProperty.Builder.() -> Unit):
          Unit = stateTemplateUpdateRate(TimePeriodProperty(stateTemplateUpdateRate))

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.PeriodicStateTemplateUpdateStrategyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicle.PeriodicStateTemplateUpdateStrategyProperty,
    ) : CdkObject(cdkObject),
        PeriodicStateTemplateUpdateStrategyProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-periodicstatetemplateupdatestrategy.html#cfn-iotfleetwise-vehicle-periodicstatetemplateupdatestrategy-statetemplateupdaterate)
       */
      override fun stateTemplateUpdateRate(): Any = unwrap(this).getStateTemplateUpdateRate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PeriodicStateTemplateUpdateStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicle.PeriodicStateTemplateUpdateStrategyProperty):
          PeriodicStateTemplateUpdateStrategyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PeriodicStateTemplateUpdateStrategyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PeriodicStateTemplateUpdateStrategyProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.PeriodicStateTemplateUpdateStrategyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.PeriodicStateTemplateUpdateStrategyProperty
    }
  }

  /**
   * The state template associated with a vehicle.
   *
   * State templates contain state properties, which are signals that belong to a signal catalog
   * that is synchronized between the AWS IoT FleetWise Edge and the AWS Cloud .
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
   * Object onChange;
   * StateTemplateAssociationProperty stateTemplateAssociationProperty =
   * StateTemplateAssociationProperty.builder()
   * .identifier("identifier")
   * .stateTemplateUpdateStrategy(StateTemplateUpdateStrategyProperty.builder()
   * .onChange(onChange)
   * .periodic(PeriodicStateTemplateUpdateStrategyProperty.builder()
   * .stateTemplateUpdateRate(TimePeriodProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-statetemplateassociation.html)
   */
  public interface StateTemplateAssociationProperty {
    /**
     * The unique ID of the state template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-statetemplateassociation.html#cfn-iotfleetwise-vehicle-statetemplateassociation-identifier)
     */
    public fun identifier(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-statetemplateassociation.html#cfn-iotfleetwise-vehicle-statetemplateassociation-statetemplateupdatestrategy)
     */
    public fun stateTemplateUpdateStrategy(): Any

    /**
     * A builder for [StateTemplateAssociationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param identifier The unique ID of the state template. 
       */
      public fun identifier(identifier: String)

      /**
       * @param stateTemplateUpdateStrategy the value to be set. 
       */
      public fun stateTemplateUpdateStrategy(stateTemplateUpdateStrategy: IResolvable)

      /**
       * @param stateTemplateUpdateStrategy the value to be set. 
       */
      public
          fun stateTemplateUpdateStrategy(stateTemplateUpdateStrategy: StateTemplateUpdateStrategyProperty)

      /**
       * @param stateTemplateUpdateStrategy the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4e41852182f86740408b78778c3e9b46586218c48ae7f2ac238a7cadcf88dc8")
      public
          fun stateTemplateUpdateStrategy(stateTemplateUpdateStrategy: StateTemplateUpdateStrategyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateAssociationProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateAssociationProperty.builder()

      /**
       * @param identifier The unique ID of the state template. 
       */
      override fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
      }

      /**
       * @param stateTemplateUpdateStrategy the value to be set. 
       */
      override fun stateTemplateUpdateStrategy(stateTemplateUpdateStrategy: IResolvable) {
        cdkBuilder.stateTemplateUpdateStrategy(stateTemplateUpdateStrategy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stateTemplateUpdateStrategy the value to be set. 
       */
      override
          fun stateTemplateUpdateStrategy(stateTemplateUpdateStrategy: StateTemplateUpdateStrategyProperty) {
        cdkBuilder.stateTemplateUpdateStrategy(stateTemplateUpdateStrategy.let(StateTemplateUpdateStrategyProperty.Companion::unwrap))
      }

      /**
       * @param stateTemplateUpdateStrategy the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4e41852182f86740408b78778c3e9b46586218c48ae7f2ac238a7cadcf88dc8")
      override
          fun stateTemplateUpdateStrategy(stateTemplateUpdateStrategy: StateTemplateUpdateStrategyProperty.Builder.() -> Unit):
          Unit =
          stateTemplateUpdateStrategy(StateTemplateUpdateStrategyProperty(stateTemplateUpdateStrategy))

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateAssociationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateAssociationProperty,
    ) : CdkObject(cdkObject),
        StateTemplateAssociationProperty {
      /**
       * The unique ID of the state template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-statetemplateassociation.html#cfn-iotfleetwise-vehicle-statetemplateassociation-identifier)
       */
      override fun identifier(): String = unwrap(this).getIdentifier()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-statetemplateassociation.html#cfn-iotfleetwise-vehicle-statetemplateassociation-statetemplateupdatestrategy)
       */
      override fun stateTemplateUpdateStrategy(): Any =
          unwrap(this).getStateTemplateUpdateStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StateTemplateAssociationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateAssociationProperty):
          StateTemplateAssociationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StateTemplateAssociationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StateTemplateAssociationProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateAssociationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateAssociationProperty
    }
  }

  /**
   * The update strategy for the state template.
   *
   * Vehicles associated with the state template can stream telemetry data with either an `onChange`
   * or `periodic` update strategy.
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
   * Object onChange;
   * StateTemplateUpdateStrategyProperty stateTemplateUpdateStrategyProperty =
   * StateTemplateUpdateStrategyProperty.builder()
   * .onChange(onChange)
   * .periodic(PeriodicStateTemplateUpdateStrategyProperty.builder()
   * .stateTemplateUpdateRate(TimePeriodProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-statetemplateupdatestrategy.html)
   */
  public interface StateTemplateUpdateStrategyProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-statetemplateupdatestrategy.html#cfn-iotfleetwise-vehicle-statetemplateupdatestrategy-onchange)
     */
    public fun onChange(): Any? = unwrap(this).getOnChange()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-statetemplateupdatestrategy.html#cfn-iotfleetwise-vehicle-statetemplateupdatestrategy-periodic)
     */
    public fun periodic(): Any? = unwrap(this).getPeriodic()

    /**
     * A builder for [StateTemplateUpdateStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onChange the value to be set.
       */
      public fun onChange(onChange: Any)

      /**
       * @param periodic the value to be set.
       */
      public fun periodic(periodic: IResolvable)

      /**
       * @param periodic the value to be set.
       */
      public fun periodic(periodic: PeriodicStateTemplateUpdateStrategyProperty)

      /**
       * @param periodic the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37faac9d5d33cfd7479b40f87a62713863a1e6d6331e5980fe4062625501ab75")
      public fun periodic(periodic: PeriodicStateTemplateUpdateStrategyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateUpdateStrategyProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateUpdateStrategyProperty.builder()

      /**
       * @param onChange the value to be set.
       */
      override fun onChange(onChange: Any) {
        cdkBuilder.onChange(onChange)
      }

      /**
       * @param periodic the value to be set.
       */
      override fun periodic(periodic: IResolvable) {
        cdkBuilder.periodic(periodic.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param periodic the value to be set.
       */
      override fun periodic(periodic: PeriodicStateTemplateUpdateStrategyProperty) {
        cdkBuilder.periodic(periodic.let(PeriodicStateTemplateUpdateStrategyProperty.Companion::unwrap))
      }

      /**
       * @param periodic the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37faac9d5d33cfd7479b40f87a62713863a1e6d6331e5980fe4062625501ab75")
      override
          fun periodic(periodic: PeriodicStateTemplateUpdateStrategyProperty.Builder.() -> Unit):
          Unit = periodic(PeriodicStateTemplateUpdateStrategyProperty(periodic))

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateUpdateStrategyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateUpdateStrategyProperty,
    ) : CdkObject(cdkObject),
        StateTemplateUpdateStrategyProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-statetemplateupdatestrategy.html#cfn-iotfleetwise-vehicle-statetemplateupdatestrategy-onchange)
       */
      override fun onChange(): Any? = unwrap(this).getOnChange()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-statetemplateupdatestrategy.html#cfn-iotfleetwise-vehicle-statetemplateupdatestrategy-periodic)
       */
      override fun periodic(): Any? = unwrap(this).getPeriodic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StateTemplateUpdateStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateUpdateStrategyProperty):
          StateTemplateUpdateStrategyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StateTemplateUpdateStrategyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StateTemplateUpdateStrategyProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateUpdateStrategyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.StateTemplateUpdateStrategyProperty
    }
  }

  /**
   * The length of time between state template updates.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * TimePeriodProperty timePeriodProperty = TimePeriodProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-timeperiod.html)
   */
  public interface TimePeriodProperty {
    /**
     * A unit of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-timeperiod.html#cfn-iotfleetwise-vehicle-timeperiod-unit)
     */
    public fun unit(): String

    /**
     * A number of time units.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-timeperiod.html#cfn-iotfleetwise-vehicle-timeperiod-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [TimePeriodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit A unit of time. 
       */
      public fun unit(unit: String)

      /**
       * @param value A number of time units. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.TimePeriodProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.TimePeriodProperty.builder()

      /**
       * @param unit A unit of time. 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value A number of time units. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnVehicle.TimePeriodProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicle.TimePeriodProperty,
    ) : CdkObject(cdkObject),
        TimePeriodProperty {
      /**
       * A unit of time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-timeperiod.html#cfn-iotfleetwise-vehicle-timeperiod-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()

      /**
       * A number of time units.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-vehicle-timeperiod.html#cfn-iotfleetwise-vehicle-timeperiod-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimePeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicle.TimePeriodProperty):
          TimePeriodProperty = CdkObjectWrappers.wrap(cdkObject) as? TimePeriodProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimePeriodProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.TimePeriodProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnVehicle.TimePeriodProperty
    }
  }
}
