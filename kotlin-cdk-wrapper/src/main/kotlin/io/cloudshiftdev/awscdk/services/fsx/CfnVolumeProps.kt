@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnVolumeProps {
  public fun backupId(): String? = unwrap(this).getBackupId()

  public fun name(): String

  public fun ontapConfiguration(): Any? = unwrap(this).getOntapConfiguration()

  public fun openZfsConfiguration(): Any? = unwrap(this).getOpenZfsConfiguration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun volumeType(): String? = unwrap(this).getVolumeType()

  @CdkDslMarker
  public interface Builder {
    public fun backupId(backupId: String)

    public fun name(name: String)

    public fun ontapConfiguration(ontapConfiguration: IResolvable)

    public fun ontapConfiguration(ontapConfiguration: CfnVolume.OntapConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9bb19f7a932d98702820054d2777869cc3f20d7f6c7639f54ae137536f7a435")
    public
        fun ontapConfiguration(ontapConfiguration: CfnVolume.OntapConfigurationProperty.Builder.() -> Unit)

    public fun openZfsConfiguration(openZfsConfiguration: IResolvable)

    public fun openZfsConfiguration(openZfsConfiguration: CfnVolume.OpenZFSConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0efd2027a99f0c287870e0f6812c453bfa2bf92fea743e7a35758ad36e1f8267")
    public
        fun openZfsConfiguration(openZfsConfiguration: CfnVolume.OpenZFSConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun volumeType(volumeType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnVolumeProps.Builder =
        software.amazon.awscdk.services.fsx.CfnVolumeProps.builder()

    override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun ontapConfiguration(ontapConfiguration: IResolvable) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(IResolvable::unwrap))
    }

    override fun ontapConfiguration(ontapConfiguration: CfnVolume.OntapConfigurationProperty) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(CfnVolume.OntapConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9bb19f7a932d98702820054d2777869cc3f20d7f6c7639f54ae137536f7a435")
    override
        fun ontapConfiguration(ontapConfiguration: CfnVolume.OntapConfigurationProperty.Builder.() -> Unit):
        Unit = ontapConfiguration(CfnVolume.OntapConfigurationProperty(ontapConfiguration))

    override fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(IResolvable::unwrap))
    }

    override
        fun openZfsConfiguration(openZfsConfiguration: CfnVolume.OpenZFSConfigurationProperty) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(CfnVolume.OpenZFSConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0efd2027a99f0c287870e0f6812c453bfa2bf92fea743e7a35758ad36e1f8267")
    override
        fun openZfsConfiguration(openZfsConfiguration: CfnVolume.OpenZFSConfigurationProperty.Builder.() -> Unit):
        Unit = openZfsConfiguration(CfnVolume.OpenZFSConfigurationProperty(openZfsConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun volumeType(volumeType: String) {
      cdkBuilder.volumeType(volumeType)
    }

    public fun build(): software.amazon.awscdk.services.fsx.CfnVolumeProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.CfnVolumeProps,
  ) : CdkObject(cdkObject), CfnVolumeProps {
    override fun backupId(): String? = unwrap(this).getBackupId()

    override fun name(): String = unwrap(this).getName()

    override fun ontapConfiguration(): Any? = unwrap(this).getOntapConfiguration()

    override fun openZfsConfiguration(): Any? = unwrap(this).getOpenZfsConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun volumeType(): String? = unwrap(this).getVolumeType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVolumeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolumeProps): CfnVolumeProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVolumeProps): software.amazon.awscdk.services.fsx.CfnVolumeProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.fsx.CfnVolumeProps
  }
}
