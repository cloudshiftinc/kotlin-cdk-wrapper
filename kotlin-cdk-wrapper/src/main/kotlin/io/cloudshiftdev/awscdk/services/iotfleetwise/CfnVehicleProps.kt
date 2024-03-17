@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnVehicle`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
 * CfnVehicleProps cfnVehicleProps = CfnVehicleProps.builder()
 * .decoderManifestArn("decoderManifestArn")
 * .modelManifestArn("modelManifestArn")
 * .name("name")
 * // the properties below are optional
 * .associationBehavior("associationBehavior")
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html)
 */
public interface CfnVehicleProps {
  /**
   * (Optional) An option to create a new AWS IoT thing when creating a vehicle, or to validate an
   * existing thing as a vehicle.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-associationbehavior)
   */
  public fun associationBehavior(): String? = unwrap(this).getAssociationBehavior()

  /**
   * (Optional) Static information about a vehicle in a key-value pair.
   *
   * For example: `"engine Type"` : `"v6"`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-attributes)
   */
  public fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * The Amazon Resource Name (ARN) of a decoder manifest associated with the vehicle to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-decodermanifestarn)
   */
  public fun decoderManifestArn(): String

  /**
   * The Amazon Resource Name (ARN) of the vehicle model (model manifest) to create the vehicle
   * from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-modelmanifestarn)
   */
  public fun modelManifestArn(): String

  /**
   * The unique ID of the vehicle.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-name)
   */
  public fun name(): String

  /**
   * (Optional) Metadata which can be used to manage the vehicle.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnVehicleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param associationBehavior (Optional) An option to create a new AWS IoT thing when creating a
     * vehicle, or to validate an existing thing as a vehicle.
     */
    public fun associationBehavior(associationBehavior: String)

    /**
     * @param attributes (Optional) Static information about a vehicle in a key-value pair.
     * For example: `"engine Type"` : `"v6"`
     */
    public fun attributes(attributes: IResolvable)

    /**
     * @param attributes (Optional) Static information about a vehicle in a key-value pair.
     * For example: `"engine Type"` : `"v6"`
     */
    public fun attributes(attributes: Map<String, String>)

    /**
     * @param decoderManifestArn The Amazon Resource Name (ARN) of a decoder manifest associated
     * with the vehicle to create. 
     */
    public fun decoderManifestArn(decoderManifestArn: String)

    /**
     * @param modelManifestArn The Amazon Resource Name (ARN) of the vehicle model (model manifest)
     * to create the vehicle from. 
     */
    public fun modelManifestArn(modelManifestArn: String)

    /**
     * @param name The unique ID of the vehicle. 
     */
    public fun name(name: String)

    /**
     * @param tags (Optional) Metadata which can be used to manage the vehicle.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags (Optional) Metadata which can be used to manage the vehicle.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps.builder()

    /**
     * @param associationBehavior (Optional) An option to create a new AWS IoT thing when creating a
     * vehicle, or to validate an existing thing as a vehicle.
     */
    override fun associationBehavior(associationBehavior: String) {
      cdkBuilder.associationBehavior(associationBehavior)
    }

    /**
     * @param attributes (Optional) Static information about a vehicle in a key-value pair.
     * For example: `"engine Type"` : `"v6"`
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    /**
     * @param attributes (Optional) Static information about a vehicle in a key-value pair.
     * For example: `"engine Type"` : `"v6"`
     */
    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * @param decoderManifestArn The Amazon Resource Name (ARN) of a decoder manifest associated
     * with the vehicle to create. 
     */
    override fun decoderManifestArn(decoderManifestArn: String) {
      cdkBuilder.decoderManifestArn(decoderManifestArn)
    }

    /**
     * @param modelManifestArn The Amazon Resource Name (ARN) of the vehicle model (model manifest)
     * to create the vehicle from. 
     */
    override fun modelManifestArn(modelManifestArn: String) {
      cdkBuilder.modelManifestArn(modelManifestArn)
    }

    /**
     * @param name The unique ID of the vehicle. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags (Optional) Metadata which can be used to manage the vehicle.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags (Optional) Metadata which can be used to manage the vehicle.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps,
  ) : CdkObject(cdkObject), CfnVehicleProps {
    /**
     * (Optional) An option to create a new AWS IoT thing when creating a vehicle, or to validate an
     * existing thing as a vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-associationbehavior)
     */
    override fun associationBehavior(): String? = unwrap(this).getAssociationBehavior()

    /**
     * (Optional) Static information about a vehicle in a key-value pair.
     *
     * For example: `"engine Type"` : `"v6"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-attributes)
     */
    override fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * The Amazon Resource Name (ARN) of a decoder manifest associated with the vehicle to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-decodermanifestarn)
     */
    override fun decoderManifestArn(): String = unwrap(this).getDecoderManifestArn()

    /**
     * The Amazon Resource Name (ARN) of the vehicle model (model manifest) to create the vehicle
     * from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-modelmanifestarn)
     */
    override fun modelManifestArn(): String = unwrap(this).getModelManifestArn()

    /**
     * The unique ID of the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * (Optional) Metadata which can be used to manage the vehicle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVehicleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps):
        CfnVehicleProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVehicleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVehicleProps):
        software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps
  }
}
