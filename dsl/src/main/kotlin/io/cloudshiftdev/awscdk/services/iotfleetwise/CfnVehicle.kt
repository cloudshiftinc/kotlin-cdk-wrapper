package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVehicle internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicle,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * (Optional) An option to create a new AWS IoT thing when creating a vehicle, or to validate an
   * existing thing as a vehicle.
   */
  public open fun associationBehavior(): String? = unwrap(this).getAssociationBehavior()

  /**
   * (Optional) An option to create a new AWS IoT thing when creating a vehicle, or to validate an
   * existing thing as a vehicle.
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
   * (Optional) Static information about a vehicle in a key-value pair.
   */
  public open fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * (Optional) Static information about a vehicle in a key-value pair.
   */
  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable::unwrap))
  }

  /**
   * (Optional) Static information about a vehicle in a key-value pair.
   */
  public open fun attributes(`value`: Map<String, String>) {
    unwrap(this).setAttributes(`value`)
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * (Optional) Metadata which can be used to manage the vehicle.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * (Optional) Metadata which can be used to manage the vehicle.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * (Optional) Metadata which can be used to manage the vehicle.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotfleetwise.CfnVehicle].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * (Optional) An option to create a new AWS IoT thing when creating a vehicle, or to validate an
     * existing thing as a vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-associationbehavior)
     * @param associationBehavior (Optional) An option to create a new AWS IoT thing when creating a
     * vehicle, or to validate an existing thing as a vehicle. 
     */
    public fun associationBehavior(associationBehavior: String)

    /**
     * (Optional) Static information about a vehicle in a key-value pair.
     *
     * For example: `"engine Type"` : `"v6"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-attributes)
     * @param attributes (Optional) Static information about a vehicle in a key-value pair. 
     */
    public fun attributes(attributes: IResolvable)

    /**
     * (Optional) Static information about a vehicle in a key-value pair.
     *
     * For example: `"engine Type"` : `"v6"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-attributes)
     * @param attributes (Optional) Static information about a vehicle in a key-value pair. 
     */
    public fun attributes(attributes: Map<String, String>)

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
     * (Optional) Metadata which can be used to manage the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-tags)
     * @param tags (Optional) Metadata which can be used to manage the vehicle. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * (Optional) Metadata which can be used to manage the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-tags)
     * @param tags (Optional) Metadata which can be used to manage the vehicle. 
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
     * (Optional) An option to create a new AWS IoT thing when creating a vehicle, or to validate an
     * existing thing as a vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-associationbehavior)
     * @param associationBehavior (Optional) An option to create a new AWS IoT thing when creating a
     * vehicle, or to validate an existing thing as a vehicle. 
     */
    override fun associationBehavior(associationBehavior: String) {
      cdkBuilder.associationBehavior(associationBehavior)
    }

    /**
     * (Optional) Static information about a vehicle in a key-value pair.
     *
     * For example: `"engine Type"` : `"v6"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-attributes)
     * @param attributes (Optional) Static information about a vehicle in a key-value pair. 
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    /**
     * (Optional) Static information about a vehicle in a key-value pair.
     *
     * For example: `"engine Type"` : `"v6"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-attributes)
     * @param attributes (Optional) Static information about a vehicle in a key-value pair. 
     */
    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
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
     * (Optional) Metadata which can be used to manage the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-tags)
     * @param tags (Optional) Metadata which can be used to manage the vehicle. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * (Optional) Metadata which can be used to manage the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-tags)
     * @param tags (Optional) Metadata which can be used to manage the vehicle. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnVehicle = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        software.amazon.awscdk.services.iotfleetwise.CfnVehicle = wrapped.cdkObject
  }
}
