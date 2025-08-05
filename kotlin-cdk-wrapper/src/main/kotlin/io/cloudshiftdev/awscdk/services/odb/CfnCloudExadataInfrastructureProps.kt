@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.odb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCloudExadataInfrastructure`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.odb.*;
 * CfnCloudExadataInfrastructureProps cfnCloudExadataInfrastructureProps =
 * CfnCloudExadataInfrastructureProps.builder()
 * .availabilityZone("availabilityZone")
 * .availabilityZoneId("availabilityZoneId")
 * .computeCount(123)
 * .customerContactsToSendToOci(List.of(CustomerContactProperty.builder()
 * .email("email")
 * .build()))
 * .databaseServerType("databaseServerType")
 * .displayName("displayName")
 * .shape("shape")
 * .storageCount(123)
 * .storageServerType("storageServerType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html)
 */
public interface CfnCloudExadataInfrastructureProps {
  /**
   * The name of the Availability Zone (AZ) where the Exadata infrastructure is located.
   *
   * Required when creating an Exadata infrastructure. Specify either AvailabilityZone or
   * AvailabilityZoneId to define the location of the infrastructure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The AZ ID of the AZ where the Exadata infrastructure is located.
   *
   * Required when creating an Exadata infrastructure. Specify either AvailabilityZone or
   * AvailabilityZoneId to define the location of the infrastructure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-availabilityzoneid)
   */
  public fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

  /**
   * The number of database servers for the Exadata infrastructure.
   *
   * Required when creating an Exadata infrastructure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-computecount)
   */
  public fun computeCount(): Number? = unwrap(this).getComputeCount()

  /**
   * The email addresses of contacts to receive notification from Oracle about maintenance updates
   * for the Exadata infrastructure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-customercontactstosendtooci)
   */
  public fun customerContactsToSendToOci(): Any? = unwrap(this).getCustomerContactsToSendToOci()

  /**
   * The database server model type of the Exadata infrastructure.
   *
   * For the list of valid model names, use the `ListDbSystemShapes` operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-databaseservertype)
   */
  public fun databaseServerType(): String? = unwrap(this).getDatabaseServerType()

  /**
   * The user-friendly name for the Exadata infrastructure.
   *
   * Required when creating an Exadata infrastructure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The model name of the Exadata infrastructure.
   *
   * Required when creating an Exadata infrastructure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-shape)
   */
  public fun shape(): String? = unwrap(this).getShape()

  /**
   * The number of storage servers that are activated for the Exadata infrastructure.
   *
   * Required when creating an Exadata infrastructure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-storagecount)
   */
  public fun storageCount(): Number? = unwrap(this).getStorageCount()

  /**
   * The storage server model type of the Exadata infrastructure.
   *
   * For the list of valid model names, use the `ListDbSystemShapes` operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-storageservertype)
   */
  public fun storageServerType(): String? = unwrap(this).getStorageServerType()

  /**
   * Tags to assign to the Exadata Infrastructure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCloudExadataInfrastructureProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone The name of the Availability Zone (AZ) where the Exadata
     * infrastructure is located.
     * Required when creating an Exadata infrastructure. Specify either AvailabilityZone or
     * AvailabilityZoneId to define the location of the infrastructure.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param availabilityZoneId The AZ ID of the AZ where the Exadata infrastructure is located.
     * Required when creating an Exadata infrastructure. Specify either AvailabilityZone or
     * AvailabilityZoneId to define the location of the infrastructure.
     */
    public fun availabilityZoneId(availabilityZoneId: String)

    /**
     * @param computeCount The number of database servers for the Exadata infrastructure.
     * Required when creating an Exadata infrastructure.
     */
    public fun computeCount(computeCount: Number)

    /**
     * @param customerContactsToSendToOci The email addresses of contacts to receive notification
     * from Oracle about maintenance updates for the Exadata infrastructure.
     */
    public fun customerContactsToSendToOci(customerContactsToSendToOci: IResolvable)

    /**
     * @param customerContactsToSendToOci The email addresses of contacts to receive notification
     * from Oracle about maintenance updates for the Exadata infrastructure.
     */
    public fun customerContactsToSendToOci(customerContactsToSendToOci: List<Any>)

    /**
     * @param customerContactsToSendToOci The email addresses of contacts to receive notification
     * from Oracle about maintenance updates for the Exadata infrastructure.
     */
    public fun customerContactsToSendToOci(vararg customerContactsToSendToOci: Any)

    /**
     * @param databaseServerType The database server model type of the Exadata infrastructure.
     * For the list of valid model names, use the `ListDbSystemShapes` operation.
     */
    public fun databaseServerType(databaseServerType: String)

    /**
     * @param displayName The user-friendly name for the Exadata infrastructure.
     * Required when creating an Exadata infrastructure.
     */
    public fun displayName(displayName: String)

    /**
     * @param shape The model name of the Exadata infrastructure.
     * Required when creating an Exadata infrastructure.
     */
    public fun shape(shape: String)

    /**
     * @param storageCount The number of storage servers that are activated for the Exadata
     * infrastructure.
     * Required when creating an Exadata infrastructure.
     */
    public fun storageCount(storageCount: Number)

    /**
     * @param storageServerType The storage server model type of the Exadata infrastructure.
     * For the list of valid model names, use the `ListDbSystemShapes` operation.
     */
    public fun storageServerType(storageServerType: String)

    /**
     * @param tags Tags to assign to the Exadata Infrastructure.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to assign to the Exadata Infrastructure.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructureProps.Builder =
        software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructureProps.builder()

    /**
     * @param availabilityZone The name of the Availability Zone (AZ) where the Exadata
     * infrastructure is located.
     * Required when creating an Exadata infrastructure. Specify either AvailabilityZone or
     * AvailabilityZoneId to define the location of the infrastructure.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param availabilityZoneId The AZ ID of the AZ where the Exadata infrastructure is located.
     * Required when creating an Exadata infrastructure. Specify either AvailabilityZone or
     * AvailabilityZoneId to define the location of the infrastructure.
     */
    override fun availabilityZoneId(availabilityZoneId: String) {
      cdkBuilder.availabilityZoneId(availabilityZoneId)
    }

    /**
     * @param computeCount The number of database servers for the Exadata infrastructure.
     * Required when creating an Exadata infrastructure.
     */
    override fun computeCount(computeCount: Number) {
      cdkBuilder.computeCount(computeCount)
    }

    /**
     * @param customerContactsToSendToOci The email addresses of contacts to receive notification
     * from Oracle about maintenance updates for the Exadata infrastructure.
     */
    override fun customerContactsToSendToOci(customerContactsToSendToOci: IResolvable) {
      cdkBuilder.customerContactsToSendToOci(customerContactsToSendToOci.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customerContactsToSendToOci The email addresses of contacts to receive notification
     * from Oracle about maintenance updates for the Exadata infrastructure.
     */
    override fun customerContactsToSendToOci(customerContactsToSendToOci: List<Any>) {
      cdkBuilder.customerContactsToSendToOci(customerContactsToSendToOci.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param customerContactsToSendToOci The email addresses of contacts to receive notification
     * from Oracle about maintenance updates for the Exadata infrastructure.
     */
    override fun customerContactsToSendToOci(vararg customerContactsToSendToOci: Any): Unit =
        customerContactsToSendToOci(customerContactsToSendToOci.toList())

    /**
     * @param databaseServerType The database server model type of the Exadata infrastructure.
     * For the list of valid model names, use the `ListDbSystemShapes` operation.
     */
    override fun databaseServerType(databaseServerType: String) {
      cdkBuilder.databaseServerType(databaseServerType)
    }

    /**
     * @param displayName The user-friendly name for the Exadata infrastructure.
     * Required when creating an Exadata infrastructure.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param shape The model name of the Exadata infrastructure.
     * Required when creating an Exadata infrastructure.
     */
    override fun shape(shape: String) {
      cdkBuilder.shape(shape)
    }

    /**
     * @param storageCount The number of storage servers that are activated for the Exadata
     * infrastructure.
     * Required when creating an Exadata infrastructure.
     */
    override fun storageCount(storageCount: Number) {
      cdkBuilder.storageCount(storageCount)
    }

    /**
     * @param storageServerType The storage server model type of the Exadata infrastructure.
     * For the list of valid model names, use the `ListDbSystemShapes` operation.
     */
    override fun storageServerType(storageServerType: String) {
      cdkBuilder.storageServerType(storageServerType)
    }

    /**
     * @param tags Tags to assign to the Exadata Infrastructure.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags to assign to the Exadata Infrastructure.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructureProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructureProps,
  ) : CdkObject(cdkObject),
      CfnCloudExadataInfrastructureProps {
    /**
     * The name of the Availability Zone (AZ) where the Exadata infrastructure is located.
     *
     * Required when creating an Exadata infrastructure. Specify either AvailabilityZone or
     * AvailabilityZoneId to define the location of the infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The AZ ID of the AZ where the Exadata infrastructure is located.
     *
     * Required when creating an Exadata infrastructure. Specify either AvailabilityZone or
     * AvailabilityZoneId to define the location of the infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-availabilityzoneid)
     */
    override fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

    /**
     * The number of database servers for the Exadata infrastructure.
     *
     * Required when creating an Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-computecount)
     */
    override fun computeCount(): Number? = unwrap(this).getComputeCount()

    /**
     * The email addresses of contacts to receive notification from Oracle about maintenance updates
     * for the Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-customercontactstosendtooci)
     */
    override fun customerContactsToSendToOci(): Any? = unwrap(this).getCustomerContactsToSendToOci()

    /**
     * The database server model type of the Exadata infrastructure.
     *
     * For the list of valid model names, use the `ListDbSystemShapes` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-databaseservertype)
     */
    override fun databaseServerType(): String? = unwrap(this).getDatabaseServerType()

    /**
     * The user-friendly name for the Exadata infrastructure.
     *
     * Required when creating an Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The model name of the Exadata infrastructure.
     *
     * Required when creating an Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-shape)
     */
    override fun shape(): String? = unwrap(this).getShape()

    /**
     * The number of storage servers that are activated for the Exadata infrastructure.
     *
     * Required when creating an Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-storagecount)
     */
    override fun storageCount(): Number? = unwrap(this).getStorageCount()

    /**
     * The storage server model type of the Exadata infrastructure.
     *
     * For the list of valid model names, use the `ListDbSystemShapes` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-storageservertype)
     */
    override fun storageServerType(): String? = unwrap(this).getStorageServerType()

    /**
     * Tags to assign to the Exadata Infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCloudExadataInfrastructureProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructureProps):
        CfnCloudExadataInfrastructureProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCloudExadataInfrastructureProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCloudExadataInfrastructureProps):
        software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructureProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructureProps
  }
}
