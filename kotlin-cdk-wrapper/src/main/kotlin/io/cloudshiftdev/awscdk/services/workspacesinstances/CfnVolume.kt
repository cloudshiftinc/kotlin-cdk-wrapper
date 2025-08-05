@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesinstances

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Resource Type definition for AWS::WorkspacesInstances::Volume - Manages WorkSpaces Volume
 * resources.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
 * CfnVolume cfnVolume = CfnVolume.Builder.create(this, "MyCfnVolume")
 * .availabilityZone("availabilityZone")
 * // the properties below are optional
 * .encrypted(false)
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .sizeInGb(123)
 * .snapshotId("snapshotId")
 * .tagSpecifications(List.of(TagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .throughput(123)
 * .volumeType("volumeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html)
 */
public open class CfnVolume(
  cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnVolume,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVolumeProps,
  ) :
      this(software.amazon.awscdk.services.workspacesinstances.CfnVolume(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVolumeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVolumeProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVolumeProps(props)
  )

  /**
   * Unique identifier for the volume.
   */
  public open fun attrVolumeId(): String = unwrap(this).getAttrVolumeId()

  /**
   * The Availability Zone in which to create the volume.
   */
  public open fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

  /**
   * The Availability Zone in which to create the volume.
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  /**
   * Indicates whether the volume should be encrypted.
   */
  public open fun encrypted(): Any? = unwrap(this).getEncrypted()

  /**
   * Indicates whether the volume should be encrypted.
   */
  public open fun encrypted(`value`: Boolean) {
    unwrap(this).setEncrypted(`value`)
  }

  /**
   * Indicates whether the volume should be encrypted.
   */
  public open fun encrypted(`value`: IResolvable) {
    unwrap(this).setEncrypted(`value`.let(IResolvable.Companion::unwrap))
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
   * The number of I/O operations per second (IOPS).
   */
  public open fun iops(): Number? = unwrap(this).getIops()

  /**
   * The number of I/O operations per second (IOPS).
   */
  public open fun iops(`value`: Number) {
    unwrap(this).setIops(`value`)
  }

  /**
   * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for
   * Amazon EBS encryption.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for
   * Amazon EBS encryption.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The size of the volume, in GiBs.
   */
  public open fun sizeInGb(): Number? = unwrap(this).getSizeInGb()

  /**
   * The size of the volume, in GiBs.
   */
  public open fun sizeInGb(`value`: Number) {
    unwrap(this).setSizeInGb(`value`)
  }

  /**
   * The snapshot from which to create the volume.
   */
  public open fun snapshotId(): String? = unwrap(this).getSnapshotId()

  /**
   * The snapshot from which to create the volume.
   */
  public open fun snapshotId(`value`: String) {
    unwrap(this).setSnapshotId(`value`)
  }

  /**
   * The tags passed to EBS volume.
   */
  public open fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  /**
   * The tags passed to EBS volume.
   */
  public open fun tagSpecifications(`value`: IResolvable) {
    unwrap(this).setTagSpecifications(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The tags passed to EBS volume.
   */
  public open fun tagSpecifications(`value`: List<Any>) {
    unwrap(this).setTagSpecifications(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The tags passed to EBS volume.
   */
  public open fun tagSpecifications(vararg `value`: Any): Unit = tagSpecifications(`value`.toList())

  /**
   * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
   */
  public open fun throughput(): Number? = unwrap(this).getThroughput()

  /**
   * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
   */
  public open fun throughput(`value`: Number) {
    unwrap(this).setThroughput(`value`)
  }

  /**
   * The volume type.
   */
  public open fun volumeType(): String? = unwrap(this).getVolumeType()

  /**
   * The volume type.
   */
  public open fun volumeType(`value`: String) {
    unwrap(this).setVolumeType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.workspacesinstances.CfnVolume].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Availability Zone in which to create the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-availabilityzone)
     * @param availabilityZone The Availability Zone in which to create the volume. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * Indicates whether the volume should be encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-encrypted)
     * @param encrypted Indicates whether the volume should be encrypted. 
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * Indicates whether the volume should be encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-encrypted)
     * @param encrypted Indicates whether the volume should be encrypted. 
     */
    public fun encrypted(encrypted: IResolvable)

    /**
     * The number of I/O operations per second (IOPS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-iops)
     * @param iops The number of I/O operations per second (IOPS). 
     */
    public fun iops(iops: Number)

    /**
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use
     * for Amazon EBS encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-kmskeyid)
     * @param kmsKeyId The identifier of the AWS Key Management Service (AWS KMS) customer master
     * key (CMK) to use for Amazon EBS encryption. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The size of the volume, in GiBs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-sizeingb)
     * @param sizeInGb The size of the volume, in GiBs. 
     */
    public fun sizeInGb(sizeInGb: Number)

    /**
     * The snapshot from which to create the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-snapshotid)
     * @param snapshotId The snapshot from which to create the volume. 
     */
    public fun snapshotId(snapshotId: String)

    /**
     * The tags passed to EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-tagspecifications)
     * @param tagSpecifications The tags passed to EBS volume. 
     */
    public fun tagSpecifications(tagSpecifications: IResolvable)

    /**
     * The tags passed to EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-tagspecifications)
     * @param tagSpecifications The tags passed to EBS volume. 
     */
    public fun tagSpecifications(tagSpecifications: List<Any>)

    /**
     * The tags passed to EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-tagspecifications)
     * @param tagSpecifications The tags passed to EBS volume. 
     */
    public fun tagSpecifications(vararg tagSpecifications: Any)

    /**
     * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-throughput)
     * @param throughput The throughput to provision for a volume, with a maximum of 1,000 MiB/s. 
     */
    public fun throughput(throughput: Number)

    /**
     * The volume type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-volumetype)
     * @param volumeType The volume type. 
     */
    public fun volumeType(volumeType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspacesinstances.CfnVolume.Builder =
        software.amazon.awscdk.services.workspacesinstances.CfnVolume.Builder.create(scope, id)

    /**
     * The Availability Zone in which to create the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-availabilityzone)
     * @param availabilityZone The Availability Zone in which to create the volume. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * Indicates whether the volume should be encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-encrypted)
     * @param encrypted Indicates whether the volume should be encrypted. 
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * Indicates whether the volume should be encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-encrypted)
     * @param encrypted Indicates whether the volume should be encrypted. 
     */
    override fun encrypted(encrypted: IResolvable) {
      cdkBuilder.encrypted(encrypted.let(IResolvable.Companion::unwrap))
    }

    /**
     * The number of I/O operations per second (IOPS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-iops)
     * @param iops The number of I/O operations per second (IOPS). 
     */
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    /**
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use
     * for Amazon EBS encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-kmskeyid)
     * @param kmsKeyId The identifier of the AWS Key Management Service (AWS KMS) customer master
     * key (CMK) to use for Amazon EBS encryption. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The size of the volume, in GiBs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-sizeingb)
     * @param sizeInGb The size of the volume, in GiBs. 
     */
    override fun sizeInGb(sizeInGb: Number) {
      cdkBuilder.sizeInGb(sizeInGb)
    }

    /**
     * The snapshot from which to create the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-snapshotid)
     * @param snapshotId The snapshot from which to create the volume. 
     */
    override fun snapshotId(snapshotId: String) {
      cdkBuilder.snapshotId(snapshotId)
    }

    /**
     * The tags passed to EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-tagspecifications)
     * @param tagSpecifications The tags passed to EBS volume. 
     */
    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * The tags passed to EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-tagspecifications)
     * @param tagSpecifications The tags passed to EBS volume. 
     */
    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The tags passed to EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-tagspecifications)
     * @param tagSpecifications The tags passed to EBS volume. 
     */
    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    /**
     * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-throughput)
     * @param throughput The throughput to provision for a volume, with a maximum of 1,000 MiB/s. 
     */
    override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    /**
     * The volume type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesinstances-volume.html#cfn-workspacesinstances-volume-volumetype)
     * @param volumeType The volume type. 
     */
    override fun volumeType(volumeType: String) {
      cdkBuilder.volumeType(volumeType)
    }

    public fun build(): software.amazon.awscdk.services.workspacesinstances.CfnVolume =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspacesinstances.CfnVolume.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVolume {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnVolume):
        CfnVolume = CfnVolume(cdkObject)

    internal fun unwrap(wrapped: CfnVolume):
        software.amazon.awscdk.services.workspacesinstances.CfnVolume = wrapped.cdkObject as
        software.amazon.awscdk.services.workspacesinstances.CfnVolume
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesinstances.*;
   * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-volume-tagspecification.html)
   */
  public interface TagSpecificationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-volume-tagspecification.html#cfn-workspacesinstances-volume-tagspecification-resourcetype)
     */
    public fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * The tags to apply to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-volume-tagspecification.html#cfn-workspacesinstances-volume-tagspecification-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [TagSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceType the value to be set.
       */
      public fun resourceType(resourceType: String)

      /**
       * @param tags The tags to apply to the resource.
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags The tags to apply to the resource.
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesinstances.CfnVolume.TagSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.workspacesinstances.CfnVolume.TagSpecificationProperty.builder()

      /**
       * @param resourceType the value to be set.
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      /**
       * @param tags The tags to apply to the resource.
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
      }

      /**
       * @param tags The tags to apply to the resource.
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.workspacesinstances.CfnVolume.TagSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnVolume.TagSpecificationProperty,
    ) : CdkObject(cdkObject),
        TagSpecificationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-volume-tagspecification.html#cfn-workspacesinstances-volume-tagspecification-resourcetype)
       */
      override fun resourceType(): String? = unwrap(this).getResourceType()

      /**
       * The tags to apply to the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesinstances-volume-tagspecification.html#cfn-workspacesinstances-volume-tagspecification-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesinstances.CfnVolume.TagSpecificationProperty):
          TagSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as? TagSpecificationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagSpecificationProperty):
          software.amazon.awscdk.services.workspacesinstances.CfnVolume.TagSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesinstances.CfnVolume.TagSpecificationProperty
    }
  }
}
