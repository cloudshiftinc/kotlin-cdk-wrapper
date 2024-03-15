@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
 * Creates an FSx for ONTAP or Amazon FSx for OpenZFS storage volume.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fsx.*;
 * CfnVolume cfnVolume = CfnVolume.Builder.create(this, "MyCfnVolume")
 * .name("name")
 * // the properties below are optional
 * .backupId("backupId")
 * .ontapConfiguration(OntapConfigurationProperty.builder()
 * .storageVirtualMachineId("storageVirtualMachineId")
 * // the properties below are optional
 * .aggregateConfiguration(AggregateConfigurationProperty.builder()
 * .aggregates(List.of("aggregates"))
 * .constituentsPerAggregate(123)
 * .build())
 * .copyTagsToBackups("copyTagsToBackups")
 * .junctionPath("junctionPath")
 * .ontapVolumeType("ontapVolumeType")
 * .securityStyle("securityStyle")
 * .sizeInBytes("sizeInBytes")
 * .sizeInMegabytes("sizeInMegabytes")
 * .snaplockConfiguration(SnaplockConfigurationProperty.builder()
 * .snaplockType("snaplockType")
 * // the properties below are optional
 * .auditLogVolume("auditLogVolume")
 * .autocommitPeriod(AutocommitPeriodProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .value(123)
 * .build())
 * .privilegedDelete("privilegedDelete")
 * .retentionPeriod(SnaplockRetentionPeriodProperty.builder()
 * .defaultRetention(RetentionPeriodProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .value(123)
 * .build())
 * .maximumRetention(RetentionPeriodProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .value(123)
 * .build())
 * .minimumRetention(RetentionPeriodProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .value(123)
 * .build())
 * .build())
 * .volumeAppendModeEnabled("volumeAppendModeEnabled")
 * .build())
 * .snapshotPolicy("snapshotPolicy")
 * .storageEfficiencyEnabled("storageEfficiencyEnabled")
 * .tieringPolicy(TieringPolicyProperty.builder()
 * .coolingPeriod(123)
 * .name("name")
 * .build())
 * .volumeStyle("volumeStyle")
 * .build())
 * .openZfsConfiguration(OpenZFSConfigurationProperty.builder()
 * .parentVolumeId("parentVolumeId")
 * // the properties below are optional
 * .copyTagsToSnapshots(false)
 * .dataCompressionType("dataCompressionType")
 * .nfsExports(List.of(NfsExportsProperty.builder()
 * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
 * .clients("clients")
 * .options(List.of("options"))
 * .build()))
 * .build()))
 * .options(List.of("options"))
 * .originSnapshot(OriginSnapshotProperty.builder()
 * .copyStrategy("copyStrategy")
 * .snapshotArn("snapshotArn")
 * .build())
 * .readOnly(false)
 * .recordSizeKiB(123)
 * .storageCapacityQuotaGiB(123)
 * .storageCapacityReservationGiB(123)
 * .userAndGroupQuotas(List.of(UserAndGroupQuotasProperty.builder()
 * .id(123)
 * .storageCapacityQuotaGiB(123)
 * .type("type")
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .volumeType("volumeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html)
 */
public open class CfnVolume internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the volume's Amazon Resource Name (ARN).
   *
   * Example:
   * `arn:aws:fsx:us-east-2:111122223333:volume/fs-0123456789abcdef9/fsvol-01234567891112223`
   */
  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  /**
   * Returns the volume's universally unique identifier (UUID).
   *
   * Example: `abcd0123-cd45-ef67-11aa-1111aaaa23bc`
   */
  public open fun attrUuid(): String = unwrap(this).getAttrUuid()

  /**
   * Returns the volume's ID.
   *
   * Example: `fsvol-0123456789abcdefa`
   */
  public open fun attrVolumeId(): String = unwrap(this).getAttrVolumeId()

  /**
   * Specifies the ID of the volume backup to use to create a new volume.
   */
  public open fun backupId(): String? = unwrap(this).getBackupId()

  /**
   * Specifies the ID of the volume backup to use to create a new volume.
   */
  public open fun backupId(`value`: String) {
    unwrap(this).setBackupId(`value`)
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
   * The name of the volume.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the volume.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The configuration of an Amazon FSx for NetApp ONTAP volume.
   */
  public open fun ontapConfiguration(): Any? = unwrap(this).getOntapConfiguration()

  /**
   * The configuration of an Amazon FSx for NetApp ONTAP volume.
   */
  public open fun ontapConfiguration(`value`: IResolvable) {
    unwrap(this).setOntapConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration of an Amazon FSx for NetApp ONTAP volume.
   */
  public open fun ontapConfiguration(`value`: OntapConfigurationProperty) {
    unwrap(this).setOntapConfiguration(`value`.let(OntapConfigurationProperty::unwrap))
  }

  /**
   * The configuration of an Amazon FSx for NetApp ONTAP volume.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e226ead65916dc6418e24bc447fc81c273c60407d2c68df785effcb85f4e7103")
  public open fun ontapConfiguration(`value`: OntapConfigurationProperty.Builder.() -> Unit): Unit =
      ontapConfiguration(OntapConfigurationProperty(`value`))

  /**
   * The configuration of an Amazon FSx for OpenZFS volume.
   */
  public open fun openZfsConfiguration(): Any? = unwrap(this).getOpenZfsConfiguration()

  /**
   * The configuration of an Amazon FSx for OpenZFS volume.
   */
  public open fun openZfsConfiguration(`value`: IResolvable) {
    unwrap(this).setOpenZfsConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration of an Amazon FSx for OpenZFS volume.
   */
  public open fun openZfsConfiguration(`value`: OpenZFSConfigurationProperty) {
    unwrap(this).setOpenZfsConfiguration(`value`.let(OpenZFSConfigurationProperty::unwrap))
  }

  /**
   * The configuration of an Amazon FSx for OpenZFS volume.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5390a680a0692f0d9a74615accdc7d2da6fbfe41346a12b4edd06f8d33e4fafc")
  public open fun openZfsConfiguration(`value`: OpenZFSConfigurationProperty.Builder.() -> Unit):
      Unit = openZfsConfiguration(OpenZFSConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of the volume.
   */
  public open fun volumeType(): String? = unwrap(this).getVolumeType()

  /**
   * The type of the volume.
   */
  public open fun volumeType(`value`: String) {
    unwrap(this).setVolumeType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.fsx.CfnVolume].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the ID of the volume backup to use to create a new volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-backupid)
     * @param backupId Specifies the ID of the volume backup to use to create a new volume. 
     */
    public fun backupId(backupId: String)

    /**
     * The name of the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-name)
     * @param name The name of the volume. 
     */
    public fun name(name: String)

    /**
     * The configuration of an Amazon FSx for NetApp ONTAP volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-ontapconfiguration)
     * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume. 
     */
    public fun ontapConfiguration(ontapConfiguration: IResolvable)

    /**
     * The configuration of an Amazon FSx for NetApp ONTAP volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-ontapconfiguration)
     * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume. 
     */
    public fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty)

    /**
     * The configuration of an Amazon FSx for NetApp ONTAP volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-ontapconfiguration)
     * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7f93abf2c6dc6b60e818d642b6856ed2dc86d28371c220edf14d5a0e2c2ae3c")
    public fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty.Builder.() -> Unit)

    /**
     * The configuration of an Amazon FSx for OpenZFS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-openzfsconfiguration)
     * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume. 
     */
    public fun openZfsConfiguration(openZfsConfiguration: IResolvable)

    /**
     * The configuration of an Amazon FSx for OpenZFS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-openzfsconfiguration)
     * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume. 
     */
    public fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty)

    /**
     * The configuration of an Amazon FSx for OpenZFS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-openzfsconfiguration)
     * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2795760a67c25337c26bca613fb21662b3dbcf7eac28bab4097f7b05e9a12196")
    public
        fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-volumetype)
     * @param volumeType The type of the volume. 
     */
    public fun volumeType(volumeType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnVolume.Builder =
        software.amazon.awscdk.services.fsx.CfnVolume.Builder.create(scope, id)

    /**
     * Specifies the ID of the volume backup to use to create a new volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-backupid)
     * @param backupId Specifies the ID of the volume backup to use to create a new volume. 
     */
    override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    /**
     * The name of the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-name)
     * @param name The name of the volume. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The configuration of an Amazon FSx for NetApp ONTAP volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-ontapconfiguration)
     * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume. 
     */
    override fun ontapConfiguration(ontapConfiguration: IResolvable) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The configuration of an Amazon FSx for NetApp ONTAP volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-ontapconfiguration)
     * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume. 
     */
    override fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(OntapConfigurationProperty::unwrap))
    }

    /**
     * The configuration of an Amazon FSx for NetApp ONTAP volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-ontapconfiguration)
     * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7f93abf2c6dc6b60e818d642b6856ed2dc86d28371c220edf14d5a0e2c2ae3c")
    override
        fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty.Builder.() -> Unit):
        Unit = ontapConfiguration(OntapConfigurationProperty(ontapConfiguration))

    /**
     * The configuration of an Amazon FSx for OpenZFS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-openzfsconfiguration)
     * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume. 
     */
    override fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The configuration of an Amazon FSx for OpenZFS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-openzfsconfiguration)
     * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume. 
     */
    override fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(OpenZFSConfigurationProperty::unwrap))
    }

    /**
     * The configuration of an Amazon FSx for OpenZFS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-openzfsconfiguration)
     * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2795760a67c25337c26bca613fb21662b3dbcf7eac28bab4097f7b05e9a12196")
    override
        fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty.Builder.() -> Unit):
        Unit = openZfsConfiguration(OpenZFSConfigurationProperty(openZfsConfiguration))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-volumetype)
     * @param volumeType The type of the volume. 
     */
    override fun volumeType(volumeType: String) {
      cdkBuilder.volumeType(volumeType)
    }

    public fun build(): software.amazon.awscdk.services.fsx.CfnVolume = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.fsx.CfnVolume.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVolume {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume): CfnVolume =
        CfnVolume(cdkObject)

    internal fun unwrap(wrapped: CfnVolume): software.amazon.awscdk.services.fsx.CfnVolume =
        wrapped.cdkObject
  }

  /**
   * The configuration object for mounting a Network File System (NFS) file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * NfsExportsProperty nfsExportsProperty = NfsExportsProperty.builder()
   * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
   * .clients("clients")
   * .options(List.of("options"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-nfsexports.html)
   */
  public interface NfsExportsProperty {
    /**
     * A list of configuration objects that contain the client and options for mounting the OpenZFS
     * file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-nfsexports.html#cfn-fsx-volume-nfsexports-clientconfigurations)
     */
    public fun clientConfigurations(): Any

    /**
     * A builder for [NfsExportsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientConfigurations A list of configuration objects that contain the client and
       * options for mounting the OpenZFS file system. 
       */
      public fun clientConfigurations(clientConfigurations: IResolvable)

      /**
       * @param clientConfigurations A list of configuration objects that contain the client and
       * options for mounting the OpenZFS file system. 
       */
      public fun clientConfigurations(clientConfigurations: List<Any>)

      /**
       * @param clientConfigurations A list of configuration objects that contain the client and
       * options for mounting the OpenZFS file system. 
       */
      public fun clientConfigurations(vararg clientConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty.builder()

      /**
       * @param clientConfigurations A list of configuration objects that contain the client and
       * options for mounting the OpenZFS file system. 
       */
      override fun clientConfigurations(clientConfigurations: IResolvable) {
        cdkBuilder.clientConfigurations(clientConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param clientConfigurations A list of configuration objects that contain the client and
       * options for mounting the OpenZFS file system. 
       */
      override fun clientConfigurations(clientConfigurations: List<Any>) {
        cdkBuilder.clientConfigurations(clientConfigurations)
      }

      /**
       * @param clientConfigurations A list of configuration objects that contain the client and
       * options for mounting the OpenZFS file system. 
       */
      override fun clientConfigurations(vararg clientConfigurations: Any): Unit =
          clientConfigurations(clientConfigurations.toList())

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty,
    ) : CdkObject(cdkObject), NfsExportsProperty {
      /**
       * A list of configuration objects that contain the client and options for mounting the
       * OpenZFS file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-nfsexports.html#cfn-fsx-volume-nfsexports-clientconfigurations)
       */
      override fun clientConfigurations(): Any = unwrap(this).getClientConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NfsExportsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty):
          NfsExportsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NfsExportsProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty
    }
  }

  /**
   * Use to specify configuration options for a volume’s storage aggregate or aggregates.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * AggregateConfigurationProperty aggregateConfigurationProperty =
   * AggregateConfigurationProperty.builder()
   * .aggregates(List.of("aggregates"))
   * .constituentsPerAggregate(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-aggregateconfiguration.html)
   */
  public interface AggregateConfigurationProperty {
    /**
     * The list of aggregates that this volume resides on.
     *
     * Aggregates are storage pools which make up your primary storage tier. Each high-availability
     * (HA) pair has one aggregate. The names of the aggregates map to the names of the aggregates in
     * the ONTAP CLI and REST API. For FlexVols, there will always be a single entry.
     *
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *
     * * The strings in the value of `Aggregates` are not are not formatted as `aggrX` , where X is
     * a number between 1 and 6.
     * * The value of `Aggregates` contains aggregates that are not present.
     * * One or more of the aggregates supplied are too close to the volume limit to support adding
     * more volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-aggregateconfiguration.html#cfn-fsx-volume-aggregateconfiguration-aggregates)
     */
    public fun aggregates(): List<String> = unwrap(this).getAggregates() ?: emptyList()

    /**
     * Used to explicitly set the number of constituents within the FlexGroup per storage aggregate.
     *
     * This field is optional when creating a FlexGroup volume. If unspecified, the default value
     * will be 8. This field cannot be provided when creating a FlexVol volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-aggregateconfiguration.html#cfn-fsx-volume-aggregateconfiguration-constituentsperaggregate)
     */
    public fun constituentsPerAggregate(): Number? = unwrap(this).getConstituentsPerAggregate()

    /**
     * A builder for [AggregateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregates The list of aggregates that this volume resides on.
       * Aggregates are storage pools which make up your primary storage tier. Each
       * high-availability (HA) pair has one aggregate. The names of the aggregates map to the names of
       * the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single
       * entry.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The strings in the value of `Aggregates` are not are not formatted as `aggrX` , where X
       * is a number between 1 and 6.
       * * The value of `Aggregates` contains aggregates that are not present.
       * * One or more of the aggregates supplied are too close to the volume limit to support
       * adding more volumes.
       */
      public fun aggregates(aggregates: List<String>)

      /**
       * @param aggregates The list of aggregates that this volume resides on.
       * Aggregates are storage pools which make up your primary storage tier. Each
       * high-availability (HA) pair has one aggregate. The names of the aggregates map to the names of
       * the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single
       * entry.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The strings in the value of `Aggregates` are not are not formatted as `aggrX` , where X
       * is a number between 1 and 6.
       * * The value of `Aggregates` contains aggregates that are not present.
       * * One or more of the aggregates supplied are too close to the volume limit to support
       * adding more volumes.
       */
      public fun aggregates(vararg aggregates: String)

      /**
       * @param constituentsPerAggregate Used to explicitly set the number of constituents within
       * the FlexGroup per storage aggregate.
       * This field is optional when creating a FlexGroup volume. If unspecified, the default value
       * will be 8. This field cannot be provided when creating a FlexVol volume.
       */
      public fun constituentsPerAggregate(constituentsPerAggregate: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty.builder()

      /**
       * @param aggregates The list of aggregates that this volume resides on.
       * Aggregates are storage pools which make up your primary storage tier. Each
       * high-availability (HA) pair has one aggregate. The names of the aggregates map to the names of
       * the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single
       * entry.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The strings in the value of `Aggregates` are not are not formatted as `aggrX` , where X
       * is a number between 1 and 6.
       * * The value of `Aggregates` contains aggregates that are not present.
       * * One or more of the aggregates supplied are too close to the volume limit to support
       * adding more volumes.
       */
      override fun aggregates(aggregates: List<String>) {
        cdkBuilder.aggregates(aggregates)
      }

      /**
       * @param aggregates The list of aggregates that this volume resides on.
       * Aggregates are storage pools which make up your primary storage tier. Each
       * high-availability (HA) pair has one aggregate. The names of the aggregates map to the names of
       * the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single
       * entry.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The strings in the value of `Aggregates` are not are not formatted as `aggrX` , where X
       * is a number between 1 and 6.
       * * The value of `Aggregates` contains aggregates that are not present.
       * * One or more of the aggregates supplied are too close to the volume limit to support
       * adding more volumes.
       */
      override fun aggregates(vararg aggregates: String): Unit = aggregates(aggregates.toList())

      /**
       * @param constituentsPerAggregate Used to explicitly set the number of constituents within
       * the FlexGroup per storage aggregate.
       * This field is optional when creating a FlexGroup volume. If unspecified, the default value
       * will be 8. This field cannot be provided when creating a FlexVol volume.
       */
      override fun constituentsPerAggregate(constituentsPerAggregate: Number) {
        cdkBuilder.constituentsPerAggregate(constituentsPerAggregate)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty,
    ) : CdkObject(cdkObject), AggregateConfigurationProperty {
      /**
       * The list of aggregates that this volume resides on.
       *
       * Aggregates are storage pools which make up your primary storage tier. Each
       * high-availability (HA) pair has one aggregate. The names of the aggregates map to the names of
       * the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single
       * entry.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The strings in the value of `Aggregates` are not are not formatted as `aggrX` , where X
       * is a number between 1 and 6.
       * * The value of `Aggregates` contains aggregates that are not present.
       * * One or more of the aggregates supplied are too close to the volume limit to support
       * adding more volumes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-aggregateconfiguration.html#cfn-fsx-volume-aggregateconfiguration-aggregates)
       */
      override fun aggregates(): List<String> = unwrap(this).getAggregates() ?: emptyList()

      /**
       * Used to explicitly set the number of constituents within the FlexGroup per storage
       * aggregate.
       *
       * This field is optional when creating a FlexGroup volume. If unspecified, the default value
       * will be 8. This field cannot be provided when creating a FlexVol volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-aggregateconfiguration.html#cfn-fsx-volume-aggregateconfiguration-constituentsperaggregate)
       */
      override fun constituentsPerAggregate(): Number? = unwrap(this).getConstituentsPerAggregate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AggregateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty):
          AggregateConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AggregateConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty
    }
  }

  /**
   * The configuration to set the retention period of an FSx for ONTAP SnapLock volume.
   *
   * The retention period includes default, maximum, and minimum settings. For more information, see
   * [Working with the retention period in
   * SnapLock](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-retention.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * SnaplockRetentionPeriodProperty snaplockRetentionPeriodProperty =
   * SnaplockRetentionPeriodProperty.builder()
   * .defaultRetention(RetentionPeriodProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .value(123)
   * .build())
   * .maximumRetention(RetentionPeriodProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .value(123)
   * .build())
   * .minimumRetention(RetentionPeriodProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockretentionperiod.html)
   */
  public interface SnaplockRetentionPeriodProperty {
    /**
     * The retention period assigned to a write once, read many (WORM) file by default if an
     * explicit retention period is not set for an FSx for ONTAP SnapLock volume.
     *
     * The default retention period must be greater than or equal to the minimum retention period
     * and less than or equal to the maximum retention period.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockretentionperiod.html#cfn-fsx-volume-snaplockretentionperiod-defaultretention)
     */
    public fun defaultRetention(): Any

    /**
     * The longest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock
     * volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockretentionperiod.html#cfn-fsx-volume-snaplockretentionperiod-maximumretention)
     */
    public fun maximumRetention(): Any

    /**
     * The shortest retention period that can be assigned to a WORM file on an FSx for ONTAP
     * SnapLock volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockretentionperiod.html#cfn-fsx-volume-snaplockretentionperiod-minimumretention)
     */
    public fun minimumRetention(): Any

    /**
     * A builder for [SnaplockRetentionPeriodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultRetention The retention period assigned to a write once, read many (WORM)
       * file by default if an explicit retention period is not set for an FSx for ONTAP SnapLock
       * volume. 
       * The default retention period must be greater than or equal to the minimum retention period
       * and less than or equal to the maximum retention period.
       */
      public fun defaultRetention(defaultRetention: IResolvable)

      /**
       * @param defaultRetention The retention period assigned to a write once, read many (WORM)
       * file by default if an explicit retention period is not set for an FSx for ONTAP SnapLock
       * volume. 
       * The default retention period must be greater than or equal to the minimum retention period
       * and less than or equal to the maximum retention period.
       */
      public fun defaultRetention(defaultRetention: RetentionPeriodProperty)

      /**
       * @param defaultRetention The retention period assigned to a write once, read many (WORM)
       * file by default if an explicit retention period is not set for an FSx for ONTAP SnapLock
       * volume. 
       * The default retention period must be greater than or equal to the minimum retention period
       * and less than or equal to the maximum retention period.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a42a5037103ecf76c0a9f00ef8c2fe089b7914680cc04cda363796f099e8bd4")
      public fun defaultRetention(defaultRetention: RetentionPeriodProperty.Builder.() -> Unit)

      /**
       * @param maximumRetention The longest retention period that can be assigned to a WORM file on
       * an FSx for ONTAP SnapLock volume. 
       */
      public fun maximumRetention(maximumRetention: IResolvable)

      /**
       * @param maximumRetention The longest retention period that can be assigned to a WORM file on
       * an FSx for ONTAP SnapLock volume. 
       */
      public fun maximumRetention(maximumRetention: RetentionPeriodProperty)

      /**
       * @param maximumRetention The longest retention period that can be assigned to a WORM file on
       * an FSx for ONTAP SnapLock volume. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70d68515ae4f0204070f094fd7932b69f8841870d439504d18b4c3e586ee30a3")
      public fun maximumRetention(maximumRetention: RetentionPeriodProperty.Builder.() -> Unit)

      /**
       * @param minimumRetention The shortest retention period that can be assigned to a WORM file
       * on an FSx for ONTAP SnapLock volume. 
       */
      public fun minimumRetention(minimumRetention: IResolvable)

      /**
       * @param minimumRetention The shortest retention period that can be assigned to a WORM file
       * on an FSx for ONTAP SnapLock volume. 
       */
      public fun minimumRetention(minimumRetention: RetentionPeriodProperty)

      /**
       * @param minimumRetention The shortest retention period that can be assigned to a WORM file
       * on an FSx for ONTAP SnapLock volume. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b577d436edea2397c35c744ca0cfd12f57db380f6daeca18cf04497f22097758")
      public fun minimumRetention(minimumRetention: RetentionPeriodProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty.builder()

      /**
       * @param defaultRetention The retention period assigned to a write once, read many (WORM)
       * file by default if an explicit retention period is not set for an FSx for ONTAP SnapLock
       * volume. 
       * The default retention period must be greater than or equal to the minimum retention period
       * and less than or equal to the maximum retention period.
       */
      override fun defaultRetention(defaultRetention: IResolvable) {
        cdkBuilder.defaultRetention(defaultRetention.let(IResolvable::unwrap))
      }

      /**
       * @param defaultRetention The retention period assigned to a write once, read many (WORM)
       * file by default if an explicit retention period is not set for an FSx for ONTAP SnapLock
       * volume. 
       * The default retention period must be greater than or equal to the minimum retention period
       * and less than or equal to the maximum retention period.
       */
      override fun defaultRetention(defaultRetention: RetentionPeriodProperty) {
        cdkBuilder.defaultRetention(defaultRetention.let(RetentionPeriodProperty::unwrap))
      }

      /**
       * @param defaultRetention The retention period assigned to a write once, read many (WORM)
       * file by default if an explicit retention period is not set for an FSx for ONTAP SnapLock
       * volume. 
       * The default retention period must be greater than or equal to the minimum retention period
       * and less than or equal to the maximum retention period.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a42a5037103ecf76c0a9f00ef8c2fe089b7914680cc04cda363796f099e8bd4")
      override fun defaultRetention(defaultRetention: RetentionPeriodProperty.Builder.() -> Unit):
          Unit = defaultRetention(RetentionPeriodProperty(defaultRetention))

      /**
       * @param maximumRetention The longest retention period that can be assigned to a WORM file on
       * an FSx for ONTAP SnapLock volume. 
       */
      override fun maximumRetention(maximumRetention: IResolvable) {
        cdkBuilder.maximumRetention(maximumRetention.let(IResolvable::unwrap))
      }

      /**
       * @param maximumRetention The longest retention period that can be assigned to a WORM file on
       * an FSx for ONTAP SnapLock volume. 
       */
      override fun maximumRetention(maximumRetention: RetentionPeriodProperty) {
        cdkBuilder.maximumRetention(maximumRetention.let(RetentionPeriodProperty::unwrap))
      }

      /**
       * @param maximumRetention The longest retention period that can be assigned to a WORM file on
       * an FSx for ONTAP SnapLock volume. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70d68515ae4f0204070f094fd7932b69f8841870d439504d18b4c3e586ee30a3")
      override fun maximumRetention(maximumRetention: RetentionPeriodProperty.Builder.() -> Unit):
          Unit = maximumRetention(RetentionPeriodProperty(maximumRetention))

      /**
       * @param minimumRetention The shortest retention period that can be assigned to a WORM file
       * on an FSx for ONTAP SnapLock volume. 
       */
      override fun minimumRetention(minimumRetention: IResolvable) {
        cdkBuilder.minimumRetention(minimumRetention.let(IResolvable::unwrap))
      }

      /**
       * @param minimumRetention The shortest retention period that can be assigned to a WORM file
       * on an FSx for ONTAP SnapLock volume. 
       */
      override fun minimumRetention(minimumRetention: RetentionPeriodProperty) {
        cdkBuilder.minimumRetention(minimumRetention.let(RetentionPeriodProperty::unwrap))
      }

      /**
       * @param minimumRetention The shortest retention period that can be assigned to a WORM file
       * on an FSx for ONTAP SnapLock volume. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b577d436edea2397c35c744ca0cfd12f57db380f6daeca18cf04497f22097758")
      override fun minimumRetention(minimumRetention: RetentionPeriodProperty.Builder.() -> Unit):
          Unit = minimumRetention(RetentionPeriodProperty(minimumRetention))

      public fun build():
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty,
    ) : CdkObject(cdkObject), SnaplockRetentionPeriodProperty {
      /**
       * The retention period assigned to a write once, read many (WORM) file by default if an
       * explicit retention period is not set for an FSx for ONTAP SnapLock volume.
       *
       * The default retention period must be greater than or equal to the minimum retention period
       * and less than or equal to the maximum retention period.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockretentionperiod.html#cfn-fsx-volume-snaplockretentionperiod-defaultretention)
       */
      override fun defaultRetention(): Any = unwrap(this).getDefaultRetention()

      /**
       * The longest retention period that can be assigned to a WORM file on an FSx for ONTAP
       * SnapLock volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockretentionperiod.html#cfn-fsx-volume-snaplockretentionperiod-maximumretention)
       */
      override fun maximumRetention(): Any = unwrap(this).getMaximumRetention()

      /**
       * The shortest retention period that can be assigned to a WORM file on an FSx for ONTAP
       * SnapLock volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockretentionperiod.html#cfn-fsx-volume-snaplockretentionperiod-minimumretention)
       */
      override fun minimumRetention(): Any = unwrap(this).getMinimumRetention()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnaplockRetentionPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty):
          SnaplockRetentionPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnaplockRetentionPeriodProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty
    }
  }

  /**
   * Describes the data tiering policy for an ONTAP volume.
   *
   * When enabled, Amazon FSx for ONTAP's intelligent tiering automatically transitions a volume's
   * data between the file system's primary storage and capacity pool storage based on your access
   * patterns.
   *
   * Valid tiering policies are the following:
   *
   * * `SNAPSHOT_ONLY` - (Default value) moves cold snapshots to the capacity pool storage tier.
   * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on your
   * access patterns.
   * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to the
   * storage pool tier.
   * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being moved to
   * the capacity pool tier.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * TieringPolicyProperty tieringPolicyProperty = TieringPolicyProperty.builder()
   * .coolingPeriod(123)
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-tieringpolicy.html)
   */
  public interface TieringPolicyProperty {
    /**
     * Specifies the number of days that user data in a volume must remain inactive before it is
     * considered "cold" and moved to the capacity pool.
     *
     * Used with the `AUTO` and `SNAPSHOT_ONLY` tiering policies. Enter a whole number between 2 and
     * 183. Default values are 31 days for `AUTO` and 2 days for `SNAPSHOT_ONLY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-tieringpolicy.html#cfn-fsx-volume-tieringpolicy-coolingperiod)
     */
    public fun coolingPeriod(): Number? = unwrap(this).getCoolingPeriod()

    /**
     * Specifies the tiering policy used to transition data. Default value is `SNAPSHOT_ONLY` .
     *
     * * `SNAPSHOT_ONLY` - moves cold snapshots to the capacity pool storage tier.
     * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on your
     * access patterns.
     * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to
     * the storage pool tier.
     * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being moved
     * to the capacity pool tier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-tieringpolicy.html#cfn-fsx-volume-tieringpolicy-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [TieringPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param coolingPeriod Specifies the number of days that user data in a volume must remain
       * inactive before it is considered "cold" and moved to the capacity pool.
       * Used with the `AUTO` and `SNAPSHOT_ONLY` tiering policies. Enter a whole number between 2
       * and 183. Default values are 31 days for `AUTO` and 2 days for `SNAPSHOT_ONLY` .
       */
      public fun coolingPeriod(coolingPeriod: Number)

      /**
       * @param name Specifies the tiering policy used to transition data. Default value is
       * `SNAPSHOT_ONLY` .
       * * `SNAPSHOT_ONLY` - moves cold snapshots to the capacity pool storage tier.
       * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on
       * your access patterns.
       * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to
       * the storage pool tier.
       * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being
       * moved to the capacity pool tier.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty.builder()

      /**
       * @param coolingPeriod Specifies the number of days that user data in a volume must remain
       * inactive before it is considered "cold" and moved to the capacity pool.
       * Used with the `AUTO` and `SNAPSHOT_ONLY` tiering policies. Enter a whole number between 2
       * and 183. Default values are 31 days for `AUTO` and 2 days for `SNAPSHOT_ONLY` .
       */
      override fun coolingPeriod(coolingPeriod: Number) {
        cdkBuilder.coolingPeriod(coolingPeriod)
      }

      /**
       * @param name Specifies the tiering policy used to transition data. Default value is
       * `SNAPSHOT_ONLY` .
       * * `SNAPSHOT_ONLY` - moves cold snapshots to the capacity pool storage tier.
       * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on
       * your access patterns.
       * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to
       * the storage pool tier.
       * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being
       * moved to the capacity pool tier.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty,
    ) : CdkObject(cdkObject), TieringPolicyProperty {
      /**
       * Specifies the number of days that user data in a volume must remain inactive before it is
       * considered "cold" and moved to the capacity pool.
       *
       * Used with the `AUTO` and `SNAPSHOT_ONLY` tiering policies. Enter a whole number between 2
       * and 183. Default values are 31 days for `AUTO` and 2 days for `SNAPSHOT_ONLY` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-tieringpolicy.html#cfn-fsx-volume-tieringpolicy-coolingperiod)
       */
      override fun coolingPeriod(): Number? = unwrap(this).getCoolingPeriod()

      /**
       * Specifies the tiering policy used to transition data. Default value is `SNAPSHOT_ONLY` .
       *
       * * `SNAPSHOT_ONLY` - moves cold snapshots to the capacity pool storage tier.
       * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on
       * your access patterns.
       * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to
       * the storage pool tier.
       * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being
       * moved to the capacity pool tier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-tieringpolicy.html#cfn-fsx-volume-tieringpolicy-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TieringPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty):
          TieringPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TieringPolicyProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty
    }
  }

  /**
   * Specifies who can mount an OpenZFS file system and the options available while mounting the
   * file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * ClientConfigurationsProperty clientConfigurationsProperty =
   * ClientConfigurationsProperty.builder()
   * .clients("clients")
   * .options(List.of("options"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-clientconfigurations.html)
   */
  public interface ClientConfigurationsProperty {
    /**
     * A value that specifies who can mount the file system.
     *
     * You can provide a wildcard character ( `*` ), an IP address ( `0.0.0.0` ), or a CIDR address
     * ( `192.0.2.0/24` ). By default, Amazon FSx uses the wildcard character when specifying the
     * client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-clientconfigurations.html#cfn-fsx-volume-clientconfigurations-clients)
     */
    public fun clients(): String

    /**
     * The options to use when mounting the file system.
     *
     * For a list of options that you can use with Network File System (NFS), see the [exports(5) -
     * Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports) . When choosing
     * your options, consider the following:
     *
     * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
     * configuration, you won't be able to see or access snapshots in your file system's snapshot
     * directory.
     * * `sync` is used by default. If you instead specify `async` , the system acknowledges writes
     * before writing to disk. If the system crashes before the writes are finished, you lose the
     * unwritten data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-clientconfigurations.html#cfn-fsx-volume-clientconfigurations-options)
     */
    public fun options(): List<String>

    /**
     * A builder for [ClientConfigurationsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clients A value that specifies who can mount the file system. 
       * You can provide a wildcard character ( `*` ), an IP address ( `0.0.0.0` ), or a CIDR
       * address ( `192.0.2.0/24` ). By default, Amazon FSx uses the wildcard character when specifying
       * the client.
       */
      public fun clients(clients: String)

      /**
       * @param options The options to use when mounting the file system. 
       * For a list of options that you can use with Network File System (NFS), see the
       * [exports(5) - Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports)
       * . When choosing your options, consider the following:
       *
       * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
       * configuration, you won't be able to see or access snapshots in your file system's snapshot
       * directory.
       * * `sync` is used by default. If you instead specify `async` , the system acknowledges
       * writes before writing to disk. If the system crashes before the writes are finished, you lose
       * the unwritten data.
       */
      public fun options(options: List<String>)

      /**
       * @param options The options to use when mounting the file system. 
       * For a list of options that you can use with Network File System (NFS), see the
       * [exports(5) - Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports)
       * . When choosing your options, consider the following:
       *
       * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
       * configuration, you won't be able to see or access snapshots in your file system's snapshot
       * directory.
       * * `sync` is used by default. If you instead specify `async` , the system acknowledges
       * writes before writing to disk. If the system crashes before the writes are finished, you lose
       * the unwritten data.
       */
      public fun options(vararg options: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty.builder()

      /**
       * @param clients A value that specifies who can mount the file system. 
       * You can provide a wildcard character ( `*` ), an IP address ( `0.0.0.0` ), or a CIDR
       * address ( `192.0.2.0/24` ). By default, Amazon FSx uses the wildcard character when specifying
       * the client.
       */
      override fun clients(clients: String) {
        cdkBuilder.clients(clients)
      }

      /**
       * @param options The options to use when mounting the file system. 
       * For a list of options that you can use with Network File System (NFS), see the
       * [exports(5) - Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports)
       * . When choosing your options, consider the following:
       *
       * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
       * configuration, you won't be able to see or access snapshots in your file system's snapshot
       * directory.
       * * `sync` is used by default. If you instead specify `async` , the system acknowledges
       * writes before writing to disk. If the system crashes before the writes are finished, you lose
       * the unwritten data.
       */
      override fun options(options: List<String>) {
        cdkBuilder.options(options)
      }

      /**
       * @param options The options to use when mounting the file system. 
       * For a list of options that you can use with Network File System (NFS), see the
       * [exports(5) - Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports)
       * . When choosing your options, consider the following:
       *
       * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
       * configuration, you won't be able to see or access snapshots in your file system's snapshot
       * directory.
       * * `sync` is used by default. If you instead specify `async` , the system acknowledges
       * writes before writing to disk. If the system crashes before the writes are finished, you lose
       * the unwritten data.
       */
      override fun options(vararg options: String): Unit = options(options.toList())

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty,
    ) : CdkObject(cdkObject), ClientConfigurationsProperty {
      /**
       * A value that specifies who can mount the file system.
       *
       * You can provide a wildcard character ( `*` ), an IP address ( `0.0.0.0` ), or a CIDR
       * address ( `192.0.2.0/24` ). By default, Amazon FSx uses the wildcard character when specifying
       * the client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-clientconfigurations.html#cfn-fsx-volume-clientconfigurations-clients)
       */
      override fun clients(): String = unwrap(this).getClients()

      /**
       * The options to use when mounting the file system.
       *
       * For a list of options that you can use with Network File System (NFS), see the
       * [exports(5) - Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports)
       * . When choosing your options, consider the following:
       *
       * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
       * configuration, you won't be able to see or access snapshots in your file system's snapshot
       * directory.
       * * `sync` is used by default. If you instead specify `async` , the system acknowledges
       * writes before writing to disk. If the system crashes before the writes are finished, you lose
       * the unwritten data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-clientconfigurations.html#cfn-fsx-volume-clientconfigurations-options)
       */
      override fun options(): List<String> = unwrap(this).getOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClientConfigurationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty):
          ClientConfigurationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientConfigurationsProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty
    }
  }

  /**
   * Configures how much storage users and groups can use on the volume.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * UserAndGroupQuotasProperty userAndGroupQuotasProperty = UserAndGroupQuotasProperty.builder()
   * .id(123)
   * .storageCapacityQuotaGiB(123)
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-userandgroupquotas.html)
   */
  public interface UserAndGroupQuotasProperty {
    /**
     * The ID of the user or group that the quota applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-userandgroupquotas.html#cfn-fsx-volume-userandgroupquotas-id)
     */
    public fun id(): Number

    /**
     * The user or group's storage quota, in gibibytes (GiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-userandgroupquotas.html#cfn-fsx-volume-userandgroupquotas-storagecapacityquotagib)
     */
    public fun storageCapacityQuotaGiB(): Number

    /**
     * Specifies whether the quota applies to a user or group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-userandgroupquotas.html#cfn-fsx-volume-userandgroupquotas-type)
     */
    public fun type(): String

    /**
     * A builder for [UserAndGroupQuotasProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The ID of the user or group that the quota applies to. 
       */
      public fun id(id: Number)

      /**
       * @param storageCapacityQuotaGiB The user or group's storage quota, in gibibytes (GiB). 
       */
      public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number)

      /**
       * @param type Specifies whether the quota applies to a user or group. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty.builder()

      /**
       * @param id The ID of the user or group that the quota applies to. 
       */
      override fun id(id: Number) {
        cdkBuilder.id(id)
      }

      /**
       * @param storageCapacityQuotaGiB The user or group's storage quota, in gibibytes (GiB). 
       */
      override fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
        cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
      }

      /**
       * @param type Specifies whether the quota applies to a user or group. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty,
    ) : CdkObject(cdkObject), UserAndGroupQuotasProperty {
      /**
       * The ID of the user or group that the quota applies to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-userandgroupquotas.html#cfn-fsx-volume-userandgroupquotas-id)
       */
      override fun id(): Number = unwrap(this).getId()

      /**
       * The user or group's storage quota, in gibibytes (GiB).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-userandgroupquotas.html#cfn-fsx-volume-userandgroupquotas-storagecapacityquotagib)
       */
      override fun storageCapacityQuotaGiB(): Number = unwrap(this).getStorageCapacityQuotaGiB()

      /**
       * Specifies whether the quota applies to a user or group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-userandgroupquotas.html#cfn-fsx-volume-userandgroupquotas-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserAndGroupQuotasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty):
          UserAndGroupQuotasProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserAndGroupQuotasProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty
    }
  }

  /**
   * The configuration object that specifies the snapshot to use as the origin of the data for the
   * volume.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * OriginSnapshotProperty originSnapshotProperty = OriginSnapshotProperty.builder()
   * .copyStrategy("copyStrategy")
   * .snapshotArn("snapshotArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-originsnapshot.html)
   */
  public interface OriginSnapshotProperty {
    /**
     * Specifies the strategy used when copying data from the snapshot to the new volume.
     *
     * * `CLONE` - The new volume references the data in the origin snapshot. Cloning a snapshot is
     * faster than copying data from the snapshot to a new volume and doesn't consume disk throughput.
     * However, the origin snapshot can't be deleted if there is a volume using its copied data.
     * * `FULL_COPY` - Copies all data from the snapshot to the new volume.
     *
     * Specify this option to create the volume from a snapshot on another FSx for OpenZFS file
     * system.
     *
     *
     * The `INCREMENTAL_COPY` option is only for updating an existing volume by using a snapshot
     * from another FSx for OpenZFS file system. For more information, see
     * [CopySnapshotAndUpdateVolume](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CopySnapshotAndUpdateVolume.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-originsnapshot.html#cfn-fsx-volume-originsnapshot-copystrategy)
     */
    public fun copyStrategy(): String

    /**
     * Specifies the snapshot to use when creating an OpenZFS volume from a snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-originsnapshot.html#cfn-fsx-volume-originsnapshot-snapshotarn)
     */
    public fun snapshotArn(): String

    /**
     * A builder for [OriginSnapshotProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param copyStrategy Specifies the strategy used when copying data from the snapshot to the
       * new volume. 
       * * `CLONE` - The new volume references the data in the origin snapshot. Cloning a snapshot
       * is faster than copying data from the snapshot to a new volume and doesn't consume disk
       * throughput. However, the origin snapshot can't be deleted if there is a volume using its
       * copied data.
       * * `FULL_COPY` - Copies all data from the snapshot to the new volume.
       *
       * Specify this option to create the volume from a snapshot on another FSx for OpenZFS file
       * system.
       *
       *
       * The `INCREMENTAL_COPY` option is only for updating an existing volume by using a snapshot
       * from another FSx for OpenZFS file system. For more information, see
       * [CopySnapshotAndUpdateVolume](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CopySnapshotAndUpdateVolume.html)
       * .
       */
      public fun copyStrategy(copyStrategy: String)

      /**
       * @param snapshotArn Specifies the snapshot to use when creating an OpenZFS volume from a
       * snapshot. 
       */
      public fun snapshotArn(snapshotArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty.builder()

      /**
       * @param copyStrategy Specifies the strategy used when copying data from the snapshot to the
       * new volume. 
       * * `CLONE` - The new volume references the data in the origin snapshot. Cloning a snapshot
       * is faster than copying data from the snapshot to a new volume and doesn't consume disk
       * throughput. However, the origin snapshot can't be deleted if there is a volume using its
       * copied data.
       * * `FULL_COPY` - Copies all data from the snapshot to the new volume.
       *
       * Specify this option to create the volume from a snapshot on another FSx for OpenZFS file
       * system.
       *
       *
       * The `INCREMENTAL_COPY` option is only for updating an existing volume by using a snapshot
       * from another FSx for OpenZFS file system. For more information, see
       * [CopySnapshotAndUpdateVolume](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CopySnapshotAndUpdateVolume.html)
       * .
       */
      override fun copyStrategy(copyStrategy: String) {
        cdkBuilder.copyStrategy(copyStrategy)
      }

      /**
       * @param snapshotArn Specifies the snapshot to use when creating an OpenZFS volume from a
       * snapshot. 
       */
      override fun snapshotArn(snapshotArn: String) {
        cdkBuilder.snapshotArn(snapshotArn)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty,
    ) : CdkObject(cdkObject), OriginSnapshotProperty {
      /**
       * Specifies the strategy used when copying data from the snapshot to the new volume.
       *
       * * `CLONE` - The new volume references the data in the origin snapshot. Cloning a snapshot
       * is faster than copying data from the snapshot to a new volume and doesn't consume disk
       * throughput. However, the origin snapshot can't be deleted if there is a volume using its
       * copied data.
       * * `FULL_COPY` - Copies all data from the snapshot to the new volume.
       *
       * Specify this option to create the volume from a snapshot on another FSx for OpenZFS file
       * system.
       *
       *
       * The `INCREMENTAL_COPY` option is only for updating an existing volume by using a snapshot
       * from another FSx for OpenZFS file system. For more information, see
       * [CopySnapshotAndUpdateVolume](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CopySnapshotAndUpdateVolume.html)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-originsnapshot.html#cfn-fsx-volume-originsnapshot-copystrategy)
       */
      override fun copyStrategy(): String = unwrap(this).getCopyStrategy()

      /**
       * Specifies the snapshot to use when creating an OpenZFS volume from a snapshot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-originsnapshot.html#cfn-fsx-volume-originsnapshot-snapshotarn)
       */
      override fun snapshotArn(): String = unwrap(this).getSnapshotArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OriginSnapshotProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty):
          OriginSnapshotProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginSnapshotProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty
    }
  }

  /**
   * Specifies the retention period of an FSx for ONTAP SnapLock volume.
   *
   * After it is set, it can't be changed. Files can't be deleted or modified during the retention
   * period.
   *
   * For more information, see [Working with the retention period in
   * SnapLock](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-retention.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * RetentionPeriodProperty retentionPeriodProperty = RetentionPeriodProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-retentionperiod.html)
   */
  public interface RetentionPeriodProperty {
    /**
     * Defines the type of time for the retention period of an FSx for ONTAP SnapLock volume.
     *
     * Set it to one of the valid types. If you set it to `INFINITE` , the files are retained
     * forever. If you set it to `UNSPECIFIED` , the files are retained until you set an explicit
     * retention period.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-retentionperiod.html#cfn-fsx-volume-retentionperiod-type)
     */
    public fun type(): String

    /**
     * Defines the amount of time for the retention period of an FSx for ONTAP SnapLock volume.
     *
     * You can't set a value for `INFINITE` or `UNSPECIFIED` . For all other options, the following
     * ranges are valid:
     *
     * * `Seconds` : 0 - 65,535
     * * `Minutes` : 0 - 65,535
     * * `Hours` : 0 - 24
     * * `Days` : 0 - 365
     * * `Months` : 0 - 12
     * * `Years` : 0 - 100
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-retentionperiod.html#cfn-fsx-volume-retentionperiod-value)
     */
    public fun `value`(): Number? = unwrap(this).getValue()

    /**
     * A builder for [RetentionPeriodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type Defines the type of time for the retention period of an FSx for ONTAP SnapLock
       * volume. 
       * Set it to one of the valid types. If you set it to `INFINITE` , the files are retained
       * forever. If you set it to `UNSPECIFIED` , the files are retained until you set an explicit
       * retention period.
       */
      public fun type(type: String)

      /**
       * @param value Defines the amount of time for the retention period of an FSx for ONTAP
       * SnapLock volume.
       * You can't set a value for `INFINITE` or `UNSPECIFIED` . For all other options, the
       * following ranges are valid:
       *
       * * `Seconds` : 0 - 65,535
       * * `Minutes` : 0 - 65,535
       * * `Hours` : 0 - 24
       * * `Days` : 0 - 365
       * * `Months` : 0 - 12
       * * `Years` : 0 - 100
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty.builder()

      /**
       * @param type Defines the type of time for the retention period of an FSx for ONTAP SnapLock
       * volume. 
       * Set it to one of the valid types. If you set it to `INFINITE` , the files are retained
       * forever. If you set it to `UNSPECIFIED` , the files are retained until you set an explicit
       * retention period.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value Defines the amount of time for the retention period of an FSx for ONTAP
       * SnapLock volume.
       * You can't set a value for `INFINITE` or `UNSPECIFIED` . For all other options, the
       * following ranges are valid:
       *
       * * `Seconds` : 0 - 65,535
       * * `Minutes` : 0 - 65,535
       * * `Hours` : 0 - 24
       * * `Days` : 0 - 365
       * * `Months` : 0 - 12
       * * `Years` : 0 - 100
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty,
    ) : CdkObject(cdkObject), RetentionPeriodProperty {
      /**
       * Defines the type of time for the retention period of an FSx for ONTAP SnapLock volume.
       *
       * Set it to one of the valid types. If you set it to `INFINITE` , the files are retained
       * forever. If you set it to `UNSPECIFIED` , the files are retained until you set an explicit
       * retention period.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-retentionperiod.html#cfn-fsx-volume-retentionperiod-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * Defines the amount of time for the retention period of an FSx for ONTAP SnapLock volume.
       *
       * You can't set a value for `INFINITE` or `UNSPECIFIED` . For all other options, the
       * following ranges are valid:
       *
       * * `Seconds` : 0 - 65,535
       * * `Minutes` : 0 - 65,535
       * * `Hours` : 0 - 24
       * * `Days` : 0 - 365
       * * `Months` : 0 - 12
       * * `Years` : 0 - 100
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-retentionperiod.html#cfn-fsx-volume-retentionperiod-value)
       */
      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty):
          RetentionPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionPeriodProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty
    }
  }

  /**
   * Sets the autocommit period of files in an FSx for ONTAP SnapLock volume, which determines how
   * long the files must remain unmodified before they're automatically transitioned to the write once,
   * read many (WORM) state.
   *
   * For more information, see
   * [Autocommit](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-autocommit)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * AutocommitPeriodProperty autocommitPeriodProperty = AutocommitPeriodProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-autocommitperiod.html)
   */
  public interface AutocommitPeriodProperty {
    /**
     * Defines the type of time for the autocommit period of a file in an FSx for ONTAP SnapLock
     * volume.
     *
     * Setting this value to `NONE` disables autocommit. The default value is `NONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-autocommitperiod.html#cfn-fsx-volume-autocommitperiod-type)
     */
    public fun type(): String

    /**
     * Defines the amount of time for the autocommit period of a file in an FSx for ONTAP SnapLock
     * volume.
     *
     * The following ranges are valid:
     *
     * * `Minutes` : 5 - 65,535
     * * `Hours` : 1 - 65,535
     * * `Days` : 1 - 3,650
     * * `Months` : 1 - 120
     * * `Years` : 1 - 10
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-autocommitperiod.html#cfn-fsx-volume-autocommitperiod-value)
     */
    public fun `value`(): Number? = unwrap(this).getValue()

    /**
     * A builder for [AutocommitPeriodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type Defines the type of time for the autocommit period of a file in an FSx for
       * ONTAP SnapLock volume. 
       * Setting this value to `NONE` disables autocommit. The default value is `NONE` .
       */
      public fun type(type: String)

      /**
       * @param value Defines the amount of time for the autocommit period of a file in an FSx for
       * ONTAP SnapLock volume.
       * The following ranges are valid:
       *
       * * `Minutes` : 5 - 65,535
       * * `Hours` : 1 - 65,535
       * * `Days` : 1 - 3,650
       * * `Months` : 1 - 120
       * * `Years` : 1 - 10
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty.builder()

      /**
       * @param type Defines the type of time for the autocommit period of a file in an FSx for
       * ONTAP SnapLock volume. 
       * Setting this value to `NONE` disables autocommit. The default value is `NONE` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value Defines the amount of time for the autocommit period of a file in an FSx for
       * ONTAP SnapLock volume.
       * The following ranges are valid:
       *
       * * `Minutes` : 5 - 65,535
       * * `Hours` : 1 - 65,535
       * * `Days` : 1 - 3,650
       * * `Months` : 1 - 120
       * * `Years` : 1 - 10
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty,
    ) : CdkObject(cdkObject), AutocommitPeriodProperty {
      /**
       * Defines the type of time for the autocommit period of a file in an FSx for ONTAP SnapLock
       * volume.
       *
       * Setting this value to `NONE` disables autocommit. The default value is `NONE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-autocommitperiod.html#cfn-fsx-volume-autocommitperiod-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * Defines the amount of time for the autocommit period of a file in an FSx for ONTAP SnapLock
       * volume.
       *
       * The following ranges are valid:
       *
       * * `Minutes` : 5 - 65,535
       * * `Hours` : 1 - 65,535
       * * `Days` : 1 - 3,650
       * * `Months` : 1 - 120
       * * `Years` : 1 - 10
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-autocommitperiod.html#cfn-fsx-volume-autocommitperiod-value)
       */
      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutocommitPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty):
          AutocommitPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutocommitPeriodProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty
    }
  }

  /**
   * Specifies the configuration of the Amazon FSx for OpenZFS volume that you are creating.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * OpenZFSConfigurationProperty openZFSConfigurationProperty =
   * OpenZFSConfigurationProperty.builder()
   * .parentVolumeId("parentVolumeId")
   * // the properties below are optional
   * .copyTagsToSnapshots(false)
   * .dataCompressionType("dataCompressionType")
   * .nfsExports(List.of(NfsExportsProperty.builder()
   * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
   * .clients("clients")
   * .options(List.of("options"))
   * .build()))
   * .build()))
   * .options(List.of("options"))
   * .originSnapshot(OriginSnapshotProperty.builder()
   * .copyStrategy("copyStrategy")
   * .snapshotArn("snapshotArn")
   * .build())
   * .readOnly(false)
   * .recordSizeKiB(123)
   * .storageCapacityQuotaGiB(123)
   * .storageCapacityReservationGiB(123)
   * .userAndGroupQuotas(List.of(UserAndGroupQuotasProperty.builder()
   * .id(123)
   * .storageCapacityQuotaGiB(123)
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html)
   */
  public interface OpenZFSConfigurationProperty {
    /**
     * A Boolean value indicating whether tags for the volume should be copied to snapshots.
     *
     * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied
     * to snapshots where the user doesn't specify tags. If this value is `true` , and you specify one
     * or more tags, only the specified tags are copied to snapshots. If you specify one or more tags
     * when creating the snapshot, no tags are copied from the volume, regardless of this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-copytagstosnapshots)
     */
    public fun copyTagsToSnapshots(): Any? = unwrap(this).getCopyTagsToSnapshots()

    /**
     * Specifies the method used to compress the data on the volume. The compression type is `NONE`
     * by default.
     *
     * * `NONE` - Doesn't compress the data on the volume. `NONE` is the default.
     * * `ZSTD` - Compresses the data in the volume using the Zstandard (ZSTD) compression
     * algorithm. Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk
     * storage utilization.
     * * `LZ4` - Compresses the data in the volume using the LZ4 compression algorithm. Compared to
     * Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-datacompressiontype)
     */
    public fun dataCompressionType(): String? = unwrap(this).getDataCompressionType()

    /**
     * The configuration object for mounting a Network File System (NFS) file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-nfsexports)
     */
    public fun nfsExports(): Any? = unwrap(this).getNfsExports()

    /**
     * To delete the volume's child volumes, snapshots, and clones, use the string
     * `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-options)
     */
    public fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()

    /**
     * The configuration object that specifies the snapshot to use as the origin of the data for the
     * volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-originsnapshot)
     */
    public fun originSnapshot(): Any? = unwrap(this).getOriginSnapshot()

    /**
     * The ID of the volume to use as the parent volume of the volume that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-parentvolumeid)
     */
    public fun parentVolumeId(): String

    /**
     * A Boolean value indicating whether the volume is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-readonly)
     */
    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    /**
     * Specifies the suggested block size for a volume in a ZFS dataset, in kibibytes (KiB).
     *
     * Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. We
     * recommend using the default setting for the majority of use cases. Generally, workloads that
     * write in fixed small or large record sizes may benefit from setting a custom record size, like
     * database workloads (small record size) or media streaming workloads (large record size). For
     * additional guidance on when to set a custom record size, see [ZFS Record
     * size](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#record-size-performance)
     * in the *Amazon FSx for OpenZFS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-recordsizekib)
     */
    public fun recordSizeKiB(): Number? = unwrap(this).getRecordSizeKiB()

    /**
     * Sets the maximum storage size in gibibytes (GiB) for the volume.
     *
     * You can specify a quota that is larger than the storage on the parent volume. A volume quota
     * limits the amount of storage that the volume can consume to the configured amount, but does not
     * guarantee the space will be available on the parent volume. To guarantee quota space, you must
     * also set `StorageCapacityReservationGiB` . To *not* specify a storage capacity quota, set this
     * to `-1` .
     *
     * For more information, see [Volume
     * properties](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties)
     * in the *Amazon FSx for OpenZFS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-storagecapacityquotagib)
     */
    public fun storageCapacityQuotaGiB(): Number? = unwrap(this).getStorageCapacityQuotaGiB()

    /**
     * Specifies the amount of storage in gibibytes (GiB) to reserve from the parent volume.
     *
     * Setting `StorageCapacityReservationGiB` guarantees that the specified amount of storage space
     * on the parent volume will always be available for the volume. You can't reserve more storage
     * than the parent volume has. To *not* specify a storage capacity reservation, set this to `0` or
     * `-1` . For more information, see [Volume
     * properties](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties)
     * in the *Amazon FSx for OpenZFS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-storagecapacityreservationgib)
     */
    public fun storageCapacityReservationGiB(): Number? =
        unwrap(this).getStorageCapacityReservationGiB()

    /**
     * Configures how much storage users and groups can use on the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-userandgroupquotas)
     */
    public fun userAndGroupQuotas(): Any? = unwrap(this).getUserAndGroupQuotas()

    /**
     * A builder for [OpenZFSConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param copyTagsToSnapshots A Boolean value indicating whether tags for the volume should be
       * copied to snapshots.
       * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied
       * to snapshots where the user doesn't specify tags. If this value is `true` , and you specify
       * one or more tags, only the specified tags are copied to snapshots. If you specify one or more
       * tags when creating the snapshot, no tags are copied from the volume, regardless of this value.
       */
      public fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean)

      /**
       * @param copyTagsToSnapshots A Boolean value indicating whether tags for the volume should be
       * copied to snapshots.
       * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied
       * to snapshots where the user doesn't specify tags. If this value is `true` , and you specify
       * one or more tags, only the specified tags are copied to snapshots. If you specify one or more
       * tags when creating the snapshot, no tags are copied from the volume, regardless of this value.
       */
      public fun copyTagsToSnapshots(copyTagsToSnapshots: IResolvable)

      /**
       * @param dataCompressionType Specifies the method used to compress the data on the volume.
       * The compression type is `NONE` by default.
       * * `NONE` - Doesn't compress the data on the volume. `NONE` is the default.
       * * `ZSTD` - Compresses the data in the volume using the Zstandard (ZSTD) compression
       * algorithm. Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk
       * storage utilization.
       * * `LZ4` - Compresses the data in the volume using the LZ4 compression algorithm. Compared
       * to Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
       */
      public fun dataCompressionType(dataCompressionType: String)

      /**
       * @param nfsExports The configuration object for mounting a Network File System (NFS) file
       * system.
       */
      public fun nfsExports(nfsExports: IResolvable)

      /**
       * @param nfsExports The configuration object for mounting a Network File System (NFS) file
       * system.
       */
      public fun nfsExports(nfsExports: List<Any>)

      /**
       * @param nfsExports The configuration object for mounting a Network File System (NFS) file
       * system.
       */
      public fun nfsExports(vararg nfsExports: Any)

      /**
       * @param options To delete the volume's child volumes, snapshots, and clones, use the string
       * `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
       */
      public fun options(options: List<String>)

      /**
       * @param options To delete the volume's child volumes, snapshots, and clones, use the string
       * `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
       */
      public fun options(vararg options: String)

      /**
       * @param originSnapshot The configuration object that specifies the snapshot to use as the
       * origin of the data for the volume.
       */
      public fun originSnapshot(originSnapshot: IResolvable)

      /**
       * @param originSnapshot The configuration object that specifies the snapshot to use as the
       * origin of the data for the volume.
       */
      public fun originSnapshot(originSnapshot: OriginSnapshotProperty)

      /**
       * @param originSnapshot The configuration object that specifies the snapshot to use as the
       * origin of the data for the volume.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc249c4485e28a5183f8f7c874ed1490b18c693d1ab99d945c20696f0af2a6cf")
      public fun originSnapshot(originSnapshot: OriginSnapshotProperty.Builder.() -> Unit)

      /**
       * @param parentVolumeId The ID of the volume to use as the parent volume of the volume that
       * you are creating. 
       */
      public fun parentVolumeId(parentVolumeId: String)

      /**
       * @param readOnly A Boolean value indicating whether the volume is read-only.
       */
      public fun readOnly(readOnly: Boolean)

      /**
       * @param readOnly A Boolean value indicating whether the volume is read-only.
       */
      public fun readOnly(readOnly: IResolvable)

      /**
       * @param recordSizeKiB Specifies the suggested block size for a volume in a ZFS dataset, in
       * kibibytes (KiB).
       * Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. We
       * recommend using the default setting for the majority of use cases. Generally, workloads that
       * write in fixed small or large record sizes may benefit from setting a custom record size, like
       * database workloads (small record size) or media streaming workloads (large record size). For
       * additional guidance on when to set a custom record size, see [ZFS Record
       * size](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#record-size-performance)
       * in the *Amazon FSx for OpenZFS User Guide* .
       */
      public fun recordSizeKiB(recordSizeKiB: Number)

      /**
       * @param storageCapacityQuotaGiB Sets the maximum storage size in gibibytes (GiB) for the
       * volume.
       * You can specify a quota that is larger than the storage on the parent volume. A volume
       * quota limits the amount of storage that the volume can consume to the configured amount, but
       * does not guarantee the space will be available on the parent volume. To guarantee quota space,
       * you must also set `StorageCapacityReservationGiB` . To *not* specify a storage capacity quota,
       * set this to `-1` .
       *
       * For more information, see [Volume
       * properties](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties)
       * in the *Amazon FSx for OpenZFS User Guide* .
       */
      public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number)

      /**
       * @param storageCapacityReservationGiB Specifies the amount of storage in gibibytes (GiB) to
       * reserve from the parent volume.
       * Setting `StorageCapacityReservationGiB` guarantees that the specified amount of storage
       * space on the parent volume will always be available for the volume. You can't reserve more
       * storage than the parent volume has. To *not* specify a storage capacity reservation, set this
       * to `0` or `-1` . For more information, see [Volume
       * properties](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties)
       * in the *Amazon FSx for OpenZFS User Guide* .
       */
      public fun storageCapacityReservationGiB(storageCapacityReservationGiB: Number)

      /**
       * @param userAndGroupQuotas Configures how much storage users and groups can use on the
       * volume.
       */
      public fun userAndGroupQuotas(userAndGroupQuotas: IResolvable)

      /**
       * @param userAndGroupQuotas Configures how much storage users and groups can use on the
       * volume.
       */
      public fun userAndGroupQuotas(userAndGroupQuotas: List<Any>)

      /**
       * @param userAndGroupQuotas Configures how much storage users and groups can use on the
       * volume.
       */
      public fun userAndGroupQuotas(vararg userAndGroupQuotas: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty.builder()

      /**
       * @param copyTagsToSnapshots A Boolean value indicating whether tags for the volume should be
       * copied to snapshots.
       * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied
       * to snapshots where the user doesn't specify tags. If this value is `true` , and you specify
       * one or more tags, only the specified tags are copied to snapshots. If you specify one or more
       * tags when creating the snapshot, no tags are copied from the volume, regardless of this value.
       */
      override fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean) {
        cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots)
      }

      /**
       * @param copyTagsToSnapshots A Boolean value indicating whether tags for the volume should be
       * copied to snapshots.
       * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied
       * to snapshots where the user doesn't specify tags. If this value is `true` , and you specify
       * one or more tags, only the specified tags are copied to snapshots. If you specify one or more
       * tags when creating the snapshot, no tags are copied from the volume, regardless of this value.
       */
      override fun copyTagsToSnapshots(copyTagsToSnapshots: IResolvable) {
        cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots.let(IResolvable::unwrap))
      }

      /**
       * @param dataCompressionType Specifies the method used to compress the data on the volume.
       * The compression type is `NONE` by default.
       * * `NONE` - Doesn't compress the data on the volume. `NONE` is the default.
       * * `ZSTD` - Compresses the data in the volume using the Zstandard (ZSTD) compression
       * algorithm. Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk
       * storage utilization.
       * * `LZ4` - Compresses the data in the volume using the LZ4 compression algorithm. Compared
       * to Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
       */
      override fun dataCompressionType(dataCompressionType: String) {
        cdkBuilder.dataCompressionType(dataCompressionType)
      }

      /**
       * @param nfsExports The configuration object for mounting a Network File System (NFS) file
       * system.
       */
      override fun nfsExports(nfsExports: IResolvable) {
        cdkBuilder.nfsExports(nfsExports.let(IResolvable::unwrap))
      }

      /**
       * @param nfsExports The configuration object for mounting a Network File System (NFS) file
       * system.
       */
      override fun nfsExports(nfsExports: List<Any>) {
        cdkBuilder.nfsExports(nfsExports)
      }

      /**
       * @param nfsExports The configuration object for mounting a Network File System (NFS) file
       * system.
       */
      override fun nfsExports(vararg nfsExports: Any): Unit = nfsExports(nfsExports.toList())

      /**
       * @param options To delete the volume's child volumes, snapshots, and clones, use the string
       * `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
       */
      override fun options(options: List<String>) {
        cdkBuilder.options(options)
      }

      /**
       * @param options To delete the volume's child volumes, snapshots, and clones, use the string
       * `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
       */
      override fun options(vararg options: String): Unit = options(options.toList())

      /**
       * @param originSnapshot The configuration object that specifies the snapshot to use as the
       * origin of the data for the volume.
       */
      override fun originSnapshot(originSnapshot: IResolvable) {
        cdkBuilder.originSnapshot(originSnapshot.let(IResolvable::unwrap))
      }

      /**
       * @param originSnapshot The configuration object that specifies the snapshot to use as the
       * origin of the data for the volume.
       */
      override fun originSnapshot(originSnapshot: OriginSnapshotProperty) {
        cdkBuilder.originSnapshot(originSnapshot.let(OriginSnapshotProperty::unwrap))
      }

      /**
       * @param originSnapshot The configuration object that specifies the snapshot to use as the
       * origin of the data for the volume.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc249c4485e28a5183f8f7c874ed1490b18c693d1ab99d945c20696f0af2a6cf")
      override fun originSnapshot(originSnapshot: OriginSnapshotProperty.Builder.() -> Unit): Unit =
          originSnapshot(OriginSnapshotProperty(originSnapshot))

      /**
       * @param parentVolumeId The ID of the volume to use as the parent volume of the volume that
       * you are creating. 
       */
      override fun parentVolumeId(parentVolumeId: String) {
        cdkBuilder.parentVolumeId(parentVolumeId)
      }

      /**
       * @param readOnly A Boolean value indicating whether the volume is read-only.
       */
      override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      /**
       * @param readOnly A Boolean value indicating whether the volume is read-only.
       */
      override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      /**
       * @param recordSizeKiB Specifies the suggested block size for a volume in a ZFS dataset, in
       * kibibytes (KiB).
       * Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. We
       * recommend using the default setting for the majority of use cases. Generally, workloads that
       * write in fixed small or large record sizes may benefit from setting a custom record size, like
       * database workloads (small record size) or media streaming workloads (large record size). For
       * additional guidance on when to set a custom record size, see [ZFS Record
       * size](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#record-size-performance)
       * in the *Amazon FSx for OpenZFS User Guide* .
       */
      override fun recordSizeKiB(recordSizeKiB: Number) {
        cdkBuilder.recordSizeKiB(recordSizeKiB)
      }

      /**
       * @param storageCapacityQuotaGiB Sets the maximum storage size in gibibytes (GiB) for the
       * volume.
       * You can specify a quota that is larger than the storage on the parent volume. A volume
       * quota limits the amount of storage that the volume can consume to the configured amount, but
       * does not guarantee the space will be available on the parent volume. To guarantee quota space,
       * you must also set `StorageCapacityReservationGiB` . To *not* specify a storage capacity quota,
       * set this to `-1` .
       *
       * For more information, see [Volume
       * properties](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties)
       * in the *Amazon FSx for OpenZFS User Guide* .
       */
      override fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
        cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
      }

      /**
       * @param storageCapacityReservationGiB Specifies the amount of storage in gibibytes (GiB) to
       * reserve from the parent volume.
       * Setting `StorageCapacityReservationGiB` guarantees that the specified amount of storage
       * space on the parent volume will always be available for the volume. You can't reserve more
       * storage than the parent volume has. To *not* specify a storage capacity reservation, set this
       * to `0` or `-1` . For more information, see [Volume
       * properties](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties)
       * in the *Amazon FSx for OpenZFS User Guide* .
       */
      override fun storageCapacityReservationGiB(storageCapacityReservationGiB: Number) {
        cdkBuilder.storageCapacityReservationGiB(storageCapacityReservationGiB)
      }

      /**
       * @param userAndGroupQuotas Configures how much storage users and groups can use on the
       * volume.
       */
      override fun userAndGroupQuotas(userAndGroupQuotas: IResolvable) {
        cdkBuilder.userAndGroupQuotas(userAndGroupQuotas.let(IResolvable::unwrap))
      }

      /**
       * @param userAndGroupQuotas Configures how much storage users and groups can use on the
       * volume.
       */
      override fun userAndGroupQuotas(userAndGroupQuotas: List<Any>) {
        cdkBuilder.userAndGroupQuotas(userAndGroupQuotas)
      }

      /**
       * @param userAndGroupQuotas Configures how much storage users and groups can use on the
       * volume.
       */
      override fun userAndGroupQuotas(vararg userAndGroupQuotas: Any): Unit =
          userAndGroupQuotas(userAndGroupQuotas.toList())

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty,
    ) : CdkObject(cdkObject), OpenZFSConfigurationProperty {
      /**
       * A Boolean value indicating whether tags for the volume should be copied to snapshots.
       *
       * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied
       * to snapshots where the user doesn't specify tags. If this value is `true` , and you specify
       * one or more tags, only the specified tags are copied to snapshots. If you specify one or more
       * tags when creating the snapshot, no tags are copied from the volume, regardless of this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-copytagstosnapshots)
       */
      override fun copyTagsToSnapshots(): Any? = unwrap(this).getCopyTagsToSnapshots()

      /**
       * Specifies the method used to compress the data on the volume. The compression type is
       * `NONE` by default.
       *
       * * `NONE` - Doesn't compress the data on the volume. `NONE` is the default.
       * * `ZSTD` - Compresses the data in the volume using the Zstandard (ZSTD) compression
       * algorithm. Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk
       * storage utilization.
       * * `LZ4` - Compresses the data in the volume using the LZ4 compression algorithm. Compared
       * to Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-datacompressiontype)
       */
      override fun dataCompressionType(): String? = unwrap(this).getDataCompressionType()

      /**
       * The configuration object for mounting a Network File System (NFS) file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-nfsexports)
       */
      override fun nfsExports(): Any? = unwrap(this).getNfsExports()

      /**
       * To delete the volume's child volumes, snapshots, and clones, use the string
       * `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-options)
       */
      override fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()

      /**
       * The configuration object that specifies the snapshot to use as the origin of the data for
       * the volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-originsnapshot)
       */
      override fun originSnapshot(): Any? = unwrap(this).getOriginSnapshot()

      /**
       * The ID of the volume to use as the parent volume of the volume that you are creating.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-parentvolumeid)
       */
      override fun parentVolumeId(): String = unwrap(this).getParentVolumeId()

      /**
       * A Boolean value indicating whether the volume is read-only.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-readonly)
       */
      override fun readOnly(): Any? = unwrap(this).getReadOnly()

      /**
       * Specifies the suggested block size for a volume in a ZFS dataset, in kibibytes (KiB).
       *
       * Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. We
       * recommend using the default setting for the majority of use cases. Generally, workloads that
       * write in fixed small or large record sizes may benefit from setting a custom record size, like
       * database workloads (small record size) or media streaming workloads (large record size). For
       * additional guidance on when to set a custom record size, see [ZFS Record
       * size](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#record-size-performance)
       * in the *Amazon FSx for OpenZFS User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-recordsizekib)
       */
      override fun recordSizeKiB(): Number? = unwrap(this).getRecordSizeKiB()

      /**
       * Sets the maximum storage size in gibibytes (GiB) for the volume.
       *
       * You can specify a quota that is larger than the storage on the parent volume. A volume
       * quota limits the amount of storage that the volume can consume to the configured amount, but
       * does not guarantee the space will be available on the parent volume. To guarantee quota space,
       * you must also set `StorageCapacityReservationGiB` . To *not* specify a storage capacity quota,
       * set this to `-1` .
       *
       * For more information, see [Volume
       * properties](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties)
       * in the *Amazon FSx for OpenZFS User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-storagecapacityquotagib)
       */
      override fun storageCapacityQuotaGiB(): Number? = unwrap(this).getStorageCapacityQuotaGiB()

      /**
       * Specifies the amount of storage in gibibytes (GiB) to reserve from the parent volume.
       *
       * Setting `StorageCapacityReservationGiB` guarantees that the specified amount of storage
       * space on the parent volume will always be available for the volume. You can't reserve more
       * storage than the parent volume has. To *not* specify a storage capacity reservation, set this
       * to `0` or `-1` . For more information, see [Volume
       * properties](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties)
       * in the *Amazon FSx for OpenZFS User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-storagecapacityreservationgib)
       */
      override fun storageCapacityReservationGiB(): Number? =
          unwrap(this).getStorageCapacityReservationGiB()

      /**
       * Configures how much storage users and groups can use on the volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html#cfn-fsx-volume-openzfsconfiguration-userandgroupquotas)
       */
      override fun userAndGroupQuotas(): Any? = unwrap(this).getUserAndGroupQuotas()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenZFSConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty):
          OpenZFSConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenZFSConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty
    }
  }

  /**
   * Specifies the configuration of the ONTAP volume that you are creating.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * OntapConfigurationProperty ontapConfigurationProperty = OntapConfigurationProperty.builder()
   * .storageVirtualMachineId("storageVirtualMachineId")
   * // the properties below are optional
   * .aggregateConfiguration(AggregateConfigurationProperty.builder()
   * .aggregates(List.of("aggregates"))
   * .constituentsPerAggregate(123)
   * .build())
   * .copyTagsToBackups("copyTagsToBackups")
   * .junctionPath("junctionPath")
   * .ontapVolumeType("ontapVolumeType")
   * .securityStyle("securityStyle")
   * .sizeInBytes("sizeInBytes")
   * .sizeInMegabytes("sizeInMegabytes")
   * .snaplockConfiguration(SnaplockConfigurationProperty.builder()
   * .snaplockType("snaplockType")
   * // the properties below are optional
   * .auditLogVolume("auditLogVolume")
   * .autocommitPeriod(AutocommitPeriodProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .value(123)
   * .build())
   * .privilegedDelete("privilegedDelete")
   * .retentionPeriod(SnaplockRetentionPeriodProperty.builder()
   * .defaultRetention(RetentionPeriodProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .value(123)
   * .build())
   * .maximumRetention(RetentionPeriodProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .value(123)
   * .build())
   * .minimumRetention(RetentionPeriodProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .value(123)
   * .build())
   * .build())
   * .volumeAppendModeEnabled("volumeAppendModeEnabled")
   * .build())
   * .snapshotPolicy("snapshotPolicy")
   * .storageEfficiencyEnabled("storageEfficiencyEnabled")
   * .tieringPolicy(TieringPolicyProperty.builder()
   * .coolingPeriod(123)
   * .name("name")
   * .build())
   * .volumeStyle("volumeStyle")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html)
   */
  public interface OntapConfigurationProperty {
    /**
     * Used to specify the configuration options for an FSx for ONTAP volume's storage aggregate or
     * aggregates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-aggregateconfiguration)
     */
    public fun aggregateConfiguration(): Any? = unwrap(this).getAggregateConfiguration()

    /**
     * A boolean flag indicating whether tags for the volume should be copied to backups.
     *
     * This value defaults to false. If it's set to true, all tags for the volume are copied to all
     * automatic and user-initiated backups where the user doesn't specify tags. If this value is true,
     * and you specify one or more tags, only the specified tags are copied to backups. If you specify
     * one or more tags when creating a user-initiated backup, no tags are copied from the volume,
     * regardless of this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-copytagstobackups)
     */
    public fun copyTagsToBackups(): String? = unwrap(this).getCopyTagsToBackups()

    /**
     * Specifies the location in the SVM's namespace where the volume is mounted.
     *
     *  The `JunctionPath` must have a leading forward slash, such as `/vol3` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-junctionpath)
     */
    public fun junctionPath(): String? = unwrap(this).getJunctionPath()

    /**
     * Specifies the type of volume you are creating. Valid values are the following:.
     *
     * * `RW` specifies a read/write volume. `RW` is the default.
     * * `DP` specifies a data-protection volume. A `DP` volume is read-only and can be used as the
     * destination of a NetApp SnapMirror relationship.
     *
     * For more information, see [Volume
     * types](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types) in the Amazon FSx for
     * NetApp ONTAP User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-ontapvolumetype)
     */
    public fun ontapVolumeType(): String? = unwrap(this).getOntapVolumeType()

    /**
     * Specifies the security style for the volume.
     *
     * If a volume's security style is not specified, it is automatically set to the root volume's
     * security style. The security style determines the type of permissions that FSx for ONTAP uses to
     * control data access. For more information, see [Volume security
     * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style) in the *Amazon
     * FSx for NetApp ONTAP User Guide* . Specify one of the following values:
     *
     * * `UNIX` if the file system is managed by a UNIX administrator, the majority of users are NFS
     * clients, and an application accessing the data uses a UNIX user as the service account.
     * * `NTFS` if the file system is managed by a Windows administrator, the majority of users are
     * SMB clients, and an application accessing the data uses a Windows user as the service account.
     * * `MIXED` This is an advanced setting. For more information, see the topic [What the security
     * styles and their effects
     * are](https://docs.aws.amazon.com/https://docs.netapp.com/us-en/ontap/nfs-admin/security-styles-their-effects-concept.html)
     * in the NetApp Documentation Center.
     *
     * For more information, see [Volume security
     * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html) in the FSx
     * for ONTAP User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-securitystyle)
     */
    public fun securityStyle(): String? = unwrap(this).getSecurityStyle()

    /**
     * Specifies the configured size of the volume, in bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-sizeinbytes)
     */
    public fun sizeInBytes(): String? = unwrap(this).getSizeInBytes()

    /**
     * Use `SizeInBytes` instead.
     *
     * Specifies the size of the volume, in megabytes (MB), that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-sizeinmegabytes)
     */
    public fun sizeInMegabytes(): String? = unwrap(this).getSizeInMegabytes()

    /**
     * The SnapLock configuration object for an FSx for ONTAP SnapLock volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-snaplockconfiguration)
     */
    public fun snaplockConfiguration(): Any? = unwrap(this).getSnaplockConfiguration()

    /**
     * Specifies the snapshot policy for the volume. There are three built-in snapshot policies:.
     *
     * * `default` : This is the default policy. A maximum of six hourly snapshots taken five
     * minutes past the hour. A maximum of two daily snapshots taken Monday through Saturday at 10
     * minutes after midnight. A maximum of two weekly snapshots taken every Sunday at 15 minutes after
     * midnight.
     * * `default-1weekly` : This policy is the same as the `default` policy except that it only
     * retains one snapshot from the weekly schedule.
     * * `none` : This policy does not take any snapshots. This policy can be assigned to volumes to
     * prevent automatic snapshots from being taken.
     *
     * You can also provide the name of a custom policy that you created with the ONTAP CLI or REST
     * API.
     *
     * For more information, see [Snapshot
     * policies](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies)
     * in the Amazon FSx for NetApp ONTAP User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-snapshotpolicy)
     */
    public fun snapshotPolicy(): String? = unwrap(this).getSnapshotPolicy()

    /**
     * Set to true to enable deduplication, compression, and compaction storage efficiency features
     * on the volume, or set to false to disable them.
     *
     * `StorageEfficiencyEnabled` is required when creating a `RW` volume ( `OntapVolumeType` set to
     * `RW` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-storageefficiencyenabled)
     */
    public fun storageEfficiencyEnabled(): String? = unwrap(this).getStorageEfficiencyEnabled()

    /**
     * Specifies the ONTAP SVM in which to create the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-storagevirtualmachineid)
     */
    public fun storageVirtualMachineId(): String

    /**
     * Describes the data tiering policy for an ONTAP volume.
     *
     * When enabled, Amazon FSx for ONTAP's intelligent tiering automatically transitions a volume's
     * data between the file system's primary storage and capacity pool storage based on your access
     * patterns.
     *
     * Valid tiering policies are the following:
     *
     * * `SNAPSHOT_ONLY` - (Default value) moves cold snapshots to the capacity pool storage tier.
     * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on your
     * access patterns.
     * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to
     * the storage pool tier.
     * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being moved
     * to the capacity pool tier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-tieringpolicy)
     */
    public fun tieringPolicy(): Any? = unwrap(this).getTieringPolicy()

    /**
     * Use to specify the style of an ONTAP volume.
     *
     * FSx for ONTAP offers two styles of volumes that you can use for different purposes, FlexVol
     * and FlexGroup volumes. For more information, see [Volume
     * styles](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-styles.html) in the Amazon FSx
     * for NetApp ONTAP User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-volumestyle)
     */
    public fun volumeStyle(): String? = unwrap(this).getVolumeStyle()

    /**
     * A builder for [OntapConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregateConfiguration Used to specify the configuration options for an FSx for
       * ONTAP volume's storage aggregate or aggregates.
       */
      public fun aggregateConfiguration(aggregateConfiguration: IResolvable)

      /**
       * @param aggregateConfiguration Used to specify the configuration options for an FSx for
       * ONTAP volume's storage aggregate or aggregates.
       */
      public fun aggregateConfiguration(aggregateConfiguration: AggregateConfigurationProperty)

      /**
       * @param aggregateConfiguration Used to specify the configuration options for an FSx for
       * ONTAP volume's storage aggregate or aggregates.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f2e35038a05291bc7b5e4d4ec460e91bcc4c33e6d99c2933b960da4bc04e2f6")
      public
          fun aggregateConfiguration(aggregateConfiguration: AggregateConfigurationProperty.Builder.() -> Unit)

      /**
       * @param copyTagsToBackups A boolean flag indicating whether tags for the volume should be
       * copied to backups.
       * This value defaults to false. If it's set to true, all tags for the volume are copied to
       * all automatic and user-initiated backups where the user doesn't specify tags. If this value is
       * true, and you specify one or more tags, only the specified tags are copied to backups. If you
       * specify one or more tags when creating a user-initiated backup, no tags are copied from the
       * volume, regardless of this value.
       */
      public fun copyTagsToBackups(copyTagsToBackups: String)

      /**
       * @param junctionPath Specifies the location in the SVM's namespace where the volume is
       * mounted.
       *  The `JunctionPath` must have a leading forward slash, such as `/vol3` .
       */
      public fun junctionPath(junctionPath: String)

      /**
       * @param ontapVolumeType Specifies the type of volume you are creating. Valid values are the
       * following:.
       * * `RW` specifies a read/write volume. `RW` is the default.
       * * `DP` specifies a data-protection volume. A `DP` volume is read-only and can be used as
       * the destination of a NetApp SnapMirror relationship.
       *
       * For more information, see [Volume
       * types](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types) in the Amazon FSx for
       * NetApp ONTAP User Guide.
       */
      public fun ontapVolumeType(ontapVolumeType: String)

      /**
       * @param securityStyle Specifies the security style for the volume.
       * If a volume's security style is not specified, it is automatically set to the root volume's
       * security style. The security style determines the type of permissions that FSx for ONTAP uses
       * to control data access. For more information, see [Volume security
       * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style) in the *Amazon
       * FSx for NetApp ONTAP User Guide* . Specify one of the following values:
       *
       * * `UNIX` if the file system is managed by a UNIX administrator, the majority of users are
       * NFS clients, and an application accessing the data uses a UNIX user as the service account.
       * * `NTFS` if the file system is managed by a Windows administrator, the majority of users
       * are SMB clients, and an application accessing the data uses a Windows user as the service
       * account.
       * * `MIXED` This is an advanced setting. For more information, see the topic [What the
       * security styles and their effects
       * are](https://docs.aws.amazon.com/https://docs.netapp.com/us-en/ontap/nfs-admin/security-styles-their-effects-concept.html)
       * in the NetApp Documentation Center.
       *
       * For more information, see [Volume security
       * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html) in the
       * FSx for ONTAP User Guide.
       */
      public fun securityStyle(securityStyle: String)

      /**
       * @param sizeInBytes Specifies the configured size of the volume, in bytes.
       */
      public fun sizeInBytes(sizeInBytes: String)

      /**
       * @param sizeInMegabytes Use `SizeInBytes` instead.
       * Specifies the size of the volume, in megabytes (MB), that you are creating.
       */
      public fun sizeInMegabytes(sizeInMegabytes: String)

      /**
       * @param snaplockConfiguration The SnapLock configuration object for an FSx for ONTAP
       * SnapLock volume.
       */
      public fun snaplockConfiguration(snaplockConfiguration: IResolvable)

      /**
       * @param snaplockConfiguration The SnapLock configuration object for an FSx for ONTAP
       * SnapLock volume.
       */
      public fun snaplockConfiguration(snaplockConfiguration: SnaplockConfigurationProperty)

      /**
       * @param snaplockConfiguration The SnapLock configuration object for an FSx for ONTAP
       * SnapLock volume.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3189155e937a8748ec9578b393ceaaed4b149b540561354d82e7753ee30c01e")
      public
          fun snaplockConfiguration(snaplockConfiguration: SnaplockConfigurationProperty.Builder.() -> Unit)

      /**
       * @param snapshotPolicy Specifies the snapshot policy for the volume. There are three
       * built-in snapshot policies:.
       * * `default` : This is the default policy. A maximum of six hourly snapshots taken five
       * minutes past the hour. A maximum of two daily snapshots taken Monday through Saturday at 10
       * minutes after midnight. A maximum of two weekly snapshots taken every Sunday at 15 minutes
       * after midnight.
       * * `default-1weekly` : This policy is the same as the `default` policy except that it only
       * retains one snapshot from the weekly schedule.
       * * `none` : This policy does not take any snapshots. This policy can be assigned to volumes
       * to prevent automatic snapshots from being taken.
       *
       * You can also provide the name of a custom policy that you created with the ONTAP CLI or
       * REST API.
       *
       * For more information, see [Snapshot
       * policies](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies)
       * in the Amazon FSx for NetApp ONTAP User Guide.
       */
      public fun snapshotPolicy(snapshotPolicy: String)

      /**
       * @param storageEfficiencyEnabled Set to true to enable deduplication, compression, and
       * compaction storage efficiency features on the volume, or set to false to disable them.
       * `StorageEfficiencyEnabled` is required when creating a `RW` volume ( `OntapVolumeType` set
       * to `RW` ).
       */
      public fun storageEfficiencyEnabled(storageEfficiencyEnabled: String)

      /**
       * @param storageVirtualMachineId Specifies the ONTAP SVM in which to create the volume. 
       */
      public fun storageVirtualMachineId(storageVirtualMachineId: String)

      /**
       * @param tieringPolicy Describes the data tiering policy for an ONTAP volume.
       * When enabled, Amazon FSx for ONTAP's intelligent tiering automatically transitions a
       * volume's data between the file system's primary storage and capacity pool storage based on
       * your access patterns.
       *
       * Valid tiering policies are the following:
       *
       * * `SNAPSHOT_ONLY` - (Default value) moves cold snapshots to the capacity pool storage tier.
       * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on
       * your access patterns.
       * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to
       * the storage pool tier.
       * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being
       * moved to the capacity pool tier.
       */
      public fun tieringPolicy(tieringPolicy: IResolvable)

      /**
       * @param tieringPolicy Describes the data tiering policy for an ONTAP volume.
       * When enabled, Amazon FSx for ONTAP's intelligent tiering automatically transitions a
       * volume's data between the file system's primary storage and capacity pool storage based on
       * your access patterns.
       *
       * Valid tiering policies are the following:
       *
       * * `SNAPSHOT_ONLY` - (Default value) moves cold snapshots to the capacity pool storage tier.
       * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on
       * your access patterns.
       * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to
       * the storage pool tier.
       * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being
       * moved to the capacity pool tier.
       */
      public fun tieringPolicy(tieringPolicy: TieringPolicyProperty)

      /**
       * @param tieringPolicy Describes the data tiering policy for an ONTAP volume.
       * When enabled, Amazon FSx for ONTAP's intelligent tiering automatically transitions a
       * volume's data between the file system's primary storage and capacity pool storage based on
       * your access patterns.
       *
       * Valid tiering policies are the following:
       *
       * * `SNAPSHOT_ONLY` - (Default value) moves cold snapshots to the capacity pool storage tier.
       * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on
       * your access patterns.
       * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to
       * the storage pool tier.
       * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being
       * moved to the capacity pool tier.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69ed72f068811bbd74787e358b6614189a2ac6deb0d6047f15850ec03a5458df")
      public fun tieringPolicy(tieringPolicy: TieringPolicyProperty.Builder.() -> Unit)

      /**
       * @param volumeStyle Use to specify the style of an ONTAP volume.
       * FSx for ONTAP offers two styles of volumes that you can use for different purposes, FlexVol
       * and FlexGroup volumes. For more information, see [Volume
       * styles](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-styles.html) in the Amazon
       * FSx for NetApp ONTAP User Guide.
       */
      public fun volumeStyle(volumeStyle: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty.builder()

      /**
       * @param aggregateConfiguration Used to specify the configuration options for an FSx for
       * ONTAP volume's storage aggregate or aggregates.
       */
      override fun aggregateConfiguration(aggregateConfiguration: IResolvable) {
        cdkBuilder.aggregateConfiguration(aggregateConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param aggregateConfiguration Used to specify the configuration options for an FSx for
       * ONTAP volume's storage aggregate or aggregates.
       */
      override fun aggregateConfiguration(aggregateConfiguration: AggregateConfigurationProperty) {
        cdkBuilder.aggregateConfiguration(aggregateConfiguration.let(AggregateConfigurationProperty::unwrap))
      }

      /**
       * @param aggregateConfiguration Used to specify the configuration options for an FSx for
       * ONTAP volume's storage aggregate or aggregates.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f2e35038a05291bc7b5e4d4ec460e91bcc4c33e6d99c2933b960da4bc04e2f6")
      override
          fun aggregateConfiguration(aggregateConfiguration: AggregateConfigurationProperty.Builder.() -> Unit):
          Unit = aggregateConfiguration(AggregateConfigurationProperty(aggregateConfiguration))

      /**
       * @param copyTagsToBackups A boolean flag indicating whether tags for the volume should be
       * copied to backups.
       * This value defaults to false. If it's set to true, all tags for the volume are copied to
       * all automatic and user-initiated backups where the user doesn't specify tags. If this value is
       * true, and you specify one or more tags, only the specified tags are copied to backups. If you
       * specify one or more tags when creating a user-initiated backup, no tags are copied from the
       * volume, regardless of this value.
       */
      override fun copyTagsToBackups(copyTagsToBackups: String) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups)
      }

      /**
       * @param junctionPath Specifies the location in the SVM's namespace where the volume is
       * mounted.
       *  The `JunctionPath` must have a leading forward slash, such as `/vol3` .
       */
      override fun junctionPath(junctionPath: String) {
        cdkBuilder.junctionPath(junctionPath)
      }

      /**
       * @param ontapVolumeType Specifies the type of volume you are creating. Valid values are the
       * following:.
       * * `RW` specifies a read/write volume. `RW` is the default.
       * * `DP` specifies a data-protection volume. A `DP` volume is read-only and can be used as
       * the destination of a NetApp SnapMirror relationship.
       *
       * For more information, see [Volume
       * types](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types) in the Amazon FSx for
       * NetApp ONTAP User Guide.
       */
      override fun ontapVolumeType(ontapVolumeType: String) {
        cdkBuilder.ontapVolumeType(ontapVolumeType)
      }

      /**
       * @param securityStyle Specifies the security style for the volume.
       * If a volume's security style is not specified, it is automatically set to the root volume's
       * security style. The security style determines the type of permissions that FSx for ONTAP uses
       * to control data access. For more information, see [Volume security
       * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style) in the *Amazon
       * FSx for NetApp ONTAP User Guide* . Specify one of the following values:
       *
       * * `UNIX` if the file system is managed by a UNIX administrator, the majority of users are
       * NFS clients, and an application accessing the data uses a UNIX user as the service account.
       * * `NTFS` if the file system is managed by a Windows administrator, the majority of users
       * are SMB clients, and an application accessing the data uses a Windows user as the service
       * account.
       * * `MIXED` This is an advanced setting. For more information, see the topic [What the
       * security styles and their effects
       * are](https://docs.aws.amazon.com/https://docs.netapp.com/us-en/ontap/nfs-admin/security-styles-their-effects-concept.html)
       * in the NetApp Documentation Center.
       *
       * For more information, see [Volume security
       * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html) in the
       * FSx for ONTAP User Guide.
       */
      override fun securityStyle(securityStyle: String) {
        cdkBuilder.securityStyle(securityStyle)
      }

      /**
       * @param sizeInBytes Specifies the configured size of the volume, in bytes.
       */
      override fun sizeInBytes(sizeInBytes: String) {
        cdkBuilder.sizeInBytes(sizeInBytes)
      }

      /**
       * @param sizeInMegabytes Use `SizeInBytes` instead.
       * Specifies the size of the volume, in megabytes (MB), that you are creating.
       */
      override fun sizeInMegabytes(sizeInMegabytes: String) {
        cdkBuilder.sizeInMegabytes(sizeInMegabytes)
      }

      /**
       * @param snaplockConfiguration The SnapLock configuration object for an FSx for ONTAP
       * SnapLock volume.
       */
      override fun snaplockConfiguration(snaplockConfiguration: IResolvable) {
        cdkBuilder.snaplockConfiguration(snaplockConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param snaplockConfiguration The SnapLock configuration object for an FSx for ONTAP
       * SnapLock volume.
       */
      override fun snaplockConfiguration(snaplockConfiguration: SnaplockConfigurationProperty) {
        cdkBuilder.snaplockConfiguration(snaplockConfiguration.let(SnaplockConfigurationProperty::unwrap))
      }

      /**
       * @param snaplockConfiguration The SnapLock configuration object for an FSx for ONTAP
       * SnapLock volume.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3189155e937a8748ec9578b393ceaaed4b149b540561354d82e7753ee30c01e")
      override
          fun snaplockConfiguration(snaplockConfiguration: SnaplockConfigurationProperty.Builder.() -> Unit):
          Unit = snaplockConfiguration(SnaplockConfigurationProperty(snaplockConfiguration))

      /**
       * @param snapshotPolicy Specifies the snapshot policy for the volume. There are three
       * built-in snapshot policies:.
       * * `default` : This is the default policy. A maximum of six hourly snapshots taken five
       * minutes past the hour. A maximum of two daily snapshots taken Monday through Saturday at 10
       * minutes after midnight. A maximum of two weekly snapshots taken every Sunday at 15 minutes
       * after midnight.
       * * `default-1weekly` : This policy is the same as the `default` policy except that it only
       * retains one snapshot from the weekly schedule.
       * * `none` : This policy does not take any snapshots. This policy can be assigned to volumes
       * to prevent automatic snapshots from being taken.
       *
       * You can also provide the name of a custom policy that you created with the ONTAP CLI or
       * REST API.
       *
       * For more information, see [Snapshot
       * policies](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies)
       * in the Amazon FSx for NetApp ONTAP User Guide.
       */
      override fun snapshotPolicy(snapshotPolicy: String) {
        cdkBuilder.snapshotPolicy(snapshotPolicy)
      }

      /**
       * @param storageEfficiencyEnabled Set to true to enable deduplication, compression, and
       * compaction storage efficiency features on the volume, or set to false to disable them.
       * `StorageEfficiencyEnabled` is required when creating a `RW` volume ( `OntapVolumeType` set
       * to `RW` ).
       */
      override fun storageEfficiencyEnabled(storageEfficiencyEnabled: String) {
        cdkBuilder.storageEfficiencyEnabled(storageEfficiencyEnabled)
      }

      /**
       * @param storageVirtualMachineId Specifies the ONTAP SVM in which to create the volume. 
       */
      override fun storageVirtualMachineId(storageVirtualMachineId: String) {
        cdkBuilder.storageVirtualMachineId(storageVirtualMachineId)
      }

      /**
       * @param tieringPolicy Describes the data tiering policy for an ONTAP volume.
       * When enabled, Amazon FSx for ONTAP's intelligent tiering automatically transitions a
       * volume's data between the file system's primary storage and capacity pool storage based on
       * your access patterns.
       *
       * Valid tiering policies are the following:
       *
       * * `SNAPSHOT_ONLY` - (Default value) moves cold snapshots to the capacity pool storage tier.
       * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on
       * your access patterns.
       * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to
       * the storage pool tier.
       * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being
       * moved to the capacity pool tier.
       */
      override fun tieringPolicy(tieringPolicy: IResolvable) {
        cdkBuilder.tieringPolicy(tieringPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param tieringPolicy Describes the data tiering policy for an ONTAP volume.
       * When enabled, Amazon FSx for ONTAP's intelligent tiering automatically transitions a
       * volume's data between the file system's primary storage and capacity pool storage based on
       * your access patterns.
       *
       * Valid tiering policies are the following:
       *
       * * `SNAPSHOT_ONLY` - (Default value) moves cold snapshots to the capacity pool storage tier.
       * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on
       * your access patterns.
       * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to
       * the storage pool tier.
       * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being
       * moved to the capacity pool tier.
       */
      override fun tieringPolicy(tieringPolicy: TieringPolicyProperty) {
        cdkBuilder.tieringPolicy(tieringPolicy.let(TieringPolicyProperty::unwrap))
      }

      /**
       * @param tieringPolicy Describes the data tiering policy for an ONTAP volume.
       * When enabled, Amazon FSx for ONTAP's intelligent tiering automatically transitions a
       * volume's data between the file system's primary storage and capacity pool storage based on
       * your access patterns.
       *
       * Valid tiering policies are the following:
       *
       * * `SNAPSHOT_ONLY` - (Default value) moves cold snapshots to the capacity pool storage tier.
       * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on
       * your access patterns.
       * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to
       * the storage pool tier.
       * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being
       * moved to the capacity pool tier.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69ed72f068811bbd74787e358b6614189a2ac6deb0d6047f15850ec03a5458df")
      override fun tieringPolicy(tieringPolicy: TieringPolicyProperty.Builder.() -> Unit): Unit =
          tieringPolicy(TieringPolicyProperty(tieringPolicy))

      /**
       * @param volumeStyle Use to specify the style of an ONTAP volume.
       * FSx for ONTAP offers two styles of volumes that you can use for different purposes, FlexVol
       * and FlexGroup volumes. For more information, see [Volume
       * styles](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-styles.html) in the Amazon
       * FSx for NetApp ONTAP User Guide.
       */
      override fun volumeStyle(volumeStyle: String) {
        cdkBuilder.volumeStyle(volumeStyle)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty,
    ) : CdkObject(cdkObject), OntapConfigurationProperty {
      /**
       * Used to specify the configuration options for an FSx for ONTAP volume's storage aggregate
       * or aggregates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-aggregateconfiguration)
       */
      override fun aggregateConfiguration(): Any? = unwrap(this).getAggregateConfiguration()

      /**
       * A boolean flag indicating whether tags for the volume should be copied to backups.
       *
       * This value defaults to false. If it's set to true, all tags for the volume are copied to
       * all automatic and user-initiated backups where the user doesn't specify tags. If this value is
       * true, and you specify one or more tags, only the specified tags are copied to backups. If you
       * specify one or more tags when creating a user-initiated backup, no tags are copied from the
       * volume, regardless of this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-copytagstobackups)
       */
      override fun copyTagsToBackups(): String? = unwrap(this).getCopyTagsToBackups()

      /**
       * Specifies the location in the SVM's namespace where the volume is mounted.
       *
       *  The `JunctionPath` must have a leading forward slash, such as `/vol3` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-junctionpath)
       */
      override fun junctionPath(): String? = unwrap(this).getJunctionPath()

      /**
       * Specifies the type of volume you are creating. Valid values are the following:.
       *
       * * `RW` specifies a read/write volume. `RW` is the default.
       * * `DP` specifies a data-protection volume. A `DP` volume is read-only and can be used as
       * the destination of a NetApp SnapMirror relationship.
       *
       * For more information, see [Volume
       * types](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types) in the Amazon FSx for
       * NetApp ONTAP User Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-ontapvolumetype)
       */
      override fun ontapVolumeType(): String? = unwrap(this).getOntapVolumeType()

      /**
       * Specifies the security style for the volume.
       *
       * If a volume's security style is not specified, it is automatically set to the root volume's
       * security style. The security style determines the type of permissions that FSx for ONTAP uses
       * to control data access. For more information, see [Volume security
       * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style) in the *Amazon
       * FSx for NetApp ONTAP User Guide* . Specify one of the following values:
       *
       * * `UNIX` if the file system is managed by a UNIX administrator, the majority of users are
       * NFS clients, and an application accessing the data uses a UNIX user as the service account.
       * * `NTFS` if the file system is managed by a Windows administrator, the majority of users
       * are SMB clients, and an application accessing the data uses a Windows user as the service
       * account.
       * * `MIXED` This is an advanced setting. For more information, see the topic [What the
       * security styles and their effects
       * are](https://docs.aws.amazon.com/https://docs.netapp.com/us-en/ontap/nfs-admin/security-styles-their-effects-concept.html)
       * in the NetApp Documentation Center.
       *
       * For more information, see [Volume security
       * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html) in the
       * FSx for ONTAP User Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-securitystyle)
       */
      override fun securityStyle(): String? = unwrap(this).getSecurityStyle()

      /**
       * Specifies the configured size of the volume, in bytes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-sizeinbytes)
       */
      override fun sizeInBytes(): String? = unwrap(this).getSizeInBytes()

      /**
       * Use `SizeInBytes` instead.
       *
       * Specifies the size of the volume, in megabytes (MB), that you are creating.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-sizeinmegabytes)
       */
      override fun sizeInMegabytes(): String? = unwrap(this).getSizeInMegabytes()

      /**
       * The SnapLock configuration object for an FSx for ONTAP SnapLock volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-snaplockconfiguration)
       */
      override fun snaplockConfiguration(): Any? = unwrap(this).getSnaplockConfiguration()

      /**
       * Specifies the snapshot policy for the volume. There are three built-in snapshot policies:.
       *
       * * `default` : This is the default policy. A maximum of six hourly snapshots taken five
       * minutes past the hour. A maximum of two daily snapshots taken Monday through Saturday at 10
       * minutes after midnight. A maximum of two weekly snapshots taken every Sunday at 15 minutes
       * after midnight.
       * * `default-1weekly` : This policy is the same as the `default` policy except that it only
       * retains one snapshot from the weekly schedule.
       * * `none` : This policy does not take any snapshots. This policy can be assigned to volumes
       * to prevent automatic snapshots from being taken.
       *
       * You can also provide the name of a custom policy that you created with the ONTAP CLI or
       * REST API.
       *
       * For more information, see [Snapshot
       * policies](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies)
       * in the Amazon FSx for NetApp ONTAP User Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-snapshotpolicy)
       */
      override fun snapshotPolicy(): String? = unwrap(this).getSnapshotPolicy()

      /**
       * Set to true to enable deduplication, compression, and compaction storage efficiency
       * features on the volume, or set to false to disable them.
       *
       * `StorageEfficiencyEnabled` is required when creating a `RW` volume ( `OntapVolumeType` set
       * to `RW` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-storageefficiencyenabled)
       */
      override fun storageEfficiencyEnabled(): String? = unwrap(this).getStorageEfficiencyEnabled()

      /**
       * Specifies the ONTAP SVM in which to create the volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-storagevirtualmachineid)
       */
      override fun storageVirtualMachineId(): String = unwrap(this).getStorageVirtualMachineId()

      /**
       * Describes the data tiering policy for an ONTAP volume.
       *
       * When enabled, Amazon FSx for ONTAP's intelligent tiering automatically transitions a
       * volume's data between the file system's primary storage and capacity pool storage based on
       * your access patterns.
       *
       * Valid tiering policies are the following:
       *
       * * `SNAPSHOT_ONLY` - (Default value) moves cold snapshots to the capacity pool storage tier.
       * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on
       * your access patterns.
       * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to
       * the storage pool tier.
       * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being
       * moved to the capacity pool tier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-tieringpolicy)
       */
      override fun tieringPolicy(): Any? = unwrap(this).getTieringPolicy()

      /**
       * Use to specify the style of an ONTAP volume.
       *
       * FSx for ONTAP offers two styles of volumes that you can use for different purposes, FlexVol
       * and FlexGroup volumes. For more information, see [Volume
       * styles](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-styles.html) in the Amazon
       * FSx for NetApp ONTAP User Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html#cfn-fsx-volume-ontapconfiguration-volumestyle)
       */
      override fun volumeStyle(): String? = unwrap(this).getVolumeStyle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OntapConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty):
          OntapConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OntapConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty
    }
  }

  /**
   * Specifies the SnapLock configuration for an FSx for ONTAP SnapLock volume.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * SnaplockConfigurationProperty snaplockConfigurationProperty =
   * SnaplockConfigurationProperty.builder()
   * .snaplockType("snaplockType")
   * // the properties below are optional
   * .auditLogVolume("auditLogVolume")
   * .autocommitPeriod(AutocommitPeriodProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .value(123)
   * .build())
   * .privilegedDelete("privilegedDelete")
   * .retentionPeriod(SnaplockRetentionPeriodProperty.builder()
   * .defaultRetention(RetentionPeriodProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .value(123)
   * .build())
   * .maximumRetention(RetentionPeriodProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .value(123)
   * .build())
   * .minimumRetention(RetentionPeriodProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .value(123)
   * .build())
   * .build())
   * .volumeAppendModeEnabled("volumeAppendModeEnabled")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html)
   */
  public interface SnaplockConfigurationProperty {
    /**
     * Enables or disables the audit log volume for an FSx for ONTAP SnapLock volume.
     *
     * The default value is `false` . If you set `AuditLogVolume` to `true` , the SnapLock volume is
     * created as an audit log volume. The minimum retention period for an audit log volume is six
     * months.
     *
     * For more information, see [SnapLock audit log
     * volumes](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html#cfn-fsx-volume-snaplockconfiguration-auditlogvolume)
     */
    public fun auditLogVolume(): String? = unwrap(this).getAuditLogVolume()

    /**
     * The configuration object for setting the autocommit period of files in an FSx for ONTAP
     * SnapLock volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html#cfn-fsx-volume-snaplockconfiguration-autocommitperiod)
     */
    public fun autocommitPeriod(): Any? = unwrap(this).getAutocommitPeriod()

    /**
     * Enables, disables, or permanently disables privileged delete on an FSx for ONTAP SnapLock
     * Enterprise volume.
     *
     * Enabling privileged delete allows SnapLock administrators to delete write once, read many
     * (WORM) files even if they have active retention periods. `PERMANENTLY_DISABLED` is a terminal
     * state. If privileged delete is permanently disabled on a SnapLock volume, you can't re-enable
     * it. The default value is `DISABLED` .
     *
     * For more information, see [Privileged
     * delete](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html#cfn-fsx-volume-snaplockconfiguration-privilegeddelete)
     */
    public fun privilegedDelete(): String? = unwrap(this).getPrivilegedDelete()

    /**
     * Specifies the retention period of an FSx for ONTAP SnapLock volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html#cfn-fsx-volume-snaplockconfiguration-retentionperiod)
     */
    public fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

    /**
     * Specifies the retention mode of an FSx for ONTAP SnapLock volume.
     *
     * After it is set, it can't be changed. You can choose one of the following retention modes:
     *
     * * `COMPLIANCE` : Files transitioned to write once, read many (WORM) on a Compliance volume
     * can't be deleted until their retention periods expire. This retention mode is used to address
     * government or industry-specific mandates or to protect against ransomware attacks. For more
     * information, see [SnapLock
     * Compliance](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html) .
     * * `ENTERPRISE` : Files transitioned to WORM on an Enterprise volume can be deleted by
     * authorized users before their retention periods expire using privileged delete. This retention
     * mode is used to advance an organization's data integrity and internal compliance or to test
     * retention settings before using SnapLock Compliance. For more information, see [SnapLock
     * Enterprise](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html#cfn-fsx-volume-snaplockconfiguration-snaplocktype)
     */
    public fun snaplockType(): String

    /**
     * Enables or disables volume-append mode on an FSx for ONTAP SnapLock volume.
     *
     * Volume-append mode allows you to create WORM-appendable files and write data to them
     * incrementally. The default value is `false` .
     *
     * For more information, see [Volume-append
     * mode](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html#cfn-fsx-volume-snaplockconfiguration-volumeappendmodeenabled)
     */
    public fun volumeAppendModeEnabled(): String? = unwrap(this).getVolumeAppendModeEnabled()

    /**
     * A builder for [SnaplockConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param auditLogVolume Enables or disables the audit log volume for an FSx for ONTAP
       * SnapLock volume.
       * The default value is `false` . If you set `AuditLogVolume` to `true` , the SnapLock volume
       * is created as an audit log volume. The minimum retention period for an audit log volume is six
       * months.
       *
       * For more information, see [SnapLock audit log
       * volumes](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume)
       * .
       */
      public fun auditLogVolume(auditLogVolume: String)

      /**
       * @param autocommitPeriod The configuration object for setting the autocommit period of files
       * in an FSx for ONTAP SnapLock volume.
       */
      public fun autocommitPeriod(autocommitPeriod: IResolvable)

      /**
       * @param autocommitPeriod The configuration object for setting the autocommit period of files
       * in an FSx for ONTAP SnapLock volume.
       */
      public fun autocommitPeriod(autocommitPeriod: AutocommitPeriodProperty)

      /**
       * @param autocommitPeriod The configuration object for setting the autocommit period of files
       * in an FSx for ONTAP SnapLock volume.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e380838e3a987f21415dc3377aa4154059ef18cd09877176abab3b5032cbcad")
      public fun autocommitPeriod(autocommitPeriod: AutocommitPeriodProperty.Builder.() -> Unit)

      /**
       * @param privilegedDelete Enables, disables, or permanently disables privileged delete on an
       * FSx for ONTAP SnapLock Enterprise volume.
       * Enabling privileged delete allows SnapLock administrators to delete write once, read many
       * (WORM) files even if they have active retention periods. `PERMANENTLY_DISABLED` is a terminal
       * state. If privileged delete is permanently disabled on a SnapLock volume, you can't re-enable
       * it. The default value is `DISABLED` .
       *
       * For more information, see [Privileged
       * delete](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete)
       * .
       */
      public fun privilegedDelete(privilegedDelete: String)

      /**
       * @param retentionPeriod Specifies the retention period of an FSx for ONTAP SnapLock volume.
       */
      public fun retentionPeriod(retentionPeriod: IResolvable)

      /**
       * @param retentionPeriod Specifies the retention period of an FSx for ONTAP SnapLock volume.
       */
      public fun retentionPeriod(retentionPeriod: SnaplockRetentionPeriodProperty)

      /**
       * @param retentionPeriod Specifies the retention period of an FSx for ONTAP SnapLock volume.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eba54555f91b81d0befa4f324b3d5717910c6b7c9781cec5d99e84ac38898911")
      public
          fun retentionPeriod(retentionPeriod: SnaplockRetentionPeriodProperty.Builder.() -> Unit)

      /**
       * @param snaplockType Specifies the retention mode of an FSx for ONTAP SnapLock volume. 
       * After it is set, it can't be changed. You can choose one of the following retention modes:
       *
       * * `COMPLIANCE` : Files transitioned to write once, read many (WORM) on a Compliance volume
       * can't be deleted until their retention periods expire. This retention mode is used to address
       * government or industry-specific mandates or to protect against ransomware attacks. For more
       * information, see [SnapLock
       * Compliance](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html) .
       * * `ENTERPRISE` : Files transitioned to WORM on an Enterprise volume can be deleted by
       * authorized users before their retention periods expire using privileged delete. This retention
       * mode is used to advance an organization's data integrity and internal compliance or to test
       * retention settings before using SnapLock Compliance. For more information, see [SnapLock
       * Enterprise](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html) .
       */
      public fun snaplockType(snaplockType: String)

      /**
       * @param volumeAppendModeEnabled Enables or disables volume-append mode on an FSx for ONTAP
       * SnapLock volume.
       * Volume-append mode allows you to create WORM-appendable files and write data to them
       * incrementally. The default value is `false` .
       *
       * For more information, see [Volume-append
       * mode](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append) .
       */
      public fun volumeAppendModeEnabled(volumeAppendModeEnabled: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty.builder()

      /**
       * @param auditLogVolume Enables or disables the audit log volume for an FSx for ONTAP
       * SnapLock volume.
       * The default value is `false` . If you set `AuditLogVolume` to `true` , the SnapLock volume
       * is created as an audit log volume. The minimum retention period for an audit log volume is six
       * months.
       *
       * For more information, see [SnapLock audit log
       * volumes](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume)
       * .
       */
      override fun auditLogVolume(auditLogVolume: String) {
        cdkBuilder.auditLogVolume(auditLogVolume)
      }

      /**
       * @param autocommitPeriod The configuration object for setting the autocommit period of files
       * in an FSx for ONTAP SnapLock volume.
       */
      override fun autocommitPeriod(autocommitPeriod: IResolvable) {
        cdkBuilder.autocommitPeriod(autocommitPeriod.let(IResolvable::unwrap))
      }

      /**
       * @param autocommitPeriod The configuration object for setting the autocommit period of files
       * in an FSx for ONTAP SnapLock volume.
       */
      override fun autocommitPeriod(autocommitPeriod: AutocommitPeriodProperty) {
        cdkBuilder.autocommitPeriod(autocommitPeriod.let(AutocommitPeriodProperty::unwrap))
      }

      /**
       * @param autocommitPeriod The configuration object for setting the autocommit period of files
       * in an FSx for ONTAP SnapLock volume.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e380838e3a987f21415dc3377aa4154059ef18cd09877176abab3b5032cbcad")
      override fun autocommitPeriod(autocommitPeriod: AutocommitPeriodProperty.Builder.() -> Unit):
          Unit = autocommitPeriod(AutocommitPeriodProperty(autocommitPeriod))

      /**
       * @param privilegedDelete Enables, disables, or permanently disables privileged delete on an
       * FSx for ONTAP SnapLock Enterprise volume.
       * Enabling privileged delete allows SnapLock administrators to delete write once, read many
       * (WORM) files even if they have active retention periods. `PERMANENTLY_DISABLED` is a terminal
       * state. If privileged delete is permanently disabled on a SnapLock volume, you can't re-enable
       * it. The default value is `DISABLED` .
       *
       * For more information, see [Privileged
       * delete](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete)
       * .
       */
      override fun privilegedDelete(privilegedDelete: String) {
        cdkBuilder.privilegedDelete(privilegedDelete)
      }

      /**
       * @param retentionPeriod Specifies the retention period of an FSx for ONTAP SnapLock volume.
       */
      override fun retentionPeriod(retentionPeriod: IResolvable) {
        cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable::unwrap))
      }

      /**
       * @param retentionPeriod Specifies the retention period of an FSx for ONTAP SnapLock volume.
       */
      override fun retentionPeriod(retentionPeriod: SnaplockRetentionPeriodProperty) {
        cdkBuilder.retentionPeriod(retentionPeriod.let(SnaplockRetentionPeriodProperty::unwrap))
      }

      /**
       * @param retentionPeriod Specifies the retention period of an FSx for ONTAP SnapLock volume.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eba54555f91b81d0befa4f324b3d5717910c6b7c9781cec5d99e84ac38898911")
      override
          fun retentionPeriod(retentionPeriod: SnaplockRetentionPeriodProperty.Builder.() -> Unit):
          Unit = retentionPeriod(SnaplockRetentionPeriodProperty(retentionPeriod))

      /**
       * @param snaplockType Specifies the retention mode of an FSx for ONTAP SnapLock volume. 
       * After it is set, it can't be changed. You can choose one of the following retention modes:
       *
       * * `COMPLIANCE` : Files transitioned to write once, read many (WORM) on a Compliance volume
       * can't be deleted until their retention periods expire. This retention mode is used to address
       * government or industry-specific mandates or to protect against ransomware attacks. For more
       * information, see [SnapLock
       * Compliance](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html) .
       * * `ENTERPRISE` : Files transitioned to WORM on an Enterprise volume can be deleted by
       * authorized users before their retention periods expire using privileged delete. This retention
       * mode is used to advance an organization's data integrity and internal compliance or to test
       * retention settings before using SnapLock Compliance. For more information, see [SnapLock
       * Enterprise](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html) .
       */
      override fun snaplockType(snaplockType: String) {
        cdkBuilder.snaplockType(snaplockType)
      }

      /**
       * @param volumeAppendModeEnabled Enables or disables volume-append mode on an FSx for ONTAP
       * SnapLock volume.
       * Volume-append mode allows you to create WORM-appendable files and write data to them
       * incrementally. The default value is `false` .
       *
       * For more information, see [Volume-append
       * mode](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append) .
       */
      override fun volumeAppendModeEnabled(volumeAppendModeEnabled: String) {
        cdkBuilder.volumeAppendModeEnabled(volumeAppendModeEnabled)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty,
    ) : CdkObject(cdkObject), SnaplockConfigurationProperty {
      /**
       * Enables or disables the audit log volume for an FSx for ONTAP SnapLock volume.
       *
       * The default value is `false` . If you set `AuditLogVolume` to `true` , the SnapLock volume
       * is created as an audit log volume. The minimum retention period for an audit log volume is six
       * months.
       *
       * For more information, see [SnapLock audit log
       * volumes](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html#cfn-fsx-volume-snaplockconfiguration-auditlogvolume)
       */
      override fun auditLogVolume(): String? = unwrap(this).getAuditLogVolume()

      /**
       * The configuration object for setting the autocommit period of files in an FSx for ONTAP
       * SnapLock volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html#cfn-fsx-volume-snaplockconfiguration-autocommitperiod)
       */
      override fun autocommitPeriod(): Any? = unwrap(this).getAutocommitPeriod()

      /**
       * Enables, disables, or permanently disables privileged delete on an FSx for ONTAP SnapLock
       * Enterprise volume.
       *
       * Enabling privileged delete allows SnapLock administrators to delete write once, read many
       * (WORM) files even if they have active retention periods. `PERMANENTLY_DISABLED` is a terminal
       * state. If privileged delete is permanently disabled on a SnapLock volume, you can't re-enable
       * it. The default value is `DISABLED` .
       *
       * For more information, see [Privileged
       * delete](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html#cfn-fsx-volume-snaplockconfiguration-privilegeddelete)
       */
      override fun privilegedDelete(): String? = unwrap(this).getPrivilegedDelete()

      /**
       * Specifies the retention period of an FSx for ONTAP SnapLock volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html#cfn-fsx-volume-snaplockconfiguration-retentionperiod)
       */
      override fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

      /**
       * Specifies the retention mode of an FSx for ONTAP SnapLock volume.
       *
       * After it is set, it can't be changed. You can choose one of the following retention modes:
       *
       * * `COMPLIANCE` : Files transitioned to write once, read many (WORM) on a Compliance volume
       * can't be deleted until their retention periods expire. This retention mode is used to address
       * government or industry-specific mandates or to protect against ransomware attacks. For more
       * information, see [SnapLock
       * Compliance](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html) .
       * * `ENTERPRISE` : Files transitioned to WORM on an Enterprise volume can be deleted by
       * authorized users before their retention periods expire using privileged delete. This retention
       * mode is used to advance an organization's data integrity and internal compliance or to test
       * retention settings before using SnapLock Compliance. For more information, see [SnapLock
       * Enterprise](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html#cfn-fsx-volume-snaplockconfiguration-snaplocktype)
       */
      override fun snaplockType(): String = unwrap(this).getSnaplockType()

      /**
       * Enables or disables volume-append mode on an FSx for ONTAP SnapLock volume.
       *
       * Volume-append mode allows you to create WORM-appendable files and write data to them
       * incrementally. The default value is `false` .
       *
       * For more information, see [Volume-append
       * mode](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html#cfn-fsx-volume-snaplockconfiguration-volumeappendmodeenabled)
       */
      override fun volumeAppendModeEnabled(): String? = unwrap(this).getVolumeAppendModeEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnaplockConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty):
          SnaplockConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnaplockConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty
    }
  }
}
