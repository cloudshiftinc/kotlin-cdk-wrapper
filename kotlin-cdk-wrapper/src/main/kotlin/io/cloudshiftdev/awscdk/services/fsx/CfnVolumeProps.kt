@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnVolume`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fsx.*;
 * CfnVolumeProps cfnVolumeProps = CfnVolumeProps.builder()
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
public interface CfnVolumeProps {
  /**
   * Specifies the ID of the volume backup to use to create a new volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-backupid)
   */
  public fun backupId(): String? = unwrap(this).getBackupId()

  /**
   * The name of the volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-name)
   */
  public fun name(): String

  /**
   * The configuration of an Amazon FSx for NetApp ONTAP volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-ontapconfiguration)
   */
  public fun ontapConfiguration(): Any? = unwrap(this).getOntapConfiguration()

  /**
   * The configuration of an Amazon FSx for OpenZFS volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-openzfsconfiguration)
   */
  public fun openZfsConfiguration(): Any? = unwrap(this).getOpenZfsConfiguration()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of the volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-volumetype)
   */
  public fun volumeType(): String? = unwrap(this).getVolumeType()

  /**
   * A builder for [CfnVolumeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backupId Specifies the ID of the volume backup to use to create a new volume.
     */
    public fun backupId(backupId: String)

    /**
     * @param name The name of the volume. 
     */
    public fun name(name: String)

    /**
     * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume.
     */
    public fun ontapConfiguration(ontapConfiguration: IResolvable)

    /**
     * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume.
     */
    public fun ontapConfiguration(ontapConfiguration: CfnVolume.OntapConfigurationProperty)

    /**
     * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9bb19f7a932d98702820054d2777869cc3f20d7f6c7639f54ae137536f7a435")
    public
        fun ontapConfiguration(ontapConfiguration: CfnVolume.OntapConfigurationProperty.Builder.() -> Unit)

    /**
     * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume.
     */
    public fun openZfsConfiguration(openZfsConfiguration: IResolvable)

    /**
     * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume.
     */
    public fun openZfsConfiguration(openZfsConfiguration: CfnVolume.OpenZFSConfigurationProperty)

    /**
     * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0efd2027a99f0c287870e0f6812c453bfa2bf92fea743e7a35758ad36e1f8267")
    public
        fun openZfsConfiguration(openZfsConfiguration: CfnVolume.OpenZFSConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param volumeType The type of the volume.
     */
    public fun volumeType(volumeType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnVolumeProps.Builder =
        software.amazon.awscdk.services.fsx.CfnVolumeProps.builder()

    /**
     * @param backupId Specifies the ID of the volume backup to use to create a new volume.
     */
    override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    /**
     * @param name The name of the volume. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume.
     */
    override fun ontapConfiguration(ontapConfiguration: IResolvable) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume.
     */
    override fun ontapConfiguration(ontapConfiguration: CfnVolume.OntapConfigurationProperty) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(CfnVolume.OntapConfigurationProperty::unwrap))
    }

    /**
     * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9bb19f7a932d98702820054d2777869cc3f20d7f6c7639f54ae137536f7a435")
    override
        fun ontapConfiguration(ontapConfiguration: CfnVolume.OntapConfigurationProperty.Builder.() -> Unit):
        Unit = ontapConfiguration(CfnVolume.OntapConfigurationProperty(ontapConfiguration))

    /**
     * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume.
     */
    override fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume.
     */
    override
        fun openZfsConfiguration(openZfsConfiguration: CfnVolume.OpenZFSConfigurationProperty) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(CfnVolume.OpenZFSConfigurationProperty::unwrap))
    }

    /**
     * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0efd2027a99f0c287870e0f6812c453bfa2bf92fea743e7a35758ad36e1f8267")
    override
        fun openZfsConfiguration(openZfsConfiguration: CfnVolume.OpenZFSConfigurationProperty.Builder.() -> Unit):
        Unit = openZfsConfiguration(CfnVolume.OpenZFSConfigurationProperty(openZfsConfiguration))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param volumeType The type of the volume.
     */
    override fun volumeType(volumeType: String) {
      cdkBuilder.volumeType(volumeType)
    }

    public fun build(): software.amazon.awscdk.services.fsx.CfnVolumeProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.CfnVolumeProps,
  ) : CdkObject(cdkObject), CfnVolumeProps {
    /**
     * Specifies the ID of the volume backup to use to create a new volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-backupid)
     */
    override fun backupId(): String? = unwrap(this).getBackupId()

    /**
     * The name of the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The configuration of an Amazon FSx for NetApp ONTAP volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-ontapconfiguration)
     */
    override fun ontapConfiguration(): Any? = unwrap(this).getOntapConfiguration()

    /**
     * The configuration of an Amazon FSx for OpenZFS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-openzfsconfiguration)
     */
    override fun openZfsConfiguration(): Any? = unwrap(this).getOpenZfsConfiguration()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html#cfn-fsx-volume-volumetype)
     */
    override fun volumeType(): String? = unwrap(this).getVolumeType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVolumeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolumeProps): CfnVolumeProps
        = CdkObjectWrappers.wrap(cdkObject) as CfnVolumeProps

    internal fun unwrap(wrapped: CfnVolumeProps): software.amazon.awscdk.services.fsx.CfnVolumeProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.fsx.CfnVolumeProps
  }
}
