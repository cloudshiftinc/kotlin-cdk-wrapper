@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.odb

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ODB::CloudExadataInfrastructure` resource creates an Exadata infrastructure.
 *
 * An Exadata infrastructure provides the underlying compute and storage resources for Oracle
 * Database workloads.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.odb.*;
 * CfnCloudExadataInfrastructure cfnCloudExadataInfrastructure =
 * CfnCloudExadataInfrastructure.Builder.create(this, "MyCfnCloudExadataInfrastructure")
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
public open class CfnCloudExadataInfrastructure(
  cdkObject: software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudExadataInfrastructureProps,
  ) :
      this(software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCloudExadataInfrastructureProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudExadataInfrastructureProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCloudExadataInfrastructureProps(props)
  )

  /**
   * The number of storage servers requested for the Exadata infrastructure.
   */
  public open fun attrActivatedStorageCount(): Number = unwrap(this).getAttrActivatedStorageCount()

  /**
   * The number of storage servers requested for the Exadata infrastructure.
   */
  public open fun attrAdditionalStorageCount(): Number =
      unwrap(this).getAttrAdditionalStorageCount()

  /**
   * The amount of available storage, in gigabytes (GB), for the Exadata infrastructure.
   */
  public open fun attrAvailableStorageSizeInGBs(): Number =
      unwrap(this).getAttrAvailableStorageSizeInGBs()

  /**
   * The Amazon Resource Name (ARN) for the Exadata infrastructure.
   */
  public open fun attrCloudExadataInfrastructureArn(): String =
      unwrap(this).getAttrCloudExadataInfrastructureArn()

  /**
   * The unique identifier for the Exadata infrastructure.
   */
  public open fun attrCloudExadataInfrastructureId(): String =
      unwrap(this).getAttrCloudExadataInfrastructureId()

  /**
   * The OCI model compute model used when you create or clone an instance: ECPU or OCPU.
   *
   * An ECPU is an abstracted measure of compute resources. ECPUs are based on the number of cores
   * elastically allocated from a pool of compute and storage servers. An OCPU is a legacy physical
   * measure of compute resources. OCPUs are based on the physical core of a processor with
   * hyper-threading enabled.
   */
  public open fun attrComputeModel(): String = unwrap(this).getAttrComputeModel()

  /**
   * The total number of CPU cores that are allocated to the Exadata infrastructure.
   */
  public open fun attrCpuCount(): Number = unwrap(this).getAttrCpuCount()

  /**
   * The size of the Exadata infrastructure's data disk group, in terabytes (TB).
   */
  public open fun attrDataStorageSizeInTBs(): IResolvable =
      unwrap(this).getAttrDataStorageSizeInTBs().let(IResolvable::wrap)

  /**
   * The size of the Exadata infrastructure's local node storage, in gigabytes (GB).
   */
  public open fun attrDbNodeStorageSizeInGBs(): Number =
      unwrap(this).getAttrDbNodeStorageSizeInGBs()

  /**
   * The list of database server identifiers for the Exadata infrastructure.
   */
  public open fun attrDbServerIds(): List<String> = unwrap(this).getAttrDbServerIds()

  /**
   * The software version of the database servers (dom0) in the Exadata infrastructure.
   */
  public open fun attrDbServerVersion(): String = unwrap(this).getAttrDbServerVersion()

  /**
   * The total number of CPU cores available on the Exadata infrastructure.
   */
  public open fun attrMaxCpuCount(): Number = unwrap(this).getAttrMaxCpuCount()

  /**
   * The total amount of data disk group storage, in terabytes (TB), that's available on the Exadata
   * infrastructure.
   */
  public open fun attrMaxDataStorageInTBs(): IResolvable =
      unwrap(this).getAttrMaxDataStorageInTBs().let(IResolvable::wrap)

  /**
   * The total amount of local node storage, in gigabytes (GB), that's available on the Exadata
   * infrastructure.
   */
  public open fun attrMaxDbNodeStorageSizeInGBs(): Number =
      unwrap(this).getAttrMaxDbNodeStorageSizeInGBs()

  /**
   * The total amount of memory, in gigabytes (GB), that's available on the Exadata infrastructure.
   */
  public open fun attrMaxMemoryInGBs(): Number = unwrap(this).getAttrMaxMemoryInGBs()

  /**
   * The amount of memory, in gigabytes (GB), that's allocated on the Exadata infrastructure.
   */
  public open fun attrMemorySizeInGBs(): Number = unwrap(this).getAttrMemorySizeInGBs()

  /**
   * The name of the OCI resource anchor for the Exadata infrastructure.
   */
  public open fun attrOciResourceAnchorName(): String = unwrap(this).getAttrOciResourceAnchorName()

  /**
   * The HTTPS link to the Exadata infrastructure in OCI.
   */
  public open fun attrOciUrl(): String = unwrap(this).getAttrOciUrl()

  /**
   * The OCID of the Exadata infrastructure.
   */
  public open fun attrOcid(): String = unwrap(this).getAttrOcid()

  /**
   * The software version of the storage servers on the Exadata infrastructure.
   */
  public open fun attrStorageServerVersion(): String = unwrap(this).getAttrStorageServerVersion()

  /**
   * The total amount of storage, in gigabytes (GB), on the the Exadata infrastructure.
   */
  public open fun attrTotalStorageSizeInGBs(): Number = unwrap(this).getAttrTotalStorageSizeInGBs()

  /**
   * The name of the Availability Zone (AZ) where the Exadata infrastructure is located.
   */
  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The name of the Availability Zone (AZ) where the Exadata infrastructure is located.
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  /**
   * The AZ ID of the AZ where the Exadata infrastructure is located.
   */
  public open fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

  /**
   * The AZ ID of the AZ where the Exadata infrastructure is located.
   */
  public open fun availabilityZoneId(`value`: String) {
    unwrap(this).setAvailabilityZoneId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The number of database servers for the Exadata infrastructure.
   */
  public open fun computeCount(): Number? = unwrap(this).getComputeCount()

  /**
   * The number of database servers for the Exadata infrastructure.
   */
  public open fun computeCount(`value`: Number) {
    unwrap(this).setComputeCount(`value`)
  }

  /**
   * The email addresses of contacts to receive notification from Oracle about maintenance updates
   * for the Exadata infrastructure.
   */
  public open fun customerContactsToSendToOci(): Any? =
      unwrap(this).getCustomerContactsToSendToOci()

  /**
   * The email addresses of contacts to receive notification from Oracle about maintenance updates
   * for the Exadata infrastructure.
   */
  public open fun customerContactsToSendToOci(`value`: IResolvable) {
    unwrap(this).setCustomerContactsToSendToOci(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The email addresses of contacts to receive notification from Oracle about maintenance updates
   * for the Exadata infrastructure.
   */
  public open fun customerContactsToSendToOci(`value`: List<Any>) {
    unwrap(this).setCustomerContactsToSendToOci(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The email addresses of contacts to receive notification from Oracle about maintenance updates
   * for the Exadata infrastructure.
   */
  public open fun customerContactsToSendToOci(vararg `value`: Any): Unit =
      customerContactsToSendToOci(`value`.toList())

  /**
   * The database server model type of the Exadata infrastructure.
   */
  public open fun databaseServerType(): String? = unwrap(this).getDatabaseServerType()

  /**
   * The database server model type of the Exadata infrastructure.
   */
  public open fun databaseServerType(`value`: String) {
    unwrap(this).setDatabaseServerType(`value`)
  }

  /**
   * The user-friendly name for the Exadata infrastructure.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The user-friendly name for the Exadata infrastructure.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
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
   * The model name of the Exadata infrastructure.
   */
  public open fun shape(): String? = unwrap(this).getShape()

  /**
   * The model name of the Exadata infrastructure.
   */
  public open fun shape(`value`: String) {
    unwrap(this).setShape(`value`)
  }

  /**
   * The number of storage servers that are activated for the Exadata infrastructure.
   */
  public open fun storageCount(): Number? = unwrap(this).getStorageCount()

  /**
   * The number of storage servers that are activated for the Exadata infrastructure.
   */
  public open fun storageCount(`value`: Number) {
    unwrap(this).setStorageCount(`value`)
  }

  /**
   * The storage server model type of the Exadata infrastructure.
   */
  public open fun storageServerType(): String? = unwrap(this).getStorageServerType()

  /**
   * The storage server model type of the Exadata infrastructure.
   */
  public open fun storageServerType(`value`: String) {
    unwrap(this).setStorageServerType(`value`)
  }

  /**
   * Tags to assign to the Exadata Infrastructure.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags to assign to the Exadata Infrastructure.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags to assign to the Exadata Infrastructure.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.odb.CfnCloudExadataInfrastructure].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Availability Zone (AZ) where the Exadata infrastructure is located.
     *
     * Required when creating an Exadata infrastructure. Specify either AvailabilityZone or
     * AvailabilityZoneId to define the location of the infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-availabilityzone)
     * @param availabilityZone The name of the Availability Zone (AZ) where the Exadata
     * infrastructure is located. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * The AZ ID of the AZ where the Exadata infrastructure is located.
     *
     * Required when creating an Exadata infrastructure. Specify either AvailabilityZone or
     * AvailabilityZoneId to define the location of the infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-availabilityzoneid)
     * @param availabilityZoneId The AZ ID of the AZ where the Exadata infrastructure is located. 
     */
    public fun availabilityZoneId(availabilityZoneId: String)

    /**
     * The number of database servers for the Exadata infrastructure.
     *
     * Required when creating an Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-computecount)
     * @param computeCount The number of database servers for the Exadata infrastructure. 
     */
    public fun computeCount(computeCount: Number)

    /**
     * The email addresses of contacts to receive notification from Oracle about maintenance updates
     * for the Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-customercontactstosendtooci)
     * @param customerContactsToSendToOci The email addresses of contacts to receive notification
     * from Oracle about maintenance updates for the Exadata infrastructure. 
     */
    public fun customerContactsToSendToOci(customerContactsToSendToOci: IResolvable)

    /**
     * The email addresses of contacts to receive notification from Oracle about maintenance updates
     * for the Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-customercontactstosendtooci)
     * @param customerContactsToSendToOci The email addresses of contacts to receive notification
     * from Oracle about maintenance updates for the Exadata infrastructure. 
     */
    public fun customerContactsToSendToOci(customerContactsToSendToOci: List<Any>)

    /**
     * The email addresses of contacts to receive notification from Oracle about maintenance updates
     * for the Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-customercontactstosendtooci)
     * @param customerContactsToSendToOci The email addresses of contacts to receive notification
     * from Oracle about maintenance updates for the Exadata infrastructure. 
     */
    public fun customerContactsToSendToOci(vararg customerContactsToSendToOci: Any)

    /**
     * The database server model type of the Exadata infrastructure.
     *
     * For the list of valid model names, use the `ListDbSystemShapes` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-databaseservertype)
     * @param databaseServerType The database server model type of the Exadata infrastructure. 
     */
    public fun databaseServerType(databaseServerType: String)

    /**
     * The user-friendly name for the Exadata infrastructure.
     *
     * Required when creating an Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-displayname)
     * @param displayName The user-friendly name for the Exadata infrastructure. 
     */
    public fun displayName(displayName: String)

    /**
     * The model name of the Exadata infrastructure.
     *
     * Required when creating an Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-shape)
     * @param shape The model name of the Exadata infrastructure. 
     */
    public fun shape(shape: String)

    /**
     * The number of storage servers that are activated for the Exadata infrastructure.
     *
     * Required when creating an Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-storagecount)
     * @param storageCount The number of storage servers that are activated for the Exadata
     * infrastructure. 
     */
    public fun storageCount(storageCount: Number)

    /**
     * The storage server model type of the Exadata infrastructure.
     *
     * For the list of valid model names, use the `ListDbSystemShapes` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-storageservertype)
     * @param storageServerType The storage server model type of the Exadata infrastructure. 
     */
    public fun storageServerType(storageServerType: String)

    /**
     * Tags to assign to the Exadata Infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-tags)
     * @param tags Tags to assign to the Exadata Infrastructure. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to assign to the Exadata Infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-tags)
     * @param tags Tags to assign to the Exadata Infrastructure. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure.Builder =
        software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure.Builder.create(scope, id)

    /**
     * The name of the Availability Zone (AZ) where the Exadata infrastructure is located.
     *
     * Required when creating an Exadata infrastructure. Specify either AvailabilityZone or
     * AvailabilityZoneId to define the location of the infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-availabilityzone)
     * @param availabilityZone The name of the Availability Zone (AZ) where the Exadata
     * infrastructure is located. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The AZ ID of the AZ where the Exadata infrastructure is located.
     *
     * Required when creating an Exadata infrastructure. Specify either AvailabilityZone or
     * AvailabilityZoneId to define the location of the infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-availabilityzoneid)
     * @param availabilityZoneId The AZ ID of the AZ where the Exadata infrastructure is located. 
     */
    override fun availabilityZoneId(availabilityZoneId: String) {
      cdkBuilder.availabilityZoneId(availabilityZoneId)
    }

    /**
     * The number of database servers for the Exadata infrastructure.
     *
     * Required when creating an Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-computecount)
     * @param computeCount The number of database servers for the Exadata infrastructure. 
     */
    override fun computeCount(computeCount: Number) {
      cdkBuilder.computeCount(computeCount)
    }

    /**
     * The email addresses of contacts to receive notification from Oracle about maintenance updates
     * for the Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-customercontactstosendtooci)
     * @param customerContactsToSendToOci The email addresses of contacts to receive notification
     * from Oracle about maintenance updates for the Exadata infrastructure. 
     */
    override fun customerContactsToSendToOci(customerContactsToSendToOci: IResolvable) {
      cdkBuilder.customerContactsToSendToOci(customerContactsToSendToOci.let(IResolvable.Companion::unwrap))
    }

    /**
     * The email addresses of contacts to receive notification from Oracle about maintenance updates
     * for the Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-customercontactstosendtooci)
     * @param customerContactsToSendToOci The email addresses of contacts to receive notification
     * from Oracle about maintenance updates for the Exadata infrastructure. 
     */
    override fun customerContactsToSendToOci(customerContactsToSendToOci: List<Any>) {
      cdkBuilder.customerContactsToSendToOci(customerContactsToSendToOci.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The email addresses of contacts to receive notification from Oracle about maintenance updates
     * for the Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-customercontactstosendtooci)
     * @param customerContactsToSendToOci The email addresses of contacts to receive notification
     * from Oracle about maintenance updates for the Exadata infrastructure. 
     */
    override fun customerContactsToSendToOci(vararg customerContactsToSendToOci: Any): Unit =
        customerContactsToSendToOci(customerContactsToSendToOci.toList())

    /**
     * The database server model type of the Exadata infrastructure.
     *
     * For the list of valid model names, use the `ListDbSystemShapes` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-databaseservertype)
     * @param databaseServerType The database server model type of the Exadata infrastructure. 
     */
    override fun databaseServerType(databaseServerType: String) {
      cdkBuilder.databaseServerType(databaseServerType)
    }

    /**
     * The user-friendly name for the Exadata infrastructure.
     *
     * Required when creating an Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-displayname)
     * @param displayName The user-friendly name for the Exadata infrastructure. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The model name of the Exadata infrastructure.
     *
     * Required when creating an Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-shape)
     * @param shape The model name of the Exadata infrastructure. 
     */
    override fun shape(shape: String) {
      cdkBuilder.shape(shape)
    }

    /**
     * The number of storage servers that are activated for the Exadata infrastructure.
     *
     * Required when creating an Exadata infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-storagecount)
     * @param storageCount The number of storage servers that are activated for the Exadata
     * infrastructure. 
     */
    override fun storageCount(storageCount: Number) {
      cdkBuilder.storageCount(storageCount)
    }

    /**
     * The storage server model type of the Exadata infrastructure.
     *
     * For the list of valid model names, use the `ListDbSystemShapes` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-storageservertype)
     * @param storageServerType The storage server model type of the Exadata infrastructure. 
     */
    override fun storageServerType(storageServerType: String) {
      cdkBuilder.storageServerType(storageServerType)
    }

    /**
     * Tags to assign to the Exadata Infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-tags)
     * @param tags Tags to assign to the Exadata Infrastructure. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags to assign to the Exadata Infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-odb-cloudexadatainfrastructure.html#cfn-odb-cloudexadatainfrastructure-tags)
     * @param tags Tags to assign to the Exadata Infrastructure. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCloudExadataInfrastructure {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCloudExadataInfrastructure(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure):
        CfnCloudExadataInfrastructure = CfnCloudExadataInfrastructure(cdkObject)

    internal fun unwrap(wrapped: CfnCloudExadataInfrastructure):
        software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure = wrapped.cdkObject as
        software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure
  }

  /**
   * A contact to receive notification from Oracle about maintenance updates for a specific Exadata
   * infrastructure.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.odb.*;
   * CustomerContactProperty customerContactProperty = CustomerContactProperty.builder()
   * .email("email")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudexadatainfrastructure-customercontact.html)
   */
  public interface CustomerContactProperty {
    /**
     * The email address of the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudexadatainfrastructure-customercontact.html#cfn-odb-cloudexadatainfrastructure-customercontact-email)
     */
    public fun email(): String? = unwrap(this).getEmail()

    /**
     * A builder for [CustomerContactProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param email The email address of the contact.
       */
      public fun email(email: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure.CustomerContactProperty.Builder
          =
          software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure.CustomerContactProperty.builder()

      /**
       * @param email The email address of the contact.
       */
      override fun email(email: String) {
        cdkBuilder.email(email)
      }

      public fun build():
          software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure.CustomerContactProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure.CustomerContactProperty,
    ) : CdkObject(cdkObject),
        CustomerContactProperty {
      /**
       * The email address of the contact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-odb-cloudexadatainfrastructure-customercontact.html#cfn-odb-cloudexadatainfrastructure-customercontact-email)
       */
      override fun email(): String? = unwrap(this).getEmail()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomerContactProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure.CustomerContactProperty):
          CustomerContactProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomerContactProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerContactProperty):
          software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure.CustomerContactProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure.CustomerContactProperty
    }
  }
}
